package com.holyrobot.con_om.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OmOnlinePayTraceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OmOnlinePayTraceExample() {
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

        public Criteria andOuttradenoIsNull() {
            addCriterion("OutTradeNo is null");
            return (Criteria) this;
        }

        public Criteria andOuttradenoIsNotNull() {
            addCriterion("OutTradeNo is not null");
            return (Criteria) this;
        }

        public Criteria andOuttradenoEqualTo(String value) {
            addCriterion("OutTradeNo =", value, "outtradeno");
            return (Criteria) this;
        }

        public Criteria andOuttradenoNotEqualTo(String value) {
            addCriterion("OutTradeNo <>", value, "outtradeno");
            return (Criteria) this;
        }

        public Criteria andOuttradenoGreaterThan(String value) {
            addCriterion("OutTradeNo >", value, "outtradeno");
            return (Criteria) this;
        }

        public Criteria andOuttradenoGreaterThanOrEqualTo(String value) {
            addCriterion("OutTradeNo >=", value, "outtradeno");
            return (Criteria) this;
        }

        public Criteria andOuttradenoLessThan(String value) {
            addCriterion("OutTradeNo <", value, "outtradeno");
            return (Criteria) this;
        }

        public Criteria andOuttradenoLessThanOrEqualTo(String value) {
            addCriterion("OutTradeNo <=", value, "outtradeno");
            return (Criteria) this;
        }

        public Criteria andOuttradenoLike(String value) {
            addCriterion("OutTradeNo like", value, "outtradeno");
            return (Criteria) this;
        }

        public Criteria andOuttradenoNotLike(String value) {
            addCriterion("OutTradeNo not like", value, "outtradeno");
            return (Criteria) this;
        }

        public Criteria andOuttradenoIn(List<String> values) {
            addCriterion("OutTradeNo in", values, "outtradeno");
            return (Criteria) this;
        }

        public Criteria andOuttradenoNotIn(List<String> values) {
            addCriterion("OutTradeNo not in", values, "outtradeno");
            return (Criteria) this;
        }

        public Criteria andOuttradenoBetween(String value1, String value2) {
            addCriterion("OutTradeNo between", value1, value2, "outtradeno");
            return (Criteria) this;
        }

        public Criteria andOuttradenoNotBetween(String value1, String value2) {
            addCriterion("OutTradeNo not between", value1, value2, "outtradeno");
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

        public Criteria andOrderamtIsNull() {
            addCriterion("OrderAmt is null");
            return (Criteria) this;
        }

        public Criteria andOrderamtIsNotNull() {
            addCriterion("OrderAmt is not null");
            return (Criteria) this;
        }

        public Criteria andOrderamtEqualTo(BigDecimal value) {
            addCriterion("OrderAmt =", value, "orderamt");
            return (Criteria) this;
        }

        public Criteria andOrderamtNotEqualTo(BigDecimal value) {
            addCriterion("OrderAmt <>", value, "orderamt");
            return (Criteria) this;
        }

        public Criteria andOrderamtGreaterThan(BigDecimal value) {
            addCriterion("OrderAmt >", value, "orderamt");
            return (Criteria) this;
        }

        public Criteria andOrderamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OrderAmt >=", value, "orderamt");
            return (Criteria) this;
        }

        public Criteria andOrderamtLessThan(BigDecimal value) {
            addCriterion("OrderAmt <", value, "orderamt");
            return (Criteria) this;
        }

        public Criteria andOrderamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OrderAmt <=", value, "orderamt");
            return (Criteria) this;
        }

        public Criteria andOrderamtIn(List<BigDecimal> values) {
            addCriterion("OrderAmt in", values, "orderamt");
            return (Criteria) this;
        }

        public Criteria andOrderamtNotIn(List<BigDecimal> values) {
            addCriterion("OrderAmt not in", values, "orderamt");
            return (Criteria) this;
        }

        public Criteria andOrderamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OrderAmt between", value1, value2, "orderamt");
            return (Criteria) this;
        }

        public Criteria andOrderamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OrderAmt not between", value1, value2, "orderamt");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("Rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("Rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(BigDecimal value) {
            addCriterion("Rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(BigDecimal value) {
            addCriterion("Rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(BigDecimal value) {
            addCriterion("Rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(BigDecimal value) {
            addCriterion("Rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<BigDecimal> values) {
            addCriterion("Rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<BigDecimal> values) {
            addCriterion("Rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Rate not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andFeeIsNull() {
            addCriterion("Fee is null");
            return (Criteria) this;
        }

        public Criteria andFeeIsNotNull() {
            addCriterion("Fee is not null");
            return (Criteria) this;
        }

        public Criteria andFeeEqualTo(BigDecimal value) {
            addCriterion("Fee =", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotEqualTo(BigDecimal value) {
            addCriterion("Fee <>", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThan(BigDecimal value) {
            addCriterion("Fee >", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Fee >=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThan(BigDecimal value) {
            addCriterion("Fee <", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Fee <=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeIn(List<BigDecimal> values) {
            addCriterion("Fee in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotIn(List<BigDecimal> values) {
            addCriterion("Fee not in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Fee between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Fee not between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andPayamtIsNull() {
            addCriterion("PayAmt is null");
            return (Criteria) this;
        }

        public Criteria andPayamtIsNotNull() {
            addCriterion("PayAmt is not null");
            return (Criteria) this;
        }

        public Criteria andPayamtEqualTo(BigDecimal value) {
            addCriterion("PayAmt =", value, "payamt");
            return (Criteria) this;
        }

        public Criteria andPayamtNotEqualTo(BigDecimal value) {
            addCriterion("PayAmt <>", value, "payamt");
            return (Criteria) this;
        }

        public Criteria andPayamtGreaterThan(BigDecimal value) {
            addCriterion("PayAmt >", value, "payamt");
            return (Criteria) this;
        }

        public Criteria andPayamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PayAmt >=", value, "payamt");
            return (Criteria) this;
        }

        public Criteria andPayamtLessThan(BigDecimal value) {
            addCriterion("PayAmt <", value, "payamt");
            return (Criteria) this;
        }

        public Criteria andPayamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PayAmt <=", value, "payamt");
            return (Criteria) this;
        }

        public Criteria andPayamtIn(List<BigDecimal> values) {
            addCriterion("PayAmt in", values, "payamt");
            return (Criteria) this;
        }

        public Criteria andPayamtNotIn(List<BigDecimal> values) {
            addCriterion("PayAmt not in", values, "payamt");
            return (Criteria) this;
        }

        public Criteria andPayamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PayAmt between", value1, value2, "payamt");
            return (Criteria) this;
        }

        public Criteria andPayamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PayAmt not between", value1, value2, "payamt");
            return (Criteria) this;
        }

        public Criteria andRecpayamtIsNull() {
            addCriterion("RecPayAmt is null");
            return (Criteria) this;
        }

        public Criteria andRecpayamtIsNotNull() {
            addCriterion("RecPayAmt is not null");
            return (Criteria) this;
        }

        public Criteria andRecpayamtEqualTo(BigDecimal value) {
            addCriterion("RecPayAmt =", value, "recpayamt");
            return (Criteria) this;
        }

        public Criteria andRecpayamtNotEqualTo(BigDecimal value) {
            addCriterion("RecPayAmt <>", value, "recpayamt");
            return (Criteria) this;
        }

        public Criteria andRecpayamtGreaterThan(BigDecimal value) {
            addCriterion("RecPayAmt >", value, "recpayamt");
            return (Criteria) this;
        }

        public Criteria andRecpayamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RecPayAmt >=", value, "recpayamt");
            return (Criteria) this;
        }

        public Criteria andRecpayamtLessThan(BigDecimal value) {
            addCriterion("RecPayAmt <", value, "recpayamt");
            return (Criteria) this;
        }

        public Criteria andRecpayamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RecPayAmt <=", value, "recpayamt");
            return (Criteria) this;
        }

        public Criteria andRecpayamtIn(List<BigDecimal> values) {
            addCriterion("RecPayAmt in", values, "recpayamt");
            return (Criteria) this;
        }

        public Criteria andRecpayamtNotIn(List<BigDecimal> values) {
            addCriterion("RecPayAmt not in", values, "recpayamt");
            return (Criteria) this;
        }

        public Criteria andRecpayamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RecPayAmt between", value1, value2, "recpayamt");
            return (Criteria) this;
        }

        public Criteria andRecpayamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RecPayAmt not between", value1, value2, "recpayamt");
            return (Criteria) this;
        }

        public Criteria andPaydateIsNull() {
            addCriterion("PayDate is null");
            return (Criteria) this;
        }

        public Criteria andPaydateIsNotNull() {
            addCriterion("PayDate is not null");
            return (Criteria) this;
        }

        public Criteria andPaydateEqualTo(Date value) {
            addCriterion("PayDate =", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotEqualTo(Date value) {
            addCriterion("PayDate <>", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateGreaterThan(Date value) {
            addCriterion("PayDate >", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateGreaterThanOrEqualTo(Date value) {
            addCriterion("PayDate >=", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateLessThan(Date value) {
            addCriterion("PayDate <", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateLessThanOrEqualTo(Date value) {
            addCriterion("PayDate <=", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateIn(List<Date> values) {
            addCriterion("PayDate in", values, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotIn(List<Date> values) {
            addCriterion("PayDate not in", values, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateBetween(Date value1, Date value2) {
            addCriterion("PayDate between", value1, value2, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotBetween(Date value1, Date value2) {
            addCriterion("PayDate not between", value1, value2, "paydate");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeIsNull() {
            addCriterion("PlatformType is null");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeIsNotNull() {
            addCriterion("PlatformType is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeEqualTo(Integer value) {
            addCriterion("PlatformType =", value, "platformtype");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeNotEqualTo(Integer value) {
            addCriterion("PlatformType <>", value, "platformtype");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeGreaterThan(Integer value) {
            addCriterion("PlatformType >", value, "platformtype");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PlatformType >=", value, "platformtype");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeLessThan(Integer value) {
            addCriterion("PlatformType <", value, "platformtype");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeLessThanOrEqualTo(Integer value) {
            addCriterion("PlatformType <=", value, "platformtype");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeIn(List<Integer> values) {
            addCriterion("PlatformType in", values, "platformtype");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeNotIn(List<Integer> values) {
            addCriterion("PlatformType not in", values, "platformtype");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeBetween(Integer value1, Integer value2) {
            addCriterion("PlatformType between", value1, value2, "platformtype");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("PlatformType not between", value1, value2, "platformtype");
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

        public Criteria andSummaryIsNull() {
            addCriterion("Summary is null");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNotNull() {
            addCriterion("Summary is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryEqualTo(String value) {
            addCriterion("Summary =", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotEqualTo(String value) {
            addCriterion("Summary <>", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThan(String value) {
            addCriterion("Summary >", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("Summary >=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThan(String value) {
            addCriterion("Summary <", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThanOrEqualTo(String value) {
            addCriterion("Summary <=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLike(String value) {
            addCriterion("Summary like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotLike(String value) {
            addCriterion("Summary not like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryIn(List<String> values) {
            addCriterion("Summary in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotIn(List<String> values) {
            addCriterion("Summary not in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryBetween(String value1, String value2) {
            addCriterion("Summary between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotBetween(String value1, String value2) {
            addCriterion("Summary not between", value1, value2, "summary");
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