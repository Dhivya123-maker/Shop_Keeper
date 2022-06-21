package com.example.shopkeeper.CategoryControlclass.ProductDetails;

public class ProductImageModel {
    public ProductImageModel(String product_image) {
        this.product_image = product_image;
    }

    public String getProduct_image() {
        return product_image;
    }

    public void setProduct_image(String product_image) {
        this.product_image = product_image;
    }

    String product_image;

    public ProductImageModel(){}
}
