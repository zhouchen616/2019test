package com.holyrobot.dto;

import lombok.Data;

import java.util.List;

/**
 * @author 周陈
 * @Title: 志愿者产品状态修改Vo
 * @date 2019/2/27 11:23
 */
@Data
public class UpdateVolProductVo {
    private List<String> ids;
    private String id;
    private String userId;
    private Integer dataStatus;
    private String orgId;
}
