package com.holyrobot.dto;

/**
 * @author 周陈
 * @Title: 目的地-产品DTO
 * @date 2018/6/26 16:34
 */
public class DestinationProductDto {
    private String destination;
    private EsProProductAndTotal esProProductAndTotal;

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public EsProProductAndTotal getEsProProductAndTotal() {
        return esProProductAndTotal;
    }

    public void setEsProProductAndTotal(EsProProductAndTotal esProProductAndTotal) {
        this.esProProductAndTotal = esProProductAndTotal;
    }
}
