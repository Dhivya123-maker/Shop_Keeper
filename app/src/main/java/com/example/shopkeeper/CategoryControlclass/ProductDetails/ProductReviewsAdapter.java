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

public class ProductReviewsAdapter extends RecyclerView.Adapter<ProductReviewsAdapter.ViewHolder> {


    List<ProductReviewsModel> productsRatingModelList;
    private Context context;


    public ProductReviewsAdapter(Context context, List<ProductReviewsModel> productsRatingModelList) {
        this.context = context;
        this.productsRatingModelList = productsRatingModelList;
    }

    @NonNull
    @Override
    public ProductReviewsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ratings_img, parent, false);


        return new ProductReviewsAdapter.ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }



    // total number of rows
    @Override
    public int getItemCount() {

        return productsRatingModelList.size();

    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView review_img;



        ViewHolder(View itemView) {
            super(itemView);
            review_img = itemView.findViewById(R.id.review_img);



        }


    }


}