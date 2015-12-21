package com.redhat.customer.translate;

import org.apache.camel.Converter;
import org.apache.camel.Exchange;
import org.apache.camel.TypeConversionException;

import com.customer.app.Person;
import com.sun.mdm.index.webservice.CallerInfo;
import com.sun.mdm.index.webservice.ExecuteMatchUpdate;
import com.sun.mdm.index.webservice.PersonBean;
import com.sun.mdm.index.webservice.SystemPerson;

@Converter
public class TransformToExecuteMatch {

@Converter
public ExecuteMatchUpdate convertTo(Object value,Exchange e)
			throws TypeConversionException {
		Person personOld = (Person)value;
		SystemPerson person = new SystemPerson();
		PersonBean value2 = new PersonBean();
		value2.setFatherName(personOld.getFathername());
		value2.setGender(personOld.getGender().getCode());
		person.setPerson(value2);
		
		ExecuteMatchUpdate executeMatchUpdate = new ExecuteMatchUpdate();
		CallerInfo callerInfo = new CallerInfo();
		callerInfo.setApplication("App");
		callerInfo.setApplicationFunction("Function");
		callerInfo.setAuthUser("hello");
		
		executeMatchUpdate.setCallerInfo(callerInfo);
		executeMatchUpdate.setSysObjBean(person);
		if(e!=null ){
			e.getOut().setBody(executeMatchUpdate);
		}
		return executeMatchUpdate;
	}

}
