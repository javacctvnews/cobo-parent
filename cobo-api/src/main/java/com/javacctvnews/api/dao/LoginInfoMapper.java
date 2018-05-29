package com.javacctvnews.api.dao;

import com.javacctvnews.api.model.LoginInfo;

public interface LoginInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LoginInfo record);

    int insertSelective(LoginInfo record);

    LoginInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LoginInfo record);

    int updateByPrimaryKey(LoginInfo record);
}