package com.holyrobot.con_volunteer.pojo;

import java.util.Date;

public class VolunteerProduct {
    private String id;

    private String orgid;

    private String travelagencyname;

    private String userid;

    private String shopname;

    private String proid;

    private Integer datastatus;

    private Date createddate;

    private Integer tourstatus;

    private Integer pricestatus;

    private Integer prostatus;

    private String directsalessendid;

    private String directproductid;

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

    public Integer getDatastatus() {
        return datastatus;
    }

    public void setDatastatus(Integer datastatus) {
        this.datastatus = datastatus;
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public Integer getTourstatus() {
        return tourstatus;
    }

    public void setTourstatus(Integer tourstatus) {
        this.tourstatus = tourstatus;
    }

    public Integer getPricestatus() {
        return pricestatus;
    }

    public void setPricestatus(Integer pricestatus) {
        this.pricestatus = pricestatus;
    }

    public Integer getProstatus() {
        return prostatus;
    }

    public void setProstatus(Integer prostatus) {
        this.prostatus = prostatus;
    }

    public String getDirectsalessendid() {
        return directsalessendid;
    }

    public void setDirectsalessendid(String directsalessendid) {
        this.directsalessendid = directsalessendid == null ? null : directsalessendid.trim();
    }

    public String getDirectproductid() {
        return directproductid;
    }

    public void setDirectproductid(String directproductid) {
        this.directproductid = directproductid == null ? null : directproductid.trim();
    }
}