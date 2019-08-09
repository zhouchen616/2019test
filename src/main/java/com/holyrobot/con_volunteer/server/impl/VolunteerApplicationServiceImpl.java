package com.holyrobot.con_volunteer.server.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.holyrobot.con_mongo.server.MongoService;
import com.holyrobot.con_om.mapper.OmProtocolMapper;
import com.holyrobot.con_om.pojo.OmProtocol;
import com.holyrobot.con_om.pojo.OmProtocolExample;
import com.holyrobot.con_volunteer.mapper.VolunteerApplicationMapper;
import com.holyrobot.con_volunteer.mapper.VolunteerApplicationRecordMapper;
import com.holyrobot.con_volunteer.mapper.VolunteerParentMapper;
import com.holyrobot.constant.Constants;
import com.holyrobot.dto.ErpUserDto;
import com.holyrobot.dto.OrgInfoExtensionDto;
import com.holyrobot.dto.mongo.NTFoxMessageCollection;
import com.holyrobot.con_volunteer.pojo.*;
import com.holyrobot.response.Response;
import com.holyrobot.con_volunteer.server.VolunteerApplicationService;
import com.holyrobot.con_volunteer.server.VolunteerProductService;
import com.holyrobot.util.HttpResponse;
import com.holyrobot.util.HttpUtils;
import com.holyrobot.util.messageutils.HttpRequest;
import com.holyrobot.util.messageutils.MD5Gen;
import com.holyrobot.util.messageutils.TimeUtils;
import com.holyrobot.util.qrcode.QRCodeUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.net.URLEncoder;
import java.util.*;

/**
 * @ClassName： VolunteerApplicationServiceImpl
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2019-2-20 11:10
 * @Version: 1.0
 * @Modified By:
 */
@Service
@Slf4j
public class VolunteerApplicationServiceImpl implements VolunteerApplicationService {
    @Value("${lvyLogo}")
    private String lvyLogo;
    @Value("${sendMessageUrl}")
    private String sendMessageUrl;
    @Value("${messageUserName}")
    private String messageUserName;  //账e号
    @Value("${messagePassWord}")
    private String messagePassWord;  //密码
    @Value("${Volunteer.UserCardPath}")
    private String userCardPath;
    @Value("${Volunteer.ShopHeadPath}")
    private String shopHeadPath;
    @Value("${Volunteer.UserCardDownload}")
    private String userCardDownload;
    @Value("${Volunteer.ShopHeadDownload}")
    private String shopHeadDownload;
    @Value("${h5Url}")
    private String h5Url;
    @Value("${Volunteer.ImgPath}")
    private String imgPath;
    @Value("${Volunteer.ImgUrl}")
    private String imgUrl;
    @Value("${airPortUrl.getSupplierNameByID}")
    private String getSupplierNameByID;
    @Value("${airPortUrl.getUserUrl}")
    private String getUserUrl;
    @Value("${airPortUrl.getOrgInfoUrl}")
    private String getOrgInfoUrl;
    @Autowired
    private VolunteerProductService volunteerProductService;
    @Autowired
    private VolunteerApplicationRecordMapper volunteerApplicationRecordMapper;
    @Autowired
    private VolunteerApplicationMapper volunteerApplicationMapper;
    @Autowired
    private OmProtocolMapper omProtocolMapper;
    @Autowired
    private MongoService mongoService;
    @Autowired
    private VolunteerParentMapper volunteerParentMapper;


    /**
     * @Description: 添加旅游志愿者信息
     * @auther: 史迪旻
     * @date: 11:12 2019-2-20
     * @param: [volunteerApplication]
     * @return: com.holyrobot.response.Response
     * @update 2019-04-08 hxb
     */
    @Override
    @Transactional
    public Response insertVolInfo(VolunteerApplication volunteerApplication) {
        String userid = volunteerApplication.getUserid();
        String orgid = volunteerApplication.getOrgid();

        if (volunteerApplication.getPaytype().equals("请选择")) {
            volunteerApplication.setPaytype("");
        }

//        验证用户是否已有店铺
        VolunteerApplicationExample volunteerApplicationExample = new VolunteerApplicationExample();
        volunteerApplicationExample.or().andUseridEqualTo(userid).andDatastatusIn(Arrays.asList(0, 1, 2, 5));
        List<VolunteerApplication> applications = volunteerApplicationMapper.selectByExample(volunteerApplicationExample);
        if (applications != null & applications.size() > 0) {
            return new Response().failure("该用户已有店铺");
        }

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
            application.setInfostatus(1);

            int i = volunteerApplicationMapper.updateByPrimaryKeySelective(application);
            if (i != 1) {
                log.info("/uploadData接口: 志愿者申请信息更新失败");
                return new Response().failure("系统繁忙");
            }
            log.info("/insertVolInfo接口：已有用户更新数据成功");

//            志愿者申请记录插入
            VolunteerApplicationRecord applicationRecord = new VolunteerApplicationRecord();
            String uId = UUID.randomUUID().toString();
            applicationRecord.setId(uId);
            applicationRecord.setVolappid(application.getId());
            applicationRecord.setOrgid(orgid);
            applicationRecord.setUserid(userid);
            applicationRecord.setRecord(0);
            applicationRecord.setCreatedate(new Date());
            applicationRecord.setCreateby(application.getUsername());
            applicationRecord.setInformation(JSON.toJSONString(application, SerializerFeature.WriteDateUseDateFormat
            ));

            int j = volunteerApplicationRecordMapper.insertSelective(applicationRecord);
            if (j != 1) {
                log.info("/uploadData接口: 志愿者申请记录提交失败");
                return new Response().failure("系统繁忙");
            }

            return new Response().success(application);
        }

//        新用户
        Date date = new Date();
        String id = UUID.randomUUID().toString();
        volunteerApplication.setId(id);
        volunteerApplication.setDatastatus(0);
        volunteerApplication.setCreateddate(date);
        volunteerApplication.setAutoupdate(-1);
        volunteerApplication.setInfostatus(1);
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
        applicationRecord.setCreateby(volunteerApplication.getUsername());
        applicationRecord.setInformation(JSON.toJSONString(volunteerApplication, SerializerFeature.WriteDateUseDateFormat
        ));

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

        return new Response().success(volunteerApplication);
    }


    /**
     * @Description: 身份证验重
     * @auther: 史迪旻
     * @date: 11:28 2019-2-20
     * @param: [userCard]
     * @return: com.holyrobot.response.Response
     */
    @Override
    public Response judgeUserCard(String userCard) {
        log.info("/judgeUserCard接口：开始身份证查重");
        List<Integer> integers = Arrays.asList(0, 1, 2, 5);
        VolunteerApplicationExample example = new VolunteerApplicationExample();
        example.or().andUsercardEqualTo(userCard).andDatastatusIn(integers);
        List<VolunteerApplication> hasList = volunteerApplicationMapper.selectByExample(example);

        if (hasList.size() > 0) {
            log.info("/judgeUserCard接口：信息有重复");
            return new Response().failure();
        }

        return new Response().success();
    }


    /**
     * @Description: 店铺名验重
     * @auther: 史迪旻
     * @date: 15:11 2019-2-21
     * @param: [shopName]
     * @return: com.holyrobot.response.Response
     */
    @Override
    public Response judgeShopName(String shopName) {
        log.info("/judgeShopName接口：开始店铺名查重");
        List<Integer> integers = Arrays.asList(0, 1, 2, 5);
        VolunteerApplicationExample example = new VolunteerApplicationExample();
        example.or().andShopnameEqualTo(shopName).andDatastatusIn(integers);
        List<VolunteerApplication> hasList = volunteerApplicationMapper.selectByExample(example);

        if (hasList.size() > 0) {
            log.info("/judgeShopName接口：信息有重复");
            return new Response().failure();
        }

        return new Response().success();
    }


    /**
     * @Description: 发送验证码
     * @auther: 史迪旻
     * @date: 15:23 2019-2-20
     * @param: [httpRequest, param]
     * @return: com.holyrobot.response.Response
     */
    @Override
    public Response notificationSMS(JSONObject param) {
        log.info("/notificationSMS接口参数:{}", param);
        String travelAgencyName = param.getString("travelAgencyName"); //旅行社名称
        String mobile = param.getString("phone");
        String tkey = TimeUtils.getNowTime("yyyyMMddHHmmss");
        String sms = "尊敬的用户，您的旅游志愿者申请已提交成功，请耐心等待 " + travelAgencyName + " 审核，审核结果将会以短信的方式通知您。您也可以在 " + travelAgencyName + " 微店下方点击“我的”查看审核结果或修改信息。【竞界科技】";   //内容
        String xh = "";
        String content = "";
        try {
            content = URLEncoder.encode(sms, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String params = "url=" + sendMessageUrl + "&username=" + messageUserName + "&password=" + MD5Gen.getMD5(MD5Gen.getMD5(messagePassWord) + tkey) + "&tkey=" + tkey + "&mobile=" + mobile + "&content=" + content + "&xh=" + xh;
        String ret = HttpRequest.sendPost(sendMessageUrl, params);//定时信息只可为post方式提交
        log.info("/notificationSMS短信内容:{}", ret);

        return new Response().success();
    }


    /**
     * @Description: 身份证上传
     * @auther: 史迪旻
     * @date: 16:17 2019-2-20
     * @param: [file]
     * @return: com.holyrobot.response.Response
     */
    @Override
    public Response uploadUserCard(MultipartFile file) {

        if (file != null) {
//          获得文件后缀名
            String originalFilename = file.getOriginalFilename();
            String substring = originalFilename.substring(originalFilename.lastIndexOf("."));
//          拼上后缀名
            String imageName = UUID.randomUUID().toString() + substring;

            try {
                BufferedInputStream bis = new BufferedInputStream(file.getInputStream());
                FileOutputStream fos = new FileOutputStream(userCardPath + imageName);
                BufferedOutputStream bos = new BufferedOutputStream(fos);
                log.info("/uploadUserCard接口：身份证图片开始写入磁盘");
                byte[] buffer = new byte[bis.available()];
                int length = bis.read(buffer);

                while (length != -1) {
                    bos.write(buffer, 0, length);
                    length = bis.read(buffer);
                }

                bos.flush();
                bis.close();
                bos.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

            return new Response().success(userCardDownload + imageName);
//            return new Response().success(userCardDownload);
        }

        return new Response().failure();
    }


    /**
     * @Description: 店铺头像上传
     * @auther: 史迪旻
     * @date: 16:17 2019-2-20
     * @param: [file]
     * @return: com.holyrobot.response.Response
     */
    @Override
    public Response uploadHeadPortrait(MultipartFile file) {

        if (file != null) {
//          获得文件后缀名
            String originalFilename = file.getOriginalFilename();
            String substring = originalFilename.substring(originalFilename.lastIndexOf("."));
//          拼上后缀名
            String imageName = UUID.randomUUID().toString() + substring;

            try {
                BufferedInputStream bis = new BufferedInputStream(file.getInputStream());
                FileOutputStream fos = new FileOutputStream(shopHeadPath + imageName);
                BufferedOutputStream bos = new BufferedOutputStream(fos);
                log.info("/uploadHeadPortrait接口：店铺头像图片开始写入磁盘");

                byte[] buffer = new byte[bis.available()];
                int length = bis.read(buffer);

                while (length != -1) {
                    bos.write(buffer, 0, length);
                    length = bis.read(buffer);
                }

                bos.flush();
                bis.close();
                bos.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
            return new Response().success(shopHeadDownload + imageName);
//            return new Response().success(shopHeadDownload);
        }

        return new Response().failure();
    }


    /**
     * @Description: 旅游志愿者申请信息修改--获取原信息
     * @auther: 史迪旻
     * @date: 09:04 2019-2-21
     * @param: [orgId, userId]
     * @return: com.holyrobot.response.Response
     */
    @Override
    public Response getVolInfo(String orgId, String userId, Integer dataStatus) {

        VolunteerApplicationExample example = new VolunteerApplicationExample();
        example.or().andOrgidEqualTo(orgId).andUseridEqualTo(userId).andDatastatusEqualTo(dataStatus);
        List<VolunteerApplication> volunteerApplications = volunteerApplicationMapper.selectByExample(example);
        log.info("/getInfo接口：volunteerApplications{}" + volunteerApplications);

        if (volunteerApplications.size() > 0) {
            return new Response().success(volunteerApplications.get(0));
        }
        return new Response().failure("没有可以更改的信息");
    }


    /**
     * @Description: 旅游志愿者申请信息修改--上传修改的信息
     * @auther: 史迪旻
     * @date: 09:19 2019-2-21
     * @param: [volunteerApplication]
     * @return: com.holyrobot.response.Response
     */
    @Override
    @Transactional
    public Response updateVolInfo(VolunteerApplication volunteerApplication) {
        volunteerApplication.setCreateddate(new Date());
        log.info("/updateVolInfo接口：volunteerApplication= {}" + volunteerApplication);

        int i = volunteerApplicationMapper.updateByPrimaryKey(volunteerApplication);
        if (i != 1) {
            log.info("/updateVolInfo接口：用户申请信息更新失败");
            return new Response().failure("系统繁忙");
        }
        log.info("/updateVolInfo接口：信息修改成功");

//        志愿者申请记录插入
        VolunteerApplicationRecord applicationRecord = new VolunteerApplicationRecord();
        String uId = UUID.randomUUID().toString();
        applicationRecord.setId(uId);
        applicationRecord.setVolappid(volunteerApplication.getId());
        applicationRecord.setOrgid(volunteerApplication.getOrgid());
        applicationRecord.setUserid(volunteerApplication.getUserid());
        applicationRecord.setRecord(6);
        applicationRecord.setCreatedate(new Date());
        applicationRecord.setCreateby(volunteerApplication.getUsername());
        applicationRecord.setInformation(JSON.toJSONString(volunteerApplication, SerializerFeature.WriteDateUseDateFormat
        ));

        int j = volunteerApplicationRecordMapper.insertSelective(applicationRecord);
        if (j != 1) {
            log.info("/updateVolInfo接口: 志愿者申请记录提交失败");
            return new Response().failure("系统繁忙");
        }

        return new Response().success();
    }


    /**
     * @Description: 旅游志愿者申请信息修改--取消申请
     * @auther: 史迪旻
     * @date: 09:40 2019-2-21
     * @param: [id]
     * @return: com.holyrobot.response.Response
     */
    @Override
    @Transactional
    public Response cancelVolApp(String orgId, String userId) {
        VolunteerApplicationExample example = new VolunteerApplicationExample();
        example.or().andOrgidEqualTo(orgId).andUseridEqualTo(userId);
        List<VolunteerApplication> volunteerApplications = volunteerApplicationMapper.selectByExample(example);

        VolunteerApplication volunteerApplication = null;
        if (Objects.nonNull(volunteerApplications) && volunteerApplications.size() > 0) {
            volunteerApplication = volunteerApplications.get(0);
            volunteerApplication.setDatastatus(-2);
            int i = volunteerApplicationMapper.updateByPrimaryKey(volunteerApplication);
            if (i != 1) {
                log.info("/cancelVolApp接口：志愿者信息更新失败");
                return new Response().failure("系统繁忙");
            }
            log.info("/cancelVolApp接口：取消成功");
        }

//        志愿者申请记录插入
        VolunteerApplicationRecord applicationRecord = new VolunteerApplicationRecord();
        String uId = UUID.randomUUID().toString();
        applicationRecord.setId(uId);
        applicationRecord.setVolappid(volunteerApplication.getId());
        applicationRecord.setOrgid(volunteerApplication.getOrgid());
        applicationRecord.setUserid(volunteerApplication.getUserid());
        applicationRecord.setRecord(-2);
        applicationRecord.setCreatedate(new Date());
        applicationRecord.setCreateby(volunteerApplication.getUsername());
        applicationRecord.setInformation(JSON.toJSONString(volunteerApplication, SerializerFeature.WriteDateUseDateFormat
        ));

        int j = volunteerApplicationRecordMapper.insertSelective(applicationRecord);
        if (j != 1) {
            log.info("/uploadData接口: 志愿者申请记录提交失败");
            return new Response().failure("系统繁忙");
        }

        return new Response().success();
    }


    /**
     * @Description: 旅游志愿者申请状态
     * @auther: 史迪旻
     * @date: 09:57 2019-2-21
     * @param: [orgId, userId]
     * @return: com.holyrobot.response.Response
     */
    @Override
    public Response getVolAppStatus(String orgId, String userId, String parentId) {
        log.info("/getVolAppStatus接口：volunteerApplications orgId={},userId={},parentId={}", orgId, userId, parentId);
        VolunteerApplicationExample example = new VolunteerApplicationExample();
        example.or().andOrgidEqualTo(orgId).andUseridEqualTo(userId);
        List<VolunteerApplication> volunteerApplications = volunteerApplicationMapper.selectByExample(example);
        Integer newUserType;
        Integer infoStatus = volunteerApplications.get(0).getInfostatus();
        if (infoStatus == 1) {
            newUserType = 4;
        } else {
            if (StringUtils.isEmpty(parentId) || parentId.equals("") || parentId.equals("null")) {
                VolunteerParentExample volunteerParentExample = new VolunteerParentExample();
                volunteerParentExample.or().andOrgidEqualTo(orgId).andParentidEqualTo(userId).andParentstatusEqualTo(1);
                List<VolunteerParent> volunteerParents = volunteerParentMapper.selectByExample(volunteerParentExample);
                if (volunteerParents != null && volunteerParents.size() > 0) {
                    newUserType = 6;
                } else {
                    newUserType = 5;
                }
            } else {
                VolunteerParentExample volunteerParentExample1 = new VolunteerParentExample();
                volunteerParentExample1.or().andOrgidEqualTo(orgId).andParentidEqualTo(userId).andParentstatusEqualTo(1);
                List<VolunteerParent> volunteerParents = volunteerParentMapper.selectByExample(volunteerParentExample1);
                if (volunteerParents != null && volunteerParents.size() > 0) {
                    newUserType = 6;
                } else {
                    newUserType = 5;
                }
            }
        }
        HashMap<String, Object> map = new HashMap<String, Object>();
        if (volunteerApplications != null && volunteerApplications.size() > 0) {
            Integer dataStatus = volunteerApplications.get(0).getDatastatus();
            log.info("/getVolAppStatus接口：dataStatus {}", dataStatus);
            map.put("dataStatus", dataStatus);
            map.put("newUserType", newUserType);
            return new Response().success(map);
        } else {
            map.put("newUserType", newUserType);
            map.put("dataStatus", 0);
        }

        return new Response().success(map);
    }


    /**
     * @Description: 旅游志愿者申请状态--拒绝原因
     * @auther: 史迪旻
     * @date: 18:13 2019-2-21
     * @param: [orgId, userId]
     * @return: com.holyrobot.response.Response
     */
    @Override
    public Response getDenialReason(String orgId, String userId, Integer dataStatus) {
        VolunteerApplicationExample example = new VolunteerApplicationExample();
        example.or().andOrgidEqualTo(orgId).andUseridEqualTo(userId).andDatastatusEqualTo(dataStatus);
        List<VolunteerApplication> volunteerApplications = volunteerApplicationMapper.selectByExample(example);
        if (volunteerApplications != null && volunteerApplications.size() > 0) {
            String remark = volunteerApplications.get(0).getRemark();
            log.info("/getDenialReason接口：拒绝原因{}", remark);
            return new Response().success(remark);
        }

        return new Response().failure("查无该信息");
    }


    /**
     * @Description: 志愿者店铺首页头部信息
     * @auther: 史迪旻
     * @date: 11:31 2019-2-22
     * @param: [orgId, userId]
     * @return: com.holyrobot.response.Response
     */
    @Override
    public Response getHeadInfo(String orgId, String userId) {
        VolunteerApplicationExample example = new VolunteerApplicationExample();
        example.or().andOrgidEqualTo(orgId).andUseridEqualTo(userId).andDatastatusIn(Arrays.asList(1, 5));
        List<VolunteerApplication> volunteerApplications = volunteerApplicationMapper.selectByExample(example);
        if (volunteerApplications != null && volunteerApplications.size() > 0) {
            VolunteerApplication volunteerApplication = volunteerApplications.get(0);
            String travelagencyname = volunteerApplication.getTravelagencyname();
            String shopname = volunteerApplication.getShopname();
            String shopheadportrait = volunteerApplication.getShopheadportrait();
            Integer autoupdate = volunteerApplication.getAutoupdate();

            VolunteerHeadInfoVo volunteerHeadInfoVo = new VolunteerHeadInfoVo();
            volunteerHeadInfoVo.setTravelAgencyName(travelagencyname);
            volunteerHeadInfoVo.setShopName(shopname);
            volunteerHeadInfoVo.setShopHeadPortRait(StringUtils.isBlank(shopheadportrait) ? lvyLogo : shopheadportrait);
            volunteerHeadInfoVo.setAutoUpdate(autoupdate);
            volunteerHeadInfoVo.setShopUserName(volunteerApplication.getUsername());
            log.info("/getHeadInfo接口：{}", JSON.toJSONString(volunteerHeadInfoVo));

            return new Response().success(volunteerHeadInfoVo);
        } else {
            return new Response().failure("查无数据");
        }

    }


    /**
     * @Description: 志愿者店铺--设置价格更新
     * @auther: 史迪旻
     * @date: 14:51 2019-2-28
     * @param: [volunteerShopAutoUpdate]
     * @return: com.holyrobot.response.Response
     */
    @Override
    @Transactional
    public Response setUpAuto(VolunteerShopAutoUpdate volunteerShopAutoUpdate) {
        String userId = volunteerShopAutoUpdate.getUserId();
        String orgId = volunteerShopAutoUpdate.getOrgId();
        VolunteerApplicationExample example = new VolunteerApplicationExample();
        example.or().andUseridEqualTo(userId).andOrgidEqualTo(orgId).andDatastatusEqualTo(1);
        List<VolunteerApplication> volunteerApplications = volunteerApplicationMapper.selectByExample(example);

        if (volunteerApplications != null && volunteerApplications.size() > 0) {
            VolunteerApplication volunteerApplication = volunteerApplications.get(0);
            volunteerApplication.setAutoupdate(volunteerShopAutoUpdate.getAutoUpdate());
            volunteerApplication.setAdjustmenttype(volunteerShopAutoUpdate.getAdjustmentType());
            volunteerApplication.setAdjustmentmethod(volunteerShopAutoUpdate.getAdjustmentMethod());
            volunteerApplication.setPercentage(volunteerShopAutoUpdate.getPercentage());
            volunteerApplication.setFixedamount(volunteerShopAutoUpdate.getFixedAmount());

            volunteerApplicationMapper.updateByPrimaryKey(volunteerApplication);
            //TODO zc 2019年3月7日 21:04:44 状态修改为开启时，上架所有新产品
            if (volunteerShopAutoUpdate.getAutoUpdate() == 1) {
                Response response = volunteerProductService.shopAutoUpdateAddProduct(volunteerShopAutoUpdate);
                log.info("状态修改为开启时，上架所有新产品返回值：{}", JSON.toJSONString(response));
            }
            return new Response().success("修改成功");
        } else {
            return new Response().failure("查无数据");
        }
    }


    /**
     * @Description: 志愿者店铺--获得自动更新设置
     * @auther: 史迪旻
     * @date: 10:27 2019-3-14
     * @param: [orgId, userId]
     * @return: com.holyrobot.response.Response
     */
    @Override
    public Response getSetUp(String orgId, String userId) {
        VolunteerApplicationExample example = new VolunteerApplicationExample();
        example.or().andOrgidEqualTo(orgId).andUseridEqualTo(userId).andDatastatusEqualTo(1);
        List<VolunteerApplication> volunteerApplications = volunteerApplicationMapper.selectByExample(example);
        if (volunteerApplications != null && volunteerApplications.size() == 1) {
            VolunteerApplication volunteerApplication = volunteerApplications.get(0);
            VolunteerShopAutoUpdate volunteerShopAutoUpdate = new VolunteerShopAutoUpdate();
            volunteerShopAutoUpdate.setOrgId(orgId);
            volunteerShopAutoUpdate.setUserId(userId);
            volunteerShopAutoUpdate.setPercentage(volunteerApplication.getPercentage());
            volunteerShopAutoUpdate.setFixedAmount(volunteerApplication.getFixedamount());
            volunteerShopAutoUpdate.setAdjustmentMethod(volunteerApplication.getAdjustmentmethod());
            volunteerShopAutoUpdate.setAdjustmentType(volunteerApplication.getAdjustmenttype());
            volunteerShopAutoUpdate.setAutoUpdate(volunteerApplication.getAutoupdate());
            log.info("/getSetUp接口：数据查询与插入成功");

            return new Response().success(volunteerShopAutoUpdate);
        }
        return new Response().failure("查询失败");
    }


    /**
     * @Description: 志愿者店铺--二维码
     * @auther: 史迪旻
     * @date: 21:27 2019-3-7
     * @param: [orgId, userId]
     * @return: com.holyrobot.response.Response
     */
    @Override
    public Response getVolQR(String orgId, String userId, String title) {
        String imgName = "volunteer_" + userId + "_" + orgId + ".jpg";
        String url = h5Url + "#/home?orgId=" + orgId + "&shopUserId=" + userId + "&shopType=1";
        File file = new File(imgPath + imgName);

        QRCodeUtil.drawLogoQRCode(null, file, url, title);

        return new Response().success(imgUrl + imgName);
    }

    /**
     * 　　* @Description: ERP B端店铺二维码
     * 　　* @author 周陈
     * 　　* @date 2019/5/31 16:09
     *
     */
    public Response getErpShopQR(String userId) {
        HttpResponse httpResponse = HttpUtils.httpClientGet(getUserUrl + userId);
        ErpUserDto erpUserDto = JSON.toJavaObject(JSON.parseObject(httpResponse.getData()), ErpUserDto.class);
        log.info("API调用查询ERP用户信息接口返回={}", JSON.toJSONString(erpUserDto));
        String imgName = "ErpShop_" + userId + "_" + erpUserDto.getOrgID() + ".jpg";
        String url = h5Url + "#/jump?orgId=" + erpUserDto.getOrgID()
                + "&status=1"
                + "&userId=" + userId
                + "&userName=" + erpUserDto.getUserName()
                + "&deptId=" + erpUserDto.getDeptID()
                + "&deptName=" + erpUserDto.getDeptName();
        File file = new File(imgPath + imgName);

        HttpResponse httpResponse1 = HttpUtils.httpClientGet(getOrgInfoUrl + erpUserDto.getOrgID());
        log.info("获取店铺信息  返回值：{}", httpResponse1.getData());
        OrgInfoExtensionDto orgInfoExtensionDto = JSON.toJavaObject(JSON.parseObject(httpResponse1.getData()), OrgInfoExtensionDto.class);

        QRCodeUtil.drawLogoQRCode(null, file, url, orgInfoExtensionDto.getTravelAgencyName());
        return new Response().success(imgUrl + imgName);
    }


    /**
     * @Description: 志愿者--注册用户协议接口
     * @auther: 史迪旻
     * @date: 10:27 2019-3-14
     * @param: [orgId]
     * @return: com.holyrobot.response.Response
     */
    @Override
    public Response getPDFInfo(String orgId) {
        log.info("/getPDFInfo : orgId={}", orgId);
        OmProtocolExample example = new OmProtocolExample();
        example.setOrderByClause("orgId desc");
        example.or().andOrgidIn(Arrays.asList(orgId, Constants.UUID_DEFAULT)).andProtocoltypeEqualTo(3);
        List<OmProtocol> omProtocols = omProtocolMapper.selectByExample(example);
        if (Objects.nonNull(omProtocols) && omProtocols.size() > 0) {
            OmProtocol omProtocol = omProtocols.get(0);
            log.info("/getPDFInfo 接口：用户协议查询成功");
            return new Response().success(omProtocol);
        }
        return new Response().failure("系统繁忙");
    }


    /**
     * @Description: 志愿者--注册页面--获得旅行社联系人
     * @auther: 史迪旻
     * @date: 17:19 2019-3-15
     * @param: [orgId]
     * @return: com.holyrobot.response.Response
     */
    @Override
    public Response getContact(String orgId, String userId, String parentId) {
        log.info("/getContact 接口: orgId = {},userId={},parentId={}", orgId, userId, parentId);
        String taContact;
        String taContactId;
        HashMap<String, String> map1 = new HashMap<String, String>();
        if (!StringUtils.isEmpty(parentId)) {
            HashMap<String, String> map = new HashMap<String, String>();
            map.put("orgId", orgId);
            map.put("parentId", parentId);
            List<VolunteerApplication> volunteerApplications = volunteerApplicationMapper.selectTaContact(map);
            if (volunteerApplications != null && volunteerApplications.size() > 0) {
                taContact = volunteerApplications.get(0).getTacontact();
                taContactId = volunteerApplications.get(0).getTacontactid();
                map1.put("taContact", taContact);
                map1.put("taContactId", taContactId);
                return new Response().success(map1);
            }
        }
        if (!userId.equals(null)) {
            HttpResponse httpResponse = HttpUtils.httpClientGet(getUserUrl + userId);
            if (!httpResponse.getData().equals("null")) {
                JSONObject jsonObject = JSONObject.parseObject(httpResponse.getData());
                taContact = jsonObject.getString("UserName");
                taContactId = jsonObject.getString("ID");
                map1.put("taContact", taContact);
                map1.put("taContactId", taContactId);
                log.info("/getContact 接口: 旅行社联系人查询成功");
                return new Response().success(map1);

            }
        }

        HttpResponse httpResponse = HttpUtils.httpClientGet(getSupplierNameByID + orgId);
        log.info("/getSupplierNameByID 接口: getSupplierNameByID = {}", getSupplierNameByID);
        log.info("/getSupplierNameByID 接口: httpResponse = {}", httpResponse);
        if (!httpResponse.getData().equals("null")) {
            JSONArray jsonObject = JSONObject.parseArray(httpResponse.getData());
            if (Objects.nonNull(jsonObject) && jsonObject.size() == 1) {
                JSONObject o = (JSONObject) jsonObject.get(0);
                taContact = o.getString("Contact");
                taContactId = o.getString("ID");
                map1.put("taContact", taContact);
                map1.put("taContactId", taContactId);
                log.info("/getContact 接口: 旅行社联系人查询成功");
                return new Response().success(map1);
            }
        }

        return new Response().success(null);
    }


}