package com.force.sdk.streaming.model;

import javax.persistence.*;

/**
 * Java com.force.sdk.streaming.model for the Force.com UserLicense object.
 *
 * For this class, the following operations are available
 * via Force.com JPA:
 *
 *     Create : false
 *     Read   : true
 *     Update : false
 *     Delete : false
 *
 * This class was auto-generated. It is considered owned
 * by the Force.com database.
 *
 * @author Naaman Newbold (nnewbold@salesforce.com)
 **/
@javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
@Table(name="UserLicense")
@Entity(name="UserLicense")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class UserLicense extends com.force.sdk.jpa.model.BaseForceObject {

    public static final String KEY_PREFIX = "100";


    protected String licenseDefinitionKey;
    protected String name;
    protected java.util.Calendar systemModstamp;
    

    public String getLicenseDefinitionKey() {
        return this.licenseDefinitionKey;
    }
    
    @Basic(optional=false)
    public void setLicenseDefinitionKey(String licenseDefinitionKey) {
        this.licenseDefinitionKey = licenseDefinitionKey;
    }
    
    public String getName() {
        return this.name;
    }
    
    @Basic(optional=false)
    public void setName(String name) {
        this.name = name;
    }
    
    public java.util.Calendar getSystemModstamp() {
        return this.systemModstamp;
    }
    
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }
    
    
}