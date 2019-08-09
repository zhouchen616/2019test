package com.holyrobot.con_volunteer.server;

import com.holyrobot.con_volunteer.pojo.TravelerRewardWithdrawDeposit;
import com.holyrobot.con_volunteer.pojo.TravelerUnbindingAndFreeze;
import com.holyrobot.con_volunteer.pojo.VolunteerApplication;
import com.holyrobot.response.Response;

/**
 * @Description:
 * @Auther: 何晓波
 * @Date: 2019/4/8 15:25
 */
public interface TravelerProductService {

    Response addTravelerBindMes(TravelerUnbindingAndFreeze param);

    Response getTravelerInfoDown(String orgId, String userId);

    Response getTravelerInfoUp(String orgId, String userId);

    Response addAllowanceReward(TravelerRewardWithdrawDeposit param);

    Response getAllowance(String orgId, String userId);

    Response getAllowanceRecording(String orgId, String userId);

    Response getAllowanceWithReward(String orgId, String userId);

    Response addTravelerAppication(VolunteerApplication param, String parentId);

    Response updateTravelerAppication(String orgId, String userId, String parentId);

    Response getTravelerBindList(String orgId, String userId, String parentId);

    Response toTravellerShop(String orgId, String userId, String parentId);

    Response travellerList(String orgId, String userId);
}
