package com.holyrobot.con_order.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class OrdOrderPrice implements Serializable {
    private String id;

    private String orderid;

    private String tourpriceid;

    private String pricename;

    private Integer visitornum;

    private BigDecimal saleprice;

    private BigDecimal rebateavg;

    private Integer rebatenum;

    private BigDecimal roomprice;

    private Boolean isseat;

    private Boolean ischild;

    private String orgid;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getTourpriceid() {
        return tourpriceid;
    }

    public void setTourpriceid(String tourpriceid) {
        this.tourpriceid = tourpriceid;
    }

    public String getPricename() {
        return pricename;
    }

    public void setPricename(String pricename) {
        this.pricename = pricename;
    }

    public Integer getVisitornum() {
        return visitornum;
    }

    public void setVisitornum(Integer visitornum) {
        this.visitornum = visitornum;
    }

    public BigDecimal getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(BigDecimal saleprice) {
        this.saleprice = saleprice;
    }

    public BigDecimal getRebateavg() {
        return rebateavg;
    }

    public void setRebateavg(BigDecimal rebateavg) {
        this.rebateavg = rebateavg;
    }

    public Integer getRebatenum() {
        return rebatenum;
    }

    public void setRebatenum(Integer rebatenum) {
        this.rebatenum = rebatenum;
    }

    public BigDecimal getRoomprice() {
        return roomprice;
    }

    public void setRoomprice(BigDecimal roomprice) {
        this.roomprice = roomprice;
    }

    public Boolean getIsseat() {
        return isseat;
    }

    public void setIsseat(Boolean isseat) {
        this.isseat = isseat;
    }

    public Boolean getIschild() {
        return ischild;
    }

    public void setIschild(Boolean ischild) {
        this.ischild = ischild;
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }
}