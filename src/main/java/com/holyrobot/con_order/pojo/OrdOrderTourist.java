package com.holyrobot.con_order.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrdOrderTourist implements Serializable {
    private String id;

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

    private String englishSurname; //游客英语 姓

    private String engelishName; //游客英语 名

    private String nationalityName; //游客 国籍

    private String nationalityId; //国籍表id

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm",timezone="GMT+8")
    private Date dateOfBirth; //游客生日

    private static final long serialVersionUID = 1L;

    public String getEnglishSurname() {
        return englishSurname;
    }

    public void setEnglishSurname(String englishSurname) {
        this.englishSurname = englishSurname;
    }

    public String getEngelishName() {
        return engelishName;
    }

    public void setEngelishName(String engelishName) {
        this.engelishName = engelishName;
    }

    public String getNationalityName() {
        return nationalityName;
    }

    public void setNationalityName(String nationalityName) {
        this.nationalityName = nationalityName;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPriceid() {
        return priceid;
    }

    public void setPriceid(String priceid) {
        this.priceid = priceid;
    }

    public String getPricename() {
        return pricename;
    }

    public void setPricename(String pricename) {
        this.pricename = pricename;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getGuestname() {
        return guestname;
    }

    public void setGuestname(String guestname) {
        this.guestname = guestname;
    }

    public String getGuestsex() {
        return guestsex;
    }

    public void setGuestsex(String guestsex) {
        this.guestsex = guestsex;
    }

    public String getGuestage() {
        return guestage;
    }

    public void setGuestage(String guestage) {
        this.guestage = guestage;
    }

    public String getGuestcard() {
        return guestcard;
    }

    public void setGuestcard(String guestcard) {
        this.guestcard = guestcard;
    }

    public String getGuesttelphone() {
        return guesttelphone;
    }

    public void setGuesttelphone(String guesttelphone) {
        this.guesttelphone = guesttelphone;
    }

    public String getGuestaddress() {
        return guestaddress;
    }

    public void setGuestaddress(String guestaddress) {
        this.guestaddress = guestaddress;
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
        this.createdby = createdby;
    }

    public String getCreatedid() {
        return createdid;
    }

    public void setCreatedid(String createdid) {
        this.createdid = createdid;
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
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
        this.revisedby = revisedby;
    }

    public String getGuestcomment() {
        return guestcomment;
    }

    public void setGuestcomment(String guestcomment) {
        this.guestcomment = guestcomment;
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
        this.pickupid = pickupid;
    }

    public String getPickname() {
        return pickname;
    }

    public void setPickname(String pickname) {
        this.pickname = pickname;
    }

    public String getPickuptime() {
        return pickuptime;
    }

    public void setPickuptime(String pickuptime) {
        this.pickuptime = pickuptime;
    }

    public String getGuestcardtype() {
        return guestcardtype;
    }

    public void setGuestcardtype(String guestcardtype) {
        this.guestcardtype = guestcardtype;
    }

    public String getVenueid() {
        return venueid;
    }

    public void setVenueid(String venueid) {
        this.venueid = venueid;
    }

    public Boolean getIssingleroom() {
        return issingleroom;
    }

    public void setIssingleroom(Boolean issingleroom) {
        this.issingleroom = issingleroom;
    }
}