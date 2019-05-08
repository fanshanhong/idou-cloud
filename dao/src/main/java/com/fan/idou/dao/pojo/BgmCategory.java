package com.fan.idou.dao.pojo;

public class BgmCategory {
    private Long id;

    private String bgmCategoryId;

    private String bgmCategoryName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBgmCategoryId() {
        return bgmCategoryId;
    }

    public void setBgmCategoryId(String bgmCategoryId) {
        this.bgmCategoryId = bgmCategoryId == null ? null : bgmCategoryId.trim();
    }

    public String getBgmCategoryName() {
        return bgmCategoryName;
    }

    public void setBgmCategoryName(String bgmCategoryName) {
        this.bgmCategoryName = bgmCategoryName == null ? null : bgmCategoryName.trim();
    }
}