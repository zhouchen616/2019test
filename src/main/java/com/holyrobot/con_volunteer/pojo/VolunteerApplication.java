package com.holyrobot.con_volunteer.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.StringUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class VolunteerApplication {
    private String id;

    private String orgid;

    private String travelagencyname;

    private String userid;

    private String username;

    private String usercard;

    private String usercardurl;

    private String phone;

    private String tacontact;

    private String shopname;

    private String shopheadportrait;

    private String paytype;

    private String depositbank;

    private String cardno;

    private Integer datastatus;

    private String tacontactid;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date createddate;

    private String remark;

    private Integer autoupdate;

    private Integer adjustmenttype;

    private Integer adjustmentmethod;

    private BigDecimal percentage;

    private BigDecimal fixedamount;

    private Integer infostatus;

    private String parentId;

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

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

    public String getTravelagencyname() {
        return travelagencyname;
    }

    public void setTravelagencyname(String travelagencyname) {
        this.travelagencyname = travelagencyname == null ? null : travelagencyname.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUsercard() {
        return usercard;
    }

    public void setUsercard(String usercard) {
        this.usercard = usercard == null ? null : usercard.trim();
    }

    public String getUsercardurl() {
        return usercardurl;
    }

    public void setUsercardurl(String usercardurl) {
        this.usercardurl = usercardurl == null ? null : usercardurl.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getTacontact() {
        return tacontact;
    }

    public void setTacontact(String tacontact) {
        this.tacontact = tacontact == null ? null : tacontact.trim();
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname == null ? null : shopname.trim();
    }

    public String getShopheadportrait() {
        return shopheadportrait;
    }

    public void setShopheadportrait(String shopheadportrait) {
        this.shopheadportrait = shopheadportrait == null ? null : shopheadportrait.trim();
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype == null ? null : paytype.trim();
    }

    public String getDepositbank() {
        return depositbank;
    }

    public void setDepositbank(String depositbank) {
        this.depositbank = depositbank == null ? null : depositbank.trim();
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno == null ? null : cardno.trim();
    }

    public Integer getDatastatus() {
        return datastatus;
    }

    public void setDatastatus(Integer datastatus) {
        this.datastatus = datastatus;
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getAutoupdate() {
        return autoupdate;
    }

    public void setAutoupdate(Integer autoupdate) {
        this.autoupdate = autoupdate;
    }

    public Integer getAdjustmenttype() {
        return adjustmenttype;
    }

    public void setAdjustmenttype(Integer adjustmenttype) {
        this.adjustmenttype = adjustmenttype;
    }

    public Integer getAdjustmentmethod() {
        return adjustmentmethod;
    }

    public void setAdjustmentmethod(Integer adjustmentmethod) {
        this.adjustmentmethod = adjustmentmethod;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }

    public BigDecimal getFixedamount() {
        return fixedamount;
    }

    public void setFixedamount(BigDecimal fixedamount) {
        this.fixedamount = fixedamount;
    }

    public Integer getInfostatus() {
        return infostatus;
    }

    public void setInfostatus(Integer infostatus) {
        this.infostatus = infostatus;
    }

    public String getTacontactid() {
        return tacontactid;
    }

    public void setTacontactid(String tacontactid) {
        if(StringUtils.isEmpty(tacontactid)){
            return;
        }
        this.tacontactid = tacontactid;
    }
}