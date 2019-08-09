package com.holyrobot.con_order.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class OrdOrderCollection {
    private String id;

    private String orderid;

    private String collectunit;

    private String collectunitid;

    private BigDecimal collectamt;

    private String collecttype;

    private Date collectdate;

    private String collectbill;

    private String comment;

    private String claimid;

    private String srcbank;

    private String srcname;

    private String srcbankid;

    private Integer collectstatus;

    private String createdbyid;

    private String createdby;

    private Date createddate;

    private String auditor;

    private String auditorid;

    private Date auditdate;

    private String auditcomment;

    private String orgid;

    private String paymentrequestid;

    private Boolean isbuyerapply;

    private String buyerorgname;

    @Override
    public String toString() {
        return "OrdOrderCollection{" +
                "id='" + id + '\'' +
                ", orderid='" + orderid + '\'' +
                ", collectunit='" + collectunit + '\'' +
                ", collectunitid='" + collectunitid + '\'' +
                ", collectamt=" + collectamt +
                ", collecttype='" + collecttype + '\'' +
                ", collectdate=" + collectdate +
                ", collectbill='" + collectbill + '\'' +
                ", comment='" + comment + '\'' +
                ", claimid='" + claimid + '\'' +
                ", srcbank='" + srcbank + '\'' +
                ", srcname='" + srcname + '\'' +
                ", srcbankid='" + srcbankid + '\'' +
                ", collectstatus=" + collectstatus +
                ", createdbyid='" + createdbyid + '\'' +
                ", createdby='" + createdby + '\'' +
                ", createddate=" + createddate +
                ", auditor='" + auditor + '\'' +
                ", auditorid='" + auditorid + '\'' +
                ", auditdate=" + auditdate +
                ", auditcomment='" + auditcomment + '\'' +
                ", orgid='" + orgid + '\'' +
                ", paymentrequestid='" + paymentrequestid + '\'' +
                ", isbuyerapply=" + isbuyerapply +
                ", buyerorgname='" + buyerorgname + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getCollectunit() {
        return collectunit;
    }

    public void setCollectunit(String collectunit) {
        this.collectunit = collectunit == null ? null : collectunit.trim();
    }

    public String getCollectunitid() {
        return collectunitid;
    }

    public void setCollectunitid(String collectunitid) {
        this.collectunitid = collectunitid == null ? null : collectunitid.trim();
    }

    public BigDecimal getCollectamt() {
        return collectamt;
    }

    public void setCollectamt(BigDecimal collectamt) {
        this.collectamt = collectamt;
    }

    public String getCollecttype() {
        return collecttype;
    }

    public void setCollecttype(String collecttype) {
        this.collecttype = collecttype == null ? null : collecttype.trim();
    }

    public Date getCollectdate() {
        return collectdate;
    }

    public void setCollectdate(Date collectdate) {
        this.collectdate = collectdate;
    }

    public String getCollectbill() {
        return collectbill;
    }

    public void setCollectbill(String collectbill) {
        this.collectbill = collectbill == null ? null : collectbill.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public String getClaimid() {
        return claimid;
    }

    public void setClaimid(String claimid) {
        this.claimid = claimid == null ? null : claimid.trim();
    }

    public String getSrcbank() {
        return srcbank;
    }

    public void setSrcbank(String srcbank) {
        this.srcbank = srcbank == null ? null : srcbank.trim();
    }

    public String getSrcname() {
        return srcname;
    }

    public void setSrcname(String srcname) {
        this.srcname = srcname == null ? null : srcname.trim();
    }

    public String getSrcbankid() {
        return srcbankid;
    }

    public void setSrcbankid(String srcbankid) {
        this.srcbankid = srcbankid == null ? null : srcbankid.trim();
    }

    public Integer getCollectstatus() {
        return collectstatus;
    }

    public void setCollectstatus(Integer collectstatus) {
        this.collectstatus = collectstatus;
    }

    public String getCreatedbyid() {
        return createdbyid;
    }

    public void setCreatedbyid(String createdbyid) {
        this.createdbyid = createdbyid == null ? null : createdbyid.trim();
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby == null ? null : createdby.trim();
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor == null ? null : auditor.trim();
    }

    public String getAuditorid() {
        return auditorid;
    }

    public void setAuditorid(String auditorid) {
        this.auditorid = auditorid == null ? null : auditorid.trim();
    }

    public Date getAuditdate() {
        return auditdate;
    }

    public void setAuditdate(Date auditdate) {
        this.auditdate = auditdate;
    }

    public String getAuditcomment() {
        return auditcomment;
    }

    public void setAuditcomment(String auditcomment) {
        this.auditcomment = auditcomment == null ? null : auditcomment.trim();
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    public String getPaymentrequestid() {
        return paymentrequestid;
    }

    public void setPaymentrequestid(String paymentrequestid) {
        this.paymentrequestid = paymentrequestid == null ? null : paymentrequestid.trim();
    }

    public Boolean getIsbuyerapply() {
        return isbuyerapply;
    }

    public void setIsbuyerapply(Boolean isbuyerapply) {
        this.isbuyerapply = isbuyerapply;
    }

    public String getBuyerorgname() {
        return buyerorgname;
    }

    public void setBuyerorgname(String buyerorgname) {
        this.buyerorgname = buyerorgname == null ? null : buyerorgname.trim();
    }
}