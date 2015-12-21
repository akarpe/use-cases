package com.redhat.customer.marshall;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

import com.sun.mdm.index.webservice.ExecuteMatchUpdate;

public class MarshallObject {

	public String marshalElement(ExecuteMatchUpdate person) {
		StringWriter stringWriter = new StringWriter();
		String result=null;
		try {
			JAXBContext jaxbContext = JAXBContext
					.newInstance(ExecuteMatchUpdate.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			QName qName = new QName("com.sun.mdm.index.webservice",
					"ExecuteMatchUpdate");
			JAXBElement<ExecuteMatchUpdate> root = new JAXBElement<ExecuteMatchUpdate>(
					qName, ExecuteMatchUpdate.class, person);

			jaxbMarshaller.marshal(root, stringWriter);

			 result = stringWriter.toString();
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
