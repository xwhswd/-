package com.example.sciencemanager.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ThesisExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ThesisExample() {
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

        public Criteria andThesisidIsNull() {
            addCriterion("ThesisID is null");
            return (Criteria) this;
        }

        public Criteria andThesisidIsNotNull() {
            addCriterion("ThesisID is not null");
            return (Criteria) this;
        }

        public Criteria andThesisidEqualTo(Integer value) {
            addCriterion("ThesisID =", value, "thesisid");
            return (Criteria) this;
        }

        public Criteria andThesisidNotEqualTo(Integer value) {
            addCriterion("ThesisID <>", value, "thesisid");
            return (Criteria) this;
        }

        public Criteria andThesisidGreaterThan(Integer value) {
            addCriterion("ThesisID >", value, "thesisid");
            return (Criteria) this;
        }

        public Criteria andThesisidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ThesisID >=", value, "thesisid");
            return (Criteria) this;
        }

        public Criteria andThesisidLessThan(Integer value) {
            addCriterion("ThesisID <", value, "thesisid");
            return (Criteria) this;
        }

        public Criteria andThesisidLessThanOrEqualTo(Integer value) {
            addCriterion("ThesisID <=", value, "thesisid");
            return (Criteria) this;
        }

        public Criteria andThesisidIn(List<Integer> values) {
            addCriterion("ThesisID in", values, "thesisid");
            return (Criteria) this;
        }

        public Criteria andThesisidNotIn(List<Integer> values) {
            addCriterion("ThesisID not in", values, "thesisid");
            return (Criteria) this;
        }

        public Criteria andThesisidBetween(Integer value1, Integer value2) {
            addCriterion("ThesisID between", value1, value2, "thesisid");
            return (Criteria) this;
        }

        public Criteria andThesisidNotBetween(Integer value1, Integer value2) {
            addCriterion("ThesisID not between", value1, value2, "thesisid");
            return (Criteria) this;
        }

        public Criteria andThesisnameIsNull() {
            addCriterion("ThesisName is null");
            return (Criteria) this;
        }

        public Criteria andThesisnameIsNotNull() {
            addCriterion("ThesisName is not null");
            return (Criteria) this;
        }

        public Criteria andThesisnameEqualTo(String value) {
            addCriterion("ThesisName =", value, "thesisname");
            return (Criteria) this;
        }

        public Criteria andThesisnameNotEqualTo(String value) {
            addCriterion("ThesisName <>", value, "thesisname");
            return (Criteria) this;
        }

        public Criteria andThesisnameGreaterThan(String value) {
            addCriterion("ThesisName >", value, "thesisname");
            return (Criteria) this;
        }

        public Criteria andThesisnameGreaterThanOrEqualTo(String value) {
            addCriterion("ThesisName >=", value, "thesisname");
            return (Criteria) this;
        }

        public Criteria andThesisnameLessThan(String value) {
            addCriterion("ThesisName <", value, "thesisname");
            return (Criteria) this;
        }

        public Criteria andThesisnameLessThanOrEqualTo(String value) {
            addCriterion("ThesisName <=", value, "thesisname");
            return (Criteria) this;
        }

        public Criteria andThesisnameLike(String value) {
            addCriterion("ThesisName like", value, "thesisname");
            return (Criteria) this;
        }

        public Criteria andThesisnameNotLike(String value) {
            addCriterion("ThesisName not like", value, "thesisname");
            return (Criteria) this;
        }

        public Criteria andThesisnameIn(List<String> values) {
            addCriterion("ThesisName in", values, "thesisname");
            return (Criteria) this;
        }

        public Criteria andThesisnameNotIn(List<String> values) {
            addCriterion("ThesisName not in", values, "thesisname");
            return (Criteria) this;
        }

        public Criteria andThesisnameBetween(String value1, String value2) {
            addCriterion("ThesisName between", value1, value2, "thesisname");
            return (Criteria) this;
        }

        public Criteria andThesisnameNotBetween(String value1, String value2) {
            addCriterion("ThesisName not between", value1, value2, "thesisname");
            return (Criteria) this;
        }

        public Criteria andFirstwriterIsNull() {
            addCriterion("FirstWriter is null");
            return (Criteria) this;
        }

        public Criteria andFirstwriterIsNotNull() {
            addCriterion("FirstWriter is not null");
            return (Criteria) this;
        }

        public Criteria andFirstwriterEqualTo(String value) {
            addCriterion("FirstWriter =", value, "firstwriter");
            return (Criteria) this;
        }

        public Criteria andFirstwriterNotEqualTo(String value) {
            addCriterion("FirstWriter <>", value, "firstwriter");
            return (Criteria) this;
        }

        public Criteria andFirstwriterGreaterThan(String value) {
            addCriterion("FirstWriter >", value, "firstwriter");
            return (Criteria) this;
        }

        public Criteria andFirstwriterGreaterThanOrEqualTo(String value) {
            addCriterion("FirstWriter >=", value, "firstwriter");
            return (Criteria) this;
        }

        public Criteria andFirstwriterLessThan(String value) {
            addCriterion("FirstWriter <", value, "firstwriter");
            return (Criteria) this;
        }

        public Criteria andFirstwriterLessThanOrEqualTo(String value) {
            addCriterion("FirstWriter <=", value, "firstwriter");
            return (Criteria) this;
        }

        public Criteria andFirstwriterLike(String value) {
            addCriterion("FirstWriter like", value, "firstwriter");
            return (Criteria) this;
        }

        public Criteria andFirstwriterNotLike(String value) {
            addCriterion("FirstWriter not like", value, "firstwriter");
            return (Criteria) this;
        }

        public Criteria andFirstwriterIn(List<String> values) {
            addCriterion("FirstWriter in", values, "firstwriter");
            return (Criteria) this;
        }

        public Criteria andFirstwriterNotIn(List<String> values) {
            addCriterion("FirstWriter not in", values, "firstwriter");
            return (Criteria) this;
        }

        public Criteria andFirstwriterBetween(String value1, String value2) {
            addCriterion("FirstWriter between", value1, value2, "firstwriter");
            return (Criteria) this;
        }

        public Criteria andFirstwriterNotBetween(String value1, String value2) {
            addCriterion("FirstWriter not between", value1, value2, "firstwriter");
            return (Criteria) this;
        }

        public Criteria andSecondwriterIsNull() {
            addCriterion("SecondWriter is null");
            return (Criteria) this;
        }

        public Criteria andSecondwriterIsNotNull() {
            addCriterion("SecondWriter is not null");
            return (Criteria) this;
        }

        public Criteria andSecondwriterEqualTo(String value) {
            addCriterion("SecondWriter =", value, "secondwriter");
            return (Criteria) this;
        }

        public Criteria andSecondwriterNotEqualTo(String value) {
            addCriterion("SecondWriter <>", value, "secondwriter");
            return (Criteria) this;
        }

        public Criteria andSecondwriterGreaterThan(String value) {
            addCriterion("SecondWriter >", value, "secondwriter");
            return (Criteria) this;
        }

        public Criteria andSecondwriterGreaterThanOrEqualTo(String value) {
            addCriterion("SecondWriter >=", value, "secondwriter");
            return (Criteria) this;
        }

        public Criteria andSecondwriterLessThan(String value) {
            addCriterion("SecondWriter <", value, "secondwriter");
            return (Criteria) this;
        }

        public Criteria andSecondwriterLessThanOrEqualTo(String value) {
            addCriterion("SecondWriter <=", value, "secondwriter");
            return (Criteria) this;
        }

        public Criteria andSecondwriterLike(String value) {
            addCriterion("SecondWriter like", value, "secondwriter");
            return (Criteria) this;
        }

        public Criteria andSecondwriterNotLike(String value) {
            addCriterion("SecondWriter not like", value, "secondwriter");
            return (Criteria) this;
        }

        public Criteria andSecondwriterIn(List<String> values) {
            addCriterion("SecondWriter in", values, "secondwriter");
            return (Criteria) this;
        }

        public Criteria andSecondwriterNotIn(List<String> values) {
            addCriterion("SecondWriter not in", values, "secondwriter");
            return (Criteria) this;
        }

        public Criteria andSecondwriterBetween(String value1, String value2) {
            addCriterion("SecondWriter between", value1, value2, "secondwriter");
            return (Criteria) this;
        }

        public Criteria andSecondwriterNotBetween(String value1, String value2) {
            addCriterion("SecondWriter not between", value1, value2, "secondwriter");
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

        public Criteria andIsinbookIsNull() {
            addCriterion("isInBook is null");
            return (Criteria) this;
        }

        public Criteria andIsinbookIsNotNull() {
            addCriterion("isInBook is not null");
            return (Criteria) this;
        }

        public Criteria andIsinbookEqualTo(Integer value) {
            addCriterion("isInBook =", value, "isinbook");
            return (Criteria) this;
        }

        public Criteria andIsinbookNotEqualTo(Integer value) {
            addCriterion("isInBook <>", value, "isinbook");
            return (Criteria) this;
        }

        public Criteria andIsinbookGreaterThan(Integer value) {
            addCriterion("isInBook >", value, "isinbook");
            return (Criteria) this;
        }

        public Criteria andIsinbookGreaterThanOrEqualTo(Integer value) {
            addCriterion("isInBook >=", value, "isinbook");
            return (Criteria) this;
        }

        public Criteria andIsinbookLessThan(Integer value) {
            addCriterion("isInBook <", value, "isinbook");
            return (Criteria) this;
        }

        public Criteria andIsinbookLessThanOrEqualTo(Integer value) {
            addCriterion("isInBook <=", value, "isinbook");
            return (Criteria) this;
        }

        public Criteria andIsinbookIn(List<Integer> values) {
            addCriterion("isInBook in", values, "isinbook");
            return (Criteria) this;
        }

        public Criteria andIsinbookNotIn(List<Integer> values) {
            addCriterion("isInBook not in", values, "isinbook");
            return (Criteria) this;
        }

        public Criteria andIsinbookBetween(Integer value1, Integer value2) {
            addCriterion("isInBook between", value1, value2, "isinbook");
            return (Criteria) this;
        }

        public Criteria andIsinbookNotBetween(Integer value1, Integer value2) {
            addCriterion("isInBook not between", value1, value2, "isinbook");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("Remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("Remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("Remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("Remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("Remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("Remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("Remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("Remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("Remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("Remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("Remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("Remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("Remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andPublicationnameIsNull() {
            addCriterion("PublicationName is null");
            return (Criteria) this;
        }

        public Criteria andPublicationnameIsNotNull() {
            addCriterion("PublicationName is not null");
            return (Criteria) this;
        }

        public Criteria andPublicationnameEqualTo(String value) {
            addCriterion("PublicationName =", value, "publicationname");
            return (Criteria) this;
        }

        public Criteria andPublicationnameNotEqualTo(String value) {
            addCriterion("PublicationName <>", value, "publicationname");
            return (Criteria) this;
        }

        public Criteria andPublicationnameGreaterThan(String value) {
            addCriterion("PublicationName >", value, "publicationname");
            return (Criteria) this;
        }

        public Criteria andPublicationnameGreaterThanOrEqualTo(String value) {
            addCriterion("PublicationName >=", value, "publicationname");
            return (Criteria) this;
        }

        public Criteria andPublicationnameLessThan(String value) {
            addCriterion("PublicationName <", value, "publicationname");
            return (Criteria) this;
        }

        public Criteria andPublicationnameLessThanOrEqualTo(String value) {
            addCriterion("PublicationName <=", value, "publicationname");
            return (Criteria) this;
        }

        public Criteria andPublicationnameLike(String value) {
            addCriterion("PublicationName like", value, "publicationname");
            return (Criteria) this;
        }

        public Criteria andPublicationnameNotLike(String value) {
            addCriterion("PublicationName not like", value, "publicationname");
            return (Criteria) this;
        }

        public Criteria andPublicationnameIn(List<String> values) {
            addCriterion("PublicationName in", values, "publicationname");
            return (Criteria) this;
        }

        public Criteria andPublicationnameNotIn(List<String> values) {
            addCriterion("PublicationName not in", values, "publicationname");
            return (Criteria) this;
        }

        public Criteria andPublicationnameBetween(String value1, String value2) {
            addCriterion("PublicationName between", value1, value2, "publicationname");
            return (Criteria) this;
        }

        public Criteria andPublicationnameNotBetween(String value1, String value2) {
            addCriterion("PublicationName not between", value1, value2, "publicationname");
            return (Criteria) this;
        }

        public Criteria andReelnumIsNull() {
            addCriterion("ReelNum is null");
            return (Criteria) this;
        }

        public Criteria andReelnumIsNotNull() {
            addCriterion("ReelNum is not null");
            return (Criteria) this;
        }

        public Criteria andReelnumEqualTo(Integer value) {
            addCriterion("ReelNum =", value, "reelnum");
            return (Criteria) this;
        }

        public Criteria andReelnumNotEqualTo(Integer value) {
            addCriterion("ReelNum <>", value, "reelnum");
            return (Criteria) this;
        }

        public Criteria andReelnumGreaterThan(Integer value) {
            addCriterion("ReelNum >", value, "reelnum");
            return (Criteria) this;
        }

        public Criteria andReelnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ReelNum >=", value, "reelnum");
            return (Criteria) this;
        }

        public Criteria andReelnumLessThan(Integer value) {
            addCriterion("ReelNum <", value, "reelnum");
            return (Criteria) this;
        }

        public Criteria andReelnumLessThanOrEqualTo(Integer value) {
            addCriterion("ReelNum <=", value, "reelnum");
            return (Criteria) this;
        }

        public Criteria andReelnumIn(List<Integer> values) {
            addCriterion("ReelNum in", values, "reelnum");
            return (Criteria) this;
        }

        public Criteria andReelnumNotIn(List<Integer> values) {
            addCriterion("ReelNum not in", values, "reelnum");
            return (Criteria) this;
        }

        public Criteria andReelnumBetween(Integer value1, Integer value2) {
            addCriterion("ReelNum between", value1, value2, "reelnum");
            return (Criteria) this;
        }

        public Criteria andReelnumNotBetween(Integer value1, Integer value2) {
            addCriterion("ReelNum not between", value1, value2, "reelnum");
            return (Criteria) this;
        }

        public Criteria andPagerangeIsNull() {
            addCriterion("PageRange is null");
            return (Criteria) this;
        }

        public Criteria andPagerangeIsNotNull() {
            addCriterion("PageRange is not null");
            return (Criteria) this;
        }

        public Criteria andPagerangeEqualTo(String value) {
            addCriterion("PageRange =", value, "pagerange");
            return (Criteria) this;
        }

        public Criteria andPagerangeNotEqualTo(String value) {
            addCriterion("PageRange <>", value, "pagerange");
            return (Criteria) this;
        }

        public Criteria andPagerangeGreaterThan(String value) {
            addCriterion("PageRange >", value, "pagerange");
            return (Criteria) this;
        }

        public Criteria andPagerangeGreaterThanOrEqualTo(String value) {
            addCriterion("PageRange >=", value, "pagerange");
            return (Criteria) this;
        }

        public Criteria andPagerangeLessThan(String value) {
            addCriterion("PageRange <", value, "pagerange");
            return (Criteria) this;
        }

        public Criteria andPagerangeLessThanOrEqualTo(String value) {
            addCriterion("PageRange <=", value, "pagerange");
            return (Criteria) this;
        }

        public Criteria andPagerangeLike(String value) {
            addCriterion("PageRange like", value, "pagerange");
            return (Criteria) this;
        }

        public Criteria andPagerangeNotLike(String value) {
            addCriterion("PageRange not like", value, "pagerange");
            return (Criteria) this;
        }

        public Criteria andPagerangeIn(List<String> values) {
            addCriterion("PageRange in", values, "pagerange");
            return (Criteria) this;
        }

        public Criteria andPagerangeNotIn(List<String> values) {
            addCriterion("PageRange not in", values, "pagerange");
            return (Criteria) this;
        }

        public Criteria andPagerangeBetween(String value1, String value2) {
            addCriterion("PageRange between", value1, value2, "pagerange");
            return (Criteria) this;
        }

        public Criteria andPagerangeNotBetween(String value1, String value2) {
            addCriterion("PageRange not between", value1, value2, "pagerange");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("Date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("Date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("Date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("Date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("Date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("Date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("Date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("Date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("Date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("Date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("Date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("Date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andIssueIsNull() {
            addCriterion("Issue is null");
            return (Criteria) this;
        }

        public Criteria andIssueIsNotNull() {
            addCriterion("Issue is not null");
            return (Criteria) this;
        }

        public Criteria andIssueEqualTo(Integer value) {
            addCriterion("Issue =", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotEqualTo(Integer value) {
            addCriterion("Issue <>", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueGreaterThan(Integer value) {
            addCriterion("Issue >", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueGreaterThanOrEqualTo(Integer value) {
            addCriterion("Issue >=", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueLessThan(Integer value) {
            addCriterion("Issue <", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueLessThanOrEqualTo(Integer value) {
            addCriterion("Issue <=", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueIn(List<Integer> values) {
            addCriterion("Issue in", values, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotIn(List<Integer> values) {
            addCriterion("Issue not in", values, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueBetween(Integer value1, Integer value2) {
            addCriterion("Issue between", value1, value2, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotBetween(Integer value1, Integer value2) {
            addCriterion("Issue not between", value1, value2, "issue");
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

        public Criteria andRetrievalkindIsNull() {
            addCriterion("RetrievalKind is null");
            return (Criteria) this;
        }

        public Criteria andRetrievalkindIsNotNull() {
            addCriterion("RetrievalKind is not null");
            return (Criteria) this;
        }

        public Criteria andRetrievalkindEqualTo(String value) {
            addCriterion("RetrievalKind =", value, "retrievalkind");
            return (Criteria) this;
        }

        public Criteria andRetrievalkindNotEqualTo(String value) {
            addCriterion("RetrievalKind <>", value, "retrievalkind");
            return (Criteria) this;
        }

        public Criteria andRetrievalkindGreaterThan(String value) {
            addCriterion("RetrievalKind >", value, "retrievalkind");
            return (Criteria) this;
        }

        public Criteria andRetrievalkindGreaterThanOrEqualTo(String value) {
            addCriterion("RetrievalKind >=", value, "retrievalkind");
            return (Criteria) this;
        }

        public Criteria andRetrievalkindLessThan(String value) {
            addCriterion("RetrievalKind <", value, "retrievalkind");
            return (Criteria) this;
        }

        public Criteria andRetrievalkindLessThanOrEqualTo(String value) {
            addCriterion("RetrievalKind <=", value, "retrievalkind");
            return (Criteria) this;
        }

        public Criteria andRetrievalkindLike(String value) {
            addCriterion("RetrievalKind like", value, "retrievalkind");
            return (Criteria) this;
        }

        public Criteria andRetrievalkindNotLike(String value) {
            addCriterion("RetrievalKind not like", value, "retrievalkind");
            return (Criteria) this;
        }

        public Criteria andRetrievalkindIn(List<String> values) {
            addCriterion("RetrievalKind in", values, "retrievalkind");
            return (Criteria) this;
        }

        public Criteria andRetrievalkindNotIn(List<String> values) {
            addCriterion("RetrievalKind not in", values, "retrievalkind");
            return (Criteria) this;
        }

        public Criteria andRetrievalkindBetween(String value1, String value2) {
            addCriterion("RetrievalKind between", value1, value2, "retrievalkind");
            return (Criteria) this;
        }

        public Criteria andRetrievalkindNotBetween(String value1, String value2) {
            addCriterion("RetrievalKind not between", value1, value2, "retrievalkind");
            return (Criteria) this;
        }

        public Criteria andRetrievalidIsNull() {
            addCriterion("RetrievalID is null");
            return (Criteria) this;
        }

        public Criteria andRetrievalidIsNotNull() {
            addCriterion("RetrievalID is not null");
            return (Criteria) this;
        }

        public Criteria andRetrievalidEqualTo(Integer value) {
            addCriterion("RetrievalID =", value, "retrievalid");
            return (Criteria) this;
        }

        public Criteria andRetrievalidNotEqualTo(Integer value) {
            addCriterion("RetrievalID <>", value, "retrievalid");
            return (Criteria) this;
        }

        public Criteria andRetrievalidGreaterThan(Integer value) {
            addCriterion("RetrievalID >", value, "retrievalid");
            return (Criteria) this;
        }

        public Criteria andRetrievalidGreaterThanOrEqualTo(Integer value) {
            addCriterion("RetrievalID >=", value, "retrievalid");
            return (Criteria) this;
        }

        public Criteria andRetrievalidLessThan(Integer value) {
            addCriterion("RetrievalID <", value, "retrievalid");
            return (Criteria) this;
        }

        public Criteria andRetrievalidLessThanOrEqualTo(Integer value) {
            addCriterion("RetrievalID <=", value, "retrievalid");
            return (Criteria) this;
        }

        public Criteria andRetrievalidIn(List<Integer> values) {
            addCriterion("RetrievalID in", values, "retrievalid");
            return (Criteria) this;
        }

        public Criteria andRetrievalidNotIn(List<Integer> values) {
            addCriterion("RetrievalID not in", values, "retrievalid");
            return (Criteria) this;
        }

        public Criteria andRetrievalidBetween(Integer value1, Integer value2) {
            addCriterion("RetrievalID between", value1, value2, "retrievalid");
            return (Criteria) this;
        }

        public Criteria andRetrievalidNotBetween(Integer value1, Integer value2) {
            addCriterion("RetrievalID not between", value1, value2, "retrievalid");
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