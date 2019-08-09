package com.holyrobot.con_volunteer.pojo;

import java.util.Date;

public class VolunteerProductTour {
    private String id;

    private String orgid;

    private String travelagencyname;

    private String userid;

    private String shopname;

    private String proid;

    private String tourid;

    private Integer plannum;

    private String tourname;

    private Date tourdate;

    private Date duedate;

    private Integer datastatus;

    private Date createddate;

    private String volunteerproductid;

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

    public Integer getPlannum() {
        return plannum;
    }

    public void setPlannum(Integer plannum) {
        this.plannum = plannum;
    }

    public String getTourname() {
        return tourname;
    }

    public void setTourname(String tourname) {
        this.tourname = tourname == null ? null : tourname.trim();
    }

    public Date getTourdate() {
        return tourdate;
    }

    public void setTourdate(Date tourdate) {
        this.tourdate = tourdate;
    }

    public Date getDuedate() {
        return duedate;
    }

    public void setDuedate(Date duedate) {
        this.duedate = duedate;
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

    public String getVolunteerproductid() {
        return volunteerproductid;
    }

    public void setVolunteerproductid(String volunteerproductid) {
        this.volunteerproductid = volunteerproductid == null ? null : volunteerproductid.trim();
    }
}