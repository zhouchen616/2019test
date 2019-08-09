package com.holyrobot.con_volunteer.server;

import com.holyrobot.con_volunteer.pojo.VolunteerProductTour;
import com.holyrobot.response.Response;


/**
 * @ClassName： VolunteerProductTourService
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2019-2-27 16:33
 * @Version: 1.0
 * @Modified By:
 */
public interface VolunteerProductTourService {

    VolunteerProductTour selectByPrimaryKey(String id);

    Response getPriceList(String tourDate, String siteId, String tourId, String orgId);

}
