/** 
 * Project Name:holyrobot-search-interface 
 * File Name:ProTourService.java 
 * Package Name:com.jingjie.service 
 * Date:2018年3月26日 下午5:22:14 
 * author 汤玉林
 */ 
package com.holyrobot.con_product.server;

import com.holyrobot.dto.*;
import com.holyrobot.con_product.pojo.ProTour;
import com.holyrobot.con_product.pojo.ProTourExample;
import com.holyrobot.response.Response;

import java.util.List;


/**
 * @Description: TODO
 * @author 汤玉林
 * @date 2018年3月26日 下午5:22:14 
 */
public interface ProTourService {



	int save(ProTour tour);
	
	List<ProTour> listByExample(ProTourExample example);

	/**
	 * 
	 * @Description TODO
	 * @author 汤玉林
	 * @date 2018年4月13日 下午1:54:01
	 * @action listVenue
	 * @param id 团期表的id(tourID)
	 * @return
	 */
	TourVenueBo listVenue(String id);
	
	/**
	 * 
	 * @Description TODO
	 * @author 汤玉林
	 * @date 2018年4月13日 下午2:05:33
	 * @action listPricePolicy
	 * @param id tourID
	 * @return
	 */
	List<TourPricePolicyBo> listPricePolicy(String id, String siteId);
	
	/**
	 * 
	 * @Description TODO
	 * @author 汤玉林
	 * @date 2018年4月17日 上午10:24:31
	 * @action listTourOrder
	 * @param id 团期ID
	 * @param tourDate 团期日期
	 * @return
	 */
	List<ProductTourOrderInfoBo> listTourOrder(String id, String tourDate);

	List<TourBo> listTour(String id, String tourDate, String siteId);

	List<TourBo> listTourLimit(String id, String tourDate, String siteId);

	ProTour selectById(String id);

	ProductDetailPriceDto selectTourPrice(String proId, String siteId, Integer userType);

	Response manyTours(String tourDate, String proId, String siteId);
}
