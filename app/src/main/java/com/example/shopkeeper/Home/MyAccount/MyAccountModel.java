package com.example.shopkeeper.Home.MyAccount;

public class MyAccountModel {
    String img;

    public MyAccountModel(String img, String b_name, String price, String offer) {
        this.img = img;
        this.b_name = b_name;
        this.price = price;
        this.offer = offer;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
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

    String b_name;
    String price;
    String offer;


    public  MyAccountModel(){}
}
