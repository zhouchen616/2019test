package com.holyrobot.dto;

/**
 * @author 周陈
 * @Title:
 * @date 2018/7/5 13:46
 */
public class ErpWxUserDto {
    private ErpUserDto erpUserDto;
    private WxUser wxUser;

    public ErpWxUserDto(ErpUserDto erpUserDto, WxUser wxUser) {
        this.erpUserDto = erpUserDto;
        this.wxUser = wxUser;
    }

    public ErpWxUserDto() {
    }

    public ErpUserDto getErpUserDto() {
        return erpUserDto;
    }

    public void setErpUserDto(ErpUserDto erpUserDto) {
        this.erpUserDto = erpUserDto;
    }

    public WxUser getWxUser() {
        return wxUser;
    }

    public void setWxUser(WxUser wxUser) {
        this.wxUser = wxUser;
    }
}
