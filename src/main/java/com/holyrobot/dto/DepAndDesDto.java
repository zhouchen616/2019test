package com.holyrobot.dto;

import com.holyrobot.con_om.pojo.OmDeparture;
import lombok.Data;

import java.util.List;

/**
 * @author 周陈
 * @Title: 出发地、目的地Dto
 * @date 2019/3/14 18:48
 */
@Data
public class DepAndDesDto {
   private List<OmDeparture> omDepartures;
   private List<OmDestinationDto> destination;

    public DepAndDesDto(List<OmDeparture> omDepartures, List<OmDestinationDto> destination) {
        this.omDepartures = omDepartures;
        this.destination = destination;
    }

    public DepAndDesDto() {
    }
}
