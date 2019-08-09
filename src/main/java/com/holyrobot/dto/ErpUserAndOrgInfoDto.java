package com.holyrobot.dto;

/**
 * @author 周陈
 * @Title: Erp用户信息Dto
 * @date 2018/7/3 17:07
 */
public class ErpUserAndOrgInfoDto {
    private ErpUserDto erpUserDto;
    private OrgInfoExtensionDto orgInfo;
    private AccountAndInvitationDto accountAndInvitationDto;

    public ErpUserAndOrgInfoDto(ErpUserDto erpUserDto, OrgInfoExtensionDto orgInfo, AccountAndInvitationDto accountAndInvitationDto) {
        this.erpUserDto = erpUserDto;
        this.orgInfo = orgInfo;
        this.accountAndInvitationDto = accountAndInvitationDto;
    }

    public ErpUserDto getErpUserDto() {
        return erpUserDto;
    }

    public void setErpUserDto(ErpUserDto erpUserDto) {
        this.erpUserDto = erpUserDto;
    }

    public OrgInfoExtensionDto getOrgInfo() {
        return orgInfo;
    }

    public void setOrgInfo(OrgInfoExtensionDto orgInfo) {
        this.orgInfo = orgInfo;
    }

    public AccountAndInvitationDto getAccountAndInvitationDto() {
        return accountAndInvitationDto;
    }

    public void setAccountAndInvitationDto(AccountAndInvitationDto accountAndInvitationDto) {
        this.accountAndInvitationDto = accountAndInvitationDto;
    }
}
