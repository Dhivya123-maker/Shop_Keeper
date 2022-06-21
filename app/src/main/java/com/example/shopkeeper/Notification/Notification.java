package com.example.shopkeeper.Notification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.shopkeeper.R;

import java.util.ArrayList;
import java.util.List;

public class Notification extends AppCompatActivity {
    List<NotifyModel> notifyModelList;
    NotifyAdapter notify_adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        recyclerView = findViewById(R.id.notify_recycle);

        notifyModelList = new ArrayList<>();

        for(int i=0;i<10;i++){
            NotifyModel notify_model = new NotifyModel();
            notify_model.setName("Your Shopkeepr Order smart watch successfully delivered.");
            notify_model.setDate("Feb 22 Mar 2022");
            notify_model.setImg("1");

            notifyModelList.add(notify_model);


        }

        notify_adapter =  new NotifyAdapter(Notification.this,notifyModelList);
        recyclerView.setAdapter(notify_adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(Notification.this, LinearLayoutManager.VERTICAL, false));



    }
}