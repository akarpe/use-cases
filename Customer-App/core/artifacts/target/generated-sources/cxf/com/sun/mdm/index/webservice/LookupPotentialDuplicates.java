
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lookupPotentialDuplicates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lookupPotentialDuplicates">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="callerInfo" type="{http://webservice.index.mdm.sun.com/}callerInfo" minOccurs="0"/>
 *         &lt;element name="PotentialDuplicateSearchObjectBean" type="{http://webservice.index.mdm.sun.com/}potentialDuplicateSearchObjectBean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lookupPotentialDuplicates", propOrder = {
    "callerInfo",
    "potentialDuplicateSearchObjectBean"
})
@XmlRootElement(name = "lookupPotentialDuplicates")
public class LookupPotentialDuplicates
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected CallerInfo callerInfo;
    @XmlElement(name = "PotentialDuplicateSearchObjectBean")
    protected PotentialDuplicateSearchObjectBean potentialDuplicateSearchObjectBean;

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
     * Gets the value of the potentialDuplicateSearchObjectBean property.
     * 
     * @return
     *     possible object is
     *     {@link PotentialDuplicateSearchObjectBean }
     *     
     */
    public PotentialDuplicateSearchObjectBean getPotentialDuplicateSearchObjectBean() {
        return potentialDuplicateSearchObjectBean;
    }

    /**
     * Sets the value of the potentialDuplicateSearchObjectBean property.
     * 
     * @param value
     *     allowed object is
     *     {@link PotentialDuplicateSearchObjectBean }
     *     
     */
    public void setPotentialDuplicateSearchObjectBean(PotentialDuplicateSearchObjectBean value) {
        this.potentialDuplicateSearchObjectBean = value;
    }

    public boolean isSetPotentialDuplicateSearchObjectBean() {
        return (this.potentialDuplicateSearchObjectBean!= null);
    }

}
