package com.example.shopkeeper.CategoryControlclass.ProductCategories;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shopkeeper.R;

import java.util.List;


public class BrandAdapter extends RecyclerView.Adapter<BrandAdapter.MyViewHolder> {


    List<BrandModel> brandModelList;
    Context context;

    public BrandAdapter(Context context, List<BrandModel> brandModelList) {
        this.context = context;
        this.brandModelList = brandModelList;
    }



    @NonNull
    @Override
    public BrandAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        LayoutInflater inflater =LayoutInflater.from(context);
        v= inflater.inflate(R.layout.brand_recycle, parent,false);

        return new BrandAdapter.MyViewHolder(v);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {




    }


    @Override
    public int getItemCount() {

        return brandModelList.size();
    }



    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView brand_img,brand_logo;
        TextView brand_name;
        Button offer;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            brand_img = itemView.findViewById(R.id.brand_img);
            brand_logo = itemView.findViewById(R.id.brand_img1);
            brand_name = itemView.findViewById(R.id.brand_name_txt);
            offer = itemView.findViewById(R.id.offer_btn);







        }
    }

}
