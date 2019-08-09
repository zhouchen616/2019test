package com.holyrobot.dto;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: 周相儒
 * @Description: TODO
 * @CreateDate: 2018/8/23 9:53
 * @Version: 1.0
 */

public class TrainProductDto {
    private String id;

    private Integer direction;

    private Date godate;

    private String stationTrainCode;

    private Integer ticketnumber;

    private BigDecimal ticketcost;

    private Integer isshare;

    private BigDecimal shareprices;

    private String supplierid;

    private String supplier;

    private Date createddate;

    private String createdby;

    private String createdbyid;

    private String deptid;

    private String orgid;

    private Date reviseddate;

    private String revisedby;

    private Integer datastatus;

    private String seattype;

    private String depstation;

    private String desstation;

    private String comment;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    public Date getGodate() {
        return godate;
    }

    public void setGodate(Date godate) {
        this.godate = godate;
    }

    public String getStationTrainCode() {
        return stationTrainCode;
    }

    public void setStationTrainCode(String stationTrainCode) {
        this.stationTrainCode = stationTrainCode;
    }

    public Integer getTicketnumber() {
        return ticketnumber;
    }

    public void setTicketnumber(Integer ticketnumber) {
        this.ticketnumber = ticketnumber;
    }

    public BigDecimal getTicketcost() {
        return ticketcost;
    }

    public void setTicketcost(BigDecimal ticketcost) {
        this.ticketcost = ticketcost;
    }

    public Integer getIsshare() {
        return isshare;
    }

    public void setIsshare(Integer isshare) {
        this.isshare = isshare;
    }

    public BigDecimal getShareprices() {
        return shareprices;
    }

    public void setShareprices(BigDecimal shareprices) {
        this.shareprices = shareprices;
    }

    public String getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(String supplierid) {
        this.supplierid = supplierid;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
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

    public String getCreatedbyid() {
        return createdbyid;
    }

    public void setCreatedbyid(String createdbyid) {
        this.createdbyid = createdbyid;
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid;
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

    public Integer getDatastatus() {
        return datastatus;
    }

    public void setDatastatus(Integer datastatus) {
        this.datastatus = datastatus;
    }

    public String getSeattype() {
        return seattype;
    }

    public void setSeattype(String seattype) {
        this.seattype = seattype;
    }

    public String getDepstation() {
        return depstation;
    }

    public void setDepstation(String depstation) {
        this.depstation = depstation;
    }

    public String getDesstation() {
        return desstation;
    }

    public void setDesstation(String desstation) {
        this.desstation = desstation;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
