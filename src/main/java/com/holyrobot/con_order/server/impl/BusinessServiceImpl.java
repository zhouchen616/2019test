package com.holyrobot.con_order.server.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.holyrobot.con_product.mapper.ProProductFileMapper;
import com.holyrobot.con_product.pojo.ProProductFile;
import com.holyrobot.con_product.pojo.ProProductFileExample;
import com.holyrobot.con_product.server.ProTourTrafficService;
import com.holyrobot.dto.*;
import com.holyrobot.response.Response;
import com.holyrobot.util.HttpResponse;
import com.holyrobot.util.HttpUtils;
import com.holyrobot.util.StringUtil;
import lombok.extern.slf4j.Slf4j;
import com.holyrobot.con_order.mapper.*;
import com.holyrobot.con_order.server.*;
import com.holyrobot.con_order.pojo.*;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @ClassName： BusinessServiceImpl
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2018-12-20 16:40
 * @Version: 1.0
 * @Modified By:
 */
@Service
@Slf4j
public class BusinessServiceImpl implements BusinessService {

    @Autowired
    private OrdOrderChangeService ordOrderChangeService;
    @Autowired
    private OrdOrderPriceEditService ordOrderPriceEditService;
    @Autowired
    private OrdOrderTouristEditService ordOrderTouristEditService;
    @Autowired
    private OrdOrderInfoService ordOrderInfoService;
    @Autowired
    private OrdOrderFlightService ordOrderFlightService;
    @Autowired
    private OrdOrderTrainService ordOrderTrainService;
    @Autowired
    private OrdOrderBusService ordOrderBusService;
    @Autowired
    private OrdOrderShipService ordOrderShipService;
    @Autowired
    private OrdOrderTrainMapper ordOrderTrainMapper;
    @Autowired
    private OrdOrderFlightMapper ordOrderFlightMapper;
    @Autowired
    private OrdOrderBusMapper ordOrderBusMapper;
    @Autowired
    private OrdOrderShipMapper ordOrderShipMapper;
    @Autowired
    private OrdOrderTouristMapper ordOrderTouristMapper;
    @Autowired
    private ProTourTrafficService proTourTrafficService;
    @Autowired
    private OrdTourinfoDocMapper ordTourinfoDocMapper;
    @Autowired
    private OrdOrderinfoMapper ordOrderinfoMapper;
    @Autowired
    private ProProductFileMapper proProductFileMapper;
    @Autowired
    private OrdOrderFileMapper ordOrderFileMapper;

    @Value("${airPortUrl.getAirPortName}")
    public String getAirPortName;


    /**
     * @Description: 取消订单业务
     * @auther: 史迪旻
     * @date: 11:21 2018-12-19
     * @param: [ordId, hasTraffic]
     * @return: com.holyrobot.response.Response
     */
    @Override
    public Response cancelOrderInfo(String orderId, Integer hasTraffic) {
        if (hasTraffic < 16) {
            if (hasTraffic == 0 || hasTraffic.equals(0)) {
                int i = ordOrderInfoService.updateOrderStatus(orderId);
                return i > 0 ? new Response().success("订单取消成功！") : new Response().failure("取消订单失败，请联系客服！");
            } else {
                int i = ordOrderInfoService.updateOrderStatus(orderId);
                int j = 0;

                if (hasTraffic == 9 || hasTraffic.equals(9)) {
                    j = ordOrderFlightService.updateDataStatusByOrderId(orderId);
                }
                if (hasTraffic == 10 || hasTraffic.equals(10)) {
                    j = ordOrderTrainService.updateDataStatusByOrderId(orderId);
                }
                if (hasTraffic == 11 || hasTraffic.equals(11)) {
                    j = ordOrderBusService.updateDataStatusByOrderId(orderId);
                }
                if (hasTraffic == 12 || hasTraffic.equals(12)) {
                    j = ordOrderShipService.updateDataStatusByOrderId(orderId);
                }

                return i > 0 && j > 0 ? new Response().success("订单取消成功！") : new Response().failure("取消订单失败，请联系客服！");
            }

        } else {
            String hexString = hasTraffic.toHexString(hasTraffic); //转成16进制
            char[] chars = hexString.toCharArray();
            String goValue = String.valueOf(chars[0]);
            String backVlaue = String.valueOf(chars[1]);
//            去程
            int goTraffic = Integer.parseInt(goValue, 16);
//            回程
            int backTraffic = Integer.parseInt(backVlaue, 16);

            int a = ordOrderInfoService.updateOrderStatus(orderId);
            int b = 0;
            int c = 0;
//            去程大交通
            if (goTraffic == 9) {
                b = ordOrderFlightService.updateDataStatusByOrderId(orderId);
            }
            if (goTraffic == 10) {
                b = ordOrderTrainService.updateDataStatusByOrderId(orderId);
            }
            if (goTraffic == 11) {
                b = ordOrderBusService.updateDataStatusByOrderId(orderId);
            }
            if (goTraffic == 12) {
                b = ordOrderShipService.updateDataStatusByOrderId(orderId);
            }
//            回程大交通
            if (backTraffic == 9) {
                c = ordOrderFlightService.updateDataStatusByOrderId(orderId);
            }
            if (backTraffic == 10) {
                c = ordOrderTrainService.updateDataStatusByOrderId(orderId);
            }
            if (backTraffic == 11) {
                c = ordOrderBusService.updateDataStatusByOrderId(orderId);
            }
            if (backTraffic == 12) {
                c = ordOrderShipService.updateDataStatusByOrderId(orderId);
            }

            return a > 0 && b > 0 && c > 0 ? new Response().success("订单取消成功！") : new Response().failure("取消订单失败，请联系客服！");
        }
    }

    /**
     * @Description: 插入订单的大交通信息
     * @auther: 史迪旻
     * @date: 13:59 2018-12-19
     * @param: [hasTraffic]
     * @return: void
     */
    @Override
    public void addOrderTraffic(Integer hasTraffic, String tourid, String ordid, HttpServletRequest request, int userType, WxUser wxUser) {
        OrdOrderTouristExample ordOrderTouristExample = new OrdOrderTouristExample();
        ordOrderTouristExample.or().andOrderidEqualTo(ordid);
        List<OrdOrderTourist> ordOrderTourists = ordOrderTouristMapper.selectByExample(ordOrderTouristExample);

        switch (hasTraffic) {
            case 9://机票
                List<OrdOrderFlight> ordOrderFlights = new ArrayList<>();
                List<FlightProductDto> flightProductDtos = proTourTrafficService.selectFlightInfo(tourid);
                for (FlightProductDto flightProductDto : flightProductDtos) {
                    for (OrdOrderTourist ordOrderTourist : ordOrderTourists) {
                        OrdOrderFlight ordOrderFlight = new OrdOrderFlight();
                        ordOrderFlight.setId(UUID.randomUUID().toString());//主键
                        ordOrderFlight.setOrderid(ordid);//订单id
                        ordOrderFlight.setVisitorid(ordOrderTourist.getId());//游客主键
                        ordOrderFlight.setFlightdate(flightProductDto.getFlightdate());//出行日期
                        ordOrderFlight.setFlightno(flightProductDto.getToflightno());//去程航班
                        ordOrderFlight.setBegincity(flightProductDto.getDepstation() != null ? flightProductDto.getDepstation() : "");//出发城市
                        ordOrderFlight.setEndcity(flightProductDto.getDesstation() != null ? flightProductDto.getDesstation() : "");//目的地城市
                        if (flightProductDto.getDirection() == 0) {//往返（protourTraffic 和 ordorderflight 标识不同）
                            ordOrderFlight.setXtype(2);//去返程标识 0 去程 1 回城 2 往返
                            ordOrderFlight.setBooktype(1);//预订类型  1：固定计划位预订； 2：非固定计划位预订
                        } else if (flightProductDto.getDirection() == 1) {//去程
                            ordOrderFlight.setXtype(0);//去返程标识 0 去程 1 回城 2 往返
                            ordOrderFlight.setBooktype(2);
                        } else {//回城
                            ordOrderFlight.setXtype(1);//去返程标识 0 去程 1 回城 2 往返
                            ordOrderFlight.setBooktype(2);
                        }
                        ordOrderFlight.setDatastatus(1);//订单状态
                        ordOrderFlight.setCreateddate(new Date());//创建时间
                        ordOrderFlight.setReviseddate(new Date());//更新时间
                        ordOrderFlight.setFlightid(flightProductDto.getId());//航班产品id
                        if (1 == userType) {
                            ErpUser erpUser = (ErpUser) request.getSession().getAttribute("erpUserInfo");
                            ordOrderFlight.setCreatedby(erpUser.getUserName());
                            ordOrderFlight.setCreatedbyid(erpUser.getUserID());
                            ordOrderFlight.setOrgid(erpUser.getOrgID());
                            ordOrderFlight.setOrgname(erpUser.getTravelName());
                            ordOrderFlight.setDeptid(erpUser.getDeptID());
                            ordOrderFlight.setRevisedby(erpUser.getUserName());
                        } else {
                            ordOrderFlight.setCreatedby(wxUser.getNickname());
                            ordOrderFlight.setCreatedbyid(wxUser.getUserId());
                            ordOrderFlight.setOrgid("00000000-0000-0000-0000-000000000000");
                            ordOrderFlight.setOrgname("直客无机构");
                            ordOrderFlight.setDeptid("00000000-0000-0000-0000-000000000000");
                            ordOrderFlight.setRevisedby(wxUser.getNickname());
                        }
                        ordOrderFlights.add(ordOrderFlight);
                    }
                }
                //开始写入
                log.info("开始写入订单飞机大交通！");
                for (OrdOrderFlight ordOrderFlight : ordOrderFlights) {
                    ordOrderFlightMapper.insert(ordOrderFlight);
                }

                break;
            case 10://火车票
                List<OrdOrderTrain> ordOrderTrains = new ArrayList<>();
                //查询火车票相关信息
                List<TrainProductDto> trainProductDtos = proTourTrafficService.selectTrainInfo(tourid);
                for (TrainProductDto trainProductDto : trainProductDtos) {
                    for (OrdOrderTourist ordOrderTourist : ordOrderTourists) {
                        OrdOrderTrain ordOrderTrain = new OrdOrderTrain();
                        ordOrderTrain.setId(UUID.randomUUID().toString());
                        ordOrderTrain.setOrderid(ordid);//订单主键
                        ordOrderTrain.setVisitorid(ordOrderTourist.getId());//游客主键
                        ordOrderTrain.setBeignstation(trainProductDto.getDepstation() != null ? trainProductDto.getDepstation() : "");//出发地
                        ordOrderTrain.setEndstation(trainProductDto.getDesstation() != null ? trainProductDto.getDesstation() : "");//目的地
                        ordOrderTrain.setTrainno(trainProductDto.getStationTrainCode());//车次
                        ordOrderTrain.setTraindate(trainProductDto.getGodate());//出发日期
                        ordOrderTrain.setDatastatus(1);//订单状态
                        ordOrderTrain.setCreateddate(new Date());
                        ordOrderTrain.setReviseddate(new Date());
                        ordOrderTrain.setTrainid(trainProductDto.getId());
                        if (trainProductDto.getDirection() == 0) {//往返（protourTraffic 和 ordorderflight 标识不同）
                            ordOrderTrain.setXtype(2);//去返程标识 0 去程 1 回城 2 往返
                        } else if (trainProductDto.getDirection() == 1) {//去程
                            ordOrderTrain.setXtype(0);//去返程标识 0 去程 1 回城 2 往返
                        } else {//回城
                            ordOrderTrain.setXtype(1);//去返程标识 0 去程 1 回城 2 往返
                        }
                        if (1 == userType) {
                            ErpUser erpUser = (ErpUser) request.getSession().getAttribute("erpUserInfo");
                            ordOrderTrain.setDeptid(erpUser.getDeptID());
                            ordOrderTrain.setOrgid(erpUser.getOrgID());
                            ordOrderTrain.setCreatedby(erpUser.getUserName());
                            ordOrderTrain.setCreatedbyid(erpUser.getUserID());
                            ordOrderTrain.setRevisedby(erpUser.getUserName());
                            ordOrderTrain.setOrgname(erpUser.getTravelName());
                        } else {
                            ordOrderTrain.setCreatedby(wxUser.getNickname());
                            ordOrderTrain.setCreatedbyid(wxUser.getUserId());
                            ordOrderTrain.setOrgid("00000000-0000-0000-0000-000000000000");
                            ordOrderTrain.setOrgname("直客无机构");
                            ordOrderTrain.setDeptid("00000000-0000-0000-0000-000000000000");
                            ordOrderTrain.setRevisedby(wxUser.getNickname());
                        }
                        ordOrderTrains.add(ordOrderTrain);
                    }
                }
                log.info("开始写入订单火车票大交通！");
                for (OrdOrderTrain ordOrderTrain : ordOrderTrains) {
                    ordOrderTrainMapper.insert(ordOrderTrain);
                }
                break;
            case 11://汽车票
                List<OrdOrderBus> ordOrderBuss = new ArrayList<>();
                //查询火车票相关信息
                List<BusProductDto> busProductDtos = proTourTrafficService.selectBusInfo(tourid);
                for (BusProductDto busProductDto : busProductDtos) {
                    for (OrdOrderTourist ordOrderTourist : ordOrderTourists) {
                        OrdOrderBus ordOrderBus = new OrdOrderBus();
                        ordOrderBus.setId(UUID.randomUUID().toString());//hide
                        ordOrderBus.setOrderid(ordid);//订单主键
                        ordOrderBus.setVisitorid(ordOrderTourist.getId());//游客主键
                        ordOrderBus.setBeignstation(busProductDto.getDepstation() != null ? busProductDto.getDepstation() : "");//出发地
                        ordOrderBus.setEndstation(busProductDto.getDesstation() != null ? busProductDto.getDesstation() : "");//目的地
                        ordOrderBus.setBuscode(busProductDto.getCarcode());//车次
                        ordOrderBus.setBusid(busProductDto.getId());//汽车产品主键
                        ordOrderBus.setDatastatus(1);//订单状态 1 正常
                        ordOrderBus.setStartdate(busProductDto.getGodate());//出发日期
                        ordOrderBus.setCreateddate(new Date());//创建日期
                        ordOrderBus.setReviseddate(new Date());
                        if (busProductDto.getDirection() == 0) {//往返（protourTraffic 和 ordorderflight 标识不同）
                            ordOrderBus.setXtype(2);//去返程标识 0 去程 1 回城 2 往返
                        } else if (busProductDto.getDirection() == 1) {//去程
                            ordOrderBus.setXtype(0);//去返程标识 0 去程 1 回城 2 往返
                        } else {//回城
                            ordOrderBus.setXtype(1);//去返程标识 0 去程 1 回城 2 往返
                        }
                        if (1 == userType) {
                            ErpUser erpUser = (ErpUser) request.getSession().getAttribute("erpUserInfo");
                            ordOrderBus.setDeptid(erpUser.getDeptID());
                            ordOrderBus.setOrgid(erpUser.getOrgID());
                            ordOrderBus.setCreatedby(erpUser.getUserName());
                            ordOrderBus.setCreatedbyid(erpUser.getUserID());
                            ordOrderBus.setRevisedby(erpUser.getUserName());
                            ordOrderBus.setOrgname(erpUser.getTravelName());
                        } else {
                            ordOrderBus.setCreatedby(wxUser.getNickname());
                            ordOrderBus.setCreatedbyid(wxUser.getUserId());
                            ordOrderBus.setOrgid("00000000-0000-0000-0000-000000000000");
                            ordOrderBus.setOrgname("直客无机构");
                            ordOrderBus.setDeptid("00000000-0000-0000-0000-000000000000");
                            ordOrderBus.setRevisedby(wxUser.getNickname());
                        }
                        ordOrderBuss.add(ordOrderBus);
                    }
                }
                //开始写入
                log.info("开始写入订单汽车大交通！");
                for (OrdOrderBus ordOrderBus : ordOrderBuss) {
                    ordOrderBusMapper.insert(ordOrderBus);
                }
                break;
            case 12://船票
                List<OrdOrderShip> ordOrderShips = new ArrayList<>();
                //查询火车票相关信息
                List<ShipProductDto> shipProductDtos = proTourTrafficService.selectShipInfo(tourid);
                for (ShipProductDto shipProductDto : shipProductDtos) {
                    for (OrdOrderTourist ordOrderTourist : ordOrderTourists) {
                        OrdOrderShip ordOrderShip = new OrdOrderShip();
                        ordOrderShip.setId(UUID.randomUUID().toString());
                        ordOrderShip.setOrderid(ordid);//订单主键
                        ordOrderShip.setVisitorid(ordOrderTourist.getId());//游客主键
                        ordOrderShip.setStartdate(shipProductDto.getGodate());//出发日期
                        ordOrderShip.setBeignstation(shipProductDto.getDepstation() != null ? shipProductDto.getDepstation() : "");//出发地
                        ordOrderShip.setEndstation(shipProductDto.getDesstation() != null ? shipProductDto.getDesstation() : "");//目的地
                        ordOrderShip.setDatastatus(1);//订单状态
                        ordOrderShip.setShipcode(shipProductDto.getShipcode());//船次
                        ordOrderShip.setShipid(shipProductDto.getId());//船票产品id
                        ordOrderShip.setCreateddate(new Date());//创建日期
                        ordOrderShip.setReviseddate(new Date());
                        if (shipProductDto.getDirection() == 0) {//往返（protourTraffic 和 ordorderflight 标识不同）
                            ordOrderShip.setXtype(2);//去返程标识 0 去程 1 回城 2 往返
                        } else if (shipProductDto.getDirection() == 1) {//去程
                            ordOrderShip.setXtype(0);//去返程标识 0 去程 1 回城 2 往返
                        } else {//回城
                            ordOrderShip.setXtype(1);//去返程标识 0 去程 1 回城 2 往返
                        }
                        if (1 == userType) {
                            ErpUser erpUser = (ErpUser) request.getSession().getAttribute("erpUserInfo");
                            ordOrderShip.setDeptid(erpUser.getDeptID());
                            ordOrderShip.setOrgid(erpUser.getOrgID());
                            ordOrderShip.setCreatedby(erpUser.getUserName());
                            ordOrderShip.setCreatedbyid(erpUser.getUserID());
                            ordOrderShip.setRevisedby(erpUser.getUserName());
                            ordOrderShip.setOrgname(erpUser.getTravelName());
                        } else {
                            ordOrderShip.setCreatedby(wxUser.getNickname());
                            ordOrderShip.setCreatedbyid(wxUser.getUserId());
                            ordOrderShip.setOrgid("00000000-0000-0000-0000-000000000000");
                            ordOrderShip.setOrgname("直客无机构");
                            ordOrderShip.setDeptid("00000000-0000-0000-0000-000000000000");
                            ordOrderShip.setRevisedby(wxUser.getNickname());
                        }
                        ordOrderShips.add(ordOrderShip);
                    }
                }
                //开始写入
                log.info("开始写入订单船票大交通！");
                for (OrdOrderShip ordOrderShip : ordOrderShips) {
                    ordOrderShipMapper.insert(ordOrderShip);
                }
                break;
        }
    }

    /**
     * @Description: 通过机场三字码获得机场中文全名
     * @auther: 史迪旻
     * @date: 10:54 2018-12-21
     * @param: [airPort]
     * @return: java.lang.String
     */
    @Override
    public String getAirPort(String airPort) {

        if (StringUtil.isEnglish(airPort) && airPort.length() == 3) {
//            访问api获取用户信息
            HttpResponse userRespones = HttpUtils.httpClientGet(getAirPortName + airPort);
            log.info("调用API接口返回值：{}", userRespones.getData());
//            API返回不为空
            JSONArray jsonObject = JSONObject.parseArray(userRespones.getData());
            if (Objects.nonNull(jsonObject) && jsonObject.size() > 0) {
                JSONObject object = jsonObject.getJSONObject(0);
                String airPortName = object.getString("AirportName");
                log.info("^ ^三字码查询成功!");
                return airPortName;
            }
        }

        return airPort;
    }

    /**
     * @Description:
     * @auther: 史迪旻
     * @date: 14:48 2019-1-23
     * @param: [orderInfo]
     * @return: java.util.List<com.holyrobot.dto.OrderInfoViewVo>
     */
    @Override
    public List<OrderInfoViewVo> getOrderList(List<OrderInfoViewDto> orderInfo) {
        List<OrderInfoViewVo> orderList = new ArrayList();

        for (int i = 0; i < orderInfo.size(); i++) {
            OrderInfoViewVo orderInfoViewVo = new OrderInfoViewVo();
            OrderInfoViewDto dto = orderInfo.get(i);
            String ordId = dto.getOrdId();

            OrdTourinfoDocExample example = new OrdTourinfoDocExample();
            example.or().andOrderidEqualTo(ordId).andDatastatusEqualTo(0);
            List<OrdTourinfoDoc> ordTourInfoDocs = ordTourinfoDocMapper.selectByExample(example);
            if (ordTourInfoDocs.isEmpty() || ordTourInfoDocs == null) {
//                orderInfoViewVo.setFileUrl("");
                orderInfoViewVo.setHasOrderDoc(0);
            } else {
                orderInfoViewVo.setFileUrl(ordTourInfoDocs.get(0).getFileurl());
                orderInfoViewVo.setHasOrderDoc(1);
            }
            orderInfoViewVo.setOrdId(dto.getOrdId() + "(商城)");
            orderInfoViewVo.setProId(dto.getProId());
            orderInfoViewVo.setProTourId(dto.getProTourId());
            orderInfoViewVo.setAliaseName(dto.getAliaseName());
            orderInfoViewVo.setOrderNo(dto.getOrderNo());
            orderInfoViewVo.setTourDate(dto.getTourDate());
            orderInfoViewVo.setAdultNum(dto.getAdultNum());
            orderInfoViewVo.setChildNum(dto.getChildNum());
            orderInfoViewVo.setTourDays(dto.getTourDays());
            orderInfoViewVo.setPayableAmt(dto.getPayableAmt());
            orderInfoViewVo.setCoverImg(dto.getCoverImg());
            orderInfoViewVo.setTotalNum(dto.getTotalNum());
            orderInfoViewVo.setReturnDate(dto.getReturnDate());
            orderInfoViewVo.setDataStatus(dto.getDataStatus());
            orderInfoViewVo.setContact(dto.getContact());
            orderInfoViewVo.setMobile(dto.getMobile());
            orderInfoViewVo.setCreatedDate(dto.getCreatedDate());
            orderInfoViewVo.setSupplierName(dto.getSupplierName());
            orderInfoViewVo.setDestName(dto.getDestName());
            orderInfoViewVo.setPayMobile(dto.getPayMobile());
            orderInfoViewVo.setUserId(dto.getUserId());
            orderInfoViewVo.setSupplierID(dto.getSupplierID());
            orderInfoViewVo.setCommissionAmt(dto.getCommissionAmt());
            orderList.add(orderInfoViewVo);

        }

        return orderList;
    }


    /**
     * @Description: 生成订单号
     * @auther: 史迪旻
     * @date: 15:20 2019-3-6
     * @param: []
     * @return: java.lang.String
     */
    @Override
    public String getOrderNumber(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        String tourDate = simpleDateFormat.format(date);
        String orderNumber = "S" + tourDate + RandomStringUtils.randomNumeric(4);
        int count = ordOrderinfoMapper.countOrderNumber(orderNumber);

        if (count == 0) {
            return orderNumber;
        } else {
            this.getOrderNumber(date);
        }

        return null;
    }

    /**
     * @Description: 生成志愿者订单号
     * @auther: 史迪旻
     * @date: 17:24 2019-3-11
     * @param: [date]
     * @return: java.lang.String
     */
    @Override
    public String getVolOrderNumber(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        String tourDate = simpleDateFormat.format(date);
        String orderNumber = "S" + tourDate + RandomStringUtils.randomNumeric(4) + "(志愿者)";
        int count = ordOrderinfoMapper.countOrderNumber(orderNumber);

        if (count == 0) {
            return orderNumber;
        } else {
            this.getOrderNumber(date);
        }

        return null;
    }


    /**
     * @Description:
     * @auther: 史迪旻
     * @date: 09:21 2019-5-15
     * @param: [orgId, orderId, proId]
     * @return: void
     */
    @Override
    @Transactional
    public void addOrdInfoFile(String orgId, String orderId, String proId) {
        ProProductFileExample example = new ProProductFileExample();
        example.or().andOrgidEqualTo(orgId).andProductidEqualTo(proId);
        List<ProProductFile> proProductFiles = proProductFileMapper.selectByExample(example);
        if (proProductFiles != null && proProductFiles.size() > 0) {
            log.info("addOrdInfoFile: 写入开始");
            for (int i = 0; i < proProductFiles.size(); i++) {
                log.info("addOrdInfoFile: proProductFile{}", JSONObject.toJSONString(proProductFiles.get(i)));
                ProProductFile proFile = proProductFiles.get(i);
                OrdOrderFile file = new OrdOrderFile();
                file.setId(UUID.randomUUID().toString());
                file.setOrgid(orgId);
                file.setFilename(proFile.getFilename());
                file.setExtendname(proFile.getExtendname());
                file.setItemindex(proFile.getItemindex());
                file.setOrderid(orderId);
                file.setFileurl(proFile.getFileurl());
                file.setWidth(proFile.getWidth());
                file.setHeight(proFile.getHeight());

                ordOrderFileMapper.insertSelective(file);
            }
        }

    }

}
