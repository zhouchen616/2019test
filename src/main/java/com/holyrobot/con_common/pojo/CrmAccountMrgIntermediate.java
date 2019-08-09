package com.holyrobot.con_common.pojo;

public class CrmAccountMrgIntermediate {
    private String id;

    private String orgid;

    private String crmorgid;

    private String crmid;

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

    public String getCrmorgid() {
        return crmorgid;
    }

    public void setCrmorgid(String crmorgid) {
        this.crmorgid = crmorgid == null ? null : crmorgid.trim();
    }

    public String getCrmid() {
        return crmid;
    }

    public void setCrmid(String crmid) {
        this.crmid = crmid == null ? null : crmid.trim();
    }
}