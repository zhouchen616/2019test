package com.holyrobot.con_res.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ResBusTicketExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResBusTicketExample() {
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

        public Criteria andBuscarnumberIsNull() {
            addCriterion("BusCarNumber is null");
            return (Criteria) this;
        }

        public Criteria andBuscarnumberIsNotNull() {
            addCriterion("BusCarNumber is not null");
            return (Criteria) this;
        }

        public Criteria andBuscarnumberEqualTo(String value) {
            addCriterion("BusCarNumber =", value, "buscarnumber");
            return (Criteria) this;
        }

        public Criteria andBuscarnumberNotEqualTo(String value) {
            addCriterion("BusCarNumber <>", value, "buscarnumber");
            return (Criteria) this;
        }

        public Criteria andBuscarnumberGreaterThan(String value) {
            addCriterion("BusCarNumber >", value, "buscarnumber");
            return (Criteria) this;
        }

        public Criteria andBuscarnumberGreaterThanOrEqualTo(String value) {
            addCriterion("BusCarNumber >=", value, "buscarnumber");
            return (Criteria) this;
        }

        public Criteria andBuscarnumberLessThan(String value) {
            addCriterion("BusCarNumber <", value, "buscarnumber");
            return (Criteria) this;
        }

        public Criteria andBuscarnumberLessThanOrEqualTo(String value) {
            addCriterion("BusCarNumber <=", value, "buscarnumber");
            return (Criteria) this;
        }

        public Criteria andBuscarnumberLike(String value) {
            addCriterion("BusCarNumber like", value, "buscarnumber");
            return (Criteria) this;
        }

        public Criteria andBuscarnumberNotLike(String value) {
            addCriterion("BusCarNumber not like", value, "buscarnumber");
            return (Criteria) this;
        }

        public Criteria andBuscarnumberIn(List<String> values) {
            addCriterion("BusCarNumber in", values, "buscarnumber");
            return (Criteria) this;
        }

        public Criteria andBuscarnumberNotIn(List<String> values) {
            addCriterion("BusCarNumber not in", values, "buscarnumber");
            return (Criteria) this;
        }

        public Criteria andBuscarnumberBetween(String value1, String value2) {
            addCriterion("BusCarNumber between", value1, value2, "buscarnumber");
            return (Criteria) this;
        }

        public Criteria andBuscarnumberNotBetween(String value1, String value2) {
            addCriterion("BusCarNumber not between", value1, value2, "buscarnumber");
            return (Criteria) this;
        }

        public Criteria andFromBusNameIsNull() {
            addCriterion("From_Bus_Name is null");
            return (Criteria) this;
        }

        public Criteria andFromBusNameIsNotNull() {
            addCriterion("From_Bus_Name is not null");
            return (Criteria) this;
        }

        public Criteria andFromBusNameEqualTo(String value) {
            addCriterion("From_Bus_Name =", value, "fromBusName");
            return (Criteria) this;
        }

        public Criteria andFromBusNameNotEqualTo(String value) {
            addCriterion("From_Bus_Name <>", value, "fromBusName");
            return (Criteria) this;
        }

        public Criteria andFromBusNameGreaterThan(String value) {
            addCriterion("From_Bus_Name >", value, "fromBusName");
            return (Criteria) this;
        }

        public Criteria andFromBusNameGreaterThanOrEqualTo(String value) {
            addCriterion("From_Bus_Name >=", value, "fromBusName");
            return (Criteria) this;
        }

        public Criteria andFromBusNameLessThan(String value) {
            addCriterion("From_Bus_Name <", value, "fromBusName");
            return (Criteria) this;
        }

        public Criteria andFromBusNameLessThanOrEqualTo(String value) {
            addCriterion("From_Bus_Name <=", value, "fromBusName");
            return (Criteria) this;
        }

        public Criteria andFromBusNameLike(String value) {
            addCriterion("From_Bus_Name like", value, "fromBusName");
            return (Criteria) this;
        }

        public Criteria andFromBusNameNotLike(String value) {
            addCriterion("From_Bus_Name not like", value, "fromBusName");
            return (Criteria) this;
        }

        public Criteria andFromBusNameIn(List<String> values) {
            addCriterion("From_Bus_Name in", values, "fromBusName");
            return (Criteria) this;
        }

        public Criteria andFromBusNameNotIn(List<String> values) {
            addCriterion("From_Bus_Name not in", values, "fromBusName");
            return (Criteria) this;
        }

        public Criteria andFromBusNameBetween(String value1, String value2) {
            addCriterion("From_Bus_Name between", value1, value2, "fromBusName");
            return (Criteria) this;
        }

        public Criteria andFromBusNameNotBetween(String value1, String value2) {
            addCriterion("From_Bus_Name not between", value1, value2, "fromBusName");
            return (Criteria) this;
        }

        public Criteria andFromBusNameidIsNull() {
            addCriterion("From_Bus_NameID is null");
            return (Criteria) this;
        }

        public Criteria andFromBusNameidIsNotNull() {
            addCriterion("From_Bus_NameID is not null");
            return (Criteria) this;
        }

        public Criteria andFromBusNameidEqualTo(String value) {
            addCriterion("From_Bus_NameID =", value, "fromBusNameid");
            return (Criteria) this;
        }

        public Criteria andFromBusNameidNotEqualTo(String value) {
            addCriterion("From_Bus_NameID <>", value, "fromBusNameid");
            return (Criteria) this;
        }

        public Criteria andFromBusNameidGreaterThan(String value) {
            addCriterion("From_Bus_NameID >", value, "fromBusNameid");
            return (Criteria) this;
        }

        public Criteria andFromBusNameidGreaterThanOrEqualTo(String value) {
            addCriterion("From_Bus_NameID >=", value, "fromBusNameid");
            return (Criteria) this;
        }

        public Criteria andFromBusNameidLessThan(String value) {
            addCriterion("From_Bus_NameID <", value, "fromBusNameid");
            return (Criteria) this;
        }

        public Criteria andFromBusNameidLessThanOrEqualTo(String value) {
            addCriterion("From_Bus_NameID <=", value, "fromBusNameid");
            return (Criteria) this;
        }

        public Criteria andFromBusNameidLike(String value) {
            addCriterion("From_Bus_NameID like", value, "fromBusNameid");
            return (Criteria) this;
        }

        public Criteria andFromBusNameidNotLike(String value) {
            addCriterion("From_Bus_NameID not like", value, "fromBusNameid");
            return (Criteria) this;
        }

        public Criteria andFromBusNameidIn(List<String> values) {
            addCriterion("From_Bus_NameID in", values, "fromBusNameid");
            return (Criteria) this;
        }

        public Criteria andFromBusNameidNotIn(List<String> values) {
            addCriterion("From_Bus_NameID not in", values, "fromBusNameid");
            return (Criteria) this;
        }

        public Criteria andFromBusNameidBetween(String value1, String value2) {
            addCriterion("From_Bus_NameID between", value1, value2, "fromBusNameid");
            return (Criteria) this;
        }

        public Criteria andFromBusNameidNotBetween(String value1, String value2) {
            addCriterion("From_Bus_NameID not between", value1, value2, "fromBusNameid");
            return (Criteria) this;
        }

        public Criteria andToBusNameIsNull() {
            addCriterion("To_Bus_Name is null");
            return (Criteria) this;
        }

        public Criteria andToBusNameIsNotNull() {
            addCriterion("To_Bus_Name is not null");
            return (Criteria) this;
        }

        public Criteria andToBusNameEqualTo(String value) {
            addCriterion("To_Bus_Name =", value, "toBusName");
            return (Criteria) this;
        }

        public Criteria andToBusNameNotEqualTo(String value) {
            addCriterion("To_Bus_Name <>", value, "toBusName");
            return (Criteria) this;
        }

        public Criteria andToBusNameGreaterThan(String value) {
            addCriterion("To_Bus_Name >", value, "toBusName");
            return (Criteria) this;
        }

        public Criteria andToBusNameGreaterThanOrEqualTo(String value) {
            addCriterion("To_Bus_Name >=", value, "toBusName");
            return (Criteria) this;
        }

        public Criteria andToBusNameLessThan(String value) {
            addCriterion("To_Bus_Name <", value, "toBusName");
            return (Criteria) this;
        }

        public Criteria andToBusNameLessThanOrEqualTo(String value) {
            addCriterion("To_Bus_Name <=", value, "toBusName");
            return (Criteria) this;
        }

        public Criteria andToBusNameLike(String value) {
            addCriterion("To_Bus_Name like", value, "toBusName");
            return (Criteria) this;
        }

        public Criteria andToBusNameNotLike(String value) {
            addCriterion("To_Bus_Name not like", value, "toBusName");
            return (Criteria) this;
        }

        public Criteria andToBusNameIn(List<String> values) {
            addCriterion("To_Bus_Name in", values, "toBusName");
            return (Criteria) this;
        }

        public Criteria andToBusNameNotIn(List<String> values) {
            addCriterion("To_Bus_Name not in", values, "toBusName");
            return (Criteria) this;
        }

        public Criteria andToBusNameBetween(String value1, String value2) {
            addCriterion("To_Bus_Name between", value1, value2, "toBusName");
            return (Criteria) this;
        }

        public Criteria andToBusNameNotBetween(String value1, String value2) {
            addCriterion("To_Bus_Name not between", value1, value2, "toBusName");
            return (Criteria) this;
        }

        public Criteria andToBusNameidIsNull() {
            addCriterion("To_Bus_NameID is null");
            return (Criteria) this;
        }

        public Criteria andToBusNameidIsNotNull() {
            addCriterion("To_Bus_NameID is not null");
            return (Criteria) this;
        }

        public Criteria andToBusNameidEqualTo(String value) {
            addCriterion("To_Bus_NameID =", value, "toBusNameid");
            return (Criteria) this;
        }

        public Criteria andToBusNameidNotEqualTo(String value) {
            addCriterion("To_Bus_NameID <>", value, "toBusNameid");
            return (Criteria) this;
        }

        public Criteria andToBusNameidGreaterThan(String value) {
            addCriterion("To_Bus_NameID >", value, "toBusNameid");
            return (Criteria) this;
        }

        public Criteria andToBusNameidGreaterThanOrEqualTo(String value) {
            addCriterion("To_Bus_NameID >=", value, "toBusNameid");
            return (Criteria) this;
        }

        public Criteria andToBusNameidLessThan(String value) {
            addCriterion("To_Bus_NameID <", value, "toBusNameid");
            return (Criteria) this;
        }

        public Criteria andToBusNameidLessThanOrEqualTo(String value) {
            addCriterion("To_Bus_NameID <=", value, "toBusNameid");
            return (Criteria) this;
        }

        public Criteria andToBusNameidLike(String value) {
            addCriterion("To_Bus_NameID like", value, "toBusNameid");
            return (Criteria) this;
        }

        public Criteria andToBusNameidNotLike(String value) {
            addCriterion("To_Bus_NameID not like", value, "toBusNameid");
            return (Criteria) this;
        }

        public Criteria andToBusNameidIn(List<String> values) {
            addCriterion("To_Bus_NameID in", values, "toBusNameid");
            return (Criteria) this;
        }

        public Criteria andToBusNameidNotIn(List<String> values) {
            addCriterion("To_Bus_NameID not in", values, "toBusNameid");
            return (Criteria) this;
        }

        public Criteria andToBusNameidBetween(String value1, String value2) {
            addCriterion("To_Bus_NameID between", value1, value2, "toBusNameid");
            return (Criteria) this;
        }

        public Criteria andToBusNameidNotBetween(String value1, String value2) {
            addCriterion("To_Bus_NameID not between", value1, value2, "toBusNameid");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("StartTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("StartTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(String value) {
            addCriterion("StartTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(String value) {
            addCriterion("StartTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(String value) {
            addCriterion("StartTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("StartTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(String value) {
            addCriterion("StartTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(String value) {
            addCriterion("StartTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLike(String value) {
            addCriterion("StartTime like", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotLike(String value) {
            addCriterion("StartTime not like", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<String> values) {
            addCriterion("StartTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<String> values) {
            addCriterion("StartTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(String value1, String value2) {
            addCriterion("StartTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(String value1, String value2) {
            addCriterion("StartTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeIsNull() {
            addCriterion("ArriveTime is null");
            return (Criteria) this;
        }

        public Criteria andArrivetimeIsNotNull() {
            addCriterion("ArriveTime is not null");
            return (Criteria) this;
        }

        public Criteria andArrivetimeEqualTo(String value) {
            addCriterion("ArriveTime =", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeNotEqualTo(String value) {
            addCriterion("ArriveTime <>", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeGreaterThan(String value) {
            addCriterion("ArriveTime >", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeGreaterThanOrEqualTo(String value) {
            addCriterion("ArriveTime >=", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeLessThan(String value) {
            addCriterion("ArriveTime <", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeLessThanOrEqualTo(String value) {
            addCriterion("ArriveTime <=", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeLike(String value) {
            addCriterion("ArriveTime like", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeNotLike(String value) {
            addCriterion("ArriveTime not like", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeIn(List<String> values) {
            addCriterion("ArriveTime in", values, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeNotIn(List<String> values) {
            addCriterion("ArriveTime not in", values, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeBetween(String value1, String value2) {
            addCriterion("ArriveTime between", value1, value2, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeNotBetween(String value1, String value2) {
            addCriterion("ArriveTime not between", value1, value2, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andLishiIsNull() {
            addCriterion("LiShi is null");
            return (Criteria) this;
        }

        public Criteria andLishiIsNotNull() {
            addCriterion("LiShi is not null");
            return (Criteria) this;
        }

        public Criteria andLishiEqualTo(String value) {
            addCriterion("LiShi =", value, "lishi");
            return (Criteria) this;
        }

        public Criteria andLishiNotEqualTo(String value) {
            addCriterion("LiShi <>", value, "lishi");
            return (Criteria) this;
        }

        public Criteria andLishiGreaterThan(String value) {
            addCriterion("LiShi >", value, "lishi");
            return (Criteria) this;
        }

        public Criteria andLishiGreaterThanOrEqualTo(String value) {
            addCriterion("LiShi >=", value, "lishi");
            return (Criteria) this;
        }

        public Criteria andLishiLessThan(String value) {
            addCriterion("LiShi <", value, "lishi");
            return (Criteria) this;
        }

        public Criteria andLishiLessThanOrEqualTo(String value) {
            addCriterion("LiShi <=", value, "lishi");
            return (Criteria) this;
        }

        public Criteria andLishiLike(String value) {
            addCriterion("LiShi like", value, "lishi");
            return (Criteria) this;
        }

        public Criteria andLishiNotLike(String value) {
            addCriterion("LiShi not like", value, "lishi");
            return (Criteria) this;
        }

        public Criteria andLishiIn(List<String> values) {
            addCriterion("LiShi in", values, "lishi");
            return (Criteria) this;
        }

        public Criteria andLishiNotIn(List<String> values) {
            addCriterion("LiShi not in", values, "lishi");
            return (Criteria) this;
        }

        public Criteria andLishiBetween(String value1, String value2) {
            addCriterion("LiShi between", value1, value2, "lishi");
            return (Criteria) this;
        }

        public Criteria andLishiNotBetween(String value1, String value2) {
            addCriterion("LiShi not between", value1, value2, "lishi");
            return (Criteria) this;
        }

        public Criteria andSeatnumberIsNull() {
            addCriterion("SeatNumber is null");
            return (Criteria) this;
        }

        public Criteria andSeatnumberIsNotNull() {
            addCriterion("SeatNumber is not null");
            return (Criteria) this;
        }

        public Criteria andSeatnumberEqualTo(String value) {
            addCriterion("SeatNumber =", value, "seatnumber");
            return (Criteria) this;
        }

        public Criteria andSeatnumberNotEqualTo(String value) {
            addCriterion("SeatNumber <>", value, "seatnumber");
            return (Criteria) this;
        }

        public Criteria andSeatnumberGreaterThan(String value) {
            addCriterion("SeatNumber >", value, "seatnumber");
            return (Criteria) this;
        }

        public Criteria andSeatnumberGreaterThanOrEqualTo(String value) {
            addCriterion("SeatNumber >=", value, "seatnumber");
            return (Criteria) this;
        }

        public Criteria andSeatnumberLessThan(String value) {
            addCriterion("SeatNumber <", value, "seatnumber");
            return (Criteria) this;
        }

        public Criteria andSeatnumberLessThanOrEqualTo(String value) {
            addCriterion("SeatNumber <=", value, "seatnumber");
            return (Criteria) this;
        }

        public Criteria andSeatnumberLike(String value) {
            addCriterion("SeatNumber like", value, "seatnumber");
            return (Criteria) this;
        }

        public Criteria andSeatnumberNotLike(String value) {
            addCriterion("SeatNumber not like", value, "seatnumber");
            return (Criteria) this;
        }

        public Criteria andSeatnumberIn(List<String> values) {
            addCriterion("SeatNumber in", values, "seatnumber");
            return (Criteria) this;
        }

        public Criteria andSeatnumberNotIn(List<String> values) {
            addCriterion("SeatNumber not in", values, "seatnumber");
            return (Criteria) this;
        }

        public Criteria andSeatnumberBetween(String value1, String value2) {
            addCriterion("SeatNumber between", value1, value2, "seatnumber");
            return (Criteria) this;
        }

        public Criteria andSeatnumberNotBetween(String value1, String value2) {
            addCriterion("SeatNumber not between", value1, value2, "seatnumber");
            return (Criteria) this;
        }

        public Criteria andGodateIsNull() {
            addCriterion("GoDate is null");
            return (Criteria) this;
        }

        public Criteria andGodateIsNotNull() {
            addCriterion("GoDate is not null");
            return (Criteria) this;
        }

        public Criteria andGodateEqualTo(Date value) {
            addCriterionForJDBCDate("GoDate =", value, "godate");
            return (Criteria) this;
        }

        public Criteria andGodateNotEqualTo(Date value) {
            addCriterionForJDBCDate("GoDate <>", value, "godate");
            return (Criteria) this;
        }

        public Criteria andGodateGreaterThan(Date value) {
            addCriterionForJDBCDate("GoDate >", value, "godate");
            return (Criteria) this;
        }

        public Criteria andGodateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("GoDate >=", value, "godate");
            return (Criteria) this;
        }

        public Criteria andGodateLessThan(Date value) {
            addCriterionForJDBCDate("GoDate <", value, "godate");
            return (Criteria) this;
        }

        public Criteria andGodateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("GoDate <=", value, "godate");
            return (Criteria) this;
        }

        public Criteria andGodateIn(List<Date> values) {
            addCriterionForJDBCDate("GoDate in", values, "godate");
            return (Criteria) this;
        }

        public Criteria andGodateNotIn(List<Date> values) {
            addCriterionForJDBCDate("GoDate not in", values, "godate");
            return (Criteria) this;
        }

        public Criteria andGodateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("GoDate between", value1, value2, "godate");
            return (Criteria) this;
        }

        public Criteria andGodateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("GoDate not between", value1, value2, "godate");
            return (Criteria) this;
        }

        public Criteria andFromdateIsNull() {
            addCriterion("FromDate is null");
            return (Criteria) this;
        }

        public Criteria andFromdateIsNotNull() {
            addCriterion("FromDate is not null");
            return (Criteria) this;
        }

        public Criteria andFromdateEqualTo(Date value) {
            addCriterionForJDBCDate("FromDate =", value, "fromdate");
            return (Criteria) this;
        }

        public Criteria andFromdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("FromDate <>", value, "fromdate");
            return (Criteria) this;
        }

        public Criteria andFromdateGreaterThan(Date value) {
            addCriterionForJDBCDate("FromDate >", value, "fromdate");
            return (Criteria) this;
        }

        public Criteria andFromdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FromDate >=", value, "fromdate");
            return (Criteria) this;
        }

        public Criteria andFromdateLessThan(Date value) {
            addCriterionForJDBCDate("FromDate <", value, "fromdate");
            return (Criteria) this;
        }

        public Criteria andFromdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FromDate <=", value, "fromdate");
            return (Criteria) this;
        }

        public Criteria andFromdateIn(List<Date> values) {
            addCriterionForJDBCDate("FromDate in", values, "fromdate");
            return (Criteria) this;
        }

        public Criteria andFromdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("FromDate not in", values, "fromdate");
            return (Criteria) this;
        }

        public Criteria andFromdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FromDate between", value1, value2, "fromdate");
            return (Criteria) this;
        }

        public Criteria andFromdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FromDate not between", value1, value2, "fromdate");
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