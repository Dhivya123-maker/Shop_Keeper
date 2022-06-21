package com.example.shopkeeper.CategoryControlclass.ProductCatalog.FilterClass;

public class PriceModel {
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public PriceModel(String price) {
        this.price = price;
    }

    String price;

    public PriceModel(){}

}
