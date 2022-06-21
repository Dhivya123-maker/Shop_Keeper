package com.example.shopkeeper.AllCategories;

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

public class AllCategoryAdapter extends RecyclerView.Adapter<AllCategoryAdapter.ViewHolder> {


    List<AllCategoryModel> fragmentModelList;
    private Context context;


    public AllCategoryAdapter(Context context, List<AllCategoryModel> fragmentModelList) {
        this.context = context;
        this.fragmentModelList = fragmentModelList;
    }

    @NonNull
    @Override
    public AllCategoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_recycle, parent, false);


        return new AllCategoryAdapter.ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {




    }



    // total number of rows
    @Override
    public int getItemCount() {

        return fragmentModelList.size();

    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView name;


        ViewHolder(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.deal_img);

            name = itemView.findViewById(R.id.p_name_txt);





        }


    }


}