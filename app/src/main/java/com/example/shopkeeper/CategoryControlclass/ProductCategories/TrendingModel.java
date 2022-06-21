package com.example.shopkeeper.CategoryControlclass.ProductCategories;

public class TrendingModel {
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    String img;

    public TrendingModel(String img, String txt) {
        this.img = img;
        this.txt = txt;
    }

    public TrendingModel(){}

    String txt;
}
