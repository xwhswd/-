package com.example.sciencemanager.bean;

import java.util.ArrayList;
import java.util.List;

public class TrainingProgramExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrainingProgramExample() {
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

        public Criteria andSubjectkindIsNull() {
            addCriterion("SubjectKind is null");
            return (Criteria) this;
        }

        public Criteria andSubjectkindIsNotNull() {
            addCriterion("SubjectKind is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectkindEqualTo(String value) {
            addCriterion("SubjectKind =", value, "subjectkind");
            return (Criteria) this;
        }

        public Criteria andSubjectkindNotEqualTo(String value) {
            addCriterion("SubjectKind <>", value, "subjectkind");
            return (Criteria) this;
        }

        public Criteria andSubjectkindGreaterThan(String value) {
            addCriterion("SubjectKind >", value, "subjectkind");
            return (Criteria) this;
        }

        public Criteria andSubjectkindGreaterThanOrEqualTo(String value) {
            addCriterion("SubjectKind >=", value, "subjectkind");
            return (Criteria) this;
        }

        public Criteria andSubjectkindLessThan(String value) {
            addCriterion("SubjectKind <", value, "subjectkind");
            return (Criteria) this;
        }

        public Criteria andSubjectkindLessThanOrEqualTo(String value) {
            addCriterion("SubjectKind <=", value, "subjectkind");
            return (Criteria) this;
        }

        public Criteria andSubjectkindLike(String value) {
            addCriterion("SubjectKind like", value, "subjectkind");
            return (Criteria) this;
        }

        public Criteria andSubjectkindNotLike(String value) {
            addCriterion("SubjectKind not like", value, "subjectkind");
            return (Criteria) this;
        }

        public Criteria andSubjectkindIn(List<String> values) {
            addCriterion("SubjectKind in", values, "subjectkind");
            return (Criteria) this;
        }

        public Criteria andSubjectkindNotIn(List<String> values) {
            addCriterion("SubjectKind not in", values, "subjectkind");
            return (Criteria) this;
        }

        public Criteria andSubjectkindBetween(String value1, String value2) {
            addCriterion("SubjectKind between", value1, value2, "subjectkind");
            return (Criteria) this;
        }

        public Criteria andSubjectkindNotBetween(String value1, String value2) {
            addCriterion("SubjectKind not between", value1, value2, "subjectkind");
            return (Criteria) this;
        }

        public Criteria andSubjectidIsNull() {
            addCriterion("SubjectID is null");
            return (Criteria) this;
        }

        public Criteria andSubjectidIsNotNull() {
            addCriterion("SubjectID is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectidEqualTo(Integer value) {
            addCriterion("SubjectID =", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidNotEqualTo(Integer value) {
            addCriterion("SubjectID <>", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidGreaterThan(Integer value) {
            addCriterion("SubjectID >", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SubjectID >=", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidLessThan(Integer value) {
            addCriterion("SubjectID <", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidLessThanOrEqualTo(Integer value) {
            addCriterion("SubjectID <=", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidIn(List<Integer> values) {
            addCriterion("SubjectID in", values, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidNotIn(List<Integer> values) {
            addCriterion("SubjectID not in", values, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidBetween(Integer value1, Integer value2) {
            addCriterion("SubjectID between", value1, value2, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("SubjectID not between", value1, value2, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectnameIsNull() {
            addCriterion("SubjectName is null");
            return (Criteria) this;
        }

        public Criteria andSubjectnameIsNotNull() {
            addCriterion("SubjectName is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectnameEqualTo(String value) {
            addCriterion("SubjectName =", value, "subjectname");
            return (Criteria) this;
        }

        public Criteria andSubjectnameNotEqualTo(String value) {
            addCriterion("SubjectName <>", value, "subjectname");
            return (Criteria) this;
        }

        public Criteria andSubjectnameGreaterThan(String value) {
            addCriterion("SubjectName >", value, "subjectname");
            return (Criteria) this;
        }

        public Criteria andSubjectnameGreaterThanOrEqualTo(String value) {
            addCriterion("SubjectName >=", value, "subjectname");
            return (Criteria) this;
        }

        public Criteria andSubjectnameLessThan(String value) {
            addCriterion("SubjectName <", value, "subjectname");
            return (Criteria) this;
        }

        public Criteria andSubjectnameLessThanOrEqualTo(String value) {
            addCriterion("SubjectName <=", value, "subjectname");
            return (Criteria) this;
        }

        public Criteria andSubjectnameLike(String value) {
            addCriterion("SubjectName like", value, "subjectname");
            return (Criteria) this;
        }

        public Criteria andSubjectnameNotLike(String value) {
            addCriterion("SubjectName not like", value, "subjectname");
            return (Criteria) this;
        }

        public Criteria andSubjectnameIn(List<String> values) {
            addCriterion("SubjectName in", values, "subjectname");
            return (Criteria) this;
        }

        public Criteria andSubjectnameNotIn(List<String> values) {
            addCriterion("SubjectName not in", values, "subjectname");
            return (Criteria) this;
        }

        public Criteria andSubjectnameBetween(String value1, String value2) {
            addCriterion("SubjectName between", value1, value2, "subjectname");
            return (Criteria) this;
        }

        public Criteria andSubjectnameNotBetween(String value1, String value2) {
            addCriterion("SubjectName not between", value1, value2, "subjectname");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNull() {
            addCriterion("Period is null");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNotNull() {
            addCriterion("Period is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodEqualTo(Integer value) {
            addCriterion("Period =", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotEqualTo(Integer value) {
            addCriterion("Period <>", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThan(Integer value) {
            addCriterion("Period >", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("Period >=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThan(Integer value) {
            addCriterion("Period <", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("Period <=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodIn(List<Integer> values) {
            addCriterion("Period in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotIn(List<Integer> values) {
            addCriterion("Period not in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodBetween(Integer value1, Integer value2) {
            addCriterion("Period between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("Period not between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andCreditIsNull() {
            addCriterion("Credit is null");
            return (Criteria) this;
        }

        public Criteria andCreditIsNotNull() {
            addCriterion("Credit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditEqualTo(Integer value) {
            addCriterion("Credit =", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotEqualTo(Integer value) {
            addCriterion("Credit <>", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThan(Integer value) {
            addCriterion("Credit >", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThanOrEqualTo(Integer value) {
            addCriterion("Credit >=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThan(Integer value) {
            addCriterion("Credit <", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThanOrEqualTo(Integer value) {
            addCriterion("Credit <=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditIn(List<Integer> values) {
            addCriterion("Credit in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotIn(List<Integer> values) {
            addCriterion("Credit not in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditBetween(Integer value1, Integer value2) {
            addCriterion("Credit between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotBetween(Integer value1, Integer value2) {
            addCriterion("Credit not between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andSubjecttermIsNull() {
            addCriterion("SubjectTerm is null");
            return (Criteria) this;
        }

        public Criteria andSubjecttermIsNotNull() {
            addCriterion("SubjectTerm is not null");
            return (Criteria) this;
        }

        public Criteria andSubjecttermEqualTo(String value) {
            addCriterion("SubjectTerm =", value, "subjectterm");
            return (Criteria) this;
        }

        public Criteria andSubjecttermNotEqualTo(String value) {
            addCriterion("SubjectTerm <>", value, "subjectterm");
            return (Criteria) this;
        }

        public Criteria andSubjecttermGreaterThan(String value) {
            addCriterion("SubjectTerm >", value, "subjectterm");
            return (Criteria) this;
        }

        public Criteria andSubjecttermGreaterThanOrEqualTo(String value) {
            addCriterion("SubjectTerm >=", value, "subjectterm");
            return (Criteria) this;
        }

        public Criteria andSubjecttermLessThan(String value) {
            addCriterion("SubjectTerm <", value, "subjectterm");
            return (Criteria) this;
        }

        public Criteria andSubjecttermLessThanOrEqualTo(String value) {
            addCriterion("SubjectTerm <=", value, "subjectterm");
            return (Criteria) this;
        }

        public Criteria andSubjecttermLike(String value) {
            addCriterion("SubjectTerm like", value, "subjectterm");
            return (Criteria) this;
        }

        public Criteria andSubjecttermNotLike(String value) {
            addCriterion("SubjectTerm not like", value, "subjectterm");
            return (Criteria) this;
        }

        public Criteria andSubjecttermIn(List<String> values) {
            addCriterion("SubjectTerm in", values, "subjectterm");
            return (Criteria) this;
        }

        public Criteria andSubjecttermNotIn(List<String> values) {
            addCriterion("SubjectTerm not in", values, "subjectterm");
            return (Criteria) this;
        }

        public Criteria andSubjecttermBetween(String value1, String value2) {
            addCriterion("SubjectTerm between", value1, value2, "subjectterm");
            return (Criteria) this;
        }

        public Criteria andSubjecttermNotBetween(String value1, String value2) {
            addCriterion("SubjectTerm not between", value1, value2, "subjectterm");
            return (Criteria) this;
        }

        public Criteria andMethodofexaminationIsNull() {
            addCriterion("MethodOfExamination is null");
            return (Criteria) this;
        }

        public Criteria andMethodofexaminationIsNotNull() {
            addCriterion("MethodOfExamination is not null");
            return (Criteria) this;
        }

        public Criteria andMethodofexaminationEqualTo(String value) {
            addCriterion("MethodOfExamination =", value, "methodofexamination");
            return (Criteria) this;
        }

        public Criteria andMethodofexaminationNotEqualTo(String value) {
            addCriterion("MethodOfExamination <>", value, "methodofexamination");
            return (Criteria) this;
        }

        public Criteria andMethodofexaminationGreaterThan(String value) {
            addCriterion("MethodOfExamination >", value, "methodofexamination");
            return (Criteria) this;
        }

        public Criteria andMethodofexaminationGreaterThanOrEqualTo(String value) {
            addCriterion("MethodOfExamination >=", value, "methodofexamination");
            return (Criteria) this;
        }

        public Criteria andMethodofexaminationLessThan(String value) {
            addCriterion("MethodOfExamination <", value, "methodofexamination");
            return (Criteria) this;
        }

        public Criteria andMethodofexaminationLessThanOrEqualTo(String value) {
            addCriterion("MethodOfExamination <=", value, "methodofexamination");
            return (Criteria) this;
        }

        public Criteria andMethodofexaminationLike(String value) {
            addCriterion("MethodOfExamination like", value, "methodofexamination");
            return (Criteria) this;
        }

        public Criteria andMethodofexaminationNotLike(String value) {
            addCriterion("MethodOfExamination not like", value, "methodofexamination");
            return (Criteria) this;
        }

        public Criteria andMethodofexaminationIn(List<String> values) {
            addCriterion("MethodOfExamination in", values, "methodofexamination");
            return (Criteria) this;
        }

        public Criteria andMethodofexaminationNotIn(List<String> values) {
            addCriterion("MethodOfExamination not in", values, "methodofexamination");
            return (Criteria) this;
        }

        public Criteria andMethodofexaminationBetween(String value1, String value2) {
            addCriterion("MethodOfExamination between", value1, value2, "methodofexamination");
            return (Criteria) this;
        }

        public Criteria andMethodofexaminationNotBetween(String value1, String value2) {
            addCriterion("MethodOfExamination not between", value1, value2, "methodofexamination");
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