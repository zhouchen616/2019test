package com.holyrobot.con_volunteer.server;

import com.alibaba.fastjson.JSONObject;
import com.holyrobot.response.Response;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @ClassName： VolunteerUnbindingService
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2019-2-28 16:24
 * @Version: 1.0
 * @Modified By:
 */
public interface VolunteerUnbindingService {

    Response submitUnbindApp(@RequestBody JSONObject param);

    Response getUnbindInfo(String orgId, String userId);

    Response getUnbindStatus(String orgId, String userId);

    Response cancelUnbinding(String orgId, String userId);

}
