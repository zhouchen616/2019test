package com.holyrobot.dto;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: 周相儒
 * @Description: TODO
 * @CreateDate: 2018/8/23 9:32
 * @Version: 1.0
 */
public class FlightProductDto {
    private String id;

    private Integer direction;

    private Date flightdate;

    private Integer intervaldays;

    private Integer ticketnumber;

    private BigDecimal ticketamount;

    private BigDecimal taxamount;

    private BigDecimal oilamount;

    private Integer flightType;

    private String source;

    private String toflightno;

    private String fromflightno;

    private Integer datastatus;

    private Date createddate;

    private String createdby;

    private String createdbyid;

    private String deptid;

    private String orgid;

    private Date reviseddate;

    private String revisedby;

    private String supplierid;

    private String supplier;

    private Integer isshare;

    private Long shareprices;

    private String comment;

    private String desstation;

    private String depstation;


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

    public Date getFlightdate() {
        return flightdate;
    }

    public void setFlightdate(Date flightdate) {
        this.flightdate = flightdate;
    }

    public Integer getIntervaldays() {
        return intervaldays;
    }

    public void setIntervaldays(Integer intervaldays) {
        this.intervaldays = intervaldays;
    }

    public Integer getTicketnumber() {
        return ticketnumber;
    }

    public void setTicketnumber(Integer ticketnumber) {
        this.ticketnumber = ticketnumber;
    }

    public BigDecimal getTicketamount() {
        return ticketamount;
    }

    public void setTicketamount(BigDecimal ticketamount) {
        this.ticketamount = ticketamount;
    }

    public BigDecimal getTaxamount() {
        return taxamount;
    }

    public void setTaxamount(BigDecimal taxamount) {
        this.taxamount = taxamount;
    }

    public BigDecimal getOilamount() {
        return oilamount;
    }

    public void setOilamount(BigDecimal oilamount) {
        this.oilamount = oilamount;
    }

    public Integer getFlightType() {
        return flightType;
    }

    public void setFlightType(Integer flightType) {
        this.flightType = flightType;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getToflightno() {
        return toflightno;
    }

    public void setToflightno(String toflightno) {
        this.toflightno = toflightno;
    }

    public String getFromflightno() {
        return fromflightno;
    }

    public void setFromflightno(String fromflightno) {
        this.fromflightno = fromflightno;
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

    public Integer getIsshare() {
        return isshare;
    }

    public void setIsshare(Integer isshare) {
        this.isshare = isshare;
    }

    public Long getShareprices() {
        return shareprices;
    }

    public void setShareprices(Long shareprices) {
        this.shareprices = shareprices;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDesstation() {
        return desstation;
    }

    public void setDesstation(String desstation) {
        this.desstation = desstation;
    }

    public String getDepstation() {
        return depstation;
    }

    public void setDepstation(String depstation) {
        this.depstation = depstation;
    }
}
