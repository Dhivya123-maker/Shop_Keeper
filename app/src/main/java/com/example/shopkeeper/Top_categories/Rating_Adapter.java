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


public class Rating_Adapter extends RecyclerView.Adapter<Rating_Adapter.MyViewHolder> {


    List<Rating_model> ratingModelList;
    Context context;

    public Rating_Adapter(Context context, List<Rating_model> ratingModelList) {
        this.context = context;
        this.ratingModelList = ratingModelList ;
    }



    @NonNull
    @Override
    public Rating_Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        LayoutInflater inflater =LayoutInflater.from(context);
        v= inflater.inflate(R.layout.rating_recycle, parent,false);

        return new Rating_Adapter.MyViewHolder(v);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {




    }


    @Override
    public int getItemCount() {

        return ratingModelList.size();
    }



    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.rat_img);
            textView = itemView.findViewById(R.id.rat_txt);






        }
    }

}
