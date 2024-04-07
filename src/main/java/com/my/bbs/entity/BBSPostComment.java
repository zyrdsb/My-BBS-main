package com.my.bbs.entity;

import java.util.Date;

/**
 * 评论-实体类
 */
public class BBSPostComment {
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
    //是否删除，和之前帖子中的标志位相同
    private Byte isDeleted;

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
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
        this.commentBody = commentBody == null ? null : commentBody.trim();
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

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", commentId=").append(commentId);
        sb.append(", postId=").append(postId);
        sb.append(", commentUserId=").append(commentUserId);
        sb.append(", commentBody=").append(commentBody);
        sb.append(", parentCommentUserId=").append(parentCommentUserId);
        sb.append(", commentCreateTime=").append(commentCreateTime);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append("]");
        return sb.toString();
    }
}