package com.example.shopkeeper.CategoryControlclass.ProductCatalog.FilterClass;

public class StockModel {

    public StockModel(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    String text;

    public StockModel(){}

}
