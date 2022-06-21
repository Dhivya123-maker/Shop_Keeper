package com.example.shopkeeper.OrderStatus.Orders;

public class OrderModel {
    String img;
    String p_name;
    String brand;

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    String order_id;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getOffer() {
        return offer;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    String price;
    String offer;

    public OrderModel(String img, String p_name, String brand, String price, String offer, String delivery, String qty, String order_id) {
        this.img = img;
        this.p_name = p_name;
        this.brand = brand;
        this.price = price;
        this.offer = offer;
        this.delivery = delivery;
        this.qty = qty;
        this.order_id = order_id;
    }

    String delivery;
    String qty;

    public OrderModel(){}
}
