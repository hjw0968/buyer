package com.smyy.sharetour.buyer.module.order.bean;

import java.io.Serializable;
import java.util.List;

public class OrderBean implements Serializable {

    private String orderId;
    private int orderStatus;
    private String sellerId;
    private String sellerName;
    private String sellerAvatar;
    private String buyerId;
    private String buyerName;
    private String buyerAvatar;
    private int goodsCountTotal;
    private String priceTotal;
    private String verifyFee;//鉴定费
    private String verifyVideo;//鉴定视频
    private int goodsType;//商品类型
    private List<OrderGoodsInfo> goodsList;

    public OrderBean(String orderId, int orderStatus, String sellerId, String sellerName, String sellerAvatar, String buyerId, String buyerName, String buyerAvatar, int goodsCountTotal, String priceTotal, String verifyFee, String verifyVideo, int goodsType, List<OrderGoodsInfo> goodsList) {
        this.orderId = orderId;
        this.orderStatus = orderStatus;
        this.sellerId = sellerId;
        this.sellerName = sellerName;
        this.sellerAvatar = sellerAvatar;
        this.buyerId = buyerId;
        this.buyerName = buyerName;
        this.buyerAvatar = buyerAvatar;
        this.goodsCountTotal = goodsCountTotal;
        this.priceTotal = priceTotal;
        this.verifyFee = verifyFee;
        this.verifyVideo = verifyVideo;
        this.goodsType = goodsType;
        this.goodsList = goodsList;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerAvatar() {
        return sellerAvatar;
    }

    public void setSellerAvatar(String sellerAvatar) {
        this.sellerAvatar = sellerAvatar;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerAvatar() {
        return buyerAvatar;
    }

    public void setBuyerAvatar(String buyerAvatar) {
        this.buyerAvatar = buyerAvatar;
    }

    public int getGoodsCountTotal() {
        return goodsCountTotal;
    }

    public void setGoodsCountTotal(int goodsCountTotal) {
        this.goodsCountTotal = goodsCountTotal;
    }

    public String getPriceTotal() {
        return priceTotal;
    }

    public void setPriceTotal(String priceTotal) {
        this.priceTotal = priceTotal;
    }

    public String getVerifyFee() {
        return verifyFee;
    }

    public void setVerifyFee(String verifyFee) {
        this.verifyFee = verifyFee;
    }

    public String getVerifyVideo() {
        return verifyVideo;
    }

    public void setVerifyVideo(String verifyVideo) {
        this.verifyVideo = verifyVideo;
    }

    public int getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(int goodsType) {
        this.goodsType = goodsType;
    }

    public List<OrderGoodsInfo> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<OrderGoodsInfo> goodsList) {
        this.goodsList = goodsList;
    }
}
