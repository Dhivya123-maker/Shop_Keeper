package com.example.shopkeeper.Top_sell;

public class Top_sell_one_Model {
    String img;
    String product_name;

    public String getOffer() {
        return offer;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }

    String offer;

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Top_sell_one_Model(String img, String product_name, String offer) {
        this.img = img;
        this.product_name = product_name;
        this.offer = offer;

    }



    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }



    public Top_sell_one_Model(){}

}
