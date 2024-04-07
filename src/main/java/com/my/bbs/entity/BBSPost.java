package com.my.bbs.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 帖子-实体类  与数据库中  tb_bbs_post 相关连，每一项相对应
 */
public class BBSPost {
    //帖子的id，主键
    private Long postId;
    //发帖人的id
    private Long publishUserId;
    //帖子题目
    private String postTitle;
    //帖子种类的id
    private Integer postCategoryId;
    //帖子种类的名字
    private String postCategoryName;
    //帖子的种类  0/1
    private Byte postStatus;
    //帖子的查看次数
    private Long postViews;
    //帖子的评论数量
    private Long postComments;
    //帖子的收藏数量
    private Long postCollects;
    //帖子的更新数量
    private Date lastUpdateTime;
    //帖子的创建时间
    private Date createTime;
    //帖子的内容，参杂了帖子的链接，主要内容，是以html的形式以String储存在数据库中
    private String postContent;

    public Long getPostId() {
        List<Integer> arr=new ArrayList<Integer>();
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

    public Integer getPostCategoryId() {
        return postCategoryId;
    }

    public void setPostCategoryId(Integer postCategoryId) {
        this.postCategoryId = postCategoryId;
    }

    public String getPostCategoryName() {
        return postCategoryName;
    }

    public void setPostCategoryName(String postCategoryName) {
        this.postCategoryName = postCategoryName == null ? null : postCategoryName.trim();
    }

    public Byte getPostStatus() {
        return postStatus;
    }

    public void setPostStatus(Byte postStatus) {
        this.postStatus = postStatus;
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

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent == null ? null : postContent.trim();
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
        sb.append(", postCategoryId=").append(postCategoryId);
        sb.append(", postCategoryName=").append(postCategoryName);
        sb.append(", postStatus=").append(postStatus);
        sb.append(", postViews=").append(postViews);
        sb.append(", postComments=").append(postComments);
        sb.append(", postCollects=").append(postCollects);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", postContent=").append(postContent);
        sb.append("]");
        return sb.toString();
    }
}