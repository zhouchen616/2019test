package com.holyrobot.con_volunteer.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VolunteerApplicationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VolunteerApplicationExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("UserID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("UserID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("UserID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("UserID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("UserID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("UserID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("UserID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("UserID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("UserID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("UserID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("UserID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("UserID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("UserID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("UserName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("UserName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("UserName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("UserName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("UserName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("UserName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("UserName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("UserName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("UserName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("UserName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("UserName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("UserName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("UserName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("UserName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsercardIsNull() {
            addCriterion("UserCard is null");
            return (Criteria) this;
        }

        public Criteria andUsercardIsNotNull() {
            addCriterion("UserCard is not null");
            return (Criteria) this;
        }

        public Criteria andUsercardEqualTo(String value) {
            addCriterion("UserCard =", value, "usercard");
            return (Criteria) this;
        }

        public Criteria andUsercardNotEqualTo(String value) {
            addCriterion("UserCard <>", value, "usercard");
            return (Criteria) this;
        }

        public Criteria andUsercardGreaterThan(String value) {
            addCriterion("UserCard >", value, "usercard");
            return (Criteria) this;
        }

        public Criteria andUsercardGreaterThanOrEqualTo(String value) {
            addCriterion("UserCard >=", value, "usercard");
            return (Criteria) this;
        }

        public Criteria andUsercardLessThan(String value) {
            addCriterion("UserCard <", value, "usercard");
            return (Criteria) this;
        }

        public Criteria andUsercardLessThanOrEqualTo(String value) {
            addCriterion("UserCard <=", value, "usercard");
            return (Criteria) this;
        }

        public Criteria andUsercardLike(String value) {
            addCriterion("UserCard like", value, "usercard");
            return (Criteria) this;
        }

        public Criteria andUsercardNotLike(String value) {
            addCriterion("UserCard not like", value, "usercard");
            return (Criteria) this;
        }

        public Criteria andUsercardIn(List<String> values) {
            addCriterion("UserCard in", values, "usercard");
            return (Criteria) this;
        }

        public Criteria andUsercardNotIn(List<String> values) {
            addCriterion("UserCard not in", values, "usercard");
            return (Criteria) this;
        }

        public Criteria andUsercardBetween(String value1, String value2) {
            addCriterion("UserCard between", value1, value2, "usercard");
            return (Criteria) this;
        }

        public Criteria andUsercardNotBetween(String value1, String value2) {
            addCriterion("UserCard not between", value1, value2, "usercard");
            return (Criteria) this;
        }

        public Criteria andUsercardurlIsNull() {
            addCriterion("UserCardUrl is null");
            return (Criteria) this;
        }

        public Criteria andUsercardurlIsNotNull() {
            addCriterion("UserCardUrl is not null");
            return (Criteria) this;
        }

        public Criteria andUsercardurlEqualTo(String value) {
            addCriterion("UserCardUrl =", value, "usercardurl");
            return (Criteria) this;
        }

        public Criteria andUsercardurlNotEqualTo(String value) {
            addCriterion("UserCardUrl <>", value, "usercardurl");
            return (Criteria) this;
        }

        public Criteria andUsercardurlGreaterThan(String value) {
            addCriterion("UserCardUrl >", value, "usercardurl");
            return (Criteria) this;
        }

        public Criteria andUsercardurlGreaterThanOrEqualTo(String value) {
            addCriterion("UserCardUrl >=", value, "usercardurl");
            return (Criteria) this;
        }

        public Criteria andUsercardurlLessThan(String value) {
            addCriterion("UserCardUrl <", value, "usercardurl");
            return (Criteria) this;
        }

        public Criteria andUsercardurlLessThanOrEqualTo(String value) {
            addCriterion("UserCardUrl <=", value, "usercardurl");
            return (Criteria) this;
        }

        public Criteria andUsercardurlLike(String value) {
            addCriterion("UserCardUrl like", value, "usercardurl");
            return (Criteria) this;
        }

        public Criteria andUsercardurlNotLike(String value) {
            addCriterion("UserCardUrl not like", value, "usercardurl");
            return (Criteria) this;
        }

        public Criteria andUsercardurlIn(List<String> values) {
            addCriterion("UserCardUrl in", values, "usercardurl");
            return (Criteria) this;
        }

        public Criteria andUsercardurlNotIn(List<String> values) {
            addCriterion("UserCardUrl not in", values, "usercardurl");
            return (Criteria) this;
        }

        public Criteria andUsercardurlBetween(String value1, String value2) {
            addCriterion("UserCardUrl between", value1, value2, "usercardurl");
            return (Criteria) this;
        }

        public Criteria andUsercardurlNotBetween(String value1, String value2) {
            addCriterion("UserCardUrl not between", value1, value2, "usercardurl");
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

        public Criteria andShopnameIsNull() {
            addCriterion("ShopName is null");
            return (Criteria) this;
        }

        public Criteria andShopnameIsNotNull() {
            addCriterion("ShopName is not null");
            return (Criteria) this;
        }

        public Criteria andShopnameEqualTo(String value) {
            addCriterion("ShopName =", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotEqualTo(String value) {
            addCriterion("ShopName <>", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameGreaterThan(String value) {
            addCriterion("ShopName >", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameGreaterThanOrEqualTo(String value) {
            addCriterion("ShopName >=", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLessThan(String value) {
            addCriterion("ShopName <", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLessThanOrEqualTo(String value) {
            addCriterion("ShopName <=", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLike(String value) {
            addCriterion("ShopName like", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotLike(String value) {
            addCriterion("ShopName not like", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameIn(List<String> values) {
            addCriterion("ShopName in", values, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotIn(List<String> values) {
            addCriterion("ShopName not in", values, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameBetween(String value1, String value2) {
            addCriterion("ShopName between", value1, value2, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotBetween(String value1, String value2) {
            addCriterion("ShopName not between", value1, value2, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopheadportraitIsNull() {
            addCriterion("ShopHeadPortrait is null");
            return (Criteria) this;
        }

        public Criteria andShopheadportraitIsNotNull() {
            addCriterion("ShopHeadPortrait is not null");
            return (Criteria) this;
        }

        public Criteria andShopheadportraitEqualTo(String value) {
            addCriterion("ShopHeadPortrait =", value, "shopheadportrait");
            return (Criteria) this;
        }

        public Criteria andShopheadportraitNotEqualTo(String value) {
            addCriterion("ShopHeadPortrait <>", value, "shopheadportrait");
            return (Criteria) this;
        }

        public Criteria andShopheadportraitGreaterThan(String value) {
            addCriterion("ShopHeadPortrait >", value, "shopheadportrait");
            return (Criteria) this;
        }

        public Criteria andShopheadportraitGreaterThanOrEqualTo(String value) {
            addCriterion("ShopHeadPortrait >=", value, "shopheadportrait");
            return (Criteria) this;
        }

        public Criteria andShopheadportraitLessThan(String value) {
            addCriterion("ShopHeadPortrait <", value, "shopheadportrait");
            return (Criteria) this;
        }

        public Criteria andShopheadportraitLessThanOrEqualTo(String value) {
            addCriterion("ShopHeadPortrait <=", value, "shopheadportrait");
            return (Criteria) this;
        }

        public Criteria andShopheadportraitLike(String value) {
            addCriterion("ShopHeadPortrait like", value, "shopheadportrait");
            return (Criteria) this;
        }

        public Criteria andShopheadportraitNotLike(String value) {
            addCriterion("ShopHeadPortrait not like", value, "shopheadportrait");
            return (Criteria) this;
        }

        public Criteria andShopheadportraitIn(List<String> values) {
            addCriterion("ShopHeadPortrait in", values, "shopheadportrait");
            return (Criteria) this;
        }

        public Criteria andShopheadportraitNotIn(List<String> values) {
            addCriterion("ShopHeadPortrait not in", values, "shopheadportrait");
            return (Criteria) this;
        }

        public Criteria andShopheadportraitBetween(String value1, String value2) {
            addCriterion("ShopHeadPortrait between", value1, value2, "shopheadportrait");
            return (Criteria) this;
        }

        public Criteria andShopheadportraitNotBetween(String value1, String value2) {
            addCriterion("ShopHeadPortrait not between", value1, value2, "shopheadportrait");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNull() {
            addCriterion("PayType is null");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNotNull() {
            addCriterion("PayType is not null");
            return (Criteria) this;
        }

        public Criteria andPaytypeEqualTo(String value) {
            addCriterion("PayType =", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotEqualTo(String value) {
            addCriterion("PayType <>", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThan(String value) {
            addCriterion("PayType >", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThanOrEqualTo(String value) {
            addCriterion("PayType >=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThan(String value) {
            addCriterion("PayType <", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThanOrEqualTo(String value) {
            addCriterion("PayType <=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLike(String value) {
            addCriterion("PayType like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotLike(String value) {
            addCriterion("PayType not like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeIn(List<String> values) {
            addCriterion("PayType in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotIn(List<String> values) {
            addCriterion("PayType not in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeBetween(String value1, String value2) {
            addCriterion("PayType between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotBetween(String value1, String value2) {
            addCriterion("PayType not between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andDepositbankIsNull() {
            addCriterion("DepositBank is null");
            return (Criteria) this;
        }

        public Criteria andDepositbankIsNotNull() {
            addCriterion("DepositBank is not null");
            return (Criteria) this;
        }

        public Criteria andDepositbankEqualTo(String value) {
            addCriterion("DepositBank =", value, "depositbank");
            return (Criteria) this;
        }

        public Criteria andDepositbankNotEqualTo(String value) {
            addCriterion("DepositBank <>", value, "depositbank");
            return (Criteria) this;
        }

        public Criteria andDepositbankGreaterThan(String value) {
            addCriterion("DepositBank >", value, "depositbank");
            return (Criteria) this;
        }

        public Criteria andDepositbankGreaterThanOrEqualTo(String value) {
            addCriterion("DepositBank >=", value, "depositbank");
            return (Criteria) this;
        }

        public Criteria andDepositbankLessThan(String value) {
            addCriterion("DepositBank <", value, "depositbank");
            return (Criteria) this;
        }

        public Criteria andDepositbankLessThanOrEqualTo(String value) {
            addCriterion("DepositBank <=", value, "depositbank");
            return (Criteria) this;
        }

        public Criteria andDepositbankLike(String value) {
            addCriterion("DepositBank like", value, "depositbank");
            return (Criteria) this;
        }

        public Criteria andDepositbankNotLike(String value) {
            addCriterion("DepositBank not like", value, "depositbank");
            return (Criteria) this;
        }

        public Criteria andDepositbankIn(List<String> values) {
            addCriterion("DepositBank in", values, "depositbank");
            return (Criteria) this;
        }

        public Criteria andDepositbankNotIn(List<String> values) {
            addCriterion("DepositBank not in", values, "depositbank");
            return (Criteria) this;
        }

        public Criteria andDepositbankBetween(String value1, String value2) {
            addCriterion("DepositBank between", value1, value2, "depositbank");
            return (Criteria) this;
        }

        public Criteria andDepositbankNotBetween(String value1, String value2) {
            addCriterion("DepositBank not between", value1, value2, "depositbank");
            return (Criteria) this;
        }

        public Criteria andCardnoIsNull() {
            addCriterion("CardNo is null");
            return (Criteria) this;
        }

        public Criteria andCardnoIsNotNull() {
            addCriterion("CardNo is not null");
            return (Criteria) this;
        }

        public Criteria andCardnoEqualTo(String value) {
            addCriterion("CardNo =", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotEqualTo(String value) {
            addCriterion("CardNo <>", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoGreaterThan(String value) {
            addCriterion("CardNo >", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoGreaterThanOrEqualTo(String value) {
            addCriterion("CardNo >=", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoLessThan(String value) {
            addCriterion("CardNo <", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoLessThanOrEqualTo(String value) {
            addCriterion("CardNo <=", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoLike(String value) {
            addCriterion("CardNo like", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotLike(String value) {
            addCriterion("CardNo not like", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoIn(List<String> values) {
            addCriterion("CardNo in", values, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotIn(List<String> values) {
            addCriterion("CardNo not in", values, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoBetween(String value1, String value2) {
            addCriterion("CardNo between", value1, value2, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotBetween(String value1, String value2) {
            addCriterion("CardNo not between", value1, value2, "cardno");
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

        public Criteria andRemarkIsNull() {
            addCriterion("Remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("Remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("Remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("Remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("Remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("Remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("Remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("Remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("Remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("Remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("Remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("Remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("Remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andAutoupdateIsNull() {
            addCriterion("AutoUpdate is null");
            return (Criteria) this;
        }

        public Criteria andAutoupdateIsNotNull() {
            addCriterion("AutoUpdate is not null");
            return (Criteria) this;
        }

        public Criteria andAutoupdateEqualTo(Integer value) {
            addCriterion("AutoUpdate =", value, "autoupdate");
            return (Criteria) this;
        }

        public Criteria andAutoupdateNotEqualTo(Integer value) {
            addCriterion("AutoUpdate <>", value, "autoupdate");
            return (Criteria) this;
        }

        public Criteria andAutoupdateGreaterThan(Integer value) {
            addCriterion("AutoUpdate >", value, "autoupdate");
            return (Criteria) this;
        }

        public Criteria andAutoupdateGreaterThanOrEqualTo(Integer value) {
            addCriterion("AutoUpdate >=", value, "autoupdate");
            return (Criteria) this;
        }

        public Criteria andAutoupdateLessThan(Integer value) {
            addCriterion("AutoUpdate <", value, "autoupdate");
            return (Criteria) this;
        }

        public Criteria andAutoupdateLessThanOrEqualTo(Integer value) {
            addCriterion("AutoUpdate <=", value, "autoupdate");
            return (Criteria) this;
        }

        public Criteria andAutoupdateIn(List<Integer> values) {
            addCriterion("AutoUpdate in", values, "autoupdate");
            return (Criteria) this;
        }

        public Criteria andAutoupdateNotIn(List<Integer> values) {
            addCriterion("AutoUpdate not in", values, "autoupdate");
            return (Criteria) this;
        }

        public Criteria andAutoupdateBetween(Integer value1, Integer value2) {
            addCriterion("AutoUpdate between", value1, value2, "autoupdate");
            return (Criteria) this;
        }

        public Criteria andAutoupdateNotBetween(Integer value1, Integer value2) {
            addCriterion("AutoUpdate not between", value1, value2, "autoupdate");
            return (Criteria) this;
        }

        public Criteria andAdjustmenttypeIsNull() {
            addCriterion("AdjustmentType is null");
            return (Criteria) this;
        }

        public Criteria andAdjustmenttypeIsNotNull() {
            addCriterion("AdjustmentType is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustmenttypeEqualTo(Integer value) {
            addCriterion("AdjustmentType =", value, "adjustmenttype");
            return (Criteria) this;
        }

        public Criteria andAdjustmenttypeNotEqualTo(Integer value) {
            addCriterion("AdjustmentType <>", value, "adjustmenttype");
            return (Criteria) this;
        }

        public Criteria andAdjustmenttypeGreaterThan(Integer value) {
            addCriterion("AdjustmentType >", value, "adjustmenttype");
            return (Criteria) this;
        }

        public Criteria andAdjustmenttypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("AdjustmentType >=", value, "adjustmenttype");
            return (Criteria) this;
        }

        public Criteria andAdjustmenttypeLessThan(Integer value) {
            addCriterion("AdjustmentType <", value, "adjustmenttype");
            return (Criteria) this;
        }

        public Criteria andAdjustmenttypeLessThanOrEqualTo(Integer value) {
            addCriterion("AdjustmentType <=", value, "adjustmenttype");
            return (Criteria) this;
        }

        public Criteria andAdjustmenttypeIn(List<Integer> values) {
            addCriterion("AdjustmentType in", values, "adjustmenttype");
            return (Criteria) this;
        }

        public Criteria andAdjustmenttypeNotIn(List<Integer> values) {
            addCriterion("AdjustmentType not in", values, "adjustmenttype");
            return (Criteria) this;
        }

        public Criteria andAdjustmenttypeBetween(Integer value1, Integer value2) {
            addCriterion("AdjustmentType between", value1, value2, "adjustmenttype");
            return (Criteria) this;
        }

        public Criteria andAdjustmenttypeNotBetween(Integer value1, Integer value2) {
            addCriterion("AdjustmentType not between", value1, value2, "adjustmenttype");
            return (Criteria) this;
        }

        public Criteria andAdjustmentmethodIsNull() {
            addCriterion("AdjustmentMethod is null");
            return (Criteria) this;
        }

        public Criteria andAdjustmentmethodIsNotNull() {
            addCriterion("AdjustmentMethod is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustmentmethodEqualTo(Integer value) {
            addCriterion("AdjustmentMethod =", value, "adjustmentmethod");
            return (Criteria) this;
        }

        public Criteria andAdjustmentmethodNotEqualTo(Integer value) {
            addCriterion("AdjustmentMethod <>", value, "adjustmentmethod");
            return (Criteria) this;
        }

        public Criteria andAdjustmentmethodGreaterThan(Integer value) {
            addCriterion("AdjustmentMethod >", value, "adjustmentmethod");
            return (Criteria) this;
        }

        public Criteria andAdjustmentmethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("AdjustmentMethod >=", value, "adjustmentmethod");
            return (Criteria) this;
        }

        public Criteria andAdjustmentmethodLessThan(Integer value) {
            addCriterion("AdjustmentMethod <", value, "adjustmentmethod");
            return (Criteria) this;
        }

        public Criteria andAdjustmentmethodLessThanOrEqualTo(Integer value) {
            addCriterion("AdjustmentMethod <=", value, "adjustmentmethod");
            return (Criteria) this;
        }

        public Criteria andAdjustmentmethodIn(List<Integer> values) {
            addCriterion("AdjustmentMethod in", values, "adjustmentmethod");
            return (Criteria) this;
        }

        public Criteria andAdjustmentmethodNotIn(List<Integer> values) {
            addCriterion("AdjustmentMethod not in", values, "adjustmentmethod");
            return (Criteria) this;
        }

        public Criteria andAdjustmentmethodBetween(Integer value1, Integer value2) {
            addCriterion("AdjustmentMethod between", value1, value2, "adjustmentmethod");
            return (Criteria) this;
        }

        public Criteria andAdjustmentmethodNotBetween(Integer value1, Integer value2) {
            addCriterion("AdjustmentMethod not between", value1, value2, "adjustmentmethod");
            return (Criteria) this;
        }

        public Criteria andPercentageIsNull() {
            addCriterion("Percentage is null");
            return (Criteria) this;
        }

        public Criteria andPercentageIsNotNull() {
            addCriterion("Percentage is not null");
            return (Criteria) this;
        }

        public Criteria andPercentageEqualTo(BigDecimal value) {
            addCriterion("Percentage =", value, "percentage");
            return (Criteria) this;
        }

        public Criteria andPercentageNotEqualTo(BigDecimal value) {
            addCriterion("Percentage <>", value, "percentage");
            return (Criteria) this;
        }

        public Criteria andPercentageGreaterThan(BigDecimal value) {
            addCriterion("Percentage >", value, "percentage");
            return (Criteria) this;
        }

        public Criteria andPercentageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Percentage >=", value, "percentage");
            return (Criteria) this;
        }

        public Criteria andPercentageLessThan(BigDecimal value) {
            addCriterion("Percentage <", value, "percentage");
            return (Criteria) this;
        }

        public Criteria andPercentageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Percentage <=", value, "percentage");
            return (Criteria) this;
        }

        public Criteria andPercentageIn(List<BigDecimal> values) {
            addCriterion("Percentage in", values, "percentage");
            return (Criteria) this;
        }

        public Criteria andPercentageNotIn(List<BigDecimal> values) {
            addCriterion("Percentage not in", values, "percentage");
            return (Criteria) this;
        }

        public Criteria andPercentageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Percentage between", value1, value2, "percentage");
            return (Criteria) this;
        }

        public Criteria andPercentageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Percentage not between", value1, value2, "percentage");
            return (Criteria) this;
        }

        public Criteria andFixedamountIsNull() {
            addCriterion("FixedAmount is null");
            return (Criteria) this;
        }

        public Criteria andFixedamountIsNotNull() {
            addCriterion("FixedAmount is not null");
            return (Criteria) this;
        }

        public Criteria andFixedamountEqualTo(BigDecimal value) {
            addCriterion("FixedAmount =", value, "fixedamount");
            return (Criteria) this;
        }

        public Criteria andFixedamountNotEqualTo(BigDecimal value) {
            addCriterion("FixedAmount <>", value, "fixedamount");
            return (Criteria) this;
        }

        public Criteria andFixedamountGreaterThan(BigDecimal value) {
            addCriterion("FixedAmount >", value, "fixedamount");
            return (Criteria) this;
        }

        public Criteria andFixedamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FixedAmount >=", value, "fixedamount");
            return (Criteria) this;
        }

        public Criteria andFixedamountLessThan(BigDecimal value) {
            addCriterion("FixedAmount <", value, "fixedamount");
            return (Criteria) this;
        }

        public Criteria andFixedamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FixedAmount <=", value, "fixedamount");
            return (Criteria) this;
        }

        public Criteria andFixedamountIn(List<BigDecimal> values) {
            addCriterion("FixedAmount in", values, "fixedamount");
            return (Criteria) this;
        }

        public Criteria andFixedamountNotIn(List<BigDecimal> values) {
            addCriterion("FixedAmount not in", values, "fixedamount");
            return (Criteria) this;
        }

        public Criteria andFixedamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FixedAmount between", value1, value2, "fixedamount");
            return (Criteria) this;
        }

        public Criteria andFixedamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FixedAmount not between", value1, value2, "fixedamount");
            return (Criteria) this;
        }

        public Criteria andInfostatusIsNull() {
            addCriterion("InfoStatus is null");
            return (Criteria) this;
        }

        public Criteria andInfostatusIsNotNull() {
            addCriterion("InfoStatus is not null");
            return (Criteria) this;
        }

        public Criteria andInfostatusEqualTo(Integer value) {
            addCriterion("InfoStatus =", value, "infostatus");
            return (Criteria) this;
        }

        public Criteria andInfostatusNotEqualTo(Integer value) {
            addCriterion("InfoStatus <>", value, "infostatus");
            return (Criteria) this;
        }

        public Criteria andInfostatusGreaterThan(Integer value) {
            addCriterion("InfoStatus >", value, "infostatus");
            return (Criteria) this;
        }

        public Criteria andInfostatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("InfoStatus >=", value, "infostatus");
            return (Criteria) this;
        }

        public Criteria andInfostatusLessThan(Integer value) {
            addCriterion("InfoStatus <", value, "infostatus");
            return (Criteria) this;
        }

        public Criteria andInfostatusLessThanOrEqualTo(Integer value) {
            addCriterion("InfoStatus <=", value, "infostatus");
            return (Criteria) this;
        }

        public Criteria andInfostatusIn(List<Integer> values) {
            addCriterion("InfoStatus in", values, "infostatus");
            return (Criteria) this;
        }

        public Criteria andInfostatusNotIn(List<Integer> values) {
            addCriterion("InfoStatus not in", values, "infostatus");
            return (Criteria) this;
        }

        public Criteria andInfostatusBetween(Integer value1, Integer value2) {
            addCriterion("InfoStatus between", value1, value2, "infostatus");
            return (Criteria) this;
        }

        public Criteria andInfostatusNotBetween(Integer value1, Integer value2) {
            addCriterion("InfoStatus not between", value1, value2, "infostatus");
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