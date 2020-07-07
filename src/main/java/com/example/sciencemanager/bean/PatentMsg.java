package com.example.sciencemanager.bean;

import java.io.Serializable;
import java.util.Date;

public class PatentMsg extends PatentMsgKey implements Serializable {
    private String patentname;

    private String college;

    private Integer patentkind;

    private Date applicatedate;

    private Integer isdutypatent;

    private String inventor;

    private String remake;

    private static final long serialVersionUID = 1L;

    public String getPatentname() {
        return patentname;
    }

    public void setPatentname(String patentname) {
        this.patentname = patentname == null ? null : patentname.trim();
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college == null ? null : college.trim();
    }

    public Integer getPatentkind() {
        return patentkind;
    }

    public void setPatentkind(Integer patentkind) {
        this.patentkind = patentkind;
    }

    public Date getApplicatedate() {
        return applicatedate;
    }

    public void setApplicatedate(Date applicatedate) {
        this.applicatedate = applicatedate;
    }

    public Integer getIsdutypatent() {
        return isdutypatent;
    }

    public void setIsdutypatent(Integer isdutypatent) {
        this.isdutypatent = isdutypatent;
    }

    public String getInventor() {
        return inventor;
    }

    public void setInventor(String inventor) {
        this.inventor = inventor == null ? null : inventor.trim();
    }

    public String getRemake() {
        return remake;
    }

    public void setRemake(String remake) {
        this.remake = remake == null ? null : remake.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", patentname=").append(patentname);
        sb.append(", college=").append(college);
        sb.append(", patentkind=").append(patentkind);
        sb.append(", applicatedate=").append(applicatedate);
        sb.append(", isdutypatent=").append(isdutypatent);
        sb.append(", inventor=").append(inventor);
        sb.append(", remake=").append(remake);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}