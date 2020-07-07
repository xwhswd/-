package com.example.sciencemanager.bean;

import java.io.Serializable;

public class Teacher implements Serializable {
    private Integer teaid;

    private String name;

    private Integer qid;

    private Integer age;

    private String gender;

    private String positon;

    private String kind;

    private String major;

    private String specialice;

    private String project;

    private String thesis;

    private String address;

    private Integer tel;

    private String email;

    private Integer qq;

    private Integer stuquantity;

    private static final long serialVersionUID = 1L;

    public Integer getTeaid() {
        return teaid;
    }

    public void setTeaid(Integer teaid) {
        this.teaid = teaid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getQid() {
        return qid;
    }

    public void setQid(Integer qid) {
        this.qid = qid;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getPositon() {
        return positon;
    }

    public void setPositon(String positon) {
        this.positon = positon == null ? null : positon.trim();
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind == null ? null : kind.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getSpecialice() {
        return specialice;
    }

    public void setSpecialice(String specialice) {
        this.specialice = specialice == null ? null : specialice.trim();
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project == null ? null : project.trim();
    }

    public String getThesis() {
        return thesis;
    }

    public void setThesis(String thesis) {
        this.thesis = thesis == null ? null : thesis.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getTel() {
        return tel;
    }

    public void setTel(Integer tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getQq() {
        return qq;
    }

    public void setQq(Integer qq) {
        this.qq = qq;
    }

    public Integer getStuquantity() {
        return stuquantity;
    }

    public void setStuquantity(Integer stuquantity) {
        this.stuquantity = stuquantity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", teaid=").append(teaid);
        sb.append(", name=").append(name);
        sb.append(", qid=").append(qid);
        sb.append(", age=").append(age);
        sb.append(", gender=").append(gender);
        sb.append(", positon=").append(positon);
        sb.append(", kind=").append(kind);
        sb.append(", major=").append(major);
        sb.append(", specialice=").append(specialice);
        sb.append(", project=").append(project);
        sb.append(", thesis=").append(thesis);
        sb.append(", address=").append(address);
        sb.append(", tel=").append(tel);
        sb.append(", email=").append(email);
        sb.append(", qq=").append(qq);
        sb.append(", stuquantity=").append(stuquantity);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}