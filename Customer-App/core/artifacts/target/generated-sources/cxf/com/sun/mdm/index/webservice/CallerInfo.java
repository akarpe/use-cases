
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for callerInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="callerInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="application" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicationFunction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="executionCycleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="system" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "callerInfo", propOrder = {
    "application",
    "applicationFunction",
    "authPassword",
    "authUser",
    "executionCycleId",
    "system",
    "user"
})
public class CallerInfo
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected String application;
    protected String applicationFunction;
    protected String authPassword;
    protected String authUser;
    protected String executionCycleId;
    protected String system;
    protected String user;

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplication(String value) {
        this.application = value;
    }

    public boolean isSetApplication() {
        return (this.application!= null);
    }

    /**
     * Gets the value of the applicationFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationFunction() {
        return applicationFunction;
    }

    /**
     * Sets the value of the applicationFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationFunction(String value) {
        this.applicationFunction = value;
    }

    public boolean isSetApplicationFunction() {
        return (this.applicationFunction!= null);
    }

    /**
     * Gets the value of the authPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthPassword() {
        return authPassword;
    }

    /**
     * Sets the value of the authPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthPassword(String value) {
        this.authPassword = value;
    }

    public boolean isSetAuthPassword() {
        return (this.authPassword!= null);
    }

    /**
     * Gets the value of the authUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthUser() {
        return authUser;
    }

    /**
     * Sets the value of the authUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthUser(String value) {
        this.authUser = value;
    }

    public boolean isSetAuthUser() {
        return (this.authUser!= null);
    }

    /**
     * Gets the value of the executionCycleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutionCycleId() {
        return executionCycleId;
    }

    /**
     * Sets the value of the executionCycleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutionCycleId(String value) {
        this.executionCycleId = value;
    }

    public boolean isSetExecutionCycleId() {
        return (this.executionCycleId!= null);
    }

    /**
     * Gets the value of the system property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystem() {
        return system;
    }

    /**
     * Sets the value of the system property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystem(String value) {
        this.system = value;
    }

    public boolean isSetSystem() {
        return (this.system!= null);
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    public boolean isSetUser() {
        return (this.user!= null);
    }

}
