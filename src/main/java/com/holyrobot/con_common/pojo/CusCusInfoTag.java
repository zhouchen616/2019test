package com.holyrobot.con_common.pojo;

public class CusCusInfoTag {
    private String id;

    private String cusCusinfoid;

    private String tagid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCusCusinfoid() {
        return cusCusinfoid;
    }

    public void setCusCusinfoid(String cusCusinfoid) {
        this.cusCusinfoid = cusCusinfoid == null ? null : cusCusinfoid.trim();
    }

    public String getTagid() {
        return tagid;
    }

    public void setTagid(String tagid) {
        this.tagid = tagid == null ? null : tagid.trim();
    }
}