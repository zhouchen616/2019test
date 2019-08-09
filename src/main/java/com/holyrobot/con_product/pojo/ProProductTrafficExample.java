package com.holyrobot.con_product.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProProductTrafficExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProProductTrafficExample() {
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

        public Criteria andTrafficnoIsNull() {
            addCriterion("TrafficNo is null");
            return (Criteria) this;
        }

        public Criteria andTrafficnoIsNotNull() {
            addCriterion("TrafficNo is not null");
            return (Criteria) this;
        }

        public Criteria andTrafficnoEqualTo(String value) {
            addCriterion("TrafficNo =", value, "trafficno");
            return (Criteria) this;
        }

        public Criteria andTrafficnoNotEqualTo(String value) {
            addCriterion("TrafficNo <>", value, "trafficno");
            return (Criteria) this;
        }

        public Criteria andTrafficnoGreaterThan(String value) {
            addCriterion("TrafficNo >", value, "trafficno");
            return (Criteria) this;
        }

        public Criteria andTrafficnoGreaterThanOrEqualTo(String value) {
            addCriterion("TrafficNo >=", value, "trafficno");
            return (Criteria) this;
        }

        public Criteria andTrafficnoLessThan(String value) {
            addCriterion("TrafficNo <", value, "trafficno");
            return (Criteria) this;
        }

        public Criteria andTrafficnoLessThanOrEqualTo(String value) {
            addCriterion("TrafficNo <=", value, "trafficno");
            return (Criteria) this;
        }

        public Criteria andTrafficnoLike(String value) {
            addCriterion("TrafficNo like", value, "trafficno");
            return (Criteria) this;
        }

        public Criteria andTrafficnoNotLike(String value) {
            addCriterion("TrafficNo not like", value, "trafficno");
            return (Criteria) this;
        }

        public Criteria andTrafficnoIn(List<String> values) {
            addCriterion("TrafficNo in", values, "trafficno");
            return (Criteria) this;
        }

        public Criteria andTrafficnoNotIn(List<String> values) {
            addCriterion("TrafficNo not in", values, "trafficno");
            return (Criteria) this;
        }

        public Criteria andTrafficnoBetween(String value1, String value2) {
            addCriterion("TrafficNo between", value1, value2, "trafficno");
            return (Criteria) this;
        }

        public Criteria andTrafficnoNotBetween(String value1, String value2) {
            addCriterion("TrafficNo not between", value1, value2, "trafficno");
            return (Criteria) this;
        }

        public Criteria andDepnameIsNull() {
            addCriterion("DepName is null");
            return (Criteria) this;
        }

        public Criteria andDepnameIsNotNull() {
            addCriterion("DepName is not null");
            return (Criteria) this;
        }

        public Criteria andDepnameEqualTo(String value) {
            addCriterion("DepName =", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameNotEqualTo(String value) {
            addCriterion("DepName <>", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameGreaterThan(String value) {
            addCriterion("DepName >", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameGreaterThanOrEqualTo(String value) {
            addCriterion("DepName >=", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameLessThan(String value) {
            addCriterion("DepName <", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameLessThanOrEqualTo(String value) {
            addCriterion("DepName <=", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameLike(String value) {
            addCriterion("DepName like", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameNotLike(String value) {
            addCriterion("DepName not like", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameIn(List<String> values) {
            addCriterion("DepName in", values, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameNotIn(List<String> values) {
            addCriterion("DepName not in", values, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameBetween(String value1, String value2) {
            addCriterion("DepName between", value1, value2, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameNotBetween(String value1, String value2) {
            addCriterion("DepName not between", value1, value2, "depname");
            return (Criteria) this;
        }

        public Criteria andDeptimeIsNull() {
            addCriterion("DepTime is null");
            return (Criteria) this;
        }

        public Criteria andDeptimeIsNotNull() {
            addCriterion("DepTime is not null");
            return (Criteria) this;
        }

        public Criteria andDeptimeEqualTo(String value) {
            addCriterion("DepTime =", value, "deptime");
            return (Criteria) this;
        }

        public Criteria andDeptimeNotEqualTo(String value) {
            addCriterion("DepTime <>", value, "deptime");
            return (Criteria) this;
        }

        public Criteria andDeptimeGreaterThan(String value) {
            addCriterion("DepTime >", value, "deptime");
            return (Criteria) this;
        }

        public Criteria andDeptimeGreaterThanOrEqualTo(String value) {
            addCriterion("DepTime >=", value, "deptime");
            return (Criteria) this;
        }

        public Criteria andDeptimeLessThan(String value) {
            addCriterion("DepTime <", value, "deptime");
            return (Criteria) this;
        }

        public Criteria andDeptimeLessThanOrEqualTo(String value) {
            addCriterion("DepTime <=", value, "deptime");
            return (Criteria) this;
        }

        public Criteria andDeptimeLike(String value) {
            addCriterion("DepTime like", value, "deptime");
            return (Criteria) this;
        }

        public Criteria andDeptimeNotLike(String value) {
            addCriterion("DepTime not like", value, "deptime");
            return (Criteria) this;
        }

        public Criteria andDeptimeIn(List<String> values) {
            addCriterion("DepTime in", values, "deptime");
            return (Criteria) this;
        }

        public Criteria andDeptimeNotIn(List<String> values) {
            addCriterion("DepTime not in", values, "deptime");
            return (Criteria) this;
        }

        public Criteria andDeptimeBetween(String value1, String value2) {
            addCriterion("DepTime between", value1, value2, "deptime");
            return (Criteria) this;
        }

        public Criteria andDeptimeNotBetween(String value1, String value2) {
            addCriterion("DepTime not between", value1, value2, "deptime");
            return (Criteria) this;
        }

        public Criteria andDepterminalIsNull() {
            addCriterion("DepTerminal is null");
            return (Criteria) this;
        }

        public Criteria andDepterminalIsNotNull() {
            addCriterion("DepTerminal is not null");
            return (Criteria) this;
        }

        public Criteria andDepterminalEqualTo(String value) {
            addCriterion("DepTerminal =", value, "depterminal");
            return (Criteria) this;
        }

        public Criteria andDepterminalNotEqualTo(String value) {
            addCriterion("DepTerminal <>", value, "depterminal");
            return (Criteria) this;
        }

        public Criteria andDepterminalGreaterThan(String value) {
            addCriterion("DepTerminal >", value, "depterminal");
            return (Criteria) this;
        }

        public Criteria andDepterminalGreaterThanOrEqualTo(String value) {
            addCriterion("DepTerminal >=", value, "depterminal");
            return (Criteria) this;
        }

        public Criteria andDepterminalLessThan(String value) {
            addCriterion("DepTerminal <", value, "depterminal");
            return (Criteria) this;
        }

        public Criteria andDepterminalLessThanOrEqualTo(String value) {
            addCriterion("DepTerminal <=", value, "depterminal");
            return (Criteria) this;
        }

        public Criteria andDepterminalLike(String value) {
            addCriterion("DepTerminal like", value, "depterminal");
            return (Criteria) this;
        }

        public Criteria andDepterminalNotLike(String value) {
            addCriterion("DepTerminal not like", value, "depterminal");
            return (Criteria) this;
        }

        public Criteria andDepterminalIn(List<String> values) {
            addCriterion("DepTerminal in", values, "depterminal");
            return (Criteria) this;
        }

        public Criteria andDepterminalNotIn(List<String> values) {
            addCriterion("DepTerminal not in", values, "depterminal");
            return (Criteria) this;
        }

        public Criteria andDepterminalBetween(String value1, String value2) {
            addCriterion("DepTerminal between", value1, value2, "depterminal");
            return (Criteria) this;
        }

        public Criteria andDepterminalNotBetween(String value1, String value2) {
            addCriterion("DepTerminal not between", value1, value2, "depterminal");
            return (Criteria) this;
        }

        public Criteria andArrnameIsNull() {
            addCriterion("ArrName is null");
            return (Criteria) this;
        }

        public Criteria andArrnameIsNotNull() {
            addCriterion("ArrName is not null");
            return (Criteria) this;
        }

        public Criteria andArrnameEqualTo(String value) {
            addCriterion("ArrName =", value, "arrname");
            return (Criteria) this;
        }

        public Criteria andArrnameNotEqualTo(String value) {
            addCriterion("ArrName <>", value, "arrname");
            return (Criteria) this;
        }

        public Criteria andArrnameGreaterThan(String value) {
            addCriterion("ArrName >", value, "arrname");
            return (Criteria) this;
        }

        public Criteria andArrnameGreaterThanOrEqualTo(String value) {
            addCriterion("ArrName >=", value, "arrname");
            return (Criteria) this;
        }

        public Criteria andArrnameLessThan(String value) {
            addCriterion("ArrName <", value, "arrname");
            return (Criteria) this;
        }

        public Criteria andArrnameLessThanOrEqualTo(String value) {
            addCriterion("ArrName <=", value, "arrname");
            return (Criteria) this;
        }

        public Criteria andArrnameLike(String value) {
            addCriterion("ArrName like", value, "arrname");
            return (Criteria) this;
        }

        public Criteria andArrnameNotLike(String value) {
            addCriterion("ArrName not like", value, "arrname");
            return (Criteria) this;
        }

        public Criteria andArrnameIn(List<String> values) {
            addCriterion("ArrName in", values, "arrname");
            return (Criteria) this;
        }

        public Criteria andArrnameNotIn(List<String> values) {
            addCriterion("ArrName not in", values, "arrname");
            return (Criteria) this;
        }

        public Criteria andArrnameBetween(String value1, String value2) {
            addCriterion("ArrName between", value1, value2, "arrname");
            return (Criteria) this;
        }

        public Criteria andArrnameNotBetween(String value1, String value2) {
            addCriterion("ArrName not between", value1, value2, "arrname");
            return (Criteria) this;
        }

        public Criteria andArrtimeIsNull() {
            addCriterion("ArrTime is null");
            return (Criteria) this;
        }

        public Criteria andArrtimeIsNotNull() {
            addCriterion("ArrTime is not null");
            return (Criteria) this;
        }

        public Criteria andArrtimeEqualTo(String value) {
            addCriterion("ArrTime =", value, "arrtime");
            return (Criteria) this;
        }

        public Criteria andArrtimeNotEqualTo(String value) {
            addCriterion("ArrTime <>", value, "arrtime");
            return (Criteria) this;
        }

        public Criteria andArrtimeGreaterThan(String value) {
            addCriterion("ArrTime >", value, "arrtime");
            return (Criteria) this;
        }

        public Criteria andArrtimeGreaterThanOrEqualTo(String value) {
            addCriterion("ArrTime >=", value, "arrtime");
            return (Criteria) this;
        }

        public Criteria andArrtimeLessThan(String value) {
            addCriterion("ArrTime <", value, "arrtime");
            return (Criteria) this;
        }

        public Criteria andArrtimeLessThanOrEqualTo(String value) {
            addCriterion("ArrTime <=", value, "arrtime");
            return (Criteria) this;
        }

        public Criteria andArrtimeLike(String value) {
            addCriterion("ArrTime like", value, "arrtime");
            return (Criteria) this;
        }

        public Criteria andArrtimeNotLike(String value) {
            addCriterion("ArrTime not like", value, "arrtime");
            return (Criteria) this;
        }

        public Criteria andArrtimeIn(List<String> values) {
            addCriterion("ArrTime in", values, "arrtime");
            return (Criteria) this;
        }

        public Criteria andArrtimeNotIn(List<String> values) {
            addCriterion("ArrTime not in", values, "arrtime");
            return (Criteria) this;
        }

        public Criteria andArrtimeBetween(String value1, String value2) {
            addCriterion("ArrTime between", value1, value2, "arrtime");
            return (Criteria) this;
        }

        public Criteria andArrtimeNotBetween(String value1, String value2) {
            addCriterion("ArrTime not between", value1, value2, "arrtime");
            return (Criteria) this;
        }

        public Criteria andArrterminalIsNull() {
            addCriterion("ArrTerminal is null");
            return (Criteria) this;
        }

        public Criteria andArrterminalIsNotNull() {
            addCriterion("ArrTerminal is not null");
            return (Criteria) this;
        }

        public Criteria andArrterminalEqualTo(String value) {
            addCriterion("ArrTerminal =", value, "arrterminal");
            return (Criteria) this;
        }

        public Criteria andArrterminalNotEqualTo(String value) {
            addCriterion("ArrTerminal <>", value, "arrterminal");
            return (Criteria) this;
        }

        public Criteria andArrterminalGreaterThan(String value) {
            addCriterion("ArrTerminal >", value, "arrterminal");
            return (Criteria) this;
        }

        public Criteria andArrterminalGreaterThanOrEqualTo(String value) {
            addCriterion("ArrTerminal >=", value, "arrterminal");
            return (Criteria) this;
        }

        public Criteria andArrterminalLessThan(String value) {
            addCriterion("ArrTerminal <", value, "arrterminal");
            return (Criteria) this;
        }

        public Criteria andArrterminalLessThanOrEqualTo(String value) {
            addCriterion("ArrTerminal <=", value, "arrterminal");
            return (Criteria) this;
        }

        public Criteria andArrterminalLike(String value) {
            addCriterion("ArrTerminal like", value, "arrterminal");
            return (Criteria) this;
        }

        public Criteria andArrterminalNotLike(String value) {
            addCriterion("ArrTerminal not like", value, "arrterminal");
            return (Criteria) this;
        }

        public Criteria andArrterminalIn(List<String> values) {
            addCriterion("ArrTerminal in", values, "arrterminal");
            return (Criteria) this;
        }

        public Criteria andArrterminalNotIn(List<String> values) {
            addCriterion("ArrTerminal not in", values, "arrterminal");
            return (Criteria) this;
        }

        public Criteria andArrterminalBetween(String value1, String value2) {
            addCriterion("ArrTerminal between", value1, value2, "arrterminal");
            return (Criteria) this;
        }

        public Criteria andArrterminalNotBetween(String value1, String value2) {
            addCriterion("ArrTerminal not between", value1, value2, "arrterminal");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("Company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("Company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("Company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("Company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("Company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("Company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("Company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("Company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("Company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("Company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("Company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("Company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("Company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("Company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andIsdirectIsNull() {
            addCriterion("IsDirect is null");
            return (Criteria) this;
        }

        public Criteria andIsdirectIsNotNull() {
            addCriterion("IsDirect is not null");
            return (Criteria) this;
        }

        public Criteria andIsdirectEqualTo(Integer value) {
            addCriterion("IsDirect =", value, "isdirect");
            return (Criteria) this;
        }

        public Criteria andIsdirectNotEqualTo(Integer value) {
            addCriterion("IsDirect <>", value, "isdirect");
            return (Criteria) this;
        }

        public Criteria andIsdirectGreaterThan(Integer value) {
            addCriterion("IsDirect >", value, "isdirect");
            return (Criteria) this;
        }

        public Criteria andIsdirectGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsDirect >=", value, "isdirect");
            return (Criteria) this;
        }

        public Criteria andIsdirectLessThan(Integer value) {
            addCriterion("IsDirect <", value, "isdirect");
            return (Criteria) this;
        }

        public Criteria andIsdirectLessThanOrEqualTo(Integer value) {
            addCriterion("IsDirect <=", value, "isdirect");
            return (Criteria) this;
        }

        public Criteria andIsdirectIn(List<Integer> values) {
            addCriterion("IsDirect in", values, "isdirect");
            return (Criteria) this;
        }

        public Criteria andIsdirectNotIn(List<Integer> values) {
            addCriterion("IsDirect not in", values, "isdirect");
            return (Criteria) this;
        }

        public Criteria andIsdirectBetween(Integer value1, Integer value2) {
            addCriterion("IsDirect between", value1, value2, "isdirect");
            return (Criteria) this;
        }

        public Criteria andIsdirectNotBetween(Integer value1, Integer value2) {
            addCriterion("IsDirect not between", value1, value2, "isdirect");
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