package com.example.sciencemanager.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PatentMsgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatentMsgExample() {
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

        public Criteria andSerialnumIsNull() {
            addCriterion("SerialNum is null");
            return (Criteria) this;
        }

        public Criteria andSerialnumIsNotNull() {
            addCriterion("SerialNum is not null");
            return (Criteria) this;
        }

        public Criteria andSerialnumEqualTo(Integer value) {
            addCriterion("SerialNum =", value, "serialnum");
            return (Criteria) this;
        }

        public Criteria andSerialnumNotEqualTo(Integer value) {
            addCriterion("SerialNum <>", value, "serialnum");
            return (Criteria) this;
        }

        public Criteria andSerialnumGreaterThan(Integer value) {
            addCriterion("SerialNum >", value, "serialnum");
            return (Criteria) this;
        }

        public Criteria andSerialnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("SerialNum >=", value, "serialnum");
            return (Criteria) this;
        }

        public Criteria andSerialnumLessThan(Integer value) {
            addCriterion("SerialNum <", value, "serialnum");
            return (Criteria) this;
        }

        public Criteria andSerialnumLessThanOrEqualTo(Integer value) {
            addCriterion("SerialNum <=", value, "serialnum");
            return (Criteria) this;
        }

        public Criteria andSerialnumIn(List<Integer> values) {
            addCriterion("SerialNum in", values, "serialnum");
            return (Criteria) this;
        }

        public Criteria andSerialnumNotIn(List<Integer> values) {
            addCriterion("SerialNum not in", values, "serialnum");
            return (Criteria) this;
        }

        public Criteria andSerialnumBetween(Integer value1, Integer value2) {
            addCriterion("SerialNum between", value1, value2, "serialnum");
            return (Criteria) this;
        }

        public Criteria andSerialnumNotBetween(Integer value1, Integer value2) {
            addCriterion("SerialNum not between", value1, value2, "serialnum");
            return (Criteria) this;
        }

        public Criteria andApplicateidIsNull() {
            addCriterion("ApplicateID is null");
            return (Criteria) this;
        }

        public Criteria andApplicateidIsNotNull() {
            addCriterion("ApplicateID is not null");
            return (Criteria) this;
        }

        public Criteria andApplicateidEqualTo(Integer value) {
            addCriterion("ApplicateID =", value, "applicateid");
            return (Criteria) this;
        }

        public Criteria andApplicateidNotEqualTo(Integer value) {
            addCriterion("ApplicateID <>", value, "applicateid");
            return (Criteria) this;
        }

        public Criteria andApplicateidGreaterThan(Integer value) {
            addCriterion("ApplicateID >", value, "applicateid");
            return (Criteria) this;
        }

        public Criteria andApplicateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ApplicateID >=", value, "applicateid");
            return (Criteria) this;
        }

        public Criteria andApplicateidLessThan(Integer value) {
            addCriterion("ApplicateID <", value, "applicateid");
            return (Criteria) this;
        }

        public Criteria andApplicateidLessThanOrEqualTo(Integer value) {
            addCriterion("ApplicateID <=", value, "applicateid");
            return (Criteria) this;
        }

        public Criteria andApplicateidIn(List<Integer> values) {
            addCriterion("ApplicateID in", values, "applicateid");
            return (Criteria) this;
        }

        public Criteria andApplicateidNotIn(List<Integer> values) {
            addCriterion("ApplicateID not in", values, "applicateid");
            return (Criteria) this;
        }

        public Criteria andApplicateidBetween(Integer value1, Integer value2) {
            addCriterion("ApplicateID between", value1, value2, "applicateid");
            return (Criteria) this;
        }

        public Criteria andApplicateidNotBetween(Integer value1, Integer value2) {
            addCriterion("ApplicateID not between", value1, value2, "applicateid");
            return (Criteria) this;
        }

        public Criteria andPatentnameIsNull() {
            addCriterion("PatentName is null");
            return (Criteria) this;
        }

        public Criteria andPatentnameIsNotNull() {
            addCriterion("PatentName is not null");
            return (Criteria) this;
        }

        public Criteria andPatentnameEqualTo(String value) {
            addCriterion("PatentName =", value, "patentname");
            return (Criteria) this;
        }

        public Criteria andPatentnameNotEqualTo(String value) {
            addCriterion("PatentName <>", value, "patentname");
            return (Criteria) this;
        }

        public Criteria andPatentnameGreaterThan(String value) {
            addCriterion("PatentName >", value, "patentname");
            return (Criteria) this;
        }

        public Criteria andPatentnameGreaterThanOrEqualTo(String value) {
            addCriterion("PatentName >=", value, "patentname");
            return (Criteria) this;
        }

        public Criteria andPatentnameLessThan(String value) {
            addCriterion("PatentName <", value, "patentname");
            return (Criteria) this;
        }

        public Criteria andPatentnameLessThanOrEqualTo(String value) {
            addCriterion("PatentName <=", value, "patentname");
            return (Criteria) this;
        }

        public Criteria andPatentnameLike(String value) {
            addCriterion("PatentName like", value, "patentname");
            return (Criteria) this;
        }

        public Criteria andPatentnameNotLike(String value) {
            addCriterion("PatentName not like", value, "patentname");
            return (Criteria) this;
        }

        public Criteria andPatentnameIn(List<String> values) {
            addCriterion("PatentName in", values, "patentname");
            return (Criteria) this;
        }

        public Criteria andPatentnameNotIn(List<String> values) {
            addCriterion("PatentName not in", values, "patentname");
            return (Criteria) this;
        }

        public Criteria andPatentnameBetween(String value1, String value2) {
            addCriterion("PatentName between", value1, value2, "patentname");
            return (Criteria) this;
        }

        public Criteria andPatentnameNotBetween(String value1, String value2) {
            addCriterion("PatentName not between", value1, value2, "patentname");
            return (Criteria) this;
        }

        public Criteria andCollegeIsNull() {
            addCriterion("College is null");
            return (Criteria) this;
        }

        public Criteria andCollegeIsNotNull() {
            addCriterion("College is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeEqualTo(String value) {
            addCriterion("College =", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotEqualTo(String value) {
            addCriterion("College <>", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeGreaterThan(String value) {
            addCriterion("College >", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeGreaterThanOrEqualTo(String value) {
            addCriterion("College >=", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLessThan(String value) {
            addCriterion("College <", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLessThanOrEqualTo(String value) {
            addCriterion("College <=", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLike(String value) {
            addCriterion("College like", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotLike(String value) {
            addCriterion("College not like", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeIn(List<String> values) {
            addCriterion("College in", values, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotIn(List<String> values) {
            addCriterion("College not in", values, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeBetween(String value1, String value2) {
            addCriterion("College between", value1, value2, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotBetween(String value1, String value2) {
            addCriterion("College not between", value1, value2, "college");
            return (Criteria) this;
        }

        public Criteria andPatentkindIsNull() {
            addCriterion("PatentKind is null");
            return (Criteria) this;
        }

        public Criteria andPatentkindIsNotNull() {
            addCriterion("PatentKind is not null");
            return (Criteria) this;
        }

        public Criteria andPatentkindEqualTo(Integer value) {
            addCriterion("PatentKind =", value, "patentkind");
            return (Criteria) this;
        }

        public Criteria andPatentkindNotEqualTo(Integer value) {
            addCriterion("PatentKind <>", value, "patentkind");
            return (Criteria) this;
        }

        public Criteria andPatentkindGreaterThan(Integer value) {
            addCriterion("PatentKind >", value, "patentkind");
            return (Criteria) this;
        }

        public Criteria andPatentkindGreaterThanOrEqualTo(Integer value) {
            addCriterion("PatentKind >=", value, "patentkind");
            return (Criteria) this;
        }

        public Criteria andPatentkindLessThan(Integer value) {
            addCriterion("PatentKind <", value, "patentkind");
            return (Criteria) this;
        }

        public Criteria andPatentkindLessThanOrEqualTo(Integer value) {
            addCriterion("PatentKind <=", value, "patentkind");
            return (Criteria) this;
        }

        public Criteria andPatentkindIn(List<Integer> values) {
            addCriterion("PatentKind in", values, "patentkind");
            return (Criteria) this;
        }

        public Criteria andPatentkindNotIn(List<Integer> values) {
            addCriterion("PatentKind not in", values, "patentkind");
            return (Criteria) this;
        }

        public Criteria andPatentkindBetween(Integer value1, Integer value2) {
            addCriterion("PatentKind between", value1, value2, "patentkind");
            return (Criteria) this;
        }

        public Criteria andPatentkindNotBetween(Integer value1, Integer value2) {
            addCriterion("PatentKind not between", value1, value2, "patentkind");
            return (Criteria) this;
        }

        public Criteria andApplicatedateIsNull() {
            addCriterion("ApplicateDate is null");
            return (Criteria) this;
        }

        public Criteria andApplicatedateIsNotNull() {
            addCriterion("ApplicateDate is not null");
            return (Criteria) this;
        }

        public Criteria andApplicatedateEqualTo(Date value) {
            addCriterion("ApplicateDate =", value, "applicatedate");
            return (Criteria) this;
        }

        public Criteria andApplicatedateNotEqualTo(Date value) {
            addCriterion("ApplicateDate <>", value, "applicatedate");
            return (Criteria) this;
        }

        public Criteria andApplicatedateGreaterThan(Date value) {
            addCriterion("ApplicateDate >", value, "applicatedate");
            return (Criteria) this;
        }

        public Criteria andApplicatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("ApplicateDate >=", value, "applicatedate");
            return (Criteria) this;
        }

        public Criteria andApplicatedateLessThan(Date value) {
            addCriterion("ApplicateDate <", value, "applicatedate");
            return (Criteria) this;
        }

        public Criteria andApplicatedateLessThanOrEqualTo(Date value) {
            addCriterion("ApplicateDate <=", value, "applicatedate");
            return (Criteria) this;
        }

        public Criteria andApplicatedateIn(List<Date> values) {
            addCriterion("ApplicateDate in", values, "applicatedate");
            return (Criteria) this;
        }

        public Criteria andApplicatedateNotIn(List<Date> values) {
            addCriterion("ApplicateDate not in", values, "applicatedate");
            return (Criteria) this;
        }

        public Criteria andApplicatedateBetween(Date value1, Date value2) {
            addCriterion("ApplicateDate between", value1, value2, "applicatedate");
            return (Criteria) this;
        }

        public Criteria andApplicatedateNotBetween(Date value1, Date value2) {
            addCriterion("ApplicateDate not between", value1, value2, "applicatedate");
            return (Criteria) this;
        }

        public Criteria andIsdutypatentIsNull() {
            addCriterion("IsDutyPatent is null");
            return (Criteria) this;
        }

        public Criteria andIsdutypatentIsNotNull() {
            addCriterion("IsDutyPatent is not null");
            return (Criteria) this;
        }

        public Criteria andIsdutypatentEqualTo(Integer value) {
            addCriterion("IsDutyPatent =", value, "isdutypatent");
            return (Criteria) this;
        }

        public Criteria andIsdutypatentNotEqualTo(Integer value) {
            addCriterion("IsDutyPatent <>", value, "isdutypatent");
            return (Criteria) this;
        }

        public Criteria andIsdutypatentGreaterThan(Integer value) {
            addCriterion("IsDutyPatent >", value, "isdutypatent");
            return (Criteria) this;
        }

        public Criteria andIsdutypatentGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsDutyPatent >=", value, "isdutypatent");
            return (Criteria) this;
        }

        public Criteria andIsdutypatentLessThan(Integer value) {
            addCriterion("IsDutyPatent <", value, "isdutypatent");
            return (Criteria) this;
        }

        public Criteria andIsdutypatentLessThanOrEqualTo(Integer value) {
            addCriterion("IsDutyPatent <=", value, "isdutypatent");
            return (Criteria) this;
        }

        public Criteria andIsdutypatentIn(List<Integer> values) {
            addCriterion("IsDutyPatent in", values, "isdutypatent");
            return (Criteria) this;
        }

        public Criteria andIsdutypatentNotIn(List<Integer> values) {
            addCriterion("IsDutyPatent not in", values, "isdutypatent");
            return (Criteria) this;
        }

        public Criteria andIsdutypatentBetween(Integer value1, Integer value2) {
            addCriterion("IsDutyPatent between", value1, value2, "isdutypatent");
            return (Criteria) this;
        }

        public Criteria andIsdutypatentNotBetween(Integer value1, Integer value2) {
            addCriterion("IsDutyPatent not between", value1, value2, "isdutypatent");
            return (Criteria) this;
        }

        public Criteria andInventorIsNull() {
            addCriterion("Inventor is null");
            return (Criteria) this;
        }

        public Criteria andInventorIsNotNull() {
            addCriterion("Inventor is not null");
            return (Criteria) this;
        }

        public Criteria andInventorEqualTo(String value) {
            addCriterion("Inventor =", value, "inventor");
            return (Criteria) this;
        }

        public Criteria andInventorNotEqualTo(String value) {
            addCriterion("Inventor <>", value, "inventor");
            return (Criteria) this;
        }

        public Criteria andInventorGreaterThan(String value) {
            addCriterion("Inventor >", value, "inventor");
            return (Criteria) this;
        }

        public Criteria andInventorGreaterThanOrEqualTo(String value) {
            addCriterion("Inventor >=", value, "inventor");
            return (Criteria) this;
        }

        public Criteria andInventorLessThan(String value) {
            addCriterion("Inventor <", value, "inventor");
            return (Criteria) this;
        }

        public Criteria andInventorLessThanOrEqualTo(String value) {
            addCriterion("Inventor <=", value, "inventor");
            return (Criteria) this;
        }

        public Criteria andInventorLike(String value) {
            addCriterion("Inventor like", value, "inventor");
            return (Criteria) this;
        }

        public Criteria andInventorNotLike(String value) {
            addCriterion("Inventor not like", value, "inventor");
            return (Criteria) this;
        }

        public Criteria andInventorIn(List<String> values) {
            addCriterion("Inventor in", values, "inventor");
            return (Criteria) this;
        }

        public Criteria andInventorNotIn(List<String> values) {
            addCriterion("Inventor not in", values, "inventor");
            return (Criteria) this;
        }

        public Criteria andInventorBetween(String value1, String value2) {
            addCriterion("Inventor between", value1, value2, "inventor");
            return (Criteria) this;
        }

        public Criteria andInventorNotBetween(String value1, String value2) {
            addCriterion("Inventor not between", value1, value2, "inventor");
            return (Criteria) this;
        }

        public Criteria andRemakeIsNull() {
            addCriterion("Remake is null");
            return (Criteria) this;
        }

        public Criteria andRemakeIsNotNull() {
            addCriterion("Remake is not null");
            return (Criteria) this;
        }

        public Criteria andRemakeEqualTo(String value) {
            addCriterion("Remake =", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeNotEqualTo(String value) {
            addCriterion("Remake <>", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeGreaterThan(String value) {
            addCriterion("Remake >", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeGreaterThanOrEqualTo(String value) {
            addCriterion("Remake >=", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeLessThan(String value) {
            addCriterion("Remake <", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeLessThanOrEqualTo(String value) {
            addCriterion("Remake <=", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeLike(String value) {
            addCriterion("Remake like", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeNotLike(String value) {
            addCriterion("Remake not like", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeIn(List<String> values) {
            addCriterion("Remake in", values, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeNotIn(List<String> values) {
            addCriterion("Remake not in", values, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeBetween(String value1, String value2) {
            addCriterion("Remake between", value1, value2, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeNotBetween(String value1, String value2) {
            addCriterion("Remake not between", value1, value2, "remake");
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