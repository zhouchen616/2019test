package com.holyrobot.con_volunteer.pojo;

import java.math.BigDecimal;

public class VolunteerProductTourPrice {
    private String id;

    private String orgid;

    private String travelagencyname;

    private String userid;

    private String shopname;

    private String proid;

    private String tourid;

    private String siteid;

    private String sitename;

    private Integer touristtype;

    private String policyname;

    private Integer orderindex;

    private String volunteerproductid;

    private BigDecimal directprice;

    private BigDecimal salesprice;

    private BigDecimal rebateprice;

    private BigDecimal singleroomprice;

    private BigDecimal salescostprice;

    private BigDecimal directcostprice;

    private Integer discounttypec;

    private BigDecimal prevaluec;

    private Integer discounttypeb;

    private BigDecimal prevalueb;

    private Boolean isoccupyseat;

    private Boolean isdefault;

    private Integer datastatus;

    private BigDecimal allowance;

    private String newvolunteerproductid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    public String getTravelagencyname() {
        return travelagencyname;
    }

    public void setTravelagencyname(String travelagencyname) {
        this.travelagencyname = travelagencyname == null ? null : travelagencyname.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname == null ? null : shopname.trim();
    }

    public String getProid() {
        return proid;
    }

    public void setProid(String proid) {
        this.proid = proid == null ? null : proid.trim();
    }

    public String getTourid() {
        return tourid;
    }

    public void setTourid(String tourid) {
        this.tourid = tourid == null ? null : tourid.trim();
    }

    public String getSiteid() {
        return siteid;
    }

    public void setSiteid(String siteid) {
        this.siteid = siteid == null ? null : siteid.trim();
    }

    public String getSitename() {
        return sitename;
    }

    public void setSitename(String sitename) {
        this.sitename = sitename == null ? null : sitename.trim();
    }

    public Integer getTouristtype() {
        return touristtype;
    }

    public void setTouristtype(Integer touristtype) {
        this.touristtype = touristtype;
    }

    public String getPolicyname() {
        return policyname;
    }

    public void setPolicyname(String policyname) {
        this.policyname = policyname == null ? null : policyname.trim();
    }

    public Integer getOrderindex() {
        return orderindex;
    }

    public void setOrderindex(Integer orderindex) {
        this.orderindex = orderindex;
    }

    public String getVolunteerproductid() {
        return volunteerproductid;
    }

    public void setVolunteerproductid(String volunteerproductid) {
        this.volunteerproductid = volunteerproductid == null ? null : volunteerproductid.trim();
    }

    public BigDecimal getDirectprice() {
        return directprice;
    }

    public void setDirectprice(BigDecimal directprice) {
        this.directprice = directprice;
    }

    public BigDecimal getSalesprice() {
        return salesprice;
    }

    public void setSalesprice(BigDecimal salesprice) {
        this.salesprice = salesprice;
    }

    public BigDecimal getRebateprice() {
        return rebateprice;
    }

    public void setRebateprice(BigDecimal rebateprice) {
        this.rebateprice = rebateprice;
    }

    public BigDecimal getSingleroomprice() {
        return singleroomprice;
    }

    public void setSingleroomprice(BigDecimal singleroomprice) {
        this.singleroomprice = singleroomprice;
    }

    public BigDecimal getSalescostprice() {
        return salescostprice;
    }

    public void setSalescostprice(BigDecimal salescostprice) {
        this.salescostprice = salescostprice;
    }

    public BigDecimal getDirectcostprice() {
        return directcostprice;
    }

    public void setDirectcostprice(BigDecimal directcostprice) {
        this.directcostprice = directcostprice;
    }

    public Integer getDiscounttypec() {
        return discounttypec;
    }

    public void setDiscounttypec(Integer discounttypec) {
        this.discounttypec = discounttypec;
    }

    public BigDecimal getPrevaluec() {
        return prevaluec;
    }

    public void setPrevaluec(BigDecimal prevaluec) {
        this.prevaluec = prevaluec;
    }

    public Integer getDiscounttypeb() {
        return discounttypeb;
    }

    public void setDiscounttypeb(Integer discounttypeb) {
        this.discounttypeb = discounttypeb;
    }

    public BigDecimal getPrevalueb() {
        return prevalueb;
    }

    public void setPrevalueb(BigDecimal prevalueb) {
        this.prevalueb = prevalueb;
    }

    public Boolean getIsoccupyseat() {
        return isoccupyseat;
    }

    public void setIsoccupyseat(Boolean isoccupyseat) {
        this.isoccupyseat = isoccupyseat;
    }

    public Boolean getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(Boolean isdefault) {
        this.isdefault = isdefault;
    }

    public Integer getDatastatus() {
        return datastatus;
    }

    public void setDatastatus(Integer datastatus) {
        this.datastatus = datastatus;
    }

    public BigDecimal getAllowance() {
        return allowance;
    }

    public void setAllowance(BigDecimal allowance) {
        if(allowance==null){
            allowance=new BigDecimal(0);
        }
        this.allowance = allowance;
    }

    public String getNewvolunteerproductid() {
        return newvolunteerproductid;
    }

    public void setNewvolunteerproductid(String newvolunteerproductid) {
        this.newvolunteerproductid = newvolunteerproductid == null ? null : newvolunteerproductid.trim();
    }
}