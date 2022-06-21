package com.example.shopkeeper.CategoryControlclass.ProductDetails.ProductOrderProcess;

public class DeliveryEstimatesModel {
    String img;
    String brand;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
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

    String desc;

    public DeliveryEstimatesModel(String img, String brand, String desc, String price, String offer) {
        this.img = img;
        this.brand = brand;
        this.desc = desc;
        this.price = price;
        this.offer = offer;
    }

    String price;
    String offer;

    public DeliveryEstimatesModel(){}

}
