
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for systemPersonHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="systemPersonHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="after" type="{http://webservice.index.mdm.sun.com/}systemPersonHistoryImage" minOccurs="0"/>
 *         &lt;element name="before" type="{http://webservice.index.mdm.sun.com/}systemPersonHistoryImage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "systemPersonHistory", propOrder = {
    "after",
    "before"
})
public class SystemPersonHistory
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected SystemPersonHistoryImage after;
    protected SystemPersonHistoryImage before;

    /**
     * Gets the value of the after property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPersonHistoryImage }
     *     
     */
    public SystemPersonHistoryImage getAfter() {
        return after;
    }

    /**
     * Sets the value of the after property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPersonHistoryImage }
     *     
     */
    public void setAfter(SystemPersonHistoryImage value) {
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
     *     {@link SystemPersonHistoryImage }
     *     
     */
    public SystemPersonHistoryImage getBefore() {
        return before;
    }

    /**
     * Sets the value of the before property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPersonHistoryImage }
     *     
     */
    public void setBefore(SystemPersonHistoryImage value) {
        this.before = value;
    }

    public boolean isSetBefore() {
        return (this.before!= null);
    }

}
