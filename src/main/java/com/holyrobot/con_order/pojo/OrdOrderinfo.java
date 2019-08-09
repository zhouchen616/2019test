package com.holyrobot.con_order.pojo;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class OrdOrderinfo {
    private String id;

    private String routeid;

    private String tourid;

    private String ordername;

    private Integer scheduledays;

    private Integer category;

    private Integer ordertype;

    private Date tourdate;

    private Date returndate;

    private String depname;

    private String destname;

    private String destid;

    private String orderno;

    private String customerunitid;

    private String customername;

    private String ordersourceid;

    private String ordersource;

    private String contact;

    private String mobile;

    private String email;

    private Integer hastraffic;

    private BigDecimal adjustamt;

    private BigDecimal receivableamt;

    private BigDecimal payableamt;

    private Integer adultnum;

    private Integer childnum;

    private Integer guidenum;

    private String comment;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createddate;

    private String createdby;

    private String createdbyid;

    private String deptid;

    private Date reviseddate;

    private String revisedby;

    private String orgid;

    private String orgname;

    private Integer datastatus;

    private Integer signstatus;

    private Integer signtype;

    private String tourguide;

    private String supplierid;

    private String suppliername;

    private String siteid;

    private Integer occupiedperiod;

    private Integer singleordertypeid;

    private String singleordertype;

    private String servicestandard;

    private String privcomment;

    private String ordcomment;

    private String ajustcomment;

    private Integer ticketstatus;

    private String routetypeid;

    private String routetypename;

    private Integer customerunittype;

    private Integer issigncost;

    private String depid;

    private String protype;

    private String protypeid;

    private Boolean iscreditpay;

    private Date creditpaydate;

    private Integer paystatus;

    private String entrysourceid;

    private String entrysource;

    private String ordersaler;

    private String ordersalerid;

    private String airportservice;

    private String salerdeptid;

    private String salerdeptname;

    private Integer hastourist;

    private Integer isautoconfirmed;

    private BigDecimal origreceivableamt;

    private BigDecimal origpayableamt;

    private String parentorgid;

    private Boolean isdirectorgan;

    private String notouristcomment;

    private Boolean isusediscount;

    private Integer pricetype;

    private Integer produtoutertimes;

    private BigDecimal noturnpayableamt;

    private String orderbusinesssource;

    private Integer turnbeforecategory;

    private String directsalessendid;

    private Integer extendedstatus;

    private String routesubtype;

    private String routesubtypename;

    private Integer changestatus;

    private String teamnature;

    private Integer issigned;

    private Date sendtime;

    private Date signtime;
    //如果是门店收，则是2，如果是总店，则是1
    private Integer isshopordermanage = 2;

    private Integer producttype;

    private String routedescription;

    private Integer newcategory;

    private Integer newsigntype;

    private Integer newticketstatus;

    private Integer newticketfinastatus;

    private Integer neworderchangetype;

    private Integer neworderchangestatus;

    private Integer newflag;

    private Integer neworderstatus;

    private Integer neworderadjuststatus;

    public Integer getNewcategory() {
        return newcategory;
    }

    public void setNewcategory(Integer newcategory) {
        this.newcategory = newcategory;
    }

    public Integer getNewsigntype() {
        return newsigntype;
    }

    public void setNewsigntype(Integer newsigntype) {
        this.newsigntype = newsigntype;
    }

    public Integer getNewticketstatus() {
        return newticketstatus;
    }

    public void setNewticketstatus(Integer newticketstatus) {
        this.newticketstatus = newticketstatus;
    }

    public Integer getNewticketfinastatus() {
        return newticketfinastatus;
    }

    public void setNewticketfinastatus(Integer newticketfinastatus) {
        this.newticketfinastatus = newticketfinastatus;
    }

    public Integer getNeworderchangetype() {
        return neworderchangetype;
    }

    public void setNeworderchangetype(Integer neworderchangetype) {
        this.neworderchangetype = neworderchangetype;
    }

    public Integer getNeworderchangestatus() {
        return neworderchangestatus;
    }

    public void setNeworderchangestatus(Integer neworderchangestatus) {
        this.neworderchangestatus = neworderchangestatus;
    }

    public Integer getNewflag() {
        return newflag;
    }

    public void setNewflag(Integer newflag) {
        this.newflag = newflag;
    }

    public Integer getNeworderstatus() {
        return neworderstatus;
    }

    public void setNeworderstatus(Integer neworderstatus) {
        this.neworderstatus = neworderstatus;
    }

    public Integer getNeworderadjuststatus() {
        return neworderadjuststatus;
    }

    public void setNeworderadjuststatus(Integer neworderadjuststatus) {
        this.neworderadjuststatus = neworderadjuststatus;
    }

    public Integer getProducttype() {
        return producttype;
    }

    public void setProducttype(Integer producttype) {
        this.producttype = producttype;
    }

    public String getRoutedescription() {
        return routedescription;
    }

    public void setRoutedescription(String routedescription) {
        this.routedescription = routedescription;
    }

    public Integer getIsShopOrderManage() {
        return isshopordermanage;
    }

    public void setIsShopOrderManage(Integer isshopordermanage) {
        this.isshopordermanage = isshopordermanage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRouteid() {
        return routeid;
    }

    public void setRouteid(String routeid) {
        this.routeid = routeid == null ? null : routeid.trim();
    }

    public String getTourid() {
        return tourid;
    }

    public void setTourid(String tourid) {
        this.tourid = tourid == null ? null : tourid.trim();
    }

    public String getOrdername() {
        return ordername;
    }

    public void setOrdername(String ordername) {
        this.ordername = ordername == null ? null : ordername.trim();
    }

    public Integer getScheduledays() {
        return scheduledays;
    }

    public void setScheduledays(Integer scheduledays) {
        this.scheduledays = scheduledays;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Integer getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(Integer ordertype) {
        this.ordertype = ordertype;
    }

    public Date getTourdate() {
        return tourdate;
    }

    public void setTourdate(Date tourdate) {
        this.tourdate = tourdate;
    }

    public Date getReturndate() {
        return returndate;
    }

    public void setReturndate(Date returndate) {
        this.returndate = returndate;
    }

    public String getDepname() {
        return depname;
    }

    public void setDepname(String depname) {
        this.depname = depname == null ? null : depname.trim();
    }

    public String getDestname() {
        return destname;
    }

    public void setDestname(String destname) {
        this.destname = destname == null ? null : destname.trim();
    }

    public String getDestid() {
        return destid;
    }

    public void setDestid(String destid) {
        this.destid = destid == null ? null : destid.trim();
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public String getCustomerunitid() {
        return customerunitid;
    }

    public void setCustomerunitid(String customerunitid) {
        this.customerunitid = customerunitid == null ? null : customerunitid.trim();
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    public String getOrdersourceid() {
        return ordersourceid;
    }

    public void setOrdersourceid(String ordersourceid) {
        this.ordersourceid = ordersourceid == null ? null : ordersourceid.trim();
    }

    public String getOrdersource() {
        return ordersource;
    }

    public void setOrdersource(String ordersource) {
        this.ordersource = ordersource == null ? null : ordersource.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getHastraffic() {
        return hastraffic;
    }

    public void setHastraffic(Integer hastraffic) {
        this.hastraffic = hastraffic;
    }

    public BigDecimal getAdjustamt() {
        return adjustamt;
    }

    public void setAdjustamt(BigDecimal adjustamt) {
        this.adjustamt = adjustamt;
    }

    public BigDecimal getReceivableamt() {
        return receivableamt;
    }

    public void setReceivableamt(BigDecimal receivableamt) {
        this.receivableamt = receivableamt;
    }

    public BigDecimal getPayableamt() {
        return payableamt;
    }

    public void setPayableamt(BigDecimal payableamt) {
        this.payableamt = payableamt;
    }

    public Integer getAdultnum() {
        return adultnum;
    }

    public void setAdultnum(Integer adultnum) {
        this.adultnum = adultnum;
    }

    public Integer getChildnum() {
        return childnum;
    }

    public void setChildnum(Integer childnum) {
        this.childnum = childnum;
    }

    public Integer getGuidenum() {
        return guidenum;
    }

    public void setGuidenum(Integer guidenum) {
        this.guidenum = guidenum;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby == null ? null : createdby.trim();
    }

    public String getCreatedbyid() {
        return createdbyid;
    }

    public void setCreatedbyid(String createdbyid) {
        this.createdbyid = createdbyid == null ? null : createdbyid.trim();
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid == null ? null : deptid.trim();
    }

    public Date getReviseddate() {
        return reviseddate;
    }

    public void setReviseddate(Date reviseddate) {
        this.reviseddate = reviseddate;
    }

    public String getRevisedby() {
        return revisedby;
    }

    public void setRevisedby(String revisedby) {
        this.revisedby = revisedby == null ? null : revisedby.trim();
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname == null ? null : orgname.trim();
    }

    public Integer getDatastatus() {
        return datastatus;
    }

    public void setDatastatus(Integer datastatus) {
        this.datastatus = datastatus;
    }

    public Integer getSignstatus() {
        return signstatus;
    }

    public void setSignstatus(Integer signstatus) {
        this.signstatus = signstatus;
    }

    public Integer getSigntype() {
        return signtype;
    }

    public void setSigntype(Integer signtype) {
        this.signtype = signtype;
    }

    public String getTourguide() {
        return tourguide;
    }

    public void setTourguide(String tourguide) {
        this.tourguide = tourguide == null ? null : tourguide.trim();
    }

    public String getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(String supplierid) {
        this.supplierid = supplierid == null ? null : supplierid.trim();
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername == null ? null : suppliername.trim();
    }

    public String getSiteid() {
        return siteid;
    }

    public void setSiteid(String siteid) {
        this.siteid = siteid == null ? null : siteid.trim();
    }

    public Integer getOccupiedperiod() {
        return occupiedperiod;
    }

    public void setOccupiedperiod(Integer occupiedperiod) {
        this.occupiedperiod = occupiedperiod;
    }

    public Integer getSingleordertypeid() {
        return singleordertypeid;
    }

    public void setSingleordertypeid(Integer singleordertypeid) {
        this.singleordertypeid = singleordertypeid;
    }

    public String getSingleordertype() {
        return singleordertype;
    }

    public void setSingleordertype(String singleordertype) {
        this.singleordertype = singleordertype == null ? null : singleordertype.trim();
    }

    public String getServicestandard() {
        return servicestandard;
    }

    public void setServicestandard(String servicestandard) {
        this.servicestandard = servicestandard == null ? null : servicestandard.trim();
    }

    public String getPrivcomment() {
        return privcomment;
    }

    public void setPrivcomment(String privcomment) {
        this.privcomment = privcomment == null ? null : privcomment.trim();
    }

    public String getOrdcomment() {
        return ordcomment;
    }

    public void setOrdcomment(String ordcomment) {
        this.ordcomment = ordcomment == null ? null : ordcomment.trim();
    }

    public String getAjustcomment() {
        return ajustcomment;
    }

    public void setAjustcomment(String ajustcomment) {
        this.ajustcomment = ajustcomment == null ? null : ajustcomment.trim();
    }

    public Integer getTicketstatus() {
        return ticketstatus;
    }

    public void setTicketstatus(Integer ticketstatus) {
        this.ticketstatus = ticketstatus;
    }

    public String getRoutetypeid() {
        return routetypeid;
    }

    public void setRoutetypeid(String routetypeid) {
        this.routetypeid = routetypeid == null ? null : routetypeid.trim();
    }

    public String getRoutetypename() {
        return routetypename;
    }

    public void setRoutetypename(String routetypename) {
        this.routetypename = routetypename == null ? null : routetypename.trim();
    }

    public Integer getCustomerunittype() {
        return customerunittype;
    }

    public void setCustomerunittype(Integer customerunittype) {
        this.customerunittype = customerunittype;
    }

    public Integer getIssigncost() {
        return issigncost;
    }

    public void setIssigncost(Integer issigncost) {
        this.issigncost = issigncost;
    }

    public String getDepid() {
        return depid;
    }

    public void setDepid(String depid) {
        this.depid = depid == null ? null : depid.trim();
    }

    public String getProtype() {
        return protype;
    }

    public void setProtype(String protype) {
        this.protype = protype == null ? null : protype.trim();
    }

    public String getProtypeid() {
        return protypeid;
    }

    public void setProtypeid(String protypeid) {
        this.protypeid = protypeid == null ? null : protypeid.trim();
    }

    public Boolean getIscreditpay() {
        return iscreditpay;
    }

    public void setIscreditpay(Boolean iscreditpay) {
        this.iscreditpay = iscreditpay;
    }

    public Date getCreditpaydate() {
        return creditpaydate;
    }

    public void setCreditpaydate(Date creditpaydate) {
        this.creditpaydate = creditpaydate;
    }

    public Integer getPaystatus() {
        return paystatus;
    }

    public void setPaystatus(Integer paystatus) {
        this.paystatus = paystatus;
    }

    public String getEntrysourceid() {
        return entrysourceid;
    }

    public void setEntrysourceid(String entrysourceid) {
        this.entrysourceid = entrysourceid == null ? null : entrysourceid.trim();
    }

    public String getEntrysource() {
        return entrysource;
    }

    public void setEntrysource(String entrysource) {
        this.entrysource = entrysource == null ? null : entrysource.trim();
    }

    public String getOrdersaler() {
        return ordersaler;
    }

    public void setOrdersaler(String ordersaler) {
        this.ordersaler = ordersaler == null ? null : ordersaler.trim();
    }

    public String getOrdersalerid() {
        return ordersalerid;
    }

    public void setOrdersalerid(String ordersalerid) {
        this.ordersalerid = ordersalerid == null ? null : ordersalerid.trim();
    }

    public String getAirportservice() {
        return airportservice;
    }

    public void setAirportservice(String airportservice) {
        this.airportservice = airportservice == null ? null : airportservice.trim();
    }

    public String getSalerdeptid() {
        return salerdeptid;
    }

    public void setSalerdeptid(String salerdeptid) {
        this.salerdeptid = salerdeptid == null ? null : salerdeptid.trim();
    }

    public String getSalerdeptname() {
        return salerdeptname;
    }

    public void setSalerdeptname(String salerdeptname) {
        this.salerdeptname = salerdeptname == null ? null : salerdeptname.trim();
    }

    public Integer getHastourist() {
        return hastourist;
    }

    public void setHastourist(Integer hastourist) {
        this.hastourist = hastourist;
    }

    public Integer getIsautoconfirmed() {
        return isautoconfirmed;
    }

    public void setIsautoconfirmed(Integer isautoconfirmed) {
        this.isautoconfirmed = isautoconfirmed;
    }

    public BigDecimal getOrigreceivableamt() {
        return origreceivableamt;
    }

    public void setOrigreceivableamt(BigDecimal origreceivableamt) {
        this.origreceivableamt = origreceivableamt;
    }

    public BigDecimal getOrigpayableamt() {
        return origpayableamt;
    }

    public void setOrigpayableamt(BigDecimal origpayableamt) {
        this.origpayableamt = origpayableamt;
    }

    public String getParentorgid() {
        return parentorgid;
    }

    public void setParentorgid(String parentorgid) {
        this.parentorgid = parentorgid == null ? null : parentorgid.trim();
    }

    public Boolean getIsdirectorgan() {
        return isdirectorgan;
    }

    public void setIsdirectorgan(Boolean isdirectorgan) {
        this.isdirectorgan = isdirectorgan;
    }

    public String getNotouristcomment() {
        return notouristcomment;
    }

    public void setNotouristcomment(String notouristcomment) {
        this.notouristcomment = notouristcomment == null ? null : notouristcomment.trim();
    }

    public Boolean getIsusediscount() {
        return isusediscount;
    }

    public void setIsusediscount(Boolean isusediscount) {
        this.isusediscount = isusediscount;
    }

    public Integer getPricetype() {
        return pricetype;
    }

    public void setPricetype(Integer pricetype) {
        this.pricetype = pricetype==1?2:1;
    }

    public Integer getProdutoutertimes() {
        return produtoutertimes;
    }

    public void setProdutoutertimes(Integer produtoutertimes) {
        this.produtoutertimes = produtoutertimes;
    }

    public BigDecimal getNoturnpayableamt() {
        return noturnpayableamt;
    }

    public void setNoturnpayableamt(BigDecimal noturnpayableamt) {
        this.noturnpayableamt = noturnpayableamt;
    }

    public String getOrderbusinesssource() {
        return orderbusinesssource;
    }

    public void setOrderbusinesssource(String orderbusinesssource) {
        this.orderbusinesssource = orderbusinesssource == null ? null : orderbusinesssource.trim();
    }

    public Integer getTurnbeforecategory() {
        return turnbeforecategory;
    }

    public void setTurnbeforecategory(Integer turnbeforecategory) {
        this.turnbeforecategory = turnbeforecategory;
    }

    public String getDirectSalesSendId() {
        return directsalessendid;
    }

    public void setDirectSalesSendId(String directSalesSendId) {
        this.directsalessendid = directSalesSendId;
    }

    public Integer getExtendedstatus() {
        return extendedstatus;
    }

    public void setExtendedstatus(Integer extendedstatus) {
        this.extendedstatus = extendedstatus;
    }

    public String getRoutesubtype() {
        return routesubtype;
    }

    public void setRoutesubtype(String routesubtype) {
        this.routesubtype = routesubtype == null ? null : routesubtype.trim();
    }

    public String getRoutesubtypename() {
        return routesubtypename;
    }

    public void setRoutesubtypename(String routesubtypename) {
        this.routesubtypename = routesubtypename == null ? null : routesubtypename.trim();
    }

    public Integer getChangestatus() {
        return changestatus;
    }

    public void setChangestatus(Integer changestatus) {
        this.changestatus = changestatus;
    }

    public String getTeamnature() {
        return teamnature;
    }

    public void setTeamnature(String teamnature) {
        this.teamnature = teamnature == null ? null : teamnature.trim();
    }

    public Integer getIssigned() {
        return issigned;
    }

    public void setIssigned(Integer issigned) {
        this.issigned = issigned;
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public Date getSigntime() {
        return signtime;
    }

    public void setSigntime(Date signtime) {
        this.signtime = signtime;
    }
}