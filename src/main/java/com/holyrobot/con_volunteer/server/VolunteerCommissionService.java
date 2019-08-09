package com.holyrobot.con_volunteer.server;

import com.alibaba.fastjson.JSONObject;
import com.holyrobot.con_volunteer.pojo.VolunteerCommissionWithdrawDeposit;
import com.holyrobot.response.Response;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName： VolunteerCommissionService
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2019-2-22 11:10
 * @Version: 1.0
 * @Modified By:
 */
public interface VolunteerCommissionService {

    Response getVolCommInfo(String orgId, String userId);

    Response getCommAccountInfo(JSONObject param);

    Response submitCommApp(VolunteerCommissionWithdrawDeposit volunteerCommissionWithdrawDeposit);

    Response commRecord(JSONObject param);

    Response extractRecord(JSONObject param);

    Response adjustmentAmt(String orderId);

    Response getOrderLog(String orderId);

    Response updateAmt(JSONObject params, HttpServletRequest request);

}
