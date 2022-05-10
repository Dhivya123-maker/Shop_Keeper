package com.example.shopkeeper.Categories;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shopkeeper.R;

import java.util.List;

public class Filter_adapter extends RecyclerView.Adapter<Filter_adapter.ViewHolder> {


    List<Filter_model> filterModelList;
    private Context context;
    int selectedPosition=-1;

    public Filter_adapter(Context context, List<Filter_model> filterModelList) {
        this.context = context;
        this.filterModelList = filterModelList;
    }

    @NonNull
    @Override
    public Filter_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.filter_rexcycle, parent, false);


        return new Filter_adapter.ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        if(selectedPosition==position)
            holder.itemView.setBackgroundColor(Color.parseColor("#028741"));
        else
            holder.itemView.setBackgroundColor(Color.parseColor("#ffffff"));

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