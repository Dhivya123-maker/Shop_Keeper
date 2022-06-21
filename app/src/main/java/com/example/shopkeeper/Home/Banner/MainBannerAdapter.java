package com.example.shopkeeper.Home.Banner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shopkeeper.R;

import java.util.List;


public class MainBannerAdapter extends RecyclerView.Adapter<MainBannerAdapter.MyViewHolder> {

    private Context context;

private List<MainBannerModel> modelList;




    public MainBannerAdapter(Context context, List<MainBannerModel> modelList) {
        this.context = context;
        this.modelList = modelList;
    }



    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        LayoutInflater inflater =LayoutInflater.from(context);
        v= inflater.inflate(R.layout.home_main_banner, parent,false);

        return new MyViewHolder(v);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {



        if (modelList.get(position).getId() == 1){
            holder.image.setImageResource(R.drawable.v_23);
        }else if (modelList.get(position).getId() == 2){
            holder.image.setImageResource(R.drawable.v_23);
        }else if (modelList.get(position).getId() == 3){
            holder.image.setImageResource(R.drawable.v_23);
        }


    }


    @Override
    public int getItemCount() {
        return modelList.size();
    }



    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        CardView card;




        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            image = itemView.findViewById(R.id.image);



            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {



                }
            });




        }
    }

}
