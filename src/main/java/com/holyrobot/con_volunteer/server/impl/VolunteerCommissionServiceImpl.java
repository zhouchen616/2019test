package com.holyrobot.con_volunteer.server.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.holyrobot.con_order.mapper.OrdOrderLogMapper;
import com.holyrobot.con_order.mapper.OrdOrderShopAdjustMapper;
import com.holyrobot.con_order.mapper.OrdOrderinfoMapper;
import com.holyrobot.con_order.mapper.OrdVolunteerOrderShopAdjustMapper;
import com.holyrobot.con_order.pojo.*;
import com.holyrobot.con_volunteer.mapper.*;
import com.holyrobot.con_volunteer.pojo.*;
import com.holyrobot.response.Response;
import com.holyrobot.con_volunteer.server.VolunteerCommissionService;
import eu.bitwalker.useragentutils.Browser;
import eu.bitwalker.useragentutils.UserAgent;
import eu.bitwalker.useragentutils.Version;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.*;

/**
 * @ClassName： VolunteerCommissionServiceImpl
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2019-2-22 11:10
 * @Version: 1.0
 * @Modified By:
 */
@Service
@Slf4j
public class VolunteerCommissionServiceImpl implements VolunteerCommissionService {

    @Autowired
    private VolunteerCommissionRecordMapper volunteerCommissionRecordMapper;
    @Autowired
    private VolunteerCommissionWithdrawDepositMapper volunteerCommissionWithdrawDepositMapper;
    @Autowired
    private VolunteerApplicationMapper volunteerApplicationMapper;
    @Autowired
    private OrdOrderLogMapper ordOrderLogMapper;
    @Autowired
    private OrdOrderinfoMapper ordOrderinfoMapper;
    @Autowired
    private OrdOrderShopAdjustMapper ordOrderShopAdjustMapper;
    @Autowired
    private OrdVolunteerOrderShopAdjustMapper ordVolunteerOrderShopAdjustMapper;
    @Autowired
    private TravelerRewardRecordingMapper travelerRewardRecordingMapper;

    /**
     * @Description: 志愿者店铺“我的”页面--店铺与佣金信息--(佣金时间更新)
     * @auther: 史迪旻
     * @date: 17:44 2019-2-22
     * @param: [orgId, userId]
     * @return: com.holyrobot.response.Response
     */
    @Override
    @Transactional
    public Response getVolCommInfo(String orgId, String userId) {
        log.info("/getVolCommInfo接口：orgId{}, userId{}", orgId, userId);
        VolunteerApplicationCommPo volunteerApplicationCommPo = volunteerCommissionRecordMapper.selectShopHeadAndComm(orgId, userId);
        log.info("/getVolCommInfo接口：volunteerApplicationCommPo {}", volunteerApplicationCommPo);

//        修改佣金状态
        VolunteerCommissionRecordExample example = new VolunteerCommissionRecordExample();
        example.or().andOrgidEqualTo(orgId).andUseridEqualTo(userId).andDatastatusEqualTo(0);
        List<VolunteerCommissionRecord> volunteerCommissionRecords = volunteerCommissionRecordMapper.selectByExample(example);
        ArrayList orderIdList = new ArrayList();

        if (Objects.nonNull(volunteerCommissionRecords) && volunteerCommissionRecords.size() > 0) {
            for (VolunteerCommissionRecord volunteerCommissionRecord : volunteerCommissionRecords) {
//                获取订单id 创建订单id的List
                orderIdList.add(volunteerCommissionRecord.getOrderid());
            }

            OrdOrderinfoExample ordOrderinfoExample = new OrdOrderinfoExample();
//        通过订单id List查询
            ordOrderinfoExample.or().andIdIn(orderIdList).andDatastatusNotIn(Arrays.asList(-1, -2, -3, 0, 1));
            List<OrdOrderinfo> ordOrderinfos = ordOrderinfoMapper.selectByExample(ordOrderinfoExample);

            if (Objects.nonNull(ordOrderinfos) && ordOrderinfos.size() > 0) {
                for (int i = 0; i < volunteerCommissionRecords.size(); i++) {
                    VolunteerCommissionRecord volunteerCommissionRecord = volunteerCommissionRecords.get(i);

                    for (int j = 0; j < ordOrderinfos.size(); j++) {
                        OrdOrderinfo ordOrderinfo = ordOrderinfos.get(j);

                        if (volunteerCommissionRecord.getOrderid().equals(ordOrderinfo.getId())) {
                            Date returndate = ordOrderinfo.getReturndate();
                            Date now = new Date();
//                            判断时间
                            if (now.after(returndate)) { //现在时间 > 回团时间
                                volunteerCommissionRecord.setDatastatus(1); //更新数据
                                int l = volunteerCommissionRecordMapper.updateByPrimaryKeySelective(volunteerCommissionRecord);
                                if (l != 1) {
                                    log.info("/getVolCommInfo接口 日期比较：数据更新失败！VolunteerCommissionServiceImpl");
                                    return new Response().failure("系统繁忙");
                                }
                            } else {
                                continue;
                            }
                        }
                    }

                }
            }
        }


        return new Response().success(volunteerApplicationCommPo);
    }


    /**
     * @Description: 佣金提现--页面信息
     * @auther: 史迪旻
     * @date: 2019-2-23
     * @param: [param]
     * @return: com.holyrobot.response.Response
     */
    @Override
    public Response getCommAccountInfo(JSONObject param) {
        String userId = param.getString("userId");
        String orgId = param.getString("orgId");
        log.info("/getCommAccountInfo接口：userId={}, orgId={}", userId, orgId);


//        志愿者主表信息
        VolunteerApplicationExample volunteerApplicationExample = new VolunteerApplicationExample();
        //TODO 2019年3月7日 09:57:13 zc修改
        volunteerApplicationExample.or().andUseridEqualTo(userId).andOrgidEqualTo(orgId).andDatastatusIn(Arrays.asList(1, 5));
        List<VolunteerApplication> volunteerApplications = volunteerApplicationMapper.selectByExample(volunteerApplicationExample);

//        sql待优化
//        查询所有佣金信息
        VolunteerCommissionRecordExample example = new VolunteerCommissionRecordExample();
        example.setOrderByClause("CreatedDate DESC");//降序排列
        example.or().andUseridEqualTo(userId).andOrgidEqualTo(orgId);
        List<VolunteerCommissionRecord> recordList = volunteerCommissionRecordMapper.selectByExample(example);

//        查询可提佣金信息
        VolunteerCommissionRecordExample volunteerCommissionRecordExample = new VolunteerCommissionRecordExample();
        volunteerCommissionRecordExample.or().andUseridEqualTo(userId).andOrgidEqualTo(orgId).andDatastatusEqualTo(1);
        List<VolunteerCommissionRecord> volunteerCommissionRecords = volunteerCommissionRecordMapper.selectByExample(volunteerCommissionRecordExample);

//        查询累计获得佣金信息
        VolunteerCommissionRecordExample commissionRecordExample = new VolunteerCommissionRecordExample();
        commissionRecordExample.or().andUseridEqualTo(userId).andOrgidEqualTo(orgId).andDatastatusNotEqualTo(-1);
        List<VolunteerCommissionRecord> commissionRecords = volunteerCommissionRecordMapper.selectByExample(commissionRecordExample);

//        查询累计提取佣金信息
        VolunteerCommissionWithdrawDepositExample depositExample = new VolunteerCommissionWithdrawDepositExample();
        depositExample.or().andUseridEqualTo(userId).andOrgidEqualTo(orgId).andDatastatusNotEqualTo(-1);
        List<VolunteerCommissionWithdrawDeposit> volunteerCommissionWithdrawDeposits = volunteerCommissionWithdrawDepositMapper.selectByExample(depositExample);


        VolunteerCommAccountVo volunteerCommAccountVo = new VolunteerCommAccountVo();
        volunteerCommAccountVo.setVolunteerApplication(volunteerApplications.get(0));//申请人信息
        volunteerCommAccountVo.setVolunteerCommissionRecordList(recordList);//佣金记录信息

//        累计佣金计算
        BigDecimal count = new BigDecimal(0);
        for (VolunteerCommissionRecord vcr : commissionRecords) {
            log.info("```{}", vcr.getCommissionamt());
            log.info("```{}", count);
            count = count.add(vcr.getCommissionamt());
        }
        volunteerCommAccountVo.setCumCommission(count);//累计总佣金

//        累计提现计算
        BigDecimal counts = new BigDecimal(0);
        for (VolunteerCommissionWithdrawDeposit vcwd : volunteerCommissionWithdrawDeposits) {
            log.info("```{}", vcwd.getApplicationamt());
            log.info("```{}", counts);
            counts = counts.add(vcwd.getApplicationamt());
        }
        volunteerCommAccountVo.setCumCash(counts);//累计提现

//        可提佣金计算
//        if (volunteerCommissionRecords != null && volunteerCommissionRecords.size() == 1) {
//            BigDecimal commissionamt = volunteerCommissionRecords.get(0).getCommissionamt();
//            volunteerCommAccountVo.setTotalCommission(commissionamt);//可提总佣金
//        } else
        if (volunteerCommissionRecords != null) {
            BigDecimal countPrice = BigDecimal.valueOf(0);
            for (VolunteerCommissionRecord vcr : volunteerCommissionRecords) {
                countPrice = countPrice.add(vcr.getCommissionamt());
            }
            volunteerCommAccountVo.setTotalCommission(countPrice.subtract(counts));//可提总佣金 = 可提佣金 - 累计提现
        } else {
            volunteerCommAccountVo.setTotalCommission(BigDecimal.valueOf(0));//可提总佣金
        }

        // log.info("/getCommAccountInfo接口：volunteerCommAccountVo{}", volunteerCommAccountVo);

        //查询奖励金信息  hexiaobo 2019/04/11 新增
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("orgId", orgId);
        map.put("userId", userId);
        List<HashMap<String, Object>> result = travelerRewardRecordingMapper.getAllowance(map);
        if (result != null && result.size() > 0) {
            Float allowance = Float.parseFloat(result.get(0).get("Allowance").toString());
            Float applicationAmt = Float.parseFloat(result.get(0).get("ApplicationAmt").toString());
            Float availableAllowance = allowance - applicationAmt;
            result.get(0).put("availableAllowance", availableAllowance);
            volunteerCommAccountVo.setApplicationAmt((BigDecimal) result.get(0).get("ApplicationAmt"));
            volunteerCommAccountVo.setIsTralveer((Integer) result.get(0).get("isTralveer"));
            volunteerCommAccountVo.setAllowance((BigDecimal) result.get(0).get("Allowance"));
            volunteerCommAccountVo.setAvailableAllowance(availableAllowance);
            volunteerCommAccountVo.setAllowanceTotal((BigDecimal) result.get(0).get("AllowanceTotal"));

        }
        log.info("****************/getCommAccountInfo接口：volunteerCommAccountVo={}", JSON.toJSONString(volunteerCommAccountVo));
        return new Response().success(volunteerCommAccountVo);
    }


    /**
     * @Description: 申请提现
     * @auther: 史迪旻
     * @date: 14:54 2019-2-23
     * @param: [volunteerCommissionWithdrawDeposit]
     * @return: com.holyrobot.response.Response
     */
    @Override
    @Transactional
    public Response submitCommApp(VolunteerCommissionWithdrawDeposit volunteerCommissionWithdrawDeposit) {
        String id = UUID.randomUUID().toString();
        volunteerCommissionWithdrawDeposit.setId(id);
        volunteerCommissionWithdrawDeposit.setDatastatus(0);
        volunteerCommissionWithdrawDeposit.setCreateddate(new Date());
        volunteerCommissionWithdrawDeposit.setFinauditdatastatus(-1);
        log.info("/submitCommApp接口：volunteerCommissionWithdrawDeposit{}", JSON.toJSONString(volunteerCommissionWithdrawDeposit));

        String orgid = volunteerCommissionWithdrawDeposit.getOrgid();
        String userid = volunteerCommissionWithdrawDeposit.getUserid();
        if (orgid == null || orgid.isEmpty() || orgid.equals("")) {
            return new Response().failure("服务器繁忙");
        }
        if (userid.isEmpty() || userid.equals("") || userid == null) {
            return new Response().failure("服务器繁忙");
        }

        volunteerCommissionWithdrawDepositMapper.insert(volunteerCommissionWithdrawDeposit);

        return new Response().success();
    }


    /**
     * @Description: 佣金明细--获取记录
     * @auther: 史迪旻
     * @date: 15:05 2019-2-23
     * @param: [param]
     * @return: com.holyrobot.response.Response
     */
    @Override
    public Response commRecord(JSONObject param) {
        String userId = param.getString("userId");
        String orgId = param.getString("orgId");

        List<VolCommRecAndOrderInfoBo> volCommRecAndOrderInfoBos = volunteerCommissionRecordMapper.selectVolCommRecAndOrderInfo(orgId, userId);
        log.info("/commRecord接口：查询成功");

        return new Response().success(volCommRecAndOrderInfoBos);
    }


    /**
     * @Description: 佣金明细--提现记录
     * @auther: 史迪旻
     * @date: 15:15 2019-2-23
     * @param: [param]
     * @return: com.holyrobot.response.Response
     */
    @Override
    public Response extractRecord(JSONObject param) {
        String userId = param.getString("userId");
        VolunteerCommissionWithdrawDepositExample example = new VolunteerCommissionWithdrawDepositExample();
        example.or().andUseridEqualTo(userId);
        List<VolunteerCommissionWithdrawDeposit> volunteerCommissionWithdrawDeposits = volunteerCommissionWithdrawDepositMapper.selectByExample(example);
        log.info("/extractRecord接口：查询成功");

        return new Response().success(volunteerCommissionWithdrawDeposits);
    }


    /**
     * @Description: 旅游志愿者--调整订单金额页面--金额信息
     * @auther: 史迪旻
     * @date: 16:32 2019-3-4
     * @param: [params]
     * @return: com.holyrobot.response.Response
     */
    @Override
    public Response adjustmentAmt(String orderId) {
        VolunteerAdjustmentAmtPo volunteerAdjustmentAmtPo = volunteerCommissionRecordMapper.selectByOrderId(orderId);
        VolunteerAdjustmentAmtVo volunteerAdjustmentAmtVo = new VolunteerAdjustmentAmtVo();
        volunteerAdjustmentAmtVo.setId(volunteerAdjustmentAmtPo.getId());
        volunteerAdjustmentAmtVo.setUserId(volunteerAdjustmentAmtPo.getUserId());
        volunteerAdjustmentAmtVo.setCommissionAmt(volunteerAdjustmentAmtPo.getCommissionAmt());
        volunteerAdjustmentAmtVo.setOrderId(volunteerAdjustmentAmtPo.getOrderId());
        volunteerAdjustmentAmtVo.setOrgId(volunteerAdjustmentAmtPo.getOrgId());
        volunteerAdjustmentAmtVo.setPayableAmt(volunteerAdjustmentAmtPo.getPayableAmt());
        log.info("/adjustmentAmt接口：数据查询成功！volunteerAdjustmentAmtVo {}", volunteerAdjustmentAmtVo);
        return new Response().success(volunteerAdjustmentAmtVo);
    }


    /**
     * @Description: 旅游志愿者--调整订单金额页面--调整金额日志
     * @auther: 史迪旻
     * @date: 16:41 2019-3-4
     * @param: [orderId]
     * @return: com.holyrobot.response.Response
     */
    @Override
    public Response getOrderLog(String orderId) {
        OrdOrderLogExample example = new OrdOrderLogExample();
        example.or().andOrderidEqualTo(orderId);
        List<OrdOrderLog> ordOrderLogs = ordOrderLogMapper.selectByExample(example);
        log.info("/getOrderLog接口：数据查询成功");
        return new Response().success(ordOrderLogs);
    }


    /**
     * @Description: 旅游志愿者--调整订单金额页面--提交调整金额
     * @auther: 史迪旻
     * @date: 17:40 2019-3-4
     * @param: [params, request]
     * @return: com.holyrobot.response.Response
     */
    @Override
    @Transactional
    public Response updateAmt(JSONObject params, HttpServletRequest request) {
        String orderId = params.getString("orderId");//订单id
//        BigDecimal adjustAmt = params.getBigDecimal("adjustAmt"); //调整金额
        BigDecimal orderAmt = params.getBigDecimal("orderAmt");//原订单金额
        String ajustComment = params.getString("ajustComment"); //调整备注
        BigDecimal payableAmt = params.getBigDecimal("payableAmt");//调整后的应付金额
        String orgId = params.getString("orgId");//授权旅行社id
        String userId = params.getString("userId");//志愿者id
        String userName = params.getString("userName");//志愿者人名

        BigDecimal adjustAmt = payableAmt.subtract(orderAmt);//计算调整金额

//        OrdOrderinfo ordOrderinfo = ordOrderinfoMapper.selectByPrimaryKey(orderId);
//        BigDecimal add = ordOrderinfo.getAdjustamt().add(adjustAmt);//调整总金额 = 之前的调整 + 又调整的

//        插入 调整总金额，原订单金额，应付金额，调整备注
        int i = ordOrderinfoMapper.updateAdjustmentInfo(orderId, payableAmt);
        if (i != 1) {
            log.info("/updateAmt接口：订单表信息更新失败");
            return new Response().failure("服务器繁忙");
        }
        if (i == 1) {
            log.info("/updateAmt接口：订单表信息更新成功");
        }

        OrdOrderLog ordOrderLog = new OrdOrderLog();
        String id = UUID.randomUUID().toString();
        ordOrderLog.setId(id);
        ordOrderLog.setOrderid(orderId);
        String opLog = "调整金额：" + adjustAmt + " 元,调整后应付金额：" + payableAmt + " 元";
        ordOrderLog.setOplog(opLog + "+" + ajustComment);
        //获取ip
        String ipAddress = request.getHeader("x-real-ip");
        ordOrderLog.setOpip(ipAddress);

//       用UserAgent工具获取请求头的内容
        UserAgent userAgent = UserAgent.parseUserAgentString(request.getHeader("User-Agent"));
        Browser browserInfo = userAgent.getBrowser();
        Version browserVersion = userAgent.getBrowserVersion();
//       浏览器信息和浏览器版本
        String browser = browserInfo + " , " + browserVersion;
        ordOrderLog.setOpbrowser(browser);
        ordOrderLog.setOrgid(orgId);
        ordOrderLog.setCreatedbyid(userId);
        ordOrderLog.setCreatedby(userName);
        ordOrderLog.setCreateddate(new Date());
        int j = ordOrderLogMapper.insert(ordOrderLog);
        log.info("/updateAmt接口：订单操作日志表信息插入成功 ordOrderLog {}", ordOrderLog);

        if (j == 1) {
            log.info("/updateAmt接口：订单操作日志表信息插入成功 ordOrderLog {}", ordOrderLog);
        } else {
            log.info("/updateAmt接口：订单操作日志表信息插入失败");
            return new Response().failure("服务器繁忙");
        }


//        佣金插入
        VolunteerCommissionRecordExample example = new VolunteerCommissionRecordExample();
        example.or().andUseridEqualTo(userId).andOrderidEqualTo(orderId).andDatastatusNotEqualTo(-1);
        List<VolunteerCommissionRecord> volunteerCommissionRecords = volunteerCommissionRecordMapper.selectByExample(example);
        BigDecimal add = new BigDecimal(0);
        if (Objects.nonNull(volunteerCommissionRecords) && volunteerCommissionRecords.size() > 0) {
            VolunteerCommissionRecord volunteerCommissionRecord = volunteerCommissionRecords.get(0);
//            总佣金--单笔订单
            BigDecimal commissionamt = volunteerCommissionRecord.getCommissionamt();
            add = commissionamt.add(adjustAmt);//总佣金 = 原总佣金 + 修改金额
            volunteerCommissionRecord.setCommissionamt(add);

            int k = volunteerCommissionRecordMapper.updateByPrimaryKeySelective(volunteerCommissionRecord);
            if (k != 1) {
                log.info("/updateAmt 接口：佣金更新失败");
                return new Response().failure("系统繁忙");
            }

        }

//        插入 志愿者订单修改记录表
        OrdVolunteerOrderShopAdjust shopAdjust = new OrdVolunteerOrderShopAdjust();
        String uid = UUID.randomUUID().toString();
        shopAdjust.setId(uid);
        shopAdjust.setOrderid(orderId);
        shopAdjust.setOrgid(orgId);
        shopAdjust.setOrderprice(payableAmt); //调整后金额
        shopAdjust.setOrdercostprice(payableAmt.subtract(add));//订单成本
        shopAdjust.setCommissionamt(add);//总佣金
        shopAdjust.setAdjustprice(adjustAmt);//调整金额
        shopAdjust.setCreatedbyid(userId);
        shopAdjust.setCreatedby(userName);
        shopAdjust.setCreateddate(new Date());
        shopAdjust.setComment("【志愿者】" + ajustComment);

        int k = ordVolunteerOrderShopAdjustMapper.insert(shopAdjust);
        if (k != 1) {
            log.info("/updateAmt 接口：Ord_VolunteerOrderShopAdjust表插入失败 {}", shopAdjust);
            return new Response().failure("系统繁忙");
        }

        return new Response().success();

    }


}
