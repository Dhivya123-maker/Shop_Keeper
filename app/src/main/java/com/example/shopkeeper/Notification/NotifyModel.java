package com.example.shopkeeper.Notification;

public class NotifyModel {
    String img;

    public NotifyModel(String img, String name, String date) {
        this.img = img;
        this.name = name;
        this.date = date;
    }

    String name;

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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    String date;

    public NotifyModel(){}

}
