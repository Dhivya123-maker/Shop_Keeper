package com.example.shopkeeper.AllCategories;

public class AllCategoryModel {
    public AllCategoryModel(String img, String name) {
        this.img = img;
        this.name = name;
    }

    String img;

    public void setImg(String img) {
        this.img = img;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public AllCategoryModel(){

    }
}
