package com.holyrobot.dto;

import lombok.Data;

import java.util.List;

/**
 * @author 周陈
 * @Title: 志愿者产品上架接口请求参数
 * @date 2019/2/21 16:29
 */
@Data
public class ShelfProductVO {
    private List<VolunteerProIdAndTypeDto> proIds;
    private String orgId;
    private String orgName;
    private String userId;
    private String shopName;
    private String siteId;
    //调整类型，1.百分比；2.固定金额
    private Integer discountTypeC;
    //调整金额,如：1.百分之十，传入0.1；2.固定金额，100；
    private Double preValueC;
    //调整类型，1.加价；2.减价
//    private Integer regulation;
    //上架类型，1.直接上架；2.价格统一调整上架
    private Integer type;
    //1.志愿者的产品
    private Integer proType;
    //1.B端、2.C端
    private Integer userType;

}
