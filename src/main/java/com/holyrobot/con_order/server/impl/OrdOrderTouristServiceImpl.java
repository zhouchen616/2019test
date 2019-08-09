package com.holyrobot.con_order.server.impl;

import com.holyrobot.dto.OrderInfoBo;
import com.holyrobot.con_order.mapper.OrdOrderTouristMapper;
import com.holyrobot.con_order.pojo.OrdOrderTourist;
import com.holyrobot.con_order.server.OrdOrderTouristService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.UUID;


@Service("ordOrderTouristService")
public class OrdOrderTouristServiceImpl implements OrdOrderTouristService {

	@Autowired
	private OrdOrderTouristMapper ordOrderTouristMapper;

	/**
	 * @Description 添加游客信息(单个)
	 * @author 周相儒
	 * @date 2018年3月23日 下午7:02:39
	 * @action addOrderTourist
	 */
	@Override
	@Transactional//暂时事务没有成立
	public int addOrderTourist(OrderInfoBo orderInfoBo , String userId) {
	/*	//获取用户信息
		String url = "http://www.mrlizhongxin.com:8766/api/User/Get?userID="+userId;
		Map<String, String> maps = new HashMap<>();
		maps.put("Content-Type", "application/json");
		HttpResponse user = HttpUtils.httpClientGet(url, maps);
		JSONObject jsonObject = JSONObject.parseObject(user.getData());
		// 取出值
		int j = 0;
		List<OrdOrderTourist> orderTourists = new ArrayList<>();
		List<String> guestname = orderInfoBo.getGuestname();
		List<String> guestsex = orderInfoBo.getGuestsex();
		List<String> guestaddress = orderInfoBo.getGuestaddress();
		List<String> guestcard = orderInfoBo.getGuestcard();
		List<String> guesttelphone = orderInfoBo.getGuesttelphone();//页面和后台需要做非空验证，确保list有数据
		if (guesttelphone.size() > 0) {//循环写入游客信息（后期改为批量）
			for (int i = 0; i < guesttelphone.size(); i++) {
				OrdOrderTourist orderTourists1 = new OrdOrderTourist();
				orderTourists1.setId(UUID.randomUUID().toString());
				orderTourists1.setOrderid(UUID.randomUUID().toString());
				orderTourists1.setGuestcard(guestcard.get(i));
				orderTourists1.setGuestaddress(guestaddress.get(i));
				orderTourists1.setGuesttelphone(guesttelphone.get(i));
				orderTourists1.setGuestname(guestname.get(i));
				orderTourists1.setGuestsex(guestsex.get(i));
				orderTourists1.setCreatedby(jsonObject.getString("UserName"));
				orderTourists1.setCreateddate(new Date());
				orderTourists1.setCreatedid(jsonObject.getString("ID"));
				orderTourists1.setDeptid(jsonObject.getString("DeptID"));
				orderTourists1.setRevisedby("heheh");
				orderTourists1.setReviseddate(new Date());
				orderTourists.add(orderTourists1);
				
			}
		}
		for (OrdOrderTourist orderTourist : orderTourists) {
			j= j + ordOrderTouristMapper.insert(orderTourist);//插入
		}
		return j;*/
	    return  1;
	}

	/**
	 * @Description 通过Excel和无格式粘贴的方式添加游客信息
	 * @author 周相儒
	 * @date 2018年4月18日 上午9:31:03
	 * @action addOrderTourlistByText
	 */
	@Override
	public int addOrderTourlistByText(List<OrdOrderTourist> tourists) {
		int j = 0;
		for (OrdOrderTourist orderTourist : tourists) {
			orderTourist.setId(UUID.randomUUID().toString());
			orderTourist.setCreatedby("UserName");
			orderTourist.setCreateddate(new Date());
			orderTourist.setCreatedid(UUID.randomUUID().toString());
			orderTourist.setDeptid(UUID.randomUUID().toString());
			orderTourist.setRevisedby("heheh");
			orderTourist.setReviseddate(new Date());
			j= j + ordOrderTouristMapper.insert(orderTourist);//插入
		}
		return j;
	}

	/**
	 * @Description 根据主键删除（前台Excel和无格式粘贴方式 可以删除）
	 * @author 周相儒
	 * @date 2018年4月19日 下午4:13:34
	 * @action deleteTourById
	 */
	@Override
	public int deleteTourById(String id) {
		return ordOrderTouristMapper.deleteByPrimaryKey(id);
	}



}
