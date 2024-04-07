package com.my.bbs.dao;

import com.my.bbs.entity.BBSUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BBSUserMapper {
    //删除用户
    int deleteByPrimaryKey(Long userId);
    //插入，新建用户
    int insert(BBSUser record);
    //插入，暂定
    int insertSelective(BBSUser record);
    //返回用户，通过指定主键
    BBSUser selectByPrimaryKey(Long userId);
    //返回用户列表，参数是一个list
    List<BBSUser> selectByPrimaryKeys(@Param("userIds") List<Long> userIds);
    //通过名字找到用户
    BBSUser selectByLoginName(String loginName);
    //通过姓名密码找到用户
    BBSUser selectByLoginNameAndPasswd(@Param("loginName") String loginName, @Param("password") String password);
    //更新用户，返回int表示结果
    int updateByPrimaryKeySelective(BBSUser record);
    //和上方差不多
    int updateByPrimaryKey(BBSUser record);
}