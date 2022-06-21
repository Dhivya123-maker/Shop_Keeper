package com.example.shopkeeper.CategoryControlclass.ProductCategories;

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


public class TopRatingAdapter extends RecyclerView.Adapter<TopRatingAdapter.MyViewHolder> {


    List<TopRatingModel> top_rating_modelList;
    Context context;

    public TopRatingAdapter(Context context, List<TopRatingModel> top_rating_modelList) {
        this.context = context;
        this.top_rating_modelList = top_rating_modelList;
    }



    @NonNull
    @Override
    public TopRatingAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        LayoutInflater inflater =LayoutInflater.from(context);
        v= inflater.inflate(R.layout.top_rating, parent,false);

        return new TopRatingAdapter.MyViewHolder(v);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {




    }


    @Override
    public int getItemCount() {

        return top_rating_modelList.size();
    }



    public static class MyViewHolder extends RecyclerView.ViewHolder{

    ImageView imageView;
    TextView product_name,offer_name;



        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            imageView  = itemView.findViewById(R.id.pro_img);
            product_name  = itemView.findViewById(R.id.name_txt);
            offer_name  = itemView.findViewById(R.id.offer_txt);


        }
    }

}
