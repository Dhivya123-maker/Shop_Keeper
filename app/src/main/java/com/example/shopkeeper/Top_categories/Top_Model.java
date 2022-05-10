package com.example.shopkeeper.Top_categories;

public class Top_Model {


    String image;

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    String txt;



    public Top_Model(){

    }

    public Top_Model( String image,String txt) {

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
