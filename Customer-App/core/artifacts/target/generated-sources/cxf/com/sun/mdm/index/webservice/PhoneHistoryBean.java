
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for phoneHistoryBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="phoneHistoryBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneHistoryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "phoneHistoryBean", propOrder = {
    "phone",
    "phoneExt",
    "phoneHistoryId",
    "phoneIndex",
    "phoneType"
})
public class PhoneHistoryBean
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected String phone;
    protected String phoneExt;
    protected String phoneHistoryId;
    protected String phoneIndex;
    protected String phoneType;

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    public boolean isSetPhone() {
        return (this.phone!= null);
    }

    /**
     * Gets the value of the phoneExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneExt() {
        return phoneExt;
    }

    /**
     * Sets the value of the phoneExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneExt(String value) {
        this.phoneExt = value;
    }

    public boolean isSetPhoneExt() {
        return (this.phoneExt!= null);
    }

    /**
     * Gets the value of the phoneHistoryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneHistoryId() {
        return phoneHistoryId;
    }

    /**
     * Sets the value of the phoneHistoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneHistoryId(String value) {
        this.phoneHistoryId = value;
    }

    public boolean isSetPhoneHistoryId() {
        return (this.phoneHistoryId!= null);
    }

    /**
     * Gets the value of the phoneIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneIndex() {
        return phoneIndex;
    }

    /**
     * Sets the value of the phoneIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneIndex(String value) {
        this.phoneIndex = value;
    }

    public boolean isSetPhoneIndex() {
        return (this.phoneIndex!= null);
    }

    /**
     * Gets the value of the phoneType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneType() {
        return phoneType;
    }

    /**
     * Sets the value of the phoneType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneType(String value) {
        this.phoneType = value;
    }

    public boolean isSetPhoneType() {
        return (this.phoneType!= null);
    }

}
