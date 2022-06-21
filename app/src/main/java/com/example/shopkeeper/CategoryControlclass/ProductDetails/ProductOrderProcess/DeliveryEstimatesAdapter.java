package com.example.shopkeeper.CategoryControlclass.ProductDetails.ProductOrderProcess;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shopkeeper.CategoryControlclass.ProductDetails.PopularProductsModel;
import com.example.shopkeeper.R;

import java.util.List;

public class DeliveryEstimatesAdapter extends RecyclerView.Adapter<DeliveryEstimatesAdapter.ViewHolder> {


    List<DeliveryEstimatesModel> deliveryEstimatesModelList;
    private Context context;


    public DeliveryEstimatesAdapter(Context context, List<DeliveryEstimatesModel> deliveryEstimatesModelList) {
        this.context = context;
        this.deliveryEstimatesModelList = deliveryEstimatesModelList;
    }

    @NonNull
    @Override
    public DeliveryEstimatesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.delivery_estimates, parent, false);


        return new DeliveryEstimatesAdapter.ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }



    // total number of rows
    @Override
    public int getItemCount() {

        return deliveryEstimatesModelList.size();

    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView b_name,desc,price,offer;



        ViewHolder(View itemView) {
            super(itemView);
           img = itemView.findViewById(R.id.saree);

            b_name = itemView.findViewById(R.id.p_name);
            desc = itemView.findViewById(R.id.brand);
            price = itemView.findViewById(R.id.price);
            offer = itemView.findViewById(R.id.offer);




        }


    }


}