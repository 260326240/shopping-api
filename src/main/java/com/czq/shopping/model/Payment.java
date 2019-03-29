package com.czq.shopping.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.time.LocalTime;
import com.baomidou.mybatisplus.annotation.TableField;

/**
 * <p>
 * 
 * </p>
 *
 * @author ChenZeQiang	
 * @since 2019-03-27
 */
@TableName("tab_payment")
public class Payment extends Model<Payment> {

    private static final long serialVersionUID = 1L;

    /**
     * 关联订单ID
     */
    private String orderId;

    /**
     * 所属会员（登录名）
     */
    @TableField("user_loginName")
    private String userLoginname;

    /**
     * 支付时间
     */
    private LocalTime payTime;

    /**
     * 支付方式
     */
    private String payWay;

    /**
     * 支付状态
     */
    private String payStauts;


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserLoginname() {
        return userLoginname;
    }

    public void setUserLoginname(String userLoginname) {
        this.userLoginname = userLoginname;
    }

    public LocalTime getPayTime() {
        return payTime;
    }

    public void setPayTime(LocalTime payTime) {
        this.payTime = payTime;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public String getPayStauts() {
        return payStauts;
    }

    public void setPayStauts(String payStauts) {
        this.payStauts = payStauts;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "Payment{" +
        "orderId=" + orderId +
        ", userLoginname=" + userLoginname +
        ", payTime=" + payTime +
        ", payWay=" + payWay +
        ", payStauts=" + payStauts +
        "}";
    }
}
