package com.holyrobot.con_order.mapper;

import com.holyrobot.dto.OrderInfoViewDto;
import com.holyrobot.con_order.pojo.OrdOrderinfo;
import com.holyrobot.con_order.pojo.OrdOrderinfoExample;
import com.holyrobot.con_order.pojo.OrderDataStatusVo;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface OrdOrderinfoMapper {
    int countByExample(OrdOrderinfoExample example);

    int deleteByExample(OrdOrderinfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrdOrderinfo record);

    int insertSelective(OrdOrderinfo record);

    List<OrdOrderinfo> selectByExample(OrdOrderinfoExample example);

    OrdOrderinfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrdOrderinfo record, @Param("example") OrdOrderinfoExample example);

    int updateByExample(@Param("record") OrdOrderinfo record, @Param("example") OrdOrderinfoExample example);

    int updateByPrimaryKeySelective(OrdOrderinfo record);

    int updateByPrimaryKey(OrdOrderinfo record);

    List<OrderInfoViewDto> getOrder(@Param("dataStatus") String dataStatus, @Param("condition") String condition,
                                    @Param("createId") String createId, @Param("startPage") int startPage, @Param("size") int size);

    List<OrderInfoViewDto> getNewOrder(@Param("dataStatus") String dataStatus, @Param("condition") String condition,
                                       @Param("createId") String createId, @Param("startPage") int startPage,
                                       @Param("orgId") String orgId, @Param("userId") String userId,
                                       @Param("size") int size, @Param("userType") int userType);

    List<OrderInfoViewDto> getVolunteerOrder(@Param("dataStatus") String dataStatus, @Param("condition") String condition,
                                             @Param("userId") String userId, @Param("orgId") String orgId);

    List<OrderInfoViewDto> getOrderByName(@Param("condition") String condition, @Param("createId") String createId
            , @Param("startPage") int startPage, @Param("size") int size);

    int updateOrderStatus(@Param("orderId") String orderId);

    int updateOrderStatusCom(@Param("orderId") String orderId);

    OrderInfoViewDto getOrderInfoForPay(@Param("orderId") String orderId);

    int updateDataStatusAndIsCreditPayById(@Param("orderId") String orderId);

    int updateBillPaymentsById(@Param("orderId") String orderId);

    List<OrderDataStatusVo> getOrderNumByDataStatus(@Param("userId") String userId, @Param("shopType") Integer shopType,
                                                    @Param("condition") String condition, @Param("orgId") String orgId);

    List<OrderDataStatusVo> erpUserGetOrderNumByDataStatus(@Param("orgId") String orgId, @Param("condition") String condition);

    int updateAdjustmentInfo(@Param("orderId") String orderId, @Param("payableAmt") BigDecimal payableAmt);

    int countOrderNumber(@Param("orderNumber") String orderNumber);

    OrdOrderinfo selectByIdOfAll(String id);
}