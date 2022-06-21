package com.example.shopkeeper.CategoryControlclass.ProductDetails;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shopkeeper.R;

import java.util.List;

public class ProductColorImageAdapter extends RecyclerView.Adapter<ProductColorImageAdapter.ViewHolder> {


    List<ProductColorImagesModel> productColorImagesModelList;
    private Context context;


    public ProductColorImageAdapter(Context context, List<ProductColorImagesModel> productColorImagesModelList) {
        this.context = context;
        this.productColorImagesModelList = productColorImagesModelList;
    }

    @NonNull
    @Override
    public ProductColorImageAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_details_two, parent, false);


        return new ProductColorImageAdapter.ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }



    // total number of rows
    @Override
    public int getItemCount() {

        return productColorImagesModelList.size();

    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView color_img;



        ViewHolder(View itemView) {
            super(itemView);
            color_img = itemView.findViewById(R.id.color_img);




        }


    }


}