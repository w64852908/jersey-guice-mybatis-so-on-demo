package com.lanxiang.model.mongo.dao.impl;

import com.google.inject.Inject;
import com.lanxiang.model.mongo.UserInfo;
import com.lanxiang.model.mongo.dao.UserInfoDAO;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.Query;

/**
 * Created by lanxiang on 16/9/6.
 */
public class UserInfoDAOImpl implements UserInfoDAO {

    @Inject
    private Datastore datastore;

    public UserInfo findUserInfoByUserId(String userId) {
        UserInfo userInfo = new UserInfo();
        if (userId == null) {
            return userInfo;
        }
        Query<UserInfo> query = datastore.createQuery(UserInfo.class)
                .field("userId").equal(userId)
                .field("status").equal(0);
        userInfo = query.get();
        return userInfo;
    }

    public void saveUserInfo(UserInfo userInfo) {
        datastore.save(userInfo);
    }

}
