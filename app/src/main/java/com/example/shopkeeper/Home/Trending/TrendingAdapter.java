package com.example.shopkeeper.Home.Trending;

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

public class TrendingAdapter extends RecyclerView.Adapter<TrendingAdapter.ViewHolder> {


    List<TrendingModel> trendingModelList;
    private Context context;


    public TrendingAdapter(Context context, List<TrendingModel> trendingModelList) {
        this.context = context;
        this.trendingModelList = trendingModelList;
    }

    @NonNull
    @Override
    public TrendingAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.trending_offers, parent, false);


        return new TrendingAdapter.ViewHolder(view);


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