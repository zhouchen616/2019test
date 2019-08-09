package com.holyrobot.con_common.pojo;

public class CrmAccountMrgUserIntermediate {
    private String id;

    private String orgid;

    private String userid;

    private String crmuserid;

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

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getCrmuserid() {
        return crmuserid;
    }

    public void setCrmuserid(String crmuserid) {
        this.crmuserid = crmuserid == null ? null : crmuserid.trim();
    }
}