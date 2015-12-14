
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fieldDef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fieldDef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="autoid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="codeModule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fieldType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keyType" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="maximumValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="minimumValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refKey" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="refMapping" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="required" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="updateable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fieldDef", propOrder = {
    "autoid",
    "codeModule",
    "displayName",
    "fieldName",
    "fieldSize",
    "fieldType",
    "keyType",
    "maximumValue",
    "minimumValue",
    "pattern",
    "refKey",
    "refMapping",
    "required",
    "updateable"
})
public class FieldDef
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected boolean autoid;
    protected String codeModule;
    protected String displayName;
    protected String fieldName;
    protected int fieldSize;
    protected String fieldType;
    protected boolean keyType;
    protected String maximumValue;
    protected String minimumValue;
    protected String pattern;
    protected boolean refKey;
    protected String refMapping;
    protected boolean required;
    protected boolean updateable;

    /**
     * Gets the value of the autoid property.
     * 
     */
    public boolean isAutoid() {
        return autoid;
    }

    /**
     * Sets the value of the autoid property.
     * 
     */
    public void setAutoid(boolean value) {
        this.autoid = value;
    }

    public boolean isSetAutoid() {
        return true;
    }

    /**
     * Gets the value of the codeModule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeModule() {
        return codeModule;
    }

    /**
     * Sets the value of the codeModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeModule(String value) {
        this.codeModule = value;
    }

    public boolean isSetCodeModule() {
        return (this.codeModule!= null);
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    public boolean isSetDisplayName() {
        return (this.displayName!= null);
    }

    /**
     * Gets the value of the fieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    public boolean isSetFieldName() {
        return (this.fieldName!= null);
    }

    /**
     * Gets the value of the fieldSize property.
     * 
     */
    public int getFieldSize() {
        return fieldSize;
    }

    /**
     * Sets the value of the fieldSize property.
     * 
     */
    public void setFieldSize(int value) {
        this.fieldSize = value;
    }

    public boolean isSetFieldSize() {
        return true;
    }

    /**
     * Gets the value of the fieldType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldType() {
        return fieldType;
    }

    /**
     * Sets the value of the fieldType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldType(String value) {
        this.fieldType = value;
    }

    public boolean isSetFieldType() {
        return (this.fieldType!= null);
    }

    /**
     * Gets the value of the keyType property.
     * 
     */
    public boolean isKeyType() {
        return keyType;
    }

    /**
     * Sets the value of the keyType property.
     * 
     */
    public void setKeyType(boolean value) {
        this.keyType = value;
    }

    public boolean isSetKeyType() {
        return true;
    }

    /**
     * Gets the value of the maximumValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumValue() {
        return maximumValue;
    }

    /**
     * Sets the value of the maximumValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumValue(String value) {
        this.maximumValue = value;
    }

    public boolean isSetMaximumValue() {
        return (this.maximumValue!= null);
    }

    /**
     * Gets the value of the minimumValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumValue() {
        return minimumValue;
    }

    /**
     * Sets the value of the minimumValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumValue(String value) {
        this.minimumValue = value;
    }

    public boolean isSetMinimumValue() {
        return (this.minimumValue!= null);
    }

    /**
     * Gets the value of the pattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * Sets the value of the pattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPattern(String value) {
        this.pattern = value;
    }

    public boolean isSetPattern() {
        return (this.pattern!= null);
    }

    /**
     * Gets the value of the refKey property.
     * 
     */
    public boolean isRefKey() {
        return refKey;
    }

    /**
     * Sets the value of the refKey property.
     * 
     */
    public void setRefKey(boolean value) {
        this.refKey = value;
    }

    public boolean isSetRefKey() {
        return true;
    }

    /**
     * Gets the value of the refMapping property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefMapping() {
        return refMapping;
    }

    /**
     * Sets the value of the refMapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefMapping(String value) {
        this.refMapping = value;
    }

    public boolean isSetRefMapping() {
        return (this.refMapping!= null);
    }

    /**
     * Gets the value of the required property.
     * 
     */
    public boolean isRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     */
    public void setRequired(boolean value) {
        this.required = value;
    }

    public boolean isSetRequired() {
        return true;
    }

    /**
     * Gets the value of the updateable property.
     * 
     */
    public boolean isUpdateable() {
        return updateable;
    }

    /**
     * Sets the value of the updateable property.
     * 
     */
    public void setUpdateable(boolean value) {
        this.updateable = value;
    }

    public boolean isSetUpdateable() {
        return true;
    }

}
