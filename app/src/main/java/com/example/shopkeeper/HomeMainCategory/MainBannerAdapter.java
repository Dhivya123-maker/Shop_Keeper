package com.example.shopkeeper.HomeMainCategory;

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

public class MainBannerAdapter extends RecyclerView.Adapter<MainBannerAdapter.MyViewHolder> {

    private Context context;
    private List<MainBannerModel> modelList;

    public static MainBannerAdapter.OnItemClickListener2 mListener2;


    String v_type = null;


    public interface OnItemClickListener2{
        void onItemClick2(int position);
    }

    public void setOnItemClickListener2(MainBannerAdapter.OnItemClickListener2 listener2){

        mListener2 = listener2;

    }


    public MainBannerAdapter(Context context, List<MainBannerModel> modelList) {
        this.context = context;
        this.modelList = modelList;
    }



    @NonNull
    @Override
    public MainBannerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        LayoutInflater inflater =LayoutInflater.from(context);
        v= inflater.inflate(R.layout.home_main_banner, parent,false);

        return new MainBannerAdapter.MyViewHolder(v);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {



        if (modelList.get(position).getId() == 1){
            holder.image.setImageResource(R.drawable.v_23);
        }else if (modelList.get(position).getId() == 2){
            holder.image.setImageResource(R.drawable.v_23);
        }else if (modelList.get(position).getId() == 3){
            holder.image.setImageResource(R.drawable.v_23);
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
            card = itemView.findViewById(R.id.card);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {



                    if (mListener2 != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            mListener2.onItemClick2(position);
                        }
                    }

                }
            });




        }
    }

}
