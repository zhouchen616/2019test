package com.holyrobot.con_wechat.server.impl;



import com.holyrobot.con_om.mapper.OmOrgWechatConfMapper;
import com.holyrobot.con_om.pojo.OmOrgWechatConf;
import com.holyrobot.con_om.pojo.OmOrgWechatConfExample;
import com.holyrobot.con_wechat.server.WechatService;
import com.holyrobot.config.RedisClient;
import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpInMemoryConfigStorage;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @author 周陈
 * @Title: 微信开发相关服务接口
 * @date 2018/11/10 10:30
 */
@Service
@Slf4j
public class WechatServiceImpl implements WechatService {
    @Autowired
    private OmOrgWechatConfMapper omOrgWechatConfMapper;
    @Autowired
    private RedisClient redisClient;
    @Value("${jjkjOrgId}")
    private String jjkjOrgId;

    @Override
    public OmOrgWechatConf findWechatConfByOrgId(String orgId, Integer... type) {
        OmOrgWechatConfExample example = new OmOrgWechatConfExample();
        if (type.length == 0) {
            //type没有传参表示支付授权相关配置查询
            example.or().andOrgidEqualTo(orgId);
        } else {
            //type传参 表示授权配置查询，没有配置去竞界科技公众号配置。
            example.or().andOrgidIn(Arrays.asList(orgId, jjkjOrgId));
            //根据orgID排序，如果该店铺有配置则会在第一条（因为竞界科技的orgId=000000）
            // 如果没有配置，则会返回竞界科技的配置
            example.setOrderByClause("OrgID desc");
        }
        List<OmOrgWechatConf> omOrgWechatConfs = omOrgWechatConfMapper.selectByExample(example);
        if (omOrgWechatConfs != null & omOrgWechatConfs.size() > 0) {
            return omOrgWechatConfs.get(0);
        }
        return null;
    }

    @Override
    public WxMpService getWxMpService(String orgId, Integer... type) {
        //创建WxMpService实例并设置appid和sectret
        //这样写可以实现每一家店铺都可以独立使用自己的微信公众号相关配置，而不是交给spring管理只会生成一套配置，难免会出错。
        WxMpService wxMpService = new WxMpServiceImpl();
        //通过orgId查询微信配置
        OmOrgWechatConf wechatConfByOrgId = this.findWechatConfByOrgId(orgId, type);
        WxMpInMemoryConfigStorage wxConfigProvider = new WxMpInMemoryConfigStorage();
        wxConfigProvider.setAppId(wechatConfByOrgId.getWxappid());
        wxConfigProvider.setSecret(wechatConfByOrgId.getWxappsecret());
        ////这里的设置方式是跟着这个sdk的文档写的
        wxMpService.setWxMpConfigStorage(wxConfigProvider);
        return wxMpService;
    }

    /**
     * 　　* @Description: 获取对应org店铺微信公众号的accessToken，并存入redis
     * 　　* @author 周陈
     * 　　* @date 2018/6/30 15:32
     */
    @Override
    public String getAccessToken(String orgId, Integer... type) {
        String token = "";

        try {
//            if (true) {
//                return this.getWxMpService(orgId, type).getAccessToken();
//            }

            //从redis取出token
            //先判断当前店铺有没有提交微信公众号配置
            OmOrgWechatConf wechatConfByOrgId = this.findWechatConfByOrgId(orgId, type);
            String tokenKey = "";
            if (orgId.equals(wechatConfByOrgId.getOrgid())) {
                //提供了微信公众号配置，取自己orgID对应下的token
                tokenKey = "SpecialH5Shop-accessTokenKey-" + orgId;
//                token = redisClient.get("SpecialH5Shop-accessTokenKey-" + orgId);
            } else {
                //未提供了微信公众号配置，取竞界科技orgID对应下的token
                tokenKey = "SpecialH5Shop-accessTokenKey-" + jjkjOrgId;
//                token = redisClient.get("SpecialH5Shop-accessTokenKey-" + jjkjOrgId);
            }
            token = redisClient.get(tokenKey);
            if (StringUtils.isEmpty(token)) {
                token = this.getWxMpService(orgId, type).getAccessToken();
                //存值逻辑和取值逻辑一致
                redisClient.set(tokenKey, token, 3600);
            }
        } catch (WxErrorException e) {
            e.printStackTrace();
        }
        return token;
    }

}
