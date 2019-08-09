package com.holyrobot.con_product.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProProductDynamicManageSettingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProProductDynamicManageSettingExample() {
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

        public Criteria andProductidIsNull() {
            addCriterion("ProductID is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("ProductID is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(String value) {
            addCriterion("ProductID =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(String value) {
            addCriterion("ProductID <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(String value) {
            addCriterion("ProductID >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(String value) {
            addCriterion("ProductID >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(String value) {
            addCriterion("ProductID <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(String value) {
            addCriterion("ProductID <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLike(String value) {
            addCriterion("ProductID like", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotLike(String value) {
            addCriterion("ProductID not like", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<String> values) {
            addCriterion("ProductID in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<String> values) {
            addCriterion("ProductID not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(String value1, String value2) {
            addCriterion("ProductID between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(String value1, String value2) {
            addCriterion("ProductID not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductsourceIsNull() {
            addCriterion("ProductSource is null");
            return (Criteria) this;
        }

        public Criteria andProductsourceIsNotNull() {
            addCriterion("ProductSource is not null");
            return (Criteria) this;
        }

        public Criteria andProductsourceEqualTo(Integer value) {
            addCriterion("ProductSource =", value, "productsource");
            return (Criteria) this;
        }

        public Criteria andProductsourceNotEqualTo(Integer value) {
            addCriterion("ProductSource <>", value, "productsource");
            return (Criteria) this;
        }

        public Criteria andProductsourceGreaterThan(Integer value) {
            addCriterion("ProductSource >", value, "productsource");
            return (Criteria) this;
        }

        public Criteria andProductsourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProductSource >=", value, "productsource");
            return (Criteria) this;
        }

        public Criteria andProductsourceLessThan(Integer value) {
            addCriterion("ProductSource <", value, "productsource");
            return (Criteria) this;
        }

        public Criteria andProductsourceLessThanOrEqualTo(Integer value) {
            addCriterion("ProductSource <=", value, "productsource");
            return (Criteria) this;
        }

        public Criteria andProductsourceIn(List<Integer> values) {
            addCriterion("ProductSource in", values, "productsource");
            return (Criteria) this;
        }

        public Criteria andProductsourceNotIn(List<Integer> values) {
            addCriterion("ProductSource not in", values, "productsource");
            return (Criteria) this;
        }

        public Criteria andProductsourceBetween(Integer value1, Integer value2) {
            addCriterion("ProductSource between", value1, value2, "productsource");
            return (Criteria) this;
        }

        public Criteria andProductsourceNotBetween(Integer value1, Integer value2) {
            addCriterion("ProductSource not between", value1, value2, "productsource");
            return (Criteria) this;
        }

        public Criteria andSuppliertypeIsNull() {
            addCriterion("SupplierType is null");
            return (Criteria) this;
        }

        public Criteria andSuppliertypeIsNotNull() {
            addCriterion("SupplierType is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliertypeEqualTo(Integer value) {
            addCriterion("SupplierType =", value, "suppliertype");
            return (Criteria) this;
        }

        public Criteria andSuppliertypeNotEqualTo(Integer value) {
            addCriterion("SupplierType <>", value, "suppliertype");
            return (Criteria) this;
        }

        public Criteria andSuppliertypeGreaterThan(Integer value) {
            addCriterion("SupplierType >", value, "suppliertype");
            return (Criteria) this;
        }

        public Criteria andSuppliertypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("SupplierType >=", value, "suppliertype");
            return (Criteria) this;
        }

        public Criteria andSuppliertypeLessThan(Integer value) {
            addCriterion("SupplierType <", value, "suppliertype");
            return (Criteria) this;
        }

        public Criteria andSuppliertypeLessThanOrEqualTo(Integer value) {
            addCriterion("SupplierType <=", value, "suppliertype");
            return (Criteria) this;
        }

        public Criteria andSuppliertypeIn(List<Integer> values) {
            addCriterion("SupplierType in", values, "suppliertype");
            return (Criteria) this;
        }

        public Criteria andSuppliertypeNotIn(List<Integer> values) {
            addCriterion("SupplierType not in", values, "suppliertype");
            return (Criteria) this;
        }

        public Criteria andSuppliertypeBetween(Integer value1, Integer value2) {
            addCriterion("SupplierType between", value1, value2, "suppliertype");
            return (Criteria) this;
        }

        public Criteria andSuppliertypeNotBetween(Integer value1, Integer value2) {
            addCriterion("SupplierType not between", value1, value2, "suppliertype");
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

        public Criteria andSetmodeIsNull() {
            addCriterion("SetMode is null");
            return (Criteria) this;
        }

        public Criteria andSetmodeIsNotNull() {
            addCriterion("SetMode is not null");
            return (Criteria) this;
        }

        public Criteria andSetmodeEqualTo(Integer value) {
            addCriterion("SetMode =", value, "setmode");
            return (Criteria) this;
        }

        public Criteria andSetmodeNotEqualTo(Integer value) {
            addCriterion("SetMode <>", value, "setmode");
            return (Criteria) this;
        }

        public Criteria andSetmodeGreaterThan(Integer value) {
            addCriterion("SetMode >", value, "setmode");
            return (Criteria) this;
        }

        public Criteria andSetmodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("SetMode >=", value, "setmode");
            return (Criteria) this;
        }

        public Criteria andSetmodeLessThan(Integer value) {
            addCriterion("SetMode <", value, "setmode");
            return (Criteria) this;
        }

        public Criteria andSetmodeLessThanOrEqualTo(Integer value) {
            addCriterion("SetMode <=", value, "setmode");
            return (Criteria) this;
        }

        public Criteria andSetmodeIn(List<Integer> values) {
            addCriterion("SetMode in", values, "setmode");
            return (Criteria) this;
        }

        public Criteria andSetmodeNotIn(List<Integer> values) {
            addCriterion("SetMode not in", values, "setmode");
            return (Criteria) this;
        }

        public Criteria andSetmodeBetween(Integer value1, Integer value2) {
            addCriterion("SetMode between", value1, value2, "setmode");
            return (Criteria) this;
        }

        public Criteria andSetmodeNotBetween(Integer value1, Integer value2) {
            addCriterion("SetMode not between", value1, value2, "setmode");
            return (Criteria) this;
        }

        public Criteria andSetmodevalueIsNull() {
            addCriterion("SetModeValue is null");
            return (Criteria) this;
        }

        public Criteria andSetmodevalueIsNotNull() {
            addCriterion("SetModeValue is not null");
            return (Criteria) this;
        }

        public Criteria andSetmodevalueEqualTo(BigDecimal value) {
            addCriterion("SetModeValue =", value, "setmodevalue");
            return (Criteria) this;
        }

        public Criteria andSetmodevalueNotEqualTo(BigDecimal value) {
            addCriterion("SetModeValue <>", value, "setmodevalue");
            return (Criteria) this;
        }

        public Criteria andSetmodevalueGreaterThan(BigDecimal value) {
            addCriterion("SetModeValue >", value, "setmodevalue");
            return (Criteria) this;
        }

        public Criteria andSetmodevalueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SetModeValue >=", value, "setmodevalue");
            return (Criteria) this;
        }

        public Criteria andSetmodevalueLessThan(BigDecimal value) {
            addCriterion("SetModeValue <", value, "setmodevalue");
            return (Criteria) this;
        }

        public Criteria andSetmodevalueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SetModeValue <=", value, "setmodevalue");
            return (Criteria) this;
        }

        public Criteria andSetmodevalueIn(List<BigDecimal> values) {
            addCriterion("SetModeValue in", values, "setmodevalue");
            return (Criteria) this;
        }

        public Criteria andSetmodevalueNotIn(List<BigDecimal> values) {
            addCriterion("SetModeValue not in", values, "setmodevalue");
            return (Criteria) this;
        }

        public Criteria andSetmodevalueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SetModeValue between", value1, value2, "setmodevalue");
            return (Criteria) this;
        }

        public Criteria andSetmodevalueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SetModeValue not between", value1, value2, "setmodevalue");
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

        public Criteria andRevisedbyidIsNull() {
            addCriterion("RevisedByID is null");
            return (Criteria) this;
        }

        public Criteria andRevisedbyidIsNotNull() {
            addCriterion("RevisedByID is not null");
            return (Criteria) this;
        }

        public Criteria andRevisedbyidEqualTo(String value) {
            addCriterion("RevisedByID =", value, "revisedbyid");
            return (Criteria) this;
        }

        public Criteria andRevisedbyidNotEqualTo(String value) {
            addCriterion("RevisedByID <>", value, "revisedbyid");
            return (Criteria) this;
        }

        public Criteria andRevisedbyidGreaterThan(String value) {
            addCriterion("RevisedByID >", value, "revisedbyid");
            return (Criteria) this;
        }

        public Criteria andRevisedbyidGreaterThanOrEqualTo(String value) {
            addCriterion("RevisedByID >=", value, "revisedbyid");
            return (Criteria) this;
        }

        public Criteria andRevisedbyidLessThan(String value) {
            addCriterion("RevisedByID <", value, "revisedbyid");
            return (Criteria) this;
        }

        public Criteria andRevisedbyidLessThanOrEqualTo(String value) {
            addCriterion("RevisedByID <=", value, "revisedbyid");
            return (Criteria) this;
        }

        public Criteria andRevisedbyidLike(String value) {
            addCriterion("RevisedByID like", value, "revisedbyid");
            return (Criteria) this;
        }

        public Criteria andRevisedbyidNotLike(String value) {
            addCriterion("RevisedByID not like", value, "revisedbyid");
            return (Criteria) this;
        }

        public Criteria andRevisedbyidIn(List<String> values) {
            addCriterion("RevisedByID in", values, "revisedbyid");
            return (Criteria) this;
        }

        public Criteria andRevisedbyidNotIn(List<String> values) {
            addCriterion("RevisedByID not in", values, "revisedbyid");
            return (Criteria) this;
        }

        public Criteria andRevisedbyidBetween(String value1, String value2) {
            addCriterion("RevisedByID between", value1, value2, "revisedbyid");
            return (Criteria) this;
        }

        public Criteria andRevisedbyidNotBetween(String value1, String value2) {
            addCriterion("RevisedByID not between", value1, value2, "revisedbyid");
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