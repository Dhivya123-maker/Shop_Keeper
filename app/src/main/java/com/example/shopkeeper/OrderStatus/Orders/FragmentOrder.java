package com.example.shopkeeper.OrderStatus.Orders;

import android.annotation.SuppressLint;
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
import android.widget.EditText;
import android.widget.PopupWindow;

import com.example.shopkeeper.R;

import java.util.ArrayList;
import java.util.List;

public class FragmentOrder extends Fragment implements OrderAdapter.OnItemClickListener {
    List<OrderModel> orderModelList;
    OrderAdapter order_adapter;
    RecyclerView recyclerView;
    Context context;
    Button cancel,submit;
    PopupWindow popview;
    EditText editText;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment__order, container, false);

        recyclerView = root.findViewById(R.id.order_recycle);

        orderModelList = new ArrayList<>();

        for(int i=0;i<4;i++){
            OrderModel order_model = new OrderModel();
            order_model.setP_name("Women's Ruby Cotton Printed");
            order_model.setBrand("Brand : Vaamsi");
            order_model.setImg("1");
            order_model.setPrice("Rs.450");
            order_model.setOffer("(45% off)");
            order_model.setDelivery("Expected delivery on Fri,25th Mar 2022");
            order_model.setOrder_id("97986381746578251");
            order_model.setQty("Qty : 1");

            orderModelList.add(order_model);


        }

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        order_adapter =  new OrderAdapter(getActivity(),orderModelList);
        recyclerView.setAdapter(order_adapter);
        order_adapter.setOnItemClickListener(FragmentOrder.this);




        return  root;
    }


    @SuppressLint("WrongConstant")
    @Override
    public void onItemClick(int position) {


        Intent intent2 = new Intent(getActivity(), OrderDetails.class);
        startActivity(intent2);

    }




    public void onClick(View v){

        editText.setVisibility(View.VISIBLE);
    }





}