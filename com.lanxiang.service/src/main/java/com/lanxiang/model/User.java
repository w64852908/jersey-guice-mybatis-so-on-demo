package com.lanxiang.model;

import com.lanxiang.model.mongo.UserInfo;
import com.lanxiang.util.UuidUtil;

import java.util.Date;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column learn_user.id
     *
     * @mbggenerated Mon Sep 05 11:13:28 CST 2016
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column learn_user.name
     *
     * @mbggenerated Mon Sep 05 11:13:28 CST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column learn_user.password
     *
     * @mbggenerated Mon Sep 05 11:13:28 CST 2016
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column learn_user.sex
     *
     * @mbggenerated Mon Sep 05 11:13:28 CST 2016
     */
    private String sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column learn_user.age
     *
     * @mbggenerated Mon Sep 05 11:13:28 CST 2016
     */
    private Integer age;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column learn_user.createTime
     *
     * @mbggenerated Mon Sep 05 11:13:28 CST 2016
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column learn_user.status
     *
     * @mbggenerated Mon Sep 05 11:13:28 CST 2016
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column learn_user.id
     *
     * @return the value of learn_user.id
     * @mbggenerated Mon Sep 05 11:13:28 CST 2016
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column learn_user.id
     *
     * @param id the value for learn_user.id
     * @mbggenerated Mon Sep 05 11:13:28 CST 2016
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column learn_user.name
     *
     * @return the value of learn_user.name
     * @mbggenerated Mon Sep 05 11:13:28 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column learn_user.name
     *
     * @param name the value for learn_user.name
     * @mbggenerated Mon Sep 05 11:13:28 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column learn_user.password
     *
     * @return the value of learn_user.password
     * @mbggenerated Mon Sep 05 11:13:28 CST 2016
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column learn_user.password
     *
     * @param password the value for learn_user.password
     * @mbggenerated Mon Sep 05 11:13:28 CST 2016
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column learn_user.sex
     *
     * @return the value of learn_user.sex
     * @mbggenerated Mon Sep 05 11:13:28 CST 2016
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column learn_user.sex
     *
     * @param sex the value for learn_user.sex
     * @mbggenerated Mon Sep 05 11:13:28 CST 2016
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column learn_user.age
     *
     * @return the value of learn_user.age
     * @mbggenerated Mon Sep 05 11:13:28 CST 2016
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column learn_user.age
     *
     * @param age the value for learn_user.age
     * @mbggenerated Mon Sep 05 11:13:28 CST 2016
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column learn_user.createTime
     *
     * @return the value of learn_user.createTime
     * @mbggenerated Mon Sep 05 11:13:28 CST 2016
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column learn_user.createTime
     *
     * @param createtime the value for learn_user.createTime
     * @mbggenerated Mon Sep 05 11:13:28 CST 2016
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column learn_user.status
     *
     * @return the value of learn_user.status
     * @mbggenerated Mon Sep 05 11:13:28 CST 2016
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column learn_user.status
     *
     * @param status the value for learn_user.status
     * @mbggenerated Mon Sep 05 11:13:28 CST 2016
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    private Address address;

    private UserInfo userInfo;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public void generateId() {
        if (this.id == null) {
            this.id = "uid_" + UuidUtil.getUuid();
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", createtime=" + createtime +
                ", status=" + status +
                ", address=" + address +
                '}';
    }
}