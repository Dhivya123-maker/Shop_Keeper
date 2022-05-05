package com.example.shopkeeper.HomeMainCategory;

public class MainCategoryModel {
    int id;
    String image;



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
