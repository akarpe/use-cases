
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mergePersonResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mergePersonResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="destinationEO" type="{http://webservice.index.mdm.sun.com/}destinationEO" minOccurs="0"/>
 *         &lt;element name="sourceEO" type="{http://webservice.index.mdm.sun.com/}sourceEO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mergePersonResult", propOrder = {
    "destinationEO",
    "sourceEO"
})
public class MergePersonResult
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected DestinationEO destinationEO;
    protected SourceEO sourceEO;

    /**
     * Gets the value of the destinationEO property.
     * 
     * @return
     *     possible object is
     *     {@link DestinationEO }
     *     
     */
    public DestinationEO getDestinationEO() {
        return destinationEO;
    }

    /**
     * Sets the value of the destinationEO property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationEO }
     *     
     */
    public void setDestinationEO(DestinationEO value) {
        this.destinationEO = value;
    }

    public boolean isSetDestinationEO() {
        return (this.destinationEO!= null);
    }

    /**
     * Gets the value of the sourceEO property.
     * 
     * @return
     *     possible object is
     *     {@link SourceEO }
     *     
     */
    public SourceEO getSourceEO() {
        return sourceEO;
    }

    /**
     * Sets the value of the sourceEO property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceEO }
     *     
     */
    public void setSourceEO(SourceEO value) {
        this.sourceEO = value;
    }

    public boolean isSetSourceEO() {
        return (this.sourceEO!= null);
    }

}
