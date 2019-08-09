package com.holyrobot.con_order.pojo;

import java.util.Date;

public class OrdPaymentRequestLog {
    private String id;

    private String paymentrequestid;

    private String auditor;

    private Date auditdate;

    private String auditcomment;

    private String auditlog;

    private String orgid;

    @Override
    public String toString() {
        return "OrdPaymentRequestLog{" +
                "id='" + id + '\'' +
                ", paymentrequestid='" + paymentrequestid + '\'' +
                ", auditor='" + auditor + '\'' +
                ", auditdate=" + auditdate +
                ", auditcomment='" + auditcomment + '\'' +
                ", auditlog='" + auditlog + '\'' +
                ", orgid='" + orgid + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPaymentrequestid() {
        return paymentrequestid;
    }

    public void setPaymentrequestid(String paymentrequestid) {
        this.paymentrequestid = paymentrequestid == null ? null : paymentrequestid.trim();
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor == null ? null : auditor.trim();
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

    public String getAuditlog() {
        return auditlog;
    }

    public void setAuditlog(String auditlog) {
        this.auditlog = auditlog == null ? null : auditlog.trim();
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }
}