package com.example.shopkeeper.CategoryControlclass.ProductCatalog.FilterClass;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shopkeeper.R;

import java.util.List;

public class CustomerRatingAdapter extends RecyclerView.Adapter<CustomerRatingAdapter.ViewHolder> {


    List<CustomerRatingModel> ratingModelList;
    private Context context;


    public CustomerRatingAdapter(Context context, List<CustomerRatingModel> ratingModelList) {
        this.context = context;
        this.ratingModelList = ratingModelList;
    }

    @NonNull
    @Override
    public CustomerRatingAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cus_rating_recycle, parent, false);


        return new CustomerRatingAdapter.ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }



    // total number of rows
    @Override
    public int getItemCount() {

        return ratingModelList.size();

    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView price;


        ViewHolder(View itemView) {
            super(itemView);

            price = itemView.findViewById(R.id.price_lvl);





        }


    }


}