package com.example.demo.trade.entity;

import java.util.ArrayList;
import java.util.List;

public class TransSerialInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransSerialInfoExample() {
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

        public Criteria andSerialIdIsNull() {
            addCriterion("serial_id is null");
            return (Criteria) this;
        }

        public Criteria andSerialIdIsNotNull() {
            addCriterion("serial_id is not null");
            return (Criteria) this;
        }

        public Criteria andSerialIdEqualTo(Long value) {
            addCriterion("serial_id =", value, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdNotEqualTo(Long value) {
            addCriterion("serial_id <>", value, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdGreaterThan(Long value) {
            addCriterion("serial_id >", value, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdGreaterThanOrEqualTo(Long value) {
            addCriterion("serial_id >=", value, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdLessThan(Long value) {
            addCriterion("serial_id <", value, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdLessThanOrEqualTo(Long value) {
            addCriterion("serial_id <=", value, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdIn(List<Long> values) {
            addCriterion("serial_id in", values, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdNotIn(List<Long> values) {
            addCriterion("serial_id not in", values, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdBetween(Long value1, Long value2) {
            addCriterion("serial_id between", value1, value2, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdNotBetween(Long value1, Long value2) {
            addCriterion("serial_id not between", value1, value2, "serialId");
            return (Criteria) this;
        }

        public Criteria andTranssqeIsNull() {
            addCriterion("transsqe is null");
            return (Criteria) this;
        }

        public Criteria andTranssqeIsNotNull() {
            addCriterion("transsqe is not null");
            return (Criteria) this;
        }

        public Criteria andTranssqeEqualTo(String value) {
            addCriterion("transsqe =", value, "transsqe");
            return (Criteria) this;
        }

        public Criteria andTranssqeNotEqualTo(String value) {
            addCriterion("transsqe <>", value, "transsqe");
            return (Criteria) this;
        }

        public Criteria andTranssqeGreaterThan(String value) {
            addCriterion("transsqe >", value, "transsqe");
            return (Criteria) this;
        }

        public Criteria andTranssqeGreaterThanOrEqualTo(String value) {
            addCriterion("transsqe >=", value, "transsqe");
            return (Criteria) this;
        }

        public Criteria andTranssqeLessThan(String value) {
            addCriterion("transsqe <", value, "transsqe");
            return (Criteria) this;
        }

        public Criteria andTranssqeLessThanOrEqualTo(String value) {
            addCriterion("transsqe <=", value, "transsqe");
            return (Criteria) this;
        }

        public Criteria andTranssqeLike(String value) {
            addCriterion("transsqe like", value, "transsqe");
            return (Criteria) this;
        }

        public Criteria andTranssqeNotLike(String value) {
            addCriterion("transsqe not like", value, "transsqe");
            return (Criteria) this;
        }

        public Criteria andTranssqeIn(List<String> values) {
            addCriterion("transsqe in", values, "transsqe");
            return (Criteria) this;
        }

        public Criteria andTranssqeNotIn(List<String> values) {
            addCriterion("transsqe not in", values, "transsqe");
            return (Criteria) this;
        }

        public Criteria andTranssqeBetween(String value1, String value2) {
            addCriterion("transsqe between", value1, value2, "transsqe");
            return (Criteria) this;
        }

        public Criteria andTranssqeNotBetween(String value1, String value2) {
            addCriterion("transsqe not between", value1, value2, "transsqe");
            return (Criteria) this;
        }

        public Criteria andOrdernumIsNull() {
            addCriterion("ordernum is null");
            return (Criteria) this;
        }

        public Criteria andOrdernumIsNotNull() {
            addCriterion("ordernum is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernumEqualTo(String value) {
            addCriterion("ordernum =", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotEqualTo(String value) {
            addCriterion("ordernum <>", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumGreaterThan(String value) {
            addCriterion("ordernum >", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumGreaterThanOrEqualTo(String value) {
            addCriterion("ordernum >=", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumLessThan(String value) {
            addCriterion("ordernum <", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumLessThanOrEqualTo(String value) {
            addCriterion("ordernum <=", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumLike(String value) {
            addCriterion("ordernum like", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotLike(String value) {
            addCriterion("ordernum not like", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumIn(List<String> values) {
            addCriterion("ordernum in", values, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotIn(List<String> values) {
            addCriterion("ordernum not in", values, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumBetween(String value1, String value2) {
            addCriterion("ordernum between", value1, value2, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotBetween(String value1, String value2) {
            addCriterion("ordernum not between", value1, value2, "ordernum");
            return (Criteria) this;
        }

        public Criteria andTransamtIsNull() {
            addCriterion("transamt is null");
            return (Criteria) this;
        }

        public Criteria andTransamtIsNotNull() {
            addCriterion("transamt is not null");
            return (Criteria) this;
        }

        public Criteria andTransamtEqualTo(String value) {
            addCriterion("transamt =", value, "transamt");
            return (Criteria) this;
        }

        public Criteria andTransamtNotEqualTo(String value) {
            addCriterion("transamt <>", value, "transamt");
            return (Criteria) this;
        }

        public Criteria andTransamtGreaterThan(String value) {
            addCriterion("transamt >", value, "transamt");
            return (Criteria) this;
        }

        public Criteria andTransamtGreaterThanOrEqualTo(String value) {
            addCriterion("transamt >=", value, "transamt");
            return (Criteria) this;
        }

        public Criteria andTransamtLessThan(String value) {
            addCriterion("transamt <", value, "transamt");
            return (Criteria) this;
        }

        public Criteria andTransamtLessThanOrEqualTo(String value) {
            addCriterion("transamt <=", value, "transamt");
            return (Criteria) this;
        }

        public Criteria andTransamtLike(String value) {
            addCriterion("transamt like", value, "transamt");
            return (Criteria) this;
        }

        public Criteria andTransamtNotLike(String value) {
            addCriterion("transamt not like", value, "transamt");
            return (Criteria) this;
        }

        public Criteria andTransamtIn(List<String> values) {
            addCriterion("transamt in", values, "transamt");
            return (Criteria) this;
        }

        public Criteria andTransamtNotIn(List<String> values) {
            addCriterion("transamt not in", values, "transamt");
            return (Criteria) this;
        }

        public Criteria andTransamtBetween(String value1, String value2) {
            addCriterion("transamt between", value1, value2, "transamt");
            return (Criteria) this;
        }

        public Criteria andTransamtNotBetween(String value1, String value2) {
            addCriterion("transamt not between", value1, value2, "transamt");
            return (Criteria) this;
        }

        public Criteria andActualtransamtIsNull() {
            addCriterion("actualtransamt is null");
            return (Criteria) this;
        }

        public Criteria andActualtransamtIsNotNull() {
            addCriterion("actualtransamt is not null");
            return (Criteria) this;
        }

        public Criteria andActualtransamtEqualTo(String value) {
            addCriterion("actualtransamt =", value, "actualtransamt");
            return (Criteria) this;
        }

        public Criteria andActualtransamtNotEqualTo(String value) {
            addCriterion("actualtransamt <>", value, "actualtransamt");
            return (Criteria) this;
        }

        public Criteria andActualtransamtGreaterThan(String value) {
            addCriterion("actualtransamt >", value, "actualtransamt");
            return (Criteria) this;
        }

        public Criteria andActualtransamtGreaterThanOrEqualTo(String value) {
            addCriterion("actualtransamt >=", value, "actualtransamt");
            return (Criteria) this;
        }

        public Criteria andActualtransamtLessThan(String value) {
            addCriterion("actualtransamt <", value, "actualtransamt");
            return (Criteria) this;
        }

        public Criteria andActualtransamtLessThanOrEqualTo(String value) {
            addCriterion("actualtransamt <=", value, "actualtransamt");
            return (Criteria) this;
        }

        public Criteria andActualtransamtLike(String value) {
            addCriterion("actualtransamt like", value, "actualtransamt");
            return (Criteria) this;
        }

        public Criteria andActualtransamtNotLike(String value) {
            addCriterion("actualtransamt not like", value, "actualtransamt");
            return (Criteria) this;
        }

        public Criteria andActualtransamtIn(List<String> values) {
            addCriterion("actualtransamt in", values, "actualtransamt");
            return (Criteria) this;
        }

        public Criteria andActualtransamtNotIn(List<String> values) {
            addCriterion("actualtransamt not in", values, "actualtransamt");
            return (Criteria) this;
        }

        public Criteria andActualtransamtBetween(String value1, String value2) {
            addCriterion("actualtransamt between", value1, value2, "actualtransamt");
            return (Criteria) this;
        }

        public Criteria andActualtransamtNotBetween(String value1, String value2) {
            addCriterion("actualtransamt not between", value1, value2, "actualtransamt");
            return (Criteria) this;
        }

        public Criteria andDctamtIsNull() {
            addCriterion("dctamt is null");
            return (Criteria) this;
        }

        public Criteria andDctamtIsNotNull() {
            addCriterion("dctamt is not null");
            return (Criteria) this;
        }

        public Criteria andDctamtEqualTo(String value) {
            addCriterion("dctamt =", value, "dctamt");
            return (Criteria) this;
        }

        public Criteria andDctamtNotEqualTo(String value) {
            addCriterion("dctamt <>", value, "dctamt");
            return (Criteria) this;
        }

        public Criteria andDctamtGreaterThan(String value) {
            addCriterion("dctamt >", value, "dctamt");
            return (Criteria) this;
        }

        public Criteria andDctamtGreaterThanOrEqualTo(String value) {
            addCriterion("dctamt >=", value, "dctamt");
            return (Criteria) this;
        }

        public Criteria andDctamtLessThan(String value) {
            addCriterion("dctamt <", value, "dctamt");
            return (Criteria) this;
        }

        public Criteria andDctamtLessThanOrEqualTo(String value) {
            addCriterion("dctamt <=", value, "dctamt");
            return (Criteria) this;
        }

        public Criteria andDctamtLike(String value) {
            addCriterion("dctamt like", value, "dctamt");
            return (Criteria) this;
        }

        public Criteria andDctamtNotLike(String value) {
            addCriterion("dctamt not like", value, "dctamt");
            return (Criteria) this;
        }

        public Criteria andDctamtIn(List<String> values) {
            addCriterion("dctamt in", values, "dctamt");
            return (Criteria) this;
        }

        public Criteria andDctamtNotIn(List<String> values) {
            addCriterion("dctamt not in", values, "dctamt");
            return (Criteria) this;
        }

        public Criteria andDctamtBetween(String value1, String value2) {
            addCriterion("dctamt between", value1, value2, "dctamt");
            return (Criteria) this;
        }

        public Criteria andDctamtNotBetween(String value1, String value2) {
            addCriterion("dctamt not between", value1, value2, "dctamt");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNull() {
            addCriterion("paytype is null");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNotNull() {
            addCriterion("paytype is not null");
            return (Criteria) this;
        }

        public Criteria andPaytypeEqualTo(String value) {
            addCriterion("paytype =", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotEqualTo(String value) {
            addCriterion("paytype <>", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThan(String value) {
            addCriterion("paytype >", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThanOrEqualTo(String value) {
            addCriterion("paytype >=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThan(String value) {
            addCriterion("paytype <", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThanOrEqualTo(String value) {
            addCriterion("paytype <=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLike(String value) {
            addCriterion("paytype like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotLike(String value) {
            addCriterion("paytype not like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeIn(List<String> values) {
            addCriterion("paytype in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotIn(List<String> values) {
            addCriterion("paytype not in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeBetween(String value1, String value2) {
            addCriterion("paytype between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotBetween(String value1, String value2) {
            addCriterion("paytype not between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andTranstimeIsNull() {
            addCriterion("transtime is null");
            return (Criteria) this;
        }

        public Criteria andTranstimeIsNotNull() {
            addCriterion("transtime is not null");
            return (Criteria) this;
        }

        public Criteria andTranstimeEqualTo(String value) {
            addCriterion("transtime =", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeNotEqualTo(String value) {
            addCriterion("transtime <>", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeGreaterThan(String value) {
            addCriterion("transtime >", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeGreaterThanOrEqualTo(String value) {
            addCriterion("transtime >=", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeLessThan(String value) {
            addCriterion("transtime <", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeLessThanOrEqualTo(String value) {
            addCriterion("transtime <=", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeLike(String value) {
            addCriterion("transtime like", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeNotLike(String value) {
            addCriterion("transtime not like", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeIn(List<String> values) {
            addCriterion("transtime in", values, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeNotIn(List<String> values) {
            addCriterion("transtime not in", values, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeBetween(String value1, String value2) {
            addCriterion("transtime between", value1, value2, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeNotBetween(String value1, String value2) {
            addCriterion("transtime not between", value1, value2, "transtime");
            return (Criteria) this;
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

        public Criteria andTransstatusIsNull() {
            addCriterion("transstatus is null");
            return (Criteria) this;
        }

        public Criteria andTransstatusIsNotNull() {
            addCriterion("transstatus is not null");
            return (Criteria) this;
        }

        public Criteria andTransstatusEqualTo(String value) {
            addCriterion("transstatus =", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusNotEqualTo(String value) {
            addCriterion("transstatus <>", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusGreaterThan(String value) {
            addCriterion("transstatus >", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusGreaterThanOrEqualTo(String value) {
            addCriterion("transstatus >=", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusLessThan(String value) {
            addCriterion("transstatus <", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusLessThanOrEqualTo(String value) {
            addCriterion("transstatus <=", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusLike(String value) {
            addCriterion("transstatus like", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusNotLike(String value) {
            addCriterion("transstatus not like", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusIn(List<String> values) {
            addCriterion("transstatus in", values, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusNotIn(List<String> values) {
            addCriterion("transstatus not in", values, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusBetween(String value1, String value2) {
            addCriterion("transstatus between", value1, value2, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusNotBetween(String value1, String value2) {
            addCriterion("transstatus not between", value1, value2, "transstatus");
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