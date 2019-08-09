package com.holyrobot.con_product.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProTourPricepolicyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProTourPricepolicyExample() {
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

        public Criteria andTouristtypeIsNull() {
            addCriterion("TouristType is null");
            return (Criteria) this;
        }

        public Criteria andTouristtypeIsNotNull() {
            addCriterion("TouristType is not null");
            return (Criteria) this;
        }

        public Criteria andTouristtypeEqualTo(Integer value) {
            addCriterion("TouristType =", value, "touristtype");
            return (Criteria) this;
        }

        public Criteria andTouristtypeNotEqualTo(Integer value) {
            addCriterion("TouristType <>", value, "touristtype");
            return (Criteria) this;
        }

        public Criteria andTouristtypeGreaterThan(Integer value) {
            addCriterion("TouristType >", value, "touristtype");
            return (Criteria) this;
        }

        public Criteria andTouristtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("TouristType >=", value, "touristtype");
            return (Criteria) this;
        }

        public Criteria andTouristtypeLessThan(Integer value) {
            addCriterion("TouristType <", value, "touristtype");
            return (Criteria) this;
        }

        public Criteria andTouristtypeLessThanOrEqualTo(Integer value) {
            addCriterion("TouristType <=", value, "touristtype");
            return (Criteria) this;
        }

        public Criteria andTouristtypeIn(List<Integer> values) {
            addCriterion("TouristType in", values, "touristtype");
            return (Criteria) this;
        }

        public Criteria andTouristtypeNotIn(List<Integer> values) {
            addCriterion("TouristType not in", values, "touristtype");
            return (Criteria) this;
        }

        public Criteria andTouristtypeBetween(Integer value1, Integer value2) {
            addCriterion("TouristType between", value1, value2, "touristtype");
            return (Criteria) this;
        }

        public Criteria andTouristtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("TouristType not between", value1, value2, "touristtype");
            return (Criteria) this;
        }

        public Criteria andPolicynameIsNull() {
            addCriterion("PolicyName is null");
            return (Criteria) this;
        }

        public Criteria andPolicynameIsNotNull() {
            addCriterion("PolicyName is not null");
            return (Criteria) this;
        }

        public Criteria andPolicynameEqualTo(String value) {
            addCriterion("PolicyName =", value, "policyname");
            return (Criteria) this;
        }

        public Criteria andPolicynameNotEqualTo(String value) {
            addCriterion("PolicyName <>", value, "policyname");
            return (Criteria) this;
        }

        public Criteria andPolicynameGreaterThan(String value) {
            addCriterion("PolicyName >", value, "policyname");
            return (Criteria) this;
        }

        public Criteria andPolicynameGreaterThanOrEqualTo(String value) {
            addCriterion("PolicyName >=", value, "policyname");
            return (Criteria) this;
        }

        public Criteria andPolicynameLessThan(String value) {
            addCriterion("PolicyName <", value, "policyname");
            return (Criteria) this;
        }

        public Criteria andPolicynameLessThanOrEqualTo(String value) {
            addCriterion("PolicyName <=", value, "policyname");
            return (Criteria) this;
        }

        public Criteria andPolicynameLike(String value) {
            addCriterion("PolicyName like", value, "policyname");
            return (Criteria) this;
        }

        public Criteria andPolicynameNotLike(String value) {
            addCriterion("PolicyName not like", value, "policyname");
            return (Criteria) this;
        }

        public Criteria andPolicynameIn(List<String> values) {
            addCriterion("PolicyName in", values, "policyname");
            return (Criteria) this;
        }

        public Criteria andPolicynameNotIn(List<String> values) {
            addCriterion("PolicyName not in", values, "policyname");
            return (Criteria) this;
        }

        public Criteria andPolicynameBetween(String value1, String value2) {
            addCriterion("PolicyName between", value1, value2, "policyname");
            return (Criteria) this;
        }

        public Criteria andPolicynameNotBetween(String value1, String value2) {
            addCriterion("PolicyName not between", value1, value2, "policyname");
            return (Criteria) this;
        }

        public Criteria andSalespriceIsNull() {
            addCriterion("SalesPrice is null");
            return (Criteria) this;
        }

        public Criteria andSalespriceIsNotNull() {
            addCriterion("SalesPrice is not null");
            return (Criteria) this;
        }

        public Criteria andSalespriceEqualTo(BigDecimal value) {
            addCriterion("SalesPrice =", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceNotEqualTo(BigDecimal value) {
            addCriterion("SalesPrice <>", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceGreaterThan(BigDecimal value) {
            addCriterion("SalesPrice >", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SalesPrice >=", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceLessThan(BigDecimal value) {
            addCriterion("SalesPrice <", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SalesPrice <=", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceIn(List<BigDecimal> values) {
            addCriterion("SalesPrice in", values, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceNotIn(List<BigDecimal> values) {
            addCriterion("SalesPrice not in", values, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SalesPrice between", value1, value2, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SalesPrice not between", value1, value2, "salesprice");
            return (Criteria) this;
        }

        public Criteria andRebatepriceIsNull() {
            addCriterion("RebatePrice is null");
            return (Criteria) this;
        }

        public Criteria andRebatepriceIsNotNull() {
            addCriterion("RebatePrice is not null");
            return (Criteria) this;
        }

        public Criteria andRebatepriceEqualTo(BigDecimal value) {
            addCriterion("RebatePrice =", value, "rebateprice");
            return (Criteria) this;
        }

        public Criteria andRebatepriceNotEqualTo(BigDecimal value) {
            addCriterion("RebatePrice <>", value, "rebateprice");
            return (Criteria) this;
        }

        public Criteria andRebatepriceGreaterThan(BigDecimal value) {
            addCriterion("RebatePrice >", value, "rebateprice");
            return (Criteria) this;
        }

        public Criteria andRebatepriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RebatePrice >=", value, "rebateprice");
            return (Criteria) this;
        }

        public Criteria andRebatepriceLessThan(BigDecimal value) {
            addCriterion("RebatePrice <", value, "rebateprice");
            return (Criteria) this;
        }

        public Criteria andRebatepriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RebatePrice <=", value, "rebateprice");
            return (Criteria) this;
        }

        public Criteria andRebatepriceIn(List<BigDecimal> values) {
            addCriterion("RebatePrice in", values, "rebateprice");
            return (Criteria) this;
        }

        public Criteria andRebatepriceNotIn(List<BigDecimal> values) {
            addCriterion("RebatePrice not in", values, "rebateprice");
            return (Criteria) this;
        }

        public Criteria andRebatepriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RebatePrice between", value1, value2, "rebateprice");
            return (Criteria) this;
        }

        public Criteria andRebatepriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RebatePrice not between", value1, value2, "rebateprice");
            return (Criteria) this;
        }

        public Criteria andSingleroompriceIsNull() {
            addCriterion("SingleRoomPrice is null");
            return (Criteria) this;
        }

        public Criteria andSingleroompriceIsNotNull() {
            addCriterion("SingleRoomPrice is not null");
            return (Criteria) this;
        }

        public Criteria andSingleroompriceEqualTo(BigDecimal value) {
            addCriterion("SingleRoomPrice =", value, "singleroomprice");
            return (Criteria) this;
        }

        public Criteria andSingleroompriceNotEqualTo(BigDecimal value) {
            addCriterion("SingleRoomPrice <>", value, "singleroomprice");
            return (Criteria) this;
        }

        public Criteria andSingleroompriceGreaterThan(BigDecimal value) {
            addCriterion("SingleRoomPrice >", value, "singleroomprice");
            return (Criteria) this;
        }

        public Criteria andSingleroompriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SingleRoomPrice >=", value, "singleroomprice");
            return (Criteria) this;
        }

        public Criteria andSingleroompriceLessThan(BigDecimal value) {
            addCriterion("SingleRoomPrice <", value, "singleroomprice");
            return (Criteria) this;
        }

        public Criteria andSingleroompriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SingleRoomPrice <=", value, "singleroomprice");
            return (Criteria) this;
        }

        public Criteria andSingleroompriceIn(List<BigDecimal> values) {
            addCriterion("SingleRoomPrice in", values, "singleroomprice");
            return (Criteria) this;
        }

        public Criteria andSingleroompriceNotIn(List<BigDecimal> values) {
            addCriterion("SingleRoomPrice not in", values, "singleroomprice");
            return (Criteria) this;
        }

        public Criteria andSingleroompriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SingleRoomPrice between", value1, value2, "singleroomprice");
            return (Criteria) this;
        }

        public Criteria andSingleroompriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SingleRoomPrice not between", value1, value2, "singleroomprice");
            return (Criteria) this;
        }

        public Criteria andProcostIsNull() {
            addCriterion("ProCost is null");
            return (Criteria) this;
        }

        public Criteria andProcostIsNotNull() {
            addCriterion("ProCost is not null");
            return (Criteria) this;
        }

        public Criteria andProcostEqualTo(BigDecimal value) {
            addCriterion("ProCost =", value, "procost");
            return (Criteria) this;
        }

        public Criteria andProcostNotEqualTo(BigDecimal value) {
            addCriterion("ProCost <>", value, "procost");
            return (Criteria) this;
        }

        public Criteria andProcostGreaterThan(BigDecimal value) {
            addCriterion("ProCost >", value, "procost");
            return (Criteria) this;
        }

        public Criteria andProcostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ProCost >=", value, "procost");
            return (Criteria) this;
        }

        public Criteria andProcostLessThan(BigDecimal value) {
            addCriterion("ProCost <", value, "procost");
            return (Criteria) this;
        }

        public Criteria andProcostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ProCost <=", value, "procost");
            return (Criteria) this;
        }

        public Criteria andProcostIn(List<BigDecimal> values) {
            addCriterion("ProCost in", values, "procost");
            return (Criteria) this;
        }

        public Criteria andProcostNotIn(List<BigDecimal> values) {
            addCriterion("ProCost not in", values, "procost");
            return (Criteria) this;
        }

        public Criteria andProcostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ProCost between", value1, value2, "procost");
            return (Criteria) this;
        }

        public Criteria andProcostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ProCost not between", value1, value2, "procost");
            return (Criteria) this;
        }

        public Criteria andIsdefaultIsNull() {
            addCriterion("IsDefault is null");
            return (Criteria) this;
        }

        public Criteria andIsdefaultIsNotNull() {
            addCriterion("IsDefault is not null");
            return (Criteria) this;
        }

        public Criteria andIsdefaultEqualTo(Boolean value) {
            addCriterion("IsDefault =", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotEqualTo(Boolean value) {
            addCriterion("IsDefault <>", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultGreaterThan(Boolean value) {
            addCriterion("IsDefault >", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsDefault >=", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultLessThan(Boolean value) {
            addCriterion("IsDefault <", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultLessThanOrEqualTo(Boolean value) {
            addCriterion("IsDefault <=", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultIn(List<Boolean> values) {
            addCriterion("IsDefault in", values, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotIn(List<Boolean> values) {
            addCriterion("IsDefault not in", values, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultBetween(Boolean value1, Boolean value2) {
            addCriterion("IsDefault between", value1, value2, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsDefault not between", value1, value2, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsoccupyseatIsNull() {
            addCriterion("IsOccupySeat is null");
            return (Criteria) this;
        }

        public Criteria andIsoccupyseatIsNotNull() {
            addCriterion("IsOccupySeat is not null");
            return (Criteria) this;
        }

        public Criteria andIsoccupyseatEqualTo(Boolean value) {
            addCriterion("IsOccupySeat =", value, "isoccupyseat");
            return (Criteria) this;
        }

        public Criteria andIsoccupyseatNotEqualTo(Boolean value) {
            addCriterion("IsOccupySeat <>", value, "isoccupyseat");
            return (Criteria) this;
        }

        public Criteria andIsoccupyseatGreaterThan(Boolean value) {
            addCriterion("IsOccupySeat >", value, "isoccupyseat");
            return (Criteria) this;
        }

        public Criteria andIsoccupyseatGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsOccupySeat >=", value, "isoccupyseat");
            return (Criteria) this;
        }

        public Criteria andIsoccupyseatLessThan(Boolean value) {
            addCriterion("IsOccupySeat <", value, "isoccupyseat");
            return (Criteria) this;
        }

        public Criteria andIsoccupyseatLessThanOrEqualTo(Boolean value) {
            addCriterion("IsOccupySeat <=", value, "isoccupyseat");
            return (Criteria) this;
        }

        public Criteria andIsoccupyseatIn(List<Boolean> values) {
            addCriterion("IsOccupySeat in", values, "isoccupyseat");
            return (Criteria) this;
        }

        public Criteria andIsoccupyseatNotIn(List<Boolean> values) {
            addCriterion("IsOccupySeat not in", values, "isoccupyseat");
            return (Criteria) this;
        }

        public Criteria andIsoccupyseatBetween(Boolean value1, Boolean value2) {
            addCriterion("IsOccupySeat between", value1, value2, "isoccupyseat");
            return (Criteria) this;
        }

        public Criteria andIsoccupyseatNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsOccupySeat not between", value1, value2, "isoccupyseat");
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

        public Criteria andSitenameIsNull() {
            addCriterion("SiteName is null");
            return (Criteria) this;
        }

        public Criteria andSitenameIsNotNull() {
            addCriterion("SiteName is not null");
            return (Criteria) this;
        }

        public Criteria andSitenameEqualTo(String value) {
            addCriterion("SiteName =", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameNotEqualTo(String value) {
            addCriterion("SiteName <>", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameGreaterThan(String value) {
            addCriterion("SiteName >", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameGreaterThanOrEqualTo(String value) {
            addCriterion("SiteName >=", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameLessThan(String value) {
            addCriterion("SiteName <", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameLessThanOrEqualTo(String value) {
            addCriterion("SiteName <=", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameLike(String value) {
            addCriterion("SiteName like", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameNotLike(String value) {
            addCriterion("SiteName not like", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameIn(List<String> values) {
            addCriterion("SiteName in", values, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameNotIn(List<String> values) {
            addCriterion("SiteName not in", values, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameBetween(String value1, String value2) {
            addCriterion("SiteName between", value1, value2, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameNotBetween(String value1, String value2) {
            addCriterion("SiteName not between", value1, value2, "sitename");
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

        public Criteria andDirectpriceIsNull() {
            addCriterion("DirectPrice is null");
            return (Criteria) this;
        }

        public Criteria andDirectpriceIsNotNull() {
            addCriterion("DirectPrice is not null");
            return (Criteria) this;
        }

        public Criteria andDirectpriceEqualTo(BigDecimal value) {
            addCriterion("DirectPrice =", value, "directprice");
            return (Criteria) this;
        }

        public Criteria andDirectpriceNotEqualTo(BigDecimal value) {
            addCriterion("DirectPrice <>", value, "directprice");
            return (Criteria) this;
        }

        public Criteria andDirectpriceGreaterThan(BigDecimal value) {
            addCriterion("DirectPrice >", value, "directprice");
            return (Criteria) this;
        }

        public Criteria andDirectpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DirectPrice >=", value, "directprice");
            return (Criteria) this;
        }

        public Criteria andDirectpriceLessThan(BigDecimal value) {
            addCriterion("DirectPrice <", value, "directprice");
            return (Criteria) this;
        }

        public Criteria andDirectpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DirectPrice <=", value, "directprice");
            return (Criteria) this;
        }

        public Criteria andDirectpriceIn(List<BigDecimal> values) {
            addCriterion("DirectPrice in", values, "directprice");
            return (Criteria) this;
        }

        public Criteria andDirectpriceNotIn(List<BigDecimal> values) {
            addCriterion("DirectPrice not in", values, "directprice");
            return (Criteria) this;
        }

        public Criteria andDirectpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DirectPrice between", value1, value2, "directprice");
            return (Criteria) this;
        }

        public Criteria andDirectpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DirectPrice not between", value1, value2, "directprice");
            return (Criteria) this;
        }

        public Criteria andCostpolicyidIsNull() {
            addCriterion("CostPolicyID is null");
            return (Criteria) this;
        }

        public Criteria andCostpolicyidIsNotNull() {
            addCriterion("CostPolicyID is not null");
            return (Criteria) this;
        }

        public Criteria andCostpolicyidEqualTo(String value) {
            addCriterion("CostPolicyID =", value, "costpolicyid");
            return (Criteria) this;
        }

        public Criteria andCostpolicyidNotEqualTo(String value) {
            addCriterion("CostPolicyID <>", value, "costpolicyid");
            return (Criteria) this;
        }

        public Criteria andCostpolicyidGreaterThan(String value) {
            addCriterion("CostPolicyID >", value, "costpolicyid");
            return (Criteria) this;
        }

        public Criteria andCostpolicyidGreaterThanOrEqualTo(String value) {
            addCriterion("CostPolicyID >=", value, "costpolicyid");
            return (Criteria) this;
        }

        public Criteria andCostpolicyidLessThan(String value) {
            addCriterion("CostPolicyID <", value, "costpolicyid");
            return (Criteria) this;
        }

        public Criteria andCostpolicyidLessThanOrEqualTo(String value) {
            addCriterion("CostPolicyID <=", value, "costpolicyid");
            return (Criteria) this;
        }

        public Criteria andCostpolicyidLike(String value) {
            addCriterion("CostPolicyID like", value, "costpolicyid");
            return (Criteria) this;
        }

        public Criteria andCostpolicyidNotLike(String value) {
            addCriterion("CostPolicyID not like", value, "costpolicyid");
            return (Criteria) this;
        }

        public Criteria andCostpolicyidIn(List<String> values) {
            addCriterion("CostPolicyID in", values, "costpolicyid");
            return (Criteria) this;
        }

        public Criteria andCostpolicyidNotIn(List<String> values) {
            addCriterion("CostPolicyID not in", values, "costpolicyid");
            return (Criteria) this;
        }

        public Criteria andCostpolicyidBetween(String value1, String value2) {
            addCriterion("CostPolicyID between", value1, value2, "costpolicyid");
            return (Criteria) this;
        }

        public Criteria andCostpolicyidNotBetween(String value1, String value2) {
            addCriterion("CostPolicyID not between", value1, value2, "costpolicyid");
            return (Criteria) this;
        }
        public Criteria andTailsalespriceIsNull() {
            addCriterion("TailSalesPrice is null");
            return (Criteria) this;
        }

        public Criteria andTailsalespriceIsNotNull() {
            addCriterion("TailSalesPrice is not null");
            return (Criteria) this;
        }

        public Criteria andTailsalespriceEqualTo(BigDecimal value) {
            addCriterion("TailSalesPrice =", value, "tailsalesprice");
            return (Criteria) this;
        }

        public Criteria andTailsalespriceNotEqualTo(BigDecimal value) {
            addCriterion("TailSalesPrice <>", value, "tailsalesprice");
            return (Criteria) this;
        }

        public Criteria andTailsalespriceGreaterThan(BigDecimal value) {
            addCriterion("TailSalesPrice >", value, "tailsalesprice");
            return (Criteria) this;
        }

        public Criteria andTailsalespriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TailSalesPrice >=", value, "tailsalesprice");
            return (Criteria) this;
        }

        public Criteria andTailsalespriceLessThan(BigDecimal value) {
            addCriterion("TailSalesPrice <", value, "tailsalesprice");
            return (Criteria) this;
        }

        public Criteria andTailsalespriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TailSalesPrice <=", value, "tailsalesprice");
            return (Criteria) this;
        }

        public Criteria andTailsalespriceIn(List<BigDecimal> values) {
            addCriterion("TailSalesPrice in", values, "tailsalesprice");
            return (Criteria) this;
        }

        public Criteria andTailsalespriceNotIn(List<BigDecimal> values) {
            addCriterion("TailSalesPrice not in", values, "tailsalesprice");
            return (Criteria) this;
        }

        public Criteria andTailsalespriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TailSalesPrice between", value1, value2, "tailsalesprice");
            return (Criteria) this;
        }

        public Criteria andTailsalespriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TailSalesPrice not between", value1, value2, "tailsalesprice");
            return (Criteria) this;
        }

        public Criteria andTaildirectpriceIsNull() {
            addCriterion("TailDirectPrice is null");
            return (Criteria) this;
        }

        public Criteria andTaildirectpriceIsNotNull() {
            addCriterion("TailDirectPrice is not null");
            return (Criteria) this;
        }

        public Criteria andTaildirectpriceEqualTo(BigDecimal value) {
            addCriterion("TailDirectPrice =", value, "taildirectprice");
            return (Criteria) this;
        }

        public Criteria andTaildirectpriceNotEqualTo(BigDecimal value) {
            addCriterion("TailDirectPrice <>", value, "taildirectprice");
            return (Criteria) this;
        }

        public Criteria andTaildirectpriceGreaterThan(BigDecimal value) {
            addCriterion("TailDirectPrice >", value, "taildirectprice");
            return (Criteria) this;
        }

        public Criteria andTaildirectpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TailDirectPrice >=", value, "taildirectprice");
            return (Criteria) this;
        }

        public Criteria andTaildirectpriceLessThan(BigDecimal value) {
            addCriterion("TailDirectPrice <", value, "taildirectprice");
            return (Criteria) this;
        }

        public Criteria andTaildirectpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TailDirectPrice <=", value, "taildirectprice");
            return (Criteria) this;
        }

        public Criteria andTaildirectpriceIn(List<BigDecimal> values) {
            addCriterion("TailDirectPrice in", values, "taildirectprice");
            return (Criteria) this;
        }

        public Criteria andTaildirectpriceNotIn(List<BigDecimal> values) {
            addCriterion("TailDirectPrice not in", values, "taildirectprice");
            return (Criteria) this;
        }

        public Criteria andTaildirectpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TailDirectPrice between", value1, value2, "taildirectprice");
            return (Criteria) this;
        }

        public Criteria andTaildirectpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TailDirectPrice not between", value1, value2, "taildirectprice");
            return (Criteria) this;
        }

        public Criteria andBeforediscountsalespriceIsNull() {
            addCriterion("BeforeDiscountSalesPrice is null");
            return (Criteria) this;
        }

        public Criteria andBeforediscountsalespriceIsNotNull() {
            addCriterion("BeforeDiscountSalesPrice is not null");
            return (Criteria) this;
        }

        public Criteria andBeforediscountsalespriceEqualTo(BigDecimal value) {
            addCriterion("BeforeDiscountSalesPrice =", value, "beforediscountsalesprice");
            return (Criteria) this;
        }

        public Criteria andBeforediscountsalespriceNotEqualTo(BigDecimal value) {
            addCriterion("BeforeDiscountSalesPrice <>", value, "beforediscountsalesprice");
            return (Criteria) this;
        }

        public Criteria andBeforediscountsalespriceGreaterThan(BigDecimal value) {
            addCriterion("BeforeDiscountSalesPrice >", value, "beforediscountsalesprice");
            return (Criteria) this;
        }

        public Criteria andBeforediscountsalespriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BeforeDiscountSalesPrice >=", value, "beforediscountsalesprice");
            return (Criteria) this;
        }

        public Criteria andBeforediscountsalespriceLessThan(BigDecimal value) {
            addCriterion("BeforeDiscountSalesPrice <", value, "beforediscountsalesprice");
            return (Criteria) this;
        }

        public Criteria andBeforediscountsalespriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BeforeDiscountSalesPrice <=", value, "beforediscountsalesprice");
            return (Criteria) this;
        }

        public Criteria andBeforediscountsalespriceIn(List<BigDecimal> values) {
            addCriterion("BeforeDiscountSalesPrice in", values, "beforediscountsalesprice");
            return (Criteria) this;
        }

        public Criteria andBeforediscountsalespriceNotIn(List<BigDecimal> values) {
            addCriterion("BeforeDiscountSalesPrice not in", values, "beforediscountsalesprice");
            return (Criteria) this;
        }

        public Criteria andBeforediscountsalespriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BeforeDiscountSalesPrice between", value1, value2, "beforediscountsalesprice");
            return (Criteria) this;
        }

        public Criteria andBeforediscountsalespriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BeforeDiscountSalesPrice not between", value1, value2, "beforediscountsalesprice");
            return (Criteria) this;
        }

        public Criteria andBeforediscountdirectpriceIsNull() {
            addCriterion("BeforeDiscountDirectPrice is null");
            return (Criteria) this;
        }

        public Criteria andBeforediscountdirectpriceIsNotNull() {
            addCriterion("BeforeDiscountDirectPrice is not null");
            return (Criteria) this;
        }

        public Criteria andBeforediscountdirectpriceEqualTo(BigDecimal value) {
            addCriterion("BeforeDiscountDirectPrice =", value, "beforediscountdirectprice");
            return (Criteria) this;
        }

        public Criteria andBeforediscountdirectpriceNotEqualTo(BigDecimal value) {
            addCriterion("BeforeDiscountDirectPrice <>", value, "beforediscountdirectprice");
            return (Criteria) this;
        }

        public Criteria andBeforediscountdirectpriceGreaterThan(BigDecimal value) {
            addCriterion("BeforeDiscountDirectPrice >", value, "beforediscountdirectprice");
            return (Criteria) this;
        }

        public Criteria andBeforediscountdirectpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BeforeDiscountDirectPrice >=", value, "beforediscountdirectprice");
            return (Criteria) this;
        }

        public Criteria andBeforediscountdirectpriceLessThan(BigDecimal value) {
            addCriterion("BeforeDiscountDirectPrice <", value, "beforediscountdirectprice");
            return (Criteria) this;
        }

        public Criteria andBeforediscountdirectpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BeforeDiscountDirectPrice <=", value, "beforediscountdirectprice");
            return (Criteria) this;
        }

        public Criteria andBeforediscountdirectpriceIn(List<BigDecimal> values) {
            addCriterion("BeforeDiscountDirectPrice in", values, "beforediscountdirectprice");
            return (Criteria) this;
        }

        public Criteria andBeforediscountdirectpriceNotIn(List<BigDecimal> values) {
            addCriterion("BeforeDiscountDirectPrice not in", values, "beforediscountdirectprice");
            return (Criteria) this;
        }

        public Criteria andBeforediscountdirectpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BeforeDiscountDirectPrice between", value1, value2, "beforediscountdirectprice");
            return (Criteria) this;
        }

        public Criteria andBeforediscountdirectpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BeforeDiscountDirectPrice not between", value1, value2, "beforediscountdirectprice");
            return (Criteria) this;
        }

        public Criteria andDiscountsalespriceIsNull() {
            addCriterion("DiscountSalesPrice is null");
            return (Criteria) this;
        }

        public Criteria andDiscountsalespriceIsNotNull() {
            addCriterion("DiscountSalesPrice is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountsalespriceEqualTo(BigDecimal value) {
            addCriterion("DiscountSalesPrice =", value, "discountsalesprice");
            return (Criteria) this;
        }

        public Criteria andDiscountsalespriceNotEqualTo(BigDecimal value) {
            addCriterion("DiscountSalesPrice <>", value, "discountsalesprice");
            return (Criteria) this;
        }

        public Criteria andDiscountsalespriceGreaterThan(BigDecimal value) {
            addCriterion("DiscountSalesPrice >", value, "discountsalesprice");
            return (Criteria) this;
        }

        public Criteria andDiscountsalespriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DiscountSalesPrice >=", value, "discountsalesprice");
            return (Criteria) this;
        }

        public Criteria andDiscountsalespriceLessThan(BigDecimal value) {
            addCriterion("DiscountSalesPrice <", value, "discountsalesprice");
            return (Criteria) this;
        }

        public Criteria andDiscountsalespriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DiscountSalesPrice <=", value, "discountsalesprice");
            return (Criteria) this;
        }

        public Criteria andDiscountsalespriceIn(List<BigDecimal> values) {
            addCriterion("DiscountSalesPrice in", values, "discountsalesprice");
            return (Criteria) this;
        }

        public Criteria andDiscountsalespriceNotIn(List<BigDecimal> values) {
            addCriterion("DiscountSalesPrice not in", values, "discountsalesprice");
            return (Criteria) this;
        }

        public Criteria andDiscountsalespriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DiscountSalesPrice between", value1, value2, "discountsalesprice");
            return (Criteria) this;
        }

        public Criteria andDiscountsalespriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DiscountSalesPrice not between", value1, value2, "discountsalesprice");
            return (Criteria) this;
        }

        public Criteria andDiscountdirectpriceIsNull() {
            addCriterion("DiscountDirectPrice is null");
            return (Criteria) this;
        }

        public Criteria andDiscountdirectpriceIsNotNull() {
            addCriterion("DiscountDirectPrice is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountdirectpriceEqualTo(BigDecimal value) {
            addCriterion("DiscountDirectPrice =", value, "discountdirectprice");
            return (Criteria) this;
        }

        public Criteria andDiscountdirectpriceNotEqualTo(BigDecimal value) {
            addCriterion("DiscountDirectPrice <>", value, "discountdirectprice");
            return (Criteria) this;
        }

        public Criteria andDiscountdirectpriceGreaterThan(BigDecimal value) {
            addCriterion("DiscountDirectPrice >", value, "discountdirectprice");
            return (Criteria) this;
        }

        public Criteria andDiscountdirectpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DiscountDirectPrice >=", value, "discountdirectprice");
            return (Criteria) this;
        }

        public Criteria andDiscountdirectpriceLessThan(BigDecimal value) {
            addCriterion("DiscountDirectPrice <", value, "discountdirectprice");
            return (Criteria) this;
        }

        public Criteria andDiscountdirectpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DiscountDirectPrice <=", value, "discountdirectprice");
            return (Criteria) this;
        }

        public Criteria andDiscountdirectpriceIn(List<BigDecimal> values) {
            addCriterion("DiscountDirectPrice in", values, "discountdirectprice");
            return (Criteria) this;
        }

        public Criteria andDiscountdirectpriceNotIn(List<BigDecimal> values) {
            addCriterion("DiscountDirectPrice not in", values, "discountdirectprice");
            return (Criteria) this;
        }

        public Criteria andDiscountdirectpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DiscountDirectPrice between", value1, value2, "discountdirectprice");
            return (Criteria) this;
        }

        public Criteria andDiscountdirectpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DiscountDirectPrice not between", value1, value2, "discountdirectprice");
            return (Criteria) this;
        }

        public Criteria andDiscountvalueIsNull() {
            addCriterion("DiscountValue is null");
            return (Criteria) this;
        }

        public Criteria andDiscountvalueIsNotNull() {
            addCriterion("DiscountValue is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountvalueEqualTo(BigDecimal value) {
            addCriterion("DiscountValue =", value, "discountvalue");
            return (Criteria) this;
        }

        public Criteria andDiscountvalueNotEqualTo(BigDecimal value) {
            addCriterion("DiscountValue <>", value, "discountvalue");
            return (Criteria) this;
        }

        public Criteria andDiscountvalueGreaterThan(BigDecimal value) {
            addCriterion("DiscountValue >", value, "discountvalue");
            return (Criteria) this;
        }

        public Criteria andDiscountvalueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DiscountValue >=", value, "discountvalue");
            return (Criteria) this;
        }

        public Criteria andDiscountvalueLessThan(BigDecimal value) {
            addCriterion("DiscountValue <", value, "discountvalue");
            return (Criteria) this;
        }

        public Criteria andDiscountvalueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DiscountValue <=", value, "discountvalue");
            return (Criteria) this;
        }

        public Criteria andDiscountvalueIn(List<BigDecimal> values) {
            addCriterion("DiscountValue in", values, "discountvalue");
            return (Criteria) this;
        }

        public Criteria andDiscountvalueNotIn(List<BigDecimal> values) {
            addCriterion("DiscountValue not in", values, "discountvalue");
            return (Criteria) this;
        }

        public Criteria andDiscountvalueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DiscountValue between", value1, value2, "discountvalue");
            return (Criteria) this;
        }

        public Criteria andDiscountvalueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DiscountValue not between", value1, value2, "discountvalue");
            return (Criteria) this;
        }

        public Criteria andDiscounttypeIsNull() {
            addCriterion("DiscountType is null");
            return (Criteria) this;
        }

        public Criteria andDiscounttypeIsNotNull() {
            addCriterion("DiscountType is not null");
            return (Criteria) this;
        }

        public Criteria andDiscounttypeEqualTo(Integer value) {
            addCriterion("DiscountType =", value, "discounttype");
            return (Criteria) this;
        }

        public Criteria andDiscounttypeNotEqualTo(Integer value) {
            addCriterion("DiscountType <>", value, "discounttype");
            return (Criteria) this;
        }

        public Criteria andDiscounttypeGreaterThan(Integer value) {
            addCriterion("DiscountType >", value, "discounttype");
            return (Criteria) this;
        }

        public Criteria andDiscounttypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("DiscountType >=", value, "discounttype");
            return (Criteria) this;
        }

        public Criteria andDiscounttypeLessThan(Integer value) {
            addCriterion("DiscountType <", value, "discounttype");
            return (Criteria) this;
        }

        public Criteria andDiscounttypeLessThanOrEqualTo(Integer value) {
            addCriterion("DiscountType <=", value, "discounttype");
            return (Criteria) this;
        }

        public Criteria andDiscounttypeIn(List<Integer> values) {
            addCriterion("DiscountType in", values, "discounttype");
            return (Criteria) this;
        }

        public Criteria andDiscounttypeNotIn(List<Integer> values) {
            addCriterion("DiscountType not in", values, "discounttype");
            return (Criteria) this;
        }

        public Criteria andDiscounttypeBetween(Integer value1, Integer value2) {
            addCriterion("DiscountType between", value1, value2, "discounttype");
            return (Criteria) this;
        }

        public Criteria andDiscounttypeNotBetween(Integer value1, Integer value2) {
            addCriterion("DiscountType not between", value1, value2, "discounttype");
            return (Criteria) this;
        }

        public Criteria andVolunteerdirectpriceIsNull() {
            addCriterion("VolunteerDirectPrice is null");
            return (Criteria) this;
        }

        public Criteria andVolunteerdirectpriceIsNotNull() {
            addCriterion("VolunteerDirectPrice is not null");
            return (Criteria) this;
        }

        public Criteria andVolunteerdirectpriceEqualTo(BigDecimal value) {
            addCriterion("VolunteerDirectPrice =", value, "volunteerdirectprice");
            return (Criteria) this;
        }

        public Criteria andVolunteerdirectpriceNotEqualTo(BigDecimal value) {
            addCriterion("VolunteerDirectPrice <>", value, "volunteerdirectprice");
            return (Criteria) this;
        }

        public Criteria andVolunteerdirectpriceGreaterThan(BigDecimal value) {
            addCriterion("VolunteerDirectPrice >", value, "volunteerdirectprice");
            return (Criteria) this;
        }

        public Criteria andVolunteerdirectpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VolunteerDirectPrice >=", value, "volunteerdirectprice");
            return (Criteria) this;
        }

        public Criteria andVolunteerdirectpriceLessThan(BigDecimal value) {
            addCriterion("VolunteerDirectPrice <", value, "volunteerdirectprice");
            return (Criteria) this;
        }

        public Criteria andVolunteerdirectpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VolunteerDirectPrice <=", value, "volunteerdirectprice");
            return (Criteria) this;
        }

        public Criteria andVolunteerdirectpriceIn(List<BigDecimal> values) {
            addCriterion("VolunteerDirectPrice in", values, "volunteerdirectprice");
            return (Criteria) this;
        }

        public Criteria andVolunteerdirectpriceNotIn(List<BigDecimal> values) {
            addCriterion("VolunteerDirectPrice not in", values, "volunteerdirectprice");
            return (Criteria) this;
        }

        public Criteria andVolunteerdirectpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VolunteerDirectPrice between", value1, value2, "volunteerdirectprice");
            return (Criteria) this;
        }

        public Criteria andVolunteerdirectpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VolunteerDirectPrice not between", value1, value2, "volunteerdirectprice");
            return (Criteria) this;
        }

        public Criteria andVolunteerrebatepriceIsNull() {
            addCriterion("VolunteerRebatePrice is null");
            return (Criteria) this;
        }

        public Criteria andVolunteerrebatepriceIsNotNull() {
            addCriterion("VolunteerRebatePrice is not null");
            return (Criteria) this;
        }

        public Criteria andVolunteerrebatepriceEqualTo(BigDecimal value) {
            addCriterion("VolunteerRebatePrice =", value, "volunteerrebateprice");
            return (Criteria) this;
        }

        public Criteria andVolunteerrebatepriceNotEqualTo(BigDecimal value) {
            addCriterion("VolunteerRebatePrice <>", value, "volunteerrebateprice");
            return (Criteria) this;
        }

        public Criteria andVolunteerrebatepriceGreaterThan(BigDecimal value) {
            addCriterion("VolunteerRebatePrice >", value, "volunteerrebateprice");
            return (Criteria) this;
        }

        public Criteria andVolunteerrebatepriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VolunteerRebatePrice >=", value, "volunteerrebateprice");
            return (Criteria) this;
        }

        public Criteria andVolunteerrebatepriceLessThan(BigDecimal value) {
            addCriterion("VolunteerRebatePrice <", value, "volunteerrebateprice");
            return (Criteria) this;
        }

        public Criteria andVolunteerrebatepriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VolunteerRebatePrice <=", value, "volunteerrebateprice");
            return (Criteria) this;
        }

        public Criteria andVolunteerrebatepriceIn(List<BigDecimal> values) {
            addCriterion("VolunteerRebatePrice in", values, "volunteerrebateprice");
            return (Criteria) this;
        }

        public Criteria andVolunteerrebatepriceNotIn(List<BigDecimal> values) {
            addCriterion("VolunteerRebatePrice not in", values, "volunteerrebateprice");
            return (Criteria) this;
        }

        public Criteria andVolunteerrebatepriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VolunteerRebatePrice between", value1, value2, "volunteerrebateprice");
            return (Criteria) this;
        }

        public Criteria andVolunteerrebatepriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VolunteerRebatePrice not between", value1, value2, "volunteerrebateprice");
            return (Criteria) this;
        }

        public Criteria andVolunteersalespriceIsNull() {
            addCriterion("VolunteerSalesPrice is null");
            return (Criteria) this;
        }

        public Criteria andVolunteersalespriceIsNotNull() {
            addCriterion("VolunteerSalesPrice is not null");
            return (Criteria) this;
        }

        public Criteria andVolunteersalespriceEqualTo(BigDecimal value) {
            addCriterion("VolunteerSalesPrice =", value, "volunteersalesprice");
            return (Criteria) this;
        }

        public Criteria andVolunteersalespriceNotEqualTo(BigDecimal value) {
            addCriterion("VolunteerSalesPrice <>", value, "volunteersalesprice");
            return (Criteria) this;
        }

        public Criteria andVolunteersalespriceGreaterThan(BigDecimal value) {
            addCriterion("VolunteerSalesPrice >", value, "volunteersalesprice");
            return (Criteria) this;
        }

        public Criteria andVolunteersalespriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VolunteerSalesPrice >=", value, "volunteersalesprice");
            return (Criteria) this;
        }

        public Criteria andVolunteersalespriceLessThan(BigDecimal value) {
            addCriterion("VolunteerSalesPrice <", value, "volunteersalesprice");
            return (Criteria) this;
        }

        public Criteria andVolunteersalespriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VolunteerSalesPrice <=", value, "volunteersalesprice");
            return (Criteria) this;
        }

        public Criteria andVolunteersalespriceIn(List<BigDecimal> values) {
            addCriterion("VolunteerSalesPrice in", values, "volunteersalesprice");
            return (Criteria) this;
        }

        public Criteria andVolunteersalespriceNotIn(List<BigDecimal> values) {
            addCriterion("VolunteerSalesPrice not in", values, "volunteersalesprice");
            return (Criteria) this;
        }

        public Criteria andVolunteersalespriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VolunteerSalesPrice between", value1, value2, "volunteersalesprice");
            return (Criteria) this;
        }

        public Criteria andVolunteersalespriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VolunteerSalesPrice not between", value1, value2, "volunteersalesprice");
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