package com.holyrobot.con_om.pojo;

import java.io.Serializable;

public class OmOppermission implements Serializable {
    private String id;

    private String travelagencyid;

    private String siteid;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTravelagencyid() {
        return travelagencyid;
    }

    public void setTravelagencyid(String travelagencyid) {
        this.travelagencyid = travelagencyid == null ? null : travelagencyid.trim();
    }

    public String getSiteid() {
        return siteid;
    }

    public void setSiteid(String siteid) {
        this.siteid = siteid == null ? null : siteid.trim();
    }
}