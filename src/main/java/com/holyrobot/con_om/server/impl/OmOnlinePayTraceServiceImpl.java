package com.holyrobot.con_om.server.impl;

import com.alibaba.fastjson.JSON;
import com.github.binarywang.wxpay.bean.request.WxPayUnifiedOrderRequest;
import com.holyrobot.con_order.mapper.OrdOnlinePayInfoMapper;
import com.holyrobot.con_order.pojo.OrdOnlinePayInfo;
import com.holyrobot.con_order.pojo.OrdOrderinfo;
import com.holyrobot.constant.Constants;
import com.holyrobot.con_om.mapper.OmOnlinePayTraceMapper;
import com.holyrobot.con_om.pojo.OmOnlinePayTrace;
import com.holyrobot.con_om.pojo.OmOnlinePayTraceExample;
import com.holyrobot.response.Response;
import com.holyrobot.con_om.server.OmOnlinePayTraceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author 周陈
 * @Title: 订单支付表
 * @date 2018/11/17 12:03
 */
@Service
@Slf4j
public class OmOnlinePayTraceServiceImpl implements OmOnlinePayTraceService {
    @Autowired
    private OmOnlinePayTraceMapper omOnlinePayTraceMapper;
    @Autowired
    private OrdOnlinePayInfoMapper ordOnlinePayInfoMapper;

    /**
    　　* @Description: 通过商户订单号查询 订单支付表
    　　* @author 周陈
    　　* @date 2018/11/17 13:58
    　　*/
    @Override
    public OmOnlinePayTrace findOnlinePayTraceByOutTradeNo(String outTradeNo) {
        OmOnlinePayTraceExample example = new OmOnlinePayTraceExample();
        example.or().andOuttradenoEqualTo(outTradeNo);
        List<OmOnlinePayTrace> omOnlinePayTraces = omOnlinePayTraceMapper.selectByExample(example);
        if (omOnlinePayTraces != null && omOnlinePayTraces.size() > 0) {
            return omOnlinePayTraces.get(0);
        }
        return null;
    }

    /**
    　　* @Description: 统一下单 添加支付记录
    　　* @author 周陈
    　　* @date 2018/11/17 14:47
    　　*/
    @Override
    public Response addUnifiedOrder(WxPayUnifiedOrderRequest orderRequest, OrdOrderinfo ordOrderInfo) {
        OmOnlinePayTrace omOnlinePayTrace = new OmOnlinePayTrace();
        omOnlinePayTrace.setId(UUID.randomUUID().toString());
        omOnlinePayTrace.setOuttradeno(orderRequest.getOutTradeNo());
        //支付宝金额
        omOnlinePayTrace.setPayamt(new BigDecimal(Double.toString(0.01)));
//        omOnlinePayTrace.setPayamt(ordOrderInfo.getPayableamt());
        //实际支付金额
        omOnlinePayTrace.setRecpayamt(new BigDecimal(Double.toString(0.01)));
        omOnlinePayTrace.setPlatformtype(Constants.WX_PAY);
        omOnlinePayTrace.setDatastatus(0);
        omOnlinePayTrace.setOrdername(ordOrderInfo.getOrdername());
        omOnlinePayTrace.setOrderno(ordOrderInfo.getOrderno());
        omOnlinePayTrace.setSummary(orderRequest.getBody());
        omOnlinePayTrace.setTravelname(ordOrderInfo.getOrgname());
        omOnlinePayTrace.setOrderid(ordOrderInfo.getId());
        omOnlinePayTrace.setCreatedby(ordOrderInfo.getCreatedby());
        omOnlinePayTrace.setCreatedbyid(ordOrderInfo.getCreatedbyid());
        omOnlinePayTrace.setOrgid(ordOrderInfo.getOrgid());
        omOnlinePayTrace.setDeptid(ordOrderInfo.getDeptid());
        omOnlinePayTrace.setReviseddate(new Date());
        omOnlinePayTrace.setOrderamt(ordOrderInfo.getPayableamt());
        omOnlinePayTrace.setRate(new BigDecimal(0));
        omOnlinePayTrace.setFee(new BigDecimal(0));
        omOnlinePayTrace.setPaydate(new Date());
        log.info("omOnlinePayTrace={}", JSON.toJSONString(omOnlinePayTrace));
        int insert = omOnlinePayTraceMapper.insert(omOnlinePayTrace);
        if (insert>0){
            log.info("插入支付记录成功");
            return new Response().success("插入支付记录成功");
        }
        return new Response().failure("插入支付记录失败");
    }

    /**
    　　* @Description: 修改支付记录状态 由0 改成1
    　　* @author 周陈
    　　* @date 2018/11/17 15:31
    　　*/
    @Override
    public int updateDataStatus(OmOnlinePayTrace omOnlinePayTrace) {
        omOnlinePayTrace.setDatastatus(1);
        omOnlinePayTrace.setReviseddate(new Date());
        OmOnlinePayTraceExample example = new OmOnlinePayTraceExample();
        example.or().andIdEqualTo(omOnlinePayTrace.getId());
        int count = omOnlinePayTraceMapper.updateByExample(omOnlinePayTrace, example);
        return count;
    }

    /**
    　　* @Description: 插入在线支付信息
    　　* @author 周陈
    　　* @date 2019/3/27 17:08
    　　*/
    @Override
    public int insterOrdOnlineInfo(OrdOrderinfo ordOrderinfo) {
        OrdOnlinePayInfo ordOnlinePayInfo = new OrdOnlinePayInfo();
        ordOnlinePayInfo.setCreateddate(new Date());
        //支付方式：1.微信支付；2.支付宝支付；
        ordOnlinePayInfo.setDatastatus(1);
        ordOnlinePayInfo.setId(UUID.randomUUID().toString());
        ordOnlinePayInfo.setOrderid(ordOrderinfo.getId());
        //微信费率：千分之六
        ordOnlinePayInfo.setRdined(new BigDecimal(0.006).setScale(3, BigDecimal.ROUND_HALF_UP));

        //手续费
//        商户在交易过程中会产生一定的费率，结算时扣除相应的费率再结余下的资金；
//        费率计算规则：单笔订单四舍五入，保留小数点后2位；
        BigDecimal serviceCharge = ordOrderinfo.getPayableamt().multiply(ordOnlinePayInfo.getRdined()).setScale(2, BigDecimal.ROUND_HALF_UP);
        if(serviceCharge.compareTo(new BigDecimal(0))==0){
            //设置 最低手续 0.01元
            serviceCharge = new BigDecimal(0.01).setScale(2, BigDecimal.ROUND_HALF_UP);
        }
        //实收金额 = 应收 - 手续费
        ordOnlinePayInfo.setRealityamt(ordOrderinfo.getPayableamt().subtract(serviceCharge));
        //应收金额
        ordOnlinePayInfo.setReceivableamt(ordOrderinfo.getPayableamt());
        //手续费
        ordOnlinePayInfo.setServicecharge(serviceCharge);
        //类型：1.费用
        ordOnlinePayInfo.setType(1);
        return ordOnlinePayInfoMapper.insert(ordOnlinePayInfo);
    }
}
