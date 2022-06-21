package com.example.shopkeeper.Home.MyAccount;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shopkeeper.CategoryControlclass.ProductCatalog.ProductCatalogModel;
import com.example.shopkeeper.CategoryControlclass.ProductDetails.ProductDetailsClass;
import com.example.shopkeeper.R;

import java.util.List;

public class MyAccountAdapter extends RecyclerView.Adapter<MyAccountAdapter.ViewHolder> {


    List<MyAccountModel> myAccountModelList;
    private Context context;


    public MyAccountAdapter(Context context, List<MyAccountModel> myAccountModelList) {
        this.context = context;
        this.myAccountModelList = myAccountModelList;
    }

    @NonNull
    @Override
    public MyAccountAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.see_all_recycle, parent, false);


        return new MyAccountAdapter.ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }



    // total number of rows
    @Override
    public int getItemCount() {

        return myAccountModelList.size();

    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView b_img;
        TextView b_name,price,offer;


        ViewHolder(View itemView) {
            super(itemView);
            b_img = itemView.findViewById(R.id.wish_img);


            b_name = itemView.findViewById(R.id.brand_name);
            price = itemView.findViewById(R.id.price_txt);
            offer = itemView.findViewById(R.id.offer_txt);




            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(view.getContext(), ProductDetailsClass.class);
                    view.getContext().startActivity(intent);



                }
            });

        }


    }


}