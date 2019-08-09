package com.holyrobot.dto;

import lombok.Data;

import java.util.List;

/**
 * @author 周陈
 * @Title: 单团次修改
 * @date 2019/2/26 14:27
 */
@Data
public class SingleTourUpdateVo {
    //产品类型 0：普通产品   1：外发产品
    private Integer isOutgoing;
    //产品id
    private String proId;
    //发送方ID
    private String directSalesSendId;
    //授权方orgId
    private String orgId;
    private String orgName;
    //店铺名称
    private String shopName;
    //用户ID
    private String userId;
    //站点Id
    private String siteId;
    //站点名称
    private String siteName;
    //团期ID
    private String tourId;
    //用户类型，1B端，2C端
    private Integer userType;

    private List<SingleTourPriceVo> singleTourPrices;

    private Integer proType;



}
