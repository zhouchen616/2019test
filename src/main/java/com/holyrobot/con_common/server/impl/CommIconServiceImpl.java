package com.holyrobot.con_common.server.impl;


import com.holyrobot.con_common.server.CommIconService;
import com.holyrobot.config.RedisClient;
import com.holyrobot.dto.ProTypeIconDto;
import com.holyrobot.con_common.mapper.CommIconMapper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 周陈
 * @Title: 产品类型Icon
 * @date 2018/7/16 15:33
 */
@Service
@Slf4j
public class CommIconServiceImpl implements CommIconService {
    @Autowired
    private CommIconMapper mapper;
    @Autowired
    private RedisClient jedisClientService;
    /**
    　　* @Description: 产品类型Icon
    　　* @author 周陈
    　　* @date 2018/7/16 15:35
    　　*/
    @Override
    public List<ProTypeIconDto> findProTypeIcon() {
/*        String proTypeIcon = jedisClientService.get("ProTypeIcon");
        List<ProTypeIconDto> proTypeIconDtos = JSON.parseArray(proTypeIcon, ProTypeIconDto.class);
        if(proTypeIconDtos==null || proTypeIconDtos.size()==0){
            proTypeIconDtos = mapper.selectProTypeIcon();
            if(proTypeIconDtos==null && proTypeIconDtos.size()>0){
                jedisClientService.set("ProTypeIcon",JSON.toJSONString(proTypeIconDtos));
            }
        }*/
        List<ProTypeIconDto> proTypeIconDtos = mapper.selectProTypeIcon();
        return proTypeIconDtos;
    }
}
