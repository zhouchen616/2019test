package com.holyrobot.con_order.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrdOrderPriceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdOrderPriceExample() {
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

        public Criteria andOrderidIsNull() {
            addCriterion("OrderID is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("OrderID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(String value) {
            addCriterion("OrderID =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(String value) {
            addCriterion("OrderID <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(String value) {
            addCriterion("OrderID >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("OrderID >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(String value) {
            addCriterion("OrderID <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(String value) {
            addCriterion("OrderID <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLike(String value) {
            addCriterion("OrderID like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotLike(String value) {
            addCriterion("OrderID not like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<String> values) {
            addCriterion("OrderID in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<String> values) {
            addCriterion("OrderID not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(String value1, String value2) {
            addCriterion("OrderID between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(String value1, String value2) {
            addCriterion("OrderID not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andTourpriceidIsNull() {
            addCriterion("TourPriceID is null");
            return (Criteria) this;
        }

        public Criteria andTourpriceidIsNotNull() {
            addCriterion("TourPriceID is not null");
            return (Criteria) this;
        }

        public Criteria andTourpriceidEqualTo(String value) {
            addCriterion("TourPriceID =", value, "tourpriceid");
            return (Criteria) this;
        }

        public Criteria andTourpriceidNotEqualTo(String value) {
            addCriterion("TourPriceID <>", value, "tourpriceid");
            return (Criteria) this;
        }

        public Criteria andTourpriceidGreaterThan(String value) {
            addCriterion("TourPriceID >", value, "tourpriceid");
            return (Criteria) this;
        }

        public Criteria andTourpriceidGreaterThanOrEqualTo(String value) {
            addCriterion("TourPriceID >=", value, "tourpriceid");
            return (Criteria) this;
        }

        public Criteria andTourpriceidLessThan(String value) {
            addCriterion("TourPriceID <", value, "tourpriceid");
            return (Criteria) this;
        }

        public Criteria andTourpriceidLessThanOrEqualTo(String value) {
            addCriterion("TourPriceID <=", value, "tourpriceid");
            return (Criteria) this;
        }

        public Criteria andTourpriceidLike(String value) {
            addCriterion("TourPriceID like", value, "tourpriceid");
            return (Criteria) this;
        }

        public Criteria andTourpriceidNotLike(String value) {
            addCriterion("TourPriceID not like", value, "tourpriceid");
            return (Criteria) this;
        }

        public Criteria andTourpriceidIn(List<String> values) {
            addCriterion("TourPriceID in", values, "tourpriceid");
            return (Criteria) this;
        }

        public Criteria andTourpriceidNotIn(List<String> values) {
            addCriterion("TourPriceID not in", values, "tourpriceid");
            return (Criteria) this;
        }

        public Criteria andTourpriceidBetween(String value1, String value2) {
            addCriterion("TourPriceID between", value1, value2, "tourpriceid");
            return (Criteria) this;
        }

        public Criteria andTourpriceidNotBetween(String value1, String value2) {
            addCriterion("TourPriceID not between", value1, value2, "tourpriceid");
            return (Criteria) this;
        }

        public Criteria andPricenameIsNull() {
            addCriterion("PriceName is null");
            return (Criteria) this;
        }

        public Criteria andPricenameIsNotNull() {
            addCriterion("PriceName is not null");
            return (Criteria) this;
        }

        public Criteria andPricenameEqualTo(String value) {
            addCriterion("PriceName =", value, "pricename");
            return (Criteria) this;
        }

        public Criteria andPricenameNotEqualTo(String value) {
            addCriterion("PriceName <>", value, "pricename");
            return (Criteria) this;
        }

        public Criteria andPricenameGreaterThan(String value) {
            addCriterion("PriceName >", value, "pricename");
            return (Criteria) this;
        }

        public Criteria andPricenameGreaterThanOrEqualTo(String value) {
            addCriterion("PriceName >=", value, "pricename");
            return (Criteria) this;
        }

        public Criteria andPricenameLessThan(String value) {
            addCriterion("PriceName <", value, "pricename");
            return (Criteria) this;
        }

        public Criteria andPricenameLessThanOrEqualTo(String value) {
            addCriterion("PriceName <=", value, "pricename");
            return (Criteria) this;
        }

        public Criteria andPricenameLike(String value) {
            addCriterion("PriceName like", value, "pricename");
            return (Criteria) this;
        }

        public Criteria andPricenameNotLike(String value) {
            addCriterion("PriceName not like", value, "pricename");
            return (Criteria) this;
        }

        public Criteria andPricenameIn(List<String> values) {
            addCriterion("PriceName in", values, "pricename");
            return (Criteria) this;
        }

        public Criteria andPricenameNotIn(List<String> values) {
            addCriterion("PriceName not in", values, "pricename");
            return (Criteria) this;
        }

        public Criteria andPricenameBetween(String value1, String value2) {
            addCriterion("PriceName between", value1, value2, "pricename");
            return (Criteria) this;
        }

        public Criteria andPricenameNotBetween(String value1, String value2) {
            addCriterion("PriceName not between", value1, value2, "pricename");
            return (Criteria) this;
        }

        public Criteria andVisitornumIsNull() {
            addCriterion("VisitorNum is null");
            return (Criteria) this;
        }

        public Criteria andVisitornumIsNotNull() {
            addCriterion("VisitorNum is not null");
            return (Criteria) this;
        }

        public Criteria andVisitornumEqualTo(Integer value) {
            addCriterion("VisitorNum =", value, "visitornum");
            return (Criteria) this;
        }

        public Criteria andVisitornumNotEqualTo(Integer value) {
            addCriterion("VisitorNum <>", value, "visitornum");
            return (Criteria) this;
        }

        public Criteria andVisitornumGreaterThan(Integer value) {
            addCriterion("VisitorNum >", value, "visitornum");
            return (Criteria) this;
        }

        public Criteria andVisitornumGreaterThanOrEqualTo(Integer value) {
            addCriterion("VisitorNum >=", value, "visitornum");
            return (Criteria) this;
        }

        public Criteria andVisitornumLessThan(Integer value) {
            addCriterion("VisitorNum <", value, "visitornum");
            return (Criteria) this;
        }

        public Criteria andVisitornumLessThanOrEqualTo(Integer value) {
            addCriterion("VisitorNum <=", value, "visitornum");
            return (Criteria) this;
        }

        public Criteria andVisitornumIn(List<Integer> values) {
            addCriterion("VisitorNum in", values, "visitornum");
            return (Criteria) this;
        }

        public Criteria andVisitornumNotIn(List<Integer> values) {
            addCriterion("VisitorNum not in", values, "visitornum");
            return (Criteria) this;
        }

        public Criteria andVisitornumBetween(Integer value1, Integer value2) {
            addCriterion("VisitorNum between", value1, value2, "visitornum");
            return (Criteria) this;
        }

        public Criteria andVisitornumNotBetween(Integer value1, Integer value2) {
            addCriterion("VisitorNum not between", value1, value2, "visitornum");
            return (Criteria) this;
        }

        public Criteria andSalepriceIsNull() {
            addCriterion("SalePrice is null");
            return (Criteria) this;
        }

        public Criteria andSalepriceIsNotNull() {
            addCriterion("SalePrice is not null");
            return (Criteria) this;
        }

        public Criteria andSalepriceEqualTo(BigDecimal value) {
            addCriterion("SalePrice =", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceNotEqualTo(BigDecimal value) {
            addCriterion("SalePrice <>", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceGreaterThan(BigDecimal value) {
            addCriterion("SalePrice >", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SalePrice >=", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceLessThan(BigDecimal value) {
            addCriterion("SalePrice <", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SalePrice <=", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceIn(List<BigDecimal> values) {
            addCriterion("SalePrice in", values, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceNotIn(List<BigDecimal> values) {
            addCriterion("SalePrice not in", values, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SalePrice between", value1, value2, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SalePrice not between", value1, value2, "saleprice");
            return (Criteria) this;
        }

        public Criteria andRebateavgIsNull() {
            addCriterion("RebateAvg is null");
            return (Criteria) this;
        }

        public Criteria andRebateavgIsNotNull() {
            addCriterion("RebateAvg is not null");
            return (Criteria) this;
        }

        public Criteria andRebateavgEqualTo(BigDecimal value) {
            addCriterion("RebateAvg =", value, "rebateavg");
            return (Criteria) this;
        }

        public Criteria andRebateavgNotEqualTo(BigDecimal value) {
            addCriterion("RebateAvg <>", value, "rebateavg");
            return (Criteria) this;
        }

        public Criteria andRebateavgGreaterThan(BigDecimal value) {
            addCriterion("RebateAvg >", value, "rebateavg");
            return (Criteria) this;
        }

        public Criteria andRebateavgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RebateAvg >=", value, "rebateavg");
            return (Criteria) this;
        }

        public Criteria andRebateavgLessThan(BigDecimal value) {
            addCriterion("RebateAvg <", value, "rebateavg");
            return (Criteria) this;
        }

        public Criteria andRebateavgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RebateAvg <=", value, "rebateavg");
            return (Criteria) this;
        }

        public Criteria andRebateavgIn(List<BigDecimal> values) {
            addCriterion("RebateAvg in", values, "rebateavg");
            return (Criteria) this;
        }

        public Criteria andRebateavgNotIn(List<BigDecimal> values) {
            addCriterion("RebateAvg not in", values, "rebateavg");
            return (Criteria) this;
        }

        public Criteria andRebateavgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RebateAvg between", value1, value2, "rebateavg");
            return (Criteria) this;
        }

        public Criteria andRebateavgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RebateAvg not between", value1, value2, "rebateavg");
            return (Criteria) this;
        }

        public Criteria andRebatenumIsNull() {
            addCriterion("RebateNum is null");
            return (Criteria) this;
        }

        public Criteria andRebatenumIsNotNull() {
            addCriterion("RebateNum is not null");
            return (Criteria) this;
        }

        public Criteria andRebatenumEqualTo(Integer value) {
            addCriterion("RebateNum =", value, "rebatenum");
            return (Criteria) this;
        }

        public Criteria andRebatenumNotEqualTo(Integer value) {
            addCriterion("RebateNum <>", value, "rebatenum");
            return (Criteria) this;
        }

        public Criteria andRebatenumGreaterThan(Integer value) {
            addCriterion("RebateNum >", value, "rebatenum");
            return (Criteria) this;
        }

        public Criteria andRebatenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("RebateNum >=", value, "rebatenum");
            return (Criteria) this;
        }

        public Criteria andRebatenumLessThan(Integer value) {
            addCriterion("RebateNum <", value, "rebatenum");
            return (Criteria) this;
        }

        public Criteria andRebatenumLessThanOrEqualTo(Integer value) {
            addCriterion("RebateNum <=", value, "rebatenum");
            return (Criteria) this;
        }

        public Criteria andRebatenumIn(List<Integer> values) {
            addCriterion("RebateNum in", values, "rebatenum");
            return (Criteria) this;
        }

        public Criteria andRebatenumNotIn(List<Integer> values) {
            addCriterion("RebateNum not in", values, "rebatenum");
            return (Criteria) this;
        }

        public Criteria andRebatenumBetween(Integer value1, Integer value2) {
            addCriterion("RebateNum between", value1, value2, "rebatenum");
            return (Criteria) this;
        }

        public Criteria andRebatenumNotBetween(Integer value1, Integer value2) {
            addCriterion("RebateNum not between", value1, value2, "rebatenum");
            return (Criteria) this;
        }

        public Criteria andRoompriceIsNull() {
            addCriterion("RoomPrice is null");
            return (Criteria) this;
        }

        public Criteria andRoompriceIsNotNull() {
            addCriterion("RoomPrice is not null");
            return (Criteria) this;
        }

        public Criteria andRoompriceEqualTo(BigDecimal value) {
            addCriterion("RoomPrice =", value, "roomprice");
            return (Criteria) this;
        }

        public Criteria andRoompriceNotEqualTo(BigDecimal value) {
            addCriterion("RoomPrice <>", value, "roomprice");
            return (Criteria) this;
        }

        public Criteria andRoompriceGreaterThan(BigDecimal value) {
            addCriterion("RoomPrice >", value, "roomprice");
            return (Criteria) this;
        }

        public Criteria andRoompriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RoomPrice >=", value, "roomprice");
            return (Criteria) this;
        }

        public Criteria andRoompriceLessThan(BigDecimal value) {
            addCriterion("RoomPrice <", value, "roomprice");
            return (Criteria) this;
        }

        public Criteria andRoompriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RoomPrice <=", value, "roomprice");
            return (Criteria) this;
        }

        public Criteria andRoompriceIn(List<BigDecimal> values) {
            addCriterion("RoomPrice in", values, "roomprice");
            return (Criteria) this;
        }

        public Criteria andRoompriceNotIn(List<BigDecimal> values) {
            addCriterion("RoomPrice not in", values, "roomprice");
            return (Criteria) this;
        }

        public Criteria andRoompriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RoomPrice between", value1, value2, "roomprice");
            return (Criteria) this;
        }

        public Criteria andRoompriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RoomPrice not between", value1, value2, "roomprice");
            return (Criteria) this;
        }

        public Criteria andIsseatIsNull() {
            addCriterion("IsSeat is null");
            return (Criteria) this;
        }

        public Criteria andIsseatIsNotNull() {
            addCriterion("IsSeat is not null");
            return (Criteria) this;
        }

        public Criteria andIsseatEqualTo(Boolean value) {
            addCriterion("IsSeat =", value, "isseat");
            return (Criteria) this;
        }

        public Criteria andIsseatNotEqualTo(Boolean value) {
            addCriterion("IsSeat <>", value, "isseat");
            return (Criteria) this;
        }

        public Criteria andIsseatGreaterThan(Boolean value) {
            addCriterion("IsSeat >", value, "isseat");
            return (Criteria) this;
        }

        public Criteria andIsseatGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsSeat >=", value, "isseat");
            return (Criteria) this;
        }

        public Criteria andIsseatLessThan(Boolean value) {
            addCriterion("IsSeat <", value, "isseat");
            return (Criteria) this;
        }

        public Criteria andIsseatLessThanOrEqualTo(Boolean value) {
            addCriterion("IsSeat <=", value, "isseat");
            return (Criteria) this;
        }

        public Criteria andIsseatIn(List<Boolean> values) {
            addCriterion("IsSeat in", values, "isseat");
            return (Criteria) this;
        }

        public Criteria andIsseatNotIn(List<Boolean> values) {
            addCriterion("IsSeat not in", values, "isseat");
            return (Criteria) this;
        }

        public Criteria andIsseatBetween(Boolean value1, Boolean value2) {
            addCriterion("IsSeat between", value1, value2, "isseat");
            return (Criteria) this;
        }

        public Criteria andIsseatNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsSeat not between", value1, value2, "isseat");
            return (Criteria) this;
        }

        public Criteria andIschildIsNull() {
            addCriterion("IsChild is null");
            return (Criteria) this;
        }

        public Criteria andIschildIsNotNull() {
            addCriterion("IsChild is not null");
            return (Criteria) this;
        }

        public Criteria andIschildEqualTo(Boolean value) {
            addCriterion("IsChild =", value, "ischild");
            return (Criteria) this;
        }

        public Criteria andIschildNotEqualTo(Boolean value) {
            addCriterion("IsChild <>", value, "ischild");
            return (Criteria) this;
        }

        public Criteria andIschildGreaterThan(Boolean value) {
            addCriterion("IsChild >", value, "ischild");
            return (Criteria) this;
        }

        public Criteria andIschildGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsChild >=", value, "ischild");
            return (Criteria) this;
        }

        public Criteria andIschildLessThan(Boolean value) {
            addCriterion("IsChild <", value, "ischild");
            return (Criteria) this;
        }

        public Criteria andIschildLessThanOrEqualTo(Boolean value) {
            addCriterion("IsChild <=", value, "ischild");
            return (Criteria) this;
        }

        public Criteria andIschildIn(List<Boolean> values) {
            addCriterion("IsChild in", values, "ischild");
            return (Criteria) this;
        }

        public Criteria andIschildNotIn(List<Boolean> values) {
            addCriterion("IsChild not in", values, "ischild");
            return (Criteria) this;
        }

        public Criteria andIschildBetween(Boolean value1, Boolean value2) {
            addCriterion("IsChild between", value1, value2, "ischild");
            return (Criteria) this;
        }

        public Criteria andIschildNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsChild not between", value1, value2, "ischild");
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