package com.example.shopkeeper.OrderStatus.Returned;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shopkeeper.R;

import java.util.ArrayList;
import java.util.List;


public class ReturnedFragment extends Fragment implements ReturnAdapter.OnItemClickListener {

    List<ReturnModel> returnModelList;
    ReturnAdapter returnAdapter;
    RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment_returnedfragment, container, false);

        recyclerView = root.findViewById(R.id.return_deliver_recycle);

        returnModelList = new ArrayList<>();

        for(int i=0;i<4;i++){
            ReturnModel returnModel = new ReturnModel();
            returnModel.setP_name("Women's Ruby Cotton Printed");
            returnModel.setBrand("Brand : Vaamsi");
            returnModel.setImg("1");
            returnModel.setPrice("Rs.450");
            returnModel.setOffer("(45% off)");
            returnModel.setDelivery("Cancelled on Fri,25th Mar 2022");
            returnModel.setQty("Qty : 1");

            returnModelList.add(returnModel);


        }

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        returnAdapter =  new ReturnAdapter(getActivity(),returnModelList);
        recyclerView.setAdapter(returnAdapter);
        returnAdapter.setOnItemClickListener(this::onItemClick);


        return  root;
    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(getActivity(), ReturnDetails.class);
        startActivity(intent);

    }
}