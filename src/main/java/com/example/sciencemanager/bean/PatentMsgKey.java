package com.example.sciencemanager.bean;

import java.io.Serializable;

public class PatentMsgKey implements Serializable {
    private Integer serialnum;

    private Integer applicateid;

    private static final long serialVersionUID = 1L;

    public Integer getSerialnum() {
        return serialnum;
    }

    public void setSerialnum(Integer serialnum) {
        this.serialnum = serialnum;
    }

    public Integer getApplicateid() {
        return applicateid;
    }

    public void setApplicateid(Integer applicateid) {
        this.applicateid = applicateid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialnum=").append(serialnum);
        sb.append(", applicateid=").append(applicateid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}