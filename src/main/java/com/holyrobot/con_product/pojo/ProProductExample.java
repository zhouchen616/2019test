package com.holyrobot.con_product.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProProductExample() {
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

        public Criteria andProcategoryidIsNull() {
            addCriterion("ProCategoryID is null");
            return (Criteria) this;
        }

        public Criteria andProcategoryidIsNotNull() {
            addCriterion("ProCategoryID is not null");
            return (Criteria) this;
        }

        public Criteria andProcategoryidEqualTo(String value) {
            addCriterion("ProCategoryID =", value, "procategoryid");
            return (Criteria) this;
        }

        public Criteria andProcategoryidNotEqualTo(String value) {
            addCriterion("ProCategoryID <>", value, "procategoryid");
            return (Criteria) this;
        }

        public Criteria andProcategoryidGreaterThan(String value) {
            addCriterion("ProCategoryID >", value, "procategoryid");
            return (Criteria) this;
        }

        public Criteria andProcategoryidGreaterThanOrEqualTo(String value) {
            addCriterion("ProCategoryID >=", value, "procategoryid");
            return (Criteria) this;
        }

        public Criteria andProcategoryidLessThan(String value) {
            addCriterion("ProCategoryID <", value, "procategoryid");
            return (Criteria) this;
        }

        public Criteria andProcategoryidLessThanOrEqualTo(String value) {
            addCriterion("ProCategoryID <=", value, "procategoryid");
            return (Criteria) this;
        }

        public Criteria andProcategoryidLike(String value) {
            addCriterion("ProCategoryID like", value, "procategoryid");
            return (Criteria) this;
        }

        public Criteria andProcategoryidNotLike(String value) {
            addCriterion("ProCategoryID not like", value, "procategoryid");
            return (Criteria) this;
        }

        public Criteria andProcategoryidIn(List<String> values) {
            addCriterion("ProCategoryID in", values, "procategoryid");
            return (Criteria) this;
        }

        public Criteria andProcategoryidNotIn(List<String> values) {
            addCriterion("ProCategoryID not in", values, "procategoryid");
            return (Criteria) this;
        }

        public Criteria andProcategoryidBetween(String value1, String value2) {
            addCriterion("ProCategoryID between", value1, value2, "procategoryid");
            return (Criteria) this;
        }

        public Criteria andProcategoryidNotBetween(String value1, String value2) {
            addCriterion("ProCategoryID not between", value1, value2, "procategoryid");
            return (Criteria) this;
        }

        public Criteria andProcategoryIsNull() {
            addCriterion("ProCategory is null");
            return (Criteria) this;
        }

        public Criteria andProcategoryIsNotNull() {
            addCriterion("ProCategory is not null");
            return (Criteria) this;
        }

        public Criteria andProcategoryEqualTo(String value) {
            addCriterion("ProCategory =", value, "procategory");
            return (Criteria) this;
        }

        public Criteria andProcategoryNotEqualTo(String value) {
            addCriterion("ProCategory <>", value, "procategory");
            return (Criteria) this;
        }

        public Criteria andProcategoryGreaterThan(String value) {
            addCriterion("ProCategory >", value, "procategory");
            return (Criteria) this;
        }

        public Criteria andProcategoryGreaterThanOrEqualTo(String value) {
            addCriterion("ProCategory >=", value, "procategory");
            return (Criteria) this;
        }

        public Criteria andProcategoryLessThan(String value) {
            addCriterion("ProCategory <", value, "procategory");
            return (Criteria) this;
        }

        public Criteria andProcategoryLessThanOrEqualTo(String value) {
            addCriterion("ProCategory <=", value, "procategory");
            return (Criteria) this;
        }

        public Criteria andProcategoryLike(String value) {
            addCriterion("ProCategory like", value, "procategory");
            return (Criteria) this;
        }

        public Criteria andProcategoryNotLike(String value) {
            addCriterion("ProCategory not like", value, "procategory");
            return (Criteria) this;
        }

        public Criteria andProcategoryIn(List<String> values) {
            addCriterion("ProCategory in", values, "procategory");
            return (Criteria) this;
        }

        public Criteria andProcategoryNotIn(List<String> values) {
            addCriterion("ProCategory not in", values, "procategory");
            return (Criteria) this;
        }

        public Criteria andProcategoryBetween(String value1, String value2) {
            addCriterion("ProCategory between", value1, value2, "procategory");
            return (Criteria) this;
        }

        public Criteria andProcategoryNotBetween(String value1, String value2) {
            addCriterion("ProCategory not between", value1, value2, "procategory");
            return (Criteria) this;
        }

        public Criteria andPronameIsNull() {
            addCriterion("ProName is null");
            return (Criteria) this;
        }

        public Criteria andPronameIsNotNull() {
            addCriterion("ProName is not null");
            return (Criteria) this;
        }

        public Criteria andPronameEqualTo(String value) {
            addCriterion("ProName =", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotEqualTo(String value) {
            addCriterion("ProName <>", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameGreaterThan(String value) {
            addCriterion("ProName >", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameGreaterThanOrEqualTo(String value) {
            addCriterion("ProName >=", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLessThan(String value) {
            addCriterion("ProName <", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLessThanOrEqualTo(String value) {
            addCriterion("ProName <=", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLike(String value) {
            addCriterion("ProName like", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotLike(String value) {
            addCriterion("ProName not like", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameIn(List<String> values) {
            addCriterion("ProName in", values, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotIn(List<String> values) {
            addCriterion("ProName not in", values, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameBetween(String value1, String value2) {
            addCriterion("ProName between", value1, value2, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotBetween(String value1, String value2) {
            addCriterion("ProName not between", value1, value2, "proname");
            return (Criteria) this;
        }

        public Criteria andAliasenameIsNull() {
            addCriterion("AliaseName is null");
            return (Criteria) this;
        }

        public Criteria andAliasenameIsNotNull() {
            addCriterion("AliaseName is not null");
            return (Criteria) this;
        }

        public Criteria andAliasenameEqualTo(String value) {
            addCriterion("AliaseName =", value, "aliasename");
            return (Criteria) this;
        }

        public Criteria andAliasenameNotEqualTo(String value) {
            addCriterion("AliaseName <>", value, "aliasename");
            return (Criteria) this;
        }

        public Criteria andAliasenameGreaterThan(String value) {
            addCriterion("AliaseName >", value, "aliasename");
            return (Criteria) this;
        }

        public Criteria andAliasenameGreaterThanOrEqualTo(String value) {
            addCriterion("AliaseName >=", value, "aliasename");
            return (Criteria) this;
        }

        public Criteria andAliasenameLessThan(String value) {
            addCriterion("AliaseName <", value, "aliasename");
            return (Criteria) this;
        }

        public Criteria andAliasenameLessThanOrEqualTo(String value) {
            addCriterion("AliaseName <=", value, "aliasename");
            return (Criteria) this;
        }

        public Criteria andAliasenameLike(String value) {
            addCriterion("AliaseName like", value, "aliasename");
            return (Criteria) this;
        }

        public Criteria andAliasenameNotLike(String value) {
            addCriterion("AliaseName not like", value, "aliasename");
            return (Criteria) this;
        }

        public Criteria andAliasenameIn(List<String> values) {
            addCriterion("AliaseName in", values, "aliasename");
            return (Criteria) this;
        }

        public Criteria andAliasenameNotIn(List<String> values) {
            addCriterion("AliaseName not in", values, "aliasename");
            return (Criteria) this;
        }

        public Criteria andAliasenameBetween(String value1, String value2) {
            addCriterion("AliaseName between", value1, value2, "aliasename");
            return (Criteria) this;
        }

        public Criteria andAliasenameNotBetween(String value1, String value2) {
            addCriterion("AliaseName not between", value1, value2, "aliasename");
            return (Criteria) this;
        }

        public Criteria andPronoIsNull() {
            addCriterion("ProNo is null");
            return (Criteria) this;
        }

        public Criteria andPronoIsNotNull() {
            addCriterion("ProNo is not null");
            return (Criteria) this;
        }

        public Criteria andPronoEqualTo(String value) {
            addCriterion("ProNo =", value, "prono");
            return (Criteria) this;
        }

        public Criteria andPronoNotEqualTo(String value) {
            addCriterion("ProNo <>", value, "prono");
            return (Criteria) this;
        }

        public Criteria andPronoGreaterThan(String value) {
            addCriterion("ProNo >", value, "prono");
            return (Criteria) this;
        }

        public Criteria andPronoGreaterThanOrEqualTo(String value) {
            addCriterion("ProNo >=", value, "prono");
            return (Criteria) this;
        }

        public Criteria andPronoLessThan(String value) {
            addCriterion("ProNo <", value, "prono");
            return (Criteria) this;
        }

        public Criteria andPronoLessThanOrEqualTo(String value) {
            addCriterion("ProNo <=", value, "prono");
            return (Criteria) this;
        }

        public Criteria andPronoLike(String value) {
            addCriterion("ProNo like", value, "prono");
            return (Criteria) this;
        }

        public Criteria andPronoNotLike(String value) {
            addCriterion("ProNo not like", value, "prono");
            return (Criteria) this;
        }

        public Criteria andPronoIn(List<String> values) {
            addCriterion("ProNo in", values, "prono");
            return (Criteria) this;
        }

        public Criteria andPronoNotIn(List<String> values) {
            addCriterion("ProNo not in", values, "prono");
            return (Criteria) this;
        }

        public Criteria andPronoBetween(String value1, String value2) {
            addCriterion("ProNo between", value1, value2, "prono");
            return (Criteria) this;
        }

        public Criteria andPronoNotBetween(String value1, String value2) {
            addCriterion("ProNo not between", value1, value2, "prono");
            return (Criteria) this;
        }

        public Criteria andTourdaysIsNull() {
            addCriterion("TourDays is null");
            return (Criteria) this;
        }

        public Criteria andTourdaysIsNotNull() {
            addCriterion("TourDays is not null");
            return (Criteria) this;
        }

        public Criteria andTourdaysEqualTo(Integer value) {
            addCriterion("TourDays =", value, "tourdays");
            return (Criteria) this;
        }

        public Criteria andTourdaysNotEqualTo(Integer value) {
            addCriterion("TourDays <>", value, "tourdays");
            return (Criteria) this;
        }

        public Criteria andTourdaysGreaterThan(Integer value) {
            addCriterion("TourDays >", value, "tourdays");
            return (Criteria) this;
        }

        public Criteria andTourdaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("TourDays >=", value, "tourdays");
            return (Criteria) this;
        }

        public Criteria andTourdaysLessThan(Integer value) {
            addCriterion("TourDays <", value, "tourdays");
            return (Criteria) this;
        }

        public Criteria andTourdaysLessThanOrEqualTo(Integer value) {
            addCriterion("TourDays <=", value, "tourdays");
            return (Criteria) this;
        }

        public Criteria andTourdaysIn(List<Integer> values) {
            addCriterion("TourDays in", values, "tourdays");
            return (Criteria) this;
        }

        public Criteria andTourdaysNotIn(List<Integer> values) {
            addCriterion("TourDays not in", values, "tourdays");
            return (Criteria) this;
        }

        public Criteria andTourdaysBetween(Integer value1, Integer value2) {
            addCriterion("TourDays between", value1, value2, "tourdays");
            return (Criteria) this;
        }

        public Criteria andTourdaysNotBetween(Integer value1, Integer value2) {
            addCriterion("TourDays not between", value1, value2, "tourdays");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("StartDate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("StartDate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterion("StartDate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterion("StartDate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterion("StartDate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("StartDate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterion("StartDate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterion("StartDate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterion("StartDate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterion("StartDate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterion("StartDate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterion("StartDate not between", value1, value2, "startdate");
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
            addCriterion("DueDate =", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateNotEqualTo(Date value) {
            addCriterion("DueDate <>", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateGreaterThan(Date value) {
            addCriterion("DueDate >", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateGreaterThanOrEqualTo(Date value) {
            addCriterion("DueDate >=", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateLessThan(Date value) {
            addCriterion("DueDate <", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateLessThanOrEqualTo(Date value) {
            addCriterion("DueDate <=", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateIn(List<Date> values) {
            addCriterion("DueDate in", values, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateNotIn(List<Date> values) {
            addCriterion("DueDate not in", values, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateBetween(Date value1, Date value2) {
            addCriterion("DueDate between", value1, value2, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateNotBetween(Date value1, Date value2) {
            addCriterion("DueDate not between", value1, value2, "duedate");
            return (Criteria) this;
        }

        public Criteria andDepartureIsNull() {
            addCriterion("Departure is null");
            return (Criteria) this;
        }

        public Criteria andDepartureIsNotNull() {
            addCriterion("Departure is not null");
            return (Criteria) this;
        }

        public Criteria andDepartureEqualTo(String value) {
            addCriterion("Departure =", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureNotEqualTo(String value) {
            addCriterion("Departure <>", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureGreaterThan(String value) {
            addCriterion("Departure >", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureGreaterThanOrEqualTo(String value) {
            addCriterion("Departure >=", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureLessThan(String value) {
            addCriterion("Departure <", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureLessThanOrEqualTo(String value) {
            addCriterion("Departure <=", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureLike(String value) {
            addCriterion("Departure like", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureNotLike(String value) {
            addCriterion("Departure not like", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureIn(List<String> values) {
            addCriterion("Departure in", values, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureNotIn(List<String> values) {
            addCriterion("Departure not in", values, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureBetween(String value1, String value2) {
            addCriterion("Departure between", value1, value2, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureNotBetween(String value1, String value2) {
            addCriterion("Departure not between", value1, value2, "departure");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNull() {
            addCriterion("Destination is null");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNotNull() {
            addCriterion("Destination is not null");
            return (Criteria) this;
        }

        public Criteria andDestinationEqualTo(String value) {
            addCriterion("Destination =", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotEqualTo(String value) {
            addCriterion("Destination <>", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThan(String value) {
            addCriterion("Destination >", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThanOrEqualTo(String value) {
            addCriterion("Destination >=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThan(String value) {
            addCriterion("Destination <", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThanOrEqualTo(String value) {
            addCriterion("Destination <=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLike(String value) {
            addCriterion("Destination like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotLike(String value) {
            addCriterion("Destination not like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationIn(List<String> values) {
            addCriterion("Destination in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotIn(List<String> values) {
            addCriterion("Destination not in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationBetween(String value1, String value2) {
            addCriterion("Destination between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotBetween(String value1, String value2) {
            addCriterion("Destination not between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andProtagIsNull() {
            addCriterion("ProTag is null");
            return (Criteria) this;
        }

        public Criteria andProtagIsNotNull() {
            addCriterion("ProTag is not null");
            return (Criteria) this;
        }

        public Criteria andProtagEqualTo(String value) {
            addCriterion("ProTag =", value, "protag");
            return (Criteria) this;
        }

        public Criteria andProtagNotEqualTo(String value) {
            addCriterion("ProTag <>", value, "protag");
            return (Criteria) this;
        }

        public Criteria andProtagGreaterThan(String value) {
            addCriterion("ProTag >", value, "protag");
            return (Criteria) this;
        }

        public Criteria andProtagGreaterThanOrEqualTo(String value) {
            addCriterion("ProTag >=", value, "protag");
            return (Criteria) this;
        }

        public Criteria andProtagLessThan(String value) {
            addCriterion("ProTag <", value, "protag");
            return (Criteria) this;
        }

        public Criteria andProtagLessThanOrEqualTo(String value) {
            addCriterion("ProTag <=", value, "protag");
            return (Criteria) this;
        }

        public Criteria andProtagLike(String value) {
            addCriterion("ProTag like", value, "protag");
            return (Criteria) this;
        }

        public Criteria andProtagNotLike(String value) {
            addCriterion("ProTag not like", value, "protag");
            return (Criteria) this;
        }

        public Criteria andProtagIn(List<String> values) {
            addCriterion("ProTag in", values, "protag");
            return (Criteria) this;
        }

        public Criteria andProtagNotIn(List<String> values) {
            addCriterion("ProTag not in", values, "protag");
            return (Criteria) this;
        }

        public Criteria andProtagBetween(String value1, String value2) {
            addCriterion("ProTag between", value1, value2, "protag");
            return (Criteria) this;
        }

        public Criteria andProtagNotBetween(String value1, String value2) {
            addCriterion("ProTag not between", value1, value2, "protag");
            return (Criteria) this;
        }

        public Criteria andFeatureIsNull() {
            addCriterion("Feature is null");
            return (Criteria) this;
        }

        public Criteria andFeatureIsNotNull() {
            addCriterion("Feature is not null");
            return (Criteria) this;
        }

        public Criteria andFeatureEqualTo(String value) {
            addCriterion("Feature =", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureNotEqualTo(String value) {
            addCriterion("Feature <>", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureGreaterThan(String value) {
            addCriterion("Feature >", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureGreaterThanOrEqualTo(String value) {
            addCriterion("Feature >=", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureLessThan(String value) {
            addCriterion("Feature <", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureLessThanOrEqualTo(String value) {
            addCriterion("Feature <=", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureLike(String value) {
            addCriterion("Feature like", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureNotLike(String value) {
            addCriterion("Feature not like", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureIn(List<String> values) {
            addCriterion("Feature in", values, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureNotIn(List<String> values) {
            addCriterion("Feature not in", values, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureBetween(String value1, String value2) {
            addCriterion("Feature between", value1, value2, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureNotBetween(String value1, String value2) {
            addCriterion("Feature not between", value1, value2, "feature");
            return (Criteria) this;
        }

        public Criteria andFeeincludesIsNull() {
            addCriterion("FeeIncludes is null");
            return (Criteria) this;
        }

        public Criteria andFeeincludesIsNotNull() {
            addCriterion("FeeIncludes is not null");
            return (Criteria) this;
        }

        public Criteria andFeeincludesEqualTo(String value) {
            addCriterion("FeeIncludes =", value, "feeincludes");
            return (Criteria) this;
        }

        public Criteria andFeeincludesNotEqualTo(String value) {
            addCriterion("FeeIncludes <>", value, "feeincludes");
            return (Criteria) this;
        }

        public Criteria andFeeincludesGreaterThan(String value) {
            addCriterion("FeeIncludes >", value, "feeincludes");
            return (Criteria) this;
        }

        public Criteria andFeeincludesGreaterThanOrEqualTo(String value) {
            addCriterion("FeeIncludes >=", value, "feeincludes");
            return (Criteria) this;
        }

        public Criteria andFeeincludesLessThan(String value) {
            addCriterion("FeeIncludes <", value, "feeincludes");
            return (Criteria) this;
        }

        public Criteria andFeeincludesLessThanOrEqualTo(String value) {
            addCriterion("FeeIncludes <=", value, "feeincludes");
            return (Criteria) this;
        }

        public Criteria andFeeincludesLike(String value) {
            addCriterion("FeeIncludes like", value, "feeincludes");
            return (Criteria) this;
        }

        public Criteria andFeeincludesNotLike(String value) {
            addCriterion("FeeIncludes not like", value, "feeincludes");
            return (Criteria) this;
        }

        public Criteria andFeeincludesIn(List<String> values) {
            addCriterion("FeeIncludes in", values, "feeincludes");
            return (Criteria) this;
        }

        public Criteria andFeeincludesNotIn(List<String> values) {
            addCriterion("FeeIncludes not in", values, "feeincludes");
            return (Criteria) this;
        }

        public Criteria andFeeincludesBetween(String value1, String value2) {
            addCriterion("FeeIncludes between", value1, value2, "feeincludes");
            return (Criteria) this;
        }

        public Criteria andFeeincludesNotBetween(String value1, String value2) {
            addCriterion("FeeIncludes not between", value1, value2, "feeincludes");
            return (Criteria) this;
        }

        public Criteria andFeenonincludesIsNull() {
            addCriterion("FeeNonIncludes is null");
            return (Criteria) this;
        }

        public Criteria andFeenonincludesIsNotNull() {
            addCriterion("FeeNonIncludes is not null");
            return (Criteria) this;
        }

        public Criteria andFeenonincludesEqualTo(String value) {
            addCriterion("FeeNonIncludes =", value, "feenonincludes");
            return (Criteria) this;
        }

        public Criteria andFeenonincludesNotEqualTo(String value) {
            addCriterion("FeeNonIncludes <>", value, "feenonincludes");
            return (Criteria) this;
        }

        public Criteria andFeenonincludesGreaterThan(String value) {
            addCriterion("FeeNonIncludes >", value, "feenonincludes");
            return (Criteria) this;
        }

        public Criteria andFeenonincludesGreaterThanOrEqualTo(String value) {
            addCriterion("FeeNonIncludes >=", value, "feenonincludes");
            return (Criteria) this;
        }

        public Criteria andFeenonincludesLessThan(String value) {
            addCriterion("FeeNonIncludes <", value, "feenonincludes");
            return (Criteria) this;
        }

        public Criteria andFeenonincludesLessThanOrEqualTo(String value) {
            addCriterion("FeeNonIncludes <=", value, "feenonincludes");
            return (Criteria) this;
        }

        public Criteria andFeenonincludesLike(String value) {
            addCriterion("FeeNonIncludes like", value, "feenonincludes");
            return (Criteria) this;
        }

        public Criteria andFeenonincludesNotLike(String value) {
            addCriterion("FeeNonIncludes not like", value, "feenonincludes");
            return (Criteria) this;
        }

        public Criteria andFeenonincludesIn(List<String> values) {
            addCriterion("FeeNonIncludes in", values, "feenonincludes");
            return (Criteria) this;
        }

        public Criteria andFeenonincludesNotIn(List<String> values) {
            addCriterion("FeeNonIncludes not in", values, "feenonincludes");
            return (Criteria) this;
        }

        public Criteria andFeenonincludesBetween(String value1, String value2) {
            addCriterion("FeeNonIncludes between", value1, value2, "feenonincludes");
            return (Criteria) this;
        }

        public Criteria andFeenonincludesNotBetween(String value1, String value2) {
            addCriterion("FeeNonIncludes not between", value1, value2, "feenonincludes");
            return (Criteria) this;
        }

        public Criteria andCoverimgIsNull() {
            addCriterion("CoverImg is null");
            return (Criteria) this;
        }

        public Criteria andCoverimgIsNotNull() {
            addCriterion("CoverImg is not null");
            return (Criteria) this;
        }

        public Criteria andCoverimgEqualTo(String value) {
            addCriterion("CoverImg =", value, "coverimg");
            return (Criteria) this;
        }

        public Criteria andCoverimgNotEqualTo(String value) {
            addCriterion("CoverImg <>", value, "coverimg");
            return (Criteria) this;
        }

        public Criteria andCoverimgGreaterThan(String value) {
            addCriterion("CoverImg >", value, "coverimg");
            return (Criteria) this;
        }

        public Criteria andCoverimgGreaterThanOrEqualTo(String value) {
            addCriterion("CoverImg >=", value, "coverimg");
            return (Criteria) this;
        }

        public Criteria andCoverimgLessThan(String value) {
            addCriterion("CoverImg <", value, "coverimg");
            return (Criteria) this;
        }

        public Criteria andCoverimgLessThanOrEqualTo(String value) {
            addCriterion("CoverImg <=", value, "coverimg");
            return (Criteria) this;
        }

        public Criteria andCoverimgLike(String value) {
            addCriterion("CoverImg like", value, "coverimg");
            return (Criteria) this;
        }

        public Criteria andCoverimgNotLike(String value) {
            addCriterion("CoverImg not like", value, "coverimg");
            return (Criteria) this;
        }

        public Criteria andCoverimgIn(List<String> values) {
            addCriterion("CoverImg in", values, "coverimg");
            return (Criteria) this;
        }

        public Criteria andCoverimgNotIn(List<String> values) {
            addCriterion("CoverImg not in", values, "coverimg");
            return (Criteria) this;
        }

        public Criteria andCoverimgBetween(String value1, String value2) {
            addCriterion("CoverImg between", value1, value2, "coverimg");
            return (Criteria) this;
        }

        public Criteria andCoverimgNotBetween(String value1, String value2) {
            addCriterion("CoverImg not between", value1, value2, "coverimg");
            return (Criteria) this;
        }

        public Criteria andAttentionIsNull() {
            addCriterion("Attention is null");
            return (Criteria) this;
        }

        public Criteria andAttentionIsNotNull() {
            addCriterion("Attention is not null");
            return (Criteria) this;
        }

        public Criteria andAttentionEqualTo(String value) {
            addCriterion("Attention =", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotEqualTo(String value) {
            addCriterion("Attention <>", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionGreaterThan(String value) {
            addCriterion("Attention >", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionGreaterThanOrEqualTo(String value) {
            addCriterion("Attention >=", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionLessThan(String value) {
            addCriterion("Attention <", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionLessThanOrEqualTo(String value) {
            addCriterion("Attention <=", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionLike(String value) {
            addCriterion("Attention like", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotLike(String value) {
            addCriterion("Attention not like", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionIn(List<String> values) {
            addCriterion("Attention in", values, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotIn(List<String> values) {
            addCriterion("Attention not in", values, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionBetween(String value1, String value2) {
            addCriterion("Attention between", value1, value2, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotBetween(String value1, String value2) {
            addCriterion("Attention not between", value1, value2, "attention");
            return (Criteria) this;
        }

        public Criteria andShoppingIsNull() {
            addCriterion("Shopping is null");
            return (Criteria) this;
        }

        public Criteria andShoppingIsNotNull() {
            addCriterion("Shopping is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingEqualTo(String value) {
            addCriterion("Shopping =", value, "shopping");
            return (Criteria) this;
        }

        public Criteria andShoppingNotEqualTo(String value) {
            addCriterion("Shopping <>", value, "shopping");
            return (Criteria) this;
        }

        public Criteria andShoppingGreaterThan(String value) {
            addCriterion("Shopping >", value, "shopping");
            return (Criteria) this;
        }

        public Criteria andShoppingGreaterThanOrEqualTo(String value) {
            addCriterion("Shopping >=", value, "shopping");
            return (Criteria) this;
        }

        public Criteria andShoppingLessThan(String value) {
            addCriterion("Shopping <", value, "shopping");
            return (Criteria) this;
        }

        public Criteria andShoppingLessThanOrEqualTo(String value) {
            addCriterion("Shopping <=", value, "shopping");
            return (Criteria) this;
        }

        public Criteria andShoppingLike(String value) {
            addCriterion("Shopping like", value, "shopping");
            return (Criteria) this;
        }

        public Criteria andShoppingNotLike(String value) {
            addCriterion("Shopping not like", value, "shopping");
            return (Criteria) this;
        }

        public Criteria andShoppingIn(List<String> values) {
            addCriterion("Shopping in", values, "shopping");
            return (Criteria) this;
        }

        public Criteria andShoppingNotIn(List<String> values) {
            addCriterion("Shopping not in", values, "shopping");
            return (Criteria) this;
        }

        public Criteria andShoppingBetween(String value1, String value2) {
            addCriterion("Shopping between", value1, value2, "shopping");
            return (Criteria) this;
        }

        public Criteria andShoppingNotBetween(String value1, String value2) {
            addCriterion("Shopping not between", value1, value2, "shopping");
            return (Criteria) this;
        }

        public Criteria andTipsIsNull() {
            addCriterion("Tips is null");
            return (Criteria) this;
        }

        public Criteria andTipsIsNotNull() {
            addCriterion("Tips is not null");
            return (Criteria) this;
        }

        public Criteria andTipsEqualTo(String value) {
            addCriterion("Tips =", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsNotEqualTo(String value) {
            addCriterion("Tips <>", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsGreaterThan(String value) {
            addCriterion("Tips >", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsGreaterThanOrEqualTo(String value) {
            addCriterion("Tips >=", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsLessThan(String value) {
            addCriterion("Tips <", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsLessThanOrEqualTo(String value) {
            addCriterion("Tips <=", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsLike(String value) {
            addCriterion("Tips like", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsNotLike(String value) {
            addCriterion("Tips not like", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsIn(List<String> values) {
            addCriterion("Tips in", values, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsNotIn(List<String> values) {
            addCriterion("Tips not in", values, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsBetween(String value1, String value2) {
            addCriterion("Tips between", value1, value2, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsNotBetween(String value1, String value2) {
            addCriterion("Tips not between", value1, value2, "tips");
            return (Criteria) this;
        }

        public Criteria andInsuranceIsNull() {
            addCriterion("Insurance is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceIsNotNull() {
            addCriterion("Insurance is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceEqualTo(String value) {
            addCriterion("Insurance =", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotEqualTo(String value) {
            addCriterion("Insurance <>", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceGreaterThan(String value) {
            addCriterion("Insurance >", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceGreaterThanOrEqualTo(String value) {
            addCriterion("Insurance >=", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceLessThan(String value) {
            addCriterion("Insurance <", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceLessThanOrEqualTo(String value) {
            addCriterion("Insurance <=", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceLike(String value) {
            addCriterion("Insurance like", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotLike(String value) {
            addCriterion("Insurance not like", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceIn(List<String> values) {
            addCriterion("Insurance in", values, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotIn(List<String> values) {
            addCriterion("Insurance not in", values, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceBetween(String value1, String value2) {
            addCriterion("Insurance between", value1, value2, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotBetween(String value1, String value2) {
            addCriterion("Insurance not between", value1, value2, "insurance");
            return (Criteria) this;
        }

        public Criteria andBactoruleIsNull() {
            addCriterion("BacToRule is null");
            return (Criteria) this;
        }

        public Criteria andBactoruleIsNotNull() {
            addCriterion("BacToRule is not null");
            return (Criteria) this;
        }

        public Criteria andBactoruleEqualTo(String value) {
            addCriterion("BacToRule =", value, "bactorule");
            return (Criteria) this;
        }

        public Criteria andBactoruleNotEqualTo(String value) {
            addCriterion("BacToRule <>", value, "bactorule");
            return (Criteria) this;
        }

        public Criteria andBactoruleGreaterThan(String value) {
            addCriterion("BacToRule >", value, "bactorule");
            return (Criteria) this;
        }

        public Criteria andBactoruleGreaterThanOrEqualTo(String value) {
            addCriterion("BacToRule >=", value, "bactorule");
            return (Criteria) this;
        }

        public Criteria andBactoruleLessThan(String value) {
            addCriterion("BacToRule <", value, "bactorule");
            return (Criteria) this;
        }

        public Criteria andBactoruleLessThanOrEqualTo(String value) {
            addCriterion("BacToRule <=", value, "bactorule");
            return (Criteria) this;
        }

        public Criteria andBactoruleLike(String value) {
            addCriterion("BacToRule like", value, "bactorule");
            return (Criteria) this;
        }

        public Criteria andBactoruleNotLike(String value) {
            addCriterion("BacToRule not like", value, "bactorule");
            return (Criteria) this;
        }

        public Criteria andBactoruleIn(List<String> values) {
            addCriterion("BacToRule in", values, "bactorule");
            return (Criteria) this;
        }

        public Criteria andBactoruleNotIn(List<String> values) {
            addCriterion("BacToRule not in", values, "bactorule");
            return (Criteria) this;
        }

        public Criteria andBactoruleBetween(String value1, String value2) {
            addCriterion("BacToRule between", value1, value2, "bactorule");
            return (Criteria) this;
        }

        public Criteria andBactoruleNotBetween(String value1, String value2) {
            addCriterion("BacToRule not between", value1, value2, "bactorule");
            return (Criteria) this;
        }

        public Criteria andIsackIsNull() {
            addCriterion("IsAck is null");
            return (Criteria) this;
        }

        public Criteria andIsackIsNotNull() {
            addCriterion("IsAck is not null");
            return (Criteria) this;
        }

        public Criteria andIsackEqualTo(Integer value) {
            addCriterion("IsAck =", value, "isack");
            return (Criteria) this;
        }

        public Criteria andIsackNotEqualTo(Integer value) {
            addCriterion("IsAck <>", value, "isack");
            return (Criteria) this;
        }

        public Criteria andIsackGreaterThan(Integer value) {
            addCriterion("IsAck >", value, "isack");
            return (Criteria) this;
        }

        public Criteria andIsackGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsAck >=", value, "isack");
            return (Criteria) this;
        }

        public Criteria andIsackLessThan(Integer value) {
            addCriterion("IsAck <", value, "isack");
            return (Criteria) this;
        }

        public Criteria andIsackLessThanOrEqualTo(Integer value) {
            addCriterion("IsAck <=", value, "isack");
            return (Criteria) this;
        }

        public Criteria andIsackIn(List<Integer> values) {
            addCriterion("IsAck in", values, "isack");
            return (Criteria) this;
        }

        public Criteria andIsackNotIn(List<Integer> values) {
            addCriterion("IsAck not in", values, "isack");
            return (Criteria) this;
        }

        public Criteria andIsackBetween(Integer value1, Integer value2) {
            addCriterion("IsAck between", value1, value2, "isack");
            return (Criteria) this;
        }

        public Criteria andIsackNotBetween(Integer value1, Integer value2) {
            addCriterion("IsAck not between", value1, value2, "isack");
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

        public Criteria andTravelnameIsNull() {
            addCriterion("TravelName is null");
            return (Criteria) this;
        }

        public Criteria andTravelnameIsNotNull() {
            addCriterion("TravelName is not null");
            return (Criteria) this;
        }

        public Criteria andTravelnameEqualTo(String value) {
            addCriterion("TravelName =", value, "travelname");
            return (Criteria) this;
        }

        public Criteria andTravelnameNotEqualTo(String value) {
            addCriterion("TravelName <>", value, "travelname");
            return (Criteria) this;
        }

        public Criteria andTravelnameGreaterThan(String value) {
            addCriterion("TravelName >", value, "travelname");
            return (Criteria) this;
        }

        public Criteria andTravelnameGreaterThanOrEqualTo(String value) {
            addCriterion("TravelName >=", value, "travelname");
            return (Criteria) this;
        }

        public Criteria andTravelnameLessThan(String value) {
            addCriterion("TravelName <", value, "travelname");
            return (Criteria) this;
        }

        public Criteria andTravelnameLessThanOrEqualTo(String value) {
            addCriterion("TravelName <=", value, "travelname");
            return (Criteria) this;
        }

        public Criteria andTravelnameLike(String value) {
            addCriterion("TravelName like", value, "travelname");
            return (Criteria) this;
        }

        public Criteria andTravelnameNotLike(String value) {
            addCriterion("TravelName not like", value, "travelname");
            return (Criteria) this;
        }

        public Criteria andTravelnameIn(List<String> values) {
            addCriterion("TravelName in", values, "travelname");
            return (Criteria) this;
        }

        public Criteria andTravelnameNotIn(List<String> values) {
            addCriterion("TravelName not in", values, "travelname");
            return (Criteria) this;
        }

        public Criteria andTravelnameBetween(String value1, String value2) {
            addCriterion("TravelName between", value1, value2, "travelname");
            return (Criteria) this;
        }

        public Criteria andTravelnameNotBetween(String value1, String value2) {
            addCriterion("TravelName not between", value1, value2, "travelname");
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

        public Criteria andIstailIsNull() {
            addCriterion("IsTail is null");
            return (Criteria) this;
        }

        public Criteria andIstailIsNotNull() {
            addCriterion("IsTail is not null");
            return (Criteria) this;
        }

        public Criteria andIstailEqualTo(Integer value) {
            addCriterion("IsTail =", value, "istail");
            return (Criteria) this;
        }

        public Criteria andIstailNotEqualTo(Integer value) {
            addCriterion("IsTail <>", value, "istail");
            return (Criteria) this;
        }

        public Criteria andIstailGreaterThan(Integer value) {
            addCriterion("IsTail >", value, "istail");
            return (Criteria) this;
        }

        public Criteria andIstailGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsTail >=", value, "istail");
            return (Criteria) this;
        }

        public Criteria andIstailLessThan(Integer value) {
            addCriterion("IsTail <", value, "istail");
            return (Criteria) this;
        }

        public Criteria andIstailLessThanOrEqualTo(Integer value) {
            addCriterion("IsTail <=", value, "istail");
            return (Criteria) this;
        }

        public Criteria andIstailIn(List<Integer> values) {
            addCriterion("IsTail in", values, "istail");
            return (Criteria) this;
        }

        public Criteria andIstailNotIn(List<Integer> values) {
            addCriterion("IsTail not in", values, "istail");
            return (Criteria) this;
        }

        public Criteria andIstailBetween(Integer value1, Integer value2) {
            addCriterion("IsTail between", value1, value2, "istail");
            return (Criteria) this;
        }

        public Criteria andIstailNotBetween(Integer value1, Integer value2) {
            addCriterion("IsTail not between", value1, value2, "istail");
            return (Criteria) this;
        }

        public Criteria andSalestypeIsNull() {
            addCriterion("SalesType is null");
            return (Criteria) this;
        }

        public Criteria andSalestypeIsNotNull() {
            addCriterion("SalesType is not null");
            return (Criteria) this;
        }

        public Criteria andSalestypeEqualTo(Integer value) {
            addCriterion("SalesType =", value, "salestype");
            return (Criteria) this;
        }

        public Criteria andSalestypeNotEqualTo(Integer value) {
            addCriterion("SalesType <>", value, "salestype");
            return (Criteria) this;
        }

        public Criteria andSalestypeGreaterThan(Integer value) {
            addCriterion("SalesType >", value, "salestype");
            return (Criteria) this;
        }

        public Criteria andSalestypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("SalesType >=", value, "salestype");
            return (Criteria) this;
        }

        public Criteria andSalestypeLessThan(Integer value) {
            addCriterion("SalesType <", value, "salestype");
            return (Criteria) this;
        }

        public Criteria andSalestypeLessThanOrEqualTo(Integer value) {
            addCriterion("SalesType <=", value, "salestype");
            return (Criteria) this;
        }

        public Criteria andSalestypeIn(List<Integer> values) {
            addCriterion("SalesType in", values, "salestype");
            return (Criteria) this;
        }

        public Criteria andSalestypeNotIn(List<Integer> values) {
            addCriterion("SalesType not in", values, "salestype");
            return (Criteria) this;
        }

        public Criteria andSalestypeBetween(Integer value1, Integer value2) {
            addCriterion("SalesType between", value1, value2, "salestype");
            return (Criteria) this;
        }

        public Criteria andSalestypeNotBetween(Integer value1, Integer value2) {
            addCriterion("SalesType not between", value1, value2, "salestype");
            return (Criteria) this;
        }

        public Criteria andAuditstatusIsNull() {
            addCriterion("AuditStatus is null");
            return (Criteria) this;
        }

        public Criteria andAuditstatusIsNotNull() {
            addCriterion("AuditStatus is not null");
            return (Criteria) this;
        }

        public Criteria andAuditstatusEqualTo(Integer value) {
            addCriterion("AuditStatus =", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotEqualTo(Integer value) {
            addCriterion("AuditStatus <>", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusGreaterThan(Integer value) {
            addCriterion("AuditStatus >", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("AuditStatus >=", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusLessThan(Integer value) {
            addCriterion("AuditStatus <", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusLessThanOrEqualTo(Integer value) {
            addCriterion("AuditStatus <=", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusIn(List<Integer> values) {
            addCriterion("AuditStatus in", values, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotIn(List<Integer> values) {
            addCriterion("AuditStatus not in", values, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusBetween(Integer value1, Integer value2) {
            addCriterion("AuditStatus between", value1, value2, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("AuditStatus not between", value1, value2, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditedbyIsNull() {
            addCriterion("AuditedBy is null");
            return (Criteria) this;
        }

        public Criteria andAuditedbyIsNotNull() {
            addCriterion("AuditedBy is not null");
            return (Criteria) this;
        }

        public Criteria andAuditedbyEqualTo(String value) {
            addCriterion("AuditedBy =", value, "auditedby");
            return (Criteria) this;
        }

        public Criteria andAuditedbyNotEqualTo(String value) {
            addCriterion("AuditedBy <>", value, "auditedby");
            return (Criteria) this;
        }

        public Criteria andAuditedbyGreaterThan(String value) {
            addCriterion("AuditedBy >", value, "auditedby");
            return (Criteria) this;
        }

        public Criteria andAuditedbyGreaterThanOrEqualTo(String value) {
            addCriterion("AuditedBy >=", value, "auditedby");
            return (Criteria) this;
        }

        public Criteria andAuditedbyLessThan(String value) {
            addCriterion("AuditedBy <", value, "auditedby");
            return (Criteria) this;
        }

        public Criteria andAuditedbyLessThanOrEqualTo(String value) {
            addCriterion("AuditedBy <=", value, "auditedby");
            return (Criteria) this;
        }

        public Criteria andAuditedbyLike(String value) {
            addCriterion("AuditedBy like", value, "auditedby");
            return (Criteria) this;
        }

        public Criteria andAuditedbyNotLike(String value) {
            addCriterion("AuditedBy not like", value, "auditedby");
            return (Criteria) this;
        }

        public Criteria andAuditedbyIn(List<String> values) {
            addCriterion("AuditedBy in", values, "auditedby");
            return (Criteria) this;
        }

        public Criteria andAuditedbyNotIn(List<String> values) {
            addCriterion("AuditedBy not in", values, "auditedby");
            return (Criteria) this;
        }

        public Criteria andAuditedbyBetween(String value1, String value2) {
            addCriterion("AuditedBy between", value1, value2, "auditedby");
            return (Criteria) this;
        }

        public Criteria andAuditedbyNotBetween(String value1, String value2) {
            addCriterion("AuditedBy not between", value1, value2, "auditedby");
            return (Criteria) this;
        }

        public Criteria andAuditeddateIsNull() {
            addCriterion("AuditedDate is null");
            return (Criteria) this;
        }

        public Criteria andAuditeddateIsNotNull() {
            addCriterion("AuditedDate is not null");
            return (Criteria) this;
        }

        public Criteria andAuditeddateEqualTo(Date value) {
            addCriterion("AuditedDate =", value, "auditeddate");
            return (Criteria) this;
        }

        public Criteria andAuditeddateNotEqualTo(Date value) {
            addCriterion("AuditedDate <>", value, "auditeddate");
            return (Criteria) this;
        }

        public Criteria andAuditeddateGreaterThan(Date value) {
            addCriterion("AuditedDate >", value, "auditeddate");
            return (Criteria) this;
        }

        public Criteria andAuditeddateGreaterThanOrEqualTo(Date value) {
            addCriterion("AuditedDate >=", value, "auditeddate");
            return (Criteria) this;
        }

        public Criteria andAuditeddateLessThan(Date value) {
            addCriterion("AuditedDate <", value, "auditeddate");
            return (Criteria) this;
        }

        public Criteria andAuditeddateLessThanOrEqualTo(Date value) {
            addCriterion("AuditedDate <=", value, "auditeddate");
            return (Criteria) this;
        }

        public Criteria andAuditeddateIn(List<Date> values) {
            addCriterion("AuditedDate in", values, "auditeddate");
            return (Criteria) this;
        }

        public Criteria andAuditeddateNotIn(List<Date> values) {
            addCriterion("AuditedDate not in", values, "auditeddate");
            return (Criteria) this;
        }

        public Criteria andAuditeddateBetween(Date value1, Date value2) {
            addCriterion("AuditedDate between", value1, value2, "auditeddate");
            return (Criteria) this;
        }

        public Criteria andAuditeddateNotBetween(Date value1, Date value2) {
            addCriterion("AuditedDate not between", value1, value2, "auditeddate");
            return (Criteria) this;
        }

        public Criteria andLocalpronameIsNull() {
            addCriterion("LocalProName is null");
            return (Criteria) this;
        }

        public Criteria andLocalpronameIsNotNull() {
            addCriterion("LocalProName is not null");
            return (Criteria) this;
        }

        public Criteria andLocalpronameEqualTo(String value) {
            addCriterion("LocalProName =", value, "localproname");
            return (Criteria) this;
        }

        public Criteria andLocalpronameNotEqualTo(String value) {
            addCriterion("LocalProName <>", value, "localproname");
            return (Criteria) this;
        }

        public Criteria andLocalpronameGreaterThan(String value) {
            addCriterion("LocalProName >", value, "localproname");
            return (Criteria) this;
        }

        public Criteria andLocalpronameGreaterThanOrEqualTo(String value) {
            addCriterion("LocalProName >=", value, "localproname");
            return (Criteria) this;
        }

        public Criteria andLocalpronameLessThan(String value) {
            addCriterion("LocalProName <", value, "localproname");
            return (Criteria) this;
        }

        public Criteria andLocalpronameLessThanOrEqualTo(String value) {
            addCriterion("LocalProName <=", value, "localproname");
            return (Criteria) this;
        }

        public Criteria andLocalpronameLike(String value) {
            addCriterion("LocalProName like", value, "localproname");
            return (Criteria) this;
        }

        public Criteria andLocalpronameNotLike(String value) {
            addCriterion("LocalProName not like", value, "localproname");
            return (Criteria) this;
        }

        public Criteria andLocalpronameIn(List<String> values) {
            addCriterion("LocalProName in", values, "localproname");
            return (Criteria) this;
        }

        public Criteria andLocalpronameNotIn(List<String> values) {
            addCriterion("LocalProName not in", values, "localproname");
            return (Criteria) this;
        }

        public Criteria andLocalpronameBetween(String value1, String value2) {
            addCriterion("LocalProName between", value1, value2, "localproname");
            return (Criteria) this;
        }

        public Criteria andLocalpronameNotBetween(String value1, String value2) {
            addCriterion("LocalProName not between", value1, value2, "localproname");
            return (Criteria) this;
        }

        public Criteria andTrafficIsNull() {
            addCriterion("Traffic is null");
            return (Criteria) this;
        }

        public Criteria andTrafficIsNotNull() {
            addCriterion("Traffic is not null");
            return (Criteria) this;
        }

        public Criteria andTrafficEqualTo(String value) {
            addCriterion("Traffic =", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficNotEqualTo(String value) {
            addCriterion("Traffic <>", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficGreaterThan(String value) {
            addCriterion("Traffic >", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficGreaterThanOrEqualTo(String value) {
            addCriterion("Traffic >=", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficLessThan(String value) {
            addCriterion("Traffic <", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficLessThanOrEqualTo(String value) {
            addCriterion("Traffic <=", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficLike(String value) {
            addCriterion("Traffic like", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficNotLike(String value) {
            addCriterion("Traffic not like", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficIn(List<String> values) {
            addCriterion("Traffic in", values, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficNotIn(List<String> values) {
            addCriterion("Traffic not in", values, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficBetween(String value1, String value2) {
            addCriterion("Traffic between", value1, value2, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficNotBetween(String value1, String value2) {
            addCriterion("Traffic not between", value1, value2, "traffic");
            return (Criteria) this;
        }

        public Criteria andIsprivatetemplateIsNull() {
            addCriterion("IsPrivateTemplate is null");
            return (Criteria) this;
        }

        public Criteria andIsprivatetemplateIsNotNull() {
            addCriterion("IsPrivateTemplate is not null");
            return (Criteria) this;
        }

        public Criteria andIsprivatetemplateEqualTo(Integer value) {
            addCriterion("IsPrivateTemplate =", value, "isprivatetemplate");
            return (Criteria) this;
        }

        public Criteria andIsprivatetemplateNotEqualTo(Integer value) {
            addCriterion("IsPrivateTemplate <>", value, "isprivatetemplate");
            return (Criteria) this;
        }

        public Criteria andIsprivatetemplateGreaterThan(Integer value) {
            addCriterion("IsPrivateTemplate >", value, "isprivatetemplate");
            return (Criteria) this;
        }

        public Criteria andIsprivatetemplateGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsPrivateTemplate >=", value, "isprivatetemplate");
            return (Criteria) this;
        }

        public Criteria andIsprivatetemplateLessThan(Integer value) {
            addCriterion("IsPrivateTemplate <", value, "isprivatetemplate");
            return (Criteria) this;
        }

        public Criteria andIsprivatetemplateLessThanOrEqualTo(Integer value) {
            addCriterion("IsPrivateTemplate <=", value, "isprivatetemplate");
            return (Criteria) this;
        }

        public Criteria andIsprivatetemplateIn(List<Integer> values) {
            addCriterion("IsPrivateTemplate in", values, "isprivatetemplate");
            return (Criteria) this;
        }

        public Criteria andIsprivatetemplateNotIn(List<Integer> values) {
            addCriterion("IsPrivateTemplate not in", values, "isprivatetemplate");
            return (Criteria) this;
        }

        public Criteria andIsprivatetemplateBetween(Integer value1, Integer value2) {
            addCriterion("IsPrivateTemplate between", value1, value2, "isprivatetemplate");
            return (Criteria) this;
        }

        public Criteria andIsprivatetemplateNotBetween(Integer value1, Integer value2) {
            addCriterion("IsPrivateTemplate not between", value1, value2, "isprivatetemplate");
            return (Criteria) this;
        }

        public Criteria andIscommontemplateIsNull() {
            addCriterion("IsCommonTemplate is null");
            return (Criteria) this;
        }

        public Criteria andIscommontemplateIsNotNull() {
            addCriterion("IsCommonTemplate is not null");
            return (Criteria) this;
        }

        public Criteria andIscommontemplateEqualTo(Integer value) {
            addCriterion("IsCommonTemplate =", value, "iscommontemplate");
            return (Criteria) this;
        }

        public Criteria andIscommontemplateNotEqualTo(Integer value) {
            addCriterion("IsCommonTemplate <>", value, "iscommontemplate");
            return (Criteria) this;
        }

        public Criteria andIscommontemplateGreaterThan(Integer value) {
            addCriterion("IsCommonTemplate >", value, "iscommontemplate");
            return (Criteria) this;
        }

        public Criteria andIscommontemplateGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsCommonTemplate >=", value, "iscommontemplate");
            return (Criteria) this;
        }

        public Criteria andIscommontemplateLessThan(Integer value) {
            addCriterion("IsCommonTemplate <", value, "iscommontemplate");
            return (Criteria) this;
        }

        public Criteria andIscommontemplateLessThanOrEqualTo(Integer value) {
            addCriterion("IsCommonTemplate <=", value, "iscommontemplate");
            return (Criteria) this;
        }

        public Criteria andIscommontemplateIn(List<Integer> values) {
            addCriterion("IsCommonTemplate in", values, "iscommontemplate");
            return (Criteria) this;
        }

        public Criteria andIscommontemplateNotIn(List<Integer> values) {
            addCriterion("IsCommonTemplate not in", values, "iscommontemplate");
            return (Criteria) this;
        }

        public Criteria andIscommontemplateBetween(Integer value1, Integer value2) {
            addCriterion("IsCommonTemplate between", value1, value2, "iscommontemplate");
            return (Criteria) this;
        }

        public Criteria andIscommontemplateNotBetween(Integer value1, Integer value2) {
            addCriterion("IsCommonTemplate not between", value1, value2, "iscommontemplate");
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

        public Criteria andPropropIsNull() {
            addCriterion("ProProp is null");
            return (Criteria) this;
        }

        public Criteria andPropropIsNotNull() {
            addCriterion("ProProp is not null");
            return (Criteria) this;
        }

        public Criteria andPropropEqualTo(Integer value) {
            addCriterion("ProProp =", value, "proprop");
            return (Criteria) this;
        }

        public Criteria andPropropNotEqualTo(Integer value) {
            addCriterion("ProProp <>", value, "proprop");
            return (Criteria) this;
        }

        public Criteria andPropropGreaterThan(Integer value) {
            addCriterion("ProProp >", value, "proprop");
            return (Criteria) this;
        }

        public Criteria andPropropGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProProp >=", value, "proprop");
            return (Criteria) this;
        }

        public Criteria andPropropLessThan(Integer value) {
            addCriterion("ProProp <", value, "proprop");
            return (Criteria) this;
        }

        public Criteria andPropropLessThanOrEqualTo(Integer value) {
            addCriterion("ProProp <=", value, "proprop");
            return (Criteria) this;
        }

        public Criteria andPropropIn(List<Integer> values) {
            addCriterion("ProProp in", values, "proprop");
            return (Criteria) this;
        }

        public Criteria andPropropNotIn(List<Integer> values) {
            addCriterion("ProProp not in", values, "proprop");
            return (Criteria) this;
        }

        public Criteria andPropropBetween(Integer value1, Integer value2) {
            addCriterion("ProProp between", value1, value2, "proprop");
            return (Criteria) this;
        }

        public Criteria andPropropNotBetween(Integer value1, Integer value2) {
            addCriterion("ProProp not between", value1, value2, "proprop");
            return (Criteria) this;
        }

        public Criteria andMobilecoverimgIsNull() {
            addCriterion("MobileCoverImg is null");
            return (Criteria) this;
        }

        public Criteria andMobilecoverimgIsNotNull() {
            addCriterion("MobileCoverImg is not null");
            return (Criteria) this;
        }

        public Criteria andMobilecoverimgEqualTo(String value) {
            addCriterion("MobileCoverImg =", value, "mobilecoverimg");
            return (Criteria) this;
        }

        public Criteria andMobilecoverimgNotEqualTo(String value) {
            addCriterion("MobileCoverImg <>", value, "mobilecoverimg");
            return (Criteria) this;
        }

        public Criteria andMobilecoverimgGreaterThan(String value) {
            addCriterion("MobileCoverImg >", value, "mobilecoverimg");
            return (Criteria) this;
        }

        public Criteria andMobilecoverimgGreaterThanOrEqualTo(String value) {
            addCriterion("MobileCoverImg >=", value, "mobilecoverimg");
            return (Criteria) this;
        }

        public Criteria andMobilecoverimgLessThan(String value) {
            addCriterion("MobileCoverImg <", value, "mobilecoverimg");
            return (Criteria) this;
        }

        public Criteria andMobilecoverimgLessThanOrEqualTo(String value) {
            addCriterion("MobileCoverImg <=", value, "mobilecoverimg");
            return (Criteria) this;
        }

        public Criteria andMobilecoverimgLike(String value) {
            addCriterion("MobileCoverImg like", value, "mobilecoverimg");
            return (Criteria) this;
        }

        public Criteria andMobilecoverimgNotLike(String value) {
            addCriterion("MobileCoverImg not like", value, "mobilecoverimg");
            return (Criteria) this;
        }

        public Criteria andMobilecoverimgIn(List<String> values) {
            addCriterion("MobileCoverImg in", values, "mobilecoverimg");
            return (Criteria) this;
        }

        public Criteria andMobilecoverimgNotIn(List<String> values) {
            addCriterion("MobileCoverImg not in", values, "mobilecoverimg");
            return (Criteria) this;
        }

        public Criteria andMobilecoverimgBetween(String value1, String value2) {
            addCriterion("MobileCoverImg between", value1, value2, "mobilecoverimg");
            return (Criteria) this;
        }

        public Criteria andMobilecoverimgNotBetween(String value1, String value2) {
            addCriterion("MobileCoverImg not between", value1, value2, "mobilecoverimg");
            return (Criteria) this;
        }

        public Criteria andStarlevelIsNull() {
            addCriterion("StarLevel is null");
            return (Criteria) this;
        }

        public Criteria andStarlevelIsNotNull() {
            addCriterion("StarLevel is not null");
            return (Criteria) this;
        }

        public Criteria andStarlevelEqualTo(Integer value) {
            addCriterion("StarLevel =", value, "starlevel");
            return (Criteria) this;
        }

        public Criteria andStarlevelNotEqualTo(Integer value) {
            addCriterion("StarLevel <>", value, "starlevel");
            return (Criteria) this;
        }

        public Criteria andStarlevelGreaterThan(Integer value) {
            addCriterion("StarLevel >", value, "starlevel");
            return (Criteria) this;
        }

        public Criteria andStarlevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("StarLevel >=", value, "starlevel");
            return (Criteria) this;
        }

        public Criteria andStarlevelLessThan(Integer value) {
            addCriterion("StarLevel <", value, "starlevel");
            return (Criteria) this;
        }

        public Criteria andStarlevelLessThanOrEqualTo(Integer value) {
            addCriterion("StarLevel <=", value, "starlevel");
            return (Criteria) this;
        }

        public Criteria andStarlevelIn(List<Integer> values) {
            addCriterion("StarLevel in", values, "starlevel");
            return (Criteria) this;
        }

        public Criteria andStarlevelNotIn(List<Integer> values) {
            addCriterion("StarLevel not in", values, "starlevel");
            return (Criteria) this;
        }

        public Criteria andStarlevelBetween(Integer value1, Integer value2) {
            addCriterion("StarLevel between", value1, value2, "starlevel");
            return (Criteria) this;
        }

        public Criteria andStarlevelNotBetween(Integer value1, Integer value2) {
            addCriterion("StarLevel not between", value1, value2, "starlevel");
            return (Criteria) this;
        }

        public Criteria andTraffictypeIsNull() {
            addCriterion("TrafficType is null");
            return (Criteria) this;
        }

        public Criteria andTraffictypeIsNotNull() {
            addCriterion("TrafficType is not null");
            return (Criteria) this;
        }

        public Criteria andTraffictypeEqualTo(Integer value) {
            addCriterion("TrafficType =", value, "traffictype");
            return (Criteria) this;
        }

        public Criteria andTraffictypeNotEqualTo(Integer value) {
            addCriterion("TrafficType <>", value, "traffictype");
            return (Criteria) this;
        }

        public Criteria andTraffictypeGreaterThan(Integer value) {
            addCriterion("TrafficType >", value, "traffictype");
            return (Criteria) this;
        }

        public Criteria andTraffictypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("TrafficType >=", value, "traffictype");
            return (Criteria) this;
        }

        public Criteria andTraffictypeLessThan(Integer value) {
            addCriterion("TrafficType <", value, "traffictype");
            return (Criteria) this;
        }

        public Criteria andTraffictypeLessThanOrEqualTo(Integer value) {
            addCriterion("TrafficType <=", value, "traffictype");
            return (Criteria) this;
        }

        public Criteria andTraffictypeIn(List<Integer> values) {
            addCriterion("TrafficType in", values, "traffictype");
            return (Criteria) this;
        }

        public Criteria andTraffictypeNotIn(List<Integer> values) {
            addCriterion("TrafficType not in", values, "traffictype");
            return (Criteria) this;
        }

        public Criteria andTraffictypeBetween(Integer value1, Integer value2) {
            addCriterion("TrafficType between", value1, value2, "traffictype");
            return (Criteria) this;
        }

        public Criteria andTraffictypeNotBetween(Integer value1, Integer value2) {
            addCriterion("TrafficType not between", value1, value2, "traffictype");
            return (Criteria) this;
        }

        public Criteria andDestcollectionflagIsNull() {
            addCriterion("DestCollectionFlag is null");
            return (Criteria) this;
        }

        public Criteria andDestcollectionflagIsNotNull() {
            addCriterion("DestCollectionFlag is not null");
            return (Criteria) this;
        }

        public Criteria andDestcollectionflagEqualTo(String value) {
            addCriterion("DestCollectionFlag =", value, "destcollectionflag");
            return (Criteria) this;
        }

        public Criteria andDestcollectionflagNotEqualTo(String value) {
            addCriterion("DestCollectionFlag <>", value, "destcollectionflag");
            return (Criteria) this;
        }

        public Criteria andDestcollectionflagGreaterThan(String value) {
            addCriterion("DestCollectionFlag >", value, "destcollectionflag");
            return (Criteria) this;
        }

        public Criteria andDestcollectionflagGreaterThanOrEqualTo(String value) {
            addCriterion("DestCollectionFlag >=", value, "destcollectionflag");
            return (Criteria) this;
        }

        public Criteria andDestcollectionflagLessThan(String value) {
            addCriterion("DestCollectionFlag <", value, "destcollectionflag");
            return (Criteria) this;
        }

        public Criteria andDestcollectionflagLessThanOrEqualTo(String value) {
            addCriterion("DestCollectionFlag <=", value, "destcollectionflag");
            return (Criteria) this;
        }

        public Criteria andDestcollectionflagLike(String value) {
            addCriterion("DestCollectionFlag like", value, "destcollectionflag");
            return (Criteria) this;
        }

        public Criteria andDestcollectionflagNotLike(String value) {
            addCriterion("DestCollectionFlag not like", value, "destcollectionflag");
            return (Criteria) this;
        }

        public Criteria andDestcollectionflagIn(List<String> values) {
            addCriterion("DestCollectionFlag in", values, "destcollectionflag");
            return (Criteria) this;
        }

        public Criteria andDestcollectionflagNotIn(List<String> values) {
            addCriterion("DestCollectionFlag not in", values, "destcollectionflag");
            return (Criteria) this;
        }

        public Criteria andDestcollectionflagBetween(String value1, String value2) {
            addCriterion("DestCollectionFlag between", value1, value2, "destcollectionflag");
            return (Criteria) this;
        }

        public Criteria andDestcollectionflagNotBetween(String value1, String value2) {
            addCriterion("DestCollectionFlag not between", value1, value2, "destcollectionflag");
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

        public Criteria andEmergencymobilenoIsNull() {
            addCriterion("EmergencyMobileNo is null");
            return (Criteria) this;
        }

        public Criteria andEmergencymobilenoIsNotNull() {
            addCriterion("EmergencyMobileNo is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencymobilenoEqualTo(String value) {
            addCriterion("EmergencyMobileNo =", value, "emergencymobileno");
            return (Criteria) this;
        }

        public Criteria andEmergencymobilenoNotEqualTo(String value) {
            addCriterion("EmergencyMobileNo <>", value, "emergencymobileno");
            return (Criteria) this;
        }

        public Criteria andEmergencymobilenoGreaterThan(String value) {
            addCriterion("EmergencyMobileNo >", value, "emergencymobileno");
            return (Criteria) this;
        }

        public Criteria andEmergencymobilenoGreaterThanOrEqualTo(String value) {
            addCriterion("EmergencyMobileNo >=", value, "emergencymobileno");
            return (Criteria) this;
        }

        public Criteria andEmergencymobilenoLessThan(String value) {
            addCriterion("EmergencyMobileNo <", value, "emergencymobileno");
            return (Criteria) this;
        }

        public Criteria andEmergencymobilenoLessThanOrEqualTo(String value) {
            addCriterion("EmergencyMobileNo <=", value, "emergencymobileno");
            return (Criteria) this;
        }

        public Criteria andEmergencymobilenoLike(String value) {
            addCriterion("EmergencyMobileNo like", value, "emergencymobileno");
            return (Criteria) this;
        }

        public Criteria andEmergencymobilenoNotLike(String value) {
            addCriterion("EmergencyMobileNo not like", value, "emergencymobileno");
            return (Criteria) this;
        }

        public Criteria andEmergencymobilenoIn(List<String> values) {
            addCriterion("EmergencyMobileNo in", values, "emergencymobileno");
            return (Criteria) this;
        }

        public Criteria andEmergencymobilenoNotIn(List<String> values) {
            addCriterion("EmergencyMobileNo not in", values, "emergencymobileno");
            return (Criteria) this;
        }

        public Criteria andEmergencymobilenoBetween(String value1, String value2) {
            addCriterion("EmergencyMobileNo between", value1, value2, "emergencymobileno");
            return (Criteria) this;
        }

        public Criteria andEmergencymobilenoNotBetween(String value1, String value2) {
            addCriterion("EmergencyMobileNo not between", value1, value2, "emergencymobileno");
            return (Criteria) this;
        }

        public Criteria andTravelagencyaddrIsNull() {
            addCriterion("TravelAgencyAddr is null");
            return (Criteria) this;
        }

        public Criteria andTravelagencyaddrIsNotNull() {
            addCriterion("TravelAgencyAddr is not null");
            return (Criteria) this;
        }

        public Criteria andTravelagencyaddrEqualTo(String value) {
            addCriterion("TravelAgencyAddr =", value, "travelagencyaddr");
            return (Criteria) this;
        }

        public Criteria andTravelagencyaddrNotEqualTo(String value) {
            addCriterion("TravelAgencyAddr <>", value, "travelagencyaddr");
            return (Criteria) this;
        }

        public Criteria andTravelagencyaddrGreaterThan(String value) {
            addCriterion("TravelAgencyAddr >", value, "travelagencyaddr");
            return (Criteria) this;
        }

        public Criteria andTravelagencyaddrGreaterThanOrEqualTo(String value) {
            addCriterion("TravelAgencyAddr >=", value, "travelagencyaddr");
            return (Criteria) this;
        }

        public Criteria andTravelagencyaddrLessThan(String value) {
            addCriterion("TravelAgencyAddr <", value, "travelagencyaddr");
            return (Criteria) this;
        }

        public Criteria andTravelagencyaddrLessThanOrEqualTo(String value) {
            addCriterion("TravelAgencyAddr <=", value, "travelagencyaddr");
            return (Criteria) this;
        }

        public Criteria andTravelagencyaddrLike(String value) {
            addCriterion("TravelAgencyAddr like", value, "travelagencyaddr");
            return (Criteria) this;
        }

        public Criteria andTravelagencyaddrNotLike(String value) {
            addCriterion("TravelAgencyAddr not like", value, "travelagencyaddr");
            return (Criteria) this;
        }

        public Criteria andTravelagencyaddrIn(List<String> values) {
            addCriterion("TravelAgencyAddr in", values, "travelagencyaddr");
            return (Criteria) this;
        }

        public Criteria andTravelagencyaddrNotIn(List<String> values) {
            addCriterion("TravelAgencyAddr not in", values, "travelagencyaddr");
            return (Criteria) this;
        }

        public Criteria andTravelagencyaddrBetween(String value1, String value2) {
            addCriterion("TravelAgencyAddr between", value1, value2, "travelagencyaddr");
            return (Criteria) this;
        }

        public Criteria andTravelagencyaddrNotBetween(String value1, String value2) {
            addCriterion("TravelAgencyAddr not between", value1, value2, "travelagencyaddr");
            return (Criteria) this;
        }

        public Criteria andTravelagencyphoneIsNull() {
            addCriterion("TravelAgencyPhone is null");
            return (Criteria) this;
        }

        public Criteria andTravelagencyphoneIsNotNull() {
            addCriterion("TravelAgencyPhone is not null");
            return (Criteria) this;
        }

        public Criteria andTravelagencyphoneEqualTo(String value) {
            addCriterion("TravelAgencyPhone =", value, "travelagencyphone");
            return (Criteria) this;
        }

        public Criteria andTravelagencyphoneNotEqualTo(String value) {
            addCriterion("TravelAgencyPhone <>", value, "travelagencyphone");
            return (Criteria) this;
        }

        public Criteria andTravelagencyphoneGreaterThan(String value) {
            addCriterion("TravelAgencyPhone >", value, "travelagencyphone");
            return (Criteria) this;
        }

        public Criteria andTravelagencyphoneGreaterThanOrEqualTo(String value) {
            addCriterion("TravelAgencyPhone >=", value, "travelagencyphone");
            return (Criteria) this;
        }

        public Criteria andTravelagencyphoneLessThan(String value) {
            addCriterion("TravelAgencyPhone <", value, "travelagencyphone");
            return (Criteria) this;
        }

        public Criteria andTravelagencyphoneLessThanOrEqualTo(String value) {
            addCriterion("TravelAgencyPhone <=", value, "travelagencyphone");
            return (Criteria) this;
        }

        public Criteria andTravelagencyphoneLike(String value) {
            addCriterion("TravelAgencyPhone like", value, "travelagencyphone");
            return (Criteria) this;
        }

        public Criteria andTravelagencyphoneNotLike(String value) {
            addCriterion("TravelAgencyPhone not like", value, "travelagencyphone");
            return (Criteria) this;
        }

        public Criteria andTravelagencyphoneIn(List<String> values) {
            addCriterion("TravelAgencyPhone in", values, "travelagencyphone");
            return (Criteria) this;
        }

        public Criteria andTravelagencyphoneNotIn(List<String> values) {
            addCriterion("TravelAgencyPhone not in", values, "travelagencyphone");
            return (Criteria) this;
        }

        public Criteria andTravelagencyphoneBetween(String value1, String value2) {
            addCriterion("TravelAgencyPhone between", value1, value2, "travelagencyphone");
            return (Criteria) this;
        }

        public Criteria andTravelagencyphoneNotBetween(String value1, String value2) {
            addCriterion("TravelAgencyPhone not between", value1, value2, "travelagencyphone");
            return (Criteria) this;
        }

        public Criteria andTaemergencycontactIsNull() {
            addCriterion("TAEmergencyContact is null");
            return (Criteria) this;
        }

        public Criteria andTaemergencycontactIsNotNull() {
            addCriterion("TAEmergencyContact is not null");
            return (Criteria) this;
        }

        public Criteria andTaemergencycontactEqualTo(String value) {
            addCriterion("TAEmergencyContact =", value, "taemergencycontact");
            return (Criteria) this;
        }

        public Criteria andTaemergencycontactNotEqualTo(String value) {
            addCriterion("TAEmergencyContact <>", value, "taemergencycontact");
            return (Criteria) this;
        }

        public Criteria andTaemergencycontactGreaterThan(String value) {
            addCriterion("TAEmergencyContact >", value, "taemergencycontact");
            return (Criteria) this;
        }

        public Criteria andTaemergencycontactGreaterThanOrEqualTo(String value) {
            addCriterion("TAEmergencyContact >=", value, "taemergencycontact");
            return (Criteria) this;
        }

        public Criteria andTaemergencycontactLessThan(String value) {
            addCriterion("TAEmergencyContact <", value, "taemergencycontact");
            return (Criteria) this;
        }

        public Criteria andTaemergencycontactLessThanOrEqualTo(String value) {
            addCriterion("TAEmergencyContact <=", value, "taemergencycontact");
            return (Criteria) this;
        }

        public Criteria andTaemergencycontactLike(String value) {
            addCriterion("TAEmergencyContact like", value, "taemergencycontact");
            return (Criteria) this;
        }

        public Criteria andTaemergencycontactNotLike(String value) {
            addCriterion("TAEmergencyContact not like", value, "taemergencycontact");
            return (Criteria) this;
        }

        public Criteria andTaemergencycontactIn(List<String> values) {
            addCriterion("TAEmergencyContact in", values, "taemergencycontact");
            return (Criteria) this;
        }

        public Criteria andTaemergencycontactNotIn(List<String> values) {
            addCriterion("TAEmergencyContact not in", values, "taemergencycontact");
            return (Criteria) this;
        }

        public Criteria andTaemergencycontactBetween(String value1, String value2) {
            addCriterion("TAEmergencyContact between", value1, value2, "taemergencycontact");
            return (Criteria) this;
        }

        public Criteria andTaemergencycontactNotBetween(String value1, String value2) {
            addCriterion("TAEmergencyContact not between", value1, value2, "taemergencycontact");
            return (Criteria) this;
        }

        public Criteria andTaemergencymobileIsNull() {
            addCriterion("TAEmergencyMobile is null");
            return (Criteria) this;
        }

        public Criteria andTaemergencymobileIsNotNull() {
            addCriterion("TAEmergencyMobile is not null");
            return (Criteria) this;
        }

        public Criteria andTaemergencymobileEqualTo(String value) {
            addCriterion("TAEmergencyMobile =", value, "taemergencymobile");
            return (Criteria) this;
        }

        public Criteria andTaemergencymobileNotEqualTo(String value) {
            addCriterion("TAEmergencyMobile <>", value, "taemergencymobile");
            return (Criteria) this;
        }

        public Criteria andTaemergencymobileGreaterThan(String value) {
            addCriterion("TAEmergencyMobile >", value, "taemergencymobile");
            return (Criteria) this;
        }

        public Criteria andTaemergencymobileGreaterThanOrEqualTo(String value) {
            addCriterion("TAEmergencyMobile >=", value, "taemergencymobile");
            return (Criteria) this;
        }

        public Criteria andTaemergencymobileLessThan(String value) {
            addCriterion("TAEmergencyMobile <", value, "taemergencymobile");
            return (Criteria) this;
        }

        public Criteria andTaemergencymobileLessThanOrEqualTo(String value) {
            addCriterion("TAEmergencyMobile <=", value, "taemergencymobile");
            return (Criteria) this;
        }

        public Criteria andTaemergencymobileLike(String value) {
            addCriterion("TAEmergencyMobile like", value, "taemergencymobile");
            return (Criteria) this;
        }

        public Criteria andTaemergencymobileNotLike(String value) {
            addCriterion("TAEmergencyMobile not like", value, "taemergencymobile");
            return (Criteria) this;
        }

        public Criteria andTaemergencymobileIn(List<String> values) {
            addCriterion("TAEmergencyMobile in", values, "taemergencymobile");
            return (Criteria) this;
        }

        public Criteria andTaemergencymobileNotIn(List<String> values) {
            addCriterion("TAEmergencyMobile not in", values, "taemergencymobile");
            return (Criteria) this;
        }

        public Criteria andTaemergencymobileBetween(String value1, String value2) {
            addCriterion("TAEmergencyMobile between", value1, value2, "taemergencymobile");
            return (Criteria) this;
        }

        public Criteria andTaemergencymobileNotBetween(String value1, String value2) {
            addCriterion("TAEmergencyMobile not between", value1, value2, "taemergencymobile");
            return (Criteria) this;
        }

        public Criteria andWxpublicityimageIsNull() {
            addCriterion("WXPublicityImage is null");
            return (Criteria) this;
        }

        public Criteria andWxpublicityimageIsNotNull() {
            addCriterion("WXPublicityImage is not null");
            return (Criteria) this;
        }

        public Criteria andWxpublicityimageEqualTo(String value) {
            addCriterion("WXPublicityImage =", value, "wxpublicityimage");
            return (Criteria) this;
        }

        public Criteria andWxpublicityimageNotEqualTo(String value) {
            addCriterion("WXPublicityImage <>", value, "wxpublicityimage");
            return (Criteria) this;
        }

        public Criteria andWxpublicityimageGreaterThan(String value) {
            addCriterion("WXPublicityImage >", value, "wxpublicityimage");
            return (Criteria) this;
        }

        public Criteria andWxpublicityimageGreaterThanOrEqualTo(String value) {
            addCriterion("WXPublicityImage >=", value, "wxpublicityimage");
            return (Criteria) this;
        }

        public Criteria andWxpublicityimageLessThan(String value) {
            addCriterion("WXPublicityImage <", value, "wxpublicityimage");
            return (Criteria) this;
        }

        public Criteria andWxpublicityimageLessThanOrEqualTo(String value) {
            addCriterion("WXPublicityImage <=", value, "wxpublicityimage");
            return (Criteria) this;
        }

        public Criteria andWxpublicityimageLike(String value) {
            addCriterion("WXPublicityImage like", value, "wxpublicityimage");
            return (Criteria) this;
        }

        public Criteria andWxpublicityimageNotLike(String value) {
            addCriterion("WXPublicityImage not like", value, "wxpublicityimage");
            return (Criteria) this;
        }

        public Criteria andWxpublicityimageIn(List<String> values) {
            addCriterion("WXPublicityImage in", values, "wxpublicityimage");
            return (Criteria) this;
        }

        public Criteria andWxpublicityimageNotIn(List<String> values) {
            addCriterion("WXPublicityImage not in", values, "wxpublicityimage");
            return (Criteria) this;
        }

        public Criteria andWxpublicityimageBetween(String value1, String value2) {
            addCriterion("WXPublicityImage between", value1, value2, "wxpublicityimage");
            return (Criteria) this;
        }

        public Criteria andWxpublicityimageNotBetween(String value1, String value2) {
            addCriterion("WXPublicityImage not between", value1, value2, "wxpublicityimage");
            return (Criteria) this;
        }

        public Criteria andWxtitleIsNull() {
            addCriterion("WXTitle is null");
            return (Criteria) this;
        }

        public Criteria andWxtitleIsNotNull() {
            addCriterion("WXTitle is not null");
            return (Criteria) this;
        }

        public Criteria andWxtitleEqualTo(String value) {
            addCriterion("WXTitle =", value, "wxtitle");
            return (Criteria) this;
        }

        public Criteria andWxtitleNotEqualTo(String value) {
            addCriterion("WXTitle <>", value, "wxtitle");
            return (Criteria) this;
        }

        public Criteria andWxtitleGreaterThan(String value) {
            addCriterion("WXTitle >", value, "wxtitle");
            return (Criteria) this;
        }

        public Criteria andWxtitleGreaterThanOrEqualTo(String value) {
            addCriterion("WXTitle >=", value, "wxtitle");
            return (Criteria) this;
        }

        public Criteria andWxtitleLessThan(String value) {
            addCriterion("WXTitle <", value, "wxtitle");
            return (Criteria) this;
        }

        public Criteria andWxtitleLessThanOrEqualTo(String value) {
            addCriterion("WXTitle <=", value, "wxtitle");
            return (Criteria) this;
        }

        public Criteria andWxtitleLike(String value) {
            addCriterion("WXTitle like", value, "wxtitle");
            return (Criteria) this;
        }

        public Criteria andWxtitleNotLike(String value) {
            addCriterion("WXTitle not like", value, "wxtitle");
            return (Criteria) this;
        }

        public Criteria andWxtitleIn(List<String> values) {
            addCriterion("WXTitle in", values, "wxtitle");
            return (Criteria) this;
        }

        public Criteria andWxtitleNotIn(List<String> values) {
            addCriterion("WXTitle not in", values, "wxtitle");
            return (Criteria) this;
        }

        public Criteria andWxtitleBetween(String value1, String value2) {
            addCriterion("WXTitle between", value1, value2, "wxtitle");
            return (Criteria) this;
        }

        public Criteria andWxtitleNotBetween(String value1, String value2) {
            addCriterion("WXTitle not between", value1, value2, "wxtitle");
            return (Criteria) this;
        }

        public Criteria andWxsharesummaryIsNull() {
            addCriterion("WXShareSummary is null");
            return (Criteria) this;
        }

        public Criteria andWxsharesummaryIsNotNull() {
            addCriterion("WXShareSummary is not null");
            return (Criteria) this;
        }

        public Criteria andWxsharesummaryEqualTo(String value) {
            addCriterion("WXShareSummary =", value, "wxsharesummary");
            return (Criteria) this;
        }

        public Criteria andWxsharesummaryNotEqualTo(String value) {
            addCriterion("WXShareSummary <>", value, "wxsharesummary");
            return (Criteria) this;
        }

        public Criteria andWxsharesummaryGreaterThan(String value) {
            addCriterion("WXShareSummary >", value, "wxsharesummary");
            return (Criteria) this;
        }

        public Criteria andWxsharesummaryGreaterThanOrEqualTo(String value) {
            addCriterion("WXShareSummary >=", value, "wxsharesummary");
            return (Criteria) this;
        }

        public Criteria andWxsharesummaryLessThan(String value) {
            addCriterion("WXShareSummary <", value, "wxsharesummary");
            return (Criteria) this;
        }

        public Criteria andWxsharesummaryLessThanOrEqualTo(String value) {
            addCriterion("WXShareSummary <=", value, "wxsharesummary");
            return (Criteria) this;
        }

        public Criteria andWxsharesummaryLike(String value) {
            addCriterion("WXShareSummary like", value, "wxsharesummary");
            return (Criteria) this;
        }

        public Criteria andWxsharesummaryNotLike(String value) {
            addCriterion("WXShareSummary not like", value, "wxsharesummary");
            return (Criteria) this;
        }

        public Criteria andWxsharesummaryIn(List<String> values) {
            addCriterion("WXShareSummary in", values, "wxsharesummary");
            return (Criteria) this;
        }

        public Criteria andWxsharesummaryNotIn(List<String> values) {
            addCriterion("WXShareSummary not in", values, "wxsharesummary");
            return (Criteria) this;
        }

        public Criteria andWxsharesummaryBetween(String value1, String value2) {
            addCriterion("WXShareSummary between", value1, value2, "wxsharesummary");
            return (Criteria) this;
        }

        public Criteria andWxsharesummaryNotBetween(String value1, String value2) {
            addCriterion("WXShareSummary not between", value1, value2, "wxsharesummary");
            return (Criteria) this;
        }

        public Criteria andTemplatetypeIsNull() {
            addCriterion("TemplateType is null");
            return (Criteria) this;
        }

        public Criteria andTemplatetypeIsNotNull() {
            addCriterion("TemplateType is not null");
            return (Criteria) this;
        }

        public Criteria andTemplatetypeEqualTo(Integer value) {
            addCriterion("TemplateType =", value, "templatetype");
            return (Criteria) this;
        }

        public Criteria andTemplatetypeNotEqualTo(Integer value) {
            addCriterion("TemplateType <>", value, "templatetype");
            return (Criteria) this;
        }

        public Criteria andTemplatetypeGreaterThan(Integer value) {
            addCriterion("TemplateType >", value, "templatetype");
            return (Criteria) this;
        }

        public Criteria andTemplatetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("TemplateType >=", value, "templatetype");
            return (Criteria) this;
        }

        public Criteria andTemplatetypeLessThan(Integer value) {
            addCriterion("TemplateType <", value, "templatetype");
            return (Criteria) this;
        }

        public Criteria andTemplatetypeLessThanOrEqualTo(Integer value) {
            addCriterion("TemplateType <=", value, "templatetype");
            return (Criteria) this;
        }

        public Criteria andTemplatetypeIn(List<Integer> values) {
            addCriterion("TemplateType in", values, "templatetype");
            return (Criteria) this;
        }

        public Criteria andTemplatetypeNotIn(List<Integer> values) {
            addCriterion("TemplateType not in", values, "templatetype");
            return (Criteria) this;
        }

        public Criteria andTemplatetypeBetween(Integer value1, Integer value2) {
            addCriterion("TemplateType between", value1, value2, "templatetype");
            return (Criteria) this;
        }

        public Criteria andTemplatetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("TemplateType not between", value1, value2, "templatetype");
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