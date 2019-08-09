package com.holyrobot.dto;

import com.holyrobot.response.ProductListResponse;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class OmDestinationBo implements Serializable{
    private static final long serialVersionUID = 1L;

	private String id;

    private String parentid;

    private String destid;

    private String destname;

    private String siteid;

    private String sitename;

    private String routetypeid;

    private String routetype;

    private Date createddate;

    private String createdby;

    private String createdbyid;

    private String deptid;

    private String orgid;

    private Date reviseddate;

    private String revisedby;

    private Integer datastatus;

    private Integer aliasid;
    
    private List<ProProductBo> proProductBoList;
    
    //新增存放es中的关于产品信息的属性
    private List<ProductListResponse> productListResponse;

	public List<ProductListResponse> getProductListResponse() {
		return productListResponse;
	}

	public void setProductListResponse(List<ProductListResponse> productListResponse) {
		this.productListResponse = productListResponse;
	}

	public List<ProProductBo> getProProductBoList() {
		return proProductBoList;
	}

	public void setProProductBoList(List<ProProductBo> proProductBoList) {
		this.proProductBoList = proProductBoList;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    public String getDestid() {
        return destid;
    }

    public void setDestid(String destid) {
        this.destid = destid;
    }

    public String getDestname() {
        return destname;
    }

    public void setDestname(String destname) {
        this.destname = destname;
    }

    public String getSiteid() {
        return siteid;
    }

    public void setSiteid(String siteid) {
        this.siteid = siteid;
    }

    public String getSitename() {
        return sitename;
    }

    public void setSitename(String sitename) {
        this.sitename = sitename;
    }

    public String getRoutetypeid() {
        return routetypeid;
    }

    public void setRoutetypeid(String routetypeid) {
        this.routetypeid = routetypeid;
    }

    public String getRoutetype() {
        return routetype;
    }

    public void setRoutetype(String routetype) {
        this.routetype = routetype;
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

    public Integer getDatastatus() {
        return datastatus;
    }

    public void setDatastatus(Integer datastatus) {
        this.datastatus = datastatus;
    }

    public Integer getAliasid() {
        return aliasid;
    }

    public void setAliasid(Integer aliasid) {
        this.aliasid = aliasid;
    }

	@Override
	public String toString() {
		return "OmDestination [id=" + id + ", parentid=" + parentid + ", destid=" + destid + ", destname=" + destname
				+ ", siteid=" + siteid + ", sitename=" + sitename + ", routetypeid=" + routetypeid + ", routetype="
				+ routetype + ", createddate=" + createddate + ", createdby=" + createdby + ", createdbyid="
				+ createdbyid + ", deptid=" + deptid + ", orgid=" + orgid + ", reviseddate=" + reviseddate
				+ ", revisedby=" + revisedby + ", datastatus=" + datastatus + ", aliasid=" + aliasid + "]";
	}
    
    
}