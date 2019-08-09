package com.holyrobot.con_order.server;

import com.holyrobot.dto.OrderInfoBo;
import com.holyrobot.con_order.pojo.OrdOrderTourist;

import java.util.List;


public interface OrdOrderTouristService {
	
	int addOrderTourist(OrderInfoBo orderInfoBo, String user);
	
//	void insertAll(List<OrdOrderTourist> orderTourists);
	
	int addOrderTourlistByText(List<OrdOrderTourist> tourists);
	
	int deleteTourById(String id);

}
