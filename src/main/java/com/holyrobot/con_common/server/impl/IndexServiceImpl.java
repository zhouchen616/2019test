package com.holyrobot.con_common.server.impl;

import com.holyrobot.con_common.server.IndexService;
import com.holyrobot.con_om.mapper.*;
import com.holyrobot.con_om.pojo.*;
import com.holyrobot.con_om.server.OmSiteService;
import com.holyrobot.config.RedisClient;
import com.holyrobot.constant.Constants;
import com.holyrobot.dto.*;
import com.holyrobot.con_common.mapper.*;
import com.holyrobot.con_common.pojo.*;
import com.holyrobot.response.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author 周陈
 * @Title: 首页接口方法
 * @date 2019/3/11 15:50
 */
@Service
@Slf4j
public class IndexServiceImpl implements IndexService {
    @Autowired
    private OmDestinationMapper omDestinationMapper;
    @Autowired
    private OmProducttypeMapper omProducttypeMapper;
    @Autowired
    private OmRoutetypeMapper omRoutetypeMapper;
    @Value("${JWrouteTypeId}")
    private String JWrouteTypeId;
    @Value("${CXrouteTypeId}")
    private String CXrouteTypeId;
    @Autowired
    private OmRoutetypeMapper routeTypeMapper;
    @Autowired
    private RedisClient jedisClientService;
    @Autowired
    private OmProductlabelMapper omProductlabelMapper;
    @Autowired
    private OmDepartureMapper omDepartureMapper;
    @Autowired
    private OmSiteService omSiteService;

    public Response getDepAndDes(String siteId, String routeTypeId) {
        //线路类型
        //出发城市
        OmDepartureExample example0 = new OmDepartureExample();
        example0.or().andSiteidEqualTo(siteId).andDatastatusEqualTo(1);
        List<OmDeparture> omDepartures = omDepartureMapper.selectByExample(example0);
        List<OmDestinationDto> destinationByRouteType = null;
        if (routeTypeId != null && !routeTypeId.equals("")) {
            destinationByRouteType = findDestinationByRouteType(siteId, routeTypeId);
        }

        return new Response().success(new DepAndDesDto(omDepartures, destinationByRouteType));
    }

    @Override
    public Response classifySearch(String siteId, String orgId) {
        //所有站点
        List<OmSite> sites = omSiteService.getSiteByOrgId(orgId);

        //线路类型
        List<OmRoutetype> omRoutetypes = omRoutetypeMapper.selectByExample(null);

        //产品类型
        List<OmProducttype> omProducttypes = omProducttypeMapper.selectByExample(null);

        //出发城市
        OmDepartureExample example0 = new OmDepartureExample();
        example0.or().andSiteidEqualTo(siteId).andDatastatusEqualTo(1);
        List<OmDeparture> omDepartures = omDepartureMapper.selectByExample(example0);

        //行程天数
        List<DayDto> dayDtos = Arrays.asList(
                new DayDto(3, 0, "3天之内"),
                new DayDto(5, 3, "3~5天"),
                new DayDto(5, 8, "5~8天"),
                new DayDto(12, 8, "8~12天"),
                new DayDto(99, 12, "12天"));

        //标签
        OmProductlabelExample example = new OmProductlabelExample();
        example.or().andDatastatusEqualTo(1);
        List<OmProductlabel> omProductlabels = omProductlabelMapper.selectByExample(example);

        //产品品牌
        List<String> brands = Arrays.asList("品赞", "独家", "常规");


        return new Response().success(new ClassifySearchVo(sites, omRoutetypes, omProducttypes,
                dayDtos, omProductlabels, brands, omDepartures));
    }

    /**
     * 　　* @Description: 通过站点查询 首页搜索列表中的全部目的地
     * 　　* @author 周陈
     * 　　* @date 2018/9/14 11:01
     */
    @Override
    public List<OmDestinationDto> findDestinationBySiteId(String siteId) {
        List<OmDestinationDto> omDestinationDtos = new ArrayList<>();

        //1.先查询国外数据
        List<OmDestination> destinations = this.findDestByRedis(siteId, JWrouteTypeId);
        OmDestinationDto omDestinationDto = new OmDestinationDto();
        //取出国外一级对象，remove掉 剩下的就是国外的二级城市
        for (OmDestination destination : destinations) {
            if (destination.getParentid().equals(Constants.STAIR_DESTINATION_PARENT_ID)) {
                CityDto cityDto = new CityDto(destination.getDestid(), destination.getDestname());
                omDestinationDto.setDestination(cityDto);
                destinations.remove(destination);
                break;
            }
        }
        omDestinationDto.setCitys(destinations);
        omDestinationDtos.add(omDestinationDto);

        //2.再处理国内数据

        //查询不含国外的目的地
        List<OmDestination> omDestinations = omDestinationMapper.selectBySiteIdAndGuoNeiRouteType(siteId, JWrouteTypeId);
        String uuid = "";
        for (OmDestination destination : omDestinations) {
            if (destination.getParentid().equals(Constants.STAIR_DESTINATION_PARENT_ID)) {
                uuid = destination.getDestid();
                break;
            }
        }
        for (OmDestination destination : omDestinations) {
            if (uuid.equals(destination.getParentid())) {
                omDestinationDto = new OmDestinationDto();
                List<OmDestination> omDestinations1 = new ArrayList<>();
                //省份目的地对象
                CityDto cityDto = new CityDto(destination.getDestid(), destination.getDestname());
                //设置省份
                omDestinationDto.setDestination(cityDto);
                //从数据库查询的结果集中 取出当前省份的子集
                omDestinations1 = omDestinations.stream().filter(omDestination -> omDestination.getParentid().equals(destination.getDestid())).collect(Collectors.toList());
                //设置省份子集
                omDestinationDto.setCitys(omDestinations1);
                omDestinationDtos.add(omDestinationDto);
            }
        }
        return omDestinationDtos;
    }


    /**
     * 　　* @Description: 通过站点id 线路类型id 查询搜索列表中的目的地
     * 　　* @author 周陈
     * 　　* @date 2018/9/14 11:00
     */
    @Override
    public List<OmDestinationDto> findDestinationByRouteType(String siteId, String routeTypeId) {
        // 1.目的地 NTFox_｛sID｝_{routType}_Destination
        List<OmDestination> destinations = this.findDestByRedis(siteId, routeTypeId);
        String uuid = "";
        List<OmDestinationDto> omDestinationDtos = new ArrayList<>();
        if (!routeTypeId.equals(JWrouteTypeId)) {
            // 非境外游需要查询第三级目的地
            for (OmDestination destination : destinations) {
                if (destination.getParentid().equals(Constants.STAIR_DESTINATION_PARENT_ID)) {
                    uuid = destination.getDestid();
                    break;
                }
            }
            for (OmDestination destination : destinations) {
                if (uuid.equals(destination.getParentid())) {
                    OmDestinationDto omDestinationDto = new OmDestinationDto();
                    CityDto cityDto = new CityDto(destination.getDestid(), destination.getDestname());
                    omDestinationDto.setDestination(cityDto);

                    List<OmDestination> omDestinationById = this.findOmDestinationById(siteId, routeTypeId, destination.getDestid());
                    omDestinationDto.setCitys(omDestinationById);
                    omDestinationDtos.add(omDestinationDto);
                }
            }
        } else {
            // 境外游不需要查询第三级目的地
            for (OmDestination destination : destinations) {
                if (destination.getParentid().equals(Constants.STAIR_DESTINATION_PARENT_ID)) {
                    uuid = destination.getDestid();
                    OmDestinationDto omDestinationDto = new OmDestinationDto();
                    CityDto cityDto = new CityDto(destination.getDestid(), destination.getDestname());
                    omDestinationDto.setDestination(cityDto);
                    omDestinationDtos.add(omDestinationDto);
                    break;
                }
            }
            for (OmDestination destination : destinations) {
                if (uuid.equals(destination.getParentid())) {
                    OmDestinationDto omDestinationDto = new OmDestinationDto();
                    CityDto cityDto = new CityDto(destination.getDestid(), destination.getDestname());
                    omDestinationDto.setDestination(cityDto);
                    omDestinationDtos.add(omDestinationDto);
                }
            }
        }
        return omDestinationDtos;
    }

    @Override
    public List<OmDestination> findOmDestinationById(String siteId, String routTypeId, String parentid) {
        OmDestinationExample example = new OmDestinationExample();
        example.or().andParentidEqualTo(parentid).andSiteidEqualTo(siteId).andRoutetypeidEqualTo(routTypeId)
                .andDatastatusEqualTo(1);
        return omDestinationMapper.selectByExample(example);
    }

    /**
     * 　　* @Description: 通过站点id 线路类型 查询redis中 目的地
     * 　　* @author 周陈
     * 　　* @date 2018/9/14 10:59
     */
    @Override
    public List<OmDestination> findDestByRedis(String siteId, String routeTypeId) {
        //别名id
        OmRoutetype omRouteType = routeTypeMapper.selectByPrimaryKey(routeTypeId);
        Integer aliasId = omRouteType.getAliasid();
        // 1.目的地 NTFox_｛sID｝_{routType}_Destination
        List<OmDestination> destinations = jedisClientService.getNotUUID("NTFox_" + siteId + "_" + aliasId + "_Destination", OmDestination.class);
        // 先从redis中取，如果redis中不存在则去数据库里查询再写入redis中
        if (Objects.isNull(destinations) || destinations.size() == 0) {
            destinations = omDestinationMapper.selectBySiteIdAndRouteTypeId(siteId, routeTypeId);
            if (destinations.size() > 0) {
                jedisClientService.setIncludeUUID("NTFox_" + siteId + "_" + aliasId + "_Destination", destinations);
            }
        }
        return destinations;
    }
}
