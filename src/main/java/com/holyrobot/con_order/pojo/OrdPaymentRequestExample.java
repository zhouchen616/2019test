package com.holyrobot.con_order.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdPaymentRequestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdPaymentRequestExample() {
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

        public Criteria andPaymentamtIsNull() {
            addCriterion("PaymentAmt is null");
            return (Criteria) this;
        }

        public Criteria andPaymentamtIsNotNull() {
            addCriterion("PaymentAmt is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentamtEqualTo(BigDecimal value) {
            addCriterion("PaymentAmt =", value, "paymentamt");
            return (Criteria) this;
        }

        public Criteria andPaymentamtNotEqualTo(BigDecimal value) {
            addCriterion("PaymentAmt <>", value, "paymentamt");
            return (Criteria) this;
        }

        public Criteria andPaymentamtGreaterThan(BigDecimal value) {
            addCriterion("PaymentAmt >", value, "paymentamt");
            return (Criteria) this;
        }

        public Criteria andPaymentamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PaymentAmt >=", value, "paymentamt");
            return (Criteria) this;
        }

        public Criteria andPaymentamtLessThan(BigDecimal value) {
            addCriterion("PaymentAmt <", value, "paymentamt");
            return (Criteria) this;
        }

        public Criteria andPaymentamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PaymentAmt <=", value, "paymentamt");
            return (Criteria) this;
        }

        public Criteria andPaymentamtIn(List<BigDecimal> values) {
            addCriterion("PaymentAmt in", values, "paymentamt");
            return (Criteria) this;
        }

        public Criteria andPaymentamtNotIn(List<BigDecimal> values) {
            addCriterion("PaymentAmt not in", values, "paymentamt");
            return (Criteria) this;
        }

        public Criteria andPaymentamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PaymentAmt between", value1, value2, "paymentamt");
            return (Criteria) this;
        }

        public Criteria andPaymentamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PaymentAmt not between", value1, value2, "paymentamt");
            return (Criteria) this;
        }

        public Criteria andSupplieridIsNull() {
            addCriterion("SupplierID is null");
            return (Criteria) this;
        }

        public Criteria andSupplieridIsNotNull() {
            addCriterion("SupplierID is not null");
            return (Criteria) this;
        }

        public Criteria andSupplieridEqualTo(String value) {
            addCriterion("SupplierID =", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotEqualTo(String value) {
            addCriterion("SupplierID <>", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThan(String value) {
            addCriterion("SupplierID >", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThanOrEqualTo(String value) {
            addCriterion("SupplierID >=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThan(String value) {
            addCriterion("SupplierID <", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThanOrEqualTo(String value) {
            addCriterion("SupplierID <=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLike(String value) {
            addCriterion("SupplierID like", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotLike(String value) {
            addCriterion("SupplierID not like", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridIn(List<String> values) {
            addCriterion("SupplierID in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotIn(List<String> values) {
            addCriterion("SupplierID not in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridBetween(String value1, String value2) {
            addCriterion("SupplierID between", value1, value2, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotBetween(String value1, String value2) {
            addCriterion("SupplierID not between", value1, value2, "supplierid");
            return (Criteria) this;
        }

        public Criteria andOrdercostidIsNull() {
            addCriterion("OrderCostID is null");
            return (Criteria) this;
        }

        public Criteria andOrdercostidIsNotNull() {
            addCriterion("OrderCostID is not null");
            return (Criteria) this;
        }

        public Criteria andOrdercostidEqualTo(String value) {
            addCriterion("OrderCostID =", value, "ordercostid");
            return (Criteria) this;
        }

        public Criteria andOrdercostidNotEqualTo(String value) {
            addCriterion("OrderCostID <>", value, "ordercostid");
            return (Criteria) this;
        }

        public Criteria andOrdercostidGreaterThan(String value) {
            addCriterion("OrderCostID >", value, "ordercostid");
            return (Criteria) this;
        }

        public Criteria andOrdercostidGreaterThanOrEqualTo(String value) {
            addCriterion("OrderCostID >=", value, "ordercostid");
            return (Criteria) this;
        }

        public Criteria andOrdercostidLessThan(String value) {
            addCriterion("OrderCostID <", value, "ordercostid");
            return (Criteria) this;
        }

        public Criteria andOrdercostidLessThanOrEqualTo(String value) {
            addCriterion("OrderCostID <=", value, "ordercostid");
            return (Criteria) this;
        }

        public Criteria andOrdercostidLike(String value) {
            addCriterion("OrderCostID like", value, "ordercostid");
            return (Criteria) this;
        }

        public Criteria andOrdercostidNotLike(String value) {
            addCriterion("OrderCostID not like", value, "ordercostid");
            return (Criteria) this;
        }

        public Criteria andOrdercostidIn(List<String> values) {
            addCriterion("OrderCostID in", values, "ordercostid");
            return (Criteria) this;
        }

        public Criteria andOrdercostidNotIn(List<String> values) {
            addCriterion("OrderCostID not in", values, "ordercostid");
            return (Criteria) this;
        }

        public Criteria andOrdercostidBetween(String value1, String value2) {
            addCriterion("OrderCostID between", value1, value2, "ordercostid");
            return (Criteria) this;
        }

        public Criteria andOrdercostidNotBetween(String value1, String value2) {
            addCriterion("OrderCostID not between", value1, value2, "ordercostid");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("Creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("Creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("Creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("Creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("Creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("Creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("Creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("Creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("Creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("Creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("Creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("Creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("Creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("Creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatoridIsNull() {
            addCriterion("CreatorID is null");
            return (Criteria) this;
        }

        public Criteria andCreatoridIsNotNull() {
            addCriterion("CreatorID is not null");
            return (Criteria) this;
        }

        public Criteria andCreatoridEqualTo(String value) {
            addCriterion("CreatorID =", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotEqualTo(String value) {
            addCriterion("CreatorID <>", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridGreaterThan(String value) {
            addCriterion("CreatorID >", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridGreaterThanOrEqualTo(String value) {
            addCriterion("CreatorID >=", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridLessThan(String value) {
            addCriterion("CreatorID <", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridLessThanOrEqualTo(String value) {
            addCriterion("CreatorID <=", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridLike(String value) {
            addCriterion("CreatorID like", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotLike(String value) {
            addCriterion("CreatorID not like", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridIn(List<String> values) {
            addCriterion("CreatorID in", values, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotIn(List<String> values) {
            addCriterion("CreatorID not in", values, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridBetween(String value1, String value2) {
            addCriterion("CreatorID between", value1, value2, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotBetween(String value1, String value2) {
            addCriterion("CreatorID not between", value1, value2, "creatorid");
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

        public Criteria andCreatedateIsNull() {
            addCriterion("CreateDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("CreateDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("CreateDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("CreateDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("CreateDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("CreateDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("CreateDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("CreateDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("CreateDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("CreateDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("CreateDate not between", value1, value2, "createdate");
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

        public Criteria andSuppliernameIsNull() {
            addCriterion("SupplierName is null");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIsNotNull() {
            addCriterion("SupplierName is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliernameEqualTo(String value) {
            addCriterion("SupplierName =", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotEqualTo(String value) {
            addCriterion("SupplierName <>", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameGreaterThan(String value) {
            addCriterion("SupplierName >", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameGreaterThanOrEqualTo(String value) {
            addCriterion("SupplierName >=", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLessThan(String value) {
            addCriterion("SupplierName <", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLessThanOrEqualTo(String value) {
            addCriterion("SupplierName <=", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLike(String value) {
            addCriterion("SupplierName like", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotLike(String value) {
            addCriterion("SupplierName not like", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIn(List<String> values) {
            addCriterion("SupplierName in", values, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotIn(List<String> values) {
            addCriterion("SupplierName not in", values, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameBetween(String value1, String value2) {
            addCriterion("SupplierName between", value1, value2, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotBetween(String value1, String value2) {
            addCriterion("SupplierName not between", value1, value2, "suppliername");
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

        public Criteria andIssellerauditIsNull() {
            addCriterion("IsSellerAudit is null");
            return (Criteria) this;
        }

        public Criteria andIssellerauditIsNotNull() {
            addCriterion("IsSellerAudit is not null");
            return (Criteria) this;
        }

        public Criteria andIssellerauditEqualTo(Boolean value) {
            addCriterion("IsSellerAudit =", value, "isselleraudit");
            return (Criteria) this;
        }

        public Criteria andIssellerauditNotEqualTo(Boolean value) {
            addCriterion("IsSellerAudit <>", value, "isselleraudit");
            return (Criteria) this;
        }

        public Criteria andIssellerauditGreaterThan(Boolean value) {
            addCriterion("IsSellerAudit >", value, "isselleraudit");
            return (Criteria) this;
        }

        public Criteria andIssellerauditGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsSellerAudit >=", value, "isselleraudit");
            return (Criteria) this;
        }

        public Criteria andIssellerauditLessThan(Boolean value) {
            addCriterion("IsSellerAudit <", value, "isselleraudit");
            return (Criteria) this;
        }

        public Criteria andIssellerauditLessThanOrEqualTo(Boolean value) {
            addCriterion("IsSellerAudit <=", value, "isselleraudit");
            return (Criteria) this;
        }

        public Criteria andIssellerauditIn(List<Boolean> values) {
            addCriterion("IsSellerAudit in", values, "isselleraudit");
            return (Criteria) this;
        }

        public Criteria andIssellerauditNotIn(List<Boolean> values) {
            addCriterion("IsSellerAudit not in", values, "isselleraudit");
            return (Criteria) this;
        }

        public Criteria andIssellerauditBetween(Boolean value1, Boolean value2) {
            addCriterion("IsSellerAudit between", value1, value2, "isselleraudit");
            return (Criteria) this;
        }

        public Criteria andIssellerauditNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsSellerAudit not between", value1, value2, "isselleraudit");
            return (Criteria) this;
        }

        public Criteria andIscreditpayIsNull() {
            addCriterion("IsCreditPay is null");
            return (Criteria) this;
        }

        public Criteria andIscreditpayIsNotNull() {
            addCriterion("IsCreditPay is not null");
            return (Criteria) this;
        }

        public Criteria andIscreditpayEqualTo(Boolean value) {
            addCriterion("IsCreditPay =", value, "iscreditpay");
            return (Criteria) this;
        }

        public Criteria andIscreditpayNotEqualTo(Boolean value) {
            addCriterion("IsCreditPay <>", value, "iscreditpay");
            return (Criteria) this;
        }

        public Criteria andIscreditpayGreaterThan(Boolean value) {
            addCriterion("IsCreditPay >", value, "iscreditpay");
            return (Criteria) this;
        }

        public Criteria andIscreditpayGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsCreditPay >=", value, "iscreditpay");
            return (Criteria) this;
        }

        public Criteria andIscreditpayLessThan(Boolean value) {
            addCriterion("IsCreditPay <", value, "iscreditpay");
            return (Criteria) this;
        }

        public Criteria andIscreditpayLessThanOrEqualTo(Boolean value) {
            addCriterion("IsCreditPay <=", value, "iscreditpay");
            return (Criteria) this;
        }

        public Criteria andIscreditpayIn(List<Boolean> values) {
            addCriterion("IsCreditPay in", values, "iscreditpay");
            return (Criteria) this;
        }

        public Criteria andIscreditpayNotIn(List<Boolean> values) {
            addCriterion("IsCreditPay not in", values, "iscreditpay");
            return (Criteria) this;
        }

        public Criteria andIscreditpayBetween(Boolean value1, Boolean value2) {
            addCriterion("IsCreditPay between", value1, value2, "iscreditpay");
            return (Criteria) this;
        }

        public Criteria andIscreditpayNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsCreditPay not between", value1, value2, "iscreditpay");
            return (Criteria) this;
        }

        public Criteria andCreditpaydateIsNull() {
            addCriterion("CreditPayDate is null");
            return (Criteria) this;
        }

        public Criteria andCreditpaydateIsNotNull() {
            addCriterion("CreditPayDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreditpaydateEqualTo(Date value) {
            addCriterion("CreditPayDate =", value, "creditpaydate");
            return (Criteria) this;
        }

        public Criteria andCreditpaydateNotEqualTo(Date value) {
            addCriterion("CreditPayDate <>", value, "creditpaydate");
            return (Criteria) this;
        }

        public Criteria andCreditpaydateGreaterThan(Date value) {
            addCriterion("CreditPayDate >", value, "creditpaydate");
            return (Criteria) this;
        }

        public Criteria andCreditpaydateGreaterThanOrEqualTo(Date value) {
            addCriterion("CreditPayDate >=", value, "creditpaydate");
            return (Criteria) this;
        }

        public Criteria andCreditpaydateLessThan(Date value) {
            addCriterion("CreditPayDate <", value, "creditpaydate");
            return (Criteria) this;
        }

        public Criteria andCreditpaydateLessThanOrEqualTo(Date value) {
            addCriterion("CreditPayDate <=", value, "creditpaydate");
            return (Criteria) this;
        }

        public Criteria andCreditpaydateIn(List<Date> values) {
            addCriterion("CreditPayDate in", values, "creditpaydate");
            return (Criteria) this;
        }

        public Criteria andCreditpaydateNotIn(List<Date> values) {
            addCriterion("CreditPayDate not in", values, "creditpaydate");
            return (Criteria) this;
        }

        public Criteria andCreditpaydateBetween(Date value1, Date value2) {
            addCriterion("CreditPayDate between", value1, value2, "creditpaydate");
            return (Criteria) this;
        }

        public Criteria andCreditpaydateNotBetween(Date value1, Date value2) {
            addCriterion("CreditPayDate not between", value1, value2, "creditpaydate");
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