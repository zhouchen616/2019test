package com.holyrobot.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @ClassName： ChangedInfoVo
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2018-9-12 17:56
 * @Version: 1.0
 * @Modified By:
 */
public class ChangedInfoVo implements Serializable {

    private List<ChangedUserInfoDto> changedUserInfoDtos;

    private BigDecimal changedPrice;


    public List<ChangedUserInfoDto> getChangedUserInfoDtos() {
        return changedUserInfoDtos;
    }

    public void setChangedUserInfoDtos(List<ChangedUserInfoDto> changedUserInfoDtos) {
        this.changedUserInfoDtos = changedUserInfoDtos;
    }

    public BigDecimal getChangedPrice() {
        return changedPrice;
    }

    public void setChangedPrice(BigDecimal changedPrice) {
        this.changedPrice = changedPrice;
    }
}
