package com.holyrobot.con_product.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class ProTourPricepolicy implements Serializable {
    private String id;

    private String tourid;

    private Integer touristtype;

    private String policyname;

    private BigDecimal salesprice;

    private BigDecimal rebateprice;

    private BigDecimal singleroomprice;

    private BigDecimal procost;

    private Boolean isdefault;

    private Boolean isoccupyseat;

    private Integer orderindex;

    private String orgid;

    private String siteid;

    private String sitename;

    private String proid;

    private BigDecimal directprice;

    private String costpolicyid;

    private BigDecimal tailsalesprice;

    private BigDecimal taildirectprice;

    private BigDecimal beforediscountsalesprice;

    private BigDecimal beforediscountdirectprice;

    private BigDecimal discountsalesprice;

    private BigDecimal discountdirectprice;

    private BigDecimal discountvalue;

    private Integer discounttype;

    private BigDecimal volunteerdirectprice;

    private BigDecimal volunteerrebateprice;

    private BigDecimal volunteersalesprice;

    private BigDecimal travelerRewardPrice;

    private static final long serialVersionUID = 1L;

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

    public BigDecimal getProcost() {
        return procost;
    }

    public void setProcost(BigDecimal procost) {
        this.procost = procost;
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

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
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

    public String getCostpolicyid() {
        return costpolicyid;
    }

    public void setCostpolicyid(String costpolicyid) {
        this.costpolicyid = costpolicyid == null ? null : costpolicyid.trim();
    }
    public BigDecimal getTailsalesprice() {
        return tailsalesprice;
    }

    public void setTailsalesprice(BigDecimal tailsalesprice) {
        this.tailsalesprice = tailsalesprice;
    }

    public BigDecimal getTaildirectprice() {
        return taildirectprice;
    }

    public void setTaildirectprice(BigDecimal taildirectprice) {
        this.taildirectprice = taildirectprice;
    }

    public BigDecimal getBeforediscountsalesprice() {
        return beforediscountsalesprice;
    }

    public void setBeforediscountsalesprice(BigDecimal beforediscountsalesprice) {
        this.beforediscountsalesprice = beforediscountsalesprice;
    }

    public BigDecimal getBeforediscountdirectprice() {
        return beforediscountdirectprice;
    }

    public void setBeforediscountdirectprice(BigDecimal beforediscountdirectprice) {
        this.beforediscountdirectprice = beforediscountdirectprice;
    }

    public BigDecimal getDiscountsalesprice() {
        return discountsalesprice;
    }

    public void setDiscountsalesprice(BigDecimal discountsalesprice) {
        this.discountsalesprice = discountsalesprice;
    }

    public BigDecimal getDiscountdirectprice() {
        return discountdirectprice;
    }

    public void setDiscountdirectprice(BigDecimal discountdirectprice) {
        this.discountdirectprice = discountdirectprice;
    }

    public BigDecimal getDiscountvalue() {
        return discountvalue;
    }

    public void setDiscountvalue(BigDecimal discountvalue) {
        this.discountvalue = discountvalue;
    }

    public Integer getDiscounttype() {
        return discounttype;
    }

    public void setDiscounttype(Integer discounttype) {
        this.discounttype = discounttype;
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