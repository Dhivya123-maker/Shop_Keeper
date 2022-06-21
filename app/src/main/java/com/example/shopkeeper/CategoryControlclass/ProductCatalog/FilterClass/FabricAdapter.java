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

public class FabricAdapter extends RecyclerView.Adapter<FabricAdapter.ViewHolder> {


    List<FabricModel> fabricModelList;
    private Context context;


    public FabricAdapter(Context context, List<FabricModel> fabricModelList) {
        this.context = context;
        this.fabricModelList = fabricModelList;
    }

    @NonNull
    @Override
    public FabricAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fabric_recycle, parent, false);


        return new FabricAdapter.ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }



    // total number of rows
    @Override
    public int getItemCount() {

        return fabricModelList.size();

    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView fabric;


        ViewHolder(View itemView) {
            super(itemView);

            fabric = itemView.findViewById(R.id.casual_txt);





        }


    }


}