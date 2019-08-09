package com.holyrobot.dto.mongo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.holyrobot.constant.Constants;
import com.holyrobot.dto.ErpWxUserDto;
import me.chanjar.weixin.mp.bean.result.WxMpUser;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author 周陈
 * @Title: 用户登陆记录
 * @date 2019/4/10 15:27
 */
@Document(collection = "H5ShopUserLoginInfo")
public class H5ShopUserLoginInfo {
    @Id
    private String id;
    private String nickname;
    private String orgId;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm", timezone = "GMT+8")
    private Date loginTime = new Date();
    private String data = Constants.SIMPLE_DATE_FORMAT.format(new Date());
    private WxMpUser wxMpUser;
    private ErpWxUserDto erpWxUser;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public WxMpUser getWxMpUser() {
        return wxMpUser;
    }

    public void setWxMpUser(WxMpUser wxMpUser) {
        this.wxMpUser = wxMpUser;
        if (wxMpUser != null) {
            this.nickname = wxMpUser.getNickname();
        }

    }

    public ErpWxUserDto getErpWxUser() {
        return erpWxUser;
    }

    public void setErpWxUser(ErpWxUserDto erpWxUser) {
        this.erpWxUser = erpWxUser;
    }
}
