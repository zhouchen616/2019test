package com.holyrobot.dto;

/**
 * @author 周陈
 * @Title: 机构扩展表数据
 * @date 2018/7/2 16:11
 */
public class OrgInfoExtensionDto {
    private String ID;

    private String Logo;
    /**
     * 旅行社名
     */
    private String TravelAgencyName;
    /**
     * 社会信用代码
     */
    private String SocialCreditCode;

    /**
     * 发票抬头
     */
    private String InvoiceTitle;

    /**
     * 税务登记号
     */
    private String TaxNumber;
    /**
     * 旅行社地址
     */
    private String Address;
    /**
     * 旅行社电话
     */
    private String Phone;
    /**
     * 品牌名称
     */
    private String BrandName;
    //联系方式
    private String TAContactMobile;
    //联系人
    private String TAContact;

    private int IsOpenOnlineShop;
    //是否可以自采 -----自采的话就是加盟店的权限   1：是  2 否
    private int IsSelfServed;
    //是否直连  1是  2 否
    private int IsSupplierVisible;

    //是否为门店，Null ,非门店
    private String ParentID;

    /**
     * 业务类型
     */
    private String BusinessTypes;
    //总店ID,门店ID   null为普通店铺
    private String ParentIDPath;
    //总店收款
    private int IsShopOrderManage;

    public int getIsShopOrderManage() {
        return IsShopOrderManage;
    }

    public void setIsShopOrderManage(int isShopOrderManage) {
        IsShopOrderManage = isShopOrderManage;
    }

    public String getParentIDPath() {
        return ParentIDPath;
    }

    public void setParentIDPath(String parentIDPath) {
        ParentIDPath = parentIDPath;
    }

    public int getIsSupplierVisible() {
        return IsSupplierVisible;
    }

    public void setIsSupplierVisible(int isSupplierVisible) {
        IsSupplierVisible = isSupplierVisible;
    }

    public int getIsSelfServed() {
        return IsSelfServed;
    }

    public void setIsSelfServed(int isSelfServed) {
        IsSelfServed = isSelfServed;
    }

    public String getParentID() {
        return ParentID;
    }

    public void setParentID(String parentID) {
        ParentID = parentID;
    }

    public String getBusinessTypes() {
        return BusinessTypes;
    }

    public void setBusinessTypes(String businessTypes) {
        BusinessTypes = businessTypes;
    }

    @Override
    public String toString() {
        return "OrgInfoExtensionDto{" +
                "ID='" + ID + '\'' +
                ", Logo='" + Logo + '\'' +
                ", TravelAgencyName='" + TravelAgencyName + '\'' +
                ", SocialCreditCode='" + SocialCreditCode + '\'' +
                ", InvoiceTitle='" + InvoiceTitle + '\'' +
                ", TaxNumber='" + TaxNumber + '\'' +
                ", Address='" + Address + '\'' +
                ", Phone='" + Phone + '\'' +
                ", BrandName='" + BrandName + '\'' +
                '}';
    }

    public String getTAContactMobile() {
        return TAContactMobile;
    }

    public void setTAContactMobile(String TAContactMobile) {
        this.TAContactMobile = TAContactMobile;
    }

    public String getTAContact() {
        return TAContact;
    }

    public void setTAContact(String TAContact) {
        this.TAContact = TAContact;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getLogo() {
        return Logo;
    }

    public void setLogo(String logo) {
        Logo = logo;
    }

    public String getTravelAgencyName() {
        return TravelAgencyName;
    }

    public void setTravelAgencyName(String travelAgencyName) {
        TravelAgencyName = travelAgencyName;
    }

    public String getSocialCreditCode() {
        return SocialCreditCode;
    }

    public void setSocialCreditCode(String socialCreditCode) {
        SocialCreditCode = socialCreditCode;
    }

    public String getInvoiceTitle() {
        return InvoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        InvoiceTitle = invoiceTitle;
    }

    public String getTaxNumber() {
        return TaxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        TaxNumber = taxNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String brandName) {
        BrandName = brandName;
    }

    public int getIsOpenOnlineShop() {
        return IsOpenOnlineShop;
    }

    public void setIsOpenOnlineShop(int isOpenOnlineShop) {
        IsOpenOnlineShop = isOpenOnlineShop;
    }
}
