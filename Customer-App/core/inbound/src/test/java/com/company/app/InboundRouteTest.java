package com.company.app;


import org.apache.camel.test.blueprint.CamelBlueprintTestSupport;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Test;


import javax.ws.rs.core.Response;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

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
        return "OSGI-INF/blueprint/test-camel-context.xml";
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
        StringEntity input = new StringEntity(getSampleMessage("PatientDemographics.xml"));
        input.setContentType("application/xml");
        httpPost.setEntity(input);
        HttpResponse httpResponse = httpClient.execute(httpPost);


    }

    private String getSampleMessage(String pFileName) throws Exception {
        StringBuffer sb = new StringBuffer(1024);

        BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream("src/test/resources/" + pFileName)));

        try {
            for (String line = input.readLine(); line != null; line = input.readLine()) {
                sb.append(line);
            }
        } finally {
            if (input != null) {
                input.close();
            }
        }

        return sb.toString();
    }



}