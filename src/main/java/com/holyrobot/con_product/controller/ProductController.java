package com.holyrobot.con_product.controller;

import com.alibaba.fastjson.JSON;
import com.holyrobot.con_product.server.ProProductService;
import com.holyrobot.dto.ErpUser;
import com.holyrobot.dto.ProSearchCondition;
import com.holyrobot.dto.WxUser;
import com.holyrobot.response.Response;

import com.holyrobot.util.StringUtil;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

/**
 * @author 周陈
 * @Title: 产品Controller
 * @date 2018/5/15 16:39
 */
@RestController
@RequestMapping("/list")
@Slf4j
@Api(tags="产品模块")
public class ProductController {
    @Autowired
    private ProProductService proProductService;
//    @Autowired
//    private VolunteerProductService volunteerProductService;

    //1.查询 公司名称、电话、微信、客服电话、二维码、log

    //5.带条件搜索Es产品数据
//    @RequestMapping(value = "/productlist")
//    public Response productList(@RequestBody EsSearchCondition esSearch, HttpServletRequest request) {
//        log.info("##########请求参数：{}", esSearch);
//        WxUser wxUserInfo = (WxUser) request.getSession().getAttribute("wxUserInfo");
//        esSearch.setUserType(wxUserInfo.getUserType());
//        EsProProductAndTotal esProProductPage = proProductService.findEsProProductPage(esSearch);
//        return new Response().success(esProProductPage);
//    }

    /**
     * 　　* @Description: 首页促销产品查询
     * 　　* @author 周陈
     * 　　* @date 2018/12/11 14:20
     */
    @PostMapping("/newProductListByPromotion")
    public Response newProductListByPromotion(HttpServletRequest request, @RequestBody ProSearchCondition proSearchCondition) {
        long time1 = System.currentTimeMillis();
        log.info("进入新·首页促销产品查询接口 /list/newProductListByPromotion,参数={}", JSON.toJSONString(proSearchCondition));
        if (!StringUtil.isUUID(proSearchCondition.getOrgId())) {
            return new Response().failure("请求参数有误！请检查orgId");
        }
        if (!StringUtil.isUUID(proSearchCondition.getSiteId())) {
            return new Response().failure("请求参数有误！请检查siteId");
        }
        ErpUser user = (ErpUser) request.getSession().getAttribute("erpUserInfo");
        //设置用户类型，如果没登录则设置为普通游客
        if (Objects.nonNull(user)) {
            proSearchCondition.setUserType(user.getUserType());
        } else {
            proSearchCondition.setUserType(2);
        }
        Response response = proProductService.newProductListByPromotion(proSearchCondition);

        return response;
    }


    /**
     * 　　* @Description: 新·产品列表查询接口
     * 　　* @author 周陈
     * 　　* @date 2018/12/3 14:53
     */
//    @PostMapping("/newProductlist")
//    public Response newProductlist(HttpServletRequest request, @RequestBody ProSearchCondition proSearchCondition) {
//        if (proSearchCondition.getShopType() != null && proSearchCondition.getShopType() == 1) {
//            Response response = volunteerProductService.volProductList(proSearchCondition);
//            return response;
//        }
//        log.info("进入新·产品列表查询接口 /list/newProductlist,参数={}", JSON.toJSONString(proSearchCondition));
//        if (!StringUtil.isUUID(proSearchCondition.getOrgId())) {
//            return new Response().failure("请求参数有误！请检查orgId");
//        }
//        if (!StringUtil.isUUID(proSearchCondition.getSiteId())) {
//            return new Response().failure("请求参数有误！请检查siteId");
//        }
//        WxUser user = (WxUser) request.getSession().getAttribute("wxUserInfo");
//        //设置用户类型，如果没登录则设置为普通游客
//        if (Objects.nonNull(user)) {
//            proSearchCondition.setUserType(user.getUserType());
//        } else {
//            proSearchCondition.setUserType(2);
//        }
//        Response productListDtos = proProductService.newProductlist(proSearchCondition);
//        return productListDtos;
//    }

    /**
     * 　　* @Description: 新·目的地-产品查询接口
     * 　　* @author 周陈
     * 　　* @date 2018/12/5 14:26
     *
     */
    @PostMapping("newProductAndDest")
    public Response newProductAndDest(HttpServletRequest request, @RequestBody ProSearchCondition proSearchCondition) {
        log.info("进入新·目的地-产品查询接口 /list/newProductAndDest,参数={}", JSON.toJSONString(proSearchCondition));
        WxUser user = (WxUser) request.getSession().getAttribute("wxUserInfo");
        //设置用户类型，如果没登录则设置为普通游客
        if (Objects.nonNull(user)) {
            proSearchCondition.setUserType(user.getUserType());
        } else {
            proSearchCondition.setUserType(2);
        }
        Response response = proProductService.newProductAndDest(proSearchCondition);
        return response;
    }
}
