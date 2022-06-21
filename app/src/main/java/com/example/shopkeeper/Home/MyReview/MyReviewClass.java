package com.example.shopkeeper.Home.MyReview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shopkeeper.R;

import java.util.ArrayList;
import java.util.List;

public class MyReviewClass extends AppCompatActivity {
    List<MyReviewModel> myReviewModelList;
    MyReviewAdapter myReviewAdapter;

    List<PurchaseModel> purchaseModelList;
    PurchaseAdapter purchaseAdapter;
    RecyclerView review_recycle,purchase_recycle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_review);

        review_recycle = findViewById(R.id.review_recycle);
        purchase_recycle = findViewById(R.id.purchase_recycle);

        myReviewModelList = new ArrayList<>();

        for(int i=0;i<=1;i++){
            MyReviewModel myReviewModel = new MyReviewModel();
            myReviewModel.setP_name("Women's Ruby Cotton Printed");
            myReviewModel.setB_name("Brand : Vaamsi");
            myReviewModel.setPrice("Rs.450");
            myReviewModel.setOffer("(45% off)");
            myReviewModel.setRating("4.3");
            myReviewModel.setReviews("In publishing and graphic design, Lorem ipsum is a placeholder text commonly used to demon trate the visual form of a document");


            myReviewModelList.add(myReviewModel);
        }


        myReviewAdapter = new MyReviewAdapter(MyReviewClass.this,myReviewModelList);
        review_recycle.setLayoutManager(new LinearLayoutManager(MyReviewClass.this, LinearLayoutManager.VERTICAL, false));
        review_recycle.setAdapter(myReviewAdapter);



        purchaseModelList = new ArrayList<>();

        for(int i=0;i<=1;i++){
            PurchaseModel purchaseModel = new PurchaseModel();
            purchaseModel.setP_name("Women's Ruby Cotton Printed");
            purchaseModel.setB_name("Brand : Vaamsi");
            purchaseModel.setPrice("Rs.450");
            purchaseModel.setOffer("(45% off)");



            purchaseModelList.add(purchaseModel);
        }


        purchaseAdapter = new PurchaseAdapter(MyReviewClass.this,purchaseModelList);
        purchase_recycle.setLayoutManager(new LinearLayoutManager(MyReviewClass.this, LinearLayoutManager.VERTICAL, false));
        purchase_recycle.setAdapter(purchaseAdapter);

    }
}