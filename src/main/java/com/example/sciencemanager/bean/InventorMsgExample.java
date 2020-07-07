package com.example.sciencemanager.bean;

import java.util.ArrayList;
import java.util.List;

public class InventorMsgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InventorMsgExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andInventornameIsNull() {
            addCriterion("InventorName is null");
            return (Criteria) this;
        }

        public Criteria andInventornameIsNotNull() {
            addCriterion("InventorName is not null");
            return (Criteria) this;
        }

        public Criteria andInventornameEqualTo(String value) {
            addCriterion("InventorName =", value, "inventorname");
            return (Criteria) this;
        }

        public Criteria andInventornameNotEqualTo(String value) {
            addCriterion("InventorName <>", value, "inventorname");
            return (Criteria) this;
        }

        public Criteria andInventornameGreaterThan(String value) {
            addCriterion("InventorName >", value, "inventorname");
            return (Criteria) this;
        }

        public Criteria andInventornameGreaterThanOrEqualTo(String value) {
            addCriterion("InventorName >=", value, "inventorname");
            return (Criteria) this;
        }

        public Criteria andInventornameLessThan(String value) {
            addCriterion("InventorName <", value, "inventorname");
            return (Criteria) this;
        }

        public Criteria andInventornameLessThanOrEqualTo(String value) {
            addCriterion("InventorName <=", value, "inventorname");
            return (Criteria) this;
        }

        public Criteria andInventornameLike(String value) {
            addCriterion("InventorName like", value, "inventorname");
            return (Criteria) this;
        }

        public Criteria andInventornameNotLike(String value) {
            addCriterion("InventorName not like", value, "inventorname");
            return (Criteria) this;
        }

        public Criteria andInventornameIn(List<String> values) {
            addCriterion("InventorName in", values, "inventorname");
            return (Criteria) this;
        }

        public Criteria andInventornameNotIn(List<String> values) {
            addCriterion("InventorName not in", values, "inventorname");
            return (Criteria) this;
        }

        public Criteria andInventornameBetween(String value1, String value2) {
            addCriterion("InventorName between", value1, value2, "inventorname");
            return (Criteria) this;
        }

        public Criteria andInventornameNotBetween(String value1, String value2) {
            addCriterion("InventorName not between", value1, value2, "inventorname");
            return (Criteria) this;
        }

        public Criteria andRankingIsNull() {
            addCriterion("Ranking is null");
            return (Criteria) this;
        }

        public Criteria andRankingIsNotNull() {
            addCriterion("Ranking is not null");
            return (Criteria) this;
        }

        public Criteria andRankingEqualTo(Integer value) {
            addCriterion("Ranking =", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingNotEqualTo(Integer value) {
            addCriterion("Ranking <>", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingGreaterThan(Integer value) {
            addCriterion("Ranking >", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingGreaterThanOrEqualTo(Integer value) {
            addCriterion("Ranking >=", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingLessThan(Integer value) {
            addCriterion("Ranking <", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingLessThanOrEqualTo(Integer value) {
            addCriterion("Ranking <=", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingIn(List<Integer> values) {
            addCriterion("Ranking in", values, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingNotIn(List<Integer> values) {
            addCriterion("Ranking not in", values, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingBetween(Integer value1, Integer value2) {
            addCriterion("Ranking between", value1, value2, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingNotBetween(Integer value1, Integer value2) {
            addCriterion("Ranking not between", value1, value2, "ranking");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("Company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("Company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("Company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("Company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("Company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("Company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("Company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("Company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("Company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("Company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("Company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("Company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("Company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("Company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andApplicationidIsNull() {
            addCriterion("ApplicationID is null");
            return (Criteria) this;
        }

        public Criteria andApplicationidIsNotNull() {
            addCriterion("ApplicationID is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationidEqualTo(Integer value) {
            addCriterion("ApplicationID =", value, "applicationid");
            return (Criteria) this;
        }

        public Criteria andApplicationidNotEqualTo(Integer value) {
            addCriterion("ApplicationID <>", value, "applicationid");
            return (Criteria) this;
        }

        public Criteria andApplicationidGreaterThan(Integer value) {
            addCriterion("ApplicationID >", value, "applicationid");
            return (Criteria) this;
        }

        public Criteria andApplicationidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ApplicationID >=", value, "applicationid");
            return (Criteria) this;
        }

        public Criteria andApplicationidLessThan(Integer value) {
            addCriterion("ApplicationID <", value, "applicationid");
            return (Criteria) this;
        }

        public Criteria andApplicationidLessThanOrEqualTo(Integer value) {
            addCriterion("ApplicationID <=", value, "applicationid");
            return (Criteria) this;
        }

        public Criteria andApplicationidIn(List<Integer> values) {
            addCriterion("ApplicationID in", values, "applicationid");
            return (Criteria) this;
        }

        public Criteria andApplicationidNotIn(List<Integer> values) {
            addCriterion("ApplicationID not in", values, "applicationid");
            return (Criteria) this;
        }

        public Criteria andApplicationidBetween(Integer value1, Integer value2) {
            addCriterion("ApplicationID between", value1, value2, "applicationid");
            return (Criteria) this;
        }

        public Criteria andApplicationidNotBetween(Integer value1, Integer value2) {
            addCriterion("ApplicationID not between", value1, value2, "applicationid");
            return (Criteria) this;
        }

        public Criteria andContributerateIsNull() {
            addCriterion("ContributeRate is null");
            return (Criteria) this;
        }

        public Criteria andContributerateIsNotNull() {
            addCriterion("ContributeRate is not null");
            return (Criteria) this;
        }

        public Criteria andContributerateEqualTo(Double value) {
            addCriterion("ContributeRate =", value, "contributerate");
            return (Criteria) this;
        }

        public Criteria andContributerateNotEqualTo(Double value) {
            addCriterion("ContributeRate <>", value, "contributerate");
            return (Criteria) this;
        }

        public Criteria andContributerateGreaterThan(Double value) {
            addCriterion("ContributeRate >", value, "contributerate");
            return (Criteria) this;
        }

        public Criteria andContributerateGreaterThanOrEqualTo(Double value) {
            addCriterion("ContributeRate >=", value, "contributerate");
            return (Criteria) this;
        }

        public Criteria andContributerateLessThan(Double value) {
            addCriterion("ContributeRate <", value, "contributerate");
            return (Criteria) this;
        }

        public Criteria andContributerateLessThanOrEqualTo(Double value) {
            addCriterion("ContributeRate <=", value, "contributerate");
            return (Criteria) this;
        }

        public Criteria andContributerateIn(List<Double> values) {
            addCriterion("ContributeRate in", values, "contributerate");
            return (Criteria) this;
        }

        public Criteria andContributerateNotIn(List<Double> values) {
            addCriterion("ContributeRate not in", values, "contributerate");
            return (Criteria) this;
        }

        public Criteria andContributerateBetween(Double value1, Double value2) {
            addCriterion("ContributeRate between", value1, value2, "contributerate");
            return (Criteria) this;
        }

        public Criteria andContributerateNotBetween(Double value1, Double value2) {
            addCriterion("ContributeRate not between", value1, value2, "contributerate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}