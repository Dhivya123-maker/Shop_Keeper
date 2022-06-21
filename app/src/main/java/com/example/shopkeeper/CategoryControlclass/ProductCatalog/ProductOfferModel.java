package com.example.shopkeeper.CategoryControlclass.ProductCatalog;

public class ProductOfferModel {

    public ProductOfferModel(String product_img, String brand_img, String offer) {
        this.product_img = product_img;
        this.brand_img = brand_img;
        this.offer = offer;
    }

    String product_img;
    String brand_img;

    public String getProduct_img() {
        return product_img;
    }

    public void setProduct_img(String product_img) {
        this.product_img = product_img;
    }

    public String getBrand_img() {
        return brand_img;
    }

    public void setBrand_img(String brand_img) {
        this.brand_img = brand_img;
    }

    public String getOffer() {
        return offer;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }

    String offer;

    public ProductOfferModel(){}
}
