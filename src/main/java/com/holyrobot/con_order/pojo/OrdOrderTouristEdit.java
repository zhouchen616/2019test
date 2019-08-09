package com.holyrobot.con_order.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrdOrderTouristEdit implements Serializable {
    private String id;

    private String touristid;

    private String priceid;

    private String pricename;

    private String orderid;

    private String guestname;

    private String guestsex;

    private String guestage;

    private String guestcard;

    private String guesttelphone;

    private String guestaddress;

    private Date createddate;

    private String createdby;

    private String createdid;

    private String deptid;

    private Date reviseddate;

    private String revisedby;

    private String guestcomment;

    private BigDecimal saleprice;

    private BigDecimal jamt;

    private BigDecimal samt;

    private String pickupid;

    private String pickname;

    private String pickuptime;

    private String guestcardtype;

    private String venueid;

    private Boolean issingleroom;

    private String country;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTouristid() {
        return touristid;
    }

    public void setTouristid(String touristid) {
        this.touristid = touristid == null ? null : touristid.trim();
    }

    public String getPriceid() {
        return priceid;
    }

    public void setPriceid(String priceid) {
        this.priceid = priceid == null ? null : priceid.trim();
    }

    public String getPricename() {
        return pricename;
    }

    public void setPricename(String pricename) {
        this.pricename = pricename == null ? null : pricename.trim();
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getGuestname() {
        return guestname;
    }

    public void setGuestname(String guestname) {
        this.guestname = guestname == null ? null : guestname.trim();
    }

    public String getGuestsex() {
        return guestsex;
    }

    public void setGuestsex(String guestsex) {
        this.guestsex = guestsex == null ? null : guestsex.trim();
    }

    public String getGuestage() {
        return guestage;
    }

    public void setGuestage(String guestage) {
        this.guestage = guestage == null ? null : guestage.trim();
    }

    public String getGuestcard() {
        return guestcard;
    }

    public void setGuestcard(String guestcard) {
        this.guestcard = guestcard == null ? null : guestcard.trim();
    }

    public String getGuesttelphone() {
        return guesttelphone;
    }

    public void setGuesttelphone(String guesttelphone) {
        this.guesttelphone = guesttelphone == null ? null : guesttelphone.trim();
    }

    public String getGuestaddress() {
        return guestaddress;
    }

    public void setGuestaddress(String guestaddress) {
        this.guestaddress = guestaddress == null ? null : guestaddress.trim();
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby == null ? null : createdby.trim();
    }

    public String getCreatedid() {
        return createdid;
    }

    public void setCreatedid(String createdid) {
        this.createdid = createdid == null ? null : createdid.trim();
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid == null ? null : deptid.trim();
    }

    public Date getReviseddate() {
        return reviseddate;
    }

    public void setReviseddate(Date reviseddate) {
        this.reviseddate = reviseddate;
    }

    public String getRevisedby() {
        return revisedby;
    }

    public void setRevisedby(String revisedby) {
        this.revisedby = revisedby == null ? null : revisedby.trim();
    }

    public String getGuestcomment() {
        return guestcomment;
    }

    public void setGuestcomment(String guestcomment) {
        this.guestcomment = guestcomment == null ? null : guestcomment.trim();
    }

    public BigDecimal getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(BigDecimal saleprice) {
        this.saleprice = saleprice;
    }

    public BigDecimal getJamt() {
        return jamt;
    }

    public void setJamt(BigDecimal jamt) {
        this.jamt = jamt;
    }

    public BigDecimal getSamt() {
        return samt;
    }

    public void setSamt(BigDecimal samt) {
        this.samt = samt;
    }

    public String getPickupid() {
        return pickupid;
    }

    public void setPickupid(String pickupid) {
        this.pickupid = pickupid == null ? null : pickupid.trim();
    }

    public String getPickname() {
        return pickname;
    }

    public void setPickname(String pickname) {
        this.pickname = pickname == null ? null : pickname.trim();
    }

    public String getPickuptime() {
        return pickuptime;
    }

    public void setPickuptime(String pickuptime) {
        this.pickuptime = pickuptime == null ? null : pickuptime.trim();
    }

    public String getGuestcardtype() {
        return guestcardtype;
    }

    public void setGuestcardtype(String guestcardtype) {
        this.guestcardtype = guestcardtype == null ? null : guestcardtype.trim();
    }

    public String getVenueid() {
        return venueid;
    }

    public void setVenueid(String venueid) {
        this.venueid = venueid == null ? null : venueid.trim();
    }

    public Boolean getIssingleroom() {
        return issingleroom;
    }

    public void setIssingleroom(Boolean issingleroom) {
        this.issingleroom = issingleroom;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }
}