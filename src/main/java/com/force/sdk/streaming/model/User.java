package com.force.sdk.streaming.model;

import javax.persistence.*;

/**
 * Java com.force.sdk.streaming.model for the Force.com User object.
 *
 * For this class, the following operations are available
 * via Force.com JPA:
 *
 *     Create : true
 *     Read   : true
 *     Update : true
 *     Delete : false
 *
 * This class was auto-generated. It is considered owned
 * by the Force.com database.
 *
 * @author Naaman Newbold (nnewbold@salesforce.com)
 **/
@javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
@Table(name="User")
@Entity(name="User")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class User extends com.force.sdk.jpa.model.BaseForceObject {

    public static final String KEY_PREFIX = "005";


    protected String username;
    protected String lastName;
    protected String firstName;
    protected String name;
    protected String companyName;
    protected String division;
    protected String department;
    protected String title;
    protected String street;
    protected String city;
    protected String state;
    protected String postalCode;
    protected String country;
    protected String email;
    protected String phone;
    protected String fax;
    protected String mobilePhone;
    protected String alias;
    protected String communityNickname;
    protected boolean isActive;
    protected TimeZoneSidKeyEnum timeZoneSidKey;
    protected UserRole userRole;
    protected LocaleSidKeyEnum localeSidKey;
    protected boolean receivesInfoEmails;
    protected boolean receivesAdminInfoEmails;
    protected EmailEncodingKeyEnum emailEncodingKey;
    protected Profile profile;
    protected UserTypeEnum userType;
    protected LanguageLocaleKeyEnum languageLocaleKey;
    protected String employeeNumber;
    // delegatedApproverId possible references:
    // Group
    // User
    protected String delegatedApproverId;
    protected User manager;
    protected java.util.Calendar lastLoginDate;
    protected java.util.Calendar lastPasswordChangeDate;
    protected java.util.Calendar createdDate;
    protected User createdBy;
    protected java.util.Calendar lastModifiedDate;
    protected User lastModifiedBy;
    protected java.util.Calendar systemModstamp;
    protected java.util.Calendar offlineTrialExpirationDate;
    protected java.util.Calendar offlinePdaTrialExpirationDate;
    protected boolean userPermissionsMarketingUser;
    protected boolean userPermissionsOfflineUser;
    protected boolean userPermissionsAvantgoUser;
    protected boolean userPermissionsCallCenterAutoLogin;
    protected boolean userPermissionsMobileUser;
    protected boolean userPermissionsSFContentUser;
    protected boolean forecastEnabled;
    protected boolean userPreferencesActivityRemindersPopup;
    protected boolean userPreferencesEventRemindersCheckboxDefault;
    protected boolean userPreferencesTaskRemindersCheckboxDefault;
    protected boolean userPreferencesReminderSoundOff;
    protected boolean userPreferencesDisableAutoSubForFeeds;
    protected boolean userPreferencesApexPagesDeveloperMode;
    protected Contact contact;
    protected Account accountId;
    protected CallCenter callCenterId;
    protected String extension;
    protected String aboutMe;
    protected String currentStatus;
    protected String fullPhotoUrl;
    protected String smallPhotoUrl;
    protected DigestFrequencyEnum digestFrequency;
    protected DefaultGroupNotificationFrequencyEnum defaultGroupNotificationFrequency;
    

    public String getUsername() {
        return this.username;
    }
    
    @Basic(optional=false)
    public void setUsername(String username) {
        this.username = username;
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
    
    public String getName() {
        return this.name;
    }
    
    @Basic(optional=false)
    public void setName(String name) {
        this.name = name;
    }
    
    public String getCompanyName() {
        return this.companyName;
    }
    
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    public String getDivision() {
        return this.division;
    }
    
    public void setDivision(String division) {
        this.division = division;
    }
    
    public String getDepartment() {
        return this.department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getStreet() {
        return this.street;
    }
    
    public void setStreet(String street) {
        this.street = street;
    }
    
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    
    public String getPostalCode() {
        return this.postalCode;
    }
    
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    
    public String getCountry() {
        return this.country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    @Basic(optional=false)
    public void setEmail(String email) {
        this.email = email;
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
    
    public String getAlias() {
        return this.alias;
    }
    
    @Basic(optional=false)
    public void setAlias(String alias) {
        this.alias = alias;
    }
    
    public String getCommunityNickname() {
        return this.communityNickname;
    }
    
    @Basic(optional=false)
    public void setCommunityNickname(String communityNickname) {
        this.communityNickname = communityNickname;
    }
    
    public boolean getIsActive() {
        return this.isActive;
    }
    
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
    
    @Enumerated(value=EnumType.STRING)
    public TimeZoneSidKeyEnum getTimeZoneSidKey() {
        return this.timeZoneSidKey;
    }
    
    @Basic(optional=false)
    public void setTimeZoneSidKey(TimeZoneSidKeyEnum timeZoneSidKey) {
        this.timeZoneSidKey = timeZoneSidKey;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="UserRoleId")
    public UserRole getUserRole() {
        return this.userRole;
    }
    
    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }
    
    @Enumerated(value=EnumType.STRING)
    public LocaleSidKeyEnum getLocaleSidKey() {
        return this.localeSidKey;
    }
    
    @Basic(optional=false)
    public void setLocaleSidKey(LocaleSidKeyEnum localeSidKey) {
        this.localeSidKey = localeSidKey;
    }
    
    public boolean getReceivesInfoEmails() {
        return this.receivesInfoEmails;
    }
    
    public void setReceivesInfoEmails(boolean receivesInfoEmails) {
        this.receivesInfoEmails = receivesInfoEmails;
    }
    
    public boolean getReceivesAdminInfoEmails() {
        return this.receivesAdminInfoEmails;
    }
    
    public void setReceivesAdminInfoEmails(boolean receivesAdminInfoEmails) {
        this.receivesAdminInfoEmails = receivesAdminInfoEmails;
    }
    
    @Enumerated(value=EnumType.STRING)
    public EmailEncodingKeyEnum getEmailEncodingKey() {
        return this.emailEncodingKey;
    }
    
    @Basic(optional=false)
    public void setEmailEncodingKey(EmailEncodingKeyEnum emailEncodingKey) {
        this.emailEncodingKey = emailEncodingKey;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="ProfileId")
    public Profile getProfile() {
        return this.profile;
    }
    
    @Basic(optional=false)
    public void setProfile(Profile profile) {
        this.profile = profile;
    }
    
    @Enumerated(value=EnumType.STRING)
    public UserTypeEnum getUserType() {
        return this.userType;
    }
    
    public void setUserType(UserTypeEnum userType) {
        this.userType = userType;
    }
    
    @Enumerated(value=EnumType.STRING)
    public LanguageLocaleKeyEnum getLanguageLocaleKey() {
        return this.languageLocaleKey;
    }
    
    @Basic(optional=false)
    public void setLanguageLocaleKey(LanguageLocaleKeyEnum languageLocaleKey) {
        this.languageLocaleKey = languageLocaleKey;
    }
    
    public String getEmployeeNumber() {
        return this.employeeNumber;
    }
    
    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    public String getDelegatedApproverId() {
        return this.delegatedApproverId;
    }
    
    public void setDelegatedApproverId(String delegatedApproverId) {
        this.delegatedApproverId = delegatedApproverId;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="ManagerId")
    public User getManager() {
        return this.manager;
    }
    
    public void setManager(User manager) {
        this.manager = manager;
    }
    
    public java.util.Calendar getLastLoginDate() {
        return this.lastLoginDate;
    }
    
    public void setLastLoginDate(java.util.Calendar lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }
    
    public java.util.Calendar getLastPasswordChangeDate() {
        return this.lastPasswordChangeDate;
    }
    
    public void setLastPasswordChangeDate(java.util.Calendar lastPasswordChangeDate) {
        this.lastPasswordChangeDate = lastPasswordChangeDate;
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
    
    public java.util.Calendar getOfflineTrialExpirationDate() {
        return this.offlineTrialExpirationDate;
    }
    
    public void setOfflineTrialExpirationDate(java.util.Calendar offlineTrialExpirationDate) {
        this.offlineTrialExpirationDate = offlineTrialExpirationDate;
    }
    
    public java.util.Calendar getOfflinePdaTrialExpirationDate() {
        return this.offlinePdaTrialExpirationDate;
    }
    
    public void setOfflinePdaTrialExpirationDate(java.util.Calendar offlinePdaTrialExpirationDate) {
        this.offlinePdaTrialExpirationDate = offlinePdaTrialExpirationDate;
    }
    
    public boolean getUserPermissionsMarketingUser() {
        return this.userPermissionsMarketingUser;
    }
    
    @Basic(optional=false)
    public void setUserPermissionsMarketingUser(boolean userPermissionsMarketingUser) {
        this.userPermissionsMarketingUser = userPermissionsMarketingUser;
    }
    
    public boolean getUserPermissionsOfflineUser() {
        return this.userPermissionsOfflineUser;
    }
    
    @Basic(optional=false)
    public void setUserPermissionsOfflineUser(boolean userPermissionsOfflineUser) {
        this.userPermissionsOfflineUser = userPermissionsOfflineUser;
    }
    
    public boolean getUserPermissionsAvantgoUser() {
        return this.userPermissionsAvantgoUser;
    }
    
    @Basic(optional=false)
    public void setUserPermissionsAvantgoUser(boolean userPermissionsAvantgoUser) {
        this.userPermissionsAvantgoUser = userPermissionsAvantgoUser;
    }
    
    public boolean getUserPermissionsCallCenterAutoLogin() {
        return this.userPermissionsCallCenterAutoLogin;
    }
    
    @Basic(optional=false)
    public void setUserPermissionsCallCenterAutoLogin(boolean userPermissionsCallCenterAutoLogin) {
        this.userPermissionsCallCenterAutoLogin = userPermissionsCallCenterAutoLogin;
    }
    
    public boolean getUserPermissionsMobileUser() {
        return this.userPermissionsMobileUser;
    }
    
    @Basic(optional=false)
    public void setUserPermissionsMobileUser(boolean userPermissionsMobileUser) {
        this.userPermissionsMobileUser = userPermissionsMobileUser;
    }
    
    public boolean getUserPermissionsSFContentUser() {
        return this.userPermissionsSFContentUser;
    }
    
    @Basic(optional=false)
    public void setUserPermissionsSFContentUser(boolean userPermissionsSFContentUser) {
        this.userPermissionsSFContentUser = userPermissionsSFContentUser;
    }
    
    public boolean getForecastEnabled() {
        return this.forecastEnabled;
    }
    
    public void setForecastEnabled(boolean forecastEnabled) {
        this.forecastEnabled = forecastEnabled;
    }
    
    public boolean getUserPreferencesActivityRemindersPopup() {
        return this.userPreferencesActivityRemindersPopup;
    }
    
    @Basic(optional=false)
    public void setUserPreferencesActivityRemindersPopup(boolean userPreferencesActivityRemindersPopup) {
        this.userPreferencesActivityRemindersPopup = userPreferencesActivityRemindersPopup;
    }
    
    public boolean getUserPreferencesEventRemindersCheckboxDefault() {
        return this.userPreferencesEventRemindersCheckboxDefault;
    }
    
    @Basic(optional=false)
    public void setUserPreferencesEventRemindersCheckboxDefault(boolean userPreferencesEventRemindersCheckboxDefault) {
        this.userPreferencesEventRemindersCheckboxDefault = userPreferencesEventRemindersCheckboxDefault;
    }
    
    public boolean getUserPreferencesTaskRemindersCheckboxDefault() {
        return this.userPreferencesTaskRemindersCheckboxDefault;
    }
    
    @Basic(optional=false)
    public void setUserPreferencesTaskRemindersCheckboxDefault(boolean userPreferencesTaskRemindersCheckboxDefault) {
        this.userPreferencesTaskRemindersCheckboxDefault = userPreferencesTaskRemindersCheckboxDefault;
    }
    
    public boolean getUserPreferencesReminderSoundOff() {
        return this.userPreferencesReminderSoundOff;
    }
    
    @Basic(optional=false)
    public void setUserPreferencesReminderSoundOff(boolean userPreferencesReminderSoundOff) {
        this.userPreferencesReminderSoundOff = userPreferencesReminderSoundOff;
    }
    
    public boolean getUserPreferencesDisableAutoSubForFeeds() {
        return this.userPreferencesDisableAutoSubForFeeds;
    }
    
    @Basic(optional=false)
    public void setUserPreferencesDisableAutoSubForFeeds(boolean userPreferencesDisableAutoSubForFeeds) {
        this.userPreferencesDisableAutoSubForFeeds = userPreferencesDisableAutoSubForFeeds;
    }
    
    public boolean getUserPreferencesApexPagesDeveloperMode() {
        return this.userPreferencesApexPagesDeveloperMode;
    }
    
    @Basic(optional=false)
    public void setUserPreferencesApexPagesDeveloperMode(boolean userPreferencesApexPagesDeveloperMode) {
        this.userPreferencesApexPagesDeveloperMode = userPreferencesApexPagesDeveloperMode;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="ContactId")
    public Contact getContact() {
        return this.contact;
    }
    
    public void setContact(Contact contact) {
        this.contact = contact;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    public Account getAccountId() {
        return this.accountId;
    }
    
    public void setAccountId(Account accountId) {
        this.accountId = accountId;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    public CallCenter getCallCenterId() {
        return this.callCenterId;
    }
    
    public void setCallCenterId(CallCenter callCenterId) {
        this.callCenterId = callCenterId;
    }
    
    public String getExtension() {
        return this.extension;
    }
    
    public void setExtension(String extension) {
        this.extension = extension;
    }
    
    public String getAboutMe() {
        return this.aboutMe;
    }
    
    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }
    
    public String getCurrentStatus() {
        return this.currentStatus;
    }
    
    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }
    
    public String getFullPhotoUrl() {
        return this.fullPhotoUrl;
    }
    
    public void setFullPhotoUrl(String fullPhotoUrl) {
        this.fullPhotoUrl = fullPhotoUrl;
    }
    
    public String getSmallPhotoUrl() {
        return this.smallPhotoUrl;
    }
    
    public void setSmallPhotoUrl(String smallPhotoUrl) {
        this.smallPhotoUrl = smallPhotoUrl;
    }
    
    @Enumerated(value=EnumType.STRING)
    public DigestFrequencyEnum getDigestFrequency() {
        return this.digestFrequency;
    }
    
    public void setDigestFrequency(DigestFrequencyEnum digestFrequency) {
        this.digestFrequency = digestFrequency;
    }
    
    @Enumerated(value=EnumType.STRING)
    public DefaultGroupNotificationFrequencyEnum getDefaultGroupNotificationFrequency() {
        return this.defaultGroupNotificationFrequency;
    }
    
    public void setDefaultGroupNotificationFrequency(DefaultGroupNotificationFrequencyEnum defaultGroupNotificationFrequency) {
        this.defaultGroupNotificationFrequency = defaultGroupNotificationFrequency;
    }
    
    

    /**
     * Java com.force.sdk.streaming.model for the TimeZoneSidKey picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum TimeZoneSidKeyEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        PACIFIC_KIRITIMATI(true,false,"(GMT+14:00) Line Islands Time (Pacific/Kiritimati)","Pacific/Kiritimati"),
        PACIFIC_ENDERBURY(true,false,"(GMT+13:00) Phoenix Islands Time (Pacific/Enderbury)","Pacific/Enderbury"),
        PACIFIC_TONGATAPU(true,false,"(GMT+13:00) Tonga Time (Pacific/Tongatapu)","Pacific/Tongatapu"),
        PACIFIC_CHATHAM(true,false,"(GMT+12:45) Chatham Standard Time (Pacific/Chatham)","Pacific/Chatham"),
        PACIFIC_AUCKLAND(true,false,"(GMT+12:00) New Zealand Standard Time (Pacific/Auckland)","Pacific/Auckland"),
        PACIFIC_FIJI(true,false,"(GMT+12:00) Fiji Time (Pacific/Fiji)","Pacific/Fiji"),
        PACIFIC_NORFOLK(true,false,"(GMT+11:30) Norfolk Islands Time (Pacific/Norfolk)","Pacific/Norfolk"),
        ASIA_KAMCHATKA(true,false,"(GMT+12:00) Petropavlovsk-Kamchatski Summer Time (Asia/Kamchatka)","Asia/Kamchatka"),
        PACIFIC_GUADALCANAL(true,false,"(GMT+11:00) Solomon Islands Time (Pacific/Guadalcanal)","Pacific/Guadalcanal"),
        AUSTRALIA_LORD_HOWE(true,false,"(GMT+10:30) Lord Howe Standard Time (Australia/Lord_Howe)","Australia/Lord_Howe"),
        AUSTRALIA_BRISBANE(true,false,"(GMT+10:00) Australian Eastern Standard Time (Australia/Brisbane)","Australia/Brisbane"),
        AUSTRALIA_SYDNEY(true,false,"(GMT+10:00) Australian Eastern Standard Time (Australia/Sydney)","Australia/Sydney"),
        AUSTRALIA_ADELAIDE(true,false,"(GMT+09:30) Australian Central Standard Time (Australia/Adelaide)","Australia/Adelaide"),
        AUSTRALIA_DARWIN(true,false,"(GMT+09:30) Australian Central Standard Time (Australia/Darwin)","Australia/Darwin"),
        ASIA_SEOUL(true,false,"(GMT+09:00) Korean Standard Time (Asia/Seoul)","Asia/Seoul"),
        ASIA_TOKYO(true,false,"(GMT+09:00) Japan Standard Time (Asia/Tokyo)","Asia/Tokyo"),
        ASIA_HONG_KONG(true,false,"(GMT+08:00) Hong Kong Time (Asia/Hong_Kong)","Asia/Hong_Kong"),
        ASIA_KUALA_LUMPUR(true,false,"(GMT+08:00) Malaysia Time (Asia/Kuala_Lumpur)","Asia/Kuala_Lumpur"),
        ASIA_MANILA(true,false,"(GMT+08:00) Philippine Time (Asia/Manila)","Asia/Manila"),
        ASIA_SHANGHAI(true,false,"(GMT+08:00) China Standard Time (Asia/Shanghai)","Asia/Shanghai"),
        ASIA_SINGAPORE(true,false,"(GMT+08:00) Singapore Standard Time (Asia/Singapore)","Asia/Singapore"),
        ASIA_TAIPEI(true,false,"(GMT+08:00) Taipei Standard Time (Asia/Taipei)","Asia/Taipei"),
        AUSTRALIA_PERTH(true,false,"(GMT+08:00) Australian Western Standard Time (Australia/Perth)","Australia/Perth"),
        ASIA_BANGKOK(true,false,"(GMT+07:00) Indochina Time (Asia/Bangkok)","Asia/Bangkok"),
        ASIA_JAKARTA(true,false,"(GMT+07:00) Western Indonesia Time (Asia/Jakarta)","Asia/Jakarta"),
        ASIA_SAIGON(true,false,"(GMT+07:00) Indochina Time (Asia/Saigon)","Asia/Saigon"),
        ASIA_RANGOON(true,false,"(GMT+06:30) Myanmar Time (Asia/Rangoon)","Asia/Rangoon"),
        ASIA_DACCA(true,false,"(GMT+06:00) Bangladesh Time (Asia/Dacca)","Asia/Dacca"),
        ASIA_KATMANDU(true,false,"(GMT+05:45) Nepal Time (Asia/Katmandu)","Asia/Katmandu"),
        ASIA_CALCUTTA(true,false,"(GMT+05:30) India Standard Time (Asia/Calcutta)","Asia/Calcutta"),
        ASIA_COLOMBO(true,false,"(GMT+05:30) India Standard Time (Asia/Colombo)","Asia/Colombo"),
        ASIA_KARACHI(true,false,"(GMT+05:00) Pakistan Time (Asia/Karachi)","Asia/Karachi"),
        ASIA_TASHKENT(true,false,"(GMT+05:00) Uzbekistan Time (Asia/Tashkent)","Asia/Tashkent"),
        ASIA_YEKATERINBURG(true,false,"(GMT+06:00) Yekaterinburg Summer Time (Asia/Yekaterinburg)","Asia/Yekaterinburg"),
        ASIA_KABUL(true,false,"(GMT+04:30) Afghanistan Time (Asia/Kabul)","Asia/Kabul"),
        ASIA_DUBAI(true,false,"(GMT+04:00) Gulf Standard Time (Asia/Dubai)","Asia/Dubai"),
        ASIA_TBILISI(true,false,"(GMT+04:00) Georgia Time (Asia/Tbilisi)","Asia/Tbilisi"),
        ASIA_TEHRAN(true,false,"(GMT+04:30) Iran Daylight Time (Asia/Tehran)","Asia/Tehran"),
        AFRICA_NAIROBI(true,false,"(GMT+03:00) East Africa Time (Africa/Nairobi)","Africa/Nairobi"),
        ASIA_BAGHDAD(true,false,"(GMT+03:00) Arabian Standard Time (Asia/Baghdad)","Asia/Baghdad"),
        ASIA_KUWAIT(true,false,"(GMT+03:00) Arabian Standard Time (Asia/Kuwait)","Asia/Kuwait"),
        ASIA_RIYADH(true,false,"(GMT+03:00) Arabian Standard Time (Asia/Riyadh)","Asia/Riyadh"),
        EUROPE_MOSCOW(true,false,"(GMT+04:00) Moscow Summer Time (Europe/Moscow)","Europe/Moscow"),
        AFRICA_CAIRO(true,false,"(GMT+03:00) Eastern European Summer Time (Africa/Cairo)","Africa/Cairo"),
        AFRICA_JOHANNESBURG(true,false,"(GMT+02:00) South Africa Standard Time (Africa/Johannesburg)","Africa/Johannesburg"),
        ASIA_JERUSALEM(true,false,"(GMT+03:00) Israel Daylight Time (Asia/Jerusalem)","Asia/Jerusalem"),
        EUROPE_ATHENS(true,false,"(GMT+03:00) Eastern European Summer Time (Europe/Athens)","Europe/Athens"),
        EUROPE_BUCHAREST(true,false,"(GMT+03:00) Eastern European Summer Time (Europe/Bucharest)","Europe/Bucharest"),
        EUROPE_HELSINKI(true,false,"(GMT+03:00) Eastern European Summer Time (Europe/Helsinki)","Europe/Helsinki"),
        EUROPE_ISTANBUL(true,false,"(GMT+03:00) Eastern European Summer Time (Europe/Istanbul)","Europe/Istanbul"),
        EUROPE_MINSK(true,false,"(GMT+03:00) Eastern European Summer Time (Europe/Minsk)","Europe/Minsk"),
        EUROPE_AMSTERDAM(true,false,"(GMT+02:00) Central European Summer Time (Europe/Amsterdam)","Europe/Amsterdam"),
        EUROPE_BERLIN(true,false,"(GMT+02:00) Central European Summer Time (Europe/Berlin)","Europe/Berlin"),
        EUROPE_BRUSSELS(true,false,"(GMT+02:00) Central European Summer Time (Europe/Brussels)","Europe/Brussels"),
        EUROPE_PARIS(true,false,"(GMT+02:00) Central European Summer Time (Europe/Paris)","Europe/Paris"),
        EUROPE_PRAGUE(true,false,"(GMT+02:00) Central European Summer Time (Europe/Prague)","Europe/Prague"),
        EUROPE_ROME(true,false,"(GMT+02:00) Central European Summer Time (Europe/Rome)","Europe/Rome"),
        EUROPE_DUBLIN(true,false,"(GMT+01:00) Irish Summer Time (Europe/Dublin)","Europe/Dublin"),
        EUROPE_LISBON(true,false,"(GMT+01:00) Western European Summer Time (Europe/Lisbon)","Europe/Lisbon"),
        EUROPE_LONDON(true,false,"(GMT+01:00) British Summer Time (Europe/London)","Europe/London"),
        GMT(true,false,"(GMT+00:00) Greenwich Mean Time (GMT)","GMT"),
        ATLANTIC_CAPE_VERDE(true,false,"(GMT-01:00) Cape Verde Time (Atlantic/Cape_Verde)","Atlantic/Cape_Verde"),
        ATLANTIC_SOUTH_GEORGIA(true,false,"(GMT-02:00) South Georgia Time (Atlantic/South_Georgia)","Atlantic/South_Georgia"),
        AMERICA_BUENOS_AIRES(true,false,"(GMT-03:00) Argentina Time (America/Buenos_Aires)","America/Buenos_Aires"),
        AMERICA_SAO_PAULO(true,false,"(GMT-03:00) Brasilia Time (America/Sao_Paulo)","America/Sao_Paulo"),
        AMERICA_ST_JOHNS(true,false,"(GMT-02:30) Newfoundland Daylight Time (America/St_Johns)","America/St_Johns"),
        AMERICA_HALIFAX(true,false,"(GMT-03:00) Atlantic Daylight Time (America/Halifax)","America/Halifax"),
        AMERICA_PUERTO_RICO(true,false,"(GMT-04:00) Atlantic Standard Time (America/Puerto_Rico)","America/Puerto_Rico"),
        AMERICA_SANTIAGO(true,false,"(GMT-04:00) Chile Time (America/Santiago)","America/Santiago"),
        ATLANTIC_BERMUDA(true,false,"(GMT-03:00) Atlantic Daylight Time (Atlantic/Bermuda)","Atlantic/Bermuda"),
        AMERICA_CARACAS(true,false,"(GMT-04:30) Venezuela Time (America/Caracas)","America/Caracas"),
        AMERICA_BOGOTA(true,false,"(GMT-05:00) Colombia Time (America/Bogota)","America/Bogota"),
        AMERICA_INDIANAPOLIS(true,false,"(GMT-04:00) Eastern Daylight Time (America/Indianapolis)","America/Indianapolis"),
        AMERICA_LIMA(true,false,"(GMT-05:00) Peru Time (America/Lima)","America/Lima"),
        AMERICA_NEW_YORK(true,false,"(GMT-04:00) Eastern Daylight Time (America/New_York)","America/New_York"),
        AMERICA_PANAMA(true,false,"(GMT-05:00) Eastern Standard Time (America/Panama)","America/Panama"),
        AMERICA_CHICAGO(true,false,"(GMT-05:00) Central Daylight Time (America/Chicago)","America/Chicago"),
        AMERICA_EL_SALVADOR(true,false,"(GMT-06:00) Central Standard Time (America/El_Salvador)","America/El_Salvador"),
        AMERICA_MEXICO_CITY(true,false,"(GMT-05:00) Central Daylight Time (America/Mexico_City)","America/Mexico_City"),
        AMERICA_DENVER(true,false,"(GMT-06:00) Mountain Daylight Time (America/Denver)","America/Denver"),
        AMERICA_PHOENIX(true,false,"(GMT-07:00) Mountain Standard Time (America/Phoenix)","America/Phoenix"),
        AMERICA_LOS_ANGELES(true,false,"(GMT-07:00) Pacific Daylight Time (America/Los_Angeles)","America/Los_Angeles"),
        AMERICA_TIJUANA(true,false,"(GMT-07:00) Pacific Daylight Time (America/Tijuana)","America/Tijuana"),
        AMERICA_ANCHORAGE(true,false,"(GMT-08:00) Alaska Daylight Time (America/Anchorage)","America/Anchorage"),
        PACIFIC_HONOLULU(true,false,"(GMT-10:00) Hawaii-Aleutian Standard Time (Pacific/Honolulu)","Pacific/Honolulu"),
        PACIFIC_NIUE(true,false,"(GMT-11:00) Niue Time (Pacific/Niue)","Pacific/Niue"),
        PACIFIC_PAGO_PAGO(true,false,"(GMT-11:00) Samoa Standard Time (Pacific/Pago_Pago)","Pacific/Pago_Pago"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private TimeZoneSidKeyEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
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

        public static TimeZoneSidKeyEnum fromValue(String value) {
            if (value == null) return null;

            for (TimeZoneSidKeyEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    

    /**
     * Java com.force.sdk.streaming.model for the LocaleSidKey picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum LocaleSidKeyEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        SQ(true,false,"Albanian","sq"),
        SQ_AL(true,false,"Albanian (Albania)","sq_AL"),
        AR(true,false,"Arabic","ar"),
        AR_BH(true,false,"Arabic (Bahrain)","ar_BH"),
        AR_EG(true,false,"Arabic (Egypt)","ar_EG"),
        AR_JO(true,false,"Arabic (Jordan)","ar_JO"),
        AR_KW(true,false,"Arabic (Kuwait)","ar_KW"),
        AR_LB(true,false,"Arabic (Lebanon)","ar_LB"),
        AR_QA(true,false,"Arabic (Qatar)","ar_QA"),
        AR_SA(true,false,"Arabic (Saudi Arabia)","ar_SA"),
        AR_AE(true,false,"Arabic (United Arab Emirates)","ar_AE"),
        HY_AM(true,false,"Armenian (Armenia)","hy_AM"),
        AZ_AZ(true,false,"Azerbaijani (Azerbaijan)","az_AZ"),
        EU(true,false,"Basque","eu"),
        EU_ES(true,false,"Basque (Spain)","eu_ES"),
        BE_BY(true,false,"Belarusian (Belarus)","be_BY"),
        BN_BD(true,false,"Bengali (Bangladesh)","bn_BD"),
        BS(true,false,"Bosnian","bs"),
        BS_BA(true,false,"Bosnian (Bosnia and Herzegovina)","bs_BA"),
        BG(true,false,"Bulgarian","bg"),
        BG_BG(true,false,"Bulgarian (Bulgaria)","bg_BG"),
        CA(true,false,"Catalan","ca"),
        CA_ES(true,false,"Catalan (Spain)","ca_ES"),
        ZH(true,false,"Chinese","zh"),
        ZH_CN(true,false,"Chinese (China)","zh_CN"),
        ZH_HK(true,false,"Chinese (Hong Kong SAR China)","zh_HK"),
        ZH_TW(true,false,"Chinese (Taiwan)","zh_TW"),
        HR(true,false,"Croatian","hr"),
        HR_HR(true,false,"Croatian (Croatia)","hr_HR"),
        CS(true,false,"Czech","cs"),
        CS_CZ(true,false,"Czech (Czech Republic)","cs_CZ"),
        DA(true,false,"Danish","da"),
        DA_DK(true,false,"Danish (Denmark)","da_DK"),
        NL(true,false,"Dutch","nl"),
        NL_BE(true,false,"Dutch (Belgium)","nl_BE"),
        NL_NL(true,false,"Dutch (Netherlands)","nl_NL"),
        NL_SR(true,false,"Dutch (Suriname)","nl_SR"),
        EN_AU(true,false,"English (Australia)","en_AU"),
        EN_BB(true,false,"English (Barbados)","en_BB"),
        EN_BM(true,false,"English (Bermuda)","en_BM"),
        EN_CA(true,false,"English (Canada)","en_CA"),
        EN_GH(true,false,"English (Ghana)","en_GH"),
        EN_IN(true,false,"English (India)","en_IN"),
        EN_ID(true,false,"English (Indonesia)","en_ID"),
        EN_IE(true,false,"English (Ireland)","en_IE"),
        EN_MY(true,false,"English (Malaysia)","en_MY"),
        EN_NZ(true,false,"English (New Zealand)","en_NZ"),
        EN_NG(true,false,"English (Nigeria)","en_NG"),
        EN_PK(true,false,"English (Pakistan)","en_PK"),
        EN_PH(true,false,"English (Philippines)","en_PH"),
        EN_SG(true,false,"English (Singapore)","en_SG"),
        EN_ZA(true,false,"English (South Africa)","en_ZA"),
        EN_GB(true,false,"English (United Kingdom)","en_GB"),
        EN_US(true,false,"English (United States)","en_US"),
        ET(true,false,"Estonian","et"),
        ET_EE(true,false,"Estonian (Estonia)","et_EE"),
        FI(true,false,"Finnish","fi"),
        FI_FI(true,false,"Finnish (Finland)","fi_FI"),
        FR(true,false,"French","fr"),
        FR_BE(true,false,"French (Belgium)","fr_BE"),
        FR_CA(true,false,"French (Canada)","fr_CA"),
        FR_FR(true,false,"French (France)","fr_FR"),
        FR_LU(true,false,"French (Luxembourg)","fr_LU"),
        FR_MC(true,false,"French (Monaco)","fr_MC"),
        FR_CH(true,false,"French (Switzerland)","fr_CH"),
        KA(true,false,"Georgian","ka"),
        KA_GE(true,false,"Georgian (Georgia)","ka_GE"),
        DE(true,false,"German","de"),
        DE_AT(true,false,"German (Austria)","de_AT"),
        DE_DE(true,false,"German (Germany)","de_DE"),
        DE_LU(true,false,"German (Luxembourg)","de_LU"),
        DE_CH(true,false,"German (Switzerland)","de_CH"),
        EL(true,false,"Greek","el"),
        EL_GR(true,false,"Greek (Greece)","el_GR"),
        IW(true,false,"Hebrew","iw"),
        IW_IL(true,false,"Hebrew (Israel)","iw_IL"),
        HI_IN(true,false,"Hindi (India)","hi_IN"),
        HU(true,false,"Hungarian","hu"),
        IS(true,false,"Icelandic","is"),
        IS_IS(true,false,"Icelandic (Iceland)","is_IS"),
        IN(true,false,"Indonesian","in"),
        GA(true,false,"Irish","ga"),
        GA_IE(true,false,"Irish (Ireland)","ga_IE"),
        IT(true,false,"Italian","it"),
        IT_IT(true,false,"Italian (Italy)","it_IT"),
        IT_CH(true,false,"Italian (Switzerland)","it_CH"),
        JA(true,false,"Japanese","ja"),
        JA_JP(true,false,"Japanese (Japan)","ja_JP"),
        KK_KZ(true,false,"Kazakh (Kazakhstan)","kk_KZ"),
        KM_KH(true,false,"Khmer (Cambodia)","km_KH"),
        KY_KG(true,false,"Kirghiz (Kyrgyzstan)","ky_KG"),
        KO(true,false,"Korean","ko"),
        KO_KR(true,false,"Korean (South Korea)","ko_KR"),
        LV(true,false,"Latvian","lv"),
        LV_LV(true,false,"Latvian (Latvia)","lv_LV"),
        LT(true,false,"Lithuanian","lt"),
        LT_LT(true,false,"Lithuanian (Lithuania)","lt_LT"),
        MK(true,false,"Macedonian","mk"),
        MK_MK(true,false,"Macedonian (Macedonia)","mk_MK"),
        MS_MY(true,false,"Malay (Malaysia)","ms_MY"),
        MT(true,false,"Maltese","mt"),
        MT_MT(true,false,"Maltese (Malta)","mt_MT"),
        SH_ME(true,false,"Montenegrin (Montenegro)","sh_ME"),
        NO(true,false,"Norwegian","no"),
        NO_NO(true,false,"Norwegian (Norway)","no_NO"),
        PL(true,false,"Polish","pl"),
        PT(true,false,"Portuguese","pt"),
        PT_AO(true,false,"Portuguese (Angola)","pt_AO"),
        PT_BR(true,false,"Portuguese (Brazil)","pt_BR"),
        PT_PT(true,false,"Portuguese (Portugal)","pt_PT"),
        RO(true,false,"Romanian","ro"),
        RO_MD(true,false,"Romanian (Moldova)","ro_MD"),
        RO_RO(true,false,"Romanian (Romania)","ro_RO"),
        RU(true,false,"Russian","ru"),
        RU_RU(true,false,"Russian (Russia)","ru_RU"),
        SR(true,false,"Serbian","sr"),
        SR_BA(true,false,"Serbian (Bosnia and Herzegovina)","sr_BA"),
        SH(true,false,"Serbian (Latin)","sh"),
        SH_BA(true,false,"Serbian (Latin) (Bosnia and Herzegovina)","sh_BA"),
        SH_CS(true,false,"Serbian (Latin) (Serbia and Montenegro)","sh_CS"),
        SR_CS(true,false,"Serbian (Serbia and Montenegro)","sr_CS"),
        SK(true,false,"Slovak","sk"),
        SK_SK(true,false,"Slovak (Slovakia)","sk_SK"),
        SL(true,false,"Slovenian","sl"),
        SL_SI(true,false,"Slovenian (Slovenia)","sl_SI"),
        ES(true,false,"Spanish","es"),
        ES_AR(true,false,"Spanish (Argentina)","es_AR"),
        ES_BO(true,false,"Spanish (Bolivia)","es_BO"),
        ES_CL(true,false,"Spanish (Chile)","es_CL"),
        ES_CO(true,false,"Spanish (Colombia)","es_CO"),
        ES_CR(true,false,"Spanish (Costa Rica)","es_CR"),
        ES_DO(true,false,"Spanish (Dominican Republic)","es_DO"),
        ES_EC(true,false,"Spanish (Ecuador)","es_EC"),
        ES_SV(true,false,"Spanish (El Salvador)","es_SV"),
        ES_GT(true,false,"Spanish (Guatemala)","es_GT"),
        ES_HN(true,false,"Spanish (Honduras)","es_HN"),
        ES_MX(true,false,"Spanish (Mexico)","es_MX"),
        ES_PA(true,false,"Spanish (Panama)","es_PA"),
        ES_PY(true,false,"Spanish (Paraguay)","es_PY"),
        ES_PE(true,false,"Spanish (Peru)","es_PE"),
        ES_PR(true,false,"Spanish (Puerto Rico)","es_PR"),
        ES_ES(true,false,"Spanish (Spain)","es_ES"),
        ES_UY(true,false,"Spanish (Uruguay)","es_UY"),
        ES_VE(true,false,"Spanish (Venezuela)","es_VE"),
        SV(true,false,"Swedish","sv"),
        SV_SE(true,false,"Swedish (Sweden)","sv_SE"),
        TL(true,false,"Tagalog","tl"),
        TL_PH(true,false,"Tagalog (Philippines)","tl_PH"),
        TG_TJ(true,false,"Tajik (Tajikistan)","tg_TJ"),
        TH(true,false,"Thai","th"),
        TH_TH(true,false,"Thai (Thailand)","th_TH"),
        TR(true,false,"Turkish","tr"),
        UK(true,false,"Ukrainian","uk"),
        UK_UA(true,false,"Ukrainian (Ukraine)","uk_UA"),
        UR_PK(true,false,"Urdu (Pakistan)","ur_PK"),
        VI(true,false,"Vietnamese","vi"),
        VI_VN(true,false,"Vietnamese (Vietnam)","vi_VN"),
        CY(true,false,"Welsh","cy"),
        CY_GB(true,false,"Welsh (United Kingdom)","cy_GB"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private LocaleSidKeyEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
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

        public static LocaleSidKeyEnum fromValue(String value) {
            if (value == null) return null;

            for (LocaleSidKeyEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    

    /**
     * Java com.force.sdk.streaming.model for the EmailEncodingKey picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum EmailEncodingKeyEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        UTF_8(true,false,"Unicode (UTF-8)","UTF-8"),
        ISO_8859_1(true,false,"General US & Western Europe (ISO-8859-1, ISO-LATIN-1)","ISO-8859-1"),
        SHIFT_JIS(true,false,"Japanese (Shift-JIS)","Shift_JIS"),
        ISO_2022_JP(true,false,"Japanese (JIS)","ISO-2022-JP"),
        EUC_JP(true,false,"Japanese (EUC)","EUC-JP"),
        KS_C_5601_1987(true,false,"Korean (ks_c_5601-1987)","ks_c_5601-1987"),
        BIG5(true,false,"Traditional Chinese (Big5)","Big5"),
        GB2312(true,false,"Simplified Chinese (GB2312)","GB2312"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private EmailEncodingKeyEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
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

        public static EmailEncodingKeyEnum fromValue(String value) {
            if (value == null) return null;

            for (EmailEncodingKeyEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    

    /**
     * Java com.force.sdk.streaming.model for the UserType picklist.
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
    

    /**
     * Java com.force.sdk.streaming.model for the LanguageLocaleKey picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum LanguageLocaleKeyEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        EN_US(true,false,"English","en_US"),
        DE(true,false,"German","de"),
        ES(true,false,"Spanish","es"),
        FR(true,false,"French","fr"),
        IT(true,false,"Italian","it"),
        JA(true,false,"Japanese","ja"),
        SV(true,false,"Swedish","sv"),
        KO(true,false,"Korean","ko"),
        ZH_TW(true,false,"Chinese (Traditional)","zh_TW"),
        ZH_CN(true,false,"Chinese (Simplified)","zh_CN"),
        PT_BR(true,false,"Portuguese (Brazilian)","pt_BR"),
        NL_NL(true,false,"Dutch","nl_NL"),
        DA(true,false,"Danish","da"),
        TH(true,false,"Thai","th"),
        FI(true,false,"Finnish","fi"),
        RU(true,false,"Russian","ru"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private LanguageLocaleKeyEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
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

        public static LanguageLocaleKeyEnum fromValue(String value) {
            if (value == null) return null;

            for (LanguageLocaleKeyEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    

    /**
     * Java com.force.sdk.streaming.model for the DigestFrequency picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum DigestFrequencyEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        DAILY(true,false,"Daily","D"),
        WEEKLY(true,false,"Weekly","W"),
        NEVER(true,true,"Never","N"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private DigestFrequencyEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
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

        public static DigestFrequencyEnum fromValue(String value) {
            if (value == null) return null;

            for (DigestFrequencyEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    

    /**
     * Java com.force.sdk.streaming.model for the DefaultGroupNotificationFrequency picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum DefaultGroupNotificationFrequencyEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        EMAIL_ON_EACH_POST(true,false,"Email on Each Post","P"),
        DAILY_DIGESTS(true,false,"Daily Digests","D"),
        WEEKLY_DIGESTS(true,false,"Weekly Digests","W"),
        NEVER(true,true,"Never","N"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private DefaultGroupNotificationFrequencyEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
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

        public static DefaultGroupNotificationFrequencyEnum fromValue(String value) {
            if (value == null) return null;

            for (DefaultGroupNotificationFrequencyEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    

}