package com.holyrobot.con_order.server.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.holyrobot.con_product.mapper.ProOtherProductMapper;
import com.holyrobot.con_product.pojo.ProOtherProduct;
import com.holyrobot.dto.ErpUser;
import com.holyrobot.dto.OrgInfoExtensionDto;
import com.holyrobot.con_order.mapper.OrdOrderLogMapper;
import com.holyrobot.con_order.mapper.OrdOtherOrderInfoMapper;
import com.holyrobot.con_order.mapper.OrdOtherOrderVoucherPicMapper;
import com.holyrobot.con_order.pojo.OrdOrderLog;
import com.holyrobot.con_order.pojo.OrdOtherOrderInfo;
import com.holyrobot.con_order.pojo.OrdOtherOrderVoucherPic;
import com.holyrobot.response.Response;
import com.holyrobot.con_order.server.OrdOtherOrderInfoService;
import com.holyrobot.util.HttpResponse;
import com.holyrobot.util.HttpUtils;
import com.holyrobot.util.PublicipUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

/**
 * @author 周陈
 * @Title: 活动订单服务类
 * @date 2018/10/17 20:38
 */
@Service
@Slf4j
public class OrdOtherOrderInfoServiceImpl implements OrdOtherOrderInfoService {
    @Autowired
    private OrdOtherOrderInfoMapper ordOtherOrderInfoMapper;
    @Autowired
    private OrdOtherOrderVoucherPicMapper ordOtherOrderVoucherPicMapper;
    @Autowired
    private ProOtherProductMapper proOtherProductMapper;
    @Autowired
    private OrdOrderLogMapper ordOrderLogMapper;
    @Value("${airPortUrl.getOrgInfoUrl}")
    private String getOrgInfoUrl;


    @Override
    @Transactional
    public Response addOrdOtherOrderInfo(JSONObject params, HttpServletRequest request) {
        ErpUser user = (ErpUser) request.getSession().getAttribute("erpUserInfo");
        if (Objects.isNull(user)) {
            return new Response().failure("用户未登录,请重新登陆！");
        }
        Integer count = params.getInteger("count");
        String shoporgid = params.getString("shoporgid");
        String comment = params.getString("comment");
        String payNo = params.getString("payNo");
        String payWay  = params.getString("payWay");
        String srcBank  = params.getString("srcBank");
        String otherproid = "C94C21D6-4C6D-4A80-BD19-5341E7014D47";
        String ordId = UUID.randomUUID().toString();
        //校验金额
        ProOtherProduct proOtherProduct = proOtherProductMapper.selectByPrimaryKey(otherproid);
        BigDecimal unitamt = proOtherProduct.getUnitamt();
        BigDecimal totalamt = unitamt.multiply(new BigDecimal(count));

        HttpResponse httpResponse = HttpUtils.httpClientGet(getOrgInfoUrl + shoporgid);
        log.info("调用API返回值{}",httpResponse );
        OrgInfoExtensionDto orgInfoExtensionDto = JSON.toJavaObject(JSON.parseObject(httpResponse.getData()), OrgInfoExtensionDto.class);
        OrdOtherOrderInfo ordOtherOrderInfo = new OrdOtherOrderInfo();
        ordOtherOrderInfo.setPayno(payNo);
        ordOtherOrderInfo.setPayway(payWay);
        ordOtherOrderInfo.setSrcbank(srcBank);
        //备注
        ordOtherOrderInfo.setComment(comment);
        //单价
        ordOtherOrderInfo.setUnitamt(unitamt);
        //总价
        ordOtherOrderInfo.setTotalamt(totalamt);
        //店铺标识
        ordOtherOrderInfo.setShoporgid(shoporgid);
        //店铺名称
        ordOtherOrderInfo.setShoporgname(orgInfoExtensionDto.getTravelAgencyName());
        //URL
        ordOtherOrderInfo.setOtherproid(otherproid);
        //数量
        ordOtherOrderInfo.setCount(count);
        //创建人
        ordOtherOrderInfo.setCreatedby(user.getUserName());
        //创建ID
        ordOtherOrderInfo.setCreatedbyid(user.getUserID());
        //子系统标识
        ordOtherOrderInfo.setOrgid(user.getOrgID());
        //订单类型
        ordOtherOrderInfo.setOrdertype(1);
        //子系统名称
        ordOtherOrderInfo.setOrgname(user.getTravelName());
        //创建人部门ID
        ordOtherOrderInfo.setDeptid(user.getDeptID());
        //订单状态 1.支付待确认 2.已支付
        ordOtherOrderInfo.setDatastatus(1);
        //订单名称
        ordOtherOrderInfo.setOrdername("活动优惠劵");
        ordOtherOrderInfo.setCreateddate(new Date());
        //生成订单编号
        String orderNo = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        orderNo = "HD" + simpleDateFormat.format(ordOtherOrderInfo.getCreateddate()) + "00" + RandomStringUtils.randomNumeric(4);
        ordOtherOrderInfo.setOrderno(orderNo);
        ordOtherOrderInfo.setId(ordId);
        //图片
        JSONArray fileArray = params.getJSONArray("fileArray");
        for (int i = 0; i < fileArray.size(); i++) {
            JSONObject o = (JSONObject) fileArray.get(i);
            OrdOtherOrderVoucherPic pic = new OrdOtherOrderVoucherPic();
            pic.setId(UUID.randomUUID().toString());
            pic.setVoucherurl(o.getString("filepath"));
            pic.setOtherorderid(ordId);
            ordOtherOrderVoucherPicMapper.insert(pic);
        }
        ordOtherOrderInfoMapper.insert(ordOtherOrderInfo);
        //添加日志
        OrdOrderLog ordOrderLog = new OrdOrderLog();
        ordOrderLog.setId(UUID.randomUUID().toString());
        ordOrderLog.setOrderid(ordId);
        ordOrderLog.setOplog("【优惠券】买家已提交新订单，并支付！");
        ordOrderLog.setOpip(PublicipUtils.getIpAddr(request));
        ordOrderLog.setOpbrowser(PublicipUtils.getBrowser(request));
        ordOrderLog.setOrgid(user.getOrgID());
        ordOrderLog.setCreatedbyid(user.getUserID());
        ordOrderLog.setCreatedby(user.getUserName());
        ordOrderLog.setCreateddate(new Date());
        ordOrderLogMapper.insert(ordOrderLog);
        return new Response().success(orderNo);
    }

    @Override
    public ProOtherProduct finProOtherProduct(String id) {
        return proOtherProductMapper.selectByPrimaryKey(id);
    }
}
