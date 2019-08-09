package com.holyrobot.dto.mongo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author 周陈
 * @Title: h5shop用户皮肤切换
 * @date 2018/12/25 11:46
 */
@Data
@Document(collection = "H5ShopUserSkinCollection")
public class H5ShopUserSkinCollection  {
    @Id
    private String id;
    private String userId;
    private String openId;
    private Integer skinType=0;
}
