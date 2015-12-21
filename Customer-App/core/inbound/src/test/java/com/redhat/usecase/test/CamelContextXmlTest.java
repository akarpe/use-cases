package com.redhat.usecase.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.apache.activemq.broker.BrokerService;
import org.apache.activemq.broker.TransportConnector;
import org.apache.activemq.camel.component.ActiveMQComponent;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.apache.camel.util.KeyValueHolder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

import com.customer.app.Code;
import com.customer.app.Person;
import com.customer.app.PointInTime;

public class CamelContextXmlTest extends CamelSpringTestSupport {

	// TODO Create test message bodies that work for the route(s) being tested
	// Expected message bodies
	protected Object[] expectedBodies = {
			"<something id='1'>expectedBody1</something>",
			"<something id='2'>expectedBody2</something>" };
	// Templates to send to input endpoints
	@Produce(uri = "direct:integrateRoute")
	protected ProducerTemplate inputEndpoint;
	BrokerService broker = null;

	@Before
	public void initialize() throws Exception {
		broker = new BrokerService();
		TransportConnector connector = new TransportConnector();
		connector.setUri(new URI("tcp://localhost:61617"));
		broker.addConnector(connector);
		broker.start();
		broker.waitUntilStarted();
		System.out.println("Broker is started :" + broker.getUptimeMillis());
		KeyValueHolder serviceHolder = new KeyValueHolder(
				new ActiveMQComponent(), null);
		// getCamelContextService().put(ActiveMQComponent.class.getName(),
		// serviceHolder);
	}

	@Test
	public void testCamelRoute() throws Exception {

		// Define some expectations

		// For now, let's just wait for some messages// TODO Add some
		// expectations here
		// Send some messages to input endpoints
		Person person = new Person();
		person.setAge(32);
		person.setFathername("Rajendran");
		person.setBirthname("Sundar");
		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("METHOD", "add");
		inputEndpoint.requestBodyAndHeaders(person, headers);

		// Validate our expectations
		assertMockEndpointsSatisfied();
	}

	@After
	public void destroy() {
		try {
			if (broker != null)
				broker.stop();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	protected ClassPathXmlApplicationContext createApplicationContext() {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = null;

		try {
			classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
					new String[] {
							"testContext.xml",
							"META-INF/spring/camelContext.xml" });
		} catch (Exception  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return classPathXmlApplicationContext;
		/*
		 * return new ClassPathXmlApplicationContext( "camelTestContext.xml");
		 */

	}

	public static String replaceOSGiPropertyLoader(String springXmlLocation) {
		StringWriter writer = new StringWriter();
		try {

			DocumentBuilder builder = DocumentBuilderFactory.newInstance()
					.newDocumentBuilder();
			File springFile = new File(springXmlLocation);
			Document doc = builder.parse(new InputSource(new FileInputStream(
					springFile)));
			// find the osgix properties bean
			XPath xpath = XPathFactory.newInstance().newXPath();
			Node osgiProps = (Node) xpath.evaluate("/beans/cm-properties", doc,
					XPathConstants.NODE);
			// remove it
			// first get the root node
			Node beanNode = doc.getFirstChild();
			// remove the child
			beanNode.removeChild(osgiProps);
			// now adjust the spring properties bean to load the props directly
			// from the file
			Element propertyPlaceholder = (Element) xpath.evaluate(
					"/beans/property-placeholder", doc, XPathConstants.NODE);
			// remove the ref to the osgi bean
			propertyPlaceholder.removeAttribute("properties-ref");
			// add a reference directly to the file that has the properties in
			propertyPlaceholder.setAttribute("location",
					"/Users/smunirat/git/usecases/Customer-App/core/inbound/src/test/resources/claimsExport.cfg");

			// now write out the resultant xml
			Transformer transformer = TransformerFactory.newInstance()
					.newTransformer();

			transformer.transform(new DOMSource(doc), new StreamResult(writer));
			// return the string representation of the spring xml file
		} catch (Exception e) {
			e.printStackTrace();
		}
		return writer.toString();
	}
}
