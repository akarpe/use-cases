
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sbrPersonHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sbrPersonHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="after" type="{http://webservice.index.mdm.sun.com/}sbrPerson" minOccurs="0"/>
 *         &lt;element name="before" type="{http://webservice.index.mdm.sun.com/}sbrPerson" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sbrPersonHistory", propOrder = {
    "after",
    "before"
})
public class SbrPersonHistory
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected SbrPerson after;
    protected SbrPerson before;

    /**
     * Gets the value of the after property.
     * 
     * @return
     *     possible object is
     *     {@link SbrPerson }
     *     
     */
    public SbrPerson getAfter() {
        return after;
    }

    /**
     * Sets the value of the after property.
     * 
     * @param value
     *     allowed object is
     *     {@link SbrPerson }
     *     
     */
    public void setAfter(SbrPerson value) {
        this.after = value;
    }

    public boolean isSetAfter() {
        return (this.after!= null);
    }

    /**
     * Gets the value of the before property.
     * 
     * @return
     *     possible object is
     *     {@link SbrPerson }
     *     
     */
    public SbrPerson getBefore() {
        return before;
    }

    /**
     * Sets the value of the before property.
     * 
     * @param value
     *     allowed object is
     *     {@link SbrPerson }
     *     
     */
    public void setBefore(SbrPerson value) {
        this.before = value;
    }

    public boolean isSetBefore() {
        return (this.before!= null);
    }

}
