package com.customer.app.xlate;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.builder.xml.Namespaces;
import org.apache.camel.builder.xml.XPathBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.blueprint.CamelBlueprintTestSupport;
import org.apache.commons.io.IOUtils;
import org.junit.Rule;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XlateTest extends CamelBlueprintTestSupport {
	private static Logger log = LoggerFactory.getLogger(XlateTest.class);

    @Override
    protected String getBlueprintDescriptor() {
        return "/OSGI-INF/blueprint/xlate.xml,/OSGI-INF/blueprint/test-property-placeholder.xml";
    }

    @Rule
    public EmbeddedActiveMQBroker broker = new EmbeddedActiveMQBroker("embedded");
    
    @Test
    public void testXlate() throws Exception {
    	//Get test input
    	String testIn = IOUtils.toString(getClass().getResourceAsStream("/test1_in.xml"));
    	String testOut = IOUtils.toString(getClass().getResourceAsStream("/test1_out.xml"));
    	
    	//Send request
    	String response = (String) template.sendBody("mq:q.empi.deim.in", ExchangePattern.InOut, testIn);
       	
    	//Verify
    	Map<String, String> namespaces = new HashMap<String,String>();
    	namespaces.put("n", "http://www.response.app.customer.com");
    	XPathBuilder xpath = XPathBuilder.xpath("n:ESBResponse/n:EUID/text()");
    	xpath.setNamespaces(namespaces);
    	
	    String responseText = xpath.evaluate(context, response);
	    assertEquals("OK", responseText);
	    
	    MockEndpoint nextgate = getMockEndpoint("mock:nextgate");
	    nextgate.expectedMessageCount(1);
	    
	    assertMockEndpointsSatisfied();
    }

    @Test
    public void testException() throws Exception {
    	//Get test input
    	String testIn = IOUtils.toString(getClass().getResourceAsStream("/test2_in.xml"));
    	
    	//Don't expect a response, because there will be an exception
    	template.sendBody("mq:q.empi.deim.in", ExchangePattern.InOnly, testIn);
	    
	    //Check if message ended up in mock endpoint
    	MockEndpoint nextgate = getMockEndpoint("mock:dlq");
	    nextgate.expectedMessageCount(1);
	    nextgate.expectedBodiesReceived(testIn);
	    
	    assertMockEndpointsSatisfied();
    }
    
    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
    	return new RouteBuilder() {
			@Override
			public void configure() throws Exception {
				
				String nextgateOut = IOUtils.toString(getClass().getResourceAsStream("/test1_nextgate.xml"));
				
				from("mq:q.empi.nextgate.out")
				.inOnly("mock:nextgate")
				.setBody(simple(nextgateOut));
				
				from("mq:q.empi.transform.dlq")
				.inOnly("mock:dlq");
			}
		};
    }

}
