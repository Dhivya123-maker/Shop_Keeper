package com.example.shopkeeper.Home.Wishlist;

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

public class WishAdapter extends RecyclerView.Adapter<WishAdapter.ViewHolder> {


    List<WishModel> wishModelList;
    private Context context;


    public WishAdapter(Context context, List<WishModel> wishModelList) {
        this.context = context;
        this.wishModelList = wishModelList;
    }

    @NonNull
    @Override
    public WishAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.wishlist_recycle, parent, false);


        return new WishAdapter.ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }



    // total number of rows
    @Override
    public int getItemCount() {

        return wishModelList.size();

    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView p_img,fav_img;
        TextView p_name,b_name,price,offer;


        ViewHolder(View itemView) {
            super(itemView);
            p_img = itemView.findViewById(R.id.wish_img);
            fav_img = itemView.findViewById(R.id.fav_img);

            p_name = itemView.findViewById(R.id.wish_p_name);
            b_name = itemView.findViewById(R.id.brand_wish);
            price = itemView.findViewById(R.id.price_wish);
            offer = itemView.findViewById(R.id.offer_wish);




        }


    }


}