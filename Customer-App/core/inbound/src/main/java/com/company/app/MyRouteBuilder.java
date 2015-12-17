package com.company.app;

import com.customer.app.Person;
import com.sun.mdm.index.webservice.ExecuteMatchUpdate;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
//import org.apache.camel.component.cxf.DataFormat;
import org.apache.camel.model.dataformat.JaxbDataFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.namespace.QName;

/**
 * Created by kying on 12/15/15.
 */
public class MyRouteBuilder extends RouteBuilder {


    @Override
    public void configure() throws Exception {

        JaxbDataFormat personDataFormat = new JaxbDataFormat();
        //personDataFormat.setContextPath("com.customer.app");
        personDataFormat.setContextPath(Person.class.getPackage().getName());
        personDataFormat.setPrettyPrint(true);

        JaxbDataFormat nextDataFormat = new JaxbDataFormat();
        nextDataFormat.setContextPath(ExecuteMatchUpdate.class.getPackage().getName());
        nextDataFormat.setPrettyPrint(true);

        this.getContext().getTypeConverterRegistry().addTypeConverter(ExecuteMatchUpdate.class, Person.class, new MyTypeConverter());

        from("direct:start")
               .log("help help")
               .unmarshal(personDataFormat)
               .to("log:com.company.app?showAll=true&multiline=true")
               .convertBodyTo(ExecuteMatchUpdate.class)
               .marshal(nextDataFormat)
               .inOnly("mq:q.empi.deim.in")
               .transform(constant("doneeee"));
    }


}
