package com.holyrobot.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Author: 周相儒
 * @Description: 查询订单返回数据
 * @CreateDate: 2018/7/5 9:39
 * @Version: 1.0
 */
public class OrderInfoViewDto {

    private String ordId;
    private String proId;
    private String proTourId;
    private String aliaseName;
    private String orderNo;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date tourDate;
    private String adultNum;
    private String childNum;
    private String tourDays;
    private String payableAmt;
    private String coverImg;
    private String totalNum;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date returnDate;
    private String dataStatus;
    private String contact;
    private String mobile;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date createdDate;
    private String supplierName;
    private String destName;
    private String payMobile;
    private String userId;
    private String supplierID;
    private String commissionAmt;


    public String getCommissionAmt() {
        return commissionAmt;
    }

    public void setCommissionAmt(String commissionAmt) {
        this.commissionAmt = commissionAmt;
    }

    public String getDestName() {
        return destName;
    }

    public void setDestName(String destName) {
        this.destName = destName;
    }

    public String getPayMobile() {
        return payMobile;
    }

    public void setPayMobile(String payMobile) {
        this.payMobile = payMobile;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getOrdId() {
        return ordId;
    }

    public void setOrdId(String ordId) {
        this.ordId = ordId;
    }

    public String getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(String dataStatus) {
        this.dataStatus = dataStatus;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public String getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(String totalNum) {
        this.totalNum = totalNum;
    }

    public String getCoverImg() {

        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getProTourId() {
        return proTourId;
    }

    public void setProTourId(String proTourId) {
        this.proTourId = proTourId;
    }

    public String getAliaseName() {
        return aliaseName;
    }

    public void setAliaseName(String aliaseName) {
        this.aliaseName = aliaseName;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Date getTourDate() {
        return tourDate;
    }

    public void setTourDate(Date tourDate) {
        this.tourDate = tourDate;
    }

    public String getAdultNum() {
        return adultNum;
    }

    public void setAdultNum(String adultNum) {
        this.adultNum = adultNum;
    }

    public String getChildNum() {
        return childNum;
    }

    public void setChildNum(String childNum) {
        this.childNum = childNum;
    }

    public String getTourDays() {
        return tourDays;
    }

    public void setTourDays(String tourDays) {
        this.tourDays = tourDays;
    }

    public String getPayableAmt() {
        return payableAmt;
    }

    public void setPayableAmt(String payableAmt) {
        this.payableAmt = payableAmt;
    }

    public String getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(String supplierID) {
        this.supplierID = supplierID;
    }
}
