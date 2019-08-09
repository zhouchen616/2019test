package com.holyrobot.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author 周陈
 * @Title: 外发产品最低价Dto
 * @date 2018/12/4 14:07
 */
@Data
public class ProProductDeparturePriceDto {
    private BigDecimal salesPrice;
    private BigDecimal directPrice;
}
