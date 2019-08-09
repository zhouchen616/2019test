package com.holyrobot.con_product.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProProductScheduleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProProductScheduleExample() {
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

        public Criteria andProidIsNull() {
            addCriterion("ProID is null");
            return (Criteria) this;
        }

        public Criteria andProidIsNotNull() {
            addCriterion("ProID is not null");
            return (Criteria) this;
        }

        public Criteria andProidEqualTo(String value) {
            addCriterion("ProID =", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotEqualTo(String value) {
            addCriterion("ProID <>", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidGreaterThan(String value) {
            addCriterion("ProID >", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidGreaterThanOrEqualTo(String value) {
            addCriterion("ProID >=", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidLessThan(String value) {
            addCriterion("ProID <", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidLessThanOrEqualTo(String value) {
            addCriterion("ProID <=", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidLike(String value) {
            addCriterion("ProID like", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotLike(String value) {
            addCriterion("ProID not like", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidIn(List<String> values) {
            addCriterion("ProID in", values, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotIn(List<String> values) {
            addCriterion("ProID not in", values, "proid");
            return (Criteria) this;
        }

        public Criteria andProidBetween(String value1, String value2) {
            addCriterion("ProID between", value1, value2, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotBetween(String value1, String value2) {
            addCriterion("ProID not between", value1, value2, "proid");
            return (Criteria) this;
        }

        public Criteria andSchdayIsNull() {
            addCriterion("SchDay is null");
            return (Criteria) this;
        }

        public Criteria andSchdayIsNotNull() {
            addCriterion("SchDay is not null");
            return (Criteria) this;
        }

        public Criteria andSchdayEqualTo(Integer value) {
            addCriterion("SchDay =", value, "schday");
            return (Criteria) this;
        }

        public Criteria andSchdayNotEqualTo(Integer value) {
            addCriterion("SchDay <>", value, "schday");
            return (Criteria) this;
        }

        public Criteria andSchdayGreaterThan(Integer value) {
            addCriterion("SchDay >", value, "schday");
            return (Criteria) this;
        }

        public Criteria andSchdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("SchDay >=", value, "schday");
            return (Criteria) this;
        }

        public Criteria andSchdayLessThan(Integer value) {
            addCriterion("SchDay <", value, "schday");
            return (Criteria) this;
        }

        public Criteria andSchdayLessThanOrEqualTo(Integer value) {
            addCriterion("SchDay <=", value, "schday");
            return (Criteria) this;
        }

        public Criteria andSchdayIn(List<Integer> values) {
            addCriterion("SchDay in", values, "schday");
            return (Criteria) this;
        }

        public Criteria andSchdayNotIn(List<Integer> values) {
            addCriterion("SchDay not in", values, "schday");
            return (Criteria) this;
        }

        public Criteria andSchdayBetween(Integer value1, Integer value2) {
            addCriterion("SchDay between", value1, value2, "schday");
            return (Criteria) this;
        }

        public Criteria andSchdayNotBetween(Integer value1, Integer value2) {
            addCriterion("SchDay not between", value1, value2, "schday");
            return (Criteria) this;
        }

        public Criteria andSchnameIsNull() {
            addCriterion("SchName is null");
            return (Criteria) this;
        }

        public Criteria andSchnameIsNotNull() {
            addCriterion("SchName is not null");
            return (Criteria) this;
        }

        public Criteria andSchnameEqualTo(String value) {
            addCriterion("SchName =", value, "schname");
            return (Criteria) this;
        }

        public Criteria andSchnameNotEqualTo(String value) {
            addCriterion("SchName <>", value, "schname");
            return (Criteria) this;
        }

        public Criteria andSchnameGreaterThan(String value) {
            addCriterion("SchName >", value, "schname");
            return (Criteria) this;
        }

        public Criteria andSchnameGreaterThanOrEqualTo(String value) {
            addCriterion("SchName >=", value, "schname");
            return (Criteria) this;
        }

        public Criteria andSchnameLessThan(String value) {
            addCriterion("SchName <", value, "schname");
            return (Criteria) this;
        }

        public Criteria andSchnameLessThanOrEqualTo(String value) {
            addCriterion("SchName <=", value, "schname");
            return (Criteria) this;
        }

        public Criteria andSchnameLike(String value) {
            addCriterion("SchName like", value, "schname");
            return (Criteria) this;
        }

        public Criteria andSchnameNotLike(String value) {
            addCriterion("SchName not like", value, "schname");
            return (Criteria) this;
        }

        public Criteria andSchnameIn(List<String> values) {
            addCriterion("SchName in", values, "schname");
            return (Criteria) this;
        }

        public Criteria andSchnameNotIn(List<String> values) {
            addCriterion("SchName not in", values, "schname");
            return (Criteria) this;
        }

        public Criteria andSchnameBetween(String value1, String value2) {
            addCriterion("SchName between", value1, value2, "schname");
            return (Criteria) this;
        }

        public Criteria andSchnameNotBetween(String value1, String value2) {
            addCriterion("SchName not between", value1, value2, "schname");
            return (Criteria) this;
        }

        public Criteria andSchinfoIsNull() {
            addCriterion("SchInfo is null");
            return (Criteria) this;
        }

        public Criteria andSchinfoIsNotNull() {
            addCriterion("SchInfo is not null");
            return (Criteria) this;
        }

        public Criteria andSchinfoEqualTo(String value) {
            addCriterion("SchInfo =", value, "schinfo");
            return (Criteria) this;
        }

        public Criteria andSchinfoNotEqualTo(String value) {
            addCriterion("SchInfo <>", value, "schinfo");
            return (Criteria) this;
        }

        public Criteria andSchinfoGreaterThan(String value) {
            addCriterion("SchInfo >", value, "schinfo");
            return (Criteria) this;
        }

        public Criteria andSchinfoGreaterThanOrEqualTo(String value) {
            addCriterion("SchInfo >=", value, "schinfo");
            return (Criteria) this;
        }

        public Criteria andSchinfoLessThan(String value) {
            addCriterion("SchInfo <", value, "schinfo");
            return (Criteria) this;
        }

        public Criteria andSchinfoLessThanOrEqualTo(String value) {
            addCriterion("SchInfo <=", value, "schinfo");
            return (Criteria) this;
        }

        public Criteria andSchinfoLike(String value) {
            addCriterion("SchInfo like", value, "schinfo");
            return (Criteria) this;
        }

        public Criteria andSchinfoNotLike(String value) {
            addCriterion("SchInfo not like", value, "schinfo");
            return (Criteria) this;
        }

        public Criteria andSchinfoIn(List<String> values) {
            addCriterion("SchInfo in", values, "schinfo");
            return (Criteria) this;
        }

        public Criteria andSchinfoNotIn(List<String> values) {
            addCriterion("SchInfo not in", values, "schinfo");
            return (Criteria) this;
        }

        public Criteria andSchinfoBetween(String value1, String value2) {
            addCriterion("SchInfo between", value1, value2, "schinfo");
            return (Criteria) this;
        }

        public Criteria andSchinfoNotBetween(String value1, String value2) {
            addCriterion("SchInfo not between", value1, value2, "schinfo");
            return (Criteria) this;
        }

        public Criteria andSchstayIsNull() {
            addCriterion("SchStay is null");
            return (Criteria) this;
        }

        public Criteria andSchstayIsNotNull() {
            addCriterion("SchStay is not null");
            return (Criteria) this;
        }

        public Criteria andSchstayEqualTo(String value) {
            addCriterion("SchStay =", value, "schstay");
            return (Criteria) this;
        }

        public Criteria andSchstayNotEqualTo(String value) {
            addCriterion("SchStay <>", value, "schstay");
            return (Criteria) this;
        }

        public Criteria andSchstayGreaterThan(String value) {
            addCriterion("SchStay >", value, "schstay");
            return (Criteria) this;
        }

        public Criteria andSchstayGreaterThanOrEqualTo(String value) {
            addCriterion("SchStay >=", value, "schstay");
            return (Criteria) this;
        }

        public Criteria andSchstayLessThan(String value) {
            addCriterion("SchStay <", value, "schstay");
            return (Criteria) this;
        }

        public Criteria andSchstayLessThanOrEqualTo(String value) {
            addCriterion("SchStay <=", value, "schstay");
            return (Criteria) this;
        }

        public Criteria andSchstayLike(String value) {
            addCriterion("SchStay like", value, "schstay");
            return (Criteria) this;
        }

        public Criteria andSchstayNotLike(String value) {
            addCriterion("SchStay not like", value, "schstay");
            return (Criteria) this;
        }

        public Criteria andSchstayIn(List<String> values) {
            addCriterion("SchStay in", values, "schstay");
            return (Criteria) this;
        }

        public Criteria andSchstayNotIn(List<String> values) {
            addCriterion("SchStay not in", values, "schstay");
            return (Criteria) this;
        }

        public Criteria andSchstayBetween(String value1, String value2) {
            addCriterion("SchStay between", value1, value2, "schstay");
            return (Criteria) this;
        }

        public Criteria andSchstayNotBetween(String value1, String value2) {
            addCriterion("SchStay not between", value1, value2, "schstay");
            return (Criteria) this;
        }

        public Criteria andSchrepastIsNull() {
            addCriterion("SchRepast is null");
            return (Criteria) this;
        }

        public Criteria andSchrepastIsNotNull() {
            addCriterion("SchRepast is not null");
            return (Criteria) this;
        }

        public Criteria andSchrepastEqualTo(Integer value) {
            addCriterion("SchRepast =", value, "schrepast");
            return (Criteria) this;
        }

        public Criteria andSchrepastNotEqualTo(Integer value) {
            addCriterion("SchRepast <>", value, "schrepast");
            return (Criteria) this;
        }

        public Criteria andSchrepastGreaterThan(Integer value) {
            addCriterion("SchRepast >", value, "schrepast");
            return (Criteria) this;
        }

        public Criteria andSchrepastGreaterThanOrEqualTo(Integer value) {
            addCriterion("SchRepast >=", value, "schrepast");
            return (Criteria) this;
        }

        public Criteria andSchrepastLessThan(Integer value) {
            addCriterion("SchRepast <", value, "schrepast");
            return (Criteria) this;
        }

        public Criteria andSchrepastLessThanOrEqualTo(Integer value) {
            addCriterion("SchRepast <=", value, "schrepast");
            return (Criteria) this;
        }

        public Criteria andSchrepastIn(List<Integer> values) {
            addCriterion("SchRepast in", values, "schrepast");
            return (Criteria) this;
        }

        public Criteria andSchrepastNotIn(List<Integer> values) {
            addCriterion("SchRepast not in", values, "schrepast");
            return (Criteria) this;
        }

        public Criteria andSchrepastBetween(Integer value1, Integer value2) {
            addCriterion("SchRepast between", value1, value2, "schrepast");
            return (Criteria) this;
        }

        public Criteria andSchrepastNotBetween(Integer value1, Integer value2) {
            addCriterion("SchRepast not between", value1, value2, "schrepast");
            return (Criteria) this;
        }

        public Criteria andSchrepastinfoIsNull() {
            addCriterion("SchRepastInfo is null");
            return (Criteria) this;
        }

        public Criteria andSchrepastinfoIsNotNull() {
            addCriterion("SchRepastInfo is not null");
            return (Criteria) this;
        }

        public Criteria andSchrepastinfoEqualTo(String value) {
            addCriterion("SchRepastInfo =", value, "schrepastinfo");
            return (Criteria) this;
        }

        public Criteria andSchrepastinfoNotEqualTo(String value) {
            addCriterion("SchRepastInfo <>", value, "schrepastinfo");
            return (Criteria) this;
        }

        public Criteria andSchrepastinfoGreaterThan(String value) {
            addCriterion("SchRepastInfo >", value, "schrepastinfo");
            return (Criteria) this;
        }

        public Criteria andSchrepastinfoGreaterThanOrEqualTo(String value) {
            addCriterion("SchRepastInfo >=", value, "schrepastinfo");
            return (Criteria) this;
        }

        public Criteria andSchrepastinfoLessThan(String value) {
            addCriterion("SchRepastInfo <", value, "schrepastinfo");
            return (Criteria) this;
        }

        public Criteria andSchrepastinfoLessThanOrEqualTo(String value) {
            addCriterion("SchRepastInfo <=", value, "schrepastinfo");
            return (Criteria) this;
        }

        public Criteria andSchrepastinfoLike(String value) {
            addCriterion("SchRepastInfo like", value, "schrepastinfo");
            return (Criteria) this;
        }

        public Criteria andSchrepastinfoNotLike(String value) {
            addCriterion("SchRepastInfo not like", value, "schrepastinfo");
            return (Criteria) this;
        }

        public Criteria andSchrepastinfoIn(List<String> values) {
            addCriterion("SchRepastInfo in", values, "schrepastinfo");
            return (Criteria) this;
        }

        public Criteria andSchrepastinfoNotIn(List<String> values) {
            addCriterion("SchRepastInfo not in", values, "schrepastinfo");
            return (Criteria) this;
        }

        public Criteria andSchrepastinfoBetween(String value1, String value2) {
            addCriterion("SchRepastInfo between", value1, value2, "schrepastinfo");
            return (Criteria) this;
        }

        public Criteria andSchrepastinfoNotBetween(String value1, String value2) {
            addCriterion("SchRepastInfo not between", value1, value2, "schrepastinfo");
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