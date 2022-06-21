package com.example.shopkeeper.CategoryControlclass.ProductCategories;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shopkeeper.CategoryControlclass.ProductCatalog.ProductCatalogClass;
import com.example.shopkeeper.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;


public class MaterialAdapter extends RecyclerView.Adapter<MaterialAdapter.MyViewHolder> {


    List<MaterialModel> topModelList;
    Context context;



    public MaterialAdapter(Context context, List<MaterialModel> topModelList) {
        this.context = context;
        this.topModelList = topModelList;
    }



    @NonNull
    @Override
    public MaterialAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        LayoutInflater inflater =LayoutInflater.from(context);
        v= inflater.inflate(R.layout.round_category, parent,false);

        return new MaterialAdapter.MyViewHolder(v);


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


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(view.getContext(), ProductCatalogClass.class);
                    view.getContext().startActivity(intent);
                }
            });


        }
    }

}
