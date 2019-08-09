package com.holyrobot.con_res.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ResFlightinfo implements Serializable {
    private String id;

    private String flightno;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date flightdate;

    private String plane;

    private String begincity;

    private String endcity;

    private String begintime;

    private String endtime;

    private String realbegintime;

    private String realendtime;

    private String flightstatus;

    private Integer stop;

    private String times;

    private BigDecimal aduoil;

    private BigDecimal chdoil;

    private String ariline;

    private BigDecimal tax;

    private BigDecimal km;

    private BigDecimal pricey;

    private String beginterm;

    private String endterm;

    private String eat;

    private String issale;

    private Integer xtype;

    private Date createddate;

    private String createdby;

    private String createdbyid;

    private String deptid;

    private String orgid;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getFlightno() {
        return flightno;
    }

    public void setFlightno(String flightno) {
        this.flightno = flightno == null ? null : flightno.trim();
    }

    public Date getFlightdate() {
        return flightdate;
    }

    public void setFlightdate(Date flightdate) {
        this.flightdate = flightdate;
    }

    public String getPlane() {
        return plane;
    }

    public void setPlane(String plane) {
        this.plane = plane == null ? null : plane.trim();
    }

    public String getBegincity() {
        return begincity;
    }

    public void setBegincity(String begincity) {
        this.begincity = begincity == null ? null : begincity.trim();
    }

    public String getEndcity() {
        return endcity;
    }

    public void setEndcity(String endcity) {
        this.endcity = endcity == null ? null : endcity.trim();
    }

    public String getBegintime() {
        return begintime;
    }

    public void setBegintime(String begintime) {
        this.begintime = begintime == null ? null : begintime.trim();
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }

    public String getRealbegintime() {
        return realbegintime;
    }

    public void setRealbegintime(String realbegintime) {
        this.realbegintime = realbegintime == null ? null : realbegintime.trim();
    }

    public String getRealendtime() {
        return realendtime;
    }

    public void setRealendtime(String realendtime) {
        this.realendtime = realendtime == null ? null : realendtime.trim();
    }

    public String getFlightstatus() {
        return flightstatus;
    }

    public void setFlightstatus(String flightstatus) {
        this.flightstatus = flightstatus == null ? null : flightstatus.trim();
    }

    public Integer getStop() {
        return stop;
    }

    public void setStop(Integer stop) {
        this.stop = stop;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times == null ? null : times.trim();
    }

    public BigDecimal getAduoil() {
        return aduoil;
    }

    public void setAduoil(BigDecimal aduoil) {
        this.aduoil = aduoil;
    }

    public BigDecimal getChdoil() {
        return chdoil;
    }

    public void setChdoil(BigDecimal chdoil) {
        this.chdoil = chdoil;
    }

    public String getAriline() {
        return ariline;
    }

    public void setAriline(String ariline) {
        this.ariline = ariline == null ? null : ariline.trim();
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getKm() {
        return km;
    }

    public void setKm(BigDecimal km) {
        this.km = km;
    }

    public BigDecimal getPricey() {
        return pricey;
    }

    public void setPricey(BigDecimal pricey) {
        this.pricey = pricey;
    }

    public String getBeginterm() {
        return beginterm;
    }

    public void setBeginterm(String beginterm) {
        this.beginterm = beginterm == null ? null : beginterm.trim();
    }

    public String getEndterm() {
        return endterm;
    }

    public void setEndterm(String endterm) {
        this.endterm = endterm == null ? null : endterm.trim();
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat == null ? null : eat.trim();
    }

    public String getIssale() {
        return issale;
    }

    public void setIssale(String issale) {
        this.issale = issale == null ? null : issale.trim();
    }

    public Integer getXtype() {
        return xtype;
    }

    public void setXtype(Integer xtype) {
        this.xtype = xtype;
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby == null ? null : createdby.trim();
    }

    public String getCreatedbyid() {
        return createdbyid;
    }

    public void setCreatedbyid(String createdbyid) {
        this.createdbyid = createdbyid == null ? null : createdbyid.trim();
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid == null ? null : deptid.trim();
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }
}