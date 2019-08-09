package com.holyrobot.dto;

import lombok.Data;

/**
 * @author 周陈
 * @Title: 单团次价格Vo
 * @date 2019/2/26 14:31
 */
@Data
public class SingleTourPriceVo {

    private String id;
    //价格名
    private String policyName;
    //价格类型
    private Integer touristType;
    //单房差
    private double singleRoomPrice;
    //修改后的售价
    private double directPrice;
    //修改前的改价
    private double volunteerDirectPrice;
    //返佣
    private double volunteerRebatePrice;
}
