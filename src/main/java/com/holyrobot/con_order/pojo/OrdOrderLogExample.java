package com.holyrobot.con_order.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdOrderLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdOrderLogExample() {
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

        public Criteria andOplogIsNull() {
            addCriterion("OpLog is null");
            return (Criteria) this;
        }

        public Criteria andOplogIsNotNull() {
            addCriterion("OpLog is not null");
            return (Criteria) this;
        }

        public Criteria andOplogEqualTo(String value) {
            addCriterion("OpLog =", value, "oplog");
            return (Criteria) this;
        }

        public Criteria andOplogNotEqualTo(String value) {
            addCriterion("OpLog <>", value, "oplog");
            return (Criteria) this;
        }

        public Criteria andOplogGreaterThan(String value) {
            addCriterion("OpLog >", value, "oplog");
            return (Criteria) this;
        }

        public Criteria andOplogGreaterThanOrEqualTo(String value) {
            addCriterion("OpLog >=", value, "oplog");
            return (Criteria) this;
        }

        public Criteria andOplogLessThan(String value) {
            addCriterion("OpLog <", value, "oplog");
            return (Criteria) this;
        }

        public Criteria andOplogLessThanOrEqualTo(String value) {
            addCriterion("OpLog <=", value, "oplog");
            return (Criteria) this;
        }

        public Criteria andOplogLike(String value) {
            addCriterion("OpLog like", value, "oplog");
            return (Criteria) this;
        }

        public Criteria andOplogNotLike(String value) {
            addCriterion("OpLog not like", value, "oplog");
            return (Criteria) this;
        }

        public Criteria andOplogIn(List<String> values) {
            addCriterion("OpLog in", values, "oplog");
            return (Criteria) this;
        }

        public Criteria andOplogNotIn(List<String> values) {
            addCriterion("OpLog not in", values, "oplog");
            return (Criteria) this;
        }

        public Criteria andOplogBetween(String value1, String value2) {
            addCriterion("OpLog between", value1, value2, "oplog");
            return (Criteria) this;
        }

        public Criteria andOplogNotBetween(String value1, String value2) {
            addCriterion("OpLog not between", value1, value2, "oplog");
            return (Criteria) this;
        }

        public Criteria andOpipIsNull() {
            addCriterion("OpIP is null");
            return (Criteria) this;
        }

        public Criteria andOpipIsNotNull() {
            addCriterion("OpIP is not null");
            return (Criteria) this;
        }

        public Criteria andOpipEqualTo(String value) {
            addCriterion("OpIP =", value, "opip");
            return (Criteria) this;
        }

        public Criteria andOpipNotEqualTo(String value) {
            addCriterion("OpIP <>", value, "opip");
            return (Criteria) this;
        }

        public Criteria andOpipGreaterThan(String value) {
            addCriterion("OpIP >", value, "opip");
            return (Criteria) this;
        }

        public Criteria andOpipGreaterThanOrEqualTo(String value) {
            addCriterion("OpIP >=", value, "opip");
            return (Criteria) this;
        }

        public Criteria andOpipLessThan(String value) {
            addCriterion("OpIP <", value, "opip");
            return (Criteria) this;
        }

        public Criteria andOpipLessThanOrEqualTo(String value) {
            addCriterion("OpIP <=", value, "opip");
            return (Criteria) this;
        }

        public Criteria andOpipLike(String value) {
            addCriterion("OpIP like", value, "opip");
            return (Criteria) this;
        }

        public Criteria andOpipNotLike(String value) {
            addCriterion("OpIP not like", value, "opip");
            return (Criteria) this;
        }

        public Criteria andOpipIn(List<String> values) {
            addCriterion("OpIP in", values, "opip");
            return (Criteria) this;
        }

        public Criteria andOpipNotIn(List<String> values) {
            addCriterion("OpIP not in", values, "opip");
            return (Criteria) this;
        }

        public Criteria andOpipBetween(String value1, String value2) {
            addCriterion("OpIP between", value1, value2, "opip");
            return (Criteria) this;
        }

        public Criteria andOpipNotBetween(String value1, String value2) {
            addCriterion("OpIP not between", value1, value2, "opip");
            return (Criteria) this;
        }

        public Criteria andOpbrowserIsNull() {
            addCriterion("OpBrowser is null");
            return (Criteria) this;
        }

        public Criteria andOpbrowserIsNotNull() {
            addCriterion("OpBrowser is not null");
            return (Criteria) this;
        }

        public Criteria andOpbrowserEqualTo(String value) {
            addCriterion("OpBrowser =", value, "opbrowser");
            return (Criteria) this;
        }

        public Criteria andOpbrowserNotEqualTo(String value) {
            addCriterion("OpBrowser <>", value, "opbrowser");
            return (Criteria) this;
        }

        public Criteria andOpbrowserGreaterThan(String value) {
            addCriterion("OpBrowser >", value, "opbrowser");
            return (Criteria) this;
        }

        public Criteria andOpbrowserGreaterThanOrEqualTo(String value) {
            addCriterion("OpBrowser >=", value, "opbrowser");
            return (Criteria) this;
        }

        public Criteria andOpbrowserLessThan(String value) {
            addCriterion("OpBrowser <", value, "opbrowser");
            return (Criteria) this;
        }

        public Criteria andOpbrowserLessThanOrEqualTo(String value) {
            addCriterion("OpBrowser <=", value, "opbrowser");
            return (Criteria) this;
        }

        public Criteria andOpbrowserLike(String value) {
            addCriterion("OpBrowser like", value, "opbrowser");
            return (Criteria) this;
        }

        public Criteria andOpbrowserNotLike(String value) {
            addCriterion("OpBrowser not like", value, "opbrowser");
            return (Criteria) this;
        }

        public Criteria andOpbrowserIn(List<String> values) {
            addCriterion("OpBrowser in", values, "opbrowser");
            return (Criteria) this;
        }

        public Criteria andOpbrowserNotIn(List<String> values) {
            addCriterion("OpBrowser not in", values, "opbrowser");
            return (Criteria) this;
        }

        public Criteria andOpbrowserBetween(String value1, String value2) {
            addCriterion("OpBrowser between", value1, value2, "opbrowser");
            return (Criteria) this;
        }

        public Criteria andOpbrowserNotBetween(String value1, String value2) {
            addCriterion("OpBrowser not between", value1, value2, "opbrowser");
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

        public Criteria andVisibletypeIsNull() {
            addCriterion("VisibleType is null");
            return (Criteria) this;
        }

        public Criteria andVisibletypeIsNotNull() {
            addCriterion("VisibleType is not null");
            return (Criteria) this;
        }

        public Criteria andVisibletypeEqualTo(Integer value) {
            addCriterion("VisibleType =", value, "visibletype");
            return (Criteria) this;
        }

        public Criteria andVisibletypeNotEqualTo(Integer value) {
            addCriterion("VisibleType <>", value, "visibletype");
            return (Criteria) this;
        }

        public Criteria andVisibletypeGreaterThan(Integer value) {
            addCriterion("VisibleType >", value, "visibletype");
            return (Criteria) this;
        }

        public Criteria andVisibletypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("VisibleType >=", value, "visibletype");
            return (Criteria) this;
        }

        public Criteria andVisibletypeLessThan(Integer value) {
            addCriterion("VisibleType <", value, "visibletype");
            return (Criteria) this;
        }

        public Criteria andVisibletypeLessThanOrEqualTo(Integer value) {
            addCriterion("VisibleType <=", value, "visibletype");
            return (Criteria) this;
        }

        public Criteria andVisibletypeIn(List<Integer> values) {
            addCriterion("VisibleType in", values, "visibletype");
            return (Criteria) this;
        }

        public Criteria andVisibletypeNotIn(List<Integer> values) {
            addCriterion("VisibleType not in", values, "visibletype");
            return (Criteria) this;
        }

        public Criteria andVisibletypeBetween(Integer value1, Integer value2) {
            addCriterion("VisibleType between", value1, value2, "visibletype");
            return (Criteria) this;
        }

        public Criteria andVisibletypeNotBetween(Integer value1, Integer value2) {
            addCriterion("VisibleType not between", value1, value2, "visibletype");
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