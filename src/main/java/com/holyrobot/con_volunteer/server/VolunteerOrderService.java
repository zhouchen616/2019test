package com.holyrobot.con_volunteer.server;

import com.alibaba.fastjson.JSONObject;
import com.holyrobot.response.Response;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName： VolunteerOrderService
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2019-2-26 11:20
 * @Version: 1.0
 * @Modified By:
 */
public interface VolunteerOrderService {

    Response volunteerAddOrdInfo(JSONObject params, HttpServletRequest request);

//    Response volunteerAddOutOrdInfo(JSONObject params, HttpServletRequest request);
//
//    Response validateTotalPrice(JSONObject params, HttpServletRequest request);
//
//    Response checkCommProducts(JSONObject params, HttpServletRequest request);
}
