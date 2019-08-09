package com.holyrobot.con_volunteer.server;

import com.holyrobot.con_volunteer.pojo.VolunteerAddressInformation;
import com.holyrobot.response.Response;

/**
 * @ClassName： VolunteerAddressInformationService
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2019-3-11 15:45
 * @Version: 1.0
 * @Modified By:
 */
public interface VolunteerAddressInformationService {

//    添加地址信息
    Response addInfo(VolunteerAddressInformation volunteerAddressInformation);

//    查询所有地址信息
    Response getAddInfo(String userId);

//    更新地址信息
    Response updateAddInfo(VolunteerAddressInformation volunteerAddressInformation);

//    设置删除地址信息
    Response delAddInfo(String id);
}
