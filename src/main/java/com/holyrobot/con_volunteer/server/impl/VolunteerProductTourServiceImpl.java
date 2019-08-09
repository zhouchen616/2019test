package com.holyrobot.con_volunteer.server.impl;

import com.holyrobot.con_product.mapper.ProProductDepartureMapper;
import com.holyrobot.con_product.mapper.ProTourMapper;
import com.holyrobot.con_product.pojo.ProTour;
import com.holyrobot.con_volunteer.mapper.VolunteerProductTourMapper;
import com.holyrobot.con_volunteer.pojo.VolunteerProductTour;
import com.holyrobot.dto.TourBo;
import com.holyrobot.dto.TourInfoVo;
import com.holyrobot.dto.TourPricePolicyBo;
import com.holyrobot.response.Response;
import com.holyrobot.con_volunteer.server.VolunteerProductTourService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * @ClassName： VolunteerProductTourServiceImpl
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2019-2-27 16:33
 * @Version: 1.0
 * @Modified By:
 */
@Service
@Slf4j
public class VolunteerProductTourServiceImpl implements VolunteerProductTourService {

    @Autowired
    private VolunteerProductTourMapper volunteerProductTourMapper;
    @Autowired
    private ProTourMapper tourMapper;
    @Autowired
    private ProProductDepartureMapper proProductDepartureMapper;


    @Override
    public VolunteerProductTour selectByPrimaryKey(String id) {
        VolunteerProductTour volunteerProductTour = volunteerProductTourMapper.selectByPrimaryKey(id);
        return volunteerProductTour;
    }

    @Override
    public Response getPriceList(String tourDate, String siteId, String tourId, String orgId) {
        List<TourInfoVo> tourInfoVoList = new ArrayList<>();
        VolunteerProductTour volunteerProductTour = volunteerProductTourMapper.selectByPrimaryKey(tourId);
        ProTour proTour = tourMapper.selectByPrimaryKey(volunteerProductTour.getTourid());
        //业务返回对象
        TourInfoVo tourInfoVo = new TourInfoVo();
        //团期的部分数据设置到返回值中
        TourBo tourBo = new TourBo();

        tourBo.setId(proTour.getId());
        tourBo.setTourDate(proTour.getTourdate());
        tourBo.setTourName(proTour.getTourname());
        tourBo.setDueDate(proTour.getDuedate());
        tourBo.setTourNo(proTour.getTourno());
        tourInfoVo.setTourInfo(tourBo);

        //开始获取 外发产品-团次价格策略
        List<TourPricePolicyBo> listPricePolicy = proProductDepartureMapper.listPricePolicy(volunteerProductTour.getTourid(), siteId, orgId);
        int j = 0;
        if (Objects.nonNull(listPricePolicy) && !listPricePolicy.isEmpty()) {
            for (int i = 0; i < listPricePolicy.size(); i++) {
                if (listPricePolicy.get(i).isDef()) {//设置团期的默认价格
                    tourInfoVo.setTourPrice(listPricePolicy.get(i).getSalesPrice());
                }
                if (listPricePolicy.get(i).isDef() && i != 0) {
                    j = i;
                }
            }
        }
        TourPricePolicyBo tourPricePolicyBo = listPricePolicy.get(j);
        listPricePolicy.remove(j);
        listPricePolicy.add(0, tourPricePolicyBo);
        if (StringUtils.isBlank(tourDate)) {
            tourInfoVo.setPricePolicyList(null);
        } else {
            tourInfoVo.setPricePolicyList(listPricePolicy);
        }
        tourInfoVoList.add(tourInfoVo);
        return new Response().success(tourInfoVoList);
    }


}
