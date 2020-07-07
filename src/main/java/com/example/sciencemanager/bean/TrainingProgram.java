package com.example.sciencemanager.bean;

import java.io.Serializable;

public class TrainingProgram implements Serializable {
    private Integer serialnum;

    private String subjectkind;

    private Integer subjectid;

    private String subjectname;

    private Integer period;

    private Integer credit;

    private String subjectterm;

    private String methodofexamination;

    private String college;

    private static final long serialVersionUID = 1L;

    public Integer getSerialnum() {
        return serialnum;
    }

    public void setSerialnum(Integer serialnum) {
        this.serialnum = serialnum;
    }

    public String getSubjectkind() {
        return subjectkind;
    }

    public void setSubjectkind(String subjectkind) {
        this.subjectkind = subjectkind == null ? null : subjectkind.trim();
    }

    public Integer getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(Integer subjectid) {
        this.subjectid = subjectid;
    }

    public String getSubjectname() {
        return subjectname;
    }

    public void setSubjectname(String subjectname) {
        this.subjectname = subjectname == null ? null : subjectname.trim();
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public String getSubjectterm() {
        return subjectterm;
    }

    public void setSubjectterm(String subjectterm) {
        this.subjectterm = subjectterm == null ? null : subjectterm.trim();
    }

    public String getMethodofexamination() {
        return methodofexamination;
    }

    public void setMethodofexamination(String methodofexamination) {
        this.methodofexamination = methodofexamination == null ? null : methodofexamination.trim();
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college == null ? null : college.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialnum=").append(serialnum);
        sb.append(", subjectkind=").append(subjectkind);
        sb.append(", subjectid=").append(subjectid);
        sb.append(", subjectname=").append(subjectname);
        sb.append(", period=").append(period);
        sb.append(", credit=").append(credit);
        sb.append(", subjectterm=").append(subjectterm);
        sb.append(", methodofexamination=").append(methodofexamination);
        sb.append(", college=").append(college);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}