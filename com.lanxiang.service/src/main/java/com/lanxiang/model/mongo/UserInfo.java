package com.lanxiang.model.mongo;

import org.mongodb.morphia.annotations.Embedded;

import java.util.List;

/**
 * Created by lanxiang on 16/9/6.
 */
public class UserInfo extends MongoPersistenceObject{

    private String userId;

    private String phone;

    private String email;

    private String wechat;

    private Long salary;

    @Embedded
    private Education education;

    private List<String> friends;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }
}
