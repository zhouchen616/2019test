package com.holyrobot.con_res.pojo;

import java.io.Serializable;
import java.util.Date;

public class ResBusTicket implements Serializable {
    private String id;

    private String buscarnumber;

    private String fromBusName;

    private String fromBusNameid;

    private String toBusName;

    private String toBusNameid;

    private String starttime;

    private String arrivetime;

    private String lishi;

    private String seatnumber;

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

    public String getBuscarnumber() {
        return buscarnumber;
    }

    public void setBuscarnumber(String buscarnumber) {
        this.buscarnumber = buscarnumber == null ? null : buscarnumber.trim();
    }

    public String getFromBusName() {
        return fromBusName;
    }

    public void setFromBusName(String fromBusName) {
        this.fromBusName = fromBusName == null ? null : fromBusName.trim();
    }

    public String getFromBusNameid() {
        return fromBusNameid;
    }

    public void setFromBusNameid(String fromBusNameid) {
        this.fromBusNameid = fromBusNameid == null ? null : fromBusNameid.trim();
    }

    public String getToBusName() {
        return toBusName;
    }

    public void setToBusName(String toBusName) {
        this.toBusName = toBusName == null ? null : toBusName.trim();
    }

    public String getToBusNameid() {
        return toBusNameid;
    }

    public void setToBusNameid(String toBusNameid) {
        this.toBusNameid = toBusNameid == null ? null : toBusNameid.trim();
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

    public String getSeatnumber() {
        return seatnumber;
    }

    public void setSeatnumber(String seatnumber) {
        this.seatnumber = seatnumber == null ? null : seatnumber.trim();
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