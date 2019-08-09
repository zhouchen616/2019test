package com.holyrobot.dto;

/**
 * @author 周陈
 * @Title: 初始化站点 提供给前端保存cookie数据
 * @date 2018/5/30 16:17
 */
public class InitSiteDto {
    //设置站点默认值
    private String startcity;
    //设置默认值
    private String siteid;

    public InitSiteDto() {
    }

    public InitSiteDto(String startcity, String siteid) {
        this.startcity = startcity;
        this.siteid = siteid;
    }

    public String getStartcity() {
        return startcity;
    }

    public void setStartcity(String startcity) {
        this.startcity = startcity;
    }

    public String getSiteid() {
        return siteid;
    }

    public void setSiteid(String siteid) {
        this.siteid = siteid;
    }
}
