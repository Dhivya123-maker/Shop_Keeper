package com.example.shopkeeper.CategoryControlclass.ProductCatalog;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shopkeeper.CategoryControlclass.ProductDetails.ProductDetailsClass;
import com.example.shopkeeper.R;

import java.util.List;

public class ProductCatalogAdapter extends RecyclerView.Adapter<ProductCatalogAdapter.ViewHolder> {


    List<ProductCatalogModel> productmodelList;
    private Context context;


    public ProductCatalogAdapter(Context context, List<ProductCatalogModel> productmodelList) {
        this.context = context;
        this.productmodelList = productmodelList;
    }

    @NonNull
    @Override
    public ProductCatalogAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_recycle, parent, false);


        return new ProductCatalogAdapter.ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }



    // total number of rows
    @Override
    public int getItemCount() {

        return productmodelList.size();

    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView p_img,fav_img;
        TextView p_name,b_name,price,offer;


        ViewHolder(View itemView) {
            super(itemView);
            p_img = itemView.findViewById(R.id.wish_img);
            fav_img = itemView.findViewById(R.id.fav_img);

            p_name = itemView.findViewById(R.id.wish_p_name);
            b_name = itemView.findViewById(R.id.brand_wish);
            price = itemView.findViewById(R.id.price_wish);
            offer = itemView.findViewById(R.id.offer_wish);




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