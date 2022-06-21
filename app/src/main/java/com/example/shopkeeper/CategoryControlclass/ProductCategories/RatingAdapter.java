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


public class RatingAdapter extends RecyclerView.Adapter<RatingAdapter.MyViewHolder> {


    List<RatingModel> ratingModelList;
    Context context;

    public RatingAdapter(Context context, List<RatingModel> ratingModelList) {
        this.context = context;
        this.ratingModelList = ratingModelList ;
    }



    @NonNull
    @Override
    public RatingAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        LayoutInflater inflater =LayoutInflater.from(context);
        v= inflater.inflate(R.layout.rating_recycle, parent,false);

        return new RatingAdapter.MyViewHolder(v);


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
