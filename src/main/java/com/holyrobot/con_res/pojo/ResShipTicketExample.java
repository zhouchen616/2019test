package com.holyrobot.con_res.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ResShipTicketExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResShipTicketExample() {
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

        public Criteria andHullnumberIsNull() {
            addCriterion("HullNumber is null");
            return (Criteria) this;
        }

        public Criteria andHullnumberIsNotNull() {
            addCriterion("HullNumber is not null");
            return (Criteria) this;
        }

        public Criteria andHullnumberEqualTo(String value) {
            addCriterion("HullNumber =", value, "hullnumber");
            return (Criteria) this;
        }

        public Criteria andHullnumberNotEqualTo(String value) {
            addCriterion("HullNumber <>", value, "hullnumber");
            return (Criteria) this;
        }

        public Criteria andHullnumberGreaterThan(String value) {
            addCriterion("HullNumber >", value, "hullnumber");
            return (Criteria) this;
        }

        public Criteria andHullnumberGreaterThanOrEqualTo(String value) {
            addCriterion("HullNumber >=", value, "hullnumber");
            return (Criteria) this;
        }

        public Criteria andHullnumberLessThan(String value) {
            addCriterion("HullNumber <", value, "hullnumber");
            return (Criteria) this;
        }

        public Criteria andHullnumberLessThanOrEqualTo(String value) {
            addCriterion("HullNumber <=", value, "hullnumber");
            return (Criteria) this;
        }

        public Criteria andHullnumberLike(String value) {
            addCriterion("HullNumber like", value, "hullnumber");
            return (Criteria) this;
        }

        public Criteria andHullnumberNotLike(String value) {
            addCriterion("HullNumber not like", value, "hullnumber");
            return (Criteria) this;
        }

        public Criteria andHullnumberIn(List<String> values) {
            addCriterion("HullNumber in", values, "hullnumber");
            return (Criteria) this;
        }

        public Criteria andHullnumberNotIn(List<String> values) {
            addCriterion("HullNumber not in", values, "hullnumber");
            return (Criteria) this;
        }

        public Criteria andHullnumberBetween(String value1, String value2) {
            addCriterion("HullNumber between", value1, value2, "hullnumber");
            return (Criteria) this;
        }

        public Criteria andHullnumberNotBetween(String value1, String value2) {
            addCriterion("HullNumber not between", value1, value2, "hullnumber");
            return (Criteria) this;
        }

        public Criteria andFromShipNameIsNull() {
            addCriterion("From_Ship_Name is null");
            return (Criteria) this;
        }

        public Criteria andFromShipNameIsNotNull() {
            addCriterion("From_Ship_Name is not null");
            return (Criteria) this;
        }

        public Criteria andFromShipNameEqualTo(String value) {
            addCriterion("From_Ship_Name =", value, "fromShipName");
            return (Criteria) this;
        }

        public Criteria andFromShipNameNotEqualTo(String value) {
            addCriterion("From_Ship_Name <>", value, "fromShipName");
            return (Criteria) this;
        }

        public Criteria andFromShipNameGreaterThan(String value) {
            addCriterion("From_Ship_Name >", value, "fromShipName");
            return (Criteria) this;
        }

        public Criteria andFromShipNameGreaterThanOrEqualTo(String value) {
            addCriterion("From_Ship_Name >=", value, "fromShipName");
            return (Criteria) this;
        }

        public Criteria andFromShipNameLessThan(String value) {
            addCriterion("From_Ship_Name <", value, "fromShipName");
            return (Criteria) this;
        }

        public Criteria andFromShipNameLessThanOrEqualTo(String value) {
            addCriterion("From_Ship_Name <=", value, "fromShipName");
            return (Criteria) this;
        }

        public Criteria andFromShipNameLike(String value) {
            addCriterion("From_Ship_Name like", value, "fromShipName");
            return (Criteria) this;
        }

        public Criteria andFromShipNameNotLike(String value) {
            addCriterion("From_Ship_Name not like", value, "fromShipName");
            return (Criteria) this;
        }

        public Criteria andFromShipNameIn(List<String> values) {
            addCriterion("From_Ship_Name in", values, "fromShipName");
            return (Criteria) this;
        }

        public Criteria andFromShipNameNotIn(List<String> values) {
            addCriterion("From_Ship_Name not in", values, "fromShipName");
            return (Criteria) this;
        }

        public Criteria andFromShipNameBetween(String value1, String value2) {
            addCriterion("From_Ship_Name between", value1, value2, "fromShipName");
            return (Criteria) this;
        }

        public Criteria andFromShipNameNotBetween(String value1, String value2) {
            addCriterion("From_Ship_Name not between", value1, value2, "fromShipName");
            return (Criteria) this;
        }

        public Criteria andFromShipNameidIsNull() {
            addCriterion("From_Ship_NameId is null");
            return (Criteria) this;
        }

        public Criteria andFromShipNameidIsNotNull() {
            addCriterion("From_Ship_NameId is not null");
            return (Criteria) this;
        }

        public Criteria andFromShipNameidEqualTo(String value) {
            addCriterion("From_Ship_NameId =", value, "fromShipNameid");
            return (Criteria) this;
        }

        public Criteria andFromShipNameidNotEqualTo(String value) {
            addCriterion("From_Ship_NameId <>", value, "fromShipNameid");
            return (Criteria) this;
        }

        public Criteria andFromShipNameidGreaterThan(String value) {
            addCriterion("From_Ship_NameId >", value, "fromShipNameid");
            return (Criteria) this;
        }

        public Criteria andFromShipNameidGreaterThanOrEqualTo(String value) {
            addCriterion("From_Ship_NameId >=", value, "fromShipNameid");
            return (Criteria) this;
        }

        public Criteria andFromShipNameidLessThan(String value) {
            addCriterion("From_Ship_NameId <", value, "fromShipNameid");
            return (Criteria) this;
        }

        public Criteria andFromShipNameidLessThanOrEqualTo(String value) {
            addCriterion("From_Ship_NameId <=", value, "fromShipNameid");
            return (Criteria) this;
        }

        public Criteria andFromShipNameidLike(String value) {
            addCriterion("From_Ship_NameId like", value, "fromShipNameid");
            return (Criteria) this;
        }

        public Criteria andFromShipNameidNotLike(String value) {
            addCriterion("From_Ship_NameId not like", value, "fromShipNameid");
            return (Criteria) this;
        }

        public Criteria andFromShipNameidIn(List<String> values) {
            addCriterion("From_Ship_NameId in", values, "fromShipNameid");
            return (Criteria) this;
        }

        public Criteria andFromShipNameidNotIn(List<String> values) {
            addCriterion("From_Ship_NameId not in", values, "fromShipNameid");
            return (Criteria) this;
        }

        public Criteria andFromShipNameidBetween(String value1, String value2) {
            addCriterion("From_Ship_NameId between", value1, value2, "fromShipNameid");
            return (Criteria) this;
        }

        public Criteria andFromShipNameidNotBetween(String value1, String value2) {
            addCriterion("From_Ship_NameId not between", value1, value2, "fromShipNameid");
            return (Criteria) this;
        }

        public Criteria andToShipNameIsNull() {
            addCriterion("To_Ship_Name is null");
            return (Criteria) this;
        }

        public Criteria andToShipNameIsNotNull() {
            addCriterion("To_Ship_Name is not null");
            return (Criteria) this;
        }

        public Criteria andToShipNameEqualTo(String value) {
            addCriterion("To_Ship_Name =", value, "toShipName");
            return (Criteria) this;
        }

        public Criteria andToShipNameNotEqualTo(String value) {
            addCriterion("To_Ship_Name <>", value, "toShipName");
            return (Criteria) this;
        }

        public Criteria andToShipNameGreaterThan(String value) {
            addCriterion("To_Ship_Name >", value, "toShipName");
            return (Criteria) this;
        }

        public Criteria andToShipNameGreaterThanOrEqualTo(String value) {
            addCriterion("To_Ship_Name >=", value, "toShipName");
            return (Criteria) this;
        }

        public Criteria andToShipNameLessThan(String value) {
            addCriterion("To_Ship_Name <", value, "toShipName");
            return (Criteria) this;
        }

        public Criteria andToShipNameLessThanOrEqualTo(String value) {
            addCriterion("To_Ship_Name <=", value, "toShipName");
            return (Criteria) this;
        }

        public Criteria andToShipNameLike(String value) {
            addCriterion("To_Ship_Name like", value, "toShipName");
            return (Criteria) this;
        }

        public Criteria andToShipNameNotLike(String value) {
            addCriterion("To_Ship_Name not like", value, "toShipName");
            return (Criteria) this;
        }

        public Criteria andToShipNameIn(List<String> values) {
            addCriterion("To_Ship_Name in", values, "toShipName");
            return (Criteria) this;
        }

        public Criteria andToShipNameNotIn(List<String> values) {
            addCriterion("To_Ship_Name not in", values, "toShipName");
            return (Criteria) this;
        }

        public Criteria andToShipNameBetween(String value1, String value2) {
            addCriterion("To_Ship_Name between", value1, value2, "toShipName");
            return (Criteria) this;
        }

        public Criteria andToShipNameNotBetween(String value1, String value2) {
            addCriterion("To_Ship_Name not between", value1, value2, "toShipName");
            return (Criteria) this;
        }

        public Criteria andToShipNameidIsNull() {
            addCriterion("To_Ship_NameId is null");
            return (Criteria) this;
        }

        public Criteria andToShipNameidIsNotNull() {
            addCriterion("To_Ship_NameId is not null");
            return (Criteria) this;
        }

        public Criteria andToShipNameidEqualTo(String value) {
            addCriterion("To_Ship_NameId =", value, "toShipNameid");
            return (Criteria) this;
        }

        public Criteria andToShipNameidNotEqualTo(String value) {
            addCriterion("To_Ship_NameId <>", value, "toShipNameid");
            return (Criteria) this;
        }

        public Criteria andToShipNameidGreaterThan(String value) {
            addCriterion("To_Ship_NameId >", value, "toShipNameid");
            return (Criteria) this;
        }

        public Criteria andToShipNameidGreaterThanOrEqualTo(String value) {
            addCriterion("To_Ship_NameId >=", value, "toShipNameid");
            return (Criteria) this;
        }

        public Criteria andToShipNameidLessThan(String value) {
            addCriterion("To_Ship_NameId <", value, "toShipNameid");
            return (Criteria) this;
        }

        public Criteria andToShipNameidLessThanOrEqualTo(String value) {
            addCriterion("To_Ship_NameId <=", value, "toShipNameid");
            return (Criteria) this;
        }

        public Criteria andToShipNameidLike(String value) {
            addCriterion("To_Ship_NameId like", value, "toShipNameid");
            return (Criteria) this;
        }

        public Criteria andToShipNameidNotLike(String value) {
            addCriterion("To_Ship_NameId not like", value, "toShipNameid");
            return (Criteria) this;
        }

        public Criteria andToShipNameidIn(List<String> values) {
            addCriterion("To_Ship_NameId in", values, "toShipNameid");
            return (Criteria) this;
        }

        public Criteria andToShipNameidNotIn(List<String> values) {
            addCriterion("To_Ship_NameId not in", values, "toShipNameid");
            return (Criteria) this;
        }

        public Criteria andToShipNameidBetween(String value1, String value2) {
            addCriterion("To_Ship_NameId between", value1, value2, "toShipNameid");
            return (Criteria) this;
        }

        public Criteria andToShipNameidNotBetween(String value1, String value2) {
            addCriterion("To_Ship_NameId not between", value1, value2, "toShipNameid");
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

        public Criteria andShippingspaceIsNull() {
            addCriterion("ShippingSpace is null");
            return (Criteria) this;
        }

        public Criteria andShippingspaceIsNotNull() {
            addCriterion("ShippingSpace is not null");
            return (Criteria) this;
        }

        public Criteria andShippingspaceEqualTo(String value) {
            addCriterion("ShippingSpace =", value, "shippingspace");
            return (Criteria) this;
        }

        public Criteria andShippingspaceNotEqualTo(String value) {
            addCriterion("ShippingSpace <>", value, "shippingspace");
            return (Criteria) this;
        }

        public Criteria andShippingspaceGreaterThan(String value) {
            addCriterion("ShippingSpace >", value, "shippingspace");
            return (Criteria) this;
        }

        public Criteria andShippingspaceGreaterThanOrEqualTo(String value) {
            addCriterion("ShippingSpace >=", value, "shippingspace");
            return (Criteria) this;
        }

        public Criteria andShippingspaceLessThan(String value) {
            addCriterion("ShippingSpace <", value, "shippingspace");
            return (Criteria) this;
        }

        public Criteria andShippingspaceLessThanOrEqualTo(String value) {
            addCriterion("ShippingSpace <=", value, "shippingspace");
            return (Criteria) this;
        }

        public Criteria andShippingspaceLike(String value) {
            addCriterion("ShippingSpace like", value, "shippingspace");
            return (Criteria) this;
        }

        public Criteria andShippingspaceNotLike(String value) {
            addCriterion("ShippingSpace not like", value, "shippingspace");
            return (Criteria) this;
        }

        public Criteria andShippingspaceIn(List<String> values) {
            addCriterion("ShippingSpace in", values, "shippingspace");
            return (Criteria) this;
        }

        public Criteria andShippingspaceNotIn(List<String> values) {
            addCriterion("ShippingSpace not in", values, "shippingspace");
            return (Criteria) this;
        }

        public Criteria andShippingspaceBetween(String value1, String value2) {
            addCriterion("ShippingSpace between", value1, value2, "shippingspace");
            return (Criteria) this;
        }

        public Criteria andShippingspaceNotBetween(String value1, String value2) {
            addCriterion("ShippingSpace not between", value1, value2, "shippingspace");
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