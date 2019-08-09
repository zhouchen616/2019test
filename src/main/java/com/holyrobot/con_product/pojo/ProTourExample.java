package com.holyrobot.con_product.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProTourExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProTourExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andTournoIsNull() {
            addCriterion("TourNo is null");
            return (Criteria) this;
        }

        public Criteria andTournoIsNotNull() {
            addCriterion("TourNo is not null");
            return (Criteria) this;
        }

        public Criteria andTournoEqualTo(String value) {
            addCriterion("TourNo =", value, "tourno");
            return (Criteria) this;
        }

        public Criteria andTournoNotEqualTo(String value) {
            addCriterion("TourNo <>", value, "tourno");
            return (Criteria) this;
        }

        public Criteria andTournoGreaterThan(String value) {
            addCriterion("TourNo >", value, "tourno");
            return (Criteria) this;
        }

        public Criteria andTournoGreaterThanOrEqualTo(String value) {
            addCriterion("TourNo >=", value, "tourno");
            return (Criteria) this;
        }

        public Criteria andTournoLessThan(String value) {
            addCriterion("TourNo <", value, "tourno");
            return (Criteria) this;
        }

        public Criteria andTournoLessThanOrEqualTo(String value) {
            addCriterion("TourNo <=", value, "tourno");
            return (Criteria) this;
        }

        public Criteria andTournoLike(String value) {
            addCriterion("TourNo like", value, "tourno");
            return (Criteria) this;
        }

        public Criteria andTournoNotLike(String value) {
            addCriterion("TourNo not like", value, "tourno");
            return (Criteria) this;
        }

        public Criteria andTournoIn(List<String> values) {
            addCriterion("TourNo in", values, "tourno");
            return (Criteria) this;
        }

        public Criteria andTournoNotIn(List<String> values) {
            addCriterion("TourNo not in", values, "tourno");
            return (Criteria) this;
        }

        public Criteria andTournoBetween(String value1, String value2) {
            addCriterion("TourNo between", value1, value2, "tourno");
            return (Criteria) this;
        }

        public Criteria andTournoNotBetween(String value1, String value2) {
            addCriterion("TourNo not between", value1, value2, "tourno");
            return (Criteria) this;
        }

        public Criteria andTournameIsNull() {
            addCriterion("TourName is null");
            return (Criteria) this;
        }

        public Criteria andTournameIsNotNull() {
            addCriterion("TourName is not null");
            return (Criteria) this;
        }

        public Criteria andTournameEqualTo(String value) {
            addCriterion("TourName =", value, "tourname");
            return (Criteria) this;
        }

        public Criteria andTournameNotEqualTo(String value) {
            addCriterion("TourName <>", value, "tourname");
            return (Criteria) this;
        }

        public Criteria andTournameGreaterThan(String value) {
            addCriterion("TourName >", value, "tourname");
            return (Criteria) this;
        }

        public Criteria andTournameGreaterThanOrEqualTo(String value) {
            addCriterion("TourName >=", value, "tourname");
            return (Criteria) this;
        }

        public Criteria andTournameLessThan(String value) {
            addCriterion("TourName <", value, "tourname");
            return (Criteria) this;
        }

        public Criteria andTournameLessThanOrEqualTo(String value) {
            addCriterion("TourName <=", value, "tourname");
            return (Criteria) this;
        }

        public Criteria andTournameLike(String value) {
            addCriterion("TourName like", value, "tourname");
            return (Criteria) this;
        }

        public Criteria andTournameNotLike(String value) {
            addCriterion("TourName not like", value, "tourname");
            return (Criteria) this;
        }

        public Criteria andTournameIn(List<String> values) {
            addCriterion("TourName in", values, "tourname");
            return (Criteria) this;
        }

        public Criteria andTournameNotIn(List<String> values) {
            addCriterion("TourName not in", values, "tourname");
            return (Criteria) this;
        }

        public Criteria andTournameBetween(String value1, String value2) {
            addCriterion("TourName between", value1, value2, "tourname");
            return (Criteria) this;
        }

        public Criteria andTournameNotBetween(String value1, String value2) {
            addCriterion("TourName not between", value1, value2, "tourname");
            return (Criteria) this;
        }

        public Criteria andTourdateIsNull() {
            addCriterion("TourDate is null");
            return (Criteria) this;
        }

        public Criteria andTourdateIsNotNull() {
            addCriterion("TourDate is not null");
            return (Criteria) this;
        }

        public Criteria andTourdateEqualTo(Date value) {
            addCriterionForJDBCDate("TourDate =", value, "tourdate");
            return (Criteria) this;
        }

        public Criteria andTourdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("TourDate <>", value, "tourdate");
            return (Criteria) this;
        }

        public Criteria andTourdateGreaterThan(Date value) {
            addCriterionForJDBCDate("TourDate >", value, "tourdate");
            return (Criteria) this;
        }

        public Criteria andTourdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TourDate >=", value, "tourdate");
            return (Criteria) this;
        }

        public Criteria andTourdateLessThan(Date value) {
            addCriterionForJDBCDate("TourDate <", value, "tourdate");
            return (Criteria) this;
        }

        public Criteria andTourdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TourDate <=", value, "tourdate");
            return (Criteria) this;
        }

        public Criteria andTourdateIn(List<Date> values) {
            addCriterionForJDBCDate("TourDate in", values, "tourdate");
            return (Criteria) this;
        }

        public Criteria andTourdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("TourDate not in", values, "tourdate");
            return (Criteria) this;
        }

        public Criteria andTourdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TourDate between", value1, value2, "tourdate");
            return (Criteria) this;
        }

        public Criteria andTourdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TourDate not between", value1, value2, "tourdate");
            return (Criteria) this;
        }

        public Criteria andDuedateIsNull() {
            addCriterion("DueDate is null");
            return (Criteria) this;
        }

        public Criteria andDuedateIsNotNull() {
            addCriterion("DueDate is not null");
            return (Criteria) this;
        }

        public Criteria andDuedateEqualTo(Date value) {
            addCriterionForJDBCDate("DueDate =", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("DueDate <>", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateGreaterThan(Date value) {
            addCriterionForJDBCDate("DueDate >", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DueDate >=", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateLessThan(Date value) {
            addCriterionForJDBCDate("DueDate <", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DueDate <=", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateIn(List<Date> values) {
            addCriterionForJDBCDate("DueDate in", values, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("DueDate not in", values, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DueDate between", value1, value2, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DueDate not between", value1, value2, "duedate");
            return (Criteria) this;
        }

        public Criteria andPlannumIsNull() {
            addCriterion("PlanNum is null");
            return (Criteria) this;
        }

        public Criteria andPlannumIsNotNull() {
            addCriterion("PlanNum is not null");
            return (Criteria) this;
        }

        public Criteria andPlannumEqualTo(Integer value) {
            addCriterion("PlanNum =", value, "plannum");
            return (Criteria) this;
        }

        public Criteria andPlannumNotEqualTo(Integer value) {
            addCriterion("PlanNum <>", value, "plannum");
            return (Criteria) this;
        }

        public Criteria andPlannumGreaterThan(Integer value) {
            addCriterion("PlanNum >", value, "plannum");
            return (Criteria) this;
        }

        public Criteria andPlannumGreaterThanOrEqualTo(Integer value) {
            addCriterion("PlanNum >=", value, "plannum");
            return (Criteria) this;
        }

        public Criteria andPlannumLessThan(Integer value) {
            addCriterion("PlanNum <", value, "plannum");
            return (Criteria) this;
        }

        public Criteria andPlannumLessThanOrEqualTo(Integer value) {
            addCriterion("PlanNum <=", value, "plannum");
            return (Criteria) this;
        }

        public Criteria andPlannumIn(List<Integer> values) {
            addCriterion("PlanNum in", values, "plannum");
            return (Criteria) this;
        }

        public Criteria andPlannumNotIn(List<Integer> values) {
            addCriterion("PlanNum not in", values, "plannum");
            return (Criteria) this;
        }

        public Criteria andPlannumBetween(Integer value1, Integer value2) {
            addCriterion("PlanNum between", value1, value2, "plannum");
            return (Criteria) this;
        }

        public Criteria andPlannumNotBetween(Integer value1, Integer value2) {
            addCriterion("PlanNum not between", value1, value2, "plannum");
            return (Criteria) this;
        }

        public Criteria andMinnumIsNull() {
            addCriterion("MinNum is null");
            return (Criteria) this;
        }

        public Criteria andMinnumIsNotNull() {
            addCriterion("MinNum is not null");
            return (Criteria) this;
        }

        public Criteria andMinnumEqualTo(Integer value) {
            addCriterion("MinNum =", value, "minnum");
            return (Criteria) this;
        }

        public Criteria andMinnumNotEqualTo(Integer value) {
            addCriterion("MinNum <>", value, "minnum");
            return (Criteria) this;
        }

        public Criteria andMinnumGreaterThan(Integer value) {
            addCriterion("MinNum >", value, "minnum");
            return (Criteria) this;
        }

        public Criteria andMinnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("MinNum >=", value, "minnum");
            return (Criteria) this;
        }

        public Criteria andMinnumLessThan(Integer value) {
            addCriterion("MinNum <", value, "minnum");
            return (Criteria) this;
        }

        public Criteria andMinnumLessThanOrEqualTo(Integer value) {
            addCriterion("MinNum <=", value, "minnum");
            return (Criteria) this;
        }

        public Criteria andMinnumIn(List<Integer> values) {
            addCriterion("MinNum in", values, "minnum");
            return (Criteria) this;
        }

        public Criteria andMinnumNotIn(List<Integer> values) {
            addCriterion("MinNum not in", values, "minnum");
            return (Criteria) this;
        }

        public Criteria andMinnumBetween(Integer value1, Integer value2) {
            addCriterion("MinNum between", value1, value2, "minnum");
            return (Criteria) this;
        }

        public Criteria andMinnumNotBetween(Integer value1, Integer value2) {
            addCriterion("MinNum not between", value1, value2, "minnum");
            return (Criteria) this;
        }

        public Criteria andSeatnumIsNull() {
            addCriterion("SeatNum is null");
            return (Criteria) this;
        }

        public Criteria andSeatnumIsNotNull() {
            addCriterion("SeatNum is not null");
            return (Criteria) this;
        }

        public Criteria andSeatnumEqualTo(Integer value) {
            addCriterion("SeatNum =", value, "seatnum");
            return (Criteria) this;
        }

        public Criteria andSeatnumNotEqualTo(Integer value) {
            addCriterion("SeatNum <>", value, "seatnum");
            return (Criteria) this;
        }

        public Criteria andSeatnumGreaterThan(Integer value) {
            addCriterion("SeatNum >", value, "seatnum");
            return (Criteria) this;
        }

        public Criteria andSeatnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("SeatNum >=", value, "seatnum");
            return (Criteria) this;
        }

        public Criteria andSeatnumLessThan(Integer value) {
            addCriterion("SeatNum <", value, "seatnum");
            return (Criteria) this;
        }

        public Criteria andSeatnumLessThanOrEqualTo(Integer value) {
            addCriterion("SeatNum <=", value, "seatnum");
            return (Criteria) this;
        }

        public Criteria andSeatnumIn(List<Integer> values) {
            addCriterion("SeatNum in", values, "seatnum");
            return (Criteria) this;
        }

        public Criteria andSeatnumNotIn(List<Integer> values) {
            addCriterion("SeatNum not in", values, "seatnum");
            return (Criteria) this;
        }

        public Criteria andSeatnumBetween(Integer value1, Integer value2) {
            addCriterion("SeatNum between", value1, value2, "seatnum");
            return (Criteria) this;
        }

        public Criteria andSeatnumNotBetween(Integer value1, Integer value2) {
            addCriterion("SeatNum not between", value1, value2, "seatnum");
            return (Criteria) this;
        }

        public Criteria andRefdepflightIsNull() {
            addCriterion("RefDepFlight is null");
            return (Criteria) this;
        }

        public Criteria andRefdepflightIsNotNull() {
            addCriterion("RefDepFlight is not null");
            return (Criteria) this;
        }

        public Criteria andRefdepflightEqualTo(String value) {
            addCriterion("RefDepFlight =", value, "refdepflight");
            return (Criteria) this;
        }

        public Criteria andRefdepflightNotEqualTo(String value) {
            addCriterion("RefDepFlight <>", value, "refdepflight");
            return (Criteria) this;
        }

        public Criteria andRefdepflightGreaterThan(String value) {
            addCriterion("RefDepFlight >", value, "refdepflight");
            return (Criteria) this;
        }

        public Criteria andRefdepflightGreaterThanOrEqualTo(String value) {
            addCriterion("RefDepFlight >=", value, "refdepflight");
            return (Criteria) this;
        }

        public Criteria andRefdepflightLessThan(String value) {
            addCriterion("RefDepFlight <", value, "refdepflight");
            return (Criteria) this;
        }

        public Criteria andRefdepflightLessThanOrEqualTo(String value) {
            addCriterion("RefDepFlight <=", value, "refdepflight");
            return (Criteria) this;
        }

        public Criteria andRefdepflightLike(String value) {
            addCriterion("RefDepFlight like", value, "refdepflight");
            return (Criteria) this;
        }

        public Criteria andRefdepflightNotLike(String value) {
            addCriterion("RefDepFlight not like", value, "refdepflight");
            return (Criteria) this;
        }

        public Criteria andRefdepflightIn(List<String> values) {
            addCriterion("RefDepFlight in", values, "refdepflight");
            return (Criteria) this;
        }

        public Criteria andRefdepflightNotIn(List<String> values) {
            addCriterion("RefDepFlight not in", values, "refdepflight");
            return (Criteria) this;
        }

        public Criteria andRefdepflightBetween(String value1, String value2) {
            addCriterion("RefDepFlight between", value1, value2, "refdepflight");
            return (Criteria) this;
        }

        public Criteria andRefdepflightNotBetween(String value1, String value2) {
            addCriterion("RefDepFlight not between", value1, value2, "refdepflight");
            return (Criteria) this;
        }

        public Criteria andRefbackflightIsNull() {
            addCriterion("RefBackFlight is null");
            return (Criteria) this;
        }

        public Criteria andRefbackflightIsNotNull() {
            addCriterion("RefBackFlight is not null");
            return (Criteria) this;
        }

        public Criteria andRefbackflightEqualTo(String value) {
            addCriterion("RefBackFlight =", value, "refbackflight");
            return (Criteria) this;
        }

        public Criteria andRefbackflightNotEqualTo(String value) {
            addCriterion("RefBackFlight <>", value, "refbackflight");
            return (Criteria) this;
        }

        public Criteria andRefbackflightGreaterThan(String value) {
            addCriterion("RefBackFlight >", value, "refbackflight");
            return (Criteria) this;
        }

        public Criteria andRefbackflightGreaterThanOrEqualTo(String value) {
            addCriterion("RefBackFlight >=", value, "refbackflight");
            return (Criteria) this;
        }

        public Criteria andRefbackflightLessThan(String value) {
            addCriterion("RefBackFlight <", value, "refbackflight");
            return (Criteria) this;
        }

        public Criteria andRefbackflightLessThanOrEqualTo(String value) {
            addCriterion("RefBackFlight <=", value, "refbackflight");
            return (Criteria) this;
        }

        public Criteria andRefbackflightLike(String value) {
            addCriterion("RefBackFlight like", value, "refbackflight");
            return (Criteria) this;
        }

        public Criteria andRefbackflightNotLike(String value) {
            addCriterion("RefBackFlight not like", value, "refbackflight");
            return (Criteria) this;
        }

        public Criteria andRefbackflightIn(List<String> values) {
            addCriterion("RefBackFlight in", values, "refbackflight");
            return (Criteria) this;
        }

        public Criteria andRefbackflightNotIn(List<String> values) {
            addCriterion("RefBackFlight not in", values, "refbackflight");
            return (Criteria) this;
        }

        public Criteria andRefbackflightBetween(String value1, String value2) {
            addCriterion("RefBackFlight between", value1, value2, "refbackflight");
            return (Criteria) this;
        }

        public Criteria andRefbackflightNotBetween(String value1, String value2) {
            addCriterion("RefBackFlight not between", value1, value2, "refbackflight");
            return (Criteria) this;
        }

        public Criteria andTourstatusIsNull() {
            addCriterion("TourStatus is null");
            return (Criteria) this;
        }

        public Criteria andTourstatusIsNotNull() {
            addCriterion("TourStatus is not null");
            return (Criteria) this;
        }

        public Criteria andTourstatusEqualTo(Integer value) {
            addCriterion("TourStatus =", value, "tourstatus");
            return (Criteria) this;
        }

        public Criteria andTourstatusNotEqualTo(Integer value) {
            addCriterion("TourStatus <>", value, "tourstatus");
            return (Criteria) this;
        }

        public Criteria andTourstatusGreaterThan(Integer value) {
            addCriterion("TourStatus >", value, "tourstatus");
            return (Criteria) this;
        }

        public Criteria andTourstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("TourStatus >=", value, "tourstatus");
            return (Criteria) this;
        }

        public Criteria andTourstatusLessThan(Integer value) {
            addCriterion("TourStatus <", value, "tourstatus");
            return (Criteria) this;
        }

        public Criteria andTourstatusLessThanOrEqualTo(Integer value) {
            addCriterion("TourStatus <=", value, "tourstatus");
            return (Criteria) this;
        }

        public Criteria andTourstatusIn(List<Integer> values) {
            addCriterion("TourStatus in", values, "tourstatus");
            return (Criteria) this;
        }

        public Criteria andTourstatusNotIn(List<Integer> values) {
            addCriterion("TourStatus not in", values, "tourstatus");
            return (Criteria) this;
        }

        public Criteria andTourstatusBetween(Integer value1, Integer value2) {
            addCriterion("TourStatus between", value1, value2, "tourstatus");
            return (Criteria) this;
        }

        public Criteria andTourstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("TourStatus not between", value1, value2, "tourstatus");
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

        public Criteria andIstailIsNull() {
            addCriterion("IsTail is null");
            return (Criteria) this;
        }

        public Criteria andIstailIsNotNull() {
            addCriterion("IsTail is not null");
            return (Criteria) this;
        }

        public Criteria andIstailEqualTo(Integer value) {
            addCriterion("IsTail =", value, "istail");
            return (Criteria) this;
        }

        public Criteria andIstailNotEqualTo(Integer value) {
            addCriterion("IsTail <>", value, "istail");
            return (Criteria) this;
        }

        public Criteria andIstailGreaterThan(Integer value) {
            addCriterion("IsTail >", value, "istail");
            return (Criteria) this;
        }

        public Criteria andIstailGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsTail >=", value, "istail");
            return (Criteria) this;
        }

        public Criteria andIstailLessThan(Integer value) {
            addCriterion("IsTail <", value, "istail");
            return (Criteria) this;
        }

        public Criteria andIstailLessThanOrEqualTo(Integer value) {
            addCriterion("IsTail <=", value, "istail");
            return (Criteria) this;
        }

        public Criteria andIstailIn(List<Integer> values) {
            addCriterion("IsTail in", values, "istail");
            return (Criteria) this;
        }

        public Criteria andIstailNotIn(List<Integer> values) {
            addCriterion("IsTail not in", values, "istail");
            return (Criteria) this;
        }

        public Criteria andIstailBetween(Integer value1, Integer value2) {
            addCriterion("IsTail between", value1, value2, "istail");
            return (Criteria) this;
        }

        public Criteria andIstailNotBetween(Integer value1, Integer value2) {
            addCriterion("IsTail not between", value1, value2, "istail");
            return (Criteria) this;
        }

        public Criteria andTailauditstatusIsNull() {
            addCriterion("TailAuditStatus is null");
            return (Criteria) this;
        }

        public Criteria andTailauditstatusIsNotNull() {
            addCriterion("TailAuditStatus is not null");
            return (Criteria) this;
        }

        public Criteria andTailauditstatusEqualTo(Integer value) {
            addCriterion("TailAuditStatus =", value, "tailauditstatus");
            return (Criteria) this;
        }

        public Criteria andTailauditstatusNotEqualTo(Integer value) {
            addCriterion("TailAuditStatus <>", value, "tailauditstatus");
            return (Criteria) this;
        }

        public Criteria andTailauditstatusGreaterThan(Integer value) {
            addCriterion("TailAuditStatus >", value, "tailauditstatus");
            return (Criteria) this;
        }

        public Criteria andTailauditstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("TailAuditStatus >=", value, "tailauditstatus");
            return (Criteria) this;
        }

        public Criteria andTailauditstatusLessThan(Integer value) {
            addCriterion("TailAuditStatus <", value, "tailauditstatus");
            return (Criteria) this;
        }

        public Criteria andTailauditstatusLessThanOrEqualTo(Integer value) {
            addCriterion("TailAuditStatus <=", value, "tailauditstatus");
            return (Criteria) this;
        }

        public Criteria andTailauditstatusIn(List<Integer> values) {
            addCriterion("TailAuditStatus in", values, "tailauditstatus");
            return (Criteria) this;
        }

        public Criteria andTailauditstatusNotIn(List<Integer> values) {
            addCriterion("TailAuditStatus not in", values, "tailauditstatus");
            return (Criteria) this;
        }

        public Criteria andTailauditstatusBetween(Integer value1, Integer value2) {
            addCriterion("TailAuditStatus between", value1, value2, "tailauditstatus");
            return (Criteria) this;
        }

        public Criteria andTailauditstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("TailAuditStatus not between", value1, value2, "tailauditstatus");
            return (Criteria) this;
        }

        public Criteria andIsackIsNull() {
            addCriterion("IsAck is null");
            return (Criteria) this;
        }

        public Criteria andIsackIsNotNull() {
            addCriterion("IsAck is not null");
            return (Criteria) this;
        }

        public Criteria andIsackEqualTo(Integer value) {
            addCriterion("IsAck =", value, "isack");
            return (Criteria) this;
        }

        public Criteria andIsackNotEqualTo(Integer value) {
            addCriterion("IsAck <>", value, "isack");
            return (Criteria) this;
        }

        public Criteria andIsackGreaterThan(Integer value) {
            addCriterion("IsAck >", value, "isack");
            return (Criteria) this;
        }

        public Criteria andIsackGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsAck >=", value, "isack");
            return (Criteria) this;
        }

        public Criteria andIsackLessThan(Integer value) {
            addCriterion("IsAck <", value, "isack");
            return (Criteria) this;
        }

        public Criteria andIsackLessThanOrEqualTo(Integer value) {
            addCriterion("IsAck <=", value, "isack");
            return (Criteria) this;
        }

        public Criteria andIsackIn(List<Integer> values) {
            addCriterion("IsAck in", values, "isack");
            return (Criteria) this;
        }

        public Criteria andIsackNotIn(List<Integer> values) {
            addCriterion("IsAck not in", values, "isack");
            return (Criteria) this;
        }

        public Criteria andIsackBetween(Integer value1, Integer value2) {
            addCriterion("IsAck between", value1, value2, "isack");
            return (Criteria) this;
        }

        public Criteria andIsackNotBetween(Integer value1, Integer value2) {
            addCriterion("IsAck not between", value1, value2, "isack");
            return (Criteria) this;
        }

        public Criteria andHastrafficIsNull() {
            addCriterion("HasTraffic is null");
            return (Criteria) this;
        }

        public Criteria andHastrafficIsNotNull() {
            addCriterion("HasTraffic is not null");
            return (Criteria) this;
        }

        public Criteria andHastrafficEqualTo(Integer value) {
            addCriterion("HasTraffic =", value, "hastraffic");
            return (Criteria) this;
        }

        public Criteria andHastrafficNotEqualTo(Integer value) {
            addCriterion("HasTraffic <>", value, "hastraffic");
            return (Criteria) this;
        }

        public Criteria andHastrafficGreaterThan(Integer value) {
            addCriterion("HasTraffic >", value, "hastraffic");
            return (Criteria) this;
        }

        public Criteria andHastrafficGreaterThanOrEqualTo(Integer value) {
            addCriterion("HasTraffic >=", value, "hastraffic");
            return (Criteria) this;
        }

        public Criteria andHastrafficLessThan(Integer value) {
            addCriterion("HasTraffic <", value, "hastraffic");
            return (Criteria) this;
        }

        public Criteria andHastrafficLessThanOrEqualTo(Integer value) {
            addCriterion("HasTraffic <=", value, "hastraffic");
            return (Criteria) this;
        }

        public Criteria andHastrafficIn(List<Integer> values) {
            addCriterion("HasTraffic in", values, "hastraffic");
            return (Criteria) this;
        }

        public Criteria andHastrafficNotIn(List<Integer> values) {
            addCriterion("HasTraffic not in", values, "hastraffic");
            return (Criteria) this;
        }

        public Criteria andHastrafficBetween(Integer value1, Integer value2) {
            addCriterion("HasTraffic between", value1, value2, "hastraffic");
            return (Criteria) this;
        }

        public Criteria andHastrafficNotBetween(Integer value1, Integer value2) {
            addCriterion("HasTraffic not between", value1, value2, "hastraffic");
            return (Criteria) this;
        }

        public Criteria andIsusediscountIsNull() {
            addCriterion("IsUseDiscount is null");
            return (Criteria) this;
        }

        public Criteria andIsusediscountIsNotNull() {
            addCriterion("IsUseDiscount is not null");
            return (Criteria) this;
        }

        public Criteria andIsusediscountEqualTo(Boolean value) {
            addCriterion("IsUseDiscount =", value, "isusediscount");
            return (Criteria) this;
        }

        public Criteria andIsusediscountNotEqualTo(Boolean value) {
            addCriterion("IsUseDiscount <>", value, "isusediscount");
            return (Criteria) this;
        }

        public Criteria andIsusediscountGreaterThan(Boolean value) {
            addCriterion("IsUseDiscount >", value, "isusediscount");
            return (Criteria) this;
        }

        public Criteria andIsusediscountGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsUseDiscount >=", value, "isusediscount");
            return (Criteria) this;
        }

        public Criteria andIsusediscountLessThan(Boolean value) {
            addCriterion("IsUseDiscount <", value, "isusediscount");
            return (Criteria) this;
        }

        public Criteria andIsusediscountLessThanOrEqualTo(Boolean value) {
            addCriterion("IsUseDiscount <=", value, "isusediscount");
            return (Criteria) this;
        }

        public Criteria andIsusediscountIn(List<Boolean> values) {
            addCriterion("IsUseDiscount in", values, "isusediscount");
            return (Criteria) this;
        }

        public Criteria andIsusediscountNotIn(List<Boolean> values) {
            addCriterion("IsUseDiscount not in", values, "isusediscount");
            return (Criteria) this;
        }

        public Criteria andIsusediscountBetween(Boolean value1, Boolean value2) {
            addCriterion("IsUseDiscount between", value1, value2, "isusediscount");
            return (Criteria) this;
        }

        public Criteria andIsusediscountNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsUseDiscount not between", value1, value2, "isusediscount");
            return (Criteria) this;
        }

        public Criteria andIssignedIsNull() {
            addCriterion("IsSigned is null");
            return (Criteria) this;
        }

        public Criteria andIssignedIsNotNull() {
            addCriterion("IsSigned is not null");
            return (Criteria) this;
        }

        public Criteria andIssignedEqualTo(Integer value) {
            addCriterion("IsSigned =", value, "issigned");
            return (Criteria) this;
        }

        public Criteria andIssignedNotEqualTo(Integer value) {
            addCriterion("IsSigned <>", value, "issigned");
            return (Criteria) this;
        }

        public Criteria andIssignedGreaterThan(Integer value) {
            addCriterion("IsSigned >", value, "issigned");
            return (Criteria) this;
        }

        public Criteria andIssignedGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsSigned >=", value, "issigned");
            return (Criteria) this;
        }

        public Criteria andIssignedLessThan(Integer value) {
            addCriterion("IsSigned <", value, "issigned");
            return (Criteria) this;
        }

        public Criteria andIssignedLessThanOrEqualTo(Integer value) {
            addCriterion("IsSigned <=", value, "issigned");
            return (Criteria) this;
        }

        public Criteria andIssignedIn(List<Integer> values) {
            addCriterion("IsSigned in", values, "issigned");
            return (Criteria) this;
        }

        public Criteria andIssignedNotIn(List<Integer> values) {
            addCriterion("IsSigned not in", values, "issigned");
            return (Criteria) this;
        }

        public Criteria andIssignedBetween(Integer value1, Integer value2) {
            addCriterion("IsSigned between", value1, value2, "issigned");
            return (Criteria) this;
        }

        public Criteria andIssignedNotBetween(Integer value1, Integer value2) {
            addCriterion("IsSigned not between", value1, value2, "issigned");
            return (Criteria) this;
        }

        public Criteria andTourescortnumIsNull() {
            addCriterion("TourEscortNum is null");
            return (Criteria) this;
        }

        public Criteria andTourescortnumIsNotNull() {
            addCriterion("TourEscortNum is not null");
            return (Criteria) this;
        }

        public Criteria andTourescortnumEqualTo(Integer value) {
            addCriterion("TourEscortNum =", value, "tourescortnum");
            return (Criteria) this;
        }

        public Criteria andTourescortnumNotEqualTo(Integer value) {
            addCriterion("TourEscortNum <>", value, "tourescortnum");
            return (Criteria) this;
        }

        public Criteria andTourescortnumGreaterThan(Integer value) {
            addCriterion("TourEscortNum >", value, "tourescortnum");
            return (Criteria) this;
        }

        public Criteria andTourescortnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("TourEscortNum >=", value, "tourescortnum");
            return (Criteria) this;
        }

        public Criteria andTourescortnumLessThan(Integer value) {
            addCriterion("TourEscortNum <", value, "tourescortnum");
            return (Criteria) this;
        }

        public Criteria andTourescortnumLessThanOrEqualTo(Integer value) {
            addCriterion("TourEscortNum <=", value, "tourescortnum");
            return (Criteria) this;
        }

        public Criteria andTourescortnumIn(List<Integer> values) {
            addCriterion("TourEscortNum in", values, "tourescortnum");
            return (Criteria) this;
        }

        public Criteria andTourescortnumNotIn(List<Integer> values) {
            addCriterion("TourEscortNum not in", values, "tourescortnum");
            return (Criteria) this;
        }

        public Criteria andTourescortnumBetween(Integer value1, Integer value2) {
            addCriterion("TourEscortNum between", value1, value2, "tourescortnum");
            return (Criteria) this;
        }

        public Criteria andTourescortnumNotBetween(Integer value1, Integer value2) {
            addCriterion("TourEscortNum not between", value1, value2, "tourescortnum");
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