package com.example.shopkeeper.CategoryControlclass.ProductCatalog.FilterClass;

public class CustomerRatingModel {
    public CustomerRatingModel(String txt) {
        this.txt = txt;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    String txt;

    public CustomerRatingModel(){}
}
