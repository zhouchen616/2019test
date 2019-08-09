package com.holyrobot.con_om.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OmOrgWechatConfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OmOrgWechatConfExample() {
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

        public Criteria andWxappidIsNull() {
            addCriterion("WxAppID is null");
            return (Criteria) this;
        }

        public Criteria andWxappidIsNotNull() {
            addCriterion("WxAppID is not null");
            return (Criteria) this;
        }

        public Criteria andWxappidEqualTo(String value) {
            addCriterion("WxAppID =", value, "wxappid");
            return (Criteria) this;
        }

        public Criteria andWxappidNotEqualTo(String value) {
            addCriterion("WxAppID <>", value, "wxappid");
            return (Criteria) this;
        }

        public Criteria andWxappidGreaterThan(String value) {
            addCriterion("WxAppID >", value, "wxappid");
            return (Criteria) this;
        }

        public Criteria andWxappidGreaterThanOrEqualTo(String value) {
            addCriterion("WxAppID >=", value, "wxappid");
            return (Criteria) this;
        }

        public Criteria andWxappidLessThan(String value) {
            addCriterion("WxAppID <", value, "wxappid");
            return (Criteria) this;
        }

        public Criteria andWxappidLessThanOrEqualTo(String value) {
            addCriterion("WxAppID <=", value, "wxappid");
            return (Criteria) this;
        }

        public Criteria andWxappidLike(String value) {
            addCriterion("WxAppID like", value, "wxappid");
            return (Criteria) this;
        }

        public Criteria andWxappidNotLike(String value) {
            addCriterion("WxAppID not like", value, "wxappid");
            return (Criteria) this;
        }

        public Criteria andWxappidIn(List<String> values) {
            addCriterion("WxAppID in", values, "wxappid");
            return (Criteria) this;
        }

        public Criteria andWxappidNotIn(List<String> values) {
            addCriterion("WxAppID not in", values, "wxappid");
            return (Criteria) this;
        }

        public Criteria andWxappidBetween(String value1, String value2) {
            addCriterion("WxAppID between", value1, value2, "wxappid");
            return (Criteria) this;
        }

        public Criteria andWxappidNotBetween(String value1, String value2) {
            addCriterion("WxAppID not between", value1, value2, "wxappid");
            return (Criteria) this;
        }

        public Criteria andWxappsecretIsNull() {
            addCriterion("WxAppSecret is null");
            return (Criteria) this;
        }

        public Criteria andWxappsecretIsNotNull() {
            addCriterion("WxAppSecret is not null");
            return (Criteria) this;
        }

        public Criteria andWxappsecretEqualTo(String value) {
            addCriterion("WxAppSecret =", value, "wxappsecret");
            return (Criteria) this;
        }

        public Criteria andWxappsecretNotEqualTo(String value) {
            addCriterion("WxAppSecret <>", value, "wxappsecret");
            return (Criteria) this;
        }

        public Criteria andWxappsecretGreaterThan(String value) {
            addCriterion("WxAppSecret >", value, "wxappsecret");
            return (Criteria) this;
        }

        public Criteria andWxappsecretGreaterThanOrEqualTo(String value) {
            addCriterion("WxAppSecret >=", value, "wxappsecret");
            return (Criteria) this;
        }

        public Criteria andWxappsecretLessThan(String value) {
            addCriterion("WxAppSecret <", value, "wxappsecret");
            return (Criteria) this;
        }

        public Criteria andWxappsecretLessThanOrEqualTo(String value) {
            addCriterion("WxAppSecret <=", value, "wxappsecret");
            return (Criteria) this;
        }

        public Criteria andWxappsecretLike(String value) {
            addCriterion("WxAppSecret like", value, "wxappsecret");
            return (Criteria) this;
        }

        public Criteria andWxappsecretNotLike(String value) {
            addCriterion("WxAppSecret not like", value, "wxappsecret");
            return (Criteria) this;
        }

        public Criteria andWxappsecretIn(List<String> values) {
            addCriterion("WxAppSecret in", values, "wxappsecret");
            return (Criteria) this;
        }

        public Criteria andWxappsecretNotIn(List<String> values) {
            addCriterion("WxAppSecret not in", values, "wxappsecret");
            return (Criteria) this;
        }

        public Criteria andWxappsecretBetween(String value1, String value2) {
            addCriterion("WxAppSecret between", value1, value2, "wxappsecret");
            return (Criteria) this;
        }

        public Criteria andWxappsecretNotBetween(String value1, String value2) {
            addCriterion("WxAppSecret not between", value1, value2, "wxappsecret");
            return (Criteria) this;
        }

        public Criteria andWxappdomainfileIsNull() {
            addCriterion("WxAppDomainFile is null");
            return (Criteria) this;
        }

        public Criteria andWxappdomainfileIsNotNull() {
            addCriterion("WxAppDomainFile is not null");
            return (Criteria) this;
        }

        public Criteria andWxappdomainfileEqualTo(String value) {
            addCriterion("WxAppDomainFile =", value, "wxappdomainfile");
            return (Criteria) this;
        }

        public Criteria andWxappdomainfileNotEqualTo(String value) {
            addCriterion("WxAppDomainFile <>", value, "wxappdomainfile");
            return (Criteria) this;
        }

        public Criteria andWxappdomainfileGreaterThan(String value) {
            addCriterion("WxAppDomainFile >", value, "wxappdomainfile");
            return (Criteria) this;
        }

        public Criteria andWxappdomainfileGreaterThanOrEqualTo(String value) {
            addCriterion("WxAppDomainFile >=", value, "wxappdomainfile");
            return (Criteria) this;
        }

        public Criteria andWxappdomainfileLessThan(String value) {
            addCriterion("WxAppDomainFile <", value, "wxappdomainfile");
            return (Criteria) this;
        }

        public Criteria andWxappdomainfileLessThanOrEqualTo(String value) {
            addCriterion("WxAppDomainFile <=", value, "wxappdomainfile");
            return (Criteria) this;
        }

        public Criteria andWxappdomainfileLike(String value) {
            addCriterion("WxAppDomainFile like", value, "wxappdomainfile");
            return (Criteria) this;
        }

        public Criteria andWxappdomainfileNotLike(String value) {
            addCriterion("WxAppDomainFile not like", value, "wxappdomainfile");
            return (Criteria) this;
        }

        public Criteria andWxappdomainfileIn(List<String> values) {
            addCriterion("WxAppDomainFile in", values, "wxappdomainfile");
            return (Criteria) this;
        }

        public Criteria andWxappdomainfileNotIn(List<String> values) {
            addCriterion("WxAppDomainFile not in", values, "wxappdomainfile");
            return (Criteria) this;
        }

        public Criteria andWxappdomainfileBetween(String value1, String value2) {
            addCriterion("WxAppDomainFile between", value1, value2, "wxappdomainfile");
            return (Criteria) this;
        }

        public Criteria andWxappdomainfileNotBetween(String value1, String value2) {
            addCriterion("WxAppDomainFile not between", value1, value2, "wxappdomainfile");
            return (Criteria) this;
        }

        public Criteria andWxbusinessdomainIsNull() {
            addCriterion("WxBusinessDomain is null");
            return (Criteria) this;
        }

        public Criteria andWxbusinessdomainIsNotNull() {
            addCriterion("WxBusinessDomain is not null");
            return (Criteria) this;
        }

        public Criteria andWxbusinessdomainEqualTo(String value) {
            addCriterion("WxBusinessDomain =", value, "wxbusinessdomain");
            return (Criteria) this;
        }

        public Criteria andWxbusinessdomainNotEqualTo(String value) {
            addCriterion("WxBusinessDomain <>", value, "wxbusinessdomain");
            return (Criteria) this;
        }

        public Criteria andWxbusinessdomainGreaterThan(String value) {
            addCriterion("WxBusinessDomain >", value, "wxbusinessdomain");
            return (Criteria) this;
        }

        public Criteria andWxbusinessdomainGreaterThanOrEqualTo(String value) {
            addCriterion("WxBusinessDomain >=", value, "wxbusinessdomain");
            return (Criteria) this;
        }

        public Criteria andWxbusinessdomainLessThan(String value) {
            addCriterion("WxBusinessDomain <", value, "wxbusinessdomain");
            return (Criteria) this;
        }

        public Criteria andWxbusinessdomainLessThanOrEqualTo(String value) {
            addCriterion("WxBusinessDomain <=", value, "wxbusinessdomain");
            return (Criteria) this;
        }

        public Criteria andWxbusinessdomainLike(String value) {
            addCriterion("WxBusinessDomain like", value, "wxbusinessdomain");
            return (Criteria) this;
        }

        public Criteria andWxbusinessdomainNotLike(String value) {
            addCriterion("WxBusinessDomain not like", value, "wxbusinessdomain");
            return (Criteria) this;
        }

        public Criteria andWxbusinessdomainIn(List<String> values) {
            addCriterion("WxBusinessDomain in", values, "wxbusinessdomain");
            return (Criteria) this;
        }

        public Criteria andWxbusinessdomainNotIn(List<String> values) {
            addCriterion("WxBusinessDomain not in", values, "wxbusinessdomain");
            return (Criteria) this;
        }

        public Criteria andWxbusinessdomainBetween(String value1, String value2) {
            addCriterion("WxBusinessDomain between", value1, value2, "wxbusinessdomain");
            return (Criteria) this;
        }

        public Criteria andWxbusinessdomainNotBetween(String value1, String value2) {
            addCriterion("WxBusinessDomain not between", value1, value2, "wxbusinessdomain");
            return (Criteria) this;
        }

        public Criteria andWxjsdomainIsNull() {
            addCriterion("WxJsDomain is null");
            return (Criteria) this;
        }

        public Criteria andWxjsdomainIsNotNull() {
            addCriterion("WxJsDomain is not null");
            return (Criteria) this;
        }

        public Criteria andWxjsdomainEqualTo(String value) {
            addCriterion("WxJsDomain =", value, "wxjsdomain");
            return (Criteria) this;
        }

        public Criteria andWxjsdomainNotEqualTo(String value) {
            addCriterion("WxJsDomain <>", value, "wxjsdomain");
            return (Criteria) this;
        }

        public Criteria andWxjsdomainGreaterThan(String value) {
            addCriterion("WxJsDomain >", value, "wxjsdomain");
            return (Criteria) this;
        }

        public Criteria andWxjsdomainGreaterThanOrEqualTo(String value) {
            addCriterion("WxJsDomain >=", value, "wxjsdomain");
            return (Criteria) this;
        }

        public Criteria andWxjsdomainLessThan(String value) {
            addCriterion("WxJsDomain <", value, "wxjsdomain");
            return (Criteria) this;
        }

        public Criteria andWxjsdomainLessThanOrEqualTo(String value) {
            addCriterion("WxJsDomain <=", value, "wxjsdomain");
            return (Criteria) this;
        }

        public Criteria andWxjsdomainLike(String value) {
            addCriterion("WxJsDomain like", value, "wxjsdomain");
            return (Criteria) this;
        }

        public Criteria andWxjsdomainNotLike(String value) {
            addCriterion("WxJsDomain not like", value, "wxjsdomain");
            return (Criteria) this;
        }

        public Criteria andWxjsdomainIn(List<String> values) {
            addCriterion("WxJsDomain in", values, "wxjsdomain");
            return (Criteria) this;
        }

        public Criteria andWxjsdomainNotIn(List<String> values) {
            addCriterion("WxJsDomain not in", values, "wxjsdomain");
            return (Criteria) this;
        }

        public Criteria andWxjsdomainBetween(String value1, String value2) {
            addCriterion("WxJsDomain between", value1, value2, "wxjsdomain");
            return (Criteria) this;
        }

        public Criteria andWxjsdomainNotBetween(String value1, String value2) {
            addCriterion("WxJsDomain not between", value1, value2, "wxjsdomain");
            return (Criteria) this;
        }

        public Criteria andWxauthdomainIsNull() {
            addCriterion("WxAuthDomain is null");
            return (Criteria) this;
        }

        public Criteria andWxauthdomainIsNotNull() {
            addCriterion("WxAuthDomain is not null");
            return (Criteria) this;
        }

        public Criteria andWxauthdomainEqualTo(String value) {
            addCriterion("WxAuthDomain =", value, "wxauthdomain");
            return (Criteria) this;
        }

        public Criteria andWxauthdomainNotEqualTo(String value) {
            addCriterion("WxAuthDomain <>", value, "wxauthdomain");
            return (Criteria) this;
        }

        public Criteria andWxauthdomainGreaterThan(String value) {
            addCriterion("WxAuthDomain >", value, "wxauthdomain");
            return (Criteria) this;
        }

        public Criteria andWxauthdomainGreaterThanOrEqualTo(String value) {
            addCriterion("WxAuthDomain >=", value, "wxauthdomain");
            return (Criteria) this;
        }

        public Criteria andWxauthdomainLessThan(String value) {
            addCriterion("WxAuthDomain <", value, "wxauthdomain");
            return (Criteria) this;
        }

        public Criteria andWxauthdomainLessThanOrEqualTo(String value) {
            addCriterion("WxAuthDomain <=", value, "wxauthdomain");
            return (Criteria) this;
        }

        public Criteria andWxauthdomainLike(String value) {
            addCriterion("WxAuthDomain like", value, "wxauthdomain");
            return (Criteria) this;
        }

        public Criteria andWxauthdomainNotLike(String value) {
            addCriterion("WxAuthDomain not like", value, "wxauthdomain");
            return (Criteria) this;
        }

        public Criteria andWxauthdomainIn(List<String> values) {
            addCriterion("WxAuthDomain in", values, "wxauthdomain");
            return (Criteria) this;
        }

        public Criteria andWxauthdomainNotIn(List<String> values) {
            addCriterion("WxAuthDomain not in", values, "wxauthdomain");
            return (Criteria) this;
        }

        public Criteria andWxauthdomainBetween(String value1, String value2) {
            addCriterion("WxAuthDomain between", value1, value2, "wxauthdomain");
            return (Criteria) this;
        }

        public Criteria andWxauthdomainNotBetween(String value1, String value2) {
            addCriterion("WxAuthDomain not between", value1, value2, "wxauthdomain");
            return (Criteria) this;
        }

        public Criteria andWxmchidIsNull() {
            addCriterion("WxMchID is null");
            return (Criteria) this;
        }

        public Criteria andWxmchidIsNotNull() {
            addCriterion("WxMchID is not null");
            return (Criteria) this;
        }

        public Criteria andWxmchidEqualTo(String value) {
            addCriterion("WxMchID =", value, "wxmchid");
            return (Criteria) this;
        }

        public Criteria andWxmchidNotEqualTo(String value) {
            addCriterion("WxMchID <>", value, "wxmchid");
            return (Criteria) this;
        }

        public Criteria andWxmchidGreaterThan(String value) {
            addCriterion("WxMchID >", value, "wxmchid");
            return (Criteria) this;
        }

        public Criteria andWxmchidGreaterThanOrEqualTo(String value) {
            addCriterion("WxMchID >=", value, "wxmchid");
            return (Criteria) this;
        }

        public Criteria andWxmchidLessThan(String value) {
            addCriterion("WxMchID <", value, "wxmchid");
            return (Criteria) this;
        }

        public Criteria andWxmchidLessThanOrEqualTo(String value) {
            addCriterion("WxMchID <=", value, "wxmchid");
            return (Criteria) this;
        }

        public Criteria andWxmchidLike(String value) {
            addCriterion("WxMchID like", value, "wxmchid");
            return (Criteria) this;
        }

        public Criteria andWxmchidNotLike(String value) {
            addCriterion("WxMchID not like", value, "wxmchid");
            return (Criteria) this;
        }

        public Criteria andWxmchidIn(List<String> values) {
            addCriterion("WxMchID in", values, "wxmchid");
            return (Criteria) this;
        }

        public Criteria andWxmchidNotIn(List<String> values) {
            addCriterion("WxMchID not in", values, "wxmchid");
            return (Criteria) this;
        }

        public Criteria andWxmchidBetween(String value1, String value2) {
            addCriterion("WxMchID between", value1, value2, "wxmchid");
            return (Criteria) this;
        }

        public Criteria andWxmchidNotBetween(String value1, String value2) {
            addCriterion("WxMchID not between", value1, value2, "wxmchid");
            return (Criteria) this;
        }

        public Criteria andWxpaykeyIsNull() {
            addCriterion("WxPayKey is null");
            return (Criteria) this;
        }

        public Criteria andWxpaykeyIsNotNull() {
            addCriterion("WxPayKey is not null");
            return (Criteria) this;
        }

        public Criteria andWxpaykeyEqualTo(String value) {
            addCriterion("WxPayKey =", value, "wxpaykey");
            return (Criteria) this;
        }

        public Criteria andWxpaykeyNotEqualTo(String value) {
            addCriterion("WxPayKey <>", value, "wxpaykey");
            return (Criteria) this;
        }

        public Criteria andWxpaykeyGreaterThan(String value) {
            addCriterion("WxPayKey >", value, "wxpaykey");
            return (Criteria) this;
        }

        public Criteria andWxpaykeyGreaterThanOrEqualTo(String value) {
            addCriterion("WxPayKey >=", value, "wxpaykey");
            return (Criteria) this;
        }

        public Criteria andWxpaykeyLessThan(String value) {
            addCriterion("WxPayKey <", value, "wxpaykey");
            return (Criteria) this;
        }

        public Criteria andWxpaykeyLessThanOrEqualTo(String value) {
            addCriterion("WxPayKey <=", value, "wxpaykey");
            return (Criteria) this;
        }

        public Criteria andWxpaykeyLike(String value) {
            addCriterion("WxPayKey like", value, "wxpaykey");
            return (Criteria) this;
        }

        public Criteria andWxpaykeyNotLike(String value) {
            addCriterion("WxPayKey not like", value, "wxpaykey");
            return (Criteria) this;
        }

        public Criteria andWxpaykeyIn(List<String> values) {
            addCriterion("WxPayKey in", values, "wxpaykey");
            return (Criteria) this;
        }

        public Criteria andWxpaykeyNotIn(List<String> values) {
            addCriterion("WxPayKey not in", values, "wxpaykey");
            return (Criteria) this;
        }

        public Criteria andWxpaykeyBetween(String value1, String value2) {
            addCriterion("WxPayKey between", value1, value2, "wxpaykey");
            return (Criteria) this;
        }

        public Criteria andWxpaykeyNotBetween(String value1, String value2) {
            addCriterion("WxPayKey not between", value1, value2, "wxpaykey");
            return (Criteria) this;
        }

        public Criteria andCertlocalpathIsNull() {
            addCriterion("CertLocalPath is null");
            return (Criteria) this;
        }

        public Criteria andCertlocalpathIsNotNull() {
            addCriterion("CertLocalPath is not null");
            return (Criteria) this;
        }

        public Criteria andCertlocalpathEqualTo(String value) {
            addCriterion("CertLocalPath =", value, "certlocalpath");
            return (Criteria) this;
        }

        public Criteria andCertlocalpathNotEqualTo(String value) {
            addCriterion("CertLocalPath <>", value, "certlocalpath");
            return (Criteria) this;
        }

        public Criteria andCertlocalpathGreaterThan(String value) {
            addCriterion("CertLocalPath >", value, "certlocalpath");
            return (Criteria) this;
        }

        public Criteria andCertlocalpathGreaterThanOrEqualTo(String value) {
            addCriterion("CertLocalPath >=", value, "certlocalpath");
            return (Criteria) this;
        }

        public Criteria andCertlocalpathLessThan(String value) {
            addCriterion("CertLocalPath <", value, "certlocalpath");
            return (Criteria) this;
        }

        public Criteria andCertlocalpathLessThanOrEqualTo(String value) {
            addCriterion("CertLocalPath <=", value, "certlocalpath");
            return (Criteria) this;
        }

        public Criteria andCertlocalpathLike(String value) {
            addCriterion("CertLocalPath like", value, "certlocalpath");
            return (Criteria) this;
        }

        public Criteria andCertlocalpathNotLike(String value) {
            addCriterion("CertLocalPath not like", value, "certlocalpath");
            return (Criteria) this;
        }

        public Criteria andCertlocalpathIn(List<String> values) {
            addCriterion("CertLocalPath in", values, "certlocalpath");
            return (Criteria) this;
        }

        public Criteria andCertlocalpathNotIn(List<String> values) {
            addCriterion("CertLocalPath not in", values, "certlocalpath");
            return (Criteria) this;
        }

        public Criteria andCertlocalpathBetween(String value1, String value2) {
            addCriterion("CertLocalPath between", value1, value2, "certlocalpath");
            return (Criteria) this;
        }

        public Criteria andCertlocalpathNotBetween(String value1, String value2) {
            addCriterion("CertLocalPath not between", value1, value2, "certlocalpath");
            return (Criteria) this;
        }

        public Criteria andWxpaynotifyurlIsNull() {
            addCriterion("WxPayNotifyUrl is null");
            return (Criteria) this;
        }

        public Criteria andWxpaynotifyurlIsNotNull() {
            addCriterion("WxPayNotifyUrl is not null");
            return (Criteria) this;
        }

        public Criteria andWxpaynotifyurlEqualTo(String value) {
            addCriterion("WxPayNotifyUrl =", value, "wxpaynotifyurl");
            return (Criteria) this;
        }

        public Criteria andWxpaynotifyurlNotEqualTo(String value) {
            addCriterion("WxPayNotifyUrl <>", value, "wxpaynotifyurl");
            return (Criteria) this;
        }

        public Criteria andWxpaynotifyurlGreaterThan(String value) {
            addCriterion("WxPayNotifyUrl >", value, "wxpaynotifyurl");
            return (Criteria) this;
        }

        public Criteria andWxpaynotifyurlGreaterThanOrEqualTo(String value) {
            addCriterion("WxPayNotifyUrl >=", value, "wxpaynotifyurl");
            return (Criteria) this;
        }

        public Criteria andWxpaynotifyurlLessThan(String value) {
            addCriterion("WxPayNotifyUrl <", value, "wxpaynotifyurl");
            return (Criteria) this;
        }

        public Criteria andWxpaynotifyurlLessThanOrEqualTo(String value) {
            addCriterion("WxPayNotifyUrl <=", value, "wxpaynotifyurl");
            return (Criteria) this;
        }

        public Criteria andWxpaynotifyurlLike(String value) {
            addCriterion("WxPayNotifyUrl like", value, "wxpaynotifyurl");
            return (Criteria) this;
        }

        public Criteria andWxpaynotifyurlNotLike(String value) {
            addCriterion("WxPayNotifyUrl not like", value, "wxpaynotifyurl");
            return (Criteria) this;
        }

        public Criteria andWxpaynotifyurlIn(List<String> values) {
            addCriterion("WxPayNotifyUrl in", values, "wxpaynotifyurl");
            return (Criteria) this;
        }

        public Criteria andWxpaynotifyurlNotIn(List<String> values) {
            addCriterion("WxPayNotifyUrl not in", values, "wxpaynotifyurl");
            return (Criteria) this;
        }

        public Criteria andWxpaynotifyurlBetween(String value1, String value2) {
            addCriterion("WxPayNotifyUrl between", value1, value2, "wxpaynotifyurl");
            return (Criteria) this;
        }

        public Criteria andWxpaynotifyurlNotBetween(String value1, String value2) {
            addCriterion("WxPayNotifyUrl not between", value1, value2, "wxpaynotifyurl");
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

        public Criteria andWxappnameIsNull() {
            addCriterion("WxAppName is null");
            return (Criteria) this;
        }

        public Criteria andWxappnameIsNotNull() {
            addCriterion("WxAppName is not null");
            return (Criteria) this;
        }

        public Criteria andWxappnameEqualTo(String value) {
            addCriterion("WxAppName =", value, "wxappname");
            return (Criteria) this;
        }

        public Criteria andWxappnameNotEqualTo(String value) {
            addCriterion("WxAppName <>", value, "wxappname");
            return (Criteria) this;
        }

        public Criteria andWxappnameGreaterThan(String value) {
            addCriterion("WxAppName >", value, "wxappname");
            return (Criteria) this;
        }

        public Criteria andWxappnameGreaterThanOrEqualTo(String value) {
            addCriterion("WxAppName >=", value, "wxappname");
            return (Criteria) this;
        }

        public Criteria andWxappnameLessThan(String value) {
            addCriterion("WxAppName <", value, "wxappname");
            return (Criteria) this;
        }

        public Criteria andWxappnameLessThanOrEqualTo(String value) {
            addCriterion("WxAppName <=", value, "wxappname");
            return (Criteria) this;
        }

        public Criteria andWxappnameLike(String value) {
            addCriterion("WxAppName like", value, "wxappname");
            return (Criteria) this;
        }

        public Criteria andWxappnameNotLike(String value) {
            addCriterion("WxAppName not like", value, "wxappname");
            return (Criteria) this;
        }

        public Criteria andWxappnameIn(List<String> values) {
            addCriterion("WxAppName in", values, "wxappname");
            return (Criteria) this;
        }

        public Criteria andWxappnameNotIn(List<String> values) {
            addCriterion("WxAppName not in", values, "wxappname");
            return (Criteria) this;
        }

        public Criteria andWxappnameBetween(String value1, String value2) {
            addCriterion("WxAppName between", value1, value2, "wxappname");
            return (Criteria) this;
        }

        public Criteria andWxappnameNotBetween(String value1, String value2) {
            addCriterion("WxAppName not between", value1, value2, "wxappname");
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