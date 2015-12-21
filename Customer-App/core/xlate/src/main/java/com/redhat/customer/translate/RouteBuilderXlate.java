package com.redhat.customer.translate;

import org.apache.camel.CamelContext;
import org.apache.camel.RoutesBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.dataformat.soap.SoapJaxbDataFormat;
import org.apache.camel.dataformat.soap.name.ServiceInterfaceStrategy;

public class RouteBuilderXlate extends RouteBuilder{
	
	@Override
	public void configure() throws Exception {
		
		SoapJaxbDataFormat soap = new SoapJaxbDataFormat("com.sun.mdm.index.webservice",new ServiceInterfaceStrategy(com.sun.mdm.index.webservice.PersonEJB.class,true));
		JaxbDataFormat jax = new JaxbDataFormat("com.customer.app");
		
		from("activeMq:queue:customer").unmarshal(jax).convertBodyTo(com.sun.mdm.index.webservice.ExecuteMatchUpdate.class).marshal(soap).to("log:Message?showAll=true&multiline=true");
		
	}

	
	
	
}
