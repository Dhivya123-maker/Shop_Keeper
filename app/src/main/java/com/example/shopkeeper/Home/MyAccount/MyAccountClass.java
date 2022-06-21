package com.example.shopkeeper.Home.MyAccount;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.shopkeeper.Home.MyReview.MyReviewClass;
import com.example.shopkeeper.Home.Wishlist.Wishlist;
import com.example.shopkeeper.OrderStatus.Order;
import com.example.shopkeeper.Profile.ProfileClass;
import com.example.shopkeeper.R;

import java.util.ArrayList;
import java.util.List;

public class MyAccountClass extends AppCompatActivity {
    List<MyAccountModel> myAccountModelList;
    MyAccountAdapter myAccountAdapter;
    RecyclerView recyclerView;
    LinearLayout my_profile,my_wish,my_order,my_review;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myaccount_class);



        recyclerView = findViewById(R.id.see_all);
        my_profile = findViewById(R.id.profile_lnr);
        my_wish = findViewById(R.id.wishlist_lnr);
        my_order = findViewById(R.id.my_order);
        my_review =findViewById(R.id.my_review);



        my_review.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyAccountClass.this, MyReviewClass.class);
                startActivity(intent);
            }
        });


        my_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyAccountClass.this, Order.class);
                startActivity(intent);
            }
        });


        my_wish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MyAccountClass.this, Wishlist.class);
                startActivity(intent);
            }
        });

        my_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyAccountClass.this, ProfileClass.class);
                startActivity(intent);


            }
        });


        myAccountModelList = new ArrayList<>();

        for(int i=0;i<=5;i++){
            MyAccountModel myAccountModel = new MyAccountModel();
            myAccountModel.setImg("1");
            myAccountModel.setB_name("Brand : Vaamsi");
            myAccountModel.setPrice("Rs.450");
            myAccountModel.setOffer("(45% off)");


            myAccountModelList.add(myAccountModel);
        }


        myAccountAdapter = new MyAccountAdapter(MyAccountClass.this,myAccountModelList);
        recyclerView.setLayoutManager(new LinearLayoutManager(MyAccountClass.this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(myAccountAdapter);


    }
}