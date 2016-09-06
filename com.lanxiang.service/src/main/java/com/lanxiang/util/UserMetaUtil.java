package com.lanxiang.util;

import com.lanxiang.model.Address;
import com.lanxiang.model.User;
import com.lanxiang.model.dto.AddressDTO;
import com.lanxiang.model.dto.UserDTO;
import com.lanxiang.model.dto.UserInfoDTO;
import com.lanxiang.model.mongo.Education;
import com.lanxiang.model.mongo.UserInfo;

/**
 * Created by lanxiang on 16/9/2.
 */
public class UserMetaUtil {

    public static void setUserFromUserDTO(User user, UserDTO userDTO) {
        if (user == null || userDTO == null) {
            return;
        }

        if (userDTO.getId() != null) {
            user.setId(userDTO.getId());
        } else {
            user.generateId();
        }

        if (userDTO.getName() != null) {
            user.setName(userDTO.getName());
        }

        if (userDTO.getPassword() != null) {
            user.setPassword(userDTO.getPassword());
        }

        if (userDTO.getSex() != null) {
            user.setSex(userDTO.getSex());
        }

        user.setAge(userDTO.getAge());

        Address address = getAddressFromAddressDTO(userDTO.getAddressDTO());

        address.setUserId(user.getId());

        user.setAddress(address);
    }

    private static Address getAddressFromAddressDTO(AddressDTO addressDTO) {

        Address address = new Address();
        if (addressDTO == null) {
            return address;
        }

        if (addressDTO.getId() != null) {
            address.setId(addressDTO.getId());
        } else {
            address.generateId();
        }

        if (addressDTO.getUserId() != null) {
            address.setUserId(addressDTO.getUserId());
        }

        if (addressDTO.getProvince() != null) {
            address.setProvince(addressDTO.getProvince());
        }

        if (addressDTO.getCity() != null) {
            address.setCity(addressDTO.getCity());
        }

        if (addressDTO.getTown() != null) {
            address.setTown(addressDTO.getTown());
        }

        if (addressDTO.getDetail() != null) {
            address.setDetail(addressDTO.getDetail());
        }
        return address;
    }

    public static void setUserInfoFromUserInfoDTO(UserInfo userInfo, UserInfoDTO userInfoDTO) {
        if (userInfo == null || userInfoDTO == null) {
            return;
        }
        if (userInfoDTO.getPhone() != null) {
            userInfo.setPhone(userInfoDTO.getPhone());
        }
        if (userInfoDTO.getEmail() != null) {
            userInfo.setEmail(userInfoDTO.getEmail());
        }
        if (userInfoDTO.getWechat() != null) {
            userInfo.setWechat(userInfoDTO.getWechat());
        }
        if (userInfoDTO.getSalary() != null) {
            userInfo.setSalary(userInfoDTO.getSalary());
        }
        if (userInfoDTO.getEducation() != null && userInfoDTO.getEducation().size() > 0) {
            userInfo.setEducation(new Education(userInfoDTO.getEducation()));
        }
        if (userInfoDTO.getFriends() != null && userInfoDTO.getFriends().size() > 0) {
            userInfo.setFriends(userInfoDTO.getFriends());
        }
    }
}
