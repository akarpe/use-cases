package com.customer.app.xlate.convert;

import org.apache.camel.Exchange;
import org.apache.camel.TypeConversionException;
import org.apache.camel.support.TypeConverterSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.customer.app.Person;
import com.sun.mdm.index.webservice.CallerInfo;
import com.sun.mdm.index.webservice.ExecuteMatchUpdate;
import com.sun.mdm.index.webservice.PersonBean;
import com.sun.mdm.index.webservice.SystemPerson;

public class PersonToExecuteMatchUpdate extends TypeConverterSupport {
	
	private static Logger log = LoggerFactory.getLogger(PersonToExecuteMatchUpdate.class);

	public PersonToExecuteMatchUpdate() {
		log.debug("PersonToExecuteMatchUpdate is created");
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <T> T convertTo(Class<T> klass, Exchange exchange, Object o) throws TypeConversionException {
		log.debug("PersonToExecuteMatchUpdate.convertTo() is called");
		
			
		try{
			Person p = (Person) o;
			PersonBean personBean = new PersonBean();
			personBean.setSSN(p.getSsn().getIdentifier());
			personBean.setGender(p.getGender().getDisplaytext());
			personBean.setFirstName(p.getLegalname().getGiven());
			personBean.setLastName(p.getLegalname().getFamily());
			
			
			SystemPerson sysPerson = new SystemPerson();
			sysPerson.setPerson(personBean);
			
			CallerInfo callerInfo = new CallerInfo();
			callerInfo.setAuthUser("admin");
			callerInfo.setAuthPassword("admin");
			callerInfo.setUser("admin");
			
			ExecuteMatchUpdate answer = new ExecuteMatchUpdate();
			answer.setSysObjBean(sysPerson);
			answer.setCallerInfo(callerInfo);
			
			return (T) answer;
		} catch (Exception ex){
			throw new TypeConversionException(o, klass, ex);
		}
	}



}
