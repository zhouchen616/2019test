package com.holyrobot.con_order.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdOrderTrainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdOrderTrainExample() {
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

        public Criteria andOrderidIsNull() {
            addCriterion("OrderID is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("OrderID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(String value) {
            addCriterion("OrderID =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(String value) {
            addCriterion("OrderID <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(String value) {
            addCriterion("OrderID >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("OrderID >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(String value) {
            addCriterion("OrderID <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(String value) {
            addCriterion("OrderID <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLike(String value) {
            addCriterion("OrderID like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotLike(String value) {
            addCriterion("OrderID not like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<String> values) {
            addCriterion("OrderID in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<String> values) {
            addCriterion("OrderID not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(String value1, String value2) {
            addCriterion("OrderID between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(String value1, String value2) {
            addCriterion("OrderID not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andVisitoridIsNull() {
            addCriterion("VisitorID is null");
            return (Criteria) this;
        }

        public Criteria andVisitoridIsNotNull() {
            addCriterion("VisitorID is not null");
            return (Criteria) this;
        }

        public Criteria andVisitoridEqualTo(String value) {
            addCriterion("VisitorID =", value, "visitorid");
            return (Criteria) this;
        }

        public Criteria andVisitoridNotEqualTo(String value) {
            addCriterion("VisitorID <>", value, "visitorid");
            return (Criteria) this;
        }

        public Criteria andVisitoridGreaterThan(String value) {
            addCriterion("VisitorID >", value, "visitorid");
            return (Criteria) this;
        }

        public Criteria andVisitoridGreaterThanOrEqualTo(String value) {
            addCriterion("VisitorID >=", value, "visitorid");
            return (Criteria) this;
        }

        public Criteria andVisitoridLessThan(String value) {
            addCriterion("VisitorID <", value, "visitorid");
            return (Criteria) this;
        }

        public Criteria andVisitoridLessThanOrEqualTo(String value) {
            addCriterion("VisitorID <=", value, "visitorid");
            return (Criteria) this;
        }

        public Criteria andVisitoridLike(String value) {
            addCriterion("VisitorID like", value, "visitorid");
            return (Criteria) this;
        }

        public Criteria andVisitoridNotLike(String value) {
            addCriterion("VisitorID not like", value, "visitorid");
            return (Criteria) this;
        }

        public Criteria andVisitoridIn(List<String> values) {
            addCriterion("VisitorID in", values, "visitorid");
            return (Criteria) this;
        }

        public Criteria andVisitoridNotIn(List<String> values) {
            addCriterion("VisitorID not in", values, "visitorid");
            return (Criteria) this;
        }

        public Criteria andVisitoridBetween(String value1, String value2) {
            addCriterion("VisitorID between", value1, value2, "visitorid");
            return (Criteria) this;
        }

        public Criteria andVisitoridNotBetween(String value1, String value2) {
            addCriterion("VisitorID not between", value1, value2, "visitorid");
            return (Criteria) this;
        }

        public Criteria andTraindateIsNull() {
            addCriterion("TrainDate is null");
            return (Criteria) this;
        }

        public Criteria andTraindateIsNotNull() {
            addCriterion("TrainDate is not null");
            return (Criteria) this;
        }

        public Criteria andTraindateEqualTo(Date value) {
            addCriterion("TrainDate =", value, "traindate");
            return (Criteria) this;
        }

        public Criteria andTraindateNotEqualTo(Date value) {
            addCriterion("TrainDate <>", value, "traindate");
            return (Criteria) this;
        }

        public Criteria andTraindateGreaterThan(Date value) {
            addCriterion("TrainDate >", value, "traindate");
            return (Criteria) this;
        }

        public Criteria andTraindateGreaterThanOrEqualTo(Date value) {
            addCriterion("TrainDate >=", value, "traindate");
            return (Criteria) this;
        }

        public Criteria andTraindateLessThan(Date value) {
            addCriterion("TrainDate <", value, "traindate");
            return (Criteria) this;
        }

        public Criteria andTraindateLessThanOrEqualTo(Date value) {
            addCriterion("TrainDate <=", value, "traindate");
            return (Criteria) this;
        }

        public Criteria andTraindateIn(List<Date> values) {
            addCriterion("TrainDate in", values, "traindate");
            return (Criteria) this;
        }

        public Criteria andTraindateNotIn(List<Date> values) {
            addCriterion("TrainDate not in", values, "traindate");
            return (Criteria) this;
        }

        public Criteria andTraindateBetween(Date value1, Date value2) {
            addCriterion("TrainDate between", value1, value2, "traindate");
            return (Criteria) this;
        }

        public Criteria andTraindateNotBetween(Date value1, Date value2) {
            addCriterion("TrainDate not between", value1, value2, "traindate");
            return (Criteria) this;
        }

        public Criteria andBeignstationIsNull() {
            addCriterion("BeignStation is null");
            return (Criteria) this;
        }

        public Criteria andBeignstationIsNotNull() {
            addCriterion("BeignStation is not null");
            return (Criteria) this;
        }

        public Criteria andBeignstationEqualTo(String value) {
            addCriterion("BeignStation =", value, "beignstation");
            return (Criteria) this;
        }

        public Criteria andBeignstationNotEqualTo(String value) {
            addCriterion("BeignStation <>", value, "beignstation");
            return (Criteria) this;
        }

        public Criteria andBeignstationGreaterThan(String value) {
            addCriterion("BeignStation >", value, "beignstation");
            return (Criteria) this;
        }

        public Criteria andBeignstationGreaterThanOrEqualTo(String value) {
            addCriterion("BeignStation >=", value, "beignstation");
            return (Criteria) this;
        }

        public Criteria andBeignstationLessThan(String value) {
            addCriterion("BeignStation <", value, "beignstation");
            return (Criteria) this;
        }

        public Criteria andBeignstationLessThanOrEqualTo(String value) {
            addCriterion("BeignStation <=", value, "beignstation");
            return (Criteria) this;
        }

        public Criteria andBeignstationLike(String value) {
            addCriterion("BeignStation like", value, "beignstation");
            return (Criteria) this;
        }

        public Criteria andBeignstationNotLike(String value) {
            addCriterion("BeignStation not like", value, "beignstation");
            return (Criteria) this;
        }

        public Criteria andBeignstationIn(List<String> values) {
            addCriterion("BeignStation in", values, "beignstation");
            return (Criteria) this;
        }

        public Criteria andBeignstationNotIn(List<String> values) {
            addCriterion("BeignStation not in", values, "beignstation");
            return (Criteria) this;
        }

        public Criteria andBeignstationBetween(String value1, String value2) {
            addCriterion("BeignStation between", value1, value2, "beignstation");
            return (Criteria) this;
        }

        public Criteria andBeignstationNotBetween(String value1, String value2) {
            addCriterion("BeignStation not between", value1, value2, "beignstation");
            return (Criteria) this;
        }

        public Criteria andEndstationIsNull() {
            addCriterion("EndStation is null");
            return (Criteria) this;
        }

        public Criteria andEndstationIsNotNull() {
            addCriterion("EndStation is not null");
            return (Criteria) this;
        }

        public Criteria andEndstationEqualTo(String value) {
            addCriterion("EndStation =", value, "endstation");
            return (Criteria) this;
        }

        public Criteria andEndstationNotEqualTo(String value) {
            addCriterion("EndStation <>", value, "endstation");
            return (Criteria) this;
        }

        public Criteria andEndstationGreaterThan(String value) {
            addCriterion("EndStation >", value, "endstation");
            return (Criteria) this;
        }

        public Criteria andEndstationGreaterThanOrEqualTo(String value) {
            addCriterion("EndStation >=", value, "endstation");
            return (Criteria) this;
        }

        public Criteria andEndstationLessThan(String value) {
            addCriterion("EndStation <", value, "endstation");
            return (Criteria) this;
        }

        public Criteria andEndstationLessThanOrEqualTo(String value) {
            addCriterion("EndStation <=", value, "endstation");
            return (Criteria) this;
        }

        public Criteria andEndstationLike(String value) {
            addCriterion("EndStation like", value, "endstation");
            return (Criteria) this;
        }

        public Criteria andEndstationNotLike(String value) {
            addCriterion("EndStation not like", value, "endstation");
            return (Criteria) this;
        }

        public Criteria andEndstationIn(List<String> values) {
            addCriterion("EndStation in", values, "endstation");
            return (Criteria) this;
        }

        public Criteria andEndstationNotIn(List<String> values) {
            addCriterion("EndStation not in", values, "endstation");
            return (Criteria) this;
        }

        public Criteria andEndstationBetween(String value1, String value2) {
            addCriterion("EndStation between", value1, value2, "endstation");
            return (Criteria) this;
        }

        public Criteria andEndstationNotBetween(String value1, String value2) {
            addCriterion("EndStation not between", value1, value2, "endstation");
            return (Criteria) this;
        }

        public Criteria andTrainnoIsNull() {
            addCriterion("TrainNo is null");
            return (Criteria) this;
        }

        public Criteria andTrainnoIsNotNull() {
            addCriterion("TrainNo is not null");
            return (Criteria) this;
        }

        public Criteria andTrainnoEqualTo(String value) {
            addCriterion("TrainNo =", value, "trainno");
            return (Criteria) this;
        }

        public Criteria andTrainnoNotEqualTo(String value) {
            addCriterion("TrainNo <>", value, "trainno");
            return (Criteria) this;
        }

        public Criteria andTrainnoGreaterThan(String value) {
            addCriterion("TrainNo >", value, "trainno");
            return (Criteria) this;
        }

        public Criteria andTrainnoGreaterThanOrEqualTo(String value) {
            addCriterion("TrainNo >=", value, "trainno");
            return (Criteria) this;
        }

        public Criteria andTrainnoLessThan(String value) {
            addCriterion("TrainNo <", value, "trainno");
            return (Criteria) this;
        }

        public Criteria andTrainnoLessThanOrEqualTo(String value) {
            addCriterion("TrainNo <=", value, "trainno");
            return (Criteria) this;
        }

        public Criteria andTrainnoLike(String value) {
            addCriterion("TrainNo like", value, "trainno");
            return (Criteria) this;
        }

        public Criteria andTrainnoNotLike(String value) {
            addCriterion("TrainNo not like", value, "trainno");
            return (Criteria) this;
        }

        public Criteria andTrainnoIn(List<String> values) {
            addCriterion("TrainNo in", values, "trainno");
            return (Criteria) this;
        }

        public Criteria andTrainnoNotIn(List<String> values) {
            addCriterion("TrainNo not in", values, "trainno");
            return (Criteria) this;
        }

        public Criteria andTrainnoBetween(String value1, String value2) {
            addCriterion("TrainNo between", value1, value2, "trainno");
            return (Criteria) this;
        }

        public Criteria andTrainnoNotBetween(String value1, String value2) {
            addCriterion("TrainNo not between", value1, value2, "trainno");
            return (Criteria) this;
        }

        public Criteria andXtypeIsNull() {
            addCriterion("xType is null");
            return (Criteria) this;
        }

        public Criteria andXtypeIsNotNull() {
            addCriterion("xType is not null");
            return (Criteria) this;
        }

        public Criteria andXtypeEqualTo(Integer value) {
            addCriterion("xType =", value, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeNotEqualTo(Integer value) {
            addCriterion("xType <>", value, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeGreaterThan(Integer value) {
            addCriterion("xType >", value, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("xType >=", value, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeLessThan(Integer value) {
            addCriterion("xType <", value, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeLessThanOrEqualTo(Integer value) {
            addCriterion("xType <=", value, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeIn(List<Integer> values) {
            addCriterion("xType in", values, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeNotIn(List<Integer> values) {
            addCriterion("xType not in", values, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeBetween(Integer value1, Integer value2) {
            addCriterion("xType between", value1, value2, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("xType not between", value1, value2, "xtype");
            return (Criteria) this;
        }

        public Criteria andTraintimeIsNull() {
            addCriterion("TrainTime is null");
            return (Criteria) this;
        }

        public Criteria andTraintimeIsNotNull() {
            addCriterion("TrainTime is not null");
            return (Criteria) this;
        }

        public Criteria andTraintimeEqualTo(String value) {
            addCriterion("TrainTime =", value, "traintime");
            return (Criteria) this;
        }

        public Criteria andTraintimeNotEqualTo(String value) {
            addCriterion("TrainTime <>", value, "traintime");
            return (Criteria) this;
        }

        public Criteria andTraintimeGreaterThan(String value) {
            addCriterion("TrainTime >", value, "traintime");
            return (Criteria) this;
        }

        public Criteria andTraintimeGreaterThanOrEqualTo(String value) {
            addCriterion("TrainTime >=", value, "traintime");
            return (Criteria) this;
        }

        public Criteria andTraintimeLessThan(String value) {
            addCriterion("TrainTime <", value, "traintime");
            return (Criteria) this;
        }

        public Criteria andTraintimeLessThanOrEqualTo(String value) {
            addCriterion("TrainTime <=", value, "traintime");
            return (Criteria) this;
        }

        public Criteria andTraintimeLike(String value) {
            addCriterion("TrainTime like", value, "traintime");
            return (Criteria) this;
        }

        public Criteria andTraintimeNotLike(String value) {
            addCriterion("TrainTime not like", value, "traintime");
            return (Criteria) this;
        }

        public Criteria andTraintimeIn(List<String> values) {
            addCriterion("TrainTime in", values, "traintime");
            return (Criteria) this;
        }

        public Criteria andTraintimeNotIn(List<String> values) {
            addCriterion("TrainTime not in", values, "traintime");
            return (Criteria) this;
        }

        public Criteria andTraintimeBetween(String value1, String value2) {
            addCriterion("TrainTime between", value1, value2, "traintime");
            return (Criteria) this;
        }

        public Criteria andTraintimeNotBetween(String value1, String value2) {
            addCriterion("TrainTime not between", value1, value2, "traintime");
            return (Criteria) this;
        }

        public Criteria andTrainidIsNull() {
            addCriterion("TrainID is null");
            return (Criteria) this;
        }

        public Criteria andTrainidIsNotNull() {
            addCriterion("TrainID is not null");
            return (Criteria) this;
        }

        public Criteria andTrainidEqualTo(String value) {
            addCriterion("TrainID =", value, "trainid");
            return (Criteria) this;
        }

        public Criteria andTrainidNotEqualTo(String value) {
            addCriterion("TrainID <>", value, "trainid");
            return (Criteria) this;
        }

        public Criteria andTrainidGreaterThan(String value) {
            addCriterion("TrainID >", value, "trainid");
            return (Criteria) this;
        }

        public Criteria andTrainidGreaterThanOrEqualTo(String value) {
            addCriterion("TrainID >=", value, "trainid");
            return (Criteria) this;
        }

        public Criteria andTrainidLessThan(String value) {
            addCriterion("TrainID <", value, "trainid");
            return (Criteria) this;
        }

        public Criteria andTrainidLessThanOrEqualTo(String value) {
            addCriterion("TrainID <=", value, "trainid");
            return (Criteria) this;
        }

        public Criteria andTrainidLike(String value) {
            addCriterion("TrainID like", value, "trainid");
            return (Criteria) this;
        }

        public Criteria andTrainidNotLike(String value) {
            addCriterion("TrainID not like", value, "trainid");
            return (Criteria) this;
        }

        public Criteria andTrainidIn(List<String> values) {
            addCriterion("TrainID in", values, "trainid");
            return (Criteria) this;
        }

        public Criteria andTrainidNotIn(List<String> values) {
            addCriterion("TrainID not in", values, "trainid");
            return (Criteria) this;
        }

        public Criteria andTrainidBetween(String value1, String value2) {
            addCriterion("TrainID between", value1, value2, "trainid");
            return (Criteria) this;
        }

        public Criteria andTrainidNotBetween(String value1, String value2) {
            addCriterion("TrainID not between", value1, value2, "trainid");
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

        public Criteria andFinastatusIsNull() {
            addCriterion("FinaStatus is null");
            return (Criteria) this;
        }

        public Criteria andFinastatusIsNotNull() {
            addCriterion("FinaStatus is not null");
            return (Criteria) this;
        }

        public Criteria andFinastatusEqualTo(Integer value) {
            addCriterion("FinaStatus =", value, "finastatus");
            return (Criteria) this;
        }

        public Criteria andFinastatusNotEqualTo(Integer value) {
            addCriterion("FinaStatus <>", value, "finastatus");
            return (Criteria) this;
        }

        public Criteria andFinastatusGreaterThan(Integer value) {
            addCriterion("FinaStatus >", value, "finastatus");
            return (Criteria) this;
        }

        public Criteria andFinastatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("FinaStatus >=", value, "finastatus");
            return (Criteria) this;
        }

        public Criteria andFinastatusLessThan(Integer value) {
            addCriterion("FinaStatus <", value, "finastatus");
            return (Criteria) this;
        }

        public Criteria andFinastatusLessThanOrEqualTo(Integer value) {
            addCriterion("FinaStatus <=", value, "finastatus");
            return (Criteria) this;
        }

        public Criteria andFinastatusIn(List<Integer> values) {
            addCriterion("FinaStatus in", values, "finastatus");
            return (Criteria) this;
        }

        public Criteria andFinastatusNotIn(List<Integer> values) {
            addCriterion("FinaStatus not in", values, "finastatus");
            return (Criteria) this;
        }

        public Criteria andFinastatusBetween(Integer value1, Integer value2) {
            addCriterion("FinaStatus between", value1, value2, "finastatus");
            return (Criteria) this;
        }

        public Criteria andFinastatusNotBetween(Integer value1, Integer value2) {
            addCriterion("FinaStatus not between", value1, value2, "finastatus");
            return (Criteria) this;
        }

        public Criteria andTicketnoIsNull() {
            addCriterion("TicketNo is null");
            return (Criteria) this;
        }

        public Criteria andTicketnoIsNotNull() {
            addCriterion("TicketNo is not null");
            return (Criteria) this;
        }

        public Criteria andTicketnoEqualTo(String value) {
            addCriterion("TicketNo =", value, "ticketno");
            return (Criteria) this;
        }

        public Criteria andTicketnoNotEqualTo(String value) {
            addCriterion("TicketNo <>", value, "ticketno");
            return (Criteria) this;
        }

        public Criteria andTicketnoGreaterThan(String value) {
            addCriterion("TicketNo >", value, "ticketno");
            return (Criteria) this;
        }

        public Criteria andTicketnoGreaterThanOrEqualTo(String value) {
            addCriterion("TicketNo >=", value, "ticketno");
            return (Criteria) this;
        }

        public Criteria andTicketnoLessThan(String value) {
            addCriterion("TicketNo <", value, "ticketno");
            return (Criteria) this;
        }

        public Criteria andTicketnoLessThanOrEqualTo(String value) {
            addCriterion("TicketNo <=", value, "ticketno");
            return (Criteria) this;
        }

        public Criteria andTicketnoLike(String value) {
            addCriterion("TicketNo like", value, "ticketno");
            return (Criteria) this;
        }

        public Criteria andTicketnoNotLike(String value) {
            addCriterion("TicketNo not like", value, "ticketno");
            return (Criteria) this;
        }

        public Criteria andTicketnoIn(List<String> values) {
            addCriterion("TicketNo in", values, "ticketno");
            return (Criteria) this;
        }

        public Criteria andTicketnoNotIn(List<String> values) {
            addCriterion("TicketNo not in", values, "ticketno");
            return (Criteria) this;
        }

        public Criteria andTicketnoBetween(String value1, String value2) {
            addCriterion("TicketNo between", value1, value2, "ticketno");
            return (Criteria) this;
        }

        public Criteria andTicketnoNotBetween(String value1, String value2) {
            addCriterion("TicketNo not between", value1, value2, "ticketno");
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