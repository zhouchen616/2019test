package com.holyrobot.con_common.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CusCusInfoDestExample implements Serializable{
    private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CusCusInfoDestExample() {
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

        public Criteria andCusCusinfoidIsNull() {
            addCriterion("Cus_CusInfoID is null");
            return (Criteria) this;
        }

        public Criteria andCusCusinfoidIsNotNull() {
            addCriterion("Cus_CusInfoID is not null");
            return (Criteria) this;
        }

        public Criteria andCusCusinfoidEqualTo(String value) {
            addCriterion("Cus_CusInfoID =", value, "cusCusinfoid");
            return (Criteria) this;
        }

        public Criteria andCusCusinfoidNotEqualTo(String value) {
            addCriterion("Cus_CusInfoID <>", value, "cusCusinfoid");
            return (Criteria) this;
        }

        public Criteria andCusCusinfoidGreaterThan(String value) {
            addCriterion("Cus_CusInfoID >", value, "cusCusinfoid");
            return (Criteria) this;
        }

        public Criteria andCusCusinfoidGreaterThanOrEqualTo(String value) {
            addCriterion("Cus_CusInfoID >=", value, "cusCusinfoid");
            return (Criteria) this;
        }

        public Criteria andCusCusinfoidLessThan(String value) {
            addCriterion("Cus_CusInfoID <", value, "cusCusinfoid");
            return (Criteria) this;
        }

        public Criteria andCusCusinfoidLessThanOrEqualTo(String value) {
            addCriterion("Cus_CusInfoID <=", value, "cusCusinfoid");
            return (Criteria) this;
        }

        public Criteria andCusCusinfoidLike(String value) {
            addCriterion("Cus_CusInfoID like", value, "cusCusinfoid");
            return (Criteria) this;
        }

        public Criteria andCusCusinfoidNotLike(String value) {
            addCriterion("Cus_CusInfoID not like", value, "cusCusinfoid");
            return (Criteria) this;
        }

        public Criteria andCusCusinfoidIn(List<String> values) {
            addCriterion("Cus_CusInfoID in", values, "cusCusinfoid");
            return (Criteria) this;
        }

        public Criteria andCusCusinfoidNotIn(List<String> values) {
            addCriterion("Cus_CusInfoID not in", values, "cusCusinfoid");
            return (Criteria) this;
        }

        public Criteria andCusCusinfoidBetween(String value1, String value2) {
            addCriterion("Cus_CusInfoID between", value1, value2, "cusCusinfoid");
            return (Criteria) this;
        }

        public Criteria andCusCusinfoidNotBetween(String value1, String value2) {
            addCriterion("Cus_CusInfoID not between", value1, value2, "cusCusinfoid");
            return (Criteria) this;
        }

        public Criteria andDestidIsNull() {
            addCriterion("DestID is null");
            return (Criteria) this;
        }

        public Criteria andDestidIsNotNull() {
            addCriterion("DestID is not null");
            return (Criteria) this;
        }

        public Criteria andDestidEqualTo(String value) {
            addCriterion("DestID =", value, "destid");
            return (Criteria) this;
        }

        public Criteria andDestidNotEqualTo(String value) {
            addCriterion("DestID <>", value, "destid");
            return (Criteria) this;
        }

        public Criteria andDestidGreaterThan(String value) {
            addCriterion("DestID >", value, "destid");
            return (Criteria) this;
        }

        public Criteria andDestidGreaterThanOrEqualTo(String value) {
            addCriterion("DestID >=", value, "destid");
            return (Criteria) this;
        }

        public Criteria andDestidLessThan(String value) {
            addCriterion("DestID <", value, "destid");
            return (Criteria) this;
        }

        public Criteria andDestidLessThanOrEqualTo(String value) {
            addCriterion("DestID <=", value, "destid");
            return (Criteria) this;
        }

        public Criteria andDestidLike(String value) {
            addCriterion("DestID like", value, "destid");
            return (Criteria) this;
        }

        public Criteria andDestidNotLike(String value) {
            addCriterion("DestID not like", value, "destid");
            return (Criteria) this;
        }

        public Criteria andDestidIn(List<String> values) {
            addCriterion("DestID in", values, "destid");
            return (Criteria) this;
        }

        public Criteria andDestidNotIn(List<String> values) {
            addCriterion("DestID not in", values, "destid");
            return (Criteria) this;
        }

        public Criteria andDestidBetween(String value1, String value2) {
            addCriterion("DestID between", value1, value2, "destid");
            return (Criteria) this;
        }

        public Criteria andDestidNotBetween(String value1, String value2) {
            addCriterion("DestID not between", value1, value2, "destid");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNull() {
            addCriterion("Destination is null");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNotNull() {
            addCriterion("Destination is not null");
            return (Criteria) this;
        }

        public Criteria andDestinationEqualTo(String value) {
            addCriterion("Destination =", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotEqualTo(String value) {
            addCriterion("Destination <>", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThan(String value) {
            addCriterion("Destination >", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThanOrEqualTo(String value) {
            addCriterion("Destination >=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThan(String value) {
            addCriterion("Destination <", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThanOrEqualTo(String value) {
            addCriterion("Destination <=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLike(String value) {
            addCriterion("Destination like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotLike(String value) {
            addCriterion("Destination not like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationIn(List<String> values) {
            addCriterion("Destination in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotIn(List<String> values) {
            addCriterion("Destination not in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationBetween(String value1, String value2) {
            addCriterion("Destination between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotBetween(String value1, String value2) {
            addCriterion("Destination not between", value1, value2, "destination");
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