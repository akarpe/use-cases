
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nodeDef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nodeDef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="endPoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fields" type="{http://webservice.index.mdm.sun.com/}fieldDef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isRefNode" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="nameSpace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nodeDef", propOrder = {
    "endPoint",
    "fields",
    "isRefNode",
    "nameSpace",
    "operation",
    "tag"
})
public class NodeDef
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected String endPoint;
    @XmlElement(nillable = true)
    protected List<FieldDef> fields;
    protected boolean isRefNode;
    protected String nameSpace;
    protected String operation;
    protected String tag;

    /**
     * Gets the value of the endPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndPoint() {
        return endPoint;
    }

    /**
     * Sets the value of the endPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndPoint(String value) {
        this.endPoint = value;
    }

    public boolean isSetEndPoint() {
        return (this.endPoint!= null);
    }

    /**
     * Gets the value of the fields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldDef }
     * 
     * 
     */
    public List<FieldDef> getFields() {
        if (fields == null) {
            fields = new ArrayList<FieldDef>();
        }
        return this.fields;
    }

    public boolean isSetFields() {
        return ((this.fields!= null)&&(!this.fields.isEmpty()));
    }

    public void unsetFields() {
        this.fields = null;
    }

    /**
     * Gets the value of the isRefNode property.
     * 
     */
    public boolean isIsRefNode() {
        return isRefNode;
    }

    /**
     * Sets the value of the isRefNode property.
     * 
     */
    public void setIsRefNode(boolean value) {
        this.isRefNode = value;
    }

    public boolean isSetIsRefNode() {
        return true;
    }

    /**
     * Gets the value of the nameSpace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameSpace() {
        return nameSpace;
    }

    /**
     * Sets the value of the nameSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameSpace(String value) {
        this.nameSpace = value;
    }

    public boolean isSetNameSpace() {
        return (this.nameSpace!= null);
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

    public boolean isSetOperation() {
        return (this.operation!= null);
    }

    /**
     * Gets the value of the tag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag() {
        return tag;
    }

    /**
     * Sets the value of the tag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag(String value) {
        this.tag = value;
    }

    public boolean isSetTag() {
        return (this.tag!= null);
    }

}
