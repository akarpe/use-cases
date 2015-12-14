
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMultipleLIDs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMultipleLIDs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="callerInfo" type="{http://webservice.index.mdm.sun.com/}callerInfo" minOccurs="0"/>
 *         &lt;element name="euids" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="returnEuidsAsLids" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMultipleLIDs", propOrder = {
    "callerInfo",
    "euids",
    "returnEuidsAsLids"
})
@XmlRootElement(name = "getMultipleLIDs")
public class GetMultipleLIDs
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected CallerInfo callerInfo;
    @XmlElement(nillable = true)
    protected List<String> euids;
    protected boolean returnEuidsAsLids;

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
     * Gets the value of the euids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the euids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEuids().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEuids() {
        if (euids == null) {
            euids = new ArrayList<String>();
        }
        return this.euids;
    }

    public boolean isSetEuids() {
        return ((this.euids!= null)&&(!this.euids.isEmpty()));
    }

    public void unsetEuids() {
        this.euids = null;
    }

    /**
     * Gets the value of the returnEuidsAsLids property.
     * 
     */
    public boolean isReturnEuidsAsLids() {
        return returnEuidsAsLids;
    }

    /**
     * Sets the value of the returnEuidsAsLids property.
     * 
     */
    public void setReturnEuidsAsLids(boolean value) {
        this.returnEuidsAsLids = value;
    }

    public boolean isSetReturnEuidsAsLids() {
        return true;
    }

}
