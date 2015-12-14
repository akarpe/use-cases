
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for commentBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="commentBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commentText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enterDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commentBean", propOrder = {
    "commentCode",
    "commentId",
    "commentText",
    "enterDate"
})
public class CommentBean
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected String commentCode;
    protected String commentId;
    protected String commentText;
    protected String enterDate;

    /**
     * Gets the value of the commentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentCode() {
        return commentCode;
    }

    /**
     * Sets the value of the commentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentCode(String value) {
        this.commentCode = value;
    }

    public boolean isSetCommentCode() {
        return (this.commentCode!= null);
    }

    /**
     * Gets the value of the commentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentId() {
        return commentId;
    }

    /**
     * Sets the value of the commentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentId(String value) {
        this.commentId = value;
    }

    public boolean isSetCommentId() {
        return (this.commentId!= null);
    }

    /**
     * Gets the value of the commentText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentText() {
        return commentText;
    }

    /**
     * Sets the value of the commentText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentText(String value) {
        this.commentText = value;
    }

    public boolean isSetCommentText() {
        return (this.commentText!= null);
    }

    /**
     * Gets the value of the enterDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnterDate() {
        return enterDate;
    }

    /**
     * Sets the value of the enterDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnterDate(String value) {
        this.enterDate = value;
    }

    public boolean isSetEnterDate() {
        return (this.enterDate!= null);
    }

}
