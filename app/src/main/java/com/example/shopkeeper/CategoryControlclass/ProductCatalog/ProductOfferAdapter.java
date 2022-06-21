package com.example.shopkeeper.CategoryControlclass.ProductCatalog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shopkeeper.R;

import java.util.List;

public class ProductOfferAdapter extends RecyclerView.Adapter<ProductOfferAdapter.ViewHolder> {


    List<ProductOfferModel> productOfferModelList;
    private Context context;


    public ProductOfferAdapter(Context context, List<ProductOfferModel> productOfferModelList) {
        this.context = context;
        this.productOfferModelList = productOfferModelList;
    }

    @NonNull
    @Override
    public ProductOfferAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_offer_recycle, parent, false);


        return new ProductOfferAdapter.ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }



    // total number of rows
    @Override
    public int getItemCount() {

        return productOfferModelList.size();

    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView product_img,brand_img;
        TextView offer;


        ViewHolder(View itemView) {
            super(itemView);
            product_img = itemView.findViewById(R.id.pro_img);
            brand_img = itemView.findViewById(R.id.brand_img);


            offer = itemView.findViewById(R.id.offer_txt);




        }


    }


}