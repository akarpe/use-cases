
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for auxIdBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="auxIdBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assigningAuthorityNamespace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assigningAuthorityUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assigningAuthorityUIDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="auxIdDef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="auxIdId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "auxIdBean", propOrder = {
    "assigningAuthorityNamespace",
    "assigningAuthorityUID",
    "assigningAuthorityUIDType",
    "auxIdDef",
    "auxIdId",
    "id"
})
public class AuxIdBean
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected String assigningAuthorityNamespace;
    protected String assigningAuthorityUID;
    protected String assigningAuthorityUIDType;
    protected String auxIdDef;
    protected String auxIdId;
    protected String id;

    /**
     * Gets the value of the assigningAuthorityNamespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssigningAuthorityNamespace() {
        return assigningAuthorityNamespace;
    }

    /**
     * Sets the value of the assigningAuthorityNamespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssigningAuthorityNamespace(String value) {
        this.assigningAuthorityNamespace = value;
    }

    public boolean isSetAssigningAuthorityNamespace() {
        return (this.assigningAuthorityNamespace!= null);
    }

    /**
     * Gets the value of the assigningAuthorityUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssigningAuthorityUID() {
        return assigningAuthorityUID;
    }

    /**
     * Sets the value of the assigningAuthorityUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssigningAuthorityUID(String value) {
        this.assigningAuthorityUID = value;
    }

    public boolean isSetAssigningAuthorityUID() {
        return (this.assigningAuthorityUID!= null);
    }

    /**
     * Gets the value of the assigningAuthorityUIDType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssigningAuthorityUIDType() {
        return assigningAuthorityUIDType;
    }

    /**
     * Sets the value of the assigningAuthorityUIDType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssigningAuthorityUIDType(String value) {
        this.assigningAuthorityUIDType = value;
    }

    public boolean isSetAssigningAuthorityUIDType() {
        return (this.assigningAuthorityUIDType!= null);
    }

    /**
     * Gets the value of the auxIdDef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuxIdDef() {
        return auxIdDef;
    }

    /**
     * Sets the value of the auxIdDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuxIdDef(String value) {
        this.auxIdDef = value;
    }

    public boolean isSetAuxIdDef() {
        return (this.auxIdDef!= null);
    }

    /**
     * Gets the value of the auxIdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuxIdId() {
        return auxIdId;
    }

    /**
     * Sets the value of the auxIdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuxIdId(String value) {
        this.auxIdId = value;
    }

    public boolean isSetAuxIdId() {
        return (this.auxIdId!= null);
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    public boolean isSetId() {
        return (this.id!= null);
    }

}
