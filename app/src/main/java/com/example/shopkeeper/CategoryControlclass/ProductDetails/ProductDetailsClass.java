package com.example.shopkeeper.CategoryControlclass.ProductDetails;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.shopkeeper.BannerIndicatorAdapter;
import com.example.shopkeeper.BannerIndicatorClass;
import com.example.shopkeeper.CategoryControlclass.ProductCatalog.ProductCatalogAdapter;
import com.example.shopkeeper.CategoryControlclass.ProductCatalog.ProductCatalogModel;
import com.example.shopkeeper.CategoryControlclass.ProductCategories.MoreDetailsClass;
import com.example.shopkeeper.CategoryControlclass.ProductDetails.ProductOrderProcess.ProductOrderProcessClass;
import com.example.shopkeeper.Home.MyReview.MyReviewClass;
import com.example.shopkeeper.Home.Wishlist.Wishlist;
import com.example.shopkeeper.R;

import java.util.ArrayList;
import java.util.List;

public class ProductDetailsClass extends AppCompatActivity {

    RecyclerView products_recycle,color_image_recycle,size_recyclerview,similar_recycle,popular_recycle,product_quality_recycle,products_review;
    List<ProductImageModel> productImageModelList;
    ProductImageAdapter productImageAdapter;
    List<ProductColorImagesModel> productColorImagesModelList;
    ProductColorImageAdapter productColorImageAdapter;


    List<ProductSizeModel> productSizeModelList;
    ProductSizeAdapter productSizeAdapter;

    List<ProductCatalogModel> productmodelList;
    ProductCatalogAdapter productAdapter;

    List<PopularProductsModel> popularProductsModelList;
    PopularProductsAdapter popularProductsAdapter;

    List<ProductQualityModel> productQualityModelList;
    ProductQualityAdapter productQualityAdapter;

    List<ProductReviewsModel> productsReviewsModelList;
    ProductReviewsAdapter productReviewsAdapter;

    TextView more,review;
    Button buy_now;
    RelativeLayout fav_lnr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_product_details);

        products_recycle = findViewById(R.id.product_recycle);
        color_image_recycle= findViewById(R.id.product_recycle_one);
        size_recyclerview = findViewById(R.id.size_recycle);
        similar_recycle = findViewById(R.id.similar_recycle);
        popular_recycle = findViewById(R.id.popular_recycle);
        product_quality_recycle = findViewById(R.id.product_comfort);
        products_review = findViewById(R.id.image_recycle);
        buy_now= findViewById(R.id.buy_now_btn);
        fav_lnr = findViewById(R.id.fav_lnr);

        more = findViewById(R.id.more);
        review = findViewById(R.id.review_txt);

        fav_lnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProductDetailsClass.this, Wishlist.class);
                startActivity(intent);
            }
        });


        buy_now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProductDetailsClass.this, ProductOrderProcessClass.class);
                startActivity(intent);
            }
        });

        review.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProductDetailsClass.this, MyReviewClass.class);
                startActivity(intent);
            }
        });

        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProductDetailsClass.this, MoreDetailsClass.class);
                startActivity(intent);
            }
        });


        productImageModelList = new ArrayList<>();

        for(int i=0;i<=5;i++){
            ProductImageModel productImageModel = new ProductImageModel();
            productImageModel.setProduct_image("1");


            productImageModelList.add(productImageModel);
        }


        productImageAdapter = new ProductImageAdapter(ProductDetailsClass.this,productImageModelList);
        products_recycle.setLayoutManager(new LinearLayoutManager(ProductDetailsClass.this, LinearLayoutManager.HORIZONTAL, false));
        products_recycle.setAdapter(productImageAdapter);

        products_recycle.getLayoutParams().height = ViewGroup.LayoutParams.WRAP_CONTENT;

        BannerIndicatorAdapter adapter = new BannerIndicatorAdapter(5, R.layout.product_details_one);

        products_recycle.setAdapter(adapter);
        products_recycle.setLayoutManager(new LinearLayoutManager(ProductDetailsClass.this, LinearLayoutManager.HORIZONTAL, false));

        // add pager behavior
        PagerSnapHelper snapHelper = new PagerSnapHelper();
        snapHelper.attachToRecyclerView(products_recycle);

        // pager indicator
        products_recycle.addItemDecoration(new BannerIndicatorClass());




        productColorImagesModelList = new ArrayList<>();

        for(int i=0;i<=10;i++){
            ProductColorImagesModel productColorImagesModel = new ProductColorImagesModel();
            productColorImagesModel.setProduct_image("1");


            productColorImagesModelList.add(productColorImagesModel);
        }


        productColorImageAdapter = new ProductColorImageAdapter(ProductDetailsClass.this,productColorImagesModelList);
        color_image_recycle.setLayoutManager(new LinearLayoutManager(ProductDetailsClass.this, LinearLayoutManager.HORIZONTAL, false));
        color_image_recycle.setAdapter(productColorImageAdapter);

        productSizeModelList = new ArrayList<>();

        for(int i=0;i<=5;i++){
            ProductSizeModel productSizeModel = new ProductSizeModel();
            productSizeModel.setSize("XL");


            productSizeModelList.add(productSizeModel);
        }


        productSizeAdapter = new ProductSizeAdapter(ProductDetailsClass.this,productSizeModelList);
        size_recyclerview.setLayoutManager(new LinearLayoutManager(ProductDetailsClass.this, LinearLayoutManager.HORIZONTAL, false));
        size_recyclerview.setAdapter(productSizeAdapter);




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

        productAdapter = new ProductCatalogAdapter(ProductDetailsClass.this,productmodelList);
        similar_recycle.setLayoutManager(new LinearLayoutManager(ProductDetailsClass.this, LinearLayoutManager.HORIZONTAL, false));
        similar_recycle.setAdapter(productAdapter);




        popularProductsModelList = new ArrayList<>();

        for(int i=0;i<5;i++){
            PopularProductsModel productmodel = new PopularProductsModel();
            productmodel.setP_img("1");
            productmodel.setW_img("2");
            productmodel.setP_name("Asen");
            productmodel.setDesc("Women's Ruby Cotton Printed Straight Kurta");
            productmodel.setPrice("Rs.450");
            productmodel.setOffer("(45% off)");


            popularProductsModelList.add(productmodel);
        }

        popularProductsAdapter = new PopularProductsAdapter(ProductDetailsClass.this,popularProductsModelList);
        popular_recycle.setLayoutManager(new LinearLayoutManager(ProductDetailsClass.this, LinearLayoutManager.HORIZONTAL, false));
        popular_recycle.setAdapter(popularProductsAdapter);




        productQualityModelList = new ArrayList<>();

        for(int i=0;i<5;i++){
            ProductQualityModel productmodel = new ProductQualityModel();
            productmodel.setQuality_txt("Value of Money");



            productQualityModelList.add(productmodel);
        }

        GridLayoutManager layoutManager=new GridLayoutManager(ProductDetailsClass.this,3){
            @Override
            public boolean canScrollVertically() {

                return false;
            }
        };

        product_quality_recycle.setLayoutManager(layoutManager);
        productQualityAdapter =  new ProductQualityAdapter(ProductDetailsClass.this,productQualityModelList);
        product_quality_recycle.setAdapter(productQualityAdapter);




        productsReviewsModelList = new ArrayList<>();

        for(int i=0;i<3;i++){
            ProductReviewsModel productmodel = new ProductReviewsModel();
            productmodel.setImg("1");


            productsReviewsModelList.add(productmodel);
        }

        productReviewsAdapter = new ProductReviewsAdapter(ProductDetailsClass.this,productsReviewsModelList);
        products_review.setLayoutManager(new LinearLayoutManager(ProductDetailsClass.this, LinearLayoutManager.HORIZONTAL, false));
        products_review.setAdapter(productReviewsAdapter);


    }
}