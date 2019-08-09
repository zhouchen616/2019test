package com.holyrobot.con_res.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResFlightinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResFlightinfoExample() {
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

        public Criteria andPlaneIsNull() {
            addCriterion("Plane is null");
            return (Criteria) this;
        }

        public Criteria andPlaneIsNotNull() {
            addCriterion("Plane is not null");
            return (Criteria) this;
        }

        public Criteria andPlaneEqualTo(String value) {
            addCriterion("Plane =", value, "plane");
            return (Criteria) this;
        }

        public Criteria andPlaneNotEqualTo(String value) {
            addCriterion("Plane <>", value, "plane");
            return (Criteria) this;
        }

        public Criteria andPlaneGreaterThan(String value) {
            addCriterion("Plane >", value, "plane");
            return (Criteria) this;
        }

        public Criteria andPlaneGreaterThanOrEqualTo(String value) {
            addCriterion("Plane >=", value, "plane");
            return (Criteria) this;
        }

        public Criteria andPlaneLessThan(String value) {
            addCriterion("Plane <", value, "plane");
            return (Criteria) this;
        }

        public Criteria andPlaneLessThanOrEqualTo(String value) {
            addCriterion("Plane <=", value, "plane");
            return (Criteria) this;
        }

        public Criteria andPlaneLike(String value) {
            addCriterion("Plane like", value, "plane");
            return (Criteria) this;
        }

        public Criteria andPlaneNotLike(String value) {
            addCriterion("Plane not like", value, "plane");
            return (Criteria) this;
        }

        public Criteria andPlaneIn(List<String> values) {
            addCriterion("Plane in", values, "plane");
            return (Criteria) this;
        }

        public Criteria andPlaneNotIn(List<String> values) {
            addCriterion("Plane not in", values, "plane");
            return (Criteria) this;
        }

        public Criteria andPlaneBetween(String value1, String value2) {
            addCriterion("Plane between", value1, value2, "plane");
            return (Criteria) this;
        }

        public Criteria andPlaneNotBetween(String value1, String value2) {
            addCriterion("Plane not between", value1, value2, "plane");
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

        public Criteria andBegintimeIsNull() {
            addCriterion("BeginTime is null");
            return (Criteria) this;
        }

        public Criteria andBegintimeIsNotNull() {
            addCriterion("BeginTime is not null");
            return (Criteria) this;
        }

        public Criteria andBegintimeEqualTo(String value) {
            addCriterion("BeginTime =", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotEqualTo(String value) {
            addCriterion("BeginTime <>", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThan(String value) {
            addCriterion("BeginTime >", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThanOrEqualTo(String value) {
            addCriterion("BeginTime >=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThan(String value) {
            addCriterion("BeginTime <", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThanOrEqualTo(String value) {
            addCriterion("BeginTime <=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLike(String value) {
            addCriterion("BeginTime like", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotLike(String value) {
            addCriterion("BeginTime not like", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeIn(List<String> values) {
            addCriterion("BeginTime in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotIn(List<String> values) {
            addCriterion("BeginTime not in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeBetween(String value1, String value2) {
            addCriterion("BeginTime between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotBetween(String value1, String value2) {
            addCriterion("BeginTime not between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("EndTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("EndTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(String value) {
            addCriterion("EndTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(String value) {
            addCriterion("EndTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(String value) {
            addCriterion("EndTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(String value) {
            addCriterion("EndTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(String value) {
            addCriterion("EndTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(String value) {
            addCriterion("EndTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLike(String value) {
            addCriterion("EndTime like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotLike(String value) {
            addCriterion("EndTime not like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<String> values) {
            addCriterion("EndTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<String> values) {
            addCriterion("EndTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(String value1, String value2) {
            addCriterion("EndTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(String value1, String value2) {
            addCriterion("EndTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andRealbegintimeIsNull() {
            addCriterion("RealBeginTime is null");
            return (Criteria) this;
        }

        public Criteria andRealbegintimeIsNotNull() {
            addCriterion("RealBeginTime is not null");
            return (Criteria) this;
        }

        public Criteria andRealbegintimeEqualTo(String value) {
            addCriterion("RealBeginTime =", value, "realbegintime");
            return (Criteria) this;
        }

        public Criteria andRealbegintimeNotEqualTo(String value) {
            addCriterion("RealBeginTime <>", value, "realbegintime");
            return (Criteria) this;
        }

        public Criteria andRealbegintimeGreaterThan(String value) {
            addCriterion("RealBeginTime >", value, "realbegintime");
            return (Criteria) this;
        }

        public Criteria andRealbegintimeGreaterThanOrEqualTo(String value) {
            addCriterion("RealBeginTime >=", value, "realbegintime");
            return (Criteria) this;
        }

        public Criteria andRealbegintimeLessThan(String value) {
            addCriterion("RealBeginTime <", value, "realbegintime");
            return (Criteria) this;
        }

        public Criteria andRealbegintimeLessThanOrEqualTo(String value) {
            addCriterion("RealBeginTime <=", value, "realbegintime");
            return (Criteria) this;
        }

        public Criteria andRealbegintimeLike(String value) {
            addCriterion("RealBeginTime like", value, "realbegintime");
            return (Criteria) this;
        }

        public Criteria andRealbegintimeNotLike(String value) {
            addCriterion("RealBeginTime not like", value, "realbegintime");
            return (Criteria) this;
        }

        public Criteria andRealbegintimeIn(List<String> values) {
            addCriterion("RealBeginTime in", values, "realbegintime");
            return (Criteria) this;
        }

        public Criteria andRealbegintimeNotIn(List<String> values) {
            addCriterion("RealBeginTime not in", values, "realbegintime");
            return (Criteria) this;
        }

        public Criteria andRealbegintimeBetween(String value1, String value2) {
            addCriterion("RealBeginTime between", value1, value2, "realbegintime");
            return (Criteria) this;
        }

        public Criteria andRealbegintimeNotBetween(String value1, String value2) {
            addCriterion("RealBeginTime not between", value1, value2, "realbegintime");
            return (Criteria) this;
        }

        public Criteria andRealendtimeIsNull() {
            addCriterion("RealEndTime is null");
            return (Criteria) this;
        }

        public Criteria andRealendtimeIsNotNull() {
            addCriterion("RealEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andRealendtimeEqualTo(String value) {
            addCriterion("RealEndTime =", value, "realendtime");
            return (Criteria) this;
        }

        public Criteria andRealendtimeNotEqualTo(String value) {
            addCriterion("RealEndTime <>", value, "realendtime");
            return (Criteria) this;
        }

        public Criteria andRealendtimeGreaterThan(String value) {
            addCriterion("RealEndTime >", value, "realendtime");
            return (Criteria) this;
        }

        public Criteria andRealendtimeGreaterThanOrEqualTo(String value) {
            addCriterion("RealEndTime >=", value, "realendtime");
            return (Criteria) this;
        }

        public Criteria andRealendtimeLessThan(String value) {
            addCriterion("RealEndTime <", value, "realendtime");
            return (Criteria) this;
        }

        public Criteria andRealendtimeLessThanOrEqualTo(String value) {
            addCriterion("RealEndTime <=", value, "realendtime");
            return (Criteria) this;
        }

        public Criteria andRealendtimeLike(String value) {
            addCriterion("RealEndTime like", value, "realendtime");
            return (Criteria) this;
        }

        public Criteria andRealendtimeNotLike(String value) {
            addCriterion("RealEndTime not like", value, "realendtime");
            return (Criteria) this;
        }

        public Criteria andRealendtimeIn(List<String> values) {
            addCriterion("RealEndTime in", values, "realendtime");
            return (Criteria) this;
        }

        public Criteria andRealendtimeNotIn(List<String> values) {
            addCriterion("RealEndTime not in", values, "realendtime");
            return (Criteria) this;
        }

        public Criteria andRealendtimeBetween(String value1, String value2) {
            addCriterion("RealEndTime between", value1, value2, "realendtime");
            return (Criteria) this;
        }

        public Criteria andRealendtimeNotBetween(String value1, String value2) {
            addCriterion("RealEndTime not between", value1, value2, "realendtime");
            return (Criteria) this;
        }

        public Criteria andFlightstatusIsNull() {
            addCriterion("FlightStatus is null");
            return (Criteria) this;
        }

        public Criteria andFlightstatusIsNotNull() {
            addCriterion("FlightStatus is not null");
            return (Criteria) this;
        }

        public Criteria andFlightstatusEqualTo(String value) {
            addCriterion("FlightStatus =", value, "flightstatus");
            return (Criteria) this;
        }

        public Criteria andFlightstatusNotEqualTo(String value) {
            addCriterion("FlightStatus <>", value, "flightstatus");
            return (Criteria) this;
        }

        public Criteria andFlightstatusGreaterThan(String value) {
            addCriterion("FlightStatus >", value, "flightstatus");
            return (Criteria) this;
        }

        public Criteria andFlightstatusGreaterThanOrEqualTo(String value) {
            addCriterion("FlightStatus >=", value, "flightstatus");
            return (Criteria) this;
        }

        public Criteria andFlightstatusLessThan(String value) {
            addCriterion("FlightStatus <", value, "flightstatus");
            return (Criteria) this;
        }

        public Criteria andFlightstatusLessThanOrEqualTo(String value) {
            addCriterion("FlightStatus <=", value, "flightstatus");
            return (Criteria) this;
        }

        public Criteria andFlightstatusLike(String value) {
            addCriterion("FlightStatus like", value, "flightstatus");
            return (Criteria) this;
        }

        public Criteria andFlightstatusNotLike(String value) {
            addCriterion("FlightStatus not like", value, "flightstatus");
            return (Criteria) this;
        }

        public Criteria andFlightstatusIn(List<String> values) {
            addCriterion("FlightStatus in", values, "flightstatus");
            return (Criteria) this;
        }

        public Criteria andFlightstatusNotIn(List<String> values) {
            addCriterion("FlightStatus not in", values, "flightstatus");
            return (Criteria) this;
        }

        public Criteria andFlightstatusBetween(String value1, String value2) {
            addCriterion("FlightStatus between", value1, value2, "flightstatus");
            return (Criteria) this;
        }

        public Criteria andFlightstatusNotBetween(String value1, String value2) {
            addCriterion("FlightStatus not between", value1, value2, "flightstatus");
            return (Criteria) this;
        }

        public Criteria andStopIsNull() {
            addCriterion("Stop is null");
            return (Criteria) this;
        }

        public Criteria andStopIsNotNull() {
            addCriterion("Stop is not null");
            return (Criteria) this;
        }

        public Criteria andStopEqualTo(Integer value) {
            addCriterion("Stop =", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopNotEqualTo(Integer value) {
            addCriterion("Stop <>", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopGreaterThan(Integer value) {
            addCriterion("Stop >", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopGreaterThanOrEqualTo(Integer value) {
            addCriterion("Stop >=", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopLessThan(Integer value) {
            addCriterion("Stop <", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopLessThanOrEqualTo(Integer value) {
            addCriterion("Stop <=", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopIn(List<Integer> values) {
            addCriterion("Stop in", values, "stop");
            return (Criteria) this;
        }

        public Criteria andStopNotIn(List<Integer> values) {
            addCriterion("Stop not in", values, "stop");
            return (Criteria) this;
        }

        public Criteria andStopBetween(Integer value1, Integer value2) {
            addCriterion("Stop between", value1, value2, "stop");
            return (Criteria) this;
        }

        public Criteria andStopNotBetween(Integer value1, Integer value2) {
            addCriterion("Stop not between", value1, value2, "stop");
            return (Criteria) this;
        }

        public Criteria andTimesIsNull() {
            addCriterion("Times is null");
            return (Criteria) this;
        }

        public Criteria andTimesIsNotNull() {
            addCriterion("Times is not null");
            return (Criteria) this;
        }

        public Criteria andTimesEqualTo(String value) {
            addCriterion("Times =", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesNotEqualTo(String value) {
            addCriterion("Times <>", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesGreaterThan(String value) {
            addCriterion("Times >", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesGreaterThanOrEqualTo(String value) {
            addCriterion("Times >=", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesLessThan(String value) {
            addCriterion("Times <", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesLessThanOrEqualTo(String value) {
            addCriterion("Times <=", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesLike(String value) {
            addCriterion("Times like", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesNotLike(String value) {
            addCriterion("Times not like", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesIn(List<String> values) {
            addCriterion("Times in", values, "times");
            return (Criteria) this;
        }

        public Criteria andTimesNotIn(List<String> values) {
            addCriterion("Times not in", values, "times");
            return (Criteria) this;
        }

        public Criteria andTimesBetween(String value1, String value2) {
            addCriterion("Times between", value1, value2, "times");
            return (Criteria) this;
        }

        public Criteria andTimesNotBetween(String value1, String value2) {
            addCriterion("Times not between", value1, value2, "times");
            return (Criteria) this;
        }

        public Criteria andAduoilIsNull() {
            addCriterion("AduOil is null");
            return (Criteria) this;
        }

        public Criteria andAduoilIsNotNull() {
            addCriterion("AduOil is not null");
            return (Criteria) this;
        }

        public Criteria andAduoilEqualTo(BigDecimal value) {
            addCriterion("AduOil =", value, "aduoil");
            return (Criteria) this;
        }

        public Criteria andAduoilNotEqualTo(BigDecimal value) {
            addCriterion("AduOil <>", value, "aduoil");
            return (Criteria) this;
        }

        public Criteria andAduoilGreaterThan(BigDecimal value) {
            addCriterion("AduOil >", value, "aduoil");
            return (Criteria) this;
        }

        public Criteria andAduoilGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AduOil >=", value, "aduoil");
            return (Criteria) this;
        }

        public Criteria andAduoilLessThan(BigDecimal value) {
            addCriterion("AduOil <", value, "aduoil");
            return (Criteria) this;
        }

        public Criteria andAduoilLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AduOil <=", value, "aduoil");
            return (Criteria) this;
        }

        public Criteria andAduoilIn(List<BigDecimal> values) {
            addCriterion("AduOil in", values, "aduoil");
            return (Criteria) this;
        }

        public Criteria andAduoilNotIn(List<BigDecimal> values) {
            addCriterion("AduOil not in", values, "aduoil");
            return (Criteria) this;
        }

        public Criteria andAduoilBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AduOil between", value1, value2, "aduoil");
            return (Criteria) this;
        }

        public Criteria andAduoilNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AduOil not between", value1, value2, "aduoil");
            return (Criteria) this;
        }

        public Criteria andChdoilIsNull() {
            addCriterion("ChdOil is null");
            return (Criteria) this;
        }

        public Criteria andChdoilIsNotNull() {
            addCriterion("ChdOil is not null");
            return (Criteria) this;
        }

        public Criteria andChdoilEqualTo(BigDecimal value) {
            addCriterion("ChdOil =", value, "chdoil");
            return (Criteria) this;
        }

        public Criteria andChdoilNotEqualTo(BigDecimal value) {
            addCriterion("ChdOil <>", value, "chdoil");
            return (Criteria) this;
        }

        public Criteria andChdoilGreaterThan(BigDecimal value) {
            addCriterion("ChdOil >", value, "chdoil");
            return (Criteria) this;
        }

        public Criteria andChdoilGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ChdOil >=", value, "chdoil");
            return (Criteria) this;
        }

        public Criteria andChdoilLessThan(BigDecimal value) {
            addCriterion("ChdOil <", value, "chdoil");
            return (Criteria) this;
        }

        public Criteria andChdoilLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ChdOil <=", value, "chdoil");
            return (Criteria) this;
        }

        public Criteria andChdoilIn(List<BigDecimal> values) {
            addCriterion("ChdOil in", values, "chdoil");
            return (Criteria) this;
        }

        public Criteria andChdoilNotIn(List<BigDecimal> values) {
            addCriterion("ChdOil not in", values, "chdoil");
            return (Criteria) this;
        }

        public Criteria andChdoilBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ChdOil between", value1, value2, "chdoil");
            return (Criteria) this;
        }

        public Criteria andChdoilNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ChdOil not between", value1, value2, "chdoil");
            return (Criteria) this;
        }

        public Criteria andArilineIsNull() {
            addCriterion("AriLine is null");
            return (Criteria) this;
        }

        public Criteria andArilineIsNotNull() {
            addCriterion("AriLine is not null");
            return (Criteria) this;
        }

        public Criteria andArilineEqualTo(String value) {
            addCriterion("AriLine =", value, "ariline");
            return (Criteria) this;
        }

        public Criteria andArilineNotEqualTo(String value) {
            addCriterion("AriLine <>", value, "ariline");
            return (Criteria) this;
        }

        public Criteria andArilineGreaterThan(String value) {
            addCriterion("AriLine >", value, "ariline");
            return (Criteria) this;
        }

        public Criteria andArilineGreaterThanOrEqualTo(String value) {
            addCriterion("AriLine >=", value, "ariline");
            return (Criteria) this;
        }

        public Criteria andArilineLessThan(String value) {
            addCriterion("AriLine <", value, "ariline");
            return (Criteria) this;
        }

        public Criteria andArilineLessThanOrEqualTo(String value) {
            addCriterion("AriLine <=", value, "ariline");
            return (Criteria) this;
        }

        public Criteria andArilineLike(String value) {
            addCriterion("AriLine like", value, "ariline");
            return (Criteria) this;
        }

        public Criteria andArilineNotLike(String value) {
            addCriterion("AriLine not like", value, "ariline");
            return (Criteria) this;
        }

        public Criteria andArilineIn(List<String> values) {
            addCriterion("AriLine in", values, "ariline");
            return (Criteria) this;
        }

        public Criteria andArilineNotIn(List<String> values) {
            addCriterion("AriLine not in", values, "ariline");
            return (Criteria) this;
        }

        public Criteria andArilineBetween(String value1, String value2) {
            addCriterion("AriLine between", value1, value2, "ariline");
            return (Criteria) this;
        }

        public Criteria andArilineNotBetween(String value1, String value2) {
            addCriterion("AriLine not between", value1, value2, "ariline");
            return (Criteria) this;
        }

        public Criteria andTaxIsNull() {
            addCriterion("Tax is null");
            return (Criteria) this;
        }

        public Criteria andTaxIsNotNull() {
            addCriterion("Tax is not null");
            return (Criteria) this;
        }

        public Criteria andTaxEqualTo(BigDecimal value) {
            addCriterion("Tax =", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotEqualTo(BigDecimal value) {
            addCriterion("Tax <>", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThan(BigDecimal value) {
            addCriterion("Tax >", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Tax >=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThan(BigDecimal value) {
            addCriterion("Tax <", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Tax <=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxIn(List<BigDecimal> values) {
            addCriterion("Tax in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotIn(List<BigDecimal> values) {
            addCriterion("Tax not in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Tax between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Tax not between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andKmIsNull() {
            addCriterion("KM is null");
            return (Criteria) this;
        }

        public Criteria andKmIsNotNull() {
            addCriterion("KM is not null");
            return (Criteria) this;
        }

        public Criteria andKmEqualTo(BigDecimal value) {
            addCriterion("KM =", value, "km");
            return (Criteria) this;
        }

        public Criteria andKmNotEqualTo(BigDecimal value) {
            addCriterion("KM <>", value, "km");
            return (Criteria) this;
        }

        public Criteria andKmGreaterThan(BigDecimal value) {
            addCriterion("KM >", value, "km");
            return (Criteria) this;
        }

        public Criteria andKmGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("KM >=", value, "km");
            return (Criteria) this;
        }

        public Criteria andKmLessThan(BigDecimal value) {
            addCriterion("KM <", value, "km");
            return (Criteria) this;
        }

        public Criteria andKmLessThanOrEqualTo(BigDecimal value) {
            addCriterion("KM <=", value, "km");
            return (Criteria) this;
        }

        public Criteria andKmIn(List<BigDecimal> values) {
            addCriterion("KM in", values, "km");
            return (Criteria) this;
        }

        public Criteria andKmNotIn(List<BigDecimal> values) {
            addCriterion("KM not in", values, "km");
            return (Criteria) this;
        }

        public Criteria andKmBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KM between", value1, value2, "km");
            return (Criteria) this;
        }

        public Criteria andKmNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KM not between", value1, value2, "km");
            return (Criteria) this;
        }

        public Criteria andPriceyIsNull() {
            addCriterion("PriceY is null");
            return (Criteria) this;
        }

        public Criteria andPriceyIsNotNull() {
            addCriterion("PriceY is not null");
            return (Criteria) this;
        }

        public Criteria andPriceyEqualTo(BigDecimal value) {
            addCriterion("PriceY =", value, "pricey");
            return (Criteria) this;
        }

        public Criteria andPriceyNotEqualTo(BigDecimal value) {
            addCriterion("PriceY <>", value, "pricey");
            return (Criteria) this;
        }

        public Criteria andPriceyGreaterThan(BigDecimal value) {
            addCriterion("PriceY >", value, "pricey");
            return (Criteria) this;
        }

        public Criteria andPriceyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PriceY >=", value, "pricey");
            return (Criteria) this;
        }

        public Criteria andPriceyLessThan(BigDecimal value) {
            addCriterion("PriceY <", value, "pricey");
            return (Criteria) this;
        }

        public Criteria andPriceyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PriceY <=", value, "pricey");
            return (Criteria) this;
        }

        public Criteria andPriceyIn(List<BigDecimal> values) {
            addCriterion("PriceY in", values, "pricey");
            return (Criteria) this;
        }

        public Criteria andPriceyNotIn(List<BigDecimal> values) {
            addCriterion("PriceY not in", values, "pricey");
            return (Criteria) this;
        }

        public Criteria andPriceyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PriceY between", value1, value2, "pricey");
            return (Criteria) this;
        }

        public Criteria andPriceyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PriceY not between", value1, value2, "pricey");
            return (Criteria) this;
        }

        public Criteria andBegintermIsNull() {
            addCriterion("BeginTerm is null");
            return (Criteria) this;
        }

        public Criteria andBegintermIsNotNull() {
            addCriterion("BeginTerm is not null");
            return (Criteria) this;
        }

        public Criteria andBegintermEqualTo(String value) {
            addCriterion("BeginTerm =", value, "beginterm");
            return (Criteria) this;
        }

        public Criteria andBegintermNotEqualTo(String value) {
            addCriterion("BeginTerm <>", value, "beginterm");
            return (Criteria) this;
        }

        public Criteria andBegintermGreaterThan(String value) {
            addCriterion("BeginTerm >", value, "beginterm");
            return (Criteria) this;
        }

        public Criteria andBegintermGreaterThanOrEqualTo(String value) {
            addCriterion("BeginTerm >=", value, "beginterm");
            return (Criteria) this;
        }

        public Criteria andBegintermLessThan(String value) {
            addCriterion("BeginTerm <", value, "beginterm");
            return (Criteria) this;
        }

        public Criteria andBegintermLessThanOrEqualTo(String value) {
            addCriterion("BeginTerm <=", value, "beginterm");
            return (Criteria) this;
        }

        public Criteria andBegintermLike(String value) {
            addCriterion("BeginTerm like", value, "beginterm");
            return (Criteria) this;
        }

        public Criteria andBegintermNotLike(String value) {
            addCriterion("BeginTerm not like", value, "beginterm");
            return (Criteria) this;
        }

        public Criteria andBegintermIn(List<String> values) {
            addCriterion("BeginTerm in", values, "beginterm");
            return (Criteria) this;
        }

        public Criteria andBegintermNotIn(List<String> values) {
            addCriterion("BeginTerm not in", values, "beginterm");
            return (Criteria) this;
        }

        public Criteria andBegintermBetween(String value1, String value2) {
            addCriterion("BeginTerm between", value1, value2, "beginterm");
            return (Criteria) this;
        }

        public Criteria andBegintermNotBetween(String value1, String value2) {
            addCriterion("BeginTerm not between", value1, value2, "beginterm");
            return (Criteria) this;
        }

        public Criteria andEndtermIsNull() {
            addCriterion("EndTerm is null");
            return (Criteria) this;
        }

        public Criteria andEndtermIsNotNull() {
            addCriterion("EndTerm is not null");
            return (Criteria) this;
        }

        public Criteria andEndtermEqualTo(String value) {
            addCriterion("EndTerm =", value, "endterm");
            return (Criteria) this;
        }

        public Criteria andEndtermNotEqualTo(String value) {
            addCriterion("EndTerm <>", value, "endterm");
            return (Criteria) this;
        }

        public Criteria andEndtermGreaterThan(String value) {
            addCriterion("EndTerm >", value, "endterm");
            return (Criteria) this;
        }

        public Criteria andEndtermGreaterThanOrEqualTo(String value) {
            addCriterion("EndTerm >=", value, "endterm");
            return (Criteria) this;
        }

        public Criteria andEndtermLessThan(String value) {
            addCriterion("EndTerm <", value, "endterm");
            return (Criteria) this;
        }

        public Criteria andEndtermLessThanOrEqualTo(String value) {
            addCriterion("EndTerm <=", value, "endterm");
            return (Criteria) this;
        }

        public Criteria andEndtermLike(String value) {
            addCriterion("EndTerm like", value, "endterm");
            return (Criteria) this;
        }

        public Criteria andEndtermNotLike(String value) {
            addCriterion("EndTerm not like", value, "endterm");
            return (Criteria) this;
        }

        public Criteria andEndtermIn(List<String> values) {
            addCriterion("EndTerm in", values, "endterm");
            return (Criteria) this;
        }

        public Criteria andEndtermNotIn(List<String> values) {
            addCriterion("EndTerm not in", values, "endterm");
            return (Criteria) this;
        }

        public Criteria andEndtermBetween(String value1, String value2) {
            addCriterion("EndTerm between", value1, value2, "endterm");
            return (Criteria) this;
        }

        public Criteria andEndtermNotBetween(String value1, String value2) {
            addCriterion("EndTerm not between", value1, value2, "endterm");
            return (Criteria) this;
        }

        public Criteria andEatIsNull() {
            addCriterion("Eat is null");
            return (Criteria) this;
        }

        public Criteria andEatIsNotNull() {
            addCriterion("Eat is not null");
            return (Criteria) this;
        }

        public Criteria andEatEqualTo(String value) {
            addCriterion("Eat =", value, "eat");
            return (Criteria) this;
        }

        public Criteria andEatNotEqualTo(String value) {
            addCriterion("Eat <>", value, "eat");
            return (Criteria) this;
        }

        public Criteria andEatGreaterThan(String value) {
            addCriterion("Eat >", value, "eat");
            return (Criteria) this;
        }

        public Criteria andEatGreaterThanOrEqualTo(String value) {
            addCriterion("Eat >=", value, "eat");
            return (Criteria) this;
        }

        public Criteria andEatLessThan(String value) {
            addCriterion("Eat <", value, "eat");
            return (Criteria) this;
        }

        public Criteria andEatLessThanOrEqualTo(String value) {
            addCriterion("Eat <=", value, "eat");
            return (Criteria) this;
        }

        public Criteria andEatLike(String value) {
            addCriterion("Eat like", value, "eat");
            return (Criteria) this;
        }

        public Criteria andEatNotLike(String value) {
            addCriterion("Eat not like", value, "eat");
            return (Criteria) this;
        }

        public Criteria andEatIn(List<String> values) {
            addCriterion("Eat in", values, "eat");
            return (Criteria) this;
        }

        public Criteria andEatNotIn(List<String> values) {
            addCriterion("Eat not in", values, "eat");
            return (Criteria) this;
        }

        public Criteria andEatBetween(String value1, String value2) {
            addCriterion("Eat between", value1, value2, "eat");
            return (Criteria) this;
        }

        public Criteria andEatNotBetween(String value1, String value2) {
            addCriterion("Eat not between", value1, value2, "eat");
            return (Criteria) this;
        }

        public Criteria andIssaleIsNull() {
            addCriterion("IsSale is null");
            return (Criteria) this;
        }

        public Criteria andIssaleIsNotNull() {
            addCriterion("IsSale is not null");
            return (Criteria) this;
        }

        public Criteria andIssaleEqualTo(String value) {
            addCriterion("IsSale =", value, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleNotEqualTo(String value) {
            addCriterion("IsSale <>", value, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleGreaterThan(String value) {
            addCriterion("IsSale >", value, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleGreaterThanOrEqualTo(String value) {
            addCriterion("IsSale >=", value, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleLessThan(String value) {
            addCriterion("IsSale <", value, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleLessThanOrEqualTo(String value) {
            addCriterion("IsSale <=", value, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleLike(String value) {
            addCriterion("IsSale like", value, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleNotLike(String value) {
            addCriterion("IsSale not like", value, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleIn(List<String> values) {
            addCriterion("IsSale in", values, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleNotIn(List<String> values) {
            addCriterion("IsSale not in", values, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleBetween(String value1, String value2) {
            addCriterion("IsSale between", value1, value2, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleNotBetween(String value1, String value2) {
            addCriterion("IsSale not between", value1, value2, "issale");
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