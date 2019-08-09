package com.holyrobot.con_product.server;

import com.holyrobot.con_om.pojo.OmDestination;
import com.holyrobot.con_om.pojo.OmProducttype;
import com.holyrobot.dto.ProSearchCondition;
import com.holyrobot.dto.ProductListDto;
import com.holyrobot.response.Response;

import java.util.List;
import java.util.Map;

/**
 * @author 周陈
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: 商品Service
 * @date 2018/5/814:01
 */
public interface ProProductService {
    /**
     * 分页查询Es数据
     *
     * @return
     */
//    EsProProductAndTotal findEsProProductPage(EsSearchCondition esSearch);

    /**
     * 查询所以产品类型
     *
     * @return
     */
    List<OmProducttype> getProType();

    /**
     * 查询所以线路类型 和 目的地
     *
     * @return
     */
//    Map<String, Object> getRouteType();

    /**
     * 根据线路别名Id查询目的地
     *
     * @param aliasId 线路类型的别名ID
     * @return
     */
    List<OmDestination> getDestinationByAliasId(Integer aliasId, String routeTypeId);

    /**
     * 　　* @Description: 根据目的地查询产品
     * 　　* @author 周陈
     * 　　* @date 2018/6/26 16:14
     */
//    List<DestinationProductDto> getProductByDest(String siteId, String orgId);

    /**
    　　* @Description: 根据出行天数查询目的地
    　　* @author 周陈
    　　* @date 2018/11/29 18:48
    　　*/
    List<Map> getDestinationByTourDays(String orgId, String userId, Integer shopType);

    /**
     * 　　* @Description: 产品列表查询接口
     * 　　* @author 周陈
     * 　　* @date 2018/12/3 14:52
     *
     */
    Response newProductlist(ProSearchCondition proSearchCondition);

    /**
    　　* @Description:
    　　* @author 周陈
    　　* @date 2018/12/5 14:08
    　　*/
    Response newProductAndDest(ProSearchCondition proSearchCondition);
    /**
     　　* @Description: 促销产品查询
     　　* @author 周陈
     　　* @date 2018/12/11 14:21
     　　*/
    Response newProductListByPromotion(ProSearchCondition proSearchCondition);

    /**
     　　* @Description: 通过集合的stream实现多条件筛选产品，提高查询效率
     　　* @author 周陈
     　　* @date 2019/5/8 9:53
     　　*/
    List<ProductListDto> searchProToStream(ProSearchCondition proSearchCondition);
}
