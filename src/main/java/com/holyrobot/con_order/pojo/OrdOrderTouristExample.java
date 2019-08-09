package com.holyrobot.con_order.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdOrderTouristExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdOrderTouristExample() {
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

        public Criteria andPriceidIsNull() {
            addCriterion("PriceID is null");
            return (Criteria) this;
        }

        public Criteria andPriceidIsNotNull() {
            addCriterion("PriceID is not null");
            return (Criteria) this;
        }

        public Criteria andPriceidEqualTo(String value) {
            addCriterion("PriceID =", value, "priceid");
            return (Criteria) this;
        }

        public Criteria andPriceidNotEqualTo(String value) {
            addCriterion("PriceID <>", value, "priceid");
            return (Criteria) this;
        }

        public Criteria andPriceidGreaterThan(String value) {
            addCriterion("PriceID >", value, "priceid");
            return (Criteria) this;
        }

        public Criteria andPriceidGreaterThanOrEqualTo(String value) {
            addCriterion("PriceID >=", value, "priceid");
            return (Criteria) this;
        }

        public Criteria andPriceidLessThan(String value) {
            addCriterion("PriceID <", value, "priceid");
            return (Criteria) this;
        }

        public Criteria andPriceidLessThanOrEqualTo(String value) {
            addCriterion("PriceID <=", value, "priceid");
            return (Criteria) this;
        }

        public Criteria andPriceidLike(String value) {
            addCriterion("PriceID like", value, "priceid");
            return (Criteria) this;
        }

        public Criteria andPriceidNotLike(String value) {
            addCriterion("PriceID not like", value, "priceid");
            return (Criteria) this;
        }

        public Criteria andPriceidIn(List<String> values) {
            addCriterion("PriceID in", values, "priceid");
            return (Criteria) this;
        }

        public Criteria andPriceidNotIn(List<String> values) {
            addCriterion("PriceID not in", values, "priceid");
            return (Criteria) this;
        }

        public Criteria andPriceidBetween(String value1, String value2) {
            addCriterion("PriceID between", value1, value2, "priceid");
            return (Criteria) this;
        }

        public Criteria andPriceidNotBetween(String value1, String value2) {
            addCriterion("PriceID not between", value1, value2, "priceid");
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

        public Criteria andGuestnameIsNull() {
            addCriterion("GuestName is null");
            return (Criteria) this;
        }

        public Criteria andGuestnameIsNotNull() {
            addCriterion("GuestName is not null");
            return (Criteria) this;
        }

        public Criteria andGuestnameEqualTo(String value) {
            addCriterion("GuestName =", value, "guestname");
            return (Criteria) this;
        }

        public Criteria andGuestnameNotEqualTo(String value) {
            addCriterion("GuestName <>", value, "guestname");
            return (Criteria) this;
        }

        public Criteria andGuestnameGreaterThan(String value) {
            addCriterion("GuestName >", value, "guestname");
            return (Criteria) this;
        }

        public Criteria andGuestnameGreaterThanOrEqualTo(String value) {
            addCriterion("GuestName >=", value, "guestname");
            return (Criteria) this;
        }

        public Criteria andGuestnameLessThan(String value) {
            addCriterion("GuestName <", value, "guestname");
            return (Criteria) this;
        }

        public Criteria andGuestnameLessThanOrEqualTo(String value) {
            addCriterion("GuestName <=", value, "guestname");
            return (Criteria) this;
        }

        public Criteria andGuestnameLike(String value) {
            addCriterion("GuestName like", value, "guestname");
            return (Criteria) this;
        }

        public Criteria andGuestnameNotLike(String value) {
            addCriterion("GuestName not like", value, "guestname");
            return (Criteria) this;
        }

        public Criteria andGuestnameIn(List<String> values) {
            addCriterion("GuestName in", values, "guestname");
            return (Criteria) this;
        }

        public Criteria andGuestnameNotIn(List<String> values) {
            addCriterion("GuestName not in", values, "guestname");
            return (Criteria) this;
        }

        public Criteria andGuestnameBetween(String value1, String value2) {
            addCriterion("GuestName between", value1, value2, "guestname");
            return (Criteria) this;
        }

        public Criteria andGuestnameNotBetween(String value1, String value2) {
            addCriterion("GuestName not between", value1, value2, "guestname");
            return (Criteria) this;
        }

        public Criteria andGuestsexIsNull() {
            addCriterion("GuestSex is null");
            return (Criteria) this;
        }

        public Criteria andGuestsexIsNotNull() {
            addCriterion("GuestSex is not null");
            return (Criteria) this;
        }

        public Criteria andGuestsexEqualTo(String value) {
            addCriterion("GuestSex =", value, "guestsex");
            return (Criteria) this;
        }

        public Criteria andGuestsexNotEqualTo(String value) {
            addCriterion("GuestSex <>", value, "guestsex");
            return (Criteria) this;
        }

        public Criteria andGuestsexGreaterThan(String value) {
            addCriterion("GuestSex >", value, "guestsex");
            return (Criteria) this;
        }

        public Criteria andGuestsexGreaterThanOrEqualTo(String value) {
            addCriterion("GuestSex >=", value, "guestsex");
            return (Criteria) this;
        }

        public Criteria andGuestsexLessThan(String value) {
            addCriterion("GuestSex <", value, "guestsex");
            return (Criteria) this;
        }

        public Criteria andGuestsexLessThanOrEqualTo(String value) {
            addCriterion("GuestSex <=", value, "guestsex");
            return (Criteria) this;
        }

        public Criteria andGuestsexLike(String value) {
            addCriterion("GuestSex like", value, "guestsex");
            return (Criteria) this;
        }

        public Criteria andGuestsexNotLike(String value) {
            addCriterion("GuestSex not like", value, "guestsex");
            return (Criteria) this;
        }

        public Criteria andGuestsexIn(List<String> values) {
            addCriterion("GuestSex in", values, "guestsex");
            return (Criteria) this;
        }

        public Criteria andGuestsexNotIn(List<String> values) {
            addCriterion("GuestSex not in", values, "guestsex");
            return (Criteria) this;
        }

        public Criteria andGuestsexBetween(String value1, String value2) {
            addCriterion("GuestSex between", value1, value2, "guestsex");
            return (Criteria) this;
        }

        public Criteria andGuestsexNotBetween(String value1, String value2) {
            addCriterion("GuestSex not between", value1, value2, "guestsex");
            return (Criteria) this;
        }

        public Criteria andGuestageIsNull() {
            addCriterion("GuestAge is null");
            return (Criteria) this;
        }

        public Criteria andGuestageIsNotNull() {
            addCriterion("GuestAge is not null");
            return (Criteria) this;
        }

        public Criteria andGuestageEqualTo(String value) {
            addCriterion("GuestAge =", value, "guestage");
            return (Criteria) this;
        }

        public Criteria andGuestageNotEqualTo(String value) {
            addCriterion("GuestAge <>", value, "guestage");
            return (Criteria) this;
        }

        public Criteria andGuestageGreaterThan(String value) {
            addCriterion("GuestAge >", value, "guestage");
            return (Criteria) this;
        }

        public Criteria andGuestageGreaterThanOrEqualTo(String value) {
            addCriterion("GuestAge >=", value, "guestage");
            return (Criteria) this;
        }

        public Criteria andGuestageLessThan(String value) {
            addCriterion("GuestAge <", value, "guestage");
            return (Criteria) this;
        }

        public Criteria andGuestageLessThanOrEqualTo(String value) {
            addCriterion("GuestAge <=", value, "guestage");
            return (Criteria) this;
        }

        public Criteria andGuestageLike(String value) {
            addCriterion("GuestAge like", value, "guestage");
            return (Criteria) this;
        }

        public Criteria andGuestageNotLike(String value) {
            addCriterion("GuestAge not like", value, "guestage");
            return (Criteria) this;
        }

        public Criteria andGuestageIn(List<String> values) {
            addCriterion("GuestAge in", values, "guestage");
            return (Criteria) this;
        }

        public Criteria andGuestageNotIn(List<String> values) {
            addCriterion("GuestAge not in", values, "guestage");
            return (Criteria) this;
        }

        public Criteria andGuestageBetween(String value1, String value2) {
            addCriterion("GuestAge between", value1, value2, "guestage");
            return (Criteria) this;
        }

        public Criteria andGuestageNotBetween(String value1, String value2) {
            addCriterion("GuestAge not between", value1, value2, "guestage");
            return (Criteria) this;
        }

        public Criteria andGuestcardIsNull() {
            addCriterion("GuestCard is null");
            return (Criteria) this;
        }

        public Criteria andGuestcardIsNotNull() {
            addCriterion("GuestCard is not null");
            return (Criteria) this;
        }

        public Criteria andGuestcardEqualTo(String value) {
            addCriterion("GuestCard =", value, "guestcard");
            return (Criteria) this;
        }

        public Criteria andGuestcardNotEqualTo(String value) {
            addCriterion("GuestCard <>", value, "guestcard");
            return (Criteria) this;
        }

        public Criteria andGuestcardGreaterThan(String value) {
            addCriterion("GuestCard >", value, "guestcard");
            return (Criteria) this;
        }

        public Criteria andGuestcardGreaterThanOrEqualTo(String value) {
            addCriterion("GuestCard >=", value, "guestcard");
            return (Criteria) this;
        }

        public Criteria andGuestcardLessThan(String value) {
            addCriterion("GuestCard <", value, "guestcard");
            return (Criteria) this;
        }

        public Criteria andGuestcardLessThanOrEqualTo(String value) {
            addCriterion("GuestCard <=", value, "guestcard");
            return (Criteria) this;
        }

        public Criteria andGuestcardLike(String value) {
            addCriterion("GuestCard like", value, "guestcard");
            return (Criteria) this;
        }

        public Criteria andGuestcardNotLike(String value) {
            addCriterion("GuestCard not like", value, "guestcard");
            return (Criteria) this;
        }

        public Criteria andGuestcardIn(List<String> values) {
            addCriterion("GuestCard in", values, "guestcard");
            return (Criteria) this;
        }

        public Criteria andGuestcardNotIn(List<String> values) {
            addCriterion("GuestCard not in", values, "guestcard");
            return (Criteria) this;
        }

        public Criteria andGuestcardBetween(String value1, String value2) {
            addCriterion("GuestCard between", value1, value2, "guestcard");
            return (Criteria) this;
        }

        public Criteria andGuestcardNotBetween(String value1, String value2) {
            addCriterion("GuestCard not between", value1, value2, "guestcard");
            return (Criteria) this;
        }

        public Criteria andGuesttelphoneIsNull() {
            addCriterion("GuestTelphone is null");
            return (Criteria) this;
        }

        public Criteria andGuesttelphoneIsNotNull() {
            addCriterion("GuestTelphone is not null");
            return (Criteria) this;
        }

        public Criteria andGuesttelphoneEqualTo(String value) {
            addCriterion("GuestTelphone =", value, "guesttelphone");
            return (Criteria) this;
        }

        public Criteria andGuesttelphoneNotEqualTo(String value) {
            addCriterion("GuestTelphone <>", value, "guesttelphone");
            return (Criteria) this;
        }

        public Criteria andGuesttelphoneGreaterThan(String value) {
            addCriterion("GuestTelphone >", value, "guesttelphone");
            return (Criteria) this;
        }

        public Criteria andGuesttelphoneGreaterThanOrEqualTo(String value) {
            addCriterion("GuestTelphone >=", value, "guesttelphone");
            return (Criteria) this;
        }

        public Criteria andGuesttelphoneLessThan(String value) {
            addCriterion("GuestTelphone <", value, "guesttelphone");
            return (Criteria) this;
        }

        public Criteria andGuesttelphoneLessThanOrEqualTo(String value) {
            addCriterion("GuestTelphone <=", value, "guesttelphone");
            return (Criteria) this;
        }

        public Criteria andGuesttelphoneLike(String value) {
            addCriterion("GuestTelphone like", value, "guesttelphone");
            return (Criteria) this;
        }

        public Criteria andGuesttelphoneNotLike(String value) {
            addCriterion("GuestTelphone not like", value, "guesttelphone");
            return (Criteria) this;
        }

        public Criteria andGuesttelphoneIn(List<String> values) {
            addCriterion("GuestTelphone in", values, "guesttelphone");
            return (Criteria) this;
        }

        public Criteria andGuesttelphoneNotIn(List<String> values) {
            addCriterion("GuestTelphone not in", values, "guesttelphone");
            return (Criteria) this;
        }

        public Criteria andGuesttelphoneBetween(String value1, String value2) {
            addCriterion("GuestTelphone between", value1, value2, "guesttelphone");
            return (Criteria) this;
        }

        public Criteria andGuesttelphoneNotBetween(String value1, String value2) {
            addCriterion("GuestTelphone not between", value1, value2, "guesttelphone");
            return (Criteria) this;
        }

        public Criteria andGuestaddressIsNull() {
            addCriterion("GuestAddress is null");
            return (Criteria) this;
        }

        public Criteria andGuestaddressIsNotNull() {
            addCriterion("GuestAddress is not null");
            return (Criteria) this;
        }

        public Criteria andGuestaddressEqualTo(String value) {
            addCriterion("GuestAddress =", value, "guestaddress");
            return (Criteria) this;
        }

        public Criteria andGuestaddressNotEqualTo(String value) {
            addCriterion("GuestAddress <>", value, "guestaddress");
            return (Criteria) this;
        }

        public Criteria andGuestaddressGreaterThan(String value) {
            addCriterion("GuestAddress >", value, "guestaddress");
            return (Criteria) this;
        }

        public Criteria andGuestaddressGreaterThanOrEqualTo(String value) {
            addCriterion("GuestAddress >=", value, "guestaddress");
            return (Criteria) this;
        }

        public Criteria andGuestaddressLessThan(String value) {
            addCriterion("GuestAddress <", value, "guestaddress");
            return (Criteria) this;
        }

        public Criteria andGuestaddressLessThanOrEqualTo(String value) {
            addCriterion("GuestAddress <=", value, "guestaddress");
            return (Criteria) this;
        }

        public Criteria andGuestaddressLike(String value) {
            addCriterion("GuestAddress like", value, "guestaddress");
            return (Criteria) this;
        }

        public Criteria andGuestaddressNotLike(String value) {
            addCriterion("GuestAddress not like", value, "guestaddress");
            return (Criteria) this;
        }

        public Criteria andGuestaddressIn(List<String> values) {
            addCriterion("GuestAddress in", values, "guestaddress");
            return (Criteria) this;
        }

        public Criteria andGuestaddressNotIn(List<String> values) {
            addCriterion("GuestAddress not in", values, "guestaddress");
            return (Criteria) this;
        }

        public Criteria andGuestaddressBetween(String value1, String value2) {
            addCriterion("GuestAddress between", value1, value2, "guestaddress");
            return (Criteria) this;
        }

        public Criteria andGuestaddressNotBetween(String value1, String value2) {
            addCriterion("GuestAddress not between", value1, value2, "guestaddress");
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

        public Criteria andCreatedidIsNull() {
            addCriterion("CreatedID is null");
            return (Criteria) this;
        }

        public Criteria andCreatedidIsNotNull() {
            addCriterion("CreatedID is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedidEqualTo(String value) {
            addCriterion("CreatedID =", value, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidNotEqualTo(String value) {
            addCriterion("CreatedID <>", value, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidGreaterThan(String value) {
            addCriterion("CreatedID >", value, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidGreaterThanOrEqualTo(String value) {
            addCriterion("CreatedID >=", value, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidLessThan(String value) {
            addCriterion("CreatedID <", value, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidLessThanOrEqualTo(String value) {
            addCriterion("CreatedID <=", value, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidLike(String value) {
            addCriterion("CreatedID like", value, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidNotLike(String value) {
            addCriterion("CreatedID not like", value, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidIn(List<String> values) {
            addCriterion("CreatedID in", values, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidNotIn(List<String> values) {
            addCriterion("CreatedID not in", values, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidBetween(String value1, String value2) {
            addCriterion("CreatedID between", value1, value2, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidNotBetween(String value1, String value2) {
            addCriterion("CreatedID not between", value1, value2, "createdid");
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

        public Criteria andGuestcommentIsNull() {
            addCriterion("GuestComment is null");
            return (Criteria) this;
        }

        public Criteria andGuestcommentIsNotNull() {
            addCriterion("GuestComment is not null");
            return (Criteria) this;
        }

        public Criteria andGuestcommentEqualTo(String value) {
            addCriterion("GuestComment =", value, "guestcomment");
            return (Criteria) this;
        }

        public Criteria andGuestcommentNotEqualTo(String value) {
            addCriterion("GuestComment <>", value, "guestcomment");
            return (Criteria) this;
        }

        public Criteria andGuestcommentGreaterThan(String value) {
            addCriterion("GuestComment >", value, "guestcomment");
            return (Criteria) this;
        }

        public Criteria andGuestcommentGreaterThanOrEqualTo(String value) {
            addCriterion("GuestComment >=", value, "guestcomment");
            return (Criteria) this;
        }

        public Criteria andGuestcommentLessThan(String value) {
            addCriterion("GuestComment <", value, "guestcomment");
            return (Criteria) this;
        }

        public Criteria andGuestcommentLessThanOrEqualTo(String value) {
            addCriterion("GuestComment <=", value, "guestcomment");
            return (Criteria) this;
        }

        public Criteria andGuestcommentLike(String value) {
            addCriterion("GuestComment like", value, "guestcomment");
            return (Criteria) this;
        }

        public Criteria andGuestcommentNotLike(String value) {
            addCriterion("GuestComment not like", value, "guestcomment");
            return (Criteria) this;
        }

        public Criteria andGuestcommentIn(List<String> values) {
            addCriterion("GuestComment in", values, "guestcomment");
            return (Criteria) this;
        }

        public Criteria andGuestcommentNotIn(List<String> values) {
            addCriterion("GuestComment not in", values, "guestcomment");
            return (Criteria) this;
        }

        public Criteria andGuestcommentBetween(String value1, String value2) {
            addCriterion("GuestComment between", value1, value2, "guestcomment");
            return (Criteria) this;
        }

        public Criteria andGuestcommentNotBetween(String value1, String value2) {
            addCriterion("GuestComment not between", value1, value2, "guestcomment");
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

        public Criteria andJamtIsNull() {
            addCriterion("JAmt is null");
            return (Criteria) this;
        }

        public Criteria andJamtIsNotNull() {
            addCriterion("JAmt is not null");
            return (Criteria) this;
        }

        public Criteria andJamtEqualTo(BigDecimal value) {
            addCriterion("JAmt =", value, "jamt");
            return (Criteria) this;
        }

        public Criteria andJamtNotEqualTo(BigDecimal value) {
            addCriterion("JAmt <>", value, "jamt");
            return (Criteria) this;
        }

        public Criteria andJamtGreaterThan(BigDecimal value) {
            addCriterion("JAmt >", value, "jamt");
            return (Criteria) this;
        }

        public Criteria andJamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JAmt >=", value, "jamt");
            return (Criteria) this;
        }

        public Criteria andJamtLessThan(BigDecimal value) {
            addCriterion("JAmt <", value, "jamt");
            return (Criteria) this;
        }

        public Criteria andJamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JAmt <=", value, "jamt");
            return (Criteria) this;
        }

        public Criteria andJamtIn(List<BigDecimal> values) {
            addCriterion("JAmt in", values, "jamt");
            return (Criteria) this;
        }

        public Criteria andJamtNotIn(List<BigDecimal> values) {
            addCriterion("JAmt not in", values, "jamt");
            return (Criteria) this;
        }

        public Criteria andJamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JAmt between", value1, value2, "jamt");
            return (Criteria) this;
        }

        public Criteria andJamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JAmt not between", value1, value2, "jamt");
            return (Criteria) this;
        }

        public Criteria andSamtIsNull() {
            addCriterion("SAmt is null");
            return (Criteria) this;
        }

        public Criteria andSamtIsNotNull() {
            addCriterion("SAmt is not null");
            return (Criteria) this;
        }

        public Criteria andSamtEqualTo(BigDecimal value) {
            addCriterion("SAmt =", value, "samt");
            return (Criteria) this;
        }

        public Criteria andSamtNotEqualTo(BigDecimal value) {
            addCriterion("SAmt <>", value, "samt");
            return (Criteria) this;
        }

        public Criteria andSamtGreaterThan(BigDecimal value) {
            addCriterion("SAmt >", value, "samt");
            return (Criteria) this;
        }

        public Criteria andSamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SAmt >=", value, "samt");
            return (Criteria) this;
        }

        public Criteria andSamtLessThan(BigDecimal value) {
            addCriterion("SAmt <", value, "samt");
            return (Criteria) this;
        }

        public Criteria andSamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SAmt <=", value, "samt");
            return (Criteria) this;
        }

        public Criteria andSamtIn(List<BigDecimal> values) {
            addCriterion("SAmt in", values, "samt");
            return (Criteria) this;
        }

        public Criteria andSamtNotIn(List<BigDecimal> values) {
            addCriterion("SAmt not in", values, "samt");
            return (Criteria) this;
        }

        public Criteria andSamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SAmt between", value1, value2, "samt");
            return (Criteria) this;
        }

        public Criteria andSamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SAmt not between", value1, value2, "samt");
            return (Criteria) this;
        }

        public Criteria andPickupidIsNull() {
            addCriterion("PickUpID is null");
            return (Criteria) this;
        }

        public Criteria andPickupidIsNotNull() {
            addCriterion("PickUpID is not null");
            return (Criteria) this;
        }

        public Criteria andPickupidEqualTo(String value) {
            addCriterion("PickUpID =", value, "pickupid");
            return (Criteria) this;
        }

        public Criteria andPickupidNotEqualTo(String value) {
            addCriterion("PickUpID <>", value, "pickupid");
            return (Criteria) this;
        }

        public Criteria andPickupidGreaterThan(String value) {
            addCriterion("PickUpID >", value, "pickupid");
            return (Criteria) this;
        }

        public Criteria andPickupidGreaterThanOrEqualTo(String value) {
            addCriterion("PickUpID >=", value, "pickupid");
            return (Criteria) this;
        }

        public Criteria andPickupidLessThan(String value) {
            addCriterion("PickUpID <", value, "pickupid");
            return (Criteria) this;
        }

        public Criteria andPickupidLessThanOrEqualTo(String value) {
            addCriterion("PickUpID <=", value, "pickupid");
            return (Criteria) this;
        }

        public Criteria andPickupidLike(String value) {
            addCriterion("PickUpID like", value, "pickupid");
            return (Criteria) this;
        }

        public Criteria andPickupidNotLike(String value) {
            addCriterion("PickUpID not like", value, "pickupid");
            return (Criteria) this;
        }

        public Criteria andPickupidIn(List<String> values) {
            addCriterion("PickUpID in", values, "pickupid");
            return (Criteria) this;
        }

        public Criteria andPickupidNotIn(List<String> values) {
            addCriterion("PickUpID not in", values, "pickupid");
            return (Criteria) this;
        }

        public Criteria andPickupidBetween(String value1, String value2) {
            addCriterion("PickUpID between", value1, value2, "pickupid");
            return (Criteria) this;
        }

        public Criteria andPickupidNotBetween(String value1, String value2) {
            addCriterion("PickUpID not between", value1, value2, "pickupid");
            return (Criteria) this;
        }

        public Criteria andPicknameIsNull() {
            addCriterion("PickName is null");
            return (Criteria) this;
        }

        public Criteria andPicknameIsNotNull() {
            addCriterion("PickName is not null");
            return (Criteria) this;
        }

        public Criteria andPicknameEqualTo(String value) {
            addCriterion("PickName =", value, "pickname");
            return (Criteria) this;
        }

        public Criteria andPicknameNotEqualTo(String value) {
            addCriterion("PickName <>", value, "pickname");
            return (Criteria) this;
        }

        public Criteria andPicknameGreaterThan(String value) {
            addCriterion("PickName >", value, "pickname");
            return (Criteria) this;
        }

        public Criteria andPicknameGreaterThanOrEqualTo(String value) {
            addCriterion("PickName >=", value, "pickname");
            return (Criteria) this;
        }

        public Criteria andPicknameLessThan(String value) {
            addCriterion("PickName <", value, "pickname");
            return (Criteria) this;
        }

        public Criteria andPicknameLessThanOrEqualTo(String value) {
            addCriterion("PickName <=", value, "pickname");
            return (Criteria) this;
        }

        public Criteria andPicknameLike(String value) {
            addCriterion("PickName like", value, "pickname");
            return (Criteria) this;
        }

        public Criteria andPicknameNotLike(String value) {
            addCriterion("PickName not like", value, "pickname");
            return (Criteria) this;
        }

        public Criteria andPicknameIn(List<String> values) {
            addCriterion("PickName in", values, "pickname");
            return (Criteria) this;
        }

        public Criteria andPicknameNotIn(List<String> values) {
            addCriterion("PickName not in", values, "pickname");
            return (Criteria) this;
        }

        public Criteria andPicknameBetween(String value1, String value2) {
            addCriterion("PickName between", value1, value2, "pickname");
            return (Criteria) this;
        }

        public Criteria andPicknameNotBetween(String value1, String value2) {
            addCriterion("PickName not between", value1, value2, "pickname");
            return (Criteria) this;
        }

        public Criteria andPickuptimeIsNull() {
            addCriterion("PickUpTime is null");
            return (Criteria) this;
        }

        public Criteria andPickuptimeIsNotNull() {
            addCriterion("PickUpTime is not null");
            return (Criteria) this;
        }

        public Criteria andPickuptimeEqualTo(String value) {
            addCriterion("PickUpTime =", value, "pickuptime");
            return (Criteria) this;
        }

        public Criteria andPickuptimeNotEqualTo(String value) {
            addCriterion("PickUpTime <>", value, "pickuptime");
            return (Criteria) this;
        }

        public Criteria andPickuptimeGreaterThan(String value) {
            addCriterion("PickUpTime >", value, "pickuptime");
            return (Criteria) this;
        }

        public Criteria andPickuptimeGreaterThanOrEqualTo(String value) {
            addCriterion("PickUpTime >=", value, "pickuptime");
            return (Criteria) this;
        }

        public Criteria andPickuptimeLessThan(String value) {
            addCriterion("PickUpTime <", value, "pickuptime");
            return (Criteria) this;
        }

        public Criteria andPickuptimeLessThanOrEqualTo(String value) {
            addCriterion("PickUpTime <=", value, "pickuptime");
            return (Criteria) this;
        }

        public Criteria andPickuptimeLike(String value) {
            addCriterion("PickUpTime like", value, "pickuptime");
            return (Criteria) this;
        }

        public Criteria andPickuptimeNotLike(String value) {
            addCriterion("PickUpTime not like", value, "pickuptime");
            return (Criteria) this;
        }

        public Criteria andPickuptimeIn(List<String> values) {
            addCriterion("PickUpTime in", values, "pickuptime");
            return (Criteria) this;
        }

        public Criteria andPickuptimeNotIn(List<String> values) {
            addCriterion("PickUpTime not in", values, "pickuptime");
            return (Criteria) this;
        }

        public Criteria andPickuptimeBetween(String value1, String value2) {
            addCriterion("PickUpTime between", value1, value2, "pickuptime");
            return (Criteria) this;
        }

        public Criteria andPickuptimeNotBetween(String value1, String value2) {
            addCriterion("PickUpTime not between", value1, value2, "pickuptime");
            return (Criteria) this;
        }

        public Criteria andGuestcardtypeIsNull() {
            addCriterion("GuestCardType is null");
            return (Criteria) this;
        }

        public Criteria andGuestcardtypeIsNotNull() {
            addCriterion("GuestCardType is not null");
            return (Criteria) this;
        }

        public Criteria andGuestcardtypeEqualTo(String value) {
            addCriterion("GuestCardType =", value, "guestcardtype");
            return (Criteria) this;
        }

        public Criteria andGuestcardtypeNotEqualTo(String value) {
            addCriterion("GuestCardType <>", value, "guestcardtype");
            return (Criteria) this;
        }

        public Criteria andGuestcardtypeGreaterThan(String value) {
            addCriterion("GuestCardType >", value, "guestcardtype");
            return (Criteria) this;
        }

        public Criteria andGuestcardtypeGreaterThanOrEqualTo(String value) {
            addCriterion("GuestCardType >=", value, "guestcardtype");
            return (Criteria) this;
        }

        public Criteria andGuestcardtypeLessThan(String value) {
            addCriterion("GuestCardType <", value, "guestcardtype");
            return (Criteria) this;
        }

        public Criteria andGuestcardtypeLessThanOrEqualTo(String value) {
            addCriterion("GuestCardType <=", value, "guestcardtype");
            return (Criteria) this;
        }

        public Criteria andGuestcardtypeLike(String value) {
            addCriterion("GuestCardType like", value, "guestcardtype");
            return (Criteria) this;
        }

        public Criteria andGuestcardtypeNotLike(String value) {
            addCriterion("GuestCardType not like", value, "guestcardtype");
            return (Criteria) this;
        }

        public Criteria andGuestcardtypeIn(List<String> values) {
            addCriterion("GuestCardType in", values, "guestcardtype");
            return (Criteria) this;
        }

        public Criteria andGuestcardtypeNotIn(List<String> values) {
            addCriterion("GuestCardType not in", values, "guestcardtype");
            return (Criteria) this;
        }

        public Criteria andGuestcardtypeBetween(String value1, String value2) {
            addCriterion("GuestCardType between", value1, value2, "guestcardtype");
            return (Criteria) this;
        }

        public Criteria andGuestcardtypeNotBetween(String value1, String value2) {
            addCriterion("GuestCardType not between", value1, value2, "guestcardtype");
            return (Criteria) this;
        }

        public Criteria andVenueidIsNull() {
            addCriterion("VenueID is null");
            return (Criteria) this;
        }

        public Criteria andVenueidIsNotNull() {
            addCriterion("VenueID is not null");
            return (Criteria) this;
        }

        public Criteria andVenueidEqualTo(String value) {
            addCriterion("VenueID =", value, "venueid");
            return (Criteria) this;
        }

        public Criteria andVenueidNotEqualTo(String value) {
            addCriterion("VenueID <>", value, "venueid");
            return (Criteria) this;
        }

        public Criteria andVenueidGreaterThan(String value) {
            addCriterion("VenueID >", value, "venueid");
            return (Criteria) this;
        }

        public Criteria andVenueidGreaterThanOrEqualTo(String value) {
            addCriterion("VenueID >=", value, "venueid");
            return (Criteria) this;
        }

        public Criteria andVenueidLessThan(String value) {
            addCriterion("VenueID <", value, "venueid");
            return (Criteria) this;
        }

        public Criteria andVenueidLessThanOrEqualTo(String value) {
            addCriterion("VenueID <=", value, "venueid");
            return (Criteria) this;
        }

        public Criteria andVenueidLike(String value) {
            addCriterion("VenueID like", value, "venueid");
            return (Criteria) this;
        }

        public Criteria andVenueidNotLike(String value) {
            addCriterion("VenueID not like", value, "venueid");
            return (Criteria) this;
        }

        public Criteria andVenueidIn(List<String> values) {
            addCriterion("VenueID in", values, "venueid");
            return (Criteria) this;
        }

        public Criteria andVenueidNotIn(List<String> values) {
            addCriterion("VenueID not in", values, "venueid");
            return (Criteria) this;
        }

        public Criteria andVenueidBetween(String value1, String value2) {
            addCriterion("VenueID between", value1, value2, "venueid");
            return (Criteria) this;
        }

        public Criteria andVenueidNotBetween(String value1, String value2) {
            addCriterion("VenueID not between", value1, value2, "venueid");
            return (Criteria) this;
        }

        public Criteria andIssingleroomIsNull() {
            addCriterion("IsSingleRoom is null");
            return (Criteria) this;
        }

        public Criteria andIssingleroomIsNotNull() {
            addCriterion("IsSingleRoom is not null");
            return (Criteria) this;
        }

        public Criteria andIssingleroomEqualTo(Boolean value) {
            addCriterion("IsSingleRoom =", value, "issingleroom");
            return (Criteria) this;
        }

        public Criteria andIssingleroomNotEqualTo(Boolean value) {
            addCriterion("IsSingleRoom <>", value, "issingleroom");
            return (Criteria) this;
        }

        public Criteria andIssingleroomGreaterThan(Boolean value) {
            addCriterion("IsSingleRoom >", value, "issingleroom");
            return (Criteria) this;
        }

        public Criteria andIssingleroomGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsSingleRoom >=", value, "issingleroom");
            return (Criteria) this;
        }

        public Criteria andIssingleroomLessThan(Boolean value) {
            addCriterion("IsSingleRoom <", value, "issingleroom");
            return (Criteria) this;
        }

        public Criteria andIssingleroomLessThanOrEqualTo(Boolean value) {
            addCriterion("IsSingleRoom <=", value, "issingleroom");
            return (Criteria) this;
        }

        public Criteria andIssingleroomIn(List<Boolean> values) {
            addCriterion("IsSingleRoom in", values, "issingleroom");
            return (Criteria) this;
        }

        public Criteria andIssingleroomNotIn(List<Boolean> values) {
            addCriterion("IsSingleRoom not in", values, "issingleroom");
            return (Criteria) this;
        }

        public Criteria andIssingleroomBetween(Boolean value1, Boolean value2) {
            addCriterion("IsSingleRoom between", value1, value2, "issingleroom");
            return (Criteria) this;
        }

        public Criteria andIssingleroomNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsSingleRoom not between", value1, value2, "issingleroom");
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