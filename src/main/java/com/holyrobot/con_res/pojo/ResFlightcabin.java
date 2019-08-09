package com.holyrobot.con_res.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class ResFlightcabin implements Serializable {
    private String id;

    private String flightid;

    private String cabinname;

    private String cabinnum;

    private BigDecimal cabinprice;

    private String cabincode;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getFlightid() {
        return flightid;
    }

    public void setFlightid(String flightid) {
        this.flightid = flightid == null ? null : flightid.trim();
    }

    public String getCabinname() {
        return cabinname;
    }

    public void setCabinname(String cabinname) {
        this.cabinname = cabinname == null ? null : cabinname.trim();
    }

    public String getCabinnum() {
        return cabinnum;
    }

    public void setCabinnum(String cabinnum) {
        this.cabinnum = cabinnum == null ? null : cabinnum.trim();
    }

    public BigDecimal getCabinprice() {
        return cabinprice;
    }

    public void setCabinprice(BigDecimal cabinprice) {
        this.cabinprice = cabinprice;
    }

    public String getCabincode() {
        return cabincode;
    }

    public void setCabincode(String cabincode) {
        this.cabincode = cabincode == null ? null : cabincode.trim();
    }
}