package com.yx.tp.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andUserFaceImageIsNull() {
            addCriterion("user_face_image is null");
            return (Criteria) this;
        }

        public Criteria andUserFaceImageIsNotNull() {
            addCriterion("user_face_image is not null");
            return (Criteria) this;
        }

        public Criteria andUserFaceImageEqualTo(String value) {
            addCriterion("user_face_image =", value, "userFaceImage");
            return (Criteria) this;
        }

        public Criteria andUserFaceImageNotEqualTo(String value) {
            addCriterion("user_face_image <>", value, "userFaceImage");
            return (Criteria) this;
        }

        public Criteria andUserFaceImageGreaterThan(String value) {
            addCriterion("user_face_image >", value, "userFaceImage");
            return (Criteria) this;
        }

        public Criteria andUserFaceImageGreaterThanOrEqualTo(String value) {
            addCriterion("user_face_image >=", value, "userFaceImage");
            return (Criteria) this;
        }

        public Criteria andUserFaceImageLessThan(String value) {
            addCriterion("user_face_image <", value, "userFaceImage");
            return (Criteria) this;
        }

        public Criteria andUserFaceImageLessThanOrEqualTo(String value) {
            addCriterion("user_face_image <=", value, "userFaceImage");
            return (Criteria) this;
        }

        public Criteria andUserFaceImageLike(String value) {
            addCriterion("user_face_image like", value, "userFaceImage");
            return (Criteria) this;
        }

        public Criteria andUserFaceImageNotLike(String value) {
            addCriterion("user_face_image not like", value, "userFaceImage");
            return (Criteria) this;
        }

        public Criteria andUserFaceImageIn(List<String> values) {
            addCriterion("user_face_image in", values, "userFaceImage");
            return (Criteria) this;
        }

        public Criteria andUserFaceImageNotIn(List<String> values) {
            addCriterion("user_face_image not in", values, "userFaceImage");
            return (Criteria) this;
        }

        public Criteria andUserFaceImageBetween(String value1, String value2) {
            addCriterion("user_face_image between", value1, value2, "userFaceImage");
            return (Criteria) this;
        }

        public Criteria andUserFaceImageNotBetween(String value1, String value2) {
            addCriterion("user_face_image not between", value1, value2, "userFaceImage");
            return (Criteria) this;
        }

        public Criteria andUserFaceImageBigIsNull() {
            addCriterion("user_face_image_big is null");
            return (Criteria) this;
        }

        public Criteria andUserFaceImageBigIsNotNull() {
            addCriterion("user_face_image_big is not null");
            return (Criteria) this;
        }

        public Criteria andUserFaceImageBigEqualTo(String value) {
            addCriterion("user_face_image_big =", value, "userFaceImageBig");
            return (Criteria) this;
        }

        public Criteria andUserFaceImageBigNotEqualTo(String value) {
            addCriterion("user_face_image_big <>", value, "userFaceImageBig");
            return (Criteria) this;
        }

        public Criteria andUserFaceImageBigGreaterThan(String value) {
            addCriterion("user_face_image_big >", value, "userFaceImageBig");
            return (Criteria) this;
        }

        public Criteria andUserFaceImageBigGreaterThanOrEqualTo(String value) {
            addCriterion("user_face_image_big >=", value, "userFaceImageBig");
            return (Criteria) this;
        }

        public Criteria andUserFaceImageBigLessThan(String value) {
            addCriterion("user_face_image_big <", value, "userFaceImageBig");
            return (Criteria) this;
        }

        public Criteria andUserFaceImageBigLessThanOrEqualTo(String value) {
            addCriterion("user_face_image_big <=", value, "userFaceImageBig");
            return (Criteria) this;
        }

        public Criteria andUserFaceImageBigLike(String value) {
            addCriterion("user_face_image_big like", value, "userFaceImageBig");
            return (Criteria) this;
        }

        public Criteria andUserFaceImageBigNotLike(String value) {
            addCriterion("user_face_image_big not like", value, "userFaceImageBig");
            return (Criteria) this;
        }

        public Criteria andUserFaceImageBigIn(List<String> values) {
            addCriterion("user_face_image_big in", values, "userFaceImageBig");
            return (Criteria) this;
        }

        public Criteria andUserFaceImageBigNotIn(List<String> values) {
            addCriterion("user_face_image_big not in", values, "userFaceImageBig");
            return (Criteria) this;
        }

        public Criteria andUserFaceImageBigBetween(String value1, String value2) {
            addCriterion("user_face_image_big between", value1, value2, "userFaceImageBig");
            return (Criteria) this;
        }

        public Criteria andUserFaceImageBigNotBetween(String value1, String value2) {
            addCriterion("user_face_image_big not between", value1, value2, "userFaceImageBig");
            return (Criteria) this;
        }

        public Criteria andUserNickNameIsNull() {
            addCriterion("user_nick_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNickNameIsNotNull() {
            addCriterion("user_nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNickNameEqualTo(String value) {
            addCriterion("user_nick_name =", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameNotEqualTo(String value) {
            addCriterion("user_nick_name <>", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameGreaterThan(String value) {
            addCriterion("user_nick_name >", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_nick_name >=", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameLessThan(String value) {
            addCriterion("user_nick_name <", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameLessThanOrEqualTo(String value) {
            addCriterion("user_nick_name <=", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameLike(String value) {
            addCriterion("user_nick_name like", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameNotLike(String value) {
            addCriterion("user_nick_name not like", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameIn(List<String> values) {
            addCriterion("user_nick_name in", values, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameNotIn(List<String> values) {
            addCriterion("user_nick_name not in", values, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameBetween(String value1, String value2) {
            addCriterion("user_nick_name between", value1, value2, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameNotBetween(String value1, String value2) {
            addCriterion("user_nick_name not between", value1, value2, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserQrcodeIsNull() {
            addCriterion("user_qrcode is null");
            return (Criteria) this;
        }

        public Criteria andUserQrcodeIsNotNull() {
            addCriterion("user_qrcode is not null");
            return (Criteria) this;
        }

        public Criteria andUserQrcodeEqualTo(String value) {
            addCriterion("user_qrcode =", value, "userQrcode");
            return (Criteria) this;
        }

        public Criteria andUserQrcodeNotEqualTo(String value) {
            addCriterion("user_qrcode <>", value, "userQrcode");
            return (Criteria) this;
        }

        public Criteria andUserQrcodeGreaterThan(String value) {
            addCriterion("user_qrcode >", value, "userQrcode");
            return (Criteria) this;
        }

        public Criteria andUserQrcodeGreaterThanOrEqualTo(String value) {
            addCriterion("user_qrcode >=", value, "userQrcode");
            return (Criteria) this;
        }

        public Criteria andUserQrcodeLessThan(String value) {
            addCriterion("user_qrcode <", value, "userQrcode");
            return (Criteria) this;
        }

        public Criteria andUserQrcodeLessThanOrEqualTo(String value) {
            addCriterion("user_qrcode <=", value, "userQrcode");
            return (Criteria) this;
        }

        public Criteria andUserQrcodeLike(String value) {
            addCriterion("user_qrcode like", value, "userQrcode");
            return (Criteria) this;
        }

        public Criteria andUserQrcodeNotLike(String value) {
            addCriterion("user_qrcode not like", value, "userQrcode");
            return (Criteria) this;
        }

        public Criteria andUserQrcodeIn(List<String> values) {
            addCriterion("user_qrcode in", values, "userQrcode");
            return (Criteria) this;
        }

        public Criteria andUserQrcodeNotIn(List<String> values) {
            addCriterion("user_qrcode not in", values, "userQrcode");
            return (Criteria) this;
        }

        public Criteria andUserQrcodeBetween(String value1, String value2) {
            addCriterion("user_qrcode between", value1, value2, "userQrcode");
            return (Criteria) this;
        }

        public Criteria andUserQrcodeNotBetween(String value1, String value2) {
            addCriterion("user_qrcode not between", value1, value2, "userQrcode");
            return (Criteria) this;
        }

        public Criteria andUserDescriptionIsNull() {
            addCriterion("user_description is null");
            return (Criteria) this;
        }

        public Criteria andUserDescriptionIsNotNull() {
            addCriterion("user_description is not null");
            return (Criteria) this;
        }

        public Criteria andUserDescriptionEqualTo(String value) {
            addCriterion("user_description =", value, "userDescription");
            return (Criteria) this;
        }

        public Criteria andUserDescriptionNotEqualTo(String value) {
            addCriterion("user_description <>", value, "userDescription");
            return (Criteria) this;
        }

        public Criteria andUserDescriptionGreaterThan(String value) {
            addCriterion("user_description >", value, "userDescription");
            return (Criteria) this;
        }

        public Criteria andUserDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("user_description >=", value, "userDescription");
            return (Criteria) this;
        }

        public Criteria andUserDescriptionLessThan(String value) {
            addCriterion("user_description <", value, "userDescription");
            return (Criteria) this;
        }

        public Criteria andUserDescriptionLessThanOrEqualTo(String value) {
            addCriterion("user_description <=", value, "userDescription");
            return (Criteria) this;
        }

        public Criteria andUserDescriptionLike(String value) {
            addCriterion("user_description like", value, "userDescription");
            return (Criteria) this;
        }

        public Criteria andUserDescriptionNotLike(String value) {
            addCriterion("user_description not like", value, "userDescription");
            return (Criteria) this;
        }

        public Criteria andUserDescriptionIn(List<String> values) {
            addCriterion("user_description in", values, "userDescription");
            return (Criteria) this;
        }

        public Criteria andUserDescriptionNotIn(List<String> values) {
            addCriterion("user_description not in", values, "userDescription");
            return (Criteria) this;
        }

        public Criteria andUserDescriptionBetween(String value1, String value2) {
            addCriterion("user_description between", value1, value2, "userDescription");
            return (Criteria) this;
        }

        public Criteria andUserDescriptionNotBetween(String value1, String value2) {
            addCriterion("user_description not between", value1, value2, "userDescription");
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