package com.holyrobot.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author 周陈
 * @Title: 产品详情价格Dto
 * @date 2018/12/4 17:37
 */
@Data
public class ProductDetailPriceDto {
    private BigDecimal nowPrice;
    private BigDecimal oldPrice;

    public ProductDetailPriceDto() {
    }

    public ProductDetailPriceDto(BigDecimal nowPrice, BigDecimal oldPrice) {
        this.nowPrice = nowPrice;
        this.oldPrice = oldPrice;
    }
}
