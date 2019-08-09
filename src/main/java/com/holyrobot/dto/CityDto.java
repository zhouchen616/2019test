package com.holyrobot.dto;

/**
 * @author 周陈
 * @Title: 城市DTO
 * @date 2018/6/5 9:39
 */
public class CityDto {
    private String destid;
    private String cityName;

    public CityDto(String destid, String cityName) {
        this.destid = destid;
        this.cityName = cityName;
    }

    public CityDto() {
    }

    public String getDestid() {
        return destid;
    }

    public void setDestid(String destid) {
        this.destid = destid;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
