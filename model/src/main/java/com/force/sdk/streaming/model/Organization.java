
package com.force.sdk.streaming.model;

import javax.persistence.*;

/**
 * Java model for the Force.com Organization object.
 *
 * For this class, the following operations are available
 * via Force.com JPA:
 *
 *     Create : false
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
@Table(name="Organization")
@Entity(name="Organization")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class Organization extends com.force.sdk.jpa.model.BaseForceObject {

    public static final String KEY_PREFIX = "00D";


    protected String name;
    protected String division;
    protected String street;
    protected String city;
    protected String state;
    protected String postalCode;
    protected String country;
    protected String phone;
    protected String fax;
    protected String primaryContact;
    protected DefaultLocaleSidKeyEnum defaultLocaleSidKey;
    protected LanguageLocaleKeyEnum languageLocaleKey;
    protected boolean receivesInfoEmails;
    protected boolean receivesAdminInfoEmails;
    protected boolean preferencesRequireOpportunityProducts;
    protected int fiscalYearStartMonth;
    protected boolean usesStartDateAsFiscalYearName;
    protected DefaultAccountAccessEnum defaultAccountAccess;
    protected DefaultContactAccessEnum defaultContactAccess;
    protected DefaultOpportunityAccessEnum defaultOpportunityAccess;
    protected DefaultLeadAccessEnum defaultLeadAccess;
    protected DefaultCaseAccessEnum defaultCaseAccess;
    protected DefaultCalendarAccessEnum defaultCalendarAccess;
    protected DefaultPricebookAccessEnum defaultPricebookAccess;
    protected DefaultCampaignAccessEnum defaultCampaignAccess;
    protected java.util.Calendar systemModstamp;
    protected String complianceBccEmail;
    protected UiSkinEnum uiSkin;
    protected java.util.Calendar trialExpirationDate;
    protected OrganizationTypeEnum organizationType;
    protected String webToCaseDefaultOrigin;
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
    
    public String getDivision() {
        return this.division;
    }
    
    public void setDivision(String division) {
        this.division = division;
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
    
    public String getPrimaryContact() {
        return this.primaryContact;
    }
    
    public void setPrimaryContact(String primaryContact) {
        this.primaryContact = primaryContact;
    }
    
    @Enumerated(value=EnumType.STRING)
    public DefaultLocaleSidKeyEnum getDefaultLocaleSidKey() {
        return this.defaultLocaleSidKey;
    }
    
    @Basic(optional=false)
    public void setDefaultLocaleSidKey(DefaultLocaleSidKeyEnum defaultLocaleSidKey) {
        this.defaultLocaleSidKey = defaultLocaleSidKey;
    }
    
    @Enumerated(value=EnumType.STRING)
    public LanguageLocaleKeyEnum getLanguageLocaleKey() {
        return this.languageLocaleKey;
    }
    
    @Basic(optional=false)
    public void setLanguageLocaleKey(LanguageLocaleKeyEnum languageLocaleKey) {
        this.languageLocaleKey = languageLocaleKey;
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
    
    public boolean getPreferencesRequireOpportunityProducts() {
        return this.preferencesRequireOpportunityProducts;
    }
    
    @Basic(optional=false)
    public void setPreferencesRequireOpportunityProducts(boolean preferencesRequireOpportunityProducts) {
        this.preferencesRequireOpportunityProducts = preferencesRequireOpportunityProducts;
    }
    
    public int getFiscalYearStartMonth() {
        return this.fiscalYearStartMonth;
    }
    
    public void setFiscalYearStartMonth(int fiscalYearStartMonth) {
        this.fiscalYearStartMonth = fiscalYearStartMonth;
    }
    
    public boolean getUsesStartDateAsFiscalYearName() {
        return this.usesStartDateAsFiscalYearName;
    }
    
    public void setUsesStartDateAsFiscalYearName(boolean usesStartDateAsFiscalYearName) {
        this.usesStartDateAsFiscalYearName = usesStartDateAsFiscalYearName;
    }
    
    @Enumerated(value=EnumType.STRING)
    public DefaultAccountAccessEnum getDefaultAccountAccess() {
        return this.defaultAccountAccess;
    }
    
    public void setDefaultAccountAccess(DefaultAccountAccessEnum defaultAccountAccess) {
        this.defaultAccountAccess = defaultAccountAccess;
    }
    
    @Enumerated(value=EnumType.STRING)
    public DefaultContactAccessEnum getDefaultContactAccess() {
        return this.defaultContactAccess;
    }
    
    public void setDefaultContactAccess(DefaultContactAccessEnum defaultContactAccess) {
        this.defaultContactAccess = defaultContactAccess;
    }
    
    @Enumerated(value=EnumType.STRING)
    public DefaultOpportunityAccessEnum getDefaultOpportunityAccess() {
        return this.defaultOpportunityAccess;
    }
    
    public void setDefaultOpportunityAccess(DefaultOpportunityAccessEnum defaultOpportunityAccess) {
        this.defaultOpportunityAccess = defaultOpportunityAccess;
    }
    
    @Enumerated(value=EnumType.STRING)
    public DefaultLeadAccessEnum getDefaultLeadAccess() {
        return this.defaultLeadAccess;
    }
    
    public void setDefaultLeadAccess(DefaultLeadAccessEnum defaultLeadAccess) {
        this.defaultLeadAccess = defaultLeadAccess;
    }
    
    @Enumerated(value=EnumType.STRING)
    public DefaultCaseAccessEnum getDefaultCaseAccess() {
        return this.defaultCaseAccess;
    }
    
    public void setDefaultCaseAccess(DefaultCaseAccessEnum defaultCaseAccess) {
        this.defaultCaseAccess = defaultCaseAccess;
    }
    
    @Enumerated(value=EnumType.STRING)
    public DefaultCalendarAccessEnum getDefaultCalendarAccess() {
        return this.defaultCalendarAccess;
    }
    
    public void setDefaultCalendarAccess(DefaultCalendarAccessEnum defaultCalendarAccess) {
        this.defaultCalendarAccess = defaultCalendarAccess;
    }
    
    @Enumerated(value=EnumType.STRING)
    public DefaultPricebookAccessEnum getDefaultPricebookAccess() {
        return this.defaultPricebookAccess;
    }
    
    public void setDefaultPricebookAccess(DefaultPricebookAccessEnum defaultPricebookAccess) {
        this.defaultPricebookAccess = defaultPricebookAccess;
    }
    
    @Enumerated(value=EnumType.STRING)
    public DefaultCampaignAccessEnum getDefaultCampaignAccess() {
        return this.defaultCampaignAccess;
    }
    
    public void setDefaultCampaignAccess(DefaultCampaignAccessEnum defaultCampaignAccess) {
        this.defaultCampaignAccess = defaultCampaignAccess;
    }
    
    public java.util.Calendar getSystemModstamp() {
        return this.systemModstamp;
    }
    
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }
    
    public String getComplianceBccEmail() {
        return this.complianceBccEmail;
    }
    
    public void setComplianceBccEmail(String complianceBccEmail) {
        this.complianceBccEmail = complianceBccEmail;
    }
    
    @Enumerated(value=EnumType.STRING)
    public UiSkinEnum getUiSkin() {
        return this.uiSkin;
    }
    
    public void setUiSkin(UiSkinEnum uiSkin) {
        this.uiSkin = uiSkin;
    }
    
    public java.util.Calendar getTrialExpirationDate() {
        return this.trialExpirationDate;
    }
    
    public void setTrialExpirationDate(java.util.Calendar trialExpirationDate) {
        this.trialExpirationDate = trialExpirationDate;
    }
    
    @Enumerated(value=EnumType.STRING)
    public OrganizationTypeEnum getOrganizationType() {
        return this.organizationType;
    }
    
    public void setOrganizationType(OrganizationTypeEnum organizationType) {
        this.organizationType = organizationType;
    }
    
    public String getWebToCaseDefaultOrigin() {
        return this.webToCaseDefaultOrigin;
    }
    
    public void setWebToCaseDefaultOrigin(String webToCaseDefaultOrigin) {
        this.webToCaseDefaultOrigin = webToCaseDefaultOrigin;
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
    
    

    /**
     * Java model for the DefaultLocaleSidKey picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum DefaultLocaleSidKeyEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

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

        private DefaultLocaleSidKeyEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
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

        public static DefaultLocaleSidKeyEnum fromValue(String value) {
            if (value == null) return null;

            for (DefaultLocaleSidKeyEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    

    /**
     * Java model for the LanguageLocaleKey picklist.
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
     * Java model for the DefaultAccountAccess picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum DefaultAccountAccessEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        NONE(true,false,"Private","None"),
        READ(true,false,"Read Only","Read"),
        EDIT(true,false,"Read/Write","Edit"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private DefaultAccountAccessEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
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

        public static DefaultAccountAccessEnum fromValue(String value) {
            if (value == null) return null;

            for (DefaultAccountAccessEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    

    /**
     * Java model for the DefaultContactAccess picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum DefaultContactAccessEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        NONE(true,false,"Private","None"),
        READ(true,false,"Read Only","Read"),
        EDIT(true,false,"Read/Write","Edit"),
        CONTROLLEDBYPARENT(true,false,"Controlled By Parent","ControlledByParent"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private DefaultContactAccessEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
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

        public static DefaultContactAccessEnum fromValue(String value) {
            if (value == null) return null;

            for (DefaultContactAccessEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    

    /**
     * Java model for the DefaultOpportunityAccess picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum DefaultOpportunityAccessEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        NONE(true,false,"Private","None"),
        READ(true,false,"Read Only","Read"),
        EDIT(true,false,"Read/Write","Edit"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private DefaultOpportunityAccessEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
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

        public static DefaultOpportunityAccessEnum fromValue(String value) {
            if (value == null) return null;

            for (DefaultOpportunityAccessEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    

    /**
     * Java model for the DefaultLeadAccess picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum DefaultLeadAccessEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        NONE(true,false,"Private","None"),
        READ(true,false,"Read Only","Read"),
        EDIT(true,false,"Read/Write","Edit"),
        READEDITTRANSFER(true,false,"Read/Write/Transfer","ReadEditTransfer"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private DefaultLeadAccessEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
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

        public static DefaultLeadAccessEnum fromValue(String value) {
            if (value == null) return null;

            for (DefaultLeadAccessEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    

    /**
     * Java model for the DefaultCaseAccess picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum DefaultCaseAccessEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        NONE(true,false,"Private","None"),
        READ(true,false,"Read Only","Read"),
        EDIT(true,false,"Read/Write","Edit"),
        READEDITTRANSFER(true,false,"Read/Write/Transfer","ReadEditTransfer"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private DefaultCaseAccessEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
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

        public static DefaultCaseAccessEnum fromValue(String value) {
            if (value == null) return null;

            for (DefaultCaseAccessEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    

    /**
     * Java model for the DefaultCalendarAccess picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum DefaultCalendarAccessEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        HIDEDETAILS(true,false,"Hide Details","HideDetails"),
        HIDEDETAILSINSERT(true,true,"Hide Details and Add Events","HideDetailsInsert"),
        SHOWDETAILS(true,false,"Show Details","ShowDetails"),
        SHOWDETAILSINSERT(true,false,"Show Details and Add Events","ShowDetailsInsert"),
        ALLOWEDITS(true,false,"Full Access","AllowEdits"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private DefaultCalendarAccessEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
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

        public static DefaultCalendarAccessEnum fromValue(String value) {
            if (value == null) return null;

            for (DefaultCalendarAccessEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    

    /**
     * Java model for the DefaultPricebookAccess picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum DefaultPricebookAccessEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        NONE(true,false,"No Access","None"),
        READ(true,false,"View Only","Read"),
        READSELECT(true,false,"Use","ReadSelect"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private DefaultPricebookAccessEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
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

        public static DefaultPricebookAccessEnum fromValue(String value) {
            if (value == null) return null;

            for (DefaultPricebookAccessEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    

    /**
     * Java model for the DefaultCampaignAccess picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum DefaultCampaignAccessEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        NONE(true,false,"Private","None"),
        READ(true,false,"Read Only","Read"),
        EDIT(true,false,"Read/Write","Edit"),
        ALL(true,false,"Owner","All"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private DefaultCampaignAccessEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
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

        public static DefaultCampaignAccessEnum fromValue(String value) {
            if (value == null) return null;

            for (DefaultCampaignAccessEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    

    /**
     * Java model for the UiSkin picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum UiSkinEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        THEME1(true,false,"salesforce.com Classic","Theme1"),
        THEME2(true,false,"salesforce.com","Theme2"),
        PORTALDEFAULT(true,false,"Portal Default","PortalDefault"),
        WEBSTORE(true,false,"Webstore","Webstore"),
        THEME3(true,true,"Aloha","Theme3"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private UiSkinEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
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

        public static UiSkinEnum fromValue(String value) {
            if (value == null) return null;

            for (UiSkinEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    

    /**
     * Java model for the OrganizationType picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum OrganizationTypeEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        TEAM_EDITION(true,false,null,"Team Edition"),
        PROFESSIONAL_EDITION(true,false,null,"Professional Edition"),
        ENTERPRISE_EDITION(true,false,null,"Enterprise Edition"),
        DEVELOPER_EDITION(true,false,null,"Developer Edition"),
        PERSONAL_EDITION(true,false,null,"Personal Edition"),
        UNLIMITED_EDITION(true,false,null,"Unlimited Edition"),
        CONTACT_MANAGER_EDITION(true,false,null,"Contact Manager Edition"),
        BASE_EDITION(true,false,null,"Base Edition"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private OrganizationTypeEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
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

        public static OrganizationTypeEnum fromValue(String value) {
            if (value == null) return null;

            for (OrganizationTypeEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    

}