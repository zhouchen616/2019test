package com.holyrobot.con_common.pojo;

import java.io.Serializable;

public class CusCusInfoServiceType implements Serializable{
    private static final long serialVersionUID = 1L;

	private String id;

    private String cusCusinfoid;

    private String serviertypeid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCusCusinfoid() {
        return cusCusinfoid;
    }

    public void setCusCusinfoid(String cusCusinfoid) {
        this.cusCusinfoid = cusCusinfoid;
    }

    public String getServiertypeid() {
        return serviertypeid;
    }

    public void setServiertypeid(String serviertypeid) {
        this.serviertypeid = serviertypeid;
    }
}