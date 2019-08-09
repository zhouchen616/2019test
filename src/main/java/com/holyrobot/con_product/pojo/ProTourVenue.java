package com.holyrobot.con_product.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class ProTourVenue implements Serializable {
    private String id;

    private String tourid;

    private String venue;

    private String collectiontime;

    private BigDecimal shuttleprice;

    private BigDecimal dropoffprice;

    private String orgid;

    private String siteid;

    private String sitename;

    private String departureid;

    private String departurename;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTourid() {
        return tourid;
    }

    public void setTourid(String tourid) {
        this.tourid = tourid == null ? null : tourid.trim();
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue == null ? null : venue.trim();
    }

    public String getCollectiontime() {
        return collectiontime;
    }

    public void setCollectiontime(String collectiontime) {
        this.collectiontime = collectiontime == null ? null : collectiontime.trim();
    }

    public BigDecimal getShuttleprice() {
        return shuttleprice;
    }

    public void setShuttleprice(BigDecimal shuttleprice) {
        this.shuttleprice = shuttleprice;
    }

    public BigDecimal getDropoffprice() {
        return dropoffprice;
    }

    public void setDropoffprice(BigDecimal dropoffprice) {
        this.dropoffprice = dropoffprice;
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    public String getSiteid() {
        return siteid;
    }

    public void setSiteid(String siteid) {
        this.siteid = siteid == null ? null : siteid.trim();
    }

    public String getSitename() {
        return sitename;
    }

    public void setSitename(String sitename) {
        this.sitename = sitename == null ? null : sitename.trim();
    }

    public String getDepartureid() {
        return departureid;
    }

    public void setDepartureid(String departureid) {
        this.departureid = departureid == null ? null : departureid.trim();
    }

    public String getDeparturename() {
        return departurename;
    }

    public void setDeparturename(String departurename) {
        this.departurename = departurename == null ? null : departurename.trim();
    }
}