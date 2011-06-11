
package com.force.sdk.streaming.model;

import javax.persistence.*;

/**
 * Java model for the Force.com Account object.
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
@Table(name="Account")
@Entity(name="Account")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class Account extends com.force.sdk.jpa.model.BaseForceStandardObject {

    public static final String KEY_PREFIX = "001";


    protected boolean isDeleted;
    protected Account masterRecord;
    protected String type;
    protected Account parent;
    protected String billingStreet;
    protected String billingCity;
    protected String billingState;
    protected String billingPostalCode;
    protected String billingCountry;
    protected String shippingStreet;
    protected String shippingCity;
    protected String shippingState;
    protected String shippingPostalCode;
    protected String shippingCountry;
    protected String phone;
    protected String fax;
    protected String accountNumber;
    protected java.net.URL website;
    protected String sic;
    protected String industry;
    protected java.math.BigDecimal annualRevenue;
    protected int numberOfEmployees;
    protected String ownership;
    protected String tickerSymbol;
    protected String description;
    protected String rating;
    protected String site;
    protected User createdBy;
    protected User lastModifiedBy;
    protected java.util.Date lastActivityDate;
    protected String jigsaw;
    protected String customerPriority;
    protected String sLA;
    protected String active;
    protected double numberofLocations;
    protected String upsellOpportunity;
    protected String sLASerialNumber;
    protected java.util.Date sLAExpirationDate;
    protected String foo;
    

    public boolean getIsDeleted() {
        return this.isDeleted;
    }
    
    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="MasterRecordId")
    public Account getMasterRecord() {
        return this.masterRecord;
    }
    
    public void setMasterRecord(Account masterRecord) {
        this.masterRecord = masterRecord;
    }
    
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="ParentId")
    public Account getParent() {
        return this.parent;
    }
    
    public void setParent(Account parent) {
        this.parent = parent;
    }
    
    public String getBillingStreet() {
        return this.billingStreet;
    }
    
    public void setBillingStreet(String billingStreet) {
        this.billingStreet = billingStreet;
    }
    
    public String getBillingCity() {
        return this.billingCity;
    }
    
    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }
    
    public String getBillingState() {
        return this.billingState;
    }
    
    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }
    
    public String getBillingPostalCode() {
        return this.billingPostalCode;
    }
    
    public void setBillingPostalCode(String billingPostalCode) {
        this.billingPostalCode = billingPostalCode;
    }
    
    public String getBillingCountry() {
        return this.billingCountry;
    }
    
    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }
    
    public String getShippingStreet() {
        return this.shippingStreet;
    }
    
    public void setShippingStreet(String shippingStreet) {
        this.shippingStreet = shippingStreet;
    }
    
    public String getShippingCity() {
        return this.shippingCity;
    }
    
    public void setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity;
    }
    
    public String getShippingState() {
        return this.shippingState;
    }
    
    public void setShippingState(String shippingState) {
        this.shippingState = shippingState;
    }
    
    public String getShippingPostalCode() {
        return this.shippingPostalCode;
    }
    
    public void setShippingPostalCode(String shippingPostalCode) {
        this.shippingPostalCode = shippingPostalCode;
    }
    
    public String getShippingCountry() {
        return this.shippingCountry;
    }
    
    public void setShippingCountry(String shippingCountry) {
        this.shippingCountry = shippingCountry;
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
    
    public String getAccountNumber() {
        return this.accountNumber;
    }
    
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    @Basic
    public java.net.URL getWebsite() {
        return this.website;
    }
    
    public void setWebsite(java.net.URL website) {
        this.website = website;
    }
    
    public String getSic() {
        return this.sic;
    }
    
    public void setSic(String sic) {
        this.sic = sic;
    }
    
    public String getIndustry() {
        return this.industry;
    }
    
    public void setIndustry(String industry) {
        this.industry = industry;
    }
    
    public java.math.BigDecimal getAnnualRevenue() {
        return this.annualRevenue;
    }
    
    public void setAnnualRevenue(java.math.BigDecimal annualRevenue) {
        this.annualRevenue = annualRevenue;
    }
    
    public int getNumberOfEmployees() {
        return this.numberOfEmployees;
    }
    
    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
    
    public String getOwnership() {
        return this.ownership;
    }
    
    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }
    
    public String getTickerSymbol() {
        return this.tickerSymbol;
    }
    
    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getRating() {
        return this.rating;
    }
    
    public void setRating(String rating) {
        this.rating = rating;
    }
    
    public String getSite() {
        return this.site;
    }
    
    public void setSite(String site) {
        this.site = site;
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
    
    public String getJigsaw() {
        return this.jigsaw;
    }
    
    public void setJigsaw(String jigsaw) {
        this.jigsaw = jigsaw;
    }
    
    @Column(name="CustomerPriority__c")
    public String getCustomerPriority() {
        return this.customerPriority;
    }
    
    public void setCustomerPriority(String customerPriority) {
        this.customerPriority = customerPriority;
    }
    
    @Column(name="SLA__c")
    public String getSLA() {
        return this.sLA;
    }
    
    public void setSLA(String sLA) {
        this.sLA = sLA;
    }
    
    @Column(name="Active__c")
    public String getActive() {
        return this.active;
    }
    
    public void setActive(String active) {
        this.active = active;
    }
    
    @Column(name="NumberofLocations__c")
    public double getNumberofLocations() {
        return this.numberofLocations;
    }
    
    public void setNumberofLocations(double numberofLocations) {
        this.numberofLocations = numberofLocations;
    }
    
    @Column(name="UpsellOpportunity__c")
    public String getUpsellOpportunity() {
        return this.upsellOpportunity;
    }
    
    public void setUpsellOpportunity(String upsellOpportunity) {
        this.upsellOpportunity = upsellOpportunity;
    }
    
    @Column(name="SLASerialNumber__c")
    public String getSLASerialNumber() {
        return this.sLASerialNumber;
    }
    
    public void setSLASerialNumber(String sLASerialNumber) {
        this.sLASerialNumber = sLASerialNumber;
    }
    
    @Column(name="SLAExpirationDate__c")
    public java.util.Date getSLAExpirationDate() {
        return this.sLAExpirationDate;
    }
    
    public void setSLAExpirationDate(java.util.Date sLAExpirationDate) {
        this.sLAExpirationDate = sLAExpirationDate;
    }
    
    @Column(name="foo__c")
    public String getFoo() {
        return this.foo;
    }
    
    public void setFoo(String foo) {
        this.foo = foo;
    }
    
    

    /**
     * Java model for the Type picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum TypeEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        PROSPECT(true,false,"Prospect","Prospect"),
        CUSTOMER___DIRECT(true,false,"Customer - Direct","Customer - Direct"),
        CUSTOMER___CHANNEL(true,false,"Customer - Channel","Customer - Channel"),
        CHANNEL_PARTNER___RESELLER(true,false,"Channel Partner / Reseller","Channel Partner / Reseller"),
        INSTALLATION_PARTNER(true,false,"Installation Partner","Installation Partner"),
        TECHNOLOGY_PARTNER(true,false,"Technology Partner","Technology Partner"),
        OTHER(true,false,"Other","Other"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private TypeEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
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

        public static TypeEnum fromValue(String value) {
            if (value == null) return null;

            for (TypeEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    

    /**
     * Java model for the Industry picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum IndustryEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        AGRICULTURE(true,false,"Agriculture","Agriculture"),
        APPAREL(true,false,"Apparel","Apparel"),
        BANKING(true,false,"Banking","Banking"),
        BIOTECHNOLOGY(true,false,"Biotechnology","Biotechnology"),
        CHEMICALS(true,false,"Chemicals","Chemicals"),
        COMMUNICATIONS(true,false,"Communications","Communications"),
        CONSTRUCTION(true,false,"Construction","Construction"),
        CONSULTING(true,false,"Consulting","Consulting"),
        EDUCATION(true,false,"Education","Education"),
        ELECTRONICS(true,false,"Electronics","Electronics"),
        ENERGY(true,false,"Energy","Energy"),
        ENGINEERING(true,false,"Engineering","Engineering"),
        ENTERTAINMENT(true,false,"Entertainment","Entertainment"),
        ENVIRONMENTAL(true,false,"Environmental","Environmental"),
        FINANCE(true,false,"Finance","Finance"),
        FOOD___BEVERAGE(true,false,"Food & Beverage","Food & Beverage"),
        GOVERNMENT(true,false,"Government","Government"),
        HEALTHCARE(true,false,"Healthcare","Healthcare"),
        HOSPITALITY(true,false,"Hospitality","Hospitality"),
        INSURANCE(true,false,"Insurance","Insurance"),
        MACHINERY(true,false,"Machinery","Machinery"),
        MANUFACTURING(true,false,"Manufacturing","Manufacturing"),
        MEDIA(true,false,"Media","Media"),
        NOT_FOR_PROFIT(true,false,"Not For Profit","Not For Profit"),
        RECREATION(true,false,"Recreation","Recreation"),
        RETAIL(true,false,"Retail","Retail"),
        SHIPPING(true,false,"Shipping","Shipping"),
        TECHNOLOGY(true,false,"Technology","Technology"),
        TELECOMMUNICATIONS(true,false,"Telecommunications","Telecommunications"),
        TRANSPORTATION(true,false,"Transportation","Transportation"),
        UTILITIES(true,false,"Utilities","Utilities"),
        OTHER(true,false,"Other","Other"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private IndustryEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
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

        public static IndustryEnum fromValue(String value) {
            if (value == null) return null;

            for (IndustryEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    

    /**
     * Java model for the Ownership picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum OwnershipEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        PUBLIC(true,false,"Public","Public"),
        PRIVATE(true,false,"Private","Private"),
        SUBSIDIARY(true,false,"Subsidiary","Subsidiary"),
        OTHER(true,false,"Other","Other"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private OwnershipEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
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

        public static OwnershipEnum fromValue(String value) {
            if (value == null) return null;

            for (OwnershipEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    

    /**
     * Java model for the Rating picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum RatingEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        HOT(true,false,"Hot","Hot"),
        WARM(true,false,"Warm","Warm"),
        COLD(true,false,"Cold","Cold"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private RatingEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
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

        public static RatingEnum fromValue(String value) {
            if (value == null) return null;

            for (RatingEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    

    /**
     * Java model for the CustomerPriority__c picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum CustomerPriorityEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        HIGH(true,false,"High","High"),
        LOW(true,false,"Low","Low"),
        MEDIUM(true,false,"Medium","Medium"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private CustomerPriorityEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
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

        public static CustomerPriorityEnum fromValue(String value) {
            if (value == null) return null;

            for (CustomerPriorityEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    

    /**
     * Java model for the SLA__c picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum SLAEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        GOLD(true,false,"Gold","Gold"),
        SILVER(true,false,"Silver","Silver"),
        PLATINUM(true,false,"Platinum","Platinum"),
        BRONZE(true,false,"Bronze","Bronze"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private SLAEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
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

        public static SLAEnum fromValue(String value) {
            if (value == null) return null;

            for (SLAEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    

    /**
     * Java model for the Active__c picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum ActiveEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        NO(true,false,"No","No"),
        YES(true,false,"Yes","Yes"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private ActiveEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
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

        public static ActiveEnum fromValue(String value) {
            if (value == null) return null;

            for (ActiveEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    

    /**
     * Java model for the UpsellOpportunity__c picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum UpsellOpportunityEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        MAYBE(true,false,"Maybe","Maybe"),
        NO(true,false,"No","No"),
        YES(true,false,"Yes","Yes"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private UpsellOpportunityEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
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

        public static UpsellOpportunityEnum fromValue(String value) {
            if (value == null) return null;

            for (UpsellOpportunityEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    

}