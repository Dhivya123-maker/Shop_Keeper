package com.example.shopkeeper.trending;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shopkeeper.R;
import com.example.shopkeeper.Top_sell.Top_sell_Model;

import java.util.List;

public class Trending_Adapter extends RecyclerView.Adapter<Trending_Adapter.ViewHolder> {


    List<Trending_model> trendingModelList;
    private Context context;


    public Trending_Adapter(Context context, List<Trending_model> trendingModelList) {
        this.context = context;
        this.trendingModelList = trendingModelList;
    }

    @NonNull
    @Override
    public Trending_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.trending_offers, parent, false);


        return new Trending_Adapter.ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


    }



    // total number of rows
    @Override
    public int getItemCount() {

        return 5;

    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView offer,p_name;


        ViewHolder(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.deal_img);
            p_name = itemView.findViewById(R.id.name_txt);
            offer = itemView.findViewById(R.id.offer_txt);




        }


    }


}