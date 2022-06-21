package com.example.shopkeeper.CategoryControlclass.ProductCategories;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shopkeeper.R;

import java.util.List;


public class OfferAdapter extends RecyclerView.Adapter<OfferAdapter.MyViewHolder> {


    List<OfferModel> offerModelList;
    Context context;

    public OfferAdapter(Context context, List<OfferModel> offerModelList) {
        this.context = context;
        this.offerModelList = offerModelList;
    }



    @NonNull
    @Override
    public OfferAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        LayoutInflater inflater =LayoutInflater.from(context);
        v= inflater.inflate(R.layout.offer, parent,false);

        return new OfferAdapter.MyViewHolder(v);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {




    }


    @Override
    public int getItemCount() {

        return offerModelList.size();
    }



    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView offer;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            offer = itemView.findViewById(R.id.fifty);






        }
    }

}
