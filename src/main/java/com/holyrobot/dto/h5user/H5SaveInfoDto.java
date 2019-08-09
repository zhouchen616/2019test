package com.holyrobot.dto.h5user;

import lombok.Data;

/**
 * @author 周陈
 * @Title: h5用户保存数据提交实体
 * @date 2019/1/16 19:56
 */
@Data
public class H5SaveInfoDto {
    private H5UserInfo h5UserInfo;
    private H5OrgIdAndOpenId h5OrgIdAndOpenId;
}
