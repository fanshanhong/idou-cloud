package com.fan.idou.dao.pojo;

import java.util.ArrayList;
import java.util.List;

public class BgmExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BgmExample() {
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

        public Criteria andBgmIdIsNull() {
            addCriterion("bgm_id is null");
            return (Criteria) this;
        }

        public Criteria andBgmIdIsNotNull() {
            addCriterion("bgm_id is not null");
            return (Criteria) this;
        }

        public Criteria andBgmIdEqualTo(String value) {
            addCriterion("bgm_id =", value, "bgmId");
            return (Criteria) this;
        }

        public Criteria andBgmIdNotEqualTo(String value) {
            addCriterion("bgm_id <>", value, "bgmId");
            return (Criteria) this;
        }

        public Criteria andBgmIdGreaterThan(String value) {
            addCriterion("bgm_id >", value, "bgmId");
            return (Criteria) this;
        }

        public Criteria andBgmIdGreaterThanOrEqualTo(String value) {
            addCriterion("bgm_id >=", value, "bgmId");
            return (Criteria) this;
        }

        public Criteria andBgmIdLessThan(String value) {
            addCriterion("bgm_id <", value, "bgmId");
            return (Criteria) this;
        }

        public Criteria andBgmIdLessThanOrEqualTo(String value) {
            addCriterion("bgm_id <=", value, "bgmId");
            return (Criteria) this;
        }

        public Criteria andBgmIdLike(String value) {
            addCriterion("bgm_id like", value, "bgmId");
            return (Criteria) this;
        }

        public Criteria andBgmIdNotLike(String value) {
            addCriterion("bgm_id not like", value, "bgmId");
            return (Criteria) this;
        }

        public Criteria andBgmIdIn(List<String> values) {
            addCriterion("bgm_id in", values, "bgmId");
            return (Criteria) this;
        }

        public Criteria andBgmIdNotIn(List<String> values) {
            addCriterion("bgm_id not in", values, "bgmId");
            return (Criteria) this;
        }

        public Criteria andBgmIdBetween(String value1, String value2) {
            addCriterion("bgm_id between", value1, value2, "bgmId");
            return (Criteria) this;
        }

        public Criteria andBgmIdNotBetween(String value1, String value2) {
            addCriterion("bgm_id not between", value1, value2, "bgmId");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andBgmPathIsNull() {
            addCriterion("bgm_path is null");
            return (Criteria) this;
        }

        public Criteria andBgmPathIsNotNull() {
            addCriterion("bgm_path is not null");
            return (Criteria) this;
        }

        public Criteria andBgmPathEqualTo(String value) {
            addCriterion("bgm_path =", value, "bgmPath");
            return (Criteria) this;
        }

        public Criteria andBgmPathNotEqualTo(String value) {
            addCriterion("bgm_path <>", value, "bgmPath");
            return (Criteria) this;
        }

        public Criteria andBgmPathGreaterThan(String value) {
            addCriterion("bgm_path >", value, "bgmPath");
            return (Criteria) this;
        }

        public Criteria andBgmPathGreaterThanOrEqualTo(String value) {
            addCriterion("bgm_path >=", value, "bgmPath");
            return (Criteria) this;
        }

        public Criteria andBgmPathLessThan(String value) {
            addCriterion("bgm_path <", value, "bgmPath");
            return (Criteria) this;
        }

        public Criteria andBgmPathLessThanOrEqualTo(String value) {
            addCriterion("bgm_path <=", value, "bgmPath");
            return (Criteria) this;
        }

        public Criteria andBgmPathLike(String value) {
            addCriterion("bgm_path like", value, "bgmPath");
            return (Criteria) this;
        }

        public Criteria andBgmPathNotLike(String value) {
            addCriterion("bgm_path not like", value, "bgmPath");
            return (Criteria) this;
        }

        public Criteria andBgmPathIn(List<String> values) {
            addCriterion("bgm_path in", values, "bgmPath");
            return (Criteria) this;
        }

        public Criteria andBgmPathNotIn(List<String> values) {
            addCriterion("bgm_path not in", values, "bgmPath");
            return (Criteria) this;
        }

        public Criteria andBgmPathBetween(String value1, String value2) {
            addCriterion("bgm_path between", value1, value2, "bgmPath");
            return (Criteria) this;
        }

        public Criteria andBgmPathNotBetween(String value1, String value2) {
            addCriterion("bgm_path not between", value1, value2, "bgmPath");
            return (Criteria) this;
        }

        public Criteria andAlbumIsNull() {
            addCriterion("album is null");
            return (Criteria) this;
        }

        public Criteria andAlbumIsNotNull() {
            addCriterion("album is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumEqualTo(String value) {
            addCriterion("album =", value, "album");
            return (Criteria) this;
        }

        public Criteria andAlbumNotEqualTo(String value) {
            addCriterion("album <>", value, "album");
            return (Criteria) this;
        }

        public Criteria andAlbumGreaterThan(String value) {
            addCriterion("album >", value, "album");
            return (Criteria) this;
        }

        public Criteria andAlbumGreaterThanOrEqualTo(String value) {
            addCriterion("album >=", value, "album");
            return (Criteria) this;
        }

        public Criteria andAlbumLessThan(String value) {
            addCriterion("album <", value, "album");
            return (Criteria) this;
        }

        public Criteria andAlbumLessThanOrEqualTo(String value) {
            addCriterion("album <=", value, "album");
            return (Criteria) this;
        }

        public Criteria andAlbumLike(String value) {
            addCriterion("album like", value, "album");
            return (Criteria) this;
        }

        public Criteria andAlbumNotLike(String value) {
            addCriterion("album not like", value, "album");
            return (Criteria) this;
        }

        public Criteria andAlbumIn(List<String> values) {
            addCriterion("album in", values, "album");
            return (Criteria) this;
        }

        public Criteria andAlbumNotIn(List<String> values) {
            addCriterion("album not in", values, "album");
            return (Criteria) this;
        }

        public Criteria andAlbumBetween(String value1, String value2) {
            addCriterion("album between", value1, value2, "album");
            return (Criteria) this;
        }

        public Criteria andAlbumNotBetween(String value1, String value2) {
            addCriterion("album not between", value1, value2, "album");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(String value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(String value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(String value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(String value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLike(String value) {
            addCriterion("category_id like", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotLike(String value) {
            addCriterion("category_id not like", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<String> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<String> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(String value1, String value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(String value1, String value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andBgmDownloadUrlIsNull() {
            addCriterion("bgm_download_url is null");
            return (Criteria) this;
        }

        public Criteria andBgmDownloadUrlIsNotNull() {
            addCriterion("bgm_download_url is not null");
            return (Criteria) this;
        }

        public Criteria andBgmDownloadUrlEqualTo(String value) {
            addCriterion("bgm_download_url =", value, "bgmDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andBgmDownloadUrlNotEqualTo(String value) {
            addCriterion("bgm_download_url <>", value, "bgmDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andBgmDownloadUrlGreaterThan(String value) {
            addCriterion("bgm_download_url >", value, "bgmDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andBgmDownloadUrlGreaterThanOrEqualTo(String value) {
            addCriterion("bgm_download_url >=", value, "bgmDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andBgmDownloadUrlLessThan(String value) {
            addCriterion("bgm_download_url <", value, "bgmDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andBgmDownloadUrlLessThanOrEqualTo(String value) {
            addCriterion("bgm_download_url <=", value, "bgmDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andBgmDownloadUrlLike(String value) {
            addCriterion("bgm_download_url like", value, "bgmDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andBgmDownloadUrlNotLike(String value) {
            addCriterion("bgm_download_url not like", value, "bgmDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andBgmDownloadUrlIn(List<String> values) {
            addCriterion("bgm_download_url in", values, "bgmDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andBgmDownloadUrlNotIn(List<String> values) {
            addCriterion("bgm_download_url not in", values, "bgmDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andBgmDownloadUrlBetween(String value1, String value2) {
            addCriterion("bgm_download_url between", value1, value2, "bgmDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andBgmDownloadUrlNotBetween(String value1, String value2) {
            addCriterion("bgm_download_url not between", value1, value2, "bgmDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andDurationIsNull() {
            addCriterion("duration is null");
            return (Criteria) this;
        }

        public Criteria andDurationIsNotNull() {
            addCriterion("duration is not null");
            return (Criteria) this;
        }

        public Criteria andDurationEqualTo(Integer value) {
            addCriterion("duration =", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotEqualTo(Integer value) {
            addCriterion("duration <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThan(Integer value) {
            addCriterion("duration >", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("duration >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThan(Integer value) {
            addCriterion("duration <", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThanOrEqualTo(Integer value) {
            addCriterion("duration <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationIn(List<Integer> values) {
            addCriterion("duration in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotIn(List<Integer> values) {
            addCriterion("duration not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationBetween(Integer value1, Integer value2) {
            addCriterion("duration between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("duration not between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andCoverHdIsNull() {
            addCriterion("cover_hd is null");
            return (Criteria) this;
        }

        public Criteria andCoverHdIsNotNull() {
            addCriterion("cover_hd is not null");
            return (Criteria) this;
        }

        public Criteria andCoverHdEqualTo(String value) {
            addCriterion("cover_hd =", value, "coverHd");
            return (Criteria) this;
        }

        public Criteria andCoverHdNotEqualTo(String value) {
            addCriterion("cover_hd <>", value, "coverHd");
            return (Criteria) this;
        }

        public Criteria andCoverHdGreaterThan(String value) {
            addCriterion("cover_hd >", value, "coverHd");
            return (Criteria) this;
        }

        public Criteria andCoverHdGreaterThanOrEqualTo(String value) {
            addCriterion("cover_hd >=", value, "coverHd");
            return (Criteria) this;
        }

        public Criteria andCoverHdLessThan(String value) {
            addCriterion("cover_hd <", value, "coverHd");
            return (Criteria) this;
        }

        public Criteria andCoverHdLessThanOrEqualTo(String value) {
            addCriterion("cover_hd <=", value, "coverHd");
            return (Criteria) this;
        }

        public Criteria andCoverHdLike(String value) {
            addCriterion("cover_hd like", value, "coverHd");
            return (Criteria) this;
        }

        public Criteria andCoverHdNotLike(String value) {
            addCriterion("cover_hd not like", value, "coverHd");
            return (Criteria) this;
        }

        public Criteria andCoverHdIn(List<String> values) {
            addCriterion("cover_hd in", values, "coverHd");
            return (Criteria) this;
        }

        public Criteria andCoverHdNotIn(List<String> values) {
            addCriterion("cover_hd not in", values, "coverHd");
            return (Criteria) this;
        }

        public Criteria andCoverHdBetween(String value1, String value2) {
            addCriterion("cover_hd between", value1, value2, "coverHd");
            return (Criteria) this;
        }

        public Criteria andCoverHdNotBetween(String value1, String value2) {
            addCriterion("cover_hd not between", value1, value2, "coverHd");
            return (Criteria) this;
        }

        public Criteria andCoverMediumIsNull() {
            addCriterion("cover_medium is null");
            return (Criteria) this;
        }

        public Criteria andCoverMediumIsNotNull() {
            addCriterion("cover_medium is not null");
            return (Criteria) this;
        }

        public Criteria andCoverMediumEqualTo(String value) {
            addCriterion("cover_medium =", value, "coverMedium");
            return (Criteria) this;
        }

        public Criteria andCoverMediumNotEqualTo(String value) {
            addCriterion("cover_medium <>", value, "coverMedium");
            return (Criteria) this;
        }

        public Criteria andCoverMediumGreaterThan(String value) {
            addCriterion("cover_medium >", value, "coverMedium");
            return (Criteria) this;
        }

        public Criteria andCoverMediumGreaterThanOrEqualTo(String value) {
            addCriterion("cover_medium >=", value, "coverMedium");
            return (Criteria) this;
        }

        public Criteria andCoverMediumLessThan(String value) {
            addCriterion("cover_medium <", value, "coverMedium");
            return (Criteria) this;
        }

        public Criteria andCoverMediumLessThanOrEqualTo(String value) {
            addCriterion("cover_medium <=", value, "coverMedium");
            return (Criteria) this;
        }

        public Criteria andCoverMediumLike(String value) {
            addCriterion("cover_medium like", value, "coverMedium");
            return (Criteria) this;
        }

        public Criteria andCoverMediumNotLike(String value) {
            addCriterion("cover_medium not like", value, "coverMedium");
            return (Criteria) this;
        }

        public Criteria andCoverMediumIn(List<String> values) {
            addCriterion("cover_medium in", values, "coverMedium");
            return (Criteria) this;
        }

        public Criteria andCoverMediumNotIn(List<String> values) {
            addCriterion("cover_medium not in", values, "coverMedium");
            return (Criteria) this;
        }

        public Criteria andCoverMediumBetween(String value1, String value2) {
            addCriterion("cover_medium between", value1, value2, "coverMedium");
            return (Criteria) this;
        }

        public Criteria andCoverMediumNotBetween(String value1, String value2) {
            addCriterion("cover_medium not between", value1, value2, "coverMedium");
            return (Criteria) this;
        }

        public Criteria andCoverLargeIsNull() {
            addCriterion("cover_large is null");
            return (Criteria) this;
        }

        public Criteria andCoverLargeIsNotNull() {
            addCriterion("cover_large is not null");
            return (Criteria) this;
        }

        public Criteria andCoverLargeEqualTo(String value) {
            addCriterion("cover_large =", value, "coverLarge");
            return (Criteria) this;
        }

        public Criteria andCoverLargeNotEqualTo(String value) {
            addCriterion("cover_large <>", value, "coverLarge");
            return (Criteria) this;
        }

        public Criteria andCoverLargeGreaterThan(String value) {
            addCriterion("cover_large >", value, "coverLarge");
            return (Criteria) this;
        }

        public Criteria andCoverLargeGreaterThanOrEqualTo(String value) {
            addCriterion("cover_large >=", value, "coverLarge");
            return (Criteria) this;
        }

        public Criteria andCoverLargeLessThan(String value) {
            addCriterion("cover_large <", value, "coverLarge");
            return (Criteria) this;
        }

        public Criteria andCoverLargeLessThanOrEqualTo(String value) {
            addCriterion("cover_large <=", value, "coverLarge");
            return (Criteria) this;
        }

        public Criteria andCoverLargeLike(String value) {
            addCriterion("cover_large like", value, "coverLarge");
            return (Criteria) this;
        }

        public Criteria andCoverLargeNotLike(String value) {
            addCriterion("cover_large not like", value, "coverLarge");
            return (Criteria) this;
        }

        public Criteria andCoverLargeIn(List<String> values) {
            addCriterion("cover_large in", values, "coverLarge");
            return (Criteria) this;
        }

        public Criteria andCoverLargeNotIn(List<String> values) {
            addCriterion("cover_large not in", values, "coverLarge");
            return (Criteria) this;
        }

        public Criteria andCoverLargeBetween(String value1, String value2) {
            addCriterion("cover_large between", value1, value2, "coverLarge");
            return (Criteria) this;
        }

        public Criteria andCoverLargeNotBetween(String value1, String value2) {
            addCriterion("cover_large not between", value1, value2, "coverLarge");
            return (Criteria) this;
        }

        public Criteria andCoverThumbIsNull() {
            addCriterion("cover_thumb is null");
            return (Criteria) this;
        }

        public Criteria andCoverThumbIsNotNull() {
            addCriterion("cover_thumb is not null");
            return (Criteria) this;
        }

        public Criteria andCoverThumbEqualTo(String value) {
            addCriterion("cover_thumb =", value, "coverThumb");
            return (Criteria) this;
        }

        public Criteria andCoverThumbNotEqualTo(String value) {
            addCriterion("cover_thumb <>", value, "coverThumb");
            return (Criteria) this;
        }

        public Criteria andCoverThumbGreaterThan(String value) {
            addCriterion("cover_thumb >", value, "coverThumb");
            return (Criteria) this;
        }

        public Criteria andCoverThumbGreaterThanOrEqualTo(String value) {
            addCriterion("cover_thumb >=", value, "coverThumb");
            return (Criteria) this;
        }

        public Criteria andCoverThumbLessThan(String value) {
            addCriterion("cover_thumb <", value, "coverThumb");
            return (Criteria) this;
        }

        public Criteria andCoverThumbLessThanOrEqualTo(String value) {
            addCriterion("cover_thumb <=", value, "coverThumb");
            return (Criteria) this;
        }

        public Criteria andCoverThumbLike(String value) {
            addCriterion("cover_thumb like", value, "coverThumb");
            return (Criteria) this;
        }

        public Criteria andCoverThumbNotLike(String value) {
            addCriterion("cover_thumb not like", value, "coverThumb");
            return (Criteria) this;
        }

        public Criteria andCoverThumbIn(List<String> values) {
            addCriterion("cover_thumb in", values, "coverThumb");
            return (Criteria) this;
        }

        public Criteria andCoverThumbNotIn(List<String> values) {
            addCriterion("cover_thumb not in", values, "coverThumb");
            return (Criteria) this;
        }

        public Criteria andCoverThumbBetween(String value1, String value2) {
            addCriterion("cover_thumb between", value1, value2, "coverThumb");
            return (Criteria) this;
        }

        public Criteria andCoverThumbNotBetween(String value1, String value2) {
            addCriterion("cover_thumb not between", value1, value2, "coverThumb");
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