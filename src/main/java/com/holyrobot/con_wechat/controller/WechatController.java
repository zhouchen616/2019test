package com.holyrobot.con_wechat.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.holyrobot.con_mongo.server.MongoService;
import com.holyrobot.con_om.mapper.OmConfigDetailMapper;
import com.holyrobot.con_om.pojo.OmOrgWechatConf;
import com.holyrobot.con_order.server.OrgInfoService;
import com.holyrobot.con_volunteer.mapper.VolunteerApplicationMapper;
import com.holyrobot.con_volunteer.pojo.VolunteerApplication;
import com.holyrobot.con_volunteer.pojo.VolunteerApplicationExample;
import com.holyrobot.con_wechat.pojo.WechatJsSdkConfig;
import com.holyrobot.con_wechat.server.WechatService;
import com.holyrobot.con_wechat.server.WxService;
import com.holyrobot.constant.Constants;
import com.holyrobot.dto.*;
import com.holyrobot.dto.mongo.H5ShopUserLoginInfo;
import com.holyrobot.dto.mongo.H5ShopUserSkinCollection;
import com.holyrobot.response.Response;
import com.holyrobot.util.HttpResponse;
import com.holyrobot.util.HttpUtils;
import com.holyrobot.util.StringUtil;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.common.util.crypto.SHA1;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.result.WxMpOAuth2AccessToken;
import me.chanjar.weixin.mp.bean.result.WxMpUser;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpStatus;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 周陈
 * @Title: 微信授权Controller
 * @date 2018/5/22 16:32
 */
@Controller
@RequestMapping("/wechat")
@Slf4j
@Api(tags = "微信授权")
public class WechatController {

    private static RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(5000).setConnectTimeout(5000).build();

    private static CloseableHttpClient httpclient;

    private static String TOKEN = "holyrobot";

    @Value("${qrcodeUrl}")
    private String qrcodeUrl;
    @Value("${devStatus}")
    private String devStatus;
    @Value("${createMenuUrl}")
    private String createMenuUrl;
    @Value("${h5Url}")
    private String h5Url;
    //    @Value("${wechat.appid}")
//    private String appid;
//    @Value("${wechat.secret}")
//    private String secret;
//    @Value("${wechat.encodingAesKey}")
//    private String encodingAesKey;
    @Value("${airPortUrl.userAccountID}")
    private String userAccountID;
    @Value("${airPortUrl.ExistWeChatOpenID}")
    private String ExistWeChatOpenID;

    /**
     * 用户缓存token的键
     */
    @Value("${user_session_key}")
    public String user_session_key;
    /**
     * session过期时间
     */
    @Value("${session_expire_time}")
    public int session_expire_time;
    @Autowired
    private WxMpService wxMpService;
    @Autowired
    private WxService wxService;
    @Autowired
    private OrgInfoService orgInfoService;
    @Autowired
    private MongoService mongoService;
    @Autowired
    private WechatService wechatService;
    @Autowired
    private VolunteerApplicationMapper volunteerApplicationMapper;
    @Autowired
    private OmConfigDetailMapper omConfigDetailMapper;

    @GetMapping("/updateH5ShopUserSkin")
    @ResponseBody
    public Response updateH5ShopUserSkin(String userId, String openId, Integer skinType) {
        log.info("进入用户皮肤切换接口/updateH5ShopUserSkin，参数userId={},openId={},skinType={}", userId, openId, skinType);
        mongoService.updateH5ShopUserSkin(userId, openId, skinType);
        return new Response().success();
    }

    /**
     * 获取微信js-sdk 配置参数
     *
     * @param request
     * @return
     */
    @GetMapping(value = "/getSdkConfig")
    @ResponseBody
    public Response getSdkConfig(String url, String orgId, HttpServletRequest request) {
        //生成10位时间戳
        long timeStampSec = System.currentTimeMillis() / 1000;
        String timestamp = String.format("%010d", timeStampSec);
        //随机字符串
        String noncestr = StringUtil.getNonce();
        //获取accessTkone
//        String accessToken = wxService.getAccessToken();
        OmOrgWechatConf wechatConfByOrgId;
        String accessToken;
        boolean isPay = url.contains("/Pay/PayApi/");
        if (isPay) {
            //支付页面获取SdkConfig，不用传参
            accessToken = wechatService.getAccessToken(orgId);
            wechatConfByOrgId = wechatService.findWechatConfByOrgId(orgId);
        } else {
            //正常逻辑，需要传参
            accessToken = wechatService.getAccessToken(orgId, 1);
            wechatConfByOrgId = wechatService.findWechatConfByOrgId(orgId, 1);
        }
        HttpResponse httpResponse = HttpUtils.httpClientGet(
                String.format("https://api.weixin.qq.com/cgi-bin/ticket/getticket?access_token=%s&type=jsapi", accessToken));
        log.debug("获取jsapi_ticket=", httpResponse.getData());
        JSONObject jsonObject = JSON.parseObject(httpResponse.getData());
        //jsapi_ticket
        String jsapi_ticket = jsonObject.getString("ticket");
        //url
        StringBuffer sb = new StringBuffer();
        sb.append("jsapi_ticket=").append(jsapi_ticket).append("&")
                .append("noncestr=").append(noncestr).append("&")
                .append("timestamp=").append(timestamp).append("&")
                .append("url=").append(url);
        log.info("SHA1加密前参数{}", sb.toString());
        // SHA1加密
        String signature = SHA1.gen(sb.toString());
        log.info("查询微信配置={}", JSON.toJSONString(wechatConfByOrgId));
        WechatJsSdkConfig config = new WechatJsSdkConfig();
        config.setAppid(wechatConfByOrgId.getWxappid());
        config.setNonceStr(noncestr);
        config.setTimestamp(timeStampSec);
        config.setSignature(signature);
        log.debug("js-sdk返回参数：{}", config.toString());
        return new Response().success(config);
    }

    /**
     * 配置微信公众平台时，微信校验Token接口
     *
     * @param signature
     * @param timestamp
     * @param nonce
     * @return
     * @throws Exception
     */
    @GetMapping(value = "/wx")
    @ResponseBody
    public void getTicket(String signature, String timestamp, String nonce, String echostr, HttpServletResponse response) throws Exception {
        log.info("微信校验Token");
        log.info("signature: " + signature + " timestamp:" + timestamp + " nonce:" + nonce);
        String[] str = {TOKEN, timestamp, nonce};
        // 字典序排序
        Arrays.sort(str);
        String bigStr = str[0] + str[1] + str[2];
        // SHA1加密
        String digest = SHA1.gen(bigStr);
        log.info("SHA1加密={},signature={}", digest, signature);
        log.info("SHA1.genWithAmple(bigStr)={}", SHA1.genWithAmple(bigStr));
        // 确认请求来至微信
        if (digest.equals(signature)) {
            response.getWriter().print(echostr);
        }
    }


    /**
     * 直客 访问这个时便会发起微信的网页授权
     *
     * @return
     */
    @GetMapping("/auth")
    @ResponseBody
    public String auth(String url, String orgId) {
        log.info("进入直客授权url获取接口，orgId={},url={}", orgId, url);
        //设置授权地址
//        String redirectUrl = wxMpService.oauth2buildAuthorizationUrl(url, WxConsts.OAUTH2_SCOPE_USER_INFO, null);
        String redirectUrl = wechatService.getWxMpService(orgId, 1).oauth2buildAuthorizationUrl(url, WxConsts.OAUTH2_SCOPE_USER_INFO, null);
        return redirectUrl;
    }


    /**
     * ERP 访问这个时便会发起微信的网页授权
     *
     * @return
     */
    @GetMapping("/erpAuthorize")
    @ResponseBody
    public String erpAuthorize(String userId, String orgId) {
        log.info("进入erp授权url获取接口，orgId={},userId={}", orgId, userId);
        //设置授权地址
//        String redirectUrl = wxMpService.oauth2buildAuthorizationUrl(h5Url + "#/login", WxConsts.OAUTH2_SCOPE_USER_INFO, StringUtil.uuidToStr(userId));
        String redirectUrl = wechatService.getWxMpService(orgId, 1).oauth2buildAuthorizationUrl(h5Url + "#/login", WxConsts.OAUTH2_SCOPE_USER_INFO, StringUtil.uuidToStr(userId));
        log.info("redirectUrl={}", redirectUrl);
        return redirectUrl;
    }


    /**
     * 直客 访问这个时便会发起微信的网页授权
     *
     * @return
     */
    @GetMapping("/authorize")
    @ResponseBody
    public String authorize(String orgId) {
        log.info("进入直客授权url获取接口，orgId={}", orgId);
        if(orgId==null){
            return "";
        }
        //设置授权地址
//        String redirectUrl = wxMpService.oauth2buildAuthorizationUrl(h5Url + "#/home?orgId=" + orgId, WxConsts.OAUTH2_SCOPE_USER_INFO, null);
        String redirectUrl = wechatService.getWxMpService(orgId, 1).oauth2buildAuthorizationUrl(h5Url + "#/home?orgId=" + orgId, WxConsts.OAUTH2_SCOPE_USER_INFO, null);
        log.info("redirectUrl={}", redirectUrl);
        return redirectUrl;
    }

    /**
     * 跳转页面授权url
     *
     * @return
     */
    @GetMapping("/jumpAuthorize")
    @ResponseBody
    public String jumpAuthorize(String orgId) {
        log.info("跳转页面授权url获取接口，orgId={}", orgId);
        if(orgId==null){
            return "";
        }
        //设置授权地址
//        String redirectUrl = wxMpService.oauth2buildAuthorizationUrl(h5Url + "#/jump?orgId=" + orgId + "&status=3&userId=", WxConsts.OAUTH2_SCOPE_USER_INFO, null);
        String redirectUrl = wechatService.getWxMpService(orgId, 1).oauth2buildAuthorizationUrl(h5Url + "#/jump?orgId=" + orgId + "&status=3&userId=", WxConsts.OAUTH2_SCOPE_USER_INFO, null);
        log.info("redirectUrl={}", redirectUrl);
        return redirectUrl;
    }

    /**
     * 活动页面授权url
     *
     * @return
     */
    @GetMapping("/couponAuthorize")
    @ResponseBody
    public String couponAuthorize(String orgId) {
        log.info("活动页面授权url获取接口，orgId={}", orgId);
        if(orgId==null){
            return "";
        }
        //设置授权地址
//        String redirectUrl = wxMpService.oauth2buildAuthorizationUrl(h5Url + "#/coupon?orgId=" + orgId, WxConsts.OAUTH2_SCOPE_USER_INFO, null);
        String redirectUrl = wechatService.getWxMpService(orgId, 1).oauth2buildAuthorizationUrl(h5Url + "#/coupon?orgId=" + orgId, WxConsts.OAUTH2_SCOPE_USER_INFO, null);
        log.info("redirectUrl={}", redirectUrl);
        return redirectUrl;
    }


    /**
     * 进入 详情页授权
     *
     * @param url
     * @return
     */
    @GetMapping("/detailAuthorize")
    @ResponseBody
    public String detailAuthorize(String url, String orgId) {
        log.info("进入详情页授权url获取接口，url={},orgId={}", url, orgId);
        if(orgId==null){
            return "";
        }
        //设置授权地址
//        String redirectUrl = wxMpService.oauth2buildAuthorizationUrl(url, WxConsts.OAUTH2_SCOPE_USER_INFO, null);
        String redirectUrl = wechatService.getWxMpService(orgId, 1).oauth2buildAuthorizationUrl(url, WxConsts.OAUTH2_SCOPE_USER_INFO, null);
        log.info("redirectUrl={}", redirectUrl);
        return redirectUrl;
    }

    /**
     * 商铺列表授权 暂未使用！
     *
     * @return
     */
    @GetMapping("/storeListAuth")
    @ResponseBody
    public String storeListAuth() {
        //设置授权地址
        String redirectUrl = wxMpService.oauth2buildAuthorizationUrl(h5Url + "#/search-store", WxConsts.OAUTH2_SCOPE_USER_INFO, null);
        log.info("redirectUrl={}", redirectUrl);
        return redirectUrl;
    }


    /**
     * erp 微信回调时访问的地址
     *
     * @return
     */
    @GetMapping("/erpUserInfo")
    @ResponseBody
    public Response erpUserInfo(@RequestParam("userId") String userId, @RequestParam("orgId") String orgId) {
        log.info("进入获取erp用户信息接口，userId={},orgId={}", userId, orgId);
        //获取 部门信息
        ErpUserAndOrgInfoDto erpUser = orgInfoService.getErpUser(userId);
        //erp用户信息
        ErpUserDto erpUserDto = erpUser.getErpUserDto();
        //添加用户旅行社名称
        erpUserDto.setTravelAgencyName(erpUser.getOrgInfo().getTravelAgencyName());
        ErpUser erpUserInfo = orgInfoService.getErpUserInfo(erpUserDto.getID());
        erpUserDto.setTravelName(erpUserInfo.getTravelName());
        return new Response().success(new ErpWxUserDto(erpUserDto, null));
    }


    @GetMapping("/userInfo")
    @ResponseBody
    public Response userInfo(@RequestParam("code") String code, @RequestParam("orgId") String orgId, HttpServletRequest request) {
        log.info("进入获取直客用户信息接口 code={},orgId={}", code, orgId);
        WxMpOAuth2AccessToken wxMpOAuth2AccessToken = new WxMpOAuth2AccessToken();
        WxMpUser wxMpUser = new WxMpUser();
        H5ShopUserLoginInfo h5ShopUserLoginInfo = new H5ShopUserLoginInfo();
        ErpWxUserDto erpWxUserDto;
        h5ShopUserLoginInfo.setOrgId(orgId);
        try {
            wxMpOAuth2AccessToken = wechatService.getWxMpService(orgId, 1).oauth2getAccessToken(code);
            log.debug("token：wxMpOAuth2AccessToken={}", wxMpOAuth2AccessToken);
            wxMpUser = wechatService.getWxMpService(orgId, 1).oauth2getUserInfo(wxMpOAuth2AccessToken, null);
            log.info("用户信息：wxMpUser={}", wxMpUser);
        } catch (WxErrorException e) {
            e.printStackTrace();
            return new Response().failure("code已使用");
        }
        h5ShopUserLoginInfo.setWxMpUser(wxMpUser);
        //用户微信信息
        WxUser wxUser = new WxUser(wxMpUser);
//        orgInfoService.isUser(wxUser);
        orgInfoService.newIsUser(wxUser, orgId);
        H5ShopUserSkinCollection h5ShopUserSkin = mongoService.findH5ShopUserSkin(wxUser.getUserId());
        if (h5ShopUserSkin != null) {
            wxUser.setSkinType(h5ShopUserSkin.getSkinType());
        }
        request.getSession().setAttribute("wxUserInfo", wxUser);
        ErpUserDto erpUserDto = null;
        if (wxUser.getUserType() == 1) {
            ErpUser erpUserInfo = orgInfoService.getErpUserInfo(wxUser.getUserId());

            //获取 部门信息
            ErpUserAndOrgInfoDto erpUser = orgInfoService.getErpUser(wxUser.getUserId());
            //erp用户信息
            erpUserDto = erpUser.getErpUserDto();
            erpUserDto.setBusinessType(erpUserInfo.getBusinessType());
            erpUserDto.setIsInitiativeSales(erpUserInfo.getIsInitiativeSales());
            //添加用户旅行社名称
            erpUserDto.setTravelAgencyName(erpUser.getOrgInfo().getTravelAgencyName());
            erpUserDto.setTravelName(erpUserInfo.getTravelName());
            request.getSession().setAttribute("erpUserInfo", erpUserInfo);
        }
        log.info("cookie:wxUserInfo{}", request.getSession().getAttribute("wxUserInfo"));
        log.info("cookie:erpUserInfo{}", request.getSession().getAttribute("erpUserInfo"));
        request.getSession().setMaxInactiveInterval(Constants.session_expire_time);
        //处理批发商逻辑
        OrgInfoExtensionDto orgInfo = orgInfoService.getOrgInfo(orgId);
        //组团社，走正常流程
        if (orgInfo!=null && orgInfo.getIsOpenOnlineShop() == 1 && orgInfo.getBusinessTypes().equals("ZTS")
                && (wxUser.getUserType() == 1 || (wxUser.getUserType() == 2 && wxUser.getMobile() != null))) {
            erpWxUserDto = new ErpWxUserDto(erpUserDto, wxUser);
            h5ShopUserLoginInfo.setErpWxUser(erpWxUserDto);
            mongoService.add(h5ShopUserLoginInfo);
            log.info("用户授权接口，组团社，走正常流程user={}",JSON.toJSONString(erpWxUserDto));
            return new Response().success(erpWxUserDto, 1);
        }

        String url = "";
        if (orgInfo.getIsOpenOnlineShop() == 0 || orgInfo.getBusinessTypes().contains("DJS")) {
            log.info("用户授权接口，未开通店铺");
            //未开通店铺
            url = h5Url + "#/blank?orgId=" + orgId;
        } else if (orgInfo.getBusinessTypes().contains("PFS")) {
            //开通了店铺的批发商、限制C端
            //login-jump  C端去到登录跳转
            if(wxUser.getUserType() == 2){
                log.info("用户授权接口，C端用户访问批发商");
                //判断批发商是允许C端查看，1允许；0.不允许
                Integer isAllowVisitorSeeShop = omConfigDetailMapper.selectIsAllowVisitorSeeShopValue(orgId);
                if(isAllowVisitorSeeShop !=null && isAllowVisitorSeeShop == 1){
                    wxUser.setIsAllowVisitorSeeShop(1);
                    erpWxUserDto = new ErpWxUserDto(erpUserDto, wxUser);
                    h5ShopUserLoginInfo.setErpWxUser(erpWxUserDto);
                    mongoService.add(h5ShopUserLoginInfo);
                    log.info("用户授权接口，C端用户访问批发商,批发商允许C端游客访问，走正常流程user={}",JSON.toJSONString(erpWxUserDto));
                    return new Response().success(erpWxUserDto, 1);
                }
                url = h5Url + "#/login-list?url=" + h5Url + "#/home?orgId=" + orgId;
            }else {
                log.info("用户授权接口，B端用户访问批发商");
                erpWxUserDto = new ErpWxUserDto(erpUserDto, wxUser);
                h5ShopUserLoginInfo.setErpWxUser(erpWxUserDto);
                mongoService.add(h5ShopUserLoginInfo);
                return new Response().success(erpWxUserDto, 1);
            }
        }else {
            log.info("用户授权接口，游客未登录、访问组团社");
            erpWxUserDto = new ErpWxUserDto(erpUserDto, wxUser);
            h5ShopUserLoginInfo.setErpWxUser(erpWxUserDto);
            mongoService.add(h5ShopUserLoginInfo);
            return new Response().success(erpWxUserDto, -2);
        }
        //授权跳转URL
        wxUser.setUrl(url);
        erpWxUserDto = new ErpWxUserDto(erpUserDto, wxUser);
        h5ShopUserLoginInfo.setErpWxUser(erpWxUserDto);
        mongoService.add(h5ShopUserLoginInfo);
        return new Response().success(erpWxUserDto, -1);
    }

    /**
     　　* @Description: 开发环境用户登录
     　　* @author 周陈
     　　* @date 2019/4/8 11:33
     　　*/
    @GetMapping("/devLogin")
    @ResponseBody
    public Response devLogin(String mobile, String userId, HttpServletRequest request){
        WxUser wxUser = new WxUser();
        wxUser.setUserId(userId);
        wxUser.setMobile(mobile);
        wxUser.setUserType(2);
        wxUser.setNewUserType(4);
        wxUser.setOpenId("ojwmI1L71O0DM_qrEoXNMjGF4poU");
        ErpWxUserDto erpWxUserDto = new ErpWxUserDto();
        //查询志愿者申请信息
        VolunteerApplicationExample example = new VolunteerApplicationExample();
        example.or().andUseridEqualTo(userId).andDatastatusIn(Arrays.asList(0, 1, 2, 5));
        List<VolunteerApplication> volunteerApplications = volunteerApplicationMapper.selectByExample(example);
        if (volunteerApplications != null && volunteerApplications.size() > 0) {
            wxUser.setVolunteerApplication(volunteerApplications.get(0));

            log.info("用户登录授权查询志愿者信息={}", JSON.toJSONString(volunteerApplications));
        }
        erpWxUserDto.setWxUser(wxUser);
        request.getSession().setAttribute("wxUserInfo", wxUser);
        return new Response().success(erpWxUserDto, -1);
    }


    /*@GetMapping("/userInfo1")
    @ResponseBody
    public Response userInfo1(@RequestParam("code") String code, HttpServletRequest request) {
        log.info("进入获取直客用户信息接口 code={}", code);
        WxMpOAuth2AccessToken wxMpOAuth2AccessToken = new WxMpOAuth2AccessToken();
        WxMpUser wxMpUser = new WxMpUser();
        try {
            wxMpOAuth2AccessToken = wxMpService.oauth2getAccessToken(code);
            log.debug("token：wxMpOAuth2AccessToken={}", wxMpOAuth2AccessToken);
            wxMpUser = wxMpService.oauth2getUserInfo(wxMpOAuth2AccessToken, null);
            log.debug("用户信息：wxMpUser={}", wxMpUser);
        } catch (WxErrorException e) {
            e.printStackTrace();
        }
        //用户微信信息
        WxUser wxUser = new WxUser(wxMpUser);
        orgInfoService.isUser(wxUser);
        H5ShopUserSkinCollection h5ShopUserSkin = mongoService.findH5ShopUserSkin(wxUser.getUserId());
        if (h5ShopUserSkin != null) {
            wxUser.setSkinType(h5ShopUserSkin.getSkinType());
        }
        request.getSession().setAttribute("wxUserInfo", wxUser);
        ErpUserDto erpUserDto = null;
        if (wxUser.getUserType() == 1) {
            ErpUser erpUserInfo = orgInfoService.getErpUserInfo(wxUser.getUserId());
            //获取 部门信息
            ErpUserAndOrgInfoDto erpUser = orgInfoService.getErpUser(wxUser.getUserId());
            //erp用户信息
            erpUserDto = erpUser.getErpUserDto();
            //添加用户旅行社名称
            erpUserDto.setTravelAgencyName(erpUser.getOrgInfo().getTravelAgencyName());
            erpUserDto.setTravelName(erpUserInfo.getTravelName());
            request.getSession().setAttribute("erpUserInfo", erpUserInfo);
        }
        log.info("cookie:wxUserInfo{}", request.getSession().getAttribute("wxUserInfo"));
        log.info("cookie:erpUserInfo{}", request.getSession().getAttribute("erpUserInfo"));
        request.getSession().setMaxInactiveInterval(Constants.session_expire_time);
        return new Response().success(wxUser);
//        return new Response().success(new ErpWxUserDto(erpUserDto, wxUser));
    }*/

    /**
     * 　　* @Description: 刷新B端登录后的用户信息
     * 　　* @author 周陈
     * 　　* @date 2018/12/28 0:38
     */
    @GetMapping("/refreshUserInfo")
    @ResponseBody
    public Response refreshUserInfo(HttpServletRequest request, String userId) {
        WxUser wxUserInfo = (WxUser) request.getSession().getAttribute("wxUserInfo");
        if(wxUserInfo == null){
            wxUserInfo = new WxUser();
        }
        wxUserInfo.setUserType(1);
        wxUserInfo.setUserId(userId);
        ErpUser erpUserInfo = orgInfoService.getErpUserInfo(userId);
        request.getSession().setAttribute("erpUserInfo", erpUserInfo);
        request.getSession().setAttribute("wxUserInfo", wxUserInfo);
        return new Response().success(erpUserInfo);
    }

    /*@GetMapping("/userInfo")
    @ResponseBody
    public Response userInfo(@RequestParam("code") String code, HttpServletRequest request) {
        WxUser wxUser = new WxUser();
        wxUser.setUserType(1);
        wxUser.setOpenId("111");
      return new Response().success(wxUser);
    }*/

    /**
     * 创建自定义菜单
     * 开发文档（https://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1421141013）
     *
     * @param name
     * @return
     */
    @GetMapping("/createMenu")
    @ResponseBody
    public Response createMenu(String name, String orgId) {
        //name赋默认值
        if (StringUtils.isEmpty(name)) {
            name = "H5商城首页";
        }
        String indexUrl = "http://h5.aipinzan.net/#/home?orgId=" + orgId;
        //indexUrl赋默认值
        if (StringUtils.isEmpty(orgId)) {
            indexUrl = "http://h5.aipinzan.net/#/home?orgId=C94C21D6-4C6D-4A80-BD19-5341E7014D47";
        }
        log.info("name={},indexUrl={}", name, indexUrl);
        String result = "";
        try {
            //accessToken
            //String accessToken = wxService.getAccessToken();
            String accessToken = wechatService.getWxMpService(orgId, 1).getAccessToken();
            log.info("accessToken:{}", accessToken);
            //封装自定义菜单
            JSONObject subJson = new JSONObject();
            subJson.put("type", "view");
            subJson.put("name", name);
            subJson.put("url", indexUrl);
            JSONArray button = new JSONArray();
            button.add(subJson);
            JSONObject menu = new JSONObject();
            menu.put("button", button);
            log.info("menu:{}", menu.toJSONString());
            //发送请求
            HttpPost createMenuHttp = new HttpPost(createMenuUrl + accessToken);
            createMenuHttp.setEntity(new StringEntity(menu.toJSONString(), ContentType.APPLICATION_JSON));
            createMenuHttp.setConfig(requestConfig);
            httpclient = HttpClients.createDefault();
            CloseableHttpResponse httpResp = httpclient.execute(createMenuHttp);
            int statusCode = httpResp.getStatusLine().getStatusCode();
            // 判断是够请求成功
            if (statusCode == HttpStatus.SC_OK) {
                log.info("状态码:" + statusCode);
                log.info("请求成功!");
                // 获取返回的数据
                result = EntityUtils.toString(httpResp.getEntity(), "UTF-8");
                log.info("创建自定义菜单返回值：{}", result);
            } else {
                log.error("状态码:" + httpResp.getStatusLine().getStatusCode());
                log.error("HttpPost方式请求失败!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Response().success(result);
    }

    /**
     * 创建自定义菜单
     * 开发文档（https://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1421141013）
     *
     * @return
     */
    @PostMapping("/createMenus")
    @ResponseBody
    public Response createMenus(@RequestBody JSONObject menus) {
        log.info("创建自定义菜单：menus={}", menus);
        String result = "";
        try {
            String accessToken = wxMpService.getAccessToken();
            log.info("accessToken:{}", accessToken);
            //发送请求
            HttpPost createMenuHttp = new HttpPost(createMenuUrl + accessToken);
            createMenuHttp.setEntity(new StringEntity(menus.toJSONString(), ContentType.APPLICATION_JSON));
            createMenuHttp.setConfig(requestConfig);
            httpclient = HttpClients.createDefault();
            CloseableHttpResponse httpResp = httpclient.execute(createMenuHttp);
            int statusCode = httpResp.getStatusLine().getStatusCode();
            // 判断是够请求成功
            if (statusCode == HttpStatus.SC_OK) {
                log.info("状态码:" + statusCode);
                log.info("请求成功!");
                // 获取返回的数据
                result = EntityUtils.toString(httpResp.getEntity(), "UTF-8");
                log.info("创建自定义菜单返回值：{}", result);
            } else {
                log.error("状态码:" + httpResp.getStatusLine().getStatusCode());
                log.error("HttpPost方式请求失败!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Response().success(result);
    }


    /**
     * 　　* @Description: 获取accessToken
     * 　　* @author 周陈
     * 　　* @date 2018/7/3 14:52
     */
    @RequestMapping("/accessToken")
    @ResponseBody
    public String getTOKEN() {
        String accessToken = wxService.getAccessToken();
        return accessToken;
    }

    /**
     * 　　* @Description: 创建微信二维码
     * 　　* @author 周陈
     * 　　* @date 2018/7/3 14:51
     */
    @RequestMapping("/getWxQrCode")
    @ResponseBody
    public String getWxQrCode(String userId) {
        String result = "";
        log.info("进入获取二维码接口userId={}", userId);
        String accessToken = wxService.getAccessToken();
        log.info("accessToken={}", accessToken);
        qrcodeUrl = qrcodeUrl.replace(TOKEN, accessToken);
        try {
            //需要提交的JSON数据
            Map<String, String> intMap = new HashMap<>();
            intMap.put("scene_str", "http://h5erptest.holy-robot.net/custom/getServcieType");
            Map<String, Map<String, String>> mapMap = new HashMap<>();
            mapMap.put("scene", intMap);
            Map<String, Object> paramsMap = new HashMap<>();
            paramsMap.put("expire_seconds", 7200);
            paramsMap.put("action_name", "QR_STR_SCENE");
            paramsMap.put("action_info", mapMap);
            String data = JSON.toJSONString(paramsMap);
            HttpPost createMenuHttp = new HttpPost(qrcodeUrl);
            createMenuHttp.setEntity(new StringEntity(data, ContentType.APPLICATION_JSON));
            createMenuHttp.setConfig(requestConfig);
            httpclient = HttpClients.createDefault();
            CloseableHttpResponse httpResp = httpclient.execute(createMenuHttp);
            int statusCode = httpResp.getStatusLine().getStatusCode();
            // 判断是够请求成功
            if (statusCode == HttpStatus.SC_OK) {
                log.info("状态码:" + statusCode);
                log.info("请求成功!");
                // 获取返回的数据
                result = EntityUtils.toString(httpResp.getEntity(), "UTF-8");
                log.info("创建二维码返回值：{}", result);
            } else {
                log.error("状态码:" + httpResp.getStatusLine().getStatusCode());
                log.error("HttpPost方式请求失败!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 　　* @Description: 获取ERP个人中心二维码图片
     * 　　* @author 周陈
     * 　　* @date 2018/7/5 11:04
     */
//    @RequestMapping("/getQrCode")
//    @ResponseBody
//    public String getQrCode(String userID) {
//        return wxService.getQrCode(userID);
//    }

    /**
     * 　　* @Description: 获取ERP个人中心绑定H5商城URL
     * 　　* @author 周陈
     * 　　* @date 2018/7/5 11:04
     */
    @RequestMapping("/getQrCode")
    @ResponseBody
    public String getQrCode(String userID) {
        return wxService.getQrCode(userID);
    }

    /**
     * 　　* @Description: 获取h5商店 二维码
     * 　　* @author 周陈
     * 　　* @date 2018/8/11 12:39
     */
    @RequestMapping("/getH5Shop")
    @ResponseBody
    public String getH5Shop(String orgId) {
        return wxService.getH5Shop(orgId);
    }

    /**
     * 　　* @Description: 获取活动优惠券二维码
     * 　　* @author 周陈
     * 　　* @date 2018/10/18 21:13
     */
    @RequestMapping("/getCoupon")
    @ResponseBody
    public String getCoupon(String orgId) {
        return wxService.getCoupon(orgId);
    }

    /**
     * 　　* @Description: 绑定用户信息
     * 　　* @author 周陈
     * 　　* @date 2018/7/5 11:04
     */
    @PostMapping("/bindUser")
    @ResponseBody
    public String bindUser(@RequestBody ErpUserAcctDto erpUserAcctDto) {
        log.info("进入绑定用户信息data={}", erpUserAcctDto.toString());
        String rspo = orgInfoService.bindUser(erpUserAcctDto);
        return rspo;
    }

    /**
     * 　　* @Description: 扫二维码 页面跳转接口
     * 　　* @author 周陈
     * 　　* @date 2018/10/12 14:03
     */
    @RequestMapping("/jump")
    @ResponseBody
    public Response jump(HttpServletRequest request, String orgId, String userId, int status, String orderId, Integer userType) {
        log.info("扫二维码 页面跳转接口参数orgId={},userId={},status={},orderId={},userType={}", orgId, userId, status, orderId, userId);
        Response url = wxService.jump(request, orgId, userId, status, orderId, userType);
        return new Response().success(url);
    }

    /**
     * ERP 访问这个时便会发起微信的网页授权
     *
     * @return
     */
    @GetMapping("/testCode")
    @ResponseBody
    public String test(String orgId) {
        log.info("进入授权接口：orgId={}", orgId);
        //设置授权地址
        String redirectUrl = wechatService.getWxMpService(orgId, 1).oauth2buildAuthorizationUrl(h5Url + ":9091/wechat/getCode", WxConsts.OAUTH2_SCOPE_USER_INFO, null);
        log.info("redirectUrl={}", redirectUrl);
        return redirectUrl;
    }

    /**
     * ERP 访问这个时便会发起微信的网页授权
     *
     * @return
     */
    @GetMapping("/getCode")
    @ResponseBody
    public String getCode(@RequestParam("code") String code, @RequestParam("state") String state) {
        log.info("进入授权接口：userId:{}");
        return "code=" + code + "state=" + state;
    }

    public static void main(String[] args) {
        //生成10位时间戳
        long timeStampSec = System.currentTimeMillis() / 1000;
        String timestamp = "1414587457";
        //随机字符串
        String noncestr = "Wm3WZYTPz0wzccnW";
        //jsapi_ticket
        String jsapi_ticket = "sM4AOVdWfPE4DxkXGEs8VMCPGGVi4C3VM0P37wVUCFvkVAy_90u5h9nbSlYy3-Sl-HhTdfl2fzFy1AOcHKP7qg";
        //url
        String url = "http://mp.weixin.qq.com?params=value";
        StringBuffer sb = new StringBuffer();
        sb.append("jsapi_ticket=").append(jsapi_ticket).append("&")
                .append("noncestr=").append(noncestr).append("&")
                .append("timestamp=").append(timestamp).append("&")
                .append("url=").append(url);
        // SHA1加密
        String signature = SHA1.gen(sb.toString());
        System.out.println(signature);
    }

}
