package com.example.shopkeeper.Deal;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shopkeeper.R;

import java.util.List;

public class Deal_Adapter extends RecyclerView.Adapter<Deal_Adapter.ViewHolder> {


    List<Deal_Model> deal_modelList;
    private Context context;


    public Deal_Adapter(Context context, List<Deal_Model> deal_modelList) {
        this.context = context;
        this.deal_modelList = deal_modelList;
    }

    @NonNull
    @Override
    public Deal_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.deal_recycle, parent, false);


        return new Deal_Adapter.ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

//        holder.name.setText(deal_modelList.get(position).getName());
//        holder.price.setText(deal_modelList.get(position).getPrice());
//        holder.offer.setText(deal_modelList.get(position).getOffer());

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