package com.example.shopkeeper.Top_sell;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shopkeeper.Deal.Deal_Model;
import com.example.shopkeeper.R;

import java.util.List;

public class Top_sell_Adapter extends RecyclerView.Adapter<Top_sell_Adapter.ViewHolder> {


    List<Top_sell_Model> top_sell_modelList;
    private Context context;


    public Top_sell_Adapter(Context context, List<Top_sell_Model> topSellModelList) {
        this.context = context;
        this.top_sell_modelList = topSellModelList;
    }

    @NonNull
    @Override
    public Top_sell_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.top_sell_one, parent, false);


        return new Top_sell_Adapter.ViewHolder(view);


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
        TextView product_name;


        ViewHolder(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.deal_img);

            product_name = itemView.findViewById(R.id.p_name_txt);




        }


    }


}