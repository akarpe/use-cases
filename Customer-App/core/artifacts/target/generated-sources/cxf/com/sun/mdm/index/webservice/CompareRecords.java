
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for compareRecords complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="compareRecords">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="record1" type="{http://webservice.index.mdm.sun.com/}personBean" minOccurs="0"/>
 *         &lt;element name="record2" type="{http://webservice.index.mdm.sun.com/}personBean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "compareRecords", propOrder = {
    "record1",
    "record2"
})
@XmlRootElement(name = "compareRecords")
public class CompareRecords
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected PersonBean record1;
    protected PersonBean record2;

    /**
     * Gets the value of the record1 property.
     * 
     * @return
     *     possible object is
     *     {@link PersonBean }
     *     
     */
    public PersonBean getRecord1() {
        return record1;
    }

    /**
     * Sets the value of the record1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonBean }
     *     
     */
    public void setRecord1(PersonBean value) {
        this.record1 = value;
    }

    public boolean isSetRecord1() {
        return (this.record1 != null);
    }

    /**
     * Gets the value of the record2 property.
     * 
     * @return
     *     possible object is
     *     {@link PersonBean }
     *     
     */
    public PersonBean getRecord2() {
        return record2;
    }

    /**
     * Sets the value of the record2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonBean }
     *     
     */
    public void setRecord2(PersonBean value) {
        this.record2 = value;
    }

    public boolean isSetRecord2() {
        return (this.record2 != null);
    }

}
