package com.holyrobot.dto;



import com.holyrobot.con_fin.pojo.FinBankAccount;
import com.holyrobot.con_fin.pojo.FinReceivingSet;

import java.util.List;

/**
 * @author 周陈
 * @Title: 支付宝、银行卡实体
 * @date 2018/8/17 9:38
 */
public class BankAccountAndReceivingSetDto {
    private List<FinBankAccount> finBankAccounts;
    private List<FinReceivingSet> finReceivingSets;

    public BankAccountAndReceivingSetDto() {
    }

    public BankAccountAndReceivingSetDto(List<FinBankAccount> finBankAccounts, List<FinReceivingSet> finReceivingSets) {
        this.finBankAccounts = finBankAccounts;
        this.finReceivingSets = finReceivingSets;
    }

    public List<FinBankAccount> getFinBankAccounts() {
        return finBankAccounts;
    }

    public void setFinBankAccounts(List<FinBankAccount> finBankAccounts) {
        this.finBankAccounts = finBankAccounts;
    }

    public List<FinReceivingSet> getFinReceivingSets() {
        return finReceivingSets;
    }

    public void setFinReceivingSets(List<FinReceivingSet> finReceivingSets) {
        this.finReceivingSets = finReceivingSets;
    }
}
