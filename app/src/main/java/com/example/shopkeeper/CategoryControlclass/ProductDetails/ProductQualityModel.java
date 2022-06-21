package com.example.shopkeeper.CategoryControlclass.ProductDetails;

public class ProductQualityModel {
    public ProductQualityModel(String quality_txt) {
        this.quality_txt = quality_txt;
    }

    public String getQuality_txt() {
        return quality_txt;
    }

    public void setQuality_txt(String quality_txt) {
        this.quality_txt = quality_txt;
    }

    String quality_txt;

    public ProductQualityModel(){}
}
