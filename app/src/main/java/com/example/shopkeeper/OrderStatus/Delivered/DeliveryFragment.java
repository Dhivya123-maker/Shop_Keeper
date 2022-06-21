package com.example.shopkeeper.OrderStatus.Delivered;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;

import com.example.shopkeeper.R;

import java.util.ArrayList;
import java.util.List;


public class DeliveryFragment extends Fragment implements DeliverAdapter.OnItemClickListener {
    List<Delivermodel> delivermodelList;
    DeliverAdapter deliverAdapter;
    RecyclerView recyclerView;
    Button cancel,submit;
    PopupWindow popview;
    Context context;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_order_delivered, container, false);

        recyclerView = root.findViewById(R.id.order_deliver_recycle);
        delivermodelList = new ArrayList<>();

        for(int i=0;i<4;i++){
            Delivermodel order_model = new Delivermodel();
            order_model.setP_name("Women's Ruby Cotton Printed");
            order_model.setBrand("Brand : Vaamsi");
            order_model.setImg("1");
            order_model.setPrice("Rs.450");
            order_model.setOffer("(45% off)");
            order_model.setDelivery("Expected delivery on Fri,25th Mar 2022");
            order_model.setQty("Qty : 1");

            delivermodelList.add(order_model);


        }

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        deliverAdapter =  new DeliverAdapter(getActivity(),delivermodelList);
        recyclerView.setAdapter(deliverAdapter);
        deliverAdapter.setOnItemClickListener(this::onItemClick);



        return  root;
    }

    @Override
    public void onItemClick(int position) {
        Intent intent2 = new Intent(getActivity(), DeliveryDetails.class);
        startActivity(intent2);


    }

}