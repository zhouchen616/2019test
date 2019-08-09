package com.holyrobot.con_product.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ProProductDynamicManageSetting {
    private String id;

    private String productid;

    private Integer productsource;

    private Integer suppliertype;

    private String supplierid;

    private Integer setmode;

    private BigDecimal setmodevalue;

    private String createdbyid;

    private String createdby;

    private Date createddate;

    private String revisedbyid;

    private String revisedby;

    private Date reviseddate;

    private String orgid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public Integer getProductsource() {
        return productsource;
    }

    public void setProductsource(Integer productsource) {
        this.productsource = productsource;
    }

    public Integer getSuppliertype() {
        return suppliertype;
    }

    public void setSuppliertype(Integer suppliertype) {
        this.suppliertype = suppliertype;
    }

    public String getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(String supplierid) {
        this.supplierid = supplierid == null ? null : supplierid.trim();
    }

    public Integer getSetmode() {
        return setmode;
    }

    public void setSetmode(Integer setmode) {
        this.setmode = setmode;
    }

    public BigDecimal getSetmodevalue() {
        return setmodevalue;
    }

    public void setSetmodevalue(BigDecimal setmodevalue) {
        this.setmodevalue = setmodevalue;
    }

    public String getCreatedbyid() {
        return createdbyid;
    }

    public void setCreatedbyid(String createdbyid) {
        this.createdbyid = createdbyid == null ? null : createdbyid.trim();
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby == null ? null : createdby.trim();
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public String getRevisedbyid() {
        return revisedbyid;
    }

    public void setRevisedbyid(String revisedbyid) {
        this.revisedbyid = revisedbyid == null ? null : revisedbyid.trim();
    }

    public String getRevisedby() {
        return revisedby;
    }

    public void setRevisedby(String revisedby) {
        this.revisedby = revisedby == null ? null : revisedby.trim();
    }

    public Date getReviseddate() {
        return reviseddate;
    }

    public void setReviseddate(Date reviseddate) {
        this.reviseddate = reviseddate;
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }
}