package com.holyrobot.con_common.pojo;

import java.io.Serializable;
import java.util.Date;

public class H5ShopComments implements Serializable {
    private String id;

    private String orderid;

    private String proid;

    private String aliassname;

    private String comments;

    private String tourevaluation;

    private String tourguide;

    private String traffic;

    private String accommodation;

    private Date createdate;

    private String creatername;

    private String createid;

    private String imgurls;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getProid() {
        return proid;
    }

    public void setProid(String proid) {
        this.proid = proid;
    }

    public String getAliassname() {
        return aliassname;
    }

    public void setAliassname(String aliassname) {
        this.aliassname = aliassname;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getTourevaluation() {
        return tourevaluation;
    }

    public void setTourevaluation(String tourevaluation) {
        this.tourevaluation = tourevaluation;
    }

    public String getTourguide() {
        return tourguide;
    }

    public void setTourguide(String tourguide) {
        this.tourguide = tourguide;
    }

    public String getTraffic() {
        return traffic;
    }

    public void setTraffic(String traffic) {
        this.traffic = traffic;
    }

    public String getAccommodation() {
        return accommodation;
    }

    public void setAccommodation(String accommodation) {
        this.accommodation = accommodation;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getCreatername() {
        return creatername;
    }

    public void setCreatername(String creatername) {
        this.creatername = creatername;
    }

    public String getCreateid() {
        return createid;
    }

    public void setCreateid(String createid) {
        this.createid = createid;
    }

    public String getImgurls() {
        return imgurls;
    }

    public void setImgurls(String imgurls) {
        this.imgurls = imgurls;
    }
}