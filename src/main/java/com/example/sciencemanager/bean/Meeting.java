package com.example.sciencemanager.bean;

import java.io.Serializable;
import java.util.Date;

public class Meeting implements Serializable {
    private String participantname;

    private String meetingname;

    private String sponsor;

    private Integer meetingkind;

    private Integer subjectkind;

    private String address;

    private Date date;

    private Integer isthesis;

    private Integer isreport;

    private String thesisname;

    private String meetingintroduction;

    private static final long serialVersionUID = 1L;

    public String getParticipantname() {
        return participantname;
    }

    public void setParticipantname(String participantname) {
        this.participantname = participantname == null ? null : participantname.trim();
    }

    public String getMeetingname() {
        return meetingname;
    }

    public void setMeetingname(String meetingname) {
        this.meetingname = meetingname == null ? null : meetingname.trim();
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor == null ? null : sponsor.trim();
    }

    public Integer getMeetingkind() {
        return meetingkind;
    }

    public void setMeetingkind(Integer meetingkind) {
        this.meetingkind = meetingkind;
    }

    public Integer getSubjectkind() {
        return subjectkind;
    }

    public void setSubjectkind(Integer subjectkind) {
        this.subjectkind = subjectkind;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getIsthesis() {
        return isthesis;
    }

    public void setIsthesis(Integer isthesis) {
        this.isthesis = isthesis;
    }

    public Integer getIsreport() {
        return isreport;
    }

    public void setIsreport(Integer isreport) {
        this.isreport = isreport;
    }

    public String getThesisname() {
        return thesisname;
    }

    public void setThesisname(String thesisname) {
        this.thesisname = thesisname == null ? null : thesisname.trim();
    }

    public String getMeetingintroduction() {
        return meetingintroduction;
    }

    public void setMeetingintroduction(String meetingintroduction) {
        this.meetingintroduction = meetingintroduction == null ? null : meetingintroduction.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", participantname=").append(participantname);
        sb.append(", meetingname=").append(meetingname);
        sb.append(", sponsor=").append(sponsor);
        sb.append(", meetingkind=").append(meetingkind);
        sb.append(", subjectkind=").append(subjectkind);
        sb.append(", address=").append(address);
        sb.append(", date=").append(date);
        sb.append(", isthesis=").append(isthesis);
        sb.append(", isreport=").append(isreport);
        sb.append(", thesisname=").append(thesisname);
        sb.append(", meetingintroduction=").append(meetingintroduction);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}