package com.holyrobot.con_order.server;

import com.holyrobot.dto.*;
import com.holyrobot.response.Response;

/**
 * @author 周陈
 * @Title: 店铺信息
 * @date 2018/7/2 16:21
 */
public interface OrgInfoService {
    /**
     * 　　* @Description: 获取ERP用户信息
     * 　　* @author 周陈
     * 　　* @date 2018/7/2 20:11
     *
     */
    ErpUserAndOrgInfoDto getErpUser(String userId);

    /**
     * 　　* @Description: 获取店铺信息
     * 　　* @author 周陈
     * 　　* @date 2018/7/2 16:44
     *
     */
    OrgInfoExtensionDto getOrgInfo(String orgId);

    //ErpUserAndOrgInfoDto getErpUser(String userId);

    void  isUser(WxUser wxUser);

    void  newIsUser(WxUser wxUser, String orgId);

    String bindUser(ErpUserAcctDto erpUserAcctDto);

    ErpUser getErpUserInfo(String userId);

    Response getUserBirthAdd(String userId);
    /**
    　　* @Description: 通过判断门店是否配置【总部收】属性，返回总店orgId
    　　* @author 周陈
    　　* @date 2019/4/11 14:35
    　　*/
    boolean getHeadShopOrgIdByOrderManage(String orgId, String supplierId) ;


}
