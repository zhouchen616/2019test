package com.holyrobot.dto;

import lombok.Data;

/**
 * @author 周陈
 * @Title: 订单模板消息发送消费者dto
 * @date 2019/7/16 10:24
 */
@Data
public class SendOrderTemplateConsumerDto {
    private Integer type;
    private String openId;
    private String orderId;
}
