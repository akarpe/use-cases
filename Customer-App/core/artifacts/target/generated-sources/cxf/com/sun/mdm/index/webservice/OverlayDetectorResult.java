
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for overlayDetectorResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="overlayDetectorResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="overlay" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="rejectTransaction" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="splitRecord" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="systemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "overlayDetectorResult", propOrder = {
    "description",
    "lid",
    "overlay",
    "rejectTransaction",
    "splitRecord",
    "systemCode"
})
public class OverlayDetectorResult
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected String description;
    @XmlElement(name = "LID")
    protected String lid;
    protected boolean overlay;
    protected boolean rejectTransaction;
    protected boolean splitRecord;
    protected String systemCode;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    public boolean isSetDescription() {
        return (this.description!= null);
    }

    /**
     * Gets the value of the lid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLID() {
        return lid;
    }

    /**
     * Sets the value of the lid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLID(String value) {
        this.lid = value;
    }

    public boolean isSetLID() {
        return (this.lid!= null);
    }

    /**
     * Gets the value of the overlay property.
     * 
     */
    public boolean isOverlay() {
        return overlay;
    }

    /**
     * Sets the value of the overlay property.
     * 
     */
    public void setOverlay(boolean value) {
        this.overlay = value;
    }

    public boolean isSetOverlay() {
        return true;
    }

    /**
     * Gets the value of the rejectTransaction property.
     * 
     */
    public boolean isRejectTransaction() {
        return rejectTransaction;
    }

    /**
     * Sets the value of the rejectTransaction property.
     * 
     */
    public void setRejectTransaction(boolean value) {
        this.rejectTransaction = value;
    }

    public boolean isSetRejectTransaction() {
        return true;
    }

    /**
     * Gets the value of the splitRecord property.
     * 
     */
    public boolean isSplitRecord() {
        return splitRecord;
    }

    /**
     * Sets the value of the splitRecord property.
     * 
     */
    public void setSplitRecord(boolean value) {
        this.splitRecord = value;
    }

    public boolean isSetSplitRecord() {
        return true;
    }

    /**
     * Gets the value of the systemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemCode() {
        return systemCode;
    }

    /**
     * Sets the value of the systemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemCode(String value) {
        this.systemCode = value;
    }

    public boolean isSetSystemCode() {
        return (this.systemCode!= null);
    }

}
