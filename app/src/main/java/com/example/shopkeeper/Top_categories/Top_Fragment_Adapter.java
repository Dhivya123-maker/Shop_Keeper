package com.example.shopkeeper.Top_categories;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shopkeeper.HomeMainCategory.MainBannerModel;
import com.example.shopkeeper.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;


public class Top_Fragment_Adapter extends RecyclerView.Adapter<Top_Fragment_Adapter.MyViewHolder> {


    List<Top_Model> topModelList;
    Context context;

    public Top_Fragment_Adapter(Context context, List<Top_Model> topModelList) {
        this.context = context;
        this.topModelList = topModelList;
    }



    @NonNull
    @Override
    public Top_Fragment_Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        LayoutInflater inflater =LayoutInflater.from(context);
        v= inflater.inflate(R.layout.round_category, parent,false);

        return new Top_Fragment_Adapter.MyViewHolder(v);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {




    }


    @Override
    public int getItemCount() {

        return topModelList.size();
    }



    public static class MyViewHolder extends RecyclerView.ViewHolder{

      CircleImageView circleImageView;
      TextView category;



        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            circleImageView  = itemView.findViewById(R.id.cat_img);
            category  = itemView.findViewById(R.id.category_txt);




        }
    }

}
