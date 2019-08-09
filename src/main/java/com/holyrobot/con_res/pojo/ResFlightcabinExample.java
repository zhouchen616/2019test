package com.holyrobot.con_res.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ResFlightcabinExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResFlightcabinExample() {
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

        public Criteria andCabinnameIsNull() {
            addCriterion("CabinName is null");
            return (Criteria) this;
        }

        public Criteria andCabinnameIsNotNull() {
            addCriterion("CabinName is not null");
            return (Criteria) this;
        }

        public Criteria andCabinnameEqualTo(String value) {
            addCriterion("CabinName =", value, "cabinname");
            return (Criteria) this;
        }

        public Criteria andCabinnameNotEqualTo(String value) {
            addCriterion("CabinName <>", value, "cabinname");
            return (Criteria) this;
        }

        public Criteria andCabinnameGreaterThan(String value) {
            addCriterion("CabinName >", value, "cabinname");
            return (Criteria) this;
        }

        public Criteria andCabinnameGreaterThanOrEqualTo(String value) {
            addCriterion("CabinName >=", value, "cabinname");
            return (Criteria) this;
        }

        public Criteria andCabinnameLessThan(String value) {
            addCriterion("CabinName <", value, "cabinname");
            return (Criteria) this;
        }

        public Criteria andCabinnameLessThanOrEqualTo(String value) {
            addCriterion("CabinName <=", value, "cabinname");
            return (Criteria) this;
        }

        public Criteria andCabinnameLike(String value) {
            addCriterion("CabinName like", value, "cabinname");
            return (Criteria) this;
        }

        public Criteria andCabinnameNotLike(String value) {
            addCriterion("CabinName not like", value, "cabinname");
            return (Criteria) this;
        }

        public Criteria andCabinnameIn(List<String> values) {
            addCriterion("CabinName in", values, "cabinname");
            return (Criteria) this;
        }

        public Criteria andCabinnameNotIn(List<String> values) {
            addCriterion("CabinName not in", values, "cabinname");
            return (Criteria) this;
        }

        public Criteria andCabinnameBetween(String value1, String value2) {
            addCriterion("CabinName between", value1, value2, "cabinname");
            return (Criteria) this;
        }

        public Criteria andCabinnameNotBetween(String value1, String value2) {
            addCriterion("CabinName not between", value1, value2, "cabinname");
            return (Criteria) this;
        }

        public Criteria andCabinnumIsNull() {
            addCriterion("CabinNum is null");
            return (Criteria) this;
        }

        public Criteria andCabinnumIsNotNull() {
            addCriterion("CabinNum is not null");
            return (Criteria) this;
        }

        public Criteria andCabinnumEqualTo(String value) {
            addCriterion("CabinNum =", value, "cabinnum");
            return (Criteria) this;
        }

        public Criteria andCabinnumNotEqualTo(String value) {
            addCriterion("CabinNum <>", value, "cabinnum");
            return (Criteria) this;
        }

        public Criteria andCabinnumGreaterThan(String value) {
            addCriterion("CabinNum >", value, "cabinnum");
            return (Criteria) this;
        }

        public Criteria andCabinnumGreaterThanOrEqualTo(String value) {
            addCriterion("CabinNum >=", value, "cabinnum");
            return (Criteria) this;
        }

        public Criteria andCabinnumLessThan(String value) {
            addCriterion("CabinNum <", value, "cabinnum");
            return (Criteria) this;
        }

        public Criteria andCabinnumLessThanOrEqualTo(String value) {
            addCriterion("CabinNum <=", value, "cabinnum");
            return (Criteria) this;
        }

        public Criteria andCabinnumLike(String value) {
            addCriterion("CabinNum like", value, "cabinnum");
            return (Criteria) this;
        }

        public Criteria andCabinnumNotLike(String value) {
            addCriterion("CabinNum not like", value, "cabinnum");
            return (Criteria) this;
        }

        public Criteria andCabinnumIn(List<String> values) {
            addCriterion("CabinNum in", values, "cabinnum");
            return (Criteria) this;
        }

        public Criteria andCabinnumNotIn(List<String> values) {
            addCriterion("CabinNum not in", values, "cabinnum");
            return (Criteria) this;
        }

        public Criteria andCabinnumBetween(String value1, String value2) {
            addCriterion("CabinNum between", value1, value2, "cabinnum");
            return (Criteria) this;
        }

        public Criteria andCabinnumNotBetween(String value1, String value2) {
            addCriterion("CabinNum not between", value1, value2, "cabinnum");
            return (Criteria) this;
        }

        public Criteria andCabinpriceIsNull() {
            addCriterion("CabinPrice is null");
            return (Criteria) this;
        }

        public Criteria andCabinpriceIsNotNull() {
            addCriterion("CabinPrice is not null");
            return (Criteria) this;
        }

        public Criteria andCabinpriceEqualTo(BigDecimal value) {
            addCriterion("CabinPrice =", value, "cabinprice");
            return (Criteria) this;
        }

        public Criteria andCabinpriceNotEqualTo(BigDecimal value) {
            addCriterion("CabinPrice <>", value, "cabinprice");
            return (Criteria) this;
        }

        public Criteria andCabinpriceGreaterThan(BigDecimal value) {
            addCriterion("CabinPrice >", value, "cabinprice");
            return (Criteria) this;
        }

        public Criteria andCabinpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CabinPrice >=", value, "cabinprice");
            return (Criteria) this;
        }

        public Criteria andCabinpriceLessThan(BigDecimal value) {
            addCriterion("CabinPrice <", value, "cabinprice");
            return (Criteria) this;
        }

        public Criteria andCabinpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CabinPrice <=", value, "cabinprice");
            return (Criteria) this;
        }

        public Criteria andCabinpriceIn(List<BigDecimal> values) {
            addCriterion("CabinPrice in", values, "cabinprice");
            return (Criteria) this;
        }

        public Criteria andCabinpriceNotIn(List<BigDecimal> values) {
            addCriterion("CabinPrice not in", values, "cabinprice");
            return (Criteria) this;
        }

        public Criteria andCabinpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CabinPrice between", value1, value2, "cabinprice");
            return (Criteria) this;
        }

        public Criteria andCabinpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CabinPrice not between", value1, value2, "cabinprice");
            return (Criteria) this;
        }

        public Criteria andCabincodeIsNull() {
            addCriterion("CabinCode is null");
            return (Criteria) this;
        }

        public Criteria andCabincodeIsNotNull() {
            addCriterion("CabinCode is not null");
            return (Criteria) this;
        }

        public Criteria andCabincodeEqualTo(String value) {
            addCriterion("CabinCode =", value, "cabincode");
            return (Criteria) this;
        }

        public Criteria andCabincodeNotEqualTo(String value) {
            addCriterion("CabinCode <>", value, "cabincode");
            return (Criteria) this;
        }

        public Criteria andCabincodeGreaterThan(String value) {
            addCriterion("CabinCode >", value, "cabincode");
            return (Criteria) this;
        }

        public Criteria andCabincodeGreaterThanOrEqualTo(String value) {
            addCriterion("CabinCode >=", value, "cabincode");
            return (Criteria) this;
        }

        public Criteria andCabincodeLessThan(String value) {
            addCriterion("CabinCode <", value, "cabincode");
            return (Criteria) this;
        }

        public Criteria andCabincodeLessThanOrEqualTo(String value) {
            addCriterion("CabinCode <=", value, "cabincode");
            return (Criteria) this;
        }

        public Criteria andCabincodeLike(String value) {
            addCriterion("CabinCode like", value, "cabincode");
            return (Criteria) this;
        }

        public Criteria andCabincodeNotLike(String value) {
            addCriterion("CabinCode not like", value, "cabincode");
            return (Criteria) this;
        }

        public Criteria andCabincodeIn(List<String> values) {
            addCriterion("CabinCode in", values, "cabincode");
            return (Criteria) this;
        }

        public Criteria andCabincodeNotIn(List<String> values) {
            addCriterion("CabinCode not in", values, "cabincode");
            return (Criteria) this;
        }

        public Criteria andCabincodeBetween(String value1, String value2) {
            addCriterion("CabinCode between", value1, value2, "cabincode");
            return (Criteria) this;
        }

        public Criteria andCabincodeNotBetween(String value1, String value2) {
            addCriterion("CabinCode not between", value1, value2, "cabincode");
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