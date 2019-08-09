package com.holyrobot.con_order.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdOrderinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdOrderinfoExample() {
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

        public Criteria andRouteidIsNull() {
            addCriterion("RouteID is null");
            return (Criteria) this;
        }

        public Criteria andRouteidIsNotNull() {
            addCriterion("RouteID is not null");
            return (Criteria) this;
        }

        public Criteria andRouteidEqualTo(String value) {
            addCriterion("RouteID =", value, "routeid");
            return (Criteria) this;
        }

        public Criteria andRouteidNotEqualTo(String value) {
            addCriterion("RouteID <>", value, "routeid");
            return (Criteria) this;
        }

        public Criteria andRouteidGreaterThan(String value) {
            addCriterion("RouteID >", value, "routeid");
            return (Criteria) this;
        }

        public Criteria andRouteidGreaterThanOrEqualTo(String value) {
            addCriterion("RouteID >=", value, "routeid");
            return (Criteria) this;
        }

        public Criteria andRouteidLessThan(String value) {
            addCriterion("RouteID <", value, "routeid");
            return (Criteria) this;
        }

        public Criteria andRouteidLessThanOrEqualTo(String value) {
            addCriterion("RouteID <=", value, "routeid");
            return (Criteria) this;
        }

        public Criteria andRouteidLike(String value) {
            addCriterion("RouteID like", value, "routeid");
            return (Criteria) this;
        }

        public Criteria andRouteidNotLike(String value) {
            addCriterion("RouteID not like", value, "routeid");
            return (Criteria) this;
        }

        public Criteria andRouteidIn(List<String> values) {
            addCriterion("RouteID in", values, "routeid");
            return (Criteria) this;
        }

        public Criteria andRouteidNotIn(List<String> values) {
            addCriterion("RouteID not in", values, "routeid");
            return (Criteria) this;
        }

        public Criteria andRouteidBetween(String value1, String value2) {
            addCriterion("RouteID between", value1, value2, "routeid");
            return (Criteria) this;
        }

        public Criteria andRouteidNotBetween(String value1, String value2) {
            addCriterion("RouteID not between", value1, value2, "routeid");
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

        public Criteria andOrdernameIsNull() {
            addCriterion("OrderName is null");
            return (Criteria) this;
        }

        public Criteria andOrdernameIsNotNull() {
            addCriterion("OrderName is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernameEqualTo(String value) {
            addCriterion("OrderName =", value, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernameNotEqualTo(String value) {
            addCriterion("OrderName <>", value, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernameGreaterThan(String value) {
            addCriterion("OrderName >", value, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernameGreaterThanOrEqualTo(String value) {
            addCriterion("OrderName >=", value, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernameLessThan(String value) {
            addCriterion("OrderName <", value, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernameLessThanOrEqualTo(String value) {
            addCriterion("OrderName <=", value, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernameLike(String value) {
            addCriterion("OrderName like", value, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernameNotLike(String value) {
            addCriterion("OrderName not like", value, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernameIn(List<String> values) {
            addCriterion("OrderName in", values, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernameNotIn(List<String> values) {
            addCriterion("OrderName not in", values, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernameBetween(String value1, String value2) {
            addCriterion("OrderName between", value1, value2, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernameNotBetween(String value1, String value2) {
            addCriterion("OrderName not between", value1, value2, "ordername");
            return (Criteria) this;
        }

        public Criteria andScheduledaysIsNull() {
            addCriterion("ScheduleDays is null");
            return (Criteria) this;
        }

        public Criteria andScheduledaysIsNotNull() {
            addCriterion("ScheduleDays is not null");
            return (Criteria) this;
        }

        public Criteria andScheduledaysEqualTo(Integer value) {
            addCriterion("ScheduleDays =", value, "scheduledays");
            return (Criteria) this;
        }

        public Criteria andScheduledaysNotEqualTo(Integer value) {
            addCriterion("ScheduleDays <>", value, "scheduledays");
            return (Criteria) this;
        }

        public Criteria andScheduledaysGreaterThan(Integer value) {
            addCriterion("ScheduleDays >", value, "scheduledays");
            return (Criteria) this;
        }

        public Criteria andScheduledaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("ScheduleDays >=", value, "scheduledays");
            return (Criteria) this;
        }

        public Criteria andScheduledaysLessThan(Integer value) {
            addCriterion("ScheduleDays <", value, "scheduledays");
            return (Criteria) this;
        }

        public Criteria andScheduledaysLessThanOrEqualTo(Integer value) {
            addCriterion("ScheduleDays <=", value, "scheduledays");
            return (Criteria) this;
        }

        public Criteria andScheduledaysIn(List<Integer> values) {
            addCriterion("ScheduleDays in", values, "scheduledays");
            return (Criteria) this;
        }

        public Criteria andScheduledaysNotIn(List<Integer> values) {
            addCriterion("ScheduleDays not in", values, "scheduledays");
            return (Criteria) this;
        }

        public Criteria andScheduledaysBetween(Integer value1, Integer value2) {
            addCriterion("ScheduleDays between", value1, value2, "scheduledays");
            return (Criteria) this;
        }

        public Criteria andScheduledaysNotBetween(Integer value1, Integer value2) {
            addCriterion("ScheduleDays not between", value1, value2, "scheduledays");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("Category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("Category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(Integer value) {
            addCriterion("Category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(Integer value) {
            addCriterion("Category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(Integer value) {
            addCriterion("Category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("Category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(Integer value) {
            addCriterion("Category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("Category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<Integer> values) {
            addCriterion("Category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<Integer> values) {
            addCriterion("Category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(Integer value1, Integer value2) {
            addCriterion("Category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("Category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andOrdertypeIsNull() {
            addCriterion("OrderType is null");
            return (Criteria) this;
        }

        public Criteria andOrdertypeIsNotNull() {
            addCriterion("OrderType is not null");
            return (Criteria) this;
        }

        public Criteria andOrdertypeEqualTo(Integer value) {
            addCriterion("OrderType =", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeNotEqualTo(Integer value) {
            addCriterion("OrderType <>", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeGreaterThan(Integer value) {
            addCriterion("OrderType >", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("OrderType >=", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeLessThan(Integer value) {
            addCriterion("OrderType <", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeLessThanOrEqualTo(Integer value) {
            addCriterion("OrderType <=", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeIn(List<Integer> values) {
            addCriterion("OrderType in", values, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeNotIn(List<Integer> values) {
            addCriterion("OrderType not in", values, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeBetween(Integer value1, Integer value2) {
            addCriterion("OrderType between", value1, value2, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeNotBetween(Integer value1, Integer value2) {
            addCriterion("OrderType not between", value1, value2, "ordertype");
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
            addCriterion("TourDate =", value, "tourdate");
            return (Criteria) this;
        }

        public Criteria andTourdateNotEqualTo(Date value) {
            addCriterion("TourDate <>", value, "tourdate");
            return (Criteria) this;
        }

        public Criteria andTourdateGreaterThan(Date value) {
            addCriterion("TourDate >", value, "tourdate");
            return (Criteria) this;
        }

        public Criteria andTourdateGreaterThanOrEqualTo(Date value) {
            addCriterion("TourDate >=", value, "tourdate");
            return (Criteria) this;
        }

        public Criteria andTourdateLessThan(Date value) {
            addCriterion("TourDate <", value, "tourdate");
            return (Criteria) this;
        }

        public Criteria andTourdateLessThanOrEqualTo(Date value) {
            addCriterion("TourDate <=", value, "tourdate");
            return (Criteria) this;
        }

        public Criteria andTourdateIn(List<Date> values) {
            addCriterion("TourDate in", values, "tourdate");
            return (Criteria) this;
        }

        public Criteria andTourdateNotIn(List<Date> values) {
            addCriterion("TourDate not in", values, "tourdate");
            return (Criteria) this;
        }

        public Criteria andTourdateBetween(Date value1, Date value2) {
            addCriterion("TourDate between", value1, value2, "tourdate");
            return (Criteria) this;
        }

        public Criteria andTourdateNotBetween(Date value1, Date value2) {
            addCriterion("TourDate not between", value1, value2, "tourdate");
            return (Criteria) this;
        }

        public Criteria andReturndateIsNull() {
            addCriterion("ReturnDate is null");
            return (Criteria) this;
        }

        public Criteria andReturndateIsNotNull() {
            addCriterion("ReturnDate is not null");
            return (Criteria) this;
        }

        public Criteria andReturndateEqualTo(Date value) {
            addCriterion("ReturnDate =", value, "returndate");
            return (Criteria) this;
        }

        public Criteria andReturndateNotEqualTo(Date value) {
            addCriterion("ReturnDate <>", value, "returndate");
            return (Criteria) this;
        }

        public Criteria andReturndateGreaterThan(Date value) {
            addCriterion("ReturnDate >", value, "returndate");
            return (Criteria) this;
        }

        public Criteria andReturndateGreaterThanOrEqualTo(Date value) {
            addCriterion("ReturnDate >=", value, "returndate");
            return (Criteria) this;
        }

        public Criteria andReturndateLessThan(Date value) {
            addCriterion("ReturnDate <", value, "returndate");
            return (Criteria) this;
        }

        public Criteria andReturndateLessThanOrEqualTo(Date value) {
            addCriterion("ReturnDate <=", value, "returndate");
            return (Criteria) this;
        }

        public Criteria andReturndateIn(List<Date> values) {
            addCriterion("ReturnDate in", values, "returndate");
            return (Criteria) this;
        }

        public Criteria andReturndateNotIn(List<Date> values) {
            addCriterion("ReturnDate not in", values, "returndate");
            return (Criteria) this;
        }

        public Criteria andReturndateBetween(Date value1, Date value2) {
            addCriterion("ReturnDate between", value1, value2, "returndate");
            return (Criteria) this;
        }

        public Criteria andReturndateNotBetween(Date value1, Date value2) {
            addCriterion("ReturnDate not between", value1, value2, "returndate");
            return (Criteria) this;
        }

        public Criteria andDepnameIsNull() {
            addCriterion("DepName is null");
            return (Criteria) this;
        }

        public Criteria andDepnameIsNotNull() {
            addCriterion("DepName is not null");
            return (Criteria) this;
        }

        public Criteria andDepnameEqualTo(String value) {
            addCriterion("DepName =", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameNotEqualTo(String value) {
            addCriterion("DepName <>", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameGreaterThan(String value) {
            addCriterion("DepName >", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameGreaterThanOrEqualTo(String value) {
            addCriterion("DepName >=", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameLessThan(String value) {
            addCriterion("DepName <", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameLessThanOrEqualTo(String value) {
            addCriterion("DepName <=", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameLike(String value) {
            addCriterion("DepName like", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameNotLike(String value) {
            addCriterion("DepName not like", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameIn(List<String> values) {
            addCriterion("DepName in", values, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameNotIn(List<String> values) {
            addCriterion("DepName not in", values, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameBetween(String value1, String value2) {
            addCriterion("DepName between", value1, value2, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameNotBetween(String value1, String value2) {
            addCriterion("DepName not between", value1, value2, "depname");
            return (Criteria) this;
        }

        public Criteria andDestnameIsNull() {
            addCriterion("DestName is null");
            return (Criteria) this;
        }

        public Criteria andDestnameIsNotNull() {
            addCriterion("DestName is not null");
            return (Criteria) this;
        }

        public Criteria andDestnameEqualTo(String value) {
            addCriterion("DestName =", value, "destname");
            return (Criteria) this;
        }

        public Criteria andDestnameNotEqualTo(String value) {
            addCriterion("DestName <>", value, "destname");
            return (Criteria) this;
        }

        public Criteria andDestnameGreaterThan(String value) {
            addCriterion("DestName >", value, "destname");
            return (Criteria) this;
        }

        public Criteria andDestnameGreaterThanOrEqualTo(String value) {
            addCriterion("DestName >=", value, "destname");
            return (Criteria) this;
        }

        public Criteria andDestnameLessThan(String value) {
            addCriterion("DestName <", value, "destname");
            return (Criteria) this;
        }

        public Criteria andDestnameLessThanOrEqualTo(String value) {
            addCriterion("DestName <=", value, "destname");
            return (Criteria) this;
        }

        public Criteria andDestnameLike(String value) {
            addCriterion("DestName like", value, "destname");
            return (Criteria) this;
        }

        public Criteria andDestnameNotLike(String value) {
            addCriterion("DestName not like", value, "destname");
            return (Criteria) this;
        }

        public Criteria andDestnameIn(List<String> values) {
            addCriterion("DestName in", values, "destname");
            return (Criteria) this;
        }

        public Criteria andDestnameNotIn(List<String> values) {
            addCriterion("DestName not in", values, "destname");
            return (Criteria) this;
        }

        public Criteria andDestnameBetween(String value1, String value2) {
            addCriterion("DestName between", value1, value2, "destname");
            return (Criteria) this;
        }

        public Criteria andDestnameNotBetween(String value1, String value2) {
            addCriterion("DestName not between", value1, value2, "destname");
            return (Criteria) this;
        }

        public Criteria andDestidIsNull() {
            addCriterion("DestID is null");
            return (Criteria) this;
        }

        public Criteria andDestidIsNotNull() {
            addCriterion("DestID is not null");
            return (Criteria) this;
        }

        public Criteria andDestidEqualTo(String value) {
            addCriterion("DestID =", value, "destid");
            return (Criteria) this;
        }

        public Criteria andDestidNotEqualTo(String value) {
            addCriterion("DestID <>", value, "destid");
            return (Criteria) this;
        }

        public Criteria andDestidGreaterThan(String value) {
            addCriterion("DestID >", value, "destid");
            return (Criteria) this;
        }

        public Criteria andDestidGreaterThanOrEqualTo(String value) {
            addCriterion("DestID >=", value, "destid");
            return (Criteria) this;
        }

        public Criteria andDestidLessThan(String value) {
            addCriterion("DestID <", value, "destid");
            return (Criteria) this;
        }

        public Criteria andDestidLessThanOrEqualTo(String value) {
            addCriterion("DestID <=", value, "destid");
            return (Criteria) this;
        }

        public Criteria andDestidLike(String value) {
            addCriterion("DestID like", value, "destid");
            return (Criteria) this;
        }

        public Criteria andDestidNotLike(String value) {
            addCriterion("DestID not like", value, "destid");
            return (Criteria) this;
        }

        public Criteria andDestidIn(List<String> values) {
            addCriterion("DestID in", values, "destid");
            return (Criteria) this;
        }

        public Criteria andDestidNotIn(List<String> values) {
            addCriterion("DestID not in", values, "destid");
            return (Criteria) this;
        }

        public Criteria andDestidBetween(String value1, String value2) {
            addCriterion("DestID between", value1, value2, "destid");
            return (Criteria) this;
        }

        public Criteria andDestidNotBetween(String value1, String value2) {
            addCriterion("DestID not between", value1, value2, "destid");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNull() {
            addCriterion("OrderNo is null");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNotNull() {
            addCriterion("OrderNo is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernoEqualTo(String value) {
            addCriterion("OrderNo =", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotEqualTo(String value) {
            addCriterion("OrderNo <>", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThan(String value) {
            addCriterion("OrderNo >", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThanOrEqualTo(String value) {
            addCriterion("OrderNo >=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThan(String value) {
            addCriterion("OrderNo <", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThanOrEqualTo(String value) {
            addCriterion("OrderNo <=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLike(String value) {
            addCriterion("OrderNo like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotLike(String value) {
            addCriterion("OrderNo not like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoIn(List<String> values) {
            addCriterion("OrderNo in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotIn(List<String> values) {
            addCriterion("OrderNo not in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoBetween(String value1, String value2) {
            addCriterion("OrderNo between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotBetween(String value1, String value2) {
            addCriterion("OrderNo not between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andCustomerunitidIsNull() {
            addCriterion("CustomerUnitID is null");
            return (Criteria) this;
        }

        public Criteria andCustomerunitidIsNotNull() {
            addCriterion("CustomerUnitID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerunitidEqualTo(String value) {
            addCriterion("CustomerUnitID =", value, "customerunitid");
            return (Criteria) this;
        }

        public Criteria andCustomerunitidNotEqualTo(String value) {
            addCriterion("CustomerUnitID <>", value, "customerunitid");
            return (Criteria) this;
        }

        public Criteria andCustomerunitidGreaterThan(String value) {
            addCriterion("CustomerUnitID >", value, "customerunitid");
            return (Criteria) this;
        }

        public Criteria andCustomerunitidGreaterThanOrEqualTo(String value) {
            addCriterion("CustomerUnitID >=", value, "customerunitid");
            return (Criteria) this;
        }

        public Criteria andCustomerunitidLessThan(String value) {
            addCriterion("CustomerUnitID <", value, "customerunitid");
            return (Criteria) this;
        }

        public Criteria andCustomerunitidLessThanOrEqualTo(String value) {
            addCriterion("CustomerUnitID <=", value, "customerunitid");
            return (Criteria) this;
        }

        public Criteria andCustomerunitidLike(String value) {
            addCriterion("CustomerUnitID like", value, "customerunitid");
            return (Criteria) this;
        }

        public Criteria andCustomerunitidNotLike(String value) {
            addCriterion("CustomerUnitID not like", value, "customerunitid");
            return (Criteria) this;
        }

        public Criteria andCustomerunitidIn(List<String> values) {
            addCriterion("CustomerUnitID in", values, "customerunitid");
            return (Criteria) this;
        }

        public Criteria andCustomerunitidNotIn(List<String> values) {
            addCriterion("CustomerUnitID not in", values, "customerunitid");
            return (Criteria) this;
        }

        public Criteria andCustomerunitidBetween(String value1, String value2) {
            addCriterion("CustomerUnitID between", value1, value2, "customerunitid");
            return (Criteria) this;
        }

        public Criteria andCustomerunitidNotBetween(String value1, String value2) {
            addCriterion("CustomerUnitID not between", value1, value2, "customerunitid");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNull() {
            addCriterion("CustomerName is null");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNotNull() {
            addCriterion("CustomerName is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernameEqualTo(String value) {
            addCriterion("CustomerName =", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotEqualTo(String value) {
            addCriterion("CustomerName <>", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThan(String value) {
            addCriterion("CustomerName >", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThanOrEqualTo(String value) {
            addCriterion("CustomerName >=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThan(String value) {
            addCriterion("CustomerName <", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThanOrEqualTo(String value) {
            addCriterion("CustomerName <=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLike(String value) {
            addCriterion("CustomerName like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotLike(String value) {
            addCriterion("CustomerName not like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameIn(List<String> values) {
            addCriterion("CustomerName in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotIn(List<String> values) {
            addCriterion("CustomerName not in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameBetween(String value1, String value2) {
            addCriterion("CustomerName between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotBetween(String value1, String value2) {
            addCriterion("CustomerName not between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andOrdersourceidIsNull() {
            addCriterion("OrderSourceID is null");
            return (Criteria) this;
        }

        public Criteria andOrdersourceidIsNotNull() {
            addCriterion("OrderSourceID is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersourceidEqualTo(String value) {
            addCriterion("OrderSourceID =", value, "ordersourceid");
            return (Criteria) this;
        }

        public Criteria andOrdersourceidNotEqualTo(String value) {
            addCriterion("OrderSourceID <>", value, "ordersourceid");
            return (Criteria) this;
        }

        public Criteria andOrdersourceidGreaterThan(String value) {
            addCriterion("OrderSourceID >", value, "ordersourceid");
            return (Criteria) this;
        }

        public Criteria andOrdersourceidGreaterThanOrEqualTo(String value) {
            addCriterion("OrderSourceID >=", value, "ordersourceid");
            return (Criteria) this;
        }

        public Criteria andOrdersourceidLessThan(String value) {
            addCriterion("OrderSourceID <", value, "ordersourceid");
            return (Criteria) this;
        }

        public Criteria andOrdersourceidLessThanOrEqualTo(String value) {
            addCriterion("OrderSourceID <=", value, "ordersourceid");
            return (Criteria) this;
        }

        public Criteria andOrdersourceidLike(String value) {
            addCriterion("OrderSourceID like", value, "ordersourceid");
            return (Criteria) this;
        }

        public Criteria andOrdersourceidNotLike(String value) {
            addCriterion("OrderSourceID not like", value, "ordersourceid");
            return (Criteria) this;
        }

        public Criteria andOrdersourceidIn(List<String> values) {
            addCriterion("OrderSourceID in", values, "ordersourceid");
            return (Criteria) this;
        }

        public Criteria andOrdersourceidNotIn(List<String> values) {
            addCriterion("OrderSourceID not in", values, "ordersourceid");
            return (Criteria) this;
        }

        public Criteria andOrdersourceidBetween(String value1, String value2) {
            addCriterion("OrderSourceID between", value1, value2, "ordersourceid");
            return (Criteria) this;
        }

        public Criteria andOrdersourceidNotBetween(String value1, String value2) {
            addCriterion("OrderSourceID not between", value1, value2, "ordersourceid");
            return (Criteria) this;
        }

        public Criteria andOrdersourceIsNull() {
            addCriterion("OrderSource is null");
            return (Criteria) this;
        }

        public Criteria andOrdersourceIsNotNull() {
            addCriterion("OrderSource is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersourceEqualTo(String value) {
            addCriterion("OrderSource =", value, "ordersource");
            return (Criteria) this;
        }

        public Criteria andOrdersourceNotEqualTo(String value) {
            addCriterion("OrderSource <>", value, "ordersource");
            return (Criteria) this;
        }

        public Criteria andOrdersourceGreaterThan(String value) {
            addCriterion("OrderSource >", value, "ordersource");
            return (Criteria) this;
        }

        public Criteria andOrdersourceGreaterThanOrEqualTo(String value) {
            addCriterion("OrderSource >=", value, "ordersource");
            return (Criteria) this;
        }

        public Criteria andOrdersourceLessThan(String value) {
            addCriterion("OrderSource <", value, "ordersource");
            return (Criteria) this;
        }

        public Criteria andOrdersourceLessThanOrEqualTo(String value) {
            addCriterion("OrderSource <=", value, "ordersource");
            return (Criteria) this;
        }

        public Criteria andOrdersourceLike(String value) {
            addCriterion("OrderSource like", value, "ordersource");
            return (Criteria) this;
        }

        public Criteria andOrdersourceNotLike(String value) {
            addCriterion("OrderSource not like", value, "ordersource");
            return (Criteria) this;
        }

        public Criteria andOrdersourceIn(List<String> values) {
            addCriterion("OrderSource in", values, "ordersource");
            return (Criteria) this;
        }

        public Criteria andOrdersourceNotIn(List<String> values) {
            addCriterion("OrderSource not in", values, "ordersource");
            return (Criteria) this;
        }

        public Criteria andOrdersourceBetween(String value1, String value2) {
            addCriterion("OrderSource between", value1, value2, "ordersource");
            return (Criteria) this;
        }

        public Criteria andOrdersourceNotBetween(String value1, String value2) {
            addCriterion("OrderSource not between", value1, value2, "ordersource");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("Contact is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("Contact is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("Contact =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("Contact <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("Contact >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("Contact >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("Contact <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("Contact <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("Contact like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("Contact not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("Contact in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("Contact not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("Contact between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("Contact not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("Mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("Mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("Mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("Mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("Mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("Mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("Mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("Mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("Mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("Mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("Mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("Mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("Mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("Mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("Email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("Email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("Email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("Email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("Email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("Email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("Email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("Email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("Email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("Email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("Email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("Email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("Email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("Email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andHastrafficIsNull() {
            addCriterion("HasTraffic is null");
            return (Criteria) this;
        }

        public Criteria andHastrafficIsNotNull() {
            addCriterion("HasTraffic is not null");
            return (Criteria) this;
        }

        public Criteria andHastrafficEqualTo(Integer value) {
            addCriterion("HasTraffic =", value, "hastraffic");
            return (Criteria) this;
        }

        public Criteria andHastrafficNotEqualTo(Integer value) {
            addCriterion("HasTraffic <>", value, "hastraffic");
            return (Criteria) this;
        }

        public Criteria andHastrafficGreaterThan(Integer value) {
            addCriterion("HasTraffic >", value, "hastraffic");
            return (Criteria) this;
        }

        public Criteria andHastrafficGreaterThanOrEqualTo(Integer value) {
            addCriterion("HasTraffic >=", value, "hastraffic");
            return (Criteria) this;
        }

        public Criteria andHastrafficLessThan(Integer value) {
            addCriterion("HasTraffic <", value, "hastraffic");
            return (Criteria) this;
        }

        public Criteria andHastrafficLessThanOrEqualTo(Integer value) {
            addCriterion("HasTraffic <=", value, "hastraffic");
            return (Criteria) this;
        }

        public Criteria andHastrafficIn(List<Integer> values) {
            addCriterion("HasTraffic in", values, "hastraffic");
            return (Criteria) this;
        }

        public Criteria andHastrafficNotIn(List<Integer> values) {
            addCriterion("HasTraffic not in", values, "hastraffic");
            return (Criteria) this;
        }

        public Criteria andHastrafficBetween(Integer value1, Integer value2) {
            addCriterion("HasTraffic between", value1, value2, "hastraffic");
            return (Criteria) this;
        }

        public Criteria andHastrafficNotBetween(Integer value1, Integer value2) {
            addCriterion("HasTraffic not between", value1, value2, "hastraffic");
            return (Criteria) this;
        }

        public Criteria andAdjustamtIsNull() {
            addCriterion("AdjustAmt is null");
            return (Criteria) this;
        }

        public Criteria andAdjustamtIsNotNull() {
            addCriterion("AdjustAmt is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustamtEqualTo(BigDecimal value) {
            addCriterion("AdjustAmt =", value, "adjustamt");
            return (Criteria) this;
        }

        public Criteria andAdjustamtNotEqualTo(BigDecimal value) {
            addCriterion("AdjustAmt <>", value, "adjustamt");
            return (Criteria) this;
        }

        public Criteria andAdjustamtGreaterThan(BigDecimal value) {
            addCriterion("AdjustAmt >", value, "adjustamt");
            return (Criteria) this;
        }

        public Criteria andAdjustamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AdjustAmt >=", value, "adjustamt");
            return (Criteria) this;
        }

        public Criteria andAdjustamtLessThan(BigDecimal value) {
            addCriterion("AdjustAmt <", value, "adjustamt");
            return (Criteria) this;
        }

        public Criteria andAdjustamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AdjustAmt <=", value, "adjustamt");
            return (Criteria) this;
        }

        public Criteria andAdjustamtIn(List<BigDecimal> values) {
            addCriterion("AdjustAmt in", values, "adjustamt");
            return (Criteria) this;
        }

        public Criteria andAdjustamtNotIn(List<BigDecimal> values) {
            addCriterion("AdjustAmt not in", values, "adjustamt");
            return (Criteria) this;
        }

        public Criteria andAdjustamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AdjustAmt between", value1, value2, "adjustamt");
            return (Criteria) this;
        }

        public Criteria andAdjustamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AdjustAmt not between", value1, value2, "adjustamt");
            return (Criteria) this;
        }

        public Criteria andReceivableamtIsNull() {
            addCriterion("ReceivableAmt is null");
            return (Criteria) this;
        }

        public Criteria andReceivableamtIsNotNull() {
            addCriterion("ReceivableAmt is not null");
            return (Criteria) this;
        }

        public Criteria andReceivableamtEqualTo(BigDecimal value) {
            addCriterion("ReceivableAmt =", value, "receivableamt");
            return (Criteria) this;
        }

        public Criteria andReceivableamtNotEqualTo(BigDecimal value) {
            addCriterion("ReceivableAmt <>", value, "receivableamt");
            return (Criteria) this;
        }

        public Criteria andReceivableamtGreaterThan(BigDecimal value) {
            addCriterion("ReceivableAmt >", value, "receivableamt");
            return (Criteria) this;
        }

        public Criteria andReceivableamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ReceivableAmt >=", value, "receivableamt");
            return (Criteria) this;
        }

        public Criteria andReceivableamtLessThan(BigDecimal value) {
            addCriterion("ReceivableAmt <", value, "receivableamt");
            return (Criteria) this;
        }

        public Criteria andReceivableamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ReceivableAmt <=", value, "receivableamt");
            return (Criteria) this;
        }

        public Criteria andReceivableamtIn(List<BigDecimal> values) {
            addCriterion("ReceivableAmt in", values, "receivableamt");
            return (Criteria) this;
        }

        public Criteria andReceivableamtNotIn(List<BigDecimal> values) {
            addCriterion("ReceivableAmt not in", values, "receivableamt");
            return (Criteria) this;
        }

        public Criteria andReceivableamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ReceivableAmt between", value1, value2, "receivableamt");
            return (Criteria) this;
        }

        public Criteria andReceivableamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ReceivableAmt not between", value1, value2, "receivableamt");
            return (Criteria) this;
        }

        public Criteria andPayableamtIsNull() {
            addCriterion("PayableAmt is null");
            return (Criteria) this;
        }

        public Criteria andPayableamtIsNotNull() {
            addCriterion("PayableAmt is not null");
            return (Criteria) this;
        }

        public Criteria andPayableamtEqualTo(BigDecimal value) {
            addCriterion("PayableAmt =", value, "payableamt");
            return (Criteria) this;
        }

        public Criteria andPayableamtNotEqualTo(BigDecimal value) {
            addCriterion("PayableAmt <>", value, "payableamt");
            return (Criteria) this;
        }

        public Criteria andPayableamtGreaterThan(BigDecimal value) {
            addCriterion("PayableAmt >", value, "payableamt");
            return (Criteria) this;
        }

        public Criteria andPayableamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PayableAmt >=", value, "payableamt");
            return (Criteria) this;
        }

        public Criteria andPayableamtLessThan(BigDecimal value) {
            addCriterion("PayableAmt <", value, "payableamt");
            return (Criteria) this;
        }

        public Criteria andPayableamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PayableAmt <=", value, "payableamt");
            return (Criteria) this;
        }

        public Criteria andPayableamtIn(List<BigDecimal> values) {
            addCriterion("PayableAmt in", values, "payableamt");
            return (Criteria) this;
        }

        public Criteria andPayableamtNotIn(List<BigDecimal> values) {
            addCriterion("PayableAmt not in", values, "payableamt");
            return (Criteria) this;
        }

        public Criteria andPayableamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PayableAmt between", value1, value2, "payableamt");
            return (Criteria) this;
        }

        public Criteria andPayableamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PayableAmt not between", value1, value2, "payableamt");
            return (Criteria) this;
        }

        public Criteria andAdultnumIsNull() {
            addCriterion("AdultNum is null");
            return (Criteria) this;
        }

        public Criteria andAdultnumIsNotNull() {
            addCriterion("AdultNum is not null");
            return (Criteria) this;
        }

        public Criteria andAdultnumEqualTo(Integer value) {
            addCriterion("AdultNum =", value, "adultnum");
            return (Criteria) this;
        }

        public Criteria andAdultnumNotEqualTo(Integer value) {
            addCriterion("AdultNum <>", value, "adultnum");
            return (Criteria) this;
        }

        public Criteria andAdultnumGreaterThan(Integer value) {
            addCriterion("AdultNum >", value, "adultnum");
            return (Criteria) this;
        }

        public Criteria andAdultnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("AdultNum >=", value, "adultnum");
            return (Criteria) this;
        }

        public Criteria andAdultnumLessThan(Integer value) {
            addCriterion("AdultNum <", value, "adultnum");
            return (Criteria) this;
        }

        public Criteria andAdultnumLessThanOrEqualTo(Integer value) {
            addCriterion("AdultNum <=", value, "adultnum");
            return (Criteria) this;
        }

        public Criteria andAdultnumIn(List<Integer> values) {
            addCriterion("AdultNum in", values, "adultnum");
            return (Criteria) this;
        }

        public Criteria andAdultnumNotIn(List<Integer> values) {
            addCriterion("AdultNum not in", values, "adultnum");
            return (Criteria) this;
        }

        public Criteria andAdultnumBetween(Integer value1, Integer value2) {
            addCriterion("AdultNum between", value1, value2, "adultnum");
            return (Criteria) this;
        }

        public Criteria andAdultnumNotBetween(Integer value1, Integer value2) {
            addCriterion("AdultNum not between", value1, value2, "adultnum");
            return (Criteria) this;
        }

        public Criteria andChildnumIsNull() {
            addCriterion("ChildNum is null");
            return (Criteria) this;
        }

        public Criteria andChildnumIsNotNull() {
            addCriterion("ChildNum is not null");
            return (Criteria) this;
        }

        public Criteria andChildnumEqualTo(Integer value) {
            addCriterion("ChildNum =", value, "childnum");
            return (Criteria) this;
        }

        public Criteria andChildnumNotEqualTo(Integer value) {
            addCriterion("ChildNum <>", value, "childnum");
            return (Criteria) this;
        }

        public Criteria andChildnumGreaterThan(Integer value) {
            addCriterion("ChildNum >", value, "childnum");
            return (Criteria) this;
        }

        public Criteria andChildnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ChildNum >=", value, "childnum");
            return (Criteria) this;
        }

        public Criteria andChildnumLessThan(Integer value) {
            addCriterion("ChildNum <", value, "childnum");
            return (Criteria) this;
        }

        public Criteria andChildnumLessThanOrEqualTo(Integer value) {
            addCriterion("ChildNum <=", value, "childnum");
            return (Criteria) this;
        }

        public Criteria andChildnumIn(List<Integer> values) {
            addCriterion("ChildNum in", values, "childnum");
            return (Criteria) this;
        }

        public Criteria andChildnumNotIn(List<Integer> values) {
            addCriterion("ChildNum not in", values, "childnum");
            return (Criteria) this;
        }

        public Criteria andChildnumBetween(Integer value1, Integer value2) {
            addCriterion("ChildNum between", value1, value2, "childnum");
            return (Criteria) this;
        }

        public Criteria andChildnumNotBetween(Integer value1, Integer value2) {
            addCriterion("ChildNum not between", value1, value2, "childnum");
            return (Criteria) this;
        }

        public Criteria andGuidenumIsNull() {
            addCriterion("GuideNum is null");
            return (Criteria) this;
        }

        public Criteria andGuidenumIsNotNull() {
            addCriterion("GuideNum is not null");
            return (Criteria) this;
        }

        public Criteria andGuidenumEqualTo(Integer value) {
            addCriterion("GuideNum =", value, "guidenum");
            return (Criteria) this;
        }

        public Criteria andGuidenumNotEqualTo(Integer value) {
            addCriterion("GuideNum <>", value, "guidenum");
            return (Criteria) this;
        }

        public Criteria andGuidenumGreaterThan(Integer value) {
            addCriterion("GuideNum >", value, "guidenum");
            return (Criteria) this;
        }

        public Criteria andGuidenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("GuideNum >=", value, "guidenum");
            return (Criteria) this;
        }

        public Criteria andGuidenumLessThan(Integer value) {
            addCriterion("GuideNum <", value, "guidenum");
            return (Criteria) this;
        }

        public Criteria andGuidenumLessThanOrEqualTo(Integer value) {
            addCriterion("GuideNum <=", value, "guidenum");
            return (Criteria) this;
        }

        public Criteria andGuidenumIn(List<Integer> values) {
            addCriterion("GuideNum in", values, "guidenum");
            return (Criteria) this;
        }

        public Criteria andGuidenumNotIn(List<Integer> values) {
            addCriterion("GuideNum not in", values, "guidenum");
            return (Criteria) this;
        }

        public Criteria andGuidenumBetween(Integer value1, Integer value2) {
            addCriterion("GuideNum between", value1, value2, "guidenum");
            return (Criteria) this;
        }

        public Criteria andGuidenumNotBetween(Integer value1, Integer value2) {
            addCriterion("GuideNum not between", value1, value2, "guidenum");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("Comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("Comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("Comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("Comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("Comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("Comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("Comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("Comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("Comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("Comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("Comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("Comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("Comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("Comment not between", value1, value2, "comment");
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

        public Criteria andDeptidIsNull() {
            addCriterion("DeptID is null");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNotNull() {
            addCriterion("DeptID is not null");
            return (Criteria) this;
        }

        public Criteria andDeptidEqualTo(String value) {
            addCriterion("DeptID =", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotEqualTo(String value) {
            addCriterion("DeptID <>", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThan(String value) {
            addCriterion("DeptID >", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThanOrEqualTo(String value) {
            addCriterion("DeptID >=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThan(String value) {
            addCriterion("DeptID <", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThanOrEqualTo(String value) {
            addCriterion("DeptID <=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLike(String value) {
            addCriterion("DeptID like", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotLike(String value) {
            addCriterion("DeptID not like", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidIn(List<String> values) {
            addCriterion("DeptID in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotIn(List<String> values) {
            addCriterion("DeptID not in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidBetween(String value1, String value2) {
            addCriterion("DeptID between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotBetween(String value1, String value2) {
            addCriterion("DeptID not between", value1, value2, "deptid");
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

        public Criteria andOrgnameIsNull() {
            addCriterion("OrgName is null");
            return (Criteria) this;
        }

        public Criteria andOrgnameIsNotNull() {
            addCriterion("OrgName is not null");
            return (Criteria) this;
        }

        public Criteria andOrgnameEqualTo(String value) {
            addCriterion("OrgName =", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotEqualTo(String value) {
            addCriterion("OrgName <>", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThan(String value) {
            addCriterion("OrgName >", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThanOrEqualTo(String value) {
            addCriterion("OrgName >=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThan(String value) {
            addCriterion("OrgName <", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThanOrEqualTo(String value) {
            addCriterion("OrgName <=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLike(String value) {
            addCriterion("OrgName like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotLike(String value) {
            addCriterion("OrgName not like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameIn(List<String> values) {
            addCriterion("OrgName in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotIn(List<String> values) {
            addCriterion("OrgName not in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameBetween(String value1, String value2) {
            addCriterion("OrgName between", value1, value2, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotBetween(String value1, String value2) {
            addCriterion("OrgName not between", value1, value2, "orgname");
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

        public Criteria andSignstatusIsNull() {
            addCriterion("SignStatus is null");
            return (Criteria) this;
        }

        public Criteria andSignstatusIsNotNull() {
            addCriterion("SignStatus is not null");
            return (Criteria) this;
        }

        public Criteria andSignstatusEqualTo(Integer value) {
            addCriterion("SignStatus =", value, "signstatus");
            return (Criteria) this;
        }

        public Criteria andSignstatusNotEqualTo(Integer value) {
            addCriterion("SignStatus <>", value, "signstatus");
            return (Criteria) this;
        }

        public Criteria andSignstatusGreaterThan(Integer value) {
            addCriterion("SignStatus >", value, "signstatus");
            return (Criteria) this;
        }

        public Criteria andSignstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("SignStatus >=", value, "signstatus");
            return (Criteria) this;
        }

        public Criteria andSignstatusLessThan(Integer value) {
            addCriterion("SignStatus <", value, "signstatus");
            return (Criteria) this;
        }

        public Criteria andSignstatusLessThanOrEqualTo(Integer value) {
            addCriterion("SignStatus <=", value, "signstatus");
            return (Criteria) this;
        }

        public Criteria andSignstatusIn(List<Integer> values) {
            addCriterion("SignStatus in", values, "signstatus");
            return (Criteria) this;
        }

        public Criteria andSignstatusNotIn(List<Integer> values) {
            addCriterion("SignStatus not in", values, "signstatus");
            return (Criteria) this;
        }

        public Criteria andSignstatusBetween(Integer value1, Integer value2) {
            addCriterion("SignStatus between", value1, value2, "signstatus");
            return (Criteria) this;
        }

        public Criteria andSignstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("SignStatus not between", value1, value2, "signstatus");
            return (Criteria) this;
        }

        public Criteria andSigntypeIsNull() {
            addCriterion("SignType is null");
            return (Criteria) this;
        }

        public Criteria andSigntypeIsNotNull() {
            addCriterion("SignType is not null");
            return (Criteria) this;
        }

        public Criteria andSigntypeEqualTo(Integer value) {
            addCriterion("SignType =", value, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeNotEqualTo(Integer value) {
            addCriterion("SignType <>", value, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeGreaterThan(Integer value) {
            addCriterion("SignType >", value, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("SignType >=", value, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeLessThan(Integer value) {
            addCriterion("SignType <", value, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeLessThanOrEqualTo(Integer value) {
            addCriterion("SignType <=", value, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeIn(List<Integer> values) {
            addCriterion("SignType in", values, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeNotIn(List<Integer> values) {
            addCriterion("SignType not in", values, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeBetween(Integer value1, Integer value2) {
            addCriterion("SignType between", value1, value2, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeNotBetween(Integer value1, Integer value2) {
            addCriterion("SignType not between", value1, value2, "signtype");
            return (Criteria) this;
        }

        public Criteria andTourguideIsNull() {
            addCriterion("TourGuide is null");
            return (Criteria) this;
        }

        public Criteria andTourguideIsNotNull() {
            addCriterion("TourGuide is not null");
            return (Criteria) this;
        }

        public Criteria andTourguideEqualTo(String value) {
            addCriterion("TourGuide =", value, "tourguide");
            return (Criteria) this;
        }

        public Criteria andTourguideNotEqualTo(String value) {
            addCriterion("TourGuide <>", value, "tourguide");
            return (Criteria) this;
        }

        public Criteria andTourguideGreaterThan(String value) {
            addCriterion("TourGuide >", value, "tourguide");
            return (Criteria) this;
        }

        public Criteria andTourguideGreaterThanOrEqualTo(String value) {
            addCriterion("TourGuide >=", value, "tourguide");
            return (Criteria) this;
        }

        public Criteria andTourguideLessThan(String value) {
            addCriterion("TourGuide <", value, "tourguide");
            return (Criteria) this;
        }

        public Criteria andTourguideLessThanOrEqualTo(String value) {
            addCriterion("TourGuide <=", value, "tourguide");
            return (Criteria) this;
        }

        public Criteria andTourguideLike(String value) {
            addCriterion("TourGuide like", value, "tourguide");
            return (Criteria) this;
        }

        public Criteria andTourguideNotLike(String value) {
            addCriterion("TourGuide not like", value, "tourguide");
            return (Criteria) this;
        }

        public Criteria andTourguideIn(List<String> values) {
            addCriterion("TourGuide in", values, "tourguide");
            return (Criteria) this;
        }

        public Criteria andTourguideNotIn(List<String> values) {
            addCriterion("TourGuide not in", values, "tourguide");
            return (Criteria) this;
        }

        public Criteria andTourguideBetween(String value1, String value2) {
            addCriterion("TourGuide between", value1, value2, "tourguide");
            return (Criteria) this;
        }

        public Criteria andTourguideNotBetween(String value1, String value2) {
            addCriterion("TourGuide not between", value1, value2, "tourguide");
            return (Criteria) this;
        }

        public Criteria andSupplieridIsNull() {
            addCriterion("SupplierID is null");
            return (Criteria) this;
        }

        public Criteria andSupplieridIsNotNull() {
            addCriterion("SupplierID is not null");
            return (Criteria) this;
        }

        public Criteria andSupplieridEqualTo(String value) {
            addCriterion("SupplierID =", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotEqualTo(String value) {
            addCriterion("SupplierID <>", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThan(String value) {
            addCriterion("SupplierID >", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThanOrEqualTo(String value) {
            addCriterion("SupplierID >=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThan(String value) {
            addCriterion("SupplierID <", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThanOrEqualTo(String value) {
            addCriterion("SupplierID <=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLike(String value) {
            addCriterion("SupplierID like", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotLike(String value) {
            addCriterion("SupplierID not like", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridIn(List<String> values) {
            addCriterion("SupplierID in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotIn(List<String> values) {
            addCriterion("SupplierID not in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridBetween(String value1, String value2) {
            addCriterion("SupplierID between", value1, value2, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotBetween(String value1, String value2) {
            addCriterion("SupplierID not between", value1, value2, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIsNull() {
            addCriterion("SupplierName is null");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIsNotNull() {
            addCriterion("SupplierName is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliernameEqualTo(String value) {
            addCriterion("SupplierName =", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotEqualTo(String value) {
            addCriterion("SupplierName <>", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameGreaterThan(String value) {
            addCriterion("SupplierName >", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameGreaterThanOrEqualTo(String value) {
            addCriterion("SupplierName >=", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLessThan(String value) {
            addCriterion("SupplierName <", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLessThanOrEqualTo(String value) {
            addCriterion("SupplierName <=", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLike(String value) {
            addCriterion("SupplierName like", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotLike(String value) {
            addCriterion("SupplierName not like", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIn(List<String> values) {
            addCriterion("SupplierName in", values, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotIn(List<String> values) {
            addCriterion("SupplierName not in", values, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameBetween(String value1, String value2) {
            addCriterion("SupplierName between", value1, value2, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotBetween(String value1, String value2) {
            addCriterion("SupplierName not between", value1, value2, "suppliername");
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

        public Criteria andOccupiedperiodIsNull() {
            addCriterion("OccupiedPeriod is null");
            return (Criteria) this;
        }

        public Criteria andOccupiedperiodIsNotNull() {
            addCriterion("OccupiedPeriod is not null");
            return (Criteria) this;
        }

        public Criteria andOccupiedperiodEqualTo(Integer value) {
            addCriterion("OccupiedPeriod =", value, "occupiedperiod");
            return (Criteria) this;
        }

        public Criteria andOccupiedperiodNotEqualTo(Integer value) {
            addCriterion("OccupiedPeriod <>", value, "occupiedperiod");
            return (Criteria) this;
        }

        public Criteria andOccupiedperiodGreaterThan(Integer value) {
            addCriterion("OccupiedPeriod >", value, "occupiedperiod");
            return (Criteria) this;
        }

        public Criteria andOccupiedperiodGreaterThanOrEqualTo(Integer value) {
            addCriterion("OccupiedPeriod >=", value, "occupiedperiod");
            return (Criteria) this;
        }

        public Criteria andOccupiedperiodLessThan(Integer value) {
            addCriterion("OccupiedPeriod <", value, "occupiedperiod");
            return (Criteria) this;
        }

        public Criteria andOccupiedperiodLessThanOrEqualTo(Integer value) {
            addCriterion("OccupiedPeriod <=", value, "occupiedperiod");
            return (Criteria) this;
        }

        public Criteria andOccupiedperiodIn(List<Integer> values) {
            addCriterion("OccupiedPeriod in", values, "occupiedperiod");
            return (Criteria) this;
        }

        public Criteria andOccupiedperiodNotIn(List<Integer> values) {
            addCriterion("OccupiedPeriod not in", values, "occupiedperiod");
            return (Criteria) this;
        }

        public Criteria andOccupiedperiodBetween(Integer value1, Integer value2) {
            addCriterion("OccupiedPeriod between", value1, value2, "occupiedperiod");
            return (Criteria) this;
        }

        public Criteria andOccupiedperiodNotBetween(Integer value1, Integer value2) {
            addCriterion("OccupiedPeriod not between", value1, value2, "occupiedperiod");
            return (Criteria) this;
        }

        public Criteria andSingleordertypeidIsNull() {
            addCriterion("SingleOrderTypeID is null");
            return (Criteria) this;
        }

        public Criteria andSingleordertypeidIsNotNull() {
            addCriterion("SingleOrderTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andSingleordertypeidEqualTo(Integer value) {
            addCriterion("SingleOrderTypeID =", value, "singleordertypeid");
            return (Criteria) this;
        }

        public Criteria andSingleordertypeidNotEqualTo(Integer value) {
            addCriterion("SingleOrderTypeID <>", value, "singleordertypeid");
            return (Criteria) this;
        }

        public Criteria andSingleordertypeidGreaterThan(Integer value) {
            addCriterion("SingleOrderTypeID >", value, "singleordertypeid");
            return (Criteria) this;
        }

        public Criteria andSingleordertypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SingleOrderTypeID >=", value, "singleordertypeid");
            return (Criteria) this;
        }

        public Criteria andSingleordertypeidLessThan(Integer value) {
            addCriterion("SingleOrderTypeID <", value, "singleordertypeid");
            return (Criteria) this;
        }

        public Criteria andSingleordertypeidLessThanOrEqualTo(Integer value) {
            addCriterion("SingleOrderTypeID <=", value, "singleordertypeid");
            return (Criteria) this;
        }

        public Criteria andSingleordertypeidIn(List<Integer> values) {
            addCriterion("SingleOrderTypeID in", values, "singleordertypeid");
            return (Criteria) this;
        }

        public Criteria andSingleordertypeidNotIn(List<Integer> values) {
            addCriterion("SingleOrderTypeID not in", values, "singleordertypeid");
            return (Criteria) this;
        }

        public Criteria andSingleordertypeidBetween(Integer value1, Integer value2) {
            addCriterion("SingleOrderTypeID between", value1, value2, "singleordertypeid");
            return (Criteria) this;
        }

        public Criteria andSingleordertypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("SingleOrderTypeID not between", value1, value2, "singleordertypeid");
            return (Criteria) this;
        }

        public Criteria andSingleordertypeIsNull() {
            addCriterion("SingleOrderType is null");
            return (Criteria) this;
        }

        public Criteria andSingleordertypeIsNotNull() {
            addCriterion("SingleOrderType is not null");
            return (Criteria) this;
        }

        public Criteria andSingleordertypeEqualTo(String value) {
            addCriterion("SingleOrderType =", value, "singleordertype");
            return (Criteria) this;
        }

        public Criteria andSingleordertypeNotEqualTo(String value) {
            addCriterion("SingleOrderType <>", value, "singleordertype");
            return (Criteria) this;
        }

        public Criteria andSingleordertypeGreaterThan(String value) {
            addCriterion("SingleOrderType >", value, "singleordertype");
            return (Criteria) this;
        }

        public Criteria andSingleordertypeGreaterThanOrEqualTo(String value) {
            addCriterion("SingleOrderType >=", value, "singleordertype");
            return (Criteria) this;
        }

        public Criteria andSingleordertypeLessThan(String value) {
            addCriterion("SingleOrderType <", value, "singleordertype");
            return (Criteria) this;
        }

        public Criteria andSingleordertypeLessThanOrEqualTo(String value) {
            addCriterion("SingleOrderType <=", value, "singleordertype");
            return (Criteria) this;
        }

        public Criteria andSingleordertypeLike(String value) {
            addCriterion("SingleOrderType like", value, "singleordertype");
            return (Criteria) this;
        }

        public Criteria andSingleordertypeNotLike(String value) {
            addCriterion("SingleOrderType not like", value, "singleordertype");
            return (Criteria) this;
        }

        public Criteria andSingleordertypeIn(List<String> values) {
            addCriterion("SingleOrderType in", values, "singleordertype");
            return (Criteria) this;
        }

        public Criteria andSingleordertypeNotIn(List<String> values) {
            addCriterion("SingleOrderType not in", values, "singleordertype");
            return (Criteria) this;
        }

        public Criteria andSingleordertypeBetween(String value1, String value2) {
            addCriterion("SingleOrderType between", value1, value2, "singleordertype");
            return (Criteria) this;
        }

        public Criteria andSingleordertypeNotBetween(String value1, String value2) {
            addCriterion("SingleOrderType not between", value1, value2, "singleordertype");
            return (Criteria) this;
        }

        public Criteria andServicestandardIsNull() {
            addCriterion("ServiceStandard is null");
            return (Criteria) this;
        }

        public Criteria andServicestandardIsNotNull() {
            addCriterion("ServiceStandard is not null");
            return (Criteria) this;
        }

        public Criteria andServicestandardEqualTo(String value) {
            addCriterion("ServiceStandard =", value, "servicestandard");
            return (Criteria) this;
        }

        public Criteria andServicestandardNotEqualTo(String value) {
            addCriterion("ServiceStandard <>", value, "servicestandard");
            return (Criteria) this;
        }

        public Criteria andServicestandardGreaterThan(String value) {
            addCriterion("ServiceStandard >", value, "servicestandard");
            return (Criteria) this;
        }

        public Criteria andServicestandardGreaterThanOrEqualTo(String value) {
            addCriterion("ServiceStandard >=", value, "servicestandard");
            return (Criteria) this;
        }

        public Criteria andServicestandardLessThan(String value) {
            addCriterion("ServiceStandard <", value, "servicestandard");
            return (Criteria) this;
        }

        public Criteria andServicestandardLessThanOrEqualTo(String value) {
            addCriterion("ServiceStandard <=", value, "servicestandard");
            return (Criteria) this;
        }

        public Criteria andServicestandardLike(String value) {
            addCriterion("ServiceStandard like", value, "servicestandard");
            return (Criteria) this;
        }

        public Criteria andServicestandardNotLike(String value) {
            addCriterion("ServiceStandard not like", value, "servicestandard");
            return (Criteria) this;
        }

        public Criteria andServicestandardIn(List<String> values) {
            addCriterion("ServiceStandard in", values, "servicestandard");
            return (Criteria) this;
        }

        public Criteria andServicestandardNotIn(List<String> values) {
            addCriterion("ServiceStandard not in", values, "servicestandard");
            return (Criteria) this;
        }

        public Criteria andServicestandardBetween(String value1, String value2) {
            addCriterion("ServiceStandard between", value1, value2, "servicestandard");
            return (Criteria) this;
        }

        public Criteria andServicestandardNotBetween(String value1, String value2) {
            addCriterion("ServiceStandard not between", value1, value2, "servicestandard");
            return (Criteria) this;
        }

        public Criteria andPrivcommentIsNull() {
            addCriterion("PrivComment is null");
            return (Criteria) this;
        }

        public Criteria andPrivcommentIsNotNull() {
            addCriterion("PrivComment is not null");
            return (Criteria) this;
        }

        public Criteria andPrivcommentEqualTo(String value) {
            addCriterion("PrivComment =", value, "privcomment");
            return (Criteria) this;
        }

        public Criteria andPrivcommentNotEqualTo(String value) {
            addCriterion("PrivComment <>", value, "privcomment");
            return (Criteria) this;
        }

        public Criteria andPrivcommentGreaterThan(String value) {
            addCriterion("PrivComment >", value, "privcomment");
            return (Criteria) this;
        }

        public Criteria andPrivcommentGreaterThanOrEqualTo(String value) {
            addCriterion("PrivComment >=", value, "privcomment");
            return (Criteria) this;
        }

        public Criteria andPrivcommentLessThan(String value) {
            addCriterion("PrivComment <", value, "privcomment");
            return (Criteria) this;
        }

        public Criteria andPrivcommentLessThanOrEqualTo(String value) {
            addCriterion("PrivComment <=", value, "privcomment");
            return (Criteria) this;
        }

        public Criteria andPrivcommentLike(String value) {
            addCriterion("PrivComment like", value, "privcomment");
            return (Criteria) this;
        }

        public Criteria andPrivcommentNotLike(String value) {
            addCriterion("PrivComment not like", value, "privcomment");
            return (Criteria) this;
        }

        public Criteria andPrivcommentIn(List<String> values) {
            addCriterion("PrivComment in", values, "privcomment");
            return (Criteria) this;
        }

        public Criteria andPrivcommentNotIn(List<String> values) {
            addCriterion("PrivComment not in", values, "privcomment");
            return (Criteria) this;
        }

        public Criteria andPrivcommentBetween(String value1, String value2) {
            addCriterion("PrivComment between", value1, value2, "privcomment");
            return (Criteria) this;
        }

        public Criteria andPrivcommentNotBetween(String value1, String value2) {
            addCriterion("PrivComment not between", value1, value2, "privcomment");
            return (Criteria) this;
        }

        public Criteria andOrdcommentIsNull() {
            addCriterion("OrdComment is null");
            return (Criteria) this;
        }

        public Criteria andOrdcommentIsNotNull() {
            addCriterion("OrdComment is not null");
            return (Criteria) this;
        }

        public Criteria andOrdcommentEqualTo(String value) {
            addCriterion("OrdComment =", value, "ordcomment");
            return (Criteria) this;
        }

        public Criteria andOrdcommentNotEqualTo(String value) {
            addCriterion("OrdComment <>", value, "ordcomment");
            return (Criteria) this;
        }

        public Criteria andOrdcommentGreaterThan(String value) {
            addCriterion("OrdComment >", value, "ordcomment");
            return (Criteria) this;
        }

        public Criteria andOrdcommentGreaterThanOrEqualTo(String value) {
            addCriterion("OrdComment >=", value, "ordcomment");
            return (Criteria) this;
        }

        public Criteria andOrdcommentLessThan(String value) {
            addCriterion("OrdComment <", value, "ordcomment");
            return (Criteria) this;
        }

        public Criteria andOrdcommentLessThanOrEqualTo(String value) {
            addCriterion("OrdComment <=", value, "ordcomment");
            return (Criteria) this;
        }

        public Criteria andOrdcommentLike(String value) {
            addCriterion("OrdComment like", value, "ordcomment");
            return (Criteria) this;
        }

        public Criteria andOrdcommentNotLike(String value) {
            addCriterion("OrdComment not like", value, "ordcomment");
            return (Criteria) this;
        }

        public Criteria andOrdcommentIn(List<String> values) {
            addCriterion("OrdComment in", values, "ordcomment");
            return (Criteria) this;
        }

        public Criteria andOrdcommentNotIn(List<String> values) {
            addCriterion("OrdComment not in", values, "ordcomment");
            return (Criteria) this;
        }

        public Criteria andOrdcommentBetween(String value1, String value2) {
            addCriterion("OrdComment between", value1, value2, "ordcomment");
            return (Criteria) this;
        }

        public Criteria andOrdcommentNotBetween(String value1, String value2) {
            addCriterion("OrdComment not between", value1, value2, "ordcomment");
            return (Criteria) this;
        }

        public Criteria andAjustcommentIsNull() {
            addCriterion("AjustComment is null");
            return (Criteria) this;
        }

        public Criteria andAjustcommentIsNotNull() {
            addCriterion("AjustComment is not null");
            return (Criteria) this;
        }

        public Criteria andAjustcommentEqualTo(String value) {
            addCriterion("AjustComment =", value, "ajustcomment");
            return (Criteria) this;
        }

        public Criteria andAjustcommentNotEqualTo(String value) {
            addCriterion("AjustComment <>", value, "ajustcomment");
            return (Criteria) this;
        }

        public Criteria andAjustcommentGreaterThan(String value) {
            addCriterion("AjustComment >", value, "ajustcomment");
            return (Criteria) this;
        }

        public Criteria andAjustcommentGreaterThanOrEqualTo(String value) {
            addCriterion("AjustComment >=", value, "ajustcomment");
            return (Criteria) this;
        }

        public Criteria andAjustcommentLessThan(String value) {
            addCriterion("AjustComment <", value, "ajustcomment");
            return (Criteria) this;
        }

        public Criteria andAjustcommentLessThanOrEqualTo(String value) {
            addCriterion("AjustComment <=", value, "ajustcomment");
            return (Criteria) this;
        }

        public Criteria andAjustcommentLike(String value) {
            addCriterion("AjustComment like", value, "ajustcomment");
            return (Criteria) this;
        }

        public Criteria andAjustcommentNotLike(String value) {
            addCriterion("AjustComment not like", value, "ajustcomment");
            return (Criteria) this;
        }

        public Criteria andAjustcommentIn(List<String> values) {
            addCriterion("AjustComment in", values, "ajustcomment");
            return (Criteria) this;
        }

        public Criteria andAjustcommentNotIn(List<String> values) {
            addCriterion("AjustComment not in", values, "ajustcomment");
            return (Criteria) this;
        }

        public Criteria andAjustcommentBetween(String value1, String value2) {
            addCriterion("AjustComment between", value1, value2, "ajustcomment");
            return (Criteria) this;
        }

        public Criteria andAjustcommentNotBetween(String value1, String value2) {
            addCriterion("AjustComment not between", value1, value2, "ajustcomment");
            return (Criteria) this;
        }

        public Criteria andTicketstatusIsNull() {
            addCriterion("TicketStatus is null");
            return (Criteria) this;
        }

        public Criteria andTicketstatusIsNotNull() {
            addCriterion("TicketStatus is not null");
            return (Criteria) this;
        }

        public Criteria andTicketstatusEqualTo(Integer value) {
            addCriterion("TicketStatus =", value, "ticketstatus");
            return (Criteria) this;
        }

        public Criteria andTicketstatusNotEqualTo(Integer value) {
            addCriterion("TicketStatus <>", value, "ticketstatus");
            return (Criteria) this;
        }

        public Criteria andTicketstatusGreaterThan(Integer value) {
            addCriterion("TicketStatus >", value, "ticketstatus");
            return (Criteria) this;
        }

        public Criteria andTicketstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("TicketStatus >=", value, "ticketstatus");
            return (Criteria) this;
        }

        public Criteria andTicketstatusLessThan(Integer value) {
            addCriterion("TicketStatus <", value, "ticketstatus");
            return (Criteria) this;
        }

        public Criteria andTicketstatusLessThanOrEqualTo(Integer value) {
            addCriterion("TicketStatus <=", value, "ticketstatus");
            return (Criteria) this;
        }

        public Criteria andTicketstatusIn(List<Integer> values) {
            addCriterion("TicketStatus in", values, "ticketstatus");
            return (Criteria) this;
        }

        public Criteria andTicketstatusNotIn(List<Integer> values) {
            addCriterion("TicketStatus not in", values, "ticketstatus");
            return (Criteria) this;
        }

        public Criteria andTicketstatusBetween(Integer value1, Integer value2) {
            addCriterion("TicketStatus between", value1, value2, "ticketstatus");
            return (Criteria) this;
        }

        public Criteria andTicketstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("TicketStatus not between", value1, value2, "ticketstatus");
            return (Criteria) this;
        }

        public Criteria andRoutetypeidIsNull() {
            addCriterion("RouteTypeID is null");
            return (Criteria) this;
        }

        public Criteria andRoutetypeidIsNotNull() {
            addCriterion("RouteTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andRoutetypeidEqualTo(String value) {
            addCriterion("RouteTypeID =", value, "routetypeid");
            return (Criteria) this;
        }

        public Criteria andRoutetypeidNotEqualTo(String value) {
            addCriterion("RouteTypeID <>", value, "routetypeid");
            return (Criteria) this;
        }

        public Criteria andRoutetypeidGreaterThan(String value) {
            addCriterion("RouteTypeID >", value, "routetypeid");
            return (Criteria) this;
        }

        public Criteria andRoutetypeidGreaterThanOrEqualTo(String value) {
            addCriterion("RouteTypeID >=", value, "routetypeid");
            return (Criteria) this;
        }

        public Criteria andRoutetypeidLessThan(String value) {
            addCriterion("RouteTypeID <", value, "routetypeid");
            return (Criteria) this;
        }

        public Criteria andRoutetypeidLessThanOrEqualTo(String value) {
            addCriterion("RouteTypeID <=", value, "routetypeid");
            return (Criteria) this;
        }

        public Criteria andRoutetypeidLike(String value) {
            addCriterion("RouteTypeID like", value, "routetypeid");
            return (Criteria) this;
        }

        public Criteria andRoutetypeidNotLike(String value) {
            addCriterion("RouteTypeID not like", value, "routetypeid");
            return (Criteria) this;
        }

        public Criteria andRoutetypeidIn(List<String> values) {
            addCriterion("RouteTypeID in", values, "routetypeid");
            return (Criteria) this;
        }

        public Criteria andRoutetypeidNotIn(List<String> values) {
            addCriterion("RouteTypeID not in", values, "routetypeid");
            return (Criteria) this;
        }

        public Criteria andRoutetypeidBetween(String value1, String value2) {
            addCriterion("RouteTypeID between", value1, value2, "routetypeid");
            return (Criteria) this;
        }

        public Criteria andRoutetypeidNotBetween(String value1, String value2) {
            addCriterion("RouteTypeID not between", value1, value2, "routetypeid");
            return (Criteria) this;
        }

        public Criteria andRoutetypenameIsNull() {
            addCriterion("RouteTypeName is null");
            return (Criteria) this;
        }

        public Criteria andRoutetypenameIsNotNull() {
            addCriterion("RouteTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andRoutetypenameEqualTo(String value) {
            addCriterion("RouteTypeName =", value, "routetypename");
            return (Criteria) this;
        }

        public Criteria andRoutetypenameNotEqualTo(String value) {
            addCriterion("RouteTypeName <>", value, "routetypename");
            return (Criteria) this;
        }

        public Criteria andRoutetypenameGreaterThan(String value) {
            addCriterion("RouteTypeName >", value, "routetypename");
            return (Criteria) this;
        }

        public Criteria andRoutetypenameGreaterThanOrEqualTo(String value) {
            addCriterion("RouteTypeName >=", value, "routetypename");
            return (Criteria) this;
        }

        public Criteria andRoutetypenameLessThan(String value) {
            addCriterion("RouteTypeName <", value, "routetypename");
            return (Criteria) this;
        }

        public Criteria andRoutetypenameLessThanOrEqualTo(String value) {
            addCriterion("RouteTypeName <=", value, "routetypename");
            return (Criteria) this;
        }

        public Criteria andRoutetypenameLike(String value) {
            addCriterion("RouteTypeName like", value, "routetypename");
            return (Criteria) this;
        }

        public Criteria andRoutetypenameNotLike(String value) {
            addCriterion("RouteTypeName not like", value, "routetypename");
            return (Criteria) this;
        }

        public Criteria andRoutetypenameIn(List<String> values) {
            addCriterion("RouteTypeName in", values, "routetypename");
            return (Criteria) this;
        }

        public Criteria andRoutetypenameNotIn(List<String> values) {
            addCriterion("RouteTypeName not in", values, "routetypename");
            return (Criteria) this;
        }

        public Criteria andRoutetypenameBetween(String value1, String value2) {
            addCriterion("RouteTypeName between", value1, value2, "routetypename");
            return (Criteria) this;
        }

        public Criteria andRoutetypenameNotBetween(String value1, String value2) {
            addCriterion("RouteTypeName not between", value1, value2, "routetypename");
            return (Criteria) this;
        }

        public Criteria andCustomerunittypeIsNull() {
            addCriterion("CustomerUnitType is null");
            return (Criteria) this;
        }

        public Criteria andCustomerunittypeIsNotNull() {
            addCriterion("CustomerUnitType is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerunittypeEqualTo(Integer value) {
            addCriterion("CustomerUnitType =", value, "customerunittype");
            return (Criteria) this;
        }

        public Criteria andCustomerunittypeNotEqualTo(Integer value) {
            addCriterion("CustomerUnitType <>", value, "customerunittype");
            return (Criteria) this;
        }

        public Criteria andCustomerunittypeGreaterThan(Integer value) {
            addCriterion("CustomerUnitType >", value, "customerunittype");
            return (Criteria) this;
        }

        public Criteria andCustomerunittypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CustomerUnitType >=", value, "customerunittype");
            return (Criteria) this;
        }

        public Criteria andCustomerunittypeLessThan(Integer value) {
            addCriterion("CustomerUnitType <", value, "customerunittype");
            return (Criteria) this;
        }

        public Criteria andCustomerunittypeLessThanOrEqualTo(Integer value) {
            addCriterion("CustomerUnitType <=", value, "customerunittype");
            return (Criteria) this;
        }

        public Criteria andCustomerunittypeIn(List<Integer> values) {
            addCriterion("CustomerUnitType in", values, "customerunittype");
            return (Criteria) this;
        }

        public Criteria andCustomerunittypeNotIn(List<Integer> values) {
            addCriterion("CustomerUnitType not in", values, "customerunittype");
            return (Criteria) this;
        }

        public Criteria andCustomerunittypeBetween(Integer value1, Integer value2) {
            addCriterion("CustomerUnitType between", value1, value2, "customerunittype");
            return (Criteria) this;
        }

        public Criteria andCustomerunittypeNotBetween(Integer value1, Integer value2) {
            addCriterion("CustomerUnitType not between", value1, value2, "customerunittype");
            return (Criteria) this;
        }

        public Criteria andIssigncostIsNull() {
            addCriterion("IsSignCost is null");
            return (Criteria) this;
        }

        public Criteria andIssigncostIsNotNull() {
            addCriterion("IsSignCost is not null");
            return (Criteria) this;
        }

        public Criteria andIssigncostEqualTo(Integer value) {
            addCriterion("IsSignCost =", value, "issigncost");
            return (Criteria) this;
        }

        public Criteria andIssigncostNotEqualTo(Integer value) {
            addCriterion("IsSignCost <>", value, "issigncost");
            return (Criteria) this;
        }

        public Criteria andIssigncostGreaterThan(Integer value) {
            addCriterion("IsSignCost >", value, "issigncost");
            return (Criteria) this;
        }

        public Criteria andIssigncostGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsSignCost >=", value, "issigncost");
            return (Criteria) this;
        }

        public Criteria andIssigncostLessThan(Integer value) {
            addCriterion("IsSignCost <", value, "issigncost");
            return (Criteria) this;
        }

        public Criteria andIssigncostLessThanOrEqualTo(Integer value) {
            addCriterion("IsSignCost <=", value, "issigncost");
            return (Criteria) this;
        }

        public Criteria andIssigncostIn(List<Integer> values) {
            addCriterion("IsSignCost in", values, "issigncost");
            return (Criteria) this;
        }

        public Criteria andIssigncostNotIn(List<Integer> values) {
            addCriterion("IsSignCost not in", values, "issigncost");
            return (Criteria) this;
        }

        public Criteria andIssigncostBetween(Integer value1, Integer value2) {
            addCriterion("IsSignCost between", value1, value2, "issigncost");
            return (Criteria) this;
        }

        public Criteria andIssigncostNotBetween(Integer value1, Integer value2) {
            addCriterion("IsSignCost not between", value1, value2, "issigncost");
            return (Criteria) this;
        }

        public Criteria andDepidIsNull() {
            addCriterion("DepID is null");
            return (Criteria) this;
        }

        public Criteria andDepidIsNotNull() {
            addCriterion("DepID is not null");
            return (Criteria) this;
        }

        public Criteria andDepidEqualTo(String value) {
            addCriterion("DepID =", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidNotEqualTo(String value) {
            addCriterion("DepID <>", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidGreaterThan(String value) {
            addCriterion("DepID >", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidGreaterThanOrEqualTo(String value) {
            addCriterion("DepID >=", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidLessThan(String value) {
            addCriterion("DepID <", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidLessThanOrEqualTo(String value) {
            addCriterion("DepID <=", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidLike(String value) {
            addCriterion("DepID like", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidNotLike(String value) {
            addCriterion("DepID not like", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidIn(List<String> values) {
            addCriterion("DepID in", values, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidNotIn(List<String> values) {
            addCriterion("DepID not in", values, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidBetween(String value1, String value2) {
            addCriterion("DepID between", value1, value2, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidNotBetween(String value1, String value2) {
            addCriterion("DepID not between", value1, value2, "depid");
            return (Criteria) this;
        }

        public Criteria andProtypeIsNull() {
            addCriterion("ProType is null");
            return (Criteria) this;
        }

        public Criteria andProtypeIsNotNull() {
            addCriterion("ProType is not null");
            return (Criteria) this;
        }

        public Criteria andProtypeEqualTo(String value) {
            addCriterion("ProType =", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeNotEqualTo(String value) {
            addCriterion("ProType <>", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeGreaterThan(String value) {
            addCriterion("ProType >", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeGreaterThanOrEqualTo(String value) {
            addCriterion("ProType >=", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeLessThan(String value) {
            addCriterion("ProType <", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeLessThanOrEqualTo(String value) {
            addCriterion("ProType <=", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeLike(String value) {
            addCriterion("ProType like", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeNotLike(String value) {
            addCriterion("ProType not like", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeIn(List<String> values) {
            addCriterion("ProType in", values, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeNotIn(List<String> values) {
            addCriterion("ProType not in", values, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeBetween(String value1, String value2) {
            addCriterion("ProType between", value1, value2, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeNotBetween(String value1, String value2) {
            addCriterion("ProType not between", value1, value2, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeidIsNull() {
            addCriterion("ProTypeID is null");
            return (Criteria) this;
        }

        public Criteria andProtypeidIsNotNull() {
            addCriterion("ProTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andProtypeidEqualTo(String value) {
            addCriterion("ProTypeID =", value, "protypeid");
            return (Criteria) this;
        }

        public Criteria andProtypeidNotEqualTo(String value) {
            addCriterion("ProTypeID <>", value, "protypeid");
            return (Criteria) this;
        }

        public Criteria andProtypeidGreaterThan(String value) {
            addCriterion("ProTypeID >", value, "protypeid");
            return (Criteria) this;
        }

        public Criteria andProtypeidGreaterThanOrEqualTo(String value) {
            addCriterion("ProTypeID >=", value, "protypeid");
            return (Criteria) this;
        }

        public Criteria andProtypeidLessThan(String value) {
            addCriterion("ProTypeID <", value, "protypeid");
            return (Criteria) this;
        }

        public Criteria andProtypeidLessThanOrEqualTo(String value) {
            addCriterion("ProTypeID <=", value, "protypeid");
            return (Criteria) this;
        }

        public Criteria andProtypeidLike(String value) {
            addCriterion("ProTypeID like", value, "protypeid");
            return (Criteria) this;
        }

        public Criteria andProtypeidNotLike(String value) {
            addCriterion("ProTypeID not like", value, "protypeid");
            return (Criteria) this;
        }

        public Criteria andProtypeidIn(List<String> values) {
            addCriterion("ProTypeID in", values, "protypeid");
            return (Criteria) this;
        }

        public Criteria andProtypeidNotIn(List<String> values) {
            addCriterion("ProTypeID not in", values, "protypeid");
            return (Criteria) this;
        }

        public Criteria andProtypeidBetween(String value1, String value2) {
            addCriterion("ProTypeID between", value1, value2, "protypeid");
            return (Criteria) this;
        }

        public Criteria andProtypeidNotBetween(String value1, String value2) {
            addCriterion("ProTypeID not between", value1, value2, "protypeid");
            return (Criteria) this;
        }

        public Criteria andIscreditpayIsNull() {
            addCriterion("IsCreditPay is null");
            return (Criteria) this;
        }

        public Criteria andIscreditpayIsNotNull() {
            addCriterion("IsCreditPay is not null");
            return (Criteria) this;
        }

        public Criteria andIscreditpayEqualTo(Boolean value) {
            addCriterion("IsCreditPay =", value, "iscreditpay");
            return (Criteria) this;
        }

        public Criteria andIscreditpayNotEqualTo(Boolean value) {
            addCriterion("IsCreditPay <>", value, "iscreditpay");
            return (Criteria) this;
        }

        public Criteria andIscreditpayGreaterThan(Boolean value) {
            addCriterion("IsCreditPay >", value, "iscreditpay");
            return (Criteria) this;
        }

        public Criteria andIscreditpayGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsCreditPay >=", value, "iscreditpay");
            return (Criteria) this;
        }

        public Criteria andIscreditpayLessThan(Boolean value) {
            addCriterion("IsCreditPay <", value, "iscreditpay");
            return (Criteria) this;
        }

        public Criteria andIscreditpayLessThanOrEqualTo(Boolean value) {
            addCriterion("IsCreditPay <=", value, "iscreditpay");
            return (Criteria) this;
        }

        public Criteria andIscreditpayIn(List<Boolean> values) {
            addCriterion("IsCreditPay in", values, "iscreditpay");
            return (Criteria) this;
        }

        public Criteria andIscreditpayNotIn(List<Boolean> values) {
            addCriterion("IsCreditPay not in", values, "iscreditpay");
            return (Criteria) this;
        }

        public Criteria andIscreditpayBetween(Boolean value1, Boolean value2) {
            addCriterion("IsCreditPay between", value1, value2, "iscreditpay");
            return (Criteria) this;
        }

        public Criteria andIscreditpayNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsCreditPay not between", value1, value2, "iscreditpay");
            return (Criteria) this;
        }

        public Criteria andCreditpaydateIsNull() {
            addCriterion("CreditPayDate is null");
            return (Criteria) this;
        }

        public Criteria andCreditpaydateIsNotNull() {
            addCriterion("CreditPayDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreditpaydateEqualTo(Date value) {
            addCriterion("CreditPayDate =", value, "creditpaydate");
            return (Criteria) this;
        }

        public Criteria andCreditpaydateNotEqualTo(Date value) {
            addCriterion("CreditPayDate <>", value, "creditpaydate");
            return (Criteria) this;
        }

        public Criteria andCreditpaydateGreaterThan(Date value) {
            addCriterion("CreditPayDate >", value, "creditpaydate");
            return (Criteria) this;
        }

        public Criteria andCreditpaydateGreaterThanOrEqualTo(Date value) {
            addCriterion("CreditPayDate >=", value, "creditpaydate");
            return (Criteria) this;
        }

        public Criteria andCreditpaydateLessThan(Date value) {
            addCriterion("CreditPayDate <", value, "creditpaydate");
            return (Criteria) this;
        }

        public Criteria andCreditpaydateLessThanOrEqualTo(Date value) {
            addCriterion("CreditPayDate <=", value, "creditpaydate");
            return (Criteria) this;
        }

        public Criteria andCreditpaydateIn(List<Date> values) {
            addCriterion("CreditPayDate in", values, "creditpaydate");
            return (Criteria) this;
        }

        public Criteria andCreditpaydateNotIn(List<Date> values) {
            addCriterion("CreditPayDate not in", values, "creditpaydate");
            return (Criteria) this;
        }

        public Criteria andCreditpaydateBetween(Date value1, Date value2) {
            addCriterion("CreditPayDate between", value1, value2, "creditpaydate");
            return (Criteria) this;
        }

        public Criteria andCreditpaydateNotBetween(Date value1, Date value2) {
            addCriterion("CreditPayDate not between", value1, value2, "creditpaydate");
            return (Criteria) this;
        }

        public Criteria andPaystatusIsNull() {
            addCriterion("PayStatus is null");
            return (Criteria) this;
        }

        public Criteria andPaystatusIsNotNull() {
            addCriterion("PayStatus is not null");
            return (Criteria) this;
        }

        public Criteria andPaystatusEqualTo(Integer value) {
            addCriterion("PayStatus =", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotEqualTo(Integer value) {
            addCriterion("PayStatus <>", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusGreaterThan(Integer value) {
            addCriterion("PayStatus >", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("PayStatus >=", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusLessThan(Integer value) {
            addCriterion("PayStatus <", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusLessThanOrEqualTo(Integer value) {
            addCriterion("PayStatus <=", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusIn(List<Integer> values) {
            addCriterion("PayStatus in", values, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotIn(List<Integer> values) {
            addCriterion("PayStatus not in", values, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusBetween(Integer value1, Integer value2) {
            addCriterion("PayStatus between", value1, value2, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotBetween(Integer value1, Integer value2) {
            addCriterion("PayStatus not between", value1, value2, "paystatus");
            return (Criteria) this;
        }

        public Criteria andEntrysourceidIsNull() {
            addCriterion("EntrySourceID is null");
            return (Criteria) this;
        }

        public Criteria andEntrysourceidIsNotNull() {
            addCriterion("EntrySourceID is not null");
            return (Criteria) this;
        }

        public Criteria andEntrysourceidEqualTo(String value) {
            addCriterion("EntrySourceID =", value, "entrysourceid");
            return (Criteria) this;
        }

        public Criteria andEntrysourceidNotEqualTo(String value) {
            addCriterion("EntrySourceID <>", value, "entrysourceid");
            return (Criteria) this;
        }

        public Criteria andEntrysourceidGreaterThan(String value) {
            addCriterion("EntrySourceID >", value, "entrysourceid");
            return (Criteria) this;
        }

        public Criteria andEntrysourceidGreaterThanOrEqualTo(String value) {
            addCriterion("EntrySourceID >=", value, "entrysourceid");
            return (Criteria) this;
        }

        public Criteria andEntrysourceidLessThan(String value) {
            addCriterion("EntrySourceID <", value, "entrysourceid");
            return (Criteria) this;
        }

        public Criteria andEntrysourceidLessThanOrEqualTo(String value) {
            addCriterion("EntrySourceID <=", value, "entrysourceid");
            return (Criteria) this;
        }

        public Criteria andEntrysourceidLike(String value) {
            addCriterion("EntrySourceID like", value, "entrysourceid");
            return (Criteria) this;
        }

        public Criteria andEntrysourceidNotLike(String value) {
            addCriterion("EntrySourceID not like", value, "entrysourceid");
            return (Criteria) this;
        }

        public Criteria andEntrysourceidIn(List<String> values) {
            addCriterion("EntrySourceID in", values, "entrysourceid");
            return (Criteria) this;
        }

        public Criteria andEntrysourceidNotIn(List<String> values) {
            addCriterion("EntrySourceID not in", values, "entrysourceid");
            return (Criteria) this;
        }

        public Criteria andEntrysourceidBetween(String value1, String value2) {
            addCriterion("EntrySourceID between", value1, value2, "entrysourceid");
            return (Criteria) this;
        }

        public Criteria andEntrysourceidNotBetween(String value1, String value2) {
            addCriterion("EntrySourceID not between", value1, value2, "entrysourceid");
            return (Criteria) this;
        }

        public Criteria andEntrysourceIsNull() {
            addCriterion("EntrySource is null");
            return (Criteria) this;
        }

        public Criteria andEntrysourceIsNotNull() {
            addCriterion("EntrySource is not null");
            return (Criteria) this;
        }

        public Criteria andEntrysourceEqualTo(String value) {
            addCriterion("EntrySource =", value, "entrysource");
            return (Criteria) this;
        }

        public Criteria andEntrysourceNotEqualTo(String value) {
            addCriterion("EntrySource <>", value, "entrysource");
            return (Criteria) this;
        }

        public Criteria andEntrysourceGreaterThan(String value) {
            addCriterion("EntrySource >", value, "entrysource");
            return (Criteria) this;
        }

        public Criteria andEntrysourceGreaterThanOrEqualTo(String value) {
            addCriterion("EntrySource >=", value, "entrysource");
            return (Criteria) this;
        }

        public Criteria andEntrysourceLessThan(String value) {
            addCriterion("EntrySource <", value, "entrysource");
            return (Criteria) this;
        }

        public Criteria andEntrysourceLessThanOrEqualTo(String value) {
            addCriterion("EntrySource <=", value, "entrysource");
            return (Criteria) this;
        }

        public Criteria andEntrysourceLike(String value) {
            addCriterion("EntrySource like", value, "entrysource");
            return (Criteria) this;
        }

        public Criteria andEntrysourceNotLike(String value) {
            addCriterion("EntrySource not like", value, "entrysource");
            return (Criteria) this;
        }

        public Criteria andEntrysourceIn(List<String> values) {
            addCriterion("EntrySource in", values, "entrysource");
            return (Criteria) this;
        }

        public Criteria andEntrysourceNotIn(List<String> values) {
            addCriterion("EntrySource not in", values, "entrysource");
            return (Criteria) this;
        }

        public Criteria andEntrysourceBetween(String value1, String value2) {
            addCriterion("EntrySource between", value1, value2, "entrysource");
            return (Criteria) this;
        }

        public Criteria andEntrysourceNotBetween(String value1, String value2) {
            addCriterion("EntrySource not between", value1, value2, "entrysource");
            return (Criteria) this;
        }

        public Criteria andOrdersalerIsNull() {
            addCriterion("OrderSaler is null");
            return (Criteria) this;
        }

        public Criteria andOrdersalerIsNotNull() {
            addCriterion("OrderSaler is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersalerEqualTo(String value) {
            addCriterion("OrderSaler =", value, "ordersaler");
            return (Criteria) this;
        }

        public Criteria andOrdersalerNotEqualTo(String value) {
            addCriterion("OrderSaler <>", value, "ordersaler");
            return (Criteria) this;
        }

        public Criteria andOrdersalerGreaterThan(String value) {
            addCriterion("OrderSaler >", value, "ordersaler");
            return (Criteria) this;
        }

        public Criteria andOrdersalerGreaterThanOrEqualTo(String value) {
            addCriterion("OrderSaler >=", value, "ordersaler");
            return (Criteria) this;
        }

        public Criteria andOrdersalerLessThan(String value) {
            addCriterion("OrderSaler <", value, "ordersaler");
            return (Criteria) this;
        }

        public Criteria andOrdersalerLessThanOrEqualTo(String value) {
            addCriterion("OrderSaler <=", value, "ordersaler");
            return (Criteria) this;
        }

        public Criteria andOrdersalerLike(String value) {
            addCriterion("OrderSaler like", value, "ordersaler");
            return (Criteria) this;
        }

        public Criteria andOrdersalerNotLike(String value) {
            addCriterion("OrderSaler not like", value, "ordersaler");
            return (Criteria) this;
        }

        public Criteria andOrdersalerIn(List<String> values) {
            addCriterion("OrderSaler in", values, "ordersaler");
            return (Criteria) this;
        }

        public Criteria andOrdersalerNotIn(List<String> values) {
            addCriterion("OrderSaler not in", values, "ordersaler");
            return (Criteria) this;
        }

        public Criteria andOrdersalerBetween(String value1, String value2) {
            addCriterion("OrderSaler between", value1, value2, "ordersaler");
            return (Criteria) this;
        }

        public Criteria andOrdersalerNotBetween(String value1, String value2) {
            addCriterion("OrderSaler not between", value1, value2, "ordersaler");
            return (Criteria) this;
        }

        public Criteria andOrdersaleridIsNull() {
            addCriterion("OrderSalerID is null");
            return (Criteria) this;
        }

        public Criteria andOrdersaleridIsNotNull() {
            addCriterion("OrderSalerID is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersaleridEqualTo(String value) {
            addCriterion("OrderSalerID =", value, "ordersalerid");
            return (Criteria) this;
        }

        public Criteria andOrdersaleridNotEqualTo(String value) {
            addCriterion("OrderSalerID <>", value, "ordersalerid");
            return (Criteria) this;
        }

        public Criteria andOrdersaleridGreaterThan(String value) {
            addCriterion("OrderSalerID >", value, "ordersalerid");
            return (Criteria) this;
        }

        public Criteria andOrdersaleridGreaterThanOrEqualTo(String value) {
            addCriterion("OrderSalerID >=", value, "ordersalerid");
            return (Criteria) this;
        }

        public Criteria andOrdersaleridLessThan(String value) {
            addCriterion("OrderSalerID <", value, "ordersalerid");
            return (Criteria) this;
        }

        public Criteria andOrdersaleridLessThanOrEqualTo(String value) {
            addCriterion("OrderSalerID <=", value, "ordersalerid");
            return (Criteria) this;
        }

        public Criteria andOrdersaleridLike(String value) {
            addCriterion("OrderSalerID like", value, "ordersalerid");
            return (Criteria) this;
        }

        public Criteria andOrdersaleridNotLike(String value) {
            addCriterion("OrderSalerID not like", value, "ordersalerid");
            return (Criteria) this;
        }

        public Criteria andOrdersaleridIn(List<String> values) {
            addCriterion("OrderSalerID in", values, "ordersalerid");
            return (Criteria) this;
        }

        public Criteria andOrdersaleridNotIn(List<String> values) {
            addCriterion("OrderSalerID not in", values, "ordersalerid");
            return (Criteria) this;
        }

        public Criteria andOrdersaleridBetween(String value1, String value2) {
            addCriterion("OrderSalerID between", value1, value2, "ordersalerid");
            return (Criteria) this;
        }

        public Criteria andOrdersaleridNotBetween(String value1, String value2) {
            addCriterion("OrderSalerID not between", value1, value2, "ordersalerid");
            return (Criteria) this;
        }

        public Criteria andAirportserviceIsNull() {
            addCriterion("AirportService is null");
            return (Criteria) this;
        }

        public Criteria andAirportserviceIsNotNull() {
            addCriterion("AirportService is not null");
            return (Criteria) this;
        }

        public Criteria andAirportserviceEqualTo(String value) {
            addCriterion("AirportService =", value, "airportservice");
            return (Criteria) this;
        }

        public Criteria andAirportserviceNotEqualTo(String value) {
            addCriterion("AirportService <>", value, "airportservice");
            return (Criteria) this;
        }

        public Criteria andAirportserviceGreaterThan(String value) {
            addCriterion("AirportService >", value, "airportservice");
            return (Criteria) this;
        }

        public Criteria andAirportserviceGreaterThanOrEqualTo(String value) {
            addCriterion("AirportService >=", value, "airportservice");
            return (Criteria) this;
        }

        public Criteria andAirportserviceLessThan(String value) {
            addCriterion("AirportService <", value, "airportservice");
            return (Criteria) this;
        }

        public Criteria andAirportserviceLessThanOrEqualTo(String value) {
            addCriterion("AirportService <=", value, "airportservice");
            return (Criteria) this;
        }

        public Criteria andAirportserviceLike(String value) {
            addCriterion("AirportService like", value, "airportservice");
            return (Criteria) this;
        }

        public Criteria andAirportserviceNotLike(String value) {
            addCriterion("AirportService not like", value, "airportservice");
            return (Criteria) this;
        }

        public Criteria andAirportserviceIn(List<String> values) {
            addCriterion("AirportService in", values, "airportservice");
            return (Criteria) this;
        }

        public Criteria andAirportserviceNotIn(List<String> values) {
            addCriterion("AirportService not in", values, "airportservice");
            return (Criteria) this;
        }

        public Criteria andAirportserviceBetween(String value1, String value2) {
            addCriterion("AirportService between", value1, value2, "airportservice");
            return (Criteria) this;
        }

        public Criteria andAirportserviceNotBetween(String value1, String value2) {
            addCriterion("AirportService not between", value1, value2, "airportservice");
            return (Criteria) this;
        }

        public Criteria andSalerdeptidIsNull() {
            addCriterion("SalerDeptID is null");
            return (Criteria) this;
        }

        public Criteria andSalerdeptidIsNotNull() {
            addCriterion("SalerDeptID is not null");
            return (Criteria) this;
        }

        public Criteria andSalerdeptidEqualTo(String value) {
            addCriterion("SalerDeptID =", value, "salerdeptid");
            return (Criteria) this;
        }

        public Criteria andSalerdeptidNotEqualTo(String value) {
            addCriterion("SalerDeptID <>", value, "salerdeptid");
            return (Criteria) this;
        }

        public Criteria andSalerdeptidGreaterThan(String value) {
            addCriterion("SalerDeptID >", value, "salerdeptid");
            return (Criteria) this;
        }

        public Criteria andSalerdeptidGreaterThanOrEqualTo(String value) {
            addCriterion("SalerDeptID >=", value, "salerdeptid");
            return (Criteria) this;
        }

        public Criteria andSalerdeptidLessThan(String value) {
            addCriterion("SalerDeptID <", value, "salerdeptid");
            return (Criteria) this;
        }

        public Criteria andSalerdeptidLessThanOrEqualTo(String value) {
            addCriterion("SalerDeptID <=", value, "salerdeptid");
            return (Criteria) this;
        }

        public Criteria andSalerdeptidLike(String value) {
            addCriterion("SalerDeptID like", value, "salerdeptid");
            return (Criteria) this;
        }

        public Criteria andSalerdeptidNotLike(String value) {
            addCriterion("SalerDeptID not like", value, "salerdeptid");
            return (Criteria) this;
        }

        public Criteria andSalerdeptidIn(List<String> values) {
            addCriterion("SalerDeptID in", values, "salerdeptid");
            return (Criteria) this;
        }

        public Criteria andSalerdeptidNotIn(List<String> values) {
            addCriterion("SalerDeptID not in", values, "salerdeptid");
            return (Criteria) this;
        }

        public Criteria andSalerdeptidBetween(String value1, String value2) {
            addCriterion("SalerDeptID between", value1, value2, "salerdeptid");
            return (Criteria) this;
        }

        public Criteria andSalerdeptidNotBetween(String value1, String value2) {
            addCriterion("SalerDeptID not between", value1, value2, "salerdeptid");
            return (Criteria) this;
        }

        public Criteria andSalerdeptnameIsNull() {
            addCriterion("SalerDeptName is null");
            return (Criteria) this;
        }

        public Criteria andSalerdeptnameIsNotNull() {
            addCriterion("SalerDeptName is not null");
            return (Criteria) this;
        }

        public Criteria andSalerdeptnameEqualTo(String value) {
            addCriterion("SalerDeptName =", value, "salerdeptname");
            return (Criteria) this;
        }

        public Criteria andSalerdeptnameNotEqualTo(String value) {
            addCriterion("SalerDeptName <>", value, "salerdeptname");
            return (Criteria) this;
        }

        public Criteria andSalerdeptnameGreaterThan(String value) {
            addCriterion("SalerDeptName >", value, "salerdeptname");
            return (Criteria) this;
        }

        public Criteria andSalerdeptnameGreaterThanOrEqualTo(String value) {
            addCriterion("SalerDeptName >=", value, "salerdeptname");
            return (Criteria) this;
        }

        public Criteria andSalerdeptnameLessThan(String value) {
            addCriterion("SalerDeptName <", value, "salerdeptname");
            return (Criteria) this;
        }

        public Criteria andSalerdeptnameLessThanOrEqualTo(String value) {
            addCriterion("SalerDeptName <=", value, "salerdeptname");
            return (Criteria) this;
        }

        public Criteria andSalerdeptnameLike(String value) {
            addCriterion("SalerDeptName like", value, "salerdeptname");
            return (Criteria) this;
        }

        public Criteria andSalerdeptnameNotLike(String value) {
            addCriterion("SalerDeptName not like", value, "salerdeptname");
            return (Criteria) this;
        }

        public Criteria andSalerdeptnameIn(List<String> values) {
            addCriterion("SalerDeptName in", values, "salerdeptname");
            return (Criteria) this;
        }

        public Criteria andSalerdeptnameNotIn(List<String> values) {
            addCriterion("SalerDeptName not in", values, "salerdeptname");
            return (Criteria) this;
        }

        public Criteria andSalerdeptnameBetween(String value1, String value2) {
            addCriterion("SalerDeptName between", value1, value2, "salerdeptname");
            return (Criteria) this;
        }

        public Criteria andSalerdeptnameNotBetween(String value1, String value2) {
            addCriterion("SalerDeptName not between", value1, value2, "salerdeptname");
            return (Criteria) this;
        }

        public Criteria andHastouristIsNull() {
            addCriterion("HasTourist is null");
            return (Criteria) this;
        }

        public Criteria andHastouristIsNotNull() {
            addCriterion("HasTourist is not null");
            return (Criteria) this;
        }

        public Criteria andHastouristEqualTo(Integer value) {
            addCriterion("HasTourist =", value, "hastourist");
            return (Criteria) this;
        }

        public Criteria andHastouristNotEqualTo(Integer value) {
            addCriterion("HasTourist <>", value, "hastourist");
            return (Criteria) this;
        }

        public Criteria andHastouristGreaterThan(Integer value) {
            addCriterion("HasTourist >", value, "hastourist");
            return (Criteria) this;
        }

        public Criteria andHastouristGreaterThanOrEqualTo(Integer value) {
            addCriterion("HasTourist >=", value, "hastourist");
            return (Criteria) this;
        }

        public Criteria andHastouristLessThan(Integer value) {
            addCriterion("HasTourist <", value, "hastourist");
            return (Criteria) this;
        }

        public Criteria andHastouristLessThanOrEqualTo(Integer value) {
            addCriterion("HasTourist <=", value, "hastourist");
            return (Criteria) this;
        }

        public Criteria andHastouristIn(List<Integer> values) {
            addCriterion("HasTourist in", values, "hastourist");
            return (Criteria) this;
        }

        public Criteria andHastouristNotIn(List<Integer> values) {
            addCriterion("HasTourist not in", values, "hastourist");
            return (Criteria) this;
        }

        public Criteria andHastouristBetween(Integer value1, Integer value2) {
            addCriterion("HasTourist between", value1, value2, "hastourist");
            return (Criteria) this;
        }

        public Criteria andHastouristNotBetween(Integer value1, Integer value2) {
            addCriterion("HasTourist not between", value1, value2, "hastourist");
            return (Criteria) this;
        }

        public Criteria andIsautoconfirmedIsNull() {
            addCriterion("IsAutoConfirmed is null");
            return (Criteria) this;
        }

        public Criteria andIsautoconfirmedIsNotNull() {
            addCriterion("IsAutoConfirmed is not null");
            return (Criteria) this;
        }

        public Criteria andIsautoconfirmedEqualTo(Integer value) {
            addCriterion("IsAutoConfirmed =", value, "isautoconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsautoconfirmedNotEqualTo(Integer value) {
            addCriterion("IsAutoConfirmed <>", value, "isautoconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsautoconfirmedGreaterThan(Integer value) {
            addCriterion("IsAutoConfirmed >", value, "isautoconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsautoconfirmedGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsAutoConfirmed >=", value, "isautoconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsautoconfirmedLessThan(Integer value) {
            addCriterion("IsAutoConfirmed <", value, "isautoconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsautoconfirmedLessThanOrEqualTo(Integer value) {
            addCriterion("IsAutoConfirmed <=", value, "isautoconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsautoconfirmedIn(List<Integer> values) {
            addCriterion("IsAutoConfirmed in", values, "isautoconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsautoconfirmedNotIn(List<Integer> values) {
            addCriterion("IsAutoConfirmed not in", values, "isautoconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsautoconfirmedBetween(Integer value1, Integer value2) {
            addCriterion("IsAutoConfirmed between", value1, value2, "isautoconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsautoconfirmedNotBetween(Integer value1, Integer value2) {
            addCriterion("IsAutoConfirmed not between", value1, value2, "isautoconfirmed");
            return (Criteria) this;
        }

        public Criteria andOrigreceivableamtIsNull() {
            addCriterion("OrigReceivableAmt is null");
            return (Criteria) this;
        }

        public Criteria andOrigreceivableamtIsNotNull() {
            addCriterion("OrigReceivableAmt is not null");
            return (Criteria) this;
        }

        public Criteria andOrigreceivableamtEqualTo(BigDecimal value) {
            addCriterion("OrigReceivableAmt =", value, "origreceivableamt");
            return (Criteria) this;
        }

        public Criteria andOrigreceivableamtNotEqualTo(BigDecimal value) {
            addCriterion("OrigReceivableAmt <>", value, "origreceivableamt");
            return (Criteria) this;
        }

        public Criteria andOrigreceivableamtGreaterThan(BigDecimal value) {
            addCriterion("OrigReceivableAmt >", value, "origreceivableamt");
            return (Criteria) this;
        }

        public Criteria andOrigreceivableamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OrigReceivableAmt >=", value, "origreceivableamt");
            return (Criteria) this;
        }

        public Criteria andOrigreceivableamtLessThan(BigDecimal value) {
            addCriterion("OrigReceivableAmt <", value, "origreceivableamt");
            return (Criteria) this;
        }

        public Criteria andOrigreceivableamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OrigReceivableAmt <=", value, "origreceivableamt");
            return (Criteria) this;
        }

        public Criteria andOrigreceivableamtIn(List<BigDecimal> values) {
            addCriterion("OrigReceivableAmt in", values, "origreceivableamt");
            return (Criteria) this;
        }

        public Criteria andOrigreceivableamtNotIn(List<BigDecimal> values) {
            addCriterion("OrigReceivableAmt not in", values, "origreceivableamt");
            return (Criteria) this;
        }

        public Criteria andOrigreceivableamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OrigReceivableAmt between", value1, value2, "origreceivableamt");
            return (Criteria) this;
        }

        public Criteria andOrigreceivableamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OrigReceivableAmt not between", value1, value2, "origreceivableamt");
            return (Criteria) this;
        }

        public Criteria andOrigpayableamtIsNull() {
            addCriterion("OrigPayableAmt is null");
            return (Criteria) this;
        }

        public Criteria andOrigpayableamtIsNotNull() {
            addCriterion("OrigPayableAmt is not null");
            return (Criteria) this;
        }

        public Criteria andOrigpayableamtEqualTo(BigDecimal value) {
            addCriterion("OrigPayableAmt =", value, "origpayableamt");
            return (Criteria) this;
        }

        public Criteria andOrigpayableamtNotEqualTo(BigDecimal value) {
            addCriterion("OrigPayableAmt <>", value, "origpayableamt");
            return (Criteria) this;
        }

        public Criteria andOrigpayableamtGreaterThan(BigDecimal value) {
            addCriterion("OrigPayableAmt >", value, "origpayableamt");
            return (Criteria) this;
        }

        public Criteria andOrigpayableamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OrigPayableAmt >=", value, "origpayableamt");
            return (Criteria) this;
        }

        public Criteria andOrigpayableamtLessThan(BigDecimal value) {
            addCriterion("OrigPayableAmt <", value, "origpayableamt");
            return (Criteria) this;
        }

        public Criteria andOrigpayableamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OrigPayableAmt <=", value, "origpayableamt");
            return (Criteria) this;
        }

        public Criteria andOrigpayableamtIn(List<BigDecimal> values) {
            addCriterion("OrigPayableAmt in", values, "origpayableamt");
            return (Criteria) this;
        }

        public Criteria andOrigpayableamtNotIn(List<BigDecimal> values) {
            addCriterion("OrigPayableAmt not in", values, "origpayableamt");
            return (Criteria) this;
        }

        public Criteria andOrigpayableamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OrigPayableAmt between", value1, value2, "origpayableamt");
            return (Criteria) this;
        }

        public Criteria andOrigpayableamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OrigPayableAmt not between", value1, value2, "origpayableamt");
            return (Criteria) this;
        }

        public Criteria andParentorgidIsNull() {
            addCriterion("ParentOrgID is null");
            return (Criteria) this;
        }

        public Criteria andParentorgidIsNotNull() {
            addCriterion("ParentOrgID is not null");
            return (Criteria) this;
        }

        public Criteria andParentorgidEqualTo(String value) {
            addCriterion("ParentOrgID =", value, "parentorgid");
            return (Criteria) this;
        }

        public Criteria andParentorgidNotEqualTo(String value) {
            addCriterion("ParentOrgID <>", value, "parentorgid");
            return (Criteria) this;
        }

        public Criteria andParentorgidGreaterThan(String value) {
            addCriterion("ParentOrgID >", value, "parentorgid");
            return (Criteria) this;
        }

        public Criteria andParentorgidGreaterThanOrEqualTo(String value) {
            addCriterion("ParentOrgID >=", value, "parentorgid");
            return (Criteria) this;
        }

        public Criteria andParentorgidLessThan(String value) {
            addCriterion("ParentOrgID <", value, "parentorgid");
            return (Criteria) this;
        }

        public Criteria andParentorgidLessThanOrEqualTo(String value) {
            addCriterion("ParentOrgID <=", value, "parentorgid");
            return (Criteria) this;
        }

        public Criteria andParentorgidLike(String value) {
            addCriterion("ParentOrgID like", value, "parentorgid");
            return (Criteria) this;
        }

        public Criteria andParentorgidNotLike(String value) {
            addCriterion("ParentOrgID not like", value, "parentorgid");
            return (Criteria) this;
        }

        public Criteria andParentorgidIn(List<String> values) {
            addCriterion("ParentOrgID in", values, "parentorgid");
            return (Criteria) this;
        }

        public Criteria andParentorgidNotIn(List<String> values) {
            addCriterion("ParentOrgID not in", values, "parentorgid");
            return (Criteria) this;
        }

        public Criteria andParentorgidBetween(String value1, String value2) {
            addCriterion("ParentOrgID between", value1, value2, "parentorgid");
            return (Criteria) this;
        }

        public Criteria andParentorgidNotBetween(String value1, String value2) {
            addCriterion("ParentOrgID not between", value1, value2, "parentorgid");
            return (Criteria) this;
        }

        public Criteria andIsdirectorganIsNull() {
            addCriterion("IsDirectOrgan is null");
            return (Criteria) this;
        }

        public Criteria andIsdirectorganIsNotNull() {
            addCriterion("IsDirectOrgan is not null");
            return (Criteria) this;
        }

        public Criteria andIsdirectorganEqualTo(Boolean value) {
            addCriterion("IsDirectOrgan =", value, "isdirectorgan");
            return (Criteria) this;
        }

        public Criteria andIsdirectorganNotEqualTo(Boolean value) {
            addCriterion("IsDirectOrgan <>", value, "isdirectorgan");
            return (Criteria) this;
        }

        public Criteria andIsdirectorganGreaterThan(Boolean value) {
            addCriterion("IsDirectOrgan >", value, "isdirectorgan");
            return (Criteria) this;
        }

        public Criteria andIsdirectorganGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsDirectOrgan >=", value, "isdirectorgan");
            return (Criteria) this;
        }

        public Criteria andIsdirectorganLessThan(Boolean value) {
            addCriterion("IsDirectOrgan <", value, "isdirectorgan");
            return (Criteria) this;
        }

        public Criteria andIsdirectorganLessThanOrEqualTo(Boolean value) {
            addCriterion("IsDirectOrgan <=", value, "isdirectorgan");
            return (Criteria) this;
        }

        public Criteria andIsdirectorganIn(List<Boolean> values) {
            addCriterion("IsDirectOrgan in", values, "isdirectorgan");
            return (Criteria) this;
        }

        public Criteria andIsdirectorganNotIn(List<Boolean> values) {
            addCriterion("IsDirectOrgan not in", values, "isdirectorgan");
            return (Criteria) this;
        }

        public Criteria andIsdirectorganBetween(Boolean value1, Boolean value2) {
            addCriterion("IsDirectOrgan between", value1, value2, "isdirectorgan");
            return (Criteria) this;
        }

        public Criteria andIsdirectorganNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsDirectOrgan not between", value1, value2, "isdirectorgan");
            return (Criteria) this;
        }

        public Criteria andNotouristcommentIsNull() {
            addCriterion("NoTouristComment is null");
            return (Criteria) this;
        }

        public Criteria andNotouristcommentIsNotNull() {
            addCriterion("NoTouristComment is not null");
            return (Criteria) this;
        }

        public Criteria andNotouristcommentEqualTo(String value) {
            addCriterion("NoTouristComment =", value, "notouristcomment");
            return (Criteria) this;
        }

        public Criteria andNotouristcommentNotEqualTo(String value) {
            addCriterion("NoTouristComment <>", value, "notouristcomment");
            return (Criteria) this;
        }

        public Criteria andNotouristcommentGreaterThan(String value) {
            addCriterion("NoTouristComment >", value, "notouristcomment");
            return (Criteria) this;
        }

        public Criteria andNotouristcommentGreaterThanOrEqualTo(String value) {
            addCriterion("NoTouristComment >=", value, "notouristcomment");
            return (Criteria) this;
        }

        public Criteria andNotouristcommentLessThan(String value) {
            addCriterion("NoTouristComment <", value, "notouristcomment");
            return (Criteria) this;
        }

        public Criteria andNotouristcommentLessThanOrEqualTo(String value) {
            addCriterion("NoTouristComment <=", value, "notouristcomment");
            return (Criteria) this;
        }

        public Criteria andNotouristcommentLike(String value) {
            addCriterion("NoTouristComment like", value, "notouristcomment");
            return (Criteria) this;
        }

        public Criteria andNotouristcommentNotLike(String value) {
            addCriterion("NoTouristComment not like", value, "notouristcomment");
            return (Criteria) this;
        }

        public Criteria andNotouristcommentIn(List<String> values) {
            addCriterion("NoTouristComment in", values, "notouristcomment");
            return (Criteria) this;
        }

        public Criteria andNotouristcommentNotIn(List<String> values) {
            addCriterion("NoTouristComment not in", values, "notouristcomment");
            return (Criteria) this;
        }

        public Criteria andNotouristcommentBetween(String value1, String value2) {
            addCriterion("NoTouristComment between", value1, value2, "notouristcomment");
            return (Criteria) this;
        }

        public Criteria andNotouristcommentNotBetween(String value1, String value2) {
            addCriterion("NoTouristComment not between", value1, value2, "notouristcomment");
            return (Criteria) this;
        }

        public Criteria andIsusediscountIsNull() {
            addCriterion("IsUseDiscount is null");
            return (Criteria) this;
        }

        public Criteria andIsusediscountIsNotNull() {
            addCriterion("IsUseDiscount is not null");
            return (Criteria) this;
        }

        public Criteria andIsusediscountEqualTo(Boolean value) {
            addCriterion("IsUseDiscount =", value, "isusediscount");
            return (Criteria) this;
        }

        public Criteria andIsusediscountNotEqualTo(Boolean value) {
            addCriterion("IsUseDiscount <>", value, "isusediscount");
            return (Criteria) this;
        }

        public Criteria andIsusediscountGreaterThan(Boolean value) {
            addCriterion("IsUseDiscount >", value, "isusediscount");
            return (Criteria) this;
        }

        public Criteria andIsusediscountGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsUseDiscount >=", value, "isusediscount");
            return (Criteria) this;
        }

        public Criteria andIsusediscountLessThan(Boolean value) {
            addCriterion("IsUseDiscount <", value, "isusediscount");
            return (Criteria) this;
        }

        public Criteria andIsusediscountLessThanOrEqualTo(Boolean value) {
            addCriterion("IsUseDiscount <=", value, "isusediscount");
            return (Criteria) this;
        }

        public Criteria andIsusediscountIn(List<Boolean> values) {
            addCriterion("IsUseDiscount in", values, "isusediscount");
            return (Criteria) this;
        }

        public Criteria andIsusediscountNotIn(List<Boolean> values) {
            addCriterion("IsUseDiscount not in", values, "isusediscount");
            return (Criteria) this;
        }

        public Criteria andIsusediscountBetween(Boolean value1, Boolean value2) {
            addCriterion("IsUseDiscount between", value1, value2, "isusediscount");
            return (Criteria) this;
        }

        public Criteria andIsusediscountNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsUseDiscount not between", value1, value2, "isusediscount");
            return (Criteria) this;
        }

        public Criteria andPricetypeIsNull() {
            addCriterion("PriceType is null");
            return (Criteria) this;
        }

        public Criteria andPricetypeIsNotNull() {
            addCriterion("PriceType is not null");
            return (Criteria) this;
        }

        public Criteria andPricetypeEqualTo(Integer value) {
            addCriterion("PriceType =", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeNotEqualTo(Integer value) {
            addCriterion("PriceType <>", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeGreaterThan(Integer value) {
            addCriterion("PriceType >", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PriceType >=", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeLessThan(Integer value) {
            addCriterion("PriceType <", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeLessThanOrEqualTo(Integer value) {
            addCriterion("PriceType <=", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeIn(List<Integer> values) {
            addCriterion("PriceType in", values, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeNotIn(List<Integer> values) {
            addCriterion("PriceType not in", values, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeBetween(Integer value1, Integer value2) {
            addCriterion("PriceType between", value1, value2, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("PriceType not between", value1, value2, "pricetype");
            return (Criteria) this;
        }

        public Criteria andProdutoutertimesIsNull() {
            addCriterion("ProdutOuterTimes is null");
            return (Criteria) this;
        }

        public Criteria andProdutoutertimesIsNotNull() {
            addCriterion("ProdutOuterTimes is not null");
            return (Criteria) this;
        }

        public Criteria andProdutoutertimesEqualTo(Integer value) {
            addCriterion("ProdutOuterTimes =", value, "produtoutertimes");
            return (Criteria) this;
        }

        public Criteria andProdutoutertimesNotEqualTo(Integer value) {
            addCriterion("ProdutOuterTimes <>", value, "produtoutertimes");
            return (Criteria) this;
        }

        public Criteria andProdutoutertimesGreaterThan(Integer value) {
            addCriterion("ProdutOuterTimes >", value, "produtoutertimes");
            return (Criteria) this;
        }

        public Criteria andProdutoutertimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProdutOuterTimes >=", value, "produtoutertimes");
            return (Criteria) this;
        }

        public Criteria andProdutoutertimesLessThan(Integer value) {
            addCriterion("ProdutOuterTimes <", value, "produtoutertimes");
            return (Criteria) this;
        }

        public Criteria andProdutoutertimesLessThanOrEqualTo(Integer value) {
            addCriterion("ProdutOuterTimes <=", value, "produtoutertimes");
            return (Criteria) this;
        }

        public Criteria andProdutoutertimesIn(List<Integer> values) {
            addCriterion("ProdutOuterTimes in", values, "produtoutertimes");
            return (Criteria) this;
        }

        public Criteria andProdutoutertimesNotIn(List<Integer> values) {
            addCriterion("ProdutOuterTimes not in", values, "produtoutertimes");
            return (Criteria) this;
        }

        public Criteria andProdutoutertimesBetween(Integer value1, Integer value2) {
            addCriterion("ProdutOuterTimes between", value1, value2, "produtoutertimes");
            return (Criteria) this;
        }

        public Criteria andProdutoutertimesNotBetween(Integer value1, Integer value2) {
            addCriterion("ProdutOuterTimes not between", value1, value2, "produtoutertimes");
            return (Criteria) this;
        }

        public Criteria andNoturnpayableamtIsNull() {
            addCriterion("NoTurnPayableAmt is null");
            return (Criteria) this;
        }

        public Criteria andNoturnpayableamtIsNotNull() {
            addCriterion("NoTurnPayableAmt is not null");
            return (Criteria) this;
        }

        public Criteria andNoturnpayableamtEqualTo(BigDecimal value) {
            addCriterion("NoTurnPayableAmt =", value, "noturnpayableamt");
            return (Criteria) this;
        }

        public Criteria andNoturnpayableamtNotEqualTo(BigDecimal value) {
            addCriterion("NoTurnPayableAmt <>", value, "noturnpayableamt");
            return (Criteria) this;
        }

        public Criteria andNoturnpayableamtGreaterThan(BigDecimal value) {
            addCriterion("NoTurnPayableAmt >", value, "noturnpayableamt");
            return (Criteria) this;
        }

        public Criteria andNoturnpayableamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NoTurnPayableAmt >=", value, "noturnpayableamt");
            return (Criteria) this;
        }

        public Criteria andNoturnpayableamtLessThan(BigDecimal value) {
            addCriterion("NoTurnPayableAmt <", value, "noturnpayableamt");
            return (Criteria) this;
        }

        public Criteria andNoturnpayableamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NoTurnPayableAmt <=", value, "noturnpayableamt");
            return (Criteria) this;
        }

        public Criteria andNoturnpayableamtIn(List<BigDecimal> values) {
            addCriterion("NoTurnPayableAmt in", values, "noturnpayableamt");
            return (Criteria) this;
        }

        public Criteria andNoturnpayableamtNotIn(List<BigDecimal> values) {
            addCriterion("NoTurnPayableAmt not in", values, "noturnpayableamt");
            return (Criteria) this;
        }

        public Criteria andNoturnpayableamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NoTurnPayableAmt between", value1, value2, "noturnpayableamt");
            return (Criteria) this;
        }

        public Criteria andNoturnpayableamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NoTurnPayableAmt not between", value1, value2, "noturnpayableamt");
            return (Criteria) this;
        }

        public Criteria andOrderbusinesssourceIsNull() {
            addCriterion("OrderBusinessSource is null");
            return (Criteria) this;
        }

        public Criteria andOrderbusinesssourceIsNotNull() {
            addCriterion("OrderBusinessSource is not null");
            return (Criteria) this;
        }

        public Criteria andOrderbusinesssourceEqualTo(String value) {
            addCriterion("OrderBusinessSource =", value, "orderbusinesssource");
            return (Criteria) this;
        }

        public Criteria andOrderbusinesssourceNotEqualTo(String value) {
            addCriterion("OrderBusinessSource <>", value, "orderbusinesssource");
            return (Criteria) this;
        }

        public Criteria andOrderbusinesssourceGreaterThan(String value) {
            addCriterion("OrderBusinessSource >", value, "orderbusinesssource");
            return (Criteria) this;
        }

        public Criteria andOrderbusinesssourceGreaterThanOrEqualTo(String value) {
            addCriterion("OrderBusinessSource >=", value, "orderbusinesssource");
            return (Criteria) this;
        }

        public Criteria andOrderbusinesssourceLessThan(String value) {
            addCriterion("OrderBusinessSource <", value, "orderbusinesssource");
            return (Criteria) this;
        }

        public Criteria andOrderbusinesssourceLessThanOrEqualTo(String value) {
            addCriterion("OrderBusinessSource <=", value, "orderbusinesssource");
            return (Criteria) this;
        }

        public Criteria andOrderbusinesssourceLike(String value) {
            addCriterion("OrderBusinessSource like", value, "orderbusinesssource");
            return (Criteria) this;
        }

        public Criteria andOrderbusinesssourceNotLike(String value) {
            addCriterion("OrderBusinessSource not like", value, "orderbusinesssource");
            return (Criteria) this;
        }

        public Criteria andOrderbusinesssourceIn(List<String> values) {
            addCriterion("OrderBusinessSource in", values, "orderbusinesssource");
            return (Criteria) this;
        }

        public Criteria andOrderbusinesssourceNotIn(List<String> values) {
            addCriterion("OrderBusinessSource not in", values, "orderbusinesssource");
            return (Criteria) this;
        }

        public Criteria andOrderbusinesssourceBetween(String value1, String value2) {
            addCriterion("OrderBusinessSource between", value1, value2, "orderbusinesssource");
            return (Criteria) this;
        }

        public Criteria andOrderbusinesssourceNotBetween(String value1, String value2) {
            addCriterion("OrderBusinessSource not between", value1, value2, "orderbusinesssource");
            return (Criteria) this;
        }

        public Criteria andTurnbeforecategoryIsNull() {
            addCriterion("TurnBeforeCategory is null");
            return (Criteria) this;
        }

        public Criteria andTurnbeforecategoryIsNotNull() {
            addCriterion("TurnBeforeCategory is not null");
            return (Criteria) this;
        }

        public Criteria andTurnbeforecategoryEqualTo(Integer value) {
            addCriterion("TurnBeforeCategory =", value, "turnbeforecategory");
            return (Criteria) this;
        }

        public Criteria andTurnbeforecategoryNotEqualTo(Integer value) {
            addCriterion("TurnBeforeCategory <>", value, "turnbeforecategory");
            return (Criteria) this;
        }

        public Criteria andTurnbeforecategoryGreaterThan(Integer value) {
            addCriterion("TurnBeforeCategory >", value, "turnbeforecategory");
            return (Criteria) this;
        }

        public Criteria andTurnbeforecategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("TurnBeforeCategory >=", value, "turnbeforecategory");
            return (Criteria) this;
        }

        public Criteria andTurnbeforecategoryLessThan(Integer value) {
            addCriterion("TurnBeforeCategory <", value, "turnbeforecategory");
            return (Criteria) this;
        }

        public Criteria andTurnbeforecategoryLessThanOrEqualTo(Integer value) {
            addCriterion("TurnBeforeCategory <=", value, "turnbeforecategory");
            return (Criteria) this;
        }

        public Criteria andTurnbeforecategoryIn(List<Integer> values) {
            addCriterion("TurnBeforeCategory in", values, "turnbeforecategory");
            return (Criteria) this;
        }

        public Criteria andTurnbeforecategoryNotIn(List<Integer> values) {
            addCriterion("TurnBeforeCategory not in", values, "turnbeforecategory");
            return (Criteria) this;
        }

        public Criteria andTurnbeforecategoryBetween(Integer value1, Integer value2) {
            addCriterion("TurnBeforeCategory between", value1, value2, "turnbeforecategory");
            return (Criteria) this;
        }

        public Criteria andTurnbeforecategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("TurnBeforeCategory not between", value1, value2, "turnbeforecategory");
            return (Criteria) this;
        }

        public Criteria andExtendedstatusIsNull() {
            addCriterion("ExtendedStatus is null");
            return (Criteria) this;
        }

        public Criteria andExtendedstatusIsNotNull() {
            addCriterion("ExtendedStatus is not null");
            return (Criteria) this;
        }

        public Criteria andExtendedstatusEqualTo(Integer value) {
            addCriterion("ExtendedStatus =", value, "extendedstatus");
            return (Criteria) this;
        }

        public Criteria andExtendedstatusNotEqualTo(Integer value) {
            addCriterion("ExtendedStatus <>", value, "extendedstatus");
            return (Criteria) this;
        }

        public Criteria andExtendedstatusGreaterThan(Integer value) {
            addCriterion("ExtendedStatus >", value, "extendedstatus");
            return (Criteria) this;
        }

        public Criteria andExtendedstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("ExtendedStatus >=", value, "extendedstatus");
            return (Criteria) this;
        }

        public Criteria andExtendedstatusLessThan(Integer value) {
            addCriterion("ExtendedStatus <", value, "extendedstatus");
            return (Criteria) this;
        }

        public Criteria andExtendedstatusLessThanOrEqualTo(Integer value) {
            addCriterion("ExtendedStatus <=", value, "extendedstatus");
            return (Criteria) this;
        }

        public Criteria andExtendedstatusIn(List<Integer> values) {
            addCriterion("ExtendedStatus in", values, "extendedstatus");
            return (Criteria) this;
        }

        public Criteria andExtendedstatusNotIn(List<Integer> values) {
            addCriterion("ExtendedStatus not in", values, "extendedstatus");
            return (Criteria) this;
        }

        public Criteria andExtendedstatusBetween(Integer value1, Integer value2) {
            addCriterion("ExtendedStatus between", value1, value2, "extendedstatus");
            return (Criteria) this;
        }

        public Criteria andExtendedstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("ExtendedStatus not between", value1, value2, "extendedstatus");
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

        public Criteria andRoutesubtypeIsNull() {
            addCriterion("RouteSubType is null");
            return (Criteria) this;
        }

        public Criteria andRoutesubtypeIsNotNull() {
            addCriterion("RouteSubType is not null");
            return (Criteria) this;
        }

        public Criteria andRoutesubtypeEqualTo(String value) {
            addCriterion("RouteSubType =", value, "routesubtype");
            return (Criteria) this;
        }

        public Criteria andRoutesubtypeNotEqualTo(String value) {
            addCriterion("RouteSubType <>", value, "routesubtype");
            return (Criteria) this;
        }

        public Criteria andRoutesubtypeGreaterThan(String value) {
            addCriterion("RouteSubType >", value, "routesubtype");
            return (Criteria) this;
        }

        public Criteria andRoutesubtypeGreaterThanOrEqualTo(String value) {
            addCriterion("RouteSubType >=", value, "routesubtype");
            return (Criteria) this;
        }

        public Criteria andRoutesubtypeLessThan(String value) {
            addCriterion("RouteSubType <", value, "routesubtype");
            return (Criteria) this;
        }

        public Criteria andRoutesubtypeLessThanOrEqualTo(String value) {
            addCriterion("RouteSubType <=", value, "routesubtype");
            return (Criteria) this;
        }

        public Criteria andRoutesubtypeLike(String value) {
            addCriterion("RouteSubType like", value, "routesubtype");
            return (Criteria) this;
        }

        public Criteria andRoutesubtypeNotLike(String value) {
            addCriterion("RouteSubType not like", value, "routesubtype");
            return (Criteria) this;
        }

        public Criteria andRoutesubtypeIn(List<String> values) {
            addCriterion("RouteSubType in", values, "routesubtype");
            return (Criteria) this;
        }

        public Criteria andRoutesubtypeNotIn(List<String> values) {
            addCriterion("RouteSubType not in", values, "routesubtype");
            return (Criteria) this;
        }

        public Criteria andRoutesubtypeBetween(String value1, String value2) {
            addCriterion("RouteSubType between", value1, value2, "routesubtype");
            return (Criteria) this;
        }

        public Criteria andRoutesubtypeNotBetween(String value1, String value2) {
            addCriterion("RouteSubType not between", value1, value2, "routesubtype");
            return (Criteria) this;
        }

        public Criteria andRoutesubtypenameIsNull() {
            addCriterion("RouteSubTypeName is null");
            return (Criteria) this;
        }

        public Criteria andRoutesubtypenameIsNotNull() {
            addCriterion("RouteSubTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andRoutesubtypenameEqualTo(String value) {
            addCriterion("RouteSubTypeName =", value, "routesubtypename");
            return (Criteria) this;
        }

        public Criteria andRoutesubtypenameNotEqualTo(String value) {
            addCriterion("RouteSubTypeName <>", value, "routesubtypename");
            return (Criteria) this;
        }

        public Criteria andRoutesubtypenameGreaterThan(String value) {
            addCriterion("RouteSubTypeName >", value, "routesubtypename");
            return (Criteria) this;
        }

        public Criteria andRoutesubtypenameGreaterThanOrEqualTo(String value) {
            addCriterion("RouteSubTypeName >=", value, "routesubtypename");
            return (Criteria) this;
        }

        public Criteria andRoutesubtypenameLessThan(String value) {
            addCriterion("RouteSubTypeName <", value, "routesubtypename");
            return (Criteria) this;
        }

        public Criteria andRoutesubtypenameLessThanOrEqualTo(String value) {
            addCriterion("RouteSubTypeName <=", value, "routesubtypename");
            return (Criteria) this;
        }

        public Criteria andRoutesubtypenameLike(String value) {
            addCriterion("RouteSubTypeName like", value, "routesubtypename");
            return (Criteria) this;
        }

        public Criteria andRoutesubtypenameNotLike(String value) {
            addCriterion("RouteSubTypeName not like", value, "routesubtypename");
            return (Criteria) this;
        }

        public Criteria andRoutesubtypenameIn(List<String> values) {
            addCriterion("RouteSubTypeName in", values, "routesubtypename");
            return (Criteria) this;
        }

        public Criteria andRoutesubtypenameNotIn(List<String> values) {
            addCriterion("RouteSubTypeName not in", values, "routesubtypename");
            return (Criteria) this;
        }

        public Criteria andRoutesubtypenameBetween(String value1, String value2) {
            addCriterion("RouteSubTypeName between", value1, value2, "routesubtypename");
            return (Criteria) this;
        }

        public Criteria andRoutesubtypenameNotBetween(String value1, String value2) {
            addCriterion("RouteSubTypeName not between", value1, value2, "routesubtypename");
            return (Criteria) this;
        }

        public Criteria andChangestatusIsNull() {
            addCriterion("ChangeStatus is null");
            return (Criteria) this;
        }

        public Criteria andChangestatusIsNotNull() {
            addCriterion("ChangeStatus is not null");
            return (Criteria) this;
        }

        public Criteria andChangestatusEqualTo(Integer value) {
            addCriterion("ChangeStatus =", value, "changestatus");
            return (Criteria) this;
        }

        public Criteria andChangestatusNotEqualTo(Integer value) {
            addCriterion("ChangeStatus <>", value, "changestatus");
            return (Criteria) this;
        }

        public Criteria andChangestatusGreaterThan(Integer value) {
            addCriterion("ChangeStatus >", value, "changestatus");
            return (Criteria) this;
        }

        public Criteria andChangestatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("ChangeStatus >=", value, "changestatus");
            return (Criteria) this;
        }

        public Criteria andChangestatusLessThan(Integer value) {
            addCriterion("ChangeStatus <", value, "changestatus");
            return (Criteria) this;
        }

        public Criteria andChangestatusLessThanOrEqualTo(Integer value) {
            addCriterion("ChangeStatus <=", value, "changestatus");
            return (Criteria) this;
        }

        public Criteria andChangestatusIn(List<Integer> values) {
            addCriterion("ChangeStatus in", values, "changestatus");
            return (Criteria) this;
        }

        public Criteria andChangestatusNotIn(List<Integer> values) {
            addCriterion("ChangeStatus not in", values, "changestatus");
            return (Criteria) this;
        }

        public Criteria andChangestatusBetween(Integer value1, Integer value2) {
            addCriterion("ChangeStatus between", value1, value2, "changestatus");
            return (Criteria) this;
        }

        public Criteria andChangestatusNotBetween(Integer value1, Integer value2) {
            addCriterion("ChangeStatus not between", value1, value2, "changestatus");
            return (Criteria) this;
        }

        public Criteria andTeamnatureIsNull() {
            addCriterion("TeamNature is null");
            return (Criteria) this;
        }

        public Criteria andTeamnatureIsNotNull() {
            addCriterion("TeamNature is not null");
            return (Criteria) this;
        }

        public Criteria andTeamnatureEqualTo(String value) {
            addCriterion("TeamNature =", value, "teamnature");
            return (Criteria) this;
        }

        public Criteria andTeamnatureNotEqualTo(String value) {
            addCriterion("TeamNature <>", value, "teamnature");
            return (Criteria) this;
        }

        public Criteria andTeamnatureGreaterThan(String value) {
            addCriterion("TeamNature >", value, "teamnature");
            return (Criteria) this;
        }

        public Criteria andTeamnatureGreaterThanOrEqualTo(String value) {
            addCriterion("TeamNature >=", value, "teamnature");
            return (Criteria) this;
        }

        public Criteria andTeamnatureLessThan(String value) {
            addCriterion("TeamNature <", value, "teamnature");
            return (Criteria) this;
        }

        public Criteria andTeamnatureLessThanOrEqualTo(String value) {
            addCriterion("TeamNature <=", value, "teamnature");
            return (Criteria) this;
        }

        public Criteria andTeamnatureLike(String value) {
            addCriterion("TeamNature like", value, "teamnature");
            return (Criteria) this;
        }

        public Criteria andTeamnatureNotLike(String value) {
            addCriterion("TeamNature not like", value, "teamnature");
            return (Criteria) this;
        }

        public Criteria andTeamnatureIn(List<String> values) {
            addCriterion("TeamNature in", values, "teamnature");
            return (Criteria) this;
        }

        public Criteria andTeamnatureNotIn(List<String> values) {
            addCriterion("TeamNature not in", values, "teamnature");
            return (Criteria) this;
        }

        public Criteria andTeamnatureBetween(String value1, String value2) {
            addCriterion("TeamNature between", value1, value2, "teamnature");
            return (Criteria) this;
        }

        public Criteria andTeamnatureNotBetween(String value1, String value2) {
            addCriterion("TeamNature not between", value1, value2, "teamnature");
            return (Criteria) this;
        }

        public Criteria andIssignedIsNull() {
            addCriterion("IsSigned is null");
            return (Criteria) this;
        }

        public Criteria andIssignedIsNotNull() {
            addCriterion("IsSigned is not null");
            return (Criteria) this;
        }

        public Criteria andIssignedEqualTo(Integer value) {
            addCriterion("IsSigned =", value, "issigned");
            return (Criteria) this;
        }

        public Criteria andIssignedNotEqualTo(Integer value) {
            addCriterion("IsSigned <>", value, "issigned");
            return (Criteria) this;
        }

        public Criteria andIssignedGreaterThan(Integer value) {
            addCriterion("IsSigned >", value, "issigned");
            return (Criteria) this;
        }

        public Criteria andIssignedGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsSigned >=", value, "issigned");
            return (Criteria) this;
        }

        public Criteria andIssignedLessThan(Integer value) {
            addCriterion("IsSigned <", value, "issigned");
            return (Criteria) this;
        }

        public Criteria andIssignedLessThanOrEqualTo(Integer value) {
            addCriterion("IsSigned <=", value, "issigned");
            return (Criteria) this;
        }

        public Criteria andIssignedIn(List<Integer> values) {
            addCriterion("IsSigned in", values, "issigned");
            return (Criteria) this;
        }

        public Criteria andIssignedNotIn(List<Integer> values) {
            addCriterion("IsSigned not in", values, "issigned");
            return (Criteria) this;
        }

        public Criteria andIssignedBetween(Integer value1, Integer value2) {
            addCriterion("IsSigned between", value1, value2, "issigned");
            return (Criteria) this;
        }

        public Criteria andIssignedNotBetween(Integer value1, Integer value2) {
            addCriterion("IsSigned not between", value1, value2, "issigned");
            return (Criteria) this;
        }

        public Criteria andSendtimeIsNull() {
            addCriterion("SendTime is null");
            return (Criteria) this;
        }

        public Criteria andSendtimeIsNotNull() {
            addCriterion("SendTime is not null");
            return (Criteria) this;
        }

        public Criteria andSendtimeEqualTo(Date value) {
            addCriterion("SendTime =", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotEqualTo(Date value) {
            addCriterion("SendTime <>", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeGreaterThan(Date value) {
            addCriterion("SendTime >", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SendTime >=", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeLessThan(Date value) {
            addCriterion("SendTime <", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeLessThanOrEqualTo(Date value) {
            addCriterion("SendTime <=", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeIn(List<Date> values) {
            addCriterion("SendTime in", values, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotIn(List<Date> values) {
            addCriterion("SendTime not in", values, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeBetween(Date value1, Date value2) {
            addCriterion("SendTime between", value1, value2, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotBetween(Date value1, Date value2) {
            addCriterion("SendTime not between", value1, value2, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeIsNull() {
            addCriterion("SignTime is null");
            return (Criteria) this;
        }

        public Criteria andSigntimeIsNotNull() {
            addCriterion("SignTime is not null");
            return (Criteria) this;
        }

        public Criteria andSigntimeEqualTo(Date value) {
            addCriterion("SignTime =", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeNotEqualTo(Date value) {
            addCriterion("SignTime <>", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeGreaterThan(Date value) {
            addCriterion("SignTime >", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SignTime >=", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeLessThan(Date value) {
            addCriterion("SignTime <", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeLessThanOrEqualTo(Date value) {
            addCriterion("SignTime <=", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeIn(List<Date> values) {
            addCriterion("SignTime in", values, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeNotIn(List<Date> values) {
            addCriterion("SignTime not in", values, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeBetween(Date value1, Date value2) {
            addCriterion("SignTime between", value1, value2, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeNotBetween(Date value1, Date value2) {
            addCriterion("SignTime not between", value1, value2, "signtime");
            return (Criteria) this;
        }

        public Criteria andIsshopordermanageIsNull() {
            addCriterion("IsShopOrderManage is null");
            return (Criteria) this;
        }

        public Criteria andIsshopordermanageIsNotNull() {
            addCriterion("IsShopOrderManage is not null");
            return (Criteria) this;
        }

        public Criteria andIsshopordermanageEqualTo(Integer value) {
            addCriterion("IsShopOrderManage =", value, "isshopordermanage");
            return (Criteria) this;
        }

        public Criteria andIsshopordermanageNotEqualTo(Integer value) {
            addCriterion("IsShopOrderManage <>", value, "isshopordermanage");
            return (Criteria) this;
        }

        public Criteria andIsshopordermanageGreaterThan(Integer value) {
            addCriterion("IsShopOrderManage >", value, "isshopordermanage");
            return (Criteria) this;
        }

        public Criteria andIsshopordermanageGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsShopOrderManage >=", value, "isshopordermanage");
            return (Criteria) this;
        }

        public Criteria andIsshopordermanageLessThan(Integer value) {
            addCriterion("IsShopOrderManage <", value, "isshopordermanage");
            return (Criteria) this;
        }

        public Criteria andIsshopordermanageLessThanOrEqualTo(Integer value) {
            addCriterion("IsShopOrderManage <=", value, "isshopordermanage");
            return (Criteria) this;
        }

        public Criteria andIsshopordermanageIn(List<Integer> values) {
            addCriterion("IsShopOrderManage in", values, "isshopordermanage");
            return (Criteria) this;
        }

        public Criteria andIsshopordermanageNotIn(List<Integer> values) {
            addCriterion("IsShopOrderManage not in", values, "isshopordermanage");
            return (Criteria) this;
        }

        public Criteria andIsshopordermanageBetween(Integer value1, Integer value2) {
            addCriterion("IsShopOrderManage between", value1, value2, "isshopordermanage");
            return (Criteria) this;
        }

        public Criteria andIsshopordermanageNotBetween(Integer value1, Integer value2) {
            addCriterion("IsShopOrderManage not between", value1, value2, "isshopordermanage");
            return (Criteria) this;
        }

        public Criteria andProducttypeIsNull() {
            addCriterion("ProductType is null");
            return (Criteria) this;
        }

        public Criteria andProducttypeIsNotNull() {
            addCriterion("ProductType is not null");
            return (Criteria) this;
        }

        public Criteria andProducttypeEqualTo(Integer value) {
            addCriterion("ProductType =", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeNotEqualTo(Integer value) {
            addCriterion("ProductType <>", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeGreaterThan(Integer value) {
            addCriterion("ProductType >", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProductType >=", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeLessThan(Integer value) {
            addCriterion("ProductType <", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeLessThanOrEqualTo(Integer value) {
            addCriterion("ProductType <=", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeIn(List<Integer> values) {
            addCriterion("ProductType in", values, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeNotIn(List<Integer> values) {
            addCriterion("ProductType not in", values, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeBetween(Integer value1, Integer value2) {
            addCriterion("ProductType between", value1, value2, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ProductType not between", value1, value2, "producttype");
            return (Criteria) this;
        }

        public Criteria andRoutedescriptionIsNull() {
            addCriterion("RouteDescription is null");
            return (Criteria) this;
        }

        public Criteria andRoutedescriptionIsNotNull() {
            addCriterion("RouteDescription is not null");
            return (Criteria) this;
        }

        public Criteria andRoutedescriptionEqualTo(String value) {
            addCriterion("RouteDescription =", value, "routedescription");
            return (Criteria) this;
        }

        public Criteria andRoutedescriptionNotEqualTo(String value) {
            addCriterion("RouteDescription <>", value, "routedescription");
            return (Criteria) this;
        }

        public Criteria andRoutedescriptionGreaterThan(String value) {
            addCriterion("RouteDescription >", value, "routedescription");
            return (Criteria) this;
        }

        public Criteria andRoutedescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("RouteDescription >=", value, "routedescription");
            return (Criteria) this;
        }

        public Criteria andRoutedescriptionLessThan(String value) {
            addCriterion("RouteDescription <", value, "routedescription");
            return (Criteria) this;
        }

        public Criteria andRoutedescriptionLessThanOrEqualTo(String value) {
            addCriterion("RouteDescription <=", value, "routedescription");
            return (Criteria) this;
        }

        public Criteria andRoutedescriptionLike(String value) {
            addCriterion("RouteDescription like", value, "routedescription");
            return (Criteria) this;
        }

        public Criteria andRoutedescriptionNotLike(String value) {
            addCriterion("RouteDescription not like", value, "routedescription");
            return (Criteria) this;
        }

        public Criteria andRoutedescriptionIn(List<String> values) {
            addCriterion("RouteDescription in", values, "routedescription");
            return (Criteria) this;
        }

        public Criteria andRoutedescriptionNotIn(List<String> values) {
            addCriterion("RouteDescription not in", values, "routedescription");
            return (Criteria) this;
        }

        public Criteria andRoutedescriptionBetween(String value1, String value2) {
            addCriterion("RouteDescription between", value1, value2, "routedescription");
            return (Criteria) this;
        }

        public Criteria andRoutedescriptionNotBetween(String value1, String value2) {
            addCriterion("RouteDescription not between", value1, value2, "routedescription");
            return (Criteria) this;
        }

        public Criteria andNewcategoryIsNull() {
            addCriterion("NewCategory is null");
            return (Criteria) this;
        }

        public Criteria andNewcategoryIsNotNull() {
            addCriterion("NewCategory is not null");
            return (Criteria) this;
        }

        public Criteria andNewcategoryEqualTo(Integer value) {
            addCriterion("NewCategory =", value, "newcategory");
            return (Criteria) this;
        }

        public Criteria andNewcategoryNotEqualTo(Integer value) {
            addCriterion("NewCategory <>", value, "newcategory");
            return (Criteria) this;
        }

        public Criteria andNewcategoryGreaterThan(Integer value) {
            addCriterion("NewCategory >", value, "newcategory");
            return (Criteria) this;
        }

        public Criteria andNewcategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("NewCategory >=", value, "newcategory");
            return (Criteria) this;
        }

        public Criteria andNewcategoryLessThan(Integer value) {
            addCriterion("NewCategory <", value, "newcategory");
            return (Criteria) this;
        }

        public Criteria andNewcategoryLessThanOrEqualTo(Integer value) {
            addCriterion("NewCategory <=", value, "newcategory");
            return (Criteria) this;
        }

        public Criteria andNewcategoryIn(List<Integer> values) {
            addCriterion("NewCategory in", values, "newcategory");
            return (Criteria) this;
        }

        public Criteria andNewcategoryNotIn(List<Integer> values) {
            addCriterion("NewCategory not in", values, "newcategory");
            return (Criteria) this;
        }

        public Criteria andNewcategoryBetween(Integer value1, Integer value2) {
            addCriterion("NewCategory between", value1, value2, "newcategory");
            return (Criteria) this;
        }

        public Criteria andNewcategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("NewCategory not between", value1, value2, "newcategory");
            return (Criteria) this;
        }

        public Criteria andNewsigntypeIsNull() {
            addCriterion("NewSignType is null");
            return (Criteria) this;
        }

        public Criteria andNewsigntypeIsNotNull() {
            addCriterion("NewSignType is not null");
            return (Criteria) this;
        }

        public Criteria andNewsigntypeEqualTo(Integer value) {
            addCriterion("NewSignType =", value, "newsigntype");
            return (Criteria) this;
        }

        public Criteria andNewsigntypeNotEqualTo(Integer value) {
            addCriterion("NewSignType <>", value, "newsigntype");
            return (Criteria) this;
        }

        public Criteria andNewsigntypeGreaterThan(Integer value) {
            addCriterion("NewSignType >", value, "newsigntype");
            return (Criteria) this;
        }

        public Criteria andNewsigntypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("NewSignType >=", value, "newsigntype");
            return (Criteria) this;
        }

        public Criteria andNewsigntypeLessThan(Integer value) {
            addCriterion("NewSignType <", value, "newsigntype");
            return (Criteria) this;
        }

        public Criteria andNewsigntypeLessThanOrEqualTo(Integer value) {
            addCriterion("NewSignType <=", value, "newsigntype");
            return (Criteria) this;
        }

        public Criteria andNewsigntypeIn(List<Integer> values) {
            addCriterion("NewSignType in", values, "newsigntype");
            return (Criteria) this;
        }

        public Criteria andNewsigntypeNotIn(List<Integer> values) {
            addCriterion("NewSignType not in", values, "newsigntype");
            return (Criteria) this;
        }

        public Criteria andNewsigntypeBetween(Integer value1, Integer value2) {
            addCriterion("NewSignType between", value1, value2, "newsigntype");
            return (Criteria) this;
        }

        public Criteria andNewsigntypeNotBetween(Integer value1, Integer value2) {
            addCriterion("NewSignType not between", value1, value2, "newsigntype");
            return (Criteria) this;
        }

        public Criteria andNewticketstatusIsNull() {
            addCriterion("NewTicketStatus is null");
            return (Criteria) this;
        }

        public Criteria andNewticketstatusIsNotNull() {
            addCriterion("NewTicketStatus is not null");
            return (Criteria) this;
        }

        public Criteria andNewticketstatusEqualTo(Integer value) {
            addCriterion("NewTicketStatus =", value, "newticketstatus");
            return (Criteria) this;
        }

        public Criteria andNewticketstatusNotEqualTo(Integer value) {
            addCriterion("NewTicketStatus <>", value, "newticketstatus");
            return (Criteria) this;
        }

        public Criteria andNewticketstatusGreaterThan(Integer value) {
            addCriterion("NewTicketStatus >", value, "newticketstatus");
            return (Criteria) this;
        }

        public Criteria andNewticketstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("NewTicketStatus >=", value, "newticketstatus");
            return (Criteria) this;
        }

        public Criteria andNewticketstatusLessThan(Integer value) {
            addCriterion("NewTicketStatus <", value, "newticketstatus");
            return (Criteria) this;
        }

        public Criteria andNewticketstatusLessThanOrEqualTo(Integer value) {
            addCriterion("NewTicketStatus <=", value, "newticketstatus");
            return (Criteria) this;
        }

        public Criteria andNewticketstatusIn(List<Integer> values) {
            addCriterion("NewTicketStatus in", values, "newticketstatus");
            return (Criteria) this;
        }

        public Criteria andNewticketstatusNotIn(List<Integer> values) {
            addCriterion("NewTicketStatus not in", values, "newticketstatus");
            return (Criteria) this;
        }

        public Criteria andNewticketstatusBetween(Integer value1, Integer value2) {
            addCriterion("NewTicketStatus between", value1, value2, "newticketstatus");
            return (Criteria) this;
        }

        public Criteria andNewticketstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("NewTicketStatus not between", value1, value2, "newticketstatus");
            return (Criteria) this;
        }

        public Criteria andNewticketfinastatusIsNull() {
            addCriterion("NewTicketFinaStatus is null");
            return (Criteria) this;
        }

        public Criteria andNewticketfinastatusIsNotNull() {
            addCriterion("NewTicketFinaStatus is not null");
            return (Criteria) this;
        }

        public Criteria andNewticketfinastatusEqualTo(Integer value) {
            addCriterion("NewTicketFinaStatus =", value, "newticketfinastatus");
            return (Criteria) this;
        }

        public Criteria andNewticketfinastatusNotEqualTo(Integer value) {
            addCriterion("NewTicketFinaStatus <>", value, "newticketfinastatus");
            return (Criteria) this;
        }

        public Criteria andNewticketfinastatusGreaterThan(Integer value) {
            addCriterion("NewTicketFinaStatus >", value, "newticketfinastatus");
            return (Criteria) this;
        }

        public Criteria andNewticketfinastatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("NewTicketFinaStatus >=", value, "newticketfinastatus");
            return (Criteria) this;
        }

        public Criteria andNewticketfinastatusLessThan(Integer value) {
            addCriterion("NewTicketFinaStatus <", value, "newticketfinastatus");
            return (Criteria) this;
        }

        public Criteria andNewticketfinastatusLessThanOrEqualTo(Integer value) {
            addCriterion("NewTicketFinaStatus <=", value, "newticketfinastatus");
            return (Criteria) this;
        }

        public Criteria andNewticketfinastatusIn(List<Integer> values) {
            addCriterion("NewTicketFinaStatus in", values, "newticketfinastatus");
            return (Criteria) this;
        }

        public Criteria andNewticketfinastatusNotIn(List<Integer> values) {
            addCriterion("NewTicketFinaStatus not in", values, "newticketfinastatus");
            return (Criteria) this;
        }

        public Criteria andNewticketfinastatusBetween(Integer value1, Integer value2) {
            addCriterion("NewTicketFinaStatus between", value1, value2, "newticketfinastatus");
            return (Criteria) this;
        }

        public Criteria andNewticketfinastatusNotBetween(Integer value1, Integer value2) {
            addCriterion("NewTicketFinaStatus not between", value1, value2, "newticketfinastatus");
            return (Criteria) this;
        }

        public Criteria andNeworderchangetypeIsNull() {
            addCriterion("NewOrderChangeType is null");
            return (Criteria) this;
        }

        public Criteria andNeworderchangetypeIsNotNull() {
            addCriterion("NewOrderChangeType is not null");
            return (Criteria) this;
        }

        public Criteria andNeworderchangetypeEqualTo(Integer value) {
            addCriterion("NewOrderChangeType =", value, "neworderchangetype");
            return (Criteria) this;
        }

        public Criteria andNeworderchangetypeNotEqualTo(Integer value) {
            addCriterion("NewOrderChangeType <>", value, "neworderchangetype");
            return (Criteria) this;
        }

        public Criteria andNeworderchangetypeGreaterThan(Integer value) {
            addCriterion("NewOrderChangeType >", value, "neworderchangetype");
            return (Criteria) this;
        }

        public Criteria andNeworderchangetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("NewOrderChangeType >=", value, "neworderchangetype");
            return (Criteria) this;
        }

        public Criteria andNeworderchangetypeLessThan(Integer value) {
            addCriterion("NewOrderChangeType <", value, "neworderchangetype");
            return (Criteria) this;
        }

        public Criteria andNeworderchangetypeLessThanOrEqualTo(Integer value) {
            addCriterion("NewOrderChangeType <=", value, "neworderchangetype");
            return (Criteria) this;
        }

        public Criteria andNeworderchangetypeIn(List<Integer> values) {
            addCriterion("NewOrderChangeType in", values, "neworderchangetype");
            return (Criteria) this;
        }

        public Criteria andNeworderchangetypeNotIn(List<Integer> values) {
            addCriterion("NewOrderChangeType not in", values, "neworderchangetype");
            return (Criteria) this;
        }

        public Criteria andNeworderchangetypeBetween(Integer value1, Integer value2) {
            addCriterion("NewOrderChangeType between", value1, value2, "neworderchangetype");
            return (Criteria) this;
        }

        public Criteria andNeworderchangetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("NewOrderChangeType not between", value1, value2, "neworderchangetype");
            return (Criteria) this;
        }

        public Criteria andNeworderchangestatusIsNull() {
            addCriterion("NewOrderChangeStatus is null");
            return (Criteria) this;
        }

        public Criteria andNeworderchangestatusIsNotNull() {
            addCriterion("NewOrderChangeStatus is not null");
            return (Criteria) this;
        }

        public Criteria andNeworderchangestatusEqualTo(Integer value) {
            addCriterion("NewOrderChangeStatus =", value, "neworderchangestatus");
            return (Criteria) this;
        }

        public Criteria andNeworderchangestatusNotEqualTo(Integer value) {
            addCriterion("NewOrderChangeStatus <>", value, "neworderchangestatus");
            return (Criteria) this;
        }

        public Criteria andNeworderchangestatusGreaterThan(Integer value) {
            addCriterion("NewOrderChangeStatus >", value, "neworderchangestatus");
            return (Criteria) this;
        }

        public Criteria andNeworderchangestatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("NewOrderChangeStatus >=", value, "neworderchangestatus");
            return (Criteria) this;
        }

        public Criteria andNeworderchangestatusLessThan(Integer value) {
            addCriterion("NewOrderChangeStatus <", value, "neworderchangestatus");
            return (Criteria) this;
        }

        public Criteria andNeworderchangestatusLessThanOrEqualTo(Integer value) {
            addCriterion("NewOrderChangeStatus <=", value, "neworderchangestatus");
            return (Criteria) this;
        }

        public Criteria andNeworderchangestatusIn(List<Integer> values) {
            addCriterion("NewOrderChangeStatus in", values, "neworderchangestatus");
            return (Criteria) this;
        }

        public Criteria andNeworderchangestatusNotIn(List<Integer> values) {
            addCriterion("NewOrderChangeStatus not in", values, "neworderchangestatus");
            return (Criteria) this;
        }

        public Criteria andNeworderchangestatusBetween(Integer value1, Integer value2) {
            addCriterion("NewOrderChangeStatus between", value1, value2, "neworderchangestatus");
            return (Criteria) this;
        }

        public Criteria andNeworderchangestatusNotBetween(Integer value1, Integer value2) {
            addCriterion("NewOrderChangeStatus not between", value1, value2, "neworderchangestatus");
            return (Criteria) this;
        }

        public Criteria andNewflagIsNull() {
            addCriterion("NewFlag is null");
            return (Criteria) this;
        }

        public Criteria andNewflagIsNotNull() {
            addCriterion("NewFlag is not null");
            return (Criteria) this;
        }

        public Criteria andNewflagEqualTo(Integer value) {
            addCriterion("NewFlag =", value, "newflag");
            return (Criteria) this;
        }

        public Criteria andNewflagNotEqualTo(Integer value) {
            addCriterion("NewFlag <>", value, "newflag");
            return (Criteria) this;
        }

        public Criteria andNewflagGreaterThan(Integer value) {
            addCriterion("NewFlag >", value, "newflag");
            return (Criteria) this;
        }

        public Criteria andNewflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("NewFlag >=", value, "newflag");
            return (Criteria) this;
        }

        public Criteria andNewflagLessThan(Integer value) {
            addCriterion("NewFlag <", value, "newflag");
            return (Criteria) this;
        }

        public Criteria andNewflagLessThanOrEqualTo(Integer value) {
            addCriterion("NewFlag <=", value, "newflag");
            return (Criteria) this;
        }

        public Criteria andNewflagIn(List<Integer> values) {
            addCriterion("NewFlag in", values, "newflag");
            return (Criteria) this;
        }

        public Criteria andNewflagNotIn(List<Integer> values) {
            addCriterion("NewFlag not in", values, "newflag");
            return (Criteria) this;
        }

        public Criteria andNewflagBetween(Integer value1, Integer value2) {
            addCriterion("NewFlag between", value1, value2, "newflag");
            return (Criteria) this;
        }

        public Criteria andNewflagNotBetween(Integer value1, Integer value2) {
            addCriterion("NewFlag not between", value1, value2, "newflag");
            return (Criteria) this;
        }

        public Criteria andNeworderstatusIsNull() {
            addCriterion("NewOrderStatus is null");
            return (Criteria) this;
        }

        public Criteria andNeworderstatusIsNotNull() {
            addCriterion("NewOrderStatus is not null");
            return (Criteria) this;
        }

        public Criteria andNeworderstatusEqualTo(Integer value) {
            addCriterion("NewOrderStatus =", value, "neworderstatus");
            return (Criteria) this;
        }

        public Criteria andNeworderstatusNotEqualTo(Integer value) {
            addCriterion("NewOrderStatus <>", value, "neworderstatus");
            return (Criteria) this;
        }

        public Criteria andNeworderstatusGreaterThan(Integer value) {
            addCriterion("NewOrderStatus >", value, "neworderstatus");
            return (Criteria) this;
        }

        public Criteria andNeworderstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("NewOrderStatus >=", value, "neworderstatus");
            return (Criteria) this;
        }

        public Criteria andNeworderstatusLessThan(Integer value) {
            addCriterion("NewOrderStatus <", value, "neworderstatus");
            return (Criteria) this;
        }

        public Criteria andNeworderstatusLessThanOrEqualTo(Integer value) {
            addCriterion("NewOrderStatus <=", value, "neworderstatus");
            return (Criteria) this;
        }

        public Criteria andNeworderstatusIn(List<Integer> values) {
            addCriterion("NewOrderStatus in", values, "neworderstatus");
            return (Criteria) this;
        }

        public Criteria andNeworderstatusNotIn(List<Integer> values) {
            addCriterion("NewOrderStatus not in", values, "neworderstatus");
            return (Criteria) this;
        }

        public Criteria andNeworderstatusBetween(Integer value1, Integer value2) {
            addCriterion("NewOrderStatus between", value1, value2, "neworderstatus");
            return (Criteria) this;
        }

        public Criteria andNeworderstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("NewOrderStatus not between", value1, value2, "neworderstatus");
            return (Criteria) this;
        }

        public Criteria andNeworderadjuststatusIsNull() {
            addCriterion("NewOrderAdjustStatus is null");
            return (Criteria) this;
        }

        public Criteria andNeworderadjuststatusIsNotNull() {
            addCriterion("NewOrderAdjustStatus is not null");
            return (Criteria) this;
        }

        public Criteria andNeworderadjuststatusEqualTo(Integer value) {
            addCriterion("NewOrderAdjustStatus =", value, "neworderadjuststatus");
            return (Criteria) this;
        }

        public Criteria andNeworderadjuststatusNotEqualTo(Integer value) {
            addCriterion("NewOrderAdjustStatus <>", value, "neworderadjuststatus");
            return (Criteria) this;
        }

        public Criteria andNeworderadjuststatusGreaterThan(Integer value) {
            addCriterion("NewOrderAdjustStatus >", value, "neworderadjuststatus");
            return (Criteria) this;
        }

        public Criteria andNeworderadjuststatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("NewOrderAdjustStatus >=", value, "neworderadjuststatus");
            return (Criteria) this;
        }

        public Criteria andNeworderadjuststatusLessThan(Integer value) {
            addCriterion("NewOrderAdjustStatus <", value, "neworderadjuststatus");
            return (Criteria) this;
        }

        public Criteria andNeworderadjuststatusLessThanOrEqualTo(Integer value) {
            addCriterion("NewOrderAdjustStatus <=", value, "neworderadjuststatus");
            return (Criteria) this;
        }

        public Criteria andNeworderadjuststatusIn(List<Integer> values) {
            addCriterion("NewOrderAdjustStatus in", values, "neworderadjuststatus");
            return (Criteria) this;
        }

        public Criteria andNeworderadjuststatusNotIn(List<Integer> values) {
            addCriterion("NewOrderAdjustStatus not in", values, "neworderadjuststatus");
            return (Criteria) this;
        }

        public Criteria andNeworderadjuststatusBetween(Integer value1, Integer value2) {
            addCriterion("NewOrderAdjustStatus between", value1, value2, "neworderadjuststatus");
            return (Criteria) this;
        }

        public Criteria andNeworderadjuststatusNotBetween(Integer value1, Integer value2) {
            addCriterion("NewOrderAdjustStatus not between", value1, value2, "neworderadjuststatus");
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