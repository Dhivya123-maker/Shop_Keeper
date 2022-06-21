package com.example.shopkeeper.Home.Trending;

public class TrendingModel {
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getOffer() {
        return offer;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }

    String img;

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    String p_name;

    public TrendingModel(String img, String offer, String p_name) {
        this.img = img;
        this.offer = offer;
        this.p_name = p_name;
    }

    String offer;

    public TrendingModel(){}

}
