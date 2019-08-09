package com.holyrobot.con_volunteer.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @ClassName： VolunteerCommAccountVo
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2019-2-23 11:13
 * @Version: 1.0
 * @Modified By:
 */
public class VolunteerCommAccountVo implements Serializable {

    private VolunteerApplication volunteerApplication; //申请人信息

    private List<VolunteerCommissionRecord> volunteerCommissionRecordList; //佣金记录信息

    private BigDecimal applicationAmt; //  累计可提现奖励金
    private Integer isTralveer;    //1有下级旅行家  0无下级
    private BigDecimal Allowance; //累计奖励金
    private BigDecimal totalCommission; //可提总佣金

    private BigDecimal cumCommission; //累计总佣金

    private BigDecimal cumCash;//累计提现

    private Float availableAllowance; //累计可提现奖励金

    private BigDecimal allowanceTotal;  //累计可提现奖励金（包括申请中）

    public BigDecimal getAllowanceTotal() {
        return allowanceTotal;
    }

    public void setAllowanceTotal(BigDecimal allowanceTotal) {
        this.allowanceTotal = allowanceTotal;
    }

    public Float getAvailableAllowance() {
        return availableAllowance;
    }

    public void setAvailableAllowance(Float availableAllowance) {
        this.availableAllowance = availableAllowance;
    }

    public BigDecimal getCumCash() {
        return cumCash;
    }

    public void setCumCash(BigDecimal cumCash) {
        this.cumCash = cumCash;
    }

    public BigDecimal getCumCommission() {
        return cumCommission;
    }

    public void setCumCommission(BigDecimal cumCommission) {
        this.cumCommission = cumCommission;
    }

    public VolunteerApplication getVolunteerApplication() {
        return volunteerApplication;
    }

    public void setVolunteerApplication(VolunteerApplication volunteerApplication) {
        this.volunteerApplication = volunteerApplication;
    }

    public List<VolunteerCommissionRecord> getVolunteerCommissionRecordList() {
        return volunteerCommissionRecordList;
    }

    public void setVolunteerCommissionRecordList(List<VolunteerCommissionRecord> volunteerCommissionRecordList) {
        this.volunteerCommissionRecordList = volunteerCommissionRecordList;
    }

    public BigDecimal getTotalCommission() {
        return totalCommission;
    }

    public void setTotalCommission(BigDecimal totalCommission) {
        this.totalCommission = totalCommission;
    }

    public BigDecimal getApplicationAmt() {
        return applicationAmt;
    }

    public void setApplicationAmt(BigDecimal applicationAmt) {
        this.applicationAmt = applicationAmt;
    }

    public Integer getIsTralveer() {
        return isTralveer;
    }

    public void setIsTralveer(Integer isTralveer) {
        this.isTralveer = isTralveer;
    }

    public BigDecimal getAllowance() {
        return Allowance;
    }

    public void setAllowance(BigDecimal allowance) {
        Allowance = allowance;
    }
}
