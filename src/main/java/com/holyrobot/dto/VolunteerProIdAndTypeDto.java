package com.holyrobot.dto;

import lombok.Data;

/**
 * @author 周陈
 * @Title: 志愿者产品的ID和产品类型Dto
 * @date 2019/2/20 14:51
 */
@Data
public class VolunteerProIdAndTypeDto {
    //产品ID
    private String id;
    //志愿者产品表主键Id
    private String volunteerProductD;
    //外发产品的 发放ID
    private String directSalesSendId;
    //产品类型 0：普通产品   1：外发产品
    private Integer proStatus;
}
