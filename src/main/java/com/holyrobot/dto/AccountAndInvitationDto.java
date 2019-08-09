package com.holyrobot.dto;

import java.io.Serializable;

/**
 * @ClassName： AccountAndInvitationDto
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2019-3-15 14:20
 * @Version: 1.0
 * @Modified By:
 */
public class AccountAndInvitationDto implements Serializable {

    private String userInvitationCode;

    private String accountId;

    public String getUserInvitationCode() {
        return userInvitationCode;
    }

    public void setUserInvitationCode(String userInvitationCode) {
        this.userInvitationCode = userInvitationCode;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
}
