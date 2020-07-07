package com.example.sciencemanager.bean;

import java.io.Serializable;
import java.util.Date;

public class Book implements Serializable {
    private Integer bookid;

    private String bookname;

    private String editorname;

    private String position;

    private String publishcompany;

    private Date pubilshdate;

    private Integer allwordcount;

    private Integer wordcount;

    private String publishversion;

    private Integer isexpenditure;

    private Integer expenditure;

    private Integer pubilshquantity;

    private static final long serialVersionUID = 1L;

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname == null ? null : bookname.trim();
    }

    public String getEditorname() {
        return editorname;
    }

    public void setEditorname(String editorname) {
        this.editorname = editorname == null ? null : editorname.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getPublishcompany() {
        return publishcompany;
    }

    public void setPublishcompany(String publishcompany) {
        this.publishcompany = publishcompany == null ? null : publishcompany.trim();
    }

    public Date getPubilshdate() {
        return pubilshdate;
    }

    public void setPubilshdate(Date pubilshdate) {
        this.pubilshdate = pubilshdate;
    }

    public Integer getAllwordcount() {
        return allwordcount;
    }

    public void setAllwordcount(Integer allwordcount) {
        this.allwordcount = allwordcount;
    }

    public Integer getWordcount() {
        return wordcount;
    }

    public void setWordcount(Integer wordcount) {
        this.wordcount = wordcount;
    }

    public String getPublishversion() {
        return publishversion;
    }

    public void setPublishversion(String publishversion) {
        this.publishversion = publishversion == null ? null : publishversion.trim();
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

    public Integer getPubilshquantity() {
        return pubilshquantity;
    }

    public void setPubilshquantity(Integer pubilshquantity) {
        this.pubilshquantity = pubilshquantity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bookid=").append(bookid);
        sb.append(", bookname=").append(bookname);
        sb.append(", editorname=").append(editorname);
        sb.append(", position=").append(position);
        sb.append(", publishcompany=").append(publishcompany);
        sb.append(", pubilshdate=").append(pubilshdate);
        sb.append(", allwordcount=").append(allwordcount);
        sb.append(", wordcount=").append(wordcount);
        sb.append(", publishversion=").append(publishversion);
        sb.append(", isexpenditure=").append(isexpenditure);
        sb.append(", expenditure=").append(expenditure);
        sb.append(", pubilshquantity=").append(pubilshquantity);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}