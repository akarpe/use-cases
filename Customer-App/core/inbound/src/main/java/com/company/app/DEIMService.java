package com.company.app;

import org.apache.camel.CamelContext;
import org.apache.camel.EndpointInject;
import org.apache.camel.ProducerTemplate;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

import com.customer.app.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by kying on 12/14/15.
 */
@Path("/deim/")
public class DEIMService implements DEIM {

    //camel context
    //@Context or getter/setter
    private CamelContext camelContext;

    //producer template
    //@EndpointInject
    private ProducerTemplate producerTemplate;

    Logger logger = LoggerFactory.getLogger(DEIMService.class);


    @Override
    @POST
    @Path("/add/")
    @Consumes("application/xml")
    public Response addCustomer(Person person) {

        Response response = null;
        System.out.println("Hello!");

        producerTemplate = camelContext.createProducerTemplate();

        //camelContext.start();

        String requestMsg = (String) producerTemplate.requestBody("direct:start", person);

        return Response.ok(requestMsg).build();
    }

    public CamelContext getCamelContext() {
        return camelContext;
    }

    public void setCamelContext(CamelContext camelContext) {
        this.camelContext = camelContext;
    }

    //test endpoint
    @GET
    @Path("/test/")
    @Produces("text/plain")
    public String test(){
        return "Hiii";
    }

}
