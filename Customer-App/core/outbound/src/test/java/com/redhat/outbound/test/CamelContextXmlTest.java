package com.redhat.outbound.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.jms.Connection;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.Route;
import org.apache.camel.model.RouteDefinition;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.apache.camel.test.spring.MockEndpoints;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CamelContextXmlTest extends CamelSpringTestSupport {

	// TODO Create test message bodies that work for the route(s) being tested

	@Produce(uri = "activeMq:queue:outbound")
	protected ProducerTemplate inputEndpoint;
	@Test
	public void testCamelRoute() throws Exception {

		Route route = context().getRoute("outboundRoute");
	
		ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(
				"vm://testbroker1"); // apparently the vm part is all i need
		Connection connection = connectionFactory.createConnection();

		connection.start();
		Session session = connection.createSession(false,
				Session.AUTO_ACKNOWLEDGE);
		Destination destination = session.createQueue("outbound");
		MessageProducer producer = session.createProducer(destination);
		producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);

		TextMessage message = session.createTextMessage(getDataFromFile());
		System.out.println("Sent message: " + message.hashCode() + " : "
				+ message.getText());
	//	producer.send(message);
		producer.send(message);
		Thread.sleep(1000);

		getMockEndpoint("mock:end",true).expectedMessageCount(10);
		
		producer.close();
		session.close();
		connection.close();

	}
	
	@Override
	protected ClassPathXmlApplicationContext createApplicationContext() {
		return new ClassPathXmlApplicationContext(new String[]{"testContext.xml",
				"META-INF/spring/camelContext.xml"});
	}

	@SuppressWarnings("resource")
	public String getDataFromFile() {
		String finalLine = "";
		try {
			FileReader reader = new FileReader("src/test/data/soapText.xml");
			BufferedReader bufferedReader = new BufferedReader(reader);
			String currentLine = null;

			while ((currentLine = bufferedReader.readLine()) != null) {
				finalLine += currentLine;
			}
		} catch (IOException io) {
			System.out.println(io.getMessage());
		}
		return finalLine;
	}
}
