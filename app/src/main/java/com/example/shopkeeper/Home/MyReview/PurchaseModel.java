package com.example.shopkeeper.Home.MyReview;

public class PurchaseModel {
    String p_name;

    public PurchaseModel(String p_name, String b_name, String price, String offer, String img) {
        this.p_name = p_name;
        this.b_name = b_name;
        this.price = price;
        this.offer = offer;
        this.img = img;
    }

    String b_name;

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getB_name() {
        return b_name;
    }

    public void setB_name(String b_name) {
        this.b_name = b_name;
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    String price;
    String offer;
    String img;

    public PurchaseModel(){}
}
