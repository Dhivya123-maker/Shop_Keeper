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

public class OccasionAdapter extends RecyclerView.Adapter<OccasionAdapter.ViewHolder> {


    List<OccasionModel> occasionModelList;
    private Context context;


    public OccasionAdapter(Context context, List<OccasionModel> occasionModelList) {
        this.context = context;
        this.occasionModelList = occasionModelList;
    }

    @NonNull
    @Override
    public OccasionAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.occasion_recycle, parent, false);


        return new OccasionAdapter.ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }



    // total number of rows
    @Override
    public int getItemCount() {

        return occasionModelList.size();

    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView occasion;


        ViewHolder(View itemView) {
            super(itemView);

            occasion = itemView.findViewById(R.id.casual_txt);





        }


    }


}