package com.wkclz.demo.pojo.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DemoTypesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DemoTypesExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTypeIntIsNull() {
            addCriterion("type_int is null");
            return (Criteria) this;
        }

        public Criteria andTypeIntIsNotNull() {
            addCriterion("type_int is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIntEqualTo(Integer value) {
            addCriterion("type_int =", value, "typeInt");
            return (Criteria) this;
        }

        public Criteria andTypeIntNotEqualTo(Integer value) {
            addCriterion("type_int <>", value, "typeInt");
            return (Criteria) this;
        }

        public Criteria andTypeIntGreaterThan(Integer value) {
            addCriterion("type_int >", value, "typeInt");
            return (Criteria) this;
        }

        public Criteria andTypeIntGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_int >=", value, "typeInt");
            return (Criteria) this;
        }

        public Criteria andTypeIntLessThan(Integer value) {
            addCriterion("type_int <", value, "typeInt");
            return (Criteria) this;
        }

        public Criteria andTypeIntLessThanOrEqualTo(Integer value) {
            addCriterion("type_int <=", value, "typeInt");
            return (Criteria) this;
        }

        public Criteria andTypeIntIn(List<Integer> values) {
            addCriterion("type_int in", values, "typeInt");
            return (Criteria) this;
        }

        public Criteria andTypeIntNotIn(List<Integer> values) {
            addCriterion("type_int not in", values, "typeInt");
            return (Criteria) this;
        }

        public Criteria andTypeIntBetween(Integer value1, Integer value2) {
            addCriterion("type_int between", value1, value2, "typeInt");
            return (Criteria) this;
        }

        public Criteria andTypeIntNotBetween(Integer value1, Integer value2) {
            addCriterion("type_int not between", value1, value2, "typeInt");
            return (Criteria) this;
        }

        public Criteria andTypeBigintIsNull() {
            addCriterion("type_bigint is null");
            return (Criteria) this;
        }

        public Criteria andTypeBigintIsNotNull() {
            addCriterion("type_bigint is not null");
            return (Criteria) this;
        }

        public Criteria andTypeBigintEqualTo(Long value) {
            addCriterion("type_bigint =", value, "typeBigint");
            return (Criteria) this;
        }

        public Criteria andTypeBigintNotEqualTo(Long value) {
            addCriterion("type_bigint <>", value, "typeBigint");
            return (Criteria) this;
        }

        public Criteria andTypeBigintGreaterThan(Long value) {
            addCriterion("type_bigint >", value, "typeBigint");
            return (Criteria) this;
        }

        public Criteria andTypeBigintGreaterThanOrEqualTo(Long value) {
            addCriterion("type_bigint >=", value, "typeBigint");
            return (Criteria) this;
        }

        public Criteria andTypeBigintLessThan(Long value) {
            addCriterion("type_bigint <", value, "typeBigint");
            return (Criteria) this;
        }

        public Criteria andTypeBigintLessThanOrEqualTo(Long value) {
            addCriterion("type_bigint <=", value, "typeBigint");
            return (Criteria) this;
        }

        public Criteria andTypeBigintIn(List<Long> values) {
            addCriterion("type_bigint in", values, "typeBigint");
            return (Criteria) this;
        }

        public Criteria andTypeBigintNotIn(List<Long> values) {
            addCriterion("type_bigint not in", values, "typeBigint");
            return (Criteria) this;
        }

        public Criteria andTypeBigintBetween(Long value1, Long value2) {
            addCriterion("type_bigint between", value1, value2, "typeBigint");
            return (Criteria) this;
        }

        public Criteria andTypeBigintNotBetween(Long value1, Long value2) {
            addCriterion("type_bigint not between", value1, value2, "typeBigint");
            return (Criteria) this;
        }

        public Criteria andTypeBitIsNull() {
            addCriterion("type_bit is null");
            return (Criteria) this;
        }

        public Criteria andTypeBitIsNotNull() {
            addCriterion("type_bit is not null");
            return (Criteria) this;
        }

        public Criteria andTypeBitEqualTo(Boolean value) {
            addCriterion("type_bit =", value, "typeBit");
            return (Criteria) this;
        }

        public Criteria andTypeBitNotEqualTo(Boolean value) {
            addCriterion("type_bit <>", value, "typeBit");
            return (Criteria) this;
        }

        public Criteria andTypeBitGreaterThan(Boolean value) {
            addCriterion("type_bit >", value, "typeBit");
            return (Criteria) this;
        }

        public Criteria andTypeBitGreaterThanOrEqualTo(Boolean value) {
            addCriterion("type_bit >=", value, "typeBit");
            return (Criteria) this;
        }

        public Criteria andTypeBitLessThan(Boolean value) {
            addCriterion("type_bit <", value, "typeBit");
            return (Criteria) this;
        }

        public Criteria andTypeBitLessThanOrEqualTo(Boolean value) {
            addCriterion("type_bit <=", value, "typeBit");
            return (Criteria) this;
        }

        public Criteria andTypeBitIn(List<Boolean> values) {
            addCriterion("type_bit in", values, "typeBit");
            return (Criteria) this;
        }

        public Criteria andTypeBitNotIn(List<Boolean> values) {
            addCriterion("type_bit not in", values, "typeBit");
            return (Criteria) this;
        }

        public Criteria andTypeBitBetween(Boolean value1, Boolean value2) {
            addCriterion("type_bit between", value1, value2, "typeBit");
            return (Criteria) this;
        }

        public Criteria andTypeBitNotBetween(Boolean value1, Boolean value2) {
            addCriterion("type_bit not between", value1, value2, "typeBit");
            return (Criteria) this;
        }

        public Criteria andTypeCharIsNull() {
            addCriterion("type_char is null");
            return (Criteria) this;
        }

        public Criteria andTypeCharIsNotNull() {
            addCriterion("type_char is not null");
            return (Criteria) this;
        }

        public Criteria andTypeCharEqualTo(String value) {
            addCriterion("type_char =", value, "typeChar");
            return (Criteria) this;
        }

        public Criteria andTypeCharNotEqualTo(String value) {
            addCriterion("type_char <>", value, "typeChar");
            return (Criteria) this;
        }

        public Criteria andTypeCharGreaterThan(String value) {
            addCriterion("type_char >", value, "typeChar");
            return (Criteria) this;
        }

        public Criteria andTypeCharGreaterThanOrEqualTo(String value) {
            addCriterion("type_char >=", value, "typeChar");
            return (Criteria) this;
        }

        public Criteria andTypeCharLessThan(String value) {
            addCriterion("type_char <", value, "typeChar");
            return (Criteria) this;
        }

        public Criteria andTypeCharLessThanOrEqualTo(String value) {
            addCriterion("type_char <=", value, "typeChar");
            return (Criteria) this;
        }

        public Criteria andTypeCharLike(String value) {
            addCriterion("type_char like", value, "typeChar");
            return (Criteria) this;
        }

        public Criteria andTypeCharNotLike(String value) {
            addCriterion("type_char not like", value, "typeChar");
            return (Criteria) this;
        }

        public Criteria andTypeCharIn(List<String> values) {
            addCriterion("type_char in", values, "typeChar");
            return (Criteria) this;
        }

        public Criteria andTypeCharNotIn(List<String> values) {
            addCriterion("type_char not in", values, "typeChar");
            return (Criteria) this;
        }

        public Criteria andTypeCharBetween(String value1, String value2) {
            addCriterion("type_char between", value1, value2, "typeChar");
            return (Criteria) this;
        }

        public Criteria andTypeCharNotBetween(String value1, String value2) {
            addCriterion("type_char not between", value1, value2, "typeChar");
            return (Criteria) this;
        }

        public Criteria andTypeDateIsNull() {
            addCriterion("type_date is null");
            return (Criteria) this;
        }

        public Criteria andTypeDateIsNotNull() {
            addCriterion("type_date is not null");
            return (Criteria) this;
        }

        public Criteria andTypeDateEqualTo(Date value) {
            addCriterionForJDBCDate("type_date =", value, "typeDate");
            return (Criteria) this;
        }

        public Criteria andTypeDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("type_date <>", value, "typeDate");
            return (Criteria) this;
        }

        public Criteria andTypeDateGreaterThan(Date value) {
            addCriterionForJDBCDate("type_date >", value, "typeDate");
            return (Criteria) this;
        }

        public Criteria andTypeDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("type_date >=", value, "typeDate");
            return (Criteria) this;
        }

        public Criteria andTypeDateLessThan(Date value) {
            addCriterionForJDBCDate("type_date <", value, "typeDate");
            return (Criteria) this;
        }

        public Criteria andTypeDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("type_date <=", value, "typeDate");
            return (Criteria) this;
        }

        public Criteria andTypeDateIn(List<Date> values) {
            addCriterionForJDBCDate("type_date in", values, "typeDate");
            return (Criteria) this;
        }

        public Criteria andTypeDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("type_date not in", values, "typeDate");
            return (Criteria) this;
        }

        public Criteria andTypeDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("type_date between", value1, value2, "typeDate");
            return (Criteria) this;
        }

        public Criteria andTypeDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("type_date not between", value1, value2, "typeDate");
            return (Criteria) this;
        }

        public Criteria andTypeDatetimeIsNull() {
            addCriterion("type_datetime is null");
            return (Criteria) this;
        }

        public Criteria andTypeDatetimeIsNotNull() {
            addCriterion("type_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andTypeDatetimeEqualTo(Date value) {
            addCriterion("type_datetime =", value, "typeDatetime");
            return (Criteria) this;
        }

        public Criteria andTypeDatetimeNotEqualTo(Date value) {
            addCriterion("type_datetime <>", value, "typeDatetime");
            return (Criteria) this;
        }

        public Criteria andTypeDatetimeGreaterThan(Date value) {
            addCriterion("type_datetime >", value, "typeDatetime");
            return (Criteria) this;
        }

        public Criteria andTypeDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("type_datetime >=", value, "typeDatetime");
            return (Criteria) this;
        }

        public Criteria andTypeDatetimeLessThan(Date value) {
            addCriterion("type_datetime <", value, "typeDatetime");
            return (Criteria) this;
        }

        public Criteria andTypeDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("type_datetime <=", value, "typeDatetime");
            return (Criteria) this;
        }

        public Criteria andTypeDatetimeIn(List<Date> values) {
            addCriterion("type_datetime in", values, "typeDatetime");
            return (Criteria) this;
        }

        public Criteria andTypeDatetimeNotIn(List<Date> values) {
            addCriterion("type_datetime not in", values, "typeDatetime");
            return (Criteria) this;
        }

        public Criteria andTypeDatetimeBetween(Date value1, Date value2) {
            addCriterion("type_datetime between", value1, value2, "typeDatetime");
            return (Criteria) this;
        }

        public Criteria andTypeDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("type_datetime not between", value1, value2, "typeDatetime");
            return (Criteria) this;
        }

        public Criteria andTypeDecimalIsNull() {
            addCriterion("type_decimal is null");
            return (Criteria) this;
        }

        public Criteria andTypeDecimalIsNotNull() {
            addCriterion("type_decimal is not null");
            return (Criteria) this;
        }

        public Criteria andTypeDecimalEqualTo(BigDecimal value) {
            addCriterion("type_decimal =", value, "typeDecimal");
            return (Criteria) this;
        }

        public Criteria andTypeDecimalNotEqualTo(BigDecimal value) {
            addCriterion("type_decimal <>", value, "typeDecimal");
            return (Criteria) this;
        }

        public Criteria andTypeDecimalGreaterThan(BigDecimal value) {
            addCriterion("type_decimal >", value, "typeDecimal");
            return (Criteria) this;
        }

        public Criteria andTypeDecimalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("type_decimal >=", value, "typeDecimal");
            return (Criteria) this;
        }

        public Criteria andTypeDecimalLessThan(BigDecimal value) {
            addCriterion("type_decimal <", value, "typeDecimal");
            return (Criteria) this;
        }

        public Criteria andTypeDecimalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("type_decimal <=", value, "typeDecimal");
            return (Criteria) this;
        }

        public Criteria andTypeDecimalIn(List<BigDecimal> values) {
            addCriterion("type_decimal in", values, "typeDecimal");
            return (Criteria) this;
        }

        public Criteria andTypeDecimalNotIn(List<BigDecimal> values) {
            addCriterion("type_decimal not in", values, "typeDecimal");
            return (Criteria) this;
        }

        public Criteria andTypeDecimalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("type_decimal between", value1, value2, "typeDecimal");
            return (Criteria) this;
        }

        public Criteria andTypeDecimalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("type_decimal not between", value1, value2, "typeDecimal");
            return (Criteria) this;
        }

        public Criteria andTypeDoubleIsNull() {
            addCriterion("type_double is null");
            return (Criteria) this;
        }

        public Criteria andTypeDoubleIsNotNull() {
            addCriterion("type_double is not null");
            return (Criteria) this;
        }

        public Criteria andTypeDoubleEqualTo(Double value) {
            addCriterion("type_double =", value, "typeDouble");
            return (Criteria) this;
        }

        public Criteria andTypeDoubleNotEqualTo(Double value) {
            addCriterion("type_double <>", value, "typeDouble");
            return (Criteria) this;
        }

        public Criteria andTypeDoubleGreaterThan(Double value) {
            addCriterion("type_double >", value, "typeDouble");
            return (Criteria) this;
        }

        public Criteria andTypeDoubleGreaterThanOrEqualTo(Double value) {
            addCriterion("type_double >=", value, "typeDouble");
            return (Criteria) this;
        }

        public Criteria andTypeDoubleLessThan(Double value) {
            addCriterion("type_double <", value, "typeDouble");
            return (Criteria) this;
        }

        public Criteria andTypeDoubleLessThanOrEqualTo(Double value) {
            addCriterion("type_double <=", value, "typeDouble");
            return (Criteria) this;
        }

        public Criteria andTypeDoubleIn(List<Double> values) {
            addCriterion("type_double in", values, "typeDouble");
            return (Criteria) this;
        }

        public Criteria andTypeDoubleNotIn(List<Double> values) {
            addCriterion("type_double not in", values, "typeDouble");
            return (Criteria) this;
        }

        public Criteria andTypeDoubleBetween(Double value1, Double value2) {
            addCriterion("type_double between", value1, value2, "typeDouble");
            return (Criteria) this;
        }

        public Criteria andTypeDoubleNotBetween(Double value1, Double value2) {
            addCriterion("type_double not between", value1, value2, "typeDouble");
            return (Criteria) this;
        }

        public Criteria andTypeFloatIsNull() {
            addCriterion("type_float is null");
            return (Criteria) this;
        }

        public Criteria andTypeFloatIsNotNull() {
            addCriterion("type_float is not null");
            return (Criteria) this;
        }

        public Criteria andTypeFloatEqualTo(Float value) {
            addCriterion("type_float =", value, "typeFloat");
            return (Criteria) this;
        }

        public Criteria andTypeFloatNotEqualTo(Float value) {
            addCriterion("type_float <>", value, "typeFloat");
            return (Criteria) this;
        }

        public Criteria andTypeFloatGreaterThan(Float value) {
            addCriterion("type_float >", value, "typeFloat");
            return (Criteria) this;
        }

        public Criteria andTypeFloatGreaterThanOrEqualTo(Float value) {
            addCriterion("type_float >=", value, "typeFloat");
            return (Criteria) this;
        }

        public Criteria andTypeFloatLessThan(Float value) {
            addCriterion("type_float <", value, "typeFloat");
            return (Criteria) this;
        }

        public Criteria andTypeFloatLessThanOrEqualTo(Float value) {
            addCriterion("type_float <=", value, "typeFloat");
            return (Criteria) this;
        }

        public Criteria andTypeFloatIn(List<Float> values) {
            addCriterion("type_float in", values, "typeFloat");
            return (Criteria) this;
        }

        public Criteria andTypeFloatNotIn(List<Float> values) {
            addCriterion("type_float not in", values, "typeFloat");
            return (Criteria) this;
        }

        public Criteria andTypeFloatBetween(Float value1, Float value2) {
            addCriterion("type_float between", value1, value2, "typeFloat");
            return (Criteria) this;
        }

        public Criteria andTypeFloatNotBetween(Float value1, Float value2) {
            addCriterion("type_float not between", value1, value2, "typeFloat");
            return (Criteria) this;
        }

        public Criteria andTypeIntegerIsNull() {
            addCriterion("type_integer is null");
            return (Criteria) this;
        }

        public Criteria andTypeIntegerIsNotNull() {
            addCriterion("type_integer is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIntegerEqualTo(Integer value) {
            addCriterion("type_integer =", value, "typeInteger");
            return (Criteria) this;
        }

        public Criteria andTypeIntegerNotEqualTo(Integer value) {
            addCriterion("type_integer <>", value, "typeInteger");
            return (Criteria) this;
        }

        public Criteria andTypeIntegerGreaterThan(Integer value) {
            addCriterion("type_integer >", value, "typeInteger");
            return (Criteria) this;
        }

        public Criteria andTypeIntegerGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_integer >=", value, "typeInteger");
            return (Criteria) this;
        }

        public Criteria andTypeIntegerLessThan(Integer value) {
            addCriterion("type_integer <", value, "typeInteger");
            return (Criteria) this;
        }

        public Criteria andTypeIntegerLessThanOrEqualTo(Integer value) {
            addCriterion("type_integer <=", value, "typeInteger");
            return (Criteria) this;
        }

        public Criteria andTypeIntegerIn(List<Integer> values) {
            addCriterion("type_integer in", values, "typeInteger");
            return (Criteria) this;
        }

        public Criteria andTypeIntegerNotIn(List<Integer> values) {
            addCriterion("type_integer not in", values, "typeInteger");
            return (Criteria) this;
        }

        public Criteria andTypeIntegerBetween(Integer value1, Integer value2) {
            addCriterion("type_integer between", value1, value2, "typeInteger");
            return (Criteria) this;
        }

        public Criteria andTypeIntegerNotBetween(Integer value1, Integer value2) {
            addCriterion("type_integer not between", value1, value2, "typeInteger");
            return (Criteria) this;
        }

        public Criteria andTypeMediumintIsNull() {
            addCriterion("type_mediumint is null");
            return (Criteria) this;
        }

        public Criteria andTypeMediumintIsNotNull() {
            addCriterion("type_mediumint is not null");
            return (Criteria) this;
        }

        public Criteria andTypeMediumintEqualTo(Integer value) {
            addCriterion("type_mediumint =", value, "typeMediumint");
            return (Criteria) this;
        }

        public Criteria andTypeMediumintNotEqualTo(Integer value) {
            addCriterion("type_mediumint <>", value, "typeMediumint");
            return (Criteria) this;
        }

        public Criteria andTypeMediumintGreaterThan(Integer value) {
            addCriterion("type_mediumint >", value, "typeMediumint");
            return (Criteria) this;
        }

        public Criteria andTypeMediumintGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_mediumint >=", value, "typeMediumint");
            return (Criteria) this;
        }

        public Criteria andTypeMediumintLessThan(Integer value) {
            addCriterion("type_mediumint <", value, "typeMediumint");
            return (Criteria) this;
        }

        public Criteria andTypeMediumintLessThanOrEqualTo(Integer value) {
            addCriterion("type_mediumint <=", value, "typeMediumint");
            return (Criteria) this;
        }

        public Criteria andTypeMediumintIn(List<Integer> values) {
            addCriterion("type_mediumint in", values, "typeMediumint");
            return (Criteria) this;
        }

        public Criteria andTypeMediumintNotIn(List<Integer> values) {
            addCriterion("type_mediumint not in", values, "typeMediumint");
            return (Criteria) this;
        }

        public Criteria andTypeMediumintBetween(Integer value1, Integer value2) {
            addCriterion("type_mediumint between", value1, value2, "typeMediumint");
            return (Criteria) this;
        }

        public Criteria andTypeMediumintNotBetween(Integer value1, Integer value2) {
            addCriterion("type_mediumint not between", value1, value2, "typeMediumint");
            return (Criteria) this;
        }

        public Criteria andTypeNumericIsNull() {
            addCriterion("type_numeric is null");
            return (Criteria) this;
        }

        public Criteria andTypeNumericIsNotNull() {
            addCriterion("type_numeric is not null");
            return (Criteria) this;
        }

        public Criteria andTypeNumericEqualTo(BigDecimal value) {
            addCriterion("type_numeric =", value, "typeNumeric");
            return (Criteria) this;
        }

        public Criteria andTypeNumericNotEqualTo(BigDecimal value) {
            addCriterion("type_numeric <>", value, "typeNumeric");
            return (Criteria) this;
        }

        public Criteria andTypeNumericGreaterThan(BigDecimal value) {
            addCriterion("type_numeric >", value, "typeNumeric");
            return (Criteria) this;
        }

        public Criteria andTypeNumericGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("type_numeric >=", value, "typeNumeric");
            return (Criteria) this;
        }

        public Criteria andTypeNumericLessThan(BigDecimal value) {
            addCriterion("type_numeric <", value, "typeNumeric");
            return (Criteria) this;
        }

        public Criteria andTypeNumericLessThanOrEqualTo(BigDecimal value) {
            addCriterion("type_numeric <=", value, "typeNumeric");
            return (Criteria) this;
        }

        public Criteria andTypeNumericIn(List<BigDecimal> values) {
            addCriterion("type_numeric in", values, "typeNumeric");
            return (Criteria) this;
        }

        public Criteria andTypeNumericNotIn(List<BigDecimal> values) {
            addCriterion("type_numeric not in", values, "typeNumeric");
            return (Criteria) this;
        }

        public Criteria andTypeNumericBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("type_numeric between", value1, value2, "typeNumeric");
            return (Criteria) this;
        }

        public Criteria andTypeNumericNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("type_numeric not between", value1, value2, "typeNumeric");
            return (Criteria) this;
        }

        public Criteria andTypeRealIsNull() {
            addCriterion("type_real is null");
            return (Criteria) this;
        }

        public Criteria andTypeRealIsNotNull() {
            addCriterion("type_real is not null");
            return (Criteria) this;
        }

        public Criteria andTypeRealEqualTo(Double value) {
            addCriterion("type_real =", value, "typeReal");
            return (Criteria) this;
        }

        public Criteria andTypeRealNotEqualTo(Double value) {
            addCriterion("type_real <>", value, "typeReal");
            return (Criteria) this;
        }

        public Criteria andTypeRealGreaterThan(Double value) {
            addCriterion("type_real >", value, "typeReal");
            return (Criteria) this;
        }

        public Criteria andTypeRealGreaterThanOrEqualTo(Double value) {
            addCriterion("type_real >=", value, "typeReal");
            return (Criteria) this;
        }

        public Criteria andTypeRealLessThan(Double value) {
            addCriterion("type_real <", value, "typeReal");
            return (Criteria) this;
        }

        public Criteria andTypeRealLessThanOrEqualTo(Double value) {
            addCriterion("type_real <=", value, "typeReal");
            return (Criteria) this;
        }

        public Criteria andTypeRealIn(List<Double> values) {
            addCriterion("type_real in", values, "typeReal");
            return (Criteria) this;
        }

        public Criteria andTypeRealNotIn(List<Double> values) {
            addCriterion("type_real not in", values, "typeReal");
            return (Criteria) this;
        }

        public Criteria andTypeRealBetween(Double value1, Double value2) {
            addCriterion("type_real between", value1, value2, "typeReal");
            return (Criteria) this;
        }

        public Criteria andTypeRealNotBetween(Double value1, Double value2) {
            addCriterion("type_real not between", value1, value2, "typeReal");
            return (Criteria) this;
        }

        public Criteria andTypeTimeIsNull() {
            addCriterion("type_time is null");
            return (Criteria) this;
        }

        public Criteria andTypeTimeIsNotNull() {
            addCriterion("type_time is not null");
            return (Criteria) this;
        }

        public Criteria andTypeTimeEqualTo(Date value) {
            addCriterionForJDBCTime("type_time =", value, "typeTime");
            return (Criteria) this;
        }

        public Criteria andTypeTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("type_time <>", value, "typeTime");
            return (Criteria) this;
        }

        public Criteria andTypeTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("type_time >", value, "typeTime");
            return (Criteria) this;
        }

        public Criteria andTypeTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("type_time >=", value, "typeTime");
            return (Criteria) this;
        }

        public Criteria andTypeTimeLessThan(Date value) {
            addCriterionForJDBCTime("type_time <", value, "typeTime");
            return (Criteria) this;
        }

        public Criteria andTypeTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("type_time <=", value, "typeTime");
            return (Criteria) this;
        }

        public Criteria andTypeTimeIn(List<Date> values) {
            addCriterionForJDBCTime("type_time in", values, "typeTime");
            return (Criteria) this;
        }

        public Criteria andTypeTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("type_time not in", values, "typeTime");
            return (Criteria) this;
        }

        public Criteria andTypeTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("type_time between", value1, value2, "typeTime");
            return (Criteria) this;
        }

        public Criteria andTypeTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("type_time not between", value1, value2, "typeTime");
            return (Criteria) this;
        }

        public Criteria andTypeTimestampIsNull() {
            addCriterion("type_timestamp is null");
            return (Criteria) this;
        }

        public Criteria andTypeTimestampIsNotNull() {
            addCriterion("type_timestamp is not null");
            return (Criteria) this;
        }

        public Criteria andTypeTimestampEqualTo(Date value) {
            addCriterion("type_timestamp =", value, "typeTimestamp");
            return (Criteria) this;
        }

        public Criteria andTypeTimestampNotEqualTo(Date value) {
            addCriterion("type_timestamp <>", value, "typeTimestamp");
            return (Criteria) this;
        }

        public Criteria andTypeTimestampGreaterThan(Date value) {
            addCriterion("type_timestamp >", value, "typeTimestamp");
            return (Criteria) this;
        }

        public Criteria andTypeTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("type_timestamp >=", value, "typeTimestamp");
            return (Criteria) this;
        }

        public Criteria andTypeTimestampLessThan(Date value) {
            addCriterion("type_timestamp <", value, "typeTimestamp");
            return (Criteria) this;
        }

        public Criteria andTypeTimestampLessThanOrEqualTo(Date value) {
            addCriterion("type_timestamp <=", value, "typeTimestamp");
            return (Criteria) this;
        }

        public Criteria andTypeTimestampIn(List<Date> values) {
            addCriterion("type_timestamp in", values, "typeTimestamp");
            return (Criteria) this;
        }

        public Criteria andTypeTimestampNotIn(List<Date> values) {
            addCriterion("type_timestamp not in", values, "typeTimestamp");
            return (Criteria) this;
        }

        public Criteria andTypeTimestampBetween(Date value1, Date value2) {
            addCriterion("type_timestamp between", value1, value2, "typeTimestamp");
            return (Criteria) this;
        }

        public Criteria andTypeTimestampNotBetween(Date value1, Date value2) {
            addCriterion("type_timestamp not between", value1, value2, "typeTimestamp");
            return (Criteria) this;
        }

        public Criteria andTypeTinyintIsNull() {
            addCriterion("type_tinyint is null");
            return (Criteria) this;
        }

        public Criteria andTypeTinyintIsNotNull() {
            addCriterion("type_tinyint is not null");
            return (Criteria) this;
        }

        public Criteria andTypeTinyintEqualTo(Byte value) {
            addCriterion("type_tinyint =", value, "typeTinyint");
            return (Criteria) this;
        }

        public Criteria andTypeTinyintNotEqualTo(Byte value) {
            addCriterion("type_tinyint <>", value, "typeTinyint");
            return (Criteria) this;
        }

        public Criteria andTypeTinyintGreaterThan(Byte value) {
            addCriterion("type_tinyint >", value, "typeTinyint");
            return (Criteria) this;
        }

        public Criteria andTypeTinyintGreaterThanOrEqualTo(Byte value) {
            addCriterion("type_tinyint >=", value, "typeTinyint");
            return (Criteria) this;
        }

        public Criteria andTypeTinyintLessThan(Byte value) {
            addCriterion("type_tinyint <", value, "typeTinyint");
            return (Criteria) this;
        }

        public Criteria andTypeTinyintLessThanOrEqualTo(Byte value) {
            addCriterion("type_tinyint <=", value, "typeTinyint");
            return (Criteria) this;
        }

        public Criteria andTypeTinyintIn(List<Byte> values) {
            addCriterion("type_tinyint in", values, "typeTinyint");
            return (Criteria) this;
        }

        public Criteria andTypeTinyintNotIn(List<Byte> values) {
            addCriterion("type_tinyint not in", values, "typeTinyint");
            return (Criteria) this;
        }

        public Criteria andTypeTinyintBetween(Byte value1, Byte value2) {
            addCriterion("type_tinyint between", value1, value2, "typeTinyint");
            return (Criteria) this;
        }

        public Criteria andTypeTinyintNotBetween(Byte value1, Byte value2) {
            addCriterion("type_tinyint not between", value1, value2, "typeTinyint");
            return (Criteria) this;
        }

        public Criteria andTypeTinytextIsNull() {
            addCriterion("type_tinytext is null");
            return (Criteria) this;
        }

        public Criteria andTypeTinytextIsNotNull() {
            addCriterion("type_tinytext is not null");
            return (Criteria) this;
        }

        public Criteria andTypeTinytextEqualTo(String value) {
            addCriterion("type_tinytext =", value, "typeTinytext");
            return (Criteria) this;
        }

        public Criteria andTypeTinytextNotEqualTo(String value) {
            addCriterion("type_tinytext <>", value, "typeTinytext");
            return (Criteria) this;
        }

        public Criteria andTypeTinytextGreaterThan(String value) {
            addCriterion("type_tinytext >", value, "typeTinytext");
            return (Criteria) this;
        }

        public Criteria andTypeTinytextGreaterThanOrEqualTo(String value) {
            addCriterion("type_tinytext >=", value, "typeTinytext");
            return (Criteria) this;
        }

        public Criteria andTypeTinytextLessThan(String value) {
            addCriterion("type_tinytext <", value, "typeTinytext");
            return (Criteria) this;
        }

        public Criteria andTypeTinytextLessThanOrEqualTo(String value) {
            addCriterion("type_tinytext <=", value, "typeTinytext");
            return (Criteria) this;
        }

        public Criteria andTypeTinytextLike(String value) {
            addCriterion("type_tinytext like", value, "typeTinytext");
            return (Criteria) this;
        }

        public Criteria andTypeTinytextNotLike(String value) {
            addCriterion("type_tinytext not like", value, "typeTinytext");
            return (Criteria) this;
        }

        public Criteria andTypeTinytextIn(List<String> values) {
            addCriterion("type_tinytext in", values, "typeTinytext");
            return (Criteria) this;
        }

        public Criteria andTypeTinytextNotIn(List<String> values) {
            addCriterion("type_tinytext not in", values, "typeTinytext");
            return (Criteria) this;
        }

        public Criteria andTypeTinytextBetween(String value1, String value2) {
            addCriterion("type_tinytext between", value1, value2, "typeTinytext");
            return (Criteria) this;
        }

        public Criteria andTypeTinytextNotBetween(String value1, String value2) {
            addCriterion("type_tinytext not between", value1, value2, "typeTinytext");
            return (Criteria) this;
        }

        public Criteria andTypeVarcharIsNull() {
            addCriterion("type_varchar is null");
            return (Criteria) this;
        }

        public Criteria andTypeVarcharIsNotNull() {
            addCriterion("type_varchar is not null");
            return (Criteria) this;
        }

        public Criteria andTypeVarcharEqualTo(String value) {
            addCriterion("type_varchar =", value, "typeVarchar");
            return (Criteria) this;
        }

        public Criteria andTypeVarcharNotEqualTo(String value) {
            addCriterion("type_varchar <>", value, "typeVarchar");
            return (Criteria) this;
        }

        public Criteria andTypeVarcharGreaterThan(String value) {
            addCriterion("type_varchar >", value, "typeVarchar");
            return (Criteria) this;
        }

        public Criteria andTypeVarcharGreaterThanOrEqualTo(String value) {
            addCriterion("type_varchar >=", value, "typeVarchar");
            return (Criteria) this;
        }

        public Criteria andTypeVarcharLessThan(String value) {
            addCriterion("type_varchar <", value, "typeVarchar");
            return (Criteria) this;
        }

        public Criteria andTypeVarcharLessThanOrEqualTo(String value) {
            addCriterion("type_varchar <=", value, "typeVarchar");
            return (Criteria) this;
        }

        public Criteria andTypeVarcharLike(String value) {
            addCriterion("type_varchar like", value, "typeVarchar");
            return (Criteria) this;
        }

        public Criteria andTypeVarcharNotLike(String value) {
            addCriterion("type_varchar not like", value, "typeVarchar");
            return (Criteria) this;
        }

        public Criteria andTypeVarcharIn(List<String> values) {
            addCriterion("type_varchar in", values, "typeVarchar");
            return (Criteria) this;
        }

        public Criteria andTypeVarcharNotIn(List<String> values) {
            addCriterion("type_varchar not in", values, "typeVarchar");
            return (Criteria) this;
        }

        public Criteria andTypeVarcharBetween(String value1, String value2) {
            addCriterion("type_varchar between", value1, value2, "typeVarchar");
            return (Criteria) this;
        }

        public Criteria andTypeVarcharNotBetween(String value1, String value2) {
            addCriterion("type_varchar not between", value1, value2, "typeVarchar");
            return (Criteria) this;
        }

        public Criteria andTypeYearIsNull() {
            addCriterion("type_year is null");
            return (Criteria) this;
        }

        public Criteria andTypeYearIsNotNull() {
            addCriterion("type_year is not null");
            return (Criteria) this;
        }

        public Criteria andTypeYearEqualTo(Date value) {
            addCriterionForJDBCDate("type_year =", value, "typeYear");
            return (Criteria) this;
        }

        public Criteria andTypeYearNotEqualTo(Date value) {
            addCriterionForJDBCDate("type_year <>", value, "typeYear");
            return (Criteria) this;
        }

        public Criteria andTypeYearGreaterThan(Date value) {
            addCriterionForJDBCDate("type_year >", value, "typeYear");
            return (Criteria) this;
        }

        public Criteria andTypeYearGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("type_year >=", value, "typeYear");
            return (Criteria) this;
        }

        public Criteria andTypeYearLessThan(Date value) {
            addCriterionForJDBCDate("type_year <", value, "typeYear");
            return (Criteria) this;
        }

        public Criteria andTypeYearLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("type_year <=", value, "typeYear");
            return (Criteria) this;
        }

        public Criteria andTypeYearIn(List<Date> values) {
            addCriterionForJDBCDate("type_year in", values, "typeYear");
            return (Criteria) this;
        }

        public Criteria andTypeYearNotIn(List<Date> values) {
            addCriterionForJDBCDate("type_year not in", values, "typeYear");
            return (Criteria) this;
        }

        public Criteria andTypeYearBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("type_year between", value1, value2, "typeYear");
            return (Criteria) this;
        }

        public Criteria andTypeYearNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("type_year not between", value1, value2, "typeYear");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(Long value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(Long value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(Long value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(Long value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(Long value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(Long value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<Long> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<Long> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(Long value1, Long value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(Long value1, Long value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(Long value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(Long value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(Long value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(Long value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(Long value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(Long value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<Long> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<Long> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(Long value1, Long value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(Long value1, Long value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNull() {
            addCriterion("comments is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNotNull() {
            addCriterion("comments is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsEqualTo(String value) {
            addCriterion("comments =", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotEqualTo(String value) {
            addCriterion("comments <>", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThan(String value) {
            addCriterion("comments >", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("comments >=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThan(String value) {
            addCriterion("comments <", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThanOrEqualTo(String value) {
            addCriterion("comments <=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLike(String value) {
            addCriterion("comments like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotLike(String value) {
            addCriterion("comments not like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsIn(List<String> values) {
            addCriterion("comments in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotIn(List<String> values) {
            addCriterion("comments not in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsBetween(String value1, String value2) {
            addCriterion("comments between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotBetween(String value1, String value2) {
            addCriterion("comments not between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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