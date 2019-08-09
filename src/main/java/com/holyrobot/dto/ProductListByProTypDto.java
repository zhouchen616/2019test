package com.holyrobot.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 周陈
 * @Title: 首页产品根据产品类型展示实体
 * @date 2018/12/3 21:13
 */
public class ProductListByProTypDto {
    private List<String> proType ;
    private List<List<ProductListDto>> proProducts=new ArrayList<>();

    public ProductListByProTypDto() {
        List<String> p = new ArrayList<>();
        p.add("跟团游");
        p.add("自由行");
        setProType(p);
    }

    public List<String> getProType() {
        return proType;
    }

    public void setProType(List<String> proType) {
        this.proType = proType;
    }

    public List<List<ProductListDto>> getProProducts() {
        return proProducts;
    }

    public void setProProducts(List<List<ProductListDto>> proProducts) {
        this.proProducts = proProducts;
    }
}
