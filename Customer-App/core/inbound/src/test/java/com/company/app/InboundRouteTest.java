package com.company.app;


import org.apache.camel.test.blueprint.CamelBlueprintTestSupport;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Test;


import javax.ws.rs.core.Response;

import static org.junit.Assert.*;

/**
 * Created by kying on 12/14/15.
 */

public class InboundRouteTest extends CamelBlueprintTestSupport {
    //extends CamelBlueprintTestSupport

    //@Rule
    //public EmbeddedActiveMQBroker broker = new EmbeddedActiveMQBroker();

    @Override
    protected String getBlueprintDescriptor() {
        //Return location of camel context
        // "blah," +"blah";
        //CamelTestSupport automatically finds context
        return "OSGI-INF/blueprint/camel-context.xml";
    }



    @Test
    public void testRoute() throws Exception {

        HttpClient httpClient;
        Response response = null;


        getMockEndpoint("mock:a").expectedMinimumMessageCount(1);
        template.sendBody("direct:start", "wowowow");

        assertMockEndpointsSatisfied();

        httpClient = HttpClientBuilder.create().build();
        HttpPost httpPost = new HttpPost("http://localhost:8181/cxf/myService/deim/add");
        HttpResponse httpResponse = httpClient.execute(httpPost);


    }





}