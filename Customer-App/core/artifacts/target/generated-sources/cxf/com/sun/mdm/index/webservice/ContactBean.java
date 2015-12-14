
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contactBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactHomePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactNameDegree" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactNamePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactNameSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactRel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactWorkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactBean", propOrder = {
    "contactFirstName",
    "contactHomePhone",
    "contactId",
    "contactLastName",
    "contactMiddleName",
    "contactName",
    "contactNameDegree",
    "contactNamePrefix",
    "contactNameSuffix",
    "contactRel",
    "contactRole",
    "contactWorkPhone"
})
public class ContactBean
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected String contactFirstName;
    protected String contactHomePhone;
    protected String contactId;
    protected String contactLastName;
    protected String contactMiddleName;
    protected String contactName;
    protected String contactNameDegree;
    protected String contactNamePrefix;
    protected String contactNameSuffix;
    protected String contactRel;
    protected String contactRole;
    protected String contactWorkPhone;

    /**
     * Gets the value of the contactFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactFirstName() {
        return contactFirstName;
    }

    /**
     * Sets the value of the contactFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactFirstName(String value) {
        this.contactFirstName = value;
    }

    public boolean isSetContactFirstName() {
        return (this.contactFirstName!= null);
    }

    /**
     * Gets the value of the contactHomePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactHomePhone() {
        return contactHomePhone;
    }

    /**
     * Sets the value of the contactHomePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactHomePhone(String value) {
        this.contactHomePhone = value;
    }

    public boolean isSetContactHomePhone() {
        return (this.contactHomePhone!= null);
    }

    /**
     * Gets the value of the contactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactId() {
        return contactId;
    }

    /**
     * Sets the value of the contactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactId(String value) {
        this.contactId = value;
    }

    public boolean isSetContactId() {
        return (this.contactId!= null);
    }

    /**
     * Gets the value of the contactLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactLastName() {
        return contactLastName;
    }

    /**
     * Sets the value of the contactLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactLastName(String value) {
        this.contactLastName = value;
    }

    public boolean isSetContactLastName() {
        return (this.contactLastName!= null);
    }

    /**
     * Gets the value of the contactMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactMiddleName() {
        return contactMiddleName;
    }

    /**
     * Sets the value of the contactMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactMiddleName(String value) {
        this.contactMiddleName = value;
    }

    public boolean isSetContactMiddleName() {
        return (this.contactMiddleName!= null);
    }

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    public boolean isSetContactName() {
        return (this.contactName!= null);
    }

    /**
     * Gets the value of the contactNameDegree property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactNameDegree() {
        return contactNameDegree;
    }

    /**
     * Sets the value of the contactNameDegree property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactNameDegree(String value) {
        this.contactNameDegree = value;
    }

    public boolean isSetContactNameDegree() {
        return (this.contactNameDegree!= null);
    }

    /**
     * Gets the value of the contactNamePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactNamePrefix() {
        return contactNamePrefix;
    }

    /**
     * Sets the value of the contactNamePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactNamePrefix(String value) {
        this.contactNamePrefix = value;
    }

    public boolean isSetContactNamePrefix() {
        return (this.contactNamePrefix!= null);
    }

    /**
     * Gets the value of the contactNameSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactNameSuffix() {
        return contactNameSuffix;
    }

    /**
     * Sets the value of the contactNameSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactNameSuffix(String value) {
        this.contactNameSuffix = value;
    }

    public boolean isSetContactNameSuffix() {
        return (this.contactNameSuffix!= null);
    }

    /**
     * Gets the value of the contactRel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactRel() {
        return contactRel;
    }

    /**
     * Sets the value of the contactRel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactRel(String value) {
        this.contactRel = value;
    }

    public boolean isSetContactRel() {
        return (this.contactRel!= null);
    }

    /**
     * Gets the value of the contactRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactRole() {
        return contactRole;
    }

    /**
     * Sets the value of the contactRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactRole(String value) {
        this.contactRole = value;
    }

    public boolean isSetContactRole() {
        return (this.contactRole!= null);
    }

    /**
     * Gets the value of the contactWorkPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactWorkPhone() {
        return contactWorkPhone;
    }

    /**
     * Sets the value of the contactWorkPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactWorkPhone(String value) {
        this.contactWorkPhone = value;
    }

    public boolean isSetContactWorkPhone() {
        return (this.contactWorkPhone!= null);
    }

}
