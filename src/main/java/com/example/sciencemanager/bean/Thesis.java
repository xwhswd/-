package com.example.sciencemanager.bean;

import java.io.Serializable;
import java.util.Date;

public class Thesis implements Serializable {
    private Integer thesisid;

    private String thesisname;

    private String firstwriter;

    private String secondwriter;

    private String position;

    private Integer isinbook;

    private String remark;

    private String publicationname;

    private Integer reelnum;

    private String pagerange;

    private Date date;

    private Integer issue;

    private Integer isexpenditure;

    private Integer expenditure;

    private String retrievalkind;

    private Integer retrievalid;

    private static final long serialVersionUID = 1L;

    public Integer getThesisid() {
        return thesisid;
    }

    public void setThesisid(Integer thesisid) {
        this.thesisid = thesisid;
    }

    public String getThesisname() {
        return thesisname;
    }

    public void setThesisname(String thesisname) {
        this.thesisname = thesisname == null ? null : thesisname.trim();
    }

    public String getFirstwriter() {
        return firstwriter;
    }

    public void setFirstwriter(String firstwriter) {
        this.firstwriter = firstwriter == null ? null : firstwriter.trim();
    }

    public String getSecondwriter() {
        return secondwriter;
    }

    public void setSecondwriter(String secondwriter) {
        this.secondwriter = secondwriter == null ? null : secondwriter.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public Integer getIsinbook() {
        return isinbook;
    }

    public void setIsinbook(Integer isinbook) {
        this.isinbook = isinbook;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getPublicationname() {
        return publicationname;
    }

    public void setPublicationname(String publicationname) {
        this.publicationname = publicationname == null ? null : publicationname.trim();
    }

    public Integer getReelnum() {
        return reelnum;
    }

    public void setReelnum(Integer reelnum) {
        this.reelnum = reelnum;
    }

    public String getPagerange() {
        return pagerange;
    }

    public void setPagerange(String pagerange) {
        this.pagerange = pagerange == null ? null : pagerange.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getIssue() {
        return issue;
    }

    public void setIssue(Integer issue) {
        this.issue = issue;
    }

    public Integer getIsexpenditure() {
        return isexpenditure;
    }

    public void setIsexpenditure(Integer isexpenditure) {
        this.isexpenditure = isexpenditure;
    }

    public Integer getExpenditure() {
        return expenditure;
    }

    public void setExpenditure(Integer expenditure) {
        this.expenditure = expenditure;
    }

    public String getRetrievalkind() {
        return retrievalkind;
    }

    public void setRetrievalkind(String retrievalkind) {
        this.retrievalkind = retrievalkind == null ? null : retrievalkind.trim();
    }

    public Integer getRetrievalid() {
        return retrievalid;
    }

    public void setRetrievalid(Integer retrievalid) {
        this.retrievalid = retrievalid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", thesisid=").append(thesisid);
        sb.append(", thesisname=").append(thesisname);
        sb.append(", firstwriter=").append(firstwriter);
        sb.append(", secondwriter=").append(secondwriter);
        sb.append(", position=").append(position);
        sb.append(", isinbook=").append(isinbook);
        sb.append(", remark=").append(remark);
        sb.append(", publicationname=").append(publicationname);
        sb.append(", reelnum=").append(reelnum);
        sb.append(", pagerange=").append(pagerange);
        sb.append(", date=").append(date);
        sb.append(", issue=").append(issue);
        sb.append(", isexpenditure=").append(isexpenditure);
        sb.append(", expenditure=").append(expenditure);
        sb.append(", retrievalkind=").append(retrievalkind);
        sb.append(", retrievalid=").append(retrievalid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}