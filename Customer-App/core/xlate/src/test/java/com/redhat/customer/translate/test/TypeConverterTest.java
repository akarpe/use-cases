package com.redhat.customer.translate.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;

import javax.jms.Connection;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.broker.BrokerService;
import org.apache.activemq.broker.TransportConnector;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TypeConverterTest extends CamelSpringTestSupport {

	// TODO Create test message bodies that work for the route(s) being tested
	// Expected message bodies
	protected Object[] expectedBodies = {
			"<something id='1'>expectedBody1</something>",
			"<something id='2'>expectedBody2</something>" };
	// Templates to send to input endpoints

	protected ProducerTemplate inputEndpoint;

	protected BrokerService broker = null;

	

	

	@Test
	public void testCamelRoute() throws Exception {

		ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(
				"vm://localhost"); // apparently the vm part is all i need
		Connection connection = connectionFactory.createConnection();

		connection.start();
		Session session = connection.createSession(false,
				Session.AUTO_ACKNOWLEDGE);
		Destination destination = session.createQueue("customer");
		MessageProducer producer = session.createProducer(destination);
		producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);

		TextMessage message = session.createTextMessage(getDataFromFile());
		System.out.println("Sent message: " + message.hashCode() + " : "
				+ message.getText());
		producer.send(message);

		Thread.sleep(1000);

		MessageConsumer createConsumer = session.createConsumer(session
				.createQueue("outbound"));
		org.apache.activemq.command.ActiveMQBytesMessage receive = (org.apache.activemq.command.ActiveMQBytesMessage) createConsumer
				.receive();
		String str = new String(receive.getContent().getData());
		System.out.println("\n\n\n\nRESPONSE******\n\\n" + str);
		assertNotNull(receive);

		producer.close();
		createConsumer.close();
		session.close();
		connection.close();

	}

	@Override
	protected ClassPathXmlApplicationContext createApplicationContext() {
		return new ClassPathXmlApplicationContext("camelTestContext.xml");
	}

	@SuppressWarnings("resource")
	public String getDataFromFile() {
		String finalLine = "";
		try {
			FileReader reader = new FileReader("src/test/data/Person.xml");
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
