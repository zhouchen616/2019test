package com.holyrobot.con_volunteer.server;

import com.alibaba.fastjson.JSONObject;
import com.holyrobot.con_volunteer.pojo.VolunteerApplication;
import com.holyrobot.con_volunteer.pojo.VolunteerShopAutoUpdate;
import com.holyrobot.response.Response;
import org.springframework.web.multipart.MultipartFile;

/**
 * @ClassName： VolunteerApplicationService
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2019-2-20 11:10
 * @Version: 1.0
 * @Modified By:
 */
public interface VolunteerApplicationService {

    Response insertVolInfo(VolunteerApplication volunteerApplication);

    Response judgeUserCard(String userCard);

    Response judgeShopName(String shopName);

    Response notificationSMS(JSONObject param);

    Response uploadUserCard(MultipartFile file);

    Response uploadHeadPortrait(MultipartFile file);

    Response getVolInfo(String orgId, String userId, Integer dataStatus);

    Response updateVolInfo(VolunteerApplication volunteerApplication);

    Response cancelVolApp(String orgId, String userId);

    Response getVolAppStatus(String orgId, String userId, String parentId);

    Response getDenialReason(String orgId, String userId, Integer dataStatus);

    Response getHeadInfo(String orgId, String userId);

    Response setUpAuto(VolunteerShopAutoUpdate volunteerShopAutoUpdate);

    Response getSetUp(String orgId, String userId);

    Response getVolQR(String orgId, String userId, String title);

    Response getErpShopQR(String userId);

    Response getPDFInfo(String orgId);

    Response getContact(String orgId, String userId, String parentId);
}
