package com.smyy.sharetour.buyer.module.order.bean;

import java.io.Serializable;
import java.util.List;

public class OrderDetailBean implements Serializable {

    private String orderId;
    private String remainTime;
    private int orderStatus;
    private String shippingName;
    private String shippingPhone;
    private String shippingAddress;
    private String sellerId;
    private String sellerName;
    private String sellerAvatar;
    private String buyerId;
    private int goodsCountTotal;
    private String priceTotal;
    private String shippingFee;//运费
    private String orderNum;
    private String orderTime;
    private List<OrderGoodsInfo> goodsList;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getRemainTime() {
        return remainTime;
    }

    public void setRemainTime(String remainTime) {
        this.remainTime = remainTime;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getShippingName() {
        return shippingName;
    }

    public void setShippingName(String shippingName) {
        this.shippingName = shippingName;
    }

    public String getShippingPhone() {
        return shippingPhone;
    }

    public void setShippingPhone(String shippingPhone) {
        this.shippingPhone = shippingPhone;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
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

    public String getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(String shippingFee) {
        this.shippingFee = shippingFee;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public List<OrderGoodsInfo> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<OrderGoodsInfo> goodsList) {
        this.goodsList = goodsList;
    }

    public OrderDetailBean() {
    }

    public OrderDetailBean(String orderId, String remainTime, int orderStatus, String shippingName, String shippingPhone, String shippingAddress, String sellerId, String sellerName, String sellerAvatar, String buyerId, int goodsCountTotal, String priceTotal, String shippingFee, String orderNum, String orderTime, List<OrderGoodsInfo> goodsList) {
        this.orderId = orderId;
        this.remainTime = remainTime;
        this.orderStatus = orderStatus;
        this.shippingName = shippingName;
        this.shippingPhone = shippingPhone;
        this.shippingAddress = shippingAddress;
        this.sellerId = sellerId;
        this.sellerName = sellerName;
        this.sellerAvatar = sellerAvatar;
        this.buyerId = buyerId;
        this.goodsCountTotal = goodsCountTotal;
        this.priceTotal = priceTotal;
        this.shippingFee = shippingFee;
        this.orderNum = orderNum;
        this.orderTime = orderTime;
        this.goodsList = goodsList;
    }

    @Override
    public String toString() {
        return "OrderDetailBean{" +
                "orderId='" + orderId + '\'' +
                ", remainTime='" + remainTime + '\'' +
                ", orderStatus=" + orderStatus +
                ", shippingName='" + shippingName + '\'' +
                ", shippingPhone='" + shippingPhone + '\'' +
                ", shippingAddress='" + shippingAddress + '\'' +
                ", sellerId='" + sellerId + '\'' +
                ", sellerName='" + sellerName + '\'' +
                ", sellerAvatar='" + sellerAvatar + '\'' +
                ", buyerId='" + buyerId + '\'' +
                ", goodsCountTotal=" + goodsCountTotal +
                ", priceTotal='" + priceTotal + '\'' +
                ", shippingFee='" + shippingFee + '\'' +
                ", orderNum='" + orderNum + '\'' +
                ", orderTime='" + orderTime + '\'' +
                ", goodsList=" + goodsList +
                '}';
    }
}