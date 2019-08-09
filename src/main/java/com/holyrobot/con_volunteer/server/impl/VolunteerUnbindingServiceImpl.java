package com.holyrobot.con_volunteer.server.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.holyrobot.con_common.pojo.UnbindStatusVo;
import com.holyrobot.con_volunteer.mapper.VolunteerApplicationMapper;
import com.holyrobot.con_volunteer.mapper.VolunteerApplicationRecordMapper;
import com.holyrobot.con_volunteer.mapper.VolunteerStoreUnbindingRecordMapper;
import com.holyrobot.con_volunteer.pojo.*;
import com.holyrobot.response.Response;
import com.holyrobot.con_volunteer.server.VolunteerUnbindingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @ClassName： VolunteerUnbindingServiceImpl
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2019-2-28 16:24
 * @Version: 1.0
 * @Modified By:
 */
@Slf4j
@Service
public class VolunteerUnbindingServiceImpl implements VolunteerUnbindingService {

    @Autowired
    private VolunteerStoreUnbindingRecordMapper volunteerStoreUnbindingRecordMapper;
    @Autowired
    private VolunteerApplicationMapper volunteerApplicationMapper;
    @Autowired
    private VolunteerApplicationRecordMapper volunteerApplicationRecordMapper;

    @Value("${Volunteer.ImgPath}")
    private String imgPath;


    /**
     * @Description: 志愿者--申请解绑接口
     * @auther: 史迪旻
     * @date: 17:32 2019-2-28
     * @param: [param]
     * @return: com.holyrobot.response.Response
     */
    @Override
    @Transactional
    public Response submitUnbindApp(JSONObject param) {
        String userId = param.getString("userId");
        String orgId = param.getString("orgId");
        String appReason = param.getString("appReason");//解绑原因
        String id = UUID.randomUUID().toString();
        String volAppId = null;

        VolunteerApplicationExample applicationExample = new VolunteerApplicationExample();
        applicationExample.or().andOrgidEqualTo(orgId).andUseridEqualTo(userId).andDatastatusEqualTo(1);
        List<VolunteerApplication> volunteerApplications = volunteerApplicationMapper.selectByExample(applicationExample);
        VolunteerApplication volunteerApplication = null;
        if (volunteerApplications != null && volunteerApplications.size() > 0) {
            volunteerApplication = volunteerApplications.get(0);
            volAppId = volunteerApplication.getId();
            volunteerApplication.setDatastatus(5);
            int i = volunteerApplicationMapper.updateByPrimaryKeySelective(volunteerApplication);
            if (i != 1) {
                log.info("/submitUnbindApp接口: 用户申请记录更新失败");
                return new Response().failure("系统繁忙");
            }
            log.info("/submitUnbindApp接口: volunteerApplication设置申请解绑成功");

        } else {
            return new Response().failure("申请已提交,请耐心等待专员审核");
        }

//        解绑记录插入
        VolunteerStoreUnbindingRecordExample example = new VolunteerStoreUnbindingRecordExample();
        example.or().andVolappidEqualTo(volAppId).andOrgidEqualTo(orgId).andUseridEqualTo(userId).andStorestatusEqualTo(0);
        List<VolunteerStoreUnbindingRecord> volunteerStoreUnbindingRecords = volunteerStoreUnbindingRecordMapper.selectByExample(example);
        if (volunteerStoreUnbindingRecords != null && volunteerStoreUnbindingRecords.size() > 0) {
            return new Response().failure("申请已提交,请耐心等待专员审核");
        } else {
            VolunteerStoreUnbindingRecord record = new VolunteerStoreUnbindingRecord();
            record.setId(id);
            record.setVolappid(volAppId);
            record.setOrgid(orgId);
            record.setUserid(userId);
            record.setStorestatus(0);
            record.setAppreason(appReason);
            record.setReasondate(new Date());

            int i = volunteerStoreUnbindingRecordMapper.insertSelective(record);
            if (i != 1) {
                log.info("/submitUnbindApp接口: 用户解绑记录更新失败");
                return new Response().failure("系统繁忙");
            }
            log.info("/submitUnbindApp接口: 解除绑定记录插入成功");

//            志愿者申请记录插入
            VolunteerApplicationRecord applicationRecord = new VolunteerApplicationRecord();
            String uId = UUID.randomUUID().toString();
            applicationRecord.setId(uId);
            applicationRecord.setVolappid(volunteerApplication.getId());
            applicationRecord.setOrgid(volunteerApplication.getOrgid());
            applicationRecord.setUserid(volunteerApplication.getUserid());
            applicationRecord.setRecord(5);
            applicationRecord.setCreatedate(new Date());
            applicationRecord.setCreateby(volunteerApplication.getUsername());
            applicationRecord.setInformation(JSON.toJSONString(volunteerApplication, SerializerFeature.WriteDateUseDateFormat
            ));

            int j = volunteerApplicationRecordMapper.insertSelective(applicationRecord);
            if (j != 1) {
                log.info("/submitUnbindApp接口: 志愿者申请记录提交失败");
                return new Response().failure("系统繁忙");
            }

//            删除原有的二维码图片
            String imgName = "volunteer_" + userId + "_" + orgId + ".jpg";
            File file = new File(imgPath + imgName);
            if (file.exists()) {
                boolean delete = file.delete();
                if (delete) {
                    log.info("/submitUnbindApp接口: 原二维码删除成功");
                } else {
                    log.info("/submitUnbindApp接口: 原二维码删除失败");
                    return new Response().failure("系统繁忙");
                }
            }

            return new Response().success("提交成功");
        }

    }


    /**
     * @Description: 志愿者--查询解绑申请记录
     * @auther: 史迪旻
     * @date: 17:37 2019-2-28
     * @param: [orgId, userId]
     * @return: com.holyrobot.response.Response
     */
    @Override
    public Response getUnbindInfo(String orgId, String userId) {
        VolunteerStoreUnbindingRecordExample example = new VolunteerStoreUnbindingRecordExample();
        example.or().andOrgidEqualTo(orgId).andUseridEqualTo(userId);
        List<VolunteerStoreUnbindingRecord> volunteerStoreUnbindingRecords = volunteerStoreUnbindingRecordMapper.selectByExample(example);
        log.info("/getUnbindInfo接口：数据查询成功");

        return new Response().success(volunteerStoreUnbindingRecords);
    }


    /**
     * @Description: 志愿者--解绑页面头部信息
     * @auther: 史迪旻
     * @date: 14:00 2019-3-1
     * @param: [orgId, userId]
     * @return: com.holyrobot.response.Response
     */
    @Override
    public Response getUnbindStatus(String orgId, String userId) {
        VolunteerApplicationExample example = new VolunteerApplicationExample();
        example.or().andOrgidEqualTo(orgId).andUseridEqualTo(userId);
        List<VolunteerApplication> volunteerApplications = volunteerApplicationMapper.selectByExample(example);
        if (volunteerApplications != null && volunteerApplications.size() > 0) {
            VolunteerApplication volunteerApplication = volunteerApplications.get(0);
            UnbindStatusVo unbindStatusVo = new UnbindStatusVo();
            unbindStatusVo.setTravelAgencyName(volunteerApplication.getTravelagencyname());
            unbindStatusVo.setShopHeadPortrait(volunteerApplication.getShopheadportrait());
            unbindStatusVo.setShopName(volunteerApplication.getShopname());
            unbindStatusVo.setDataStatus(volunteerApplication.getDatastatus());
            log.info("/getUnbindStatus接口：数据查询成功 {}", unbindStatusVo);

            return new Response().success(unbindStatusVo);
        }
        return new Response().failure("没有对应店铺信息");
    }


    /**
     * @Description: 志愿者--取消解绑操作
     * @auther: 史迪旻
     * @date: 14:35 2019-3-1
     * @param: [orgId, userId]
     * @return: com.holyrobot.response.Response
     */
    @Override
    @Transactional
    public Response cancelUnbinding(String orgId, String userId) {
        VolunteerStoreUnbindingRecordExample recordExample = new VolunteerStoreUnbindingRecordExample();
        recordExample.or().andOrgidEqualTo(orgId).andUseridEqualTo(userId).andStorestatusEqualTo(0);
        List<VolunteerStoreUnbindingRecord> volunteerStoreUnbindingRecords = volunteerStoreUnbindingRecordMapper.selectByExample(recordExample);
        if (volunteerStoreUnbindingRecords != null && volunteerStoreUnbindingRecords.size() > 0) {
            VolunteerStoreUnbindingRecord volunteerStoreUnbindingRecord = volunteerStoreUnbindingRecords.get(0);
            volunteerStoreUnbindingRecord.setStorestatus(-2);
            volunteerStoreUnbindingRecord.setRemarks("用户已自行取消");

            int i = volunteerStoreUnbindingRecordMapper.updateByPrimaryKeySelective(volunteerStoreUnbindingRecord);
            if (i != 1) {
                log.info("/cancelUnbinding接口：志愿者解绑表更新失败");
                return new Response().failure("取消失败");
            }

            VolunteerApplication volunteerApplication = volunteerApplicationMapper.selectByPrimaryKey(volunteerStoreUnbindingRecord.getVolappid());
            volunteerApplication.setDatastatus(1);

            int j = volunteerApplicationMapper.updateByPrimaryKeySelective(volunteerApplication);
            log.info("/cancelUnbinding接口：店铺状态与解绑状态更改成功");
            if (j != 1) {
                log.info("/cancelUnbinding接口：店铺状态更新失败");
                return new Response().failure("取消失败");
            }

//              志愿者申请记录插入
            VolunteerApplicationRecord applicationRecord = new VolunteerApplicationRecord();
            String uId = UUID.randomUUID().toString();
            applicationRecord.setId(uId);
            applicationRecord.setVolappid(volunteerApplication.getId());
            applicationRecord.setOrgid(volunteerApplication.getOrgid());
            applicationRecord.setUserid(volunteerApplication.getUserid());
            applicationRecord.setRecord(-3);
            applicationRecord.setCreatedate(new Date());
            applicationRecord.setCreateby(volunteerApplication.getUsername());
            applicationRecord.setInformation(JSON.toJSONString(volunteerApplication, SerializerFeature.WriteDateUseDateFormat
            ));

            int k = volunteerApplicationRecordMapper.insertSelective(applicationRecord);
            if (k != 1) {
                log.info("/cancelUnbinding接口: 志愿者申请记录提交失败");
                return new Response().failure("系统繁忙");
            }

            return new Response().success("取消成功");
        }

        return new Response().failure("取消失败");
    }


}
