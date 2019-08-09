package com.holyrobot.con_order.pojo;

import java.util.Date;

public class OrdPaymentRequestFile {
    private String id;

    private String paymentrequestid;

    private String fileid;

    private String orgid;

    private Date createddate;

    @Override
    public String toString() {
        return "OrdPaymentRequestFile{" +
                "id='" + id + '\'' +
                ", paymentrequestid='" + paymentrequestid + '\'' +
                ", fileid='" + fileid + '\'' +
                ", orgid='" + orgid + '\'' +
                ", createddate=" + createddate +
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

    public String getFileid() {
        return fileid;
    }

    public void setFileid(String fileid) {
        this.fileid = fileid == null ? null : fileid.trim();
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }
}