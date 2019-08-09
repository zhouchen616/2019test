package com.holyrobot.con_product.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProProductDirectVenueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProProductDirectVenueExample() {
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

        public Criteria andShuttlepricecostIsNull() {
            addCriterion("ShuttlePriceCost is null");
            return (Criteria) this;
        }

        public Criteria andShuttlepricecostIsNotNull() {
            addCriterion("ShuttlePriceCost is not null");
            return (Criteria) this;
        }

        public Criteria andShuttlepricecostEqualTo(BigDecimal value) {
            addCriterion("ShuttlePriceCost =", value, "shuttlepricecost");
            return (Criteria) this;
        }

        public Criteria andShuttlepricecostNotEqualTo(BigDecimal value) {
            addCriterion("ShuttlePriceCost <>", value, "shuttlepricecost");
            return (Criteria) this;
        }

        public Criteria andShuttlepricecostGreaterThan(BigDecimal value) {
            addCriterion("ShuttlePriceCost >", value, "shuttlepricecost");
            return (Criteria) this;
        }

        public Criteria andShuttlepricecostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ShuttlePriceCost >=", value, "shuttlepricecost");
            return (Criteria) this;
        }

        public Criteria andShuttlepricecostLessThan(BigDecimal value) {
            addCriterion("ShuttlePriceCost <", value, "shuttlepricecost");
            return (Criteria) this;
        }

        public Criteria andShuttlepricecostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ShuttlePriceCost <=", value, "shuttlepricecost");
            return (Criteria) this;
        }

        public Criteria andShuttlepricecostIn(List<BigDecimal> values) {
            addCriterion("ShuttlePriceCost in", values, "shuttlepricecost");
            return (Criteria) this;
        }

        public Criteria andShuttlepricecostNotIn(List<BigDecimal> values) {
            addCriterion("ShuttlePriceCost not in", values, "shuttlepricecost");
            return (Criteria) this;
        }

        public Criteria andShuttlepricecostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ShuttlePriceCost between", value1, value2, "shuttlepricecost");
            return (Criteria) this;
        }

        public Criteria andShuttlepricecostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ShuttlePriceCost not between", value1, value2, "shuttlepricecost");
            return (Criteria) this;
        }

        public Criteria andDropoffpricecostIsNull() {
            addCriterion("DropOffPriceCost is null");
            return (Criteria) this;
        }

        public Criteria andDropoffpricecostIsNotNull() {
            addCriterion("DropOffPriceCost is not null");
            return (Criteria) this;
        }

        public Criteria andDropoffpricecostEqualTo(BigDecimal value) {
            addCriterion("DropOffPriceCost =", value, "dropoffpricecost");
            return (Criteria) this;
        }

        public Criteria andDropoffpricecostNotEqualTo(BigDecimal value) {
            addCriterion("DropOffPriceCost <>", value, "dropoffpricecost");
            return (Criteria) this;
        }

        public Criteria andDropoffpricecostGreaterThan(BigDecimal value) {
            addCriterion("DropOffPriceCost >", value, "dropoffpricecost");
            return (Criteria) this;
        }

        public Criteria andDropoffpricecostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DropOffPriceCost >=", value, "dropoffpricecost");
            return (Criteria) this;
        }

        public Criteria andDropoffpricecostLessThan(BigDecimal value) {
            addCriterion("DropOffPriceCost <", value, "dropoffpricecost");
            return (Criteria) this;
        }

        public Criteria andDropoffpricecostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DropOffPriceCost <=", value, "dropoffpricecost");
            return (Criteria) this;
        }

        public Criteria andDropoffpricecostIn(List<BigDecimal> values) {
            addCriterion("DropOffPriceCost in", values, "dropoffpricecost");
            return (Criteria) this;
        }

        public Criteria andDropoffpricecostNotIn(List<BigDecimal> values) {
            addCriterion("DropOffPriceCost not in", values, "dropoffpricecost");
            return (Criteria) this;
        }

        public Criteria andDropoffpricecostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DropOffPriceCost between", value1, value2, "dropoffpricecost");
            return (Criteria) this;
        }

        public Criteria andDropoffpricecostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DropOffPriceCost not between", value1, value2, "dropoffpricecost");
            return (Criteria) this;
        }

        public Criteria andShuttlepricesalesIsNull() {
            addCriterion("ShuttlePriceSales is null");
            return (Criteria) this;
        }

        public Criteria andShuttlepricesalesIsNotNull() {
            addCriterion("ShuttlePriceSales is not null");
            return (Criteria) this;
        }

        public Criteria andShuttlepricesalesEqualTo(BigDecimal value) {
            addCriterion("ShuttlePriceSales =", value, "shuttlepricesales");
            return (Criteria) this;
        }

        public Criteria andShuttlepricesalesNotEqualTo(BigDecimal value) {
            addCriterion("ShuttlePriceSales <>", value, "shuttlepricesales");
            return (Criteria) this;
        }

        public Criteria andShuttlepricesalesGreaterThan(BigDecimal value) {
            addCriterion("ShuttlePriceSales >", value, "shuttlepricesales");
            return (Criteria) this;
        }

        public Criteria andShuttlepricesalesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ShuttlePriceSales >=", value, "shuttlepricesales");
            return (Criteria) this;
        }

        public Criteria andShuttlepricesalesLessThan(BigDecimal value) {
            addCriterion("ShuttlePriceSales <", value, "shuttlepricesales");
            return (Criteria) this;
        }

        public Criteria andShuttlepricesalesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ShuttlePriceSales <=", value, "shuttlepricesales");
            return (Criteria) this;
        }

        public Criteria andShuttlepricesalesIn(List<BigDecimal> values) {
            addCriterion("ShuttlePriceSales in", values, "shuttlepricesales");
            return (Criteria) this;
        }

        public Criteria andShuttlepricesalesNotIn(List<BigDecimal> values) {
            addCriterion("ShuttlePriceSales not in", values, "shuttlepricesales");
            return (Criteria) this;
        }

        public Criteria andShuttlepricesalesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ShuttlePriceSales between", value1, value2, "shuttlepricesales");
            return (Criteria) this;
        }

        public Criteria andShuttlepricesalesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ShuttlePriceSales not between", value1, value2, "shuttlepricesales");
            return (Criteria) this;
        }

        public Criteria andDropoffpricesalesIsNull() {
            addCriterion("DropOffPriceSales is null");
            return (Criteria) this;
        }

        public Criteria andDropoffpricesalesIsNotNull() {
            addCriterion("DropOffPriceSales is not null");
            return (Criteria) this;
        }

        public Criteria andDropoffpricesalesEqualTo(BigDecimal value) {
            addCriterion("DropOffPriceSales =", value, "dropoffpricesales");
            return (Criteria) this;
        }

        public Criteria andDropoffpricesalesNotEqualTo(BigDecimal value) {
            addCriterion("DropOffPriceSales <>", value, "dropoffpricesales");
            return (Criteria) this;
        }

        public Criteria andDropoffpricesalesGreaterThan(BigDecimal value) {
            addCriterion("DropOffPriceSales >", value, "dropoffpricesales");
            return (Criteria) this;
        }

        public Criteria andDropoffpricesalesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DropOffPriceSales >=", value, "dropoffpricesales");
            return (Criteria) this;
        }

        public Criteria andDropoffpricesalesLessThan(BigDecimal value) {
            addCriterion("DropOffPriceSales <", value, "dropoffpricesales");
            return (Criteria) this;
        }

        public Criteria andDropoffpricesalesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DropOffPriceSales <=", value, "dropoffpricesales");
            return (Criteria) this;
        }

        public Criteria andDropoffpricesalesIn(List<BigDecimal> values) {
            addCriterion("DropOffPriceSales in", values, "dropoffpricesales");
            return (Criteria) this;
        }

        public Criteria andDropoffpricesalesNotIn(List<BigDecimal> values) {
            addCriterion("DropOffPriceSales not in", values, "dropoffpricesales");
            return (Criteria) this;
        }

        public Criteria andDropoffpricesalesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DropOffPriceSales between", value1, value2, "dropoffpricesales");
            return (Criteria) this;
        }

        public Criteria andDropoffpricesalesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DropOffPriceSales not between", value1, value2, "dropoffpricesales");
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

        public Criteria andProtourvenueidIsNull() {
            addCriterion("ProTourVenueID is null");
            return (Criteria) this;
        }

        public Criteria andProtourvenueidIsNotNull() {
            addCriterion("ProTourVenueID is not null");
            return (Criteria) this;
        }

        public Criteria andProtourvenueidEqualTo(String value) {
            addCriterion("ProTourVenueID =", value, "protourvenueid");
            return (Criteria) this;
        }

        public Criteria andProtourvenueidNotEqualTo(String value) {
            addCriterion("ProTourVenueID <>", value, "protourvenueid");
            return (Criteria) this;
        }

        public Criteria andProtourvenueidGreaterThan(String value) {
            addCriterion("ProTourVenueID >", value, "protourvenueid");
            return (Criteria) this;
        }

        public Criteria andProtourvenueidGreaterThanOrEqualTo(String value) {
            addCriterion("ProTourVenueID >=", value, "protourvenueid");
            return (Criteria) this;
        }

        public Criteria andProtourvenueidLessThan(String value) {
            addCriterion("ProTourVenueID <", value, "protourvenueid");
            return (Criteria) this;
        }

        public Criteria andProtourvenueidLessThanOrEqualTo(String value) {
            addCriterion("ProTourVenueID <=", value, "protourvenueid");
            return (Criteria) this;
        }

        public Criteria andProtourvenueidLike(String value) {
            addCriterion("ProTourVenueID like", value, "protourvenueid");
            return (Criteria) this;
        }

        public Criteria andProtourvenueidNotLike(String value) {
            addCriterion("ProTourVenueID not like", value, "protourvenueid");
            return (Criteria) this;
        }

        public Criteria andProtourvenueidIn(List<String> values) {
            addCriterion("ProTourVenueID in", values, "protourvenueid");
            return (Criteria) this;
        }

        public Criteria andProtourvenueidNotIn(List<String> values) {
            addCriterion("ProTourVenueID not in", values, "protourvenueid");
            return (Criteria) this;
        }

        public Criteria andProtourvenueidBetween(String value1, String value2) {
            addCriterion("ProTourVenueID between", value1, value2, "protourvenueid");
            return (Criteria) this;
        }

        public Criteria andProtourvenueidNotBetween(String value1, String value2) {
            addCriterion("ProTourVenueID not between", value1, value2, "protourvenueid");
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