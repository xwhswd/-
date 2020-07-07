package com.example.sciencemanager.bean;

import java.io.Serializable;

public class Project implements Serializable {
    private Integer projectid;

    private String projectname;

    private String projectmaster;

    private String source;

    private Integer ranking;

    private String kind;

    private Integer level;

    private String position;

    private Integer expenditure;

    private String mission;

    private static final long serialVersionUID = 1L;

    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    public String getProjectmaster() {
        return projectmaster;
    }

    public void setProjectmaster(String projectmaster) {
        this.projectmaster = projectmaster == null ? null : projectmaster.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind == null ? null : kind.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public Integer getExpenditure() {
        return expenditure;
    }

    public void setExpenditure(Integer expenditure) {
        this.expenditure = expenditure;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission == null ? null : mission.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", projectid=").append(projectid);
        sb.append(", projectname=").append(projectname);
        sb.append(", projectmaster=").append(projectmaster);
        sb.append(", source=").append(source);
        sb.append(", ranking=").append(ranking);
        sb.append(", kind=").append(kind);
        sb.append(", level=").append(level);
        sb.append(", position=").append(position);
        sb.append(", expenditure=").append(expenditure);
        sb.append(", mission=").append(mission);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}