package com.holyrobot.con_volunteer.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class VolunteerProductTourPriceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VolunteerProductTourPriceExample() {
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

        public Criteria andProidIsNull() {
            addCriterion("ProID is null");
            return (Criteria) this;
        }

        public Criteria andProidIsNotNull() {
            addCriterion("ProID is not null");
            return (Criteria) this;
        }

        public Criteria andProidEqualTo(String value) {
            addCriterion("ProID =", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotEqualTo(String value) {
            addCriterion("ProID <>", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidGreaterThan(String value) {
            addCriterion("ProID >", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidGreaterThanOrEqualTo(String value) {
            addCriterion("ProID >=", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidLessThan(String value) {
            addCriterion("ProID <", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidLessThanOrEqualTo(String value) {
            addCriterion("ProID <=", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidLike(String value) {
            addCriterion("ProID like", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotLike(String value) {
            addCriterion("ProID not like", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidIn(List<String> values) {
            addCriterion("ProID in", values, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotIn(List<String> values) {
            addCriterion("ProID not in", values, "proid");
            return (Criteria) this;
        }

        public Criteria andProidBetween(String value1, String value2) {
            addCriterion("ProID between", value1, value2, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotBetween(String value1, String value2) {
            addCriterion("ProID not between", value1, value2, "proid");
            return (Criteria) this;
        }

        public Criteria andTouridIsNull() {
            addCriterion("TourID is null");
            return (Criteria) this;
        }

        public Criteria andTouridIsNotNull() {
            addCriterion("TourID is not null");
            return (Criteria) this;
        }

        public Criteria andTouridEqualTo(String value) {
            addCriterion("TourID =", value, "tourid");
            return (Criteria) this;
        }

        public Criteria andTouridNotEqualTo(String value) {
            addCriterion("TourID <>", value, "tourid");
            return (Criteria) this;
        }

        public Criteria andTouridGreaterThan(String value) {
            addCriterion("TourID >", value, "tourid");
            return (Criteria) this;
        }

        public Criteria andTouridGreaterThanOrEqualTo(String value) {
            addCriterion("TourID >=", value, "tourid");
            return (Criteria) this;
        }

        public Criteria andTouridLessThan(String value) {
            addCriterion("TourID <", value, "tourid");
            return (Criteria) this;
        }

        public Criteria andTouridLessThanOrEqualTo(String value) {
            addCriterion("TourID <=", value, "tourid");
            return (Criteria) this;
        }

        public Criteria andTouridLike(String value) {
            addCriterion("TourID like", value, "tourid");
            return (Criteria) this;
        }

        public Criteria andTouridNotLike(String value) {
            addCriterion("TourID not like", value, "tourid");
            return (Criteria) this;
        }

        public Criteria andTouridIn(List<String> values) {
            addCriterion("TourID in", values, "tourid");
            return (Criteria) this;
        }

        public Criteria andTouridNotIn(List<String> values) {
            addCriterion("TourID not in", values, "tourid");
            return (Criteria) this;
        }

        public Criteria andTouridBetween(String value1, String value2) {
            addCriterion("TourID between", value1, value2, "tourid");
            return (Criteria) this;
        }

        public Criteria andTouridNotBetween(String value1, String value2) {
            addCriterion("TourID not between", value1, value2, "tourid");
            return (Criteria) this;
        }

        public Criteria andSiteidIsNull() {
            addCriterion("SiteID is null");
            return (Criteria) this;
        }

        public Criteria andSiteidIsNotNull() {
            addCriterion("SiteID is not null");
            return (Criteria) this;
        }

        public Criteria andSiteidEqualTo(String value) {
            addCriterion("SiteID =", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidNotEqualTo(String value) {
            addCriterion("SiteID <>", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidGreaterThan(String value) {
            addCriterion("SiteID >", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidGreaterThanOrEqualTo(String value) {
            addCriterion("SiteID >=", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidLessThan(String value) {
            addCriterion("SiteID <", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidLessThanOrEqualTo(String value) {
            addCriterion("SiteID <=", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidLike(String value) {
            addCriterion("SiteID like", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidNotLike(String value) {
            addCriterion("SiteID not like", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidIn(List<String> values) {
            addCriterion("SiteID in", values, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidNotIn(List<String> values) {
            addCriterion("SiteID not in", values, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidBetween(String value1, String value2) {
            addCriterion("SiteID between", value1, value2, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidNotBetween(String value1, String value2) {
            addCriterion("SiteID not between", value1, value2, "siteid");
            return (Criteria) this;
        }

        public Criteria andSitenameIsNull() {
            addCriterion("SiteName is null");
            return (Criteria) this;
        }

        public Criteria andSitenameIsNotNull() {
            addCriterion("SiteName is not null");
            return (Criteria) this;
        }

        public Criteria andSitenameEqualTo(String value) {
            addCriterion("SiteName =", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameNotEqualTo(String value) {
            addCriterion("SiteName <>", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameGreaterThan(String value) {
            addCriterion("SiteName >", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameGreaterThanOrEqualTo(String value) {
            addCriterion("SiteName >=", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameLessThan(String value) {
            addCriterion("SiteName <", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameLessThanOrEqualTo(String value) {
            addCriterion("SiteName <=", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameLike(String value) {
            addCriterion("SiteName like", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameNotLike(String value) {
            addCriterion("SiteName not like", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameIn(List<String> values) {
            addCriterion("SiteName in", values, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameNotIn(List<String> values) {
            addCriterion("SiteName not in", values, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameBetween(String value1, String value2) {
            addCriterion("SiteName between", value1, value2, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameNotBetween(String value1, String value2) {
            addCriterion("SiteName not between", value1, value2, "sitename");
            return (Criteria) this;
        }

        public Criteria andTouristtypeIsNull() {
            addCriterion("TouristType is null");
            return (Criteria) this;
        }

        public Criteria andTouristtypeIsNotNull() {
            addCriterion("TouristType is not null");
            return (Criteria) this;
        }

        public Criteria andTouristtypeEqualTo(Integer value) {
            addCriterion("TouristType =", value, "touristtype");
            return (Criteria) this;
        }

        public Criteria andTouristtypeNotEqualTo(Integer value) {
            addCriterion("TouristType <>", value, "touristtype");
            return (Criteria) this;
        }

        public Criteria andTouristtypeGreaterThan(Integer value) {
            addCriterion("TouristType >", value, "touristtype");
            return (Criteria) this;
        }

        public Criteria andTouristtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("TouristType >=", value, "touristtype");
            return (Criteria) this;
        }

        public Criteria andTouristtypeLessThan(Integer value) {
            addCriterion("TouristType <", value, "touristtype");
            return (Criteria) this;
        }

        public Criteria andTouristtypeLessThanOrEqualTo(Integer value) {
            addCriterion("TouristType <=", value, "touristtype");
            return (Criteria) this;
        }

        public Criteria andTouristtypeIn(List<Integer> values) {
            addCriterion("TouristType in", values, "touristtype");
            return (Criteria) this;
        }

        public Criteria andTouristtypeNotIn(List<Integer> values) {
            addCriterion("TouristType not in", values, "touristtype");
            return (Criteria) this;
        }

        public Criteria andTouristtypeBetween(Integer value1, Integer value2) {
            addCriterion("TouristType between", value1, value2, "touristtype");
            return (Criteria) this;
        }

        public Criteria andTouristtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("TouristType not between", value1, value2, "touristtype");
            return (Criteria) this;
        }

        public Criteria andPolicynameIsNull() {
            addCriterion("PolicyName is null");
            return (Criteria) this;
        }

        public Criteria andPolicynameIsNotNull() {
            addCriterion("PolicyName is not null");
            return (Criteria) this;
        }

        public Criteria andPolicynameEqualTo(String value) {
            addCriterion("PolicyName =", value, "policyname");
            return (Criteria) this;
        }

        public Criteria andPolicynameNotEqualTo(String value) {
            addCriterion("PolicyName <>", value, "policyname");
            return (Criteria) this;
        }

        public Criteria andPolicynameGreaterThan(String value) {
            addCriterion("PolicyName >", value, "policyname");
            return (Criteria) this;
        }

        public Criteria andPolicynameGreaterThanOrEqualTo(String value) {
            addCriterion("PolicyName >=", value, "policyname");
            return (Criteria) this;
        }

        public Criteria andPolicynameLessThan(String value) {
            addCriterion("PolicyName <", value, "policyname");
            return (Criteria) this;
        }

        public Criteria andPolicynameLessThanOrEqualTo(String value) {
            addCriterion("PolicyName <=", value, "policyname");
            return (Criteria) this;
        }

        public Criteria andPolicynameLike(String value) {
            addCriterion("PolicyName like", value, "policyname");
            return (Criteria) this;
        }

        public Criteria andPolicynameNotLike(String value) {
            addCriterion("PolicyName not like", value, "policyname");
            return (Criteria) this;
        }

        public Criteria andPolicynameIn(List<String> values) {
            addCriterion("PolicyName in", values, "policyname");
            return (Criteria) this;
        }

        public Criteria andPolicynameNotIn(List<String> values) {
            addCriterion("PolicyName not in", values, "policyname");
            return (Criteria) this;
        }

        public Criteria andPolicynameBetween(String value1, String value2) {
            addCriterion("PolicyName between", value1, value2, "policyname");
            return (Criteria) this;
        }

        public Criteria andPolicynameNotBetween(String value1, String value2) {
            addCriterion("PolicyName not between", value1, value2, "policyname");
            return (Criteria) this;
        }

        public Criteria andOrderindexIsNull() {
            addCriterion("OrderIndex is null");
            return (Criteria) this;
        }

        public Criteria andOrderindexIsNotNull() {
            addCriterion("OrderIndex is not null");
            return (Criteria) this;
        }

        public Criteria andOrderindexEqualTo(Integer value) {
            addCriterion("OrderIndex =", value, "orderindex");
            return (Criteria) this;
        }

        public Criteria andOrderindexNotEqualTo(Integer value) {
            addCriterion("OrderIndex <>", value, "orderindex");
            return (Criteria) this;
        }

        public Criteria andOrderindexGreaterThan(Integer value) {
            addCriterion("OrderIndex >", value, "orderindex");
            return (Criteria) this;
        }

        public Criteria andOrderindexGreaterThanOrEqualTo(Integer value) {
            addCriterion("OrderIndex >=", value, "orderindex");
            return (Criteria) this;
        }

        public Criteria andOrderindexLessThan(Integer value) {
            addCriterion("OrderIndex <", value, "orderindex");
            return (Criteria) this;
        }

        public Criteria andOrderindexLessThanOrEqualTo(Integer value) {
            addCriterion("OrderIndex <=", value, "orderindex");
            return (Criteria) this;
        }

        public Criteria andOrderindexIn(List<Integer> values) {
            addCriterion("OrderIndex in", values, "orderindex");
            return (Criteria) this;
        }

        public Criteria andOrderindexNotIn(List<Integer> values) {
            addCriterion("OrderIndex not in", values, "orderindex");
            return (Criteria) this;
        }

        public Criteria andOrderindexBetween(Integer value1, Integer value2) {
            addCriterion("OrderIndex between", value1, value2, "orderindex");
            return (Criteria) this;
        }

        public Criteria andOrderindexNotBetween(Integer value1, Integer value2) {
            addCriterion("OrderIndex not between", value1, value2, "orderindex");
            return (Criteria) this;
        }

        public Criteria andVolunteerproductidIsNull() {
            addCriterion("VolunteerProductID is null");
            return (Criteria) this;
        }

        public Criteria andVolunteerproductidIsNotNull() {
            addCriterion("VolunteerProductID is not null");
            return (Criteria) this;
        }

        public Criteria andVolunteerproductidEqualTo(String value) {
            addCriterion("VolunteerProductID =", value, "volunteerproductid");
            return (Criteria) this;
        }

        public Criteria andVolunteerproductidNotEqualTo(String value) {
            addCriterion("VolunteerProductID <>", value, "volunteerproductid");
            return (Criteria) this;
        }

        public Criteria andVolunteerproductidGreaterThan(String value) {
            addCriterion("VolunteerProductID >", value, "volunteerproductid");
            return (Criteria) this;
        }

        public Criteria andVolunteerproductidGreaterThanOrEqualTo(String value) {
            addCriterion("VolunteerProductID >=", value, "volunteerproductid");
            return (Criteria) this;
        }

        public Criteria andVolunteerproductidLessThan(String value) {
            addCriterion("VolunteerProductID <", value, "volunteerproductid");
            return (Criteria) this;
        }

        public Criteria andVolunteerproductidLessThanOrEqualTo(String value) {
            addCriterion("VolunteerProductID <=", value, "volunteerproductid");
            return (Criteria) this;
        }

        public Criteria andVolunteerproductidLike(String value) {
            addCriterion("VolunteerProductID like", value, "volunteerproductid");
            return (Criteria) this;
        }

        public Criteria andVolunteerproductidNotLike(String value) {
            addCriterion("VolunteerProductID not like", value, "volunteerproductid");
            return (Criteria) this;
        }

        public Criteria andVolunteerproductidIn(List<String> values) {
            addCriterion("VolunteerProductID in", values, "volunteerproductid");
            return (Criteria) this;
        }

        public Criteria andVolunteerproductidNotIn(List<String> values) {
            addCriterion("VolunteerProductID not in", values, "volunteerproductid");
            return (Criteria) this;
        }

        public Criteria andVolunteerproductidBetween(String value1, String value2) {
            addCriterion("VolunteerProductID between", value1, value2, "volunteerproductid");
            return (Criteria) this;
        }

        public Criteria andVolunteerproductidNotBetween(String value1, String value2) {
            addCriterion("VolunteerProductID not between", value1, value2, "volunteerproductid");
            return (Criteria) this;
        }

        public Criteria andDirectpriceIsNull() {
            addCriterion("DirectPrice is null");
            return (Criteria) this;
        }

        public Criteria andDirectpriceIsNotNull() {
            addCriterion("DirectPrice is not null");
            return (Criteria) this;
        }

        public Criteria andDirectpriceEqualTo(BigDecimal value) {
            addCriterion("DirectPrice =", value, "directprice");
            return (Criteria) this;
        }

        public Criteria andDirectpriceNotEqualTo(BigDecimal value) {
            addCriterion("DirectPrice <>", value, "directprice");
            return (Criteria) this;
        }

        public Criteria andDirectpriceGreaterThan(BigDecimal value) {
            addCriterion("DirectPrice >", value, "directprice");
            return (Criteria) this;
        }

        public Criteria andDirectpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DirectPrice >=", value, "directprice");
            return (Criteria) this;
        }

        public Criteria andDirectpriceLessThan(BigDecimal value) {
            addCriterion("DirectPrice <", value, "directprice");
            return (Criteria) this;
        }

        public Criteria andDirectpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DirectPrice <=", value, "directprice");
            return (Criteria) this;
        }

        public Criteria andDirectpriceIn(List<BigDecimal> values) {
            addCriterion("DirectPrice in", values, "directprice");
            return (Criteria) this;
        }

        public Criteria andDirectpriceNotIn(List<BigDecimal> values) {
            addCriterion("DirectPrice not in", values, "directprice");
            return (Criteria) this;
        }

        public Criteria andDirectpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DirectPrice between", value1, value2, "directprice");
            return (Criteria) this;
        }

        public Criteria andDirectpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DirectPrice not between", value1, value2, "directprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceIsNull() {
            addCriterion("SalesPrice is null");
            return (Criteria) this;
        }

        public Criteria andSalespriceIsNotNull() {
            addCriterion("SalesPrice is not null");
            return (Criteria) this;
        }

        public Criteria andSalespriceEqualTo(BigDecimal value) {
            addCriterion("SalesPrice =", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceNotEqualTo(BigDecimal value) {
            addCriterion("SalesPrice <>", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceGreaterThan(BigDecimal value) {
            addCriterion("SalesPrice >", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SalesPrice >=", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceLessThan(BigDecimal value) {
            addCriterion("SalesPrice <", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SalesPrice <=", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceIn(List<BigDecimal> values) {
            addCriterion("SalesPrice in", values, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceNotIn(List<BigDecimal> values) {
            addCriterion("SalesPrice not in", values, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SalesPrice between", value1, value2, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SalesPrice not between", value1, value2, "salesprice");
            return (Criteria) this;
        }

        public Criteria andRebatepriceIsNull() {
            addCriterion("RebatePrice is null");
            return (Criteria) this;
        }

        public Criteria andRebatepriceIsNotNull() {
            addCriterion("RebatePrice is not null");
            return (Criteria) this;
        }

        public Criteria andRebatepriceEqualTo(BigDecimal value) {
            addCriterion("RebatePrice =", value, "rebateprice");
            return (Criteria) this;
        }

        public Criteria andRebatepriceNotEqualTo(BigDecimal value) {
            addCriterion("RebatePrice <>", value, "rebateprice");
            return (Criteria) this;
        }

        public Criteria andRebatepriceGreaterThan(BigDecimal value) {
            addCriterion("RebatePrice >", value, "rebateprice");
            return (Criteria) this;
        }

        public Criteria andRebatepriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RebatePrice >=", value, "rebateprice");
            return (Criteria) this;
        }

        public Criteria andRebatepriceLessThan(BigDecimal value) {
            addCriterion("RebatePrice <", value, "rebateprice");
            return (Criteria) this;
        }

        public Criteria andRebatepriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RebatePrice <=", value, "rebateprice");
            return (Criteria) this;
        }

        public Criteria andRebatepriceIn(List<BigDecimal> values) {
            addCriterion("RebatePrice in", values, "rebateprice");
            return (Criteria) this;
        }

        public Criteria andRebatepriceNotIn(List<BigDecimal> values) {
            addCriterion("RebatePrice not in", values, "rebateprice");
            return (Criteria) this;
        }

        public Criteria andRebatepriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RebatePrice between", value1, value2, "rebateprice");
            return (Criteria) this;
        }

        public Criteria andRebatepriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RebatePrice not between", value1, value2, "rebateprice");
            return (Criteria) this;
        }

        public Criteria andSingleroompriceIsNull() {
            addCriterion("SingleRoomPrice is null");
            return (Criteria) this;
        }

        public Criteria andSingleroompriceIsNotNull() {
            addCriterion("SingleRoomPrice is not null");
            return (Criteria) this;
        }

        public Criteria andSingleroompriceEqualTo(BigDecimal value) {
            addCriterion("SingleRoomPrice =", value, "singleroomprice");
            return (Criteria) this;
        }

        public Criteria andSingleroompriceNotEqualTo(BigDecimal value) {
            addCriterion("SingleRoomPrice <>", value, "singleroomprice");
            return (Criteria) this;
        }

        public Criteria andSingleroompriceGreaterThan(BigDecimal value) {
            addCriterion("SingleRoomPrice >", value, "singleroomprice");
            return (Criteria) this;
        }

        public Criteria andSingleroompriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SingleRoomPrice >=", value, "singleroomprice");
            return (Criteria) this;
        }

        public Criteria andSingleroompriceLessThan(BigDecimal value) {
            addCriterion("SingleRoomPrice <", value, "singleroomprice");
            return (Criteria) this;
        }

        public Criteria andSingleroompriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SingleRoomPrice <=", value, "singleroomprice");
            return (Criteria) this;
        }

        public Criteria andSingleroompriceIn(List<BigDecimal> values) {
            addCriterion("SingleRoomPrice in", values, "singleroomprice");
            return (Criteria) this;
        }

        public Criteria andSingleroompriceNotIn(List<BigDecimal> values) {
            addCriterion("SingleRoomPrice not in", values, "singleroomprice");
            return (Criteria) this;
        }

        public Criteria andSingleroompriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SingleRoomPrice between", value1, value2, "singleroomprice");
            return (Criteria) this;
        }

        public Criteria andSingleroompriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SingleRoomPrice not between", value1, value2, "singleroomprice");
            return (Criteria) this;
        }

        public Criteria andSalescostpriceIsNull() {
            addCriterion("SalesCostPrice is null");
            return (Criteria) this;
        }

        public Criteria andSalescostpriceIsNotNull() {
            addCriterion("SalesCostPrice is not null");
            return (Criteria) this;
        }

        public Criteria andSalescostpriceEqualTo(BigDecimal value) {
            addCriterion("SalesCostPrice =", value, "salescostprice");
            return (Criteria) this;
        }

        public Criteria andSalescostpriceNotEqualTo(BigDecimal value) {
            addCriterion("SalesCostPrice <>", value, "salescostprice");
            return (Criteria) this;
        }

        public Criteria andSalescostpriceGreaterThan(BigDecimal value) {
            addCriterion("SalesCostPrice >", value, "salescostprice");
            return (Criteria) this;
        }

        public Criteria andSalescostpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SalesCostPrice >=", value, "salescostprice");
            return (Criteria) this;
        }

        public Criteria andSalescostpriceLessThan(BigDecimal value) {
            addCriterion("SalesCostPrice <", value, "salescostprice");
            return (Criteria) this;
        }

        public Criteria andSalescostpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SalesCostPrice <=", value, "salescostprice");
            return (Criteria) this;
        }

        public Criteria andSalescostpriceIn(List<BigDecimal> values) {
            addCriterion("SalesCostPrice in", values, "salescostprice");
            return (Criteria) this;
        }

        public Criteria andSalescostpriceNotIn(List<BigDecimal> values) {
            addCriterion("SalesCostPrice not in", values, "salescostprice");
            return (Criteria) this;
        }

        public Criteria andSalescostpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SalesCostPrice between", value1, value2, "salescostprice");
            return (Criteria) this;
        }

        public Criteria andSalescostpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SalesCostPrice not between", value1, value2, "salescostprice");
            return (Criteria) this;
        }

        public Criteria andDirectcostpriceIsNull() {
            addCriterion("DirectCostPrice is null");
            return (Criteria) this;
        }

        public Criteria andDirectcostpriceIsNotNull() {
            addCriterion("DirectCostPrice is not null");
            return (Criteria) this;
        }

        public Criteria andDirectcostpriceEqualTo(BigDecimal value) {
            addCriterion("DirectCostPrice =", value, "directcostprice");
            return (Criteria) this;
        }

        public Criteria andDirectcostpriceNotEqualTo(BigDecimal value) {
            addCriterion("DirectCostPrice <>", value, "directcostprice");
            return (Criteria) this;
        }

        public Criteria andDirectcostpriceGreaterThan(BigDecimal value) {
            addCriterion("DirectCostPrice >", value, "directcostprice");
            return (Criteria) this;
        }

        public Criteria andDirectcostpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DirectCostPrice >=", value, "directcostprice");
            return (Criteria) this;
        }

        public Criteria andDirectcostpriceLessThan(BigDecimal value) {
            addCriterion("DirectCostPrice <", value, "directcostprice");
            return (Criteria) this;
        }

        public Criteria andDirectcostpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DirectCostPrice <=", value, "directcostprice");
            return (Criteria) this;
        }

        public Criteria andDirectcostpriceIn(List<BigDecimal> values) {
            addCriterion("DirectCostPrice in", values, "directcostprice");
            return (Criteria) this;
        }

        public Criteria andDirectcostpriceNotIn(List<BigDecimal> values) {
            addCriterion("DirectCostPrice not in", values, "directcostprice");
            return (Criteria) this;
        }

        public Criteria andDirectcostpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DirectCostPrice between", value1, value2, "directcostprice");
            return (Criteria) this;
        }

        public Criteria andDirectcostpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DirectCostPrice not between", value1, value2, "directcostprice");
            return (Criteria) this;
        }

        public Criteria andDiscounttypecIsNull() {
            addCriterion("DiscountTypeC is null");
            return (Criteria) this;
        }

        public Criteria andDiscounttypecIsNotNull() {
            addCriterion("DiscountTypeC is not null");
            return (Criteria) this;
        }

        public Criteria andDiscounttypecEqualTo(Integer value) {
            addCriterion("DiscountTypeC =", value, "discounttypec");
            return (Criteria) this;
        }

        public Criteria andDiscounttypecNotEqualTo(Integer value) {
            addCriterion("DiscountTypeC <>", value, "discounttypec");
            return (Criteria) this;
        }

        public Criteria andDiscounttypecGreaterThan(Integer value) {
            addCriterion("DiscountTypeC >", value, "discounttypec");
            return (Criteria) this;
        }

        public Criteria andDiscounttypecGreaterThanOrEqualTo(Integer value) {
            addCriterion("DiscountTypeC >=", value, "discounttypec");
            return (Criteria) this;
        }

        public Criteria andDiscounttypecLessThan(Integer value) {
            addCriterion("DiscountTypeC <", value, "discounttypec");
            return (Criteria) this;
        }

        public Criteria andDiscounttypecLessThanOrEqualTo(Integer value) {
            addCriterion("DiscountTypeC <=", value, "discounttypec");
            return (Criteria) this;
        }

        public Criteria andDiscounttypecIn(List<Integer> values) {
            addCriterion("DiscountTypeC in", values, "discounttypec");
            return (Criteria) this;
        }

        public Criteria andDiscounttypecNotIn(List<Integer> values) {
            addCriterion("DiscountTypeC not in", values, "discounttypec");
            return (Criteria) this;
        }

        public Criteria andDiscounttypecBetween(Integer value1, Integer value2) {
            addCriterion("DiscountTypeC between", value1, value2, "discounttypec");
            return (Criteria) this;
        }

        public Criteria andDiscounttypecNotBetween(Integer value1, Integer value2) {
            addCriterion("DiscountTypeC not between", value1, value2, "discounttypec");
            return (Criteria) this;
        }

        public Criteria andPrevaluecIsNull() {
            addCriterion("PreValueC is null");
            return (Criteria) this;
        }

        public Criteria andPrevaluecIsNotNull() {
            addCriterion("PreValueC is not null");
            return (Criteria) this;
        }

        public Criteria andPrevaluecEqualTo(BigDecimal value) {
            addCriterion("PreValueC =", value, "prevaluec");
            return (Criteria) this;
        }

        public Criteria andPrevaluecNotEqualTo(BigDecimal value) {
            addCriterion("PreValueC <>", value, "prevaluec");
            return (Criteria) this;
        }

        public Criteria andPrevaluecGreaterThan(BigDecimal value) {
            addCriterion("PreValueC >", value, "prevaluec");
            return (Criteria) this;
        }

        public Criteria andPrevaluecGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PreValueC >=", value, "prevaluec");
            return (Criteria) this;
        }

        public Criteria andPrevaluecLessThan(BigDecimal value) {
            addCriterion("PreValueC <", value, "prevaluec");
            return (Criteria) this;
        }

        public Criteria andPrevaluecLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PreValueC <=", value, "prevaluec");
            return (Criteria) this;
        }

        public Criteria andPrevaluecIn(List<BigDecimal> values) {
            addCriterion("PreValueC in", values, "prevaluec");
            return (Criteria) this;
        }

        public Criteria andPrevaluecNotIn(List<BigDecimal> values) {
            addCriterion("PreValueC not in", values, "prevaluec");
            return (Criteria) this;
        }

        public Criteria andPrevaluecBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PreValueC between", value1, value2, "prevaluec");
            return (Criteria) this;
        }

        public Criteria andPrevaluecNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PreValueC not between", value1, value2, "prevaluec");
            return (Criteria) this;
        }

        public Criteria andDiscounttypebIsNull() {
            addCriterion("DiscountTypeB is null");
            return (Criteria) this;
        }

        public Criteria andDiscounttypebIsNotNull() {
            addCriterion("DiscountTypeB is not null");
            return (Criteria) this;
        }

        public Criteria andDiscounttypebEqualTo(Integer value) {
            addCriterion("DiscountTypeB =", value, "discounttypeb");
            return (Criteria) this;
        }

        public Criteria andDiscounttypebNotEqualTo(Integer value) {
            addCriterion("DiscountTypeB <>", value, "discounttypeb");
            return (Criteria) this;
        }

        public Criteria andDiscounttypebGreaterThan(Integer value) {
            addCriterion("DiscountTypeB >", value, "discounttypeb");
            return (Criteria) this;
        }

        public Criteria andDiscounttypebGreaterThanOrEqualTo(Integer value) {
            addCriterion("DiscountTypeB >=", value, "discounttypeb");
            return (Criteria) this;
        }

        public Criteria andDiscounttypebLessThan(Integer value) {
            addCriterion("DiscountTypeB <", value, "discounttypeb");
            return (Criteria) this;
        }

        public Criteria andDiscounttypebLessThanOrEqualTo(Integer value) {
            addCriterion("DiscountTypeB <=", value, "discounttypeb");
            return (Criteria) this;
        }

        public Criteria andDiscounttypebIn(List<Integer> values) {
            addCriterion("DiscountTypeB in", values, "discounttypeb");
            return (Criteria) this;
        }

        public Criteria andDiscounttypebNotIn(List<Integer> values) {
            addCriterion("DiscountTypeB not in", values, "discounttypeb");
            return (Criteria) this;
        }

        public Criteria andDiscounttypebBetween(Integer value1, Integer value2) {
            addCriterion("DiscountTypeB between", value1, value2, "discounttypeb");
            return (Criteria) this;
        }

        public Criteria andDiscounttypebNotBetween(Integer value1, Integer value2) {
            addCriterion("DiscountTypeB not between", value1, value2, "discounttypeb");
            return (Criteria) this;
        }

        public Criteria andPrevaluebIsNull() {
            addCriterion("PreValueB is null");
            return (Criteria) this;
        }

        public Criteria andPrevaluebIsNotNull() {
            addCriterion("PreValueB is not null");
            return (Criteria) this;
        }

        public Criteria andPrevaluebEqualTo(BigDecimal value) {
            addCriterion("PreValueB =", value, "prevalueb");
            return (Criteria) this;
        }

        public Criteria andPrevaluebNotEqualTo(BigDecimal value) {
            addCriterion("PreValueB <>", value, "prevalueb");
            return (Criteria) this;
        }

        public Criteria andPrevaluebGreaterThan(BigDecimal value) {
            addCriterion("PreValueB >", value, "prevalueb");
            return (Criteria) this;
        }

        public Criteria andPrevaluebGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PreValueB >=", value, "prevalueb");
            return (Criteria) this;
        }

        public Criteria andPrevaluebLessThan(BigDecimal value) {
            addCriterion("PreValueB <", value, "prevalueb");
            return (Criteria) this;
        }

        public Criteria andPrevaluebLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PreValueB <=", value, "prevalueb");
            return (Criteria) this;
        }

        public Criteria andPrevaluebIn(List<BigDecimal> values) {
            addCriterion("PreValueB in", values, "prevalueb");
            return (Criteria) this;
        }

        public Criteria andPrevaluebNotIn(List<BigDecimal> values) {
            addCriterion("PreValueB not in", values, "prevalueb");
            return (Criteria) this;
        }

        public Criteria andPrevaluebBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PreValueB between", value1, value2, "prevalueb");
            return (Criteria) this;
        }

        public Criteria andPrevaluebNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PreValueB not between", value1, value2, "prevalueb");
            return (Criteria) this;
        }

        public Criteria andIsoccupyseatIsNull() {
            addCriterion("IsOccupySeat is null");
            return (Criteria) this;
        }

        public Criteria andIsoccupyseatIsNotNull() {
            addCriterion("IsOccupySeat is not null");
            return (Criteria) this;
        }

        public Criteria andIsoccupyseatEqualTo(Boolean value) {
            addCriterion("IsOccupySeat =", value, "isoccupyseat");
            return (Criteria) this;
        }

        public Criteria andIsoccupyseatNotEqualTo(Boolean value) {
            addCriterion("IsOccupySeat <>", value, "isoccupyseat");
            return (Criteria) this;
        }

        public Criteria andIsoccupyseatGreaterThan(Boolean value) {
            addCriterion("IsOccupySeat >", value, "isoccupyseat");
            return (Criteria) this;
        }

        public Criteria andIsoccupyseatGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsOccupySeat >=", value, "isoccupyseat");
            return (Criteria) this;
        }

        public Criteria andIsoccupyseatLessThan(Boolean value) {
            addCriterion("IsOccupySeat <", value, "isoccupyseat");
            return (Criteria) this;
        }

        public Criteria andIsoccupyseatLessThanOrEqualTo(Boolean value) {
            addCriterion("IsOccupySeat <=", value, "isoccupyseat");
            return (Criteria) this;
        }

        public Criteria andIsoccupyseatIn(List<Boolean> values) {
            addCriterion("IsOccupySeat in", values, "isoccupyseat");
            return (Criteria) this;
        }

        public Criteria andIsoccupyseatNotIn(List<Boolean> values) {
            addCriterion("IsOccupySeat not in", values, "isoccupyseat");
            return (Criteria) this;
        }

        public Criteria andIsoccupyseatBetween(Boolean value1, Boolean value2) {
            addCriterion("IsOccupySeat between", value1, value2, "isoccupyseat");
            return (Criteria) this;
        }

        public Criteria andIsoccupyseatNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsOccupySeat not between", value1, value2, "isoccupyseat");
            return (Criteria) this;
        }

        public Criteria andIsdefaultIsNull() {
            addCriterion("IsDefault is null");
            return (Criteria) this;
        }

        public Criteria andIsdefaultIsNotNull() {
            addCriterion("IsDefault is not null");
            return (Criteria) this;
        }

        public Criteria andIsdefaultEqualTo(Boolean value) {
            addCriterion("IsDefault =", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotEqualTo(Boolean value) {
            addCriterion("IsDefault <>", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultGreaterThan(Boolean value) {
            addCriterion("IsDefault >", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsDefault >=", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultLessThan(Boolean value) {
            addCriterion("IsDefault <", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultLessThanOrEqualTo(Boolean value) {
            addCriterion("IsDefault <=", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultIn(List<Boolean> values) {
            addCriterion("IsDefault in", values, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotIn(List<Boolean> values) {
            addCriterion("IsDefault not in", values, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultBetween(Boolean value1, Boolean value2) {
            addCriterion("IsDefault between", value1, value2, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsDefault not between", value1, value2, "isdefault");
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

        public Criteria andAllowanceIsNull() {
            addCriterion("Allowance is null");
            return (Criteria) this;
        }

        public Criteria andAllowanceIsNotNull() {
            addCriterion("Allowance is not null");
            return (Criteria) this;
        }

        public Criteria andAllowanceEqualTo(BigDecimal value) {
            addCriterion("Allowance =", value, "allowance");
            return (Criteria) this;
        }

        public Criteria andAllowanceNotEqualTo(BigDecimal value) {
            addCriterion("Allowance <>", value, "allowance");
            return (Criteria) this;
        }

        public Criteria andAllowanceGreaterThan(BigDecimal value) {
            addCriterion("Allowance >", value, "allowance");
            return (Criteria) this;
        }

        public Criteria andAllowanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Allowance >=", value, "allowance");
            return (Criteria) this;
        }

        public Criteria andAllowanceLessThan(BigDecimal value) {
            addCriterion("Allowance <", value, "allowance");
            return (Criteria) this;
        }

        public Criteria andAllowanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Allowance <=", value, "allowance");
            return (Criteria) this;
        }

        public Criteria andAllowanceIn(List<BigDecimal> values) {
            addCriterion("Allowance in", values, "allowance");
            return (Criteria) this;
        }

        public Criteria andAllowanceNotIn(List<BigDecimal> values) {
            addCriterion("Allowance not in", values, "allowance");
            return (Criteria) this;
        }

        public Criteria andAllowanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Allowance between", value1, value2, "allowance");
            return (Criteria) this;
        }

        public Criteria andAllowanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Allowance not between", value1, value2, "allowance");
            return (Criteria) this;
        }

        public Criteria andNewvolunteerproductidIsNull() {
            addCriterion("NewVolunteerProductID is null");
            return (Criteria) this;
        }

        public Criteria andNewvolunteerproductidIsNotNull() {
            addCriterion("NewVolunteerProductID is not null");
            return (Criteria) this;
        }

        public Criteria andNewvolunteerproductidEqualTo(String value) {
            addCriterion("NewVolunteerProductID =", value, "newvolunteerproductid");
            return (Criteria) this;
        }

        public Criteria andNewvolunteerproductidNotEqualTo(String value) {
            addCriterion("NewVolunteerProductID <>", value, "newvolunteerproductid");
            return (Criteria) this;
        }

        public Criteria andNewvolunteerproductidGreaterThan(String value) {
            addCriterion("NewVolunteerProductID >", value, "newvolunteerproductid");
            return (Criteria) this;
        }

        public Criteria andNewvolunteerproductidGreaterThanOrEqualTo(String value) {
            addCriterion("NewVolunteerProductID >=", value, "newvolunteerproductid");
            return (Criteria) this;
        }

        public Criteria andNewvolunteerproductidLessThan(String value) {
            addCriterion("NewVolunteerProductID <", value, "newvolunteerproductid");
            return (Criteria) this;
        }

        public Criteria andNewvolunteerproductidLessThanOrEqualTo(String value) {
            addCriterion("NewVolunteerProductID <=", value, "newvolunteerproductid");
            return (Criteria) this;
        }

        public Criteria andNewvolunteerproductidLike(String value) {
            addCriterion("NewVolunteerProductID like", value, "newvolunteerproductid");
            return (Criteria) this;
        }

        public Criteria andNewvolunteerproductidNotLike(String value) {
            addCriterion("NewVolunteerProductID not like", value, "newvolunteerproductid");
            return (Criteria) this;
        }

        public Criteria andNewvolunteerproductidIn(List<String> values) {
            addCriterion("NewVolunteerProductID in", values, "newvolunteerproductid");
            return (Criteria) this;
        }

        public Criteria andNewvolunteerproductidNotIn(List<String> values) {
            addCriterion("NewVolunteerProductID not in", values, "newvolunteerproductid");
            return (Criteria) this;
        }

        public Criteria andNewvolunteerproductidBetween(String value1, String value2) {
            addCriterion("NewVolunteerProductID between", value1, value2, "newvolunteerproductid");
            return (Criteria) this;
        }

        public Criteria andNewvolunteerproductidNotBetween(String value1, String value2) {
            addCriterion("NewVolunteerProductID not between", value1, value2, "newvolunteerproductid");
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