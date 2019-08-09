package com.holyrobot.con_order.server.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.holyrobot.con_volunteer.mapper.VolunteerAddressInformationMapper;
import com.holyrobot.con_volunteer.mapper.VolunteerApplicationMapper;
import com.holyrobot.con_volunteer.mapper.VolunteerParentMapper;
import com.holyrobot.con_volunteer.pojo.*;
import com.holyrobot.con_wechat.server.WechatService;
import com.holyrobot.dto.*;
import com.holyrobot.dto.h5user.H5LoginCredentials;
import com.holyrobot.dto.h5user.H5OrgIdAndOpenId;
import com.holyrobot.dto.h5user.H5SaveInfoDto;
import com.holyrobot.dto.h5user.H5UserInfo;
import com.holyrobot.response.Response;
import com.holyrobot.con_order.server.OrgInfoService;
import com.holyrobot.util.HttpResponse;
import com.holyrobot.util.HttpUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author 周陈
 * @Title: 店铺信息Service
 * @date 2018/7/2 16:41
 */
@Service
@Slf4j
public class OrgInfoServiceImpl implements OrgInfoService {
    @Value("${airPortUrl.getOrgInfoUrl}")
    private String getOrgInfoUrl;
    @Value("${airPortUrl.getUserUrl}")
    private String getUserUrl;
    @Value("${airPortUrl.H5_UserLogin}")
    private String H5_UserLogin;
    @Value("${airPortUrl.H5_Save}")
    private String H5_Save;
    @Value("${airPortUrl.NewH5_Save}")
    private String NewH5_Save;
    @Value("${airPortUrl.getNewH5ShopUserId}")
    private String getNewH5ShopUserId;
    @Value("${airPortUrl.BindUserOpenID_H5Shop}")
    private String BindUserOpenID_H5Shop;
    @Value("${airPortUrl.ExistWeChatOpenID}")
    private String ExistWeChatOpenID;
    @Value("${airPortUrl.userInfoURL}")
    private String userInfoURL;
    @Value("${airPortUrl.H5_GetUserInfo}")
    private String H5_GetUserInfo;
    @Value("${airPortUrl.getUserInvitation}")
    private String getUserInvitation; //获得邀请码
    @Value("${airPortUrl.getAdminInfo}")
    private String getAdminInfo; //获得登录账号
    @Value("${airPortUrl.getAcct}")
    private String getAcct;
    @Autowired
    private WechatService wechatService;
    @Autowired
    private VolunteerApplicationMapper volunteerApplicationMapper;
    @Autowired
    private VolunteerParentMapper volunteerParentMapper;
    @Autowired
    private VolunteerAddressInformationMapper volunteerAddressInformationMapper;

    /**
     * 　　* @Description: 获取ERP用户信息
     * 　　* @author 周陈
     * 　　* @date 2018/7/2 20:11
     */
    public ErpUserAndOrgInfoDto getErpUser(String userId) {
        HttpResponse httpResponse = HttpUtils.httpClientGet(getUserUrl + userId);
        ErpUserDto erpUserDto = JSON.toJavaObject(JSON.parseObject(httpResponse.getData()), ErpUserDto.class);

        HttpResponse response = HttpUtils.httpClientGet(getUserInvitation + userId);//获得邀请码
        HttpResponse clientGet = HttpUtils.httpClientGet(getAcct + userId);//获得用户信息

        JSONObject jsonObject = JSON.parseObject(clientGet.getData());
        String acctID = jsonObject.getString("AcctID");//获得用户账号

        OrgInfoExtensionDto orgInfo = getOrgInfo(erpUserDto.getOrgID());
        AccountAndInvitationDto accountAndInvitationDto = new AccountAndInvitationDto();
        accountAndInvitationDto.setUserInvitationCode(response.getData().replaceAll("\"", ""));
        accountAndInvitationDto.setAccountId(acctID);

        return new ErpUserAndOrgInfoDto(erpUserDto, orgInfo, accountAndInvitationDto);
    }

    /**
     * 　　* @Description: 获取店铺信息
     * 　　* @author 周陈
     * 　　* @date 2018/7/2 16:45
     */
    @Override
    public OrgInfoExtensionDto getOrgInfo(String orgId) {
        HttpResponse httpResponse = HttpUtils.httpClientGet(getOrgInfoUrl + orgId);
        log.info("获取店铺信息  返回值：{}", httpResponse.getData());
        OrgInfoExtensionDto orgInfoExtensionDto = JSON.toJavaObject(JSON.parseObject(httpResponse.getData()), OrgInfoExtensionDto.class);
        return orgInfoExtensionDto;
    }

    @Override
    public void isUser(WxUser wxUser) {
        //是否 为ERP用户
        HttpResponse httpResponse1 = HttpUtils.httpClientGet(ExistWeChatOpenID + wxUser.getOpenId());
        log.info("ERP用户={}", httpResponse1.getData());
        if (!httpResponse1.getData().equals("null")) {
            //是ERP用户 已注册
            JSONObject jsonObject = JSON.parseObject(httpResponse1.getData());
            wxUser.setUserId(jsonObject.getString("UserID"));
//            wxUser.setUserId("4212788A-8C32-4958-9F3B-3BD9D222B5EE");
            wxUser.setUserType(1);
            return;
        }
        //是否 直客
        HttpResponse httpResponse = HttpUtils.httpClientGet(String.format(H5_UserLogin, "2", wxUser.getOpenId()));
        log.info("直客用户={}", httpResponse.getData());
        if (!httpResponse.getData().equals("null")) {
            //是直客 已注册
            JSONObject jsonObject = JSON.parseObject(httpResponse.getData());
            wxUser.setUserId(jsonObject.getString("U_Id"));
            //通过U_ID 查询直客详细
            HttpResponse getH5UserInfo = HttpUtils.httpClientGet(H5_GetUserInfo + jsonObject.getString("U_Id"));
            log.info("通过U_ID={},获取用户信息：{}", jsonObject.getString("U_Id"), getH5UserInfo.getData());
            if (!getH5UserInfo.getData().equals("null")) {
                JSONObject jsonObject1 = JSON.parseObject(getH5UserInfo.getData());
                log.info("手机号：{}", jsonObject1.getString("Mobile"));
                wxUser.setMobile(jsonObject1.getString("Mobile"));
            }
        } else {
            //直客注册 执行注册
            String uuid = UUID.randomUUID().toString();
            H5UserInfo h5UserInfo = new H5UserInfo(uuid, wxUser.getNickname());
            H5LoginCredentials h5LoginCredentials = new H5LoginCredentials(uuid, wxUser.getOpenId());
            H5UserDto h5UserDto = new H5UserDto(h5UserInfo, h5LoginCredentials);
            String s = HttpUtils.jsonPost(H5_Save, JSON.toJSONString(h5UserDto));
            log.info("保存直客信息：{}", s);
            wxUser.setUserId(uuid);
        }

    }

    /**
     * 　　* @Description: h5用户授权登录逻辑处理
     * 　　* @author 周陈
     * 　　* @date 2019/1/16 20:00
     */
    @Override
    public void newIsUser(WxUser wxUser, String orgId) {
        log.info("进入用户类型判断方法····");
/*        //首先判断店铺是否提交微信公众号配置
        OmOrgWechatConf wechatConfByOrgId = wechatService.findWechatConfByOrgId(orgId,1);
        if(!orgId.equals(wechatConfByOrgId.getOrgid())){
            log.info("当前店铺未配置微信公众号相关配置orgId={}",orgId );
            orgId=wechatConfByOrgId.getOrgid();
        }*/
        Map<String, String> map = new HashMap<>();
        map.put("Accept", "application/json");
        //是否 为ERP用户
        HttpResponse userInfo = HttpUtils.newPost(getNewH5ShopUserId + "?OrgID=" + orgId + "&OpenID=" + wxUser.getOpenId(), map);
        log.info("请求API接口getNewH5ShopUserId返回={}", userInfo.getData());
        JSONObject userInfoJson = JSON.parseObject(userInfo.getData());
        Integer resultCode = userInfoJson.getInteger("ResultCode");
        if (resultCode == -1) {
            log.info("游客第一次授权登录userName={}", wxUser.getNickname());
            //第一次进店铺,直客注册 执行注册
            String uuid = UUID.randomUUID().toString();
            H5UserInfo h5UserInfo = new H5UserInfo(uuid, wxUser.getNickname());
            h5UserInfo.setSex(wxUser.getSex().equals("男") ? 0 : 1);
            //中间表赋值
            H5OrgIdAndOpenId h5OrgIdAndOpenId = new H5OrgIdAndOpenId();
            h5OrgIdAndOpenId.setID(UUID.randomUUID().toString());
            h5OrgIdAndOpenId.setUserID(uuid);
            h5OrgIdAndOpenId.setOpenID(wxUser.getOpenId());
            h5OrgIdAndOpenId.setOrgID(orgId);
            h5OrgIdAndOpenId.setType(0);
            H5SaveInfoDto h5UserDto = new H5SaveInfoDto();
            h5UserDto.setH5OrgIdAndOpenId(h5OrgIdAndOpenId);
            h5UserDto.setH5UserInfo(h5UserInfo);
            log.info("保存直客信息，请求参数：{}", JSON.toJSONString(h5UserDto));
            String s = HttpUtils.jsonPost(NewH5_Save, JSON.toJSONString(h5UserDto));
            log.info("保存直客信息返回值NewH5_Save：{}", s);
            wxUser.setUserId(uuid);
            wxUser.setNewUserType(WxUser.USER_TYPE_C_NO_MOBILE_1);
        } else {
            //判断用户类型
            JSONObject result = userInfoJson.getJSONObject("Result");
            Integer type = result.getInteger("Type");
            String userID = result.getString("UserID");
            String orgUserID = result.getString("OrgUserID");
            if (type == 0) {
                //C端用户
                //是直客 已注册
                wxUser.setUserId(userID);
                //通过U_ID 查询直客详细
                HttpResponse getH5UserInfo = HttpUtils.httpClientGet(H5_GetUserInfo + userID);
                log.info("通过U_ID={},获取用户信息：{}", userID, getH5UserInfo.getData());
                if (!getH5UserInfo.getData().equals("null")) {
                    log.info("C端授权登录userName={}", wxUser.getNickname());
                    JSONObject jsonObject1 = JSON.parseObject(getH5UserInfo.getData());
                    log.info("手机号：{}", jsonObject1.getString("Mobile"));
                    wxUser.setMobile(jsonObject1.getString("Mobile"));
                    wxUser.setNewUserType(WxUser.USER_TYPE_C_HAVE_MOBILE_3);
                } else {
                    log.info("游客授权登录userName={}", wxUser.getNickname());
                }
                //查询志愿者申请信息
                VolunteerApplicationExample example = new VolunteerApplicationExample();
                example.or().andUseridEqualTo(userID).andDatastatusIn(Arrays.asList(0, 1, 2, 5));
                List<VolunteerApplication> volunteerApplications = volunteerApplicationMapper.selectByExample(example);
                if (volunteerApplications != null && volunteerApplications.size() > 0) {
                    //添加父id
                    VolunteerParentExample exam1 = new VolunteerParentExample();
                    exam1.or().andOrgidEqualTo(orgId).andChildidEqualTo(userID);
                    List<VolunteerParent> volunteerParents1 = volunteerParentMapper.selectByExample(exam1);
                    if(volunteerParents1!=null&&volunteerParents1.size()>0){
                        volunteerApplications.get(0).setParentId(volunteerParents1.get(0).getParentid());
                    }

                    wxUser.setVolunteerApplication(volunteerApplications.get(0));
                    Integer infostatus = volunteerApplications.get(0).getInfostatus();
                    if(infostatus!=null&&infostatus==1){  //志愿者
                        wxUser.setNewUserType(WxUser.USER_TYPE_V_4);
                    }else{
                        //旅行家
                        VolunteerParentExample exam = new VolunteerParentExample();
                        exam.or().andOrgidEqualTo(orgId).andParentidEqualTo(userID).andParentstatusEqualTo(1);
                        log.info("通过orgId={},获取用户信息：userID={}", orgId, userID);
                        List<VolunteerParent> volunteerParents = volunteerParentMapper.selectByExample(exam);
                        if(volunteerParents!=null&&volunteerParents.size()>0){
                            wxUser.setNewUserType(WxUser.USER_TYPE_T_HAVE_CHILD_6);//有下级
                        }else{
                            wxUser.setNewUserType(WxUser.USER_TYPE_T_NO_CHILD_5);//无下级
                        }
                    }
                    log.info("用户登录授权查询志愿者信息={}", JSON.toJSONString(volunteerApplications));
                }
            } else {
                log.info("B端授权登录userName={}", wxUser.getNickname());
                //B端用户
                wxUser.setUserId(orgUserID);
                wxUser.setUserType(1);
                wxUser.setNewUserType(WxUser.USER_TYPE_B_2);
            }
        }

    }

    /**
     * 　　* @Description: 绑定ERP用户
     * 　　* @author 周陈
     * 　　* @date 2018/7/5 19:21
     */
    @Override
    public String bindUser(ErpUserAcctDto erpUserAcctDto) {
        String msg = HttpUtils.jsonPost(BindUserOpenID_H5Shop, JSON.toJSONString(erpUserAcctDto));
        return msg;
    }

    @Override
    public ErpUser getErpUserInfo(String userId) {
        //设置头部信息、参数、访问的网址
        Map<String, String> maps = new HashMap<>();
        maps.put("Content-Type", "application/x-protobuf");
        //访问api获取用户信息
        HttpResponse httpResponse = HttpUtils.httpClientGet(userInfoURL + userId, maps);
        log.info("ErpUserInfo={}", httpResponse.getData());
        if (httpResponse.getData() == null) {
            return null;
        }
        ErpUser erpUser = JSON.parseObject(httpResponse.getData(), ErpUser.class);
        OrgInfoExtensionDto orgInfo = this.getOrgInfo(erpUser.getOrgID());
        //设置业务类型
        erpUser.setBusinessType(BusinessTypes.getBusinessTypes(orgInfo.getBusinessTypes()));
        //设置是否有分销赚按钮，1有、0无
        if (orgInfo.getIsOpenOnlineShop() == 0) {
            //没有开通微店，直接设置为0
            erpUser.setIsInitiativeSales(0);
        } else {
            //已开通网店，需要判断门店逻辑
            if (orgInfo.getParentID() != null) {
                //当前店铺为门店
                if (orgInfo.getIsSelfServed() == 1 && orgInfo.getIsSupplierVisible() == 1) {
                    //门店，允许自采并且直连才可以进行分销赚，设置为1
                    erpUser.setIsInitiativeSales(1);
                } else {
                    //否则设置为0
                    erpUser.setIsInitiativeSales(0);
                }
            } else {
                //当前店铺非门店，且开通了网店，设置为1
                erpUser.setIsInitiativeSales(1);
            }
        }
        return erpUser;
    }

    public static void main(String[] args) {
//        String url = "http://192.168.0.168:8766//api/H5UserIdentification/H5_UserLogin?loginType=%s&loginIdentifier=%s";
//        String url11 = "http://192.168.0.28:8766//api/User//ExistWeChatOpenID_H5Shop?OpenID=";
        String openUrl = "http://www.mrlizhongxin.com:8766/api/User/ExistWeChatOpenID_H5Shop?OpenID=";
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("OrgID", "8DABDD0B-0DE7-4563-B64F-A5DB31093EAD");
        jsonObject.put("OpenID", "o2DID1amRGnQqYYlKSL8Mlg2K4ec");
//        "application/json"
        String orgId = "8DABDD0B-0DE7-4563-B64F-A5DB31093EAD";
        String openId = "o2DID1amRGnQqYYlKSL8Mlg2K4ec";
        Map<String, String> map = new HashMap<>();
        map.put("Accept", "application/json");
        String str = "http://122.144.131.108:8765/api/H5SpecialShop/getNewH5ShopUserId";
        //是否 为ERP用户
        HttpResponse httpResponse = HttpUtils.newPost(str, map);
        JSONObject userInfoJson = JSON.parseObject(httpResponse.getData());
        Integer resultCode = userInfoJson.getInteger("ResultCode");
        if (resultCode == -1) {
            //第一次进店铺
        } else {
            //判断用户类型
            JSONObject result = userInfoJson.getJSONObject("Result");
            Integer type = result.getInteger("Type");
            if (type == 0) {
                //C端用户

            } else {
                //B端用户

            }
        }

    }


    /**
     * @Description: h5用户我的页面--生日与地址信息
     * @auther: 史迪旻
     * @date: 15:35 2019-3-15
     * @param: [userId]
     * @return: com.holyrobot.response.Response
     */
    @Override
    public Response getUserBirthAdd(String userId) {
        UserAddressAndBirthVo userAddressAndBirthVo = new UserAddressAndBirthVo();

        VolunteerAddressInformationExample example = new VolunteerAddressInformationExample();
        example.or().andUseridEqualTo(userId).andDefaultsEqualTo(1).andIsdeleteEqualTo(0);
        List<VolunteerAddressInformation> volunteerAddressInformations = volunteerAddressInformationMapper.selectByExample(example);
        if (Objects.nonNull(volunteerAddressInformations) && volunteerAddressInformations.size() == 1) {
            VolunteerAddressInformation volunteerAddressInformation = volunteerAddressInformations.get(0);
            userAddressAndBirthVo.setAddress(volunteerAddressInformation.getArea().replace("市辖区", " "));
            log.info("/user/getUserBirthAdd 接口：地址数据获取成功");

        }

        HttpResponse httpResponse = HttpUtils.httpClientGet(H5_GetUserInfo + userId);
        log.info("/user/getUserBirthAdd 接口: H5_GetUserInfo接口 {}", httpResponse.getData());
        if (!httpResponse.getData().equals("null")) {
            JSONObject jsonObject = JSONObject.parseObject(httpResponse.getData());
            Date birthday = jsonObject.getDate("Birthday");
            userAddressAndBirthVo.setBirth(birthday);
            log.info("/user/getUserBirthAdd 接口：生日数据获取成功");

        }

        return new Response().success(userAddressAndBirthVo);
    }

    /**
     * 　　* @Description: 通过判断门店是否配置【总部收】属性，返回总店orgId
     * 　　* @author 周陈
     * 　　* @date 2019/4/11 14:35
     */
    @Override
    public boolean getHeadShopOrgIdByOrderManage(String orgId,String supplierId) {
        if(supplierId == null ){
            return false;
        }
        //获取店铺的全部信息
        OrgInfoExtensionDto orgInfo = this.getOrgInfo(orgId);
        //判断此店铺是否为门店；判断订单的发送方Id是不是总店ID；判断是否开通总店收
        if (orgInfo.getParentID() != null && orgInfo.getParentID().equalsIgnoreCase(supplierId) && orgInfo.getIsShopOrderManage() == 1) {
            //如果配置了总店收款，则返回总店orgId
            return true;
        }
        return false;
    }

}
