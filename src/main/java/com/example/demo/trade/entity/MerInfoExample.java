package com.example.demo.trade.entity;

import java.util.ArrayList;
import java.util.List;

public class MerInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MerInfoExample() {
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

        public Criteria andMerccodeIsNull() {
            addCriterion("merccode is null");
            return (Criteria) this;
        }

        public Criteria andMerccodeIsNotNull() {
            addCriterion("merccode is not null");
            return (Criteria) this;
        }

        public Criteria andMerccodeEqualTo(String value) {
            addCriterion("merccode =", value, "merccode");
            return (Criteria) this;
        }

        public Criteria andMerccodeNotEqualTo(String value) {
            addCriterion("merccode <>", value, "merccode");
            return (Criteria) this;
        }

        public Criteria andMerccodeGreaterThan(String value) {
            addCriterion("merccode >", value, "merccode");
            return (Criteria) this;
        }

        public Criteria andMerccodeGreaterThanOrEqualTo(String value) {
            addCriterion("merccode >=", value, "merccode");
            return (Criteria) this;
        }

        public Criteria andMerccodeLessThan(String value) {
            addCriterion("merccode <", value, "merccode");
            return (Criteria) this;
        }

        public Criteria andMerccodeLessThanOrEqualTo(String value) {
            addCriterion("merccode <=", value, "merccode");
            return (Criteria) this;
        }

        public Criteria andMerccodeLike(String value) {
            addCriterion("merccode like", value, "merccode");
            return (Criteria) this;
        }

        public Criteria andMerccodeNotLike(String value) {
            addCriterion("merccode not like", value, "merccode");
            return (Criteria) this;
        }

        public Criteria andMerccodeIn(List<String> values) {
            addCriterion("merccode in", values, "merccode");
            return (Criteria) this;
        }

        public Criteria andMerccodeNotIn(List<String> values) {
            addCriterion("merccode not in", values, "merccode");
            return (Criteria) this;
        }

        public Criteria andMerccodeBetween(String value1, String value2) {
            addCriterion("merccode between", value1, value2, "merccode");
            return (Criteria) this;
        }

        public Criteria andMerccodeNotBetween(String value1, String value2) {
            addCriterion("merccode not between", value1, value2, "merccode");
            return (Criteria) this;
        }

        public Criteria andMercnameIsNull() {
            addCriterion("mercname is null");
            return (Criteria) this;
        }

        public Criteria andMercnameIsNotNull() {
            addCriterion("mercname is not null");
            return (Criteria) this;
        }

        public Criteria andMercnameEqualTo(String value) {
            addCriterion("mercname =", value, "mercname");
            return (Criteria) this;
        }

        public Criteria andMercnameNotEqualTo(String value) {
            addCriterion("mercname <>", value, "mercname");
            return (Criteria) this;
        }

        public Criteria andMercnameGreaterThan(String value) {
            addCriterion("mercname >", value, "mercname");
            return (Criteria) this;
        }

        public Criteria andMercnameGreaterThanOrEqualTo(String value) {
            addCriterion("mercname >=", value, "mercname");
            return (Criteria) this;
        }

        public Criteria andMercnameLessThan(String value) {
            addCriterion("mercname <", value, "mercname");
            return (Criteria) this;
        }

        public Criteria andMercnameLessThanOrEqualTo(String value) {
            addCriterion("mercname <=", value, "mercname");
            return (Criteria) this;
        }

        public Criteria andMercnameLike(String value) {
            addCriterion("mercname like", value, "mercname");
            return (Criteria) this;
        }

        public Criteria andMercnameNotLike(String value) {
            addCriterion("mercname not like", value, "mercname");
            return (Criteria) this;
        }

        public Criteria andMercnameIn(List<String> values) {
            addCriterion("mercname in", values, "mercname");
            return (Criteria) this;
        }

        public Criteria andMercnameNotIn(List<String> values) {
            addCriterion("mercname not in", values, "mercname");
            return (Criteria) this;
        }

        public Criteria andMercnameBetween(String value1, String value2) {
            addCriterion("mercname between", value1, value2, "mercname");
            return (Criteria) this;
        }

        public Criteria andMercnameNotBetween(String value1, String value2) {
            addCriterion("mercname not between", value1, value2, "mercname");
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