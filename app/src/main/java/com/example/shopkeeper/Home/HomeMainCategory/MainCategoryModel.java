package com.example.shopkeeper.Home.HomeMainCategory;

public class MainCategoryModel {
    int id;

    public MainCategoryModel(String p_name, String price, String offer) {
        this.p_name = p_name;
        this.price = price;
        this.offer = offer;
    }

    String image;

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
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
    String price;
    String offer;

    public MainCategoryModel(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    String category;



    public MainCategoryModel(){

    }

    public MainCategoryModel(int id, String image) {
        this.id = id;
        this.image = image;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }



}
