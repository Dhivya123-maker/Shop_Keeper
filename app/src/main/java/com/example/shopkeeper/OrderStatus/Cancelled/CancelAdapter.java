package com.example.shopkeeper.OrderStatus.Cancelled;



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

public class CancelAdapter extends RecyclerView.Adapter<CancelAdapter.ViewHolder> {


    List<CancelModel> cancelModelList;
    Context context;

    public static CancelAdapter.OnItemClickListener mListener;


    public interface OnItemClickListener{
        void onItemClick(int position);
    }


    public void setOnItemClickListener(CancelAdapter.OnItemClickListener listener){

        mListener =  listener;


    }


    public CancelAdapter(Context context, List<CancelModel> cancelModelList) {
        this.context = context;
        this.cancelModelList = cancelModelList;
    }

    @NonNull
    @Override
    public CancelAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cancelled_recycle, parent, false);


        return new CancelAdapter.ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {




    }



    // total number of rows
    @Override
    public int getItemCount() {

        return cancelModelList.size();

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