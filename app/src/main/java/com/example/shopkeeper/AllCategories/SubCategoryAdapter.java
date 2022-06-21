package com.example.shopkeeper.AllCategories;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shopkeeper.R;

import java.util.List;

public class SubCategoryAdapter extends RecyclerView.Adapter<SubCategoryAdapter.ViewHolder> {


    List<SubCategoryModel> filterModelList;
    private Context context;
    int selectedPosition=-1;

    public SubCategoryAdapter(Context context, List<SubCategoryModel> filterModelList) {
        this.context = context;
        this.filterModelList = filterModelList;
    }

    @NonNull
    @Override
    public SubCategoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.filter_recycle, parent, false);


        return new SubCategoryAdapter.ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        if(selectedPosition==position){


            holder.itemView.setBackgroundColor(Color.parseColor("#028741"));
            holder.name.setTextColor(Color.parseColor("#ffffff"));
        }
        else {
            holder.itemView.setBackgroundColor(Color.parseColor("#ffffff"));
            holder.name.setTextColor(Color.parseColor("#000000"));
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedPosition=position;
                notifyDataSetChanged();

            }
        });


    }



    // total number of rows
    @Override
    public int getItemCount() {

        return filterModelList.size();

    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView name;


        ViewHolder(View itemView) {
            super(itemView);


            name = itemView.findViewById(R.id.fashion);





        }


    }


}