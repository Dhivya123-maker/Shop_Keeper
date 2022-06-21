package com.example.shopkeeper.Home.MyReview;

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

public class PurchaseAdapter extends RecyclerView.Adapter<PurchaseAdapter.ViewHolder> {


    List<PurchaseModel> purchaseModelList;
    private Context context;


    public PurchaseAdapter(Context context, List<PurchaseModel> purchaseModelList) {
        this.context = context;
        this.purchaseModelList = purchaseModelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.purchase_list, parent, false);


        return new ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {




    }



    // total number of rows
    @Override
    public int getItemCount() {

        return purchaseModelList.size();

    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView p_name,b_name,price,offer;


        ViewHolder(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.saree);

            p_name = itemView.findViewById(R.id.p_name);
            b_name = itemView.findViewById(R.id.brand);

            price = itemView.findViewById(R.id.price);
            offer = itemView.findViewById(R.id.offer);







        }


    }


}