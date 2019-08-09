package com.holyrobot.con_order.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class OrdOrderLog implements Serializable {
    private String id;

    private String orderid;

    private String oplog;

    private String opip;

    private String opbrowser;

    private String createdbyid;

    private String createdby;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date createddate;

    private String orgid;

    private Integer visibletype;

    private String orgname;

    @Override
    public String toString() {
        return "OrdOrderLog{" +
                "id='" + id + '\'' +
                ", orderid='" + orderid + '\'' +
                ", oplog='" + oplog + '\'' +
                ", opip='" + opip + '\'' +
                ", opbrowser='" + opbrowser + '\'' +
                ", createdbyid='" + createdbyid + '\'' +
                ", createdby='" + createdby + '\'' +
                ", createddate=" + createddate +
                ", orgid='" + orgid + '\'' +
                ", visibletype=" + visibletype +
                ", orgname='" + orgname + '\'' +
                '}';
    }

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getOplog() {
        return oplog;
    }

    public void setOplog(String oplog) {
        this.oplog = oplog;
    }

    public String getOpip() {
        return opip;
    }

    public void setOpip(String opip) {
        this.opip = opip;
    }

    public String getOpbrowser() {
        return opbrowser;
    }

    public void setOpbrowser(String opbrowser) {
        this.opbrowser = opbrowser;
    }

    public String getCreatedbyid() {
        return createdbyid;
    }

    public void setCreatedbyid(String createdbyid) {
        this.createdbyid = createdbyid;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }

    public Integer getVisibletype() {
        return visibletype;
    }

    public void setVisibletype(Integer visibletype) {
        this.visibletype = visibletype;
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname;
    }
}