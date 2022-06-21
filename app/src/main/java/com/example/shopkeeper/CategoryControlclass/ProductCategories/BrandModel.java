package com.example.shopkeeper.CategoryControlclass.ProductCategories;

public class BrandModel {
    public BrandModel(String img) {
        this.img = img;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    String img;

    public String getBrand_logo() {
        return brand_logo;
    }

    public void setBrand_logo(String brand_logo) {
        this.brand_logo = brand_logo;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public String getOffer_btn() {
        return offer_btn;
    }

    public void setOffer_btn(String offer_btn) {
        this.offer_btn = offer_btn;
    }

    public BrandModel(String brand_logo, String txt, String offer_btn) {
        this.brand_logo = brand_logo;
        this.txt = txt;
        this.offer_btn = offer_btn;
    }

    String brand_logo;
    String txt;
    String offer_btn;

    public BrandModel(){}

}
