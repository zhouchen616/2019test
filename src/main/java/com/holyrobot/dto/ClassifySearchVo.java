package com.holyrobot.dto;

import com.holyrobot.con_om.pojo.*;
import lombok.Data;

import java.util.List;

/**
 * @author 周陈
 * @Title: 分类页查询条件
 * @date 2019/3/11 16:51
 */
@Data
public class ClassifySearchVo {
    private List<OmSite> sites;

    private List<OmRoutetype> routeTypes;

    private List<OmProducttype> proType;

    private List<DayDto> dayDtos;

    private List<OmProductlabel> tags;

    private List<String> brands;

    private List<OmDeparture> departures;

    public ClassifySearchVo(List<OmSite> sites, List<OmRoutetype> routeTypes, List<OmProducttype> proType, List<DayDto> dayDtos, List<OmProductlabel> tags, List<String> brands, List<OmDeparture> departures) {
        this.sites = sites;
        this.routeTypes = routeTypes;
        this.proType = proType;
        this.dayDtos = dayDtos;
        this.tags = tags;
        this.brands = brands;
        this.departures = departures;
    }

    public ClassifySearchVo() {
    }
}
