package com.holyrobot.con_volunteer.server.impl;

import com.holyrobot.con_volunteer.mapper.VolunteerIdentityInformationMapper;
import com.holyrobot.con_volunteer.pojo.VolunteerIdentityInformation;
import com.holyrobot.con_volunteer.pojo.VolunteerIdentityInformationExample;
import com.holyrobot.response.Response;
import com.holyrobot.con_volunteer.server.VolunteerIdentityInfoService;
import com.holyrobot.util.ValidateUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * @ClassName： VolunteerIdentityInfoServiceImpl
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2019-3-11 14:45
 * @Version: 1.0
 * @Modified By:
 */
@Service
@Slf4j
public class VolunteerIdentityInfoServiceImpl implements VolunteerIdentityInfoService {

    @Autowired
    private VolunteerIdentityInformationMapper volunteerIdentityInformationMapper;


    /**
     * @Description: 用户证件信息保存接口
     * @auther: 史迪旻
     * @date: 15:16 2019-3-11
     * @param: [volunteerIdentityInformation]
     * @return: com.holyrobot.response.Response
     */
    @Override
    @Transactional
    public Response save(VolunteerIdentityInformation volunteerIdentityInformation) {
//        验证身份证
        if (volunteerIdentityInformation.getCardtype() == 0) {
            if (!ValidateUtils.IDcard(volunteerIdentityInformation.getCardid())) {
                log.info("/Identity/save 接口：身份证验证失败");
                return new Response().failure("请输入正确的身份证");
            }
        }
//        验证护照
        if (volunteerIdentityInformation.getCardtype() == 1) {
            if (!ValidateUtils.PassPort(volunteerIdentityInformation.getCardid())) {
                log.info("/Identity/save 接口：护照验证失败");
                return new Response().failure("请输入正确的护照编号");
            }
        }
//        验证台胞证
        if (volunteerIdentityInformation.getCardtype() == 2) {
            if (!ValidateUtils.PassOfTaiWan(volunteerIdentityInformation.getCardid())) {
                log.info("/Identity/save 接口：台胞证验证失败");
                return new Response().failure("请输入正确的证件号");
            }
        }
//        验证港澳通行证
        if (volunteerIdentityInformation.getCardtype() == 3) {
            if (!ValidateUtils.PassOfHKMC(volunteerIdentityInformation.getCardid())) {
                log.info("/Identity/save 接口：港澳通行证验证失败");
                return new Response().failure("请输入正确的证件号");
            }
        }
//        验证台湾护照
        if (volunteerIdentityInformation.getCardtype() == 4) {
            if (!ValidateUtils.PassPort(volunteerIdentityInformation.getCardid())) {
                log.info("/Identity/save 接口：台湾护照验证失败");
                return new Response().failure("请输入正确的证件号");
            }
        }
//        验证回乡证
        if (volunteerIdentityInformation.getCardtype() == 5) {
            if (!ValidateUtils.HomeTownPermit(volunteerIdentityInformation.getCardid())) {
                log.info("/Identity/save 接口：回乡证验证失败");
                return new Response().failure("请输入正确的证件号");
            }
        }
//        验证军官证
        if (volunteerIdentityInformation.getCardtype() == 6) {
            if (!ValidateUtils.SirYesir(volunteerIdentityInformation.getCardid())) {
                log.info("/Identity/save 接口：军官证验证失败");
                return new Response().failure("请输入正确的证件号");
            }
        }

        String userid = volunteerIdentityInformation.getUserid();
        VolunteerIdentityInformationExample example = new VolunteerIdentityInformationExample();
        example.or().andUseridEqualTo(userid).andDefaultsEqualTo(1).andIsdeleteEqualTo(0);
        List<VolunteerIdentityInformation> volunteerIdentityInformations = volunteerIdentityInformationMapper.selectByExample(example);
//        保证默认证件的唯一性
        if (Objects.nonNull(volunteerIdentityInformations) && volunteerIdentityInformations.size() == 1) {
            VolunteerIdentityInformation information = volunteerIdentityInformations.get(0);
            if (volunteerIdentityInformation.getDefaults() == 1) {
                information.setDefaults(0);
                int i = volunteerIdentityInformationMapper.updateByPrimaryKeySelective(information);
                if (i != 1) {
                    log.info("/Identity/save 接口: 志愿者用户证件更新失败");
                    return new Response().failure("系统繁忙");
                }
            }
        }

        String id = UUID.randomUUID().toString();
        volunteerIdentityInformation.setId(id);
        volunteerIdentityInformation.setDatetime(new Date());
        volunteerIdentityInformation.setIsdelete(0);
        int selective = volunteerIdentityInformationMapper.insertSelective(volunteerIdentityInformation);
        if (selective == 1) {
            log.info("/Identity/save 接口：数据插入成功");
            return new Response().success();
        }
        return new Response().failure("证件信息保存失败");
    }


    /**
     * @Description: 获得已有证件信息
     * @auther: 史迪旻
     * @date: 15:25 2019-3-11
     * @param: [userId]
     * @return: com.holyrobot.response.Response
     */
    @Override
    public Response getInfo(String userId) {
        VolunteerIdentityInformationExample example = new VolunteerIdentityInformationExample();
        example.or().andUseridEqualTo(userId).andIsdeleteEqualTo(0);
        List<VolunteerIdentityInformation> informationList = volunteerIdentityInformationMapper.selectByExample(example);

        if (informationList != null && informationList.size() > 0) {
            log.info("/Identity/getInfo 接口：数据返回成功 {}", informationList);
            return new Response().success(informationList);
        }

        return new Response().success(null);
    }


    /**
     * @Description: 修改原本信息
     * @auther: 史迪旻
     * @date: 15:38 2019-3-11
     * @param: [volunteerIdentityInformation]
     * @return: com.holyrobot.response.Response
     */
    @Override
    @Transactional
    public Response updateInfo(VolunteerIdentityInformation volunteerIdentityInformation) {
        String userid = volunteerIdentityInformation.getUserid();
        VolunteerIdentityInformationExample example = new VolunteerIdentityInformationExample();
        example.or().andUseridEqualTo(userid).andDefaultsEqualTo(1).andIsdeleteEqualTo(0);
        List<VolunteerIdentityInformation> volunteerIdentityInformations = volunteerIdentityInformationMapper.selectByExample(example);
//        保证默认证件的唯一性
        if (Objects.nonNull(volunteerIdentityInformations) && volunteerIdentityInformations.size() == 1) {
            VolunteerIdentityInformation information = volunteerIdentityInformations.get(0);
            if (volunteerIdentityInformation.getDefaults() == 1) {
                information.setDefaults(0);
                int i = volunteerIdentityInformationMapper.updateByPrimaryKeySelective(information);
                if (i != 1) {
                    log.info("/Identity/updateInfo 接口: 志愿者用户证件更新失败");
                    return new Response().failure("系统繁忙");
                }
            }
        }

        volunteerIdentityInformation.setDatetime(new Date());
        int i = volunteerIdentityInformationMapper.updateByPrimaryKeySelective(volunteerIdentityInformation);
        if (i == 1) {
            log.info("/Identity/updateInfo 接口：数据更新成功");
            return new Response().success();
        }
        return new Response().failure("保存失败");
    }


    /**
     * @Description: 删除地址信息
     * @auther: 史迪旻
     * @date: 15:43 2019-3-11
     * @param: [id]
     * @return: com.holyrobot.response.Response
     */
    @Override
    @Transactional
    public Response deleteInfo(String id) {
        VolunteerIdentityInformation information = volunteerIdentityInformationMapper.selectByPrimaryKey(id);
        if (Objects.isNull(information) && information == null) {
            return new Response().failure("无内容供修改");
        }
        information.setIsdelete(1);
        int i = volunteerIdentityInformationMapper.updateByPrimaryKeySelective(information);

        if (i == 1) {
            log.info("/Identity/deleteInfo 接口：设置删除成功");
            return new Response().success();
        }
        return new Response().failure("设置删除失败");
    }


}
