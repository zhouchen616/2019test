package com.holyrobot.con_product.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProProductScheduleImageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProProductScheduleImageExample() {
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

        public Criteria andProscheduleidIsNull() {
            addCriterion("ProScheduleID is null");
            return (Criteria) this;
        }

        public Criteria andProscheduleidIsNotNull() {
            addCriterion("ProScheduleID is not null");
            return (Criteria) this;
        }

        public Criteria andProscheduleidEqualTo(String value) {
            addCriterion("ProScheduleID =", value, "proscheduleid");
            return (Criteria) this;
        }

        public Criteria andProscheduleidNotEqualTo(String value) {
            addCriterion("ProScheduleID <>", value, "proscheduleid");
            return (Criteria) this;
        }

        public Criteria andProscheduleidGreaterThan(String value) {
            addCriterion("ProScheduleID >", value, "proscheduleid");
            return (Criteria) this;
        }

        public Criteria andProscheduleidGreaterThanOrEqualTo(String value) {
            addCriterion("ProScheduleID >=", value, "proscheduleid");
            return (Criteria) this;
        }

        public Criteria andProscheduleidLessThan(String value) {
            addCriterion("ProScheduleID <", value, "proscheduleid");
            return (Criteria) this;
        }

        public Criteria andProscheduleidLessThanOrEqualTo(String value) {
            addCriterion("ProScheduleID <=", value, "proscheduleid");
            return (Criteria) this;
        }

        public Criteria andProscheduleidLike(String value) {
            addCriterion("ProScheduleID like", value, "proscheduleid");
            return (Criteria) this;
        }

        public Criteria andProscheduleidNotLike(String value) {
            addCriterion("ProScheduleID not like", value, "proscheduleid");
            return (Criteria) this;
        }

        public Criteria andProscheduleidIn(List<String> values) {
            addCriterion("ProScheduleID in", values, "proscheduleid");
            return (Criteria) this;
        }

        public Criteria andProscheduleidNotIn(List<String> values) {
            addCriterion("ProScheduleID not in", values, "proscheduleid");
            return (Criteria) this;
        }

        public Criteria andProscheduleidBetween(String value1, String value2) {
            addCriterion("ProScheduleID between", value1, value2, "proscheduleid");
            return (Criteria) this;
        }

        public Criteria andProscheduleidNotBetween(String value1, String value2) {
            addCriterion("ProScheduleID not between", value1, value2, "proscheduleid");
            return (Criteria) this;
        }

        public Criteria andThumbsrcIsNull() {
            addCriterion("ThumbSrc is null");
            return (Criteria) this;
        }

        public Criteria andThumbsrcIsNotNull() {
            addCriterion("ThumbSrc is not null");
            return (Criteria) this;
        }

        public Criteria andThumbsrcEqualTo(String value) {
            addCriterion("ThumbSrc =", value, "thumbsrc");
            return (Criteria) this;
        }

        public Criteria andThumbsrcNotEqualTo(String value) {
            addCriterion("ThumbSrc <>", value, "thumbsrc");
            return (Criteria) this;
        }

        public Criteria andThumbsrcGreaterThan(String value) {
            addCriterion("ThumbSrc >", value, "thumbsrc");
            return (Criteria) this;
        }

        public Criteria andThumbsrcGreaterThanOrEqualTo(String value) {
            addCriterion("ThumbSrc >=", value, "thumbsrc");
            return (Criteria) this;
        }

        public Criteria andThumbsrcLessThan(String value) {
            addCriterion("ThumbSrc <", value, "thumbsrc");
            return (Criteria) this;
        }

        public Criteria andThumbsrcLessThanOrEqualTo(String value) {
            addCriterion("ThumbSrc <=", value, "thumbsrc");
            return (Criteria) this;
        }

        public Criteria andThumbsrcLike(String value) {
            addCriterion("ThumbSrc like", value, "thumbsrc");
            return (Criteria) this;
        }

        public Criteria andThumbsrcNotLike(String value) {
            addCriterion("ThumbSrc not like", value, "thumbsrc");
            return (Criteria) this;
        }

        public Criteria andThumbsrcIn(List<String> values) {
            addCriterion("ThumbSrc in", values, "thumbsrc");
            return (Criteria) this;
        }

        public Criteria andThumbsrcNotIn(List<String> values) {
            addCriterion("ThumbSrc not in", values, "thumbsrc");
            return (Criteria) this;
        }

        public Criteria andThumbsrcBetween(String value1, String value2) {
            addCriterion("ThumbSrc between", value1, value2, "thumbsrc");
            return (Criteria) this;
        }

        public Criteria andThumbsrcNotBetween(String value1, String value2) {
            addCriterion("ThumbSrc not between", value1, value2, "thumbsrc");
            return (Criteria) this;
        }

        public Criteria andImagesrcIsNull() {
            addCriterion("ImageSrc is null");
            return (Criteria) this;
        }

        public Criteria andImagesrcIsNotNull() {
            addCriterion("ImageSrc is not null");
            return (Criteria) this;
        }

        public Criteria andImagesrcEqualTo(String value) {
            addCriterion("ImageSrc =", value, "imagesrc");
            return (Criteria) this;
        }

        public Criteria andImagesrcNotEqualTo(String value) {
            addCriterion("ImageSrc <>", value, "imagesrc");
            return (Criteria) this;
        }

        public Criteria andImagesrcGreaterThan(String value) {
            addCriterion("ImageSrc >", value, "imagesrc");
            return (Criteria) this;
        }

        public Criteria andImagesrcGreaterThanOrEqualTo(String value) {
            addCriterion("ImageSrc >=", value, "imagesrc");
            return (Criteria) this;
        }

        public Criteria andImagesrcLessThan(String value) {
            addCriterion("ImageSrc <", value, "imagesrc");
            return (Criteria) this;
        }

        public Criteria andImagesrcLessThanOrEqualTo(String value) {
            addCriterion("ImageSrc <=", value, "imagesrc");
            return (Criteria) this;
        }

        public Criteria andImagesrcLike(String value) {
            addCriterion("ImageSrc like", value, "imagesrc");
            return (Criteria) this;
        }

        public Criteria andImagesrcNotLike(String value) {
            addCriterion("ImageSrc not like", value, "imagesrc");
            return (Criteria) this;
        }

        public Criteria andImagesrcIn(List<String> values) {
            addCriterion("ImageSrc in", values, "imagesrc");
            return (Criteria) this;
        }

        public Criteria andImagesrcNotIn(List<String> values) {
            addCriterion("ImageSrc not in", values, "imagesrc");
            return (Criteria) this;
        }

        public Criteria andImagesrcBetween(String value1, String value2) {
            addCriterion("ImageSrc between", value1, value2, "imagesrc");
            return (Criteria) this;
        }

        public Criteria andImagesrcNotBetween(String value1, String value2) {
            addCriterion("ImageSrc not between", value1, value2, "imagesrc");
            return (Criteria) this;
        }

        public Criteria andOrderindexIsNull() {
            addCriterion("OrderIndex is null");
            return (Criteria) this;
        }

        public Criteria andOrderindexIsNotNull() {
            addCriterion("OrderIndex is not null");
            return (Criteria) this;
        }

        public Criteria andOrderindexEqualTo(Integer value) {
            addCriterion("OrderIndex =", value, "orderindex");
            return (Criteria) this;
        }

        public Criteria andOrderindexNotEqualTo(Integer value) {
            addCriterion("OrderIndex <>", value, "orderindex");
            return (Criteria) this;
        }

        public Criteria andOrderindexGreaterThan(Integer value) {
            addCriterion("OrderIndex >", value, "orderindex");
            return (Criteria) this;
        }

        public Criteria andOrderindexGreaterThanOrEqualTo(Integer value) {
            addCriterion("OrderIndex >=", value, "orderindex");
            return (Criteria) this;
        }

        public Criteria andOrderindexLessThan(Integer value) {
            addCriterion("OrderIndex <", value, "orderindex");
            return (Criteria) this;
        }

        public Criteria andOrderindexLessThanOrEqualTo(Integer value) {
            addCriterion("OrderIndex <=", value, "orderindex");
            return (Criteria) this;
        }

        public Criteria andOrderindexIn(List<Integer> values) {
            addCriterion("OrderIndex in", values, "orderindex");
            return (Criteria) this;
        }

        public Criteria andOrderindexNotIn(List<Integer> values) {
            addCriterion("OrderIndex not in", values, "orderindex");
            return (Criteria) this;
        }

        public Criteria andOrderindexBetween(Integer value1, Integer value2) {
            addCriterion("OrderIndex between", value1, value2, "orderindex");
            return (Criteria) this;
        }

        public Criteria andOrderindexNotBetween(Integer value1, Integer value2) {
            addCriterion("OrderIndex not between", value1, value2, "orderindex");
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