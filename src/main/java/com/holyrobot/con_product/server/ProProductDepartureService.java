package com.holyrobot.con_product.server;

import com.alibaba.fastjson.JSONObject;
import com.holyrobot.dto.ProductDetailPriceDto;
import com.holyrobot.con_product.pojo.ProProductDirectSales;
import com.holyrobot.response.Response;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 周陈
 * @Title: 外发产品服务类
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/12/413:52
 */
public interface ProProductDepartureService {
    /**
    　　* @Description: 查询外发产品详情，现价
    　　* @author 周陈
    　　* @date 2018/12/4 17:36
    　　*/
    ProductDetailPriceDto findDeparturePrice(String proId, String siteId, Integer userType, String orgId);

    //Response getProductPriceList(String proId,String tourDate,String siteId,String tourId);

    /**
     　　* @Description: 外发产品团期查询
     　　* @author 周陈
     　　* @date 2018/12/4 21:13
     　　*/
    Response getTourList(String siteId, String proId, String orgId, int userType);
    /**
    　　* @Description: 外发产品价格策略
    　　* @author 周陈
    　　* @date 2018/12/4 21:35
    　　*/
    Response getProductPriceList(String tourDate, String siteId, String tourId, String orgId);

    /**
     * 　　* @Description: 外发产品订单写入
     * 　　* @author 周陈
     * 　　* @date 2018/12/5 19:30
     *
     */
    Response addOrderInfo(JSONObject params, HttpServletRequest request);

    Response validatePrice(JSONObject params, HttpServletRequest request);

    /**
     * 　　* @Description: 外发产品下单逻辑
     * 　　* @author 周陈
     * 　　* @date 2018/12/5 19:30
     *
     */
    Response newAddOrderInfo(JSONObject params, HttpServletRequest request);
    /**
    　　* @Description: 外发产品·价格校验逻辑
    　　* @author 周陈
    　　* @date 2018/12/6 9:13
    　　*/
    Response validateDetail(JSONObject param, HttpServletRequest request);

    Response validateTotalPrice(JSONObject params, HttpServletRequest request);

    /**
     　　* @Description: 多团次查询
     　　* @author 周陈
     　　* @date 2018/12/24 9:56
     　　*/
    Response manyTours(String tourDate, String orgId, String proId, String siteId);

    ProProductDirectSales getProProductDirectSales(String tourId, String proId, String directSalesSendId, String orgId);
}
