package com.example.shopkeeper.CategoryControlclass.ProductDetails;

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

public class PopularProductsAdapter extends RecyclerView.Adapter<PopularProductsAdapter.ViewHolder> {


    List<PopularProductsModel> popularProductsModelList;
    private Context context;


    public PopularProductsAdapter(Context context, List<PopularProductsModel> popularProductsModelList) {
        this.context = context;
        this.popularProductsModelList = popularProductsModelList;
    }

    @NonNull
    @Override
    public PopularProductsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.popular_products, parent, false);


        return new PopularProductsAdapter.ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }



    // total number of rows
    @Override
    public int getItemCount() {

        return popularProductsModelList.size();

    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView p_img,w_img;
        TextView p_name,desc,price,offer,rate;



        ViewHolder(View itemView) {
            super(itemView);
            p_img = itemView.findViewById(R.id.p_img);
            w_img = itemView.findViewById(R.id.fav_img);
            p_name = itemView.findViewById(R.id.wish_p_name);
            desc = itemView.findViewById(R.id.brand_wish);
            price = itemView.findViewById(R.id.price_wish);
            offer = itemView.findViewById(R.id.offer_wish);
            rate = itemView.findViewById(R.id.rate);



        }


    }


}