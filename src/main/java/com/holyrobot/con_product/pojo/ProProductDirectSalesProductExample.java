package com.holyrobot.con_product.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProProductDirectSalesProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProProductDirectSalesProductExample() {
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

        public Criteria andAliasenameIsNull() {
            addCriterion("AliaseName is null");
            return (Criteria) this;
        }

        public Criteria andAliasenameIsNotNull() {
            addCriterion("AliaseName is not null");
            return (Criteria) this;
        }

        public Criteria andAliasenameEqualTo(String value) {
            addCriterion("AliaseName =", value, "aliasename");
            return (Criteria) this;
        }

        public Criteria andAliasenameNotEqualTo(String value) {
            addCriterion("AliaseName <>", value, "aliasename");
            return (Criteria) this;
        }

        public Criteria andAliasenameGreaterThan(String value) {
            addCriterion("AliaseName >", value, "aliasename");
            return (Criteria) this;
        }

        public Criteria andAliasenameGreaterThanOrEqualTo(String value) {
            addCriterion("AliaseName >=", value, "aliasename");
            return (Criteria) this;
        }

        public Criteria andAliasenameLessThan(String value) {
            addCriterion("AliaseName <", value, "aliasename");
            return (Criteria) this;
        }

        public Criteria andAliasenameLessThanOrEqualTo(String value) {
            addCriterion("AliaseName <=", value, "aliasename");
            return (Criteria) this;
        }

        public Criteria andAliasenameLike(String value) {
            addCriterion("AliaseName like", value, "aliasename");
            return (Criteria) this;
        }

        public Criteria andAliasenameNotLike(String value) {
            addCriterion("AliaseName not like", value, "aliasename");
            return (Criteria) this;
        }

        public Criteria andAliasenameIn(List<String> values) {
            addCriterion("AliaseName in", values, "aliasename");
            return (Criteria) this;
        }

        public Criteria andAliasenameNotIn(List<String> values) {
            addCriterion("AliaseName not in", values, "aliasename");
            return (Criteria) this;
        }

        public Criteria andAliasenameBetween(String value1, String value2) {
            addCriterion("AliaseName between", value1, value2, "aliasename");
            return (Criteria) this;
        }

        public Criteria andAliasenameNotBetween(String value1, String value2) {
            addCriterion("AliaseName not between", value1, value2, "aliasename");
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

        public Criteria andLocalpronameIsNull() {
            addCriterion("LocalProName is null");
            return (Criteria) this;
        }

        public Criteria andLocalpronameIsNotNull() {
            addCriterion("LocalProName is not null");
            return (Criteria) this;
        }

        public Criteria andLocalpronameEqualTo(String value) {
            addCriterion("LocalProName =", value, "localproname");
            return (Criteria) this;
        }

        public Criteria andLocalpronameNotEqualTo(String value) {
            addCriterion("LocalProName <>", value, "localproname");
            return (Criteria) this;
        }

        public Criteria andLocalpronameGreaterThan(String value) {
            addCriterion("LocalProName >", value, "localproname");
            return (Criteria) this;
        }

        public Criteria andLocalpronameGreaterThanOrEqualTo(String value) {
            addCriterion("LocalProName >=", value, "localproname");
            return (Criteria) this;
        }

        public Criteria andLocalpronameLessThan(String value) {
            addCriterion("LocalProName <", value, "localproname");
            return (Criteria) this;
        }

        public Criteria andLocalpronameLessThanOrEqualTo(String value) {
            addCriterion("LocalProName <=", value, "localproname");
            return (Criteria) this;
        }

        public Criteria andLocalpronameLike(String value) {
            addCriterion("LocalProName like", value, "localproname");
            return (Criteria) this;
        }

        public Criteria andLocalpronameNotLike(String value) {
            addCriterion("LocalProName not like", value, "localproname");
            return (Criteria) this;
        }

        public Criteria andLocalpronameIn(List<String> values) {
            addCriterion("LocalProName in", values, "localproname");
            return (Criteria) this;
        }

        public Criteria andLocalpronameNotIn(List<String> values) {
            addCriterion("LocalProName not in", values, "localproname");
            return (Criteria) this;
        }

        public Criteria andLocalpronameBetween(String value1, String value2) {
            addCriterion("LocalProName between", value1, value2, "localproname");
            return (Criteria) this;
        }

        public Criteria andLocalpronameNotBetween(String value1, String value2) {
            addCriterion("LocalProName not between", value1, value2, "localproname");
            return (Criteria) this;
        }

        public Criteria andFeatureIsNull() {
            addCriterion("Feature is null");
            return (Criteria) this;
        }

        public Criteria andFeatureIsNotNull() {
            addCriterion("Feature is not null");
            return (Criteria) this;
        }

        public Criteria andFeatureEqualTo(String value) {
            addCriterion("Feature =", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureNotEqualTo(String value) {
            addCriterion("Feature <>", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureGreaterThan(String value) {
            addCriterion("Feature >", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureGreaterThanOrEqualTo(String value) {
            addCriterion("Feature >=", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureLessThan(String value) {
            addCriterion("Feature <", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureLessThanOrEqualTo(String value) {
            addCriterion("Feature <=", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureLike(String value) {
            addCriterion("Feature like", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureNotLike(String value) {
            addCriterion("Feature not like", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureIn(List<String> values) {
            addCriterion("Feature in", values, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureNotIn(List<String> values) {
            addCriterion("Feature not in", values, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureBetween(String value1, String value2) {
            addCriterion("Feature between", value1, value2, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureNotBetween(String value1, String value2) {
            addCriterion("Feature not between", value1, value2, "feature");
            return (Criteria) this;
        }

        public Criteria andFeeincludesIsNull() {
            addCriterion("FeeIncludes is null");
            return (Criteria) this;
        }

        public Criteria andFeeincludesIsNotNull() {
            addCriterion("FeeIncludes is not null");
            return (Criteria) this;
        }

        public Criteria andFeeincludesEqualTo(String value) {
            addCriterion("FeeIncludes =", value, "feeincludes");
            return (Criteria) this;
        }

        public Criteria andFeeincludesNotEqualTo(String value) {
            addCriterion("FeeIncludes <>", value, "feeincludes");
            return (Criteria) this;
        }

        public Criteria andFeeincludesGreaterThan(String value) {
            addCriterion("FeeIncludes >", value, "feeincludes");
            return (Criteria) this;
        }

        public Criteria andFeeincludesGreaterThanOrEqualTo(String value) {
            addCriterion("FeeIncludes >=", value, "feeincludes");
            return (Criteria) this;
        }

        public Criteria andFeeincludesLessThan(String value) {
            addCriterion("FeeIncludes <", value, "feeincludes");
            return (Criteria) this;
        }

        public Criteria andFeeincludesLessThanOrEqualTo(String value) {
            addCriterion("FeeIncludes <=", value, "feeincludes");
            return (Criteria) this;
        }

        public Criteria andFeeincludesLike(String value) {
            addCriterion("FeeIncludes like", value, "feeincludes");
            return (Criteria) this;
        }

        public Criteria andFeeincludesNotLike(String value) {
            addCriterion("FeeIncludes not like", value, "feeincludes");
            return (Criteria) this;
        }

        public Criteria andFeeincludesIn(List<String> values) {
            addCriterion("FeeIncludes in", values, "feeincludes");
            return (Criteria) this;
        }

        public Criteria andFeeincludesNotIn(List<String> values) {
            addCriterion("FeeIncludes not in", values, "feeincludes");
            return (Criteria) this;
        }

        public Criteria andFeeincludesBetween(String value1, String value2) {
            addCriterion("FeeIncludes between", value1, value2, "feeincludes");
            return (Criteria) this;
        }

        public Criteria andFeeincludesNotBetween(String value1, String value2) {
            addCriterion("FeeIncludes not between", value1, value2, "feeincludes");
            return (Criteria) this;
        }

        public Criteria andFeenonincludesIsNull() {
            addCriterion("FeeNonIncludes is null");
            return (Criteria) this;
        }

        public Criteria andFeenonincludesIsNotNull() {
            addCriterion("FeeNonIncludes is not null");
            return (Criteria) this;
        }

        public Criteria andFeenonincludesEqualTo(String value) {
            addCriterion("FeeNonIncludes =", value, "feenonincludes");
            return (Criteria) this;
        }

        public Criteria andFeenonincludesNotEqualTo(String value) {
            addCriterion("FeeNonIncludes <>", value, "feenonincludes");
            return (Criteria) this;
        }

        public Criteria andFeenonincludesGreaterThan(String value) {
            addCriterion("FeeNonIncludes >", value, "feenonincludes");
            return (Criteria) this;
        }

        public Criteria andFeenonincludesGreaterThanOrEqualTo(String value) {
            addCriterion("FeeNonIncludes >=", value, "feenonincludes");
            return (Criteria) this;
        }

        public Criteria andFeenonincludesLessThan(String value) {
            addCriterion("FeeNonIncludes <", value, "feenonincludes");
            return (Criteria) this;
        }

        public Criteria andFeenonincludesLessThanOrEqualTo(String value) {
            addCriterion("FeeNonIncludes <=", value, "feenonincludes");
            return (Criteria) this;
        }

        public Criteria andFeenonincludesLike(String value) {
            addCriterion("FeeNonIncludes like", value, "feenonincludes");
            return (Criteria) this;
        }

        public Criteria andFeenonincludesNotLike(String value) {
            addCriterion("FeeNonIncludes not like", value, "feenonincludes");
            return (Criteria) this;
        }

        public Criteria andFeenonincludesIn(List<String> values) {
            addCriterion("FeeNonIncludes in", values, "feenonincludes");
            return (Criteria) this;
        }

        public Criteria andFeenonincludesNotIn(List<String> values) {
            addCriterion("FeeNonIncludes not in", values, "feenonincludes");
            return (Criteria) this;
        }

        public Criteria andFeenonincludesBetween(String value1, String value2) {
            addCriterion("FeeNonIncludes between", value1, value2, "feenonincludes");
            return (Criteria) this;
        }

        public Criteria andFeenonincludesNotBetween(String value1, String value2) {
            addCriterion("FeeNonIncludes not between", value1, value2, "feenonincludes");
            return (Criteria) this;
        }

        public Criteria andAttentionIsNull() {
            addCriterion("Attention is null");
            return (Criteria) this;
        }

        public Criteria andAttentionIsNotNull() {
            addCriterion("Attention is not null");
            return (Criteria) this;
        }

        public Criteria andAttentionEqualTo(String value) {
            addCriterion("Attention =", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotEqualTo(String value) {
            addCriterion("Attention <>", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionGreaterThan(String value) {
            addCriterion("Attention >", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionGreaterThanOrEqualTo(String value) {
            addCriterion("Attention >=", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionLessThan(String value) {
            addCriterion("Attention <", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionLessThanOrEqualTo(String value) {
            addCriterion("Attention <=", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionLike(String value) {
            addCriterion("Attention like", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotLike(String value) {
            addCriterion("Attention not like", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionIn(List<String> values) {
            addCriterion("Attention in", values, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotIn(List<String> values) {
            addCriterion("Attention not in", values, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionBetween(String value1, String value2) {
            addCriterion("Attention between", value1, value2, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotBetween(String value1, String value2) {
            addCriterion("Attention not between", value1, value2, "attention");
            return (Criteria) this;
        }

        public Criteria andShoppingIsNull() {
            addCriterion("Shopping is null");
            return (Criteria) this;
        }

        public Criteria andShoppingIsNotNull() {
            addCriterion("Shopping is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingEqualTo(String value) {
            addCriterion("Shopping =", value, "shopping");
            return (Criteria) this;
        }

        public Criteria andShoppingNotEqualTo(String value) {
            addCriterion("Shopping <>", value, "shopping");
            return (Criteria) this;
        }

        public Criteria andShoppingGreaterThan(String value) {
            addCriterion("Shopping >", value, "shopping");
            return (Criteria) this;
        }

        public Criteria andShoppingGreaterThanOrEqualTo(String value) {
            addCriterion("Shopping >=", value, "shopping");
            return (Criteria) this;
        }

        public Criteria andShoppingLessThan(String value) {
            addCriterion("Shopping <", value, "shopping");
            return (Criteria) this;
        }

        public Criteria andShoppingLessThanOrEqualTo(String value) {
            addCriterion("Shopping <=", value, "shopping");
            return (Criteria) this;
        }

        public Criteria andShoppingLike(String value) {
            addCriterion("Shopping like", value, "shopping");
            return (Criteria) this;
        }

        public Criteria andShoppingNotLike(String value) {
            addCriterion("Shopping not like", value, "shopping");
            return (Criteria) this;
        }

        public Criteria andShoppingIn(List<String> values) {
            addCriterion("Shopping in", values, "shopping");
            return (Criteria) this;
        }

        public Criteria andShoppingNotIn(List<String> values) {
            addCriterion("Shopping not in", values, "shopping");
            return (Criteria) this;
        }

        public Criteria andShoppingBetween(String value1, String value2) {
            addCriterion("Shopping between", value1, value2, "shopping");
            return (Criteria) this;
        }

        public Criteria andShoppingNotBetween(String value1, String value2) {
            addCriterion("Shopping not between", value1, value2, "shopping");
            return (Criteria) this;
        }

        public Criteria andTipsIsNull() {
            addCriterion("Tips is null");
            return (Criteria) this;
        }

        public Criteria andTipsIsNotNull() {
            addCriterion("Tips is not null");
            return (Criteria) this;
        }

        public Criteria andTipsEqualTo(String value) {
            addCriterion("Tips =", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsNotEqualTo(String value) {
            addCriterion("Tips <>", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsGreaterThan(String value) {
            addCriterion("Tips >", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsGreaterThanOrEqualTo(String value) {
            addCriterion("Tips >=", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsLessThan(String value) {
            addCriterion("Tips <", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsLessThanOrEqualTo(String value) {
            addCriterion("Tips <=", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsLike(String value) {
            addCriterion("Tips like", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsNotLike(String value) {
            addCriterion("Tips not like", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsIn(List<String> values) {
            addCriterion("Tips in", values, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsNotIn(List<String> values) {
            addCriterion("Tips not in", values, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsBetween(String value1, String value2) {
            addCriterion("Tips between", value1, value2, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsNotBetween(String value1, String value2) {
            addCriterion("Tips not between", value1, value2, "tips");
            return (Criteria) this;
        }

        public Criteria andInsuranceIsNull() {
            addCriterion("Insurance is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceIsNotNull() {
            addCriterion("Insurance is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceEqualTo(String value) {
            addCriterion("Insurance =", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotEqualTo(String value) {
            addCriterion("Insurance <>", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceGreaterThan(String value) {
            addCriterion("Insurance >", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceGreaterThanOrEqualTo(String value) {
            addCriterion("Insurance >=", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceLessThan(String value) {
            addCriterion("Insurance <", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceLessThanOrEqualTo(String value) {
            addCriterion("Insurance <=", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceLike(String value) {
            addCriterion("Insurance like", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotLike(String value) {
            addCriterion("Insurance not like", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceIn(List<String> values) {
            addCriterion("Insurance in", values, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotIn(List<String> values) {
            addCriterion("Insurance not in", values, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceBetween(String value1, String value2) {
            addCriterion("Insurance between", value1, value2, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotBetween(String value1, String value2) {
            addCriterion("Insurance not between", value1, value2, "insurance");
            return (Criteria) this;
        }

        public Criteria andBactoruleIsNull() {
            addCriterion("BacToRule is null");
            return (Criteria) this;
        }

        public Criteria andBactoruleIsNotNull() {
            addCriterion("BacToRule is not null");
            return (Criteria) this;
        }

        public Criteria andBactoruleEqualTo(String value) {
            addCriterion("BacToRule =", value, "bactorule");
            return (Criteria) this;
        }

        public Criteria andBactoruleNotEqualTo(String value) {
            addCriterion("BacToRule <>", value, "bactorule");
            return (Criteria) this;
        }

        public Criteria andBactoruleGreaterThan(String value) {
            addCriterion("BacToRule >", value, "bactorule");
            return (Criteria) this;
        }

        public Criteria andBactoruleGreaterThanOrEqualTo(String value) {
            addCriterion("BacToRule >=", value, "bactorule");
            return (Criteria) this;
        }

        public Criteria andBactoruleLessThan(String value) {
            addCriterion("BacToRule <", value, "bactorule");
            return (Criteria) this;
        }

        public Criteria andBactoruleLessThanOrEqualTo(String value) {
            addCriterion("BacToRule <=", value, "bactorule");
            return (Criteria) this;
        }

        public Criteria andBactoruleLike(String value) {
            addCriterion("BacToRule like", value, "bactorule");
            return (Criteria) this;
        }

        public Criteria andBactoruleNotLike(String value) {
            addCriterion("BacToRule not like", value, "bactorule");
            return (Criteria) this;
        }

        public Criteria andBactoruleIn(List<String> values) {
            addCriterion("BacToRule in", values, "bactorule");
            return (Criteria) this;
        }

        public Criteria andBactoruleNotIn(List<String> values) {
            addCriterion("BacToRule not in", values, "bactorule");
            return (Criteria) this;
        }

        public Criteria andBactoruleBetween(String value1, String value2) {
            addCriterion("BacToRule between", value1, value2, "bactorule");
            return (Criteria) this;
        }

        public Criteria andBactoruleNotBetween(String value1, String value2) {
            addCriterion("BacToRule not between", value1, value2, "bactorule");
            return (Criteria) this;
        }

        public Criteria andTravelnameIsNull() {
            addCriterion("TravelName is null");
            return (Criteria) this;
        }

        public Criteria andTravelnameIsNotNull() {
            addCriterion("TravelName is not null");
            return (Criteria) this;
        }

        public Criteria andTravelnameEqualTo(String value) {
            addCriterion("TravelName =", value, "travelname");
            return (Criteria) this;
        }

        public Criteria andTravelnameNotEqualTo(String value) {
            addCriterion("TravelName <>", value, "travelname");
            return (Criteria) this;
        }

        public Criteria andTravelnameGreaterThan(String value) {
            addCriterion("TravelName >", value, "travelname");
            return (Criteria) this;
        }

        public Criteria andTravelnameGreaterThanOrEqualTo(String value) {
            addCriterion("TravelName >=", value, "travelname");
            return (Criteria) this;
        }

        public Criteria andTravelnameLessThan(String value) {
            addCriterion("TravelName <", value, "travelname");
            return (Criteria) this;
        }

        public Criteria andTravelnameLessThanOrEqualTo(String value) {
            addCriterion("TravelName <=", value, "travelname");
            return (Criteria) this;
        }

        public Criteria andTravelnameLike(String value) {
            addCriterion("TravelName like", value, "travelname");
            return (Criteria) this;
        }

        public Criteria andTravelnameNotLike(String value) {
            addCriterion("TravelName not like", value, "travelname");
            return (Criteria) this;
        }

        public Criteria andTravelnameIn(List<String> values) {
            addCriterion("TravelName in", values, "travelname");
            return (Criteria) this;
        }

        public Criteria andTravelnameNotIn(List<String> values) {
            addCriterion("TravelName not in", values, "travelname");
            return (Criteria) this;
        }

        public Criteria andTravelnameBetween(String value1, String value2) {
            addCriterion("TravelName between", value1, value2, "travelname");
            return (Criteria) this;
        }

        public Criteria andTravelnameNotBetween(String value1, String value2) {
            addCriterion("TravelName not between", value1, value2, "travelname");
            return (Criteria) this;
        }

        public Criteria andBrandnameIsNull() {
            addCriterion("BrandName is null");
            return (Criteria) this;
        }

        public Criteria andBrandnameIsNotNull() {
            addCriterion("BrandName is not null");
            return (Criteria) this;
        }

        public Criteria andBrandnameEqualTo(String value) {
            addCriterion("BrandName =", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameNotEqualTo(String value) {
            addCriterion("BrandName <>", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameGreaterThan(String value) {
            addCriterion("BrandName >", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameGreaterThanOrEqualTo(String value) {
            addCriterion("BrandName >=", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameLessThan(String value) {
            addCriterion("BrandName <", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameLessThanOrEqualTo(String value) {
            addCriterion("BrandName <=", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameLike(String value) {
            addCriterion("BrandName like", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameNotLike(String value) {
            addCriterion("BrandName not like", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameIn(List<String> values) {
            addCriterion("BrandName in", values, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameNotIn(List<String> values) {
            addCriterion("BrandName not in", values, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameBetween(String value1, String value2) {
            addCriterion("BrandName between", value1, value2, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameNotBetween(String value1, String value2) {
            addCriterion("BrandName not between", value1, value2, "brandname");
            return (Criteria) this;
        }

        public Criteria andDestcollectionflagIsNull() {
            addCriterion("DestCollectionFlag is null");
            return (Criteria) this;
        }

        public Criteria andDestcollectionflagIsNotNull() {
            addCriterion("DestCollectionFlag is not null");
            return (Criteria) this;
        }

        public Criteria andDestcollectionflagEqualTo(String value) {
            addCriterion("DestCollectionFlag =", value, "destcollectionflag");
            return (Criteria) this;
        }

        public Criteria andDestcollectionflagNotEqualTo(String value) {
            addCriterion("DestCollectionFlag <>", value, "destcollectionflag");
            return (Criteria) this;
        }

        public Criteria andDestcollectionflagGreaterThan(String value) {
            addCriterion("DestCollectionFlag >", value, "destcollectionflag");
            return (Criteria) this;
        }

        public Criteria andDestcollectionflagGreaterThanOrEqualTo(String value) {
            addCriterion("DestCollectionFlag >=", value, "destcollectionflag");
            return (Criteria) this;
        }

        public Criteria andDestcollectionflagLessThan(String value) {
            addCriterion("DestCollectionFlag <", value, "destcollectionflag");
            return (Criteria) this;
        }

        public Criteria andDestcollectionflagLessThanOrEqualTo(String value) {
            addCriterion("DestCollectionFlag <=", value, "destcollectionflag");
            return (Criteria) this;
        }

        public Criteria andDestcollectionflagLike(String value) {
            addCriterion("DestCollectionFlag like", value, "destcollectionflag");
            return (Criteria) this;
        }

        public Criteria andDestcollectionflagNotLike(String value) {
            addCriterion("DestCollectionFlag not like", value, "destcollectionflag");
            return (Criteria) this;
        }

        public Criteria andDestcollectionflagIn(List<String> values) {
            addCriterion("DestCollectionFlag in", values, "destcollectionflag");
            return (Criteria) this;
        }

        public Criteria andDestcollectionflagNotIn(List<String> values) {
            addCriterion("DestCollectionFlag not in", values, "destcollectionflag");
            return (Criteria) this;
        }

        public Criteria andDestcollectionflagBetween(String value1, String value2) {
            addCriterion("DestCollectionFlag between", value1, value2, "destcollectionflag");
            return (Criteria) this;
        }

        public Criteria andDestcollectionflagNotBetween(String value1, String value2) {
            addCriterion("DestCollectionFlag not between", value1, value2, "destcollectionflag");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactIsNull() {
            addCriterion("EmergencyContact is null");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactIsNotNull() {
            addCriterion("EmergencyContact is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactEqualTo(String value) {
            addCriterion("EmergencyContact =", value, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactNotEqualTo(String value) {
            addCriterion("EmergencyContact <>", value, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactGreaterThan(String value) {
            addCriterion("EmergencyContact >", value, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactGreaterThanOrEqualTo(String value) {
            addCriterion("EmergencyContact >=", value, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactLessThan(String value) {
            addCriterion("EmergencyContact <", value, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactLessThanOrEqualTo(String value) {
            addCriterion("EmergencyContact <=", value, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactLike(String value) {
            addCriterion("EmergencyContact like", value, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactNotLike(String value) {
            addCriterion("EmergencyContact not like", value, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactIn(List<String> values) {
            addCriterion("EmergencyContact in", values, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactNotIn(List<String> values) {
            addCriterion("EmergencyContact not in", values, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactBetween(String value1, String value2) {
            addCriterion("EmergencyContact between", value1, value2, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactNotBetween(String value1, String value2) {
            addCriterion("EmergencyContact not between", value1, value2, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencymobilenoIsNull() {
            addCriterion("EmergencyMobileNo is null");
            return (Criteria) this;
        }

        public Criteria andEmergencymobilenoIsNotNull() {
            addCriterion("EmergencyMobileNo is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencymobilenoEqualTo(String value) {
            addCriterion("EmergencyMobileNo =", value, "emergencymobileno");
            return (Criteria) this;
        }

        public Criteria andEmergencymobilenoNotEqualTo(String value) {
            addCriterion("EmergencyMobileNo <>", value, "emergencymobileno");
            return (Criteria) this;
        }

        public Criteria andEmergencymobilenoGreaterThan(String value) {
            addCriterion("EmergencyMobileNo >", value, "emergencymobileno");
            return (Criteria) this;
        }

        public Criteria andEmergencymobilenoGreaterThanOrEqualTo(String value) {
            addCriterion("EmergencyMobileNo >=", value, "emergencymobileno");
            return (Criteria) this;
        }

        public Criteria andEmergencymobilenoLessThan(String value) {
            addCriterion("EmergencyMobileNo <", value, "emergencymobileno");
            return (Criteria) this;
        }

        public Criteria andEmergencymobilenoLessThanOrEqualTo(String value) {
            addCriterion("EmergencyMobileNo <=", value, "emergencymobileno");
            return (Criteria) this;
        }

        public Criteria andEmergencymobilenoLike(String value) {
            addCriterion("EmergencyMobileNo like", value, "emergencymobileno");
            return (Criteria) this;
        }

        public Criteria andEmergencymobilenoNotLike(String value) {
            addCriterion("EmergencyMobileNo not like", value, "emergencymobileno");
            return (Criteria) this;
        }

        public Criteria andEmergencymobilenoIn(List<String> values) {
            addCriterion("EmergencyMobileNo in", values, "emergencymobileno");
            return (Criteria) this;
        }

        public Criteria andEmergencymobilenoNotIn(List<String> values) {
            addCriterion("EmergencyMobileNo not in", values, "emergencymobileno");
            return (Criteria) this;
        }

        public Criteria andEmergencymobilenoBetween(String value1, String value2) {
            addCriterion("EmergencyMobileNo between", value1, value2, "emergencymobileno");
            return (Criteria) this;
        }

        public Criteria andEmergencymobilenoNotBetween(String value1, String value2) {
            addCriterion("EmergencyMobileNo not between", value1, value2, "emergencymobileno");
            return (Criteria) this;
        }

        public Criteria andTravelagencyaddrIsNull() {
            addCriterion("TravelAgencyAddr is null");
            return (Criteria) this;
        }

        public Criteria andTravelagencyaddrIsNotNull() {
            addCriterion("TravelAgencyAddr is not null");
            return (Criteria) this;
        }

        public Criteria andTravelagencyaddrEqualTo(String value) {
            addCriterion("TravelAgencyAddr =", value, "travelagencyaddr");
            return (Criteria) this;
        }

        public Criteria andTravelagencyaddrNotEqualTo(String value) {
            addCriterion("TravelAgencyAddr <>", value, "travelagencyaddr");
            return (Criteria) this;
        }

        public Criteria andTravelagencyaddrGreaterThan(String value) {
            addCriterion("TravelAgencyAddr >", value, "travelagencyaddr");
            return (Criteria) this;
        }

        public Criteria andTravelagencyaddrGreaterThanOrEqualTo(String value) {
            addCriterion("TravelAgencyAddr >=", value, "travelagencyaddr");
            return (Criteria) this;
        }

        public Criteria andTravelagencyaddrLessThan(String value) {
            addCriterion("TravelAgencyAddr <", value, "travelagencyaddr");
            return (Criteria) this;
        }

        public Criteria andTravelagencyaddrLessThanOrEqualTo(String value) {
            addCriterion("TravelAgencyAddr <=", value, "travelagencyaddr");
            return (Criteria) this;
        }

        public Criteria andTravelagencyaddrLike(String value) {
            addCriterion("TravelAgencyAddr like", value, "travelagencyaddr");
            return (Criteria) this;
        }

        public Criteria andTravelagencyaddrNotLike(String value) {
            addCriterion("TravelAgencyAddr not like", value, "travelagencyaddr");
            return (Criteria) this;
        }

        public Criteria andTravelagencyaddrIn(List<String> values) {
            addCriterion("TravelAgencyAddr in", values, "travelagencyaddr");
            return (Criteria) this;
        }

        public Criteria andTravelagencyaddrNotIn(List<String> values) {
            addCriterion("TravelAgencyAddr not in", values, "travelagencyaddr");
            return (Criteria) this;
        }

        public Criteria andTravelagencyaddrBetween(String value1, String value2) {
            addCriterion("TravelAgencyAddr between", value1, value2, "travelagencyaddr");
            return (Criteria) this;
        }

        public Criteria andTravelagencyaddrNotBetween(String value1, String value2) {
            addCriterion("TravelAgencyAddr not between", value1, value2, "travelagencyaddr");
            return (Criteria) this;
        }

        public Criteria andTravelagencyphoneIsNull() {
            addCriterion("TravelAgencyPhone is null");
            return (Criteria) this;
        }

        public Criteria andTravelagencyphoneIsNotNull() {
            addCriterion("TravelAgencyPhone is not null");
            return (Criteria) this;
        }

        public Criteria andTravelagencyphoneEqualTo(String value) {
            addCriterion("TravelAgencyPhone =", value, "travelagencyphone");
            return (Criteria) this;
        }

        public Criteria andTravelagencyphoneNotEqualTo(String value) {
            addCriterion("TravelAgencyPhone <>", value, "travelagencyphone");
            return (Criteria) this;
        }

        public Criteria andTravelagencyphoneGreaterThan(String value) {
            addCriterion("TravelAgencyPhone >", value, "travelagencyphone");
            return (Criteria) this;
        }

        public Criteria andTravelagencyphoneGreaterThanOrEqualTo(String value) {
            addCriterion("TravelAgencyPhone >=", value, "travelagencyphone");
            return (Criteria) this;
        }

        public Criteria andTravelagencyphoneLessThan(String value) {
            addCriterion("TravelAgencyPhone <", value, "travelagencyphone");
            return (Criteria) this;
        }

        public Criteria andTravelagencyphoneLessThanOrEqualTo(String value) {
            addCriterion("TravelAgencyPhone <=", value, "travelagencyphone");
            return (Criteria) this;
        }

        public Criteria andTravelagencyphoneLike(String value) {
            addCriterion("TravelAgencyPhone like", value, "travelagencyphone");
            return (Criteria) this;
        }

        public Criteria andTravelagencyphoneNotLike(String value) {
            addCriterion("TravelAgencyPhone not like", value, "travelagencyphone");
            return (Criteria) this;
        }

        public Criteria andTravelagencyphoneIn(List<String> values) {
            addCriterion("TravelAgencyPhone in", values, "travelagencyphone");
            return (Criteria) this;
        }

        public Criteria andTravelagencyphoneNotIn(List<String> values) {
            addCriterion("TravelAgencyPhone not in", values, "travelagencyphone");
            return (Criteria) this;
        }

        public Criteria andTravelagencyphoneBetween(String value1, String value2) {
            addCriterion("TravelAgencyPhone between", value1, value2, "travelagencyphone");
            return (Criteria) this;
        }

        public Criteria andTravelagencyphoneNotBetween(String value1, String value2) {
            addCriterion("TravelAgencyPhone not between", value1, value2, "travelagencyphone");
            return (Criteria) this;
        }

        public Criteria andTaemergencycontactIsNull() {
            addCriterion("TAEmergencyContact is null");
            return (Criteria) this;
        }

        public Criteria andTaemergencycontactIsNotNull() {
            addCriterion("TAEmergencyContact is not null");
            return (Criteria) this;
        }

        public Criteria andTaemergencycontactEqualTo(String value) {
            addCriterion("TAEmergencyContact =", value, "taemergencycontact");
            return (Criteria) this;
        }

        public Criteria andTaemergencycontactNotEqualTo(String value) {
            addCriterion("TAEmergencyContact <>", value, "taemergencycontact");
            return (Criteria) this;
        }

        public Criteria andTaemergencycontactGreaterThan(String value) {
            addCriterion("TAEmergencyContact >", value, "taemergencycontact");
            return (Criteria) this;
        }

        public Criteria andTaemergencycontactGreaterThanOrEqualTo(String value) {
            addCriterion("TAEmergencyContact >=", value, "taemergencycontact");
            return (Criteria) this;
        }

        public Criteria andTaemergencycontactLessThan(String value) {
            addCriterion("TAEmergencyContact <", value, "taemergencycontact");
            return (Criteria) this;
        }

        public Criteria andTaemergencycontactLessThanOrEqualTo(String value) {
            addCriterion("TAEmergencyContact <=", value, "taemergencycontact");
            return (Criteria) this;
        }

        public Criteria andTaemergencycontactLike(String value) {
            addCriterion("TAEmergencyContact like", value, "taemergencycontact");
            return (Criteria) this;
        }

        public Criteria andTaemergencycontactNotLike(String value) {
            addCriterion("TAEmergencyContact not like", value, "taemergencycontact");
            return (Criteria) this;
        }

        public Criteria andTaemergencycontactIn(List<String> values) {
            addCriterion("TAEmergencyContact in", values, "taemergencycontact");
            return (Criteria) this;
        }

        public Criteria andTaemergencycontactNotIn(List<String> values) {
            addCriterion("TAEmergencyContact not in", values, "taemergencycontact");
            return (Criteria) this;
        }

        public Criteria andTaemergencycontactBetween(String value1, String value2) {
            addCriterion("TAEmergencyContact between", value1, value2, "taemergencycontact");
            return (Criteria) this;
        }

        public Criteria andTaemergencycontactNotBetween(String value1, String value2) {
            addCriterion("TAEmergencyContact not between", value1, value2, "taemergencycontact");
            return (Criteria) this;
        }

        public Criteria andTaemergencymobileIsNull() {
            addCriterion("TAEmergencyMobile is null");
            return (Criteria) this;
        }

        public Criteria andTaemergencymobileIsNotNull() {
            addCriterion("TAEmergencyMobile is not null");
            return (Criteria) this;
        }

        public Criteria andTaemergencymobileEqualTo(String value) {
            addCriterion("TAEmergencyMobile =", value, "taemergencymobile");
            return (Criteria) this;
        }

        public Criteria andTaemergencymobileNotEqualTo(String value) {
            addCriterion("TAEmergencyMobile <>", value, "taemergencymobile");
            return (Criteria) this;
        }

        public Criteria andTaemergencymobileGreaterThan(String value) {
            addCriterion("TAEmergencyMobile >", value, "taemergencymobile");
            return (Criteria) this;
        }

        public Criteria andTaemergencymobileGreaterThanOrEqualTo(String value) {
            addCriterion("TAEmergencyMobile >=", value, "taemergencymobile");
            return (Criteria) this;
        }

        public Criteria andTaemergencymobileLessThan(String value) {
            addCriterion("TAEmergencyMobile <", value, "taemergencymobile");
            return (Criteria) this;
        }

        public Criteria andTaemergencymobileLessThanOrEqualTo(String value) {
            addCriterion("TAEmergencyMobile <=", value, "taemergencymobile");
            return (Criteria) this;
        }

        public Criteria andTaemergencymobileLike(String value) {
            addCriterion("TAEmergencyMobile like", value, "taemergencymobile");
            return (Criteria) this;
        }

        public Criteria andTaemergencymobileNotLike(String value) {
            addCriterion("TAEmergencyMobile not like", value, "taemergencymobile");
            return (Criteria) this;
        }

        public Criteria andTaemergencymobileIn(List<String> values) {
            addCriterion("TAEmergencyMobile in", values, "taemergencymobile");
            return (Criteria) this;
        }

        public Criteria andTaemergencymobileNotIn(List<String> values) {
            addCriterion("TAEmergencyMobile not in", values, "taemergencymobile");
            return (Criteria) this;
        }

        public Criteria andTaemergencymobileBetween(String value1, String value2) {
            addCriterion("TAEmergencyMobile between", value1, value2, "taemergencymobile");
            return (Criteria) this;
        }

        public Criteria andTaemergencymobileNotBetween(String value1, String value2) {
            addCriterion("TAEmergencyMobile not between", value1, value2, "taemergencymobile");
            return (Criteria) this;
        }

        public Criteria andWxpublicityimageIsNull() {
            addCriterion("WXPublicityImage is null");
            return (Criteria) this;
        }

        public Criteria andWxpublicityimageIsNotNull() {
            addCriterion("WXPublicityImage is not null");
            return (Criteria) this;
        }

        public Criteria andWxpublicityimageEqualTo(String value) {
            addCriterion("WXPublicityImage =", value, "wxpublicityimage");
            return (Criteria) this;
        }

        public Criteria andWxpublicityimageNotEqualTo(String value) {
            addCriterion("WXPublicityImage <>", value, "wxpublicityimage");
            return (Criteria) this;
        }

        public Criteria andWxpublicityimageGreaterThan(String value) {
            addCriterion("WXPublicityImage >", value, "wxpublicityimage");
            return (Criteria) this;
        }

        public Criteria andWxpublicityimageGreaterThanOrEqualTo(String value) {
            addCriterion("WXPublicityImage >=", value, "wxpublicityimage");
            return (Criteria) this;
        }

        public Criteria andWxpublicityimageLessThan(String value) {
            addCriterion("WXPublicityImage <", value, "wxpublicityimage");
            return (Criteria) this;
        }

        public Criteria andWxpublicityimageLessThanOrEqualTo(String value) {
            addCriterion("WXPublicityImage <=", value, "wxpublicityimage");
            return (Criteria) this;
        }

        public Criteria andWxpublicityimageLike(String value) {
            addCriterion("WXPublicityImage like", value, "wxpublicityimage");
            return (Criteria) this;
        }

        public Criteria andWxpublicityimageNotLike(String value) {
            addCriterion("WXPublicityImage not like", value, "wxpublicityimage");
            return (Criteria) this;
        }

        public Criteria andWxpublicityimageIn(List<String> values) {
            addCriterion("WXPublicityImage in", values, "wxpublicityimage");
            return (Criteria) this;
        }

        public Criteria andWxpublicityimageNotIn(List<String> values) {
            addCriterion("WXPublicityImage not in", values, "wxpublicityimage");
            return (Criteria) this;
        }

        public Criteria andWxpublicityimageBetween(String value1, String value2) {
            addCriterion("WXPublicityImage between", value1, value2, "wxpublicityimage");
            return (Criteria) this;
        }

        public Criteria andWxpublicityimageNotBetween(String value1, String value2) {
            addCriterion("WXPublicityImage not between", value1, value2, "wxpublicityimage");
            return (Criteria) this;
        }

        public Criteria andWxtitleIsNull() {
            addCriterion("WXTitle is null");
            return (Criteria) this;
        }

        public Criteria andWxtitleIsNotNull() {
            addCriterion("WXTitle is not null");
            return (Criteria) this;
        }

        public Criteria andWxtitleEqualTo(String value) {
            addCriterion("WXTitle =", value, "wxtitle");
            return (Criteria) this;
        }

        public Criteria andWxtitleNotEqualTo(String value) {
            addCriterion("WXTitle <>", value, "wxtitle");
            return (Criteria) this;
        }

        public Criteria andWxtitleGreaterThan(String value) {
            addCriterion("WXTitle >", value, "wxtitle");
            return (Criteria) this;
        }

        public Criteria andWxtitleGreaterThanOrEqualTo(String value) {
            addCriterion("WXTitle >=", value, "wxtitle");
            return (Criteria) this;
        }

        public Criteria andWxtitleLessThan(String value) {
            addCriterion("WXTitle <", value, "wxtitle");
            return (Criteria) this;
        }

        public Criteria andWxtitleLessThanOrEqualTo(String value) {
            addCriterion("WXTitle <=", value, "wxtitle");
            return (Criteria) this;
        }

        public Criteria andWxtitleLike(String value) {
            addCriterion("WXTitle like", value, "wxtitle");
            return (Criteria) this;
        }

        public Criteria andWxtitleNotLike(String value) {
            addCriterion("WXTitle not like", value, "wxtitle");
            return (Criteria) this;
        }

        public Criteria andWxtitleIn(List<String> values) {
            addCriterion("WXTitle in", values, "wxtitle");
            return (Criteria) this;
        }

        public Criteria andWxtitleNotIn(List<String> values) {
            addCriterion("WXTitle not in", values, "wxtitle");
            return (Criteria) this;
        }

        public Criteria andWxtitleBetween(String value1, String value2) {
            addCriterion("WXTitle between", value1, value2, "wxtitle");
            return (Criteria) this;
        }

        public Criteria andWxtitleNotBetween(String value1, String value2) {
            addCriterion("WXTitle not between", value1, value2, "wxtitle");
            return (Criteria) this;
        }

        public Criteria andWxsharesummaryIsNull() {
            addCriterion("WXShareSummary is null");
            return (Criteria) this;
        }

        public Criteria andWxsharesummaryIsNotNull() {
            addCriterion("WXShareSummary is not null");
            return (Criteria) this;
        }

        public Criteria andWxsharesummaryEqualTo(String value) {
            addCriterion("WXShareSummary =", value, "wxsharesummary");
            return (Criteria) this;
        }

        public Criteria andWxsharesummaryNotEqualTo(String value) {
            addCriterion("WXShareSummary <>", value, "wxsharesummary");
            return (Criteria) this;
        }

        public Criteria andWxsharesummaryGreaterThan(String value) {
            addCriterion("WXShareSummary >", value, "wxsharesummary");
            return (Criteria) this;
        }

        public Criteria andWxsharesummaryGreaterThanOrEqualTo(String value) {
            addCriterion("WXShareSummary >=", value, "wxsharesummary");
            return (Criteria) this;
        }

        public Criteria andWxsharesummaryLessThan(String value) {
            addCriterion("WXShareSummary <", value, "wxsharesummary");
            return (Criteria) this;
        }

        public Criteria andWxsharesummaryLessThanOrEqualTo(String value) {
            addCriterion("WXShareSummary <=", value, "wxsharesummary");
            return (Criteria) this;
        }

        public Criteria andWxsharesummaryLike(String value) {
            addCriterion("WXShareSummary like", value, "wxsharesummary");
            return (Criteria) this;
        }

        public Criteria andWxsharesummaryNotLike(String value) {
            addCriterion("WXShareSummary not like", value, "wxsharesummary");
            return (Criteria) this;
        }

        public Criteria andWxsharesummaryIn(List<String> values) {
            addCriterion("WXShareSummary in", values, "wxsharesummary");
            return (Criteria) this;
        }

        public Criteria andWxsharesummaryNotIn(List<String> values) {
            addCriterion("WXShareSummary not in", values, "wxsharesummary");
            return (Criteria) this;
        }

        public Criteria andWxsharesummaryBetween(String value1, String value2) {
            addCriterion("WXShareSummary between", value1, value2, "wxsharesummary");
            return (Criteria) this;
        }

        public Criteria andWxsharesummaryNotBetween(String value1, String value2) {
            addCriterion("WXShareSummary not between", value1, value2, "wxsharesummary");
            return (Criteria) this;
        }

        public Criteria andSuppliercityidIsNull() {
            addCriterion("SupplierCityID is null");
            return (Criteria) this;
        }

        public Criteria andSuppliercityidIsNotNull() {
            addCriterion("SupplierCityID is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliercityidEqualTo(String value) {
            addCriterion("SupplierCityID =", value, "suppliercityid");
            return (Criteria) this;
        }

        public Criteria andSuppliercityidNotEqualTo(String value) {
            addCriterion("SupplierCityID <>", value, "suppliercityid");
            return (Criteria) this;
        }

        public Criteria andSuppliercityidGreaterThan(String value) {
            addCriterion("SupplierCityID >", value, "suppliercityid");
            return (Criteria) this;
        }

        public Criteria andSuppliercityidGreaterThanOrEqualTo(String value) {
            addCriterion("SupplierCityID >=", value, "suppliercityid");
            return (Criteria) this;
        }

        public Criteria andSuppliercityidLessThan(String value) {
            addCriterion("SupplierCityID <", value, "suppliercityid");
            return (Criteria) this;
        }

        public Criteria andSuppliercityidLessThanOrEqualTo(String value) {
            addCriterion("SupplierCityID <=", value, "suppliercityid");
            return (Criteria) this;
        }

        public Criteria andSuppliercityidLike(String value) {
            addCriterion("SupplierCityID like", value, "suppliercityid");
            return (Criteria) this;
        }

        public Criteria andSuppliercityidNotLike(String value) {
            addCriterion("SupplierCityID not like", value, "suppliercityid");
            return (Criteria) this;
        }

        public Criteria andSuppliercityidIn(List<String> values) {
            addCriterion("SupplierCityID in", values, "suppliercityid");
            return (Criteria) this;
        }

        public Criteria andSuppliercityidNotIn(List<String> values) {
            addCriterion("SupplierCityID not in", values, "suppliercityid");
            return (Criteria) this;
        }

        public Criteria andSuppliercityidBetween(String value1, String value2) {
            addCriterion("SupplierCityID between", value1, value2, "suppliercityid");
            return (Criteria) this;
        }

        public Criteria andSuppliercityidNotBetween(String value1, String value2) {
            addCriterion("SupplierCityID not between", value1, value2, "suppliercityid");
            return (Criteria) this;
        }

        public Criteria andSuppliercitynameIsNull() {
            addCriterion("SupplierCityName is null");
            return (Criteria) this;
        }

        public Criteria andSuppliercitynameIsNotNull() {
            addCriterion("SupplierCityName is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliercitynameEqualTo(String value) {
            addCriterion("SupplierCityName =", value, "suppliercityname");
            return (Criteria) this;
        }

        public Criteria andSuppliercitynameNotEqualTo(String value) {
            addCriterion("SupplierCityName <>", value, "suppliercityname");
            return (Criteria) this;
        }

        public Criteria andSuppliercitynameGreaterThan(String value) {
            addCriterion("SupplierCityName >", value, "suppliercityname");
            return (Criteria) this;
        }

        public Criteria andSuppliercitynameGreaterThanOrEqualTo(String value) {
            addCriterion("SupplierCityName >=", value, "suppliercityname");
            return (Criteria) this;
        }

        public Criteria andSuppliercitynameLessThan(String value) {
            addCriterion("SupplierCityName <", value, "suppliercityname");
            return (Criteria) this;
        }

        public Criteria andSuppliercitynameLessThanOrEqualTo(String value) {
            addCriterion("SupplierCityName <=", value, "suppliercityname");
            return (Criteria) this;
        }

        public Criteria andSuppliercitynameLike(String value) {
            addCriterion("SupplierCityName like", value, "suppliercityname");
            return (Criteria) this;
        }

        public Criteria andSuppliercitynameNotLike(String value) {
            addCriterion("SupplierCityName not like", value, "suppliercityname");
            return (Criteria) this;
        }

        public Criteria andSuppliercitynameIn(List<String> values) {
            addCriterion("SupplierCityName in", values, "suppliercityname");
            return (Criteria) this;
        }

        public Criteria andSuppliercitynameNotIn(List<String> values) {
            addCriterion("SupplierCityName not in", values, "suppliercityname");
            return (Criteria) this;
        }

        public Criteria andSuppliercitynameBetween(String value1, String value2) {
            addCriterion("SupplierCityName between", value1, value2, "suppliercityname");
            return (Criteria) this;
        }

        public Criteria andSuppliercitynameNotBetween(String value1, String value2) {
            addCriterion("SupplierCityName not between", value1, value2, "suppliercityname");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNull() {
            addCriterion("Summary is null");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNotNull() {
            addCriterion("Summary is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryEqualTo(String value) {
            addCriterion("Summary =", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotEqualTo(String value) {
            addCriterion("Summary <>", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThan(String value) {
            addCriterion("Summary >", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("Summary >=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThan(String value) {
            addCriterion("Summary <", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThanOrEqualTo(String value) {
            addCriterion("Summary <=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLike(String value) {
            addCriterion("Summary like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotLike(String value) {
            addCriterion("Summary not like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryIn(List<String> values) {
            addCriterion("Summary in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotIn(List<String> values) {
            addCriterion("Summary not in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryBetween(String value1, String value2) {
            addCriterion("Summary between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotBetween(String value1, String value2) {
            addCriterion("Summary not between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andPronameIsNull() {
            addCriterion("ProName is null");
            return (Criteria) this;
        }

        public Criteria andPronameIsNotNull() {
            addCriterion("ProName is not null");
            return (Criteria) this;
        }

        public Criteria andPronameEqualTo(String value) {
            addCriterion("ProName =", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotEqualTo(String value) {
            addCriterion("ProName <>", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameGreaterThan(String value) {
            addCriterion("ProName >", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameGreaterThanOrEqualTo(String value) {
            addCriterion("ProName >=", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLessThan(String value) {
            addCriterion("ProName <", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLessThanOrEqualTo(String value) {
            addCriterion("ProName <=", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLike(String value) {
            addCriterion("ProName like", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotLike(String value) {
            addCriterion("ProName not like", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameIn(List<String> values) {
            addCriterion("ProName in", values, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotIn(List<String> values) {
            addCriterion("ProName not in", values, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameBetween(String value1, String value2) {
            addCriterion("ProName between", value1, value2, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotBetween(String value1, String value2) {
            addCriterion("ProName not between", value1, value2, "proname");
            return (Criteria) this;
        }

        public Criteria andCoverimgIsNull() {
            addCriterion("CoverImg is null");
            return (Criteria) this;
        }

        public Criteria andCoverimgIsNotNull() {
            addCriterion("CoverImg is not null");
            return (Criteria) this;
        }

        public Criteria andCoverimgEqualTo(String value) {
            addCriterion("CoverImg =", value, "coverimg");
            return (Criteria) this;
        }

        public Criteria andCoverimgNotEqualTo(String value) {
            addCriterion("CoverImg <>", value, "coverimg");
            return (Criteria) this;
        }

        public Criteria andCoverimgGreaterThan(String value) {
            addCriterion("CoverImg >", value, "coverimg");
            return (Criteria) this;
        }

        public Criteria andCoverimgGreaterThanOrEqualTo(String value) {
            addCriterion("CoverImg >=", value, "coverimg");
            return (Criteria) this;
        }

        public Criteria andCoverimgLessThan(String value) {
            addCriterion("CoverImg <", value, "coverimg");
            return (Criteria) this;
        }

        public Criteria andCoverimgLessThanOrEqualTo(String value) {
            addCriterion("CoverImg <=", value, "coverimg");
            return (Criteria) this;
        }

        public Criteria andCoverimgLike(String value) {
            addCriterion("CoverImg like", value, "coverimg");
            return (Criteria) this;
        }

        public Criteria andCoverimgNotLike(String value) {
            addCriterion("CoverImg not like", value, "coverimg");
            return (Criteria) this;
        }

        public Criteria andCoverimgIn(List<String> values) {
            addCriterion("CoverImg in", values, "coverimg");
            return (Criteria) this;
        }

        public Criteria andCoverimgNotIn(List<String> values) {
            addCriterion("CoverImg not in", values, "coverimg");
            return (Criteria) this;
        }

        public Criteria andCoverimgBetween(String value1, String value2) {
            addCriterion("CoverImg between", value1, value2, "coverimg");
            return (Criteria) this;
        }

        public Criteria andCoverimgNotBetween(String value1, String value2) {
            addCriterion("CoverImg not between", value1, value2, "coverimg");
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

        public Criteria andInvoicesupplieridIsNull() {
            addCriterion("InvoiceSupplierID is null");
            return (Criteria) this;
        }

        public Criteria andInvoicesupplieridIsNotNull() {
            addCriterion("InvoiceSupplierID is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicesupplieridEqualTo(String value) {
            addCriterion("InvoiceSupplierID =", value, "invoicesupplierid");
            return (Criteria) this;
        }

        public Criteria andInvoicesupplieridNotEqualTo(String value) {
            addCriterion("InvoiceSupplierID <>", value, "invoicesupplierid");
            return (Criteria) this;
        }

        public Criteria andInvoicesupplieridGreaterThan(String value) {
            addCriterion("InvoiceSupplierID >", value, "invoicesupplierid");
            return (Criteria) this;
        }

        public Criteria andInvoicesupplieridGreaterThanOrEqualTo(String value) {
            addCriterion("InvoiceSupplierID >=", value, "invoicesupplierid");
            return (Criteria) this;
        }

        public Criteria andInvoicesupplieridLessThan(String value) {
            addCriterion("InvoiceSupplierID <", value, "invoicesupplierid");
            return (Criteria) this;
        }

        public Criteria andInvoicesupplieridLessThanOrEqualTo(String value) {
            addCriterion("InvoiceSupplierID <=", value, "invoicesupplierid");
            return (Criteria) this;
        }

        public Criteria andInvoicesupplieridLike(String value) {
            addCriterion("InvoiceSupplierID like", value, "invoicesupplierid");
            return (Criteria) this;
        }

        public Criteria andInvoicesupplieridNotLike(String value) {
            addCriterion("InvoiceSupplierID not like", value, "invoicesupplierid");
            return (Criteria) this;
        }

        public Criteria andInvoicesupplieridIn(List<String> values) {
            addCriterion("InvoiceSupplierID in", values, "invoicesupplierid");
            return (Criteria) this;
        }

        public Criteria andInvoicesupplieridNotIn(List<String> values) {
            addCriterion("InvoiceSupplierID not in", values, "invoicesupplierid");
            return (Criteria) this;
        }

        public Criteria andInvoicesupplieridBetween(String value1, String value2) {
            addCriterion("InvoiceSupplierID between", value1, value2, "invoicesupplierid");
            return (Criteria) this;
        }

        public Criteria andInvoicesupplieridNotBetween(String value1, String value2) {
            addCriterion("InvoiceSupplierID not between", value1, value2, "invoicesupplierid");
            return (Criteria) this;
        }

        public Criteria andInvoicesuppliernameIsNull() {
            addCriterion("InvoiceSupplierName is null");
            return (Criteria) this;
        }

        public Criteria andInvoicesuppliernameIsNotNull() {
            addCriterion("InvoiceSupplierName is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicesuppliernameEqualTo(String value) {
            addCriterion("InvoiceSupplierName =", value, "invoicesuppliername");
            return (Criteria) this;
        }

        public Criteria andInvoicesuppliernameNotEqualTo(String value) {
            addCriterion("InvoiceSupplierName <>", value, "invoicesuppliername");
            return (Criteria) this;
        }

        public Criteria andInvoicesuppliernameGreaterThan(String value) {
            addCriterion("InvoiceSupplierName >", value, "invoicesuppliername");
            return (Criteria) this;
        }

        public Criteria andInvoicesuppliernameGreaterThanOrEqualTo(String value) {
            addCriterion("InvoiceSupplierName >=", value, "invoicesuppliername");
            return (Criteria) this;
        }

        public Criteria andInvoicesuppliernameLessThan(String value) {
            addCriterion("InvoiceSupplierName <", value, "invoicesuppliername");
            return (Criteria) this;
        }

        public Criteria andInvoicesuppliernameLessThanOrEqualTo(String value) {
            addCriterion("InvoiceSupplierName <=", value, "invoicesuppliername");
            return (Criteria) this;
        }

        public Criteria andInvoicesuppliernameLike(String value) {
            addCriterion("InvoiceSupplierName like", value, "invoicesuppliername");
            return (Criteria) this;
        }

        public Criteria andInvoicesuppliernameNotLike(String value) {
            addCriterion("InvoiceSupplierName not like", value, "invoicesuppliername");
            return (Criteria) this;
        }

        public Criteria andInvoicesuppliernameIn(List<String> values) {
            addCriterion("InvoiceSupplierName in", values, "invoicesuppliername");
            return (Criteria) this;
        }

        public Criteria andInvoicesuppliernameNotIn(List<String> values) {
            addCriterion("InvoiceSupplierName not in", values, "invoicesuppliername");
            return (Criteria) this;
        }

        public Criteria andInvoicesuppliernameBetween(String value1, String value2) {
            addCriterion("InvoiceSupplierName between", value1, value2, "invoicesuppliername");
            return (Criteria) this;
        }

        public Criteria andInvoicesuppliernameNotBetween(String value1, String value2) {
            addCriterion("InvoiceSupplierName not between", value1, value2, "invoicesuppliername");
            return (Criteria) this;
        }

        public Criteria andIsnewIsNull() {
            addCriterion("IsNew is null");
            return (Criteria) this;
        }

        public Criteria andIsnewIsNotNull() {
            addCriterion("IsNew is not null");
            return (Criteria) this;
        }

        public Criteria andIsnewEqualTo(Integer value) {
            addCriterion("IsNew =", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewNotEqualTo(Integer value) {
            addCriterion("IsNew <>", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewGreaterThan(Integer value) {
            addCriterion("IsNew >", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsNew >=", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewLessThan(Integer value) {
            addCriterion("IsNew <", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewLessThanOrEqualTo(Integer value) {
            addCriterion("IsNew <=", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewIn(List<Integer> values) {
            addCriterion("IsNew in", values, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewNotIn(List<Integer> values) {
            addCriterion("IsNew not in", values, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewBetween(Integer value1, Integer value2) {
            addCriterion("IsNew between", value1, value2, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewNotBetween(Integer value1, Integer value2) {
            addCriterion("IsNew not between", value1, value2, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsautoIsNull() {
            addCriterion("isAuto is null");
            return (Criteria) this;
        }

        public Criteria andIsautoIsNotNull() {
            addCriterion("isAuto is not null");
            return (Criteria) this;
        }

        public Criteria andIsautoEqualTo(Integer value) {
            addCriterion("isAuto =", value, "isauto");
            return (Criteria) this;
        }

        public Criteria andIsautoNotEqualTo(Integer value) {
            addCriterion("isAuto <>", value, "isauto");
            return (Criteria) this;
        }

        public Criteria andIsautoGreaterThan(Integer value) {
            addCriterion("isAuto >", value, "isauto");
            return (Criteria) this;
        }

        public Criteria andIsautoGreaterThanOrEqualTo(Integer value) {
            addCriterion("isAuto >=", value, "isauto");
            return (Criteria) this;
        }

        public Criteria andIsautoLessThan(Integer value) {
            addCriterion("isAuto <", value, "isauto");
            return (Criteria) this;
        }

        public Criteria andIsautoLessThanOrEqualTo(Integer value) {
            addCriterion("isAuto <=", value, "isauto");
            return (Criteria) this;
        }

        public Criteria andIsautoIn(List<Integer> values) {
            addCriterion("isAuto in", values, "isauto");
            return (Criteria) this;
        }

        public Criteria andIsautoNotIn(List<Integer> values) {
            addCriterion("isAuto not in", values, "isauto");
            return (Criteria) this;
        }

        public Criteria andIsautoBetween(Integer value1, Integer value2) {
            addCriterion("isAuto between", value1, value2, "isauto");
            return (Criteria) this;
        }

        public Criteria andIsautoNotBetween(Integer value1, Integer value2) {
            addCriterion("isAuto not between", value1, value2, "isauto");
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