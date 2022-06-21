package com.example.shopkeeper.Cart;

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

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.ViewHolder> {


    List<CartModel> cartModelList;
    private Context context;


    public CartAdapter(Context context, List<CartModel> cartModelList) {
        this.context = context;
        this.cartModelList = cartModelList;
    }

    @NonNull
    @Override
    public CartAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_recycle, parent, false);


        return new CartAdapter.ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {




    }



    // total number of rows
    @Override
    public int getItemCount() {

        return cartModelList.size();

    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView p_name,b_name,rating,price,offer,delivery,shipping;


        ViewHolder(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.saree);

            p_name = itemView.findViewById(R.id.p_name);
            b_name = itemView.findViewById(R.id.brand);
            rating = itemView.findViewById(R.id.rate);
            price = itemView.findViewById(R.id.price);
            offer = itemView.findViewById(R.id.offer);
            delivery = itemView.findViewById(R.id.delivery);
            shipping = itemView.findViewById(R.id.shipping);






        }


    }


}