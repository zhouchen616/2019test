package com.holyrobot.con_om.pojo;

import java.util.ArrayList;
import java.util.List;

public class OmProtocolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OmProtocolExample() {
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

        public Criteria andProtocoltypeIsNull() {
            addCriterion("ProtocolType is null");
            return (Criteria) this;
        }

        public Criteria andProtocoltypeIsNotNull() {
            addCriterion("ProtocolType is not null");
            return (Criteria) this;
        }

        public Criteria andProtocoltypeEqualTo(Integer value) {
            addCriterion("ProtocolType =", value, "protocoltype");
            return (Criteria) this;
        }

        public Criteria andProtocoltypeNotEqualTo(Integer value) {
            addCriterion("ProtocolType <>", value, "protocoltype");
            return (Criteria) this;
        }

        public Criteria andProtocoltypeGreaterThan(Integer value) {
            addCriterion("ProtocolType >", value, "protocoltype");
            return (Criteria) this;
        }

        public Criteria andProtocoltypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProtocolType >=", value, "protocoltype");
            return (Criteria) this;
        }

        public Criteria andProtocoltypeLessThan(Integer value) {
            addCriterion("ProtocolType <", value, "protocoltype");
            return (Criteria) this;
        }

        public Criteria andProtocoltypeLessThanOrEqualTo(Integer value) {
            addCriterion("ProtocolType <=", value, "protocoltype");
            return (Criteria) this;
        }

        public Criteria andProtocoltypeIn(List<Integer> values) {
            addCriterion("ProtocolType in", values, "protocoltype");
            return (Criteria) this;
        }

        public Criteria andProtocoltypeNotIn(List<Integer> values) {
            addCriterion("ProtocolType not in", values, "protocoltype");
            return (Criteria) this;
        }

        public Criteria andProtocoltypeBetween(Integer value1, Integer value2) {
            addCriterion("ProtocolType between", value1, value2, "protocoltype");
            return (Criteria) this;
        }

        public Criteria andProtocoltypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ProtocolType not between", value1, value2, "protocoltype");
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

        public Criteria andProtocolcontentIsNull() {
            addCriterion("ProtocolContent is null");
            return (Criteria) this;
        }

        public Criteria andProtocolcontentIsNotNull() {
            addCriterion("ProtocolContent is not null");
            return (Criteria) this;
        }

        public Criteria andProtocolcontentEqualTo(String value) {
            addCriterion("ProtocolContent =", value, "protocolcontent");
            return (Criteria) this;
        }

        public Criteria andProtocolcontentNotEqualTo(String value) {
            addCriterion("ProtocolContent <>", value, "protocolcontent");
            return (Criteria) this;
        }

        public Criteria andProtocolcontentGreaterThan(String value) {
            addCriterion("ProtocolContent >", value, "protocolcontent");
            return (Criteria) this;
        }

        public Criteria andProtocolcontentGreaterThanOrEqualTo(String value) {
            addCriterion("ProtocolContent >=", value, "protocolcontent");
            return (Criteria) this;
        }

        public Criteria andProtocolcontentLessThan(String value) {
            addCriterion("ProtocolContent <", value, "protocolcontent");
            return (Criteria) this;
        }

        public Criteria andProtocolcontentLessThanOrEqualTo(String value) {
            addCriterion("ProtocolContent <=", value, "protocolcontent");
            return (Criteria) this;
        }

        public Criteria andProtocolcontentLike(String value) {
            addCriterion("ProtocolContent like", value, "protocolcontent");
            return (Criteria) this;
        }

        public Criteria andProtocolcontentNotLike(String value) {
            addCriterion("ProtocolContent not like", value, "protocolcontent");
            return (Criteria) this;
        }

        public Criteria andProtocolcontentIn(List<String> values) {
            addCriterion("ProtocolContent in", values, "protocolcontent");
            return (Criteria) this;
        }

        public Criteria andProtocolcontentNotIn(List<String> values) {
            addCriterion("ProtocolContent not in", values, "protocolcontent");
            return (Criteria) this;
        }

        public Criteria andProtocolcontentBetween(String value1, String value2) {
            addCriterion("ProtocolContent between", value1, value2, "protocolcontent");
            return (Criteria) this;
        }

        public Criteria andProtocolcontentNotBetween(String value1, String value2) {
            addCriterion("ProtocolContent not between", value1, value2, "protocolcontent");
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