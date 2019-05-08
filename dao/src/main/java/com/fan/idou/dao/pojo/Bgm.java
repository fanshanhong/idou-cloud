package com.fan.idou.dao.pojo;

public class Bgm {
    private Long id;

    private String bgmId;

    private String author;

    private String title;

    private String bgmPath;

    private String album;

    private String categoryId;

    private String bgmDownloadUrl;

    private Integer duration;

    private String coverHd;

    private String coverMedium;

    private String coverLarge;

    private String coverThumb;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBgmId() {
        return bgmId;
    }

    public void setBgmId(String bgmId) {
        this.bgmId = bgmId == null ? null : bgmId.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getBgmPath() {
        return bgmPath;
    }

    public void setBgmPath(String bgmPath) {
        this.bgmPath = bgmPath == null ? null : bgmPath.trim();
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album == null ? null : album.trim();
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId == null ? null : categoryId.trim();
    }

    public String getBgmDownloadUrl() {
        return bgmDownloadUrl;
    }

    public void setBgmDownloadUrl(String bgmDownloadUrl) {
        this.bgmDownloadUrl = bgmDownloadUrl == null ? null : bgmDownloadUrl.trim();
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getCoverHd() {
        return coverHd;
    }

    public void setCoverHd(String coverHd) {
        this.coverHd = coverHd == null ? null : coverHd.trim();
    }

    public String getCoverMedium() {
        return coverMedium;
    }

    public void setCoverMedium(String coverMedium) {
        this.coverMedium = coverMedium == null ? null : coverMedium.trim();
    }

    public String getCoverLarge() {
        return coverLarge;
    }

    public void setCoverLarge(String coverLarge) {
        this.coverLarge = coverLarge == null ? null : coverLarge.trim();
    }

    public String getCoverThumb() {
        return coverThumb;
    }

    public void setCoverThumb(String coverThumb) {
        this.coverThumb = coverThumb == null ? null : coverThumb.trim();
    }
}