package com.holyrobot.con_product.server;

import com.holyrobot.con_product.pojo.ProProductTraffic;

import java.util.List;

/**
 * @Author: 周相儒
 * @Description: 大交通接口
 * @CreateDate: 2018/5/15 10:48
 * @Version: 1.0
 */
public interface ProProductTrafficService {

    List<ProProductTraffic> selectByProId(String id);

}
