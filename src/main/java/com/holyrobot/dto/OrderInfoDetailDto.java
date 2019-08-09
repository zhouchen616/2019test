package com.holyrobot.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.holyrobot.con_order.pojo.OrdOrderTourist;
import com.holyrobot.con_order.pojo.OrdOrderinfo;


import java.util.Date;
import java.util.List;

/**
 * @Author: 周相儒
 * @Description: 订单信息展示
 * @CreateDate: 2018/8/17 8:42
 * @Version: 1.0
 */
public class OrderInfoDetailDto {

    private String proId;

    private OrdOrderinfo ordOrderinfo;

    private List<OrdOrderTourist> ordOrderTourists;

    private String url;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date dateTime;

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<OrdOrderTourist> getOrdOrderTourists() {
        return ordOrderTourists;
    }

    public void setOrdOrderTourists(List<OrdOrderTourist> ordOrderTourists) {
        this.ordOrderTourists = ordOrderTourists;
    }

    public OrdOrderinfo getOrdOrderinfo() {
        return ordOrderinfo;
    }

    public void setOrdOrderinfo(OrdOrderinfo ordOrderinfo) {
        this.ordOrderinfo = ordOrderinfo;
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }
}
