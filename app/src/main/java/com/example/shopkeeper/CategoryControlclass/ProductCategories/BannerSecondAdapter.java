package com.example.shopkeeper.CategoryControlclass.ProductCategories;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shopkeeper.R;

import java.util.List;


public class BannerSecondAdapter extends RecyclerView.Adapter<BannerSecondAdapter.MyViewHolder> {


    List<BannerSecondModel> banSecModelList;
    Context context;

    public BannerSecondAdapter(Context context, List<BannerSecondModel> banSecModelList) {
        this.context = context;
        this.banSecModelList = banSecModelList;
    }



    @NonNull
    @Override
    public BannerSecondAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        LayoutInflater inflater =LayoutInflater.from(context);
        v= inflater.inflate(R.layout.top_second_banner, parent,false);

        return new BannerSecondAdapter.MyViewHolder(v);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {




    }


    @Override
    public int getItemCount() {

        return banSecModelList.size();
    }



    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView ban_img;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            ban_img = itemView.findViewById(R.id.sec_ban);






        }
    }

}
