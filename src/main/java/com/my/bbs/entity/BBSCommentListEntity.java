package com.my.bbs.entity;

import java.util.Date;

/**
 * 评论列表-实体类
 * 页面展示时需要的字段与评论实体类不同，因此新增了这个类
 */
public class BBSCommentListEntity {
    //评论的id
    private Long commentId;
    //帖子的id
    private Long postId;
    //评论的用户的id
    private Long commentUserId;
    //评论的内容 string
    private String commentBody;
    //如果是回帖的话，去寻找在评论中是谁评论的这条，进行跟帖回复
    //这也是为什么要在评论专门新增一个id的原因
    //推测是同个id多次回复，判断回帖应该跟在谁后面
    //所以，需要新增一个id进行区分
    private Long parentCommentUserId;
    //评论创建时间
    private Date commentCreateTime;
    //评论用户的昵称，还是因为id重复的原因，所以在这里补充
    private String nickName;
    //跳转链接
    private String headImgUrl;

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public Long getCommentUserId() {
        return commentUserId;
    }

    public void setCommentUserId(Long commentUserId) {
        this.commentUserId = commentUserId;
    }

    public String getCommentBody() {
        return commentBody;
    }

    public void setCommentBody(String commentBody) {
        this.commentBody = commentBody;
    }

    public Long getParentCommentUserId() {
        return parentCommentUserId;
    }

    public void setParentCommentUserId(Long parentCommentUserId) {
        this.parentCommentUserId = parentCommentUserId;
    }

    public Date getCommentCreateTime() {
        return commentCreateTime;
    }

    public void setCommentCreateTime(Date commentCreateTime) {
        this.commentCreateTime = commentCreateTime;
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
}