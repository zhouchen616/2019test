package com.holyrobot.con_product.pojo;

public class ProProductFile {
    private String id;

    private Integer itemindex;

    private String productid;

    private String filename;

    private String fileurl;

    private String orgid;

    private String extendname;

    private Integer width;

    private Integer height;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getItemindex() {
        return itemindex;
    }

    public void setItemindex(Integer itemindex) {
        this.itemindex = itemindex;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getFileurl() {
        return fileurl;
    }

    public void setFileurl(String fileurl) {
        this.fileurl = fileurl == null ? null : fileurl.trim();
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    public String getExtendname() {
        return extendname;
    }

    public void setExtendname(String extendname) {
        this.extendname = extendname == null ? null : extendname.trim();
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}