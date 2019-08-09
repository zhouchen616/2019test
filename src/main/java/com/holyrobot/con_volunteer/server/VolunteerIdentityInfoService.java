package com.holyrobot.con_volunteer.server;

import com.holyrobot.con_volunteer.pojo.VolunteerIdentityInformation;
import com.holyrobot.response.Response;

/**
 * @ClassName： VolunteerIdentityInfoService
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2019-3-11 14:45
 * @Version: 1.0
 * @Modified By:
 */
public interface VolunteerIdentityInfoService {

//    用户证件信息保存接口
    Response save(VolunteerIdentityInformation volunteerIdentityInformation);

//    获得已有证件信息
    Response getInfo(String userId);

//    修改原本信息
    Response updateInfo(VolunteerIdentityInformation volunteerIdentityInformation);

//    删除地址信息
    Response deleteInfo(String id);
}
