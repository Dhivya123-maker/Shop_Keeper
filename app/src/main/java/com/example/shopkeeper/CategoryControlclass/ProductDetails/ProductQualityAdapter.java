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

public class ProductQualityAdapter extends RecyclerView.Adapter<ProductQualityAdapter.ViewHolder> {


    List<ProductQualityModel> productQualityModelList;
    private Context context;


    public ProductQualityAdapter(Context context, List<ProductQualityModel> productQualityModelList) {
        this.context = context;
        this.productQualityModelList = productQualityModelList;
    }

    @NonNull
    @Override
    public ProductQualityAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_comfort, parent, false);


        return new ProductQualityAdapter.ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }



    // total number of rows
    @Override
    public int getItemCount() {

        return productQualityModelList.size();

    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder {
      TextView p_quality;



        ViewHolder(View itemView) {
            super(itemView);
            p_quality = itemView.findViewById(R.id.value_txt);




        }


    }


}