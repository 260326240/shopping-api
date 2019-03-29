package com.czq.shopping.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.time.LocalTime;
import com.baomidou.mybatisplus.annotation.TableField;

/**
 * <p>
 * 用户会员表
 * </p>
 *
 * @author ChenZeQiang	
 * @since 2019-03-27
 */
@TableName("tab_user")

public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    /**
     * 登录名
     */
    @TableId("user_loginName")
    private String userLoginname;

    /**
     * 密码
     */
    @TableField("user_passWord")
    private String userPassword;

    /**
     * 邮箱
     */
    private String userEmail;

    /**
     * 电话
     */
    private String userPhone;

    /**
     * 性别(1:女,0:男)
     */
    private String userSex;

    /**
     * 呢称
     */
    private String userName;

    /**
     * 创建时间
     */
    @TableField("user_createTime")
    private LocalTime userCreatetime;

    /**
     * 登录状态(1:上线,0:下线)
     */
    private String userStauts;

    public User() {
    	
    }
    public String getUserLoginname() {
        return userLoginname;
    }

    public void setUserLoginname(String userLoginname) {
        this.userLoginname = userLoginname;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LocalTime getUserCreatetime() {
        return userCreatetime;
    }

    public void setUserCreatetime(LocalTime userCreatetime) {
        this.userCreatetime = userCreatetime;
    }

    public String getUserStauts() {
        return userStauts;
    }

    public void setUserStauts(String userStauts) {
        this.userStauts = userStauts;
    }

    @Override
    protected Serializable pkVal() {
        return this.userLoginname;
    }

    @Override
    public String toString() {
        return "User{" +
        "userLoginname=" + userLoginname +
        ", userPassword=" + userPassword +
        ", userEmail=" + userEmail +
        ", userPhone=" + userPhone +
        ", userSex=" + userSex +
        ", userName=" + userName +
        ", userCreatetime=" + userCreatetime +
        ", userStauts=" + userStauts +
        "}";
    }
}
