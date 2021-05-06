package com.example.demo.trade.entity;

import java.util.ArrayList;
import java.util.List;

public class OrderInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderInfoExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
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

        public Criteria andBiztpIsNull() {
            addCriterion("biztp is null");
            return (Criteria) this;
        }

        public Criteria andBiztpIsNotNull() {
            addCriterion("biztp is not null");
            return (Criteria) this;
        }

        public Criteria andBiztpEqualTo(String value) {
            addCriterion("biztp =", value, "biztp");
            return (Criteria) this;
        }

        public Criteria andBiztpNotEqualTo(String value) {
            addCriterion("biztp <>", value, "biztp");
            return (Criteria) this;
        }

        public Criteria andBiztpGreaterThan(String value) {
            addCriterion("biztp >", value, "biztp");
            return (Criteria) this;
        }

        public Criteria andBiztpGreaterThanOrEqualTo(String value) {
            addCriterion("biztp >=", value, "biztp");
            return (Criteria) this;
        }

        public Criteria andBiztpLessThan(String value) {
            addCriterion("biztp <", value, "biztp");
            return (Criteria) this;
        }

        public Criteria andBiztpLessThanOrEqualTo(String value) {
            addCriterion("biztp <=", value, "biztp");
            return (Criteria) this;
        }

        public Criteria andBiztpLike(String value) {
            addCriterion("biztp like", value, "biztp");
            return (Criteria) this;
        }

        public Criteria andBiztpNotLike(String value) {
            addCriterion("biztp not like", value, "biztp");
            return (Criteria) this;
        }

        public Criteria andBiztpIn(List<String> values) {
            addCriterion("biztp in", values, "biztp");
            return (Criteria) this;
        }

        public Criteria andBiztpNotIn(List<String> values) {
            addCriterion("biztp not in", values, "biztp");
            return (Criteria) this;
        }

        public Criteria andBiztpBetween(String value1, String value2) {
            addCriterion("biztp between", value1, value2, "biztp");
            return (Criteria) this;
        }

        public Criteria andBiztpNotBetween(String value1, String value2) {
            addCriterion("biztp not between", value1, value2, "biztp");
            return (Criteria) this;
        }

        public Criteria andOrdercountIsNull() {
            addCriterion("ordercount is null");
            return (Criteria) this;
        }

        public Criteria andOrdercountIsNotNull() {
            addCriterion("ordercount is not null");
            return (Criteria) this;
        }

        public Criteria andOrdercountEqualTo(String value) {
            addCriterion("ordercount =", value, "ordercount");
            return (Criteria) this;
        }

        public Criteria andOrdercountNotEqualTo(String value) {
            addCriterion("ordercount <>", value, "ordercount");
            return (Criteria) this;
        }

        public Criteria andOrdercountGreaterThan(String value) {
            addCriterion("ordercount >", value, "ordercount");
            return (Criteria) this;
        }

        public Criteria andOrdercountGreaterThanOrEqualTo(String value) {
            addCriterion("ordercount >=", value, "ordercount");
            return (Criteria) this;
        }

        public Criteria andOrdercountLessThan(String value) {
            addCriterion("ordercount <", value, "ordercount");
            return (Criteria) this;
        }

        public Criteria andOrdercountLessThanOrEqualTo(String value) {
            addCriterion("ordercount <=", value, "ordercount");
            return (Criteria) this;
        }

        public Criteria andOrdercountLike(String value) {
            addCriterion("ordercount like", value, "ordercount");
            return (Criteria) this;
        }

        public Criteria andOrdercountNotLike(String value) {
            addCriterion("ordercount not like", value, "ordercount");
            return (Criteria) this;
        }

        public Criteria andOrdercountIn(List<String> values) {
            addCriterion("ordercount in", values, "ordercount");
            return (Criteria) this;
        }

        public Criteria andOrdercountNotIn(List<String> values) {
            addCriterion("ordercount not in", values, "ordercount");
            return (Criteria) this;
        }

        public Criteria andOrdercountBetween(String value1, String value2) {
            addCriterion("ordercount between", value1, value2, "ordercount");
            return (Criteria) this;
        }

        public Criteria andOrdercountNotBetween(String value1, String value2) {
            addCriterion("ordercount not between", value1, value2, "ordercount");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("channel like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("channel not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("channel not between", value1, value2, "channel");
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

        public Criteria andMercdttmIsNull() {
            addCriterion("mercdttm is null");
            return (Criteria) this;
        }

        public Criteria andMercdttmIsNotNull() {
            addCriterion("mercdttm is not null");
            return (Criteria) this;
        }

        public Criteria andMercdttmEqualTo(String value) {
            addCriterion("mercdttm =", value, "mercdttm");
            return (Criteria) this;
        }

        public Criteria andMercdttmNotEqualTo(String value) {
            addCriterion("mercdttm <>", value, "mercdttm");
            return (Criteria) this;
        }

        public Criteria andMercdttmGreaterThan(String value) {
            addCriterion("mercdttm >", value, "mercdttm");
            return (Criteria) this;
        }

        public Criteria andMercdttmGreaterThanOrEqualTo(String value) {
            addCriterion("mercdttm >=", value, "mercdttm");
            return (Criteria) this;
        }

        public Criteria andMercdttmLessThan(String value) {
            addCriterion("mercdttm <", value, "mercdttm");
            return (Criteria) this;
        }

        public Criteria andMercdttmLessThanOrEqualTo(String value) {
            addCriterion("mercdttm <=", value, "mercdttm");
            return (Criteria) this;
        }

        public Criteria andMercdttmLike(String value) {
            addCriterion("mercdttm like", value, "mercdttm");
            return (Criteria) this;
        }

        public Criteria andMercdttmNotLike(String value) {
            addCriterion("mercdttm not like", value, "mercdttm");
            return (Criteria) this;
        }

        public Criteria andMercdttmIn(List<String> values) {
            addCriterion("mercdttm in", values, "mercdttm");
            return (Criteria) this;
        }

        public Criteria andMercdttmNotIn(List<String> values) {
            addCriterion("mercdttm not in", values, "mercdttm");
            return (Criteria) this;
        }

        public Criteria andMercdttmBetween(String value1, String value2) {
            addCriterion("mercdttm between", value1, value2, "mercdttm");
            return (Criteria) this;
        }

        public Criteria andMercdttmNotBetween(String value1, String value2) {
            addCriterion("mercdttm not between", value1, value2, "mercdttm");
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

        public Criteria andRemark1IsNull() {
            addCriterion("remark1 is null");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNotNull() {
            addCriterion("remark1 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark1EqualTo(String value) {
            addCriterion("remark1 =", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotEqualTo(String value) {
            addCriterion("remark1 <>", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThan(String value) {
            addCriterion("remark1 >", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThanOrEqualTo(String value) {
            addCriterion("remark1 >=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThan(String value) {
            addCriterion("remark1 <", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThanOrEqualTo(String value) {
            addCriterion("remark1 <=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Like(String value) {
            addCriterion("remark1 like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotLike(String value) {
            addCriterion("remark1 not like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1In(List<String> values) {
            addCriterion("remark1 in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotIn(List<String> values) {
            addCriterion("remark1 not in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Between(String value1, String value2) {
            addCriterion("remark1 between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotBetween(String value1, String value2) {
            addCriterion("remark1 not between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNull() {
            addCriterion("remark2 is null");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNotNull() {
            addCriterion("remark2 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark2EqualTo(String value) {
            addCriterion("remark2 =", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotEqualTo(String value) {
            addCriterion("remark2 <>", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThan(String value) {
            addCriterion("remark2 >", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThanOrEqualTo(String value) {
            addCriterion("remark2 >=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThan(String value) {
            addCriterion("remark2 <", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThanOrEqualTo(String value) {
            addCriterion("remark2 <=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Like(String value) {
            addCriterion("remark2 like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotLike(String value) {
            addCriterion("remark2 not like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2In(List<String> values) {
            addCriterion("remark2 in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotIn(List<String> values) {
            addCriterion("remark2 not in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Between(String value1, String value2) {
            addCriterion("remark2 between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotBetween(String value1, String value2) {
            addCriterion("remark2 not between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andTradetypeIsNull() {
            addCriterion("tradetype is null");
            return (Criteria) this;
        }

        public Criteria andTradetypeIsNotNull() {
            addCriterion("tradetype is not null");
            return (Criteria) this;
        }

        public Criteria andTradetypeEqualTo(String value) {
            addCriterion("tradetype =", value, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeNotEqualTo(String value) {
            addCriterion("tradetype <>", value, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeGreaterThan(String value) {
            addCriterion("tradetype >", value, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeGreaterThanOrEqualTo(String value) {
            addCriterion("tradetype >=", value, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeLessThan(String value) {
            addCriterion("tradetype <", value, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeLessThanOrEqualTo(String value) {
            addCriterion("tradetype <=", value, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeLike(String value) {
            addCriterion("tradetype like", value, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeNotLike(String value) {
            addCriterion("tradetype not like", value, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeIn(List<String> values) {
            addCriterion("tradetype in", values, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeNotIn(List<String> values) {
            addCriterion("tradetype not in", values, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeBetween(String value1, String value2) {
            addCriterion("tradetype between", value1, value2, "tradetype");
            return (Criteria) this;
        }

        public Criteria andTradetypeNotBetween(String value1, String value2) {
            addCriterion("tradetype not between", value1, value2, "tradetype");
            return (Criteria) this;
        }

        public Criteria andMobnoIsNull() {
            addCriterion("mobno is null");
            return (Criteria) this;
        }

        public Criteria andMobnoIsNotNull() {
            addCriterion("mobno is not null");
            return (Criteria) this;
        }

        public Criteria andMobnoEqualTo(String value) {
            addCriterion("mobno =", value, "mobno");
            return (Criteria) this;
        }

        public Criteria andMobnoNotEqualTo(String value) {
            addCriterion("mobno <>", value, "mobno");
            return (Criteria) this;
        }

        public Criteria andMobnoGreaterThan(String value) {
            addCriterion("mobno >", value, "mobno");
            return (Criteria) this;
        }

        public Criteria andMobnoGreaterThanOrEqualTo(String value) {
            addCriterion("mobno >=", value, "mobno");
            return (Criteria) this;
        }

        public Criteria andMobnoLessThan(String value) {
            addCriterion("mobno <", value, "mobno");
            return (Criteria) this;
        }

        public Criteria andMobnoLessThanOrEqualTo(String value) {
            addCriterion("mobno <=", value, "mobno");
            return (Criteria) this;
        }

        public Criteria andMobnoLike(String value) {
            addCriterion("mobno like", value, "mobno");
            return (Criteria) this;
        }

        public Criteria andMobnoNotLike(String value) {
            addCriterion("mobno not like", value, "mobno");
            return (Criteria) this;
        }

        public Criteria andMobnoIn(List<String> values) {
            addCriterion("mobno in", values, "mobno");
            return (Criteria) this;
        }

        public Criteria andMobnoNotIn(List<String> values) {
            addCriterion("mobno not in", values, "mobno");
            return (Criteria) this;
        }

        public Criteria andMobnoBetween(String value1, String value2) {
            addCriterion("mobno between", value1, value2, "mobno");
            return (Criteria) this;
        }

        public Criteria andMobnoNotBetween(String value1, String value2) {
            addCriterion("mobno not between", value1, value2, "mobno");
            return (Criteria) this;
        }

        public Criteria andAcctidIsNull() {
            addCriterion("acctid is null");
            return (Criteria) this;
        }

        public Criteria andAcctidIsNotNull() {
            addCriterion("acctid is not null");
            return (Criteria) this;
        }

        public Criteria andAcctidEqualTo(String value) {
            addCriterion("acctid =", value, "acctid");
            return (Criteria) this;
        }

        public Criteria andAcctidNotEqualTo(String value) {
            addCriterion("acctid <>", value, "acctid");
            return (Criteria) this;
        }

        public Criteria andAcctidGreaterThan(String value) {
            addCriterion("acctid >", value, "acctid");
            return (Criteria) this;
        }

        public Criteria andAcctidGreaterThanOrEqualTo(String value) {
            addCriterion("acctid >=", value, "acctid");
            return (Criteria) this;
        }

        public Criteria andAcctidLessThan(String value) {
            addCriterion("acctid <", value, "acctid");
            return (Criteria) this;
        }

        public Criteria andAcctidLessThanOrEqualTo(String value) {
            addCriterion("acctid <=", value, "acctid");
            return (Criteria) this;
        }

        public Criteria andAcctidLike(String value) {
            addCriterion("acctid like", value, "acctid");
            return (Criteria) this;
        }

        public Criteria andAcctidNotLike(String value) {
            addCriterion("acctid not like", value, "acctid");
            return (Criteria) this;
        }

        public Criteria andAcctidIn(List<String> values) {
            addCriterion("acctid in", values, "acctid");
            return (Criteria) this;
        }

        public Criteria andAcctidNotIn(List<String> values) {
            addCriterion("acctid not in", values, "acctid");
            return (Criteria) this;
        }

        public Criteria andAcctidBetween(String value1, String value2) {
            addCriterion("acctid between", value1, value2, "acctid");
            return (Criteria) this;
        }

        public Criteria andAcctidNotBetween(String value1, String value2) {
            addCriterion("acctid not between", value1, value2, "acctid");
            return (Criteria) this;
        }

        public Criteria andAccttypeIsNull() {
            addCriterion("accttype is null");
            return (Criteria) this;
        }

        public Criteria andAccttypeIsNotNull() {
            addCriterion("accttype is not null");
            return (Criteria) this;
        }

        public Criteria andAccttypeEqualTo(String value) {
            addCriterion("accttype =", value, "accttype");
            return (Criteria) this;
        }

        public Criteria andAccttypeNotEqualTo(String value) {
            addCriterion("accttype <>", value, "accttype");
            return (Criteria) this;
        }

        public Criteria andAccttypeGreaterThan(String value) {
            addCriterion("accttype >", value, "accttype");
            return (Criteria) this;
        }

        public Criteria andAccttypeGreaterThanOrEqualTo(String value) {
            addCriterion("accttype >=", value, "accttype");
            return (Criteria) this;
        }

        public Criteria andAccttypeLessThan(String value) {
            addCriterion("accttype <", value, "accttype");
            return (Criteria) this;
        }

        public Criteria andAccttypeLessThanOrEqualTo(String value) {
            addCriterion("accttype <=", value, "accttype");
            return (Criteria) this;
        }

        public Criteria andAccttypeLike(String value) {
            addCriterion("accttype like", value, "accttype");
            return (Criteria) this;
        }

        public Criteria andAccttypeNotLike(String value) {
            addCriterion("accttype not like", value, "accttype");
            return (Criteria) this;
        }

        public Criteria andAccttypeIn(List<String> values) {
            addCriterion("accttype in", values, "accttype");
            return (Criteria) this;
        }

        public Criteria andAccttypeNotIn(List<String> values) {
            addCriterion("accttype not in", values, "accttype");
            return (Criteria) this;
        }

        public Criteria andAccttypeBetween(String value1, String value2) {
            addCriterion("accttype between", value1, value2, "accttype");
            return (Criteria) this;
        }

        public Criteria andAccttypeNotBetween(String value1, String value2) {
            addCriterion("accttype not between", value1, value2, "accttype");
            return (Criteria) this;
        }

        public Criteria andMercdateIsNull() {
            addCriterion("mercdate is null");
            return (Criteria) this;
        }

        public Criteria andMercdateIsNotNull() {
            addCriterion("mercdate is not null");
            return (Criteria) this;
        }

        public Criteria andMercdateEqualTo(String value) {
            addCriterion("mercdate =", value, "mercdate");
            return (Criteria) this;
        }

        public Criteria andMercdateNotEqualTo(String value) {
            addCriterion("mercdate <>", value, "mercdate");
            return (Criteria) this;
        }

        public Criteria andMercdateGreaterThan(String value) {
            addCriterion("mercdate >", value, "mercdate");
            return (Criteria) this;
        }

        public Criteria andMercdateGreaterThanOrEqualTo(String value) {
            addCriterion("mercdate >=", value, "mercdate");
            return (Criteria) this;
        }

        public Criteria andMercdateLessThan(String value) {
            addCriterion("mercdate <", value, "mercdate");
            return (Criteria) this;
        }

        public Criteria andMercdateLessThanOrEqualTo(String value) {
            addCriterion("mercdate <=", value, "mercdate");
            return (Criteria) this;
        }

        public Criteria andMercdateLike(String value) {
            addCriterion("mercdate like", value, "mercdate");
            return (Criteria) this;
        }

        public Criteria andMercdateNotLike(String value) {
            addCriterion("mercdate not like", value, "mercdate");
            return (Criteria) this;
        }

        public Criteria andMercdateIn(List<String> values) {
            addCriterion("mercdate in", values, "mercdate");
            return (Criteria) this;
        }

        public Criteria andMercdateNotIn(List<String> values) {
            addCriterion("mercdate not in", values, "mercdate");
            return (Criteria) this;
        }

        public Criteria andMercdateBetween(String value1, String value2) {
            addCriterion("mercdate between", value1, value2, "mercdate");
            return (Criteria) this;
        }

        public Criteria andMercdateNotBetween(String value1, String value2) {
            addCriterion("mercdate not between", value1, value2, "mercdate");
            return (Criteria) this;
        }

        public Criteria andExtliquidateIsNull() {
            addCriterion("extliquidate is null");
            return (Criteria) this;
        }

        public Criteria andExtliquidateIsNotNull() {
            addCriterion("extliquidate is not null");
            return (Criteria) this;
        }

        public Criteria andExtliquidateEqualTo(String value) {
            addCriterion("extliquidate =", value, "extliquidate");
            return (Criteria) this;
        }

        public Criteria andExtliquidateNotEqualTo(String value) {
            addCriterion("extliquidate <>", value, "extliquidate");
            return (Criteria) this;
        }

        public Criteria andExtliquidateGreaterThan(String value) {
            addCriterion("extliquidate >", value, "extliquidate");
            return (Criteria) this;
        }

        public Criteria andExtliquidateGreaterThanOrEqualTo(String value) {
            addCriterion("extliquidate >=", value, "extliquidate");
            return (Criteria) this;
        }

        public Criteria andExtliquidateLessThan(String value) {
            addCriterion("extliquidate <", value, "extliquidate");
            return (Criteria) this;
        }

        public Criteria andExtliquidateLessThanOrEqualTo(String value) {
            addCriterion("extliquidate <=", value, "extliquidate");
            return (Criteria) this;
        }

        public Criteria andExtliquidateLike(String value) {
            addCriterion("extliquidate like", value, "extliquidate");
            return (Criteria) this;
        }

        public Criteria andExtliquidateNotLike(String value) {
            addCriterion("extliquidate not like", value, "extliquidate");
            return (Criteria) this;
        }

        public Criteria andExtliquidateIn(List<String> values) {
            addCriterion("extliquidate in", values, "extliquidate");
            return (Criteria) this;
        }

        public Criteria andExtliquidateNotIn(List<String> values) {
            addCriterion("extliquidate not in", values, "extliquidate");
            return (Criteria) this;
        }

        public Criteria andExtliquidateBetween(String value1, String value2) {
            addCriterion("extliquidate between", value1, value2, "extliquidate");
            return (Criteria) this;
        }

        public Criteria andExtliquidateNotBetween(String value1, String value2) {
            addCriterion("extliquidate not between", value1, value2, "extliquidate");
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

        public Criteria andMercustidIsNull() {
            addCriterion("mercustid is null");
            return (Criteria) this;
        }

        public Criteria andMercustidIsNotNull() {
            addCriterion("mercustid is not null");
            return (Criteria) this;
        }

        public Criteria andMercustidEqualTo(String value) {
            addCriterion("mercustid =", value, "mercustid");
            return (Criteria) this;
        }

        public Criteria andMercustidNotEqualTo(String value) {
            addCriterion("mercustid <>", value, "mercustid");
            return (Criteria) this;
        }

        public Criteria andMercustidGreaterThan(String value) {
            addCriterion("mercustid >", value, "mercustid");
            return (Criteria) this;
        }

        public Criteria andMercustidGreaterThanOrEqualTo(String value) {
            addCriterion("mercustid >=", value, "mercustid");
            return (Criteria) this;
        }

        public Criteria andMercustidLessThan(String value) {
            addCriterion("mercustid <", value, "mercustid");
            return (Criteria) this;
        }

        public Criteria andMercustidLessThanOrEqualTo(String value) {
            addCriterion("mercustid <=", value, "mercustid");
            return (Criteria) this;
        }

        public Criteria andMercustidLike(String value) {
            addCriterion("mercustid like", value, "mercustid");
            return (Criteria) this;
        }

        public Criteria andMercustidNotLike(String value) {
            addCriterion("mercustid not like", value, "mercustid");
            return (Criteria) this;
        }

        public Criteria andMercustidIn(List<String> values) {
            addCriterion("mercustid in", values, "mercustid");
            return (Criteria) this;
        }

        public Criteria andMercustidNotIn(List<String> values) {
            addCriterion("mercustid not in", values, "mercustid");
            return (Criteria) this;
        }

        public Criteria andMercustidBetween(String value1, String value2) {
            addCriterion("mercustid between", value1, value2, "mercustid");
            return (Criteria) this;
        }

        public Criteria andMercustidNotBetween(String value1, String value2) {
            addCriterion("mercustid not between", value1, value2, "mercustid");
            return (Criteria) this;
        }

        public Criteria andRefundamtIsNull() {
            addCriterion("refundamt is null");
            return (Criteria) this;
        }

        public Criteria andRefundamtIsNotNull() {
            addCriterion("refundamt is not null");
            return (Criteria) this;
        }

        public Criteria andRefundamtEqualTo(String value) {
            addCriterion("refundamt =", value, "refundamt");
            return (Criteria) this;
        }

        public Criteria andRefundamtNotEqualTo(String value) {
            addCriterion("refundamt <>", value, "refundamt");
            return (Criteria) this;
        }

        public Criteria andRefundamtGreaterThan(String value) {
            addCriterion("refundamt >", value, "refundamt");
            return (Criteria) this;
        }

        public Criteria andRefundamtGreaterThanOrEqualTo(String value) {
            addCriterion("refundamt >=", value, "refundamt");
            return (Criteria) this;
        }

        public Criteria andRefundamtLessThan(String value) {
            addCriterion("refundamt <", value, "refundamt");
            return (Criteria) this;
        }

        public Criteria andRefundamtLessThanOrEqualTo(String value) {
            addCriterion("refundamt <=", value, "refundamt");
            return (Criteria) this;
        }

        public Criteria andRefundamtLike(String value) {
            addCriterion("refundamt like", value, "refundamt");
            return (Criteria) this;
        }

        public Criteria andRefundamtNotLike(String value) {
            addCriterion("refundamt not like", value, "refundamt");
            return (Criteria) this;
        }

        public Criteria andRefundamtIn(List<String> values) {
            addCriterion("refundamt in", values, "refundamt");
            return (Criteria) this;
        }

        public Criteria andRefundamtNotIn(List<String> values) {
            addCriterion("refundamt not in", values, "refundamt");
            return (Criteria) this;
        }

        public Criteria andRefundamtBetween(String value1, String value2) {
            addCriterion("refundamt between", value1, value2, "refundamt");
            return (Criteria) this;
        }

        public Criteria andRefundamtNotBetween(String value1, String value2) {
            addCriterion("refundamt not between", value1, value2, "refundamt");
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

        public Criteria andOriordernumIsNull() {
            addCriterion("oriordernum is null");
            return (Criteria) this;
        }

        public Criteria andOriordernumIsNotNull() {
            addCriterion("oriordernum is not null");
            return (Criteria) this;
        }

        public Criteria andOriordernumEqualTo(String value) {
            addCriterion("oriordernum =", value, "oriordernum");
            return (Criteria) this;
        }

        public Criteria andOriordernumNotEqualTo(String value) {
            addCriterion("oriordernum <>", value, "oriordernum");
            return (Criteria) this;
        }

        public Criteria andOriordernumGreaterThan(String value) {
            addCriterion("oriordernum >", value, "oriordernum");
            return (Criteria) this;
        }

        public Criteria andOriordernumGreaterThanOrEqualTo(String value) {
            addCriterion("oriordernum >=", value, "oriordernum");
            return (Criteria) this;
        }

        public Criteria andOriordernumLessThan(String value) {
            addCriterion("oriordernum <", value, "oriordernum");
            return (Criteria) this;
        }

        public Criteria andOriordernumLessThanOrEqualTo(String value) {
            addCriterion("oriordernum <=", value, "oriordernum");
            return (Criteria) this;
        }

        public Criteria andOriordernumLike(String value) {
            addCriterion("oriordernum like", value, "oriordernum");
            return (Criteria) this;
        }

        public Criteria andOriordernumNotLike(String value) {
            addCriterion("oriordernum not like", value, "oriordernum");
            return (Criteria) this;
        }

        public Criteria andOriordernumIn(List<String> values) {
            addCriterion("oriordernum in", values, "oriordernum");
            return (Criteria) this;
        }

        public Criteria andOriordernumNotIn(List<String> values) {
            addCriterion("oriordernum not in", values, "oriordernum");
            return (Criteria) this;
        }

        public Criteria andOriordernumBetween(String value1, String value2) {
            addCriterion("oriordernum between", value1, value2, "oriordernum");
            return (Criteria) this;
        }

        public Criteria andOriordernumNotBetween(String value1, String value2) {
            addCriterion("oriordernum not between", value1, value2, "oriordernum");
            return (Criteria) this;
        }

        public Criteria andOriactualtransamtIsNull() {
            addCriterion("oriactualtransamt is null");
            return (Criteria) this;
        }

        public Criteria andOriactualtransamtIsNotNull() {
            addCriterion("oriactualtransamt is not null");
            return (Criteria) this;
        }

        public Criteria andOriactualtransamtEqualTo(String value) {
            addCriterion("oriactualtransamt =", value, "oriactualtransamt");
            return (Criteria) this;
        }

        public Criteria andOriactualtransamtNotEqualTo(String value) {
            addCriterion("oriactualtransamt <>", value, "oriactualtransamt");
            return (Criteria) this;
        }

        public Criteria andOriactualtransamtGreaterThan(String value) {
            addCriterion("oriactualtransamt >", value, "oriactualtransamt");
            return (Criteria) this;
        }

        public Criteria andOriactualtransamtGreaterThanOrEqualTo(String value) {
            addCriterion("oriactualtransamt >=", value, "oriactualtransamt");
            return (Criteria) this;
        }

        public Criteria andOriactualtransamtLessThan(String value) {
            addCriterion("oriactualtransamt <", value, "oriactualtransamt");
            return (Criteria) this;
        }

        public Criteria andOriactualtransamtLessThanOrEqualTo(String value) {
            addCriterion("oriactualtransamt <=", value, "oriactualtransamt");
            return (Criteria) this;
        }

        public Criteria andOriactualtransamtLike(String value) {
            addCriterion("oriactualtransamt like", value, "oriactualtransamt");
            return (Criteria) this;
        }

        public Criteria andOriactualtransamtNotLike(String value) {
            addCriterion("oriactualtransamt not like", value, "oriactualtransamt");
            return (Criteria) this;
        }

        public Criteria andOriactualtransamtIn(List<String> values) {
            addCriterion("oriactualtransamt in", values, "oriactualtransamt");
            return (Criteria) this;
        }

        public Criteria andOriactualtransamtNotIn(List<String> values) {
            addCriterion("oriactualtransamt not in", values, "oriactualtransamt");
            return (Criteria) this;
        }

        public Criteria andOriactualtransamtBetween(String value1, String value2) {
            addCriterion("oriactualtransamt between", value1, value2, "oriactualtransamt");
            return (Criteria) this;
        }

        public Criteria andOriactualtransamtNotBetween(String value1, String value2) {
            addCriterion("oriactualtransamt not between", value1, value2, "oriactualtransamt");
            return (Criteria) this;
        }

        public Criteria andRespcodeIsNull() {
            addCriterion("respcode is null");
            return (Criteria) this;
        }

        public Criteria andRespcodeIsNotNull() {
            addCriterion("respcode is not null");
            return (Criteria) this;
        }

        public Criteria andRespcodeEqualTo(String value) {
            addCriterion("respcode =", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeNotEqualTo(String value) {
            addCriterion("respcode <>", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeGreaterThan(String value) {
            addCriterion("respcode >", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeGreaterThanOrEqualTo(String value) {
            addCriterion("respcode >=", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeLessThan(String value) {
            addCriterion("respcode <", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeLessThanOrEqualTo(String value) {
            addCriterion("respcode <=", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeLike(String value) {
            addCriterion("respcode like", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeNotLike(String value) {
            addCriterion("respcode not like", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeIn(List<String> values) {
            addCriterion("respcode in", values, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeNotIn(List<String> values) {
            addCriterion("respcode not in", values, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeBetween(String value1, String value2) {
            addCriterion("respcode between", value1, value2, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeNotBetween(String value1, String value2) {
            addCriterion("respcode not between", value1, value2, "respcode");
            return (Criteria) this;
        }

        public Criteria andTransdateIsNull() {
            addCriterion("transdate is null");
            return (Criteria) this;
        }

        public Criteria andTransdateIsNotNull() {
            addCriterion("transdate is not null");
            return (Criteria) this;
        }

        public Criteria andTransdateEqualTo(String value) {
            addCriterion("transdate =", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateNotEqualTo(String value) {
            addCriterion("transdate <>", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateGreaterThan(String value) {
            addCriterion("transdate >", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateGreaterThanOrEqualTo(String value) {
            addCriterion("transdate >=", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateLessThan(String value) {
            addCriterion("transdate <", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateLessThanOrEqualTo(String value) {
            addCriterion("transdate <=", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateLike(String value) {
            addCriterion("transdate like", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateNotLike(String value) {
            addCriterion("transdate not like", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateIn(List<String> values) {
            addCriterion("transdate in", values, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateNotIn(List<String> values) {
            addCriterion("transdate not in", values, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateBetween(String value1, String value2) {
            addCriterion("transdate between", value1, value2, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateNotBetween(String value1, String value2) {
            addCriterion("transdate not between", value1, value2, "transdate");
            return (Criteria) this;
        }

        public Criteria andMerdctamtIsNull() {
            addCriterion("merdctamt is null");
            return (Criteria) this;
        }

        public Criteria andMerdctamtIsNotNull() {
            addCriterion("merdctamt is not null");
            return (Criteria) this;
        }

        public Criteria andMerdctamtEqualTo(String value) {
            addCriterion("merdctamt =", value, "merdctamt");
            return (Criteria) this;
        }

        public Criteria andMerdctamtNotEqualTo(String value) {
            addCriterion("merdctamt <>", value, "merdctamt");
            return (Criteria) this;
        }

        public Criteria andMerdctamtGreaterThan(String value) {
            addCriterion("merdctamt >", value, "merdctamt");
            return (Criteria) this;
        }

        public Criteria andMerdctamtGreaterThanOrEqualTo(String value) {
            addCriterion("merdctamt >=", value, "merdctamt");
            return (Criteria) this;
        }

        public Criteria andMerdctamtLessThan(String value) {
            addCriterion("merdctamt <", value, "merdctamt");
            return (Criteria) this;
        }

        public Criteria andMerdctamtLessThanOrEqualTo(String value) {
            addCriterion("merdctamt <=", value, "merdctamt");
            return (Criteria) this;
        }

        public Criteria andMerdctamtLike(String value) {
            addCriterion("merdctamt like", value, "merdctamt");
            return (Criteria) this;
        }

        public Criteria andMerdctamtNotLike(String value) {
            addCriterion("merdctamt not like", value, "merdctamt");
            return (Criteria) this;
        }

        public Criteria andMerdctamtIn(List<String> values) {
            addCriterion("merdctamt in", values, "merdctamt");
            return (Criteria) this;
        }

        public Criteria andMerdctamtNotIn(List<String> values) {
            addCriterion("merdctamt not in", values, "merdctamt");
            return (Criteria) this;
        }

        public Criteria andMerdctamtBetween(String value1, String value2) {
            addCriterion("merdctamt between", value1, value2, "merdctamt");
            return (Criteria) this;
        }

        public Criteria andMerdctamtNotBetween(String value1, String value2) {
            addCriterion("merdctamt not between", value1, value2, "merdctamt");
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