
package com.force.sdk.streaming.model;

import javax.persistence.*;

/**
 * Java model for the Force.com Contact object.
 *
 * For this class, the following operations are available
 * via Force.com JPA:
 *
 *     Create : true
 *     Read   : true
 *     Update : true
 *     Delete : true
 *
 * This class was auto-generated. It is considered owned
 * by the Force.com database.
 *
 * @author Naaman Newbold (nnewbold@salesforce.com)
 **/
@javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
@Table(name="Contact")
@Entity(name="Contact")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class Contact extends com.force.sdk.jpa.model.BaseForceStandardObject {

    public static final String KEY_PREFIX = "003";


    protected boolean isDeleted;
    protected Contact masterRecord;
    protected Account account;
    protected String lastName;
    protected String firstName;
    protected String salutation;
    protected String otherStreet;
    protected String otherCity;
    protected String otherState;
    protected String otherPostalCode;
    protected String otherCountry;
    protected String mailingStreet;
    protected String mailingCity;
    protected String mailingState;
    protected String mailingPostalCode;
    protected String mailingCountry;
    protected String phone;
    protected String fax;
    protected String mobilePhone;
    protected String homePhone;
    protected String otherPhone;
    protected String assistantPhone;
    protected Contact reportsTo;
    protected String email;
    protected String title;
    protected String department;
    protected String assistantName;
    protected String leadSource;
    protected java.util.Date birthdate;
    protected String description;
    protected User createdBy;
    protected User lastModifiedBy;
    protected java.util.Date lastActivityDate;
    protected java.util.Calendar lastCURequestDate;
    protected java.util.Calendar lastCUUpdateDate;
    protected String emailBouncedReason;
    protected java.util.Calendar emailBouncedDate;
    protected String jigsaw;
    protected String level;
    protected String languages;
    

    public boolean getIsDeleted() {
        return this.isDeleted;
    }
    
    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="MasterRecordId")
    public Contact getMasterRecord() {
        return this.masterRecord;
    }
    
    public void setMasterRecord(Contact masterRecord) {
        this.masterRecord = masterRecord;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="AccountId")
    public Account getAccount() {
        return this.account;
    }
    
    public void setAccount(Account account) {
        this.account = account;
    }
    
    public String getLastName() {
        return this.lastName;
    }
    
    @Basic(optional=false)
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getSalutation() {
        return this.salutation;
    }
    
    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }
    
    public String getOtherStreet() {
        return this.otherStreet;
    }
    
    public void setOtherStreet(String otherStreet) {
        this.otherStreet = otherStreet;
    }
    
    public String getOtherCity() {
        return this.otherCity;
    }
    
    public void setOtherCity(String otherCity) {
        this.otherCity = otherCity;
    }
    
    public String getOtherState() {
        return this.otherState;
    }
    
    public void setOtherState(String otherState) {
        this.otherState = otherState;
    }
    
    public String getOtherPostalCode() {
        return this.otherPostalCode;
    }
    
    public void setOtherPostalCode(String otherPostalCode) {
        this.otherPostalCode = otherPostalCode;
    }
    
    public String getOtherCountry() {
        return this.otherCountry;
    }
    
    public void setOtherCountry(String otherCountry) {
        this.otherCountry = otherCountry;
    }
    
    public String getMailingStreet() {
        return this.mailingStreet;
    }
    
    public void setMailingStreet(String mailingStreet) {
        this.mailingStreet = mailingStreet;
    }
    
    public String getMailingCity() {
        return this.mailingCity;
    }
    
    public void setMailingCity(String mailingCity) {
        this.mailingCity = mailingCity;
    }
    
    public String getMailingState() {
        return this.mailingState;
    }
    
    public void setMailingState(String mailingState) {
        this.mailingState = mailingState;
    }
    
    public String getMailingPostalCode() {
        return this.mailingPostalCode;
    }
    
    public void setMailingPostalCode(String mailingPostalCode) {
        this.mailingPostalCode = mailingPostalCode;
    }
    
    public String getMailingCountry() {
        return this.mailingCountry;
    }
    
    public void setMailingCountry(String mailingCountry) {
        this.mailingCountry = mailingCountry;
    }
    
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getFax() {
        return this.fax;
    }
    
    public void setFax(String fax) {
        this.fax = fax;
    }
    
    public String getMobilePhone() {
        return this.mobilePhone;
    }
    
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
    
    public String getHomePhone() {
        return this.homePhone;
    }
    
    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }
    
    public String getOtherPhone() {
        return this.otherPhone;
    }
    
    public void setOtherPhone(String otherPhone) {
        this.otherPhone = otherPhone;
    }
    
    public String getAssistantPhone() {
        return this.assistantPhone;
    }
    
    public void setAssistantPhone(String assistantPhone) {
        this.assistantPhone = assistantPhone;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="ReportsToId")
    public Contact getReportsTo() {
        return this.reportsTo;
    }
    
    public void setReportsTo(Contact reportsTo) {
        this.reportsTo = reportsTo;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getDepartment() {
        return this.department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
    
    public String getAssistantName() {
        return this.assistantName;
    }
    
    public void setAssistantName(String assistantName) {
        this.assistantName = assistantName;
    }
    
    public String getLeadSource() {
        return this.leadSource;
    }
    
    public void setLeadSource(String leadSource) {
        this.leadSource = leadSource;
    }
    
    public java.util.Date getBirthdate() {
        return this.birthdate;
    }
    
    public void setBirthdate(java.util.Date birthdate) {
        this.birthdate = birthdate;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="CreatedById")
    public User getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="LastModifiedById")
    public User getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    
    public void setLastModifiedBy(User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }
    
    public java.util.Date getLastActivityDate() {
        return this.lastActivityDate;
    }
    
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }
    
    public java.util.Calendar getLastCURequestDate() {
        return this.lastCURequestDate;
    }
    
    public void setLastCURequestDate(java.util.Calendar lastCURequestDate) {
        this.lastCURequestDate = lastCURequestDate;
    }
    
    public java.util.Calendar getLastCUUpdateDate() {
        return this.lastCUUpdateDate;
    }
    
    public void setLastCUUpdateDate(java.util.Calendar lastCUUpdateDate) {
        this.lastCUUpdateDate = lastCUUpdateDate;
    }
    
    public String getEmailBouncedReason() {
        return this.emailBouncedReason;
    }
    
    public void setEmailBouncedReason(String emailBouncedReason) {
        this.emailBouncedReason = emailBouncedReason;
    }
    
    public java.util.Calendar getEmailBouncedDate() {
        return this.emailBouncedDate;
    }
    
    public void setEmailBouncedDate(java.util.Calendar emailBouncedDate) {
        this.emailBouncedDate = emailBouncedDate;
    }
    
    public String getJigsaw() {
        return this.jigsaw;
    }
    
    public void setJigsaw(String jigsaw) {
        this.jigsaw = jigsaw;
    }
    
    @Column(name="Level__c")
    public String getLevel() {
        return this.level;
    }
    
    public void setLevel(String level) {
        this.level = level;
    }
    
    @Column(name="Languages__c")
    public String getLanguages() {
        return this.languages;
    }
    
    public void setLanguages(String languages) {
        this.languages = languages;
    }
    
    

    /**
     * Java model for the Salutation picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum SalutationEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        MR_(true,false,"Mr.","Mr."),
        MS_(true,false,"Ms.","Ms."),
        MRS_(true,false,"Mrs.","Mrs."),
        DR_(true,false,"Dr.","Dr."),
        PROF_(true,false,"Prof.","Prof."),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private SalutationEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
            this.isActive = isActive;
            this.isDefaultValue = isDefaultValue;
            this.label = label;
            this.value = value;
        }

        @Override
        public boolean isActive() { return this.isActive; }

        @Override
        public boolean isDefaultValue() { return this.isDefaultValue; }

        @Override
        public String label() { return this.label; }

        @Override
        public String value() { return this.value; }

        public static SalutationEnum fromValue(String value) {
            if (value == null) return null;

            for (SalutationEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    

    /**
     * Java model for the LeadSource picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum LeadSourceEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        WEB(true,false,"Web","Web"),
        PHONE_INQUIRY(true,false,"Phone Inquiry","Phone Inquiry"),
        PARTNER_REFERRAL(true,false,"Partner Referral","Partner Referral"),
        PURCHASED_LIST(true,false,"Purchased List","Purchased List"),
        OTHER(true,false,"Other","Other"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private LeadSourceEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
            this.isActive = isActive;
            this.isDefaultValue = isDefaultValue;
            this.label = label;
            this.value = value;
        }

        @Override
        public boolean isActive() { return this.isActive; }

        @Override
        public boolean isDefaultValue() { return this.isDefaultValue; }

        @Override
        public String label() { return this.label; }

        @Override
        public String value() { return this.value; }

        public static LeadSourceEnum fromValue(String value) {
            if (value == null) return null;

            for (LeadSourceEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    

    /**
     * Java model for the Level__c picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum LevelEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        SECONDARY(true,false,"Secondary","Secondary"),
        TERTIARY(true,false,"Tertiary","Tertiary"),
        PRIMARY(true,false,"Primary","Primary"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private LevelEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
            this.isActive = isActive;
            this.isDefaultValue = isDefaultValue;
            this.label = label;
            this.value = value;
        }

        @Override
        public boolean isActive() { return this.isActive; }

        @Override
        public boolean isDefaultValue() { return this.isDefaultValue; }

        @Override
        public String label() { return this.label; }

        @Override
        public String value() { return this.value; }

        public static LevelEnum fromValue(String value) {
            if (value == null) return null;

            for (LevelEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    

}