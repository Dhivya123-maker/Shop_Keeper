package com.example.shopkeeper.Home.MyReview;

public class MyReviewModel {
    String p_name;

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

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getP_img() {
        return p_img;
    }

    public void setP_img(String p_img) {
        this.p_img = p_img;
    }

    public String getReviews() {
        return reviews;
    }

    public void setReviews(String reviews) {
        this.reviews = reviews;
    }

    String b_name;
    String price;

    public MyReviewModel(String p_name, String b_name, String price, String offer, String rating, String p_img, String reviews) {
        this.p_name = p_name;
        this.b_name = b_name;
        this.price = price;
        this.offer = offer;
        this.rating = rating;
        this.p_img = p_img;
        this.reviews = reviews;
    }

    String offer;
    String rating;
    String p_img;
    String reviews;

    public MyReviewModel(){}
}
