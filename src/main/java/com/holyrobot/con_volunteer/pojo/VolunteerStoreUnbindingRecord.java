package com.holyrobot.con_volunteer.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class VolunteerStoreUnbindingRecord {
    private String id;

    private String volappid;

    private String orgid;

    private String userid;

    private Integer storestatus;

    private String appreason;

    private String remarks;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm",timezone="GMT+8")
    private Date reasondate;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm",timezone="GMT+8")
    private Date reviewdate;

    private String reviewer;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getVolappid() {
        return volappid;
    }

    public void setVolappid(String volappid) {
        this.volappid = volappid == null ? null : volappid.trim();
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Integer getStorestatus() {
        return storestatus;
    }

    public void setStorestatus(Integer storestatus) {
        this.storestatus = storestatus;
    }

    public String getAppreason() {
        return appreason;
    }

    public void setAppreason(String appreason) {
        this.appreason = appreason == null ? null : appreason.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Date getReasondate() {
        return reasondate;
    }

    public void setReasondate(Date reasondate) {
        this.reasondate = reasondate;
    }

    public Date getReviewdate() {
        return reviewdate;
    }

    public void setReviewdate(Date reviewdate) {
        this.reviewdate = reviewdate;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer == null ? null : reviewer.trim();
    }
}