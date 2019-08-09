package com.holyrobot.con_volunteer.server.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.holyrobot.con_mongo.server.MongoService;
import com.holyrobot.dto.mongo.NTFoxMessageCollection;
import com.holyrobot.con_volunteer.mapper.*;
import com.holyrobot.con_volunteer.pojo.*;
import com.holyrobot.response.Response;
import com.holyrobot.con_volunteer.server.TravelerProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;


/**
 * @Description:
 * @Auther: 何晓波
 * @Date: 2019/4/8 15:26
 */
@Service
@Slf4j
public class TravelerProductServiceImpl implements TravelerProductService{

    @Autowired
    private TravelerUnbindingAndFreezeMapper travelerUnbindingAndFreezeMapper;
    @Autowired
    private VolunteerApplicationMapper volunteerApplicationMapper;
    @Autowired
    private TravelerRewardWithdrawDepositMapper travelerRewardWithdrawDepositMapper;
    @Autowired
    private TravelerRewardRecordingMapper travelerRewardRecordingMapper;
    @Autowired
    private VolunteerApplicationRecordMapper volunteerApplicationRecordMapper;
    @Autowired
    private MongoService mongoService;
    @Autowired
    private VolunteerParentMapper volunteerParentMapper;

    @Override
    public Response addTravelerBindMes(TravelerUnbindingAndFreeze param) {
        String Id = UUID.randomUUID().toString();
        param.setId(Id);
        param.setReasondate(new Date());
        int result = travelerUnbindingAndFreezeMapper.insert(param);
        if (result != 1) {
            log.info("/addTravelerBindMes接口: 旅行家踢除,冻结，解除提交失败");
            return new Response().failure("旅行家踢除,冻结，解除提交失败");
        }
        //更新基表的状态
        HashMap<String,Object> map = new HashMap<String,Object>();
        map.put("userId",param.getChildid());
        map.put("orgId",param.getOrgid());
        map.put("dataStatus",param.getDatastatus());
        int i = volunteerApplicationMapper.updateDataStatusById(map);
        if (i != 1) {
            log.info("/addTravelerBindMes接口: 更新基表状态失败");
            return new Response().failure("更新基表状态失败");
        }
        return new Response().success(param);
    }

    @Override
    public Response getTravelerInfoDown(String orgId, String userId) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("orgId",orgId);
        map.put("userId",userId);
        List<HashMap<String,Object>> volunteerApplication = volunteerApplicationMapper.getTravelerInfoDown(map);
        return  new Response().success(volunteerApplication);
    }

    @Override
    public Response getTravelerInfoUp(String orgId, String userId) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("orgId",orgId);
        map.put("userId",userId);
        List<HashMap<String,Object>> volunteerApplication = volunteerApplicationMapper.getTravelerInfoUp(map);
        return  new Response().success(volunteerApplication);
    }

    @Override
    public Response addAllowanceReward(TravelerRewardWithdrawDeposit param) {
        String Id = UUID.randomUUID().toString();
        param.setId(Id);
        param.setCreateddate(new Date());
        param.setApplyuserid(null);
        param.setAudituserid(null);
        param.setPayuserid(null);
        param.setParentid(param.getChildid());
        param.setDatastatus(0);
        param.setFinauditdatastatus(-1);
        int result = travelerRewardWithdrawDepositMapper.insert(param);
        if (result != 1) {
            log.info("/getAllowanceReward接口: 申请提现失败");
            return new Response().failure("申请提现失败");
        }
        return new Response().success(param);
    }

    @Override
    public Response getAllowance(String orgId, String userId) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("orgId",orgId);
        map.put("userId",userId);
        List<HashMap<String,Object>> result = travelerRewardRecordingMapper.getAllowance(map);
        return new Response().success(result.get(0));
    }

    @Override
    public Response getAllowanceRecording(String orgId, String userId) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("orgId",orgId);
        map.put("userId",userId);
        List<HashMap<String,Object>> result = travelerRewardRecordingMapper.getAllowanceRecording(map);
        return new Response().success(result);
    }

    @Override
    public Response getAllowanceWithReward(String orgId, String userId) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("orgId",orgId);
        map.put("userId",userId);
        List<HashMap<String,Object>> result = travelerRewardRecordingMapper.getAllowanceWithReward(map);
        return new Response().success(result);
    }

    @Override
    public Response addTravelerAppication(VolunteerApplication volunteerApplication, String parentId) {
        String userid = volunteerApplication.getUserid();
        String orgid = volunteerApplication.getOrgid();

        if (volunteerApplication.getPaytype().equals("请选择")) {
            volunteerApplication.setPaytype("");
        }
        volunteerApplication.setInfostatus(0);//添加用户信息类型 设置为旅行家
//        验证用户是否已有店铺
        VolunteerApplicationExample volunteerApplicationExample = new VolunteerApplicationExample();
        volunteerApplicationExample.or().andUseridEqualTo(userid).andDatastatusIn(Arrays.asList(0, 1, 2, 5));
        List<VolunteerApplication> applications = volunteerApplicationMapper.selectByExample(volunteerApplicationExample);
        if (applications != null & applications.size() > 0) {
            return new Response().failure("该用户已有店铺");
        }

        //取父级信息
        VolunteerApplicationExample exam1 = new VolunteerApplicationExample();
        exam1.or().andOrgidEqualTo(orgid).andUseridEqualTo(parentId);
        List<VolunteerApplication> volunteerApplications1 = volunteerApplicationMapper.selectByExample(exam1);
//        判断是否为取消后又申请的用户
        VolunteerApplicationExample example = new VolunteerApplicationExample();
        example.or().andOrgidEqualTo(orgid).andUseridEqualTo(userid);
        List<VolunteerApplication> volunteerApplications = volunteerApplicationMapper.selectByExample(example);
        if (volunteerApplications != null && volunteerApplications.size() > 0) {
            VolunteerApplication application = volunteerApplications.get(0);
            application.setUserid(userid);
            application.setOrgid(orgid);
            application.setTravelagencyname(volunteerApplication.getTravelagencyname());
            application.setUsername(volunteerApplication.getUsername());
            application.setUsercard(volunteerApplication.getUsercard());
            application.setUsercardurl(volunteerApplication.getUsercardurl());
            application.setPhone(volunteerApplication.getPhone());
            application.setTacontact(volunteerApplication.getTacontact());
            application.setShopname(volunteerApplication.getShopname());
            application.setShopheadportrait(volunteerApplication.getShopheadportrait());
            application.setPaytype(volunteerApplication.getPaytype());
            application.setDepositbank(volunteerApplication.getDepositbank());
            application.setCardno(volunteerApplication.getCardno());
            application.setDatastatus(0);
            application.setCreateddate(new Date());
            application.setRemark(null);
            application.setAutoupdate(-1);
            application.setInfostatus(0);

            int i = volunteerApplicationMapper.updateByPrimaryKeySelective(application);
            if (i != 1) {
                log.info("/addTravelerAppication接口: 志愿者申请信息更新失败");
                return new Response().failure("系统繁忙");
            }
            log.info("/addTravelerAppication接口：已有用户更新数据成功");




//      旅行家申请记录插入
            VolunteerApplicationRecord applicationRecord = new VolunteerApplicationRecord();
            String uId = UUID.randomUUID().toString();
            applicationRecord.setId(uId);
            applicationRecord.setVolappid(application.getId());
            applicationRecord.setOrgid(orgid);
            applicationRecord.setUserid(userid);
            applicationRecord.setRecord(0);
            applicationRecord.setCreatedate(new Date());
            //取旅行家上一级信息
            if(volunteerApplications1!=null&&volunteerApplications1.size()>0){
                applicationRecord.setCreateby(volunteerApplications1.get(0).getUsername());
            } else{
                applicationRecord.setCreateby(application.getUsername());
            }
            applicationRecord.setInformation(JSON.toJSONString(application, SerializerFeature.WriteDateUseDateFormat
            ));
            applicationRecord.setInfostatus(application.getInfostatus());

            //插入对象


            if(volunteerApplications1!=null&&volunteerApplications1.size()>0){
                applicationRecord.setInformationparent(JSON.toJSONString(volunteerApplications1.get(0), SerializerFeature.WriteDateUseDateFormat
                ));
            }

            //插入父子关联表
            VolunteerParent volunteerParent = new VolunteerParent();
            volunteerParent.setId(UUID.randomUUID().toString());
            volunteerParent.setParentid(parentId);
            volunteerParent.setChildid(userid);
            volunteerParent.setOrgid(orgid);
            volunteerParent.setCreateddate(new Date());
            volunteerParent.setParentstatus(0);
            volunteerParentMapper.insert(volunteerParent);

            int j = volunteerApplicationRecordMapper.insertSelective(applicationRecord);
            if (j != 1) {
                log.info("/uploadData接口: 志愿者申请记录提交失败");
                return new Response().failure("系统繁忙");
            }

            NTFoxMessageCollection collection = new NTFoxMessageCollection();
            String cid = UUID.randomUUID().toString();
            collection.setId(cid);
            collection.setID(cid);
            collection.setReceiverID(orgid);
            collection.setSenderID(userid);
            collection.setSender(volunteerApplication.getUsername());
            collection.setMessageTitle(volunteerApplication.getUsername() + "申请成为旅游志愿者，待审核。");
            collection.setMessageBody("用户" + volunteerApplication.getUsername() + "申请成为旅游志愿者，请尽快审批。");
            collection.setCreatedDate(new Date());
            collection.setDataStatus(1);
            mongoService.add(collection);
            log.info("/uploadData接口: mongo插入成功 collection {}", collection);

            return new Response().success(application);
        }

//        新用户
        Date date = new Date();
        String id = UUID.randomUUID().toString();
        volunteerApplication.setId(id);
        volunteerApplication.setDatastatus(0);
        volunteerApplication.setCreateddate(date);
        volunteerApplication.setAutoupdate(-1);
        volunteerApplication.setInfostatus(0);
        log.info("/uploadData接口：开始写入信息参数={}", JSON.toJSONString(volunteerApplication));
        int i = volunteerApplicationMapper.insert(volunteerApplication);
        if (i != 1) {
            log.info("/uploadData接口: 志愿者申请信息提交失败");
            return new Response().failure("系统繁忙");
        }

//        志愿者申请记录插入
        VolunteerApplicationRecord applicationRecord = new VolunteerApplicationRecord();
        String uId = UUID.randomUUID().toString();
        applicationRecord.setId(uId);
        applicationRecord.setVolappid(id);
        applicationRecord.setOrgid(orgid);
        applicationRecord.setUserid(userid);
        applicationRecord.setRecord(0);
        applicationRecord.setCreatedate(new Date());
        //applicationRecord.setCreateby(volunteerApplication.getUsername());
        //取旅行家上一级信息
        if(volunteerApplications1!=null&&volunteerApplications1.size()>0){
            applicationRecord.setCreateby(volunteerApplications1.get(0).getUsername());
        } else{
            applicationRecord.setCreateby(volunteerApplication.getUsername());
        }
        applicationRecord.setInformation(JSON.toJSONString(volunteerApplication, SerializerFeature.WriteDateUseDateFormat
        ));

        int j = volunteerApplicationRecordMapper.insertSelective(applicationRecord);
        if (j != 1) {
            log.info("/uploadData接口: 志愿者申请记录提交失败");
            return new Response().failure("系统繁忙");
        }
        //插入父子关联表
        VolunteerParent volunteerParent = new VolunteerParent();
        volunteerParent.setId(UUID.randomUUID().toString());
        volunteerParent.setParentid(parentId);
        volunteerParent.setChildid(userid);
        volunteerParent.setOrgid(orgid);
        volunteerParent.setCreateddate(new Date());
        volunteerParent.setParentstatus(0);
        volunteerParentMapper.insert(volunteerParent);


        NTFoxMessageCollection collection = new NTFoxMessageCollection();
        String cid = UUID.randomUUID().toString();
        collection.setId(cid);
        collection.setID(cid);
        collection.setReceiverID(orgid);
        collection.setSenderID(userid);
        collection.setSender(volunteerApplication.getUsername());
        collection.setMessageTitle(volunteerApplication.getUsername() + "申请成为旅游志愿者，待审核。");
        collection.setMessageBody("用户" + volunteerApplication.getUsername() + "申请成为旅游志愿者，请尽快审批。");
        collection.setCreatedDate(new Date());
        collection.setDataStatus(1);
        mongoService.add(collection);
        log.info("/uploadData接口: mongo插入成功 collection {}", collection);

        return new Response().success(volunteerApplication);
    }

    @Override
    public Response updateTravelerAppication(String orgId, String userId, String parentId) {
        /*VolunteerApplication volunteerApplication = new VolunteerApplication();
        volunteerApplication.setDatastatus(-2);
        VolunteerApplicationExample volunteerApplicationExample = new VolunteerApplicationExample();
        volunteerApplicationExample.or().andOrgidEqualTo(orgId).andUseridEqualTo(userId);
        volunteerApplicationMapper.updateByExampleSelective(volunteerApplication, volunteerApplicationExample)*/
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("orgId",orgId);
        map.put("userId",userId);
        map.put("parentId",parentId);
        int i = volunteerApplicationMapper.updateTravelerAppication(map);
        if (i != 3) {
            log.info("/updateTravelerAppication接口: 取消提交申请失败");
            return new Response().failure("取消提交申请失败");
        }
        return new Response().success();
    }

    @Override
    public Response getTravelerBindList(String orgId, String userId, String parentId) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("orgId", orgId);
        map.put("userId", userId);
        map.put("parentId", parentId);
        List<TravelerUnbindingAndFreeze> result =  travelerUnbindingAndFreezeMapper.getTravelerBindList(map);
        return new Response().success(result);
    }

    @Override
    public Response toTravellerShop(String orgId, String userId, String parentId) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("orgId", orgId);
        map.put("userId", userId);
        map.put("parentId", parentId);
        List<HashMap<String, Object>> result =  volunteerParentMapper.toTravellerShop(map);
        return new Response().success(result);
    }

    @Override
    public Response travellerList(String orgId, String userId) {
        VolunteerApplicationRecordExample exam = new VolunteerApplicationRecordExample();
        exam.or().andOrgidEqualTo(orgId).andUseridEqualTo(userId);
        List<VolunteerApplicationRecord> volunteerApplicationRecords = volunteerApplicationRecordMapper.selectByExample(exam);
        return new Response().success(volunteerApplicationRecords);
    }
}
