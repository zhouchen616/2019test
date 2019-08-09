package com.holyrobot.con_product.server;

import com.holyrobot.dto.ProSearchCondition;
import com.holyrobot.dto.ShelfProductVO;
import com.holyrobot.dto.SingleTourUpdateVo;
import com.holyrobot.con_product.pojo.ProProduct;
import com.holyrobot.con_product.pojo.ProProductDirectSales;
import com.holyrobot.con_product.pojo.ProProductDirectSalesItem;
import com.holyrobot.con_product.pojo.ProProductDirectSalesProduct;
import com.holyrobot.response.Response;

import java.util.List;

/**
 * @author 周陈
 * @Title: B端分销
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2019/3/59:56
 */
public interface ProProductDirectSalesService {
    /**
     * 　　* @Description: 产品上架
     * 　　* @author 周陈
     * 　　* @date 2019/3/5 10:01
     */
    Response directShelfProduct(ShelfProductVO directShelfProductVO);

    /**
     * 　　* @Description: 批量产品最低返佣查询
     * 　　* @author 周陈
     * 　　* @date 2019/3/5 14:51
     */
    Response minRebate(ShelfProductVO directShelfProductVO);

    /**
     * 　　* @Description: 单团次价格调整接口
     * 　　* @author 周陈
     * 　　* @date 2019/3/5 14:57
     */
    Response singleTourUpdate(SingleTourUpdateVo singleTourUpdateVo);

    /**
     * 　　* @Description: 单产品上架
     * 　　* @author 周陈
     * 　　* @date 2019/3/5 16:42
     */
    Response singleProductShelf(SingleTourUpdateVo singleTourUpdateVo);

    /**
     * 　　* @Description: B端主动分销产品、团期、价格策略插入
     * 　　* @author 周陈
     * 　　* @date 2019/3/5 14:23
     */
    Response insterProProductDirect(List<ProProduct> proProducts, ShelfProductVO directShelfProductVO);

    /**
     * 　　* @Description: 批量插入主动分销团期
     * 　　* @author 周陈
     * 　　* @date 2019/3/21 11:49
     */
    int insertProProductDirectSalesList(List<ProProductDirectSales> proProductDirectSales);

    /**
     * 　　* @Description: 批量插入主动分销价格
     * 　　* @author 周陈
     * 　　* @date 2019/3/21 11:51
     */
    int insertProProductDirectSalesItemList(List<ProProductDirectSalesItem> proProductDirectSalesItems);

    /**
     * 　　* @Description: 批量插入主动分销产品
     * 　　* @author 周陈
     * 　　* @date 2019/3/21 11:53
     *
     */
    int insertProProductDirectSalesProductList(List<ProProductDirectSalesProduct> proProductDirectSalesProducts);


    /**
     * 　　* @Description: 产品货架查询
     * 　　* @author 周陈
     * 　　* @date 2019/2/25 19:41
     */
    Response getGoodsShelfToB(ProSearchCondition proSearchCondition);

}
