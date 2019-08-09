package com.holyrobot.dto.h5user;

import lombok.Data;

/**
 * @author 周陈
 * @Title: 商城用户、店铺中间表
 * @date 2019/1/16 19:54
 */
@Data
public class H5OrgIdAndOpenId {
//        "ID": "00000000-0000-0000-0000-000000000000",
//                "UserID": "00000000-0000-0000-0000-000000000000",
//                "OpenID": "string",
//                "OrgID": "00000000-0000-0000-0000-000000000000",Org_User
//	"type": 0
    private String ID;
    private String UserID;
    private String OpenID;
    private String OrgID;
    private Integer type;

}
