package com.holyrobot.con_order.pojo;

/**
 * @Author: 周相儒
 * @Description: 返回封装订单状态对应的条数
 * @CreateDate: 2018/9/19 14:44
 * @Version: 1.0
 */
public class OrderDataStatusVo {

    private int dataStatus;

    private int orderNum;

    public int getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(int dataStatus) {
        this.dataStatus = dataStatus;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }
}
