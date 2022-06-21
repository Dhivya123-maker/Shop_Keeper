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

public class SizeAdapter extends RecyclerView.Adapter<SizeAdapter.ViewHolder> {


    List<SizeModel> sizeModelList;
    private Context context;


    public SizeAdapter(Context context, List<SizeModel> sizeModelList) {
        this.context = context;
        this.sizeModelList = sizeModelList;
    }

    @NonNull
    @Override
    public SizeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.size_recycle, parent, false);


        return new SizeAdapter.ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }



    // total number of rows
    @Override
    public int getItemCount() {

        return sizeModelList.size();

    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView size;


        ViewHolder(View itemView) {
            super(itemView);

            size = itemView.findViewById(R.id.size_lvl);





        }


    }


}