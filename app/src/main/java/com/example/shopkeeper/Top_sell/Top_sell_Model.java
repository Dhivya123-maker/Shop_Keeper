package com.example.shopkeeper.Top_sell;

public class Top_sell_Model {
    String img;
    String product_name;

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Top_sell_Model(String img, String product_name) {
        this.img = img;
        this.product_name = product_name;

    }



    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }



    public Top_sell_Model(){}

}
