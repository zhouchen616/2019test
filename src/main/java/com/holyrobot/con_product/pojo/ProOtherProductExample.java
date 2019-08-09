package com.holyrobot.con_product.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProOtherProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProOtherProductExample() {
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

        public Criteria andProtypeIsNull() {
            addCriterion("ProType is null");
            return (Criteria) this;
        }

        public Criteria andProtypeIsNotNull() {
            addCriterion("ProType is not null");
            return (Criteria) this;
        }

        public Criteria andProtypeEqualTo(Integer value) {
            addCriterion("ProType =", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeNotEqualTo(Integer value) {
            addCriterion("ProType <>", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeGreaterThan(Integer value) {
            addCriterion("ProType >", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProType >=", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeLessThan(Integer value) {
            addCriterion("ProType <", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeLessThanOrEqualTo(Integer value) {
            addCriterion("ProType <=", value, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeIn(List<Integer> values) {
            addCriterion("ProType in", values, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeNotIn(List<Integer> values) {
            addCriterion("ProType not in", values, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeBetween(Integer value1, Integer value2) {
            addCriterion("ProType between", value1, value2, "protype");
            return (Criteria) this;
        }

        public Criteria andProtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ProType not between", value1, value2, "protype");
            return (Criteria) this;
        }

        public Criteria andUnitamtIsNull() {
            addCriterion("UnitAmt is null");
            return (Criteria) this;
        }

        public Criteria andUnitamtIsNotNull() {
            addCriterion("UnitAmt is not null");
            return (Criteria) this;
        }

        public Criteria andUnitamtEqualTo(BigDecimal value) {
            addCriterion("UnitAmt =", value, "unitamt");
            return (Criteria) this;
        }

        public Criteria andUnitamtNotEqualTo(BigDecimal value) {
            addCriterion("UnitAmt <>", value, "unitamt");
            return (Criteria) this;
        }

        public Criteria andUnitamtGreaterThan(BigDecimal value) {
            addCriterion("UnitAmt >", value, "unitamt");
            return (Criteria) this;
        }

        public Criteria andUnitamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UnitAmt >=", value, "unitamt");
            return (Criteria) this;
        }

        public Criteria andUnitamtLessThan(BigDecimal value) {
            addCriterion("UnitAmt <", value, "unitamt");
            return (Criteria) this;
        }

        public Criteria andUnitamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UnitAmt <=", value, "unitamt");
            return (Criteria) this;
        }

        public Criteria andUnitamtIn(List<BigDecimal> values) {
            addCriterion("UnitAmt in", values, "unitamt");
            return (Criteria) this;
        }

        public Criteria andUnitamtNotIn(List<BigDecimal> values) {
            addCriterion("UnitAmt not in", values, "unitamt");
            return (Criteria) this;
        }

        public Criteria andUnitamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UnitAmt between", value1, value2, "unitamt");
            return (Criteria) this;
        }

        public Criteria andUnitamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UnitAmt not between", value1, value2, "unitamt");
            return (Criteria) this;
        }

        public Criteria andDeductionamtIsNull() {
            addCriterion("DeductionAmt is null");
            return (Criteria) this;
        }

        public Criteria andDeductionamtIsNotNull() {
            addCriterion("DeductionAmt is not null");
            return (Criteria) this;
        }

        public Criteria andDeductionamtEqualTo(BigDecimal value) {
            addCriterion("DeductionAmt =", value, "deductionamt");
            return (Criteria) this;
        }

        public Criteria andDeductionamtNotEqualTo(BigDecimal value) {
            addCriterion("DeductionAmt <>", value, "deductionamt");
            return (Criteria) this;
        }

        public Criteria andDeductionamtGreaterThan(BigDecimal value) {
            addCriterion("DeductionAmt >", value, "deductionamt");
            return (Criteria) this;
        }

        public Criteria andDeductionamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DeductionAmt >=", value, "deductionamt");
            return (Criteria) this;
        }

        public Criteria andDeductionamtLessThan(BigDecimal value) {
            addCriterion("DeductionAmt <", value, "deductionamt");
            return (Criteria) this;
        }

        public Criteria andDeductionamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DeductionAmt <=", value, "deductionamt");
            return (Criteria) this;
        }

        public Criteria andDeductionamtIn(List<BigDecimal> values) {
            addCriterion("DeductionAmt in", values, "deductionamt");
            return (Criteria) this;
        }

        public Criteria andDeductionamtNotIn(List<BigDecimal> values) {
            addCriterion("DeductionAmt not in", values, "deductionamt");
            return (Criteria) this;
        }

        public Criteria andDeductionamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DeductionAmt between", value1, value2, "deductionamt");
            return (Criteria) this;
        }

        public Criteria andDeductionamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DeductionAmt not between", value1, value2, "deductionamt");
            return (Criteria) this;
        }

        public Criteria andPicurlIsNull() {
            addCriterion("PicUrl is null");
            return (Criteria) this;
        }

        public Criteria andPicurlIsNotNull() {
            addCriterion("PicUrl is not null");
            return (Criteria) this;
        }

        public Criteria andPicurlEqualTo(String value) {
            addCriterion("PicUrl =", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlNotEqualTo(String value) {
            addCriterion("PicUrl <>", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlGreaterThan(String value) {
            addCriterion("PicUrl >", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlGreaterThanOrEqualTo(String value) {
            addCriterion("PicUrl >=", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlLessThan(String value) {
            addCriterion("PicUrl <", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlLessThanOrEqualTo(String value) {
            addCriterion("PicUrl <=", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlLike(String value) {
            addCriterion("PicUrl like", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlNotLike(String value) {
            addCriterion("PicUrl not like", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlIn(List<String> values) {
            addCriterion("PicUrl in", values, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlNotIn(List<String> values) {
            addCriterion("PicUrl not in", values, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlBetween(String value1, String value2) {
            addCriterion("PicUrl between", value1, value2, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlNotBetween(String value1, String value2) {
            addCriterion("PicUrl not between", value1, value2, "picurl");
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