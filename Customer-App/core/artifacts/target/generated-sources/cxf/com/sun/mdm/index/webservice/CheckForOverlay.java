
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkForOverlay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkForOverlay">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beforeObj" type="{http://webservice.index.mdm.sun.com/}personBean" minOccurs="0"/>
 *         &lt;element name="afterObj" type="{http://webservice.index.mdm.sun.com/}personBean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkForOverlay", propOrder = {
    "beforeObj",
    "afterObj"
})
@XmlRootElement(name = "checkForOverlay")
public class CheckForOverlay
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected PersonBean beforeObj;
    protected PersonBean afterObj;

    /**
     * Gets the value of the beforeObj property.
     * 
     * @return
     *     possible object is
     *     {@link PersonBean }
     *     
     */
    public PersonBean getBeforeObj() {
        return beforeObj;
    }

    /**
     * Sets the value of the beforeObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonBean }
     *     
     */
    public void setBeforeObj(PersonBean value) {
        this.beforeObj = value;
    }

    public boolean isSetBeforeObj() {
        return (this.beforeObj!= null);
    }

    /**
     * Gets the value of the afterObj property.
     * 
     * @return
     *     possible object is
     *     {@link PersonBean }
     *     
     */
    public PersonBean getAfterObj() {
        return afterObj;
    }

    /**
     * Sets the value of the afterObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonBean }
     *     
     */
    public void setAfterObj(PersonBean value) {
        this.afterObj = value;
    }

    public boolean isSetAfterObj() {
        return (this.afterObj!= null);
    }

}
