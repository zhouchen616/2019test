package com.holyrobot.con_product.pojo;

import java.math.BigDecimal;

public class ProProductDirectVenue {
    private String id;

    private String orgid;

    private String tourid;

    private String proid;

    private String siteid;

    private String sitename;

    private String departureid;

    private String departurename;

    private BigDecimal shuttlepricecost;

    private BigDecimal dropoffpricecost;

    private BigDecimal shuttlepricesales;

    private BigDecimal dropoffpricesales;

    private String venue;

    private String collectiontime;

    private String protourvenueid;

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

    public String getTourid() {
        return tourid;
    }

    public void setTourid(String tourid) {
        this.tourid = tourid == null ? null : tourid.trim();
    }

    public String getProid() {
        return proid;
    }

    public void setProid(String proid) {
        this.proid = proid == null ? null : proid.trim();
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

    public BigDecimal getShuttlepricecost() {
        return shuttlepricecost;
    }

    public void setShuttlepricecost(BigDecimal shuttlepricecost) {
        this.shuttlepricecost = shuttlepricecost;
    }

    public BigDecimal getDropoffpricecost() {
        return dropoffpricecost;
    }

    public void setDropoffpricecost(BigDecimal dropoffpricecost) {
        this.dropoffpricecost = dropoffpricecost;
    }

    public BigDecimal getShuttlepricesales() {
        return shuttlepricesales;
    }

    public void setShuttlepricesales(BigDecimal shuttlepricesales) {
        this.shuttlepricesales = shuttlepricesales;
    }

    public BigDecimal getDropoffpricesales() {
        return dropoffpricesales;
    }

    public void setDropoffpricesales(BigDecimal dropoffpricesales) {
        this.dropoffpricesales = dropoffpricesales;
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

    public String getProtourvenueid() {
        return protourvenueid;
    }

    public void setProtourvenueid(String protourvenueid) {
        this.protourvenueid = protourvenueid == null ? null : protourvenueid.trim();
    }
}