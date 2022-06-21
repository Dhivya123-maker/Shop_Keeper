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

public class ProductSizeAdapter extends RecyclerView.Adapter<ProductSizeAdapter.ViewHolder> {


    List<ProductSizeModel> productSizeModelList;
    private Context context;


    public ProductSizeAdapter(Context context, List<ProductSizeModel> productSizeModelList) {
        this.context = context;
        this.productSizeModelList = productSizeModelList;
    }

    @NonNull
    @Override
    public ProductSizeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.size_recyclerview, parent, false);


        return new ProductSizeAdapter.ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }



    // total number of rows
    @Override
    public int getItemCount() {

        return productSizeModelList.size();

    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView size;



        ViewHolder(View itemView) {
            super(itemView);
            size = itemView.findViewById(R.id.size_txt);



        }


    }


}