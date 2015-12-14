
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resolvePotentialDuplicate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resolvePotentialDuplicate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="callerInfo" type="{http://webservice.index.mdm.sun.com/}callerInfo" minOccurs="0"/>
 *         &lt;element name="potentialDuplicateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="permanentResolve" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resolvePotentialDuplicate", propOrder = {
    "callerInfo",
    "potentialDuplicateId",
    "permanentResolve"
})
@XmlRootElement(name = "resolvePotentialDuplicate")
public class ResolvePotentialDuplicate
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected CallerInfo callerInfo;
    protected String potentialDuplicateId;
    protected boolean permanentResolve;

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
     * Gets the value of the potentialDuplicateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPotentialDuplicateId() {
        return potentialDuplicateId;
    }

    /**
     * Sets the value of the potentialDuplicateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPotentialDuplicateId(String value) {
        this.potentialDuplicateId = value;
    }

    public boolean isSetPotentialDuplicateId() {
        return (this.potentialDuplicateId!= null);
    }

    /**
     * Gets the value of the permanentResolve property.
     * 
     */
    public boolean isPermanentResolve() {
        return permanentResolve;
    }

    /**
     * Sets the value of the permanentResolve property.
     * 
     */
    public void setPermanentResolve(boolean value) {
        this.permanentResolve = value;
    }

    public boolean isSetPermanentResolve() {
        return true;
    }

}
