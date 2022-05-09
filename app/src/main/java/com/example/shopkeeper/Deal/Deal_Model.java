package com.example.shopkeeper.Deal;

public class Deal_Model {
    String img;
    String name;

    public Deal_Model(String img, String name, String price, String offer) {
        this.img = img;
        this.name = name;
        this.price = price;
        this.offer = offer;
    }

    String price;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getOffer() {
        return offer;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }

    String offer;

    public Deal_Model(){}

}
