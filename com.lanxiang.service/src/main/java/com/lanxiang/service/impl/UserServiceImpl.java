package com.lanxiang.service.impl;

import com.google.inject.Inject;
import com.lanxiang.model.Address;
import com.lanxiang.model.User;
import com.lanxiang.model.dto.UserDTO;
import com.lanxiang.model.dto.UserInfoDTO;
import com.lanxiang.model.mongo.UserInfo;
import com.lanxiang.model.mongo.dao.UserInfoDAO;
import com.lanxiang.service.UserService;
import com.lanxiang.util.UserMetaUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.Date;

/**
 * Created by lanxiang on 16/9/1.
 */
public class UserServiceImpl implements UserService {

    @Inject
    private SqlSession sqlSession;

    @Inject
    private UserInfoDAO userInfoDAO;

    private final static String userMapper = "com.lanxiang.mapper.UserMapper.";

    private final static String addressMapper = "com.lanxiang.mapper.AddressMapper.";

    public void createUser(UserDTO userDTO) {
        User user = new User();
        UserMetaUtil.setUserFromUserDTO(user, userDTO);
        user.setCreatetime(new Date());
        user.setStatus(0);
        this.sqlSession.insert(userMapper + "insert", user);
        this.sqlSession.insert(addressMapper + "insert", user.getAddress());
    }

    public void deleteUser(String name) {
        User user = this.sqlSession.selectOne(userMapper + "selectByName", name);
        String userId = user.getId();
        Address address = this.sqlSession.selectOne(addressMapper + "selectByUserId", userId);

        this.sqlSession.delete(userMapper + "deleteByPrimaryKey", userId);
        this.sqlSession.delete(addressMapper + "deleteByPrimaryKey", address.getId());
    }

    public void updateUser(UserDTO userDTO) {
        User user = new User();
        UserMetaUtil.setUserFromUserDTO(user, userDTO);
        this.sqlSession.update(userMapper + "updateByPrimaryKey", user);
        this.sqlSession.update(addressMapper + "updateByPrimaryKey", user.getAddress());
    }

    public User findUserByName(String name) {
        User user = this.sqlSession.selectOne(userMapper + "selectByName", name);
        Address address = this.sqlSession.selectOne(addressMapper + "selectByUserId", user.getId());
        UserInfo userInfo = userInfoDAO.findUserInfoByUserId(user.getId());
        user.setAddress(address);
        user.setUserInfo(userInfo);
        return user;
    }

    public void fillUserInfo(String userId, UserInfoDTO userInfoDTO) {
        UserInfo userInfo = new UserInfo();
        UserMetaUtil.setUserInfoFromUserInfoDTO(userInfo, userInfoDTO);
        userInfo.setId(userId);
        userInfo.setStatus(0);
        userInfo.setCreateOrUpdateAt(new Date());
        userInfoDAO.saveUserInfo(userInfo);
    }
}