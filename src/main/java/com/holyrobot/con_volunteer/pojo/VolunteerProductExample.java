package com.holyrobot.con_volunteer.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VolunteerProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VolunteerProductExample() {
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

        public Criteria andTourstatusIsNull() {
            addCriterion("TourStatus is null");
            return (Criteria) this;
        }

        public Criteria andTourstatusIsNotNull() {
            addCriterion("TourStatus is not null");
            return (Criteria) this;
        }

        public Criteria andTourstatusEqualTo(Integer value) {
            addCriterion("TourStatus =", value, "tourstatus");
            return (Criteria) this;
        }

        public Criteria andTourstatusNotEqualTo(Integer value) {
            addCriterion("TourStatus <>", value, "tourstatus");
            return (Criteria) this;
        }

        public Criteria andTourstatusGreaterThan(Integer value) {
            addCriterion("TourStatus >", value, "tourstatus");
            return (Criteria) this;
        }

        public Criteria andTourstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("TourStatus >=", value, "tourstatus");
            return (Criteria) this;
        }

        public Criteria andTourstatusLessThan(Integer value) {
            addCriterion("TourStatus <", value, "tourstatus");
            return (Criteria) this;
        }

        public Criteria andTourstatusLessThanOrEqualTo(Integer value) {
            addCriterion("TourStatus <=", value, "tourstatus");
            return (Criteria) this;
        }

        public Criteria andTourstatusIn(List<Integer> values) {
            addCriterion("TourStatus in", values, "tourstatus");
            return (Criteria) this;
        }

        public Criteria andTourstatusNotIn(List<Integer> values) {
            addCriterion("TourStatus not in", values, "tourstatus");
            return (Criteria) this;
        }

        public Criteria andTourstatusBetween(Integer value1, Integer value2) {
            addCriterion("TourStatus between", value1, value2, "tourstatus");
            return (Criteria) this;
        }

        public Criteria andTourstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("TourStatus not between", value1, value2, "tourstatus");
            return (Criteria) this;
        }

        public Criteria andPricestatusIsNull() {
            addCriterion("PriceStatus is null");
            return (Criteria) this;
        }

        public Criteria andPricestatusIsNotNull() {
            addCriterion("PriceStatus is not null");
            return (Criteria) this;
        }

        public Criteria andPricestatusEqualTo(Integer value) {
            addCriterion("PriceStatus =", value, "pricestatus");
            return (Criteria) this;
        }

        public Criteria andPricestatusNotEqualTo(Integer value) {
            addCriterion("PriceStatus <>", value, "pricestatus");
            return (Criteria) this;
        }

        public Criteria andPricestatusGreaterThan(Integer value) {
            addCriterion("PriceStatus >", value, "pricestatus");
            return (Criteria) this;
        }

        public Criteria andPricestatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("PriceStatus >=", value, "pricestatus");
            return (Criteria) this;
        }

        public Criteria andPricestatusLessThan(Integer value) {
            addCriterion("PriceStatus <", value, "pricestatus");
            return (Criteria) this;
        }

        public Criteria andPricestatusLessThanOrEqualTo(Integer value) {
            addCriterion("PriceStatus <=", value, "pricestatus");
            return (Criteria) this;
        }

        public Criteria andPricestatusIn(List<Integer> values) {
            addCriterion("PriceStatus in", values, "pricestatus");
            return (Criteria) this;
        }

        public Criteria andPricestatusNotIn(List<Integer> values) {
            addCriterion("PriceStatus not in", values, "pricestatus");
            return (Criteria) this;
        }

        public Criteria andPricestatusBetween(Integer value1, Integer value2) {
            addCriterion("PriceStatus between", value1, value2, "pricestatus");
            return (Criteria) this;
        }

        public Criteria andPricestatusNotBetween(Integer value1, Integer value2) {
            addCriterion("PriceStatus not between", value1, value2, "pricestatus");
            return (Criteria) this;
        }

        public Criteria andProstatusIsNull() {
            addCriterion("ProStatus is null");
            return (Criteria) this;
        }

        public Criteria andProstatusIsNotNull() {
            addCriterion("ProStatus is not null");
            return (Criteria) this;
        }

        public Criteria andProstatusEqualTo(Integer value) {
            addCriterion("ProStatus =", value, "prostatus");
            return (Criteria) this;
        }

        public Criteria andProstatusNotEqualTo(Integer value) {
            addCriterion("ProStatus <>", value, "prostatus");
            return (Criteria) this;
        }

        public Criteria andProstatusGreaterThan(Integer value) {
            addCriterion("ProStatus >", value, "prostatus");
            return (Criteria) this;
        }

        public Criteria andProstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProStatus >=", value, "prostatus");
            return (Criteria) this;
        }

        public Criteria andProstatusLessThan(Integer value) {
            addCriterion("ProStatus <", value, "prostatus");
            return (Criteria) this;
        }

        public Criteria andProstatusLessThanOrEqualTo(Integer value) {
            addCriterion("ProStatus <=", value, "prostatus");
            return (Criteria) this;
        }

        public Criteria andProstatusIn(List<Integer> values) {
            addCriterion("ProStatus in", values, "prostatus");
            return (Criteria) this;
        }

        public Criteria andProstatusNotIn(List<Integer> values) {
            addCriterion("ProStatus not in", values, "prostatus");
            return (Criteria) this;
        }

        public Criteria andProstatusBetween(Integer value1, Integer value2) {
            addCriterion("ProStatus between", value1, value2, "prostatus");
            return (Criteria) this;
        }

        public Criteria andProstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("ProStatus not between", value1, value2, "prostatus");
            return (Criteria) this;
        }

        public Criteria andDirectsalessendidIsNull() {
            addCriterion("DirectSalesSendID is null");
            return (Criteria) this;
        }

        public Criteria andDirectsalessendidIsNotNull() {
            addCriterion("DirectSalesSendID is not null");
            return (Criteria) this;
        }

        public Criteria andDirectsalessendidEqualTo(String value) {
            addCriterion("DirectSalesSendID =", value, "directsalessendid");
            return (Criteria) this;
        }

        public Criteria andDirectsalessendidNotEqualTo(String value) {
            addCriterion("DirectSalesSendID <>", value, "directsalessendid");
            return (Criteria) this;
        }

        public Criteria andDirectsalessendidGreaterThan(String value) {
            addCriterion("DirectSalesSendID >", value, "directsalessendid");
            return (Criteria) this;
        }

        public Criteria andDirectsalessendidGreaterThanOrEqualTo(String value) {
            addCriterion("DirectSalesSendID >=", value, "directsalessendid");
            return (Criteria) this;
        }

        public Criteria andDirectsalessendidLessThan(String value) {
            addCriterion("DirectSalesSendID <", value, "directsalessendid");
            return (Criteria) this;
        }

        public Criteria andDirectsalessendidLessThanOrEqualTo(String value) {
            addCriterion("DirectSalesSendID <=", value, "directsalessendid");
            return (Criteria) this;
        }

        public Criteria andDirectsalessendidLike(String value) {
            addCriterion("DirectSalesSendID like", value, "directsalessendid");
            return (Criteria) this;
        }

        public Criteria andDirectsalessendidNotLike(String value) {
            addCriterion("DirectSalesSendID not like", value, "directsalessendid");
            return (Criteria) this;
        }

        public Criteria andDirectsalessendidIn(List<String> values) {
            addCriterion("DirectSalesSendID in", values, "directsalessendid");
            return (Criteria) this;
        }

        public Criteria andDirectsalessendidNotIn(List<String> values) {
            addCriterion("DirectSalesSendID not in", values, "directsalessendid");
            return (Criteria) this;
        }

        public Criteria andDirectsalessendidBetween(String value1, String value2) {
            addCriterion("DirectSalesSendID between", value1, value2, "directsalessendid");
            return (Criteria) this;
        }

        public Criteria andDirectsalessendidNotBetween(String value1, String value2) {
            addCriterion("DirectSalesSendID not between", value1, value2, "directsalessendid");
            return (Criteria) this;
        }

        public Criteria andDirectproductidIsNull() {
            addCriterion("DirectProductID is null");
            return (Criteria) this;
        }

        public Criteria andDirectproductidIsNotNull() {
            addCriterion("DirectProductID is not null");
            return (Criteria) this;
        }

        public Criteria andDirectproductidEqualTo(String value) {
            addCriterion("DirectProductID =", value, "directproductid");
            return (Criteria) this;
        }

        public Criteria andDirectproductidNotEqualTo(String value) {
            addCriterion("DirectProductID <>", value, "directproductid");
            return (Criteria) this;
        }

        public Criteria andDirectproductidGreaterThan(String value) {
            addCriterion("DirectProductID >", value, "directproductid");
            return (Criteria) this;
        }

        public Criteria andDirectproductidGreaterThanOrEqualTo(String value) {
            addCriterion("DirectProductID >=", value, "directproductid");
            return (Criteria) this;
        }

        public Criteria andDirectproductidLessThan(String value) {
            addCriterion("DirectProductID <", value, "directproductid");
            return (Criteria) this;
        }

        public Criteria andDirectproductidLessThanOrEqualTo(String value) {
            addCriterion("DirectProductID <=", value, "directproductid");
            return (Criteria) this;
        }

        public Criteria andDirectproductidLike(String value) {
            addCriterion("DirectProductID like", value, "directproductid");
            return (Criteria) this;
        }

        public Criteria andDirectproductidNotLike(String value) {
            addCriterion("DirectProductID not like", value, "directproductid");
            return (Criteria) this;
        }

        public Criteria andDirectproductidIn(List<String> values) {
            addCriterion("DirectProductID in", values, "directproductid");
            return (Criteria) this;
        }

        public Criteria andDirectproductidNotIn(List<String> values) {
            addCriterion("DirectProductID not in", values, "directproductid");
            return (Criteria) this;
        }

        public Criteria andDirectproductidBetween(String value1, String value2) {
            addCriterion("DirectProductID between", value1, value2, "directproductid");
            return (Criteria) this;
        }

        public Criteria andDirectproductidNotBetween(String value1, String value2) {
            addCriterion("DirectProductID not between", value1, value2, "directproductid");
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