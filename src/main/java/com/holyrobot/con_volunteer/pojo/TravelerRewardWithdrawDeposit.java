package com.holyrobot.con_volunteer.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class TravelerRewardWithdrawDeposit {
    private String id;

    private String parentid;

    private String childid;

    private String paytype;

    private String depositbank;

    private String cardno;

    private BigDecimal applicationamt;

    private String voucherurl;

    private Integer datastatus;

    private Date createddate;

    private Date reviseddate;

    private String remark;

    private String orgid;

    private String audituserid;

    private String payuserid;

    private Date auditdate;

    private String applyuserid;

    private String auditusername;

    private String payusername;

    private String applyusername;

    private Integer finauditdatastatus;

    private String payremark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public String getChildid() {
        return childid;
    }

    public void setChildid(String childid) {
        this.childid = childid == null ? null : childid.trim();
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

    public BigDecimal getApplicationamt() {
        return applicationamt;
    }

    public void setApplicationamt(BigDecimal applicationamt) {
        this.applicationamt = applicationamt;
    }

    public String getVoucherurl() {
        return voucherurl;
    }

    public void setVoucherurl(String voucherurl) {
        this.voucherurl = voucherurl == null ? null : voucherurl.trim();
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

    public Date getReviseddate() {
        return reviseddate;
    }

    public void setReviseddate(Date reviseddate) {
        this.reviseddate = reviseddate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    public String getAudituserid() {
        return audituserid;
    }

    public void setAudituserid(String audituserid) {
        this.audituserid = audituserid == null ? null : audituserid.trim();
    }

    public String getPayuserid() {
        return payuserid;
    }

    public void setPayuserid(String payuserid) {
        this.payuserid = payuserid == null ? null : payuserid.trim();
    }

    public Date getAuditdate() {
        return auditdate;
    }

    public void setAuditdate(Date auditdate) {
        this.auditdate = auditdate;
    }

    public String getApplyuserid() {
        return applyuserid;
    }

    public void setApplyuserid(String applyuserid) {
        this.applyuserid = applyuserid == null ? null : applyuserid.trim();
    }

    public String getAuditusername() {
        return auditusername;
    }

    public void setAuditusername(String auditusername) {
        this.auditusername = auditusername == null ? null : auditusername.trim();
    }

    public String getPayusername() {
        return payusername;
    }

    public void setPayusername(String payusername) {
        this.payusername = payusername == null ? null : payusername.trim();
    }

    public String getApplyusername() {
        return applyusername;
    }

    public void setApplyusername(String applyusername) {
        this.applyusername = applyusername == null ? null : applyusername.trim();
    }

    public Integer getFinauditdatastatus() {
        return finauditdatastatus;
    }

    public void setFinauditdatastatus(Integer finauditdatastatus) {
        this.finauditdatastatus = finauditdatastatus;
    }

    public String getPayremark() {
        return payremark;
    }

    public void setPayremark(String payremark) {
        this.payremark = payremark == null ? null : payremark.trim();
    }
}