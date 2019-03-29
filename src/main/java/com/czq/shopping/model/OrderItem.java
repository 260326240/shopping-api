package com.czq.shopping.model;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

/**
 * <p>
 * 订单项
 * </p>
 *
 * @author ChenZeQiang	
 * @since 2019-03-27
 */
@TableName("tab_order_item")
public class OrderItem extends Model<OrderItem> {

    private static final long serialVersionUID = 1L;

    /**
     * 关联订单ID
     */
    private String orderId;

    /**
     * 关联商品ID
     */
    private String goodsId;

    /**
     * 数量
     */
    private Integer number;


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
        "orderId=" + orderId +
        ", goodsId=" + goodsId +
        ", number=" + number +
        "}";
    }
}
