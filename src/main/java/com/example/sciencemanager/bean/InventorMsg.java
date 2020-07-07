package com.example.sciencemanager.bean;

import java.io.Serializable;

public class InventorMsg implements Serializable {
    private String inventorname;

    private Integer ranking;

    private String company;

    private Integer applicationid;

    private Double contributerate;

    private static final long serialVersionUID = 1L;

    public String getInventorname() {
        return inventorname;
    }

    public void setInventorname(String inventorname) {
        this.inventorname = inventorname == null ? null : inventorname.trim();
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public Integer getApplicationid() {
        return applicationid;
    }

    public void setApplicationid(Integer applicationid) {
        this.applicationid = applicationid;
    }

    public Double getContributerate() {
        return contributerate;
    }

    public void setContributerate(Double contributerate) {
        this.contributerate = contributerate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", inventorname=").append(inventorname);
        sb.append(", ranking=").append(ranking);
        sb.append(", company=").append(company);
        sb.append(", applicationid=").append(applicationid);
        sb.append(", contributerate=").append(contributerate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}