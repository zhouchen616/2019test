package com.holyrobot.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName： UserAddressAndBirthVo
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2019-3-15 15:21
 * @Version: 1.0
 * @Modified By:
 */
public class UserAddressAndBirthVo implements Serializable {

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date birth;

    private String address;

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
