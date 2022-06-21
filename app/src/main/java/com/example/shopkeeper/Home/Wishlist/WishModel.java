package com.example.shopkeeper.Home.Wishlist;

public class WishModel {
    String p_img;
    String fav_img;
    String p_name;
    String desc;
    String price;

    public String getP_img() {
        return p_img;
    }

    public void setP_img(String p_img) {
        this.p_img = p_img;
    }

    public String getFav_img() {
        return fav_img;
    }

    public void setFav_img(String fav_img) {
        this.fav_img = fav_img;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
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

    public WishModel(String p_img, String fav_img, String p_name, String desc, String price, String offer) {
        this.p_img = p_img;
        this.fav_img = fav_img;
        this.p_name = p_name;
        this.desc = desc;
        this.price = price;
        this.offer = offer;
    }

    String offer;

    public WishModel(){}
}
