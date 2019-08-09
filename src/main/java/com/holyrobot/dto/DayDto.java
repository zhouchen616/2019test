package com.holyrobot.dto;

import lombok.Data;

/**
 * @author 周陈
 * @Title: 行程天数
 * @date 2019/3/11 16:32
 */
@Data
public class DayDto {
    //出行天数大于day1
    private Integer maxDay;
    //出行天数小于day2
    private Integer minDay;

    private String day;

    public DayDto() {
    }

    public DayDto(Integer maxDay, Integer minDay, String day) {
        this.maxDay = maxDay;
        this.minDay = minDay;
        this.day = day;
    }
}
