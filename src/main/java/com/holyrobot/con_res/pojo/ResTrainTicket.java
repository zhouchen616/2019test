package com.holyrobot.con_res.pojo;

import java.io.Serializable;
import java.util.Date;

public class ResTrainTicket implements Serializable {
    private String id;

    private String stationTrainCode;

    private String fromStationName;

    private String toStationName;

    private String starttime;

    private String arrivetime;

    private String lishi;

    private Date godate;

    private Date fromdate;

    private Date createddate;

    private String createdby;

    private String createdbyid;

    private String deptid;

    private String orgid;

    private String startstationtype;

    private String endstationtype;

    private String fromStationNameid;

    private String toStationNameid;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getStationTrainCode() {
        return stationTrainCode;
    }

    public void setStationTrainCode(String stationTrainCode) {
        this.stationTrainCode = stationTrainCode == null ? null : stationTrainCode.trim();
    }

    public String getFromStationName() {
        return fromStationName;
    }

    public void setFromStationName(String fromStationName) {
        this.fromStationName = fromStationName == null ? null : fromStationName.trim();
    }

    public String getToStationName() {
        return toStationName;
    }

    public void setToStationName(String toStationName) {
        this.toStationName = toStationName == null ? null : toStationName.trim();
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

    public String getStartstationtype() {
        return startstationtype;
    }

    public void setStartstationtype(String startstationtype) {
        this.startstationtype = startstationtype == null ? null : startstationtype.trim();
    }

    public String getEndstationtype() {
        return endstationtype;
    }

    public void setEndstationtype(String endstationtype) {
        this.endstationtype = endstationtype == null ? null : endstationtype.trim();
    }

    public String getFromStationNameid() {
        return fromStationNameid;
    }

    public void setFromStationNameid(String fromStationNameid) {
        this.fromStationNameid = fromStationNameid == null ? null : fromStationNameid.trim();
    }

    public String getToStationNameid() {
        return toStationNameid;
    }

    public void setToStationNameid(String toStationNameid) {
        this.toStationNameid = toStationNameid == null ? null : toStationNameid.trim();
    }
}