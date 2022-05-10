package com.example.shopkeeper.Top_categories;

public class Rating_model {
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    String img;

    public Rating_model(String img, String txt) {
        this.img = img;
        this.txt = txt;
    }

    String txt;

    public Rating_model(){}
}
