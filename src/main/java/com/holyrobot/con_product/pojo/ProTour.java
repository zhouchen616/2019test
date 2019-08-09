package com.holyrobot.con_product.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class ProTour {
    private String id;

    private String proid;

    private String tourno;

    private String tourname;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date tourdate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date duedate;

    private Integer plannum;

    private Integer minnum;

    private Integer seatnum;

    private String refdepflight;

    private String refbackflight;

    private Integer tourstatus;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date createddate;

    private String createdby;

    private String createdbyid;

    private String deptid;

    private String orgid;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date reviseddate;

    private String revisedby;

    private Integer istail;

    private Integer tailauditstatus;

    private Integer isack;

    private Integer hastraffic;

    private Boolean isusediscount;

    private Integer issigned;

    private Integer tourescortnum;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getProid() {
        return proid;
    }

    public void setProid(String proid) {
        this.proid = proid == null ? null : proid.trim();
    }

    public String getTourno() {
        return tourno;
    }

    public void setTourno(String tourno) {
        this.tourno = tourno == null ? null : tourno.trim();
    }

    public String getTourname() {
        return tourname;
    }

    public void setTourname(String tourname) {
        this.tourname = tourname == null ? null : tourname.trim();
    }

    public Date getTourdate() {
        return tourdate;
    }

    public void setTourdate(Date tourdate) {
        this.tourdate = tourdate;
    }

    public Date getDuedate() {
        return duedate;
    }

    public void setDuedate(Date duedate) {
        this.duedate = duedate;
    }

    public Integer getPlannum() {
        return plannum;
    }

    public void setPlannum(Integer plannum) {
        this.plannum = plannum;
    }

    public Integer getMinnum() {
        return minnum;
    }

    public void setMinnum(Integer minnum) {
        this.minnum = minnum;
    }

    public Integer getSeatnum() {
        return seatnum;
    }

    public void setSeatnum(Integer seatnum) {
        this.seatnum = seatnum;
    }

    public String getRefdepflight() {
        return refdepflight;
    }

    public void setRefdepflight(String refdepflight) {
        this.refdepflight = refdepflight == null ? null : refdepflight.trim();
    }

    public String getRefbackflight() {
        return refbackflight;
    }

    public void setRefbackflight(String refbackflight) {
        this.refbackflight = refbackflight == null ? null : refbackflight.trim();
    }

    public Integer getTourstatus() {
        return tourstatus;
    }

    public void setTourstatus(Integer tourstatus) {
        this.tourstatus = tourstatus;
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

    public Integer getIstail() {
        return istail;
    }

    public void setIstail(Integer istail) {
        this.istail = istail;
    }

    public Integer getTailauditstatus() {
        return tailauditstatus;
    }

    public void setTailauditstatus(Integer tailauditstatus) {
        this.tailauditstatus = tailauditstatus;
    }

    public Integer getIsack() {
        return isack;
    }

    public void setIsack(Integer isack) {
        this.isack = isack;
    }

    public Integer getHastraffic() {
        return hastraffic;
    }

    public void setHastraffic(Integer hastraffic) {
        this.hastraffic = hastraffic;
    }

    public Boolean getIsusediscount() {
        return isusediscount;
    }

    public void setIsusediscount(Boolean isusediscount) {
        this.isusediscount = isusediscount;
    }

    public Integer getIssigned() {
        return issigned;
    }

    public void setIssigned(Integer issigned) {
        this.issigned = issigned;
    }

    public Integer getTourescortnum() {
        return tourescortnum;
    }

    public void setTourescortnum(Integer tourescortnum) {
        this.tourescortnum = tourescortnum;
    }
}