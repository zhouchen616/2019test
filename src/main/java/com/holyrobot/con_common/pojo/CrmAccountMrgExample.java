package com.holyrobot.con_common.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CrmAccountMrgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CrmAccountMrgExample() {
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

        public Criteria andCategoryidIsNull() {
            addCriterion("CategoryID is null");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNotNull() {
            addCriterion("CategoryID is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryidEqualTo(String value) {
            addCriterion("CategoryID =", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotEqualTo(String value) {
            addCriterion("CategoryID <>", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThan(String value) {
            addCriterion("CategoryID >", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThanOrEqualTo(String value) {
            addCriterion("CategoryID >=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThan(String value) {
            addCriterion("CategoryID <", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThanOrEqualTo(String value) {
            addCriterion("CategoryID <=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLike(String value) {
            addCriterion("CategoryID like", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotLike(String value) {
            addCriterion("CategoryID not like", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidIn(List<String> values) {
            addCriterion("CategoryID in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotIn(List<String> values) {
            addCriterion("CategoryID not in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidBetween(String value1, String value2) {
            addCriterion("CategoryID between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotBetween(String value1, String value2) {
            addCriterion("CategoryID not between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategorynameIsNull() {
            addCriterion("CategoryName is null");
            return (Criteria) this;
        }

        public Criteria andCategorynameIsNotNull() {
            addCriterion("CategoryName is not null");
            return (Criteria) this;
        }

        public Criteria andCategorynameEqualTo(String value) {
            addCriterion("CategoryName =", value, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategorynameNotEqualTo(String value) {
            addCriterion("CategoryName <>", value, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategorynameGreaterThan(String value) {
            addCriterion("CategoryName >", value, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategorynameGreaterThanOrEqualTo(String value) {
            addCriterion("CategoryName >=", value, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategorynameLessThan(String value) {
            addCriterion("CategoryName <", value, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategorynameLessThanOrEqualTo(String value) {
            addCriterion("CategoryName <=", value, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategorynameLike(String value) {
            addCriterion("CategoryName like", value, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategorynameNotLike(String value) {
            addCriterion("CategoryName not like", value, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategorynameIn(List<String> values) {
            addCriterion("CategoryName in", values, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategorynameNotIn(List<String> values) {
            addCriterion("CategoryName not in", values, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategorynameBetween(String value1, String value2) {
            addCriterion("CategoryName between", value1, value2, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategorynameNotBetween(String value1, String value2) {
            addCriterion("CategoryName not between", value1, value2, "categoryname");
            return (Criteria) this;
        }

        public Criteria andUnitnameIsNull() {
            addCriterion("UnitName is null");
            return (Criteria) this;
        }

        public Criteria andUnitnameIsNotNull() {
            addCriterion("UnitName is not null");
            return (Criteria) this;
        }

        public Criteria andUnitnameEqualTo(String value) {
            addCriterion("UnitName =", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotEqualTo(String value) {
            addCriterion("UnitName <>", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameGreaterThan(String value) {
            addCriterion("UnitName >", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameGreaterThanOrEqualTo(String value) {
            addCriterion("UnitName >=", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLessThan(String value) {
            addCriterion("UnitName <", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLessThanOrEqualTo(String value) {
            addCriterion("UnitName <=", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLike(String value) {
            addCriterion("UnitName like", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotLike(String value) {
            addCriterion("UnitName not like", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameIn(List<String> values) {
            addCriterion("UnitName in", values, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotIn(List<String> values) {
            addCriterion("UnitName not in", values, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameBetween(String value1, String value2) {
            addCriterion("UnitName between", value1, value2, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotBetween(String value1, String value2) {
            addCriterion("UnitName not between", value1, value2, "unitname");
            return (Criteria) this;
        }

        public Criteria andCityidIsNull() {
            addCriterion("CityID is null");
            return (Criteria) this;
        }

        public Criteria andCityidIsNotNull() {
            addCriterion("CityID is not null");
            return (Criteria) this;
        }

        public Criteria andCityidEqualTo(String value) {
            addCriterion("CityID =", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotEqualTo(String value) {
            addCriterion("CityID <>", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThan(String value) {
            addCriterion("CityID >", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThanOrEqualTo(String value) {
            addCriterion("CityID >=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThan(String value) {
            addCriterion("CityID <", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThanOrEqualTo(String value) {
            addCriterion("CityID <=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLike(String value) {
            addCriterion("CityID like", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotLike(String value) {
            addCriterion("CityID not like", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidIn(List<String> values) {
            addCriterion("CityID in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotIn(List<String> values) {
            addCriterion("CityID not in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidBetween(String value1, String value2) {
            addCriterion("CityID between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotBetween(String value1, String value2) {
            addCriterion("CityID not between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andCitynameIsNull() {
            addCriterion("CityName is null");
            return (Criteria) this;
        }

        public Criteria andCitynameIsNotNull() {
            addCriterion("CityName is not null");
            return (Criteria) this;
        }

        public Criteria andCitynameEqualTo(String value) {
            addCriterion("CityName =", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotEqualTo(String value) {
            addCriterion("CityName <>", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameGreaterThan(String value) {
            addCriterion("CityName >", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameGreaterThanOrEqualTo(String value) {
            addCriterion("CityName >=", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLessThan(String value) {
            addCriterion("CityName <", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLessThanOrEqualTo(String value) {
            addCriterion("CityName <=", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLike(String value) {
            addCriterion("CityName like", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotLike(String value) {
            addCriterion("CityName not like", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameIn(List<String> values) {
            addCriterion("CityName in", values, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotIn(List<String> values) {
            addCriterion("CityName not in", values, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameBetween(String value1, String value2) {
            addCriterion("CityName between", value1, value2, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotBetween(String value1, String value2) {
            addCriterion("CityName not between", value1, value2, "cityname");
            return (Criteria) this;
        }

        public Criteria andBelongtodeptidIsNull() {
            addCriterion("BelongToDeptID is null");
            return (Criteria) this;
        }

        public Criteria andBelongtodeptidIsNotNull() {
            addCriterion("BelongToDeptID is not null");
            return (Criteria) this;
        }

        public Criteria andBelongtodeptidEqualTo(String value) {
            addCriterion("BelongToDeptID =", value, "belongtodeptid");
            return (Criteria) this;
        }

        public Criteria andBelongtodeptidNotEqualTo(String value) {
            addCriterion("BelongToDeptID <>", value, "belongtodeptid");
            return (Criteria) this;
        }

        public Criteria andBelongtodeptidGreaterThan(String value) {
            addCriterion("BelongToDeptID >", value, "belongtodeptid");
            return (Criteria) this;
        }

        public Criteria andBelongtodeptidGreaterThanOrEqualTo(String value) {
            addCriterion("BelongToDeptID >=", value, "belongtodeptid");
            return (Criteria) this;
        }

        public Criteria andBelongtodeptidLessThan(String value) {
            addCriterion("BelongToDeptID <", value, "belongtodeptid");
            return (Criteria) this;
        }

        public Criteria andBelongtodeptidLessThanOrEqualTo(String value) {
            addCriterion("BelongToDeptID <=", value, "belongtodeptid");
            return (Criteria) this;
        }

        public Criteria andBelongtodeptidLike(String value) {
            addCriterion("BelongToDeptID like", value, "belongtodeptid");
            return (Criteria) this;
        }

        public Criteria andBelongtodeptidNotLike(String value) {
            addCriterion("BelongToDeptID not like", value, "belongtodeptid");
            return (Criteria) this;
        }

        public Criteria andBelongtodeptidIn(List<String> values) {
            addCriterion("BelongToDeptID in", values, "belongtodeptid");
            return (Criteria) this;
        }

        public Criteria andBelongtodeptidNotIn(List<String> values) {
            addCriterion("BelongToDeptID not in", values, "belongtodeptid");
            return (Criteria) this;
        }

        public Criteria andBelongtodeptidBetween(String value1, String value2) {
            addCriterion("BelongToDeptID between", value1, value2, "belongtodeptid");
            return (Criteria) this;
        }

        public Criteria andBelongtodeptidNotBetween(String value1, String value2) {
            addCriterion("BelongToDeptID not between", value1, value2, "belongtodeptid");
            return (Criteria) this;
        }

        public Criteria andDelongtodeptIsNull() {
            addCriterion("DelongToDept is null");
            return (Criteria) this;
        }

        public Criteria andDelongtodeptIsNotNull() {
            addCriterion("DelongToDept is not null");
            return (Criteria) this;
        }

        public Criteria andDelongtodeptEqualTo(String value) {
            addCriterion("DelongToDept =", value, "delongtodept");
            return (Criteria) this;
        }

        public Criteria andDelongtodeptNotEqualTo(String value) {
            addCriterion("DelongToDept <>", value, "delongtodept");
            return (Criteria) this;
        }

        public Criteria andDelongtodeptGreaterThan(String value) {
            addCriterion("DelongToDept >", value, "delongtodept");
            return (Criteria) this;
        }

        public Criteria andDelongtodeptGreaterThanOrEqualTo(String value) {
            addCriterion("DelongToDept >=", value, "delongtodept");
            return (Criteria) this;
        }

        public Criteria andDelongtodeptLessThan(String value) {
            addCriterion("DelongToDept <", value, "delongtodept");
            return (Criteria) this;
        }

        public Criteria andDelongtodeptLessThanOrEqualTo(String value) {
            addCriterion("DelongToDept <=", value, "delongtodept");
            return (Criteria) this;
        }

        public Criteria andDelongtodeptLike(String value) {
            addCriterion("DelongToDept like", value, "delongtodept");
            return (Criteria) this;
        }

        public Criteria andDelongtodeptNotLike(String value) {
            addCriterion("DelongToDept not like", value, "delongtodept");
            return (Criteria) this;
        }

        public Criteria andDelongtodeptIn(List<String> values) {
            addCriterion("DelongToDept in", values, "delongtodept");
            return (Criteria) this;
        }

        public Criteria andDelongtodeptNotIn(List<String> values) {
            addCriterion("DelongToDept not in", values, "delongtodept");
            return (Criteria) this;
        }

        public Criteria andDelongtodeptBetween(String value1, String value2) {
            addCriterion("DelongToDept between", value1, value2, "delongtodept");
            return (Criteria) this;
        }

        public Criteria andDelongtodeptNotBetween(String value1, String value2) {
            addCriterion("DelongToDept not between", value1, value2, "delongtodept");
            return (Criteria) this;
        }

        public Criteria andInblacklistIsNull() {
            addCriterion("InBlacklist is null");
            return (Criteria) this;
        }

        public Criteria andInblacklistIsNotNull() {
            addCriterion("InBlacklist is not null");
            return (Criteria) this;
        }

        public Criteria andInblacklistEqualTo(Boolean value) {
            addCriterion("InBlacklist =", value, "inblacklist");
            return (Criteria) this;
        }

        public Criteria andInblacklistNotEqualTo(Boolean value) {
            addCriterion("InBlacklist <>", value, "inblacklist");
            return (Criteria) this;
        }

        public Criteria andInblacklistGreaterThan(Boolean value) {
            addCriterion("InBlacklist >", value, "inblacklist");
            return (Criteria) this;
        }

        public Criteria andInblacklistGreaterThanOrEqualTo(Boolean value) {
            addCriterion("InBlacklist >=", value, "inblacklist");
            return (Criteria) this;
        }

        public Criteria andInblacklistLessThan(Boolean value) {
            addCriterion("InBlacklist <", value, "inblacklist");
            return (Criteria) this;
        }

        public Criteria andInblacklistLessThanOrEqualTo(Boolean value) {
            addCriterion("InBlacklist <=", value, "inblacklist");
            return (Criteria) this;
        }

        public Criteria andInblacklistIn(List<Boolean> values) {
            addCriterion("InBlacklist in", values, "inblacklist");
            return (Criteria) this;
        }

        public Criteria andInblacklistNotIn(List<Boolean> values) {
            addCriterion("InBlacklist not in", values, "inblacklist");
            return (Criteria) this;
        }

        public Criteria andInblacklistBetween(Boolean value1, Boolean value2) {
            addCriterion("InBlacklist between", value1, value2, "inblacklist");
            return (Criteria) this;
        }

        public Criteria andInblacklistNotBetween(Boolean value1, Boolean value2) {
            addCriterion("InBlacklist not between", value1, value2, "inblacklist");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("Contact is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("Contact is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("Contact =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("Contact <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("Contact >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("Contact >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("Contact <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("Contact <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("Contact like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("Contact not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("Contact in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("Contact not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("Contact between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("Contact not between", value1, value2, "contact");
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

        public Criteria andCommentIsNull() {
            addCriterion("Comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("Comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("Comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("Comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("Comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("Comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("Comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("Comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("Comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("Comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("Comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("Comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("Comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("Comment not between", value1, value2, "comment");
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

        public Criteria andCreditamtIsNull() {
            addCriterion("CreditAmt is null");
            return (Criteria) this;
        }

        public Criteria andCreditamtIsNotNull() {
            addCriterion("CreditAmt is not null");
            return (Criteria) this;
        }

        public Criteria andCreditamtEqualTo(BigDecimal value) {
            addCriterion("CreditAmt =", value, "creditamt");
            return (Criteria) this;
        }

        public Criteria andCreditamtNotEqualTo(BigDecimal value) {
            addCriterion("CreditAmt <>", value, "creditamt");
            return (Criteria) this;
        }

        public Criteria andCreditamtGreaterThan(BigDecimal value) {
            addCriterion("CreditAmt >", value, "creditamt");
            return (Criteria) this;
        }

        public Criteria andCreditamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CreditAmt >=", value, "creditamt");
            return (Criteria) this;
        }

        public Criteria andCreditamtLessThan(BigDecimal value) {
            addCriterion("CreditAmt <", value, "creditamt");
            return (Criteria) this;
        }

        public Criteria andCreditamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CreditAmt <=", value, "creditamt");
            return (Criteria) this;
        }

        public Criteria andCreditamtIn(List<BigDecimal> values) {
            addCriterion("CreditAmt in", values, "creditamt");
            return (Criteria) this;
        }

        public Criteria andCreditamtNotIn(List<BigDecimal> values) {
            addCriterion("CreditAmt not in", values, "creditamt");
            return (Criteria) this;
        }

        public Criteria andCreditamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CreditAmt between", value1, value2, "creditamt");
            return (Criteria) this;
        }

        public Criteria andCreditamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CreditAmt not between", value1, value2, "creditamt");
            return (Criteria) this;
        }

        public Criteria andCreditnumberIsNull() {
            addCriterion("CreditNumber is null");
            return (Criteria) this;
        }

        public Criteria andCreditnumberIsNotNull() {
            addCriterion("CreditNumber is not null");
            return (Criteria) this;
        }

        public Criteria andCreditnumberEqualTo(Integer value) {
            addCriterion("CreditNumber =", value, "creditnumber");
            return (Criteria) this;
        }

        public Criteria andCreditnumberNotEqualTo(Integer value) {
            addCriterion("CreditNumber <>", value, "creditnumber");
            return (Criteria) this;
        }

        public Criteria andCreditnumberGreaterThan(Integer value) {
            addCriterion("CreditNumber >", value, "creditnumber");
            return (Criteria) this;
        }

        public Criteria andCreditnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("CreditNumber >=", value, "creditnumber");
            return (Criteria) this;
        }

        public Criteria andCreditnumberLessThan(Integer value) {
            addCriterion("CreditNumber <", value, "creditnumber");
            return (Criteria) this;
        }

        public Criteria andCreditnumberLessThanOrEqualTo(Integer value) {
            addCriterion("CreditNumber <=", value, "creditnumber");
            return (Criteria) this;
        }

        public Criteria andCreditnumberIn(List<Integer> values) {
            addCriterion("CreditNumber in", values, "creditnumber");
            return (Criteria) this;
        }

        public Criteria andCreditnumberNotIn(List<Integer> values) {
            addCriterion("CreditNumber not in", values, "creditnumber");
            return (Criteria) this;
        }

        public Criteria andCreditnumberBetween(Integer value1, Integer value2) {
            addCriterion("CreditNumber between", value1, value2, "creditnumber");
            return (Criteria) this;
        }

        public Criteria andCreditnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("CreditNumber not between", value1, value2, "creditnumber");
            return (Criteria) this;
        }

        public Criteria andPurchaserorgidIsNull() {
            addCriterion("PurchaserOrgID is null");
            return (Criteria) this;
        }

        public Criteria andPurchaserorgidIsNotNull() {
            addCriterion("PurchaserOrgID is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaserorgidEqualTo(String value) {
            addCriterion("PurchaserOrgID =", value, "purchaserorgid");
            return (Criteria) this;
        }

        public Criteria andPurchaserorgidNotEqualTo(String value) {
            addCriterion("PurchaserOrgID <>", value, "purchaserorgid");
            return (Criteria) this;
        }

        public Criteria andPurchaserorgidGreaterThan(String value) {
            addCriterion("PurchaserOrgID >", value, "purchaserorgid");
            return (Criteria) this;
        }

        public Criteria andPurchaserorgidGreaterThanOrEqualTo(String value) {
            addCriterion("PurchaserOrgID >=", value, "purchaserorgid");
            return (Criteria) this;
        }

        public Criteria andPurchaserorgidLessThan(String value) {
            addCriterion("PurchaserOrgID <", value, "purchaserorgid");
            return (Criteria) this;
        }

        public Criteria andPurchaserorgidLessThanOrEqualTo(String value) {
            addCriterion("PurchaserOrgID <=", value, "purchaserorgid");
            return (Criteria) this;
        }

        public Criteria andPurchaserorgidLike(String value) {
            addCriterion("PurchaserOrgID like", value, "purchaserorgid");
            return (Criteria) this;
        }

        public Criteria andPurchaserorgidNotLike(String value) {
            addCriterion("PurchaserOrgID not like", value, "purchaserorgid");
            return (Criteria) this;
        }

        public Criteria andPurchaserorgidIn(List<String> values) {
            addCriterion("PurchaserOrgID in", values, "purchaserorgid");
            return (Criteria) this;
        }

        public Criteria andPurchaserorgidNotIn(List<String> values) {
            addCriterion("PurchaserOrgID not in", values, "purchaserorgid");
            return (Criteria) this;
        }

        public Criteria andPurchaserorgidBetween(String value1, String value2) {
            addCriterion("PurchaserOrgID between", value1, value2, "purchaserorgid");
            return (Criteria) this;
        }

        public Criteria andPurchaserorgidNotBetween(String value1, String value2) {
            addCriterion("PurchaserOrgID not between", value1, value2, "purchaserorgid");
            return (Criteria) this;
        }

        public Criteria andCrmaddressIsNull() {
            addCriterion("CrmAddress is null");
            return (Criteria) this;
        }

        public Criteria andCrmaddressIsNotNull() {
            addCriterion("CrmAddress is not null");
            return (Criteria) this;
        }

        public Criteria andCrmaddressEqualTo(String value) {
            addCriterion("CrmAddress =", value, "crmaddress");
            return (Criteria) this;
        }

        public Criteria andCrmaddressNotEqualTo(String value) {
            addCriterion("CrmAddress <>", value, "crmaddress");
            return (Criteria) this;
        }

        public Criteria andCrmaddressGreaterThan(String value) {
            addCriterion("CrmAddress >", value, "crmaddress");
            return (Criteria) this;
        }

        public Criteria andCrmaddressGreaterThanOrEqualTo(String value) {
            addCriterion("CrmAddress >=", value, "crmaddress");
            return (Criteria) this;
        }

        public Criteria andCrmaddressLessThan(String value) {
            addCriterion("CrmAddress <", value, "crmaddress");
            return (Criteria) this;
        }

        public Criteria andCrmaddressLessThanOrEqualTo(String value) {
            addCriterion("CrmAddress <=", value, "crmaddress");
            return (Criteria) this;
        }

        public Criteria andCrmaddressLike(String value) {
            addCriterion("CrmAddress like", value, "crmaddress");
            return (Criteria) this;
        }

        public Criteria andCrmaddressNotLike(String value) {
            addCriterion("CrmAddress not like", value, "crmaddress");
            return (Criteria) this;
        }

        public Criteria andCrmaddressIn(List<String> values) {
            addCriterion("CrmAddress in", values, "crmaddress");
            return (Criteria) this;
        }

        public Criteria andCrmaddressNotIn(List<String> values) {
            addCriterion("CrmAddress not in", values, "crmaddress");
            return (Criteria) this;
        }

        public Criteria andCrmaddressBetween(String value1, String value2) {
            addCriterion("CrmAddress between", value1, value2, "crmaddress");
            return (Criteria) this;
        }

        public Criteria andCrmaddressNotBetween(String value1, String value2) {
            addCriterion("CrmAddress not between", value1, value2, "crmaddress");
            return (Criteria) this;
        }

        public Criteria andIsopnecrmaccountIsNull() {
            addCriterion("IsOpneCrmAccount is null");
            return (Criteria) this;
        }

        public Criteria andIsopnecrmaccountIsNotNull() {
            addCriterion("IsOpneCrmAccount is not null");
            return (Criteria) this;
        }

        public Criteria andIsopnecrmaccountEqualTo(Integer value) {
            addCriterion("IsOpneCrmAccount =", value, "isopnecrmaccount");
            return (Criteria) this;
        }

        public Criteria andIsopnecrmaccountNotEqualTo(Integer value) {
            addCriterion("IsOpneCrmAccount <>", value, "isopnecrmaccount");
            return (Criteria) this;
        }

        public Criteria andIsopnecrmaccountGreaterThan(Integer value) {
            addCriterion("IsOpneCrmAccount >", value, "isopnecrmaccount");
            return (Criteria) this;
        }

        public Criteria andIsopnecrmaccountGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsOpneCrmAccount >=", value, "isopnecrmaccount");
            return (Criteria) this;
        }

        public Criteria andIsopnecrmaccountLessThan(Integer value) {
            addCriterion("IsOpneCrmAccount <", value, "isopnecrmaccount");
            return (Criteria) this;
        }

        public Criteria andIsopnecrmaccountLessThanOrEqualTo(Integer value) {
            addCriterion("IsOpneCrmAccount <=", value, "isopnecrmaccount");
            return (Criteria) this;
        }

        public Criteria andIsopnecrmaccountIn(List<Integer> values) {
            addCriterion("IsOpneCrmAccount in", values, "isopnecrmaccount");
            return (Criteria) this;
        }

        public Criteria andIsopnecrmaccountNotIn(List<Integer> values) {
            addCriterion("IsOpneCrmAccount not in", values, "isopnecrmaccount");
            return (Criteria) this;
        }

        public Criteria andIsopnecrmaccountBetween(Integer value1, Integer value2) {
            addCriterion("IsOpneCrmAccount between", value1, value2, "isopnecrmaccount");
            return (Criteria) this;
        }

        public Criteria andIsopnecrmaccountNotBetween(Integer value1, Integer value2) {
            addCriterion("IsOpneCrmAccount not between", value1, value2, "isopnecrmaccount");
            return (Criteria) this;
        }

        public Criteria andCrmaccountorgidIsNull() {
            addCriterion("CrmAccountOrgID is null");
            return (Criteria) this;
        }

        public Criteria andCrmaccountorgidIsNotNull() {
            addCriterion("CrmAccountOrgID is not null");
            return (Criteria) this;
        }

        public Criteria andCrmaccountorgidEqualTo(String value) {
            addCriterion("CrmAccountOrgID =", value, "crmaccountorgid");
            return (Criteria) this;
        }

        public Criteria andCrmaccountorgidNotEqualTo(String value) {
            addCriterion("CrmAccountOrgID <>", value, "crmaccountorgid");
            return (Criteria) this;
        }

        public Criteria andCrmaccountorgidGreaterThan(String value) {
            addCriterion("CrmAccountOrgID >", value, "crmaccountorgid");
            return (Criteria) this;
        }

        public Criteria andCrmaccountorgidGreaterThanOrEqualTo(String value) {
            addCriterion("CrmAccountOrgID >=", value, "crmaccountorgid");
            return (Criteria) this;
        }

        public Criteria andCrmaccountorgidLessThan(String value) {
            addCriterion("CrmAccountOrgID <", value, "crmaccountorgid");
            return (Criteria) this;
        }

        public Criteria andCrmaccountorgidLessThanOrEqualTo(String value) {
            addCriterion("CrmAccountOrgID <=", value, "crmaccountorgid");
            return (Criteria) this;
        }

        public Criteria andCrmaccountorgidLike(String value) {
            addCriterion("CrmAccountOrgID like", value, "crmaccountorgid");
            return (Criteria) this;
        }

        public Criteria andCrmaccountorgidNotLike(String value) {
            addCriterion("CrmAccountOrgID not like", value, "crmaccountorgid");
            return (Criteria) this;
        }

        public Criteria andCrmaccountorgidIn(List<String> values) {
            addCriterion("CrmAccountOrgID in", values, "crmaccountorgid");
            return (Criteria) this;
        }

        public Criteria andCrmaccountorgidNotIn(List<String> values) {
            addCriterion("CrmAccountOrgID not in", values, "crmaccountorgid");
            return (Criteria) this;
        }

        public Criteria andCrmaccountorgidBetween(String value1, String value2) {
            addCriterion("CrmAccountOrgID between", value1, value2, "crmaccountorgid");
            return (Criteria) this;
        }

        public Criteria andCrmaccountorgidNotBetween(String value1, String value2) {
            addCriterion("CrmAccountOrgID not between", value1, value2, "crmaccountorgid");
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