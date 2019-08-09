package com.holyrobot.con_order.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.holyrobot.bo.ModifyProductBo;
import com.holyrobot.con_common.pojo.CommNationality;
import com.holyrobot.con_common.server.CommNationalityService;
import com.holyrobot.con_order.mapper.OrdOrderLogMapper;
import com.holyrobot.con_order.pojo.*;
import com.holyrobot.con_order.server.*;
import com.holyrobot.con_product.mapper.ProProductDirectSalesMapper;
import com.holyrobot.con_product.mapper.ProProductDirectVenueMapper;
import com.holyrobot.con_product.pojo.*;
import com.holyrobot.con_product.server.*;
import com.holyrobot.con_res.pojo.ResBusTicket;
import com.holyrobot.con_res.pojo.ResFlightinfo;
import com.holyrobot.con_res.pojo.ResShipTicket;
import com.holyrobot.con_res.pojo.ResTrainTicket;
import com.holyrobot.con_res.server.*;
import com.holyrobot.con_volunteer.mapper.VolunteerProductMapper;
import com.holyrobot.con_volunteer.mapper.VolunteerProductTourMapper;
import com.holyrobot.con_volunteer.pojo.VolunteerProductTour;
import com.holyrobot.con_volunteer.server.VolunteerOrderService;
import com.holyrobot.con_volunteer.server.VolunteerProductService;
import com.holyrobot.con_volunteer.server.VolunteerProductTourService;
import com.holyrobot.con_wechat.server.WxService;
import com.holyrobot.config.RedisClient;
import com.holyrobot.constant.Constants;
import com.holyrobot.dto.*;
import com.holyrobot.response.Response;
import com.holyrobot.util.Base64DecodedMultipartFile;
import com.holyrobot.util.HttpResponse;
import com.holyrobot.util.HttpUtils;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: 周相儒
 * @Description: 订单操作控制层
 * @CreateDate: 2018/5/9 11:07
 * @Version: 1.0
 */
@Slf4j
@RestController
@Api(tags = "订单操作控制层模块")
public class OrderController {

    @Autowired
    private ProProductDepartureService proProductDepartureService;
    @Autowired
    private OrdOrderInfoService ordOrderInfoService;
    @Autowired
    private ProTourPricePolicyService proTourPricePolicyService;
    @Autowired
    private RedisClient jedisClientService;
    @Autowired
    private ResFlightinfoSerivce resFlightinfoSerivce;
    @Autowired
    private ProTourService proTourService;
    @Autowired
    private ResFlightcabinService resFlightcabinService;
    @Autowired
    private ProductDepartureService productDepartureService;
    @Autowired
    private ProTourVenueService proTourVenueService;
    @Autowired
    private ProTourTrafficService proTourTrafficService;
    @Autowired
    private ResTrainTicketService resTrainTicketService;
    @Autowired
    private ResBusTicketService resBusTicketService;
    @Autowired
    private ResShipTicketService resShipTicketService;
    @Autowired
    private OrdOrderChangeService ordOrderChangeService;
    @Autowired
    private OrdOrderPriceEditService ordOrderPriceEditService;
    @Autowired
    private OrdOrderTouristEditService ordOrderTouristEditService;
    @Autowired
    private OrdOrderFlightService ordOrderFlightService;
    @Autowired
    private OrdOrderTrainService ordOrderTrainService;
    @Autowired
    private OrdOrderBusService ordOrderBusService;
    @Autowired
    private OrdOrderShipService ordOrderShipService;
    @Autowired
    private BusinessService businessService;
    @Autowired
    private CommNationalityService commNationalityService;
    @Autowired
    private VolunteerOrderService volunteerOrderService;
    @Autowired
    private VolunteerProductTourService volunteerProductTourService;
    @Autowired
    private VolunteerProductTourMapper volunteerProductTourMapper;
    @Autowired
    private VolunteerProductService volunteerProductService;
    @Autowired
    private ProProductDirectVenueMapper proProductDirectVenueMapper;
    @Autowired
    private VolunteerProductMapper volunteerProductMapper;
    @Autowired
    private OrdOrderLogMapper ordOrderLogMapper;
    @Autowired
    private ProProductDirectSalesMapper proProductDirectSalesMapper;
    @Autowired
    private WxService wxService;

    @Value("${airPortUrl.url}")
    private String airPortUrl;
    @Value("${imgPath}")
    public String path;
    @Value("${imgUrl}")
    public String imgUrl;
    @Value("${devStatus}")
    private String devStatus;
    @Value("${airPortUrl.GetGeneratePlaceholder}")
    private String getGeneratePlaceholder;
    @Value("${h5Url}")
    private String h5url;
    @Value("${airPortUrl.dishonestPeople}")
    private String dishonestPeople;
    @Value("${airPortUrl.sendTemplateMsg}")
    private String sendTemplateMsg;

    /**
     * @return void
     * @Description 订单信息插入跳转链接
     * @author 周相儒
     * @date 2018年3月23日 下午7:09:49
     * @action addOrdmessageserInfo
     */
    @RequestMapping(value = "/addOrderInfo", method = RequestMethod.POST)
    public Response addOrderInfo(HttpServletRequest request, @RequestBody JSONObject params) {
        log.info("/addOrderInfo请求参数：{}", params.toJSONString());
        log.info("当前登录人信息:{}", request.getSession().getAttribute("wxUserInfo"));
        WxUser wxUserInfo = (WxUser) request.getSession().getAttribute("wxUserInfo");
        Integer isOutgoing = params.getInteger("isOutgoing");
        Integer shopType = params.getInteger("shopType");

//        新增旅游志愿者普通产品 插入订单
        if (shopType != null && shopType == 1) {
            log.info("/addOrderInfo接口：旅游志愿者 -- 产品 插入订单");
            Response addOrderInfo = volunteerOrderService.volunteerAddOrdInfo(params, request);
            if (addOrderInfo.getMeta().isSuccess() && shopType != null && shopType == 1) {
                Map data = (Map) addOrderInfo.getData();
                HttpResponse orderId = HttpUtils.httpClientGet(getGeneratePlaceholder + data.get("orderId"));
                log.info("旅游志愿者:请求API .net接口，提交占位单，返回值{}", orderId.getData());
                //发送模板消息
                wxService.wxMpTemplateMessage(params.getString("orgId"), wxUserInfo==null?"ojwmI1FehpOCGEOdsPE8PUru4ZbY":wxUserInfo.getOpenId(), data.get("orderId").toString());
                //发送消息给卖方
                SendOrderTemplateConsumerDto sendOrderTemplateConsumerDto = new SendOrderTemplateConsumerDto();
                sendOrderTemplateConsumerDto.setOrderId(((Map<String,String>)addOrderInfo.getData()).get("orderId"));
                sendOrderTemplateConsumerDto.setType(2);
                String rep = HttpUtils.jsonPost(sendTemplateMsg, JSON.toJSONString(sendOrderTemplateConsumerDto));
                log.info("下单成功，发送模板消息给卖方返回={}", rep);
            }

            //数据插入成功，调用失信人
            //HttpResponse clientGet = HttpUtils.httpClientGet(dishonestPeople + ((Map<String,String>)addOrderInfo.getData()).get("orderId"));
            //log.info("调用失信人接口={}", clientGet.getData());
            return addOrderInfo;
        }

//```````````````````````````````````````````````````````````````````````````````````````````````````````````````````
//        判断是否为外发产品
        if (isOutgoing != null && isOutgoing == 1) {
            log.info("···外发产品订单信息插入···");
            Response addOrderInfo = proProductDepartureService.newAddOrderInfo(params, request);
            if (addOrderInfo.getMeta().isSuccess()) {
                Map data = (Map) addOrderInfo.getData();
                HttpResponse orderId = HttpUtils.httpClientGet(getGeneratePlaceholder + data.get("orderId"));
                log.info("请求API。net接口，提交占位单，返回值{}", orderId.getData());
                //发送消息给卖方
                SendOrderTemplateConsumerDto sendOrderTemplateConsumerDto = new SendOrderTemplateConsumerDto();
                sendOrderTemplateConsumerDto.setOrderId(((Map<String,String>)addOrderInfo.getData()).get("orderId"));
                sendOrderTemplateConsumerDto.setType(2);
                String rep = HttpUtils.jsonPost(sendTemplateMsg, JSON.toJSONString(sendOrderTemplateConsumerDto));
                log.info("下单成功，发送模板消息给卖方返回={}", rep);
            }
            //数据插入成功，调用失信人
            //HttpResponse clientGet = HttpUtils.httpClientGet(dishonestPeople + ((Map<String,String>)addOrderInfo.getData()).get("orderId"));
            //log.info("调用失信人API返回={}", clientGet.getData());
            //发送模板消息
            wxService.wxMpTemplateMessage(params.getString("orgId"), wxUserInfo==null?"ojwmI1FehpOCGEOdsPE8PUru4ZbY":wxUserInfo.getOpenId(), ((Map<String,String>)addOrderInfo.getData()).get("orderId"));
            return addOrderInfo;
        }


        Response response1 = null;
        Response response = ordOrderInfoService.validatePrice(params, request);
        log.info("添加订单验证价格结果:{}", JSONObject.toJSONString(response));
        if (response.getMeta().isSuccess()) {
            log.info("验证通过，开始写入订单！");
            try {
                response1 = ordOrderInfoService.addOrderInfo(params, request);//插入订单 ，返回订单编号
            } catch (RuntimeException e) {
                return new Response().failure(e.getMessage());
            }
        } else {
            return new Response().failure(response.getMeta().getMessage());
        }
        if (Objects.nonNull(response1) && response1.getMeta().isSuccess()) {
            //数据插入成功，调用失信人
//            HttpResponse clientGet = HttpUtils.httpClientGet(dishonestPeople + ((Map<String,String>)response1.getData()).get("orderId"));
//            log.info("调用失信人API返回={}", clientGet.getData());
            //发送模板消息
            wxService.wxMpTemplateMessage(params.getString("orgId"), wxUserInfo==null?"ojwmI1FehpOCGEOdsPE8PUru4ZbY":wxUserInfo.getOpenId(), ((Map<String,String>)response1.getData()).get("orderId"));
            //发送消息给卖方
            SendOrderTemplateConsumerDto sendOrderTemplateConsumerDto = new SendOrderTemplateConsumerDto();
            sendOrderTemplateConsumerDto.setOrderId(((Map<String,String>)response1.getData()).get("orderId"));
            sendOrderTemplateConsumerDto.setType(2);
            String rep = HttpUtils.jsonPost(sendTemplateMsg, JSON.toJSONString(sendOrderTemplateConsumerDto));
            log.info("下单成功，发送模板消息给卖方返回={}", rep);
            return new Response().success(response1.getData());
        }
        return new Response().failure(response1.getMeta().getMessage());

    }


    /**
     * @return Response
     * @Description 根据产品id异步加载产品信息显示
     * @author 周相儒
     * @date 2018年4月9日 下午5:04:05
     * @action getMessage
     */
    @RequestMapping(value = "/messages", method = RequestMethod.POST)
    public Response getMessage(@RequestBody JSONObject params) {
        log.info("/getMessage接口参数：" + params.toJSONString());
        String proid = params.getString("proid");
        String tourid = params.getString("tourid");
        String depId = params.getString("depid");
        String siteId = params.getString("siteid");
        ProductBo productBo = new ProductBo();
        List<TrafficDto> trafficDtos = new ArrayList<>();
        TrafficDto trafficDto = new TrafficDto();
        Integer shopType = params.getInteger("shopType");
        if (shopType != null && shopType == 1) {
            VolunteerProductTour volunteerProductTour = volunteerProductTourMapper.selectByPrimaryKey(tourid);
            tourid = volunteerProductTour.getTourid();
        }
        //产品相关信息
        ProProduct proProduct = ordOrderInfoService.selectById(proid);
        //飞机票相关信息
        List<FlightInfoDto> FlightInfoDto = new ArrayList<>();//封装机票信息
        ProTour proTour = proTourService.selectById(tourid);//查出对应的团期的航班编号


        Integer hastraffic = proTour.getHastraffic();
        if (hastraffic != null && !hastraffic.equals(0)) { //判断是否含有大交通
            switch (hastraffic) {
                case 9: //9 = 机票
                    //获得 团次大交通表 和 机票产品表 信息
                    List<FlightProductDto> flightProductDto = proTourTrafficService.selectFlightInfo(proTour.getId());
//                   根据 Pro_Tour_Traffic【团次大交通表】结构信息 中 往返类型 进行分组
                    Map<Integer, List<FlightProductDto>> collect = flightProductDto.stream().collect(Collectors.groupingBy(FlightProductDto::getDirection));

                    Iterator<Integer> keys = collect.keySet().iterator();
                    while (keys.hasNext()) {
                        Integer key = keys.next();
                        if (key == 0) { //往返
                            FlightProductDto flightProduct = collect.get(0).get(key);
                            Date flightDate = flightProduct.getFlightdate(); //出发日期
                            Integer intervaldays = flightProduct.getIntervaldays(); //行程天数
                            String toflightno = flightProduct.getToflightno(); //出发航班号
                            String fromflightno = flightProduct.getFromflightno(); //回程航班号
//                      日期运算  计算回程日期
                            Calendar calendar = Calendar.getInstance();
                            calendar.setTime(flightDate);
                            calendar.add(Calendar.DAY_OF_MONTH, intervaldays);

                            Date calendarTime = calendar.getTime(); //回程日期

                            List<ResFlightinfo> toResFlightInfo = resFlightinfoSerivce.selectByFlightNoAndFlightDate(toflightno, flightDate); //去程
                            ResFlightinfo flightinfo = toResFlightInfo.get(0);

//                            航站楼转译信息
                            String beginterm = flightinfo.getBeginterm();
                            trafficDto.setDeparturePoint(businessService.getAirPort(beginterm));//出发
                            String endterm = flightinfo.getEndterm();
                            trafficDto.setDepEndPoint(businessService.getAirPort(endterm));//到达

                            trafficDto.setDepartureNo(flightinfo.getFlightno());
                            trafficDto.setDepartureCity(flightinfo.getBegincity());
                            trafficDto.setDepartureDate(flightinfo.getFlightdate());
                            trafficDto.setDepartureStatus(9);
                            trafficDto.setDepBeginTime(flightinfo.getBegintime());
                            trafficDto.setDepEndTime(flightinfo.getEndtime());
                            trafficDto.setDepEndCity(flightinfo.getEndcity());

//                            航班回程信息
                            List<ResFlightinfo> fromFlightInfo = resFlightinfoSerivce.selectByFlightNoAndFlightDate(fromflightno, calendarTime); //回程
                            ResFlightinfo backFlightInfo = fromFlightInfo.get(0);
//                            航站楼转译信息
                            String backBeginterm = backFlightInfo.getBeginterm();
                            trafficDto.setBackPoint(businessService.getAirPort(backBeginterm));
                            String backEndterm = backFlightInfo.getEndterm();
                            trafficDto.setBackEndPoint(businessService.getAirPort(backEndterm));

                            trafficDto.setBackStatus(9);
                            trafficDto.setBackNo(backFlightInfo.getFlightno());
                            trafficDto.setBackDate(backFlightInfo.getFlightdate());
                            trafficDto.setBackCity(backFlightInfo.getBegincity());
                            trafficDto.setBackBeginTime(backFlightInfo.getBegintime());
                            trafficDto.setBackEndTime(backFlightInfo.getEndtime());
                            trafficDto.setBackEndCity(backFlightInfo.getEndcity());

                            log.info("`````飞机往返信息查询成功！");

                        }

                        if (key == 1) { //去程
                            FlightProductDto flightProduct = collect.get(1).get(0);
                            Date flightDate = flightProduct.getFlightdate(); //出发日期
                            String toflightno = flightProduct.getToflightno(); //出发航班号

                            List<ResFlightinfo> toResFlightInfo = resFlightinfoSerivce.selectByFlightNoAndFlightDate(toflightno, flightDate); //去程
                            ResFlightinfo toFlightInfo = toResFlightInfo.get(0);
//                            航站楼转译信息
                            String beginterm = toFlightInfo.getBeginterm();
                            trafficDto.setDeparturePoint(businessService.getAirPort(beginterm));//出发
                            String endterm = toFlightInfo.getEndterm();
                            trafficDto.setDepEndPoint(businessService.getAirPort(endterm));//到达

                            trafficDto.setDepartureNo(toFlightInfo.getFlightno());
                            trafficDto.setDepartureCity(toFlightInfo.getBegincity());
                            trafficDto.setDepartureDate(toFlightInfo.getFlightdate());
                            trafficDto.setDepartureStatus(9);
                            trafficDto.setDepBeginTime(toFlightInfo.getBegintime());
                            trafficDto.setDepEndTime(toFlightInfo.getEndtime());
                            trafficDto.setDepEndCity(toFlightInfo.getEndcity());

                            log.info("`````飞机去程信息查询成功！");

                        }

                        if (key == 2) { //回程
                            FlightProductDto flightProduct = collect.get(2).get(0);
                            Date flightDate = flightProduct.getFlightdate(); //出发日期
                            String toflightno = flightProduct.getToflightno(); //出发航班号

                            List<ResFlightinfo> toResFlightInfo = resFlightinfoSerivce.selectByFlightNoAndFlightDate(toflightno, flightDate); //去程
                            ResFlightinfo resFlightinfo = toResFlightInfo.get(0);
//                            航站楼转译信息
                            String beginterm = resFlightinfo.getBeginterm();
                            trafficDto.setBackPoint(businessService.getAirPort(beginterm));//出发
                            String endterm = resFlightinfo.getEndterm();
                            trafficDto.setBackEndPoint(businessService.getAirPort(endterm));//到达

                            trafficDto.setBackNo(resFlightinfo.getFlightno());
                            trafficDto.setBackCity(resFlightinfo.getBegincity());
                            trafficDto.setBackDate(resFlightinfo.getFlightdate());
                            trafficDto.setBackStatus(9);
                            trafficDto.setBackBeginTime(resFlightinfo.getBegintime());
                            trafficDto.setBackEndTime(resFlightinfo.getEndtime());
                            trafficDto.setBackEndCity(resFlightinfo.getEndcity());

                            log.info("`````飞机回程信息查询成功！");

                        }

                    }
                    trafficDtos.add(trafficDto);

                    break;


                case 10: //10 = 火车票
                    List<TrainProductDto> trainProductDtos = proTourTrafficService.selectTrainInfo(proTour.getId());

                    Map<Integer, List<TrainProductDto>> collcet = trainProductDtos.stream().collect(Collectors.groupingBy(TrainProductDto::getDirection));
                    Iterator<Integer> allKeys = collcet.keySet().iterator();
                    while (allKeys.hasNext()) {
                        Integer key = allKeys.next();

//                        if (key == 0){
//                            TrainProductDto trainProduct = collcet.get(0).get(0);
//                            Integer direction = trainProduct.getDirection(); //往返类型   0：往返； 1：去程； 2：回程
//                            String stationTrainCode = trainProduct.getStationTrainCode(); //车次号
//                            Date godate = trainProduct.getGodate(); //出发日期
//                            String depstation = trainProduct.getDepstation(); //出发地
//                            String desstation = trainProduct.getDesstation(); //目的地站
//
//                            List<ResTrainTicket> resTrainTickets = resTrainTicketService.selectByTrainCodeAndSoON(stationTrainCode, godate, depstation, desstation);
//                            ResTrainTicket resTrainTicket = resTrainTickets.get(0);
//                            Date fromdate = resTrainTicket.getFromdate();//到达日期
//                            String starttime = resTrainTicket.getStarttime();//出发时间
//                            String arrivetime = resTrainTicket.getArrivetime();//到达时间
//                        }

                        if (key == 1) {
                            TrainProductDto trainProduct = collcet.get(1).get(0);
                            String stationTrainCode = trainProduct.getStationTrainCode(); //车次号
                            Date godate = trainProduct.getGodate(); //出发日期
                            String depstation = trainProduct.getDepstation(); //出发地
                            String desstation = trainProduct.getDesstation(); //目的地站

                            if (StringUtils.isBlank(stationTrainCode) || StringUtils.isBlank(depstation) || StringUtils.isBlank(desstation) || godate == null) {
                                return new Response().failure("`````火车去程信息为空！");
                            } else {

                                List<ResTrainTicket> resTrainTickets = resTrainTicketService.selectByTrainCodeAndSoON(stationTrainCode, godate, depstation, desstation);
                                ResTrainTicket resTrainTicket = resTrainTickets.get(0);
                                Date fromdate = resTrainTicket.getFromdate();//到达日期
                                String starttime = resTrainTicket.getStarttime();//出发时间
                                String arrivetime = resTrainTicket.getArrivetime();//到达时间

                                trafficDto.setDepartureStatus(10);
                                trafficDto.setDepartureNo(stationTrainCode);
                                trafficDto.setDepartureCity("");
                                trafficDto.setDepartureDate(godate);
                                trafficDto.setDeparturePoint(depstation);
                                trafficDto.setDepBeginTime(starttime);
                                trafficDto.setDepEndTime(arrivetime);
                                trafficDto.setDepEndCity("");
                                trafficDto.setDepEndPoint(desstation);

                                log.info("`````火车去程信息查询成功！");

                            }
                        }

                        if (key == 2) {
                            TrainProductDto trainProduct = collcet.get(2).get(0);
                            String stationTrainCode = trainProduct.getStationTrainCode(); //车次号
                            Date godate = trainProduct.getGodate(); //出发日期
                            String depstation = trainProduct.getDepstation(); //出发地
                            String desstation = trainProduct.getDesstation(); //目的地站

                            if (StringUtils.isBlank(stationTrainCode) || StringUtils.isBlank(depstation) || StringUtils.isBlank(desstation) || godate == null) {
                                return new Response().failure("`````火车回程信息为空！");
                            } else {

                                List<ResTrainTicket> resTrainTickets = resTrainTicketService.selectByTrainCodeAndSoON(stationTrainCode, godate, depstation, desstation);
                                ResTrainTicket resTrainTicket = resTrainTickets.get(0);
                                Date fromdate = resTrainTicket.getFromdate();//到达日期
                                String starttime = resTrainTicket.getStarttime();//出发时间
                                String arrivetime = resTrainTicket.getArrivetime();//到达时间

                                trafficDto.setBackStatus(10);
                                trafficDto.setBackNo(stationTrainCode);
                                trafficDto.setBackCity("");
                                trafficDto.setBackDate(godate);
                                trafficDto.setBackPoint(depstation);
                                trafficDto.setBackBeginTime(starttime);
                                trafficDto.setBackEndTime(arrivetime);
                                trafficDto.setBackEndCity("");
                                trafficDto.setBackEndPoint(desstation);

                                log.info("`````火车回程信息查询成功！");

                            }
                        }
                    }
                    trafficDtos.add(trafficDto);

                    break;


                case 11: //11 = 汽车票
                    List<BusProductDto> busProductDtos = proTourTrafficService.selectBusInfo(proTour.getId());
                    Map<Integer, List<BusProductDto>> busCollect = busProductDtos.stream().collect(Collectors.groupingBy(BusProductDto::getDirection));
                    Iterator<Integer> busCollectKeys = busCollect.keySet().iterator();

                    while (busCollectKeys.hasNext()) {
                        Integer key = busCollectKeys.next();

//                        if (key == 0){
//
//                        }

                        if (key == 1) {
                            BusProductDto busProductDto = busCollect.get(1).get(0);
                            Date godate = busProductDto.getGodate();//出发日期
                            String carcode = busProductDto.getCarcode();//车次
                            String depstation = busProductDto.getDepstation();//出发站
                            String desstation = busProductDto.getDesstation();//目的地站

                            if (StringUtils.isBlank(carcode) || StringUtils.isBlank(depstation) || StringUtils.isBlank(desstation) || godate == null) {
                                return new Response().failure("`````汽车去程信息为空！");
                            } else {

                                List<ResBusTicket> resBusTickets = resBusTicketService.selectByCarCodeAndSoON(carcode, godate, depstation, desstation);
                                ResBusTicket resBusTicket = resBusTickets.get(0);
                                String starttime = resBusTicket.getStarttime(); //出发时间
                                String arrivetime = resBusTicket.getArrivetime(); //到达时间

                                trafficDto.setDepartureStatus(11);
                                trafficDto.setDepartureNo(carcode);
                                trafficDto.setDepartureCity("");
                                trafficDto.setDepartureDate(godate);
                                trafficDto.setDeparturePoint(depstation);
                                trafficDto.setDepBeginTime(starttime);
                                trafficDto.setDepEndTime(arrivetime);
                                trafficDto.setDepEndCity("");
                                trafficDto.setDepEndPoint(desstation);

                                log.info("`````汽车去程信息查询成功！");

                            }

                        }

                        if (key == 2) {
                            BusProductDto busProductDto = busCollect.get(2).get(0);
                            Date godate = busProductDto.getGodate();//出发日期
                            String carcode = busProductDto.getCarcode();//车次
                            String depstation = busProductDto.getDepstation();//出发站
                            String desstation = busProductDto.getDesstation();//目的地站

                            if (StringUtils.isBlank(carcode) || StringUtils.isBlank(depstation) || StringUtils.isBlank(desstation) || godate == null) {
                                return new Response().failure("`````汽车回程信息为空！");
                            } else {

                                List<ResBusTicket> resBusTickets = resBusTicketService.selectByCarCodeAndSoON(carcode, godate, depstation, desstation);
                                ResBusTicket resBusTicket = resBusTickets.get(0);
                                String starttime = resBusTicket.getStarttime(); //出发时间
                                String arrivetime = resBusTicket.getArrivetime(); //到达时间

                                trafficDto.setBackStatus(11);
                                trafficDto.setBackNo(carcode);
                                trafficDto.setBackCity("");
                                trafficDto.setBackDate(godate);
                                trafficDto.setBackPoint(depstation);
                                trafficDto.setBackBeginTime(starttime);
                                trafficDto.setBackEndTime(arrivetime);
                                trafficDto.setBackEndCity("");
                                trafficDto.setBackEndPoint(desstation);

                                log.info("`````汽车回程信息查询成功！");

                            }

                        }

                    }
                    trafficDtos.add(trafficDto);

                    break;


                case 12: //12 = 船票
                    List<ShipProductDto> shipProductDtos = proTourTrafficService.selectShipInfo(proTour.getId());
                    Map<Integer, List<ShipProductDto>> shipCollect = shipProductDtos.stream().collect(Collectors.groupingBy(ShipProductDto::getDirection));

                    Iterator<Integer> shipKeys = shipCollect.keySet().iterator();
                    while (shipKeys.hasNext()) {
                        Integer key = shipKeys.next();

//                        if (key == 0){
//
//                        }

                        if (key == 1) {
                            ShipProductDto shipProductDto = shipCollect.get(1).get(0);
                            String shipcode = shipProductDto.getShipcode();//船次
                            Date godate = shipProductDto.getGodate();//开船日期
                            String depstation = shipProductDto.getDepstation();//出发站
                            String desstation = shipProductDto.getDesstation();//到达站

                            if (StringUtils.isBlank(shipcode) || StringUtils.isBlank(depstation) || StringUtils.isBlank(desstation) || godate == null) {
                                return new Response().failure("`````轮船去程信息为空！");
                            } else {

                                List<ResShipTicket> resShipTickets = resShipTicketService.selectByShipCodeAndSoON(shipcode, godate, depstation, desstation);
                                ResShipTicket resShipTicket = resShipTickets.get(0);
                                Date fromdate = resShipTicket.getFromdate(); //到达日期
                                String starttime = resShipTicket.getStarttime(); //开始时间
                                String arrivetime = resShipTicket.getArrivetime(); //到达时间

                                trafficDto.setDepartureStatus(12);
                                trafficDto.setDepartureNo(shipcode);
                                trafficDto.setDepartureCity("");
                                trafficDto.setDepartureDate(godate);
                                trafficDto.setDeparturePoint(depstation);
                                trafficDto.setDepBeginTime(starttime);
                                trafficDto.setDepEndTime(arrivetime);
                                trafficDto.setDepEndCity("");
                                trafficDto.setDepEndPoint(desstation);

                                log.info("`````轮船去程信息查询成功！");

                            }

                        }

                        if (key == 2) {
                            ShipProductDto shipProductDto = shipCollect.get(2).get(0);
                            String shipcode = shipProductDto.getShipcode();//船次
                            Date godate = shipProductDto.getGodate();//开船日期
                            String depstation = shipProductDto.getDepstation();//出发站
                            String desstation = shipProductDto.getDesstation();//到达站

                            if (StringUtils.isBlank(shipcode) || StringUtils.isBlank(depstation) || StringUtils.isBlank(desstation) || godate == null) {
                                return new Response().failure("`````轮船回程信息为空！");
                            } else {

                                List<ResShipTicket> resShipTickets = resShipTicketService.selectByShipCodeAndSoON(shipcode, godate, depstation, desstation);
                                ResShipTicket resShipTicket = resShipTickets.get(0);
                                Date fromdate = resShipTicket.getFromdate(); //到达日期
                                String starttime = resShipTicket.getStarttime(); //开始时间
                                String arrivetime = resShipTicket.getArrivetime(); //到达时间

                                trafficDto.setBackStatus(12);
                                trafficDto.setBackNo(shipcode);
                                trafficDto.setBackCity("");
                                trafficDto.setBackDate(godate);
                                trafficDto.setBackPoint(depstation);
                                trafficDto.setBackBeginTime(starttime);
                                trafficDto.setBackEndTime(arrivetime);
                                trafficDto.setBackEndCity("");
                                trafficDto.setBackEndPoint(desstation);

                                log.info("`````轮船回程信息查询成功！");

                            }

                        }

                    }
                    trafficDtos.add(trafficDto);

                    break;
            }

        }


        /*if (Objects.nonNull(proTour)){
            String backCityName = null;
            String backAirportName = null;
            String goCityName = null;
            String goAirportName = null;
            //去程
            FlightInfoDto flightInfoDto = new FlightInfoDto();
            List<ResFlightinfo> resFlightinfos = resFlightinfoSerivce.selectByFlightNo(proTour.getRefdepflight());
            if (!resFlightinfos.isEmpty()) {
                ResFlightinfo resFlightinfo = resFlightinfos.get(0);
                //机场三字码API接口调用
                Map<String, String> maps = new HashMap<>();
                maps.put("Content-Type", "application/json");
                HttpResponse httpResponseGo = HttpUtils.httpClientGet(airPortUrl + resFlightinfo.getBegincity(), maps);
                JSONArray jsonGo = JSONObject.parseArray(httpResponseGo.getData());//出发机场
                goCityName = jsonGo.getJSONObject(0).getString("CityName");
                goAirportName = jsonGo.getJSONObject(0).getString("AirportName");
                String goCityCode= jsonGo.getJSONObject(0).getString("CityCode");

                HttpResponse httpResponseBack = HttpUtils.httpClientGet(airPortUrl + resFlightinfo.getEndcity(), maps);
                JSONArray jsonBack = JSONObject.parseArray(httpResponseBack.getData());//出发机场
                backCityName = jsonBack.getJSONObject(0).getString("CityName");
                backAirportName = jsonBack.getJSONObject(0).getString("AirportName");
                String backCityCode= jsonBack.getJSONObject(0).getString("CityCode");

                //计算是否隔天
                Date flightdate = resFlightinfo.getFlightdate();
                String begintime = resFlightinfo.getBegintime();
                int num = DateUtil.getNum(flightdate, begintime, resFlightinfo.getTimes());
                flightInfoDto.setStatus("1");//设置状态，标识去回
                flightInfoDto.setDays(String.valueOf(num));
                flightInfoDto.setGoCityName(goCityName);
                flightInfoDto.setGoAirportName(goAirportName);
                flightInfoDto.setBackAirportName(backAirportName);
                flightInfoDto.setBackCityName(backCityName);
                flightInfoDto.setFlightinfo(resFlightinfo);

                //获取仓位信息
                List<ResFlightcabin> resFlightcabins = resFlightcabinService.selectBy(resFlightinfo.getId());
                if (Objects.nonNull(resFlightcabins) && !resFlightcabins.isEmpty()){
                    flightInfoDto.setFlightcabin(resFlightcabins.get(0));
                }

                FlightInfoDto.add(flightInfoDto);
           }
            //回程
            FlightInfoDto flightInfoDto1 = new FlightInfoDto();
            List<ResFlightinfo> resFlightinfos1 = resFlightinfoSerivce.selectByFlightNo(proTour.getRefbackflight());
            if (!resFlightinfos1.isEmpty()){
                ResFlightinfo resFlightinfo1 = resFlightinfos.get(0);
                //计算是否隔天
                Date flightdate1 = resFlightinfo1.getFlightdate();
                String begintime1 = resFlightinfo1.getBegintime();
                int num1 = DateUtil.getNum(flightdate1,begintime1,resFlightinfo1.getTimes());
                flightInfoDto1.setStatus("2");//设置状态，标识去回
                flightInfoDto1.setDays(String.valueOf(num1));
                flightInfoDto1.setGoCityName(backCityName);
                flightInfoDto1.setGoAirportName(backAirportName);
                flightInfoDto1.setBackAirportName(goAirportName);
                flightInfoDto1.setBackCityName(goCityName);
                flightInfoDto1.setFlightinfo(resFlightinfo1);
                //获取仓位信息
                List<ResFlightcabin> resFlightcabins1 = resFlightcabinService.selectBy(resFlightinfo1.getId());
                if (Objects.nonNull(resFlightcabins1) && !resFlightcabins1.isEmpty()){
                    flightInfoDto1.setFlightcabin(resFlightcabins1.get(0));
                }
                FlightInfoDto.add(flightInfoDto1);
            }
        }*/

        //单房差
        ProTourPricepolicyExample example = new ProTourPricepolicyExample();
        example.or().andTouridEqualTo(tourid).andIsdefaultEqualTo(true).andSiteidEqualTo(siteId);
        List<ProTourPricepolicy> proTourPricepolicies = proTourPricePolicyService.selectByExample(example);

        //接送地
        ProProductDepartureExample example1 = new ProProductDepartureExample();
        example1.or().andIdEqualTo(depId);
        List<ProProductDeparture> departure = productDepartureService.getDeparture(example1);
        String depid = departure.get(0).getDepartureid();//获取prodeparture中的DepartureID	对应omdeparture、protourvenue中的depid
        ProTourVenueExample example2 = new ProTourVenueExample();
        example2.or().andTouridEqualTo(tourid).andSiteidEqualTo(siteId).andDepartureidEqualTo(depid);
        List<ProTourVenue> proTourVenues = proTourVenueService.get(example2);

        //数据封装返回
        productBo.setFlightInfodto(FlightInfoDto);
        productBo.setTrafficDto(trafficDtos);
        productBo.setProTourVenues(proTourVenues);
        if (!proTourPricepolicies.isEmpty() && Objects.nonNull(proTourPricepolicies.get(0))) {
            productBo.setSingleRoomPrice(proTourPricepolicies.get(0).getSingleroomprice());
        }

//        大交通修改后的方法
        ModifyProductBo modifyProductBo = ordOrderInfoService.selectByIdWitchChoice(proid);
        productBo.setProProduct(modifyProductBo);

        return new Response().success(productBo);
    }

    /**
     * @Author: zhouxiangru
     * @Description: 返回价格
     * @Date: 2018/5/23
     * @return: get
     * @Param: [key]
     */
    @RequestMapping(value = "/getPrice/{key}", method = RequestMethod.POST)
    public Response get(@PathVariable String key) {

        Object o = jedisClientService.pollFromList(key);
        jedisClientService.addObjectToList(key, o);
        if (Objects.isNull(o)) {
            return new Response().failure("时间过长请重新下单！");
        }
        log.info("/getPrice/{key}接口返回：" + JSONObject.toJSONString(new Response().success(o)));
        return new Response().success(o);
    }

    /**
     * @Author: 周相儒
     * @Description: 查询订单接口
     * @Date: 2018/7/2
     * @return: getOrderInfo
     * @Param: [httpServletRequest, jsonObject]
     */
    /*@RequestMapping(value = "/getOrderInfo", method = RequestMethod.POST)
    public Response getOrderInfo(HttpServletRequest httpServletRequest, @RequestBody JSONObject jsonObject) {
        log.info("getOrderInfo请求参数为：{}", jsonObject.toJSONString());
        String siteId = jsonObject.getString("siteid");
        String dataStatus = jsonObject.getString("dataStatus");
        String startPage = jsonObject.getString("startPage");
        String size = jsonObject.getString("size");
        String condition = jsonObject.getString("condition");
        WxUser wxUserInfo = (WxUser) httpServletRequest.getSession().getAttribute("wxUserInfo");//获取当前登录人信息
        if (devStatus.equals("dev")) {
            wxUserInfo = new WxUser();
            wxUserInfo.setUserType(2);
            wxUserInfo.setUserId("AC0D6C60-D51A-491E-A66B-5A320C22D7E6");
        }

        if (Objects.isNull(wxUserInfo)) {
            return new Response().failure("请重新登录查看订单信息！");
        }

        Integer userType = wxUserInfo.getUserType();
        String userId = wxUserInfo.getUserId();
        log.info("当前登录人信息:{}", wxUserInfo);
//        Integer userType = 2;
        if (2 == userType) {
            int start = Integer.parseInt(startPage) * Integer.parseInt(size);
            int pageSize = Integer.parseInt(size);
            List<OrderInfoViewDto> order = ordOrderInfoService.getOrder(dataStatus, condition, userId, start, pageSize);
            //D2FB3DB0-AFFD-46C6-AE75-EBFDAF27F567
            Map map = new HashMap();
            map.put("totalNum", Objects.nonNull(order) && !order.isEmpty() ? order.get(0).getTotalNum() : 0);
            map.put("orderList", order);
            return new Response().success(map);
        }
        return new Response().failure("请到ERP系统查询订单！");
    }*/

    /**
     * 　　* @Description: 重写订单查询接口
     * 　　* @author 周陈
     * 　　* @date 2018/12/25 23:16
     */
    @RequestMapping(value = "/getOrderInfo", method = RequestMethod.POST)
    public Response getOrderInfo(HttpServletRequest httpServletRequest, @RequestBody JSONObject jsonObject) {
        log.info("getOrderInfo请求参数为：{}", jsonObject.toJSONString());
        String dataStatus = jsonObject.getString("dataStatus");
        String startPage = jsonObject.getString("startPage");
        String size = jsonObject.getString("size");
        String condition = jsonObject.getString("condition");
        Integer shopType = jsonObject.getInteger("shopType");
        WxUser wxUserInfo = (WxUser) httpServletRequest.getSession().getAttribute("wxUserInfo");//获取当前登录人信息
//        if (devStatus.equals("dev")) {
//            wxUserInfo = new WxUser();
//            wxUserInfo.setUserType(2);
//            wxUserInfo.setUserId("AC0D6C60-D51A-491E-A66B-5A320C22D7E6");
//        }
        //志愿者订单查询
        if (shopType != null && shopType == 1) {
            log.info("志愿者···getOrderInfo请求参数为：{}", jsonObject.toJSONString());
            Response orderInfo = volunteerProductService.getOrderInfo(httpServletRequest, jsonObject);
            return orderInfo;
        }
        if (Objects.isNull(wxUserInfo)) {
            return new Response().failure("请重新登录查看订单信息！");
        }

        Integer userType = wxUserInfo.getUserType();
        String userId = wxUserInfo.getUserId();
        log.info("当前登录人信息:{}", wxUserInfo);
//        Integer userType = 2;

        int start = Integer.parseInt(startPage) * Integer.parseInt(size);
        int pageSize = Integer.parseInt(size);
        String orgId = Constants.UUID_DEFAULT;
        if (userType == 1) {
            ErpUser erpUser = (ErpUser) httpServletRequest.getSession().getAttribute("erpUserInfo");
            orgId = erpUser.getOrgID();
        }
        log.info("订单查询参数dataStatus={}, condition={}, userId={},userId={}, start={}, pageSize={}, userType={}",
                dataStatus, condition, userId, userId, start, pageSize, userType);
        List<OrderInfoViewDto> order = ordOrderInfoService.getNewOrder(dataStatus, condition, userId, orgId, userId, start, pageSize, userType);
        List<OrderInfoViewVo> orderList = businessService.getOrderList(order);
        //D2FB3DB0-AFFD-46C6-AE75-EBFDAF27F567
        Map map = new HashMap();
        map.put("totalNum", Objects.nonNull(order) && !order.isEmpty() ? order.get(0).getTotalNum() : 0);
        map.put("orderList", orderList);
        return new Response().success(map);
    }

    /**
     * @Author: 周相儒
     * @Description: 游客信息上传
     * @Date: 2018/7/2
     * @return: uploadImg
     * @Param: [request, file]
     */
    @RequestMapping(value = "/uploadTourImg", method = RequestMethod.POST)
    public Response uploadImg(HttpServletRequest request) {

        List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("file");//多文件获取
        log.info("开始写入文件");
        log.info("当前参数:{}", files);
        List<String> imgs = new ArrayList<>();
        if (!files.isEmpty()) {
            for (MultipartFile file : files) {//遍历写入文件
                log.info("当前操作file:{}", file);
                String uuid = UUID.randomUUID().toString();
                String end = null;
                if (Objects.nonNull(file)) {
                    end = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".") + 1);
                    File directory = new File(path);
                    if (!directory.exists()) {
                        directory.mkdirs();
                    }
                    log.info("文件名：{}", file.getOriginalFilename());
                    try {
                        file.transferTo(new File(path + uuid + "." + end));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                imgs.add(imgUrl + uuid + "." + end);
            }
        }
        log.info("结束写入文件");
        Map map = new HashMap();
        map.put("img", imgs);
        return new Response().success(map);
    }


    /**
     * @Author: 周相儒
     * @Description: 接送地设置查询
     * @Date: 2018/7/2
     * @return: Response
     * @Param: [request, file]
     */
    @RequestMapping(value = "/getVenue", method = RequestMethod.POST)
    public Response getVenue(@RequestBody JSONObject params) {

        log.info("/getVenue接口参数：" + params.toJSONString());
        String proid = params.getString("proid");
        String tourid = params.getString("tourid");
        String depId = params.getString("depid"); //站点id
        String siteId = params.getString("siteid");
        Integer shopType = params.getInteger("shopType");
        Integer isOutgoing = params.getInteger("isOutgoing");
        String directSalesSendId = params.getString("directSalesSendId");
        String orgId = params.getString("orgId");
        if (shopType != null && shopType == 1) {
            VolunteerProductTour volunteerProductTour = volunteerProductTourService.selectByPrimaryKey(tourid);
            tourid = volunteerProductTour.getTourid();
        }
        //接送地
        ProProductDepartureExample example1 = new ProProductDepartureExample();
        example1.or().andIdEqualTo(depId);
        List<ProProductDeparture> departure = productDepartureService.getDeparture(example1);
        String depid = departure.get(0).getDepartureid();//获取prodeparture中的DepartureID	对应omdeparture、protourvenue中的depid

        if (isOutgoing != null && isOutgoing == 1) {
            log.info("外发产品接送地配置查询={}");

            ProProductDirectVenueExample example = new ProProductDirectVenueExample();
            example.or().andDepartureidEqualTo(depid).andSiteidEqualTo(siteId).andTouridEqualTo(tourid).andOrgidEqualTo(orgId);
            List<ProProductDirectVenue> proProductDirectVenues = proProductDirectVenueMapper.selectByExample(example);
            if (proProductDirectVenues != null && proProductDirectVenues.size() > 0) {
                List<ProTourVenue> proTourVenues = new ArrayList<>();
                proProductDirectVenues.forEach(proProductDirectVenue -> {
                    ProTourVenue proTourVenue = new ProTourVenue();
                    proTourVenue.setId(proProductDirectVenue.getId());
                    proTourVenue.setShuttleprice(proProductDirectVenue.getShuttlepricesales());
                    proTourVenue.setDropoffprice(proProductDirectVenue.getDropoffpricesales());
                    proTourVenue.setVenue(proProductDirectVenue.getVenue());
                    proTourVenue.setCollectiontime(proProductDirectVenue.getCollectiontime());
                    proTourVenue.setDepartureid(proProductDirectVenue.getDepartureid());
                    proTourVenue.setDeparturename(proProductDirectVenue.getDeparturename());
                    proTourVenue.setOrgid(proProductDirectVenue.getOrgid());
                    proTourVenue.setSiteid(proProductDirectVenue.getSiteid());
                    proTourVenue.setSitename(proProductDirectVenue.getSitename());
                    proTourVenue.setTourid(proProductDirectVenue.getTourid());
                    proTourVenues.add(proTourVenue);
                });
                return new Response().success(proTourVenues);
            }else {
                ProProductDirectSalesExample example3 = new ProProductDirectSalesExample();
                example3.or().andTouridEqualTo(tourid).andReceiveridEqualTo(orgId);
                List<ProProductDirectSales> proProductDirectSales = proProductDirectSalesMapper.selectByExample(example3);
                if(proProductDirectSales.size()>0){
                    orgId = proProductDirectSales.get(0).getSupplierid();
                }
            }
        }


        ProTourVenueExample example2 = new ProTourVenueExample();
        example2.or().andTouridEqualTo(tourid).andSiteidEqualTo(siteId).andDepartureidEqualTo(depid).andOrgidEqualTo(orgId);
        List<ProTourVenue> proTourVenues = proTourVenueService.get(example2);
        return new Response().success(proTourVenues);
    }

    /**
     * @Author: 周相儒
     * @Description: 取消订单接口
     * @Date: 2018/7/9
     * @return: Response
     * @Param: orderId
     */
//    @RequestMapping("/cancel/{orderId}")
//    public Response cancelOrder(@PathVariable String orderId){
//        log.info("/cancel参数:{}",orderId);
//        int i = ordOrderInfoService.updateOrderStatus(orderId);
//        return i > 0 ? new Response().success("订单取消成功！") : new Response().failure("取消订单失败，请联系客服！");
//    }

    /**
     * @Description: 重写 取消订单接口
     * @auther: 史迪旻
     * @date: 09:47 2018-10-23
     * @param: [orderId]
     * @return: com.holyrobot.response.Response
     */
    @RequestMapping("/cancel/{orderId}")
    public Response cancelOrder(@PathVariable String orderId) {
        OrdOrderinfo ordOrderinfo = ordOrderInfoService.selectByOrderId(orderId);
        Integer hastraffic = ordOrderinfo.getHastraffic();
        return businessService.cancelOrderInfo(orderId, hastraffic);
    }


    /**
     * @Author: 周相儒
     * @Description: 查询返回订单详情
     * @Date: 2018/8/17
     * @return: OrderInfoDetailDto
     * @Param: orderId
     */
    @RequestMapping(value = "/getOrderInfoDetail/{orderId}", method = RequestMethod.POST)
    public OrderInfoDetailDto getOrderInfoDetail(@PathVariable String orderId) {
        OrdOrderinfo ordOrderinfo = ordOrderInfoService.selectByIdOfAll(orderId);
        List<OrdOrderTourist> ordOrderTourists = ordOrderInfoService.selectTouristByOrderId(orderId);

        OrdOrderLogExample example = new OrdOrderLogExample();
        OrdOrderLogExample.Criteria criteria = example.createCriteria();
        criteria.andOplogEqualTo("买家付款申请");
        criteria.andOrderidEqualTo(orderId);
        OrdOrderLogExample.Criteria criteria1 = example.createCriteria();
        criteria1.andOplogEqualTo("h5商城在线支付订单");
        criteria1.andOrderidEqualTo(orderId);

        example.or(criteria1);
        List<OrdOrderLog> ordOrderLogs = ordOrderLogMapper.selectByExample(example);
        Date createDate = null;
        if (ordOrderLogs.size() > 0) {
            OrdOrderLog ordOrderLog = ordOrderLogs.get(0);
            createDate = ordOrderLog.getCreateddate();
        }

        if (ordOrderinfo.getCategory() == 8) {//表示志愿者
            VolunteerProductTour volunteerProductTour = volunteerProductTourService.selectByPrimaryKey(ordOrderinfo.getTourid());
            OrderInfoDetailDto orderInfoDetailDto = new OrderInfoDetailDto();
            orderInfoDetailDto.setOrdOrderinfo(ordOrderinfo);
            orderInfoDetailDto.setOrdOrderTourists(ordOrderTourists);
            orderInfoDetailDto.setProId(volunteerProductTour.getProid());

//          /details/:proid/:siteId/:orgid/:directSalesSendId?/:isGoingOut/:shopUserId?    ← url拼接公式
//            以下属性用于拼接访问产品详情的url
            String proId = volunteerProductTour.getProid();
            String siteId = ordOrderinfo.getSiteid();
            String orgId = volunteerProductTour.getOrgid();
            Integer isOutGoing = 0;
            String userId = volunteerProductTour.getUserid();

            String url;
            Integer produtoutertimes = ordOrderinfo.getProdutoutertimes(); //0非外发 外发次数 1.两级 A->B  2.三级 A->B->C
            if (produtoutertimes == 1 || produtoutertimes == 2) {
                isOutGoing = 1;
                String directSalesSendId = ordOrderinfo.getDirectSalesSendId();
                url = h5url + "#/details/" + proId + "/" + siteId + "/" + orgId + "/" + directSalesSendId + "/" + isOutGoing + "/" + userId;
            } else {
                url = h5url + "#/details/" + proId + "/" + siteId + "/" + orgId + "/" + isOutGoing + "/" + userId;
            }

            orderInfoDetailDto.setUrl(url);
            orderInfoDetailDto.setDateTime(createDate);


            return orderInfoDetailDto;
        }

        ProTour proTour = proTourService.selectById(ordOrderinfo.getTourid());
        OrderInfoDetailDto orderInfoDetailDto = new OrderInfoDetailDto();
        orderInfoDetailDto.setOrdOrderinfo(ordOrderinfo);
        orderInfoDetailDto.setOrdOrderTourists(ordOrderTourists);
        orderInfoDetailDto.setProId(proTour.getProid());

//          /details/:proid/:siteId/:orgid/:directSalesSendId?/:isGoingOut/:shopUserId?    ← url拼接公式
        String proId = proTour.getProid();
        String siteId = ordOrderinfo.getSiteid();
        String orgId = ordOrderinfo.getSupplierid();
        Integer isOutGoing = 0;

        String url;
        Integer produtoutertimes = ordOrderinfo.getProdutoutertimes(); //0非外发 外发次数 1.两级 A->B  2.三级 A->B->C
        if (produtoutertimes == 1 || produtoutertimes == 2) {
            isOutGoing = 1;
            String directSalesSendId = ordOrderinfo.getDirectSalesSendId();//外发 发方ID
            url = h5url + "#/details/" + proId + "/" + siteId + "/" + orgId + "/" + directSalesSendId + "/" + isOutGoing;
        } else {
            url = h5url + "#/details/" + proId + "/" + siteId + "/" + orgId + "/" + isOutGoing;
        }

        orderInfoDetailDto.setUrl(url);
        orderInfoDetailDto.setDateTime(createDate);

        return orderInfoDetailDto;
    }

    /**
     * @Author: 周相儒
     * @Description: 游客信息上传
     * @Date: 2018/7/2
     * @return: uploadImg
     * @Param: [request, file]
     */
    @RequestMapping(value = "/newUploadTourImg", method = RequestMethod.POST)
    public Response uploadTourImg(@RequestBody JSONObject jsonObject) {
        String imgForm = jsonObject.getString("imgForm");
        if (StringUtils.isBlank(imgForm)) {
            return new Response().failure("未选择图片或选择图片不可用，请重新上传！");
        }
        MultipartFile multipartFile = Base64DecodedMultipartFile.base64ToMultipart(imgForm);
        List<MultipartFile> files = new ArrayList<>();
        files.add(multipartFile);
        log.info("开始写入文件");
        log.info("当前参数:{}", files);
        List<String> imgs = new ArrayList<>();
        if (!files.isEmpty()) {
            for (MultipartFile file : files) {//遍历写入文件
                log.info("当前操作file:{}", file);
                String uuid = UUID.randomUUID().toString();
                String end = null;
                if (Objects.nonNull(file)) {
                    double size = file.getSize() / (1024.0 * 1024.0);
                    if (size > 20) {
                        return new Response().failure("图片大小大于20M，请重新选择图片！");
                    }
                    log.info("图片大小={}", size);
                    end = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".") + 1);
                    File directory = new File(path);
                    if (!directory.exists()) {
                        directory.mkdirs();
                    }
                    log.info("文件名：{}", file.getOriginalFilename());
                    try {
                        file.transferTo(new File(path + uuid + "." + end));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                imgs.add(imgUrl + uuid + "." + end);
                log.info("生成返回url:{}", imgUrl + uuid + "." + end);
            }
        }
        log.info("结束写入文件");
        Map map = new HashMap();
        map.put("img", imgs);
        return new Response().success(map);
    }


    @GetMapping("/changedSth/{orderId}")
    public Response checkForChanges(@PathVariable String orderId) {
        ChangedUserInfoDto changedUserInfoDto = new ChangedUserInfoDto();
        List<ChangedUserInfoDto> changedUserInfoDtos = new ArrayList();
        ChangedInfoVo changedInfoVo = new ChangedInfoVo();

        List<OrdOrderChange> info = ordOrderChangeService.selectByOrderIdWithDateDesc(orderId);
        String nOrderId = null;
        if (!info.isEmpty() && Objects.nonNull(info)) {
//          获得NOrderId，去查 订单价格明细变更快照Ord_Order_Price_Edit  订单游客变更快照Ord_Order_Tourist_Edit
            nOrderId = info.get(0).getNorderid();
        }

        BigDecimal childPrice = new BigDecimal(0);
//        获得儿童价格信息
        List<OrdOrderPriceEdit> childOrderPriceEdits = ordOrderPriceEditService.selectByNOrderIdWithIsChild(nOrderId);
        if (Objects.nonNull(childOrderPriceEdits) && !childOrderPriceEdits.isEmpty()) {
            for (int i = 0; i < childOrderPriceEdits.size(); i++) {
                OrdOrderPriceEdit childOrderPriceEdit = childOrderPriceEdits.get(i);
                BigDecimal saleprice = childOrderPriceEdit.getSaleprice();
                Integer visitornum = childOrderPriceEdit.getVisitornum();
                //儿童总价
                childPrice = childPrice.add(saleprice.multiply(BigDecimal.valueOf(visitornum)));
            }
        }

        BigDecimal price = new BigDecimal(0);
//       成人价格
        List<OrdOrderPriceEdit> orderPriceEdits = ordOrderPriceEditService.selectByNOrderIdWithNoChild(nOrderId);
        if (Objects.nonNull(orderPriceEdits) && !orderPriceEdits.isEmpty()) {
            for (int i = 0; i < orderPriceEdits.size(); i++) {
                OrdOrderPriceEdit orderPriceEdit = orderPriceEdits.get(i);
                BigDecimal saleprice = orderPriceEdit.getSaleprice();
                Integer visitornum = orderPriceEdit.getVisitornum();
                //            成人总价
                price = price.add(saleprice.multiply(BigDecimal.valueOf(visitornum)));
            }
        }
//      价格总和
        BigDecimal sigmaDecimal = new BigDecimal(0);
        sigmaDecimal = childPrice.add(price);

        List<OrdOrderTouristEdit> ordOrderTouristEdits = ordOrderTouristEditService.selectByNOrderId(nOrderId);
        if (Objects.nonNull(ordOrderTouristEdits) && !ordOrderTouristEdits.isEmpty()) {
            for (int i = 0; i < ordOrderTouristEdits.size(); i++) {
                OrdOrderTouristEdit ordOrderTouristEdit = ordOrderTouristEdits.get(i);
                changedUserInfoDto.setName(ordOrderTouristEdit.getGuestname());
                changedUserInfoDto.setSex(ordOrderTouristEdit.getGuestsex());
                changedUserInfoDto.setGuestCard(ordOrderTouristEdit.getGuestcard());
                changedUserInfoDto.setGuestCardType(ordOrderTouristEdit.getGuestcardtype());
                changedUserInfoDto.setTelphone(ordOrderTouristEdit.getGuesttelphone());
                changedUserInfoDto.setPickName(ordOrderTouristEdit.getPickname());
                changedUserInfoDto.setPickUpTime(ordOrderTouristEdit.getPickuptime());

                changedUserInfoDtos.add(changedUserInfoDto);

            }
        }

        changedInfoVo.setChangedPrice(sigmaDecimal);
        changedInfoVo.setChangedUserInfoDtos(changedUserInfoDtos);

        return new Response().success(changedInfoVo);
    }

    /**
     * @Description: 获得全部国籍信息
     * @auther: 史迪旻
     * @date: 11:27 2018-12-25
     * @param: []
     * @return: com.holyrobot.response.Response
     */
    @GetMapping("/getNationality")
    public Response getNationality() {
        List<CommNationality> allNationality = commNationalityService.getAllNationality();

        return new Response().success(allNationality);
    }

    /**
     * @Description: 搜索国籍
     * @auther: 史迪旻
     * @date: 16:42 2018-12-25
     * @param: []
     * @return: com.holyrobot.response.Response
     */
    @GetMapping("/searchNationality")
    public Response getSearchNationality(String search) {
        List<CommNationality> searchNationality = commNationalityService.getSearchNationality(search);
        return new Response().success(searchNationality);
    }

    /**
     * @Description: 返回订单状态的订单数
     * @auther: 史迪旻
     * @date: 15:48 2019-1-21
     * @param: [httpServletRequest]
     * @return: java.util.Map
     */
    @PostMapping(value = "/getOrderNumByDataStatus")
    public Response getOrderNum(HttpServletRequest httpServletRequest, @RequestBody JSONObject jsonObject) {
        WxUser userInfo = (WxUser) httpServletRequest.getSession().getAttribute("wxUserInfo");//获取当前登录人信息
        if (userInfo == null || Objects.isNull(userInfo)) {
            return new Response().failure("用户尚未登录");
        }
        Integer shopType = jsonObject.getInteger("shopType");
        String condition = jsonObject.getString("condition");
        log.info("当前登录人信息:{}", userInfo);
        String userId = null;
        String volunteerOrgId = null;

        List<OrderDataStatusVo> orderNumByDataStatus = null;
        if (Objects.nonNull(userInfo) && userInfo.getUserType() == 2 || (shopType != null && shopType == 1)) {
            userId = userInfo.getUserId();
            if (userInfo.getVolunteerApplication() != null) {
                volunteerOrgId = userInfo.getVolunteerApplication().getOrgid();
            }
            orderNumByDataStatus = ordOrderInfoService.getOrderNumByDataStatus(userId, shopType, condition, volunteerOrgId);
        } else {
            ErpUser erpUser = (ErpUser) httpServletRequest.getSession().getAttribute("erpUserInfo");
            String orgId = erpUser.getOrgID();
            orderNumByDataStatus = ordOrderInfoService.erpUserGetOrderNumByDataStatus(orgId, condition);
        }

        Map map = new HashMap();
        map.put("-1", 0);
        map.put("1", 0);
        map.put("3", 0);
        map.put("4", 0);
        int dataStatus = 0;
        for (OrderDataStatusVo numByDataStatus : orderNumByDataStatus) {
            if (numByDataStatus.getDataStatus() == 0 || numByDataStatus.getDataStatus() == 2) {//待确认数量相加
                dataStatus = dataStatus + numByDataStatus.getOrderNum();
            }
            if (numByDataStatus.getDataStatus() == -1) {
                map.put("-1", numByDataStatus.getOrderNum());
            }
            if (numByDataStatus.getDataStatus() == 1) {
                map.put("1", numByDataStatus.getOrderNum());
            }
            if (numByDataStatus.getDataStatus() == 3 || numByDataStatus.getDataStatus() == 10) {
                map.put("3", numByDataStatus.getOrderNum());
            }
            if (numByDataStatus.getDataStatus() == 4) {
                map.put("4", numByDataStatus.getOrderNum());
            }
        }
        map.put("0", dataStatus);//0 这里定义为所有的待确认状态
        map.put("source", orderNumByDataStatus);

        return new Response().success(map);
    }

}