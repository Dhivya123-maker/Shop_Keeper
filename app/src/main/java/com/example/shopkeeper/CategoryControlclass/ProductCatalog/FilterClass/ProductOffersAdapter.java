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

public class ProductOffersAdapter extends RecyclerView.Adapter<ProductOffersAdapter.ViewHolder> {


    List<ProductOffersModel> offersModelList;
    private Context context;


    public ProductOffersAdapter(Context context, List<ProductOffersModel> offersModelList) {
        this.context = context;
        this.offersModelList = offersModelList;
    }

    @NonNull
    @Override
    public ProductOffersAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_offers, parent, false);


        return new ProductOffersAdapter.ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }



    // total number of rows
    @Override
    public int getItemCount() {

        return offersModelList.size();

    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView offer;


        ViewHolder(View itemView) {
            super(itemView);

            offer = itemView.findViewById(R.id.buy_txt);





        }


    }


}