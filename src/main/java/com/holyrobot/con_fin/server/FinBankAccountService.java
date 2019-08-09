package com.holyrobot.con_fin.server;

import com.holyrobot.dto.BankAccountAndReceivingSetDto;
import com.holyrobot.con_fin.pojo.FinBankAccount;
import com.holyrobot.con_fin.pojo.FinReceivingSet;

import java.util.List;

/**
 * @author 周陈
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/8/179:28
 */
public interface FinBankAccountService {
    List<FinBankAccount> findFinBankAccountByOrgId(String orgId);
    List<FinReceivingSet> findFinReceivingSetByOrgId(String orgId);
    BankAccountAndReceivingSetDto findBankAccountAndReceivingSet(String orgId, String orderId);
}
