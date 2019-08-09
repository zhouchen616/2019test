package com.holyrobot.con_order.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrdOrderCollectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdOrderCollectionExample() {
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

        public Criteria andCollectunitIsNull() {
            addCriterion("CollectUnit is null");
            return (Criteria) this;
        }

        public Criteria andCollectunitIsNotNull() {
            addCriterion("CollectUnit is not null");
            return (Criteria) this;
        }

        public Criteria andCollectunitEqualTo(String value) {
            addCriterion("CollectUnit =", value, "collectunit");
            return (Criteria) this;
        }

        public Criteria andCollectunitNotEqualTo(String value) {
            addCriterion("CollectUnit <>", value, "collectunit");
            return (Criteria) this;
        }

        public Criteria andCollectunitGreaterThan(String value) {
            addCriterion("CollectUnit >", value, "collectunit");
            return (Criteria) this;
        }

        public Criteria andCollectunitGreaterThanOrEqualTo(String value) {
            addCriterion("CollectUnit >=", value, "collectunit");
            return (Criteria) this;
        }

        public Criteria andCollectunitLessThan(String value) {
            addCriterion("CollectUnit <", value, "collectunit");
            return (Criteria) this;
        }

        public Criteria andCollectunitLessThanOrEqualTo(String value) {
            addCriterion("CollectUnit <=", value, "collectunit");
            return (Criteria) this;
        }

        public Criteria andCollectunitLike(String value) {
            addCriterion("CollectUnit like", value, "collectunit");
            return (Criteria) this;
        }

        public Criteria andCollectunitNotLike(String value) {
            addCriterion("CollectUnit not like", value, "collectunit");
            return (Criteria) this;
        }

        public Criteria andCollectunitIn(List<String> values) {
            addCriterion("CollectUnit in", values, "collectunit");
            return (Criteria) this;
        }

        public Criteria andCollectunitNotIn(List<String> values) {
            addCriterion("CollectUnit not in", values, "collectunit");
            return (Criteria) this;
        }

        public Criteria andCollectunitBetween(String value1, String value2) {
            addCriterion("CollectUnit between", value1, value2, "collectunit");
            return (Criteria) this;
        }

        public Criteria andCollectunitNotBetween(String value1, String value2) {
            addCriterion("CollectUnit not between", value1, value2, "collectunit");
            return (Criteria) this;
        }

        public Criteria andCollectunitidIsNull() {
            addCriterion("CollectUnitID is null");
            return (Criteria) this;
        }

        public Criteria andCollectunitidIsNotNull() {
            addCriterion("CollectUnitID is not null");
            return (Criteria) this;
        }

        public Criteria andCollectunitidEqualTo(String value) {
            addCriterion("CollectUnitID =", value, "collectunitid");
            return (Criteria) this;
        }

        public Criteria andCollectunitidNotEqualTo(String value) {
            addCriterion("CollectUnitID <>", value, "collectunitid");
            return (Criteria) this;
        }

        public Criteria andCollectunitidGreaterThan(String value) {
            addCriterion("CollectUnitID >", value, "collectunitid");
            return (Criteria) this;
        }

        public Criteria andCollectunitidGreaterThanOrEqualTo(String value) {
            addCriterion("CollectUnitID >=", value, "collectunitid");
            return (Criteria) this;
        }

        public Criteria andCollectunitidLessThan(String value) {
            addCriterion("CollectUnitID <", value, "collectunitid");
            return (Criteria) this;
        }

        public Criteria andCollectunitidLessThanOrEqualTo(String value) {
            addCriterion("CollectUnitID <=", value, "collectunitid");
            return (Criteria) this;
        }

        public Criteria andCollectunitidLike(String value) {
            addCriterion("CollectUnitID like", value, "collectunitid");
            return (Criteria) this;
        }

        public Criteria andCollectunitidNotLike(String value) {
            addCriterion("CollectUnitID not like", value, "collectunitid");
            return (Criteria) this;
        }

        public Criteria andCollectunitidIn(List<String> values) {
            addCriterion("CollectUnitID in", values, "collectunitid");
            return (Criteria) this;
        }

        public Criteria andCollectunitidNotIn(List<String> values) {
            addCriterion("CollectUnitID not in", values, "collectunitid");
            return (Criteria) this;
        }

        public Criteria andCollectunitidBetween(String value1, String value2) {
            addCriterion("CollectUnitID between", value1, value2, "collectunitid");
            return (Criteria) this;
        }

        public Criteria andCollectunitidNotBetween(String value1, String value2) {
            addCriterion("CollectUnitID not between", value1, value2, "collectunitid");
            return (Criteria) this;
        }

        public Criteria andCollectamtIsNull() {
            addCriterion("CollectAmt is null");
            return (Criteria) this;
        }

        public Criteria andCollectamtIsNotNull() {
            addCriterion("CollectAmt is not null");
            return (Criteria) this;
        }

        public Criteria andCollectamtEqualTo(BigDecimal value) {
            addCriterion("CollectAmt =", value, "collectamt");
            return (Criteria) this;
        }

        public Criteria andCollectamtNotEqualTo(BigDecimal value) {
            addCriterion("CollectAmt <>", value, "collectamt");
            return (Criteria) this;
        }

        public Criteria andCollectamtGreaterThan(BigDecimal value) {
            addCriterion("CollectAmt >", value, "collectamt");
            return (Criteria) this;
        }

        public Criteria andCollectamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CollectAmt >=", value, "collectamt");
            return (Criteria) this;
        }

        public Criteria andCollectamtLessThan(BigDecimal value) {
            addCriterion("CollectAmt <", value, "collectamt");
            return (Criteria) this;
        }

        public Criteria andCollectamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CollectAmt <=", value, "collectamt");
            return (Criteria) this;
        }

        public Criteria andCollectamtIn(List<BigDecimal> values) {
            addCriterion("CollectAmt in", values, "collectamt");
            return (Criteria) this;
        }

        public Criteria andCollectamtNotIn(List<BigDecimal> values) {
            addCriterion("CollectAmt not in", values, "collectamt");
            return (Criteria) this;
        }

        public Criteria andCollectamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CollectAmt between", value1, value2, "collectamt");
            return (Criteria) this;
        }

        public Criteria andCollectamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CollectAmt not between", value1, value2, "collectamt");
            return (Criteria) this;
        }

        public Criteria andCollecttypeIsNull() {
            addCriterion("CollectType is null");
            return (Criteria) this;
        }

        public Criteria andCollecttypeIsNotNull() {
            addCriterion("CollectType is not null");
            return (Criteria) this;
        }

        public Criteria andCollecttypeEqualTo(String value) {
            addCriterion("CollectType =", value, "collecttype");
            return (Criteria) this;
        }

        public Criteria andCollecttypeNotEqualTo(String value) {
            addCriterion("CollectType <>", value, "collecttype");
            return (Criteria) this;
        }

        public Criteria andCollecttypeGreaterThan(String value) {
            addCriterion("CollectType >", value, "collecttype");
            return (Criteria) this;
        }

        public Criteria andCollecttypeGreaterThanOrEqualTo(String value) {
            addCriterion("CollectType >=", value, "collecttype");
            return (Criteria) this;
        }

        public Criteria andCollecttypeLessThan(String value) {
            addCriterion("CollectType <", value, "collecttype");
            return (Criteria) this;
        }

        public Criteria andCollecttypeLessThanOrEqualTo(String value) {
            addCriterion("CollectType <=", value, "collecttype");
            return (Criteria) this;
        }

        public Criteria andCollecttypeLike(String value) {
            addCriterion("CollectType like", value, "collecttype");
            return (Criteria) this;
        }

        public Criteria andCollecttypeNotLike(String value) {
            addCriterion("CollectType not like", value, "collecttype");
            return (Criteria) this;
        }

        public Criteria andCollecttypeIn(List<String> values) {
            addCriterion("CollectType in", values, "collecttype");
            return (Criteria) this;
        }

        public Criteria andCollecttypeNotIn(List<String> values) {
            addCriterion("CollectType not in", values, "collecttype");
            return (Criteria) this;
        }

        public Criteria andCollecttypeBetween(String value1, String value2) {
            addCriterion("CollectType between", value1, value2, "collecttype");
            return (Criteria) this;
        }

        public Criteria andCollecttypeNotBetween(String value1, String value2) {
            addCriterion("CollectType not between", value1, value2, "collecttype");
            return (Criteria) this;
        }

        public Criteria andCollectdateIsNull() {
            addCriterion("CollectDate is null");
            return (Criteria) this;
        }

        public Criteria andCollectdateIsNotNull() {
            addCriterion("CollectDate is not null");
            return (Criteria) this;
        }

        public Criteria andCollectdateEqualTo(Date value) {
            addCriterionForJDBCDate("CollectDate =", value, "collectdate");
            return (Criteria) this;
        }

        public Criteria andCollectdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CollectDate <>", value, "collectdate");
            return (Criteria) this;
        }

        public Criteria andCollectdateGreaterThan(Date value) {
            addCriterionForJDBCDate("CollectDate >", value, "collectdate");
            return (Criteria) this;
        }

        public Criteria andCollectdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CollectDate >=", value, "collectdate");
            return (Criteria) this;
        }

        public Criteria andCollectdateLessThan(Date value) {
            addCriterionForJDBCDate("CollectDate <", value, "collectdate");
            return (Criteria) this;
        }

        public Criteria andCollectdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CollectDate <=", value, "collectdate");
            return (Criteria) this;
        }

        public Criteria andCollectdateIn(List<Date> values) {
            addCriterionForJDBCDate("CollectDate in", values, "collectdate");
            return (Criteria) this;
        }

        public Criteria andCollectdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CollectDate not in", values, "collectdate");
            return (Criteria) this;
        }

        public Criteria andCollectdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CollectDate between", value1, value2, "collectdate");
            return (Criteria) this;
        }

        public Criteria andCollectdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CollectDate not between", value1, value2, "collectdate");
            return (Criteria) this;
        }

        public Criteria andCollectbillIsNull() {
            addCriterion("CollectBill is null");
            return (Criteria) this;
        }

        public Criteria andCollectbillIsNotNull() {
            addCriterion("CollectBill is not null");
            return (Criteria) this;
        }

        public Criteria andCollectbillEqualTo(String value) {
            addCriterion("CollectBill =", value, "collectbill");
            return (Criteria) this;
        }

        public Criteria andCollectbillNotEqualTo(String value) {
            addCriterion("CollectBill <>", value, "collectbill");
            return (Criteria) this;
        }

        public Criteria andCollectbillGreaterThan(String value) {
            addCriterion("CollectBill >", value, "collectbill");
            return (Criteria) this;
        }

        public Criteria andCollectbillGreaterThanOrEqualTo(String value) {
            addCriterion("CollectBill >=", value, "collectbill");
            return (Criteria) this;
        }

        public Criteria andCollectbillLessThan(String value) {
            addCriterion("CollectBill <", value, "collectbill");
            return (Criteria) this;
        }

        public Criteria andCollectbillLessThanOrEqualTo(String value) {
            addCriterion("CollectBill <=", value, "collectbill");
            return (Criteria) this;
        }

        public Criteria andCollectbillLike(String value) {
            addCriterion("CollectBill like", value, "collectbill");
            return (Criteria) this;
        }

        public Criteria andCollectbillNotLike(String value) {
            addCriterion("CollectBill not like", value, "collectbill");
            return (Criteria) this;
        }

        public Criteria andCollectbillIn(List<String> values) {
            addCriterion("CollectBill in", values, "collectbill");
            return (Criteria) this;
        }

        public Criteria andCollectbillNotIn(List<String> values) {
            addCriterion("CollectBill not in", values, "collectbill");
            return (Criteria) this;
        }

        public Criteria andCollectbillBetween(String value1, String value2) {
            addCriterion("CollectBill between", value1, value2, "collectbill");
            return (Criteria) this;
        }

        public Criteria andCollectbillNotBetween(String value1, String value2) {
            addCriterion("CollectBill not between", value1, value2, "collectbill");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("Comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("Comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("Comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("Comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("Comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("Comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("Comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("Comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("Comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("Comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("Comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("Comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("Comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("Comment not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andClaimidIsNull() {
            addCriterion("ClaimID is null");
            return (Criteria) this;
        }

        public Criteria andClaimidIsNotNull() {
            addCriterion("ClaimID is not null");
            return (Criteria) this;
        }

        public Criteria andClaimidEqualTo(String value) {
            addCriterion("ClaimID =", value, "claimid");
            return (Criteria) this;
        }

        public Criteria andClaimidNotEqualTo(String value) {
            addCriterion("ClaimID <>", value, "claimid");
            return (Criteria) this;
        }

        public Criteria andClaimidGreaterThan(String value) {
            addCriterion("ClaimID >", value, "claimid");
            return (Criteria) this;
        }

        public Criteria andClaimidGreaterThanOrEqualTo(String value) {
            addCriterion("ClaimID >=", value, "claimid");
            return (Criteria) this;
        }

        public Criteria andClaimidLessThan(String value) {
            addCriterion("ClaimID <", value, "claimid");
            return (Criteria) this;
        }

        public Criteria andClaimidLessThanOrEqualTo(String value) {
            addCriterion("ClaimID <=", value, "claimid");
            return (Criteria) this;
        }

        public Criteria andClaimidLike(String value) {
            addCriterion("ClaimID like", value, "claimid");
            return (Criteria) this;
        }

        public Criteria andClaimidNotLike(String value) {
            addCriterion("ClaimID not like", value, "claimid");
            return (Criteria) this;
        }

        public Criteria andClaimidIn(List<String> values) {
            addCriterion("ClaimID in", values, "claimid");
            return (Criteria) this;
        }

        public Criteria andClaimidNotIn(List<String> values) {
            addCriterion("ClaimID not in", values, "claimid");
            return (Criteria) this;
        }

        public Criteria andClaimidBetween(String value1, String value2) {
            addCriterion("ClaimID between", value1, value2, "claimid");
            return (Criteria) this;
        }

        public Criteria andClaimidNotBetween(String value1, String value2) {
            addCriterion("ClaimID not between", value1, value2, "claimid");
            return (Criteria) this;
        }

        public Criteria andSrcbankIsNull() {
            addCriterion("SrcBank is null");
            return (Criteria) this;
        }

        public Criteria andSrcbankIsNotNull() {
            addCriterion("SrcBank is not null");
            return (Criteria) this;
        }

        public Criteria andSrcbankEqualTo(String value) {
            addCriterion("SrcBank =", value, "srcbank");
            return (Criteria) this;
        }

        public Criteria andSrcbankNotEqualTo(String value) {
            addCriterion("SrcBank <>", value, "srcbank");
            return (Criteria) this;
        }

        public Criteria andSrcbankGreaterThan(String value) {
            addCriterion("SrcBank >", value, "srcbank");
            return (Criteria) this;
        }

        public Criteria andSrcbankGreaterThanOrEqualTo(String value) {
            addCriterion("SrcBank >=", value, "srcbank");
            return (Criteria) this;
        }

        public Criteria andSrcbankLessThan(String value) {
            addCriterion("SrcBank <", value, "srcbank");
            return (Criteria) this;
        }

        public Criteria andSrcbankLessThanOrEqualTo(String value) {
            addCriterion("SrcBank <=", value, "srcbank");
            return (Criteria) this;
        }

        public Criteria andSrcbankLike(String value) {
            addCriterion("SrcBank like", value, "srcbank");
            return (Criteria) this;
        }

        public Criteria andSrcbankNotLike(String value) {
            addCriterion("SrcBank not like", value, "srcbank");
            return (Criteria) this;
        }

        public Criteria andSrcbankIn(List<String> values) {
            addCriterion("SrcBank in", values, "srcbank");
            return (Criteria) this;
        }

        public Criteria andSrcbankNotIn(List<String> values) {
            addCriterion("SrcBank not in", values, "srcbank");
            return (Criteria) this;
        }

        public Criteria andSrcbankBetween(String value1, String value2) {
            addCriterion("SrcBank between", value1, value2, "srcbank");
            return (Criteria) this;
        }

        public Criteria andSrcbankNotBetween(String value1, String value2) {
            addCriterion("SrcBank not between", value1, value2, "srcbank");
            return (Criteria) this;
        }

        public Criteria andSrcnameIsNull() {
            addCriterion("SrcName is null");
            return (Criteria) this;
        }

        public Criteria andSrcnameIsNotNull() {
            addCriterion("SrcName is not null");
            return (Criteria) this;
        }

        public Criteria andSrcnameEqualTo(String value) {
            addCriterion("SrcName =", value, "srcname");
            return (Criteria) this;
        }

        public Criteria andSrcnameNotEqualTo(String value) {
            addCriterion("SrcName <>", value, "srcname");
            return (Criteria) this;
        }

        public Criteria andSrcnameGreaterThan(String value) {
            addCriterion("SrcName >", value, "srcname");
            return (Criteria) this;
        }

        public Criteria andSrcnameGreaterThanOrEqualTo(String value) {
            addCriterion("SrcName >=", value, "srcname");
            return (Criteria) this;
        }

        public Criteria andSrcnameLessThan(String value) {
            addCriterion("SrcName <", value, "srcname");
            return (Criteria) this;
        }

        public Criteria andSrcnameLessThanOrEqualTo(String value) {
            addCriterion("SrcName <=", value, "srcname");
            return (Criteria) this;
        }

        public Criteria andSrcnameLike(String value) {
            addCriterion("SrcName like", value, "srcname");
            return (Criteria) this;
        }

        public Criteria andSrcnameNotLike(String value) {
            addCriterion("SrcName not like", value, "srcname");
            return (Criteria) this;
        }

        public Criteria andSrcnameIn(List<String> values) {
            addCriterion("SrcName in", values, "srcname");
            return (Criteria) this;
        }

        public Criteria andSrcnameNotIn(List<String> values) {
            addCriterion("SrcName not in", values, "srcname");
            return (Criteria) this;
        }

        public Criteria andSrcnameBetween(String value1, String value2) {
            addCriterion("SrcName between", value1, value2, "srcname");
            return (Criteria) this;
        }

        public Criteria andSrcnameNotBetween(String value1, String value2) {
            addCriterion("SrcName not between", value1, value2, "srcname");
            return (Criteria) this;
        }

        public Criteria andSrcbankidIsNull() {
            addCriterion("SrcBankID is null");
            return (Criteria) this;
        }

        public Criteria andSrcbankidIsNotNull() {
            addCriterion("SrcBankID is not null");
            return (Criteria) this;
        }

        public Criteria andSrcbankidEqualTo(String value) {
            addCriterion("SrcBankID =", value, "srcbankid");
            return (Criteria) this;
        }

        public Criteria andSrcbankidNotEqualTo(String value) {
            addCriterion("SrcBankID <>", value, "srcbankid");
            return (Criteria) this;
        }

        public Criteria andSrcbankidGreaterThan(String value) {
            addCriterion("SrcBankID >", value, "srcbankid");
            return (Criteria) this;
        }

        public Criteria andSrcbankidGreaterThanOrEqualTo(String value) {
            addCriterion("SrcBankID >=", value, "srcbankid");
            return (Criteria) this;
        }

        public Criteria andSrcbankidLessThan(String value) {
            addCriterion("SrcBankID <", value, "srcbankid");
            return (Criteria) this;
        }

        public Criteria andSrcbankidLessThanOrEqualTo(String value) {
            addCriterion("SrcBankID <=", value, "srcbankid");
            return (Criteria) this;
        }

        public Criteria andSrcbankidLike(String value) {
            addCriterion("SrcBankID like", value, "srcbankid");
            return (Criteria) this;
        }

        public Criteria andSrcbankidNotLike(String value) {
            addCriterion("SrcBankID not like", value, "srcbankid");
            return (Criteria) this;
        }

        public Criteria andSrcbankidIn(List<String> values) {
            addCriterion("SrcBankID in", values, "srcbankid");
            return (Criteria) this;
        }

        public Criteria andSrcbankidNotIn(List<String> values) {
            addCriterion("SrcBankID not in", values, "srcbankid");
            return (Criteria) this;
        }

        public Criteria andSrcbankidBetween(String value1, String value2) {
            addCriterion("SrcBankID between", value1, value2, "srcbankid");
            return (Criteria) this;
        }

        public Criteria andSrcbankidNotBetween(String value1, String value2) {
            addCriterion("SrcBankID not between", value1, value2, "srcbankid");
            return (Criteria) this;
        }

        public Criteria andCollectstatusIsNull() {
            addCriterion("CollectStatus is null");
            return (Criteria) this;
        }

        public Criteria andCollectstatusIsNotNull() {
            addCriterion("CollectStatus is not null");
            return (Criteria) this;
        }

        public Criteria andCollectstatusEqualTo(Integer value) {
            addCriterion("CollectStatus =", value, "collectstatus");
            return (Criteria) this;
        }

        public Criteria andCollectstatusNotEqualTo(Integer value) {
            addCriterion("CollectStatus <>", value, "collectstatus");
            return (Criteria) this;
        }

        public Criteria andCollectstatusGreaterThan(Integer value) {
            addCriterion("CollectStatus >", value, "collectstatus");
            return (Criteria) this;
        }

        public Criteria andCollectstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("CollectStatus >=", value, "collectstatus");
            return (Criteria) this;
        }

        public Criteria andCollectstatusLessThan(Integer value) {
            addCriterion("CollectStatus <", value, "collectstatus");
            return (Criteria) this;
        }

        public Criteria andCollectstatusLessThanOrEqualTo(Integer value) {
            addCriterion("CollectStatus <=", value, "collectstatus");
            return (Criteria) this;
        }

        public Criteria andCollectstatusIn(List<Integer> values) {
            addCriterion("CollectStatus in", values, "collectstatus");
            return (Criteria) this;
        }

        public Criteria andCollectstatusNotIn(List<Integer> values) {
            addCriterion("CollectStatus not in", values, "collectstatus");
            return (Criteria) this;
        }

        public Criteria andCollectstatusBetween(Integer value1, Integer value2) {
            addCriterion("CollectStatus between", value1, value2, "collectstatus");
            return (Criteria) this;
        }

        public Criteria andCollectstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("CollectStatus not between", value1, value2, "collectstatus");
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

        public Criteria andAuditorIsNull() {
            addCriterion("Auditor is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNotNull() {
            addCriterion("Auditor is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorEqualTo(String value) {
            addCriterion("Auditor =", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotEqualTo(String value) {
            addCriterion("Auditor <>", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThan(String value) {
            addCriterion("Auditor >", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("Auditor >=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThan(String value) {
            addCriterion("Auditor <", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThanOrEqualTo(String value) {
            addCriterion("Auditor <=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLike(String value) {
            addCriterion("Auditor like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotLike(String value) {
            addCriterion("Auditor not like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIn(List<String> values) {
            addCriterion("Auditor in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotIn(List<String> values) {
            addCriterion("Auditor not in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorBetween(String value1, String value2) {
            addCriterion("Auditor between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotBetween(String value1, String value2) {
            addCriterion("Auditor not between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditoridIsNull() {
            addCriterion("AuditorID is null");
            return (Criteria) this;
        }

        public Criteria andAuditoridIsNotNull() {
            addCriterion("AuditorID is not null");
            return (Criteria) this;
        }

        public Criteria andAuditoridEqualTo(String value) {
            addCriterion("AuditorID =", value, "auditorid");
            return (Criteria) this;
        }

        public Criteria andAuditoridNotEqualTo(String value) {
            addCriterion("AuditorID <>", value, "auditorid");
            return (Criteria) this;
        }

        public Criteria andAuditoridGreaterThan(String value) {
            addCriterion("AuditorID >", value, "auditorid");
            return (Criteria) this;
        }

        public Criteria andAuditoridGreaterThanOrEqualTo(String value) {
            addCriterion("AuditorID >=", value, "auditorid");
            return (Criteria) this;
        }

        public Criteria andAuditoridLessThan(String value) {
            addCriterion("AuditorID <", value, "auditorid");
            return (Criteria) this;
        }

        public Criteria andAuditoridLessThanOrEqualTo(String value) {
            addCriterion("AuditorID <=", value, "auditorid");
            return (Criteria) this;
        }

        public Criteria andAuditoridLike(String value) {
            addCriterion("AuditorID like", value, "auditorid");
            return (Criteria) this;
        }

        public Criteria andAuditoridNotLike(String value) {
            addCriterion("AuditorID not like", value, "auditorid");
            return (Criteria) this;
        }

        public Criteria andAuditoridIn(List<String> values) {
            addCriterion("AuditorID in", values, "auditorid");
            return (Criteria) this;
        }

        public Criteria andAuditoridNotIn(List<String> values) {
            addCriterion("AuditorID not in", values, "auditorid");
            return (Criteria) this;
        }

        public Criteria andAuditoridBetween(String value1, String value2) {
            addCriterion("AuditorID between", value1, value2, "auditorid");
            return (Criteria) this;
        }

        public Criteria andAuditoridNotBetween(String value1, String value2) {
            addCriterion("AuditorID not between", value1, value2, "auditorid");
            return (Criteria) this;
        }

        public Criteria andAuditdateIsNull() {
            addCriterion("AuditDate is null");
            return (Criteria) this;
        }

        public Criteria andAuditdateIsNotNull() {
            addCriterion("AuditDate is not null");
            return (Criteria) this;
        }

        public Criteria andAuditdateEqualTo(Date value) {
            addCriterion("AuditDate =", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateNotEqualTo(Date value) {
            addCriterion("AuditDate <>", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateGreaterThan(Date value) {
            addCriterion("AuditDate >", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateGreaterThanOrEqualTo(Date value) {
            addCriterion("AuditDate >=", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateLessThan(Date value) {
            addCriterion("AuditDate <", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateLessThanOrEqualTo(Date value) {
            addCriterion("AuditDate <=", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateIn(List<Date> values) {
            addCriterion("AuditDate in", values, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateNotIn(List<Date> values) {
            addCriterion("AuditDate not in", values, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateBetween(Date value1, Date value2) {
            addCriterion("AuditDate between", value1, value2, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateNotBetween(Date value1, Date value2) {
            addCriterion("AuditDate not between", value1, value2, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditcommentIsNull() {
            addCriterion("AuditComment is null");
            return (Criteria) this;
        }

        public Criteria andAuditcommentIsNotNull() {
            addCriterion("AuditComment is not null");
            return (Criteria) this;
        }

        public Criteria andAuditcommentEqualTo(String value) {
            addCriterion("AuditComment =", value, "auditcomment");
            return (Criteria) this;
        }

        public Criteria andAuditcommentNotEqualTo(String value) {
            addCriterion("AuditComment <>", value, "auditcomment");
            return (Criteria) this;
        }

        public Criteria andAuditcommentGreaterThan(String value) {
            addCriterion("AuditComment >", value, "auditcomment");
            return (Criteria) this;
        }

        public Criteria andAuditcommentGreaterThanOrEqualTo(String value) {
            addCriterion("AuditComment >=", value, "auditcomment");
            return (Criteria) this;
        }

        public Criteria andAuditcommentLessThan(String value) {
            addCriterion("AuditComment <", value, "auditcomment");
            return (Criteria) this;
        }

        public Criteria andAuditcommentLessThanOrEqualTo(String value) {
            addCriterion("AuditComment <=", value, "auditcomment");
            return (Criteria) this;
        }

        public Criteria andAuditcommentLike(String value) {
            addCriterion("AuditComment like", value, "auditcomment");
            return (Criteria) this;
        }

        public Criteria andAuditcommentNotLike(String value) {
            addCriterion("AuditComment not like", value, "auditcomment");
            return (Criteria) this;
        }

        public Criteria andAuditcommentIn(List<String> values) {
            addCriterion("AuditComment in", values, "auditcomment");
            return (Criteria) this;
        }

        public Criteria andAuditcommentNotIn(List<String> values) {
            addCriterion("AuditComment not in", values, "auditcomment");
            return (Criteria) this;
        }

        public Criteria andAuditcommentBetween(String value1, String value2) {
            addCriterion("AuditComment between", value1, value2, "auditcomment");
            return (Criteria) this;
        }

        public Criteria andAuditcommentNotBetween(String value1, String value2) {
            addCriterion("AuditComment not between", value1, value2, "auditcomment");
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

        public Criteria andPaymentrequestidIsNull() {
            addCriterion("PaymentRequestID is null");
            return (Criteria) this;
        }

        public Criteria andPaymentrequestidIsNotNull() {
            addCriterion("PaymentRequestID is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentrequestidEqualTo(String value) {
            addCriterion("PaymentRequestID =", value, "paymentrequestid");
            return (Criteria) this;
        }

        public Criteria andPaymentrequestidNotEqualTo(String value) {
            addCriterion("PaymentRequestID <>", value, "paymentrequestid");
            return (Criteria) this;
        }

        public Criteria andPaymentrequestidGreaterThan(String value) {
            addCriterion("PaymentRequestID >", value, "paymentrequestid");
            return (Criteria) this;
        }

        public Criteria andPaymentrequestidGreaterThanOrEqualTo(String value) {
            addCriterion("PaymentRequestID >=", value, "paymentrequestid");
            return (Criteria) this;
        }

        public Criteria andPaymentrequestidLessThan(String value) {
            addCriterion("PaymentRequestID <", value, "paymentrequestid");
            return (Criteria) this;
        }

        public Criteria andPaymentrequestidLessThanOrEqualTo(String value) {
            addCriterion("PaymentRequestID <=", value, "paymentrequestid");
            return (Criteria) this;
        }

        public Criteria andPaymentrequestidLike(String value) {
            addCriterion("PaymentRequestID like", value, "paymentrequestid");
            return (Criteria) this;
        }

        public Criteria andPaymentrequestidNotLike(String value) {
            addCriterion("PaymentRequestID not like", value, "paymentrequestid");
            return (Criteria) this;
        }

        public Criteria andPaymentrequestidIn(List<String> values) {
            addCriterion("PaymentRequestID in", values, "paymentrequestid");
            return (Criteria) this;
        }

        public Criteria andPaymentrequestidNotIn(List<String> values) {
            addCriterion("PaymentRequestID not in", values, "paymentrequestid");
            return (Criteria) this;
        }

        public Criteria andPaymentrequestidBetween(String value1, String value2) {
            addCriterion("PaymentRequestID between", value1, value2, "paymentrequestid");
            return (Criteria) this;
        }

        public Criteria andPaymentrequestidNotBetween(String value1, String value2) {
            addCriterion("PaymentRequestID not between", value1, value2, "paymentrequestid");
            return (Criteria) this;
        }

        public Criteria andIsbuyerapplyIsNull() {
            addCriterion("IsBuyerApply is null");
            return (Criteria) this;
        }

        public Criteria andIsbuyerapplyIsNotNull() {
            addCriterion("IsBuyerApply is not null");
            return (Criteria) this;
        }

        public Criteria andIsbuyerapplyEqualTo(Boolean value) {
            addCriterion("IsBuyerApply =", value, "isbuyerapply");
            return (Criteria) this;
        }

        public Criteria andIsbuyerapplyNotEqualTo(Boolean value) {
            addCriterion("IsBuyerApply <>", value, "isbuyerapply");
            return (Criteria) this;
        }

        public Criteria andIsbuyerapplyGreaterThan(Boolean value) {
            addCriterion("IsBuyerApply >", value, "isbuyerapply");
            return (Criteria) this;
        }

        public Criteria andIsbuyerapplyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsBuyerApply >=", value, "isbuyerapply");
            return (Criteria) this;
        }

        public Criteria andIsbuyerapplyLessThan(Boolean value) {
            addCriterion("IsBuyerApply <", value, "isbuyerapply");
            return (Criteria) this;
        }

        public Criteria andIsbuyerapplyLessThanOrEqualTo(Boolean value) {
            addCriterion("IsBuyerApply <=", value, "isbuyerapply");
            return (Criteria) this;
        }

        public Criteria andIsbuyerapplyIn(List<Boolean> values) {
            addCriterion("IsBuyerApply in", values, "isbuyerapply");
            return (Criteria) this;
        }

        public Criteria andIsbuyerapplyNotIn(List<Boolean> values) {
            addCriterion("IsBuyerApply not in", values, "isbuyerapply");
            return (Criteria) this;
        }

        public Criteria andIsbuyerapplyBetween(Boolean value1, Boolean value2) {
            addCriterion("IsBuyerApply between", value1, value2, "isbuyerapply");
            return (Criteria) this;
        }

        public Criteria andIsbuyerapplyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsBuyerApply not between", value1, value2, "isbuyerapply");
            return (Criteria) this;
        }

        public Criteria andBuyerorgnameIsNull() {
            addCriterion("BuyerOrgName is null");
            return (Criteria) this;
        }

        public Criteria andBuyerorgnameIsNotNull() {
            addCriterion("BuyerOrgName is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerorgnameEqualTo(String value) {
            addCriterion("BuyerOrgName =", value, "buyerorgname");
            return (Criteria) this;
        }

        public Criteria andBuyerorgnameNotEqualTo(String value) {
            addCriterion("BuyerOrgName <>", value, "buyerorgname");
            return (Criteria) this;
        }

        public Criteria andBuyerorgnameGreaterThan(String value) {
            addCriterion("BuyerOrgName >", value, "buyerorgname");
            return (Criteria) this;
        }

        public Criteria andBuyerorgnameGreaterThanOrEqualTo(String value) {
            addCriterion("BuyerOrgName >=", value, "buyerorgname");
            return (Criteria) this;
        }

        public Criteria andBuyerorgnameLessThan(String value) {
            addCriterion("BuyerOrgName <", value, "buyerorgname");
            return (Criteria) this;
        }

        public Criteria andBuyerorgnameLessThanOrEqualTo(String value) {
            addCriterion("BuyerOrgName <=", value, "buyerorgname");
            return (Criteria) this;
        }

        public Criteria andBuyerorgnameLike(String value) {
            addCriterion("BuyerOrgName like", value, "buyerorgname");
            return (Criteria) this;
        }

        public Criteria andBuyerorgnameNotLike(String value) {
            addCriterion("BuyerOrgName not like", value, "buyerorgname");
            return (Criteria) this;
        }

        public Criteria andBuyerorgnameIn(List<String> values) {
            addCriterion("BuyerOrgName in", values, "buyerorgname");
            return (Criteria) this;
        }

        public Criteria andBuyerorgnameNotIn(List<String> values) {
            addCriterion("BuyerOrgName not in", values, "buyerorgname");
            return (Criteria) this;
        }

        public Criteria andBuyerorgnameBetween(String value1, String value2) {
            addCriterion("BuyerOrgName between", value1, value2, "buyerorgname");
            return (Criteria) this;
        }

        public Criteria andBuyerorgnameNotBetween(String value1, String value2) {
            addCriterion("BuyerOrgName not between", value1, value2, "buyerorgname");
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