package com.example.shopkeeper.HomeMainCategory;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shopkeeper.R;

import java.util.List;

public class MainCategoryAdapter extends RecyclerView.Adapter<MainCategoryAdapter.MyViewHolder> {

    private Context context;
    private List<MainCategoryModel> modelList;

    public static OnItemClickListener mListener;


    String v_type = null;


    public interface OnItemClickListener{
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener){

        mListener = listener;

    }


    public MainCategoryAdapter(Context context, List<MainCategoryModel> modelList) {
        this.context = context;
        this.modelList = modelList;
    }



    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        LayoutInflater inflater =LayoutInflater.from(context);
        v= inflater.inflate(R.layout.home_main_category, parent,false);

        return new MyViewHolder(v);


    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {




            if (modelList.get(position).getId() == 1){
                holder.image.setImageResource(R.drawable.v_16);
            }else if (modelList.get(position).getId() == 2){
                holder.image.setImageResource(R.drawable.v_17);
            }else if (modelList.get(position).getId() == 3){
                holder.image.setImageResource(R.drawable.v_18);
            }else if (modelList.get(position).getId() == 4){
                holder.image.setImageResource(R.drawable.v_19);
            }else if (modelList.get(position).getId() == 5){
                holder.image.setImageResource(R.drawable.v_20);
            }else if (modelList.get(position).getId() == 6){
                holder.image.setImageResource(R.drawable.v_21);
            }else if (modelList.get(position).getId() == 7){
                holder.image.setImageResource(R.drawable.v_22);
            }







    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }



    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        CardView card;




        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            image = itemView.findViewById(R.id.image);
            card= itemView.findViewById(R.id.card);


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
