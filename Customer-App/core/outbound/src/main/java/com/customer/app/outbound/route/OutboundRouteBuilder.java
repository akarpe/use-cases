package com.customer.app.outbound.route;

import java.net.ConnectException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.Holder;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.apache.camel.model.dataformat.JaxbDataFormat;
import org.apache.cxf.binding.soap.SoapFault;
import org.apache.cxf.message.MessageContentsList;

import com.sun.mdm.index.webservice.ExecuteMatchUpdate;
import com.sun.mdm.index.webservice.ExecuteMatchUpdateResponse;
import com.sun.mdm.index.webservice.MatchColResult;

public class OutboundRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		JaxbDataFormat jaxbPersonService = new JaxbDataFormat();
		jaxbPersonService.setContextPath("com.sun.mdm.index.webservice");
		jaxbPersonService.setPrettyPrint(false);
		

		
		onException(ConnectException.class)
		  .maximumRedeliveries(3)
		  .useOriginalMessage()
		  .to("log:ConnectException?showAll=true&multiline=true")
		  .inOnly("mq:q.empi.nextgate.dlq");
		
		//Send back something in case of Fault to have a reply
		onException(SoapFault.class)
		  .handled(true)
		  .to("log:SoapFault?showAll=true&multiline=true")
		  .inOnly("mq:q.empi.nextgate.dlq")
		  .setBody(property(Exchange.EXCEPTION_CAUGHT))
		  .convertBodyTo(String.class)
		  .to("log:SoapFault?showAll=true&multiline=true")
		  ;
		 
		 //This uses dataFormat=PAYLOAD to call the webservice
		 from("mq:q.empi.nextgate.out")
		  .unmarshal(jaxbPersonService)  //Not needed, but verifies input
		  .convertBodyTo(ExecuteMatchUpdate.class) //Not needed, but verifies input
		  .marshal(jaxbPersonService) //Not needed, but verifies input
		  .convertBodyTo(String.class) //Not needed, but verifies input
		  .setHeader(CxfConstants.OPERATION_NAME,constant("executeMatchUpdate"))
		  .to("log:outboundRoute1?showAll=true&multiline=true")
		  
		  .to("cxf:bean:nextgateEndpoint?dataFormat=PAYLOAD&loggingFeatureEnabled=true")
		  .to("log:outboundRoute2?showAll=true&multiline=true")

		  .convertBodyTo(String.class)
		  .to("log:outboundRoute3?showAll=true&multiline=true")
		  .unmarshal(jaxbPersonService) //Not needed, but verifies response
		  .convertBodyTo(ExecuteMatchUpdateResponse.class) //Not needed, but verifies response
		  .marshal(jaxbPersonService) //Not needed, but verifies response
		  .convertBodyTo(String.class) //Not needed, but verifies response
		  .to("log:outboundRoute4?showAll=true&multiline=true")
		; 

		 
		 /*		
        //This uses dataFormat=MESSAGE, but it doesn't work in Fuse6.1 (works in Fuse 6.2.1, but needs to add to 'org.xmlsoap.schemas.soap.envelope' to Import-Package
		SoapJaxbDataFormat soap = new SoapJaxbDataFormat("com.sun.mdm.index.webservice", new ServiceInterfaceStrategy(PersonEJB.class,true) );
		
		from("mq:q.empi.nextgate.out")
		  .unmarshal(jaxbPersonService)
		  .convertBodyTo(ExecuteMatchUpdate.class)
		  .to("log:outboundRouteA?showAll=true&multiline=true")
		  .marshal(soap)
		  .to("log:outboundRouteB?showAll=true&multiline=true")
		  .convertBodyTo(String.class)
		  
		  .setHeader(CxfConstants.OPERATION_NAME,constant("executeMatchUpdate"))
		  .to("log:outboundRoute1?showAll=true&multiline=true")
		  .to("cxf:bean:nextgateEndpoint?dataFormat=MESSAGE&loggingFeatureEnabled=true")
		  .to("log:outboundRoute2?showAll=true&multiline=true")
		  .convertBodyTo(String.class)
		  .to("log:outboundRoute3?showAll=true&multiline=true")
		  .unmarshal(jaxbPersonService)
		  .to("log:outboundRoute4?showAll=true&multiline=true")
		  .marshal(jaxbPersonService)
		  .convertBodyTo(String.class)
		;		
		
		*/
		 
		 //This uses dataFormat=POJO
			
			Processor prepareWsCall = new Processor() {
				@Override
				public void process(Exchange exchange) throws Exception {
					ExecuteMatchUpdate o = (ExecuteMatchUpdate) exchange.getIn().getBody();
					List list = new ArrayList();
					list.add(o.getCallerInfo());
					list.add(o.getSysObjBean());
					exchange.getIn().setBody(list);
				}
			};
			
			Processor prepareWsResponse = new Processor() {
				@Override
				public void process(Exchange exchange) throws Exception {
					MessageContentsList list = (MessageContentsList) exchange.getIn().getBody();
					
					//MatchColResult is the <return> in the soap response
					MatchColResult result = (MatchColResult) list.get(0);
					
					//It doesn't make sense to create a ExecuteMatchUpdateResponse here, but that's returned in case of dataFormat=PAYLOAD mode				
					ExecuteMatchUpdateResponse response = new ExecuteMatchUpdateResponse();
					response.setReturn(result);
					exchange.getIn().setBody(response);
				}
			};
		 
		
		
		from("mq:q.empi.nextgate.out-POJO")
		  .unmarshal(jaxbPersonService)
		  .convertBodyTo(ExecuteMatchUpdate.class)
		  .process(prepareWsCall)
		  .setHeader("operationName",constant("executeMatchUpdate"))
		  .to("log:outboundRoute1?showAll=true&multiline=true")
		  
		  .to("cxf:bean:nextgateEndpoint?dataFormat=POJO&loggingFeatureEnabled=true")
		  
		  .to("log:outboundRoute3?showAll=true&multiline=true")
		  .process(prepareWsResponse)
		  .marshal(jaxbPersonService)
		  .convertBodyTo(String.class)
		  .to("log:outboundRoute4?showAll=true&multiline=true")
		;

	}

}
