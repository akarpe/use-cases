
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for scoreElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="scoreElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comparisonId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="decisionResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="falsePositiveExplanation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="potentialFalsePositive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="weightExplanation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scoreElement", propOrder = {
    "comparisonId",
    "decisionResult",
    "euid",
    "falsePositiveExplanation",
    "potentialFalsePositive",
    "weight",
    "weightExplanation"
})
public class ScoreElement
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected Long comparisonId;
    protected String decisionResult;
    @XmlElement(name = "EUID")
    protected String euid;
    protected String falsePositiveExplanation;
    protected boolean potentialFalsePositive;
    protected double weight;
    protected String weightExplanation;

    /**
     * Gets the value of the comparisonId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getComparisonId() {
        return comparisonId;
    }

    /**
     * Sets the value of the comparisonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setComparisonId(Long value) {
        this.comparisonId = value;
    }

    public boolean isSetComparisonId() {
        return (this.comparisonId!= null);
    }

    /**
     * Gets the value of the decisionResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionResult() {
        return decisionResult;
    }

    /**
     * Sets the value of the decisionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionResult(String value) {
        this.decisionResult = value;
    }

    public boolean isSetDecisionResult() {
        return (this.decisionResult!= null);
    }

    /**
     * Gets the value of the euid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEUID() {
        return euid;
    }

    /**
     * Sets the value of the euid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEUID(String value) {
        this.euid = value;
    }

    public boolean isSetEUID() {
        return (this.euid!= null);
    }

    /**
     * Gets the value of the falsePositiveExplanation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFalsePositiveExplanation() {
        return falsePositiveExplanation;
    }

    /**
     * Sets the value of the falsePositiveExplanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFalsePositiveExplanation(String value) {
        this.falsePositiveExplanation = value;
    }

    public boolean isSetFalsePositiveExplanation() {
        return (this.falsePositiveExplanation!= null);
    }

    /**
     * Gets the value of the potentialFalsePositive property.
     * 
     */
    public boolean isPotentialFalsePositive() {
        return potentialFalsePositive;
    }

    /**
     * Sets the value of the potentialFalsePositive property.
     * 
     */
    public void setPotentialFalsePositive(boolean value) {
        this.potentialFalsePositive = value;
    }

    public boolean isSetPotentialFalsePositive() {
        return true;
    }

    /**
     * Gets the value of the weight property.
     * 
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     */
    public void setWeight(double value) {
        this.weight = value;
    }

    public boolean isSetWeight() {
        return true;
    }

    /**
     * Gets the value of the weightExplanation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeightExplanation() {
        return weightExplanation;
    }

    /**
     * Sets the value of the weightExplanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeightExplanation(String value) {
        this.weightExplanation = value;
    }

    public boolean isSetWeightExplanation() {
        return (this.weightExplanation!= null);
    }

}
