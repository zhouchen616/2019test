package com.holyrobot.con_om.server;

import com.github.binarywang.wxpay.bean.request.WxPayUnifiedOrderRequest;
import com.holyrobot.con_om.pojo.OmOnlinePayTrace;
import com.holyrobot.con_order.pojo.OrdOrderinfo;
import com.holyrobot.response.Response;

/**
 * @author 周陈
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/11/1712:03
 */
public interface OmOnlinePayTraceService {
    OmOnlinePayTrace findOnlinePayTraceByOutTradeNo(String outTradeNo);

    Response addUnifiedOrder(WxPayUnifiedOrderRequest orderRequest, OrdOrderinfo ordOrderInfo);

    int updateDataStatus(OmOnlinePayTrace omOnlinePayTrace);

    int insterOrdOnlineInfo(OrdOrderinfo ordOrderinfo);
}
