
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for potentialDuplicateRecordArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="potentialDuplicateRecordArray">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="potentialDuplicate" type="{http://webservice.index.mdm.sun.com/}potentialDuplicateRecord" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "potentialDuplicateRecordArray", propOrder = {
    "potentialDuplicates"
})
public class PotentialDuplicateRecordArray
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "potentialDuplicate", nillable = true)
    protected List<PotentialDuplicateRecord> potentialDuplicates;

    /**
     * Gets the value of the potentialDuplicates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the potentialDuplicates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPotentialDuplicates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PotentialDuplicateRecord }
     * 
     * 
     */
    public List<PotentialDuplicateRecord> getPotentialDuplicates() {
        if (potentialDuplicates == null) {
            potentialDuplicates = new ArrayList<PotentialDuplicateRecord>();
        }
        return this.potentialDuplicates;
    }

    public boolean isSetPotentialDuplicates() {
        return ((this.potentialDuplicates!= null)&&(!this.potentialDuplicates.isEmpty()));
    }

    public void unsetPotentialDuplicates() {
        this.potentialDuplicates = null;
    }

}
