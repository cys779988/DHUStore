package com.dhu.demo2.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StoreCartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreCartExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andProductidIsNull() {
            addCriterion("productid is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("productid is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(Integer value) {
            addCriterion("productid =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(Integer value) {
            addCriterion("productid <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(Integer value) {
            addCriterion("productid >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(Integer value) {
            addCriterion("productid >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(Integer value) {
            addCriterion("productid <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(Integer value) {
            addCriterion("productid <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<Integer> values) {
            addCriterion("productid in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<Integer> values) {
            addCriterion("productid not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(Integer value1, Integer value2) {
            addCriterion("productid between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(Integer value1, Integer value2) {
            addCriterion("productid not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andCatedateIsNull() {
            addCriterion("cateDate is null");
            return (Criteria) this;
        }

        public Criteria andCatedateIsNotNull() {
            addCriterion("cateDate is not null");
            return (Criteria) this;
        }

        public Criteria andCatedateEqualTo(Date value) {
            addCriterion("cateDate =", value, "catedate");
            return (Criteria) this;
        }

        public Criteria andCatedateNotEqualTo(Date value) {
            addCriterion("cateDate <>", value, "catedate");
            return (Criteria) this;
        }

        public Criteria andCatedateGreaterThan(Date value) {
            addCriterion("cateDate >", value, "catedate");
            return (Criteria) this;
        }

        public Criteria andCatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("cateDate >=", value, "catedate");
            return (Criteria) this;
        }

        public Criteria andCatedateLessThan(Date value) {
            addCriterion("cateDate <", value, "catedate");
            return (Criteria) this;
        }

        public Criteria andCatedateLessThanOrEqualTo(Date value) {
            addCriterion("cateDate <=", value, "catedate");
            return (Criteria) this;
        }

        public Criteria andCatedateIn(List<Date> values) {
            addCriterion("cateDate in", values, "catedate");
            return (Criteria) this;
        }

        public Criteria andCatedateNotIn(List<Date> values) {
            addCriterion("cateDate not in", values, "catedate");
            return (Criteria) this;
        }

        public Criteria andCatedateBetween(Date value1, Date value2) {
            addCriterion("cateDate between", value1, value2, "catedate");
            return (Criteria) this;
        }

        public Criteria andCatedateNotBetween(Date value1, Date value2) {
            addCriterion("cateDate not between", value1, value2, "catedate");
            return (Criteria) this;
        }

        public Criteria andProductnumIsNull() {
            addCriterion("productNum is null");
            return (Criteria) this;
        }

        public Criteria andProductnumIsNotNull() {
            addCriterion("productNum is not null");
            return (Criteria) this;
        }

        public Criteria andProductnumEqualTo(Integer value) {
            addCriterion("productNum =", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumNotEqualTo(Integer value) {
            addCriterion("productNum <>", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumGreaterThan(Integer value) {
            addCriterion("productNum >", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("productNum >=", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumLessThan(Integer value) {
            addCriterion("productNum <", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumLessThanOrEqualTo(Integer value) {
            addCriterion("productNum <=", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumIn(List<Integer> values) {
            addCriterion("productNum in", values, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumNotIn(List<Integer> values) {
            addCriterion("productNum not in", values, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumBetween(Integer value1, Integer value2) {
            addCriterion("productNum between", value1, value2, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumNotBetween(Integer value1, Integer value2) {
            addCriterion("productNum not between", value1, value2, "productnum");
            return (Criteria) this;
        }

        public Criteria andSelleridIsNull() {
            addCriterion("sellerId is null");
            return (Criteria) this;
        }

        public Criteria andSelleridIsNotNull() {
            addCriterion("sellerId is not null");
            return (Criteria) this;
        }

        public Criteria andSelleridEqualTo(Integer value) {
            addCriterion("sellerId =", value, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridNotEqualTo(Integer value) {
            addCriterion("sellerId <>", value, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridGreaterThan(Integer value) {
            addCriterion("sellerId >", value, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridGreaterThanOrEqualTo(Integer value) {
            addCriterion("sellerId >=", value, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridLessThan(Integer value) {
            addCriterion("sellerId <", value, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridLessThanOrEqualTo(Integer value) {
            addCriterion("sellerId <=", value, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridIn(List<Integer> values) {
            addCriterion("sellerId in", values, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridNotIn(List<Integer> values) {
            addCriterion("sellerId not in", values, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridBetween(Integer value1, Integer value2) {
            addCriterion("sellerId between", value1, value2, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridNotBetween(Integer value1, Integer value2) {
            addCriterion("sellerId not between", value1, value2, "sellerid");
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