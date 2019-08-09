package com.holyrobot.dto;


import com.holyrobot.repository.comment.EsProProduct;
import org.springframework.data.domain.Page;

import java.io.Serializable;

/**
 * @author 周陈
 * @Title: EsProProduct +Total 封装类
 * @date 2018/5/15 17:20
 */
public class EsProProductAndTotal implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 用户类型 1.ERP 2.直客 3.顾问
     */
    private Integer userType;
    /**
     * Es分页数据
     */
    private Page<EsProProduct> page;
    /**
     * 站点
     */
    private String site;

    public EsProProductAndTotal() {
    }

    public EsProProductAndTotal(Integer userType, Page<EsProProduct> page, String site) {
        this.userType = userType == null ? 1 : userType;
        this.page = page;
        this.site = site;
    }

    @Override
    public String toString() {
        return "EsProProductAndTotal{" +
                "userType=" + userType +
                ", page=" + page +
                ", site='" + site + '\'' +
                '}';
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType == null ? 1 : userType;
    }

    public Page<EsProProduct> getPage() {
        return page;
    }

    public void setPage(Page<EsProProduct> page) {
        this.page = page;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }
}
