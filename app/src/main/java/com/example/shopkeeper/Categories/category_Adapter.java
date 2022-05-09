package com.example.shopkeeper.Categories;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shopkeeper.Deal.Deal_Model;
import com.example.shopkeeper.R;

import java.util.List;

public class category_Adapter extends RecyclerView.Adapter<category_Adapter.ViewHolder> {


    List<Fragment_model> fragmentModelList;
    private Context context;


    public category_Adapter(Context context, List<Fragment_model> fragmentModelList) {
        this.context = context;
        this.fragmentModelList = fragmentModelList;
    }

    @NonNull
    @Override
    public category_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_recycle, parent, false);


        return new category_Adapter.ViewHolder(view);


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