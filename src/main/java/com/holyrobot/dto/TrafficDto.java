package com.holyrobot.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName： TrafficDto
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2018-8-24 14:39
 * @Version: 1.0
 * @Modified By:
 */

public class TrafficDto implements Serializable {

    //去交通标识 0：无；9：机票；10：火车票；11：汽车票；12：船票
    private int departureStatus;
    //回交通标识 0：无；9：机票；10：火车票；11：汽车票；12：船票
    private int backStatus;


    //去程交通信息
    private String departureNo;
    //回程交通信息
    private String backNo;


    //去程日期
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date departureDate;
    //回程日期
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date backDate;


    //去程出发城市
    private String departureCity;
    //回程出发城市
    private String backCity;


    //去程目的地城市
    private String depEndCity;
    //回程目的地城市
    private String backEndCity;


    //去程出发地
    private String departurePoint;
    //回程出发地
    private String backPoint;


    //去程目的站点
    private String depEndPoint;
    //回程目的站点
    private String backEndPoint;


    //去程出发时间
    private String depBeginTime;
    //回程出发时间
    private String backBeginTime;


    //去程到达时间
    private String depEndTime;
    //回程到达时间
    private String backEndTime;


    public TrafficDto() {
    }

    public int getDepartureStatus() {
        return departureStatus;
    }

    public void setDepartureStatus(int departureStatus) {
        this.departureStatus = departureStatus;
    }

    public int getBackStatus() {
        return backStatus;
    }

    public void setBackStatus(int backStatus) {
        this.backStatus = backStatus;
    }

    public String getDepartureNo() {
        return departureNo;
    }

    public void setDepartureNo(String departureNo) {
        this.departureNo = departureNo;
    }

    public String getBackNo() {
        return backNo;
    }

    public void setBackNo(String backNo) {
        this.backNo = backNo;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Date getBackDate() {
        return backDate;
    }

    public void setBackDate(Date backDate) {
        this.backDate = backDate;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getBackCity() {
        return backCity;
    }

    public void setBackCity(String backCity) {
        this.backCity = backCity;
    }

    public String getDeparturePoint() {
        return departurePoint;
    }

    public void setDeparturePoint(String departurePoint) {
        this.departurePoint = departurePoint;
    }

    public String getBackPoint() {
        return backPoint;
    }

    public void setBackPoint(String backPoint) {
        this.backPoint = backPoint;
    }

    public String getDepBeginTime() {
        return depBeginTime;
    }

    public void setDepBeginTime(String depBeginTime) {
        this.depBeginTime = depBeginTime;
    }

    public String getDepEndTime() {
        return depEndTime;
    }

    public void setDepEndTime(String depEndTime) {
        this.depEndTime = depEndTime;
    }

    public String getBackBeginTime() {
        return backBeginTime;
    }

    public void setBackBeginTime(String backBeginTime) {
        this.backBeginTime = backBeginTime;
    }

    public String getBackEndTime() {
        return backEndTime;
    }

    public void setBackEndTime(String backEndTime) {
        this.backEndTime = backEndTime;
    }

    public String getDepEndCity() {
        return depEndCity;
    }

    public void setDepEndCity(String depEndCity) {
        this.depEndCity = depEndCity;
    }

    public String getBackEndCity() {
        return backEndCity;
    }

    public void setBackEndCity(String backEndCity) {
        this.backEndCity = backEndCity;
    }

    public String getDepEndPoint() {
        return depEndPoint;
    }

    public void setDepEndPoint(String depEndPoint) {
        this.depEndPoint = depEndPoint;
    }

    public String getBackEndPoint() {
        return backEndPoint;
    }

    public void setBackEndPoint(String backEndPoint) {
        this.backEndPoint = backEndPoint;
    }
}
