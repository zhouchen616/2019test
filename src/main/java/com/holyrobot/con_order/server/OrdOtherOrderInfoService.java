package com.holyrobot.con_order.server;

import com.alibaba.fastjson.JSONObject;
import com.holyrobot.con_product.pojo.ProOtherProduct;
import com.holyrobot.response.Response;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 周陈
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/10/1720:38
 */
public interface OrdOtherOrderInfoService {

    Response addOrdOtherOrderInfo(JSONObject params, HttpServletRequest request);

    ProOtherProduct finProOtherProduct(String id);
}
