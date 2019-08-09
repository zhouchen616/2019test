package com.holyrobot.dto;

import java.util.List;
import java.util.Map;

/**
 * @Author: 周相儒
 * @Description: h5返回团期数据
 * @CreateDate: 2018/6/27 11:37
 * @Version: 1.0
 */
public class TourInfoDto {

    private List<TourBo> tourinfoList;

    private List<Map<String, Object>> returnList;


    public TourInfoDto(List<TourBo> tourinfoList, List<Map<String, Object>> returnList) {
        this.tourinfoList = tourinfoList;
        this.returnList = returnList;
    }

    public List<Map<String, Object>> getReturnList() {
        return returnList;
    }

    public void setReturnList(List<Map<String, Object>> returnList) {
        this.returnList = returnList;
    }

    public List<TourBo> getTourinfoList() {
        return tourinfoList;
    }

    public void setTourinfoList(List<TourBo> tourinfoList) {
        this.tourinfoList = tourinfoList;
    }
}
