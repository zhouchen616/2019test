package com.holyrobot.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 *
 * @Description:
 * 
 * @auther: 史迪旻
 * @date: 15:06 2019-1-18 
 * @param: 
 * @return: 
 *
 */
public class OrderInfoViewVo {

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
    private String commissionAmt;
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
    private String fileUrl;
    private Integer hasOrderDoc; //是否有 出团通知书 0无 1有

    public String getCommissionAmt() {
        return commissionAmt;
    }

    public void setCommissionAmt(String commissionAmt) {
        this.commissionAmt = commissionAmt;
    }

    public Integer getHasOrderDoc() {
        return hasOrderDoc;
    }

    public void setHasOrderDoc(Integer hasOrderDoc) {
        this.hasOrderDoc = hasOrderDoc;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(String supplierID) {
        this.supplierID = supplierID;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPayMobile() {
        return payMobile;
    }

    public void setPayMobile(String payMobile) {
        this.payMobile = payMobile;
    }

    public String getDestName() {
        return destName;
    }

    public void setDestName(String destName) {
        this.destName = destName;
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

}
