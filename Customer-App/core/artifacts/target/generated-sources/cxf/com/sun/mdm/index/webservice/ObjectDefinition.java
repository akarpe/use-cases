
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for objectDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="objectDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nodes" type="{http://webservice.index.mdm.sun.com/}nodeDef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="objectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relationships" type="{http://webservice.index.mdm.sun.com/}relationDef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "objectDefinition", propOrder = {
    "nodes",
    "objectName",
    "relationships"
})
public class ObjectDefinition
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(nillable = true)
    protected List<NodeDef> nodes;
    protected String objectName;
    @XmlElement(nillable = true)
    protected List<RelationDef> relationships;

    /**
     * Gets the value of the nodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NodeDef }
     * 
     * 
     */
    public List<NodeDef> getNodes() {
        if (nodes == null) {
            nodes = new ArrayList<NodeDef>();
        }
        return this.nodes;
    }

    public boolean isSetNodes() {
        return ((this.nodes!= null)&&(!this.nodes.isEmpty()));
    }

    public void unsetNodes() {
        this.nodes = null;
    }

    /**
     * Gets the value of the objectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectName() {
        return objectName;
    }

    /**
     * Sets the value of the objectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectName(String value) {
        this.objectName = value;
    }

    public boolean isSetObjectName() {
        return (this.objectName!= null);
    }

    /**
     * Gets the value of the relationships property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relationships property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelationships().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationDef }
     * 
     * 
     */
    public List<RelationDef> getRelationships() {
        if (relationships == null) {
            relationships = new ArrayList<RelationDef>();
        }
        return this.relationships;
    }

    public boolean isSetRelationships() {
        return ((this.relationships!= null)&&(!this.relationships.isEmpty()));
    }

    public void unsetRelationships() {
        this.relationships = null;
    }

}
