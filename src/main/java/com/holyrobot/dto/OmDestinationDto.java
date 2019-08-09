package com.holyrobot.dto;

import com.holyrobot.con_om.pojo.OmDestination;

import java.util.List;

/**
 * @author 周陈
 * @Title: 目的地Dto
 * @date 2019/3/11 16:11
 */
public class OmDestinationDto {
    private CityDto destination;
    private List<OmDestination> citys;

    public OmDestinationDto(CityDto destination, List<OmDestination> citys) {
        this.destination = destination;
        this.citys = citys;
    }

    public OmDestinationDto() {
    }

    public CityDto getDestination() {
        return destination;
    }

    public void setDestination(CityDto destination) {
        this.destination = destination;
    }

    public List<OmDestination> getCitys() {
        return citys;
    }

    public void setCitys(List<OmDestination> citys) {
        this.citys = citys;
    }

}


