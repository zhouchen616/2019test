package com.holyrobot.con_product.pojo;

import java.math.BigDecimal;

public class ProOtherProduct {
    private String id;

    private Integer protype;

    private BigDecimal unitamt;

    private BigDecimal deductionamt;

    private String picurl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getProtype() {
        return protype;
    }

    public void setProtype(Integer protype) {
        this.protype = protype;
    }

    public BigDecimal getUnitamt() {
        return unitamt;
    }

    public void setUnitamt(BigDecimal unitamt) {
        this.unitamt = unitamt;
    }

    public BigDecimal getDeductionamt() {
        return deductionamt;
    }

    public void setDeductionamt(BigDecimal deductionamt) {
        this.deductionamt = deductionamt;
    }

    public String getPicurl() {
        return picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl == null ? null : picurl.trim();
    }
}