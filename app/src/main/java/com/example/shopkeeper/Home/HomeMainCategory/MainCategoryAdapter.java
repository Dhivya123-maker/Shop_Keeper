package com.example.shopkeeper.Home.HomeMainCategory;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shopkeeper.CategoryControlclass.CategoryClass;
import com.example.shopkeeper.R;

import java.util.List;

public class MainCategoryAdapter extends RecyclerView.Adapter<MainCategoryAdapter.MyViewHolder> {

    private Context context;
   List<MainCategoryModel> modelList;




    public MainCategoryAdapter(Context context, List<MainCategoryModel> modelList) {
        this.context = context;
        this.modelList = modelList;
    }



    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        LayoutInflater inflater =LayoutInflater.from(context);
        v= inflater.inflate(R.layout.home_main_category, parent,false);

        return new MyViewHolder(v);


    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {



    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }



    public  class MyViewHolder extends RecyclerView.ViewHolder{


        LinearLayout main_category,banner,deal,top_sell_one,top_sell_two,trending_offers;



        public MyViewHolder(@NonNull View itemView) {
            super(itemView);




            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(view.getContext(), CategoryClass.class);
                    view.getContext().startActivity(intent);


                }
            });




        }
    }

}
