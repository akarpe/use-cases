package com.customer.app.inbound.service;


import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.apache.camel.CamelContext;
import org.apache.camel.ExchangePattern;
import org.apache.camel.ProducerTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.customer.app.Person;


@Path("/patient/")
@Produces("application/xml")
public class PatientService {
	
	private static Logger log = LoggerFactory.getLogger(PatientService.class);
	private CamelContext camelContext;
	
	public PatientService() {
		log.info("PatientService created");
	}
	
	//Simple get service to test service is up
	@GET
	@Path("/get/{id}")
	@Produces("application/xml")	
	public String getCustomer(@PathParam("id") String id) { //Person object
      log.info("GetCustomer is called: "+id);
      return "<root>HELLO" + id + "</root>";
    }
	
	@POST
	@Path("/add")
	@Consumes("application/xml")
	@Produces("application/xml")
	public Response addCustomer(Person person) { //
		log.info("addCustomer is called: "+person.getSsn().getIdentifier());
		
		Map headers = new HashMap<String, Object>();
		
		ProducerTemplate template = camelContext.createProducerTemplate();
		Object answer = template.sendBodyAndHeaders("direct:inbound", ExchangePattern.InOut, person, headers);
		
		//return Response.ok("<response>HELLO</response>").build();
		return Response.ok(answer.toString()).build();
	}


	public CamelContext getCamelContext() {
		return camelContext;
	}


	public void setCamelContext(CamelContext camelContext) {
		this.camelContext = camelContext;
	}
}
