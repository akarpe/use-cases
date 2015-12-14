
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
 * <p>Java class for mergeMultipleEnterpriseRecords complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mergeMultipleEnterpriseRecords">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="callerInfo" type="{http://webservice.index.mdm.sun.com/}callerInfo" minOccurs="0"/>
 *         &lt;element name="sourceEUIDs" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="destinationEO" type="{http://webservice.index.mdm.sun.com/}enterprisePerson" minOccurs="0"/>
 *         &lt;element name="srcRevisionNumbers" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="destRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calculateOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="setSourceSystemStatusToMerged" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mergeMultipleEnterpriseRecords", propOrder = {
    "callerInfo",
    "sourceEUIDs",
    "destinationEO",
    "srcRevisionNumbers",
    "destRevisionNumber",
    "calculateOnly",
    "setSourceSystemStatusToMerged"
})
@XmlRootElement(name = "mergeMultipleEnterpriseRecords")
public class MergeMultipleEnterpriseRecords
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected CallerInfo callerInfo;
    @XmlElement(nillable = true)
    protected List<String> sourceEUIDs;
    protected EnterprisePerson destinationEO;
    @XmlElement(nillable = true)
    protected List<String> srcRevisionNumbers;
    protected String destRevisionNumber;
    protected boolean calculateOnly;
    protected boolean setSourceSystemStatusToMerged;

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
     * Gets the value of the sourceEUIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceEUIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceEUIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSourceEUIDs() {
        if (sourceEUIDs == null) {
            sourceEUIDs = new ArrayList<String>();
        }
        return this.sourceEUIDs;
    }

    public boolean isSetSourceEUIDs() {
        return ((this.sourceEUIDs!= null)&&(!this.sourceEUIDs.isEmpty()));
    }

    public void unsetSourceEUIDs() {
        this.sourceEUIDs = null;
    }

    /**
     * Gets the value of the destinationEO property.
     * 
     * @return
     *     possible object is
     *     {@link EnterprisePerson }
     *     
     */
    public EnterprisePerson getDestinationEO() {
        return destinationEO;
    }

    /**
     * Sets the value of the destinationEO property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnterprisePerson }
     *     
     */
    public void setDestinationEO(EnterprisePerson value) {
        this.destinationEO = value;
    }

    public boolean isSetDestinationEO() {
        return (this.destinationEO!= null);
    }

    /**
     * Gets the value of the srcRevisionNumbers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the srcRevisionNumbers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSrcRevisionNumbers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSrcRevisionNumbers() {
        if (srcRevisionNumbers == null) {
            srcRevisionNumbers = new ArrayList<String>();
        }
        return this.srcRevisionNumbers;
    }

    public boolean isSetSrcRevisionNumbers() {
        return ((this.srcRevisionNumbers!= null)&&(!this.srcRevisionNumbers.isEmpty()));
    }

    public void unsetSrcRevisionNumbers() {
        this.srcRevisionNumbers = null;
    }

    /**
     * Gets the value of the destRevisionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestRevisionNumber() {
        return destRevisionNumber;
    }

    /**
     * Sets the value of the destRevisionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestRevisionNumber(String value) {
        this.destRevisionNumber = value;
    }

    public boolean isSetDestRevisionNumber() {
        return (this.destRevisionNumber!= null);
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

    /**
     * Gets the value of the setSourceSystemStatusToMerged property.
     * 
     */
    public boolean isSetSourceSystemStatusToMerged() {
        return setSourceSystemStatusToMerged;
    }

    /**
     * Sets the value of the setSourceSystemStatusToMerged property.
     * 
     */
    public void setSetSourceSystemStatusToMerged(boolean value) {
        this.setSourceSystemStatusToMerged = value;
    }

    public boolean isSetSetSourceSystemStatusToMerged() {
        return true;
    }

}
