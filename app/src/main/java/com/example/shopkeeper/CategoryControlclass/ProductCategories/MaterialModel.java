package com.example.shopkeeper.CategoryControlclass.ProductCategories;

public class MaterialModel {


    String image;

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    String txt;



    public MaterialModel(){

    }

    public MaterialModel(String image, String txt) {

        this.image = image;
        this.txt = txt;

    }



    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
