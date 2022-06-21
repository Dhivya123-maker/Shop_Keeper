package com.example.shopkeeper.CategoryControlclass.ProductDetails;

public class PopularProductsModel {
    String p_img;
    String w_img;

    public PopularProductsModel(String p_img, String w_img, String rating, String p_name, String desc, String price, String offer) {
        this.p_img = p_img;
        this.w_img = w_img;
        this.rating = rating;
        this.p_name = p_name;
        this.desc = desc;
        this.price = price;
        this.offer = offer;
    }

    String rating;

    public String getP_img() {
        return p_img;
    }

    public void setP_img(String p_img) {
        this.p_img = p_img;
    }

    public String getW_img() {
        return w_img;
    }

    public void setW_img(String w_img) {
        this.w_img = w_img;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
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

    String p_name;
    String desc;
    String price;
    String offer;

    public PopularProductsModel(){}

}
