package com.holyrobot.con_volunteer.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TravelerUnbindingAndFreezeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TravelerUnbindingAndFreezeExample() {
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

        public Criteria andAppreasonIsNull() {
            addCriterion("AppReason is null");
            return (Criteria) this;
        }

        public Criteria andAppreasonIsNotNull() {
            addCriterion("AppReason is not null");
            return (Criteria) this;
        }

        public Criteria andAppreasonEqualTo(String value) {
            addCriterion("AppReason =", value, "appreason");
            return (Criteria) this;
        }

        public Criteria andAppreasonNotEqualTo(String value) {
            addCriterion("AppReason <>", value, "appreason");
            return (Criteria) this;
        }

        public Criteria andAppreasonGreaterThan(String value) {
            addCriterion("AppReason >", value, "appreason");
            return (Criteria) this;
        }

        public Criteria andAppreasonGreaterThanOrEqualTo(String value) {
            addCriterion("AppReason >=", value, "appreason");
            return (Criteria) this;
        }

        public Criteria andAppreasonLessThan(String value) {
            addCriterion("AppReason <", value, "appreason");
            return (Criteria) this;
        }

        public Criteria andAppreasonLessThanOrEqualTo(String value) {
            addCriterion("AppReason <=", value, "appreason");
            return (Criteria) this;
        }

        public Criteria andAppreasonLike(String value) {
            addCriterion("AppReason like", value, "appreason");
            return (Criteria) this;
        }

        public Criteria andAppreasonNotLike(String value) {
            addCriterion("AppReason not like", value, "appreason");
            return (Criteria) this;
        }

        public Criteria andAppreasonIn(List<String> values) {
            addCriterion("AppReason in", values, "appreason");
            return (Criteria) this;
        }

        public Criteria andAppreasonNotIn(List<String> values) {
            addCriterion("AppReason not in", values, "appreason");
            return (Criteria) this;
        }

        public Criteria andAppreasonBetween(String value1, String value2) {
            addCriterion("AppReason between", value1, value2, "appreason");
            return (Criteria) this;
        }

        public Criteria andAppreasonNotBetween(String value1, String value2) {
            addCriterion("AppReason not between", value1, value2, "appreason");
            return (Criteria) this;
        }

        public Criteria andReasondateIsNull() {
            addCriterion("ReasonDate is null");
            return (Criteria) this;
        }

        public Criteria andReasondateIsNotNull() {
            addCriterion("ReasonDate is not null");
            return (Criteria) this;
        }

        public Criteria andReasondateEqualTo(Date value) {
            addCriterion("ReasonDate =", value, "reasondate");
            return (Criteria) this;
        }

        public Criteria andReasondateNotEqualTo(Date value) {
            addCriterion("ReasonDate <>", value, "reasondate");
            return (Criteria) this;
        }

        public Criteria andReasondateGreaterThan(Date value) {
            addCriterion("ReasonDate >", value, "reasondate");
            return (Criteria) this;
        }

        public Criteria andReasondateGreaterThanOrEqualTo(Date value) {
            addCriterion("ReasonDate >=", value, "reasondate");
            return (Criteria) this;
        }

        public Criteria andReasondateLessThan(Date value) {
            addCriterion("ReasonDate <", value, "reasondate");
            return (Criteria) this;
        }

        public Criteria andReasondateLessThanOrEqualTo(Date value) {
            addCriterion("ReasonDate <=", value, "reasondate");
            return (Criteria) this;
        }

        public Criteria andReasondateIn(List<Date> values) {
            addCriterion("ReasonDate in", values, "reasondate");
            return (Criteria) this;
        }

        public Criteria andReasondateNotIn(List<Date> values) {
            addCriterion("ReasonDate not in", values, "reasondate");
            return (Criteria) this;
        }

        public Criteria andReasondateBetween(Date value1, Date value2) {
            addCriterion("ReasonDate between", value1, value2, "reasondate");
            return (Criteria) this;
        }

        public Criteria andReasondateNotBetween(Date value1, Date value2) {
            addCriterion("ReasonDate not between", value1, value2, "reasondate");
            return (Criteria) this;
        }

        public Criteria andReviewdateIsNull() {
            addCriterion("ReviewDate is null");
            return (Criteria) this;
        }

        public Criteria andReviewdateIsNotNull() {
            addCriterion("ReviewDate is not null");
            return (Criteria) this;
        }

        public Criteria andReviewdateEqualTo(Date value) {
            addCriterion("ReviewDate =", value, "reviewdate");
            return (Criteria) this;
        }

        public Criteria andReviewdateNotEqualTo(Date value) {
            addCriterion("ReviewDate <>", value, "reviewdate");
            return (Criteria) this;
        }

        public Criteria andReviewdateGreaterThan(Date value) {
            addCriterion("ReviewDate >", value, "reviewdate");
            return (Criteria) this;
        }

        public Criteria andReviewdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ReviewDate >=", value, "reviewdate");
            return (Criteria) this;
        }

        public Criteria andReviewdateLessThan(Date value) {
            addCriterion("ReviewDate <", value, "reviewdate");
            return (Criteria) this;
        }

        public Criteria andReviewdateLessThanOrEqualTo(Date value) {
            addCriterion("ReviewDate <=", value, "reviewdate");
            return (Criteria) this;
        }

        public Criteria andReviewdateIn(List<Date> values) {
            addCriterion("ReviewDate in", values, "reviewdate");
            return (Criteria) this;
        }

        public Criteria andReviewdateNotIn(List<Date> values) {
            addCriterion("ReviewDate not in", values, "reviewdate");
            return (Criteria) this;
        }

        public Criteria andReviewdateBetween(Date value1, Date value2) {
            addCriterion("ReviewDate between", value1, value2, "reviewdate");
            return (Criteria) this;
        }

        public Criteria andReviewdateNotBetween(Date value1, Date value2) {
            addCriterion("ReviewDate not between", value1, value2, "reviewdate");
            return (Criteria) this;
        }

        public Criteria andReviewerIsNull() {
            addCriterion("Reviewer is null");
            return (Criteria) this;
        }

        public Criteria andReviewerIsNotNull() {
            addCriterion("Reviewer is not null");
            return (Criteria) this;
        }

        public Criteria andReviewerEqualTo(String value) {
            addCriterion("Reviewer =", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerNotEqualTo(String value) {
            addCriterion("Reviewer <>", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerGreaterThan(String value) {
            addCriterion("Reviewer >", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerGreaterThanOrEqualTo(String value) {
            addCriterion("Reviewer >=", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerLessThan(String value) {
            addCriterion("Reviewer <", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerLessThanOrEqualTo(String value) {
            addCriterion("Reviewer <=", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerLike(String value) {
            addCriterion("Reviewer like", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerNotLike(String value) {
            addCriterion("Reviewer not like", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerIn(List<String> values) {
            addCriterion("Reviewer in", values, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerNotIn(List<String> values) {
            addCriterion("Reviewer not in", values, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerBetween(String value1, String value2) {
            addCriterion("Reviewer between", value1, value2, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerNotBetween(String value1, String value2) {
            addCriterion("Reviewer not between", value1, value2, "reviewer");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("Remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("Remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("Remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("Remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("Remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("Remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("Remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("Remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("Remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("Remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("Remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("Remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("Remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("Remarks not between", value1, value2, "remarks");
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