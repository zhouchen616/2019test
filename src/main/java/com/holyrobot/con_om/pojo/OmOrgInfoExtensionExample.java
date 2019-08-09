package com.holyrobot.con_om.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OmOrgInfoExtensionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OmOrgInfoExtensionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLogoIsNull() {
            addCriterion("Logo is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("Logo is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(String value) {
            addCriterion("Logo =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("Logo <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(String value) {
            addCriterion("Logo >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("Logo >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(String value) {
            addCriterion("Logo <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("Logo <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLike(String value) {
            addCriterion("Logo like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotLike(String value) {
            addCriterion("Logo not like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<String> values) {
            addCriterion("Logo in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("Logo not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("Logo between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("Logo not between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andTravelagencynameIsNull() {
            addCriterion("TravelAgencyName is null");
            return (Criteria) this;
        }

        public Criteria andTravelagencynameIsNotNull() {
            addCriterion("TravelAgencyName is not null");
            return (Criteria) this;
        }

        public Criteria andTravelagencynameEqualTo(String value) {
            addCriterion("TravelAgencyName =", value, "travelagencyname");
            return (Criteria) this;
        }

        public Criteria andTravelagencynameNotEqualTo(String value) {
            addCriterion("TravelAgencyName <>", value, "travelagencyname");
            return (Criteria) this;
        }

        public Criteria andTravelagencynameGreaterThan(String value) {
            addCriterion("TravelAgencyName >", value, "travelagencyname");
            return (Criteria) this;
        }

        public Criteria andTravelagencynameGreaterThanOrEqualTo(String value) {
            addCriterion("TravelAgencyName >=", value, "travelagencyname");
            return (Criteria) this;
        }

        public Criteria andTravelagencynameLessThan(String value) {
            addCriterion("TravelAgencyName <", value, "travelagencyname");
            return (Criteria) this;
        }

        public Criteria andTravelagencynameLessThanOrEqualTo(String value) {
            addCriterion("TravelAgencyName <=", value, "travelagencyname");
            return (Criteria) this;
        }

        public Criteria andTravelagencynameLike(String value) {
            addCriterion("TravelAgencyName like", value, "travelagencyname");
            return (Criteria) this;
        }

        public Criteria andTravelagencynameNotLike(String value) {
            addCriterion("TravelAgencyName not like", value, "travelagencyname");
            return (Criteria) this;
        }

        public Criteria andTravelagencynameIn(List<String> values) {
            addCriterion("TravelAgencyName in", values, "travelagencyname");
            return (Criteria) this;
        }

        public Criteria andTravelagencynameNotIn(List<String> values) {
            addCriterion("TravelAgencyName not in", values, "travelagencyname");
            return (Criteria) this;
        }

        public Criteria andTravelagencynameBetween(String value1, String value2) {
            addCriterion("TravelAgencyName between", value1, value2, "travelagencyname");
            return (Criteria) this;
        }

        public Criteria andTravelagencynameNotBetween(String value1, String value2) {
            addCriterion("TravelAgencyName not between", value1, value2, "travelagencyname");
            return (Criteria) this;
        }

        public Criteria andTravelagentlocationIsNull() {
            addCriterion("TravelAgentLocation is null");
            return (Criteria) this;
        }

        public Criteria andTravelagentlocationIsNotNull() {
            addCriterion("TravelAgentLocation is not null");
            return (Criteria) this;
        }

        public Criteria andTravelagentlocationEqualTo(String value) {
            addCriterion("TravelAgentLocation =", value, "travelagentlocation");
            return (Criteria) this;
        }

        public Criteria andTravelagentlocationNotEqualTo(String value) {
            addCriterion("TravelAgentLocation <>", value, "travelagentlocation");
            return (Criteria) this;
        }

        public Criteria andTravelagentlocationGreaterThan(String value) {
            addCriterion("TravelAgentLocation >", value, "travelagentlocation");
            return (Criteria) this;
        }

        public Criteria andTravelagentlocationGreaterThanOrEqualTo(String value) {
            addCriterion("TravelAgentLocation >=", value, "travelagentlocation");
            return (Criteria) this;
        }

        public Criteria andTravelagentlocationLessThan(String value) {
            addCriterion("TravelAgentLocation <", value, "travelagentlocation");
            return (Criteria) this;
        }

        public Criteria andTravelagentlocationLessThanOrEqualTo(String value) {
            addCriterion("TravelAgentLocation <=", value, "travelagentlocation");
            return (Criteria) this;
        }

        public Criteria andTravelagentlocationLike(String value) {
            addCriterion("TravelAgentLocation like", value, "travelagentlocation");
            return (Criteria) this;
        }

        public Criteria andTravelagentlocationNotLike(String value) {
            addCriterion("TravelAgentLocation not like", value, "travelagentlocation");
            return (Criteria) this;
        }

        public Criteria andTravelagentlocationIn(List<String> values) {
            addCriterion("TravelAgentLocation in", values, "travelagentlocation");
            return (Criteria) this;
        }

        public Criteria andTravelagentlocationNotIn(List<String> values) {
            addCriterion("TravelAgentLocation not in", values, "travelagentlocation");
            return (Criteria) this;
        }

        public Criteria andTravelagentlocationBetween(String value1, String value2) {
            addCriterion("TravelAgentLocation between", value1, value2, "travelagentlocation");
            return (Criteria) this;
        }

        public Criteria andTravelagentlocationNotBetween(String value1, String value2) {
            addCriterion("TravelAgentLocation not between", value1, value2, "travelagentlocation");
            return (Criteria) this;
        }

        public Criteria andCorporationnameIsNull() {
            addCriterion("CorporationName is null");
            return (Criteria) this;
        }

        public Criteria andCorporationnameIsNotNull() {
            addCriterion("CorporationName is not null");
            return (Criteria) this;
        }

        public Criteria andCorporationnameEqualTo(String value) {
            addCriterion("CorporationName =", value, "corporationname");
            return (Criteria) this;
        }

        public Criteria andCorporationnameNotEqualTo(String value) {
            addCriterion("CorporationName <>", value, "corporationname");
            return (Criteria) this;
        }

        public Criteria andCorporationnameGreaterThan(String value) {
            addCriterion("CorporationName >", value, "corporationname");
            return (Criteria) this;
        }

        public Criteria andCorporationnameGreaterThanOrEqualTo(String value) {
            addCriterion("CorporationName >=", value, "corporationname");
            return (Criteria) this;
        }

        public Criteria andCorporationnameLessThan(String value) {
            addCriterion("CorporationName <", value, "corporationname");
            return (Criteria) this;
        }

        public Criteria andCorporationnameLessThanOrEqualTo(String value) {
            addCriterion("CorporationName <=", value, "corporationname");
            return (Criteria) this;
        }

        public Criteria andCorporationnameLike(String value) {
            addCriterion("CorporationName like", value, "corporationname");
            return (Criteria) this;
        }

        public Criteria andCorporationnameNotLike(String value) {
            addCriterion("CorporationName not like", value, "corporationname");
            return (Criteria) this;
        }

        public Criteria andCorporationnameIn(List<String> values) {
            addCriterion("CorporationName in", values, "corporationname");
            return (Criteria) this;
        }

        public Criteria andCorporationnameNotIn(List<String> values) {
            addCriterion("CorporationName not in", values, "corporationname");
            return (Criteria) this;
        }

        public Criteria andCorporationnameBetween(String value1, String value2) {
            addCriterion("CorporationName between", value1, value2, "corporationname");
            return (Criteria) this;
        }

        public Criteria andCorporationnameNotBetween(String value1, String value2) {
            addCriterion("CorporationName not between", value1, value2, "corporationname");
            return (Criteria) this;
        }

        public Criteria andCorporationcardIsNull() {
            addCriterion("CorporationCard is null");
            return (Criteria) this;
        }

        public Criteria andCorporationcardIsNotNull() {
            addCriterion("CorporationCard is not null");
            return (Criteria) this;
        }

        public Criteria andCorporationcardEqualTo(String value) {
            addCriterion("CorporationCard =", value, "corporationcard");
            return (Criteria) this;
        }

        public Criteria andCorporationcardNotEqualTo(String value) {
            addCriterion("CorporationCard <>", value, "corporationcard");
            return (Criteria) this;
        }

        public Criteria andCorporationcardGreaterThan(String value) {
            addCriterion("CorporationCard >", value, "corporationcard");
            return (Criteria) this;
        }

        public Criteria andCorporationcardGreaterThanOrEqualTo(String value) {
            addCriterion("CorporationCard >=", value, "corporationcard");
            return (Criteria) this;
        }

        public Criteria andCorporationcardLessThan(String value) {
            addCriterion("CorporationCard <", value, "corporationcard");
            return (Criteria) this;
        }

        public Criteria andCorporationcardLessThanOrEqualTo(String value) {
            addCriterion("CorporationCard <=", value, "corporationcard");
            return (Criteria) this;
        }

        public Criteria andCorporationcardLike(String value) {
            addCriterion("CorporationCard like", value, "corporationcard");
            return (Criteria) this;
        }

        public Criteria andCorporationcardNotLike(String value) {
            addCriterion("CorporationCard not like", value, "corporationcard");
            return (Criteria) this;
        }

        public Criteria andCorporationcardIn(List<String> values) {
            addCriterion("CorporationCard in", values, "corporationcard");
            return (Criteria) this;
        }

        public Criteria andCorporationcardNotIn(List<String> values) {
            addCriterion("CorporationCard not in", values, "corporationcard");
            return (Criteria) this;
        }

        public Criteria andCorporationcardBetween(String value1, String value2) {
            addCriterion("CorporationCard between", value1, value2, "corporationcard");
            return (Criteria) this;
        }

        public Criteria andCorporationcardNotBetween(String value1, String value2) {
            addCriterion("CorporationCard not between", value1, value2, "corporationcard");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeIsNull() {
            addCriterion("SocialCreditCode is null");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeIsNotNull() {
            addCriterion("SocialCreditCode is not null");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeEqualTo(String value) {
            addCriterion("SocialCreditCode =", value, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeNotEqualTo(String value) {
            addCriterion("SocialCreditCode <>", value, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeGreaterThan(String value) {
            addCriterion("SocialCreditCode >", value, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeGreaterThanOrEqualTo(String value) {
            addCriterion("SocialCreditCode >=", value, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeLessThan(String value) {
            addCriterion("SocialCreditCode <", value, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeLessThanOrEqualTo(String value) {
            addCriterion("SocialCreditCode <=", value, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeLike(String value) {
            addCriterion("SocialCreditCode like", value, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeNotLike(String value) {
            addCriterion("SocialCreditCode not like", value, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeIn(List<String> values) {
            addCriterion("SocialCreditCode in", values, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeNotIn(List<String> values) {
            addCriterion("SocialCreditCode not in", values, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeBetween(String value1, String value2) {
            addCriterion("SocialCreditCode between", value1, value2, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeNotBetween(String value1, String value2) {
            addCriterion("SocialCreditCode not between", value1, value2, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andCorporationcardpathIsNull() {
            addCriterion("CorporationCardPath is null");
            return (Criteria) this;
        }

        public Criteria andCorporationcardpathIsNotNull() {
            addCriterion("CorporationCardPath is not null");
            return (Criteria) this;
        }

        public Criteria andCorporationcardpathEqualTo(String value) {
            addCriterion("CorporationCardPath =", value, "corporationcardpath");
            return (Criteria) this;
        }

        public Criteria andCorporationcardpathNotEqualTo(String value) {
            addCriterion("CorporationCardPath <>", value, "corporationcardpath");
            return (Criteria) this;
        }

        public Criteria andCorporationcardpathGreaterThan(String value) {
            addCriterion("CorporationCardPath >", value, "corporationcardpath");
            return (Criteria) this;
        }

        public Criteria andCorporationcardpathGreaterThanOrEqualTo(String value) {
            addCriterion("CorporationCardPath >=", value, "corporationcardpath");
            return (Criteria) this;
        }

        public Criteria andCorporationcardpathLessThan(String value) {
            addCriterion("CorporationCardPath <", value, "corporationcardpath");
            return (Criteria) this;
        }

        public Criteria andCorporationcardpathLessThanOrEqualTo(String value) {
            addCriterion("CorporationCardPath <=", value, "corporationcardpath");
            return (Criteria) this;
        }

        public Criteria andCorporationcardpathLike(String value) {
            addCriterion("CorporationCardPath like", value, "corporationcardpath");
            return (Criteria) this;
        }

        public Criteria andCorporationcardpathNotLike(String value) {
            addCriterion("CorporationCardPath not like", value, "corporationcardpath");
            return (Criteria) this;
        }

        public Criteria andCorporationcardpathIn(List<String> values) {
            addCriterion("CorporationCardPath in", values, "corporationcardpath");
            return (Criteria) this;
        }

        public Criteria andCorporationcardpathNotIn(List<String> values) {
            addCriterion("CorporationCardPath not in", values, "corporationcardpath");
            return (Criteria) this;
        }

        public Criteria andCorporationcardpathBetween(String value1, String value2) {
            addCriterion("CorporationCardPath between", value1, value2, "corporationcardpath");
            return (Criteria) this;
        }

        public Criteria andCorporationcardpathNotBetween(String value1, String value2) {
            addCriterion("CorporationCardPath not between", value1, value2, "corporationcardpath");
            return (Criteria) this;
        }

        public Criteria andBussinesslicencepathIsNull() {
            addCriterion("BussinessLicencePath is null");
            return (Criteria) this;
        }

        public Criteria andBussinesslicencepathIsNotNull() {
            addCriterion("BussinessLicencePath is not null");
            return (Criteria) this;
        }

        public Criteria andBussinesslicencepathEqualTo(String value) {
            addCriterion("BussinessLicencePath =", value, "bussinesslicencepath");
            return (Criteria) this;
        }

        public Criteria andBussinesslicencepathNotEqualTo(String value) {
            addCriterion("BussinessLicencePath <>", value, "bussinesslicencepath");
            return (Criteria) this;
        }

        public Criteria andBussinesslicencepathGreaterThan(String value) {
            addCriterion("BussinessLicencePath >", value, "bussinesslicencepath");
            return (Criteria) this;
        }

        public Criteria andBussinesslicencepathGreaterThanOrEqualTo(String value) {
            addCriterion("BussinessLicencePath >=", value, "bussinesslicencepath");
            return (Criteria) this;
        }

        public Criteria andBussinesslicencepathLessThan(String value) {
            addCriterion("BussinessLicencePath <", value, "bussinesslicencepath");
            return (Criteria) this;
        }

        public Criteria andBussinesslicencepathLessThanOrEqualTo(String value) {
            addCriterion("BussinessLicencePath <=", value, "bussinesslicencepath");
            return (Criteria) this;
        }

        public Criteria andBussinesslicencepathLike(String value) {
            addCriterion("BussinessLicencePath like", value, "bussinesslicencepath");
            return (Criteria) this;
        }

        public Criteria andBussinesslicencepathNotLike(String value) {
            addCriterion("BussinessLicencePath not like", value, "bussinesslicencepath");
            return (Criteria) this;
        }

        public Criteria andBussinesslicencepathIn(List<String> values) {
            addCriterion("BussinessLicencePath in", values, "bussinesslicencepath");
            return (Criteria) this;
        }

        public Criteria andBussinesslicencepathNotIn(List<String> values) {
            addCriterion("BussinessLicencePath not in", values, "bussinesslicencepath");
            return (Criteria) this;
        }

        public Criteria andBussinesslicencepathBetween(String value1, String value2) {
            addCriterion("BussinessLicencePath between", value1, value2, "bussinesslicencepath");
            return (Criteria) this;
        }

        public Criteria andBussinesslicencepathNotBetween(String value1, String value2) {
            addCriterion("BussinessLicencePath not between", value1, value2, "bussinesslicencepath");
            return (Criteria) this;
        }

        public Criteria andRegistercardIsNull() {
            addCriterion("RegisterCard is null");
            return (Criteria) this;
        }

        public Criteria andRegistercardIsNotNull() {
            addCriterion("RegisterCard is not null");
            return (Criteria) this;
        }

        public Criteria andRegistercardEqualTo(String value) {
            addCriterion("RegisterCard =", value, "registercard");
            return (Criteria) this;
        }

        public Criteria andRegistercardNotEqualTo(String value) {
            addCriterion("RegisterCard <>", value, "registercard");
            return (Criteria) this;
        }

        public Criteria andRegistercardGreaterThan(String value) {
            addCriterion("RegisterCard >", value, "registercard");
            return (Criteria) this;
        }

        public Criteria andRegistercardGreaterThanOrEqualTo(String value) {
            addCriterion("RegisterCard >=", value, "registercard");
            return (Criteria) this;
        }

        public Criteria andRegistercardLessThan(String value) {
            addCriterion("RegisterCard <", value, "registercard");
            return (Criteria) this;
        }

        public Criteria andRegistercardLessThanOrEqualTo(String value) {
            addCriterion("RegisterCard <=", value, "registercard");
            return (Criteria) this;
        }

        public Criteria andRegistercardLike(String value) {
            addCriterion("RegisterCard like", value, "registercard");
            return (Criteria) this;
        }

        public Criteria andRegistercardNotLike(String value) {
            addCriterion("RegisterCard not like", value, "registercard");
            return (Criteria) this;
        }

        public Criteria andRegistercardIn(List<String> values) {
            addCriterion("RegisterCard in", values, "registercard");
            return (Criteria) this;
        }

        public Criteria andRegistercardNotIn(List<String> values) {
            addCriterion("RegisterCard not in", values, "registercard");
            return (Criteria) this;
        }

        public Criteria andRegistercardBetween(String value1, String value2) {
            addCriterion("RegisterCard between", value1, value2, "registercard");
            return (Criteria) this;
        }

        public Criteria andRegistercardNotBetween(String value1, String value2) {
            addCriterion("RegisterCard not between", value1, value2, "registercard");
            return (Criteria) this;
        }

        public Criteria andRegistercardpathIsNull() {
            addCriterion("RegisterCardPath is null");
            return (Criteria) this;
        }

        public Criteria andRegistercardpathIsNotNull() {
            addCriterion("RegisterCardPath is not null");
            return (Criteria) this;
        }

        public Criteria andRegistercardpathEqualTo(String value) {
            addCriterion("RegisterCardPath =", value, "registercardpath");
            return (Criteria) this;
        }

        public Criteria andRegistercardpathNotEqualTo(String value) {
            addCriterion("RegisterCardPath <>", value, "registercardpath");
            return (Criteria) this;
        }

        public Criteria andRegistercardpathGreaterThan(String value) {
            addCriterion("RegisterCardPath >", value, "registercardpath");
            return (Criteria) this;
        }

        public Criteria andRegistercardpathGreaterThanOrEqualTo(String value) {
            addCriterion("RegisterCardPath >=", value, "registercardpath");
            return (Criteria) this;
        }

        public Criteria andRegistercardpathLessThan(String value) {
            addCriterion("RegisterCardPath <", value, "registercardpath");
            return (Criteria) this;
        }

        public Criteria andRegistercardpathLessThanOrEqualTo(String value) {
            addCriterion("RegisterCardPath <=", value, "registercardpath");
            return (Criteria) this;
        }

        public Criteria andRegistercardpathLike(String value) {
            addCriterion("RegisterCardPath like", value, "registercardpath");
            return (Criteria) this;
        }

        public Criteria andRegistercardpathNotLike(String value) {
            addCriterion("RegisterCardPath not like", value, "registercardpath");
            return (Criteria) this;
        }

        public Criteria andRegistercardpathIn(List<String> values) {
            addCriterion("RegisterCardPath in", values, "registercardpath");
            return (Criteria) this;
        }

        public Criteria andRegistercardpathNotIn(List<String> values) {
            addCriterion("RegisterCardPath not in", values, "registercardpath");
            return (Criteria) this;
        }

        public Criteria andRegistercardpathBetween(String value1, String value2) {
            addCriterion("RegisterCardPath between", value1, value2, "registercardpath");
            return (Criteria) this;
        }

        public Criteria andRegistercardpathNotBetween(String value1, String value2) {
            addCriterion("RegisterCardPath not between", value1, value2, "registercardpath");
            return (Criteria) this;
        }

        public Criteria andCreateddateIsNull() {
            addCriterion("CreatedDate is null");
            return (Criteria) this;
        }

        public Criteria andCreateddateIsNotNull() {
            addCriterion("CreatedDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreateddateEqualTo(Date value) {
            addCriterion("CreatedDate =", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateNotEqualTo(Date value) {
            addCriterion("CreatedDate <>", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateGreaterThan(Date value) {
            addCriterion("CreatedDate >", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateGreaterThanOrEqualTo(Date value) {
            addCriterion("CreatedDate >=", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateLessThan(Date value) {
            addCriterion("CreatedDate <", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateLessThanOrEqualTo(Date value) {
            addCriterion("CreatedDate <=", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateIn(List<Date> values) {
            addCriterion("CreatedDate in", values, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateNotIn(List<Date> values) {
            addCriterion("CreatedDate not in", values, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateBetween(Date value1, Date value2) {
            addCriterion("CreatedDate between", value1, value2, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateNotBetween(Date value1, Date value2) {
            addCriterion("CreatedDate not between", value1, value2, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIsNull() {
            addCriterion("CreatedBy is null");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIsNotNull() {
            addCriterion("CreatedBy is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedbyEqualTo(String value) {
            addCriterion("CreatedBy =", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotEqualTo(String value) {
            addCriterion("CreatedBy <>", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyGreaterThan(String value) {
            addCriterion("CreatedBy >", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyGreaterThanOrEqualTo(String value) {
            addCriterion("CreatedBy >=", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLessThan(String value) {
            addCriterion("CreatedBy <", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLessThanOrEqualTo(String value) {
            addCriterion("CreatedBy <=", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLike(String value) {
            addCriterion("CreatedBy like", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotLike(String value) {
            addCriterion("CreatedBy not like", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIn(List<String> values) {
            addCriterion("CreatedBy in", values, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotIn(List<String> values) {
            addCriterion("CreatedBy not in", values, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyBetween(String value1, String value2) {
            addCriterion("CreatedBy between", value1, value2, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotBetween(String value1, String value2) {
            addCriterion("CreatedBy not between", value1, value2, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyidIsNull() {
            addCriterion("CreatedByID is null");
            return (Criteria) this;
        }

        public Criteria andCreatedbyidIsNotNull() {
            addCriterion("CreatedByID is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedbyidEqualTo(String value) {
            addCriterion("CreatedByID =", value, "createdbyid");
            return (Criteria) this;
        }

        public Criteria andCreatedbyidNotEqualTo(String value) {
            addCriterion("CreatedByID <>", value, "createdbyid");
            return (Criteria) this;
        }

        public Criteria andCreatedbyidGreaterThan(String value) {
            addCriterion("CreatedByID >", value, "createdbyid");
            return (Criteria) this;
        }

        public Criteria andCreatedbyidGreaterThanOrEqualTo(String value) {
            addCriterion("CreatedByID >=", value, "createdbyid");
            return (Criteria) this;
        }

        public Criteria andCreatedbyidLessThan(String value) {
            addCriterion("CreatedByID <", value, "createdbyid");
            return (Criteria) this;
        }

        public Criteria andCreatedbyidLessThanOrEqualTo(String value) {
            addCriterion("CreatedByID <=", value, "createdbyid");
            return (Criteria) this;
        }

        public Criteria andCreatedbyidLike(String value) {
            addCriterion("CreatedByID like", value, "createdbyid");
            return (Criteria) this;
        }

        public Criteria andCreatedbyidNotLike(String value) {
            addCriterion("CreatedByID not like", value, "createdbyid");
            return (Criteria) this;
        }

        public Criteria andCreatedbyidIn(List<String> values) {
            addCriterion("CreatedByID in", values, "createdbyid");
            return (Criteria) this;
        }

        public Criteria andCreatedbyidNotIn(List<String> values) {
            addCriterion("CreatedByID not in", values, "createdbyid");
            return (Criteria) this;
        }

        public Criteria andCreatedbyidBetween(String value1, String value2) {
            addCriterion("CreatedByID between", value1, value2, "createdbyid");
            return (Criteria) this;
        }

        public Criteria andCreatedbyidNotBetween(String value1, String value2) {
            addCriterion("CreatedByID not between", value1, value2, "createdbyid");
            return (Criteria) this;
        }

        public Criteria andReviseddateIsNull() {
            addCriterion("RevisedDate is null");
            return (Criteria) this;
        }

        public Criteria andReviseddateIsNotNull() {
            addCriterion("RevisedDate is not null");
            return (Criteria) this;
        }

        public Criteria andReviseddateEqualTo(Date value) {
            addCriterion("RevisedDate =", value, "reviseddate");
            return (Criteria) this;
        }

        public Criteria andReviseddateNotEqualTo(Date value) {
            addCriterion("RevisedDate <>", value, "reviseddate");
            return (Criteria) this;
        }

        public Criteria andReviseddateGreaterThan(Date value) {
            addCriterion("RevisedDate >", value, "reviseddate");
            return (Criteria) this;
        }

        public Criteria andReviseddateGreaterThanOrEqualTo(Date value) {
            addCriterion("RevisedDate >=", value, "reviseddate");
            return (Criteria) this;
        }

        public Criteria andReviseddateLessThan(Date value) {
            addCriterion("RevisedDate <", value, "reviseddate");
            return (Criteria) this;
        }

        public Criteria andReviseddateLessThanOrEqualTo(Date value) {
            addCriterion("RevisedDate <=", value, "reviseddate");
            return (Criteria) this;
        }

        public Criteria andReviseddateIn(List<Date> values) {
            addCriterion("RevisedDate in", values, "reviseddate");
            return (Criteria) this;
        }

        public Criteria andReviseddateNotIn(List<Date> values) {
            addCriterion("RevisedDate not in", values, "reviseddate");
            return (Criteria) this;
        }

        public Criteria andReviseddateBetween(Date value1, Date value2) {
            addCriterion("RevisedDate between", value1, value2, "reviseddate");
            return (Criteria) this;
        }

        public Criteria andReviseddateNotBetween(Date value1, Date value2) {
            addCriterion("RevisedDate not between", value1, value2, "reviseddate");
            return (Criteria) this;
        }

        public Criteria andRevisedbyIsNull() {
            addCriterion("RevisedBy is null");
            return (Criteria) this;
        }

        public Criteria andRevisedbyIsNotNull() {
            addCriterion("RevisedBy is not null");
            return (Criteria) this;
        }

        public Criteria andRevisedbyEqualTo(String value) {
            addCriterion("RevisedBy =", value, "revisedby");
            return (Criteria) this;
        }

        public Criteria andRevisedbyNotEqualTo(String value) {
            addCriterion("RevisedBy <>", value, "revisedby");
            return (Criteria) this;
        }

        public Criteria andRevisedbyGreaterThan(String value) {
            addCriterion("RevisedBy >", value, "revisedby");
            return (Criteria) this;
        }

        public Criteria andRevisedbyGreaterThanOrEqualTo(String value) {
            addCriterion("RevisedBy >=", value, "revisedby");
            return (Criteria) this;
        }

        public Criteria andRevisedbyLessThan(String value) {
            addCriterion("RevisedBy <", value, "revisedby");
            return (Criteria) this;
        }

        public Criteria andRevisedbyLessThanOrEqualTo(String value) {
            addCriterion("RevisedBy <=", value, "revisedby");
            return (Criteria) this;
        }

        public Criteria andRevisedbyLike(String value) {
            addCriterion("RevisedBy like", value, "revisedby");
            return (Criteria) this;
        }

        public Criteria andRevisedbyNotLike(String value) {
            addCriterion("RevisedBy not like", value, "revisedby");
            return (Criteria) this;
        }

        public Criteria andRevisedbyIn(List<String> values) {
            addCriterion("RevisedBy in", values, "revisedby");
            return (Criteria) this;
        }

        public Criteria andRevisedbyNotIn(List<String> values) {
            addCriterion("RevisedBy not in", values, "revisedby");
            return (Criteria) this;
        }

        public Criteria andRevisedbyBetween(String value1, String value2) {
            addCriterion("RevisedBy between", value1, value2, "revisedby");
            return (Criteria) this;
        }

        public Criteria andRevisedbyNotBetween(String value1, String value2) {
            addCriterion("RevisedBy not between", value1, value2, "revisedby");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNull() {
            addCriterion("OrgID is null");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNotNull() {
            addCriterion("OrgID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgidEqualTo(String value) {
            addCriterion("OrgID =", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotEqualTo(String value) {
            addCriterion("OrgID <>", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThan(String value) {
            addCriterion("OrgID >", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThanOrEqualTo(String value) {
            addCriterion("OrgID >=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThan(String value) {
            addCriterion("OrgID <", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThanOrEqualTo(String value) {
            addCriterion("OrgID <=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLike(String value) {
            addCriterion("OrgID like", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotLike(String value) {
            addCriterion("OrgID not like", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidIn(List<String> values) {
            addCriterion("OrgID in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotIn(List<String> values) {
            addCriterion("OrgID not in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidBetween(String value1, String value2) {
            addCriterion("OrgID between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotBetween(String value1, String value2) {
            addCriterion("OrgID not between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andTravelagencystatusIsNull() {
            addCriterion("TravelAgencyStatus is null");
            return (Criteria) this;
        }

        public Criteria andTravelagencystatusIsNotNull() {
            addCriterion("TravelAgencyStatus is not null");
            return (Criteria) this;
        }

        public Criteria andTravelagencystatusEqualTo(Integer value) {
            addCriterion("TravelAgencyStatus =", value, "travelagencystatus");
            return (Criteria) this;
        }

        public Criteria andTravelagencystatusNotEqualTo(Integer value) {
            addCriterion("TravelAgencyStatus <>", value, "travelagencystatus");
            return (Criteria) this;
        }

        public Criteria andTravelagencystatusGreaterThan(Integer value) {
            addCriterion("TravelAgencyStatus >", value, "travelagencystatus");
            return (Criteria) this;
        }

        public Criteria andTravelagencystatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("TravelAgencyStatus >=", value, "travelagencystatus");
            return (Criteria) this;
        }

        public Criteria andTravelagencystatusLessThan(Integer value) {
            addCriterion("TravelAgencyStatus <", value, "travelagencystatus");
            return (Criteria) this;
        }

        public Criteria andTravelagencystatusLessThanOrEqualTo(Integer value) {
            addCriterion("TravelAgencyStatus <=", value, "travelagencystatus");
            return (Criteria) this;
        }

        public Criteria andTravelagencystatusIn(List<Integer> values) {
            addCriterion("TravelAgencyStatus in", values, "travelagencystatus");
            return (Criteria) this;
        }

        public Criteria andTravelagencystatusNotIn(List<Integer> values) {
            addCriterion("TravelAgencyStatus not in", values, "travelagencystatus");
            return (Criteria) this;
        }

        public Criteria andTravelagencystatusBetween(Integer value1, Integer value2) {
            addCriterion("TravelAgencyStatus between", value1, value2, "travelagencystatus");
            return (Criteria) this;
        }

        public Criteria andTravelagencystatusNotBetween(Integer value1, Integer value2) {
            addCriterion("TravelAgencyStatus not between", value1, value2, "travelagencystatus");
            return (Criteria) this;
        }

        public Criteria andTacontactmobileIsNull() {
            addCriterion("TAContactMobile is null");
            return (Criteria) this;
        }

        public Criteria andTacontactmobileIsNotNull() {
            addCriterion("TAContactMobile is not null");
            return (Criteria) this;
        }

        public Criteria andTacontactmobileEqualTo(String value) {
            addCriterion("TAContactMobile =", value, "tacontactmobile");
            return (Criteria) this;
        }

        public Criteria andTacontactmobileNotEqualTo(String value) {
            addCriterion("TAContactMobile <>", value, "tacontactmobile");
            return (Criteria) this;
        }

        public Criteria andTacontactmobileGreaterThan(String value) {
            addCriterion("TAContactMobile >", value, "tacontactmobile");
            return (Criteria) this;
        }

        public Criteria andTacontactmobileGreaterThanOrEqualTo(String value) {
            addCriterion("TAContactMobile >=", value, "tacontactmobile");
            return (Criteria) this;
        }

        public Criteria andTacontactmobileLessThan(String value) {
            addCriterion("TAContactMobile <", value, "tacontactmobile");
            return (Criteria) this;
        }

        public Criteria andTacontactmobileLessThanOrEqualTo(String value) {
            addCriterion("TAContactMobile <=", value, "tacontactmobile");
            return (Criteria) this;
        }

        public Criteria andTacontactmobileLike(String value) {
            addCriterion("TAContactMobile like", value, "tacontactmobile");
            return (Criteria) this;
        }

        public Criteria andTacontactmobileNotLike(String value) {
            addCriterion("TAContactMobile not like", value, "tacontactmobile");
            return (Criteria) this;
        }

        public Criteria andTacontactmobileIn(List<String> values) {
            addCriterion("TAContactMobile in", values, "tacontactmobile");
            return (Criteria) this;
        }

        public Criteria andTacontactmobileNotIn(List<String> values) {
            addCriterion("TAContactMobile not in", values, "tacontactmobile");
            return (Criteria) this;
        }

        public Criteria andTacontactmobileBetween(String value1, String value2) {
            addCriterion("TAContactMobile between", value1, value2, "tacontactmobile");
            return (Criteria) this;
        }

        public Criteria andTacontactmobileNotBetween(String value1, String value2) {
            addCriterion("TAContactMobile not between", value1, value2, "tacontactmobile");
            return (Criteria) this;
        }

        public Criteria andTacontactIsNull() {
            addCriterion("TAContact is null");
            return (Criteria) this;
        }

        public Criteria andTacontactIsNotNull() {
            addCriterion("TAContact is not null");
            return (Criteria) this;
        }

        public Criteria andTacontactEqualTo(String value) {
            addCriterion("TAContact =", value, "tacontact");
            return (Criteria) this;
        }

        public Criteria andTacontactNotEqualTo(String value) {
            addCriterion("TAContact <>", value, "tacontact");
            return (Criteria) this;
        }

        public Criteria andTacontactGreaterThan(String value) {
            addCriterion("TAContact >", value, "tacontact");
            return (Criteria) this;
        }

        public Criteria andTacontactGreaterThanOrEqualTo(String value) {
            addCriterion("TAContact >=", value, "tacontact");
            return (Criteria) this;
        }

        public Criteria andTacontactLessThan(String value) {
            addCriterion("TAContact <", value, "tacontact");
            return (Criteria) this;
        }

        public Criteria andTacontactLessThanOrEqualTo(String value) {
            addCriterion("TAContact <=", value, "tacontact");
            return (Criteria) this;
        }

        public Criteria andTacontactLike(String value) {
            addCriterion("TAContact like", value, "tacontact");
            return (Criteria) this;
        }

        public Criteria andTacontactNotLike(String value) {
            addCriterion("TAContact not like", value, "tacontact");
            return (Criteria) this;
        }

        public Criteria andTacontactIn(List<String> values) {
            addCriterion("TAContact in", values, "tacontact");
            return (Criteria) this;
        }

        public Criteria andTacontactNotIn(List<String> values) {
            addCriterion("TAContact not in", values, "tacontact");
            return (Criteria) this;
        }

        public Criteria andTacontactBetween(String value1, String value2) {
            addCriterion("TAContact between", value1, value2, "tacontact");
            return (Criteria) this;
        }

        public Criteria andTacontactNotBetween(String value1, String value2) {
            addCriterion("TAContact not between", value1, value2, "tacontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactIsNull() {
            addCriterion("EmergencyContact is null");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactIsNotNull() {
            addCriterion("EmergencyContact is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactEqualTo(String value) {
            addCriterion("EmergencyContact =", value, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactNotEqualTo(String value) {
            addCriterion("EmergencyContact <>", value, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactGreaterThan(String value) {
            addCriterion("EmergencyContact >", value, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactGreaterThanOrEqualTo(String value) {
            addCriterion("EmergencyContact >=", value, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactLessThan(String value) {
            addCriterion("EmergencyContact <", value, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactLessThanOrEqualTo(String value) {
            addCriterion("EmergencyContact <=", value, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactLike(String value) {
            addCriterion("EmergencyContact like", value, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactNotLike(String value) {
            addCriterion("EmergencyContact not like", value, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactIn(List<String> values) {
            addCriterion("EmergencyContact in", values, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactNotIn(List<String> values) {
            addCriterion("EmergencyContact not in", values, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactBetween(String value1, String value2) {
            addCriterion("EmergencyContact between", value1, value2, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactNotBetween(String value1, String value2) {
            addCriterion("EmergencyContact not between", value1, value2, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencymobileIsNull() {
            addCriterion("EmergencyMobile is null");
            return (Criteria) this;
        }

        public Criteria andEmergencymobileIsNotNull() {
            addCriterion("EmergencyMobile is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencymobileEqualTo(String value) {
            addCriterion("EmergencyMobile =", value, "emergencymobile");
            return (Criteria) this;
        }

        public Criteria andEmergencymobileNotEqualTo(String value) {
            addCriterion("EmergencyMobile <>", value, "emergencymobile");
            return (Criteria) this;
        }

        public Criteria andEmergencymobileGreaterThan(String value) {
            addCriterion("EmergencyMobile >", value, "emergencymobile");
            return (Criteria) this;
        }

        public Criteria andEmergencymobileGreaterThanOrEqualTo(String value) {
            addCriterion("EmergencyMobile >=", value, "emergencymobile");
            return (Criteria) this;
        }

        public Criteria andEmergencymobileLessThan(String value) {
            addCriterion("EmergencyMobile <", value, "emergencymobile");
            return (Criteria) this;
        }

        public Criteria andEmergencymobileLessThanOrEqualTo(String value) {
            addCriterion("EmergencyMobile <=", value, "emergencymobile");
            return (Criteria) this;
        }

        public Criteria andEmergencymobileLike(String value) {
            addCriterion("EmergencyMobile like", value, "emergencymobile");
            return (Criteria) this;
        }

        public Criteria andEmergencymobileNotLike(String value) {
            addCriterion("EmergencyMobile not like", value, "emergencymobile");
            return (Criteria) this;
        }

        public Criteria andEmergencymobileIn(List<String> values) {
            addCriterion("EmergencyMobile in", values, "emergencymobile");
            return (Criteria) this;
        }

        public Criteria andEmergencymobileNotIn(List<String> values) {
            addCriterion("EmergencyMobile not in", values, "emergencymobile");
            return (Criteria) this;
        }

        public Criteria andEmergencymobileBetween(String value1, String value2) {
            addCriterion("EmergencyMobile between", value1, value2, "emergencymobile");
            return (Criteria) this;
        }

        public Criteria andEmergencymobileNotBetween(String value1, String value2) {
            addCriterion("EmergencyMobile not between", value1, value2, "emergencymobile");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleIsNull() {
            addCriterion("InvoiceTitle is null");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleIsNotNull() {
            addCriterion("InvoiceTitle is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleEqualTo(String value) {
            addCriterion("InvoiceTitle =", value, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleNotEqualTo(String value) {
            addCriterion("InvoiceTitle <>", value, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleGreaterThan(String value) {
            addCriterion("InvoiceTitle >", value, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleGreaterThanOrEqualTo(String value) {
            addCriterion("InvoiceTitle >=", value, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleLessThan(String value) {
            addCriterion("InvoiceTitle <", value, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleLessThanOrEqualTo(String value) {
            addCriterion("InvoiceTitle <=", value, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleLike(String value) {
            addCriterion("InvoiceTitle like", value, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleNotLike(String value) {
            addCriterion("InvoiceTitle not like", value, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleIn(List<String> values) {
            addCriterion("InvoiceTitle in", values, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleNotIn(List<String> values) {
            addCriterion("InvoiceTitle not in", values, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleBetween(String value1, String value2) {
            addCriterion("InvoiceTitle between", value1, value2, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleNotBetween(String value1, String value2) {
            addCriterion("InvoiceTitle not between", value1, value2, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceaddrIsNull() {
            addCriterion("InvoiceAddr is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceaddrIsNotNull() {
            addCriterion("InvoiceAddr is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceaddrEqualTo(String value) {
            addCriterion("InvoiceAddr =", value, "invoiceaddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceaddrNotEqualTo(String value) {
            addCriterion("InvoiceAddr <>", value, "invoiceaddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceaddrGreaterThan(String value) {
            addCriterion("InvoiceAddr >", value, "invoiceaddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceaddrGreaterThanOrEqualTo(String value) {
            addCriterion("InvoiceAddr >=", value, "invoiceaddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceaddrLessThan(String value) {
            addCriterion("InvoiceAddr <", value, "invoiceaddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceaddrLessThanOrEqualTo(String value) {
            addCriterion("InvoiceAddr <=", value, "invoiceaddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceaddrLike(String value) {
            addCriterion("InvoiceAddr like", value, "invoiceaddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceaddrNotLike(String value) {
            addCriterion("InvoiceAddr not like", value, "invoiceaddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceaddrIn(List<String> values) {
            addCriterion("InvoiceAddr in", values, "invoiceaddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceaddrNotIn(List<String> values) {
            addCriterion("InvoiceAddr not in", values, "invoiceaddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceaddrBetween(String value1, String value2) {
            addCriterion("InvoiceAddr between", value1, value2, "invoiceaddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceaddrNotBetween(String value1, String value2) {
            addCriterion("InvoiceAddr not between", value1, value2, "invoiceaddr");
            return (Criteria) this;
        }

        public Criteria andTaxnumberIsNull() {
            addCriterion("TaxNumber is null");
            return (Criteria) this;
        }

        public Criteria andTaxnumberIsNotNull() {
            addCriterion("TaxNumber is not null");
            return (Criteria) this;
        }

        public Criteria andTaxnumberEqualTo(String value) {
            addCriterion("TaxNumber =", value, "taxnumber");
            return (Criteria) this;
        }

        public Criteria andTaxnumberNotEqualTo(String value) {
            addCriterion("TaxNumber <>", value, "taxnumber");
            return (Criteria) this;
        }

        public Criteria andTaxnumberGreaterThan(String value) {
            addCriterion("TaxNumber >", value, "taxnumber");
            return (Criteria) this;
        }

        public Criteria andTaxnumberGreaterThanOrEqualTo(String value) {
            addCriterion("TaxNumber >=", value, "taxnumber");
            return (Criteria) this;
        }

        public Criteria andTaxnumberLessThan(String value) {
            addCriterion("TaxNumber <", value, "taxnumber");
            return (Criteria) this;
        }

        public Criteria andTaxnumberLessThanOrEqualTo(String value) {
            addCriterion("TaxNumber <=", value, "taxnumber");
            return (Criteria) this;
        }

        public Criteria andTaxnumberLike(String value) {
            addCriterion("TaxNumber like", value, "taxnumber");
            return (Criteria) this;
        }

        public Criteria andTaxnumberNotLike(String value) {
            addCriterion("TaxNumber not like", value, "taxnumber");
            return (Criteria) this;
        }

        public Criteria andTaxnumberIn(List<String> values) {
            addCriterion("TaxNumber in", values, "taxnumber");
            return (Criteria) this;
        }

        public Criteria andTaxnumberNotIn(List<String> values) {
            addCriterion("TaxNumber not in", values, "taxnumber");
            return (Criteria) this;
        }

        public Criteria andTaxnumberBetween(String value1, String value2) {
            addCriterion("TaxNumber between", value1, value2, "taxnumber");
            return (Criteria) this;
        }

        public Criteria andTaxnumberNotBetween(String value1, String value2) {
            addCriterion("TaxNumber not between", value1, value2, "taxnumber");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("Address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("Address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("Address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("Address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("Address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("Address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("Address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("Address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("Address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("Address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("Address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("Address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("Address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("Address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("Phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("Phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("Phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("Phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("Phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("Phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("Phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("Phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("Phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("Phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("Phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("Phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("Phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("Phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andOpeningbankIsNull() {
            addCriterion("OpeningBank is null");
            return (Criteria) this;
        }

        public Criteria andOpeningbankIsNotNull() {
            addCriterion("OpeningBank is not null");
            return (Criteria) this;
        }

        public Criteria andOpeningbankEqualTo(String value) {
            addCriterion("OpeningBank =", value, "openingbank");
            return (Criteria) this;
        }

        public Criteria andOpeningbankNotEqualTo(String value) {
            addCriterion("OpeningBank <>", value, "openingbank");
            return (Criteria) this;
        }

        public Criteria andOpeningbankGreaterThan(String value) {
            addCriterion("OpeningBank >", value, "openingbank");
            return (Criteria) this;
        }

        public Criteria andOpeningbankGreaterThanOrEqualTo(String value) {
            addCriterion("OpeningBank >=", value, "openingbank");
            return (Criteria) this;
        }

        public Criteria andOpeningbankLessThan(String value) {
            addCriterion("OpeningBank <", value, "openingbank");
            return (Criteria) this;
        }

        public Criteria andOpeningbankLessThanOrEqualTo(String value) {
            addCriterion("OpeningBank <=", value, "openingbank");
            return (Criteria) this;
        }

        public Criteria andOpeningbankLike(String value) {
            addCriterion("OpeningBank like", value, "openingbank");
            return (Criteria) this;
        }

        public Criteria andOpeningbankNotLike(String value) {
            addCriterion("OpeningBank not like", value, "openingbank");
            return (Criteria) this;
        }

        public Criteria andOpeningbankIn(List<String> values) {
            addCriterion("OpeningBank in", values, "openingbank");
            return (Criteria) this;
        }

        public Criteria andOpeningbankNotIn(List<String> values) {
            addCriterion("OpeningBank not in", values, "openingbank");
            return (Criteria) this;
        }

        public Criteria andOpeningbankBetween(String value1, String value2) {
            addCriterion("OpeningBank between", value1, value2, "openingbank");
            return (Criteria) this;
        }

        public Criteria andOpeningbankNotBetween(String value1, String value2) {
            addCriterion("OpeningBank not between", value1, value2, "openingbank");
            return (Criteria) this;
        }

        public Criteria andBankcardnoIsNull() {
            addCriterion("BankCardNo is null");
            return (Criteria) this;
        }

        public Criteria andBankcardnoIsNotNull() {
            addCriterion("BankCardNo is not null");
            return (Criteria) this;
        }

        public Criteria andBankcardnoEqualTo(String value) {
            addCriterion("BankCardNo =", value, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardnoNotEqualTo(String value) {
            addCriterion("BankCardNo <>", value, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardnoGreaterThan(String value) {
            addCriterion("BankCardNo >", value, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardnoGreaterThanOrEqualTo(String value) {
            addCriterion("BankCardNo >=", value, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardnoLessThan(String value) {
            addCriterion("BankCardNo <", value, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardnoLessThanOrEqualTo(String value) {
            addCriterion("BankCardNo <=", value, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardnoLike(String value) {
            addCriterion("BankCardNo like", value, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardnoNotLike(String value) {
            addCriterion("BankCardNo not like", value, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardnoIn(List<String> values) {
            addCriterion("BankCardNo in", values, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardnoNotIn(List<String> values) {
            addCriterion("BankCardNo not in", values, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardnoBetween(String value1, String value2) {
            addCriterion("BankCardNo between", value1, value2, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardnoNotBetween(String value1, String value2) {
            addCriterion("BankCardNo not between", value1, value2, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andRegistercardreversepathIsNull() {
            addCriterion("RegisterCardReversePath is null");
            return (Criteria) this;
        }

        public Criteria andRegistercardreversepathIsNotNull() {
            addCriterion("RegisterCardReversePath is not null");
            return (Criteria) this;
        }

        public Criteria andRegistercardreversepathEqualTo(String value) {
            addCriterion("RegisterCardReversePath =", value, "registercardreversepath");
            return (Criteria) this;
        }

        public Criteria andRegistercardreversepathNotEqualTo(String value) {
            addCriterion("RegisterCardReversePath <>", value, "registercardreversepath");
            return (Criteria) this;
        }

        public Criteria andRegistercardreversepathGreaterThan(String value) {
            addCriterion("RegisterCardReversePath >", value, "registercardreversepath");
            return (Criteria) this;
        }

        public Criteria andRegistercardreversepathGreaterThanOrEqualTo(String value) {
            addCriterion("RegisterCardReversePath >=", value, "registercardreversepath");
            return (Criteria) this;
        }

        public Criteria andRegistercardreversepathLessThan(String value) {
            addCriterion("RegisterCardReversePath <", value, "registercardreversepath");
            return (Criteria) this;
        }

        public Criteria andRegistercardreversepathLessThanOrEqualTo(String value) {
            addCriterion("RegisterCardReversePath <=", value, "registercardreversepath");
            return (Criteria) this;
        }

        public Criteria andRegistercardreversepathLike(String value) {
            addCriterion("RegisterCardReversePath like", value, "registercardreversepath");
            return (Criteria) this;
        }

        public Criteria andRegistercardreversepathNotLike(String value) {
            addCriterion("RegisterCardReversePath not like", value, "registercardreversepath");
            return (Criteria) this;
        }

        public Criteria andRegistercardreversepathIn(List<String> values) {
            addCriterion("RegisterCardReversePath in", values, "registercardreversepath");
            return (Criteria) this;
        }

        public Criteria andRegistercardreversepathNotIn(List<String> values) {
            addCriterion("RegisterCardReversePath not in", values, "registercardreversepath");
            return (Criteria) this;
        }

        public Criteria andRegistercardreversepathBetween(String value1, String value2) {
            addCriterion("RegisterCardReversePath between", value1, value2, "registercardreversepath");
            return (Criteria) this;
        }

        public Criteria andRegistercardreversepathNotBetween(String value1, String value2) {
            addCriterion("RegisterCardReversePath not between", value1, value2, "registercardreversepath");
            return (Criteria) this;
        }

        public Criteria andRegistercardhandheldpathIsNull() {
            addCriterion("RegisterCardHandheldPath is null");
            return (Criteria) this;
        }

        public Criteria andRegistercardhandheldpathIsNotNull() {
            addCriterion("RegisterCardHandheldPath is not null");
            return (Criteria) this;
        }

        public Criteria andRegistercardhandheldpathEqualTo(String value) {
            addCriterion("RegisterCardHandheldPath =", value, "registercardhandheldpath");
            return (Criteria) this;
        }

        public Criteria andRegistercardhandheldpathNotEqualTo(String value) {
            addCriterion("RegisterCardHandheldPath <>", value, "registercardhandheldpath");
            return (Criteria) this;
        }

        public Criteria andRegistercardhandheldpathGreaterThan(String value) {
            addCriterion("RegisterCardHandheldPath >", value, "registercardhandheldpath");
            return (Criteria) this;
        }

        public Criteria andRegistercardhandheldpathGreaterThanOrEqualTo(String value) {
            addCriterion("RegisterCardHandheldPath >=", value, "registercardhandheldpath");
            return (Criteria) this;
        }

        public Criteria andRegistercardhandheldpathLessThan(String value) {
            addCriterion("RegisterCardHandheldPath <", value, "registercardhandheldpath");
            return (Criteria) this;
        }

        public Criteria andRegistercardhandheldpathLessThanOrEqualTo(String value) {
            addCriterion("RegisterCardHandheldPath <=", value, "registercardhandheldpath");
            return (Criteria) this;
        }

        public Criteria andRegistercardhandheldpathLike(String value) {
            addCriterion("RegisterCardHandheldPath like", value, "registercardhandheldpath");
            return (Criteria) this;
        }

        public Criteria andRegistercardhandheldpathNotLike(String value) {
            addCriterion("RegisterCardHandheldPath not like", value, "registercardhandheldpath");
            return (Criteria) this;
        }

        public Criteria andRegistercardhandheldpathIn(List<String> values) {
            addCriterion("RegisterCardHandheldPath in", values, "registercardhandheldpath");
            return (Criteria) this;
        }

        public Criteria andRegistercardhandheldpathNotIn(List<String> values) {
            addCriterion("RegisterCardHandheldPath not in", values, "registercardhandheldpath");
            return (Criteria) this;
        }

        public Criteria andRegistercardhandheldpathBetween(String value1, String value2) {
            addCriterion("RegisterCardHandheldPath between", value1, value2, "registercardhandheldpath");
            return (Criteria) this;
        }

        public Criteria andRegistercardhandheldpathNotBetween(String value1, String value2) {
            addCriterion("RegisterCardHandheldPath not between", value1, value2, "registercardhandheldpath");
            return (Criteria) this;
        }

        public Criteria andCityidIsNull() {
            addCriterion("CityID is null");
            return (Criteria) this;
        }

        public Criteria andCityidIsNotNull() {
            addCriterion("CityID is not null");
            return (Criteria) this;
        }

        public Criteria andCityidEqualTo(String value) {
            addCriterion("CityID =", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotEqualTo(String value) {
            addCriterion("CityID <>", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThan(String value) {
            addCriterion("CityID >", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThanOrEqualTo(String value) {
            addCriterion("CityID >=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThan(String value) {
            addCriterion("CityID <", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThanOrEqualTo(String value) {
            addCriterion("CityID <=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLike(String value) {
            addCriterion("CityID like", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotLike(String value) {
            addCriterion("CityID not like", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidIn(List<String> values) {
            addCriterion("CityID in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotIn(List<String> values) {
            addCriterion("CityID not in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidBetween(String value1, String value2) {
            addCriterion("CityID between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotBetween(String value1, String value2) {
            addCriterion("CityID not between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andCitynameIsNull() {
            addCriterion("CityName is null");
            return (Criteria) this;
        }

        public Criteria andCitynameIsNotNull() {
            addCriterion("CityName is not null");
            return (Criteria) this;
        }

        public Criteria andCitynameEqualTo(String value) {
            addCriterion("CityName =", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotEqualTo(String value) {
            addCriterion("CityName <>", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameGreaterThan(String value) {
            addCriterion("CityName >", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameGreaterThanOrEqualTo(String value) {
            addCriterion("CityName >=", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLessThan(String value) {
            addCriterion("CityName <", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLessThanOrEqualTo(String value) {
            addCriterion("CityName <=", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLike(String value) {
            addCriterion("CityName like", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotLike(String value) {
            addCriterion("CityName not like", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameIn(List<String> values) {
            addCriterion("CityName in", values, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotIn(List<String> values) {
            addCriterion("CityName not in", values, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameBetween(String value1, String value2) {
            addCriterion("CityName between", value1, value2, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotBetween(String value1, String value2) {
            addCriterion("CityName not between", value1, value2, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitypathIsNull() {
            addCriterion("CityPath is null");
            return (Criteria) this;
        }

        public Criteria andCitypathIsNotNull() {
            addCriterion("CityPath is not null");
            return (Criteria) this;
        }

        public Criteria andCitypathEqualTo(String value) {
            addCriterion("CityPath =", value, "citypath");
            return (Criteria) this;
        }

        public Criteria andCitypathNotEqualTo(String value) {
            addCriterion("CityPath <>", value, "citypath");
            return (Criteria) this;
        }

        public Criteria andCitypathGreaterThan(String value) {
            addCriterion("CityPath >", value, "citypath");
            return (Criteria) this;
        }

        public Criteria andCitypathGreaterThanOrEqualTo(String value) {
            addCriterion("CityPath >=", value, "citypath");
            return (Criteria) this;
        }

        public Criteria andCitypathLessThan(String value) {
            addCriterion("CityPath <", value, "citypath");
            return (Criteria) this;
        }

        public Criteria andCitypathLessThanOrEqualTo(String value) {
            addCriterion("CityPath <=", value, "citypath");
            return (Criteria) this;
        }

        public Criteria andCitypathLike(String value) {
            addCriterion("CityPath like", value, "citypath");
            return (Criteria) this;
        }

        public Criteria andCitypathNotLike(String value) {
            addCriterion("CityPath not like", value, "citypath");
            return (Criteria) this;
        }

        public Criteria andCitypathIn(List<String> values) {
            addCriterion("CityPath in", values, "citypath");
            return (Criteria) this;
        }

        public Criteria andCitypathNotIn(List<String> values) {
            addCriterion("CityPath not in", values, "citypath");
            return (Criteria) this;
        }

        public Criteria andCitypathBetween(String value1, String value2) {
            addCriterion("CityPath between", value1, value2, "citypath");
            return (Criteria) this;
        }

        public Criteria andCitypathNotBetween(String value1, String value2) {
            addCriterion("CityPath not between", value1, value2, "citypath");
            return (Criteria) this;
        }

        public Criteria andFirstcharIsNull() {
            addCriterion("FirstChar is null");
            return (Criteria) this;
        }

        public Criteria andFirstcharIsNotNull() {
            addCriterion("FirstChar is not null");
            return (Criteria) this;
        }

        public Criteria andFirstcharEqualTo(String value) {
            addCriterion("FirstChar =", value, "firstchar");
            return (Criteria) this;
        }

        public Criteria andFirstcharNotEqualTo(String value) {
            addCriterion("FirstChar <>", value, "firstchar");
            return (Criteria) this;
        }

        public Criteria andFirstcharGreaterThan(String value) {
            addCriterion("FirstChar >", value, "firstchar");
            return (Criteria) this;
        }

        public Criteria andFirstcharGreaterThanOrEqualTo(String value) {
            addCriterion("FirstChar >=", value, "firstchar");
            return (Criteria) this;
        }

        public Criteria andFirstcharLessThan(String value) {
            addCriterion("FirstChar <", value, "firstchar");
            return (Criteria) this;
        }

        public Criteria andFirstcharLessThanOrEqualTo(String value) {
            addCriterion("FirstChar <=", value, "firstchar");
            return (Criteria) this;
        }

        public Criteria andFirstcharLike(String value) {
            addCriterion("FirstChar like", value, "firstchar");
            return (Criteria) this;
        }

        public Criteria andFirstcharNotLike(String value) {
            addCriterion("FirstChar not like", value, "firstchar");
            return (Criteria) this;
        }

        public Criteria andFirstcharIn(List<String> values) {
            addCriterion("FirstChar in", values, "firstchar");
            return (Criteria) this;
        }

        public Criteria andFirstcharNotIn(List<String> values) {
            addCriterion("FirstChar not in", values, "firstchar");
            return (Criteria) this;
        }

        public Criteria andFirstcharBetween(String value1, String value2) {
            addCriterion("FirstChar between", value1, value2, "firstchar");
            return (Criteria) this;
        }

        public Criteria andFirstcharNotBetween(String value1, String value2) {
            addCriterion("FirstChar not between", value1, value2, "firstchar");
            return (Criteria) this;
        }

        public Criteria andBrandnameIsNull() {
            addCriterion("BrandName is null");
            return (Criteria) this;
        }

        public Criteria andBrandnameIsNotNull() {
            addCriterion("BrandName is not null");
            return (Criteria) this;
        }

        public Criteria andBrandnameEqualTo(String value) {
            addCriterion("BrandName =", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameNotEqualTo(String value) {
            addCriterion("BrandName <>", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameGreaterThan(String value) {
            addCriterion("BrandName >", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameGreaterThanOrEqualTo(String value) {
            addCriterion("BrandName >=", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameLessThan(String value) {
            addCriterion("BrandName <", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameLessThanOrEqualTo(String value) {
            addCriterion("BrandName <=", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameLike(String value) {
            addCriterion("BrandName like", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameNotLike(String value) {
            addCriterion("BrandName not like", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameIn(List<String> values) {
            addCriterion("BrandName in", values, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameNotIn(List<String> values) {
            addCriterion("BrandName not in", values, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameBetween(String value1, String value2) {
            addCriterion("BrandName between", value1, value2, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameNotBetween(String value1, String value2) {
            addCriterion("BrandName not between", value1, value2, "brandname");
            return (Criteria) this;
        }

        public Criteria andDatastatusIsNull() {
            addCriterion("DataStatus is null");
            return (Criteria) this;
        }

        public Criteria andDatastatusIsNotNull() {
            addCriterion("DataStatus is not null");
            return (Criteria) this;
        }

        public Criteria andDatastatusEqualTo(Integer value) {
            addCriterion("DataStatus =", value, "datastatus");
            return (Criteria) this;
        }

        public Criteria andDatastatusNotEqualTo(Integer value) {
            addCriterion("DataStatus <>", value, "datastatus");
            return (Criteria) this;
        }

        public Criteria andDatastatusGreaterThan(Integer value) {
            addCriterion("DataStatus >", value, "datastatus");
            return (Criteria) this;
        }

        public Criteria andDatastatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("DataStatus >=", value, "datastatus");
            return (Criteria) this;
        }

        public Criteria andDatastatusLessThan(Integer value) {
            addCriterion("DataStatus <", value, "datastatus");
            return (Criteria) this;
        }

        public Criteria andDatastatusLessThanOrEqualTo(Integer value) {
            addCriterion("DataStatus <=", value, "datastatus");
            return (Criteria) this;
        }

        public Criteria andDatastatusIn(List<Integer> values) {
            addCriterion("DataStatus in", values, "datastatus");
            return (Criteria) this;
        }

        public Criteria andDatastatusNotIn(List<Integer> values) {
            addCriterion("DataStatus not in", values, "datastatus");
            return (Criteria) this;
        }

        public Criteria andDatastatusBetween(Integer value1, Integer value2) {
            addCriterion("DataStatus between", value1, value2, "datastatus");
            return (Criteria) this;
        }

        public Criteria andDatastatusNotBetween(Integer value1, Integer value2) {
            addCriterion("DataStatus not between", value1, value2, "datastatus");
            return (Criteria) this;
        }

        public Criteria andTabusinesslicensenumberIsNull() {
            addCriterion("TABusinessLicenseNumber is null");
            return (Criteria) this;
        }

        public Criteria andTabusinesslicensenumberIsNotNull() {
            addCriterion("TABusinessLicenseNumber is not null");
            return (Criteria) this;
        }

        public Criteria andTabusinesslicensenumberEqualTo(String value) {
            addCriterion("TABusinessLicenseNumber =", value, "tabusinesslicensenumber");
            return (Criteria) this;
        }

        public Criteria andTabusinesslicensenumberNotEqualTo(String value) {
            addCriterion("TABusinessLicenseNumber <>", value, "tabusinesslicensenumber");
            return (Criteria) this;
        }

        public Criteria andTabusinesslicensenumberGreaterThan(String value) {
            addCriterion("TABusinessLicenseNumber >", value, "tabusinesslicensenumber");
            return (Criteria) this;
        }

        public Criteria andTabusinesslicensenumberGreaterThanOrEqualTo(String value) {
            addCriterion("TABusinessLicenseNumber >=", value, "tabusinesslicensenumber");
            return (Criteria) this;
        }

        public Criteria andTabusinesslicensenumberLessThan(String value) {
            addCriterion("TABusinessLicenseNumber <", value, "tabusinesslicensenumber");
            return (Criteria) this;
        }

        public Criteria andTabusinesslicensenumberLessThanOrEqualTo(String value) {
            addCriterion("TABusinessLicenseNumber <=", value, "tabusinesslicensenumber");
            return (Criteria) this;
        }

        public Criteria andTabusinesslicensenumberLike(String value) {
            addCriterion("TABusinessLicenseNumber like", value, "tabusinesslicensenumber");
            return (Criteria) this;
        }

        public Criteria andTabusinesslicensenumberNotLike(String value) {
            addCriterion("TABusinessLicenseNumber not like", value, "tabusinesslicensenumber");
            return (Criteria) this;
        }

        public Criteria andTabusinesslicensenumberIn(List<String> values) {
            addCriterion("TABusinessLicenseNumber in", values, "tabusinesslicensenumber");
            return (Criteria) this;
        }

        public Criteria andTabusinesslicensenumberNotIn(List<String> values) {
            addCriterion("TABusinessLicenseNumber not in", values, "tabusinesslicensenumber");
            return (Criteria) this;
        }

        public Criteria andTabusinesslicensenumberBetween(String value1, String value2) {
            addCriterion("TABusinessLicenseNumber between", value1, value2, "tabusinesslicensenumber");
            return (Criteria) this;
        }

        public Criteria andTabusinesslicensenumberNotBetween(String value1, String value2) {
            addCriterion("TABusinessLicenseNumber not between", value1, value2, "tabusinesslicensenumber");
            return (Criteria) this;
        }

        public Criteria andTabusinesslicensenumberpathIsNull() {
            addCriterion("TABusinessLicenseNumberPath is null");
            return (Criteria) this;
        }

        public Criteria andTabusinesslicensenumberpathIsNotNull() {
            addCriterion("TABusinessLicenseNumberPath is not null");
            return (Criteria) this;
        }

        public Criteria andTabusinesslicensenumberpathEqualTo(String value) {
            addCriterion("TABusinessLicenseNumberPath =", value, "tabusinesslicensenumberpath");
            return (Criteria) this;
        }

        public Criteria andTabusinesslicensenumberpathNotEqualTo(String value) {
            addCriterion("TABusinessLicenseNumberPath <>", value, "tabusinesslicensenumberpath");
            return (Criteria) this;
        }

        public Criteria andTabusinesslicensenumberpathGreaterThan(String value) {
            addCriterion("TABusinessLicenseNumberPath >", value, "tabusinesslicensenumberpath");
            return (Criteria) this;
        }

        public Criteria andTabusinesslicensenumberpathGreaterThanOrEqualTo(String value) {
            addCriterion("TABusinessLicenseNumberPath >=", value, "tabusinesslicensenumberpath");
            return (Criteria) this;
        }

        public Criteria andTabusinesslicensenumberpathLessThan(String value) {
            addCriterion("TABusinessLicenseNumberPath <", value, "tabusinesslicensenumberpath");
            return (Criteria) this;
        }

        public Criteria andTabusinesslicensenumberpathLessThanOrEqualTo(String value) {
            addCriterion("TABusinessLicenseNumberPath <=", value, "tabusinesslicensenumberpath");
            return (Criteria) this;
        }

        public Criteria andTabusinesslicensenumberpathLike(String value) {
            addCriterion("TABusinessLicenseNumberPath like", value, "tabusinesslicensenumberpath");
            return (Criteria) this;
        }

        public Criteria andTabusinesslicensenumberpathNotLike(String value) {
            addCriterion("TABusinessLicenseNumberPath not like", value, "tabusinesslicensenumberpath");
            return (Criteria) this;
        }

        public Criteria andTabusinesslicensenumberpathIn(List<String> values) {
            addCriterion("TABusinessLicenseNumberPath in", values, "tabusinesslicensenumberpath");
            return (Criteria) this;
        }

        public Criteria andTabusinesslicensenumberpathNotIn(List<String> values) {
            addCriterion("TABusinessLicenseNumberPath not in", values, "tabusinesslicensenumberpath");
            return (Criteria) this;
        }

        public Criteria andTabusinesslicensenumberpathBetween(String value1, String value2) {
            addCriterion("TABusinessLicenseNumberPath between", value1, value2, "tabusinesslicensenumberpath");
            return (Criteria) this;
        }

        public Criteria andTabusinesslicensenumberpathNotBetween(String value1, String value2) {
            addCriterion("TABusinessLicenseNumberPath not between", value1, value2, "tabusinesslicensenumberpath");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}