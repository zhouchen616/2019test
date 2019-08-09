package com.holyrobot.con_product.pojo;

import java.io.Serializable;

public class ProTourTraffic implements Serializable {
    private String id;

    private String tourid;

    private Integer traffictype;

    private String trafficproductid;

    private Integer direction;

    private String orgid;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTourid() {
        return tourid;
    }

    public void setTourid(String tourid) {
        this.tourid = tourid;
    }

    public Integer getTraffictype() {
        return traffictype;
    }

    public void setTraffictype(Integer traffictype) {
        this.traffictype = traffictype;
    }

    public String getTrafficproductid() {
        return trafficproductid;
    }

    public void setTrafficproductid(String trafficproductid) {
        this.trafficproductid = trafficproductid;
    }

    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }
}