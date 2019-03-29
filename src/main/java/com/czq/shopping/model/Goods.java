package com.czq.shopping.model;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

/**
 * <p>
 * 商品实体
 * </p>
 *
 * @author ChenZeQiang	
 * @since 2019-03-27
 */
@TableName("tab_goods")
public class Goods extends Model<Goods> {

    private static final long serialVersionUID = 1L;

    /**
     * 商品ID
     */
    private String goodsId;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 商品价格
     */
    private Float goodsPrice;

    /**
     * 商品分类
     */
    private String goodsBelong;

    /**
     * 商品库存
     */
    private Integer goodsNumber;

    /**
     * 图片地址
     */
    private String goodsPic;

    /**
     * 商品描述
     */
    private String goodsDescribe;

    /**
     * 生产日期
     */
    private String goodsDate;

    /**
     * 生产地
     */
    private String goodsMade;


    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Float getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Float goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsBelong() {
        return goodsBelong;
    }

    public void setGoodsBelong(String goodsBelong) {
        this.goodsBelong = goodsBelong;
    }

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public String getGoodsPic() {
        return goodsPic;
    }

    public void setGoodsPic(String goodsPic) {
        this.goodsPic = goodsPic;
    }

    public String getGoodsDescribe() {
        return goodsDescribe;
    }

    public void setGoodsDescribe(String goodsDescribe) {
        this.goodsDescribe = goodsDescribe;
    }

    public String getGoodsDate() {
        return goodsDate;
    }

    public void setGoodsDate(String goodsDate) {
        this.goodsDate = goodsDate;
    }

    public String getGoodsMade() {
        return goodsMade;
    }

    public void setGoodsMade(String goodsMade) {
        this.goodsMade = goodsMade;
    }

    @Override
    protected Serializable pkVal() {
        return this.goodsId;
    }

    @Override
    public String toString() {
        return "Goods{" +
        "goodsId=" + goodsId +
        ", goodsName=" + goodsName +
        ", goodsPrice=" + goodsPrice +
        ", goodsBelong=" + goodsBelong +
        ", goodsNumber=" + goodsNumber +
        ", goodsPic=" + goodsPic +
        ", goodsDescribe=" + goodsDescribe +
        ", goodsDate=" + goodsDate +
        ", goodsMade=" + goodsMade +
        "}";
    }
}
