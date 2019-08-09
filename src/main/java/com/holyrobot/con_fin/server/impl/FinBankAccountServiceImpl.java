package com.holyrobot.con_fin.server.impl;

import com.holyrobot.con_fin.server.FinBankAccountService;
import com.holyrobot.con_order.mapper.OrdOrderinfoMapper;
import com.holyrobot.con_order.pojo.OrdOrderinfo;
import com.holyrobot.con_order.server.OrgInfoService;
import com.holyrobot.dto.BankAccountAndReceivingSetDto;
import com.holyrobot.con_fin.mapper.FinBankAccountMapper;
import com.holyrobot.con_fin.mapper.FinReceivingSetMapper;
import com.holyrobot.con_fin.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 周陈
 * @Title: 支付方式
 * @date 2018/8/17 9:28
 */
@Service
public class FinBankAccountServiceImpl implements FinBankAccountService {
    @Autowired
    private FinBankAccountMapper finBankAccountMapper;
    @Autowired
    private FinReceivingSetMapper finReceivingSetMapper;
    @Autowired
    private OrgInfoService orgInfoService;
    @Autowired
    private OrdOrderinfoMapper ordOrderInfoMapper;
    @Override
    public List<FinBankAccount> findFinBankAccountByOrgId(String orgId) {
        FinBankAccountExample example = new FinBankAccountExample();
        example.or().andIsenableEqualTo(true).andIsoutEqualTo(true)
                .andOrgidEqualTo(orgId);
        return finBankAccountMapper.selectByExample(example);
    }

    @Override
    public List<FinReceivingSet> findFinReceivingSetByOrgId(String orgId) {
        FinReceivingSetExample example = new FinReceivingSetExample();
        example.or().andDatastatusEqualTo(1).andOrgidEqualTo(orgId);
        return finReceivingSetMapper.selectByExample(example);
    }

    @Override
    public BankAccountAndReceivingSetDto findBankAccountAndReceivingSet(String orgId, String orderId) {
        //先调用方法，判断当前店铺是否配置总店收款
        OrdOrderinfo ordOrderInfo = ordOrderInfoMapper.selectByPrimaryKey(orderId);
        boolean headShopOrgIdByOrderManage = orgInfoService.getHeadShopOrgIdByOrderManage(orgId,ordOrderInfo.getDirectSalesSendId());
        List<FinBankAccount> finBankAccountByOrgId = this.findFinBankAccountByOrgId(headShopOrgIdByOrderManage?ordOrderInfo.getDirectSalesSendId() : orgId);
        List<FinReceivingSet> finReceivingSetByOrgId = this.findFinReceivingSetByOrgId(headShopOrgIdByOrderManage?ordOrderInfo.getDirectSalesSendId() : orgId);
        BankAccountAndReceivingSetDto bankAccountAndReceivingSetDto = new BankAccountAndReceivingSetDto(finBankAccountByOrgId, finReceivingSetByOrgId);
        return bankAccountAndReceivingSetDto;
    }
}
