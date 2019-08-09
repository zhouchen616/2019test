package com.holyrobot.dto;



import com.holyrobot.con_res.pojo.ResFlightcabin;
import com.holyrobot.con_res.pojo.ResFlightinfo;

import java.io.Serializable;

/**
 * @Author: 周相儒
 * @Description: TODO
 * @CreateDate: 2018/5/18 9:41
 * @Version: 1.0
 */
public class FlightInfoDto implements Serializable{

    //去程回城标识
    private String status;
    //航班飞行天数，当天到达为0
    private String days;
    //出发城市
    private String goCityName;
    //出发机场
    private String goAirportName;
    //到达城市
    private String backCityName;
    //到达机场
    private String backAirportName;
    //仓位信息
    private ResFlightcabin flightcabin;
    //航班详细信息
    private ResFlightinfo flightinfo;

    public ResFlightcabin getFlightcabin() {
        return flightcabin;
    }

    public void setFlightcabin(ResFlightcabin flightcabin) {
        this.flightcabin = flightcabin;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public ResFlightinfo getFlightinfo() {
        return flightinfo;
    }

    public void setFlightinfo(ResFlightinfo flightinfo) {
        this.flightinfo = flightinfo;
    }

    public String getGoCityName() {
        return goCityName;
    }

    public void setGoCityName(String goCityName) {
        this.goCityName = goCityName;
    }

    public String getGoAirportName() {
        return goAirportName;
    }

    public void setGoAirportName(String goAirportName) {
        this.goAirportName = goAirportName;
    }

    public String getBackCityName() {
        return backCityName;
    }

    public void setBackCityName(String backCityName) {
        this.backCityName = backCityName;
    }

    public String getBackAirportName() {
        return backAirportName;
    }

    public void setBackAirportName(String backAirportName) {
        this.backAirportName = backAirportName;
    }
}
