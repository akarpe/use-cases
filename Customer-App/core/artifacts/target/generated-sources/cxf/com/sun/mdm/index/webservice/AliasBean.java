
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for aliasBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="aliasBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aliasId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aliasType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fnamePhoneticCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lnamePhoneticCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mnamePhoneticCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stdFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stdLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stdMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aliasBean", propOrder = {
    "aliasId",
    "aliasType",
    "firstName",
    "fnamePhoneticCode",
    "lastName",
    "lnamePhoneticCode",
    "middleName",
    "mnamePhoneticCode",
    "stdFirstName",
    "stdLastName",
    "stdMiddleName"
})
public class AliasBean
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected String aliasId;
    protected String aliasType;
    protected String firstName;
    protected String fnamePhoneticCode;
    protected String lastName;
    protected String lnamePhoneticCode;
    protected String middleName;
    protected String mnamePhoneticCode;
    protected String stdFirstName;
    protected String stdLastName;
    protected String stdMiddleName;

    /**
     * Gets the value of the aliasId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliasId() {
        return aliasId;
    }

    /**
     * Sets the value of the aliasId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAliasId(String value) {
        this.aliasId = value;
    }

    public boolean isSetAliasId() {
        return (this.aliasId!= null);
    }

    /**
     * Gets the value of the aliasType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliasType() {
        return aliasType;
    }

    /**
     * Sets the value of the aliasType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAliasType(String value) {
        this.aliasType = value;
    }

    public boolean isSetAliasType() {
        return (this.aliasType!= null);
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    public boolean isSetFirstName() {
        return (this.firstName!= null);
    }

    /**
     * Gets the value of the fnamePhoneticCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFnamePhoneticCode() {
        return fnamePhoneticCode;
    }

    /**
     * Sets the value of the fnamePhoneticCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFnamePhoneticCode(String value) {
        this.fnamePhoneticCode = value;
    }

    public boolean isSetFnamePhoneticCode() {
        return (this.fnamePhoneticCode!= null);
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    public boolean isSetLastName() {
        return (this.lastName!= null);
    }

    /**
     * Gets the value of the lnamePhoneticCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLnamePhoneticCode() {
        return lnamePhoneticCode;
    }

    /**
     * Sets the value of the lnamePhoneticCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLnamePhoneticCode(String value) {
        this.lnamePhoneticCode = value;
    }

    public boolean isSetLnamePhoneticCode() {
        return (this.lnamePhoneticCode!= null);
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    public boolean isSetMiddleName() {
        return (this.middleName!= null);
    }

    /**
     * Gets the value of the mnamePhoneticCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMnamePhoneticCode() {
        return mnamePhoneticCode;
    }

    /**
     * Sets the value of the mnamePhoneticCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMnamePhoneticCode(String value) {
        this.mnamePhoneticCode = value;
    }

    public boolean isSetMnamePhoneticCode() {
        return (this.mnamePhoneticCode!= null);
    }

    /**
     * Gets the value of the stdFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStdFirstName() {
        return stdFirstName;
    }

    /**
     * Sets the value of the stdFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStdFirstName(String value) {
        this.stdFirstName = value;
    }

    public boolean isSetStdFirstName() {
        return (this.stdFirstName!= null);
    }

    /**
     * Gets the value of the stdLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStdLastName() {
        return stdLastName;
    }

    /**
     * Sets the value of the stdLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStdLastName(String value) {
        this.stdLastName = value;
    }

    public boolean isSetStdLastName() {
        return (this.stdLastName!= null);
    }

    /**
     * Gets the value of the stdMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStdMiddleName() {
        return stdMiddleName;
    }

    /**
     * Sets the value of the stdMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStdMiddleName(String value) {
        this.stdMiddleName = value;
    }

    public boolean isSetStdMiddleName() {
        return (this.stdMiddleName!= null);
    }

}
