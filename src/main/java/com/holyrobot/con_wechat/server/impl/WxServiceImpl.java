package com.holyrobot.con_wechat.server.impl;

import com.alibaba.fastjson.JSON;
import com.holyrobot.con_order.mapper.OrdOrderinfoMapper;
import com.holyrobot.con_order.pojo.OrdOrderinfo;
import com.holyrobot.con_order.server.OrgInfoService;
import com.holyrobot.con_volunteer.mapper.VolunteerApplicationMapper;
import com.holyrobot.con_volunteer.pojo.VolunteerApplication;
import com.holyrobot.con_volunteer.pojo.VolunteerApplicationExample;
import com.holyrobot.con_wechat.server.WechatService;
import com.holyrobot.con_wechat.server.WxService;
import com.holyrobot.config.RedisClient;
import com.holyrobot.dto.ErpUser;
import com.holyrobot.dto.ErpUserDto;
import com.holyrobot.dto.OrgInfoExtensionDto;
import com.holyrobot.dto.WxUser;
import com.holyrobot.response.Response;
import com.holyrobot.util.HttpResponse;
import com.holyrobot.util.HttpUtils;
import com.holyrobot.util.qrcode.QRCodeUtil;
import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.WxMpTemplateMsgService;
import me.chanjar.weixin.mp.bean.template.WxMpTemplateData;
import me.chanjar.weixin.mp.bean.template.WxMpTemplateMessage;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 周陈
 * @Title: 微信service
 * @date 2018/6/30 15:31
 */
@Service
@Slf4j
public class WxServiceImpl implements WxService {
    @Value("${accessToken_key}")
    private String accessTokenKey;
    @Value("${imgUrl}")
    private String imgUrl;
    @Value("${imgPath}")
    private String imgPath;
    @Value("${airPortUrl.userAccountID}")
    private String userAccountID;
    @Value("${h5Url}")
    private String h5Url;
    @Value("${airPortUrl.userInfoURL}")
    private String userInfoURL;
    @Value("${airPortUrl.ExistWeChatOpenID}")
    private String ExistWeChatOpenID;
    @Autowired
    private WxMpService wxMpService;
    @Autowired
    private RedisClient redisClient;
    @Autowired
    private OrgInfoService orgInfoService;
    @Autowired
    private OrdOrderinfoMapper ordOrderinfoMapper;
    @Autowired
    private VolunteerApplicationMapper volunteerApplicationMapper;
    @Autowired
    private WechatService wechatService;

    /**
     * 　　* @Description: 获取微信公众号accessToken
     * 　　* @author 周陈
     * 　　* @date 2018/6/30 15:32
     */
    @Override
    public String getAccessToken() {
        log.info("accessTokenKey={}", accessTokenKey);
        String token = "";
        try {
            //从redis取出token
            token = redisClient.get(accessTokenKey);
            if (StringUtils.isEmpty(token)) {
                token = wxMpService.getAccessToken();
                redisClient.set(accessTokenKey, token, 7200);
            }
        } catch (WxErrorException e) {
            e.printStackTrace();
        }
        return token;
    }

    /**
     * 　　* @Description: 二维码生成接口
     * 　　* @author 周陈
     * 　　* @date 2018/7/5 11:06
     *
     */
    //@Override
//    public String getQrCode1(String userID) {
//        //访问api获取用户信息
//        HttpResponse httpResponse = HttpUtils.httpClientGet(userInfoURL + userID);
//        log.info("用户信息={}", httpResponse.getData());
//        ErpUser erpUserDto = JSON.toJavaObject(JSON.parseObject(httpResponse.getData()), ErpUser.class);
//        String openId = erpUserDto.getWeChatOpenID_H5Shop();
//        //二维码包含的 url
//        String url;
//        //图片名
//        String imgName;
//        //真实路径
//        if (StringUtils.isEmpty(openId)) {
//            //去绑定
//            url = h5Url + "#/login?userId=" + userID;
//            log.info("url:{}", url);
//            imgName = erpUserDto.getUserID() + "_h5shop_qrcode_bind.jpg";
//        } else {
//            //去登录
//            url = h5Url + "#/home?orgId=" + erpUserDto.getOrgID();
//            imgName = erpUserDto.getUserID() + "_h5shop_qrcode.jpg";
//        }
//        log.info("url:{}", url);
//        //判断图片是否存在，不存在则生成
//        if (!new File(imgPath + imgName).exists()) {
//            QRCodeUtil.generateQRImage(url, imgPath, imgName, "jpg");
//        }
//        return imgUrl + imgName;
//    }

    /**
     * 　　* @Description: 获取ERP个人中心绑定H5商城URL
     * 　　* @author 周陈
     * 　　* @date 2018/8/31 10:49
     */
    @Override
    public String getQrCode(String userID) {
        //访问api获取用户信息
        HttpResponse httpResponse = HttpUtils.httpClientGet(userInfoURL + userID);
        log.info("用户信息={}", httpResponse.getData());
        ErpUser erpUserDto = JSON.toJavaObject(JSON.parseObject(httpResponse.getData()), ErpUser.class);
        String openId = erpUserDto.getWeChatOpenID_H5Shop();
        //二维码包含的 url
        String url;
        //真实路径
        if (StringUtils.isEmpty(openId)) {
            //去绑定
            url = h5Url + "#/login?userId=" + userID;
        } else {
            //去登录
            url = h5Url + "#/home?orgId=" + erpUserDto.getOrgID();
        }
        log.info("url:{}", url);
        return url;
    }


    /**
     * 　　* @Description: 通过orgId获取h5商城微店
     * 　　* @author 周陈
     * 　　* @date 2018/8/11 12:47
     */
    public String getH5Shop(String orgId) {
        String imgName = "h5shop_orgId_new_" + orgId + ".jpg";
        //判断该店铺是否有专卖店
        OrgInfoExtensionDto orgInfo = orgInfoService.getOrgInfo(orgId);
        String url = h5Url + "#/jump?orgId=" + orgId + "&status=1&userId=";
        if (!new File(imgPath + imgName).exists()) {
            QRCodeUtil.generateQRImage(url, imgPath, imgName, "jpg");
        }
        return imgUrl + imgName;
    }

    /**
     * 　　* @Description:  扫二维码 页面跳转接口
     * 　　* @author 周陈
     * 　　* @date 2018/10/12 13:47
     */
    @Override
    public Response jump(HttpServletRequest request, String orgId, String userId, int status, String orderId, Integer userType) {
        Response response = new Response();
        //判断该店铺是否有专卖店
        OrgInfoExtensionDto orgInfo = orgInfoService.getOrgInfo(orgId);
        String url = "";
        Map<String, Object> map = new HashMap<>();
        switch (status) {
            case 1:
                //ERP-首页 我的店铺跳转
                if (orgInfo.getIsOpenOnlineShop() == 0||orgInfo.getBusinessTypes().contains("DJS")) {
                    //未开通店铺
                    url = h5Url + "#/blank?orgId=" + orgId;
                } else {
                    //开通了店铺
                    if (userType != null && userType == 2 && orgInfo.getBusinessTypes().contains("PFS")) {
                        //login-jump  C端去到登录跳转
                        url = h5Url + "#/login-list?url=" + h5Url + "#/home?orgId=" + orgId;
                    } else {
                        //B端直接登录
                        url = h5Url + "#/home?orgId=" + orgId;
                    }

                }
                break;
            case 3:
                //活动优惠券扫码跳转
                HttpResponse httpResponse1 = HttpUtils.httpClientGet(ExistWeChatOpenID + userId);
                if (!httpResponse1.getData().equals("null")) {
                    //B端
                    url = h5Url + "#/coupon?orgId=" + orgId;
                } else {
                    //C端
                    url = h5Url + "#/blank-coupon";
                }
                break;
            case 7:
                //订单支付挑战
                OrdOrderinfo ordOrderinfo = ordOrderinfoMapper.selectByPrimaryKey(orderId);
                WxUser wxUserInfo = (WxUser) request.getSession().getAttribute("wxUserInfo");
                log.info("支付扫码跳转，用户信息{}", wxUserInfo);
                url = h5Url + "Pay/PayApi/index1.html?orgId=" + orgId + "&orderId=" + orderId + "&openId=" + wxUserInfo.getOpenId();
                if (wxUserInfo != null && wxUserInfo.getUserType() == 2) {
                    map.put("code", 1);
                    map.put("msg", "您暂未登录，无法直接支付，请登录!");
//                    map.put("url", h5Url + "#/login-accredit?url=" + url);
                    //1：商城采购 2：内部下单  3：手工录单 4：微店erp用户 5：微店直客 6：pc商城B端用户 7：pc商城C端用户
                    if (ordOrderinfo.getCategory() == 4 || ordOrderinfo.getCategory() == 6) {
                        //b端登陆
                        map.put("url", h5Url + "#/login-accredit?url=" + url);
                        return new Response().success(map);
                    } else if (wxUserInfo.getMobile() == null || wxUserInfo.getMobile().equals("")) {
                        //c端登陆
                        map.put("url", h5Url + "#/c-login?url=" + url);
                        return new Response().success(map);
                    }
                }
                log.info("B端支付扫码跳转url={}", url);
                break;
            default:
                //ERP-个人中心绑定
                if (orgInfo.getIsOpenOnlineShop() == 0) {
                    url = h5Url + "#/blank?orgId=" + orgId;
                } else {

                    url = h5Url + "#/login?userId=" + userId + "&orgId=" + orgId;

                   /* //通过userId 判断是否已经绑定
                    HttpResponse httpResponse = HttpUtils.httpClientGet(userInfoURL + userId);
                    log.info("用户信息={}", httpResponse.getData());
                    ErpUser erpUserDto = JSON.toJavaObject(JSON.parseObject(httpResponse.getData()), ErpUser.class);
                    if (erpUserDto.getWeChatOpenID_H5Shop() == null || erpUserDto.getWeChatOpenID_H5Shop().equals("")) {
                        url = h5Url + "#/login?userId=" + userId + "&orgId=" + orgId;
                    } else {
                        url = h5Url + "#/home?orgId=" + orgId;
                    }*/
                }
                break;
        }
        log.info("进入jump跳转接口，跳转url",url );
        map = new HashMap<>();
        map.put("type", 0);
        map.put("url", url);
        return response.success(map);
    }


    /**
      * 功能描述：旅行家生成二维码
      * @auther: 何晓波
      * @date: 2019/4/9
      **/
    @Override
    public Response getTralverQrCode(String orgId, String parentId, String travelAgencyName, String wechatInviter) {

        String imgName = "h5traler_new_" +orgId+parentId + ".jpg";
        //判断该店铺是否有专卖店
//       OrgInfoExtensionDto orgInfo = orgInfoService.getOrgInfo(orgId);
//        VolunteerApplicationExample exam = new VolunteerApplicationExample();
//        exam.or().andUseridEqualTo(parentId).andOrgidEqualTo(orgId);
//        List<VolunteerApplication> volunteerApplications = volunteerApplicationMapper.selectByExample(exam);
//        if (volunteerApplications!=null&&volunteerApplications.size()!=0){
//            travelAgencyName = volunteerApplications.get(0).getTacontact();
//        }
        String url = h5Url + "#/jump?apply=1&orgId=" + orgId +"&parentId="+parentId+"&travelAgencyName="+travelAgencyName+"&status=4&wechatInviter="+wechatInviter;
        QRCodeUtil.generateQRImage(url, imgPath, imgName, "jpg");
        String result = imgUrl + imgName;
        HashMap<String,Object> map = new HashMap<String,Object>();
        map.put("url",result);
        return new Response().success(map);
    }

    @Override
    public String getCoupon(String orgId) {
        String imgName = "h5shop_coupon_" + "1_" + orgId + ".jpg";
        String url = h5Url + "#/jump?orgId=" + orgId + "&status=3&userId=";
        if (!new File(imgPath + imgName).exists()) {
            QRCodeUtil.generateQRImage(url, imgPath, imgName, "jpg");
        }
        return imgUrl + imgName;
    }

     /**
      * 功能描述：旅行者页面跳转
      * @auther: 何晓波
      * @date: 2019/4/15
      **/
    @Override
    public Response jumpTraveller(String orgId, String userId, String parentId, String travelAgencyName, String wechatInviter, String apply) {
       String url ="";
        //查询志愿者表
        VolunteerApplicationExample example = new VolunteerApplicationExample();
        example.or().andUseridEqualTo(userId).andOrgidEqualTo(orgId);
        List<VolunteerApplication> volunteerApplications = volunteerApplicationMapper.selectByExample(example);
        if(volunteerApplications!=null && volunteerApplications.size()>0) {
            VolunteerApplication volunteerApplication = volunteerApplications.get(0);
            int res = volunteerApplication.getDatastatus().intValue();
            if (res == 3 || res == 4 ||res==10) {     //跳转到重新申请
                url = h5Url + "#/apply-traveller?apply=1&orgId=" + orgId + "&parentId=" + parentId + "&travelAgencyName=" + travelAgencyName + "&wechatInviter=" + wechatInviter+"&userId="+userId;
            } else if(res==0||res == 8){                //申请中跳转
                url = h5Url +"#/applying-travller?urlRoute="+ "#/home?orgId=" + orgId + "&shopUserId=" + userId + "&shopType=1"+"&travelAgencyName="+travelAgencyName+"&wechatInviter="+wechatInviter+"&userId="+userId;
            }else {                  //跳转到首页
                url = h5Url + "#/home?orgId=" + orgId + "&shopUserId=" + userId + "&shopType=1";
            }
        }else{
            url = h5Url + "#/apply-traveller?apply=1&orgId=" + orgId +"&parentId="+parentId+"&travelAgencyName="+travelAgencyName+"&wechatInviter="+wechatInviter+"&userId="+userId;
        }
         HashMap<String,Object> map = new HashMap<String,Object>();
          map.put("type", 0);
          map.put("url", url);
         return new Response().success(map);
    }

    @Override
    public void wxMpTemplateMessage(String orgId,String openId,String orderId) {
        OrdOrderinfo ordOrderinfo = ordOrderinfoMapper.selectByPrimaryKey(orderId);
        WxMpService wxMpService = wechatService.getWxMpService(orgId, 1);
        WxMpTemplateMsgService templateMsgService = wxMpService.getTemplateMsgService();
        WxMpTemplateMessage wxMpTemplateMessage = WxMpTemplateMessage.builder()
                .toUser(openId)
                .templateId("ZtyifRWvsrc9o0NnZwoYB8v3iCE58hzvdgwpfMEVVRs")
                .url(h5Url+"#/order-details/"+orderId)
                .build();
//        {{first.DATA}}
//
//        订单编号：{{orderId.DATA}}
//        订单金额：{{orderPrice.DATA}}
//        订单状态：{{orderStatus.DATA}}
//        产品名称：{{productName.DATA}}
//        {{remark.DATA}}
/*        订单编号：030335353
        订单金额：￥224
        订单状态：支付完成
        产品名称：马尔代夫10日游
        如有疑问，请拨打咨询热线123323。
        详情链接*/
        wxMpTemplateMessage.addWxMpTemplateData(new WxMpTemplateData("first","尊敬的用户，您的订单提交成功。"));
        wxMpTemplateMessage.addWxMpTemplateData(new WxMpTemplateData("orderId",ordOrderinfo.getOrderno()));
        wxMpTemplateMessage.addWxMpTemplateData(new WxMpTemplateData("orderPrice",ordOrderinfo.getPayableamt().toString()));
        wxMpTemplateMessage.addWxMpTemplateData(new WxMpTemplateData("orderStatus","待确认"));
        wxMpTemplateMessage.addWxMpTemplateData(new WxMpTemplateData("productName",ordOrderinfo.getOrdername()));
        wxMpTemplateMessage.addWxMpTemplateData(new WxMpTemplateData("remark","如有疑问，请拨打咨询热线021-62243865。"));
        try {
            String s = templateMsgService.sendTemplateMsg(wxMpTemplateMessage);
            log.info("发送模板消息返回={}", s);
        } catch (WxErrorException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        HttpResponse httpResponse = HttpUtils.httpClientGet("http://www.mrlizhongxin.com:8766/api/UserIdentification/GetUserInfo?userID=4212788a-8c32-4958-9f3b-3bd9d222b5ee");
        ErpUserDto erpUserDto = JSON.toJavaObject(JSON.parseObject(httpResponse.getData()), ErpUserDto.class);
        System.out.println(erpUserDto);
    }
}
