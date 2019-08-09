package com.holyrobot.con_res.pojo;

import java.io.Serializable;
import java.util.Date;

public class ResShipTicket implements Serializable {
    private String id;

    private String hullnumber;

    private String fromShipName;

    private String fromShipNameid;

    private String toShipName;

    private String toShipNameid;

    private String starttime;

    private String arrivetime;

    private String lishi;

    private String shippingspace;

    private Date godate;

    private Date fromdate;

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

    public String getHullnumber() {
        return hullnumber;
    }

    public void setHullnumber(String hullnumber) {
        this.hullnumber = hullnumber == null ? null : hullnumber.trim();
    }

    public String getFromShipName() {
        return fromShipName;
    }

    public void setFromShipName(String fromShipName) {
        this.fromShipName = fromShipName == null ? null : fromShipName.trim();
    }

    public String getFromShipNameid() {
        return fromShipNameid;
    }

    public void setFromShipNameid(String fromShipNameid) {
        this.fromShipNameid = fromShipNameid == null ? null : fromShipNameid.trim();
    }

    public String getToShipName() {
        return toShipName;
    }

    public void setToShipName(String toShipName) {
        this.toShipName = toShipName == null ? null : toShipName.trim();
    }

    public String getToShipNameid() {
        return toShipNameid;
    }

    public void setToShipNameid(String toShipNameid) {
        this.toShipNameid = toShipNameid == null ? null : toShipNameid.trim();
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime == null ? null : starttime.trim();
    }

    public String getArrivetime() {
        return arrivetime;
    }

    public void setArrivetime(String arrivetime) {
        this.arrivetime = arrivetime == null ? null : arrivetime.trim();
    }

    public String getLishi() {
        return lishi;
    }

    public void setLishi(String lishi) {
        this.lishi = lishi == null ? null : lishi.trim();
    }

    public String getShippingspace() {
        return shippingspace;
    }

    public void setShippingspace(String shippingspace) {
        this.shippingspace = shippingspace == null ? null : shippingspace.trim();
    }

    public Date getGodate() {
        return godate;
    }

    public void setGodate(Date godate) {
        this.godate = godate;
    }

    public Date getFromdate() {
        return fromdate;
    }

    public void setFromdate(Date fromdate) {
        this.fromdate = fromdate;
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