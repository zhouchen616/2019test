package com.holyrobot.con_product.pojo;

import java.math.BigDecimal;

public class ProProductDirectSalesItem {
    private String id;

    private String tourid;

    private Integer touristtype;

    private String policyname;

    private BigDecimal salesprice;

    private BigDecimal rebateprice;

    private BigDecimal singleroomprice;

    private Boolean isdefault;

    private Boolean isoccupyseat;

    private Integer orderindex;

    private String siteid;

    private String sitename;

    private String proid;

    private BigDecimal directprice;

    private BigDecimal salescostprice;

    private BigDecimal directcostprice;

    private String directsalesid;

    private BigDecimal etasalescostprice;

    private BigDecimal etadirectcostprice;

    private BigDecimal etarebateprice;

    private BigDecimal etasingleroomprice;

    private Integer isauto;

    private BigDecimal volunteerdirectprice;

    private BigDecimal volunteerrebateprice;

    private BigDecimal volunteersalesprice;

    private BigDecimal travelerRewardPrice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTourid() {
        return tourid;
    }

    public void setTourid(String tourid) {
        this.tourid = tourid == null ? null : tourid.trim();
    }

    public Integer getTouristtype() {
        return touristtype;
    }

    public void setTouristtype(Integer touristtype) {
        this.touristtype = touristtype;
    }

    public String getPolicyname() {
        return policyname;
    }

    public void setPolicyname(String policyname) {
        this.policyname = policyname == null ? null : policyname.trim();
    }

    public BigDecimal getSalesprice() {
        return salesprice;
    }

    public void setSalesprice(BigDecimal salesprice) {
        this.salesprice = salesprice;
    }

    public BigDecimal getRebateprice() {
        return rebateprice;
    }

    public void setRebateprice(BigDecimal rebateprice) {
        this.rebateprice = rebateprice;
    }

    public BigDecimal getSingleroomprice() {
        return singleroomprice;
    }

    public void setSingleroomprice(BigDecimal singleroomprice) {
        this.singleroomprice = singleroomprice;
    }

    public Boolean getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(Boolean isdefault) {
        this.isdefault = isdefault;
    }

    public Boolean getIsoccupyseat() {
        return isoccupyseat;
    }

    public void setIsoccupyseat(Boolean isoccupyseat) {
        this.isoccupyseat = isoccupyseat;
    }

    public Integer getOrderindex() {
        return orderindex;
    }

    public void setOrderindex(Integer orderindex) {
        this.orderindex = orderindex;
    }

    public String getSiteid() {
        return siteid;
    }

    public void setSiteid(String siteid) {
        this.siteid = siteid == null ? null : siteid.trim();
    }

    public String getSitename() {
        return sitename;
    }

    public void setSitename(String sitename) {
        this.sitename = sitename == null ? null : sitename.trim();
    }

    public String getProid() {
        return proid;
    }

    public void setProid(String proid) {
        this.proid = proid == null ? null : proid.trim();
    }

    public BigDecimal getDirectprice() {
        return directprice;
    }

    public void setDirectprice(BigDecimal directprice) {
        this.directprice = directprice;
    }

    public BigDecimal getSalescostprice() {
        return salescostprice;
    }

    public void setSalescostprice(BigDecimal salescostprice) {
        this.salescostprice = salescostprice;
    }

    public BigDecimal getDirectcostprice() {
        return directcostprice;
    }

    public void setDirectcostprice(BigDecimal directcostprice) {
        this.directcostprice = directcostprice;
    }

    public String getDirectsalesid() {
        return directsalesid;
    }

    public void setDirectsalesid(String directsalesid) {
        this.directsalesid = directsalesid == null ? null : directsalesid.trim();
    }

    public BigDecimal getEtasalescostprice() {
        return etasalescostprice;
    }

    public void setEtasalescostprice(BigDecimal etasalescostprice) {
        this.etasalescostprice = etasalescostprice;
    }

    public BigDecimal getEtadirectcostprice() {
        return etadirectcostprice;
    }

    public void setEtadirectcostprice(BigDecimal etadirectcostprice) {
        this.etadirectcostprice = etadirectcostprice;
    }

    public BigDecimal getEtarebateprice() {
        return etarebateprice;
    }

    public void setEtarebateprice(BigDecimal etarebateprice) {
        this.etarebateprice = etarebateprice;
    }

    public BigDecimal getEtasingleroomprice() {
        return etasingleroomprice;
    }

    public void setEtasingleroomprice(BigDecimal etasingleroomprice) {
        this.etasingleroomprice = etasingleroomprice;
    }

    public Integer getIsauto() {
        return isauto;
    }

    public void setIsauto(Integer isauto) {
        this.isauto = isauto;
    }

    public BigDecimal getVolunteerdirectprice() {
        return volunteerdirectprice;
    }

    public void setVolunteerdirectprice(BigDecimal volunteerdirectprice) {
        this.volunteerdirectprice = volunteerdirectprice;
    }

    public BigDecimal getVolunteerrebateprice() {
        return volunteerrebateprice;
    }

    public void setVolunteerrebateprice(BigDecimal volunteerrebateprice) {
        this.volunteerrebateprice = volunteerrebateprice;
    }

    public BigDecimal getVolunteersalesprice() {
        return volunteersalesprice;
    }

    public void setVolunteersalesprice(BigDecimal volunteersalesprice) {
        this.volunteersalesprice = volunteersalesprice;
    }

    public BigDecimal getTravelerRewardPrice() {
        return travelerRewardPrice;
    }

    public void setTravelerRewardPrice(BigDecimal travelerRewardPrice) {
        this.travelerRewardPrice = travelerRewardPrice == null ? new BigDecimal(0) : travelerRewardPrice;
    }
}