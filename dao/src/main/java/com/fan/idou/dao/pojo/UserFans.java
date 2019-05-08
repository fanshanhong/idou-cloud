package com.fan.idou.dao.pojo;

public class UserFans {
    private Long id;

    private String userId;

    private String fanUserId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getFanUserId() {
        return fanUserId;
    }

    public void setFanUserId(String fanUserId) {
        this.fanUserId = fanUserId == null ? null : fanUserId.trim();
    }
}