package com.example.shopkeeper.Cart;

public class CartModel {
    String p_name;
    String b_name;
    String img;

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

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
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

    public String getDeleivery() {
        return deleivery;
    }

    public void setDeleivery(String deleivery) {
        this.deleivery = deleivery;
    }

    public String getShipping() {
        return shipping;
    }

    public void setShipping(String shipping) {
        this.shipping = shipping;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public CartModel(String p_name, String b_name, String rating, String price, String offer, String deleivery, String shipping, String img) {
        this.p_name = p_name;
        this.b_name = b_name;
        this.rating = rating;
        this.price = price;
        this.offer = offer;
        this.deleivery = deleivery;
        this.shipping = shipping;
        this.img = img;
    }

    String rating;
    String price;
    String offer;
    String deleivery;
    String shipping;

    public CartModel(){}

}
