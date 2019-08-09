package com.holyrobot.con_om.pojo;

public class OmProtocol {
    private String id;

    private Integer protocoltype;

    private String orgid;

    private String protocolcontent;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getProtocoltype() {
        return protocoltype;
    }

    public void setProtocoltype(Integer protocoltype) {
        this.protocoltype = protocoltype;
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    public String getProtocolcontent() {
        return protocolcontent;
    }

    public void setProtocolcontent(String protocolcontent) {
        this.protocolcontent = protocolcontent == null ? null : protocolcontent.trim();
    }
}