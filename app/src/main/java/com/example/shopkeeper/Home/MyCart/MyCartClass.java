package com.example.shopkeeper.Home.MyCart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.shopkeeper.Cart.CartAdapter;
import com.example.shopkeeper.Cart.CartModel;
import com.example.shopkeeper.Cart.ChangeAddressFragment;
import com.example.shopkeeper.Cart.SeeLaterFragment;
import com.example.shopkeeper.R;

import java.util.ArrayList;
import java.util.List;

public class MyCartClass extends AppCompatActivity {

    TextView see_later;
    Button change;
    List<CartModel> cartModelList;
    CartAdapter cart_adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_cart_class);

        see_later = findViewById(R.id.see_later);
        change = findViewById(R.id.change_btn);

        recyclerView = findViewById(R.id.cart_recycle);



        see_later.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MyCartClass.this,SeeLaterClass.class);
                startActivity(intent);
            }
        });

        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyCartClass.this,ChangeAddressClass.class);
                startActivity(intent);
            }
        });



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

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MyCartClass.this) {
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        };
        cart_adapter =  new CartAdapter(MyCartClass.this,cartModelList);
        recyclerView.setAdapter(cart_adapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}