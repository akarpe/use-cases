package com.company.app;

import com.customer.app.Person;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.DataFormat;
import org.apache.camel.model.dataformat.JaxbDataFormat;

import javax.xml.namespace.QName;

/**
 * Created by kying on 12/15/15.
 */
public class MyRouteBuilder extends RouteBuilder {

    //DataFormat personalDataFormat;
    //JaxbDataFormat personDataFormat = buildPersonDataFormat();


    /*private JaxbDataFormat buildPersonDataFormat() {
        JaxbDataFormat personDataFormat = new JaxbDataFormat();
        personDataFormat.setContextPath("com.customer.app");
        //personDataFormat.setPartClass("com.customer.app.Person");
        //personDataFormat.setPartNamespace(new QName("http://www.company.com", "Person"));
        personDataFormat.setPrettyPrint(true);
        return personDataFormat;
    }*/

    @Override
    public void configure() throws Exception {

        JaxbDataFormat personDataFormat = new JaxbDataFormat();
        personDataFormat.setContextPath("com.customer.app");
        personDataFormat.setPrettyPrint(true);

       from("direct:start")
               .log("help help")
               .marshal(personDataFormat)
               .to("log:com.company.app?showAll=true&multiline=true")
               .convertBodyTo(String.class)
               .inOnly("mq:q.empi.deim.in")
               .transform(constant("doneeee"));
    }


}
