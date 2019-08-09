package com.holyrobot.con_order.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdVolunteerOrderShopAdjustExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdVolunteerOrderShopAdjustExample() {
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

        public Criteria andOrderpriceIsNull() {
            addCriterion("OrderPrice is null");
            return (Criteria) this;
        }

        public Criteria andOrderpriceIsNotNull() {
            addCriterion("OrderPrice is not null");
            return (Criteria) this;
        }

        public Criteria andOrderpriceEqualTo(BigDecimal value) {
            addCriterion("OrderPrice =", value, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceNotEqualTo(BigDecimal value) {
            addCriterion("OrderPrice <>", value, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceGreaterThan(BigDecimal value) {
            addCriterion("OrderPrice >", value, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OrderPrice >=", value, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceLessThan(BigDecimal value) {
            addCriterion("OrderPrice <", value, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OrderPrice <=", value, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceIn(List<BigDecimal> values) {
            addCriterion("OrderPrice in", values, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceNotIn(List<BigDecimal> values) {
            addCriterion("OrderPrice not in", values, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OrderPrice between", value1, value2, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OrderPrice not between", value1, value2, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrdercostpriceIsNull() {
            addCriterion("OrderCostPrice is null");
            return (Criteria) this;
        }

        public Criteria andOrdercostpriceIsNotNull() {
            addCriterion("OrderCostPrice is not null");
            return (Criteria) this;
        }

        public Criteria andOrdercostpriceEqualTo(BigDecimal value) {
            addCriterion("OrderCostPrice =", value, "ordercostprice");
            return (Criteria) this;
        }

        public Criteria andOrdercostpriceNotEqualTo(BigDecimal value) {
            addCriterion("OrderCostPrice <>", value, "ordercostprice");
            return (Criteria) this;
        }

        public Criteria andOrdercostpriceGreaterThan(BigDecimal value) {
            addCriterion("OrderCostPrice >", value, "ordercostprice");
            return (Criteria) this;
        }

        public Criteria andOrdercostpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OrderCostPrice >=", value, "ordercostprice");
            return (Criteria) this;
        }

        public Criteria andOrdercostpriceLessThan(BigDecimal value) {
            addCriterion("OrderCostPrice <", value, "ordercostprice");
            return (Criteria) this;
        }

        public Criteria andOrdercostpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OrderCostPrice <=", value, "ordercostprice");
            return (Criteria) this;
        }

        public Criteria andOrdercostpriceIn(List<BigDecimal> values) {
            addCriterion("OrderCostPrice in", values, "ordercostprice");
            return (Criteria) this;
        }

        public Criteria andOrdercostpriceNotIn(List<BigDecimal> values) {
            addCriterion("OrderCostPrice not in", values, "ordercostprice");
            return (Criteria) this;
        }

        public Criteria andOrdercostpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OrderCostPrice between", value1, value2, "ordercostprice");
            return (Criteria) this;
        }

        public Criteria andOrdercostpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OrderCostPrice not between", value1, value2, "ordercostprice");
            return (Criteria) this;
        }

        public Criteria andCommissionamtIsNull() {
            addCriterion("CommissionAmt is null");
            return (Criteria) this;
        }

        public Criteria andCommissionamtIsNotNull() {
            addCriterion("CommissionAmt is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionamtEqualTo(BigDecimal value) {
            addCriterion("CommissionAmt =", value, "commissionamt");
            return (Criteria) this;
        }

        public Criteria andCommissionamtNotEqualTo(BigDecimal value) {
            addCriterion("CommissionAmt <>", value, "commissionamt");
            return (Criteria) this;
        }

        public Criteria andCommissionamtGreaterThan(BigDecimal value) {
            addCriterion("CommissionAmt >", value, "commissionamt");
            return (Criteria) this;
        }

        public Criteria andCommissionamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CommissionAmt >=", value, "commissionamt");
            return (Criteria) this;
        }

        public Criteria andCommissionamtLessThan(BigDecimal value) {
            addCriterion("CommissionAmt <", value, "commissionamt");
            return (Criteria) this;
        }

        public Criteria andCommissionamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CommissionAmt <=", value, "commissionamt");
            return (Criteria) this;
        }

        public Criteria andCommissionamtIn(List<BigDecimal> values) {
            addCriterion("CommissionAmt in", values, "commissionamt");
            return (Criteria) this;
        }

        public Criteria andCommissionamtNotIn(List<BigDecimal> values) {
            addCriterion("CommissionAmt not in", values, "commissionamt");
            return (Criteria) this;
        }

        public Criteria andCommissionamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CommissionAmt between", value1, value2, "commissionamt");
            return (Criteria) this;
        }

        public Criteria andCommissionamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CommissionAmt not between", value1, value2, "commissionamt");
            return (Criteria) this;
        }

        public Criteria andAdjustpriceIsNull() {
            addCriterion("AdjustPrice is null");
            return (Criteria) this;
        }

        public Criteria andAdjustpriceIsNotNull() {
            addCriterion("AdjustPrice is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustpriceEqualTo(BigDecimal value) {
            addCriterion("AdjustPrice =", value, "adjustprice");
            return (Criteria) this;
        }

        public Criteria andAdjustpriceNotEqualTo(BigDecimal value) {
            addCriterion("AdjustPrice <>", value, "adjustprice");
            return (Criteria) this;
        }

        public Criteria andAdjustpriceGreaterThan(BigDecimal value) {
            addCriterion("AdjustPrice >", value, "adjustprice");
            return (Criteria) this;
        }

        public Criteria andAdjustpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AdjustPrice >=", value, "adjustprice");
            return (Criteria) this;
        }

        public Criteria andAdjustpriceLessThan(BigDecimal value) {
            addCriterion("AdjustPrice <", value, "adjustprice");
            return (Criteria) this;
        }

        public Criteria andAdjustpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AdjustPrice <=", value, "adjustprice");
            return (Criteria) this;
        }

        public Criteria andAdjustpriceIn(List<BigDecimal> values) {
            addCriterion("AdjustPrice in", values, "adjustprice");
            return (Criteria) this;
        }

        public Criteria andAdjustpriceNotIn(List<BigDecimal> values) {
            addCriterion("AdjustPrice not in", values, "adjustprice");
            return (Criteria) this;
        }

        public Criteria andAdjustpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AdjustPrice between", value1, value2, "adjustprice");
            return (Criteria) this;
        }

        public Criteria andAdjustpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AdjustPrice not between", value1, value2, "adjustprice");
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