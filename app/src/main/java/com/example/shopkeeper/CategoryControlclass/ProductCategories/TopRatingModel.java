package com.example.shopkeeper.CategoryControlclass.ProductCategories;

public class TopRatingModel {
    String img;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getOffer_txt() {
        return offer_txt;
    }

    public void setOffer_txt(String offer_txt) {
        this.offer_txt = offer_txt;
    }

    String product_name;

    public TopRatingModel(String img, String product_name, String offer_txt) {
        this.img = img;
        this.product_name = product_name;
        this.offer_txt = offer_txt;
    }

    String offer_txt;


    public TopRatingModel(){}

}
