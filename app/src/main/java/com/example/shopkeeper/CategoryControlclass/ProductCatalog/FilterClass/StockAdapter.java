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

public class StockAdapter extends RecyclerView.Adapter<StockAdapter.ViewHolder> {


    List<StockModel> stockModelList;
    private Context context;


    public StockAdapter(Context context, List<StockModel> stockModelList) {
        this.context = context;
        this.stockModelList = stockModelList;
    }

    @NonNull
    @Override
    public StockAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.availability_recycle, parent, false);


        return new StockAdapter.ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }



    // total number of rows
    @Override
    public int getItemCount() {

        return stockModelList.size();

    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView stock;


        ViewHolder(View itemView) {
            super(itemView);

            stock = itemView.findViewById(R.id.stock_txt);





        }


    }


}