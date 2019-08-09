package com.holyrobot.con_volunteer.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class VolunteerProductTourExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VolunteerProductTourExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andPlannumIsNull() {
            addCriterion("PlanNum is null");
            return (Criteria) this;
        }

        public Criteria andPlannumIsNotNull() {
            addCriterion("PlanNum is not null");
            return (Criteria) this;
        }

        public Criteria andPlannumEqualTo(Integer value) {
            addCriterion("PlanNum =", value, "plannum");
            return (Criteria) this;
        }

        public Criteria andPlannumNotEqualTo(Integer value) {
            addCriterion("PlanNum <>", value, "plannum");
            return (Criteria) this;
        }

        public Criteria andPlannumGreaterThan(Integer value) {
            addCriterion("PlanNum >", value, "plannum");
            return (Criteria) this;
        }

        public Criteria andPlannumGreaterThanOrEqualTo(Integer value) {
            addCriterion("PlanNum >=", value, "plannum");
            return (Criteria) this;
        }

        public Criteria andPlannumLessThan(Integer value) {
            addCriterion("PlanNum <", value, "plannum");
            return (Criteria) this;
        }

        public Criteria andPlannumLessThanOrEqualTo(Integer value) {
            addCriterion("PlanNum <=", value, "plannum");
            return (Criteria) this;
        }

        public Criteria andPlannumIn(List<Integer> values) {
            addCriterion("PlanNum in", values, "plannum");
            return (Criteria) this;
        }

        public Criteria andPlannumNotIn(List<Integer> values) {
            addCriterion("PlanNum not in", values, "plannum");
            return (Criteria) this;
        }

        public Criteria andPlannumBetween(Integer value1, Integer value2) {
            addCriterion("PlanNum between", value1, value2, "plannum");
            return (Criteria) this;
        }

        public Criteria andPlannumNotBetween(Integer value1, Integer value2) {
            addCriterion("PlanNum not between", value1, value2, "plannum");
            return (Criteria) this;
        }

        public Criteria andTournameIsNull() {
            addCriterion("TourName is null");
            return (Criteria) this;
        }

        public Criteria andTournameIsNotNull() {
            addCriterion("TourName is not null");
            return (Criteria) this;
        }

        public Criteria andTournameEqualTo(String value) {
            addCriterion("TourName =", value, "tourname");
            return (Criteria) this;
        }

        public Criteria andTournameNotEqualTo(String value) {
            addCriterion("TourName <>", value, "tourname");
            return (Criteria) this;
        }

        public Criteria andTournameGreaterThan(String value) {
            addCriterion("TourName >", value, "tourname");
            return (Criteria) this;
        }

        public Criteria andTournameGreaterThanOrEqualTo(String value) {
            addCriterion("TourName >=", value, "tourname");
            return (Criteria) this;
        }

        public Criteria andTournameLessThan(String value) {
            addCriterion("TourName <", value, "tourname");
            return (Criteria) this;
        }

        public Criteria andTournameLessThanOrEqualTo(String value) {
            addCriterion("TourName <=", value, "tourname");
            return (Criteria) this;
        }

        public Criteria andTournameLike(String value) {
            addCriterion("TourName like", value, "tourname");
            return (Criteria) this;
        }

        public Criteria andTournameNotLike(String value) {
            addCriterion("TourName not like", value, "tourname");
            return (Criteria) this;
        }

        public Criteria andTournameIn(List<String> values) {
            addCriterion("TourName in", values, "tourname");
            return (Criteria) this;
        }

        public Criteria andTournameNotIn(List<String> values) {
            addCriterion("TourName not in", values, "tourname");
            return (Criteria) this;
        }

        public Criteria andTournameBetween(String value1, String value2) {
            addCriterion("TourName between", value1, value2, "tourname");
            return (Criteria) this;
        }

        public Criteria andTournameNotBetween(String value1, String value2) {
            addCriterion("TourName not between", value1, value2, "tourname");
            return (Criteria) this;
        }

        public Criteria andTourdateIsNull() {
            addCriterion("TourDate is null");
            return (Criteria) this;
        }

        public Criteria andTourdateIsNotNull() {
            addCriterion("TourDate is not null");
            return (Criteria) this;
        }

        public Criteria andTourdateEqualTo(Date value) {
            addCriterionForJDBCDate("TourDate =", value, "tourdate");
            return (Criteria) this;
        }

        public Criteria andTourdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("TourDate <>", value, "tourdate");
            return (Criteria) this;
        }

        public Criteria andTourdateGreaterThan(Date value) {
            addCriterionForJDBCDate("TourDate >", value, "tourdate");
            return (Criteria) this;
        }

        public Criteria andTourdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TourDate >=", value, "tourdate");
            return (Criteria) this;
        }

        public Criteria andTourdateLessThan(Date value) {
            addCriterionForJDBCDate("TourDate <", value, "tourdate");
            return (Criteria) this;
        }

        public Criteria andTourdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TourDate <=", value, "tourdate");
            return (Criteria) this;
        }

        public Criteria andTourdateIn(List<Date> values) {
            addCriterionForJDBCDate("TourDate in", values, "tourdate");
            return (Criteria) this;
        }

        public Criteria andTourdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("TourDate not in", values, "tourdate");
            return (Criteria) this;
        }

        public Criteria andTourdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TourDate between", value1, value2, "tourdate");
            return (Criteria) this;
        }

        public Criteria andTourdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TourDate not between", value1, value2, "tourdate");
            return (Criteria) this;
        }

        public Criteria andDuedateIsNull() {
            addCriterion("DueDate is null");
            return (Criteria) this;
        }

        public Criteria andDuedateIsNotNull() {
            addCriterion("DueDate is not null");
            return (Criteria) this;
        }

        public Criteria andDuedateEqualTo(Date value) {
            addCriterionForJDBCDate("DueDate =", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("DueDate <>", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateGreaterThan(Date value) {
            addCriterionForJDBCDate("DueDate >", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DueDate >=", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateLessThan(Date value) {
            addCriterionForJDBCDate("DueDate <", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DueDate <=", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateIn(List<Date> values) {
            addCriterionForJDBCDate("DueDate in", values, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("DueDate not in", values, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DueDate between", value1, value2, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DueDate not between", value1, value2, "duedate");
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