package com.holyrobot.dto;

import com.holyrobot.dto.h5user.H5LoginCredentials;
import com.holyrobot.dto.h5user.H5UserInfo;

/**
 * @author 周陈
 * @Title:
 * @date 2018/7/5 15:12
 */
public class H5UserDto {
    H5UserInfo h5UserInfo;
    H5LoginCredentials h5LoginCredentials;

    public H5UserDto(H5UserInfo h5UserInfo, H5LoginCredentials h5LoginCredentials) {
        this.h5UserInfo = h5UserInfo;
        this.h5LoginCredentials = h5LoginCredentials;
    }

    public H5UserDto() {
    }

    public H5UserInfo getH5UserInfo() {
        return h5UserInfo;
    }

    public void setH5UserInfo(H5UserInfo h5UserInfo) {
        this.h5UserInfo = h5UserInfo;
    }

    public H5LoginCredentials getH5LoginCredentials() {
        return h5LoginCredentials;
    }

    public void setH5LoginCredentials(H5LoginCredentials h5LoginCredentials) {
        this.h5LoginCredentials = h5LoginCredentials;
    }
}
