package com.example.shopkeeper.Top_categories;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shopkeeper.R;

import org.w3c.dom.Text;

import java.util.List;


public class Offer_Adapter extends RecyclerView.Adapter<Offer_Adapter.MyViewHolder> {


    List<Offer_model> offerModelList;
    Context context;

    public Offer_Adapter(Context context, List<Offer_model> offerModelList) {
        this.context = context;
        this.offerModelList = offerModelList;
    }



    @NonNull
    @Override
    public Offer_Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        LayoutInflater inflater =LayoutInflater.from(context);
        v= inflater.inflate(R.layout.offer, parent,false);

        return new Offer_Adapter.MyViewHolder(v);


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
