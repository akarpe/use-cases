package com.customer.app.inbound.route;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JaxbDataFormat;

public class InboundRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		JaxbDataFormat jaxbPatient = new JaxbDataFormat();
		jaxbPatient.setContextPath("com.customer.app");
		jaxbPatient.setPrettyPrint(false);
		
		from("direct:inbound")
		  .marshal(jaxbPatient)
		  .convertBodyTo(String.class)
		  .to("log:inboundRoute?showAll=true&multiline=true")
		  .log(LoggingLevel.DEBUG, "Sending person to JMS: ${body}")
		  .to("mq:q.empi.deim.in") //Let's make a sync route here, just see what we get back from the integration-test-server
		  //.setBody(simple("<response>OK</response>"))
		  .transform(body());
		;

		

		
		
	}

}
