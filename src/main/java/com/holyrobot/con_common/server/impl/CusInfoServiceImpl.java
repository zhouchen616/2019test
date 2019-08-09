package com.holyrobot.con_common.server.impl;

import com.holyrobot.con_common.mapper.*;
import com.holyrobot.con_common.pojo.*;
import com.holyrobot.con_common.server.CusInfoService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/**
 * @author 周陈
 * @Title: 定制游服务类型Service
 * @date 2018/6/28 10:02
 */
@Service
@Slf4j
public class CusInfoServiceImpl implements CusInfoService {
    @Autowired
    CusCusinfoMapper cusInfoMapper;
    @Autowired
    CusCusInfoDestMapper destMapper;
    @Autowired
    CusCusInfoServiceTypeMapper serviceTypeMapper;
    @Autowired
    CusServiceMapper serviceMapper;
    @Autowired
    CusTagMapper cusTagMapper;
    @Autowired
    CusCusInfoTagMapper cusCusInfoTagMapper;

    /**
     * 　　* @Description: 查询所有CusTag
     * 　　* @author 周陈
     * 　　* @date 2018/7/16 19:14
     *
     */
    public List<CusTag> findAllTag() {
        CusTagExample example = new CusTagExample();
        example.setOrderByClause("Weight Desc");
        return cusTagMapper.selectByExample(example);
    }

    /**
     * 　　* @Description: 保存定制游需求
     * 　　* @author 周陈
     * 　　* @date 2018/6/28 10:19
     *
     */
    @Override
    public void saveCusInfo(CusCusinfo cusInfo) {
        int insert = cusInfoMapper.insert(cusInfo);
    }

    /**
     * 　　* @Description: 保存定制游选择的服务类型
     * 　　* @author 周陈
     * 　　* @date 2018/6/28 10:16
     */
    @Override
    public void saveCustServiceType(CusCusInfoServiceType serviceType) {
        int insert = serviceTypeMapper.insert(serviceType);

    }

    /**
     * 　　* @Description: 保存定制游选择的目的地
     * 　　* @author 周陈
     * 　　* @date 2018/6/28 10:16
     */
    @Override
    public void saveCusDest(CusCusInfoDest dest) {
        int insert = destMapper.insert(dest);
    }

    /**
     * 　　* @Description: 查询所有定制游服务类型
     * 　　* @author 周陈
     * 　　* @date 2018/6/28 10:14
     */
    @Override
    public List<CusService> selectServiceList() {
        List<CusService> listAll = serviceMapper.listAll();
        return listAll;
    }

    /**
     * 　　* @Description: 提交定制游订单
     * 　　* @author 周陈
     * 　　* @date 2018/6/28 10:20
     *
     */
    @Override
    //多表插入，事务控制
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, timeout = 36000, rollbackFor = Exception.class)
    public int saveCus(CusCusinfo cusCusInfo) {
        //添加目的地
        String[] destinationids = cusCusInfo.getDestinationid().split(",");
        String[] destinations = cusCusInfo.getDestination().split(",");
        log.info("目的地id={},目的地={}", Arrays.toString(destinationids), Arrays.toString(destinations));
        for (int i = 0; i < destinationids.length; i++) {
            CusCusInfoDest cusCusInfoDest = new CusCusInfoDest();
            cusCusInfoDest.setId(UUID.randomUUID().toString());
            cusCusInfoDest.setCusCusinfoid(cusCusInfo.getId());
            cusCusInfoDest.setDestid(destinationids[i]);
            cusCusInfoDest.setDestination(destinations[i]);
            destMapper.insert(cusCusInfoDest);
        }
        //添加服务类型
        if(StringUtils.isNotEmpty(cusCusInfo.getServicetype())) {
            String[] serviceTypes = cusCusInfo.getServicetype().split(",");
            log.info("服务类型={}", Arrays.toString(serviceTypes));
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < serviceTypes.length; i++) {
                CusCusInfoServiceType cusCusInfoServiceType = new CusCusInfoServiceType();
                cusCusInfoServiceType.setId(UUID.randomUUID().toString());
                cusCusInfoServiceType.setServiertypeid(serviceTypes[i]);
                cusCusInfoServiceType.setCusCusinfoid(cusCusInfo.getId());
                CusService cusService = serviceMapper.selectByPrimaryKey(serviceTypes[i]);
                stringBuffer.append(cusService.getServicename()).append(",");
                serviceTypeMapper.insert(cusCusInfoServiceType);
            }
            cusCusInfo.setServicetype(stringBuffer.toString());
        }
        //TODO 添加标签类型
        if(StringUtils.isNotEmpty(cusCusInfo.getTag())){
            StringBuffer stringBuffer = new StringBuffer();
            String[] tags = cusCusInfo.getTag().split(",");
            for (int i = 0; i < tags.length; i++) {
                CusCusInfoTag cusCusInfoTag = new CusCusInfoTag();
                cusCusInfoTag.setId(UUID.randomUUID().toString());
                cusCusInfoTag.setCusCusinfoid(cusCusInfo.getId());
                cusCusInfoTag.setTagid(tags[i]);
                CusTag cusTag = cusTagMapper.selectByPrimaryKey(tags[i]);
                stringBuffer.append(cusTag.getTagname()).append(",");
                cusCusInfoTagMapper.insert(cusCusInfoTag);
            }
            cusCusInfo.setTag(stringBuffer.toString());
        }
        //定制游需求来源 3.h5shop
        cusCusInfo.setSource(3);
        //添加定制游主表数据
        int insert = cusInfoMapper.insert(cusCusInfo);
        return insert;

    }
}
