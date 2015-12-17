package com.customer.app.outbound.route;

import java.net.ConnectException;
import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.apache.camel.dataformat.soap.name.ServiceInterfaceStrategy;
import org.apache.camel.model.dataformat.JaxbDataFormat;
import org.apache.camel.model.dataformat.SoapJaxbDataFormat;
import org.apache.cxf.binding.soap.SoapFault;

import com.sun.mdm.index.webservice.ExecuteMatchUpdate;
import com.sun.mdm.index.webservice.ExecuteMatchUpdateResponse;
import com.sun.mdm.index.webservice.PersonEJB;
import com.sun.mdm.index.webservice.PersonEJBService;

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
		
		onException(SoapFault.class)
		  .handled(true)
		  //.useOriginalMessage()
		  //.convertBodyTo(String.class)
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
//		  .process(prepareWsCall)
		  .to("log:outboundRouteA?showAll=true&multiline=true")
		  .marshal(soap)
		  .to("log:outboundRouteB?showAll=true&multiline=true")
		  .convertBodyTo(String.class)
		  
		  .setHeader(CxfConstants.OPERATION_NAME,constant("executeMatchUpdate"))
		  .to("log:outboundRoute1?showAll=true&multiline=true")
		  //.to("cxf:bean:nextgateEndpoint?dataFormat=POJO&loggingFeatureEnabled=true")
		  .to("cxf:bean:nextgateEndpoint?dataFormat=MESSAGE&loggingFeatureEnabled=true")
		  .to("log:outboundRoute2?showAll=true&multiline=true")
		  //.log("LIST SIZE: ${body.size}")
		  //.setBody(simple("${body[0]}"))
		  //.convertBodyTo(ExecuteMatchUpdateResponse.class)
		   .convertBodyTo(String.class)
		  .to("log:outboundRoute3?showAll=true&multiline=true")
		  .unmarshal(jaxbPersonService)
		  .to("log:outboundRoute4?showAll=true&multiline=true")
		  .marshal(jaxbPersonService)
		  .convertBodyTo(String.class)
		  
		  //.setBody(simple("<responseSoap>OKOK</responseSoap>"));
		;		
		
		*/
		 
		 //This uses dataFormat=POJO
//			
//			Processor prepareWsCall = new Processor() {
//				@Override
//				public void process(Exchange exchange) throws Exception {
//					ExecuteMatchUpdate o = (ExecuteMatchUpdate) exchange.getIn().getBody();
//					List list = new ArrayList();
//					list.add(o.getCallerInfo());
//					list.add(o.getSysObjBean());
//					exchange.getIn().setBody(list);
//				}
//			};
		 
		
/*		
		from("mq:q.empi.nextgate.out")
//		  .unmarshal(jaxbPersonService)
//		  .convertBodyTo(ExecuteMatchUpdate.class)
//		  .process(prepareWsCall)
		  .convertBodyTo(String.class)
		  .setHeader("operationName",constant("executeMatchUpdate"))
		  .to("log:outboundRoute?showAll=true&multiline=true")
		  //.to("cxf:bean:nextgateEndpoint?dataFormat=POJO&loggingFeatureEnabled=true")
		  .to("cxf:bean:nextgateEndpoint?dataFormat=PAYLOAD&loggingFeatureEnabled=true")
		  .to("log:outboundRoute?showAll=true&multiline=true")
		  //.log("LIST SIZE: ${body.size}")
		  //.setBody(simple("${body[0]}"))
		  //.convertBodyTo(ExecuteMatchUpdateResponse.class)
		  .to("log:outboundRoute?showAll=true&multiline=true")
		  //.marshal(jaxbPersonService)
		  
		  //.setBody(simple("<responseSoap>OKOK</responseSoap>"));
		;
*/

	}

}
