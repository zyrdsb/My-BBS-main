package com.my.bbs.entity;

import java.util.Date;

/**
 * 论坛用户-实体类
 */
public class BBSUser {
    //用户主键id
    private Long userId;
    //登录名字
    private String loginName;
    //登录密码，被MD5加密过，是一个学习项，可以用来面试
    //MD5的好处，用法中需要主义的地方
    //防止重复，密码可以相同的被变成不同，暂是是这样
    private String passwordMd5;
    //昵称
    private String nickName;
    //头像的url，相当于储存在服务器中的文件中，用来寻找
    private String headImgUrl;
    //性别
    private String gender;
    //位置
    private String location;
    //自我介绍
    private String introduce;
    //用户状态位
    private Byte userStatus;
    //上次登录时间
    private Date lastLoginTime;
    //创建用户时间
    private Date createTime;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getPasswordMd5() {
        return passwordMd5;
    }

    public void setPasswordMd5(String passwordMd5) {
        this.passwordMd5 = passwordMd5 == null ? null : passwordMd5.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getHeadImgUrl() {
        return headImgUrl;
    }

    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl == null ? null : headImgUrl.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public Byte getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Byte userStatus) {
        this.userStatus = userStatus;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
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
        sb.append(", userId=").append(userId);
        sb.append(", loginName=").append(loginName);
        sb.append(", passwordMd5=").append(passwordMd5);
        sb.append(", nickName=").append(nickName);
        sb.append(", headImgUrl=").append(headImgUrl);
        sb.append(", gender=").append(gender);
        sb.append(", location=").append(location);
        sb.append(", introduce=").append(introduce);
        sb.append(", userStatus=").append(userStatus);
        sb.append(", lastLoginTime=").append(lastLoginTime);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}