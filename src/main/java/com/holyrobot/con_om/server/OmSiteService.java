package com.holyrobot.con_om.server;

import com.holyrobot.dto.DefaultSiteDto;
import com.holyrobot.dto.RouteTypeAndDestinationDto;
import com.holyrobot.con_om.pojo.OmRoutetype;
import com.holyrobot.con_om.pojo.OmSite;

import java.util.List;

/**
 * @author 周陈
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/6/2611:42
 */
public interface OmSiteService {
    List<OmSite> getSiteByOrgId(String orgId);
    //查询首页线路类型-目的导航拦
    List<RouteTypeAndDestinationDto> getRouteTypeAndDestination(String siteId);
    //获取所有的线路类型
    List<OmRoutetype> getAllRouteType();
    //根据站点名称，查询站点id
    String getSiteId(String siteName);
    DefaultSiteDto selectDefaultSiteByOrgId(String orgId);
}
