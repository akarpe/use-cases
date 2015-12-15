package com.company.app;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;

/**
 * Created by kying on 12/15/15.
 */
public class MyRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {

       from("direct:start")
               .log("help help")
               .to("log:com.company.app?level=DEBUG")
               .inOnly("mock:a")
               .transform(constant("done"));
    }


}
