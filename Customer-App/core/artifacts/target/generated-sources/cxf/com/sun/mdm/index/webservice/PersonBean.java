
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for personBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="personBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://webservice.index.mdm.sun.com/}addressBean" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="addressHistory" type="{http://webservice.index.mdm.sun.com/}addressHistoryBean" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="alias" type="{http://webservice.index.mdm.sun.com/}aliasBean" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="authFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="auxId" type="{http://webservice.index.mdm.sun.com/}auxIdBean" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="birthOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="citizenship" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="class1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="class2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="class3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="class4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="class5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://webservice.index.mdm.sun.com/}commentBean" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contact" type="{http://webservice.index.mdm.sun.com/}contactBean" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="death" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deathCertificate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="degree" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="districtOfResidence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="driversLicense" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="driversLicenseExp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="driversLicenseSt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dummyDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://webservice.index.mdm.sun.com/}emailBean" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ethnic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fatherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fatherPhoneticCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fnamePhoneticCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="images" type="{http://webservice.index.mdm.sun.com/}imagesBean" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastServiceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lgaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lnamePhoneticCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maiden" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maidenPhoneticCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="militaryBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="militaryRank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="militaryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mnamePhoneticCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motherMN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motherMNPhoneticCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motherPhoneticCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="multipleBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pensionExpDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pensionNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="personCatCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://webservice.index.mdm.sun.com/}phoneBean" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="phoneHistory" type="{http://webservice.index.mdm.sun.com/}phoneHistoryBean" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="picture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pobCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pobCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pobState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="race" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="races" type="{http://webservice.index.mdm.sun.com/}racesBean" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="religion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="repatriationNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SSN4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spousePhoneticCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stdFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stdLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stdMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="string1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="string10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="string2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="string3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="string4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="string5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="string6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="string7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="string8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="string9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VIPFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vetStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personBean", propOrder = {
    "addresses",
    "addressHistories",
    "alias",
    "authFlag",
    "auxIds",
    "birthOrder",
    "citizenship",
    "class1",
    "class2",
    "class3",
    "class4",
    "class5",
    "comments",
    "contacts",
    "dob",
    "date1",
    "date2",
    "date3",
    "date4",
    "date5",
    "death",
    "deathCertificate",
    "degree",
    "districtOfResidence",
    "dod",
    "driversLicense",
    "driversLicenseExp",
    "driversLicenseSt",
    "dummyDate",
    "emails",
    "ethnic",
    "fatherName",
    "fatherPhoneticCode",
    "firstName",
    "fnamePhoneticCode",
    "gender",
    "images",
    "language",
    "lastName",
    "lastServiceDate",
    "lgaCode",
    "lnamePhoneticCode",
    "mStatus",
    "maiden",
    "maidenPhoneticCode",
    "middleName",
    "militaryBranch",
    "militaryRank",
    "militaryStatus",
    "mnamePhoneticCode",
    "motherMN",
    "motherMNPhoneticCode",
    "motherName",
    "motherPhoneticCode",
    "multipleBirth",
    "nationality",
    "pensionExpDate",
    "pensionNo",
    "personCatCode",
    "personId",
    "phones",
    "phoneHistories",
    "picture",
    "pobCity",
    "pobCountry",
    "pobState",
    "prefix",
    "race",
    "races",
    "religion",
    "repatriationNo",
    "ssn",
    "ssn4",
    "spouseName",
    "spousePhoneticCode",
    "stdFirstName",
    "stdLastName",
    "stdMiddleName",
    "string1",
    "string10",
    "string2",
    "string3",
    "string4",
    "string5",
    "string6",
    "string7",
    "string8",
    "string9",
    "suffix",
    "title",
    "vipFlag",
    "vetStatus"
})
public class PersonBean
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "address", nillable = true)
    protected List<AddressBean> addresses;
    @XmlElement(name = "addressHistory", nillable = true)
    protected List<AddressHistoryBean> addressHistories;
    @XmlElement(nillable = true)
    protected List<AliasBean> alias;
    protected String authFlag;
    @XmlElement(name = "auxId", nillable = true)
    protected List<AuxIdBean> auxIds;
    protected String birthOrder;
    protected String citizenship;
    protected String class1;
    protected String class2;
    protected String class3;
    protected String class4;
    protected String class5;
    @XmlElement(name = "comment", nillable = true)
    protected List<CommentBean> comments;
    @XmlElement(name = "contact", nillable = true)
    protected List<ContactBean> contacts;
    @XmlElement(name = "DOB")
    protected String dob;
    protected String date1;
    protected String date2;
    protected String date3;
    protected String date4;
    protected String date5;
    protected String death;
    protected String deathCertificate;
    protected String degree;
    protected String districtOfResidence;
    protected String dod;
    protected String driversLicense;
    protected String driversLicenseExp;
    protected String driversLicenseSt;
    protected String dummyDate;
    @XmlElement(name = "email", nillable = true)
    protected List<EmailBean> emails;
    protected String ethnic;
    protected String fatherName;
    protected String fatherPhoneticCode;
    protected String firstName;
    protected String fnamePhoneticCode;
    protected String gender;
    @XmlElement(nillable = true)
    protected List<ImagesBean> images;
    protected String language;
    protected String lastName;
    protected String lastServiceDate;
    protected String lgaCode;
    protected String lnamePhoneticCode;
    @XmlElement(name = "MStatus")
    protected String mStatus;
    protected String maiden;
    protected String maidenPhoneticCode;
    protected String middleName;
    protected String militaryBranch;
    protected String militaryRank;
    protected String militaryStatus;
    protected String mnamePhoneticCode;
    protected String motherMN;
    protected String motherMNPhoneticCode;
    protected String motherName;
    protected String motherPhoneticCode;
    protected String multipleBirth;
    protected String nationality;
    protected String pensionExpDate;
    protected String pensionNo;
    protected String personCatCode;
    protected String personId;
    @XmlElement(name = "phone", nillable = true)
    protected List<PhoneBean> phones;
    @XmlElement(name = "phoneHistory", nillable = true)
    protected List<PhoneHistoryBean> phoneHistories;
    protected String picture;
    protected String pobCity;
    protected String pobCountry;
    protected String pobState;
    protected String prefix;
    protected String race;
    @XmlElement(nillable = true)
    protected List<RacesBean> races;
    protected String religion;
    protected String repatriationNo;
    @XmlElement(name = "SSN")
    protected String ssn;
    @XmlElement(name = "SSN4")
    protected String ssn4;
    protected String spouseName;
    protected String spousePhoneticCode;
    protected String stdFirstName;
    protected String stdLastName;
    protected String stdMiddleName;
    protected String string1;
    protected String string10;
    protected String string2;
    protected String string3;
    protected String string4;
    protected String string5;
    protected String string6;
    protected String string7;
    protected String string8;
    protected String string9;
    protected String suffix;
    protected String title;
    @XmlElement(name = "VIPFlag")
    protected String vipFlag;
    protected String vetStatus;

    /**
     * Gets the value of the addresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressBean }
     * 
     * 
     */
    public List<AddressBean> getAddresses() {
        if (addresses == null) {
            addresses = new ArrayList<AddressBean>();
        }
        return this.addresses;
    }

    public boolean isSetAddresses() {
        return ((this.addresses!= null)&&(!this.addresses.isEmpty()));
    }

    public void unsetAddresses() {
        this.addresses = null;
    }

    /**
     * Gets the value of the addressHistories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressHistories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressHistories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressHistoryBean }
     * 
     * 
     */
    public List<AddressHistoryBean> getAddressHistories() {
        if (addressHistories == null) {
            addressHistories = new ArrayList<AddressHistoryBean>();
        }
        return this.addressHistories;
    }

    public boolean isSetAddressHistories() {
        return ((this.addressHistories!= null)&&(!this.addressHistories.isEmpty()));
    }

    public void unsetAddressHistories() {
        this.addressHistories = null;
    }

    /**
     * Gets the value of the alias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AliasBean }
     * 
     * 
     */
    public List<AliasBean> getAlias() {
        if (alias == null) {
            alias = new ArrayList<AliasBean>();
        }
        return this.alias;
    }

    public boolean isSetAlias() {
        return ((this.alias!= null)&&(!this.alias.isEmpty()));
    }

    public void unsetAlias() {
        this.alias = null;
    }

    /**
     * Gets the value of the authFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthFlag() {
        return authFlag;
    }

    /**
     * Sets the value of the authFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthFlag(String value) {
        this.authFlag = value;
    }

    public boolean isSetAuthFlag() {
        return (this.authFlag!= null);
    }

    /**
     * Gets the value of the auxIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auxIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuxIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuxIdBean }
     * 
     * 
     */
    public List<AuxIdBean> getAuxIds() {
        if (auxIds == null) {
            auxIds = new ArrayList<AuxIdBean>();
        }
        return this.auxIds;
    }

    public boolean isSetAuxIds() {
        return ((this.auxIds!= null)&&(!this.auxIds.isEmpty()));
    }

    public void unsetAuxIds() {
        this.auxIds = null;
    }

    /**
     * Gets the value of the birthOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthOrder() {
        return birthOrder;
    }

    /**
     * Sets the value of the birthOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthOrder(String value) {
        this.birthOrder = value;
    }

    public boolean isSetBirthOrder() {
        return (this.birthOrder!= null);
    }

    /**
     * Gets the value of the citizenship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitizenship() {
        return citizenship;
    }

    /**
     * Sets the value of the citizenship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitizenship(String value) {
        this.citizenship = value;
    }

    public boolean isSetCitizenship() {
        return (this.citizenship!= null);
    }

    /**
     * Gets the value of the class1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClass1() {
        return class1;
    }

    /**
     * Sets the value of the class1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClass1(String value) {
        this.class1 = value;
    }

    public boolean isSetClass1() {
        return (this.class1 != null);
    }

    /**
     * Gets the value of the class2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClass2() {
        return class2;
    }

    /**
     * Sets the value of the class2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClass2(String value) {
        this.class2 = value;
    }

    public boolean isSetClass2() {
        return (this.class2 != null);
    }

    /**
     * Gets the value of the class3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClass3() {
        return class3;
    }

    /**
     * Sets the value of the class3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClass3(String value) {
        this.class3 = value;
    }

    public boolean isSetClass3() {
        return (this.class3 != null);
    }

    /**
     * Gets the value of the class4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClass4() {
        return class4;
    }

    /**
     * Sets the value of the class4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClass4(String value) {
        this.class4 = value;
    }

    public boolean isSetClass4() {
        return (this.class4 != null);
    }

    /**
     * Gets the value of the class5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClass5() {
        return class5;
    }

    /**
     * Sets the value of the class5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClass5(String value) {
        this.class5 = value;
    }

    public boolean isSetClass5() {
        return (this.class5 != null);
    }

    /**
     * Gets the value of the comments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommentBean }
     * 
     * 
     */
    public List<CommentBean> getComments() {
        if (comments == null) {
            comments = new ArrayList<CommentBean>();
        }
        return this.comments;
    }

    public boolean isSetComments() {
        return ((this.comments!= null)&&(!this.comments.isEmpty()));
    }

    public void unsetComments() {
        this.comments = null;
    }

    /**
     * Gets the value of the contacts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contacts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContacts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactBean }
     * 
     * 
     */
    public List<ContactBean> getContacts() {
        if (contacts == null) {
            contacts = new ArrayList<ContactBean>();
        }
        return this.contacts;
    }

    public boolean isSetContacts() {
        return ((this.contacts!= null)&&(!this.contacts.isEmpty()));
    }

    public void unsetContacts() {
        this.contacts = null;
    }

    /**
     * Gets the value of the dob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOB() {
        return dob;
    }

    /**
     * Sets the value of the dob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOB(String value) {
        this.dob = value;
    }

    public boolean isSetDOB() {
        return (this.dob!= null);
    }

    /**
     * Gets the value of the date1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate1() {
        return date1;
    }

    /**
     * Sets the value of the date1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate1(String value) {
        this.date1 = value;
    }

    public boolean isSetDate1() {
        return (this.date1 != null);
    }

    /**
     * Gets the value of the date2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate2() {
        return date2;
    }

    /**
     * Sets the value of the date2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate2(String value) {
        this.date2 = value;
    }

    public boolean isSetDate2() {
        return (this.date2 != null);
    }

    /**
     * Gets the value of the date3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate3() {
        return date3;
    }

    /**
     * Sets the value of the date3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate3(String value) {
        this.date3 = value;
    }

    public boolean isSetDate3() {
        return (this.date3 != null);
    }

    /**
     * Gets the value of the date4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate4() {
        return date4;
    }

    /**
     * Sets the value of the date4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate4(String value) {
        this.date4 = value;
    }

    public boolean isSetDate4() {
        return (this.date4 != null);
    }

    /**
     * Gets the value of the date5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate5() {
        return date5;
    }

    /**
     * Sets the value of the date5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate5(String value) {
        this.date5 = value;
    }

    public boolean isSetDate5() {
        return (this.date5 != null);
    }

    /**
     * Gets the value of the death property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeath() {
        return death;
    }

    /**
     * Sets the value of the death property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeath(String value) {
        this.death = value;
    }

    public boolean isSetDeath() {
        return (this.death!= null);
    }

    /**
     * Gets the value of the deathCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeathCertificate() {
        return deathCertificate;
    }

    /**
     * Sets the value of the deathCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeathCertificate(String value) {
        this.deathCertificate = value;
    }

    public boolean isSetDeathCertificate() {
        return (this.deathCertificate!= null);
    }

    /**
     * Gets the value of the degree property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDegree() {
        return degree;
    }

    /**
     * Sets the value of the degree property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDegree(String value) {
        this.degree = value;
    }

    public boolean isSetDegree() {
        return (this.degree!= null);
    }

    /**
     * Gets the value of the districtOfResidence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictOfResidence() {
        return districtOfResidence;
    }

    /**
     * Sets the value of the districtOfResidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictOfResidence(String value) {
        this.districtOfResidence = value;
    }

    public boolean isSetDistrictOfResidence() {
        return (this.districtOfResidence!= null);
    }

    /**
     * Gets the value of the dod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDod() {
        return dod;
    }

    /**
     * Sets the value of the dod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDod(String value) {
        this.dod = value;
    }

    public boolean isSetDod() {
        return (this.dod!= null);
    }

    /**
     * Gets the value of the driversLicense property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriversLicense() {
        return driversLicense;
    }

    /**
     * Sets the value of the driversLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriversLicense(String value) {
        this.driversLicense = value;
    }

    public boolean isSetDriversLicense() {
        return (this.driversLicense!= null);
    }

    /**
     * Gets the value of the driversLicenseExp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriversLicenseExp() {
        return driversLicenseExp;
    }

    /**
     * Sets the value of the driversLicenseExp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriversLicenseExp(String value) {
        this.driversLicenseExp = value;
    }

    public boolean isSetDriversLicenseExp() {
        return (this.driversLicenseExp!= null);
    }

    /**
     * Gets the value of the driversLicenseSt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriversLicenseSt() {
        return driversLicenseSt;
    }

    /**
     * Sets the value of the driversLicenseSt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriversLicenseSt(String value) {
        this.driversLicenseSt = value;
    }

    public boolean isSetDriversLicenseSt() {
        return (this.driversLicenseSt!= null);
    }

    /**
     * Gets the value of the dummyDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDummyDate() {
        return dummyDate;
    }

    /**
     * Sets the value of the dummyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDummyDate(String value) {
        this.dummyDate = value;
    }

    public boolean isSetDummyDate() {
        return (this.dummyDate!= null);
    }

    /**
     * Gets the value of the emails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailBean }
     * 
     * 
     */
    public List<EmailBean> getEmails() {
        if (emails == null) {
            emails = new ArrayList<EmailBean>();
        }
        return this.emails;
    }

    public boolean isSetEmails() {
        return ((this.emails!= null)&&(!this.emails.isEmpty()));
    }

    public void unsetEmails() {
        this.emails = null;
    }

    /**
     * Gets the value of the ethnic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEthnic() {
        return ethnic;
    }

    /**
     * Sets the value of the ethnic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEthnic(String value) {
        this.ethnic = value;
    }

    public boolean isSetEthnic() {
        return (this.ethnic!= null);
    }

    /**
     * Gets the value of the fatherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherName() {
        return fatherName;
    }

    /**
     * Sets the value of the fatherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherName(String value) {
        this.fatherName = value;
    }

    public boolean isSetFatherName() {
        return (this.fatherName!= null);
    }

    /**
     * Gets the value of the fatherPhoneticCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherPhoneticCode() {
        return fatherPhoneticCode;
    }

    /**
     * Sets the value of the fatherPhoneticCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherPhoneticCode(String value) {
        this.fatherPhoneticCode = value;
    }

    public boolean isSetFatherPhoneticCode() {
        return (this.fatherPhoneticCode!= null);
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    public boolean isSetFirstName() {
        return (this.firstName!= null);
    }

    /**
     * Gets the value of the fnamePhoneticCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFnamePhoneticCode() {
        return fnamePhoneticCode;
    }

    /**
     * Sets the value of the fnamePhoneticCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFnamePhoneticCode(String value) {
        this.fnamePhoneticCode = value;
    }

    public boolean isSetFnamePhoneticCode() {
        return (this.fnamePhoneticCode!= null);
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    public boolean isSetGender() {
        return (this.gender!= null);
    }

    /**
     * Gets the value of the images property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the images property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImagesBean }
     * 
     * 
     */
    public List<ImagesBean> getImages() {
        if (images == null) {
            images = new ArrayList<ImagesBean>();
        }
        return this.images;
    }

    public boolean isSetImages() {
        return ((this.images!= null)&&(!this.images.isEmpty()));
    }

    public void unsetImages() {
        this.images = null;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    public boolean isSetLanguage() {
        return (this.language!= null);
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    public boolean isSetLastName() {
        return (this.lastName!= null);
    }

    /**
     * Gets the value of the lastServiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastServiceDate() {
        return lastServiceDate;
    }

    /**
     * Sets the value of the lastServiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastServiceDate(String value) {
        this.lastServiceDate = value;
    }

    public boolean isSetLastServiceDate() {
        return (this.lastServiceDate!= null);
    }

    /**
     * Gets the value of the lgaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLgaCode() {
        return lgaCode;
    }

    /**
     * Sets the value of the lgaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLgaCode(String value) {
        this.lgaCode = value;
    }

    public boolean isSetLgaCode() {
        return (this.lgaCode!= null);
    }

    /**
     * Gets the value of the lnamePhoneticCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLnamePhoneticCode() {
        return lnamePhoneticCode;
    }

    /**
     * Sets the value of the lnamePhoneticCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLnamePhoneticCode(String value) {
        this.lnamePhoneticCode = value;
    }

    public boolean isSetLnamePhoneticCode() {
        return (this.lnamePhoneticCode!= null);
    }

    /**
     * Gets the value of the mStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMStatus() {
        return mStatus;
    }

    /**
     * Sets the value of the mStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMStatus(String value) {
        this.mStatus = value;
    }

    public boolean isSetMStatus() {
        return (this.mStatus!= null);
    }

    /**
     * Gets the value of the maiden property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaiden() {
        return maiden;
    }

    /**
     * Sets the value of the maiden property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaiden(String value) {
        this.maiden = value;
    }

    public boolean isSetMaiden() {
        return (this.maiden!= null);
    }

    /**
     * Gets the value of the maidenPhoneticCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaidenPhoneticCode() {
        return maidenPhoneticCode;
    }

    /**
     * Sets the value of the maidenPhoneticCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaidenPhoneticCode(String value) {
        this.maidenPhoneticCode = value;
    }

    public boolean isSetMaidenPhoneticCode() {
        return (this.maidenPhoneticCode!= null);
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    public boolean isSetMiddleName() {
        return (this.middleName!= null);
    }

    /**
     * Gets the value of the militaryBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMilitaryBranch() {
        return militaryBranch;
    }

    /**
     * Sets the value of the militaryBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMilitaryBranch(String value) {
        this.militaryBranch = value;
    }

    public boolean isSetMilitaryBranch() {
        return (this.militaryBranch!= null);
    }

    /**
     * Gets the value of the militaryRank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMilitaryRank() {
        return militaryRank;
    }

    /**
     * Sets the value of the militaryRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMilitaryRank(String value) {
        this.militaryRank = value;
    }

    public boolean isSetMilitaryRank() {
        return (this.militaryRank!= null);
    }

    /**
     * Gets the value of the militaryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMilitaryStatus() {
        return militaryStatus;
    }

    /**
     * Sets the value of the militaryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMilitaryStatus(String value) {
        this.militaryStatus = value;
    }

    public boolean isSetMilitaryStatus() {
        return (this.militaryStatus!= null);
    }

    /**
     * Gets the value of the mnamePhoneticCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMnamePhoneticCode() {
        return mnamePhoneticCode;
    }

    /**
     * Sets the value of the mnamePhoneticCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMnamePhoneticCode(String value) {
        this.mnamePhoneticCode = value;
    }

    public boolean isSetMnamePhoneticCode() {
        return (this.mnamePhoneticCode!= null);
    }

    /**
     * Gets the value of the motherMN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherMN() {
        return motherMN;
    }

    /**
     * Sets the value of the motherMN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherMN(String value) {
        this.motherMN = value;
    }

    public boolean isSetMotherMN() {
        return (this.motherMN!= null);
    }

    /**
     * Gets the value of the motherMNPhoneticCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherMNPhoneticCode() {
        return motherMNPhoneticCode;
    }

    /**
     * Sets the value of the motherMNPhoneticCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherMNPhoneticCode(String value) {
        this.motherMNPhoneticCode = value;
    }

    public boolean isSetMotherMNPhoneticCode() {
        return (this.motherMNPhoneticCode!= null);
    }

    /**
     * Gets the value of the motherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherName() {
        return motherName;
    }

    /**
     * Sets the value of the motherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherName(String value) {
        this.motherName = value;
    }

    public boolean isSetMotherName() {
        return (this.motherName!= null);
    }

    /**
     * Gets the value of the motherPhoneticCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherPhoneticCode() {
        return motherPhoneticCode;
    }

    /**
     * Sets the value of the motherPhoneticCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherPhoneticCode(String value) {
        this.motherPhoneticCode = value;
    }

    public boolean isSetMotherPhoneticCode() {
        return (this.motherPhoneticCode!= null);
    }

    /**
     * Gets the value of the multipleBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultipleBirth() {
        return multipleBirth;
    }

    /**
     * Sets the value of the multipleBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultipleBirth(String value) {
        this.multipleBirth = value;
    }

    public boolean isSetMultipleBirth() {
        return (this.multipleBirth!= null);
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    public boolean isSetNationality() {
        return (this.nationality!= null);
    }

    /**
     * Gets the value of the pensionExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPensionExpDate() {
        return pensionExpDate;
    }

    /**
     * Sets the value of the pensionExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPensionExpDate(String value) {
        this.pensionExpDate = value;
    }

    public boolean isSetPensionExpDate() {
        return (this.pensionExpDate!= null);
    }

    /**
     * Gets the value of the pensionNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPensionNo() {
        return pensionNo;
    }

    /**
     * Sets the value of the pensionNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPensionNo(String value) {
        this.pensionNo = value;
    }

    public boolean isSetPensionNo() {
        return (this.pensionNo!= null);
    }

    /**
     * Gets the value of the personCatCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonCatCode() {
        return personCatCode;
    }

    /**
     * Sets the value of the personCatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonCatCode(String value) {
        this.personCatCode = value;
    }

    public boolean isSetPersonCatCode() {
        return (this.personCatCode!= null);
    }

    /**
     * Gets the value of the personId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonId(String value) {
        this.personId = value;
    }

    public boolean isSetPersonId() {
        return (this.personId!= null);
    }

    /**
     * Gets the value of the phones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoneBean }
     * 
     * 
     */
    public List<PhoneBean> getPhones() {
        if (phones == null) {
            phones = new ArrayList<PhoneBean>();
        }
        return this.phones;
    }

    public boolean isSetPhones() {
        return ((this.phones!= null)&&(!this.phones.isEmpty()));
    }

    public void unsetPhones() {
        this.phones = null;
    }

    /**
     * Gets the value of the phoneHistories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phoneHistories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhoneHistories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoneHistoryBean }
     * 
     * 
     */
    public List<PhoneHistoryBean> getPhoneHistories() {
        if (phoneHistories == null) {
            phoneHistories = new ArrayList<PhoneHistoryBean>();
        }
        return this.phoneHistories;
    }

    public boolean isSetPhoneHistories() {
        return ((this.phoneHistories!= null)&&(!this.phoneHistories.isEmpty()));
    }

    public void unsetPhoneHistories() {
        this.phoneHistories = null;
    }

    /**
     * Gets the value of the picture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPicture() {
        return picture;
    }

    /**
     * Sets the value of the picture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPicture(String value) {
        this.picture = value;
    }

    public boolean isSetPicture() {
        return (this.picture!= null);
    }

    /**
     * Gets the value of the pobCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPobCity() {
        return pobCity;
    }

    /**
     * Sets the value of the pobCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPobCity(String value) {
        this.pobCity = value;
    }

    public boolean isSetPobCity() {
        return (this.pobCity!= null);
    }

    /**
     * Gets the value of the pobCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPobCountry() {
        return pobCountry;
    }

    /**
     * Sets the value of the pobCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPobCountry(String value) {
        this.pobCountry = value;
    }

    public boolean isSetPobCountry() {
        return (this.pobCountry!= null);
    }

    /**
     * Gets the value of the pobState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPobState() {
        return pobState;
    }

    /**
     * Sets the value of the pobState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPobState(String value) {
        this.pobState = value;
    }

    public boolean isSetPobState() {
        return (this.pobState!= null);
    }

    /**
     * Gets the value of the prefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of the prefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefix(String value) {
        this.prefix = value;
    }

    public boolean isSetPrefix() {
        return (this.prefix!= null);
    }

    /**
     * Gets the value of the race property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRace() {
        return race;
    }

    /**
     * Sets the value of the race property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRace(String value) {
        this.race = value;
    }

    public boolean isSetRace() {
        return (this.race!= null);
    }

    /**
     * Gets the value of the races property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the races property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRaces().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RacesBean }
     * 
     * 
     */
    public List<RacesBean> getRaces() {
        if (races == null) {
            races = new ArrayList<RacesBean>();
        }
        return this.races;
    }

    public boolean isSetRaces() {
        return ((this.races!= null)&&(!this.races.isEmpty()));
    }

    public void unsetRaces() {
        this.races = null;
    }

    /**
     * Gets the value of the religion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReligion() {
        return religion;
    }

    /**
     * Sets the value of the religion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReligion(String value) {
        this.religion = value;
    }

    public boolean isSetReligion() {
        return (this.religion!= null);
    }

    /**
     * Gets the value of the repatriationNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepatriationNo() {
        return repatriationNo;
    }

    /**
     * Sets the value of the repatriationNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepatriationNo(String value) {
        this.repatriationNo = value;
    }

    public boolean isSetRepatriationNo() {
        return (this.repatriationNo!= null);
    }

    /**
     * Gets the value of the ssn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSN() {
        return ssn;
    }

    /**
     * Sets the value of the ssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSN(String value) {
        this.ssn = value;
    }

    public boolean isSetSSN() {
        return (this.ssn!= null);
    }

    /**
     * Gets the value of the ssn4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSN4() {
        return ssn4;
    }

    /**
     * Sets the value of the ssn4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSN4(String value) {
        this.ssn4 = value;
    }

    public boolean isSetSSN4() {
        return (this.ssn4 != null);
    }

    /**
     * Gets the value of the spouseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseName() {
        return spouseName;
    }

    /**
     * Sets the value of the spouseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseName(String value) {
        this.spouseName = value;
    }

    public boolean isSetSpouseName() {
        return (this.spouseName!= null);
    }

    /**
     * Gets the value of the spousePhoneticCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpousePhoneticCode() {
        return spousePhoneticCode;
    }

    /**
     * Sets the value of the spousePhoneticCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpousePhoneticCode(String value) {
        this.spousePhoneticCode = value;
    }

    public boolean isSetSpousePhoneticCode() {
        return (this.spousePhoneticCode!= null);
    }

    /**
     * Gets the value of the stdFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStdFirstName() {
        return stdFirstName;
    }

    /**
     * Sets the value of the stdFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStdFirstName(String value) {
        this.stdFirstName = value;
    }

    public boolean isSetStdFirstName() {
        return (this.stdFirstName!= null);
    }

    /**
     * Gets the value of the stdLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStdLastName() {
        return stdLastName;
    }

    /**
     * Sets the value of the stdLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStdLastName(String value) {
        this.stdLastName = value;
    }

    public boolean isSetStdLastName() {
        return (this.stdLastName!= null);
    }

    /**
     * Gets the value of the stdMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStdMiddleName() {
        return stdMiddleName;
    }

    /**
     * Sets the value of the stdMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStdMiddleName(String value) {
        this.stdMiddleName = value;
    }

    public boolean isSetStdMiddleName() {
        return (this.stdMiddleName!= null);
    }

    /**
     * Gets the value of the string1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString1() {
        return string1;
    }

    /**
     * Sets the value of the string1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString1(String value) {
        this.string1 = value;
    }

    public boolean isSetString1() {
        return (this.string1 != null);
    }

    /**
     * Gets the value of the string10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString10() {
        return string10;
    }

    /**
     * Sets the value of the string10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString10(String value) {
        this.string10 = value;
    }

    public boolean isSetString10() {
        return (this.string10 != null);
    }

    /**
     * Gets the value of the string2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString2() {
        return string2;
    }

    /**
     * Sets the value of the string2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString2(String value) {
        this.string2 = value;
    }

    public boolean isSetString2() {
        return (this.string2 != null);
    }

    /**
     * Gets the value of the string3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString3() {
        return string3;
    }

    /**
     * Sets the value of the string3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString3(String value) {
        this.string3 = value;
    }

    public boolean isSetString3() {
        return (this.string3 != null);
    }

    /**
     * Gets the value of the string4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString4() {
        return string4;
    }

    /**
     * Sets the value of the string4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString4(String value) {
        this.string4 = value;
    }

    public boolean isSetString4() {
        return (this.string4 != null);
    }

    /**
     * Gets the value of the string5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString5() {
        return string5;
    }

    /**
     * Sets the value of the string5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString5(String value) {
        this.string5 = value;
    }

    public boolean isSetString5() {
        return (this.string5 != null);
    }

    /**
     * Gets the value of the string6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString6() {
        return string6;
    }

    /**
     * Sets the value of the string6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString6(String value) {
        this.string6 = value;
    }

    public boolean isSetString6() {
        return (this.string6 != null);
    }

    /**
     * Gets the value of the string7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString7() {
        return string7;
    }

    /**
     * Sets the value of the string7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString7(String value) {
        this.string7 = value;
    }

    public boolean isSetString7() {
        return (this.string7 != null);
    }

    /**
     * Gets the value of the string8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString8() {
        return string8;
    }

    /**
     * Sets the value of the string8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString8(String value) {
        this.string8 = value;
    }

    public boolean isSetString8() {
        return (this.string8 != null);
    }

    /**
     * Gets the value of the string9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString9() {
        return string9;
    }

    /**
     * Sets the value of the string9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString9(String value) {
        this.string9 = value;
    }

    public boolean isSetString9() {
        return (this.string9 != null);
    }

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffix(String value) {
        this.suffix = value;
    }

    public boolean isSetSuffix() {
        return (this.suffix!= null);
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    public boolean isSetTitle() {
        return (this.title!= null);
    }

    /**
     * Gets the value of the vipFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIPFlag() {
        return vipFlag;
    }

    /**
     * Sets the value of the vipFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIPFlag(String value) {
        this.vipFlag = value;
    }

    public boolean isSetVIPFlag() {
        return (this.vipFlag!= null);
    }

    /**
     * Gets the value of the vetStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVetStatus() {
        return vetStatus;
    }

    /**
     * Sets the value of the vetStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVetStatus(String value) {
        this.vetStatus = value;
    }

    public boolean isSetVetStatus() {
        return (this.vetStatus!= null);
    }

}
