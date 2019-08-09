package com.holyrobot.con_product.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProProductDirectSalesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProProductDirectSalesExample() {
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

        public Criteria andReceiveridIsNull() {
            addCriterion("ReceiverID is null");
            return (Criteria) this;
        }

        public Criteria andReceiveridIsNotNull() {
            addCriterion("ReceiverID is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveridEqualTo(String value) {
            addCriterion("ReceiverID =", value, "receiverid");
            return (Criteria) this;
        }

        public Criteria andReceiveridNotEqualTo(String value) {
            addCriterion("ReceiverID <>", value, "receiverid");
            return (Criteria) this;
        }

        public Criteria andReceiveridGreaterThan(String value) {
            addCriterion("ReceiverID >", value, "receiverid");
            return (Criteria) this;
        }

        public Criteria andReceiveridGreaterThanOrEqualTo(String value) {
            addCriterion("ReceiverID >=", value, "receiverid");
            return (Criteria) this;
        }

        public Criteria andReceiveridLessThan(String value) {
            addCriterion("ReceiverID <", value, "receiverid");
            return (Criteria) this;
        }

        public Criteria andReceiveridLessThanOrEqualTo(String value) {
            addCriterion("ReceiverID <=", value, "receiverid");
            return (Criteria) this;
        }

        public Criteria andReceiveridLike(String value) {
            addCriterion("ReceiverID like", value, "receiverid");
            return (Criteria) this;
        }

        public Criteria andReceiveridNotLike(String value) {
            addCriterion("ReceiverID not like", value, "receiverid");
            return (Criteria) this;
        }

        public Criteria andReceiveridIn(List<String> values) {
            addCriterion("ReceiverID in", values, "receiverid");
            return (Criteria) this;
        }

        public Criteria andReceiveridNotIn(List<String> values) {
            addCriterion("ReceiverID not in", values, "receiverid");
            return (Criteria) this;
        }

        public Criteria andReceiveridBetween(String value1, String value2) {
            addCriterion("ReceiverID between", value1, value2, "receiverid");
            return (Criteria) this;
        }

        public Criteria andReceiveridNotBetween(String value1, String value2) {
            addCriterion("ReceiverID not between", value1, value2, "receiverid");
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

        public Criteria andTouridIsNull() {
            addCriterion("TourID is null");
            return (Criteria) this;
        }

        public Criteria andTouridIsNotNull() {
            addCriterion("TourID is not null");
            return (Criteria) this;
        }

        public Criteria andTouridEqualTo(String value) {
            addCriterion("TourID =", value, "tourid");
            return (Criteria) this;
        }

        public Criteria andTouridNotEqualTo(String value) {
            addCriterion("TourID <>", value, "tourid");
            return (Criteria) this;
        }

        public Criteria andTouridGreaterThan(String value) {
            addCriterion("TourID >", value, "tourid");
            return (Criteria) this;
        }

        public Criteria andTouridGreaterThanOrEqualTo(String value) {
            addCriterion("TourID >=", value, "tourid");
            return (Criteria) this;
        }

        public Criteria andTouridLessThan(String value) {
            addCriterion("TourID <", value, "tourid");
            return (Criteria) this;
        }

        public Criteria andTouridLessThanOrEqualTo(String value) {
            addCriterion("TourID <=", value, "tourid");
            return (Criteria) this;
        }

        public Criteria andTouridLike(String value) {
            addCriterion("TourID like", value, "tourid");
            return (Criteria) this;
        }

        public Criteria andTouridNotLike(String value) {
            addCriterion("TourID not like", value, "tourid");
            return (Criteria) this;
        }

        public Criteria andTouridIn(List<String> values) {
            addCriterion("TourID in", values, "tourid");
            return (Criteria) this;
        }

        public Criteria andTouridNotIn(List<String> values) {
            addCriterion("TourID not in", values, "tourid");
            return (Criteria) this;
        }

        public Criteria andTouridBetween(String value1, String value2) {
            addCriterion("TourID between", value1, value2, "tourid");
            return (Criteria) this;
        }

        public Criteria andTouridNotBetween(String value1, String value2) {
            addCriterion("TourID not between", value1, value2, "tourid");
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

        public Criteria andIsshareIsNull() {
            addCriterion("IsShare is null");
            return (Criteria) this;
        }

        public Criteria andIsshareIsNotNull() {
            addCriterion("IsShare is not null");
            return (Criteria) this;
        }

        public Criteria andIsshareEqualTo(Integer value) {
            addCriterion("IsShare =", value, "isshare");
            return (Criteria) this;
        }

        public Criteria andIsshareNotEqualTo(Integer value) {
            addCriterion("IsShare <>", value, "isshare");
            return (Criteria) this;
        }

        public Criteria andIsshareGreaterThan(Integer value) {
            addCriterion("IsShare >", value, "isshare");
            return (Criteria) this;
        }

        public Criteria andIsshareGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsShare >=", value, "isshare");
            return (Criteria) this;
        }

        public Criteria andIsshareLessThan(Integer value) {
            addCriterion("IsShare <", value, "isshare");
            return (Criteria) this;
        }

        public Criteria andIsshareLessThanOrEqualTo(Integer value) {
            addCriterion("IsShare <=", value, "isshare");
            return (Criteria) this;
        }

        public Criteria andIsshareIn(List<Integer> values) {
            addCriterion("IsShare in", values, "isshare");
            return (Criteria) this;
        }

        public Criteria andIsshareNotIn(List<Integer> values) {
            addCriterion("IsShare not in", values, "isshare");
            return (Criteria) this;
        }

        public Criteria andIsshareBetween(Integer value1, Integer value2) {
            addCriterion("IsShare between", value1, value2, "isshare");
            return (Criteria) this;
        }

        public Criteria andIsshareNotBetween(Integer value1, Integer value2) {
            addCriterion("IsShare not between", value1, value2, "isshare");
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

        public Criteria andAuditstatusIsNull() {
            addCriterion("AuditStatus is null");
            return (Criteria) this;
        }

        public Criteria andAuditstatusIsNotNull() {
            addCriterion("AuditStatus is not null");
            return (Criteria) this;
        }

        public Criteria andAuditstatusEqualTo(Integer value) {
            addCriterion("AuditStatus =", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotEqualTo(Integer value) {
            addCriterion("AuditStatus <>", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusGreaterThan(Integer value) {
            addCriterion("AuditStatus >", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("AuditStatus >=", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusLessThan(Integer value) {
            addCriterion("AuditStatus <", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusLessThanOrEqualTo(Integer value) {
            addCriterion("AuditStatus <=", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusIn(List<Integer> values) {
            addCriterion("AuditStatus in", values, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotIn(List<Integer> values) {
            addCriterion("AuditStatus not in", values, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusBetween(Integer value1, Integer value2) {
            addCriterion("AuditStatus between", value1, value2, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("AuditStatus not between", value1, value2, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditeddateIsNull() {
            addCriterion("AuditedDate is null");
            return (Criteria) this;
        }

        public Criteria andAuditeddateIsNotNull() {
            addCriterion("AuditedDate is not null");
            return (Criteria) this;
        }

        public Criteria andAuditeddateEqualTo(Date value) {
            addCriterion("AuditedDate =", value, "auditeddate");
            return (Criteria) this;
        }

        public Criteria andAuditeddateNotEqualTo(Date value) {
            addCriterion("AuditedDate <>", value, "auditeddate");
            return (Criteria) this;
        }

        public Criteria andAuditeddateGreaterThan(Date value) {
            addCriterion("AuditedDate >", value, "auditeddate");
            return (Criteria) this;
        }

        public Criteria andAuditeddateGreaterThanOrEqualTo(Date value) {
            addCriterion("AuditedDate >=", value, "auditeddate");
            return (Criteria) this;
        }

        public Criteria andAuditeddateLessThan(Date value) {
            addCriterion("AuditedDate <", value, "auditeddate");
            return (Criteria) this;
        }

        public Criteria andAuditeddateLessThanOrEqualTo(Date value) {
            addCriterion("AuditedDate <=", value, "auditeddate");
            return (Criteria) this;
        }

        public Criteria andAuditeddateIn(List<Date> values) {
            addCriterion("AuditedDate in", values, "auditeddate");
            return (Criteria) this;
        }

        public Criteria andAuditeddateNotIn(List<Date> values) {
            addCriterion("AuditedDate not in", values, "auditeddate");
            return (Criteria) this;
        }

        public Criteria andAuditeddateBetween(Date value1, Date value2) {
            addCriterion("AuditedDate between", value1, value2, "auditeddate");
            return (Criteria) this;
        }

        public Criteria andAuditeddateNotBetween(Date value1, Date value2) {
            addCriterion("AuditedDate not between", value1, value2, "auditeddate");
            return (Criteria) this;
        }

        public Criteria andAuditedbyIsNull() {
            addCriterion("AuditedBy is null");
            return (Criteria) this;
        }

        public Criteria andAuditedbyIsNotNull() {
            addCriterion("AuditedBy is not null");
            return (Criteria) this;
        }

        public Criteria andAuditedbyEqualTo(String value) {
            addCriterion("AuditedBy =", value, "auditedby");
            return (Criteria) this;
        }

        public Criteria andAuditedbyNotEqualTo(String value) {
            addCriterion("AuditedBy <>", value, "auditedby");
            return (Criteria) this;
        }

        public Criteria andAuditedbyGreaterThan(String value) {
            addCriterion("AuditedBy >", value, "auditedby");
            return (Criteria) this;
        }

        public Criteria andAuditedbyGreaterThanOrEqualTo(String value) {
            addCriterion("AuditedBy >=", value, "auditedby");
            return (Criteria) this;
        }

        public Criteria andAuditedbyLessThan(String value) {
            addCriterion("AuditedBy <", value, "auditedby");
            return (Criteria) this;
        }

        public Criteria andAuditedbyLessThanOrEqualTo(String value) {
            addCriterion("AuditedBy <=", value, "auditedby");
            return (Criteria) this;
        }

        public Criteria andAuditedbyLike(String value) {
            addCriterion("AuditedBy like", value, "auditedby");
            return (Criteria) this;
        }

        public Criteria andAuditedbyNotLike(String value) {
            addCriterion("AuditedBy not like", value, "auditedby");
            return (Criteria) this;
        }

        public Criteria andAuditedbyIn(List<String> values) {
            addCriterion("AuditedBy in", values, "auditedby");
            return (Criteria) this;
        }

        public Criteria andAuditedbyNotIn(List<String> values) {
            addCriterion("AuditedBy not in", values, "auditedby");
            return (Criteria) this;
        }

        public Criteria andAuditedbyBetween(String value1, String value2) {
            addCriterion("AuditedBy between", value1, value2, "auditedby");
            return (Criteria) this;
        }

        public Criteria andAuditedbyNotBetween(String value1, String value2) {
            addCriterion("AuditedBy not between", value1, value2, "auditedby");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIsNull() {
            addCriterion("SupplierName is null");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIsNotNull() {
            addCriterion("SupplierName is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliernameEqualTo(String value) {
            addCriterion("SupplierName =", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotEqualTo(String value) {
            addCriterion("SupplierName <>", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameGreaterThan(String value) {
            addCriterion("SupplierName >", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameGreaterThanOrEqualTo(String value) {
            addCriterion("SupplierName >=", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLessThan(String value) {
            addCriterion("SupplierName <", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLessThanOrEqualTo(String value) {
            addCriterion("SupplierName <=", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLike(String value) {
            addCriterion("SupplierName like", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotLike(String value) {
            addCriterion("SupplierName not like", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIn(List<String> values) {
            addCriterion("SupplierName in", values, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotIn(List<String> values) {
            addCriterion("SupplierName not in", values, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameBetween(String value1, String value2) {
            addCriterion("SupplierName between", value1, value2, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotBetween(String value1, String value2) {
            addCriterion("SupplierName not between", value1, value2, "suppliername");
            return (Criteria) this;
        }

        public Criteria andReceivernameIsNull() {
            addCriterion("ReceiverName is null");
            return (Criteria) this;
        }

        public Criteria andReceivernameIsNotNull() {
            addCriterion("ReceiverName is not null");
            return (Criteria) this;
        }

        public Criteria andReceivernameEqualTo(String value) {
            addCriterion("ReceiverName =", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameNotEqualTo(String value) {
            addCriterion("ReceiverName <>", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameGreaterThan(String value) {
            addCriterion("ReceiverName >", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameGreaterThanOrEqualTo(String value) {
            addCriterion("ReceiverName >=", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameLessThan(String value) {
            addCriterion("ReceiverName <", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameLessThanOrEqualTo(String value) {
            addCriterion("ReceiverName <=", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameLike(String value) {
            addCriterion("ReceiverName like", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameNotLike(String value) {
            addCriterion("ReceiverName not like", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameIn(List<String> values) {
            addCriterion("ReceiverName in", values, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameNotIn(List<String> values) {
            addCriterion("ReceiverName not in", values, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameBetween(String value1, String value2) {
            addCriterion("ReceiverName between", value1, value2, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameNotBetween(String value1, String value2) {
            addCriterion("ReceiverName not between", value1, value2, "receivername");
            return (Criteria) this;
        }

        public Criteria andSupplierdatastatusIsNull() {
            addCriterion("SupplierDataStatus is null");
            return (Criteria) this;
        }

        public Criteria andSupplierdatastatusIsNotNull() {
            addCriterion("SupplierDataStatus is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierdatastatusEqualTo(Integer value) {
            addCriterion("SupplierDataStatus =", value, "supplierdatastatus");
            return (Criteria) this;
        }

        public Criteria andSupplierdatastatusNotEqualTo(Integer value) {
            addCriterion("SupplierDataStatus <>", value, "supplierdatastatus");
            return (Criteria) this;
        }

        public Criteria andSupplierdatastatusGreaterThan(Integer value) {
            addCriterion("SupplierDataStatus >", value, "supplierdatastatus");
            return (Criteria) this;
        }

        public Criteria andSupplierdatastatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("SupplierDataStatus >=", value, "supplierdatastatus");
            return (Criteria) this;
        }

        public Criteria andSupplierdatastatusLessThan(Integer value) {
            addCriterion("SupplierDataStatus <", value, "supplierdatastatus");
            return (Criteria) this;
        }

        public Criteria andSupplierdatastatusLessThanOrEqualTo(Integer value) {
            addCriterion("SupplierDataStatus <=", value, "supplierdatastatus");
            return (Criteria) this;
        }

        public Criteria andSupplierdatastatusIn(List<Integer> values) {
            addCriterion("SupplierDataStatus in", values, "supplierdatastatus");
            return (Criteria) this;
        }

        public Criteria andSupplierdatastatusNotIn(List<Integer> values) {
            addCriterion("SupplierDataStatus not in", values, "supplierdatastatus");
            return (Criteria) this;
        }

        public Criteria andSupplierdatastatusBetween(Integer value1, Integer value2) {
            addCriterion("SupplierDataStatus between", value1, value2, "supplierdatastatus");
            return (Criteria) this;
        }

        public Criteria andSupplierdatastatusNotBetween(Integer value1, Integer value2) {
            addCriterion("SupplierDataStatus not between", value1, value2, "supplierdatastatus");
            return (Criteria) this;
        }

        public Criteria andIscopyIsNull() {
            addCriterion("IsCopy is null");
            return (Criteria) this;
        }

        public Criteria andIscopyIsNotNull() {
            addCriterion("IsCopy is not null");
            return (Criteria) this;
        }

        public Criteria andIscopyEqualTo(Integer value) {
            addCriterion("IsCopy =", value, "iscopy");
            return (Criteria) this;
        }

        public Criteria andIscopyNotEqualTo(Integer value) {
            addCriterion("IsCopy <>", value, "iscopy");
            return (Criteria) this;
        }

        public Criteria andIscopyGreaterThan(Integer value) {
            addCriterion("IsCopy >", value, "iscopy");
            return (Criteria) this;
        }

        public Criteria andIscopyGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsCopy >=", value, "iscopy");
            return (Criteria) this;
        }

        public Criteria andIscopyLessThan(Integer value) {
            addCriterion("IsCopy <", value, "iscopy");
            return (Criteria) this;
        }

        public Criteria andIscopyLessThanOrEqualTo(Integer value) {
            addCriterion("IsCopy <=", value, "iscopy");
            return (Criteria) this;
        }

        public Criteria andIscopyIn(List<Integer> values) {
            addCriterion("IsCopy in", values, "iscopy");
            return (Criteria) this;
        }

        public Criteria andIscopyNotIn(List<Integer> values) {
            addCriterion("IsCopy not in", values, "iscopy");
            return (Criteria) this;
        }

        public Criteria andIscopyBetween(Integer value1, Integer value2) {
            addCriterion("IsCopy between", value1, value2, "iscopy");
            return (Criteria) this;
        }

        public Criteria andIscopyNotBetween(Integer value1, Integer value2) {
            addCriterion("IsCopy not between", value1, value2, "iscopy");
            return (Criteria) this;
        }

        public Criteria andUnshelvecommentIsNull() {
            addCriterion("UnShelveComment is null");
            return (Criteria) this;
        }

        public Criteria andUnshelvecommentIsNotNull() {
            addCriterion("UnShelveComment is not null");
            return (Criteria) this;
        }

        public Criteria andUnshelvecommentEqualTo(String value) {
            addCriterion("UnShelveComment =", value, "unshelvecomment");
            return (Criteria) this;
        }

        public Criteria andUnshelvecommentNotEqualTo(String value) {
            addCriterion("UnShelveComment <>", value, "unshelvecomment");
            return (Criteria) this;
        }

        public Criteria andUnshelvecommentGreaterThan(String value) {
            addCriterion("UnShelveComment >", value, "unshelvecomment");
            return (Criteria) this;
        }

        public Criteria andUnshelvecommentGreaterThanOrEqualTo(String value) {
            addCriterion("UnShelveComment >=", value, "unshelvecomment");
            return (Criteria) this;
        }

        public Criteria andUnshelvecommentLessThan(String value) {
            addCriterion("UnShelveComment <", value, "unshelvecomment");
            return (Criteria) this;
        }

        public Criteria andUnshelvecommentLessThanOrEqualTo(String value) {
            addCriterion("UnShelveComment <=", value, "unshelvecomment");
            return (Criteria) this;
        }

        public Criteria andUnshelvecommentLike(String value) {
            addCriterion("UnShelveComment like", value, "unshelvecomment");
            return (Criteria) this;
        }

        public Criteria andUnshelvecommentNotLike(String value) {
            addCriterion("UnShelveComment not like", value, "unshelvecomment");
            return (Criteria) this;
        }

        public Criteria andUnshelvecommentIn(List<String> values) {
            addCriterion("UnShelveComment in", values, "unshelvecomment");
            return (Criteria) this;
        }

        public Criteria andUnshelvecommentNotIn(List<String> values) {
            addCriterion("UnShelveComment not in", values, "unshelvecomment");
            return (Criteria) this;
        }

        public Criteria andUnshelvecommentBetween(String value1, String value2) {
            addCriterion("UnShelveComment between", value1, value2, "unshelvecomment");
            return (Criteria) this;
        }

        public Criteria andUnshelvecommentNotBetween(String value1, String value2) {
            addCriterion("UnShelveComment not between", value1, value2, "unshelvecomment");
            return (Criteria) this;
        }

        public Criteria andAuditedbyidIsNull() {
            addCriterion("AuditedByID is null");
            return (Criteria) this;
        }

        public Criteria andAuditedbyidIsNotNull() {
            addCriterion("AuditedByID is not null");
            return (Criteria) this;
        }

        public Criteria andAuditedbyidEqualTo(String value) {
            addCriterion("AuditedByID =", value, "auditedbyid");
            return (Criteria) this;
        }

        public Criteria andAuditedbyidNotEqualTo(String value) {
            addCriterion("AuditedByID <>", value, "auditedbyid");
            return (Criteria) this;
        }

        public Criteria andAuditedbyidGreaterThan(String value) {
            addCriterion("AuditedByID >", value, "auditedbyid");
            return (Criteria) this;
        }

        public Criteria andAuditedbyidGreaterThanOrEqualTo(String value) {
            addCriterion("AuditedByID >=", value, "auditedbyid");
            return (Criteria) this;
        }

        public Criteria andAuditedbyidLessThan(String value) {
            addCriterion("AuditedByID <", value, "auditedbyid");
            return (Criteria) this;
        }

        public Criteria andAuditedbyidLessThanOrEqualTo(String value) {
            addCriterion("AuditedByID <=", value, "auditedbyid");
            return (Criteria) this;
        }

        public Criteria andAuditedbyidLike(String value) {
            addCriterion("AuditedByID like", value, "auditedbyid");
            return (Criteria) this;
        }

        public Criteria andAuditedbyidNotLike(String value) {
            addCriterion("AuditedByID not like", value, "auditedbyid");
            return (Criteria) this;
        }

        public Criteria andAuditedbyidIn(List<String> values) {
            addCriterion("AuditedByID in", values, "auditedbyid");
            return (Criteria) this;
        }

        public Criteria andAuditedbyidNotIn(List<String> values) {
            addCriterion("AuditedByID not in", values, "auditedbyid");
            return (Criteria) this;
        }

        public Criteria andAuditedbyidBetween(String value1, String value2) {
            addCriterion("AuditedByID between", value1, value2, "auditedbyid");
            return (Criteria) this;
        }

        public Criteria andAuditedbyidNotBetween(String value1, String value2) {
            addCriterion("AuditedByID not between", value1, value2, "auditedbyid");
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