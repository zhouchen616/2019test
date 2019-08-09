package com.holyrobot.con_product.pojo;

import java.io.Serializable;

public class ProProductTraffic implements Serializable {
    private String id;

    private String proid;

    private String trafficno;

    private String depname;

    private String deptime;

    private String depterminal;

    private String arrname;

    private String arrtime;

    private String arrterminal;

    private String company;

    private Integer isdirect;

    private Integer datastatus;

    private String orgid;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProid() {
        return proid;
    }

    public void setProid(String proid) {
        this.proid = proid;
    }

    public String getTrafficno() {
        return trafficno;
    }

    public void setTrafficno(String trafficno) {
        this.trafficno = trafficno;
    }

    public String getDepname() {
        return depname;
    }

    public void setDepname(String depname) {
        this.depname = depname;
    }

    public String getDeptime() {
        return deptime;
    }

    public void setDeptime(String deptime) {
        this.deptime = deptime;
    }

    public String getDepterminal() {
        return depterminal;
    }

    public void setDepterminal(String depterminal) {
        this.depterminal = depterminal;
    }

    public String getArrname() {
        return arrname;
    }

    public void setArrname(String arrname) {
        this.arrname = arrname;
    }

    public String getArrtime() {
        return arrtime;
    }

    public void setArrtime(String arrtime) {
        this.arrtime = arrtime;
    }

    public String getArrterminal() {
        return arrterminal;
    }

    public void setArrterminal(String arrterminal) {
        this.arrterminal = arrterminal;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Integer getIsdirect() {
        return isdirect;
    }

    public void setIsdirect(Integer isdirect) {
        this.isdirect = isdirect;
    }

    public Integer getDatastatus() {
        return datastatus;
    }

    public void setDatastatus(Integer datastatus) {
        this.datastatus = datastatus;
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }
}