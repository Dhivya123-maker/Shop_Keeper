package com.example.shopkeeper.Top_categories;


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

import de.hdodenhof.circleimageview.CircleImageView;

public class Trending_Adapter extends RecyclerView.Adapter<Trending_Adapter.MyViewHolder> {


    List<Trending_model> trendingModelList;
    Context context;

    public Trending_Adapter(Context context, List<Trending_model> trendingModelList) {
        this.context = context;
        this.trendingModelList = trendingModelList;
    }



    @NonNull
    @Override
    public Trending_Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        LayoutInflater inflater =LayoutInflater.from(context);
        v= inflater.inflate(R.layout.trending_top, parent,false);

        return new Trending_Adapter.MyViewHolder(v);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {




    }


    @Override
    public int getItemCount() {

        return trendingModelList.size();
    }



    public static class MyViewHolder extends RecyclerView.ViewHolder{

      ImageView imageView;
        TextView category,offer;



        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            imageView  = itemView.findViewById(R.id.trend_img);
            category  = itemView.findViewById(R.id.cat_name_txt);
            offer = itemView.findViewById(R.id.offer_text);




        }
    }

}
