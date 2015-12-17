package com.customer.app.outbound;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.builder.xml.XPathBuilder;
import org.apache.camel.test.blueprint.CamelBlueprintTestSupport;
import org.apache.commons.io.IOUtils;
import org.junit.Rule;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OutboundTest extends CamelBlueprintTestSupport {
	private static Logger log = LoggerFactory.getLogger(OutboundTest.class);
	
    @Rule
    public EmbeddedActiveMQBroker broker = new EmbeddedActiveMQBroker("embedded");

    @Override
    protected String getBlueprintDescriptor() {
        return "/OSGI-INF/blueprint/outbound.xml,/OSGI-INF/blueprint/test-property-placeholder.xml";
    }

    @Test
    public void testOutbound() throws Exception {
    	
    	//Get test input
    	String testIn = IOUtils.toString(getClass().getResourceAsStream("/test1_in.xml"));

    	String response = (String) template.sendBody("mq:q.empi.nextgate.out", ExchangePattern.InOut, testIn);
    	log.info("Response: "+response);
    	
    	//Verify
    	Map<String, String> namespaces = new HashMap<String,String>();
    	namespaces.put("n", "http://webservice.index.mdm.sun.com/");
    	XPathBuilder xpath = XPathBuilder.xpath("n:executeMatchUpdateResponse/return/EUID/text()");
    	xpath.setNamespaces(namespaces);
    	
	    String responseText = xpath.evaluate(context, response);
	    assertEquals("EUID", responseText);

    }
    
    @Test
    public void testFault() throws Exception {
    	
    	//Get test input
    	String testIn = IOUtils.toString(getClass().getResourceAsStream("/test2_in.xml"));

    	String response = (String) template.sendBody("mq:q.empi.nextgate.out", ExchangePattern.InOut, testIn);
    	log.info("Response: "+response);
    	
    	//Verify
    	assertStringContains(response,"org.apache.cxf.binding.soap.SoapFault");
    	

    }


}
