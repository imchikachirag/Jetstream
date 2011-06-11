
package com.force.sdk.streaming.model;

import javax.persistence.*;

/**
 * Java model for the Force.com CallCenter object.
 *
 * For this class, the following operations are available
 * via Force.com JPA:
 *
 *     Create : true
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
@Table(name="CallCenter")
@Entity(name="CallCenter")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class CallCenter extends com.force.sdk.jpa.model.BaseForceObject {

    public static final String KEY_PREFIX = "04v";


    protected String name;
    protected String internalName;
    protected double version;
    protected java.util.Calendar systemModstamp;
    protected java.util.Calendar createdDate;
    protected User createdBy;
    protected java.util.Calendar lastModifiedDate;
    protected User lastModifiedBy;
    

    public String getName() {
        return this.name;
    }
    
    @Basic(optional=false)
    public void setName(String name) {
        this.name = name;
    }
    
    public String getInternalName() {
        return this.internalName;
    }
    
    @Basic(optional=false)
    public void setInternalName(String internalName) {
        this.internalName = internalName;
    }
    
    public double getVersion() {
        return this.version;
    }
    
    public void setVersion(double version) {
        this.version = version;
    }
    
    public java.util.Calendar getSystemModstamp() {
        return this.systemModstamp;
    }
    
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }
    
    public java.util.Calendar getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
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
    
    @Version
    public java.util.Calendar getLastModifiedDate() {
        return this.lastModifiedDate;
    }
    
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
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
    
    
}