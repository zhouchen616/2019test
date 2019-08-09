package com.holyrobot.con_volunteer.server.impl;

import com.holyrobot.con_volunteer.mapper.VolunteerAddressInformationMapper;
import com.holyrobot.con_volunteer.pojo.VolunteerAddressInformation;
import com.holyrobot.con_volunteer.pojo.VolunteerAddressInformationExample;
import com.holyrobot.response.Response;
import com.holyrobot.con_volunteer.server.VolunteerAddressInformationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * @ClassName： VolunteerAddressInformationImpl
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2019-3-11 15:45
 * @Version: 1.0
 * @Modified By:
 */
@Service
@Slf4j
public class VolunteerAddressInformationImpl implements VolunteerAddressInformationService {

    @Autowired
    private VolunteerAddressInformationMapper volunteerAddressInformationMapper;


    /**
     * @Description: 添加地址信息
     * @auther: 史迪旻
     * @date: 15:51 2019-3-11
     * @param: [volunteerAddressInformation]
     * @return: com.holyrobot.response.Response
     */
    @Override
    @Transactional
    public Response addInfo(VolunteerAddressInformation volunteerAddressInformation) {
        String userid = volunteerAddressInformation.getUserid();
//        确认默认值查询
        VolunteerAddressInformationExample example = new VolunteerAddressInformationExample();
        example.or().andUseridEqualTo(userid).andDefaultsEqualTo(1).andIsdeleteEqualTo(0);
        List<VolunteerAddressInformation> volunteerAddressInformations = volunteerAddressInformationMapper.selectByExample(example);
//        默认项只能唯一
        if (Objects.nonNull(volunteerAddressInformations) && volunteerAddressInformations.size() == 1) {
            VolunteerAddressInformation information = volunteerAddressInformations.get(0);
            if (volunteerAddressInformation.getDefaults() == 1) {
                information.setDefaults(0);
                int i = volunteerAddressInformationMapper.updateByPrimaryKeySelective(information);
                if (i != 1) {
                    log.info("/addInfo 接口: 志愿者地址信息更新失败");
                    return new Response().failure("系统繁忙");
                }
                log.info("/addInfo 接口: 志愿者地址信息更新成功");
            }
        }

        return this.insertInformation(volunteerAddressInformation);
    }


    public Response insertInformation(VolunteerAddressInformation volunteerAddressInformation) {
        String id = UUID.randomUUID().toString();
        volunteerAddressInformation.setId(id);
        volunteerAddressInformation.setDatetime(new Date());
        volunteerAddressInformation.setIsdelete(0);
        int i = volunteerAddressInformationMapper.insertSelective(volunteerAddressInformation);

        if (i == 1) {
            log.info("/VolAddress/addInfo 接口：数据插入成功");
            return new Response().success("地址保存成功");
        }
        return new Response().failure("系统繁忙");
    }


    /**
     * @Description: 查询所有地址信息
     * @auther: 史迪旻
     * @date: 15:59 2019-3-11
     * @param: [userId]
     * @return: com.holyrobot.response.Response
     */
    @Override
    public Response getAddInfo(String userId) {
        VolunteerAddressInformationExample example = new VolunteerAddressInformationExample();
        example.or().andUseridEqualTo(userId).andIsdeleteEqualTo(0);
        List<VolunteerAddressInformation> information = volunteerAddressInformationMapper.selectByExample(example);

        if (information != null && information.size() > 0) {
            log.info("/VolAddress/getInfo 接口：查询成功 {}", information);
            return new Response().success(information);
        }
        return new Response().success(null);
    }


    /**
     * @Description: 更新地址信息
     * @auther: 史迪旻
     * @date: 16:26 2019-3-11
     * @param: [volunteerAddressInformation]
     * @return: com.holyrobot.response.Response
     */
    @Override
    @Transactional
    public Response updateAddInfo(VolunteerAddressInformation volunteerAddressInformation) {
        String userid = volunteerAddressInformation.getUserid();
        VolunteerAddressInformationExample example = new VolunteerAddressInformationExample();
        example.or().andUseridEqualTo(userid).andDefaultsEqualTo(1).andIsdeleteEqualTo(0);
        List<VolunteerAddressInformation> volunteerAddressInformations = volunteerAddressInformationMapper.selectByExample(example);
//        保证默认的唯一性
        if (Objects.nonNull(volunteerAddressInformations) && volunteerAddressInformations.size() == 1) {
            VolunteerAddressInformation information = volunteerAddressInformations.get(0);
            if (volunteerAddressInformation.getDefaults() == 1) {
                information.setDefaults(0);
                int i = volunteerAddressInformationMapper.updateByPrimaryKeySelective(information);
                if (i != 1) {
                    log.info("/VolAddress/updateAddInfo 接口: 志愿者地址更新失败");
                    return new Response().failure("系统繁忙");
                }
            }
        }

        int i = volunteerAddressInformationMapper.updateByPrimaryKeySelective(volunteerAddressInformation);
        if (i == 1) {
            log.info("/VolAddress/updateAddInfo 接口：地址信息更新成功");
            return new Response().success("地址保存成功");
        }

        return new Response().failure("数据保存失败");
    }


    /**
     * @Description: 设置删除地址信息
     * @auther: 史迪旻
     * @date: 16:30 2019-3-11
     * @param: [id]
     * @return: com.holyrobot.response.Response
     */
    @Override
    @Transactional
    public Response delAddInfo(String id) {
        VolunteerAddressInformation information = volunteerAddressInformationMapper.selectByPrimaryKey(id);
        if (information != null && Objects.nonNull(information)) {
            information.setIsdelete(1);
            int i = volunteerAddressInformationMapper.updateByPrimaryKeySelective(information);
            if (i == 1) {
                log.info("/VolAddress/delAddInfo 接口：地址信息设置删除成功");
                return new Response().success("删除成功");
            }
            return new Response().failure("删除失败");
        }
        return new Response().failure("没有这个地址信息");
    }


}
