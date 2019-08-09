package com.holyrobot.con_volunteer.server;

import com.alibaba.fastjson.JSONObject;
import com.holyrobot.con_volunteer.pojo.VolunteerProduct;
import com.holyrobot.con_volunteer.pojo.VolunteerProductTour;
import com.holyrobot.con_volunteer.pojo.VolunteerProductTourPrice;
import com.holyrobot.con_volunteer.pojo.VolunteerShopAutoUpdate;
import com.holyrobot.dto.*;
import com.holyrobot.response.Response;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author 周陈
 * @Title: 志愿者产品服务类
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2019/2/2014:14
 */
public interface VolunteerProductService {

    /**
    　　* @Description: 自动更新时，参数封装
    　　* @author 周陈
    　　* @date 2019/3/14 10:35
    　　*/
    ShelfProductVO volunteerShopAutoUpdateToShelfProductVO(VolunteerShopAutoUpdate volunteerShopAutoUpdate);

    /**
     * 　　* @Description: 店铺产品自动跟新时，产品全部上架接口
     * 　　* @author 周陈
     * 　　* @date 2019/3/7 21:06
     */
    Response shopAutoUpdateAddProduct(VolunteerShopAutoUpdate volunteerShopAutoUpdate);


    /**
     * 　　* @Description: 产品直接上架
     * 　　* @author 周陈
     * 　　* @date 2019/2/20 14:33
     */
    Response directShelfProduct(ShelfProductVO directShelfProductVO);

    /**
     * 　　* @Description: 志愿者产品管理-单产品批量调整价格
     * 　　* @author 周陈
     * 　　* @date 2019/3/4 15:54
     */
    Response directShelfProductOfVol(ShelfProductVO directShelfProductVO);

    /**
     * 　　* @Description: 产品货架查询
     * 　　* @author 周陈
     * 　　* @date 2019/2/25 19:41
     */
    Response getGoodsShelfToC(ProSearchCondition proSearchCondition);

    /**
     * 　　* @Description: 批量产品最低返佣查询
     * 　　* @author 周陈
     * 　　* @date 2019/2/25 19:42
     */
    Response minRebate(ShelfProductVO directShelfProductVO);

    /**
     * 　　* @Description: 产品自动更新时，算最低价
     * 　　* @author 周陈
     * 　　* @date 2019/3/14 10:25
     *
     */
    Response minRebateOfAutoUpdate(VolunteerShopAutoUpdate volunteerShopAutoUpdate);

    /**
     * 　　* @Description: 志愿者产品编辑·单产品最小加
     * 　　* @author 周陈
     * 　　* @date 2019/3/4 14:33
     */
    Response minRebateOfVol(ShelfProductVO directShelfProductVO);

    /**
     * 　　* @Description: 单团次价格调整接口
     * 　　* @author 周陈
     * 　　* @date 2019/2/26 14:26
     */
    Response singleTourUpdate(SingleTourUpdateVo singleTourUpdateVo);

    /**
     * 　　* @Description: 志愿者团次价格策略调整
     * 　　* @author 周陈
     * 　　* @date 2019/3/4 15:27
     */
    Response singleTourUpdateOfVol(SingleTourUpdateVo singleTourUpdateVo);

    /**
     * 　　* @Description: 产品查询
     * 　　* @author 周陈
     * 　　* @date 2019/2/26 15:45
     */
    VolunteerProduct findVolProduct(String shopName, String orgName, String orgId, String userId, String proId,
                                    Integer proStatus, String directSalesSendId);

    /**
     * 　　* @Description: 单产品上架
     * 　　* @author 周陈
     * 　　* @date 2019/2/26 17:42
     */
    Response singleProductShelf(SingleTourUpdateVo singleTourUpdateVo);

    /**
     * 　　* @Description: 志愿者产品管理页面
     * 　　* @author 周陈
     * 　　* @date 2019/2/27 9:41
     */
    Response volProductManage(ProSearchCondition proSearchCondition);

    /**
     * 　　* @Description: 志愿者产品状态修改
     * 　　* @author 周陈
     * 　　* @date 2019/2/27 11:26
     */
    Response updateVolProduct(UpdateVolProductVo updateVolProductVo);

    /**
     * 　　* @Description: 志愿者产品有团次、价格更新时点击的请求
     * 　　* @author 周陈
     * 　　* @date 2019/3/9 16:35
     */
    Response updateAutoStatus(String volProId);

    /**
     * 　　* @Description: 志愿者·目的地-产品查询接口
     * 　　* @author 周陈
     * 　　* @date 2019/2/27 16:57
     */
    Response volProductList(ProSearchCondition proSearchCondition);

    /**
     * 　　* @Description: 批量插入团期价格，由于数据库的限制，2100条执行一次插入
     * 　　* @author 周陈
     * 　　* @date 2019/3/2 11:04
     */
    int insertVolunteerProductTourPriceList(List<VolunteerProductTourPrice> volunteerProductTourPrices);

    /**
    　　* @Description: 批量插入团期，由于数据库的限制，2100条执行一次插入
    　　* @author 周陈
    　　* @date 2019/3/21 9:50
    　　*/
    int insertVolunteerProductTourList(List<VolunteerProductTour> volunteerProductTours);

    /**
     * 　　* @Description: 售价统一调整接口
     * 　　* @author 周陈
     * 　　* @date 2019/2/22 14:59
     */
    Response unifiedPriceAdjustment(ShelfProductVO shelfProductVO);

    /**
     * 　　* @Description: 产品详情页的，产品默认价
     * 　　* @author 周陈
     * 　　* @date 2019/2/28 13:46
     */
    ProductDetailPriceDto getProductDetailPriceDto(String userId, String proId, String siteId, Integer proStatus);

    /**
     * 　　* @Description: 志愿者团期查询
     * 　　* @author 周陈
     * 　　* @date 2019/2/28 14:51
     */
    Response getTourList(String siteId, String proId, String orgId, String shopUserId, Integer proStatus);

    /**
     * 　　* @Description: 志愿者价格校验逻辑
     * 　　* @author 周陈
     * 　　* @date 2019/2/28 15:35
     */
    Response validateDetail(JSONObject param, HttpServletRequest request);

    /**
     * 　　* @Description: 志愿者产品价格
     * 　　* @author 周陈
     * 　　* @date 2019/3/2 11:03
     */
    Response getProductPriceList(String tourDate, String siteId, String tourId, String userId, Integer proStatus);

    /**
     * 　　* @Description: 志愿者下单价格校验
     * 　　* @author 周陈
     * 　　* @date 2019/3/2 11:02
     */
    Response validateTotalPrice(JSONObject params, HttpServletRequest request);

    /**
     * 　　* @Description: 志愿者订单查询
     * 　　* @author 周陈
     * 　　* @date 2019/3/2 16:23
     */
    Response getOrderInfo(HttpServletRequest httpServletRequest, JSONObject jsonObject);

    /**
     * 　　* @Description: 多团次查询
     * 　　* @author 周陈
     * 　　* @date 2019/3/8 3:40
     */
    Response manyTours(String tourDate, String orgId, String proId, String siteId, String userId, Integer proStatus);
}
