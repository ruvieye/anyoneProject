package com.project.anyone.generator.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleExample() {
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

        public Criteria andSeqIsNull() {
            addCriterion("seq is null");
            return (Criteria) this;
        }

        public Criteria andSeqIsNotNull() {
            addCriterion("seq is not null");
            return (Criteria) this;
        }

        public Criteria andSeqEqualTo(Long value) {
            addCriterion("seq =", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotEqualTo(Long value) {
            addCriterion("seq <>", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqGreaterThan(Long value) {
            addCriterion("seq >", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqGreaterThanOrEqualTo(Long value) {
            addCriterion("seq >=", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqLessThan(Long value) {
            addCriterion("seq <", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqLessThanOrEqualTo(Long value) {
            addCriterion("seq <=", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqIn(List<Long> values) {
            addCriterion("seq in", values, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotIn(List<Long> values) {
            addCriterion("seq not in", values, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqBetween(Long value1, Long value2) {
            addCriterion("seq between", value1, value2, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotBetween(Long value1, Long value2) {
            addCriterion("seq not between", value1, value2, "seq");
            return (Criteria) this;
        }

        public Criteria andBbsNoIsNull() {
            addCriterion("bbs_no is null");
            return (Criteria) this;
        }

        public Criteria andBbsNoIsNotNull() {
            addCriterion("bbs_no is not null");
            return (Criteria) this;
        }

        public Criteria andBbsNoEqualTo(Integer value) {
            addCriterion("bbs_no =", value, "bbsNo");
            return (Criteria) this;
        }

        public Criteria andBbsNoNotEqualTo(Integer value) {
            addCriterion("bbs_no <>", value, "bbsNo");
            return (Criteria) this;
        }

        public Criteria andBbsNoGreaterThan(Integer value) {
            addCriterion("bbs_no >", value, "bbsNo");
            return (Criteria) this;
        }

        public Criteria andBbsNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("bbs_no >=", value, "bbsNo");
            return (Criteria) this;
        }

        public Criteria andBbsNoLessThan(Integer value) {
            addCriterion("bbs_no <", value, "bbsNo");
            return (Criteria) this;
        }

        public Criteria andBbsNoLessThanOrEqualTo(Integer value) {
            addCriterion("bbs_no <=", value, "bbsNo");
            return (Criteria) this;
        }

        public Criteria andBbsNoIn(List<Integer> values) {
            addCriterion("bbs_no in", values, "bbsNo");
            return (Criteria) this;
        }

        public Criteria andBbsNoNotIn(List<Integer> values) {
            addCriterion("bbs_no not in", values, "bbsNo");
            return (Criteria) this;
        }

        public Criteria andBbsNoBetween(Integer value1, Integer value2) {
            addCriterion("bbs_no between", value1, value2, "bbsNo");
            return (Criteria) this;
        }

        public Criteria andBbsNoNotBetween(Integer value1, Integer value2) {
            addCriterion("bbs_no not between", value1, value2, "bbsNo");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIsNull() {
            addCriterion("article_title is null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIsNotNull() {
            addCriterion("article_title is not null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleEqualTo(String value) {
            addCriterion("article_title =", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotEqualTo(String value) {
            addCriterion("article_title <>", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThan(String value) {
            addCriterion("article_title >", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThanOrEqualTo(String value) {
            addCriterion("article_title >=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThan(String value) {
            addCriterion("article_title <", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThanOrEqualTo(String value) {
            addCriterion("article_title <=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLike(String value) {
            addCriterion("article_title like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotLike(String value) {
            addCriterion("article_title not like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIn(List<String> values) {
            addCriterion("article_title in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotIn(List<String> values) {
            addCriterion("article_title not in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleBetween(String value1, String value2) {
            addCriterion("article_title between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotBetween(String value1, String value2) {
            addCriterion("article_title not between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andWriterIsNull() {
            addCriterion("writer is null");
            return (Criteria) this;
        }

        public Criteria andWriterIsNotNull() {
            addCriterion("writer is not null");
            return (Criteria) this;
        }

        public Criteria andWriterEqualTo(String value) {
            addCriterion("writer =", value, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterNotEqualTo(String value) {
            addCriterion("writer <>", value, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterGreaterThan(String value) {
            addCriterion("writer >", value, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterGreaterThanOrEqualTo(String value) {
            addCriterion("writer >=", value, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterLessThan(String value) {
            addCriterion("writer <", value, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterLessThanOrEqualTo(String value) {
            addCriterion("writer <=", value, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterLike(String value) {
            addCriterion("writer like", value, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterNotLike(String value) {
            addCriterion("writer not like", value, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterIn(List<String> values) {
            addCriterion("writer in", values, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterNotIn(List<String> values) {
            addCriterion("writer not in", values, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterBetween(String value1, String value2) {
            addCriterion("writer between", value1, value2, "writer");
            return (Criteria) this;
        }

        public Criteria andWriterNotBetween(String value1, String value2) {
            addCriterion("writer not between", value1, value2, "writer");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andRegDatetimeIsNull() {
            addCriterion("reg_datetime is null");
            return (Criteria) this;
        }

        public Criteria andRegDatetimeIsNotNull() {
            addCriterion("reg_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andRegDatetimeEqualTo(Date value) {
            addCriterion("reg_datetime =", value, "regDatetime");
            return (Criteria) this;
        }

        public Criteria andRegDatetimeNotEqualTo(Date value) {
            addCriterion("reg_datetime <>", value, "regDatetime");
            return (Criteria) this;
        }

        public Criteria andRegDatetimeGreaterThan(Date value) {
            addCriterion("reg_datetime >", value, "regDatetime");
            return (Criteria) this;
        }

        public Criteria andRegDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reg_datetime >=", value, "regDatetime");
            return (Criteria) this;
        }

        public Criteria andRegDatetimeLessThan(Date value) {
            addCriterion("reg_datetime <", value, "regDatetime");
            return (Criteria) this;
        }

        public Criteria andRegDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("reg_datetime <=", value, "regDatetime");
            return (Criteria) this;
        }

        public Criteria andRegDatetimeIn(List<Date> values) {
            addCriterion("reg_datetime in", values, "regDatetime");
            return (Criteria) this;
        }

        public Criteria andRegDatetimeNotIn(List<Date> values) {
            addCriterion("reg_datetime not in", values, "regDatetime");
            return (Criteria) this;
        }

        public Criteria andRegDatetimeBetween(Date value1, Date value2) {
            addCriterion("reg_datetime between", value1, value2, "regDatetime");
            return (Criteria) this;
        }

        public Criteria andRegDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("reg_datetime not between", value1, value2, "regDatetime");
            return (Criteria) this;
        }

        public Criteria andModDatetimeIsNull() {
            addCriterion("mod_datetime is null");
            return (Criteria) this;
        }

        public Criteria andModDatetimeIsNotNull() {
            addCriterion("mod_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andModDatetimeEqualTo(Date value) {
            addCriterion("mod_datetime =", value, "modDatetime");
            return (Criteria) this;
        }

        public Criteria andModDatetimeNotEqualTo(Date value) {
            addCriterion("mod_datetime <>", value, "modDatetime");
            return (Criteria) this;
        }

        public Criteria andModDatetimeGreaterThan(Date value) {
            addCriterion("mod_datetime >", value, "modDatetime");
            return (Criteria) this;
        }

        public Criteria andModDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("mod_datetime >=", value, "modDatetime");
            return (Criteria) this;
        }

        public Criteria andModDatetimeLessThan(Date value) {
            addCriterion("mod_datetime <", value, "modDatetime");
            return (Criteria) this;
        }

        public Criteria andModDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("mod_datetime <=", value, "modDatetime");
            return (Criteria) this;
        }

        public Criteria andModDatetimeIn(List<Date> values) {
            addCriterion("mod_datetime in", values, "modDatetime");
            return (Criteria) this;
        }

        public Criteria andModDatetimeNotIn(List<Date> values) {
            addCriterion("mod_datetime not in", values, "modDatetime");
            return (Criteria) this;
        }

        public Criteria andModDatetimeBetween(Date value1, Date value2) {
            addCriterion("mod_datetime between", value1, value2, "modDatetime");
            return (Criteria) this;
        }

        public Criteria andModDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("mod_datetime not between", value1, value2, "modDatetime");
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