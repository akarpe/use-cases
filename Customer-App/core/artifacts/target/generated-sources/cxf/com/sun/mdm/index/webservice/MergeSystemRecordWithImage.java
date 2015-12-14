
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mergeSystemRecordWithImage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mergeSystemRecordWithImage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="callerInfo" type="{http://webservice.index.mdm.sun.com/}callerInfo" minOccurs="0"/>
 *         &lt;element name="systemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceLID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destLID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destImage" type="{http://webservice.index.mdm.sun.com/}personObject" minOccurs="0"/>
 *         &lt;element name="calculateOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mergeSystemRecordWithImage", propOrder = {
    "callerInfo",
    "systemCode",
    "sourceLID",
    "destLID",
    "destImage",
    "calculateOnly"
})
@XmlRootElement(name = "mergeSystemRecordWithImage")
public class MergeSystemRecordWithImage
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected CallerInfo callerInfo;
    protected String systemCode;
    protected String sourceLID;
    protected String destLID;
    protected PersonObject destImage;
    protected boolean calculateOnly;

    /**
     * Gets the value of the callerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CallerInfo }
     *     
     */
    public CallerInfo getCallerInfo() {
        return callerInfo;
    }

    /**
     * Sets the value of the callerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallerInfo }
     *     
     */
    public void setCallerInfo(CallerInfo value) {
        this.callerInfo = value;
    }

    public boolean isSetCallerInfo() {
        return (this.callerInfo!= null);
    }

    /**
     * Gets the value of the systemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemCode() {
        return systemCode;
    }

    /**
     * Sets the value of the systemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemCode(String value) {
        this.systemCode = value;
    }

    public boolean isSetSystemCode() {
        return (this.systemCode!= null);
    }

    /**
     * Gets the value of the sourceLID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceLID() {
        return sourceLID;
    }

    /**
     * Sets the value of the sourceLID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceLID(String value) {
        this.sourceLID = value;
    }

    public boolean isSetSourceLID() {
        return (this.sourceLID!= null);
    }

    /**
     * Gets the value of the destLID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestLID() {
        return destLID;
    }

    /**
     * Sets the value of the destLID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestLID(String value) {
        this.destLID = value;
    }

    public boolean isSetDestLID() {
        return (this.destLID!= null);
    }

    /**
     * Gets the value of the destImage property.
     * 
     * @return
     *     possible object is
     *     {@link PersonObject }
     *     
     */
    public PersonObject getDestImage() {
        return destImage;
    }

    /**
     * Sets the value of the destImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonObject }
     *     
     */
    public void setDestImage(PersonObject value) {
        this.destImage = value;
    }

    public boolean isSetDestImage() {
        return (this.destImage!= null);
    }

    /**
     * Gets the value of the calculateOnly property.
     * 
     */
    public boolean isCalculateOnly() {
        return calculateOnly;
    }

    /**
     * Sets the value of the calculateOnly property.
     * 
     */
    public void setCalculateOnly(boolean value) {
        this.calculateOnly = value;
    }

    public boolean isSetCalculateOnly() {
        return true;
    }

}
