package com.holyrobot.con_product.pojo;

public class ProProductStoreImage {
    private String id;

    private String productid;

    private String imagesrc;

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

    public String getImagesrc() {
        return imagesrc;
    }

    public void setImagesrc(String imagesrc) {
        this.imagesrc = imagesrc == null ? null : imagesrc.trim();
    }
}