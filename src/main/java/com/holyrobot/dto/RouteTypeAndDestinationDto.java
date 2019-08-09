package com.holyrobot.dto;

import com.holyrobot.con_om.pojo.OmDestination;
import com.holyrobot.con_om.pojo.OmRoutetype;

import java.util.List;

/**
 * @author 周陈
 * @Title: 线路-目的地封装类
 * @date 2018/5/31 14:46
 */
public class RouteTypeAndDestinationDto {
    /**
     * 线路类型
     */
    private OmRoutetype omRouteType;
    /**
     * 线路类型对应下的目的地（城市）
     */
    private List<OmDestination> omDestinations;

    public OmRoutetype getOmRouteType() {
        return omRouteType;
    }

    public void setOmRouteType(OmRoutetype omRouteType) {
        this.omRouteType = omRouteType;
    }

    public List<OmDestination> getOmDestinations() {
        return omDestinations;
    }

    public void setOmDestinations(List<OmDestination> omDestinations) {
        this.omDestinations = omDestinations;
    }
}
