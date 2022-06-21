package com.example.shopkeeper.Notification;

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

public class NotifyAdapter extends RecyclerView.Adapter<NotifyAdapter.ViewHolder> {


    List<NotifyModel> notifyModelList;
    private Context context;


    public NotifyAdapter(Context context, List<NotifyModel> notifyModelList) {
        this.context = context;
        this.notifyModelList = notifyModelList;
    }

    @NonNull
    @Override
    public NotifyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.notification_recycle, parent, false);


        return new NotifyAdapter.ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {



    }



    // total number of rows
    @Override
    public int getItemCount() {

        return notifyModelList.size();

    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView name,date;


        ViewHolder(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imageview);
            name = itemView.findViewById(R.id.status);
            date = itemView.findViewById(R.id.date);






        }


    }


}