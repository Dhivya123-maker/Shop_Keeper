package com.example.shopkeeper.CategoryControlclass.ProductDetails;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shopkeeper.CategoryControlclass.ProductCatalog.ProductCatalogModel;
import com.example.shopkeeper.R;

import java.util.List;

public class ProductImageAdapter extends RecyclerView.Adapter<ProductImageAdapter.ViewHolder> {


    List<ProductImageModel> productImageModelList;
    private Context context;


    public ProductImageAdapter(Context context, List<ProductImageModel> productImageModelList) {
        this.context = context;
        this.productImageModelList = productImageModelList;
    }

    @NonNull
    @Override
    public ProductImageAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_details_one, parent, false);


        return new ProductImageAdapter.ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }



    // total number of rows
    @Override
    public int getItemCount() {

        return productImageModelList.size();

    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView full_img;



        ViewHolder(View itemView) {
            super(itemView);
            full_img = itemView.findViewById(R.id.full_img);




        }


    }


}