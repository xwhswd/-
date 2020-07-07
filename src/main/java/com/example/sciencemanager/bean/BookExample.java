package com.example.sciencemanager.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookExample() {
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

        public Criteria andBookidIsNull() {
            addCriterion("BookID is null");
            return (Criteria) this;
        }

        public Criteria andBookidIsNotNull() {
            addCriterion("BookID is not null");
            return (Criteria) this;
        }

        public Criteria andBookidEqualTo(Integer value) {
            addCriterion("BookID =", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotEqualTo(Integer value) {
            addCriterion("BookID <>", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidGreaterThan(Integer value) {
            addCriterion("BookID >", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BookID >=", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidLessThan(Integer value) {
            addCriterion("BookID <", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidLessThanOrEqualTo(Integer value) {
            addCriterion("BookID <=", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidIn(List<Integer> values) {
            addCriterion("BookID in", values, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotIn(List<Integer> values) {
            addCriterion("BookID not in", values, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidBetween(Integer value1, Integer value2) {
            addCriterion("BookID between", value1, value2, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotBetween(Integer value1, Integer value2) {
            addCriterion("BookID not between", value1, value2, "bookid");
            return (Criteria) this;
        }

        public Criteria andBooknameIsNull() {
            addCriterion("BookName is null");
            return (Criteria) this;
        }

        public Criteria andBooknameIsNotNull() {
            addCriterion("BookName is not null");
            return (Criteria) this;
        }

        public Criteria andBooknameEqualTo(String value) {
            addCriterion("BookName =", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotEqualTo(String value) {
            addCriterion("BookName <>", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameGreaterThan(String value) {
            addCriterion("BookName >", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameGreaterThanOrEqualTo(String value) {
            addCriterion("BookName >=", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameLessThan(String value) {
            addCriterion("BookName <", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameLessThanOrEqualTo(String value) {
            addCriterion("BookName <=", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameLike(String value) {
            addCriterion("BookName like", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotLike(String value) {
            addCriterion("BookName not like", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameIn(List<String> values) {
            addCriterion("BookName in", values, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotIn(List<String> values) {
            addCriterion("BookName not in", values, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameBetween(String value1, String value2) {
            addCriterion("BookName between", value1, value2, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotBetween(String value1, String value2) {
            addCriterion("BookName not between", value1, value2, "bookname");
            return (Criteria) this;
        }

        public Criteria andEditornameIsNull() {
            addCriterion("EditorName is null");
            return (Criteria) this;
        }

        public Criteria andEditornameIsNotNull() {
            addCriterion("EditorName is not null");
            return (Criteria) this;
        }

        public Criteria andEditornameEqualTo(String value) {
            addCriterion("EditorName =", value, "editorname");
            return (Criteria) this;
        }

        public Criteria andEditornameNotEqualTo(String value) {
            addCriterion("EditorName <>", value, "editorname");
            return (Criteria) this;
        }

        public Criteria andEditornameGreaterThan(String value) {
            addCriterion("EditorName >", value, "editorname");
            return (Criteria) this;
        }

        public Criteria andEditornameGreaterThanOrEqualTo(String value) {
            addCriterion("EditorName >=", value, "editorname");
            return (Criteria) this;
        }

        public Criteria andEditornameLessThan(String value) {
            addCriterion("EditorName <", value, "editorname");
            return (Criteria) this;
        }

        public Criteria andEditornameLessThanOrEqualTo(String value) {
            addCriterion("EditorName <=", value, "editorname");
            return (Criteria) this;
        }

        public Criteria andEditornameLike(String value) {
            addCriterion("EditorName like", value, "editorname");
            return (Criteria) this;
        }

        public Criteria andEditornameNotLike(String value) {
            addCriterion("EditorName not like", value, "editorname");
            return (Criteria) this;
        }

        public Criteria andEditornameIn(List<String> values) {
            addCriterion("EditorName in", values, "editorname");
            return (Criteria) this;
        }

        public Criteria andEditornameNotIn(List<String> values) {
            addCriterion("EditorName not in", values, "editorname");
            return (Criteria) this;
        }

        public Criteria andEditornameBetween(String value1, String value2) {
            addCriterion("EditorName between", value1, value2, "editorname");
            return (Criteria) this;
        }

        public Criteria andEditornameNotBetween(String value1, String value2) {
            addCriterion("EditorName not between", value1, value2, "editorname");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("Position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("Position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("Position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("Position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("Position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("Position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("Position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("Position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("Position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("Position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("Position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("Position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("Position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("Position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPublishcompanyIsNull() {
            addCriterion("PublishCompany is null");
            return (Criteria) this;
        }

        public Criteria andPublishcompanyIsNotNull() {
            addCriterion("PublishCompany is not null");
            return (Criteria) this;
        }

        public Criteria andPublishcompanyEqualTo(String value) {
            addCriterion("PublishCompany =", value, "publishcompany");
            return (Criteria) this;
        }

        public Criteria andPublishcompanyNotEqualTo(String value) {
            addCriterion("PublishCompany <>", value, "publishcompany");
            return (Criteria) this;
        }

        public Criteria andPublishcompanyGreaterThan(String value) {
            addCriterion("PublishCompany >", value, "publishcompany");
            return (Criteria) this;
        }

        public Criteria andPublishcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("PublishCompany >=", value, "publishcompany");
            return (Criteria) this;
        }

        public Criteria andPublishcompanyLessThan(String value) {
            addCriterion("PublishCompany <", value, "publishcompany");
            return (Criteria) this;
        }

        public Criteria andPublishcompanyLessThanOrEqualTo(String value) {
            addCriterion("PublishCompany <=", value, "publishcompany");
            return (Criteria) this;
        }

        public Criteria andPublishcompanyLike(String value) {
            addCriterion("PublishCompany like", value, "publishcompany");
            return (Criteria) this;
        }

        public Criteria andPublishcompanyNotLike(String value) {
            addCriterion("PublishCompany not like", value, "publishcompany");
            return (Criteria) this;
        }

        public Criteria andPublishcompanyIn(List<String> values) {
            addCriterion("PublishCompany in", values, "publishcompany");
            return (Criteria) this;
        }

        public Criteria andPublishcompanyNotIn(List<String> values) {
            addCriterion("PublishCompany not in", values, "publishcompany");
            return (Criteria) this;
        }

        public Criteria andPublishcompanyBetween(String value1, String value2) {
            addCriterion("PublishCompany between", value1, value2, "publishcompany");
            return (Criteria) this;
        }

        public Criteria andPublishcompanyNotBetween(String value1, String value2) {
            addCriterion("PublishCompany not between", value1, value2, "publishcompany");
            return (Criteria) this;
        }

        public Criteria andPubilshdateIsNull() {
            addCriterion("PubilshDate is null");
            return (Criteria) this;
        }

        public Criteria andPubilshdateIsNotNull() {
            addCriterion("PubilshDate is not null");
            return (Criteria) this;
        }

        public Criteria andPubilshdateEqualTo(Date value) {
            addCriterion("PubilshDate =", value, "pubilshdate");
            return (Criteria) this;
        }

        public Criteria andPubilshdateNotEqualTo(Date value) {
            addCriterion("PubilshDate <>", value, "pubilshdate");
            return (Criteria) this;
        }

        public Criteria andPubilshdateGreaterThan(Date value) {
            addCriterion("PubilshDate >", value, "pubilshdate");
            return (Criteria) this;
        }

        public Criteria andPubilshdateGreaterThanOrEqualTo(Date value) {
            addCriterion("PubilshDate >=", value, "pubilshdate");
            return (Criteria) this;
        }

        public Criteria andPubilshdateLessThan(Date value) {
            addCriterion("PubilshDate <", value, "pubilshdate");
            return (Criteria) this;
        }

        public Criteria andPubilshdateLessThanOrEqualTo(Date value) {
            addCriterion("PubilshDate <=", value, "pubilshdate");
            return (Criteria) this;
        }

        public Criteria andPubilshdateIn(List<Date> values) {
            addCriterion("PubilshDate in", values, "pubilshdate");
            return (Criteria) this;
        }

        public Criteria andPubilshdateNotIn(List<Date> values) {
            addCriterion("PubilshDate not in", values, "pubilshdate");
            return (Criteria) this;
        }

        public Criteria andPubilshdateBetween(Date value1, Date value2) {
            addCriterion("PubilshDate between", value1, value2, "pubilshdate");
            return (Criteria) this;
        }

        public Criteria andPubilshdateNotBetween(Date value1, Date value2) {
            addCriterion("PubilshDate not between", value1, value2, "pubilshdate");
            return (Criteria) this;
        }

        public Criteria andAllwordcountIsNull() {
            addCriterion("AllWordCount is null");
            return (Criteria) this;
        }

        public Criteria andAllwordcountIsNotNull() {
            addCriterion("AllWordCount is not null");
            return (Criteria) this;
        }

        public Criteria andAllwordcountEqualTo(Integer value) {
            addCriterion("AllWordCount =", value, "allwordcount");
            return (Criteria) this;
        }

        public Criteria andAllwordcountNotEqualTo(Integer value) {
            addCriterion("AllWordCount <>", value, "allwordcount");
            return (Criteria) this;
        }

        public Criteria andAllwordcountGreaterThan(Integer value) {
            addCriterion("AllWordCount >", value, "allwordcount");
            return (Criteria) this;
        }

        public Criteria andAllwordcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("AllWordCount >=", value, "allwordcount");
            return (Criteria) this;
        }

        public Criteria andAllwordcountLessThan(Integer value) {
            addCriterion("AllWordCount <", value, "allwordcount");
            return (Criteria) this;
        }

        public Criteria andAllwordcountLessThanOrEqualTo(Integer value) {
            addCriterion("AllWordCount <=", value, "allwordcount");
            return (Criteria) this;
        }

        public Criteria andAllwordcountIn(List<Integer> values) {
            addCriterion("AllWordCount in", values, "allwordcount");
            return (Criteria) this;
        }

        public Criteria andAllwordcountNotIn(List<Integer> values) {
            addCriterion("AllWordCount not in", values, "allwordcount");
            return (Criteria) this;
        }

        public Criteria andAllwordcountBetween(Integer value1, Integer value2) {
            addCriterion("AllWordCount between", value1, value2, "allwordcount");
            return (Criteria) this;
        }

        public Criteria andAllwordcountNotBetween(Integer value1, Integer value2) {
            addCriterion("AllWordCount not between", value1, value2, "allwordcount");
            return (Criteria) this;
        }

        public Criteria andWordcountIsNull() {
            addCriterion("WordCount is null");
            return (Criteria) this;
        }

        public Criteria andWordcountIsNotNull() {
            addCriterion("WordCount is not null");
            return (Criteria) this;
        }

        public Criteria andWordcountEqualTo(Integer value) {
            addCriterion("WordCount =", value, "wordcount");
            return (Criteria) this;
        }

        public Criteria andWordcountNotEqualTo(Integer value) {
            addCriterion("WordCount <>", value, "wordcount");
            return (Criteria) this;
        }

        public Criteria andWordcountGreaterThan(Integer value) {
            addCriterion("WordCount >", value, "wordcount");
            return (Criteria) this;
        }

        public Criteria andWordcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("WordCount >=", value, "wordcount");
            return (Criteria) this;
        }

        public Criteria andWordcountLessThan(Integer value) {
            addCriterion("WordCount <", value, "wordcount");
            return (Criteria) this;
        }

        public Criteria andWordcountLessThanOrEqualTo(Integer value) {
            addCriterion("WordCount <=", value, "wordcount");
            return (Criteria) this;
        }

        public Criteria andWordcountIn(List<Integer> values) {
            addCriterion("WordCount in", values, "wordcount");
            return (Criteria) this;
        }

        public Criteria andWordcountNotIn(List<Integer> values) {
            addCriterion("WordCount not in", values, "wordcount");
            return (Criteria) this;
        }

        public Criteria andWordcountBetween(Integer value1, Integer value2) {
            addCriterion("WordCount between", value1, value2, "wordcount");
            return (Criteria) this;
        }

        public Criteria andWordcountNotBetween(Integer value1, Integer value2) {
            addCriterion("WordCount not between", value1, value2, "wordcount");
            return (Criteria) this;
        }

        public Criteria andPublishversionIsNull() {
            addCriterion("PublishVersion is null");
            return (Criteria) this;
        }

        public Criteria andPublishversionIsNotNull() {
            addCriterion("PublishVersion is not null");
            return (Criteria) this;
        }

        public Criteria andPublishversionEqualTo(String value) {
            addCriterion("PublishVersion =", value, "publishversion");
            return (Criteria) this;
        }

        public Criteria andPublishversionNotEqualTo(String value) {
            addCriterion("PublishVersion <>", value, "publishversion");
            return (Criteria) this;
        }

        public Criteria andPublishversionGreaterThan(String value) {
            addCriterion("PublishVersion >", value, "publishversion");
            return (Criteria) this;
        }

        public Criteria andPublishversionGreaterThanOrEqualTo(String value) {
            addCriterion("PublishVersion >=", value, "publishversion");
            return (Criteria) this;
        }

        public Criteria andPublishversionLessThan(String value) {
            addCriterion("PublishVersion <", value, "publishversion");
            return (Criteria) this;
        }

        public Criteria andPublishversionLessThanOrEqualTo(String value) {
            addCriterion("PublishVersion <=", value, "publishversion");
            return (Criteria) this;
        }

        public Criteria andPublishversionLike(String value) {
            addCriterion("PublishVersion like", value, "publishversion");
            return (Criteria) this;
        }

        public Criteria andPublishversionNotLike(String value) {
            addCriterion("PublishVersion not like", value, "publishversion");
            return (Criteria) this;
        }

        public Criteria andPublishversionIn(List<String> values) {
            addCriterion("PublishVersion in", values, "publishversion");
            return (Criteria) this;
        }

        public Criteria andPublishversionNotIn(List<String> values) {
            addCriterion("PublishVersion not in", values, "publishversion");
            return (Criteria) this;
        }

        public Criteria andPublishversionBetween(String value1, String value2) {
            addCriterion("PublishVersion between", value1, value2, "publishversion");
            return (Criteria) this;
        }

        public Criteria andPublishversionNotBetween(String value1, String value2) {
            addCriterion("PublishVersion not between", value1, value2, "publishversion");
            return (Criteria) this;
        }

        public Criteria andIsexpenditureIsNull() {
            addCriterion("IsExpenditure is null");
            return (Criteria) this;
        }

        public Criteria andIsexpenditureIsNotNull() {
            addCriterion("IsExpenditure is not null");
            return (Criteria) this;
        }

        public Criteria andIsexpenditureEqualTo(Integer value) {
            addCriterion("IsExpenditure =", value, "isexpenditure");
            return (Criteria) this;
        }

        public Criteria andIsexpenditureNotEqualTo(Integer value) {
            addCriterion("IsExpenditure <>", value, "isexpenditure");
            return (Criteria) this;
        }

        public Criteria andIsexpenditureGreaterThan(Integer value) {
            addCriterion("IsExpenditure >", value, "isexpenditure");
            return (Criteria) this;
        }

        public Criteria andIsexpenditureGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsExpenditure >=", value, "isexpenditure");
            return (Criteria) this;
        }

        public Criteria andIsexpenditureLessThan(Integer value) {
            addCriterion("IsExpenditure <", value, "isexpenditure");
            return (Criteria) this;
        }

        public Criteria andIsexpenditureLessThanOrEqualTo(Integer value) {
            addCriterion("IsExpenditure <=", value, "isexpenditure");
            return (Criteria) this;
        }

        public Criteria andIsexpenditureIn(List<Integer> values) {
            addCriterion("IsExpenditure in", values, "isexpenditure");
            return (Criteria) this;
        }

        public Criteria andIsexpenditureNotIn(List<Integer> values) {
            addCriterion("IsExpenditure not in", values, "isexpenditure");
            return (Criteria) this;
        }

        public Criteria andIsexpenditureBetween(Integer value1, Integer value2) {
            addCriterion("IsExpenditure between", value1, value2, "isexpenditure");
            return (Criteria) this;
        }

        public Criteria andIsexpenditureNotBetween(Integer value1, Integer value2) {
            addCriterion("IsExpenditure not between", value1, value2, "isexpenditure");
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

        public Criteria andPubilshquantityIsNull() {
            addCriterion("PubilshQuantity is null");
            return (Criteria) this;
        }

        public Criteria andPubilshquantityIsNotNull() {
            addCriterion("PubilshQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andPubilshquantityEqualTo(Integer value) {
            addCriterion("PubilshQuantity =", value, "pubilshquantity");
            return (Criteria) this;
        }

        public Criteria andPubilshquantityNotEqualTo(Integer value) {
            addCriterion("PubilshQuantity <>", value, "pubilshquantity");
            return (Criteria) this;
        }

        public Criteria andPubilshquantityGreaterThan(Integer value) {
            addCriterion("PubilshQuantity >", value, "pubilshquantity");
            return (Criteria) this;
        }

        public Criteria andPubilshquantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("PubilshQuantity >=", value, "pubilshquantity");
            return (Criteria) this;
        }

        public Criteria andPubilshquantityLessThan(Integer value) {
            addCriterion("PubilshQuantity <", value, "pubilshquantity");
            return (Criteria) this;
        }

        public Criteria andPubilshquantityLessThanOrEqualTo(Integer value) {
            addCriterion("PubilshQuantity <=", value, "pubilshquantity");
            return (Criteria) this;
        }

        public Criteria andPubilshquantityIn(List<Integer> values) {
            addCriterion("PubilshQuantity in", values, "pubilshquantity");
            return (Criteria) this;
        }

        public Criteria andPubilshquantityNotIn(List<Integer> values) {
            addCriterion("PubilshQuantity not in", values, "pubilshquantity");
            return (Criteria) this;
        }

        public Criteria andPubilshquantityBetween(Integer value1, Integer value2) {
            addCriterion("PubilshQuantity between", value1, value2, "pubilshquantity");
            return (Criteria) this;
        }

        public Criteria andPubilshquantityNotBetween(Integer value1, Integer value2) {
            addCriterion("PubilshQuantity not between", value1, value2, "pubilshquantity");
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