package com.holyrobot.con_product.pojo;

public class ProProductDirectSalesRelation {
    private String id;

    private String proid;

    private String supplierid;

    private String receiverid;

    private Integer relationno;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getProid() {
        return proid;
    }

    public void setProid(String proid) {
        this.proid = proid == null ? null : proid.trim();
    }

    public String getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(String supplierid) {
        this.supplierid = supplierid == null ? null : supplierid.trim();
    }

    public String getReceiverid() {
        return receiverid;
    }

    public void setReceiverid(String receiverid) {
        this.receiverid = receiverid == null ? null : receiverid.trim();
    }

    public Integer getRelationno() {
        return relationno;
    }

    public void setRelationno(Integer relationno) {
        this.relationno = relationno;
    }
}