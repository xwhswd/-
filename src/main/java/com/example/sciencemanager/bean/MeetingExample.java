package com.example.sciencemanager.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MeetingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MeetingExample() {
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

        public Criteria andParticipantnameIsNull() {
            addCriterion("ParticipantName is null");
            return (Criteria) this;
        }

        public Criteria andParticipantnameIsNotNull() {
            addCriterion("ParticipantName is not null");
            return (Criteria) this;
        }

        public Criteria andParticipantnameEqualTo(String value) {
            addCriterion("ParticipantName =", value, "participantname");
            return (Criteria) this;
        }

        public Criteria andParticipantnameNotEqualTo(String value) {
            addCriterion("ParticipantName <>", value, "participantname");
            return (Criteria) this;
        }

        public Criteria andParticipantnameGreaterThan(String value) {
            addCriterion("ParticipantName >", value, "participantname");
            return (Criteria) this;
        }

        public Criteria andParticipantnameGreaterThanOrEqualTo(String value) {
            addCriterion("ParticipantName >=", value, "participantname");
            return (Criteria) this;
        }

        public Criteria andParticipantnameLessThan(String value) {
            addCriterion("ParticipantName <", value, "participantname");
            return (Criteria) this;
        }

        public Criteria andParticipantnameLessThanOrEqualTo(String value) {
            addCriterion("ParticipantName <=", value, "participantname");
            return (Criteria) this;
        }

        public Criteria andParticipantnameLike(String value) {
            addCriterion("ParticipantName like", value, "participantname");
            return (Criteria) this;
        }

        public Criteria andParticipantnameNotLike(String value) {
            addCriterion("ParticipantName not like", value, "participantname");
            return (Criteria) this;
        }

        public Criteria andParticipantnameIn(List<String> values) {
            addCriterion("ParticipantName in", values, "participantname");
            return (Criteria) this;
        }

        public Criteria andParticipantnameNotIn(List<String> values) {
            addCriterion("ParticipantName not in", values, "participantname");
            return (Criteria) this;
        }

        public Criteria andParticipantnameBetween(String value1, String value2) {
            addCriterion("ParticipantName between", value1, value2, "participantname");
            return (Criteria) this;
        }

        public Criteria andParticipantnameNotBetween(String value1, String value2) {
            addCriterion("ParticipantName not between", value1, value2, "participantname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameIsNull() {
            addCriterion("MeetingName is null");
            return (Criteria) this;
        }

        public Criteria andMeetingnameIsNotNull() {
            addCriterion("MeetingName is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingnameEqualTo(String value) {
            addCriterion("MeetingName =", value, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameNotEqualTo(String value) {
            addCriterion("MeetingName <>", value, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameGreaterThan(String value) {
            addCriterion("MeetingName >", value, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameGreaterThanOrEqualTo(String value) {
            addCriterion("MeetingName >=", value, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameLessThan(String value) {
            addCriterion("MeetingName <", value, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameLessThanOrEqualTo(String value) {
            addCriterion("MeetingName <=", value, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameLike(String value) {
            addCriterion("MeetingName like", value, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameNotLike(String value) {
            addCriterion("MeetingName not like", value, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameIn(List<String> values) {
            addCriterion("MeetingName in", values, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameNotIn(List<String> values) {
            addCriterion("MeetingName not in", values, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameBetween(String value1, String value2) {
            addCriterion("MeetingName between", value1, value2, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameNotBetween(String value1, String value2) {
            addCriterion("MeetingName not between", value1, value2, "meetingname");
            return (Criteria) this;
        }

        public Criteria andSponsorIsNull() {
            addCriterion("Sponsor is null");
            return (Criteria) this;
        }

        public Criteria andSponsorIsNotNull() {
            addCriterion("Sponsor is not null");
            return (Criteria) this;
        }

        public Criteria andSponsorEqualTo(String value) {
            addCriterion("Sponsor =", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorNotEqualTo(String value) {
            addCriterion("Sponsor <>", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorGreaterThan(String value) {
            addCriterion("Sponsor >", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorGreaterThanOrEqualTo(String value) {
            addCriterion("Sponsor >=", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorLessThan(String value) {
            addCriterion("Sponsor <", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorLessThanOrEqualTo(String value) {
            addCriterion("Sponsor <=", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorLike(String value) {
            addCriterion("Sponsor like", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorNotLike(String value) {
            addCriterion("Sponsor not like", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorIn(List<String> values) {
            addCriterion("Sponsor in", values, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorNotIn(List<String> values) {
            addCriterion("Sponsor not in", values, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorBetween(String value1, String value2) {
            addCriterion("Sponsor between", value1, value2, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorNotBetween(String value1, String value2) {
            addCriterion("Sponsor not between", value1, value2, "sponsor");
            return (Criteria) this;
        }

        public Criteria andMeetingkindIsNull() {
            addCriterion("MeetingKind is null");
            return (Criteria) this;
        }

        public Criteria andMeetingkindIsNotNull() {
            addCriterion("MeetingKind is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingkindEqualTo(Integer value) {
            addCriterion("MeetingKind =", value, "meetingkind");
            return (Criteria) this;
        }

        public Criteria andMeetingkindNotEqualTo(Integer value) {
            addCriterion("MeetingKind <>", value, "meetingkind");
            return (Criteria) this;
        }

        public Criteria andMeetingkindGreaterThan(Integer value) {
            addCriterion("MeetingKind >", value, "meetingkind");
            return (Criteria) this;
        }

        public Criteria andMeetingkindGreaterThanOrEqualTo(Integer value) {
            addCriterion("MeetingKind >=", value, "meetingkind");
            return (Criteria) this;
        }

        public Criteria andMeetingkindLessThan(Integer value) {
            addCriterion("MeetingKind <", value, "meetingkind");
            return (Criteria) this;
        }

        public Criteria andMeetingkindLessThanOrEqualTo(Integer value) {
            addCriterion("MeetingKind <=", value, "meetingkind");
            return (Criteria) this;
        }

        public Criteria andMeetingkindIn(List<Integer> values) {
            addCriterion("MeetingKind in", values, "meetingkind");
            return (Criteria) this;
        }

        public Criteria andMeetingkindNotIn(List<Integer> values) {
            addCriterion("MeetingKind not in", values, "meetingkind");
            return (Criteria) this;
        }

        public Criteria andMeetingkindBetween(Integer value1, Integer value2) {
            addCriterion("MeetingKind between", value1, value2, "meetingkind");
            return (Criteria) this;
        }

        public Criteria andMeetingkindNotBetween(Integer value1, Integer value2) {
            addCriterion("MeetingKind not between", value1, value2, "meetingkind");
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

        public Criteria andSubjectkindEqualTo(Integer value) {
            addCriterion("SubjectKind =", value, "subjectkind");
            return (Criteria) this;
        }

        public Criteria andSubjectkindNotEqualTo(Integer value) {
            addCriterion("SubjectKind <>", value, "subjectkind");
            return (Criteria) this;
        }

        public Criteria andSubjectkindGreaterThan(Integer value) {
            addCriterion("SubjectKind >", value, "subjectkind");
            return (Criteria) this;
        }

        public Criteria andSubjectkindGreaterThanOrEqualTo(Integer value) {
            addCriterion("SubjectKind >=", value, "subjectkind");
            return (Criteria) this;
        }

        public Criteria andSubjectkindLessThan(Integer value) {
            addCriterion("SubjectKind <", value, "subjectkind");
            return (Criteria) this;
        }

        public Criteria andSubjectkindLessThanOrEqualTo(Integer value) {
            addCriterion("SubjectKind <=", value, "subjectkind");
            return (Criteria) this;
        }

        public Criteria andSubjectkindIn(List<Integer> values) {
            addCriterion("SubjectKind in", values, "subjectkind");
            return (Criteria) this;
        }

        public Criteria andSubjectkindNotIn(List<Integer> values) {
            addCriterion("SubjectKind not in", values, "subjectkind");
            return (Criteria) this;
        }

        public Criteria andSubjectkindBetween(Integer value1, Integer value2) {
            addCriterion("SubjectKind between", value1, value2, "subjectkind");
            return (Criteria) this;
        }

        public Criteria andSubjectkindNotBetween(Integer value1, Integer value2) {
            addCriterion("SubjectKind not between", value1, value2, "subjectkind");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("Address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("Address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("Address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("Address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("Address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("Address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("Address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("Address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("Address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("Address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("Address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("Address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("Address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("Address not between", value1, value2, "address");
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

        public Criteria andIsthesisIsNull() {
            addCriterion("IsThesis is null");
            return (Criteria) this;
        }

        public Criteria andIsthesisIsNotNull() {
            addCriterion("IsThesis is not null");
            return (Criteria) this;
        }

        public Criteria andIsthesisEqualTo(Integer value) {
            addCriterion("IsThesis =", value, "isthesis");
            return (Criteria) this;
        }

        public Criteria andIsthesisNotEqualTo(Integer value) {
            addCriterion("IsThesis <>", value, "isthesis");
            return (Criteria) this;
        }

        public Criteria andIsthesisGreaterThan(Integer value) {
            addCriterion("IsThesis >", value, "isthesis");
            return (Criteria) this;
        }

        public Criteria andIsthesisGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsThesis >=", value, "isthesis");
            return (Criteria) this;
        }

        public Criteria andIsthesisLessThan(Integer value) {
            addCriterion("IsThesis <", value, "isthesis");
            return (Criteria) this;
        }

        public Criteria andIsthesisLessThanOrEqualTo(Integer value) {
            addCriterion("IsThesis <=", value, "isthesis");
            return (Criteria) this;
        }

        public Criteria andIsthesisIn(List<Integer> values) {
            addCriterion("IsThesis in", values, "isthesis");
            return (Criteria) this;
        }

        public Criteria andIsthesisNotIn(List<Integer> values) {
            addCriterion("IsThesis not in", values, "isthesis");
            return (Criteria) this;
        }

        public Criteria andIsthesisBetween(Integer value1, Integer value2) {
            addCriterion("IsThesis between", value1, value2, "isthesis");
            return (Criteria) this;
        }

        public Criteria andIsthesisNotBetween(Integer value1, Integer value2) {
            addCriterion("IsThesis not between", value1, value2, "isthesis");
            return (Criteria) this;
        }

        public Criteria andIsreportIsNull() {
            addCriterion("IsReport is null");
            return (Criteria) this;
        }

        public Criteria andIsreportIsNotNull() {
            addCriterion("IsReport is not null");
            return (Criteria) this;
        }

        public Criteria andIsreportEqualTo(Integer value) {
            addCriterion("IsReport =", value, "isreport");
            return (Criteria) this;
        }

        public Criteria andIsreportNotEqualTo(Integer value) {
            addCriterion("IsReport <>", value, "isreport");
            return (Criteria) this;
        }

        public Criteria andIsreportGreaterThan(Integer value) {
            addCriterion("IsReport >", value, "isreport");
            return (Criteria) this;
        }

        public Criteria andIsreportGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsReport >=", value, "isreport");
            return (Criteria) this;
        }

        public Criteria andIsreportLessThan(Integer value) {
            addCriterion("IsReport <", value, "isreport");
            return (Criteria) this;
        }

        public Criteria andIsreportLessThanOrEqualTo(Integer value) {
            addCriterion("IsReport <=", value, "isreport");
            return (Criteria) this;
        }

        public Criteria andIsreportIn(List<Integer> values) {
            addCriterion("IsReport in", values, "isreport");
            return (Criteria) this;
        }

        public Criteria andIsreportNotIn(List<Integer> values) {
            addCriterion("IsReport not in", values, "isreport");
            return (Criteria) this;
        }

        public Criteria andIsreportBetween(Integer value1, Integer value2) {
            addCriterion("IsReport between", value1, value2, "isreport");
            return (Criteria) this;
        }

        public Criteria andIsreportNotBetween(Integer value1, Integer value2) {
            addCriterion("IsReport not between", value1, value2, "isreport");
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

        public Criteria andMeetingintroductionIsNull() {
            addCriterion("MeetingIntroduction is null");
            return (Criteria) this;
        }

        public Criteria andMeetingintroductionIsNotNull() {
            addCriterion("MeetingIntroduction is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingintroductionEqualTo(String value) {
            addCriterion("MeetingIntroduction =", value, "meetingintroduction");
            return (Criteria) this;
        }

        public Criteria andMeetingintroductionNotEqualTo(String value) {
            addCriterion("MeetingIntroduction <>", value, "meetingintroduction");
            return (Criteria) this;
        }

        public Criteria andMeetingintroductionGreaterThan(String value) {
            addCriterion("MeetingIntroduction >", value, "meetingintroduction");
            return (Criteria) this;
        }

        public Criteria andMeetingintroductionGreaterThanOrEqualTo(String value) {
            addCriterion("MeetingIntroduction >=", value, "meetingintroduction");
            return (Criteria) this;
        }

        public Criteria andMeetingintroductionLessThan(String value) {
            addCriterion("MeetingIntroduction <", value, "meetingintroduction");
            return (Criteria) this;
        }

        public Criteria andMeetingintroductionLessThanOrEqualTo(String value) {
            addCriterion("MeetingIntroduction <=", value, "meetingintroduction");
            return (Criteria) this;
        }

        public Criteria andMeetingintroductionLike(String value) {
            addCriterion("MeetingIntroduction like", value, "meetingintroduction");
            return (Criteria) this;
        }

        public Criteria andMeetingintroductionNotLike(String value) {
            addCriterion("MeetingIntroduction not like", value, "meetingintroduction");
            return (Criteria) this;
        }

        public Criteria andMeetingintroductionIn(List<String> values) {
            addCriterion("MeetingIntroduction in", values, "meetingintroduction");
            return (Criteria) this;
        }

        public Criteria andMeetingintroductionNotIn(List<String> values) {
            addCriterion("MeetingIntroduction not in", values, "meetingintroduction");
            return (Criteria) this;
        }

        public Criteria andMeetingintroductionBetween(String value1, String value2) {
            addCriterion("MeetingIntroduction between", value1, value2, "meetingintroduction");
            return (Criteria) this;
        }

        public Criteria andMeetingintroductionNotBetween(String value1, String value2) {
            addCriterion("MeetingIntroduction not between", value1, value2, "meetingintroduction");
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