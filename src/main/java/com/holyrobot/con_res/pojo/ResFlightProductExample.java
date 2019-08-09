package com.holyrobot.con_res.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResFlightProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResFlightProductExample() {
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

        public Criteria andFlightdateIsNull() {
            addCriterion("FlightDate is null");
            return (Criteria) this;
        }

        public Criteria andFlightdateIsNotNull() {
            addCriterion("FlightDate is not null");
            return (Criteria) this;
        }

        public Criteria andFlightdateEqualTo(Date value) {
            addCriterion("FlightDate =", value, "flightdate");
            return (Criteria) this;
        }

        public Criteria andFlightdateNotEqualTo(Date value) {
            addCriterion("FlightDate <>", value, "flightdate");
            return (Criteria) this;
        }

        public Criteria andFlightdateGreaterThan(Date value) {
            addCriterion("FlightDate >", value, "flightdate");
            return (Criteria) this;
        }

        public Criteria andFlightdateGreaterThanOrEqualTo(Date value) {
            addCriterion("FlightDate >=", value, "flightdate");
            return (Criteria) this;
        }

        public Criteria andFlightdateLessThan(Date value) {
            addCriterion("FlightDate <", value, "flightdate");
            return (Criteria) this;
        }

        public Criteria andFlightdateLessThanOrEqualTo(Date value) {
            addCriterion("FlightDate <=", value, "flightdate");
            return (Criteria) this;
        }

        public Criteria andFlightdateIn(List<Date> values) {
            addCriterion("FlightDate in", values, "flightdate");
            return (Criteria) this;
        }

        public Criteria andFlightdateNotIn(List<Date> values) {
            addCriterion("FlightDate not in", values, "flightdate");
            return (Criteria) this;
        }

        public Criteria andFlightdateBetween(Date value1, Date value2) {
            addCriterion("FlightDate between", value1, value2, "flightdate");
            return (Criteria) this;
        }

        public Criteria andFlightdateNotBetween(Date value1, Date value2) {
            addCriterion("FlightDate not between", value1, value2, "flightdate");
            return (Criteria) this;
        }

        public Criteria andIntervaldaysIsNull() {
            addCriterion("IntervalDays is null");
            return (Criteria) this;
        }

        public Criteria andIntervaldaysIsNotNull() {
            addCriterion("IntervalDays is not null");
            return (Criteria) this;
        }

        public Criteria andIntervaldaysEqualTo(Integer value) {
            addCriterion("IntervalDays =", value, "intervaldays");
            return (Criteria) this;
        }

        public Criteria andIntervaldaysNotEqualTo(Integer value) {
            addCriterion("IntervalDays <>", value, "intervaldays");
            return (Criteria) this;
        }

        public Criteria andIntervaldaysGreaterThan(Integer value) {
            addCriterion("IntervalDays >", value, "intervaldays");
            return (Criteria) this;
        }

        public Criteria andIntervaldaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("IntervalDays >=", value, "intervaldays");
            return (Criteria) this;
        }

        public Criteria andIntervaldaysLessThan(Integer value) {
            addCriterion("IntervalDays <", value, "intervaldays");
            return (Criteria) this;
        }

        public Criteria andIntervaldaysLessThanOrEqualTo(Integer value) {
            addCriterion("IntervalDays <=", value, "intervaldays");
            return (Criteria) this;
        }

        public Criteria andIntervaldaysIn(List<Integer> values) {
            addCriterion("IntervalDays in", values, "intervaldays");
            return (Criteria) this;
        }

        public Criteria andIntervaldaysNotIn(List<Integer> values) {
            addCriterion("IntervalDays not in", values, "intervaldays");
            return (Criteria) this;
        }

        public Criteria andIntervaldaysBetween(Integer value1, Integer value2) {
            addCriterion("IntervalDays between", value1, value2, "intervaldays");
            return (Criteria) this;
        }

        public Criteria andIntervaldaysNotBetween(Integer value1, Integer value2) {
            addCriterion("IntervalDays not between", value1, value2, "intervaldays");
            return (Criteria) this;
        }

        public Criteria andTicketnumberIsNull() {
            addCriterion("TicketNumber is null");
            return (Criteria) this;
        }

        public Criteria andTicketnumberIsNotNull() {
            addCriterion("TicketNumber is not null");
            return (Criteria) this;
        }

        public Criteria andTicketnumberEqualTo(Integer value) {
            addCriterion("TicketNumber =", value, "ticketnumber");
            return (Criteria) this;
        }

        public Criteria andTicketnumberNotEqualTo(Integer value) {
            addCriterion("TicketNumber <>", value, "ticketnumber");
            return (Criteria) this;
        }

        public Criteria andTicketnumberGreaterThan(Integer value) {
            addCriterion("TicketNumber >", value, "ticketnumber");
            return (Criteria) this;
        }

        public Criteria andTicketnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("TicketNumber >=", value, "ticketnumber");
            return (Criteria) this;
        }

        public Criteria andTicketnumberLessThan(Integer value) {
            addCriterion("TicketNumber <", value, "ticketnumber");
            return (Criteria) this;
        }

        public Criteria andTicketnumberLessThanOrEqualTo(Integer value) {
            addCriterion("TicketNumber <=", value, "ticketnumber");
            return (Criteria) this;
        }

        public Criteria andTicketnumberIn(List<Integer> values) {
            addCriterion("TicketNumber in", values, "ticketnumber");
            return (Criteria) this;
        }

        public Criteria andTicketnumberNotIn(List<Integer> values) {
            addCriterion("TicketNumber not in", values, "ticketnumber");
            return (Criteria) this;
        }

        public Criteria andTicketnumberBetween(Integer value1, Integer value2) {
            addCriterion("TicketNumber between", value1, value2, "ticketnumber");
            return (Criteria) this;
        }

        public Criteria andTicketnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("TicketNumber not between", value1, value2, "ticketnumber");
            return (Criteria) this;
        }

        public Criteria andTicketamountIsNull() {
            addCriterion("TicketAmount is null");
            return (Criteria) this;
        }

        public Criteria andTicketamountIsNotNull() {
            addCriterion("TicketAmount is not null");
            return (Criteria) this;
        }

        public Criteria andTicketamountEqualTo(BigDecimal value) {
            addCriterion("TicketAmount =", value, "ticketamount");
            return (Criteria) this;
        }

        public Criteria andTicketamountNotEqualTo(BigDecimal value) {
            addCriterion("TicketAmount <>", value, "ticketamount");
            return (Criteria) this;
        }

        public Criteria andTicketamountGreaterThan(BigDecimal value) {
            addCriterion("TicketAmount >", value, "ticketamount");
            return (Criteria) this;
        }

        public Criteria andTicketamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TicketAmount >=", value, "ticketamount");
            return (Criteria) this;
        }

        public Criteria andTicketamountLessThan(BigDecimal value) {
            addCriterion("TicketAmount <", value, "ticketamount");
            return (Criteria) this;
        }

        public Criteria andTicketamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TicketAmount <=", value, "ticketamount");
            return (Criteria) this;
        }

        public Criteria andTicketamountIn(List<BigDecimal> values) {
            addCriterion("TicketAmount in", values, "ticketamount");
            return (Criteria) this;
        }

        public Criteria andTicketamountNotIn(List<BigDecimal> values) {
            addCriterion("TicketAmount not in", values, "ticketamount");
            return (Criteria) this;
        }

        public Criteria andTicketamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TicketAmount between", value1, value2, "ticketamount");
            return (Criteria) this;
        }

        public Criteria andTicketamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TicketAmount not between", value1, value2, "ticketamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountIsNull() {
            addCriterion("TaxAmount is null");
            return (Criteria) this;
        }

        public Criteria andTaxamountIsNotNull() {
            addCriterion("TaxAmount is not null");
            return (Criteria) this;
        }

        public Criteria andTaxamountEqualTo(BigDecimal value) {
            addCriterion("TaxAmount =", value, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountNotEqualTo(BigDecimal value) {
            addCriterion("TaxAmount <>", value, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountGreaterThan(BigDecimal value) {
            addCriterion("TaxAmount >", value, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TaxAmount >=", value, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountLessThan(BigDecimal value) {
            addCriterion("TaxAmount <", value, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TaxAmount <=", value, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountIn(List<BigDecimal> values) {
            addCriterion("TaxAmount in", values, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountNotIn(List<BigDecimal> values) {
            addCriterion("TaxAmount not in", values, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TaxAmount between", value1, value2, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TaxAmount not between", value1, value2, "taxamount");
            return (Criteria) this;
        }

        public Criteria andOilamountIsNull() {
            addCriterion("OilAmount is null");
            return (Criteria) this;
        }

        public Criteria andOilamountIsNotNull() {
            addCriterion("OilAmount is not null");
            return (Criteria) this;
        }

        public Criteria andOilamountEqualTo(BigDecimal value) {
            addCriterion("OilAmount =", value, "oilamount");
            return (Criteria) this;
        }

        public Criteria andOilamountNotEqualTo(BigDecimal value) {
            addCriterion("OilAmount <>", value, "oilamount");
            return (Criteria) this;
        }

        public Criteria andOilamountGreaterThan(BigDecimal value) {
            addCriterion("OilAmount >", value, "oilamount");
            return (Criteria) this;
        }

        public Criteria andOilamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OilAmount >=", value, "oilamount");
            return (Criteria) this;
        }

        public Criteria andOilamountLessThan(BigDecimal value) {
            addCriterion("OilAmount <", value, "oilamount");
            return (Criteria) this;
        }

        public Criteria andOilamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OilAmount <=", value, "oilamount");
            return (Criteria) this;
        }

        public Criteria andOilamountIn(List<BigDecimal> values) {
            addCriterion("OilAmount in", values, "oilamount");
            return (Criteria) this;
        }

        public Criteria andOilamountNotIn(List<BigDecimal> values) {
            addCriterion("OilAmount not in", values, "oilamount");
            return (Criteria) this;
        }

        public Criteria andOilamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OilAmount between", value1, value2, "oilamount");
            return (Criteria) this;
        }

        public Criteria andOilamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OilAmount not between", value1, value2, "oilamount");
            return (Criteria) this;
        }

        public Criteria andFlightTypeIsNull() {
            addCriterion("Flight_Type is null");
            return (Criteria) this;
        }

        public Criteria andFlightTypeIsNotNull() {
            addCriterion("Flight_Type is not null");
            return (Criteria) this;
        }

        public Criteria andFlightTypeEqualTo(Integer value) {
            addCriterion("Flight_Type =", value, "flightType");
            return (Criteria) this;
        }

        public Criteria andFlightTypeNotEqualTo(Integer value) {
            addCriterion("Flight_Type <>", value, "flightType");
            return (Criteria) this;
        }

        public Criteria andFlightTypeGreaterThan(Integer value) {
            addCriterion("Flight_Type >", value, "flightType");
            return (Criteria) this;
        }

        public Criteria andFlightTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Flight_Type >=", value, "flightType");
            return (Criteria) this;
        }

        public Criteria andFlightTypeLessThan(Integer value) {
            addCriterion("Flight_Type <", value, "flightType");
            return (Criteria) this;
        }

        public Criteria andFlightTypeLessThanOrEqualTo(Integer value) {
            addCriterion("Flight_Type <=", value, "flightType");
            return (Criteria) this;
        }

        public Criteria andFlightTypeIn(List<Integer> values) {
            addCriterion("Flight_Type in", values, "flightType");
            return (Criteria) this;
        }

        public Criteria andFlightTypeNotIn(List<Integer> values) {
            addCriterion("Flight_Type not in", values, "flightType");
            return (Criteria) this;
        }

        public Criteria andFlightTypeBetween(Integer value1, Integer value2) {
            addCriterion("Flight_Type between", value1, value2, "flightType");
            return (Criteria) this;
        }

        public Criteria andFlightTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("Flight_Type not between", value1, value2, "flightType");
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

        public Criteria andSourceEqualTo(String value) {
            addCriterion("Source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("Source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("Source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("Source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("Source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("Source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("Source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("Source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("Source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("Source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("Source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("Source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andToflightnoIsNull() {
            addCriterion("ToFlightNo is null");
            return (Criteria) this;
        }

        public Criteria andToflightnoIsNotNull() {
            addCriterion("ToFlightNo is not null");
            return (Criteria) this;
        }

        public Criteria andToflightnoEqualTo(String value) {
            addCriterion("ToFlightNo =", value, "toflightno");
            return (Criteria) this;
        }

        public Criteria andToflightnoNotEqualTo(String value) {
            addCriterion("ToFlightNo <>", value, "toflightno");
            return (Criteria) this;
        }

        public Criteria andToflightnoGreaterThan(String value) {
            addCriterion("ToFlightNo >", value, "toflightno");
            return (Criteria) this;
        }

        public Criteria andToflightnoGreaterThanOrEqualTo(String value) {
            addCriterion("ToFlightNo >=", value, "toflightno");
            return (Criteria) this;
        }

        public Criteria andToflightnoLessThan(String value) {
            addCriterion("ToFlightNo <", value, "toflightno");
            return (Criteria) this;
        }

        public Criteria andToflightnoLessThanOrEqualTo(String value) {
            addCriterion("ToFlightNo <=", value, "toflightno");
            return (Criteria) this;
        }

        public Criteria andToflightnoLike(String value) {
            addCriterion("ToFlightNo like", value, "toflightno");
            return (Criteria) this;
        }

        public Criteria andToflightnoNotLike(String value) {
            addCriterion("ToFlightNo not like", value, "toflightno");
            return (Criteria) this;
        }

        public Criteria andToflightnoIn(List<String> values) {
            addCriterion("ToFlightNo in", values, "toflightno");
            return (Criteria) this;
        }

        public Criteria andToflightnoNotIn(List<String> values) {
            addCriterion("ToFlightNo not in", values, "toflightno");
            return (Criteria) this;
        }

        public Criteria andToflightnoBetween(String value1, String value2) {
            addCriterion("ToFlightNo between", value1, value2, "toflightno");
            return (Criteria) this;
        }

        public Criteria andToflightnoNotBetween(String value1, String value2) {
            addCriterion("ToFlightNo not between", value1, value2, "toflightno");
            return (Criteria) this;
        }

        public Criteria andFromflightnoIsNull() {
            addCriterion("FromFlightNo is null");
            return (Criteria) this;
        }

        public Criteria andFromflightnoIsNotNull() {
            addCriterion("FromFlightNo is not null");
            return (Criteria) this;
        }

        public Criteria andFromflightnoEqualTo(String value) {
            addCriterion("FromFlightNo =", value, "fromflightno");
            return (Criteria) this;
        }

        public Criteria andFromflightnoNotEqualTo(String value) {
            addCriterion("FromFlightNo <>", value, "fromflightno");
            return (Criteria) this;
        }

        public Criteria andFromflightnoGreaterThan(String value) {
            addCriterion("FromFlightNo >", value, "fromflightno");
            return (Criteria) this;
        }

        public Criteria andFromflightnoGreaterThanOrEqualTo(String value) {
            addCriterion("FromFlightNo >=", value, "fromflightno");
            return (Criteria) this;
        }

        public Criteria andFromflightnoLessThan(String value) {
            addCriterion("FromFlightNo <", value, "fromflightno");
            return (Criteria) this;
        }

        public Criteria andFromflightnoLessThanOrEqualTo(String value) {
            addCriterion("FromFlightNo <=", value, "fromflightno");
            return (Criteria) this;
        }

        public Criteria andFromflightnoLike(String value) {
            addCriterion("FromFlightNo like", value, "fromflightno");
            return (Criteria) this;
        }

        public Criteria andFromflightnoNotLike(String value) {
            addCriterion("FromFlightNo not like", value, "fromflightno");
            return (Criteria) this;
        }

        public Criteria andFromflightnoIn(List<String> values) {
            addCriterion("FromFlightNo in", values, "fromflightno");
            return (Criteria) this;
        }

        public Criteria andFromflightnoNotIn(List<String> values) {
            addCriterion("FromFlightNo not in", values, "fromflightno");
            return (Criteria) this;
        }

        public Criteria andFromflightnoBetween(String value1, String value2) {
            addCriterion("FromFlightNo between", value1, value2, "fromflightno");
            return (Criteria) this;
        }

        public Criteria andFromflightnoNotBetween(String value1, String value2) {
            addCriterion("FromFlightNo not between", value1, value2, "fromflightno");
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

        public Criteria andSupplierIsNull() {
            addCriterion("Supplier is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNotNull() {
            addCriterion("Supplier is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierEqualTo(String value) {
            addCriterion("Supplier =", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotEqualTo(String value) {
            addCriterion("Supplier <>", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThan(String value) {
            addCriterion("Supplier >", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThanOrEqualTo(String value) {
            addCriterion("Supplier >=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThan(String value) {
            addCriterion("Supplier <", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThanOrEqualTo(String value) {
            addCriterion("Supplier <=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLike(String value) {
            addCriterion("Supplier like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotLike(String value) {
            addCriterion("Supplier not like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierIn(List<String> values) {
            addCriterion("Supplier in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotIn(List<String> values) {
            addCriterion("Supplier not in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierBetween(String value1, String value2) {
            addCriterion("Supplier between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotBetween(String value1, String value2) {
            addCriterion("Supplier not between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andIsshareIsNull() {
            addCriterion("isShare is null");
            return (Criteria) this;
        }

        public Criteria andIsshareIsNotNull() {
            addCriterion("isShare is not null");
            return (Criteria) this;
        }

        public Criteria andIsshareEqualTo(Integer value) {
            addCriterion("isShare =", value, "isshare");
            return (Criteria) this;
        }

        public Criteria andIsshareNotEqualTo(Integer value) {
            addCriterion("isShare <>", value, "isshare");
            return (Criteria) this;
        }

        public Criteria andIsshareGreaterThan(Integer value) {
            addCriterion("isShare >", value, "isshare");
            return (Criteria) this;
        }

        public Criteria andIsshareGreaterThanOrEqualTo(Integer value) {
            addCriterion("isShare >=", value, "isshare");
            return (Criteria) this;
        }

        public Criteria andIsshareLessThan(Integer value) {
            addCriterion("isShare <", value, "isshare");
            return (Criteria) this;
        }

        public Criteria andIsshareLessThanOrEqualTo(Integer value) {
            addCriterion("isShare <=", value, "isshare");
            return (Criteria) this;
        }

        public Criteria andIsshareIn(List<Integer> values) {
            addCriterion("isShare in", values, "isshare");
            return (Criteria) this;
        }

        public Criteria andIsshareNotIn(List<Integer> values) {
            addCriterion("isShare not in", values, "isshare");
            return (Criteria) this;
        }

        public Criteria andIsshareBetween(Integer value1, Integer value2) {
            addCriterion("isShare between", value1, value2, "isshare");
            return (Criteria) this;
        }

        public Criteria andIsshareNotBetween(Integer value1, Integer value2) {
            addCriterion("isShare not between", value1, value2, "isshare");
            return (Criteria) this;
        }

        public Criteria andSharepricesIsNull() {
            addCriterion("SharePrices is null");
            return (Criteria) this;
        }

        public Criteria andSharepricesIsNotNull() {
            addCriterion("SharePrices is not null");
            return (Criteria) this;
        }

        public Criteria andSharepricesEqualTo(Long value) {
            addCriterion("SharePrices =", value, "shareprices");
            return (Criteria) this;
        }

        public Criteria andSharepricesNotEqualTo(Long value) {
            addCriterion("SharePrices <>", value, "shareprices");
            return (Criteria) this;
        }

        public Criteria andSharepricesGreaterThan(Long value) {
            addCriterion("SharePrices >", value, "shareprices");
            return (Criteria) this;
        }

        public Criteria andSharepricesGreaterThanOrEqualTo(Long value) {
            addCriterion("SharePrices >=", value, "shareprices");
            return (Criteria) this;
        }

        public Criteria andSharepricesLessThan(Long value) {
            addCriterion("SharePrices <", value, "shareprices");
            return (Criteria) this;
        }

        public Criteria andSharepricesLessThanOrEqualTo(Long value) {
            addCriterion("SharePrices <=", value, "shareprices");
            return (Criteria) this;
        }

        public Criteria andSharepricesIn(List<Long> values) {
            addCriterion("SharePrices in", values, "shareprices");
            return (Criteria) this;
        }

        public Criteria andSharepricesNotIn(List<Long> values) {
            addCriterion("SharePrices not in", values, "shareprices");
            return (Criteria) this;
        }

        public Criteria andSharepricesBetween(Long value1, Long value2) {
            addCriterion("SharePrices between", value1, value2, "shareprices");
            return (Criteria) this;
        }

        public Criteria andSharepricesNotBetween(Long value1, Long value2) {
            addCriterion("SharePrices not between", value1, value2, "shareprices");
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

        public Criteria andDesstationIsNull() {
            addCriterion("DesStation is null");
            return (Criteria) this;
        }

        public Criteria andDesstationIsNotNull() {
            addCriterion("DesStation is not null");
            return (Criteria) this;
        }

        public Criteria andDesstationEqualTo(String value) {
            addCriterion("DesStation =", value, "desstation");
            return (Criteria) this;
        }

        public Criteria andDesstationNotEqualTo(String value) {
            addCriterion("DesStation <>", value, "desstation");
            return (Criteria) this;
        }

        public Criteria andDesstationGreaterThan(String value) {
            addCriterion("DesStation >", value, "desstation");
            return (Criteria) this;
        }

        public Criteria andDesstationGreaterThanOrEqualTo(String value) {
            addCriterion("DesStation >=", value, "desstation");
            return (Criteria) this;
        }

        public Criteria andDesstationLessThan(String value) {
            addCriterion("DesStation <", value, "desstation");
            return (Criteria) this;
        }

        public Criteria andDesstationLessThanOrEqualTo(String value) {
            addCriterion("DesStation <=", value, "desstation");
            return (Criteria) this;
        }

        public Criteria andDesstationLike(String value) {
            addCriterion("DesStation like", value, "desstation");
            return (Criteria) this;
        }

        public Criteria andDesstationNotLike(String value) {
            addCriterion("DesStation not like", value, "desstation");
            return (Criteria) this;
        }

        public Criteria andDesstationIn(List<String> values) {
            addCriterion("DesStation in", values, "desstation");
            return (Criteria) this;
        }

        public Criteria andDesstationNotIn(List<String> values) {
            addCriterion("DesStation not in", values, "desstation");
            return (Criteria) this;
        }

        public Criteria andDesstationBetween(String value1, String value2) {
            addCriterion("DesStation between", value1, value2, "desstation");
            return (Criteria) this;
        }

        public Criteria andDesstationNotBetween(String value1, String value2) {
            addCriterion("DesStation not between", value1, value2, "desstation");
            return (Criteria) this;
        }

        public Criteria andDepstationIsNull() {
            addCriterion("DepStation is null");
            return (Criteria) this;
        }

        public Criteria andDepstationIsNotNull() {
            addCriterion("DepStation is not null");
            return (Criteria) this;
        }

        public Criteria andDepstationEqualTo(String value) {
            addCriterion("DepStation =", value, "depstation");
            return (Criteria) this;
        }

        public Criteria andDepstationNotEqualTo(String value) {
            addCriterion("DepStation <>", value, "depstation");
            return (Criteria) this;
        }

        public Criteria andDepstationGreaterThan(String value) {
            addCriterion("DepStation >", value, "depstation");
            return (Criteria) this;
        }

        public Criteria andDepstationGreaterThanOrEqualTo(String value) {
            addCriterion("DepStation >=", value, "depstation");
            return (Criteria) this;
        }

        public Criteria andDepstationLessThan(String value) {
            addCriterion("DepStation <", value, "depstation");
            return (Criteria) this;
        }

        public Criteria andDepstationLessThanOrEqualTo(String value) {
            addCriterion("DepStation <=", value, "depstation");
            return (Criteria) this;
        }

        public Criteria andDepstationLike(String value) {
            addCriterion("DepStation like", value, "depstation");
            return (Criteria) this;
        }

        public Criteria andDepstationNotLike(String value) {
            addCriterion("DepStation not like", value, "depstation");
            return (Criteria) this;
        }

        public Criteria andDepstationIn(List<String> values) {
            addCriterion("DepStation in", values, "depstation");
            return (Criteria) this;
        }

        public Criteria andDepstationNotIn(List<String> values) {
            addCriterion("DepStation not in", values, "depstation");
            return (Criteria) this;
        }

        public Criteria andDepstationBetween(String value1, String value2) {
            addCriterion("DepStation between", value1, value2, "depstation");
            return (Criteria) this;
        }

        public Criteria andDepstationNotBetween(String value1, String value2) {
            addCriterion("DepStation not between", value1, value2, "depstation");
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