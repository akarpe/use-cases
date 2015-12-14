
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sourceEO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sourceEO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enterprisePerson" type="{http://webservice.index.mdm.sun.com/}enterprisePerson" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sourceEO", propOrder = {
    "enterprisePerson"
})
public class SourceEO
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected EnterprisePerson enterprisePerson;

    /**
     * Gets the value of the enterprisePerson property.
     * 
     * @return
     *     possible object is
     *     {@link EnterprisePerson }
     *     
     */
    public EnterprisePerson getEnterprisePerson() {
        return enterprisePerson;
    }

    /**
     * Sets the value of the enterprisePerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnterprisePerson }
     *     
     */
    public void setEnterprisePerson(EnterprisePerson value) {
        this.enterprisePerson = value;
    }

    public boolean isSetEnterprisePerson() {
        return (this.enterprisePerson!= null);
    }

}
