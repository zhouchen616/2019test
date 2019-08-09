package com.holyrobot.con_product.pojo;

import java.io.Serializable;

public class ProProductScheduleImage implements Serializable {
    private String id;

    private String proscheduleid;

    private String thumbsrc;

    private String imagesrc;

    private Integer orderindex;

    private String orgid;

    private String imageinfo;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getProscheduleid() {
        return proscheduleid;
    }

    public void setProscheduleid(String proscheduleid) {
        this.proscheduleid = proscheduleid == null ? null : proscheduleid.trim();
    }

    public String getThumbsrc() {
        return thumbsrc;
    }

    public void setThumbsrc(String thumbsrc) {
        this.thumbsrc = thumbsrc == null ? null : thumbsrc.trim();
    }

    public String getImagesrc() {
        return imagesrc;
    }

    public void setImagesrc(String imagesrc) {
        this.imagesrc = imagesrc == null ? null : imagesrc.trim();
    }

    public Integer getOrderindex() {
        return orderindex;
    }

    public void setOrderindex(Integer orderindex) {
        this.orderindex = orderindex;
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    public String getImageinfo() {
        return imageinfo;
    }

    public void setImageinfo(String imageinfo) {
        this.imageinfo = imageinfo == null ? null : imageinfo.trim();
    }
}