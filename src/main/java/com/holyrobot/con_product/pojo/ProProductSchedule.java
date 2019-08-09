package com.holyrobot.con_product.pojo;

import java.io.Serializable;

public class ProProductSchedule implements Serializable {
    private String id;

    private String proid;

    private Integer schday;

    private String schname;

    private String schinfo;

    private String schstay;

    private Integer schrepast;

    private String schrepastinfo;

    private String orgid;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getProid() {
        return proid;
    }

    public void setProid(String proid) {
        this.proid = proid == null ? null : proid.trim();
    }

    public Integer getSchday() {
        return schday;
    }

    public void setSchday(Integer schday) {
        this.schday = schday;
    }

    public String getSchname() {
        return schname;
    }

    public void setSchname(String schname) {
        this.schname = schname == null ? null : schname.trim();
    }

    public String getSchinfo() {
        return schinfo;
    }

    public void setSchinfo(String schinfo) {
        this.schinfo = schinfo == null ? null : schinfo.trim();
    }

    public String getSchstay() {
        return schstay;
    }

    public void setSchstay(String schstay) {
        this.schstay = schstay == null ? null : schstay.trim();
    }

    public Integer getSchrepast() {
        return schrepast;
    }

    public void setSchrepast(Integer schrepast) {
        this.schrepast = schrepast;
    }

    public String getSchrepastinfo() {
        return schrepastinfo;
    }

    public void setSchrepastinfo(String schrepastinfo) {
        this.schrepastinfo = schrepastinfo == null ? null : schrepastinfo.trim();
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }
}