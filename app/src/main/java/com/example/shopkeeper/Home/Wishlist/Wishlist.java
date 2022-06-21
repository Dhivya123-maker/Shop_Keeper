package com.example.shopkeeper.Home.Wishlist;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shopkeeper.R;

import java.util.ArrayList;
import java.util.List;

public class Wishlist extends AppCompatActivity {
    List<WishModel> wishModelList;
    WishAdapter wish_adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wishlist);

        recyclerView = findViewById(R.id.wish_recycle);

        wishModelList = new ArrayList<>();

        for(int i=0;i<8;i++){
            WishModel wish_model = new WishModel();
            wish_model.setP_img("1");
            wish_model.setFav_img("2");
            wish_model.setP_name("Asen");
            wish_model.setDesc("Women's Ruby Cotton Printed Straight Kurta");
            wish_model.setPrice("Rs.450");
            wish_model.setOffer("(45% off)");


            wishModelList.add(wish_model);
        }

        GridLayoutManager layoutManager=new GridLayoutManager(Wishlist.this,2){
            @Override
            public boolean canScrollVertically() {
                return true;
            }
        };

        recyclerView.setLayoutManager(layoutManager);
        wish_adapter =  new WishAdapter(Wishlist.this,wishModelList);
        recyclerView.setAdapter(wish_adapter);

    }
}