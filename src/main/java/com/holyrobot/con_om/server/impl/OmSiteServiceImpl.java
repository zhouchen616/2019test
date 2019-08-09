package com.holyrobot.con_om.server.impl;

import com.holyrobot.config.RedisClient;
import com.holyrobot.constant.Constants;
import com.holyrobot.dto.DefaultSiteDto;
import com.holyrobot.dto.RouteTypeAndDestinationDto;
import com.holyrobot.con_om.mapper.OmDestinationMapper;
import com.holyrobot.con_om.mapper.OmRoutetypeMapper;
import com.holyrobot.con_om.mapper.OmSiteMapper;
import com.holyrobot.con_om.pojo.*;
import com.holyrobot.con_om.server.OmSiteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author 周陈
 * @Title: 站点
 * @date 2018/6/26 11:43
 */
@Service
@Slf4j
public class OmSiteServiceImpl implements OmSiteService {
    @Autowired
    private OmSiteMapper omSiteMapper;
    @Autowired
    private OmRoutetypeMapper omRouteTypeMapper;
    @Autowired
    private RedisClient jedisClientService;
    @Autowired
    private OmDestinationMapper destinationMapper;
    @Value("${JWrouteTypeId}")
    private String JWrouteTypeId;

    /**
     * 　　* @Description:
     * 　　* @author 周陈
     * 　　* @date 2018/6/26 14:09
     */
    @Override
    public List<OmSite> getSiteByOrgId(String orgId) {
        return omSiteMapper.selectSiteByOrgId(orgId);
    }

    /**
     * 　　* @Description: 线路类型-目的地
     * 　　* @author 周陈
     * 　　* @date 2018/6/26 14:08
     */

    public List<RouteTypeAndDestinationDto> getRouteTypeAndDestination(String siteId) {
        List<RouteTypeAndDestinationDto> list = new ArrayList<>();
        //查出所有routeType
        List<OmRoutetype> allRouteType = getAllRouteType();
        for (OmRoutetype omRouteType : allRouteType) {
            RouteTypeAndDestinationDto routeTypeAndDestinationDto = new RouteTypeAndDestinationDto();
            routeTypeAndDestinationDto.setOmRouteType(omRouteType);
            List<OmDestination> omDestinations = findDestCity(siteId, omRouteType.getId());
            routeTypeAndDestinationDto.setOmDestinations(omDestinations);
            list.add(routeTypeAndDestinationDto);
        }
        return list;
    }

    /**
     * 　　* @Description: 根据站点名查询站点id
     * 　　* @author 周陈
     * 　　* @date 2018/6/26 14:08
     */
    @Override
    public String getSiteId(String siteName) {
        // TODO Auto-generated method stub
        OmSiteExample omSiteExample = new OmSiteExample();
        OmSiteExample.Criteria create = omSiteExample.createCriteria();
        create.andSitenameEqualTo(siteName);
        List<OmSite> selectByExample = omSiteMapper.selectByExample(omSiteExample);
        String id = "";
        if (selectByExample.size() > 0) {
            id = selectByExample.get(0).getId();
        }
        return id;
    }

    @Override
    public List<OmRoutetype> getAllRouteType() {
        // TODO Auto-generated method stub
        List<OmRoutetype> list = new ArrayList<>();
        //从redis中获取缓存的值
        try {
            list = jedisClientService.getNotUUID("NTFox_RouteType", OmRoutetype.class);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        if (list == null || list.size() == 0) {
            //redis中没有值,从数据库中查询
            OmRoutetypeExample omRoutetypeExample = new OmRoutetypeExample();
            OmRoutetypeExample.Criteria create = omRoutetypeExample.createCriteria();
            create.andDatastatusEqualTo(1);
            list = omRouteTypeMapper.selectByExample(omRoutetypeExample);
            //写入reds
            try {
                if (list.size() > 0) {
                    jedisClientService.setIncludeUUID("NTFox_RouteType", list);
                }
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return list;
    }


    public List<OmDestination> findDestCity(String siteId, String routrTypeId) {
        OmRoutetype omRouteType = omRouteTypeMapper.selectByPrimaryKey(routrTypeId);
        List<OmDestination> omDestinations1 = new ArrayList<>();
        //根据站点、线路类型查目的地
        List<OmDestination> omDestinations = jedisClientService.getNotUUID("NTFox_" + siteId + "_" + omRouteType.getAliasid() + "_Destination", OmDestination.class);
        if (omDestinations == null || omDestinations.size() == 0) {
            omDestinations = destinationMapper.selectBySiteIdAndRouteTypeId(siteId, omRouteType.getId());
            if (Objects.nonNull(omDestinations) && omDestinations.size() > 0) {
                jedisClientService.setIncludeUUID("NTFox_" + siteId + "_" + omRouteType.getAliasid() + "_Destination",
                        omDestinations);
            }
        }
        //一级地址Id(国内、国外)
        String destId = "";
        for (OmDestination omDestination : omDestinations) {
            if (omDestination.getParentid().equals(Constants.STAIR_DESTINATION_PARENT_ID)) {
                destId = omDestination.getDestid();
                break;
            }
        }
        for (OmDestination omDestination : omDestinations) {
            if (omDestination.getParentid().equals(destId)) {
                //境外游只有两级，所以不需要二次循环
                if (omRouteType.getId().equals(JWrouteTypeId)) {
                    omDestinations1.add(omDestination);
                } else {
                    //二级地址ID（省份）
                    String parentId = "";
                    parentId = omDestination.getDestid();
                    //二次循环取出二级地址下的所以三级地址（城市）
                    for (OmDestination omDestination1 : omDestinations) {
                        if (omDestination1.getParentid().equals(parentId)) {
                            omDestinations1.add(omDestination1);
                        }
                    }
                }

            }
        }
        return omDestinations1;
    }

    /**
     * 　　* @Description: 通过orgId查询产品最多的站点
     * 　　* @author 周陈
     * 　　* @date 2018/11/29 17:10
     *
     */
    @Override
    public DefaultSiteDto selectDefaultSiteByOrgId(String orgId) {
        return omSiteMapper.selectDefaultSiteByOrgId(orgId);
    }
}
