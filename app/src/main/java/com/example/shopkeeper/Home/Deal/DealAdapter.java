package com.example.shopkeeper.Home.Deal;

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

public class DealAdapter extends RecyclerView.Adapter<DealAdapter.ViewHolder> {


    List<DealModel> deal_modelList;
    private Context context;


    public DealAdapter(Context context, List<DealModel> deal_modelList) {
        this.context = context;
        this.deal_modelList = deal_modelList;
    }

    @NonNull
    @Override
    public DealAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.deal_recycle, parent, false);


        return new DealAdapter.ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


    }



    // total number of rows
    @Override
    public int getItemCount() {

        return 5;

    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView name,price,offer;


        ViewHolder(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.deal_img);

            name = itemView.findViewById(R.id.name_txt);
            price = itemView.findViewById(R.id.price_txt);
            offer = itemView.findViewById(R.id.offer_txt);




        }


    }


}