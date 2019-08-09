package com.holyrobot.con_product.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProTourVenueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProTourVenueExample() {
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

        public Criteria andVenueIsNull() {
            addCriterion("Venue is null");
            return (Criteria) this;
        }

        public Criteria andVenueIsNotNull() {
            addCriterion("Venue is not null");
            return (Criteria) this;
        }

        public Criteria andVenueEqualTo(String value) {
            addCriterion("Venue =", value, "venue");
            return (Criteria) this;
        }

        public Criteria andVenueNotEqualTo(String value) {
            addCriterion("Venue <>", value, "venue");
            return (Criteria) this;
        }

        public Criteria andVenueGreaterThan(String value) {
            addCriterion("Venue >", value, "venue");
            return (Criteria) this;
        }

        public Criteria andVenueGreaterThanOrEqualTo(String value) {
            addCriterion("Venue >=", value, "venue");
            return (Criteria) this;
        }

        public Criteria andVenueLessThan(String value) {
            addCriterion("Venue <", value, "venue");
            return (Criteria) this;
        }

        public Criteria andVenueLessThanOrEqualTo(String value) {
            addCriterion("Venue <=", value, "venue");
            return (Criteria) this;
        }

        public Criteria andVenueLike(String value) {
            addCriterion("Venue like", value, "venue");
            return (Criteria) this;
        }

        public Criteria andVenueNotLike(String value) {
            addCriterion("Venue not like", value, "venue");
            return (Criteria) this;
        }

        public Criteria andVenueIn(List<String> values) {
            addCriterion("Venue in", values, "venue");
            return (Criteria) this;
        }

        public Criteria andVenueNotIn(List<String> values) {
            addCriterion("Venue not in", values, "venue");
            return (Criteria) this;
        }

        public Criteria andVenueBetween(String value1, String value2) {
            addCriterion("Venue between", value1, value2, "venue");
            return (Criteria) this;
        }

        public Criteria andVenueNotBetween(String value1, String value2) {
            addCriterion("Venue not between", value1, value2, "venue");
            return (Criteria) this;
        }

        public Criteria andCollectiontimeIsNull() {
            addCriterion("CollectionTime is null");
            return (Criteria) this;
        }

        public Criteria andCollectiontimeIsNotNull() {
            addCriterion("CollectionTime is not null");
            return (Criteria) this;
        }

        public Criteria andCollectiontimeEqualTo(String value) {
            addCriterion("CollectionTime =", value, "collectiontime");
            return (Criteria) this;
        }

        public Criteria andCollectiontimeNotEqualTo(String value) {
            addCriterion("CollectionTime <>", value, "collectiontime");
            return (Criteria) this;
        }

        public Criteria andCollectiontimeGreaterThan(String value) {
            addCriterion("CollectionTime >", value, "collectiontime");
            return (Criteria) this;
        }

        public Criteria andCollectiontimeGreaterThanOrEqualTo(String value) {
            addCriterion("CollectionTime >=", value, "collectiontime");
            return (Criteria) this;
        }

        public Criteria andCollectiontimeLessThan(String value) {
            addCriterion("CollectionTime <", value, "collectiontime");
            return (Criteria) this;
        }

        public Criteria andCollectiontimeLessThanOrEqualTo(String value) {
            addCriterion("CollectionTime <=", value, "collectiontime");
            return (Criteria) this;
        }

        public Criteria andCollectiontimeLike(String value) {
            addCriterion("CollectionTime like", value, "collectiontime");
            return (Criteria) this;
        }

        public Criteria andCollectiontimeNotLike(String value) {
            addCriterion("CollectionTime not like", value, "collectiontime");
            return (Criteria) this;
        }

        public Criteria andCollectiontimeIn(List<String> values) {
            addCriterion("CollectionTime in", values, "collectiontime");
            return (Criteria) this;
        }

        public Criteria andCollectiontimeNotIn(List<String> values) {
            addCriterion("CollectionTime not in", values, "collectiontime");
            return (Criteria) this;
        }

        public Criteria andCollectiontimeBetween(String value1, String value2) {
            addCriterion("CollectionTime between", value1, value2, "collectiontime");
            return (Criteria) this;
        }

        public Criteria andCollectiontimeNotBetween(String value1, String value2) {
            addCriterion("CollectionTime not between", value1, value2, "collectiontime");
            return (Criteria) this;
        }

        public Criteria andShuttlepriceIsNull() {
            addCriterion("ShuttlePrice is null");
            return (Criteria) this;
        }

        public Criteria andShuttlepriceIsNotNull() {
            addCriterion("ShuttlePrice is not null");
            return (Criteria) this;
        }

        public Criteria andShuttlepriceEqualTo(BigDecimal value) {
            addCriterion("ShuttlePrice =", value, "shuttleprice");
            return (Criteria) this;
        }

        public Criteria andShuttlepriceNotEqualTo(BigDecimal value) {
            addCriterion("ShuttlePrice <>", value, "shuttleprice");
            return (Criteria) this;
        }

        public Criteria andShuttlepriceGreaterThan(BigDecimal value) {
            addCriterion("ShuttlePrice >", value, "shuttleprice");
            return (Criteria) this;
        }

        public Criteria andShuttlepriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ShuttlePrice >=", value, "shuttleprice");
            return (Criteria) this;
        }

        public Criteria andShuttlepriceLessThan(BigDecimal value) {
            addCriterion("ShuttlePrice <", value, "shuttleprice");
            return (Criteria) this;
        }

        public Criteria andShuttlepriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ShuttlePrice <=", value, "shuttleprice");
            return (Criteria) this;
        }

        public Criteria andShuttlepriceIn(List<BigDecimal> values) {
            addCriterion("ShuttlePrice in", values, "shuttleprice");
            return (Criteria) this;
        }

        public Criteria andShuttlepriceNotIn(List<BigDecimal> values) {
            addCriterion("ShuttlePrice not in", values, "shuttleprice");
            return (Criteria) this;
        }

        public Criteria andShuttlepriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ShuttlePrice between", value1, value2, "shuttleprice");
            return (Criteria) this;
        }

        public Criteria andShuttlepriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ShuttlePrice not between", value1, value2, "shuttleprice");
            return (Criteria) this;
        }

        public Criteria andDropoffpriceIsNull() {
            addCriterion("DropOffPrice is null");
            return (Criteria) this;
        }

        public Criteria andDropoffpriceIsNotNull() {
            addCriterion("DropOffPrice is not null");
            return (Criteria) this;
        }

        public Criteria andDropoffpriceEqualTo(BigDecimal value) {
            addCriterion("DropOffPrice =", value, "dropoffprice");
            return (Criteria) this;
        }

        public Criteria andDropoffpriceNotEqualTo(BigDecimal value) {
            addCriterion("DropOffPrice <>", value, "dropoffprice");
            return (Criteria) this;
        }

        public Criteria andDropoffpriceGreaterThan(BigDecimal value) {
            addCriterion("DropOffPrice >", value, "dropoffprice");
            return (Criteria) this;
        }

        public Criteria andDropoffpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DropOffPrice >=", value, "dropoffprice");
            return (Criteria) this;
        }

        public Criteria andDropoffpriceLessThan(BigDecimal value) {
            addCriterion("DropOffPrice <", value, "dropoffprice");
            return (Criteria) this;
        }

        public Criteria andDropoffpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DropOffPrice <=", value, "dropoffprice");
            return (Criteria) this;
        }

        public Criteria andDropoffpriceIn(List<BigDecimal> values) {
            addCriterion("DropOffPrice in", values, "dropoffprice");
            return (Criteria) this;
        }

        public Criteria andDropoffpriceNotIn(List<BigDecimal> values) {
            addCriterion("DropOffPrice not in", values, "dropoffprice");
            return (Criteria) this;
        }

        public Criteria andDropoffpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DropOffPrice between", value1, value2, "dropoffprice");
            return (Criteria) this;
        }

        public Criteria andDropoffpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DropOffPrice not between", value1, value2, "dropoffprice");
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

        public Criteria andDeparturenameIsNull() {
            addCriterion("DepartureName is null");
            return (Criteria) this;
        }

        public Criteria andDeparturenameIsNotNull() {
            addCriterion("DepartureName is not null");
            return (Criteria) this;
        }

        public Criteria andDeparturenameEqualTo(String value) {
            addCriterion("DepartureName =", value, "departurename");
            return (Criteria) this;
        }

        public Criteria andDeparturenameNotEqualTo(String value) {
            addCriterion("DepartureName <>", value, "departurename");
            return (Criteria) this;
        }

        public Criteria andDeparturenameGreaterThan(String value) {
            addCriterion("DepartureName >", value, "departurename");
            return (Criteria) this;
        }

        public Criteria andDeparturenameGreaterThanOrEqualTo(String value) {
            addCriterion("DepartureName >=", value, "departurename");
            return (Criteria) this;
        }

        public Criteria andDeparturenameLessThan(String value) {
            addCriterion("DepartureName <", value, "departurename");
            return (Criteria) this;
        }

        public Criteria andDeparturenameLessThanOrEqualTo(String value) {
            addCriterion("DepartureName <=", value, "departurename");
            return (Criteria) this;
        }

        public Criteria andDeparturenameLike(String value) {
            addCriterion("DepartureName like", value, "departurename");
            return (Criteria) this;
        }

        public Criteria andDeparturenameNotLike(String value) {
            addCriterion("DepartureName not like", value, "departurename");
            return (Criteria) this;
        }

        public Criteria andDeparturenameIn(List<String> values) {
            addCriterion("DepartureName in", values, "departurename");
            return (Criteria) this;
        }

        public Criteria andDeparturenameNotIn(List<String> values) {
            addCriterion("DepartureName not in", values, "departurename");
            return (Criteria) this;
        }

        public Criteria andDeparturenameBetween(String value1, String value2) {
            addCriterion("DepartureName between", value1, value2, "departurename");
            return (Criteria) this;
        }

        public Criteria andDeparturenameNotBetween(String value1, String value2) {
            addCriterion("DepartureName not between", value1, value2, "departurename");
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