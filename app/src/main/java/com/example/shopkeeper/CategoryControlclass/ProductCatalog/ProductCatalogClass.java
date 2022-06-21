package com.example.shopkeeper.CategoryControlclass.ProductCatalog;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


import com.example.shopkeeper.CategoryControlclass.ProductCatalog.FilterClass.ColorsAdapter;
import com.example.shopkeeper.CategoryControlclass.ProductCatalog.FilterClass.ColorsModel;
import com.example.shopkeeper.CategoryControlclass.ProductCatalog.FilterClass.CustomerRatingAdapter;
import com.example.shopkeeper.CategoryControlclass.ProductCatalog.FilterClass.CustomerRatingModel;
import com.example.shopkeeper.CategoryControlclass.ProductCatalog.FilterClass.FabricAdapter;
import com.example.shopkeeper.CategoryControlclass.ProductCatalog.FilterClass.FabricModel;
import com.example.shopkeeper.CategoryControlclass.ProductCatalog.FilterClass.OccasionAdapter;
import com.example.shopkeeper.CategoryControlclass.ProductCatalog.FilterClass.OccasionModel;
import com.example.shopkeeper.CategoryControlclass.ProductCatalog.FilterClass.ProductOffersAdapter;
import com.example.shopkeeper.CategoryControlclass.ProductCatalog.FilterClass.ProductOffersModel;
import com.example.shopkeeper.CategoryControlclass.ProductCatalog.FilterClass.PriceAdapter;
import com.example.shopkeeper.CategoryControlclass.ProductCatalog.FilterClass.PriceModel;
import com.example.shopkeeper.CategoryControlclass.ProductCatalog.FilterClass.SizeAdapter;
import com.example.shopkeeper.CategoryControlclass.ProductCatalog.FilterClass.SizeModel;
import com.example.shopkeeper.CategoryControlclass.ProductCatalog.FilterClass.StockAdapter;
import com.example.shopkeeper.CategoryControlclass.ProductCatalog.FilterClass.StockModel;
import com.example.shopkeeper.CategoryControlclass.ProductDetails.PopularProductsAdapter;
import com.example.shopkeeper.CategoryControlclass.ProductDetails.PopularProductsModel;
import com.example.shopkeeper.CountryPicker.CountrySelectActivity;
import com.example.shopkeeper.CountryPicker.bean.CountryData;
import com.example.shopkeeper.CountryPicker.custom.CountryPickerView;
import com.example.shopkeeper.Home.Wishlist.Wishlist;
import com.example.shopkeeper.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.List;


public class ProductCatalogClass extends AppCompatActivity {
    List<ProductCatalogModel> productmodelList;
    ProductCatalogAdapter productAdapter;

    List<ProductOfferModel> productOfferModelList;
    ProductOfferAdapter productOfferAdapter;


    RecyclerView product_recycle,product_recycle_one;
    LinearLayout sort,filter;
    RelativeLayout fav_lnr;
    PopupWindow popview;
    Button cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_productclass);

        sort = findViewById(R.id.sort_lnr);

        product_recycle = findViewById(R.id.product_recycle);
        product_recycle_one = findViewById(R.id.product_recycle_one);
        filter = findViewById(R.id.filter_lnr);
        fav_lnr = findViewById(R.id.fav_lnr);


        productmodelList = new ArrayList<>();

        for(int i=0;i<8;i++){
            ProductCatalogModel productmodel = new ProductCatalogModel();
            productmodel.setP_img("1");
            productmodel.setFav_img("2");
            productmodel.setP_name("Asen");
            productmodel.setDesc("Women's Ruby Cotton Printed Straight Kurta");
            productmodel.setPrice("Rs.450");
            productmodel.setOffer("(45% off)");


            productmodelList.add(productmodel);
        }

        GridLayoutManager layoutManager=new GridLayoutManager(ProductCatalogClass.this,2){
            @Override
            public boolean canScrollVertically() {

                return false;
            }
        };

        product_recycle.setLayoutManager(layoutManager);
        productAdapter =  new ProductCatalogAdapter(ProductCatalogClass.this,productmodelList);
        product_recycle.setAdapter(productAdapter);



        productOfferModelList = new ArrayList<>();

        for(int i=0;i<8;i++){
            ProductOfferModel productOfferModel = new ProductOfferModel();
            productOfferModel.setProduct_img("1");
            productOfferModel.setBrand_img("2");
            productOfferModel.setOffer("Min 50% Off");

            productOfferModelList.add(productOfferModel);
        }


        productOfferAdapter =  new ProductOfferAdapter(ProductCatalogClass.this,productOfferModelList);
        product_recycle_one.setLayoutManager(new LinearLayoutManager(ProductCatalogClass.this, LinearLayoutManager.HORIZONTAL, false));
        product_recycle_one.setAdapter(productOfferAdapter);


        sort.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View view) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(view.getContext());
                bottomSheetDialog.setContentView(R.layout.sort_popup);
                bottomSheetDialog.setCancelable(false);


                TextView close = bottomSheetDialog.findViewById(R.id.close);

                close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        bottomSheetDialog.dismiss();
                    }
                });


                bottomSheetDialog.show();


            }
        });

        filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(view.getContext());


                bottomSheetDialog.setContentView(R.layout.fragment_bottom);



                bottomSheetDialog.setCancelable(false);


                RecyclerView price_recycle,rating_recycle,size_recycle,offers,colors,occasion,fabric,stock;

                List<PriceModel> filtermodelList;
                PriceAdapter filter_adapter;

                List<CustomerRatingModel> ratingModelList;
                CustomerRatingAdapter rating_adapter;

                List<SizeModel> sizeModelList;
                SizeAdapter sizeAdapter;

                List<ProductOffersModel> offersModelList;
                ProductOffersAdapter offersAdapter;


                List<ColorsModel> colorsModelList;
                ColorsAdapter colorsAdapter;

                List<OccasionModel> occasionModelList;
                OccasionAdapter occasionAdapter;

                List<FabricModel> fabricModelList;
                FabricAdapter fabricAdapter;

                List<StockModel> stockModelList;
                StockAdapter stockAdapter;

                TextView close;





                rating_recycle = bottomSheetDialog.findViewById(R.id.cus_rating_recycle);
                size_recycle = bottomSheetDialog.findViewById(R.id.size_recycle);
                price_recycle = bottomSheetDialog.findViewById(R.id.price_recycle);
                offers = bottomSheetDialog.findViewById(R.id.offers_recyclerview);
                colors = bottomSheetDialog.findViewById(R.id.colors_recyclerview);
                occasion = bottomSheetDialog.findViewById(R.id.Occasion_recyclerview);
                fabric = bottomSheetDialog.findViewById(R.id.fabric_recyclerview);
                stock = bottomSheetDialog.findViewById(R.id.stock_recyclerview);

                close = bottomSheetDialog.findViewById(R.id.close);


                close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        bottomSheetDialog.dismiss();
                    }
                });



                filtermodelList = new ArrayList<>();
                for(int i=0;i<5;i++){
                    PriceModel filtermodel = new PriceModel();

                    filtermodel.setPrice("300 - 400");

                    filtermodelList.add(filtermodel);
                }


                GridLayoutManager layoutManager=new GridLayoutManager(ProductCatalogClass.this,3){
                    @Override
                    public boolean canScrollVertically() {

                        return false;
                    }
                };

                price_recycle.setLayoutManager(layoutManager);
                filter_adapter =  new PriceAdapter(ProductCatalogClass.this,filtermodelList);
                price_recycle.setAdapter(filter_adapter);




                ratingModelList = new ArrayList<>();

                for(int i=0;i<5;i++){
                    CustomerRatingModel ratingModel = new CustomerRatingModel();

                    ratingModel.setTxt("4 Above");

                    ratingModelList.add(ratingModel);
                }

                GridLayoutManager layoutManager1=new GridLayoutManager(ProductCatalogClass.this,3){
                    @Override
                    public boolean canScrollVertically() {

                        return false; }
                };

                rating_recycle.setLayoutManager(layoutManager1);
                rating_adapter =  new CustomerRatingAdapter(ProductCatalogClass.this,ratingModelList);
                rating_recycle.setAdapter(rating_adapter);


                sizeModelList = new ArrayList<>();

                for(int i=0;i<6;i++){
                    SizeModel sizeModel = new SizeModel();

                    sizeModel.setTxt("XL");

                    sizeModelList.add(sizeModel);
                }

                GridLayoutManager layoutManager2=new GridLayoutManager(ProductCatalogClass.this,6){
                    @Override
                    public boolean canScrollVertically() {

                        return false;
                    }
                };

                size_recycle.setLayoutManager(layoutManager2);
                sizeAdapter =  new SizeAdapter(ProductCatalogClass.this,sizeModelList);
                size_recycle.setAdapter(sizeAdapter);



                offersModelList = new ArrayList<>();

                for(int i=0;i<3;i++){
                    ProductOffersModel offersModel = new ProductOffersModel();

                    offersModel.setTxt("Buy More,Save More");

                    offersModelList.add(offersModel);
                }





                offersAdapter =  new ProductOffersAdapter(ProductCatalogClass.this,offersModelList);
                offers.setAdapter(offersAdapter);


                GridLayoutManager layoutManager3=new GridLayoutManager(ProductCatalogClass.this,2){
                    @Override
                    public boolean canScrollVertically() {

                        return false;
                    }
                };
                offers.setLayoutManager(layoutManager3);




                colorsModelList = new ArrayList<>();

                for(int i=0;i<5;i++){
                    ColorsModel colorsModel = new ColorsModel();

                    colorsModel.setText("White");

                    colorsModelList.add(colorsModel);
                }



                colorsAdapter =  new ColorsAdapter(ProductCatalogClass.this,colorsModelList);
                colors.setAdapter(colorsAdapter);

                GridLayoutManager layoutManager4=new GridLayoutManager(ProductCatalogClass.this,3){
                    @Override
                    public boolean canScrollVertically() {

                        return false;
                    }
                };

                colors.setLayoutManager(layoutManager4);




                occasionModelList = new ArrayList<>();

                for(int i=0;i<4;i++){
                    OccasionModel occasionModel = new OccasionModel();

                    occasionModel.setText("Casual");

                    occasionModelList.add(occasionModel);
                }



                occasionAdapter =  new OccasionAdapter(ProductCatalogClass.this,occasionModelList);
                occasion.setAdapter(occasionAdapter);

                GridLayoutManager layoutManager5=new GridLayoutManager(ProductCatalogClass.this,2){
                    @Override
                    public boolean canScrollVertically() {

                        return true;
                    }
                };

                occasion.setLayoutManager(layoutManager5);




                fabricModelList = new ArrayList<>();

                for(int i=0;i<5;i++){
                    FabricModel fabricModel = new FabricModel();

                    fabricModel.setText("Pure Cotton");

                    fabricModelList.add(fabricModel);
                }



                fabricAdapter =  new FabricAdapter(ProductCatalogClass.this,fabricModelList);
                fabric.setAdapter(fabricAdapter);

                GridLayoutManager layoutManager6=new GridLayoutManager(ProductCatalogClass.this,3){
                    @Override
                    public boolean canScrollVertically() {

                        return true;
                    }
                };

                fabric.setLayoutManager(layoutManager6);






                stockModelList = new ArrayList<>();

                for(int i=0;i<=1;i++){
                    StockModel stockModel = new StockModel();

                    stockModel.setText("Include Out Of Stock");

                    stockModelList.add(stockModel);
                }



                stockAdapter =  new StockAdapter(ProductCatalogClass.this,stockModelList);
                stock.setAdapter(stockAdapter);

                GridLayoutManager layoutManager7=new GridLayoutManager(ProductCatalogClass.this,1){
                    @Override
                    public boolean canScrollVertically() {

                        return true;
                    }
                };

                stock.setLayoutManager(layoutManager7);

                bottomSheetDialog.show();


            }
        });


        fav_lnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              Intent intent = new Intent(ProductCatalogClass.this, Wishlist.class);
              startActivity(intent);

            }
        });


    }


}