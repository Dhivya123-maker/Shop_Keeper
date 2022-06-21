package com.example.shopkeeper.Home.MyCart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import com.example.shopkeeper.Cart.CartAdapter;
import com.example.shopkeeper.Cart.CartModel;
import com.example.shopkeeper.R;

import java.util.ArrayList;
import java.util.List;

public class SeeLaterClass extends AppCompatActivity {
    List<CartModel> cartModelList;
    CartAdapter cart_adapter;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see_later_class);

       getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_NOTHING);

        recyclerView = findViewById(R.id.cart_recycle_two);


        cartModelList = new ArrayList<>();

        for(int i=0;i<2;i++){
            CartModel cart_model = new CartModel();
            cart_model.setP_name("Women's Ruby Cotton Printed");
            cart_model.setB_name("Brand : Vaamsi");
            cart_model.setImg("1");
            cart_model.setRating("4.3");
            cart_model.setPrice("Rs.450");
            cart_model.setOffer("(45% off)");
            cart_model.setDeleivery("Delivery in 2 Days,Fri");
            cart_model.setShipping("|FREE Shipping");

            cartModelList.add(cart_model);


        }

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(SeeLaterClass.this) {
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        };
        cart_adapter =  new CartAdapter(SeeLaterClass.this,cartModelList);
        recyclerView.setAdapter(cart_adapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}