package com.example.sciencemanager.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andStudentidIsNull() {
            addCriterion("StudentID is null");
            return (Criteria) this;
        }

        public Criteria andStudentidIsNotNull() {
            addCriterion("StudentID is not null");
            return (Criteria) this;
        }

        public Criteria andStudentidEqualTo(Integer value) {
            addCriterion("StudentID =", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotEqualTo(Integer value) {
            addCriterion("StudentID <>", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThan(Integer value) {
            addCriterion("StudentID >", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("StudentID >=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThan(Integer value) {
            addCriterion("StudentID <", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThanOrEqualTo(Integer value) {
            addCriterion("StudentID <=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidIn(List<Integer> values) {
            addCriterion("StudentID in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotIn(List<Integer> values) {
            addCriterion("StudentID not in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidBetween(Integer value1, Integer value2) {
            addCriterion("StudentID between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotBetween(Integer value1, Integer value2) {
            addCriterion("StudentID not between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentnameIsNull() {
            addCriterion("StudentName is null");
            return (Criteria) this;
        }

        public Criteria andStudentnameIsNotNull() {
            addCriterion("StudentName is not null");
            return (Criteria) this;
        }

        public Criteria andStudentnameEqualTo(String value) {
            addCriterion("StudentName =", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotEqualTo(String value) {
            addCriterion("StudentName <>", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameGreaterThan(String value) {
            addCriterion("StudentName >", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameGreaterThanOrEqualTo(String value) {
            addCriterion("StudentName >=", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLessThan(String value) {
            addCriterion("StudentName <", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLessThanOrEqualTo(String value) {
            addCriterion("StudentName <=", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLike(String value) {
            addCriterion("StudentName like", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotLike(String value) {
            addCriterion("StudentName not like", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameIn(List<String> values) {
            addCriterion("StudentName in", values, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotIn(List<String> values) {
            addCriterion("StudentName not in", values, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameBetween(String value1, String value2) {
            addCriterion("StudentName between", value1, value2, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotBetween(String value1, String value2) {
            addCriterion("StudentName not between", value1, value2, "studentname");
            return (Criteria) this;
        }

        public Criteria andTeachernameIsNull() {
            addCriterion("TeacherName is null");
            return (Criteria) this;
        }

        public Criteria andTeachernameIsNotNull() {
            addCriterion("TeacherName is not null");
            return (Criteria) this;
        }

        public Criteria andTeachernameEqualTo(String value) {
            addCriterion("TeacherName =", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotEqualTo(String value) {
            addCriterion("TeacherName <>", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameGreaterThan(String value) {
            addCriterion("TeacherName >", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameGreaterThanOrEqualTo(String value) {
            addCriterion("TeacherName >=", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLessThan(String value) {
            addCriterion("TeacherName <", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLessThanOrEqualTo(String value) {
            addCriterion("TeacherName <=", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLike(String value) {
            addCriterion("TeacherName like", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotLike(String value) {
            addCriterion("TeacherName not like", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameIn(List<String> values) {
            addCriterion("TeacherName in", values, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotIn(List<String> values) {
            addCriterion("TeacherName not in", values, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameBetween(String value1, String value2) {
            addCriterion("TeacherName between", value1, value2, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotBetween(String value1, String value2) {
            addCriterion("TeacherName not between", value1, value2, "teachername");
            return (Criteria) this;
        }

        public Criteria andTrainingexpenditureamountIsNull() {
            addCriterion("TrainingExpenditureAmount is null");
            return (Criteria) this;
        }

        public Criteria andTrainingexpenditureamountIsNotNull() {
            addCriterion("TrainingExpenditureAmount is not null");
            return (Criteria) this;
        }

        public Criteria andTrainingexpenditureamountEqualTo(Integer value) {
            addCriterion("TrainingExpenditureAmount =", value, "trainingexpenditureamount");
            return (Criteria) this;
        }

        public Criteria andTrainingexpenditureamountNotEqualTo(Integer value) {
            addCriterion("TrainingExpenditureAmount <>", value, "trainingexpenditureamount");
            return (Criteria) this;
        }

        public Criteria andTrainingexpenditureamountGreaterThan(Integer value) {
            addCriterion("TrainingExpenditureAmount >", value, "trainingexpenditureamount");
            return (Criteria) this;
        }

        public Criteria andTrainingexpenditureamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("TrainingExpenditureAmount >=", value, "trainingexpenditureamount");
            return (Criteria) this;
        }

        public Criteria andTrainingexpenditureamountLessThan(Integer value) {
            addCriterion("TrainingExpenditureAmount <", value, "trainingexpenditureamount");
            return (Criteria) this;
        }

        public Criteria andTrainingexpenditureamountLessThanOrEqualTo(Integer value) {
            addCriterion("TrainingExpenditureAmount <=", value, "trainingexpenditureamount");
            return (Criteria) this;
        }

        public Criteria andTrainingexpenditureamountIn(List<Integer> values) {
            addCriterion("TrainingExpenditureAmount in", values, "trainingexpenditureamount");
            return (Criteria) this;
        }

        public Criteria andTrainingexpenditureamountNotIn(List<Integer> values) {
            addCriterion("TrainingExpenditureAmount not in", values, "trainingexpenditureamount");
            return (Criteria) this;
        }

        public Criteria andTrainingexpenditureamountBetween(Integer value1, Integer value2) {
            addCriterion("TrainingExpenditureAmount between", value1, value2, "trainingexpenditureamount");
            return (Criteria) this;
        }

        public Criteria andTrainingexpenditureamountNotBetween(Integer value1, Integer value2) {
            addCriterion("TrainingExpenditureAmount not between", value1, value2, "trainingexpenditureamount");
            return (Criteria) this;
        }

        public Criteria andExpendituretimeIsNull() {
            addCriterion("ExpenditureTime is null");
            return (Criteria) this;
        }

        public Criteria andExpendituretimeIsNotNull() {
            addCriterion("ExpenditureTime is not null");
            return (Criteria) this;
        }

        public Criteria andExpendituretimeEqualTo(Date value) {
            addCriterion("ExpenditureTime =", value, "expendituretime");
            return (Criteria) this;
        }

        public Criteria andExpendituretimeNotEqualTo(Date value) {
            addCriterion("ExpenditureTime <>", value, "expendituretime");
            return (Criteria) this;
        }

        public Criteria andExpendituretimeGreaterThan(Date value) {
            addCriterion("ExpenditureTime >", value, "expendituretime");
            return (Criteria) this;
        }

        public Criteria andExpendituretimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ExpenditureTime >=", value, "expendituretime");
            return (Criteria) this;
        }

        public Criteria andExpendituretimeLessThan(Date value) {
            addCriterion("ExpenditureTime <", value, "expendituretime");
            return (Criteria) this;
        }

        public Criteria andExpendituretimeLessThanOrEqualTo(Date value) {
            addCriterion("ExpenditureTime <=", value, "expendituretime");
            return (Criteria) this;
        }

        public Criteria andExpendituretimeIn(List<Date> values) {
            addCriterion("ExpenditureTime in", values, "expendituretime");
            return (Criteria) this;
        }

        public Criteria andExpendituretimeNotIn(List<Date> values) {
            addCriterion("ExpenditureTime not in", values, "expendituretime");
            return (Criteria) this;
        }

        public Criteria andExpendituretimeBetween(Date value1, Date value2) {
            addCriterion("ExpenditureTime between", value1, value2, "expendituretime");
            return (Criteria) this;
        }

        public Criteria andExpendituretimeNotBetween(Date value1, Date value2) {
            addCriterion("ExpenditureTime not between", value1, value2, "expendituretime");
            return (Criteria) this;
        }

        public Criteria andExpenditureIsNull() {
            addCriterion("Expenditure is null");
            return (Criteria) this;
        }

        public Criteria andExpenditureIsNotNull() {
            addCriterion("Expenditure is not null");
            return (Criteria) this;
        }

        public Criteria andExpenditureEqualTo(Integer value) {
            addCriterion("Expenditure =", value, "expenditure");
            return (Criteria) this;
        }

        public Criteria andExpenditureNotEqualTo(Integer value) {
            addCriterion("Expenditure <>", value, "expenditure");
            return (Criteria) this;
        }

        public Criteria andExpenditureGreaterThan(Integer value) {
            addCriterion("Expenditure >", value, "expenditure");
            return (Criteria) this;
        }

        public Criteria andExpenditureGreaterThanOrEqualTo(Integer value) {
            addCriterion("Expenditure >=", value, "expenditure");
            return (Criteria) this;
        }

        public Criteria andExpenditureLessThan(Integer value) {
            addCriterion("Expenditure <", value, "expenditure");
            return (Criteria) this;
        }

        public Criteria andExpenditureLessThanOrEqualTo(Integer value) {
            addCriterion("Expenditure <=", value, "expenditure");
            return (Criteria) this;
        }

        public Criteria andExpenditureIn(List<Integer> values) {
            addCriterion("Expenditure in", values, "expenditure");
            return (Criteria) this;
        }

        public Criteria andExpenditureNotIn(List<Integer> values) {
            addCriterion("Expenditure not in", values, "expenditure");
            return (Criteria) this;
        }

        public Criteria andExpenditureBetween(Integer value1, Integer value2) {
            addCriterion("Expenditure between", value1, value2, "expenditure");
            return (Criteria) this;
        }

        public Criteria andExpenditureNotBetween(Integer value1, Integer value2) {
            addCriterion("Expenditure not between", value1, value2, "expenditure");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("Balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("Balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(Integer value) {
            addCriterion("Balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(Integer value) {
            addCriterion("Balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(Integer value) {
            addCriterion("Balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("Balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(Integer value) {
            addCriterion("Balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(Integer value) {
            addCriterion("Balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<Integer> values) {
            addCriterion("Balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<Integer> values) {
            addCriterion("Balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(Integer value1, Integer value2) {
            addCriterion("Balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(Integer value1, Integer value2) {
            addCriterion("Balance not between", value1, value2, "balance");
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