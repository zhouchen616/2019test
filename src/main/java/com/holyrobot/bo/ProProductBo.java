package com.holyrobot.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ProProductBo implements Serializable {

	private static final long serialVersionUID = 2196542795819365511L;

	private String id;

    private String protypeid;

    private String protype;

    private String procategoryid;

    private String procategory;

    private String proname;

    private String aliasename;

    private String prono;

    private Integer tourdays;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date startdate;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date duedate;

    private String departure;

    private String destination;

    private String protag;

    private String feature;

    private String feeincludes;

    private String feenonincludes;

    private String coverimg;

    private String attention;

    private String shopping;

    private String tips;

    private String insurance;

    private String bactorule;

    private Integer isack;

    private Integer datastatus;

    private Date createddate;

    private String createdby;

    private String createdbyid;

    private String deptid;

    private String orgid;

    private String travelname;

    private String brandname;

    private Date reviseddate;

    private String revisedby;

    private Boolean istail;

    private String summary;
    
    private List<OmDestinationBo> omDestinationBoList;
    
    public List<OmDestinationBo> getOmDestinationBoList() {
		return omDestinationBoList;
	}

	public void setOmDestinationBoList(List<OmDestinationBo> omDestinationBoList) {
		this.omDestinationBoList = omDestinationBoList;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProtypeid() {
        return protypeid;
    }

    public void setProtypeid(String protypeid) {
        this.protypeid = protypeid;
    }

    public String getProtype() {
        return protype;
    }

    public void setProtype(String protype) {
        this.protype = protype;
    }

    public String getProcategoryid() {
        return procategoryid;
    }

    public void setProcategoryid(String procategoryid) {
        this.procategoryid = procategoryid;
    }

    public String getProcategory() {
        return procategory;
    }

    public void setProcategory(String procategory) {
        this.procategory = procategory;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public String getAliasename() {
        return aliasename;
    }

    public void setAliasename(String aliasename) {
        this.aliasename = aliasename;
    }

    public String getProno() {
        return prono;
    }

    public void setProno(String prono) {
        this.prono = prono;
    }

    public Integer getTourdays() {
        return tourdays;
    }

    public void setTourdays(Integer tourdays) {
        this.tourdays = tourdays;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getDuedate() {
        return duedate;
    }

    public void setDuedate(Date duedate) {
        this.duedate = duedate;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getProtag() {
        return protag;
    }

    public void setProtag(String protag) {
        this.protag = protag;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getFeeincludes() {
        return feeincludes;
    }

    public void setFeeincludes(String feeincludes) {
        this.feeincludes = feeincludes;
    }

    public String getFeenonincludes() {
        return feenonincludes;
    }

    public void setFeenonincludes(String feenonincludes) {
        this.feenonincludes = feenonincludes;
    }

    public String getCoverimg() {
        return coverimg;
    }

    public void setCoverimg(String coverimg) {
        this.coverimg = coverimg;
    }

    public String getAttention() {
        return attention;
    }

    public void setAttention(String attention) {
        this.attention = attention;
    }

    public String getShopping() {
        return shopping;
    }

    public void setShopping(String shopping) {
        this.shopping = shopping;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public String getBactorule() {
        return bactorule;
    }

    public void setBactorule(String bactorule) {
        this.bactorule = bactorule;
    }

    public Integer getIsack() {
        return isack;
    }

    public void setIsack(Integer isack) {
        this.isack = isack;
    }

    public Integer getDatastatus() {
        return datastatus;
    }

    public void setDatastatus(Integer datastatus) {
        this.datastatus = datastatus;
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
        this.createdby = createdby;
    }

    public String getCreatedbyid() {
        return createdbyid;
    }

    public void setCreatedbyid(String createdbyid) {
        this.createdbyid = createdbyid;
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }

    public String getTravelname() {
        return travelname;
    }

    public void setTravelname(String travelname) {
        this.travelname = travelname;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
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
        this.revisedby = revisedby;
    }

    public Boolean getIstail() {
        return istail;
    }

    public void setIstail(Boolean istail) {
        this.istail = istail;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}