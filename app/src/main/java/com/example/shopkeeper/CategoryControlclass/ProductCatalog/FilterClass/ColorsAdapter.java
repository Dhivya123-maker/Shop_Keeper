package com.example.shopkeeper.CategoryControlclass.ProductCatalog.FilterClass;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shopkeeper.R;

import java.util.List;

public class ColorsAdapter extends RecyclerView.Adapter<ColorsAdapter.ViewHolder> {


    List<ColorsModel> colorsModelList;
    private Context context;


    public ColorsAdapter(Context context, List<ColorsModel> colorsModelList) {
        this.context = context;
        this.colorsModelList = colorsModelList;
    }

    @NonNull
    @Override
    public ColorsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.color_recycle, parent, false);


        return new ColorsAdapter.ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }



    // total number of rows
    @Override
    public int getItemCount() {

        return colorsModelList.size();

    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView colors;


        ViewHolder(View itemView) {
            super(itemView);

            colors = itemView.findViewById(R.id.colors_txt);





        }


    }


}