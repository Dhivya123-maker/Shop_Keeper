package com.example.shopkeeper.Home.MyReview;

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

public class MyReviewAdapter extends RecyclerView.Adapter<MyReviewAdapter.ViewHolder> {


    List<MyReviewModel> myReviewModelList;
    private Context context;


    public MyReviewAdapter(Context context, List<MyReviewModel> myReviewModelList) {
        this.context = context;
        this.myReviewModelList = myReviewModelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.myreview_recycle, parent, false);


        return new ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {




    }



    // total number of rows
    @Override
    public int getItemCount() {

        return myReviewModelList.size();

    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView p_name,b_name,rating,price,offer,reviews;


        ViewHolder(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.saree);

            p_name = itemView.findViewById(R.id.p_name);
            b_name = itemView.findViewById(R.id.brand);
            rating = itemView.findViewById(R.id.rating);
            price = itemView.findViewById(R.id.price);
            offer = itemView.findViewById(R.id.offer);
            reviews = itemView.findViewById(R.id.desc);






        }


    }


}