package com.holyrobot.con_common.server;

import com.holyrobot.con_common.pojo.CommNationality;

import java.util.List;

/**
 * @ClassName： CommNationalityService
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2018-12-24 16:24
 * @Version: 1.0
 * @Modified By:
 */
public interface CommNationalityService {

    String getNationalityId(String nationalityName);

    List<CommNationality> getAllNationality();

    List<CommNationality> getSearchNationality(String sth);

}
