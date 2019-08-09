package com.holyrobot.con_order.server;


import com.alibaba.fastjson.JSONObject;
import com.holyrobot.bo.ModifyProductBo;
import com.holyrobot.con_order.pojo.OrdOrderTourist;
import com.holyrobot.con_order.pojo.OrdOrderinfo;
import com.holyrobot.con_order.pojo.OrderDataStatusVo;
import com.holyrobot.con_product.pojo.ProProduct;
import com.holyrobot.dto.OrderInfoViewDto;
import com.holyrobot.response.Response;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface OrdOrderInfoService {

    Response addOrderInfo(JSONObject params, HttpServletRequest request);

    ProProduct selectById(String id);

    ModifyProductBo selectByIdWitchChoice(String proId);

    List<OrderInfoViewDto> getOrder(String dataStatus, String condition, String createId, int startPage, int size);

    List<OrderInfoViewDto> getNewOrder(String dataStatus, String condition, String createId,
                                       String orgId, String userId, int startPage, int size, int userType);

    List<OrderInfoViewDto> getOrderByName(String condition, String createId, int startPage, int size);

    int updateOrderStatus(String orderId);

    Response validatePrice(JSONObject params, HttpServletRequest request);

    List<OrdOrderinfo> getOrderByTourId(String tourId);

    OrderInfoViewDto getOrderInfoForPay(String orderId);
    /**
     　　* @Description: 线下支付申请接口【凭证支付】
     　　* @author 周陈
     　　* @date 2019/4/10 9:26
     　　*/
    Response postPayment(JSONObject params, HttpServletRequest request);
    /**
    　　* @Description: 账期支付
    　　* @author 周陈
    　　* @date 2018/12/26 11:24
    　　*/
    Response billPayments(JSONObject params, HttpServletRequest request);

    OrdOrderinfo selectByOrderId(String orderId);

    List<OrdOrderTourist> selectTouristByOrderId(String orderId);

    Response validateDetail(JSONObject param, HttpServletRequest request);

    Response validateTotalPrice(JSONObject params, HttpServletRequest request);

    int getStock(String tourId);

    int updateDataStatusAndIsCreditPayById(OrdOrderinfo ordOrderInfo);

    List<OrderDataStatusVo> getOrderNumByDataStatus(String userId, Integer shopType, String condition, String orgId);

    List<OrderDataStatusVo> erpUserGetOrderNumByDataStatus(String userId, String condition);

    OrdOrderinfo selectByIdOfAll(String orderId);

    /**
     　　* @Description: 门店下单时需要将总店Id设置到订单表的ParentOrgID字段
     　　* @author 周陈
     　　* @date 2019/4/9 15:08
     　　*/
    void setOrderInfoParentOrgID(OrdOrderinfo orderinfo);

}
