package com.example.shopkeeper.Top_categories;

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

import de.hdodenhof.circleimageview.CircleImageView;


public class Banner_second_Adapter extends RecyclerView.Adapter<Banner_second_Adapter.MyViewHolder> {


    List<Ban_sec_Model> banSecModelList;
    Context context;

    public Banner_second_Adapter(Context context, List<Ban_sec_Model> banSecModelList) {
        this.context = context;
        this.banSecModelList = banSecModelList;
    }



    @NonNull
    @Override
    public Banner_second_Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        LayoutInflater inflater =LayoutInflater.from(context);
        v= inflater.inflate(R.layout.top_second_banner, parent,false);

        return new Banner_second_Adapter.MyViewHolder(v);


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
