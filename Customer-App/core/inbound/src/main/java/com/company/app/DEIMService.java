package com.company.app;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

import com.customer.app.Person;

/**
 * Created by kying on 12/14/15.
 */
public class DEIMService implements DEIM {

    //camel context
    @Context
    private CamelContext camelContext;

    //producer template
    private ProducerTemplate producterTemplate;

    @Override
    @POST
    @Path("/add/")
    @Consumes("application/xml")
    public Response addCustomer(Person person) {

        Response response = null;
        System.out.println("Hello!");

        producterTemplate = camelContext.createProducerTemplate();

        String requestMsg = (String) producterTemplate.requestBody("direct:start", "<hello>HELP!</hello>");

        return response;
    }

    public CamelContext getCamelContext() {
        return camelContext;
    }

    public void setCamelContext(CamelContext camelContext) {
        this.camelContext = camelContext;
    }

    //test endpoint
    public String test(){
        return "Hiii";
    }

}
