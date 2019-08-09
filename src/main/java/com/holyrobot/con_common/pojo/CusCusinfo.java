package com.holyrobot.con_common.pojo;

import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class CusCusinfo implements Serializable {
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    private String id;

    private Integer custype;

    private String departureid;

    private String departure;

    private String destination;

    private Date startdate;

    private Date enddate;

    private Integer adultnum;

    private Integer childnum;

    private Integer budget;

    private Integer customernum;

    private String otherrequire;

    private String travellername;

    private String wechat;

    private String mobile;

    private String email;

    private String servicetype;

    private Integer datastatus;

    private String siteid;

    private Date createddate;

    private String createdby;

    private String createdbyid;

    private String deptid;

    private String orgid;

    private Date reviseddate;

    private String revisedby;

    private String cusinfono;

    private String destinationid;

    private Date lastpushdate;

    private int pushtimes;

    private String tag;

    private Integer source;

    private String supplierid;

    private List<String> destinationids;
    private List<String> destinations;
    private List<String> servicetypes;
    private List<String> tags;
    private String startDateStr;
    private String endDateStr;
    private String transferSupplierNames;
    private String travelAgencyName;
    private Integer userType;


    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return "CusCusinfo{" +
                "format=" + format +
                ", id='" + id + '\'' +
                ", custype=" + custype +
                ", departureid='" + departureid + '\'' +
                ", departure='" + departure + '\'' +
                ", destination='" + destination + '\'' +
                ", startdate=" + startdate +
                ", enddate=" + enddate +
                ", adultnum=" + adultnum +
                ", childnum=" + childnum +
                ", budget=" + budget +
                ", customernum=" + customernum +
                ", otherrequire='" + otherrequire + '\'' +
                ", travellername='" + travellername + '\'' +
                ", wechat='" + wechat + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", servicetype='" + servicetype + '\'' +
                ", datastatus=" + datastatus +
                ", siteid='" + siteid + '\'' +
                ", createddate=" + createddate +
                ", createdby='" + createdby + '\'' +
                ", createdbyid='" + createdbyid + '\'' +
                ", deptid='" + deptid + '\'' +
                ", orgid='" + orgid + '\'' +
                ", reviseddate=" + reviseddate +
                ", revisedby='" + revisedby + '\'' +
                ", cusinfono='" + cusinfono + '\'' +
                ", destinationid='" + destinationid + '\'' +
                ", pushtimes=" + pushtimes +
                ", tag='" + tag + '\'' +
                ", source=" + source +
                ", destinationids=" + destinationids +
                ", destinations=" + destinations +
                ", servicetypes=" + servicetypes +
                ", tags=" + tags +
                ", supplierid=" + supplierid +
                ", startDateStr='" + startDateStr + '\'' +
                ", endDateStr='" + endDateStr + '\'' +
                '}';
    }

    public String getTransferSupplierNames() {
        return transferSupplierNames;
    }

    public void setTransferSupplierNames(String transferSupplierNames) {
        this.transferSupplierNames = transferSupplierNames;
    }

    public String getTravelAgencyName() {
        return travelAgencyName;
    }

    public void setTravelAgencyName(String travelAgencyName) {
        this.travelAgencyName = travelAgencyName;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(String supplierid) {
        this.supplierid = supplierid;
    }

    public Date getLastpushdate() {
        return lastpushdate;
    }

    public void setLastpushdate(Date lastpushdate) {
        this.lastpushdate = lastpushdate;
    }

    public int getPushtimes() {
        return pushtimes;
    }

    public void setPushtimes(int pushtimes) {
        this.pushtimes = pushtimes;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
        if (tags != null && tags.size() > 0) {
            tag="";
            for (String id : tags) {
                tag += id + ",";
            }
        }
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getStartDateStr() {
        return startDateStr;
    }

    public void setStartDateStr(String startDateStr) {
        this.startDateStr = startDateStr;
        if(StringUtils.isNotEmpty(startDateStr)){
            try {
                startdate=format.parse(startDateStr);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public String getEndDateStr() {
        return endDateStr;
    }

    public void setEndDateStr(String endDateStr) {
        this.endDateStr = endDateStr;
        if(StringUtils.isNotEmpty(endDateStr)){
            try {
                enddate=format.parse(endDateStr);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public List<String> getServicetypes() {
        return servicetypes;
    }

    public void setServicetypes(List<String> servicetypes) {
        this.servicetypes = servicetypes;
        if (servicetypes != null && servicetypes.size() > 0) {
            servicetype="";
            for (String id : servicetypes) {
                servicetype += id + ",";
            }
        }
    }

    public List<String> getDestinationids() {
        return destinationids;
    }

    public void setDestinationids(List<String> destinationids) {
        this.destinationids = destinationids;
        if (destinationids != null && destinationids.size() > 0) {
            destinationid="";
            for (String id : destinationids) {
                destinationid += id + ",";
            }
        }
    }

    public List<String> getDestinations() {
        return destinations;
    }

    public void setDestinations(List<String> destinations) {
        this.destinations = destinations;
        if (destinations != null && destinations.size() > 0) {
            destination="";
            for (String des : destinations) {
                destination += des + ",";
            }
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getCustype() {
        return custype;
    }

    public void setCustype(Integer custype) {
        this.custype = custype;
    }

    public String getDepartureid() {
        return departureid;
    }

    public void setDepartureid(String departureid) {
        this.departureid = departureid == null ? null : departureid.trim();
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure == null ? null : departure.trim();
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
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

    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    public Integer getCustomernum() {
        return customernum;
    }

    public void setCustomernum(Integer customernum) {
        this.customernum = customernum;
    }

    public String getOtherrequire() {
        return otherrequire;
    }

    public void setOtherrequire(String otherrequire) {
        this.otherrequire = otherrequire == null ? null : otherrequire.trim();
    }

    public String getTravellername() {
        return travellername;
    }

    public void setTravellername(String travellername) {
        this.travellername = travellername == null ? null : travellername.trim();
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
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

    public String getServicetype() {
        return servicetype;
    }

    public void setServicetype(String servicetype) {
        this.servicetype = servicetype == null ? null : servicetype.trim();
    }

    public Integer getDatastatus() {
        return datastatus;
    }

    public void setDatastatus(Integer datastatus) {
        this.datastatus = datastatus;
    }

    public String getSiteid() {
        return siteid;
    }

    public void setSiteid(String siteid) {
        this.siteid = siteid == null ? null : siteid.trim();
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

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
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

    public String getCusinfono() {
        return cusinfono;
    }

    public void setCusinfono(String cusinfono) {
        this.cusinfono = cusinfono == null ? null : cusinfono.trim();
    }

    public String getDestinationid() {
        return destinationid;
    }

    public void setDestinationid(String destinationid) {
        this.destinationid = destinationid == null ? null : destinationid.trim();
    }
}