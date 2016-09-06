package com.lanxiang.model.mongo.dao;

import com.lanxiang.model.mongo.UserInfo;

/**
 * Created by lanxiang on 16/9/6.
 */
public interface UserInfoDAO {

    UserInfo findUserInfoByUserId(String id);

    void saveUserInfo(UserInfo userInfo);
}
