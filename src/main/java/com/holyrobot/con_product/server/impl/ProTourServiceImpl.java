/**
 * Project Name:holyrobot-search-service
 * File Name:ProTourServiceImpl.java
 * Package Name:com.jingjie.service.impl
 * Date:2018年3月26日 下午5:33:19
 * author 汤玉林
 */
package com.holyrobot.con_product.server.impl;

import com.holyrobot.dto.*;
import com.holyrobot.con_product.mapper.ProTourMapper;
import com.holyrobot.con_product.mapper.ProTourPricepolicyMapper;
import com.holyrobot.con_product.mapper.ProTourVenueMapper;
import com.holyrobot.con_product.pojo.ProTour;
import com.holyrobot.con_product.pojo.ProTourExample;
import com.holyrobot.response.Response;
import com.holyrobot.con_product.server.ProTourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * @author 汤玉林
 * @Description: TODO
 * @date 2018年3月26日 下午5:33:19
 */
@Service
public class ProTourServiceImpl implements ProTourService {

    @Autowired
    ProTourMapper tourMapper;

    @Autowired
    ProTourPricepolicyMapper priceMapper;

    @Autowired
    ProTourVenueMapper venueMapper;

    /**
     * 　　* @Description: 取团期前7条数据
     * 　　* @author 周陈
     * 　　* @date 2019/3/11 20:37
     */
    public static List<TourBo> getTop7Tours(List<Map<String, Object>> returnList) {
        List<TourBo> tourinfoList = new ArrayList<>();
        int count = 0;
        for (Map<String, Object> map : returnList) {
            List<TourBo> tourList = (List<TourBo>) map.get("tourList");
            if (tourList != null) {
                for (TourBo tourBo : tourList) {
                    if (count < 7) {
                        tourinfoList.add(tourBo);
                        count++;
                    } else {
                        return tourinfoList;
                    }
                }
            }
        }

        return tourinfoList;
    }

    @Override
    public int save(ProTour tour) {
        int insertSelective = tourMapper.insertSelective(tour);
        return insertSelective;
    }


    @Override
    public List<ProTour> listByExample(ProTourExample example) {
        List<ProTour> selectByExample = tourMapper.selectByExample(example);
        return selectByExample;
    }

    @Override
    public TourVenueBo listVenue(String id) {
        List<TourVenueBo> listVenue = tourMapper.listVenue(id);
        return listVenue.size() > 0 ? listVenue.get(0) : null;
    }


    @Override
    public List<TourPricePolicyBo> listPricePolicy(String id, String siteId) {
        //880907C1-35CC-4C91-8315-9BF531F784AB
        List<TourPricePolicyBo> listPricePolicy = tourMapper.listPricePolicy(id, siteId);
        return listPricePolicy;
    }


    @Override
    public List<ProductTourOrderInfoBo> listTourOrder(String id, String tourDate) {
        List<ProductTourOrderInfoBo> listTourOrder = tourMapper.listTourOrder(id, tourDate);
        return listTourOrder;
    }

    @Override
    public List<TourBo> listTour(String id, String tourDate, String siteId) {
        List<TourBo> listTour = tourMapper.listTour(id, tourDate, siteId);
        return listTour;
    }

    @Override
    public List<TourBo> listTourLimit(String id, String tourDate, String siteId) {
        return tourMapper.listTourLimit(id, tourDate, siteId);
    }

    @Override
    public ProTour selectById(String id) {
        return tourMapper.selectByPrimaryKey(id);
    }

    @Override
    public ProductDetailPriceDto selectTourPrice(String proId, String siteId, Integer userType) {
        if (1 == userType) {//1为b端用户
            return tourMapper.selectTourPriceBySale(proId, siteId);
        } else {
            return tourMapper.selectTourPriceByDirect(proId, siteId);
        }
    }

    @Override
    public Response manyTours(String tourDate, String proId, String siteId) {
        List<ManyToursDto> manyToursDtos = tourMapper.manyTours(tourDate, siteId, proId);
        return new Response().success(manyToursDtos);
    }

}
