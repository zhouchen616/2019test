package com.holyrobot.con_order.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdOrderFlightExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdOrderFlightExample() {
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

        public Criteria andFlightdateIsNull() {
            addCriterion("FlightDate is null");
            return (Criteria) this;
        }

        public Criteria andFlightdateIsNotNull() {
            addCriterion("FlightDate is not null");
            return (Criteria) this;
        }

        public Criteria andFlightdateEqualTo(Date value) {
            addCriterion("FlightDate =", value, "flightdate");
            return (Criteria) this;
        }

        public Criteria andFlightdateNotEqualTo(Date value) {
            addCriterion("FlightDate <>", value, "flightdate");
            return (Criteria) this;
        }

        public Criteria andFlightdateGreaterThan(Date value) {
            addCriterion("FlightDate >", value, "flightdate");
            return (Criteria) this;
        }

        public Criteria andFlightdateGreaterThanOrEqualTo(Date value) {
            addCriterion("FlightDate >=", value, "flightdate");
            return (Criteria) this;
        }

        public Criteria andFlightdateLessThan(Date value) {
            addCriterion("FlightDate <", value, "flightdate");
            return (Criteria) this;
        }

        public Criteria andFlightdateLessThanOrEqualTo(Date value) {
            addCriterion("FlightDate <=", value, "flightdate");
            return (Criteria) this;
        }

        public Criteria andFlightdateIn(List<Date> values) {
            addCriterion("FlightDate in", values, "flightdate");
            return (Criteria) this;
        }

        public Criteria andFlightdateNotIn(List<Date> values) {
            addCriterion("FlightDate not in", values, "flightdate");
            return (Criteria) this;
        }

        public Criteria andFlightdateBetween(Date value1, Date value2) {
            addCriterion("FlightDate between", value1, value2, "flightdate");
            return (Criteria) this;
        }

        public Criteria andFlightdateNotBetween(Date value1, Date value2) {
            addCriterion("FlightDate not between", value1, value2, "flightdate");
            return (Criteria) this;
        }

        public Criteria andFlightnoIsNull() {
            addCriterion("FlightNo is null");
            return (Criteria) this;
        }

        public Criteria andFlightnoIsNotNull() {
            addCriterion("FlightNo is not null");
            return (Criteria) this;
        }

        public Criteria andFlightnoEqualTo(String value) {
            addCriterion("FlightNo =", value, "flightno");
            return (Criteria) this;
        }

        public Criteria andFlightnoNotEqualTo(String value) {
            addCriterion("FlightNo <>", value, "flightno");
            return (Criteria) this;
        }

        public Criteria andFlightnoGreaterThan(String value) {
            addCriterion("FlightNo >", value, "flightno");
            return (Criteria) this;
        }

        public Criteria andFlightnoGreaterThanOrEqualTo(String value) {
            addCriterion("FlightNo >=", value, "flightno");
            return (Criteria) this;
        }

        public Criteria andFlightnoLessThan(String value) {
            addCriterion("FlightNo <", value, "flightno");
            return (Criteria) this;
        }

        public Criteria andFlightnoLessThanOrEqualTo(String value) {
            addCriterion("FlightNo <=", value, "flightno");
            return (Criteria) this;
        }

        public Criteria andFlightnoLike(String value) {
            addCriterion("FlightNo like", value, "flightno");
            return (Criteria) this;
        }

        public Criteria andFlightnoNotLike(String value) {
            addCriterion("FlightNo not like", value, "flightno");
            return (Criteria) this;
        }

        public Criteria andFlightnoIn(List<String> values) {
            addCriterion("FlightNo in", values, "flightno");
            return (Criteria) this;
        }

        public Criteria andFlightnoNotIn(List<String> values) {
            addCriterion("FlightNo not in", values, "flightno");
            return (Criteria) this;
        }

        public Criteria andFlightnoBetween(String value1, String value2) {
            addCriterion("FlightNo between", value1, value2, "flightno");
            return (Criteria) this;
        }

        public Criteria andFlightnoNotBetween(String value1, String value2) {
            addCriterion("FlightNo not between", value1, value2, "flightno");
            return (Criteria) this;
        }

        public Criteria andBegincityIsNull() {
            addCriterion("BeginCity is null");
            return (Criteria) this;
        }

        public Criteria andBegincityIsNotNull() {
            addCriterion("BeginCity is not null");
            return (Criteria) this;
        }

        public Criteria andBegincityEqualTo(String value) {
            addCriterion("BeginCity =", value, "begincity");
            return (Criteria) this;
        }

        public Criteria andBegincityNotEqualTo(String value) {
            addCriterion("BeginCity <>", value, "begincity");
            return (Criteria) this;
        }

        public Criteria andBegincityGreaterThan(String value) {
            addCriterion("BeginCity >", value, "begincity");
            return (Criteria) this;
        }

        public Criteria andBegincityGreaterThanOrEqualTo(String value) {
            addCriterion("BeginCity >=", value, "begincity");
            return (Criteria) this;
        }

        public Criteria andBegincityLessThan(String value) {
            addCriterion("BeginCity <", value, "begincity");
            return (Criteria) this;
        }

        public Criteria andBegincityLessThanOrEqualTo(String value) {
            addCriterion("BeginCity <=", value, "begincity");
            return (Criteria) this;
        }

        public Criteria andBegincityLike(String value) {
            addCriterion("BeginCity like", value, "begincity");
            return (Criteria) this;
        }

        public Criteria andBegincityNotLike(String value) {
            addCriterion("BeginCity not like", value, "begincity");
            return (Criteria) this;
        }

        public Criteria andBegincityIn(List<String> values) {
            addCriterion("BeginCity in", values, "begincity");
            return (Criteria) this;
        }

        public Criteria andBegincityNotIn(List<String> values) {
            addCriterion("BeginCity not in", values, "begincity");
            return (Criteria) this;
        }

        public Criteria andBegincityBetween(String value1, String value2) {
            addCriterion("BeginCity between", value1, value2, "begincity");
            return (Criteria) this;
        }

        public Criteria andBegincityNotBetween(String value1, String value2) {
            addCriterion("BeginCity not between", value1, value2, "begincity");
            return (Criteria) this;
        }

        public Criteria andEndcityIsNull() {
            addCriterion("EndCity is null");
            return (Criteria) this;
        }

        public Criteria andEndcityIsNotNull() {
            addCriterion("EndCity is not null");
            return (Criteria) this;
        }

        public Criteria andEndcityEqualTo(String value) {
            addCriterion("EndCity =", value, "endcity");
            return (Criteria) this;
        }

        public Criteria andEndcityNotEqualTo(String value) {
            addCriterion("EndCity <>", value, "endcity");
            return (Criteria) this;
        }

        public Criteria andEndcityGreaterThan(String value) {
            addCriterion("EndCity >", value, "endcity");
            return (Criteria) this;
        }

        public Criteria andEndcityGreaterThanOrEqualTo(String value) {
            addCriterion("EndCity >=", value, "endcity");
            return (Criteria) this;
        }

        public Criteria andEndcityLessThan(String value) {
            addCriterion("EndCity <", value, "endcity");
            return (Criteria) this;
        }

        public Criteria andEndcityLessThanOrEqualTo(String value) {
            addCriterion("EndCity <=", value, "endcity");
            return (Criteria) this;
        }

        public Criteria andEndcityLike(String value) {
            addCriterion("EndCity like", value, "endcity");
            return (Criteria) this;
        }

        public Criteria andEndcityNotLike(String value) {
            addCriterion("EndCity not like", value, "endcity");
            return (Criteria) this;
        }

        public Criteria andEndcityIn(List<String> values) {
            addCriterion("EndCity in", values, "endcity");
            return (Criteria) this;
        }

        public Criteria andEndcityNotIn(List<String> values) {
            addCriterion("EndCity not in", values, "endcity");
            return (Criteria) this;
        }

        public Criteria andEndcityBetween(String value1, String value2) {
            addCriterion("EndCity between", value1, value2, "endcity");
            return (Criteria) this;
        }

        public Criteria andEndcityNotBetween(String value1, String value2) {
            addCriterion("EndCity not between", value1, value2, "endcity");
            return (Criteria) this;
        }

        public Criteria andFlighttimeIsNull() {
            addCriterion("FlightTime is null");
            return (Criteria) this;
        }

        public Criteria andFlighttimeIsNotNull() {
            addCriterion("FlightTime is not null");
            return (Criteria) this;
        }

        public Criteria andFlighttimeEqualTo(String value) {
            addCriterion("FlightTime =", value, "flighttime");
            return (Criteria) this;
        }

        public Criteria andFlighttimeNotEqualTo(String value) {
            addCriterion("FlightTime <>", value, "flighttime");
            return (Criteria) this;
        }

        public Criteria andFlighttimeGreaterThan(String value) {
            addCriterion("FlightTime >", value, "flighttime");
            return (Criteria) this;
        }

        public Criteria andFlighttimeGreaterThanOrEqualTo(String value) {
            addCriterion("FlightTime >=", value, "flighttime");
            return (Criteria) this;
        }

        public Criteria andFlighttimeLessThan(String value) {
            addCriterion("FlightTime <", value, "flighttime");
            return (Criteria) this;
        }

        public Criteria andFlighttimeLessThanOrEqualTo(String value) {
            addCriterion("FlightTime <=", value, "flighttime");
            return (Criteria) this;
        }

        public Criteria andFlighttimeLike(String value) {
            addCriterion("FlightTime like", value, "flighttime");
            return (Criteria) this;
        }

        public Criteria andFlighttimeNotLike(String value) {
            addCriterion("FlightTime not like", value, "flighttime");
            return (Criteria) this;
        }

        public Criteria andFlighttimeIn(List<String> values) {
            addCriterion("FlightTime in", values, "flighttime");
            return (Criteria) this;
        }

        public Criteria andFlighttimeNotIn(List<String> values) {
            addCriterion("FlightTime not in", values, "flighttime");
            return (Criteria) this;
        }

        public Criteria andFlighttimeBetween(String value1, String value2) {
            addCriterion("FlightTime between", value1, value2, "flighttime");
            return (Criteria) this;
        }

        public Criteria andFlighttimeNotBetween(String value1, String value2) {
            addCriterion("FlightTime not between", value1, value2, "flighttime");
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

        public Criteria andFlightidIsNull() {
            addCriterion("FlightID is null");
            return (Criteria) this;
        }

        public Criteria andFlightidIsNotNull() {
            addCriterion("FlightID is not null");
            return (Criteria) this;
        }

        public Criteria andFlightidEqualTo(String value) {
            addCriterion("FlightID =", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidNotEqualTo(String value) {
            addCriterion("FlightID <>", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidGreaterThan(String value) {
            addCriterion("FlightID >", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidGreaterThanOrEqualTo(String value) {
            addCriterion("FlightID >=", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidLessThan(String value) {
            addCriterion("FlightID <", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidLessThanOrEqualTo(String value) {
            addCriterion("FlightID <=", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidLike(String value) {
            addCriterion("FlightID like", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidNotLike(String value) {
            addCriterion("FlightID not like", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidIn(List<String> values) {
            addCriterion("FlightID in", values, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidNotIn(List<String> values) {
            addCriterion("FlightID not in", values, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidBetween(String value1, String value2) {
            addCriterion("FlightID between", value1, value2, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidNotBetween(String value1, String value2) {
            addCriterion("FlightID not between", value1, value2, "flightid");
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

        public Criteria andBooktypeIsNull() {
            addCriterion("BookType is null");
            return (Criteria) this;
        }

        public Criteria andBooktypeIsNotNull() {
            addCriterion("BookType is not null");
            return (Criteria) this;
        }

        public Criteria andBooktypeEqualTo(Integer value) {
            addCriterion("BookType =", value, "booktype");
            return (Criteria) this;
        }

        public Criteria andBooktypeNotEqualTo(Integer value) {
            addCriterion("BookType <>", value, "booktype");
            return (Criteria) this;
        }

        public Criteria andBooktypeGreaterThan(Integer value) {
            addCriterion("BookType >", value, "booktype");
            return (Criteria) this;
        }

        public Criteria andBooktypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("BookType >=", value, "booktype");
            return (Criteria) this;
        }

        public Criteria andBooktypeLessThan(Integer value) {
            addCriterion("BookType <", value, "booktype");
            return (Criteria) this;
        }

        public Criteria andBooktypeLessThanOrEqualTo(Integer value) {
            addCriterion("BookType <=", value, "booktype");
            return (Criteria) this;
        }

        public Criteria andBooktypeIn(List<Integer> values) {
            addCriterion("BookType in", values, "booktype");
            return (Criteria) this;
        }

        public Criteria andBooktypeNotIn(List<Integer> values) {
            addCriterion("BookType not in", values, "booktype");
            return (Criteria) this;
        }

        public Criteria andBooktypeBetween(Integer value1, Integer value2) {
            addCriterion("BookType between", value1, value2, "booktype");
            return (Criteria) this;
        }

        public Criteria andBooktypeNotBetween(Integer value1, Integer value2) {
            addCriterion("BookType not between", value1, value2, "booktype");
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