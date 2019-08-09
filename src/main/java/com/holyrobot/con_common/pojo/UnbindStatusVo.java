package com.holyrobot.con_common.pojo;

/**
 * @ClassName： UnbindStatusVo
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2019-3-1 13:54
 * @Version: 1.0
 * @Modified By:
 */
public class UnbindStatusVo {

    private String travelAgencyName; //授权旅行社名称

    private String shopName; //店铺名称

    private String shopHeadPortrait; //店铺头像

    private Integer dataStatus; //申请状态  0：申请中；1：正常；2：冻结中；3：已解绑；4：已拒绝；5：申请解绑；-1：删除；-2：已取消

    public String getTravelAgencyName() {
        return travelAgencyName;
    }

    public void setTravelAgencyName(String travelAgencyName) {
        this.travelAgencyName = travelAgencyName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopHeadPortrait() {
        return shopHeadPortrait;
    }

    public void setShopHeadPortrait(String shopHeadPortrait) {
        this.shopHeadPortrait = shopHeadPortrait;
    }

    public Integer getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Integer dataStatus) {
        this.dataStatus = dataStatus;
    }
}
