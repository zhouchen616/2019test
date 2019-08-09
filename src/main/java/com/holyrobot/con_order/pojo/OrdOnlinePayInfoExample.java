package com.holyrobot.con_order.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdOnlinePayInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdOnlinePayInfoExample() {
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

        public Criteria andTypeIsNull() {
            addCriterion("Type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("Type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("Type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("Type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("Type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("Type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("Type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("Type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("Type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("Type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("Type not between", value1, value2, "type");
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

        public Criteria andRdinedIsNull() {
            addCriterion("Rdined is null");
            return (Criteria) this;
        }

        public Criteria andRdinedIsNotNull() {
            addCriterion("Rdined is not null");
            return (Criteria) this;
        }

        public Criteria andRdinedEqualTo(BigDecimal value) {
            addCriterion("Rdined =", value, "rdined");
            return (Criteria) this;
        }

        public Criteria andRdinedNotEqualTo(BigDecimal value) {
            addCriterion("Rdined <>", value, "rdined");
            return (Criteria) this;
        }

        public Criteria andRdinedGreaterThan(BigDecimal value) {
            addCriterion("Rdined >", value, "rdined");
            return (Criteria) this;
        }

        public Criteria andRdinedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Rdined >=", value, "rdined");
            return (Criteria) this;
        }

        public Criteria andRdinedLessThan(BigDecimal value) {
            addCriterion("Rdined <", value, "rdined");
            return (Criteria) this;
        }

        public Criteria andRdinedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Rdined <=", value, "rdined");
            return (Criteria) this;
        }

        public Criteria andRdinedIn(List<BigDecimal> values) {
            addCriterion("Rdined in", values, "rdined");
            return (Criteria) this;
        }

        public Criteria andRdinedNotIn(List<BigDecimal> values) {
            addCriterion("Rdined not in", values, "rdined");
            return (Criteria) this;
        }

        public Criteria andRdinedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Rdined between", value1, value2, "rdined");
            return (Criteria) this;
        }

        public Criteria andRdinedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Rdined not between", value1, value2, "rdined");
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

        public Criteria andServicechargeIsNull() {
            addCriterion("ServiceCharge is null");
            return (Criteria) this;
        }

        public Criteria andServicechargeIsNotNull() {
            addCriterion("ServiceCharge is not null");
            return (Criteria) this;
        }

        public Criteria andServicechargeEqualTo(BigDecimal value) {
            addCriterion("ServiceCharge =", value, "servicecharge");
            return (Criteria) this;
        }

        public Criteria andServicechargeNotEqualTo(BigDecimal value) {
            addCriterion("ServiceCharge <>", value, "servicecharge");
            return (Criteria) this;
        }

        public Criteria andServicechargeGreaterThan(BigDecimal value) {
            addCriterion("ServiceCharge >", value, "servicecharge");
            return (Criteria) this;
        }

        public Criteria andServicechargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ServiceCharge >=", value, "servicecharge");
            return (Criteria) this;
        }

        public Criteria andServicechargeLessThan(BigDecimal value) {
            addCriterion("ServiceCharge <", value, "servicecharge");
            return (Criteria) this;
        }

        public Criteria andServicechargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ServiceCharge <=", value, "servicecharge");
            return (Criteria) this;
        }

        public Criteria andServicechargeIn(List<BigDecimal> values) {
            addCriterion("ServiceCharge in", values, "servicecharge");
            return (Criteria) this;
        }

        public Criteria andServicechargeNotIn(List<BigDecimal> values) {
            addCriterion("ServiceCharge not in", values, "servicecharge");
            return (Criteria) this;
        }

        public Criteria andServicechargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ServiceCharge between", value1, value2, "servicecharge");
            return (Criteria) this;
        }

        public Criteria andServicechargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ServiceCharge not between", value1, value2, "servicecharge");
            return (Criteria) this;
        }

        public Criteria andRealityamtIsNull() {
            addCriterion("RealityAmt is null");
            return (Criteria) this;
        }

        public Criteria andRealityamtIsNotNull() {
            addCriterion("RealityAmt is not null");
            return (Criteria) this;
        }

        public Criteria andRealityamtEqualTo(BigDecimal value) {
            addCriterion("RealityAmt =", value, "realityamt");
            return (Criteria) this;
        }

        public Criteria andRealityamtNotEqualTo(BigDecimal value) {
            addCriterion("RealityAmt <>", value, "realityamt");
            return (Criteria) this;
        }

        public Criteria andRealityamtGreaterThan(BigDecimal value) {
            addCriterion("RealityAmt >", value, "realityamt");
            return (Criteria) this;
        }

        public Criteria andRealityamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RealityAmt >=", value, "realityamt");
            return (Criteria) this;
        }

        public Criteria andRealityamtLessThan(BigDecimal value) {
            addCriterion("RealityAmt <", value, "realityamt");
            return (Criteria) this;
        }

        public Criteria andRealityamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RealityAmt <=", value, "realityamt");
            return (Criteria) this;
        }

        public Criteria andRealityamtIn(List<BigDecimal> values) {
            addCriterion("RealityAmt in", values, "realityamt");
            return (Criteria) this;
        }

        public Criteria andRealityamtNotIn(List<BigDecimal> values) {
            addCriterion("RealityAmt not in", values, "realityamt");
            return (Criteria) this;
        }

        public Criteria andRealityamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RealityAmt between", value1, value2, "realityamt");
            return (Criteria) this;
        }

        public Criteria andRealityamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RealityAmt not between", value1, value2, "realityamt");
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

        public Criteria andRemarkIsNull() {
            addCriterion("Remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("Remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("Remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("Remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("Remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("Remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("Remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("Remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("Remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("Remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("Remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("Remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("Remark not between", value1, value2, "remark");
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