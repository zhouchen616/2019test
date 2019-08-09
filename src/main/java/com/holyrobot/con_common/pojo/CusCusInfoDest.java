package com.holyrobot.con_common.pojo;

import java.io.Serializable;

public class CusCusInfoDest implements Serializable{
    private static final long serialVersionUID = 1L;

	private String id;

    private String cusCusinfoid;

    private String destid;

    private String destination;

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

    public String getDestid() {
        return destid;
    }

    public void setDestid(String destid) {
        this.destid = destid;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}