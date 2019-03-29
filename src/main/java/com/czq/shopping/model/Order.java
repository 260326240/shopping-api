package com.czq.shopping.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.time.LocalTime;
import com.baomidou.mybatisplus.annotation.TableField;

/**
 * <p>
 * 订单实体
 * </p>
 *
 * @author ChenZeQiang	
 * @since 2019-03-27
 */
@TableName("tab_order")
public class Order extends Model<Order> {

    private static final long serialVersionUID = 1L;

    /**
     * 订单ID
     */
    private String orderId;

    /**
     * 所属用户
     */
    private String orderUser;

    /**
     * 订单价格
     */
    private Float orderPrice;

    /**
     * 收货人姓名
     */
    private String orderName;

    /**
     * 收货人姓名
     */
    private String orderAddress;

    /**
     * 收货人电话
     */
    private String orderPhone;

    /**
     * 订单状态(1:已支付,0:未支付)
     */
    private String orderStauts;

    /**
     * 创建时间
     */
    @TableField("order_createTime")
    private LocalTime orderCreatetime;


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderUser() {
        return orderUser;
    }

    public void setOrderUser(String orderUser) {
        this.orderUser = orderUser;
    }

    public Float getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Float orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress;
    }

    public String getOrderPhone() {
        return orderPhone;
    }

    public void setOrderPhone(String orderPhone) {
        this.orderPhone = orderPhone;
    }

    public String getOrderStauts() {
        return orderStauts;
    }

    public void setOrderStauts(String orderStauts) {
        this.orderStauts = orderStauts;
    }

    public LocalTime getOrderCreatetime() {
        return orderCreatetime;
    }

    public void setOrderCreatetime(LocalTime orderCreatetime) {
        this.orderCreatetime = orderCreatetime;
    }

    @Override
    protected Serializable pkVal() {
        return this.orderId;
    }

    @Override
    public String toString() {
        return "Order{" +
        "orderId=" + orderId +
        ", orderUser=" + orderUser +
        ", orderPrice=" + orderPrice +
        ", orderName=" + orderName +
        ", orderAddress=" + orderAddress +
        ", orderPhone=" + orderPhone +
        ", orderStauts=" + orderStauts +
        ", orderCreatetime=" + orderCreatetime +
        "}";
    }
}
