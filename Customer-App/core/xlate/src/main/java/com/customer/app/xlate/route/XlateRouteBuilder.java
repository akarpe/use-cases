package com.customer.app.xlate.route;

import org.apache.camel.Exchange;
import org.apache.camel.LoggingLevel;
import org.apache.camel.Processor;
import org.apache.camel.TypeConversionException;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JaxbDataFormat;

import com.customer.app.Person;
import com.customer.app.response.ESBResponse;
import com.customer.app.xlate.convert.PersonToExecuteMatchUpdate;
import com.sun.mdm.index.webservice.ExecuteMatchUpdate;
import com.sun.mdm.index.webservice.ExecuteMatchUpdateResponse;

public class XlateRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		this.getContext().getTypeConverterRegistry().addTypeConverter(ExecuteMatchUpdate.class, Person.class, new PersonToExecuteMatchUpdate());
		
		JaxbDataFormat jaxbPerson = new JaxbDataFormat();
		jaxbPerson.setContextPath("com.customer.app");
		jaxbPerson.setPrettyPrint(false);
		
		JaxbDataFormat jaxbResponse = new JaxbDataFormat();
		jaxbResponse.setContextPath("com.customer.app.response");
		jaxbResponse.setPrettyPrint(false);
		
		JaxbDataFormat jaxbExecuteMatchUpdate = new JaxbDataFormat();
		jaxbExecuteMatchUpdate.setContextPath("com.sun.mdm.index.webservice");
		jaxbExecuteMatchUpdate.setPrettyPrint(false);
		
		Processor buildESBResponse = new Processor() {
			@Override
			public void process(Exchange exchange) throws Exception {
				ExecuteMatchUpdateResponse o = (ExecuteMatchUpdateResponse) exchange.getIn().getBody();
				ESBResponse response = new ESBResponse();
				response.setEUID(o.getReturn().getEUID());
				exchange.getIn().setBody(response);
			}
		}; 
		
		onException(TypeConversionException.class)
		  .maximumRedeliveries(3)
		  .useOriginalMessage()
		  .to("log:TypeConversionException?showAll=true&multiline=true")
		  .inOnly("mq:q.empi.transform.dlq");
		
		from("mq:q.empi.deim.in")
		  .unmarshal(jaxbPerson)		  
		  .convertBodyTo(ExecuteMatchUpdate.class)
		  .marshal(jaxbExecuteMatchUpdate)
		  .log(LoggingLevel.INFO, "Sending ExecuteMatchUpdate to JMS: ${body}")
		  
		  .to("mq:q.empi.nextgate.out")
		  .to("log:ESBResponse?showAll=true&multiline=true")
		  
		  .unmarshal(jaxbExecuteMatchUpdate)
		  .process(buildESBResponse)
		  .marshal(jaxbResponse)
		  .convertBodyTo(String.class)
		  
		  .to("log:ESBResponse?showAll=true&multiline=true")
		  .log(LoggingLevel.INFO, "ESBResponse: ${body}")
		;



		//Temporary dummy response route
//		from("mq:q.empi.nextgate.out")
//		.setBody(simple("<responseSoap>OK</responseSoap>"));



	}

}
