package com.holyrobot.con_common.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class H5ShopCommentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public H5ShopCommentsExample() {
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

        public Criteria andOrderidIsNull() {
            addCriterion("OrderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("OrderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(String value) {
            addCriterion("OrderId =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(String value) {
            addCriterion("OrderId <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(String value) {
            addCriterion("OrderId >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("OrderId >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(String value) {
            addCriterion("OrderId <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(String value) {
            addCriterion("OrderId <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLike(String value) {
            addCriterion("OrderId like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotLike(String value) {
            addCriterion("OrderId not like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<String> values) {
            addCriterion("OrderId in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<String> values) {
            addCriterion("OrderId not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(String value1, String value2) {
            addCriterion("OrderId between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(String value1, String value2) {
            addCriterion("OrderId not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andProidIsNull() {
            addCriterion("ProId is null");
            return (Criteria) this;
        }

        public Criteria andProidIsNotNull() {
            addCriterion("ProId is not null");
            return (Criteria) this;
        }

        public Criteria andProidEqualTo(String value) {
            addCriterion("ProId =", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotEqualTo(String value) {
            addCriterion("ProId <>", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidGreaterThan(String value) {
            addCriterion("ProId >", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidGreaterThanOrEqualTo(String value) {
            addCriterion("ProId >=", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidLessThan(String value) {
            addCriterion("ProId <", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidLessThanOrEqualTo(String value) {
            addCriterion("ProId <=", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidLike(String value) {
            addCriterion("ProId like", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotLike(String value) {
            addCriterion("ProId not like", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidIn(List<String> values) {
            addCriterion("ProId in", values, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotIn(List<String> values) {
            addCriterion("ProId not in", values, "proid");
            return (Criteria) this;
        }

        public Criteria andProidBetween(String value1, String value2) {
            addCriterion("ProId between", value1, value2, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotBetween(String value1, String value2) {
            addCriterion("ProId not between", value1, value2, "proid");
            return (Criteria) this;
        }

        public Criteria andAliassnameIsNull() {
            addCriterion("AliassName is null");
            return (Criteria) this;
        }

        public Criteria andAliassnameIsNotNull() {
            addCriterion("AliassName is not null");
            return (Criteria) this;
        }

        public Criteria andAliassnameEqualTo(String value) {
            addCriterion("AliassName =", value, "aliassname");
            return (Criteria) this;
        }

        public Criteria andAliassnameNotEqualTo(String value) {
            addCriterion("AliassName <>", value, "aliassname");
            return (Criteria) this;
        }

        public Criteria andAliassnameGreaterThan(String value) {
            addCriterion("AliassName >", value, "aliassname");
            return (Criteria) this;
        }

        public Criteria andAliassnameGreaterThanOrEqualTo(String value) {
            addCriterion("AliassName >=", value, "aliassname");
            return (Criteria) this;
        }

        public Criteria andAliassnameLessThan(String value) {
            addCriterion("AliassName <", value, "aliassname");
            return (Criteria) this;
        }

        public Criteria andAliassnameLessThanOrEqualTo(String value) {
            addCriterion("AliassName <=", value, "aliassname");
            return (Criteria) this;
        }

        public Criteria andAliassnameLike(String value) {
            addCriterion("AliassName like", value, "aliassname");
            return (Criteria) this;
        }

        public Criteria andAliassnameNotLike(String value) {
            addCriterion("AliassName not like", value, "aliassname");
            return (Criteria) this;
        }

        public Criteria andAliassnameIn(List<String> values) {
            addCriterion("AliassName in", values, "aliassname");
            return (Criteria) this;
        }

        public Criteria andAliassnameNotIn(List<String> values) {
            addCriterion("AliassName not in", values, "aliassname");
            return (Criteria) this;
        }

        public Criteria andAliassnameBetween(String value1, String value2) {
            addCriterion("AliassName between", value1, value2, "aliassname");
            return (Criteria) this;
        }

        public Criteria andAliassnameNotBetween(String value1, String value2) {
            addCriterion("AliassName not between", value1, value2, "aliassname");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNull() {
            addCriterion("Comments is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNotNull() {
            addCriterion("Comments is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsEqualTo(String value) {
            addCriterion("Comments =", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotEqualTo(String value) {
            addCriterion("Comments <>", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThan(String value) {
            addCriterion("Comments >", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("Comments >=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThan(String value) {
            addCriterion("Comments <", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThanOrEqualTo(String value) {
            addCriterion("Comments <=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLike(String value) {
            addCriterion("Comments like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotLike(String value) {
            addCriterion("Comments not like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsIn(List<String> values) {
            addCriterion("Comments in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotIn(List<String> values) {
            addCriterion("Comments not in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsBetween(String value1, String value2) {
            addCriterion("Comments between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotBetween(String value1, String value2) {
            addCriterion("Comments not between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andTourevaluationIsNull() {
            addCriterion("TourEvaluation is null");
            return (Criteria) this;
        }

        public Criteria andTourevaluationIsNotNull() {
            addCriterion("TourEvaluation is not null");
            return (Criteria) this;
        }

        public Criteria andTourevaluationEqualTo(String value) {
            addCriterion("TourEvaluation =", value, "tourevaluation");
            return (Criteria) this;
        }

        public Criteria andTourevaluationNotEqualTo(String value) {
            addCriterion("TourEvaluation <>", value, "tourevaluation");
            return (Criteria) this;
        }

        public Criteria andTourevaluationGreaterThan(String value) {
            addCriterion("TourEvaluation >", value, "tourevaluation");
            return (Criteria) this;
        }

        public Criteria andTourevaluationGreaterThanOrEqualTo(String value) {
            addCriterion("TourEvaluation >=", value, "tourevaluation");
            return (Criteria) this;
        }

        public Criteria andTourevaluationLessThan(String value) {
            addCriterion("TourEvaluation <", value, "tourevaluation");
            return (Criteria) this;
        }

        public Criteria andTourevaluationLessThanOrEqualTo(String value) {
            addCriterion("TourEvaluation <=", value, "tourevaluation");
            return (Criteria) this;
        }

        public Criteria andTourevaluationLike(String value) {
            addCriterion("TourEvaluation like", value, "tourevaluation");
            return (Criteria) this;
        }

        public Criteria andTourevaluationNotLike(String value) {
            addCriterion("TourEvaluation not like", value, "tourevaluation");
            return (Criteria) this;
        }

        public Criteria andTourevaluationIn(List<String> values) {
            addCriterion("TourEvaluation in", values, "tourevaluation");
            return (Criteria) this;
        }

        public Criteria andTourevaluationNotIn(List<String> values) {
            addCriterion("TourEvaluation not in", values, "tourevaluation");
            return (Criteria) this;
        }

        public Criteria andTourevaluationBetween(String value1, String value2) {
            addCriterion("TourEvaluation between", value1, value2, "tourevaluation");
            return (Criteria) this;
        }

        public Criteria andTourevaluationNotBetween(String value1, String value2) {
            addCriterion("TourEvaluation not between", value1, value2, "tourevaluation");
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

        public Criteria andAccommodationIsNull() {
            addCriterion("Accommodation is null");
            return (Criteria) this;
        }

        public Criteria andAccommodationIsNotNull() {
            addCriterion("Accommodation is not null");
            return (Criteria) this;
        }

        public Criteria andAccommodationEqualTo(String value) {
            addCriterion("Accommodation =", value, "accommodation");
            return (Criteria) this;
        }

        public Criteria andAccommodationNotEqualTo(String value) {
            addCriterion("Accommodation <>", value, "accommodation");
            return (Criteria) this;
        }

        public Criteria andAccommodationGreaterThan(String value) {
            addCriterion("Accommodation >", value, "accommodation");
            return (Criteria) this;
        }

        public Criteria andAccommodationGreaterThanOrEqualTo(String value) {
            addCriterion("Accommodation >=", value, "accommodation");
            return (Criteria) this;
        }

        public Criteria andAccommodationLessThan(String value) {
            addCriterion("Accommodation <", value, "accommodation");
            return (Criteria) this;
        }

        public Criteria andAccommodationLessThanOrEqualTo(String value) {
            addCriterion("Accommodation <=", value, "accommodation");
            return (Criteria) this;
        }

        public Criteria andAccommodationLike(String value) {
            addCriterion("Accommodation like", value, "accommodation");
            return (Criteria) this;
        }

        public Criteria andAccommodationNotLike(String value) {
            addCriterion("Accommodation not like", value, "accommodation");
            return (Criteria) this;
        }

        public Criteria andAccommodationIn(List<String> values) {
            addCriterion("Accommodation in", values, "accommodation");
            return (Criteria) this;
        }

        public Criteria andAccommodationNotIn(List<String> values) {
            addCriterion("Accommodation not in", values, "accommodation");
            return (Criteria) this;
        }

        public Criteria andAccommodationBetween(String value1, String value2) {
            addCriterion("Accommodation between", value1, value2, "accommodation");
            return (Criteria) this;
        }

        public Criteria andAccommodationNotBetween(String value1, String value2) {
            addCriterion("Accommodation not between", value1, value2, "accommodation");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("CreateDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("CreateDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterionForJDBCDate("CreateDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CreateDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("CreateDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CreateDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterionForJDBCDate("CreateDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CreateDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterionForJDBCDate("CreateDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CreateDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CreateDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CreateDate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreaternameIsNull() {
            addCriterion("CreaterName is null");
            return (Criteria) this;
        }

        public Criteria andCreaternameIsNotNull() {
            addCriterion("CreaterName is not null");
            return (Criteria) this;
        }

        public Criteria andCreaternameEqualTo(String value) {
            addCriterion("CreaterName =", value, "creatername");
            return (Criteria) this;
        }

        public Criteria andCreaternameNotEqualTo(String value) {
            addCriterion("CreaterName <>", value, "creatername");
            return (Criteria) this;
        }

        public Criteria andCreaternameGreaterThan(String value) {
            addCriterion("CreaterName >", value, "creatername");
            return (Criteria) this;
        }

        public Criteria andCreaternameGreaterThanOrEqualTo(String value) {
            addCriterion("CreaterName >=", value, "creatername");
            return (Criteria) this;
        }

        public Criteria andCreaternameLessThan(String value) {
            addCriterion("CreaterName <", value, "creatername");
            return (Criteria) this;
        }

        public Criteria andCreaternameLessThanOrEqualTo(String value) {
            addCriterion("CreaterName <=", value, "creatername");
            return (Criteria) this;
        }

        public Criteria andCreaternameLike(String value) {
            addCriterion("CreaterName like", value, "creatername");
            return (Criteria) this;
        }

        public Criteria andCreaternameNotLike(String value) {
            addCriterion("CreaterName not like", value, "creatername");
            return (Criteria) this;
        }

        public Criteria andCreaternameIn(List<String> values) {
            addCriterion("CreaterName in", values, "creatername");
            return (Criteria) this;
        }

        public Criteria andCreaternameNotIn(List<String> values) {
            addCriterion("CreaterName not in", values, "creatername");
            return (Criteria) this;
        }

        public Criteria andCreaternameBetween(String value1, String value2) {
            addCriterion("CreaterName between", value1, value2, "creatername");
            return (Criteria) this;
        }

        public Criteria andCreaternameNotBetween(String value1, String value2) {
            addCriterion("CreaterName not between", value1, value2, "creatername");
            return (Criteria) this;
        }

        public Criteria andCreateidIsNull() {
            addCriterion("CreateId is null");
            return (Criteria) this;
        }

        public Criteria andCreateidIsNotNull() {
            addCriterion("CreateId is not null");
            return (Criteria) this;
        }

        public Criteria andCreateidEqualTo(String value) {
            addCriterion("CreateId =", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidNotEqualTo(String value) {
            addCriterion("CreateId <>", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidGreaterThan(String value) {
            addCriterion("CreateId >", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidGreaterThanOrEqualTo(String value) {
            addCriterion("CreateId >=", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidLessThan(String value) {
            addCriterion("CreateId <", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidLessThanOrEqualTo(String value) {
            addCriterion("CreateId <=", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidLike(String value) {
            addCriterion("CreateId like", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidNotLike(String value) {
            addCriterion("CreateId not like", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidIn(List<String> values) {
            addCriterion("CreateId in", values, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidNotIn(List<String> values) {
            addCriterion("CreateId not in", values, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidBetween(String value1, String value2) {
            addCriterion("CreateId between", value1, value2, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidNotBetween(String value1, String value2) {
            addCriterion("CreateId not between", value1, value2, "createid");
            return (Criteria) this;
        }

        public Criteria andImgurlsIsNull() {
            addCriterion("ImgUrls is null");
            return (Criteria) this;
        }

        public Criteria andImgurlsIsNotNull() {
            addCriterion("ImgUrls is not null");
            return (Criteria) this;
        }

        public Criteria andImgurlsEqualTo(String value) {
            addCriterion("ImgUrls =", value, "imgurls");
            return (Criteria) this;
        }

        public Criteria andImgurlsNotEqualTo(String value) {
            addCriterion("ImgUrls <>", value, "imgurls");
            return (Criteria) this;
        }

        public Criteria andImgurlsGreaterThan(String value) {
            addCriterion("ImgUrls >", value, "imgurls");
            return (Criteria) this;
        }

        public Criteria andImgurlsGreaterThanOrEqualTo(String value) {
            addCriterion("ImgUrls >=", value, "imgurls");
            return (Criteria) this;
        }

        public Criteria andImgurlsLessThan(String value) {
            addCriterion("ImgUrls <", value, "imgurls");
            return (Criteria) this;
        }

        public Criteria andImgurlsLessThanOrEqualTo(String value) {
            addCriterion("ImgUrls <=", value, "imgurls");
            return (Criteria) this;
        }

        public Criteria andImgurlsLike(String value) {
            addCriterion("ImgUrls like", value, "imgurls");
            return (Criteria) this;
        }

        public Criteria andImgurlsNotLike(String value) {
            addCriterion("ImgUrls not like", value, "imgurls");
            return (Criteria) this;
        }

        public Criteria andImgurlsIn(List<String> values) {
            addCriterion("ImgUrls in", values, "imgurls");
            return (Criteria) this;
        }

        public Criteria andImgurlsNotIn(List<String> values) {
            addCriterion("ImgUrls not in", values, "imgurls");
            return (Criteria) this;
        }

        public Criteria andImgurlsBetween(String value1, String value2) {
            addCriterion("ImgUrls between", value1, value2, "imgurls");
            return (Criteria) this;
        }

        public Criteria andImgurlsNotBetween(String value1, String value2) {
            addCriterion("ImgUrls not between", value1, value2, "imgurls");
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