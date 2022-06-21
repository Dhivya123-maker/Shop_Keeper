package com.example.shopkeeper.OrderStatus.Returned;



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

public class ReturnAdapter extends RecyclerView.Adapter<ReturnAdapter.ViewHolder> {


    List<ReturnModel> returnModelList;
    Context context;

    public static ReturnAdapter.OnItemClickListener mListener;


    public interface OnItemClickListener{
        void onItemClick(int position);
    }


    public void setOnItemClickListener(ReturnAdapter.OnItemClickListener listener){

        mListener =  listener;


    }


    public ReturnAdapter(Context context, List<ReturnModel> returnModelList) {
        this.context = context;
        this.returnModelList = returnModelList;
    }

    @NonNull
    @Override
    public ReturnAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.returned_recycle, parent, false);


        return new ReturnAdapter.ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {




    }



    // total number of rows
    @Override
    public int getItemCount() {

        return returnModelList.size();

    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView p_name,b_name,price,offer,delivery,qty,size;




        ViewHolder(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.saree);

            p_name = itemView.findViewById(R.id.p_name);
            b_name = itemView.findViewById(R.id.brand);

            price = itemView.findViewById(R.id.price);
            offer = itemView.findViewById(R.id.offer);
            delivery = itemView.findViewById(R.id.delivery);
            qty = itemView.findViewById(R.id.qt);
            size = itemView.findViewById(R.id.size);




            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    if (mListener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            mListener.onItemClick(position);
                        }
                    }



                }
            });



        }




    }




}