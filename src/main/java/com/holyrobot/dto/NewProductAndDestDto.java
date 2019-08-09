package com.holyrobot.dto;



import com.holyrobot.repository.comment.EsProProduct;

import java.util.List;

/**
 * @author 周陈
 * @Title: 首页目的地-产品返回实体
 * @date 2018/12/5 14:18
 */
public class NewProductAndDestDto {
    private String destination;
    private List<EsProProduct> productList;

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public List<EsProProduct> getProductList() {
        return productList;
    }

    public void setProductList(List<EsProProduct> productList) {
        this.productList = productList;
    }
}
