
package com.force.sdk.streaming.model;

import javax.persistence.*;

/**
 * Java model for the Force.com Group object.
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
@Table(name="Group")
@Entity(name="Group")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class Group extends com.force.sdk.jpa.model.BaseForceStandardObject {

    public static final String KEY_PREFIX = "00G";


    protected UserRole relatedId;
    protected TypeEnum type;
    protected String email;
    protected boolean doesSendEmailToMembers;
    protected boolean doesIncludeBosses;
    protected User createdBy;
    protected User lastModifiedBy;
    

    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    public UserRole getRelatedId() {
        return this.relatedId;
    }
    
    public void setRelatedId(UserRole relatedId) {
        this.relatedId = relatedId;
    }
    
    @Enumerated(value=EnumType.STRING)
    public TypeEnum getType() {
        return this.type;
    }
    
    @Basic(optional=false)
    public void setType(TypeEnum type) {
        this.type = type;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public boolean getDoesSendEmailToMembers() {
        return this.doesSendEmailToMembers;
    }
    
    public void setDoesSendEmailToMembers(boolean doesSendEmailToMembers) {
        this.doesSendEmailToMembers = doesSendEmailToMembers;
    }
    
    public boolean getDoesIncludeBosses() {
        return this.doesIncludeBosses;
    }
    
    public void setDoesIncludeBosses(boolean doesIncludeBosses) {
        this.doesIncludeBosses = doesIncludeBosses;
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
    
    

    /**
     * Java model for the Type picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum TypeEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        ALLCUSTOMERPORTAL(true,false,null,"AllCustomerPortal"),
        COLLABORATION(true,false,null,"Collaboration"),
        ORGANIZATION(true,false,null,"Organization"),
        PRMORGANIZATION(true,false,null,"PRMOrganization"),
        QUEUE(true,false,null,"Queue"),
        REGULAR(true,false,null,"Regular"),
        ROLE(true,false,null,"Role"),
        ROLEANDSUBORDINATES(true,false,null,"RoleAndSubordinates"),
        ROLEANDSUBORDINATESINTERNAL(true,false,null,"RoleAndSubordinatesInternal"),
        SHARINGRULEGROUP(true,false,null,"SharingRuleGroup"),
        TERRITORY(true,false,null,"Territory"),
        TERRITORYANDSUBORDINATES(true,false,null,"TerritoryAndSubordinates"),
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
    

}