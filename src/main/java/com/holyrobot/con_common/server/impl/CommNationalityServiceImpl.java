package com.holyrobot.con_common.server.impl;

import com.holyrobot.con_common.mapper.CommNationalityMapper;
import com.holyrobot.con_common.pojo.CommNationality;
import com.holyrobot.con_common.pojo.CommNationalityExample;
import com.holyrobot.con_common.server.CommNationalityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName： CommNationalityServiceImpl
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2018-12-24 16:24
 * @Version: 1.0
 * @Modified By:
 */
@Slf4j
@Service
public class CommNationalityServiceImpl implements CommNationalityService {

    @Autowired
    private CommNationalityMapper commNationalityMapper;
   
    /**
     *
     * @Description: 通过国籍获得国籍在表中的id
     * 
     * @auther: 史迪旻
     * @date: 16:26 2018-12-24 
     * @param: [nationalityName]
     * @return: java.lang.String
     *
     */
    @Override
    public String getNationalityId(String nationalityName) {
        CommNationalityExample example = new CommNationalityExample();
        example.or().andNameEqualTo(nationalityName);
        List<CommNationality> commNationalities = commNationalityMapper.selectByExample(example);

        return commNationalities.get(0).getId();
    }

    /**
     *
     * @Description: 获得所有国籍
     *
     * @auther: 史迪旻
     * @date: 11:36 2018-12-25
     * @param: []
     * @return: com.holyrobot.con_common.pojo.CommNationality
     *
     */
    @Override
    public List<CommNationality> getAllNationality() {
        List<CommNationality> commNationalities = commNationalityMapper.selectByExample(null);
        return commNationalities;
    }

    /**
     *
     * @Description: 模糊查询国籍信息
     *
     * @auther: 史迪旻
     * @date: 16:44 2018-12-25
     * @param: [sth]
     * @return: java.util.List<com.holyrobot.con_common.pojo.CommNationality>
     *
     */
    @Override
    public List<CommNationality> getSearchNationality(String sth) {
        CommNationalityExample example = new CommNationalityExample();
        example.or().andNameLike("%"+sth+"%");
        List<CommNationality> commNationalities = commNationalityMapper.selectByExample(example);
        return commNationalities;
    }
}
