package com.holyrobot.dto;

/**
 * @author 周陈
 * @Title: 线路类型IconDto
 * @date 2018/7/16 15:18
 */
public class ProTypeIconDto {
    private String proType;
    private String id;
    private String iconUrl;

    @Override
    public String toString() {
        return "ProTypeIconDto{" +
                "proType='" + proType + '\'' +
                ", id='" + id + '\'' +
                ", iconUrl='" + iconUrl + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProType() {
        return proType;
    }

    public void setProType(String proType) {
        this.proType = proType;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }
}
