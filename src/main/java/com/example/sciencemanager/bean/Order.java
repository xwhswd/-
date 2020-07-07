package com.example.sciencemanager.bean;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {
    private Integer studentid;

    private String studentname;

    private String teachername;

    private Integer trainingexpenditureamount;

    private Date expendituretime;

    private Integer expenditure;

    private Integer balance;

    private static final long serialVersionUID = 1L;

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname == null ? null : studentname.trim();
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername == null ? null : teachername.trim();
    }

    public Integer getTrainingexpenditureamount() {
        return trainingexpenditureamount;
    }

    public void setTrainingexpenditureamount(Integer trainingexpenditureamount) {
        this.trainingexpenditureamount = trainingexpenditureamount;
    }

    public Date getExpendituretime() {
        return expendituretime;
    }

    public void setExpendituretime(Date expendituretime) {
        this.expendituretime = expendituretime;
    }

    public Integer getExpenditure() {
        return expenditure;
    }

    public void setExpenditure(Integer expenditure) {
        this.expenditure = expenditure;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", studentid=").append(studentid);
        sb.append(", studentname=").append(studentname);
        sb.append(", teachername=").append(teachername);
        sb.append(", trainingexpenditureamount=").append(trainingexpenditureamount);
        sb.append(", expendituretime=").append(expendituretime);
        sb.append(", expenditure=").append(expenditure);
        sb.append(", balance=").append(balance);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}