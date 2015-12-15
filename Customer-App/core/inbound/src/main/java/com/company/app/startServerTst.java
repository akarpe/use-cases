package com.company.app;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;

/**
 * Created by kying on 12/15/15.
 */
public class startServerTst {

    public static void main(String args[]) throws InterruptedException {

        JAXRSServerFactoryBean sf = new JAXRSServerFactoryBean();
        sf.setResourceClasses(DEIM.class);
        sf.setResourceProvider(DEIM.class,
                new SingletonResourceProvider(new DEIMService()));
        sf.setAddress("http://localhost:9999/restservice");

        Server server = sf.create();

        for (int i = 0; i < 100; i++) {
            Thread.sleep(1000);
            System.out.println("running...");
        }
        //destroy the server
        server.stop();
        server.destroy();

        System.out.println("done!");
    }

}
