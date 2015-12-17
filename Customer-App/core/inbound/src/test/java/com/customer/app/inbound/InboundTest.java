package com.customer.app.inbound;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.builder.xml.XPathBuilder;
import org.apache.camel.test.blueprint.CamelBlueprintTestSupport;
import org.apache.commons.io.IOUtils;
import org.apache.cxf.test.XPathAssert;
import org.apache.http.Consts;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Rule;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.customer.app.inbound.EmbeddedActiveMQBroker;

public class InboundTest extends CamelBlueprintTestSupport {
	private static Logger log = LoggerFactory.getLogger(InboundTest.class);
	
    @Rule
    public EmbeddedActiveMQBroker broker = new EmbeddedActiveMQBroker("embedded");
	
    @Override
    protected String getBlueprintDescriptor() {
        return "/OSGI-INF/blueprint/inbound.xml,/OSGI-INF/blueprint/test-property-placeholder.xml";
    } 
    
    @Test
    public void testRoute() throws Exception {
    	//Get test input
    	String test1In = IOUtils.toString(getClass().getResourceAsStream("/test1_in.xml"));
    	//String test1Out= IOUtils.toString(getClass().getResourceAsStream("/test1_out.xml"));
    	
    	//File inFile = new File(getClass().getResource("/test1_in.xml"));
    	//FileEntity entity = new FileEntity(inFile,  ContentType.create("application/xml", "UTF-8"));
    	
    	//Send request
    	StringEntity entity = new StringEntity(test1In, ContentType.create("application/xml", Consts.UTF_8));
    	HttpPost httppost = new HttpPost("http://0.0.0.0:9011/cxf/inbound/patient/add");
    	httppost.setEntity(entity);
    	CloseableHttpClient httpclient = HttpClients.createDefault();
    	CloseableHttpResponse response = httpclient.execute(httppost);
    	
    	
    	//template.sendBody("http://localhost:8181/cxf/...",test1In);
    	
    	//Get http response
    	String responseContent = EntityUtils.toString(response.getEntity());
		//responseContent = IOUtils.toString(response.getEntity().getContent());
		
		log.info("RESPONSE!!: " + responseContent);
	    response.close();
    	
    	//Verify
	    String responseText = XPathBuilder.xpath("/response/text()").evaluate(context, responseContent);
	    //assertEquals(test1Out, responseContent);
	    assertEquals("OK", responseText);
    	
    	//Thread.sleep(5000L);
    	
	    
    	
    }
    
    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
    	return new RouteBuilder() {
			@Override
			public void configure() throws Exception {
				from("mq:q.empi.deim.in")
				.setBody(simple("<response>OK</response>"));
			}
		};
    }

}
