
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for imagesBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="imagesBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="image" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imageAddDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imageDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imageUpdateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imagesId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "imagesBean", propOrder = {
    "image",
    "imageAddDate",
    "imageDescription",
    "imageName",
    "imageType",
    "imageUpdateDate",
    "imagesId"
})
public class ImagesBean
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected String image;
    protected String imageAddDate;
    protected String imageDescription;
    protected String imageName;
    protected String imageType;
    protected String imageUpdateDate;
    protected String imagesId;

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImage(String value) {
        this.image = value;
    }

    public boolean isSetImage() {
        return (this.image!= null);
    }

    /**
     * Gets the value of the imageAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageAddDate() {
        return imageAddDate;
    }

    /**
     * Sets the value of the imageAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageAddDate(String value) {
        this.imageAddDate = value;
    }

    public boolean isSetImageAddDate() {
        return (this.imageAddDate!= null);
    }

    /**
     * Gets the value of the imageDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageDescription() {
        return imageDescription;
    }

    /**
     * Sets the value of the imageDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageDescription(String value) {
        this.imageDescription = value;
    }

    public boolean isSetImageDescription() {
        return (this.imageDescription!= null);
    }

    /**
     * Gets the value of the imageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageName() {
        return imageName;
    }

    /**
     * Sets the value of the imageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageName(String value) {
        this.imageName = value;
    }

    public boolean isSetImageName() {
        return (this.imageName!= null);
    }

    /**
     * Gets the value of the imageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageType() {
        return imageType;
    }

    /**
     * Sets the value of the imageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageType(String value) {
        this.imageType = value;
    }

    public boolean isSetImageType() {
        return (this.imageType!= null);
    }

    /**
     * Gets the value of the imageUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageUpdateDate() {
        return imageUpdateDate;
    }

    /**
     * Sets the value of the imageUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageUpdateDate(String value) {
        this.imageUpdateDate = value;
    }

    public boolean isSetImageUpdateDate() {
        return (this.imageUpdateDate!= null);
    }

    /**
     * Gets the value of the imagesId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagesId() {
        return imagesId;
    }

    /**
     * Sets the value of the imagesId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagesId(String value) {
        this.imagesId = value;
    }

    public boolean isSetImagesId() {
        return (this.imagesId!= null);
    }

}
