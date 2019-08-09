package com.holyrobot.con_common.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CusCusinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CusCusinfoExample() {
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

        public Criteria andCustypeIsNull() {
            addCriterion("CusType is null");
            return (Criteria) this;
        }

        public Criteria andCustypeIsNotNull() {
            addCriterion("CusType is not null");
            return (Criteria) this;
        }

        public Criteria andCustypeEqualTo(Integer value) {
            addCriterion("CusType =", value, "custype");
            return (Criteria) this;
        }

        public Criteria andCustypeNotEqualTo(Integer value) {
            addCriterion("CusType <>", value, "custype");
            return (Criteria) this;
        }

        public Criteria andCustypeGreaterThan(Integer value) {
            addCriterion("CusType >", value, "custype");
            return (Criteria) this;
        }

        public Criteria andCustypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CusType >=", value, "custype");
            return (Criteria) this;
        }

        public Criteria andCustypeLessThan(Integer value) {
            addCriterion("CusType <", value, "custype");
            return (Criteria) this;
        }

        public Criteria andCustypeLessThanOrEqualTo(Integer value) {
            addCriterion("CusType <=", value, "custype");
            return (Criteria) this;
        }

        public Criteria andCustypeIn(List<Integer> values) {
            addCriterion("CusType in", values, "custype");
            return (Criteria) this;
        }

        public Criteria andCustypeNotIn(List<Integer> values) {
            addCriterion("CusType not in", values, "custype");
            return (Criteria) this;
        }

        public Criteria andCustypeBetween(Integer value1, Integer value2) {
            addCriterion("CusType between", value1, value2, "custype");
            return (Criteria) this;
        }

        public Criteria andCustypeNotBetween(Integer value1, Integer value2) {
            addCriterion("CusType not between", value1, value2, "custype");
            return (Criteria) this;
        }

        public Criteria andDepartureidIsNull() {
            addCriterion("DepartureID is null");
            return (Criteria) this;
        }

        public Criteria andDepartureidIsNotNull() {
            addCriterion("DepartureID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartureidEqualTo(String value) {
            addCriterion("DepartureID =", value, "departureid");
            return (Criteria) this;
        }

        public Criteria andDepartureidNotEqualTo(String value) {
            addCriterion("DepartureID <>", value, "departureid");
            return (Criteria) this;
        }

        public Criteria andDepartureidGreaterThan(String value) {
            addCriterion("DepartureID >", value, "departureid");
            return (Criteria) this;
        }

        public Criteria andDepartureidGreaterThanOrEqualTo(String value) {
            addCriterion("DepartureID >=", value, "departureid");
            return (Criteria) this;
        }

        public Criteria andDepartureidLessThan(String value) {
            addCriterion("DepartureID <", value, "departureid");
            return (Criteria) this;
        }

        public Criteria andDepartureidLessThanOrEqualTo(String value) {
            addCriterion("DepartureID <=", value, "departureid");
            return (Criteria) this;
        }

        public Criteria andDepartureidLike(String value) {
            addCriterion("DepartureID like", value, "departureid");
            return (Criteria) this;
        }

        public Criteria andDepartureidNotLike(String value) {
            addCriterion("DepartureID not like", value, "departureid");
            return (Criteria) this;
        }

        public Criteria andDepartureidIn(List<String> values) {
            addCriterion("DepartureID in", values, "departureid");
            return (Criteria) this;
        }

        public Criteria andDepartureidNotIn(List<String> values) {
            addCriterion("DepartureID not in", values, "departureid");
            return (Criteria) this;
        }

        public Criteria andDepartureidBetween(String value1, String value2) {
            addCriterion("DepartureID between", value1, value2, "departureid");
            return (Criteria) this;
        }

        public Criteria andDepartureidNotBetween(String value1, String value2) {
            addCriterion("DepartureID not between", value1, value2, "departureid");
            return (Criteria) this;
        }

        public Criteria andDepartureIsNull() {
            addCriterion("Departure is null");
            return (Criteria) this;
        }

        public Criteria andDepartureIsNotNull() {
            addCriterion("Departure is not null");
            return (Criteria) this;
        }

        public Criteria andDepartureEqualTo(String value) {
            addCriterion("Departure =", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureNotEqualTo(String value) {
            addCriterion("Departure <>", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureGreaterThan(String value) {
            addCriterion("Departure >", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureGreaterThanOrEqualTo(String value) {
            addCriterion("Departure >=", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureLessThan(String value) {
            addCriterion("Departure <", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureLessThanOrEqualTo(String value) {
            addCriterion("Departure <=", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureLike(String value) {
            addCriterion("Departure like", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureNotLike(String value) {
            addCriterion("Departure not like", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureIn(List<String> values) {
            addCriterion("Departure in", values, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureNotIn(List<String> values) {
            addCriterion("Departure not in", values, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureBetween(String value1, String value2) {
            addCriterion("Departure between", value1, value2, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureNotBetween(String value1, String value2) {
            addCriterion("Departure not between", value1, value2, "departure");
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

        public Criteria andStartdateIsNull() {
            addCriterion("StartDate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("StartDate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterion("StartDate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterion("StartDate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterion("StartDate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("StartDate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterion("StartDate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterion("StartDate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterion("StartDate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterion("StartDate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterion("StartDate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterion("StartDate not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("EndDate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("EndDate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterion("EndDate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterion("EndDate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterion("EndDate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("EndDate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterion("EndDate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterion("EndDate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterion("EndDate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterion("EndDate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterion("EndDate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterion("EndDate not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andAdultnumIsNull() {
            addCriterion("AdultNum is null");
            return (Criteria) this;
        }

        public Criteria andAdultnumIsNotNull() {
            addCriterion("AdultNum is not null");
            return (Criteria) this;
        }

        public Criteria andAdultnumEqualTo(Integer value) {
            addCriterion("AdultNum =", value, "adultnum");
            return (Criteria) this;
        }

        public Criteria andAdultnumNotEqualTo(Integer value) {
            addCriterion("AdultNum <>", value, "adultnum");
            return (Criteria) this;
        }

        public Criteria andAdultnumGreaterThan(Integer value) {
            addCriterion("AdultNum >", value, "adultnum");
            return (Criteria) this;
        }

        public Criteria andAdultnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("AdultNum >=", value, "adultnum");
            return (Criteria) this;
        }

        public Criteria andAdultnumLessThan(Integer value) {
            addCriterion("AdultNum <", value, "adultnum");
            return (Criteria) this;
        }

        public Criteria andAdultnumLessThanOrEqualTo(Integer value) {
            addCriterion("AdultNum <=", value, "adultnum");
            return (Criteria) this;
        }

        public Criteria andAdultnumIn(List<Integer> values) {
            addCriterion("AdultNum in", values, "adultnum");
            return (Criteria) this;
        }

        public Criteria andAdultnumNotIn(List<Integer> values) {
            addCriterion("AdultNum not in", values, "adultnum");
            return (Criteria) this;
        }

        public Criteria andAdultnumBetween(Integer value1, Integer value2) {
            addCriterion("AdultNum between", value1, value2, "adultnum");
            return (Criteria) this;
        }

        public Criteria andAdultnumNotBetween(Integer value1, Integer value2) {
            addCriterion("AdultNum not between", value1, value2, "adultnum");
            return (Criteria) this;
        }

        public Criteria andChildnumIsNull() {
            addCriterion("ChildNum is null");
            return (Criteria) this;
        }

        public Criteria andChildnumIsNotNull() {
            addCriterion("ChildNum is not null");
            return (Criteria) this;
        }

        public Criteria andChildnumEqualTo(Integer value) {
            addCriterion("ChildNum =", value, "childnum");
            return (Criteria) this;
        }

        public Criteria andChildnumNotEqualTo(Integer value) {
            addCriterion("ChildNum <>", value, "childnum");
            return (Criteria) this;
        }

        public Criteria andChildnumGreaterThan(Integer value) {
            addCriterion("ChildNum >", value, "childnum");
            return (Criteria) this;
        }

        public Criteria andChildnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ChildNum >=", value, "childnum");
            return (Criteria) this;
        }

        public Criteria andChildnumLessThan(Integer value) {
            addCriterion("ChildNum <", value, "childnum");
            return (Criteria) this;
        }

        public Criteria andChildnumLessThanOrEqualTo(Integer value) {
            addCriterion("ChildNum <=", value, "childnum");
            return (Criteria) this;
        }

        public Criteria andChildnumIn(List<Integer> values) {
            addCriterion("ChildNum in", values, "childnum");
            return (Criteria) this;
        }

        public Criteria andChildnumNotIn(List<Integer> values) {
            addCriterion("ChildNum not in", values, "childnum");
            return (Criteria) this;
        }

        public Criteria andChildnumBetween(Integer value1, Integer value2) {
            addCriterion("ChildNum between", value1, value2, "childnum");
            return (Criteria) this;
        }

        public Criteria andChildnumNotBetween(Integer value1, Integer value2) {
            addCriterion("ChildNum not between", value1, value2, "childnum");
            return (Criteria) this;
        }

        public Criteria andBudgetIsNull() {
            addCriterion("Budget is null");
            return (Criteria) this;
        }

        public Criteria andBudgetIsNotNull() {
            addCriterion("Budget is not null");
            return (Criteria) this;
        }

        public Criteria andBudgetEqualTo(Integer value) {
            addCriterion("Budget =", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetNotEqualTo(Integer value) {
            addCriterion("Budget <>", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetGreaterThan(Integer value) {
            addCriterion("Budget >", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetGreaterThanOrEqualTo(Integer value) {
            addCriterion("Budget >=", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetLessThan(Integer value) {
            addCriterion("Budget <", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetLessThanOrEqualTo(Integer value) {
            addCriterion("Budget <=", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetIn(List<Integer> values) {
            addCriterion("Budget in", values, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetNotIn(List<Integer> values) {
            addCriterion("Budget not in", values, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetBetween(Integer value1, Integer value2) {
            addCriterion("Budget between", value1, value2, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetNotBetween(Integer value1, Integer value2) {
            addCriterion("Budget not between", value1, value2, "budget");
            return (Criteria) this;
        }

        public Criteria andCustomernumIsNull() {
            addCriterion("CustomerNum is null");
            return (Criteria) this;
        }

        public Criteria andCustomernumIsNotNull() {
            addCriterion("CustomerNum is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernumEqualTo(Integer value) {
            addCriterion("CustomerNum =", value, "customernum");
            return (Criteria) this;
        }

        public Criteria andCustomernumNotEqualTo(Integer value) {
            addCriterion("CustomerNum <>", value, "customernum");
            return (Criteria) this;
        }

        public Criteria andCustomernumGreaterThan(Integer value) {
            addCriterion("CustomerNum >", value, "customernum");
            return (Criteria) this;
        }

        public Criteria andCustomernumGreaterThanOrEqualTo(Integer value) {
            addCriterion("CustomerNum >=", value, "customernum");
            return (Criteria) this;
        }

        public Criteria andCustomernumLessThan(Integer value) {
            addCriterion("CustomerNum <", value, "customernum");
            return (Criteria) this;
        }

        public Criteria andCustomernumLessThanOrEqualTo(Integer value) {
            addCriterion("CustomerNum <=", value, "customernum");
            return (Criteria) this;
        }

        public Criteria andCustomernumIn(List<Integer> values) {
            addCriterion("CustomerNum in", values, "customernum");
            return (Criteria) this;
        }

        public Criteria andCustomernumNotIn(List<Integer> values) {
            addCriterion("CustomerNum not in", values, "customernum");
            return (Criteria) this;
        }

        public Criteria andCustomernumBetween(Integer value1, Integer value2) {
            addCriterion("CustomerNum between", value1, value2, "customernum");
            return (Criteria) this;
        }

        public Criteria andCustomernumNotBetween(Integer value1, Integer value2) {
            addCriterion("CustomerNum not between", value1, value2, "customernum");
            return (Criteria) this;
        }

        public Criteria andOtherrequireIsNull() {
            addCriterion("OtherRequire is null");
            return (Criteria) this;
        }

        public Criteria andOtherrequireIsNotNull() {
            addCriterion("OtherRequire is not null");
            return (Criteria) this;
        }

        public Criteria andOtherrequireEqualTo(String value) {
            addCriterion("OtherRequire =", value, "otherrequire");
            return (Criteria) this;
        }

        public Criteria andOtherrequireNotEqualTo(String value) {
            addCriterion("OtherRequire <>", value, "otherrequire");
            return (Criteria) this;
        }

        public Criteria andOtherrequireGreaterThan(String value) {
            addCriterion("OtherRequire >", value, "otherrequire");
            return (Criteria) this;
        }

        public Criteria andOtherrequireGreaterThanOrEqualTo(String value) {
            addCriterion("OtherRequire >=", value, "otherrequire");
            return (Criteria) this;
        }

        public Criteria andOtherrequireLessThan(String value) {
            addCriterion("OtherRequire <", value, "otherrequire");
            return (Criteria) this;
        }

        public Criteria andOtherrequireLessThanOrEqualTo(String value) {
            addCriterion("OtherRequire <=", value, "otherrequire");
            return (Criteria) this;
        }

        public Criteria andOtherrequireLike(String value) {
            addCriterion("OtherRequire like", value, "otherrequire");
            return (Criteria) this;
        }

        public Criteria andOtherrequireNotLike(String value) {
            addCriterion("OtherRequire not like", value, "otherrequire");
            return (Criteria) this;
        }

        public Criteria andOtherrequireIn(List<String> values) {
            addCriterion("OtherRequire in", values, "otherrequire");
            return (Criteria) this;
        }

        public Criteria andOtherrequireNotIn(List<String> values) {
            addCriterion("OtherRequire not in", values, "otherrequire");
            return (Criteria) this;
        }

        public Criteria andOtherrequireBetween(String value1, String value2) {
            addCriterion("OtherRequire between", value1, value2, "otherrequire");
            return (Criteria) this;
        }

        public Criteria andOtherrequireNotBetween(String value1, String value2) {
            addCriterion("OtherRequire not between", value1, value2, "otherrequire");
            return (Criteria) this;
        }

        public Criteria andTravellernameIsNull() {
            addCriterion("TravellerName is null");
            return (Criteria) this;
        }

        public Criteria andTravellernameIsNotNull() {
            addCriterion("TravellerName is not null");
            return (Criteria) this;
        }

        public Criteria andTravellernameEqualTo(String value) {
            addCriterion("TravellerName =", value, "travellername");
            return (Criteria) this;
        }

        public Criteria andTravellernameNotEqualTo(String value) {
            addCriterion("TravellerName <>", value, "travellername");
            return (Criteria) this;
        }

        public Criteria andTravellernameGreaterThan(String value) {
            addCriterion("TravellerName >", value, "travellername");
            return (Criteria) this;
        }

        public Criteria andTravellernameGreaterThanOrEqualTo(String value) {
            addCriterion("TravellerName >=", value, "travellername");
            return (Criteria) this;
        }

        public Criteria andTravellernameLessThan(String value) {
            addCriterion("TravellerName <", value, "travellername");
            return (Criteria) this;
        }

        public Criteria andTravellernameLessThanOrEqualTo(String value) {
            addCriterion("TravellerName <=", value, "travellername");
            return (Criteria) this;
        }

        public Criteria andTravellernameLike(String value) {
            addCriterion("TravellerName like", value, "travellername");
            return (Criteria) this;
        }

        public Criteria andTravellernameNotLike(String value) {
            addCriterion("TravellerName not like", value, "travellername");
            return (Criteria) this;
        }

        public Criteria andTravellernameIn(List<String> values) {
            addCriterion("TravellerName in", values, "travellername");
            return (Criteria) this;
        }

        public Criteria andTravellernameNotIn(List<String> values) {
            addCriterion("TravellerName not in", values, "travellername");
            return (Criteria) this;
        }

        public Criteria andTravellernameBetween(String value1, String value2) {
            addCriterion("TravellerName between", value1, value2, "travellername");
            return (Criteria) this;
        }

        public Criteria andTravellernameNotBetween(String value1, String value2) {
            addCriterion("TravellerName not between", value1, value2, "travellername");
            return (Criteria) this;
        }

        public Criteria andWechatIsNull() {
            addCriterion("Wechat is null");
            return (Criteria) this;
        }

        public Criteria andWechatIsNotNull() {
            addCriterion("Wechat is not null");
            return (Criteria) this;
        }

        public Criteria andWechatEqualTo(String value) {
            addCriterion("Wechat =", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotEqualTo(String value) {
            addCriterion("Wechat <>", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThan(String value) {
            addCriterion("Wechat >", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThanOrEqualTo(String value) {
            addCriterion("Wechat >=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThan(String value) {
            addCriterion("Wechat <", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThanOrEqualTo(String value) {
            addCriterion("Wechat <=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLike(String value) {
            addCriterion("Wechat like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotLike(String value) {
            addCriterion("Wechat not like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatIn(List<String> values) {
            addCriterion("Wechat in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotIn(List<String> values) {
            addCriterion("Wechat not in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatBetween(String value1, String value2) {
            addCriterion("Wechat between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotBetween(String value1, String value2) {
            addCriterion("Wechat not between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("Mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("Mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("Mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("Mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("Mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("Mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("Mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("Mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("Mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("Mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("Mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("Mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("Mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("Mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("Email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("Email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("Email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("Email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("Email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("Email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("Email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("Email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("Email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("Email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("Email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("Email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("Email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("Email not between", value1, value2, "email");
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

        public Criteria andSiteidIsNull() {
            addCriterion("SiteID is null");
            return (Criteria) this;
        }

        public Criteria andSiteidIsNotNull() {
            addCriterion("SiteID is not null");
            return (Criteria) this;
        }

        public Criteria andSiteidEqualTo(String value) {
            addCriterion("SiteID =", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidNotEqualTo(String value) {
            addCriterion("SiteID <>", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidGreaterThan(String value) {
            addCriterion("SiteID >", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidGreaterThanOrEqualTo(String value) {
            addCriterion("SiteID >=", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidLessThan(String value) {
            addCriterion("SiteID <", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidLessThanOrEqualTo(String value) {
            addCriterion("SiteID <=", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidLike(String value) {
            addCriterion("SiteID like", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidNotLike(String value) {
            addCriterion("SiteID not like", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidIn(List<String> values) {
            addCriterion("SiteID in", values, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidNotIn(List<String> values) {
            addCriterion("SiteID not in", values, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidBetween(String value1, String value2) {
            addCriterion("SiteID between", value1, value2, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidNotBetween(String value1, String value2) {
            addCriterion("SiteID not between", value1, value2, "siteid");
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

        public Criteria andRevisedbyIsNull() {
            addCriterion("RevisedBy is null");
            return (Criteria) this;
        }

        public Criteria andRevisedbyIsNotNull() {
            addCriterion("RevisedBy is not null");
            return (Criteria) this;
        }

        public Criteria andRevisedbyEqualTo(String value) {
            addCriterion("RevisedBy =", value, "revisedby");
            return (Criteria) this;
        }

        public Criteria andRevisedbyNotEqualTo(String value) {
            addCriterion("RevisedBy <>", value, "revisedby");
            return (Criteria) this;
        }

        public Criteria andRevisedbyGreaterThan(String value) {
            addCriterion("RevisedBy >", value, "revisedby");
            return (Criteria) this;
        }

        public Criteria andRevisedbyGreaterThanOrEqualTo(String value) {
            addCriterion("RevisedBy >=", value, "revisedby");
            return (Criteria) this;
        }

        public Criteria andRevisedbyLessThan(String value) {
            addCriterion("RevisedBy <", value, "revisedby");
            return (Criteria) this;
        }

        public Criteria andRevisedbyLessThanOrEqualTo(String value) {
            addCriterion("RevisedBy <=", value, "revisedby");
            return (Criteria) this;
        }

        public Criteria andRevisedbyLike(String value) {
            addCriterion("RevisedBy like", value, "revisedby");
            return (Criteria) this;
        }

        public Criteria andRevisedbyNotLike(String value) {
            addCriterion("RevisedBy not like", value, "revisedby");
            return (Criteria) this;
        }

        public Criteria andRevisedbyIn(List<String> values) {
            addCriterion("RevisedBy in", values, "revisedby");
            return (Criteria) this;
        }

        public Criteria andRevisedbyNotIn(List<String> values) {
            addCriterion("RevisedBy not in", values, "revisedby");
            return (Criteria) this;
        }

        public Criteria andRevisedbyBetween(String value1, String value2) {
            addCriterion("RevisedBy between", value1, value2, "revisedby");
            return (Criteria) this;
        }

        public Criteria andRevisedbyNotBetween(String value1, String value2) {
            addCriterion("RevisedBy not between", value1, value2, "revisedby");
            return (Criteria) this;
        }

        public Criteria andCusinfonoIsNull() {
            addCriterion("CusInfoNo is null");
            return (Criteria) this;
        }

        public Criteria andCusinfonoIsNotNull() {
            addCriterion("CusInfoNo is not null");
            return (Criteria) this;
        }

        public Criteria andCusinfonoEqualTo(String value) {
            addCriterion("CusInfoNo =", value, "cusinfono");
            return (Criteria) this;
        }

        public Criteria andCusinfonoNotEqualTo(String value) {
            addCriterion("CusInfoNo <>", value, "cusinfono");
            return (Criteria) this;
        }

        public Criteria andCusinfonoGreaterThan(String value) {
            addCriterion("CusInfoNo >", value, "cusinfono");
            return (Criteria) this;
        }

        public Criteria andCusinfonoGreaterThanOrEqualTo(String value) {
            addCriterion("CusInfoNo >=", value, "cusinfono");
            return (Criteria) this;
        }

        public Criteria andCusinfonoLessThan(String value) {
            addCriterion("CusInfoNo <", value, "cusinfono");
            return (Criteria) this;
        }

        public Criteria andCusinfonoLessThanOrEqualTo(String value) {
            addCriterion("CusInfoNo <=", value, "cusinfono");
            return (Criteria) this;
        }

        public Criteria andCusinfonoLike(String value) {
            addCriterion("CusInfoNo like", value, "cusinfono");
            return (Criteria) this;
        }

        public Criteria andCusinfonoNotLike(String value) {
            addCriterion("CusInfoNo not like", value, "cusinfono");
            return (Criteria) this;
        }

        public Criteria andCusinfonoIn(List<String> values) {
            addCriterion("CusInfoNo in", values, "cusinfono");
            return (Criteria) this;
        }

        public Criteria andCusinfonoNotIn(List<String> values) {
            addCriterion("CusInfoNo not in", values, "cusinfono");
            return (Criteria) this;
        }

        public Criteria andCusinfonoBetween(String value1, String value2) {
            addCriterion("CusInfoNo between", value1, value2, "cusinfono");
            return (Criteria) this;
        }

        public Criteria andCusinfonoNotBetween(String value1, String value2) {
            addCriterion("CusInfoNo not between", value1, value2, "cusinfono");
            return (Criteria) this;
        }

        public Criteria andDestinationidIsNull() {
            addCriterion("DestinationID is null");
            return (Criteria) this;
        }

        public Criteria andDestinationidIsNotNull() {
            addCriterion("DestinationID is not null");
            return (Criteria) this;
        }

        public Criteria andDestinationidEqualTo(String value) {
            addCriterion("DestinationID =", value, "destinationid");
            return (Criteria) this;
        }

        public Criteria andDestinationidNotEqualTo(String value) {
            addCriterion("DestinationID <>", value, "destinationid");
            return (Criteria) this;
        }

        public Criteria andDestinationidGreaterThan(String value) {
            addCriterion("DestinationID >", value, "destinationid");
            return (Criteria) this;
        }

        public Criteria andDestinationidGreaterThanOrEqualTo(String value) {
            addCriterion("DestinationID >=", value, "destinationid");
            return (Criteria) this;
        }

        public Criteria andDestinationidLessThan(String value) {
            addCriterion("DestinationID <", value, "destinationid");
            return (Criteria) this;
        }

        public Criteria andDestinationidLessThanOrEqualTo(String value) {
            addCriterion("DestinationID <=", value, "destinationid");
            return (Criteria) this;
        }

        public Criteria andDestinationidLike(String value) {
            addCriterion("DestinationID like", value, "destinationid");
            return (Criteria) this;
        }

        public Criteria andDestinationidNotLike(String value) {
            addCriterion("DestinationID not like", value, "destinationid");
            return (Criteria) this;
        }

        public Criteria andDestinationidIn(List<String> values) {
            addCriterion("DestinationID in", values, "destinationid");
            return (Criteria) this;
        }

        public Criteria andDestinationidNotIn(List<String> values) {
            addCriterion("DestinationID not in", values, "destinationid");
            return (Criteria) this;
        }

        public Criteria andDestinationidBetween(String value1, String value2) {
            addCriterion("DestinationID between", value1, value2, "destinationid");
            return (Criteria) this;
        }

        public Criteria andDestinationidNotBetween(String value1, String value2) {
            addCriterion("DestinationID not between", value1, value2, "destinationid");
            return (Criteria) this;
        }

        public Criteria andPushtimesIsNull() {
            addCriterion("PushTimes is null");
            return (Criteria) this;
        }

        public Criteria andPushtimesIsNotNull() {
            addCriterion("PushTimes is not null");
            return (Criteria) this;
        }

        public Criteria andPushtimesEqualTo(Integer value) {
            addCriterion("PushTimes =", value, "pushtimes");
            return (Criteria) this;
        }

        public Criteria andPushtimesNotEqualTo(Integer value) {
            addCriterion("PushTimes <>", value, "pushtimes");
            return (Criteria) this;
        }

        public Criteria andPushtimesGreaterThan(Integer value) {
            addCriterion("PushTimes >", value, "pushtimes");
            return (Criteria) this;
        }

        public Criteria andPushtimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("PushTimes >=", value, "pushtimes");
            return (Criteria) this;
        }

        public Criteria andPushtimesLessThan(Integer value) {
            addCriterion("PushTimes <", value, "pushtimes");
            return (Criteria) this;
        }

        public Criteria andPushtimesLessThanOrEqualTo(Integer value) {
            addCriterion("PushTimes <=", value, "pushtimes");
            return (Criteria) this;
        }

        public Criteria andPushtimesIn(List<Integer> values) {
            addCriterion("PushTimes in", values, "pushtimes");
            return (Criteria) this;
        }

        public Criteria andPushtimesNotIn(List<Integer> values) {
            addCriterion("PushTimes not in", values, "pushtimes");
            return (Criteria) this;
        }

        public Criteria andPushtimesBetween(Integer value1, Integer value2) {
            addCriterion("PushTimes between", value1, value2, "pushtimes");
            return (Criteria) this;
        }

        public Criteria andPushtimesNotBetween(Integer value1, Integer value2) {
            addCriterion("PushTimes not between", value1, value2, "pushtimes");
            return (Criteria) this;
        }

        public Criteria andLastpushdateIsNull() {
            addCriterion("LastPushDate is null");
            return (Criteria) this;
        }

        public Criteria andLastpushdateIsNotNull() {
            addCriterion("LastPushDate is not null");
            return (Criteria) this;
        }

        public Criteria andLastpushdateEqualTo(Date value) {
            addCriterion("LastPushDate =", value, "lastpushdate");
            return (Criteria) this;
        }

        public Criteria andLastpushdateNotEqualTo(Date value) {
            addCriterion("LastPushDate <>", value, "lastpushdate");
            return (Criteria) this;
        }

        public Criteria andLastpushdateGreaterThan(Date value) {
            addCriterion("LastPushDate >", value, "lastpushdate");
            return (Criteria) this;
        }

        public Criteria andLastpushdateGreaterThanOrEqualTo(Date value) {
            addCriterion("LastPushDate >=", value, "lastpushdate");
            return (Criteria) this;
        }

        public Criteria andLastpushdateLessThan(Date value) {
            addCriterion("LastPushDate <", value, "lastpushdate");
            return (Criteria) this;
        }

        public Criteria andLastpushdateLessThanOrEqualTo(Date value) {
            addCriterion("LastPushDate <=", value, "lastpushdate");
            return (Criteria) this;
        }

        public Criteria andLastpushdateIn(List<Date> values) {
            addCriterion("LastPushDate in", values, "lastpushdate");
            return (Criteria) this;
        }

        public Criteria andLastpushdateNotIn(List<Date> values) {
            addCriterion("LastPushDate not in", values, "lastpushdate");
            return (Criteria) this;
        }

        public Criteria andLastpushdateBetween(Date value1, Date value2) {
            addCriterion("LastPushDate between", value1, value2, "lastpushdate");
            return (Criteria) this;
        }

        public Criteria andLastpushdateNotBetween(Date value1, Date value2) {
            addCriterion("LastPushDate not between", value1, value2, "lastpushdate");
            return (Criteria) this;
        }

        public Criteria andTagIsNull() {
            addCriterion("Tag is null");
            return (Criteria) this;
        }

        public Criteria andTagIsNotNull() {
            addCriterion("Tag is not null");
            return (Criteria) this;
        }

        public Criteria andTagEqualTo(String value) {
            addCriterion("Tag =", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotEqualTo(String value) {
            addCriterion("Tag <>", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThan(String value) {
            addCriterion("Tag >", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanOrEqualTo(String value) {
            addCriterion("Tag >=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThan(String value) {
            addCriterion("Tag <", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThanOrEqualTo(String value) {
            addCriterion("Tag <=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLike(String value) {
            addCriterion("Tag like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotLike(String value) {
            addCriterion("Tag not like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagIn(List<String> values) {
            addCriterion("Tag in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotIn(List<String> values) {
            addCriterion("Tag not in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagBetween(String value1, String value2) {
            addCriterion("Tag between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotBetween(String value1, String value2) {
            addCriterion("Tag not between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("Source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("Source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(Integer value) {
            addCriterion("Source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(Integer value) {
            addCriterion("Source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(Integer value) {
            addCriterion("Source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("Source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(Integer value) {
            addCriterion("Source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(Integer value) {
            addCriterion("Source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<Integer> values) {
            addCriterion("Source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<Integer> values) {
            addCriterion("Source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(Integer value1, Integer value2) {
            addCriterion("Source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("Source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andServicetypeIsNull() {
            addCriterion("ServiceType is null");
            return (Criteria) this;
        }

        public Criteria andServicetypeIsNotNull() {
            addCriterion("ServiceType is not null");
            return (Criteria) this;
        }

        public Criteria andServicetypeEqualTo(String value) {
            addCriterion("ServiceType =", value, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeNotEqualTo(String value) {
            addCriterion("ServiceType <>", value, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeGreaterThan(String value) {
            addCriterion("ServiceType >", value, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeGreaterThanOrEqualTo(String value) {
            addCriterion("ServiceType >=", value, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeLessThan(String value) {
            addCriterion("ServiceType <", value, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeLessThanOrEqualTo(String value) {
            addCriterion("ServiceType <=", value, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeLike(String value) {
            addCriterion("ServiceType like", value, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeNotLike(String value) {
            addCriterion("ServiceType not like", value, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeIn(List<String> values) {
            addCriterion("ServiceType in", values, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeNotIn(List<String> values) {
            addCriterion("ServiceType not in", values, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeBetween(String value1, String value2) {
            addCriterion("ServiceType between", value1, value2, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeNotBetween(String value1, String value2) {
            addCriterion("ServiceType not between", value1, value2, "servicetype");
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