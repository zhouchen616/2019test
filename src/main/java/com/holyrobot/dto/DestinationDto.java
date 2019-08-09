package com.holyrobot.dto;

import com.holyrobot.con_om.pojo.OmDestination;

import java.util.List;

/**
 * @author 周陈
 * @Title: 目的地Dto
 * @date 2018/5/21 16:53
 */
public class DestinationDto {
    private OmDestination parent;
    private List<OmDestination> childs;

    @Override
    public String toString() {
        return "DestinationDto{" +
                "parent=" + parent +
                ", childs=" + childs +
                '}';
    }

    public OmDestination getParent() {
        return parent;
    }

    public void setParent(OmDestination parent) {
        this.parent = parent;
    }

    public List<OmDestination> getChilds() {
        return childs;
    }

    public void setChilds(List<OmDestination> childs) {
        this.childs = childs;
    }
}
