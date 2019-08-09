package com.holyrobot.con_volunteer.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TravelerRewardWithdrawDepositExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TravelerRewardWithdrawDepositExample() {
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

        public Criteria andParentidIsNull() {
            addCriterion("ParentID is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("ParentID is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(String value) {
            addCriterion("ParentID =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(String value) {
            addCriterion("ParentID <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(String value) {
            addCriterion("ParentID >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(String value) {
            addCriterion("ParentID >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(String value) {
            addCriterion("ParentID <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(String value) {
            addCriterion("ParentID <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLike(String value) {
            addCriterion("ParentID like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotLike(String value) {
            addCriterion("ParentID not like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<String> values) {
            addCriterion("ParentID in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<String> values) {
            addCriterion("ParentID not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(String value1, String value2) {
            addCriterion("ParentID between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(String value1, String value2) {
            addCriterion("ParentID not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andChildidIsNull() {
            addCriterion("ChildID is null");
            return (Criteria) this;
        }

        public Criteria andChildidIsNotNull() {
            addCriterion("ChildID is not null");
            return (Criteria) this;
        }

        public Criteria andChildidEqualTo(String value) {
            addCriterion("ChildID =", value, "childid");
            return (Criteria) this;
        }

        public Criteria andChildidNotEqualTo(String value) {
            addCriterion("ChildID <>", value, "childid");
            return (Criteria) this;
        }

        public Criteria andChildidGreaterThan(String value) {
            addCriterion("ChildID >", value, "childid");
            return (Criteria) this;
        }

        public Criteria andChildidGreaterThanOrEqualTo(String value) {
            addCriterion("ChildID >=", value, "childid");
            return (Criteria) this;
        }

        public Criteria andChildidLessThan(String value) {
            addCriterion("ChildID <", value, "childid");
            return (Criteria) this;
        }

        public Criteria andChildidLessThanOrEqualTo(String value) {
            addCriterion("ChildID <=", value, "childid");
            return (Criteria) this;
        }

        public Criteria andChildidLike(String value) {
            addCriterion("ChildID like", value, "childid");
            return (Criteria) this;
        }

        public Criteria andChildidNotLike(String value) {
            addCriterion("ChildID not like", value, "childid");
            return (Criteria) this;
        }

        public Criteria andChildidIn(List<String> values) {
            addCriterion("ChildID in", values, "childid");
            return (Criteria) this;
        }

        public Criteria andChildidNotIn(List<String> values) {
            addCriterion("ChildID not in", values, "childid");
            return (Criteria) this;
        }

        public Criteria andChildidBetween(String value1, String value2) {
            addCriterion("ChildID between", value1, value2, "childid");
            return (Criteria) this;
        }

        public Criteria andChildidNotBetween(String value1, String value2) {
            addCriterion("ChildID not between", value1, value2, "childid");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNull() {
            addCriterion("PayType is null");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNotNull() {
            addCriterion("PayType is not null");
            return (Criteria) this;
        }

        public Criteria andPaytypeEqualTo(String value) {
            addCriterion("PayType =", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotEqualTo(String value) {
            addCriterion("PayType <>", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThan(String value) {
            addCriterion("PayType >", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThanOrEqualTo(String value) {
            addCriterion("PayType >=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThan(String value) {
            addCriterion("PayType <", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThanOrEqualTo(String value) {
            addCriterion("PayType <=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLike(String value) {
            addCriterion("PayType like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotLike(String value) {
            addCriterion("PayType not like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeIn(List<String> values) {
            addCriterion("PayType in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotIn(List<String> values) {
            addCriterion("PayType not in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeBetween(String value1, String value2) {
            addCriterion("PayType between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotBetween(String value1, String value2) {
            addCriterion("PayType not between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andDepositbankIsNull() {
            addCriterion("DepositBank is null");
            return (Criteria) this;
        }

        public Criteria andDepositbankIsNotNull() {
            addCriterion("DepositBank is not null");
            return (Criteria) this;
        }

        public Criteria andDepositbankEqualTo(String value) {
            addCriterion("DepositBank =", value, "depositbank");
            return (Criteria) this;
        }

        public Criteria andDepositbankNotEqualTo(String value) {
            addCriterion("DepositBank <>", value, "depositbank");
            return (Criteria) this;
        }

        public Criteria andDepositbankGreaterThan(String value) {
            addCriterion("DepositBank >", value, "depositbank");
            return (Criteria) this;
        }

        public Criteria andDepositbankGreaterThanOrEqualTo(String value) {
            addCriterion("DepositBank >=", value, "depositbank");
            return (Criteria) this;
        }

        public Criteria andDepositbankLessThan(String value) {
            addCriterion("DepositBank <", value, "depositbank");
            return (Criteria) this;
        }

        public Criteria andDepositbankLessThanOrEqualTo(String value) {
            addCriterion("DepositBank <=", value, "depositbank");
            return (Criteria) this;
        }

        public Criteria andDepositbankLike(String value) {
            addCriterion("DepositBank like", value, "depositbank");
            return (Criteria) this;
        }

        public Criteria andDepositbankNotLike(String value) {
            addCriterion("DepositBank not like", value, "depositbank");
            return (Criteria) this;
        }

        public Criteria andDepositbankIn(List<String> values) {
            addCriterion("DepositBank in", values, "depositbank");
            return (Criteria) this;
        }

        public Criteria andDepositbankNotIn(List<String> values) {
            addCriterion("DepositBank not in", values, "depositbank");
            return (Criteria) this;
        }

        public Criteria andDepositbankBetween(String value1, String value2) {
            addCriterion("DepositBank between", value1, value2, "depositbank");
            return (Criteria) this;
        }

        public Criteria andDepositbankNotBetween(String value1, String value2) {
            addCriterion("DepositBank not between", value1, value2, "depositbank");
            return (Criteria) this;
        }

        public Criteria andCardnoIsNull() {
            addCriterion("CardNo is null");
            return (Criteria) this;
        }

        public Criteria andCardnoIsNotNull() {
            addCriterion("CardNo is not null");
            return (Criteria) this;
        }

        public Criteria andCardnoEqualTo(String value) {
            addCriterion("CardNo =", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotEqualTo(String value) {
            addCriterion("CardNo <>", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoGreaterThan(String value) {
            addCriterion("CardNo >", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoGreaterThanOrEqualTo(String value) {
            addCriterion("CardNo >=", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoLessThan(String value) {
            addCriterion("CardNo <", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoLessThanOrEqualTo(String value) {
            addCriterion("CardNo <=", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoLike(String value) {
            addCriterion("CardNo like", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotLike(String value) {
            addCriterion("CardNo not like", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoIn(List<String> values) {
            addCriterion("CardNo in", values, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotIn(List<String> values) {
            addCriterion("CardNo not in", values, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoBetween(String value1, String value2) {
            addCriterion("CardNo between", value1, value2, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotBetween(String value1, String value2) {
            addCriterion("CardNo not between", value1, value2, "cardno");
            return (Criteria) this;
        }

        public Criteria andApplicationamtIsNull() {
            addCriterion("ApplicationAmt is null");
            return (Criteria) this;
        }

        public Criteria andApplicationamtIsNotNull() {
            addCriterion("ApplicationAmt is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationamtEqualTo(BigDecimal value) {
            addCriterion("ApplicationAmt =", value, "applicationamt");
            return (Criteria) this;
        }

        public Criteria andApplicationamtNotEqualTo(BigDecimal value) {
            addCriterion("ApplicationAmt <>", value, "applicationamt");
            return (Criteria) this;
        }

        public Criteria andApplicationamtGreaterThan(BigDecimal value) {
            addCriterion("ApplicationAmt >", value, "applicationamt");
            return (Criteria) this;
        }

        public Criteria andApplicationamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ApplicationAmt >=", value, "applicationamt");
            return (Criteria) this;
        }

        public Criteria andApplicationamtLessThan(BigDecimal value) {
            addCriterion("ApplicationAmt <", value, "applicationamt");
            return (Criteria) this;
        }

        public Criteria andApplicationamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ApplicationAmt <=", value, "applicationamt");
            return (Criteria) this;
        }

        public Criteria andApplicationamtIn(List<BigDecimal> values) {
            addCriterion("ApplicationAmt in", values, "applicationamt");
            return (Criteria) this;
        }

        public Criteria andApplicationamtNotIn(List<BigDecimal> values) {
            addCriterion("ApplicationAmt not in", values, "applicationamt");
            return (Criteria) this;
        }

        public Criteria andApplicationamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ApplicationAmt between", value1, value2, "applicationamt");
            return (Criteria) this;
        }

        public Criteria andApplicationamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ApplicationAmt not between", value1, value2, "applicationamt");
            return (Criteria) this;
        }

        public Criteria andVoucherurlIsNull() {
            addCriterion("VoucherUrl is null");
            return (Criteria) this;
        }

        public Criteria andVoucherurlIsNotNull() {
            addCriterion("VoucherUrl is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherurlEqualTo(String value) {
            addCriterion("VoucherUrl =", value, "voucherurl");
            return (Criteria) this;
        }

        public Criteria andVoucherurlNotEqualTo(String value) {
            addCriterion("VoucherUrl <>", value, "voucherurl");
            return (Criteria) this;
        }

        public Criteria andVoucherurlGreaterThan(String value) {
            addCriterion("VoucherUrl >", value, "voucherurl");
            return (Criteria) this;
        }

        public Criteria andVoucherurlGreaterThanOrEqualTo(String value) {
            addCriterion("VoucherUrl >=", value, "voucherurl");
            return (Criteria) this;
        }

        public Criteria andVoucherurlLessThan(String value) {
            addCriterion("VoucherUrl <", value, "voucherurl");
            return (Criteria) this;
        }

        public Criteria andVoucherurlLessThanOrEqualTo(String value) {
            addCriterion("VoucherUrl <=", value, "voucherurl");
            return (Criteria) this;
        }

        public Criteria andVoucherurlLike(String value) {
            addCriterion("VoucherUrl like", value, "voucherurl");
            return (Criteria) this;
        }

        public Criteria andVoucherurlNotLike(String value) {
            addCriterion("VoucherUrl not like", value, "voucherurl");
            return (Criteria) this;
        }

        public Criteria andVoucherurlIn(List<String> values) {
            addCriterion("VoucherUrl in", values, "voucherurl");
            return (Criteria) this;
        }

        public Criteria andVoucherurlNotIn(List<String> values) {
            addCriterion("VoucherUrl not in", values, "voucherurl");
            return (Criteria) this;
        }

        public Criteria andVoucherurlBetween(String value1, String value2) {
            addCriterion("VoucherUrl between", value1, value2, "voucherurl");
            return (Criteria) this;
        }

        public Criteria andVoucherurlNotBetween(String value1, String value2) {
            addCriterion("VoucherUrl not between", value1, value2, "voucherurl");
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

        public Criteria andOrgidIsNull() {
            addCriterion("OrgId is null");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNotNull() {
            addCriterion("OrgId is not null");
            return (Criteria) this;
        }

        public Criteria andOrgidEqualTo(String value) {
            addCriterion("OrgId =", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotEqualTo(String value) {
            addCriterion("OrgId <>", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThan(String value) {
            addCriterion("OrgId >", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThanOrEqualTo(String value) {
            addCriterion("OrgId >=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThan(String value) {
            addCriterion("OrgId <", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThanOrEqualTo(String value) {
            addCriterion("OrgId <=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLike(String value) {
            addCriterion("OrgId like", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotLike(String value) {
            addCriterion("OrgId not like", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidIn(List<String> values) {
            addCriterion("OrgId in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotIn(List<String> values) {
            addCriterion("OrgId not in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidBetween(String value1, String value2) {
            addCriterion("OrgId between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotBetween(String value1, String value2) {
            addCriterion("OrgId not between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andAudituseridIsNull() {
            addCriterion("AuditUserID is null");
            return (Criteria) this;
        }

        public Criteria andAudituseridIsNotNull() {
            addCriterion("AuditUserID is not null");
            return (Criteria) this;
        }

        public Criteria andAudituseridEqualTo(String value) {
            addCriterion("AuditUserID =", value, "audituserid");
            return (Criteria) this;
        }

        public Criteria andAudituseridNotEqualTo(String value) {
            addCriterion("AuditUserID <>", value, "audituserid");
            return (Criteria) this;
        }

        public Criteria andAudituseridGreaterThan(String value) {
            addCriterion("AuditUserID >", value, "audituserid");
            return (Criteria) this;
        }

        public Criteria andAudituseridGreaterThanOrEqualTo(String value) {
            addCriterion("AuditUserID >=", value, "audituserid");
            return (Criteria) this;
        }

        public Criteria andAudituseridLessThan(String value) {
            addCriterion("AuditUserID <", value, "audituserid");
            return (Criteria) this;
        }

        public Criteria andAudituseridLessThanOrEqualTo(String value) {
            addCriterion("AuditUserID <=", value, "audituserid");
            return (Criteria) this;
        }

        public Criteria andAudituseridLike(String value) {
            addCriterion("AuditUserID like", value, "audituserid");
            return (Criteria) this;
        }

        public Criteria andAudituseridNotLike(String value) {
            addCriterion("AuditUserID not like", value, "audituserid");
            return (Criteria) this;
        }

        public Criteria andAudituseridIn(List<String> values) {
            addCriterion("AuditUserID in", values, "audituserid");
            return (Criteria) this;
        }

        public Criteria andAudituseridNotIn(List<String> values) {
            addCriterion("AuditUserID not in", values, "audituserid");
            return (Criteria) this;
        }

        public Criteria andAudituseridBetween(String value1, String value2) {
            addCriterion("AuditUserID between", value1, value2, "audituserid");
            return (Criteria) this;
        }

        public Criteria andAudituseridNotBetween(String value1, String value2) {
            addCriterion("AuditUserID not between", value1, value2, "audituserid");
            return (Criteria) this;
        }

        public Criteria andPayuseridIsNull() {
            addCriterion("PayUserID is null");
            return (Criteria) this;
        }

        public Criteria andPayuseridIsNotNull() {
            addCriterion("PayUserID is not null");
            return (Criteria) this;
        }

        public Criteria andPayuseridEqualTo(String value) {
            addCriterion("PayUserID =", value, "payuserid");
            return (Criteria) this;
        }

        public Criteria andPayuseridNotEqualTo(String value) {
            addCriterion("PayUserID <>", value, "payuserid");
            return (Criteria) this;
        }

        public Criteria andPayuseridGreaterThan(String value) {
            addCriterion("PayUserID >", value, "payuserid");
            return (Criteria) this;
        }

        public Criteria andPayuseridGreaterThanOrEqualTo(String value) {
            addCriterion("PayUserID >=", value, "payuserid");
            return (Criteria) this;
        }

        public Criteria andPayuseridLessThan(String value) {
            addCriterion("PayUserID <", value, "payuserid");
            return (Criteria) this;
        }

        public Criteria andPayuseridLessThanOrEqualTo(String value) {
            addCriterion("PayUserID <=", value, "payuserid");
            return (Criteria) this;
        }

        public Criteria andPayuseridLike(String value) {
            addCriterion("PayUserID like", value, "payuserid");
            return (Criteria) this;
        }

        public Criteria andPayuseridNotLike(String value) {
            addCriterion("PayUserID not like", value, "payuserid");
            return (Criteria) this;
        }

        public Criteria andPayuseridIn(List<String> values) {
            addCriterion("PayUserID in", values, "payuserid");
            return (Criteria) this;
        }

        public Criteria andPayuseridNotIn(List<String> values) {
            addCriterion("PayUserID not in", values, "payuserid");
            return (Criteria) this;
        }

        public Criteria andPayuseridBetween(String value1, String value2) {
            addCriterion("PayUserID between", value1, value2, "payuserid");
            return (Criteria) this;
        }

        public Criteria andPayuseridNotBetween(String value1, String value2) {
            addCriterion("PayUserID not between", value1, value2, "payuserid");
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

        public Criteria andApplyuseridIsNull() {
            addCriterion("ApplyUserID is null");
            return (Criteria) this;
        }

        public Criteria andApplyuseridIsNotNull() {
            addCriterion("ApplyUserID is not null");
            return (Criteria) this;
        }

        public Criteria andApplyuseridEqualTo(String value) {
            addCriterion("ApplyUserID =", value, "applyuserid");
            return (Criteria) this;
        }

        public Criteria andApplyuseridNotEqualTo(String value) {
            addCriterion("ApplyUserID <>", value, "applyuserid");
            return (Criteria) this;
        }

        public Criteria andApplyuseridGreaterThan(String value) {
            addCriterion("ApplyUserID >", value, "applyuserid");
            return (Criteria) this;
        }

        public Criteria andApplyuseridGreaterThanOrEqualTo(String value) {
            addCriterion("ApplyUserID >=", value, "applyuserid");
            return (Criteria) this;
        }

        public Criteria andApplyuseridLessThan(String value) {
            addCriterion("ApplyUserID <", value, "applyuserid");
            return (Criteria) this;
        }

        public Criteria andApplyuseridLessThanOrEqualTo(String value) {
            addCriterion("ApplyUserID <=", value, "applyuserid");
            return (Criteria) this;
        }

        public Criteria andApplyuseridLike(String value) {
            addCriterion("ApplyUserID like", value, "applyuserid");
            return (Criteria) this;
        }

        public Criteria andApplyuseridNotLike(String value) {
            addCriterion("ApplyUserID not like", value, "applyuserid");
            return (Criteria) this;
        }

        public Criteria andApplyuseridIn(List<String> values) {
            addCriterion("ApplyUserID in", values, "applyuserid");
            return (Criteria) this;
        }

        public Criteria andApplyuseridNotIn(List<String> values) {
            addCriterion("ApplyUserID not in", values, "applyuserid");
            return (Criteria) this;
        }

        public Criteria andApplyuseridBetween(String value1, String value2) {
            addCriterion("ApplyUserID between", value1, value2, "applyuserid");
            return (Criteria) this;
        }

        public Criteria andApplyuseridNotBetween(String value1, String value2) {
            addCriterion("ApplyUserID not between", value1, value2, "applyuserid");
            return (Criteria) this;
        }

        public Criteria andAuditusernameIsNull() {
            addCriterion("AuditUserName is null");
            return (Criteria) this;
        }

        public Criteria andAuditusernameIsNotNull() {
            addCriterion("AuditUserName is not null");
            return (Criteria) this;
        }

        public Criteria andAuditusernameEqualTo(String value) {
            addCriterion("AuditUserName =", value, "auditusername");
            return (Criteria) this;
        }

        public Criteria andAuditusernameNotEqualTo(String value) {
            addCriterion("AuditUserName <>", value, "auditusername");
            return (Criteria) this;
        }

        public Criteria andAuditusernameGreaterThan(String value) {
            addCriterion("AuditUserName >", value, "auditusername");
            return (Criteria) this;
        }

        public Criteria andAuditusernameGreaterThanOrEqualTo(String value) {
            addCriterion("AuditUserName >=", value, "auditusername");
            return (Criteria) this;
        }

        public Criteria andAuditusernameLessThan(String value) {
            addCriterion("AuditUserName <", value, "auditusername");
            return (Criteria) this;
        }

        public Criteria andAuditusernameLessThanOrEqualTo(String value) {
            addCriterion("AuditUserName <=", value, "auditusername");
            return (Criteria) this;
        }

        public Criteria andAuditusernameLike(String value) {
            addCriterion("AuditUserName like", value, "auditusername");
            return (Criteria) this;
        }

        public Criteria andAuditusernameNotLike(String value) {
            addCriterion("AuditUserName not like", value, "auditusername");
            return (Criteria) this;
        }

        public Criteria andAuditusernameIn(List<String> values) {
            addCriterion("AuditUserName in", values, "auditusername");
            return (Criteria) this;
        }

        public Criteria andAuditusernameNotIn(List<String> values) {
            addCriterion("AuditUserName not in", values, "auditusername");
            return (Criteria) this;
        }

        public Criteria andAuditusernameBetween(String value1, String value2) {
            addCriterion("AuditUserName between", value1, value2, "auditusername");
            return (Criteria) this;
        }

        public Criteria andAuditusernameNotBetween(String value1, String value2) {
            addCriterion("AuditUserName not between", value1, value2, "auditusername");
            return (Criteria) this;
        }

        public Criteria andPayusernameIsNull() {
            addCriterion("PayUserName is null");
            return (Criteria) this;
        }

        public Criteria andPayusernameIsNotNull() {
            addCriterion("PayUserName is not null");
            return (Criteria) this;
        }

        public Criteria andPayusernameEqualTo(String value) {
            addCriterion("PayUserName =", value, "payusername");
            return (Criteria) this;
        }

        public Criteria andPayusernameNotEqualTo(String value) {
            addCriterion("PayUserName <>", value, "payusername");
            return (Criteria) this;
        }

        public Criteria andPayusernameGreaterThan(String value) {
            addCriterion("PayUserName >", value, "payusername");
            return (Criteria) this;
        }

        public Criteria andPayusernameGreaterThanOrEqualTo(String value) {
            addCriterion("PayUserName >=", value, "payusername");
            return (Criteria) this;
        }

        public Criteria andPayusernameLessThan(String value) {
            addCriterion("PayUserName <", value, "payusername");
            return (Criteria) this;
        }

        public Criteria andPayusernameLessThanOrEqualTo(String value) {
            addCriterion("PayUserName <=", value, "payusername");
            return (Criteria) this;
        }

        public Criteria andPayusernameLike(String value) {
            addCriterion("PayUserName like", value, "payusername");
            return (Criteria) this;
        }

        public Criteria andPayusernameNotLike(String value) {
            addCriterion("PayUserName not like", value, "payusername");
            return (Criteria) this;
        }

        public Criteria andPayusernameIn(List<String> values) {
            addCriterion("PayUserName in", values, "payusername");
            return (Criteria) this;
        }

        public Criteria andPayusernameNotIn(List<String> values) {
            addCriterion("PayUserName not in", values, "payusername");
            return (Criteria) this;
        }

        public Criteria andPayusernameBetween(String value1, String value2) {
            addCriterion("PayUserName between", value1, value2, "payusername");
            return (Criteria) this;
        }

        public Criteria andPayusernameNotBetween(String value1, String value2) {
            addCriterion("PayUserName not between", value1, value2, "payusername");
            return (Criteria) this;
        }

        public Criteria andApplyusernameIsNull() {
            addCriterion("ApplyUserName is null");
            return (Criteria) this;
        }

        public Criteria andApplyusernameIsNotNull() {
            addCriterion("ApplyUserName is not null");
            return (Criteria) this;
        }

        public Criteria andApplyusernameEqualTo(String value) {
            addCriterion("ApplyUserName =", value, "applyusername");
            return (Criteria) this;
        }

        public Criteria andApplyusernameNotEqualTo(String value) {
            addCriterion("ApplyUserName <>", value, "applyusername");
            return (Criteria) this;
        }

        public Criteria andApplyusernameGreaterThan(String value) {
            addCriterion("ApplyUserName >", value, "applyusername");
            return (Criteria) this;
        }

        public Criteria andApplyusernameGreaterThanOrEqualTo(String value) {
            addCriterion("ApplyUserName >=", value, "applyusername");
            return (Criteria) this;
        }

        public Criteria andApplyusernameLessThan(String value) {
            addCriterion("ApplyUserName <", value, "applyusername");
            return (Criteria) this;
        }

        public Criteria andApplyusernameLessThanOrEqualTo(String value) {
            addCriterion("ApplyUserName <=", value, "applyusername");
            return (Criteria) this;
        }

        public Criteria andApplyusernameLike(String value) {
            addCriterion("ApplyUserName like", value, "applyusername");
            return (Criteria) this;
        }

        public Criteria andApplyusernameNotLike(String value) {
            addCriterion("ApplyUserName not like", value, "applyusername");
            return (Criteria) this;
        }

        public Criteria andApplyusernameIn(List<String> values) {
            addCriterion("ApplyUserName in", values, "applyusername");
            return (Criteria) this;
        }

        public Criteria andApplyusernameNotIn(List<String> values) {
            addCriterion("ApplyUserName not in", values, "applyusername");
            return (Criteria) this;
        }

        public Criteria andApplyusernameBetween(String value1, String value2) {
            addCriterion("ApplyUserName between", value1, value2, "applyusername");
            return (Criteria) this;
        }

        public Criteria andApplyusernameNotBetween(String value1, String value2) {
            addCriterion("ApplyUserName not between", value1, value2, "applyusername");
            return (Criteria) this;
        }

        public Criteria andFinauditdatastatusIsNull() {
            addCriterion("FinAuditDataStatus is null");
            return (Criteria) this;
        }

        public Criteria andFinauditdatastatusIsNotNull() {
            addCriterion("FinAuditDataStatus is not null");
            return (Criteria) this;
        }

        public Criteria andFinauditdatastatusEqualTo(Integer value) {
            addCriterion("FinAuditDataStatus =", value, "finauditdatastatus");
            return (Criteria) this;
        }

        public Criteria andFinauditdatastatusNotEqualTo(Integer value) {
            addCriterion("FinAuditDataStatus <>", value, "finauditdatastatus");
            return (Criteria) this;
        }

        public Criteria andFinauditdatastatusGreaterThan(Integer value) {
            addCriterion("FinAuditDataStatus >", value, "finauditdatastatus");
            return (Criteria) this;
        }

        public Criteria andFinauditdatastatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("FinAuditDataStatus >=", value, "finauditdatastatus");
            return (Criteria) this;
        }

        public Criteria andFinauditdatastatusLessThan(Integer value) {
            addCriterion("FinAuditDataStatus <", value, "finauditdatastatus");
            return (Criteria) this;
        }

        public Criteria andFinauditdatastatusLessThanOrEqualTo(Integer value) {
            addCriterion("FinAuditDataStatus <=", value, "finauditdatastatus");
            return (Criteria) this;
        }

        public Criteria andFinauditdatastatusIn(List<Integer> values) {
            addCriterion("FinAuditDataStatus in", values, "finauditdatastatus");
            return (Criteria) this;
        }

        public Criteria andFinauditdatastatusNotIn(List<Integer> values) {
            addCriterion("FinAuditDataStatus not in", values, "finauditdatastatus");
            return (Criteria) this;
        }

        public Criteria andFinauditdatastatusBetween(Integer value1, Integer value2) {
            addCriterion("FinAuditDataStatus between", value1, value2, "finauditdatastatus");
            return (Criteria) this;
        }

        public Criteria andFinauditdatastatusNotBetween(Integer value1, Integer value2) {
            addCriterion("FinAuditDataStatus not between", value1, value2, "finauditdatastatus");
            return (Criteria) this;
        }

        public Criteria andPayremarkIsNull() {
            addCriterion("PayRemark is null");
            return (Criteria) this;
        }

        public Criteria andPayremarkIsNotNull() {
            addCriterion("PayRemark is not null");
            return (Criteria) this;
        }

        public Criteria andPayremarkEqualTo(String value) {
            addCriterion("PayRemark =", value, "payremark");
            return (Criteria) this;
        }

        public Criteria andPayremarkNotEqualTo(String value) {
            addCriterion("PayRemark <>", value, "payremark");
            return (Criteria) this;
        }

        public Criteria andPayremarkGreaterThan(String value) {
            addCriterion("PayRemark >", value, "payremark");
            return (Criteria) this;
        }

        public Criteria andPayremarkGreaterThanOrEqualTo(String value) {
            addCriterion("PayRemark >=", value, "payremark");
            return (Criteria) this;
        }

        public Criteria andPayremarkLessThan(String value) {
            addCriterion("PayRemark <", value, "payremark");
            return (Criteria) this;
        }

        public Criteria andPayremarkLessThanOrEqualTo(String value) {
            addCriterion("PayRemark <=", value, "payremark");
            return (Criteria) this;
        }

        public Criteria andPayremarkLike(String value) {
            addCriterion("PayRemark like", value, "payremark");
            return (Criteria) this;
        }

        public Criteria andPayremarkNotLike(String value) {
            addCriterion("PayRemark not like", value, "payremark");
            return (Criteria) this;
        }

        public Criteria andPayremarkIn(List<String> values) {
            addCriterion("PayRemark in", values, "payremark");
            return (Criteria) this;
        }

        public Criteria andPayremarkNotIn(List<String> values) {
            addCriterion("PayRemark not in", values, "payremark");
            return (Criteria) this;
        }

        public Criteria andPayremarkBetween(String value1, String value2) {
            addCriterion("PayRemark between", value1, value2, "payremark");
            return (Criteria) this;
        }

        public Criteria andPayremarkNotBetween(String value1, String value2) {
            addCriterion("PayRemark not between", value1, value2, "payremark");
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