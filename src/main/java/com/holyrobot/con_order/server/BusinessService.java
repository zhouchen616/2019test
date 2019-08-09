package com.holyrobot.con_order.server;

import com.holyrobot.dto.OrderInfoViewDto;
import com.holyrobot.dto.OrderInfoViewVo;
import com.holyrobot.dto.WxUser;
import com.holyrobot.response.Response;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * @ClassName： BusinessService
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2018-12-20 16:40
 * @Version: 1.0
 * @Modified By:
 */
public interface BusinessService {

//    取消订单
    Response cancelOrderInfo(String orderId, Integer hasTraffic);

//    插入订单的大交通信息
    void addOrderTraffic(Integer hasTraffic, String tourid, String ordid, HttpServletRequest request, int userType, WxUser wxUser);

//    通过机场三字码获得机场中文全名
    String getAirPort(String airPort);

//    出团通知书
    List<OrderInfoViewVo> getOrderList(List<OrderInfoViewDto> orderInfo);

//    生成订单号
    String getOrderNumber(Date date);

//    生成志愿者订单号
    String getVolOrderNumber(Date date);

    void addOrdInfoFile(String orgId, String orderId, String proId);

}
