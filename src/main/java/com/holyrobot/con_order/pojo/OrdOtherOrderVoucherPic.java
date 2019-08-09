package com.holyrobot.con_order.pojo;

public class OrdOtherOrderVoucherPic {
    private String id;

    private String otherorderid;

    private String voucherurl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOtherorderid() {
        return otherorderid;
    }

    public void setOtherorderid(String otherorderid) {
        this.otherorderid = otherorderid == null ? null : otherorderid.trim();
    }

    public String getVoucherurl() {
        return voucherurl;
    }

    public void setVoucherurl(String voucherurl) {
        this.voucherurl = voucherurl == null ? null : voucherurl.trim();
    }
}