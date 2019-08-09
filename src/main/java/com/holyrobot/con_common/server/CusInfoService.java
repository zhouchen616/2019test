package com.holyrobot.con_common.server;

import com.holyrobot.con_common.pojo.*;

import java.util.List;

/**
 * @author 周陈
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/6/289:52
 */
public interface CusInfoService {

    /**
    　　* @Description: 查询所有CusTag
    　　* @author 周陈
    　　* @date 2018/7/16 19:14
    　　*/
    List<CusTag> findAllTag();

    /**
     * 　　* @Description: 保存定制游需求
     * 　　* @author 周陈
     * 　　* @date 2018/6/28 10:18
     *
     */
    void saveCusInfo(CusCusinfo cusInfo);

    /**
     * 　　* @Description: 保存定制游选择的服务类型
     * 　　* @author 周陈
     * 　　* @date 2018/6/28 10:16
     *
     */
    void saveCustServiceType(CusCusInfoServiceType serviceType);

    /**
     * 　　* @Description: 保存定制游选择的目的地
     * 　　* @author 周陈
     * 　　* @date 2018/6/28 10:15
     *
     */
    void saveCusDest(CusCusInfoDest dest);

    /**
     * @return
     * @Description 查询所有的服务列表
     * @author 汤玉林
     * @date 2018年4月27日 下午7:49:15
     * @action selectServiceList
     */
    List<CusService> selectServiceList();
    /**
    　　* @Description: 提交定制游订单
    　　* @author 周陈
    　　* @date 2018/6/28 10:19
    　　*/
    int saveCus(CusCusinfo cusCusInfo);

}
