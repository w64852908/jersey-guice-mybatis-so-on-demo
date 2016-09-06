package com.lanxiang.model.dto;

import java.util.List;
import java.util.Map;

/**
 * Created by lanxiang on 16/9/6.
 */
public class UserInfoDTO {

    private String phone;

    private String email;

    private String wechat;

    private Long salary;

    private Map<String, String> education;

    private List<String> friends;

    public UserInfoDTO() {
    }

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

    public Map<String, String> getEducation() {
        return education;
    }

    public void setEducation(Map<String, String> education) {
        this.education = education;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "UserInfoDTO{" +
                "phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", wechat='" + wechat + '\'' +
                ", salary=" + salary +
                ", education=" + education +
                ", friends=" + friends +
                '}';
    }
}
