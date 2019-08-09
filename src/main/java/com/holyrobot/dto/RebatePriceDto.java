package com.holyrobot.dto;

import lombok.Data;

/**
 * @author 周陈
 * @Title: 志愿者返佣最低价Dto
 * @date 2019/2/26 11:11
 */
@Data
public class RebatePriceDto {
    //固定金额
    private Double price;
    //百分比
    private Double pricePercent;

    public RebatePriceDto(Double price, Double pricePercent) {
        this.price = price;
        this.pricePercent = pricePercent;
    }

    public RebatePriceDto() {
    }
}
