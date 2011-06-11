
package com.force.sdk.streaming.model;

import javax.persistence.*;

/**
 * Java model for the Force.com Profile object.
 *
 * For this class, the following operations are available
 * via Force.com JPA:
 *
 *     Create : false
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
@Table(name="Profile")
@Entity(name="Profile")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class Profile extends com.force.sdk.jpa.model.BaseForceObject {

    public static final String KEY_PREFIX = "00e";


    protected String name;
    protected boolean permissionsEditTask;
    protected boolean permissionsEditEvent;
    protected boolean permissionsManageUsers;
    protected boolean permissionsModifyAllData;
    protected boolean permissionsManageCases;
    protected boolean permissionsMassInlineEdit;
    protected boolean permissionsManageSolutions;
    protected boolean permissionsCustomizeApplication;
    protected boolean permissionsEditReadonlyFields;
    protected boolean permissionsRunReports;
    protected boolean permissionsViewSetup;
    protected boolean permissionsTransferAnyEntity;
    protected boolean permissionsNewReportBuilder;
    protected boolean permissionsManageSelfService;
    protected boolean permissionsManageCssUsers;
    protected boolean permissionsImportLeads;
    protected boolean permissionsManageLeads;
    protected boolean permissionsTransferAnyLead;
    protected boolean permissionsViewAllData;
    protected boolean permissionsEditPublicDocuments;
    protected boolean permissionsManageDashboards;
    protected boolean permissionsSendSitRequests;
    protected boolean permissionsApiUserOnly;
    protected boolean permissionsManageRemoteAccess;
    protected boolean permissionsCanUseNewDashboardBuilder;
    protected boolean permissionsManageCategories;
    protected boolean permissionsConvertLeads;
    protected boolean permissionsPasswordNeverExpires;
    protected boolean permissionsUseTeamReassignWizards;
    protected boolean permissionsInstallMultiforce;
    protected boolean permissionsPublishMultiforce;
    protected boolean permissionsEditOppLineItemUnitPrice;
    protected boolean permissionsCreateMultiforce;
    protected boolean permissionsBulkApiHardDelete;
    protected boolean permissionsInboundMigrationToolsUser;
    protected boolean permissionsSolutionImport;
    protected boolean permissionsManageCallCenters;
    protected boolean permissionsEditReports;
    protected boolean permissionsOutboundMigrationToolsUser;
    protected boolean permissionsManageEmailClientConfig;
    protected boolean permissionsEnableNotifications;
    protected boolean permissionsManageDataIntegrations;
    protected boolean permissionsDistributeFromPersWksp;
    protected boolean permissionsViewDataCategories;
    protected boolean permissionsManageDataCategories;
    protected boolean permissionsAuthorApex;
    protected boolean permissionsManageMobile;
    protected boolean permissionsApiEnabled;
    protected boolean permissionsManageCustomReportTypes;
    protected boolean permissionsEditCaseComments;
    protected boolean permissionsTransferAnyCase;
    protected boolean permissionsScheduleJob;
    protected boolean permissionsManageAnalyticSnapshots;
    protected boolean permissionsScheduleReports;
    protected boolean permissionsManageBusinessHourHolidays;
    protected boolean permissionsCustomSidebarOnAllPages;
    protected boolean permissionsViewMyTeamsDashboards;
    protected boolean permissionsResetPasswords;
    protected boolean permissionsFlowUFLRequired;
    protected boolean permissionsCanInsertFeedSystemFields;
    protected boolean permissionsEmailTemplateManagement;
    protected boolean permissionsEmailAdministration;
    protected UserLicense userLicense;
    protected UserTypeEnum userType;
    protected java.util.Calendar createdDate;
    protected User createdBy;
    protected java.util.Calendar lastModifiedDate;
    protected User lastModifiedBy;
    protected java.util.Calendar systemModstamp;
    protected String description;
    

    public String getName() {
        return this.name;
    }
    
    @Basic(optional=false)
    public void setName(String name) {
        this.name = name;
    }
    
    public boolean getPermissionsEditTask() {
        return this.permissionsEditTask;
    }
    
    @Basic(optional=false)
    public void setPermissionsEditTask(boolean permissionsEditTask) {
        this.permissionsEditTask = permissionsEditTask;
    }
    
    public boolean getPermissionsEditEvent() {
        return this.permissionsEditEvent;
    }
    
    @Basic(optional=false)
    public void setPermissionsEditEvent(boolean permissionsEditEvent) {
        this.permissionsEditEvent = permissionsEditEvent;
    }
    
    public boolean getPermissionsManageUsers() {
        return this.permissionsManageUsers;
    }
    
    @Basic(optional=false)
    public void setPermissionsManageUsers(boolean permissionsManageUsers) {
        this.permissionsManageUsers = permissionsManageUsers;
    }
    
    public boolean getPermissionsModifyAllData() {
        return this.permissionsModifyAllData;
    }
    
    @Basic(optional=false)
    public void setPermissionsModifyAllData(boolean permissionsModifyAllData) {
        this.permissionsModifyAllData = permissionsModifyAllData;
    }
    
    public boolean getPermissionsManageCases() {
        return this.permissionsManageCases;
    }
    
    @Basic(optional=false)
    public void setPermissionsManageCases(boolean permissionsManageCases) {
        this.permissionsManageCases = permissionsManageCases;
    }
    
    public boolean getPermissionsMassInlineEdit() {
        return this.permissionsMassInlineEdit;
    }
    
    @Basic(optional=false)
    public void setPermissionsMassInlineEdit(boolean permissionsMassInlineEdit) {
        this.permissionsMassInlineEdit = permissionsMassInlineEdit;
    }
    
    public boolean getPermissionsManageSolutions() {
        return this.permissionsManageSolutions;
    }
    
    @Basic(optional=false)
    public void setPermissionsManageSolutions(boolean permissionsManageSolutions) {
        this.permissionsManageSolutions = permissionsManageSolutions;
    }
    
    public boolean getPermissionsCustomizeApplication() {
        return this.permissionsCustomizeApplication;
    }
    
    @Basic(optional=false)
    public void setPermissionsCustomizeApplication(boolean permissionsCustomizeApplication) {
        this.permissionsCustomizeApplication = permissionsCustomizeApplication;
    }
    
    public boolean getPermissionsEditReadonlyFields() {
        return this.permissionsEditReadonlyFields;
    }
    
    @Basic(optional=false)
    public void setPermissionsEditReadonlyFields(boolean permissionsEditReadonlyFields) {
        this.permissionsEditReadonlyFields = permissionsEditReadonlyFields;
    }
    
    public boolean getPermissionsRunReports() {
        return this.permissionsRunReports;
    }
    
    @Basic(optional=false)
    public void setPermissionsRunReports(boolean permissionsRunReports) {
        this.permissionsRunReports = permissionsRunReports;
    }
    
    public boolean getPermissionsViewSetup() {
        return this.permissionsViewSetup;
    }
    
    @Basic(optional=false)
    public void setPermissionsViewSetup(boolean permissionsViewSetup) {
        this.permissionsViewSetup = permissionsViewSetup;
    }
    
    public boolean getPermissionsTransferAnyEntity() {
        return this.permissionsTransferAnyEntity;
    }
    
    @Basic(optional=false)
    public void setPermissionsTransferAnyEntity(boolean permissionsTransferAnyEntity) {
        this.permissionsTransferAnyEntity = permissionsTransferAnyEntity;
    }
    
    public boolean getPermissionsNewReportBuilder() {
        return this.permissionsNewReportBuilder;
    }
    
    @Basic(optional=false)
    public void setPermissionsNewReportBuilder(boolean permissionsNewReportBuilder) {
        this.permissionsNewReportBuilder = permissionsNewReportBuilder;
    }
    
    public boolean getPermissionsManageSelfService() {
        return this.permissionsManageSelfService;
    }
    
    @Basic(optional=false)
    public void setPermissionsManageSelfService(boolean permissionsManageSelfService) {
        this.permissionsManageSelfService = permissionsManageSelfService;
    }
    
    public boolean getPermissionsManageCssUsers() {
        return this.permissionsManageCssUsers;
    }
    
    @Basic(optional=false)
    public void setPermissionsManageCssUsers(boolean permissionsManageCssUsers) {
        this.permissionsManageCssUsers = permissionsManageCssUsers;
    }
    
    public boolean getPermissionsImportLeads() {
        return this.permissionsImportLeads;
    }
    
    @Basic(optional=false)
    public void setPermissionsImportLeads(boolean permissionsImportLeads) {
        this.permissionsImportLeads = permissionsImportLeads;
    }
    
    public boolean getPermissionsManageLeads() {
        return this.permissionsManageLeads;
    }
    
    @Basic(optional=false)
    public void setPermissionsManageLeads(boolean permissionsManageLeads) {
        this.permissionsManageLeads = permissionsManageLeads;
    }
    
    public boolean getPermissionsTransferAnyLead() {
        return this.permissionsTransferAnyLead;
    }
    
    @Basic(optional=false)
    public void setPermissionsTransferAnyLead(boolean permissionsTransferAnyLead) {
        this.permissionsTransferAnyLead = permissionsTransferAnyLead;
    }
    
    public boolean getPermissionsViewAllData() {
        return this.permissionsViewAllData;
    }
    
    @Basic(optional=false)
    public void setPermissionsViewAllData(boolean permissionsViewAllData) {
        this.permissionsViewAllData = permissionsViewAllData;
    }
    
    public boolean getPermissionsEditPublicDocuments() {
        return this.permissionsEditPublicDocuments;
    }
    
    @Basic(optional=false)
    public void setPermissionsEditPublicDocuments(boolean permissionsEditPublicDocuments) {
        this.permissionsEditPublicDocuments = permissionsEditPublicDocuments;
    }
    
    public boolean getPermissionsManageDashboards() {
        return this.permissionsManageDashboards;
    }
    
    @Basic(optional=false)
    public void setPermissionsManageDashboards(boolean permissionsManageDashboards) {
        this.permissionsManageDashboards = permissionsManageDashboards;
    }
    
    public boolean getPermissionsSendSitRequests() {
        return this.permissionsSendSitRequests;
    }
    
    @Basic(optional=false)
    public void setPermissionsSendSitRequests(boolean permissionsSendSitRequests) {
        this.permissionsSendSitRequests = permissionsSendSitRequests;
    }
    
    public boolean getPermissionsApiUserOnly() {
        return this.permissionsApiUserOnly;
    }
    
    @Basic(optional=false)
    public void setPermissionsApiUserOnly(boolean permissionsApiUserOnly) {
        this.permissionsApiUserOnly = permissionsApiUserOnly;
    }
    
    public boolean getPermissionsManageRemoteAccess() {
        return this.permissionsManageRemoteAccess;
    }
    
    @Basic(optional=false)
    public void setPermissionsManageRemoteAccess(boolean permissionsManageRemoteAccess) {
        this.permissionsManageRemoteAccess = permissionsManageRemoteAccess;
    }
    
    public boolean getPermissionsCanUseNewDashboardBuilder() {
        return this.permissionsCanUseNewDashboardBuilder;
    }
    
    @Basic(optional=false)
    public void setPermissionsCanUseNewDashboardBuilder(boolean permissionsCanUseNewDashboardBuilder) {
        this.permissionsCanUseNewDashboardBuilder = permissionsCanUseNewDashboardBuilder;
    }
    
    public boolean getPermissionsManageCategories() {
        return this.permissionsManageCategories;
    }
    
    @Basic(optional=false)
    public void setPermissionsManageCategories(boolean permissionsManageCategories) {
        this.permissionsManageCategories = permissionsManageCategories;
    }
    
    public boolean getPermissionsConvertLeads() {
        return this.permissionsConvertLeads;
    }
    
    @Basic(optional=false)
    public void setPermissionsConvertLeads(boolean permissionsConvertLeads) {
        this.permissionsConvertLeads = permissionsConvertLeads;
    }
    
    public boolean getPermissionsPasswordNeverExpires() {
        return this.permissionsPasswordNeverExpires;
    }
    
    @Basic(optional=false)
    public void setPermissionsPasswordNeverExpires(boolean permissionsPasswordNeverExpires) {
        this.permissionsPasswordNeverExpires = permissionsPasswordNeverExpires;
    }
    
    public boolean getPermissionsUseTeamReassignWizards() {
        return this.permissionsUseTeamReassignWizards;
    }
    
    @Basic(optional=false)
    public void setPermissionsUseTeamReassignWizards(boolean permissionsUseTeamReassignWizards) {
        this.permissionsUseTeamReassignWizards = permissionsUseTeamReassignWizards;
    }
    
    public boolean getPermissionsInstallMultiforce() {
        return this.permissionsInstallMultiforce;
    }
    
    @Basic(optional=false)
    public void setPermissionsInstallMultiforce(boolean permissionsInstallMultiforce) {
        this.permissionsInstallMultiforce = permissionsInstallMultiforce;
    }
    
    public boolean getPermissionsPublishMultiforce() {
        return this.permissionsPublishMultiforce;
    }
    
    @Basic(optional=false)
    public void setPermissionsPublishMultiforce(boolean permissionsPublishMultiforce) {
        this.permissionsPublishMultiforce = permissionsPublishMultiforce;
    }
    
    public boolean getPermissionsEditOppLineItemUnitPrice() {
        return this.permissionsEditOppLineItemUnitPrice;
    }
    
    @Basic(optional=false)
    public void setPermissionsEditOppLineItemUnitPrice(boolean permissionsEditOppLineItemUnitPrice) {
        this.permissionsEditOppLineItemUnitPrice = permissionsEditOppLineItemUnitPrice;
    }
    
    public boolean getPermissionsCreateMultiforce() {
        return this.permissionsCreateMultiforce;
    }
    
    @Basic(optional=false)
    public void setPermissionsCreateMultiforce(boolean permissionsCreateMultiforce) {
        this.permissionsCreateMultiforce = permissionsCreateMultiforce;
    }
    
    public boolean getPermissionsBulkApiHardDelete() {
        return this.permissionsBulkApiHardDelete;
    }
    
    @Basic(optional=false)
    public void setPermissionsBulkApiHardDelete(boolean permissionsBulkApiHardDelete) {
        this.permissionsBulkApiHardDelete = permissionsBulkApiHardDelete;
    }
    
    public boolean getPermissionsInboundMigrationToolsUser() {
        return this.permissionsInboundMigrationToolsUser;
    }
    
    @Basic(optional=false)
    public void setPermissionsInboundMigrationToolsUser(boolean permissionsInboundMigrationToolsUser) {
        this.permissionsInboundMigrationToolsUser = permissionsInboundMigrationToolsUser;
    }
    
    public boolean getPermissionsSolutionImport() {
        return this.permissionsSolutionImport;
    }
    
    @Basic(optional=false)
    public void setPermissionsSolutionImport(boolean permissionsSolutionImport) {
        this.permissionsSolutionImport = permissionsSolutionImport;
    }
    
    public boolean getPermissionsManageCallCenters() {
        return this.permissionsManageCallCenters;
    }
    
    @Basic(optional=false)
    public void setPermissionsManageCallCenters(boolean permissionsManageCallCenters) {
        this.permissionsManageCallCenters = permissionsManageCallCenters;
    }
    
    public boolean getPermissionsEditReports() {
        return this.permissionsEditReports;
    }
    
    @Basic(optional=false)
    public void setPermissionsEditReports(boolean permissionsEditReports) {
        this.permissionsEditReports = permissionsEditReports;
    }
    
    public boolean getPermissionsOutboundMigrationToolsUser() {
        return this.permissionsOutboundMigrationToolsUser;
    }
    
    @Basic(optional=false)
    public void setPermissionsOutboundMigrationToolsUser(boolean permissionsOutboundMigrationToolsUser) {
        this.permissionsOutboundMigrationToolsUser = permissionsOutboundMigrationToolsUser;
    }
    
    public boolean getPermissionsManageEmailClientConfig() {
        return this.permissionsManageEmailClientConfig;
    }
    
    @Basic(optional=false)
    public void setPermissionsManageEmailClientConfig(boolean permissionsManageEmailClientConfig) {
        this.permissionsManageEmailClientConfig = permissionsManageEmailClientConfig;
    }
    
    public boolean getPermissionsEnableNotifications() {
        return this.permissionsEnableNotifications;
    }
    
    @Basic(optional=false)
    public void setPermissionsEnableNotifications(boolean permissionsEnableNotifications) {
        this.permissionsEnableNotifications = permissionsEnableNotifications;
    }
    
    public boolean getPermissionsManageDataIntegrations() {
        return this.permissionsManageDataIntegrations;
    }
    
    @Basic(optional=false)
    public void setPermissionsManageDataIntegrations(boolean permissionsManageDataIntegrations) {
        this.permissionsManageDataIntegrations = permissionsManageDataIntegrations;
    }
    
    public boolean getPermissionsDistributeFromPersWksp() {
        return this.permissionsDistributeFromPersWksp;
    }
    
    @Basic(optional=false)
    public void setPermissionsDistributeFromPersWksp(boolean permissionsDistributeFromPersWksp) {
        this.permissionsDistributeFromPersWksp = permissionsDistributeFromPersWksp;
    }
    
    public boolean getPermissionsViewDataCategories() {
        return this.permissionsViewDataCategories;
    }
    
    @Basic(optional=false)
    public void setPermissionsViewDataCategories(boolean permissionsViewDataCategories) {
        this.permissionsViewDataCategories = permissionsViewDataCategories;
    }
    
    public boolean getPermissionsManageDataCategories() {
        return this.permissionsManageDataCategories;
    }
    
    @Basic(optional=false)
    public void setPermissionsManageDataCategories(boolean permissionsManageDataCategories) {
        this.permissionsManageDataCategories = permissionsManageDataCategories;
    }
    
    public boolean getPermissionsAuthorApex() {
        return this.permissionsAuthorApex;
    }
    
    @Basic(optional=false)
    public void setPermissionsAuthorApex(boolean permissionsAuthorApex) {
        this.permissionsAuthorApex = permissionsAuthorApex;
    }
    
    public boolean getPermissionsManageMobile() {
        return this.permissionsManageMobile;
    }
    
    @Basic(optional=false)
    public void setPermissionsManageMobile(boolean permissionsManageMobile) {
        this.permissionsManageMobile = permissionsManageMobile;
    }
    
    public boolean getPermissionsApiEnabled() {
        return this.permissionsApiEnabled;
    }
    
    @Basic(optional=false)
    public void setPermissionsApiEnabled(boolean permissionsApiEnabled) {
        this.permissionsApiEnabled = permissionsApiEnabled;
    }
    
    public boolean getPermissionsManageCustomReportTypes() {
        return this.permissionsManageCustomReportTypes;
    }
    
    @Basic(optional=false)
    public void setPermissionsManageCustomReportTypes(boolean permissionsManageCustomReportTypes) {
        this.permissionsManageCustomReportTypes = permissionsManageCustomReportTypes;
    }
    
    public boolean getPermissionsEditCaseComments() {
        return this.permissionsEditCaseComments;
    }
    
    @Basic(optional=false)
    public void setPermissionsEditCaseComments(boolean permissionsEditCaseComments) {
        this.permissionsEditCaseComments = permissionsEditCaseComments;
    }
    
    public boolean getPermissionsTransferAnyCase() {
        return this.permissionsTransferAnyCase;
    }
    
    @Basic(optional=false)
    public void setPermissionsTransferAnyCase(boolean permissionsTransferAnyCase) {
        this.permissionsTransferAnyCase = permissionsTransferAnyCase;
    }
    
    public boolean getPermissionsScheduleJob() {
        return this.permissionsScheduleJob;
    }
    
    @Basic(optional=false)
    public void setPermissionsScheduleJob(boolean permissionsScheduleJob) {
        this.permissionsScheduleJob = permissionsScheduleJob;
    }
    
    public boolean getPermissionsManageAnalyticSnapshots() {
        return this.permissionsManageAnalyticSnapshots;
    }
    
    @Basic(optional=false)
    public void setPermissionsManageAnalyticSnapshots(boolean permissionsManageAnalyticSnapshots) {
        this.permissionsManageAnalyticSnapshots = permissionsManageAnalyticSnapshots;
    }
    
    public boolean getPermissionsScheduleReports() {
        return this.permissionsScheduleReports;
    }
    
    @Basic(optional=false)
    public void setPermissionsScheduleReports(boolean permissionsScheduleReports) {
        this.permissionsScheduleReports = permissionsScheduleReports;
    }
    
    public boolean getPermissionsManageBusinessHourHolidays() {
        return this.permissionsManageBusinessHourHolidays;
    }
    
    @Basic(optional=false)
    public void setPermissionsManageBusinessHourHolidays(boolean permissionsManageBusinessHourHolidays) {
        this.permissionsManageBusinessHourHolidays = permissionsManageBusinessHourHolidays;
    }
    
    public boolean getPermissionsCustomSidebarOnAllPages() {
        return this.permissionsCustomSidebarOnAllPages;
    }
    
    @Basic(optional=false)
    public void setPermissionsCustomSidebarOnAllPages(boolean permissionsCustomSidebarOnAllPages) {
        this.permissionsCustomSidebarOnAllPages = permissionsCustomSidebarOnAllPages;
    }
    
    public boolean getPermissionsViewMyTeamsDashboards() {
        return this.permissionsViewMyTeamsDashboards;
    }
    
    @Basic(optional=false)
    public void setPermissionsViewMyTeamsDashboards(boolean permissionsViewMyTeamsDashboards) {
        this.permissionsViewMyTeamsDashboards = permissionsViewMyTeamsDashboards;
    }
    
    public boolean getPermissionsResetPasswords() {
        return this.permissionsResetPasswords;
    }
    
    @Basic(optional=false)
    public void setPermissionsResetPasswords(boolean permissionsResetPasswords) {
        this.permissionsResetPasswords = permissionsResetPasswords;
    }
    
    public boolean getPermissionsFlowUFLRequired() {
        return this.permissionsFlowUFLRequired;
    }
    
    @Basic(optional=false)
    public void setPermissionsFlowUFLRequired(boolean permissionsFlowUFLRequired) {
        this.permissionsFlowUFLRequired = permissionsFlowUFLRequired;
    }
    
    public boolean getPermissionsCanInsertFeedSystemFields() {
        return this.permissionsCanInsertFeedSystemFields;
    }
    
    @Basic(optional=false)
    public void setPermissionsCanInsertFeedSystemFields(boolean permissionsCanInsertFeedSystemFields) {
        this.permissionsCanInsertFeedSystemFields = permissionsCanInsertFeedSystemFields;
    }
    
    public boolean getPermissionsEmailTemplateManagement() {
        return this.permissionsEmailTemplateManagement;
    }
    
    @Basic(optional=false)
    public void setPermissionsEmailTemplateManagement(boolean permissionsEmailTemplateManagement) {
        this.permissionsEmailTemplateManagement = permissionsEmailTemplateManagement;
    }
    
    public boolean getPermissionsEmailAdministration() {
        return this.permissionsEmailAdministration;
    }
    
    @Basic(optional=false)
    public void setPermissionsEmailAdministration(boolean permissionsEmailAdministration) {
        this.permissionsEmailAdministration = permissionsEmailAdministration;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="UserLicenseId")
    public UserLicense getUserLicense() {
        return this.userLicense;
    }
    
    @Basic(optional=false)
    public void setUserLicense(UserLicense userLicense) {
        this.userLicense = userLicense;
    }
    
    @Enumerated(value=EnumType.STRING)
    public UserTypeEnum getUserType() {
        return this.userType;
    }
    
    public void setUserType(UserTypeEnum userType) {
        this.userType = userType;
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
    
    public java.util.Calendar getSystemModstamp() {
        return this.systemModstamp;
    }
    
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    

    /**
     * Java model for the UserType picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum UserTypeEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        STANDARD(true,false,"Standard","Standard"),
        POWERPARTNER(true,false,"Partner","PowerPartner"),
        POWERCUSTOMERSUCCESS(true,false,"Customer Portal Manager","PowerCustomerSuccess"),
        CUSTOMERSUCCESS(true,false,"Customer Portal User","CustomerSuccess"),
        GUEST(true,false,"Guest","Guest"),
        CSPLITEPORTAL(true,false,"High Volume Portal","CSPLitePortal"),
        CSNONLY(true,false,"CSN Only","CSNOnly"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private UserTypeEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
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

        public static UserTypeEnum fromValue(String value) {
            if (value == null) return null;

            for (UserTypeEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    

}