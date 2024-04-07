package com.my.bbs.entity;

import java.util.Date;

/**
 * 帖子列表-实体类
 * 页面展示时需要的字段与帖子实体类不同，因此新增了这个类
 */
public class BBSPostListEntity {
    //帖子的id，主键
    private Long postId;
    //发帖人的id
    private Long publishUserId;
    //帖子种类的id===》变成种类的名字
    private String postCategoryName;
    //帖子题目
    private String postTitle;
    //帖子的查看次数
    private Long postViews;
    //帖子的评论数量
    private Long postComments;
    //帖子的收藏数量
    private Long postCollects;
    //由于昵称只与id相关，所以在这里补充在实体类中
    private String nickName;
    //这里是为了html跳转的时候的url，直接储存在实体类中，方便每个帖子，
    // 点击后，直接跳转到指定帖子中
    private String headImgUrl;
    //创建时间
    private Date createTime;

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Long getPublishUserId() {
        return publishUserId;
    }

    public void setPublishUserId(Long publishUserId) {
        this.publishUserId = publishUserId;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle == null ? null : postTitle.trim();
    }

    public Long getPostViews() {
        return postViews;
    }

    public void setPostViews(Long postViews) {
        this.postViews = postViews;
    }

    public Long getPostComments() {
        return postComments;
    }

    public void setPostComments(Long postComments) {
        this.postComments = postComments;
    }

    public Long getPostCollects() {
        return postCollects;
    }

    public void setPostCollects(Long postCollects) {
        this.postCollects = postCollects;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getHeadImgUrl() {
        return headImgUrl;
    }

    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl;
    }

    public String getPostCategoryName() {
        return postCategoryName;
    }

    public void setPostCategoryName(String postCategoryName) {
        this.postCategoryName = postCategoryName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", postId=").append(postId);
        sb.append(", publishUserId=").append(publishUserId);
        sb.append(", postTitle=").append(postTitle);
        sb.append(", postViews=").append(postViews);
        sb.append(", postComments=").append(postComments);
        sb.append(", postCollects=").append(postCollects);
        sb.append("]");
        return sb.toString();
    }
}