package com.example.shopkeeper.OrderStatus.Cancelled;

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


public class CancelFragment extends Fragment implements CancelAdapter.OnItemClickListener {
    List<CancelModel> cancelModelList;
    CancelAdapter cancelAdapter;
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment_cancelfragment, container, false);

        recyclerView = root.findViewById(R.id.order_cancel_recycle);

        cancelModelList = new ArrayList<>();

        for(int i=0;i<4;i++){
            CancelModel cancelModel = new CancelModel();
            cancelModel.setP_name("Women's Ruby Cotton Printed");
            cancelModel.setBrand("Brand : Vaamsi");
            cancelModel.setImg("1");
            cancelModel.setPrice("Rs.450");
            cancelModel.setOffer("(45% off)");
            cancelModel.setDelivery("Cancelled on Fri,25th Mar 2022");
            cancelModel.setQty("Qty : 1");

            cancelModelList.add(cancelModel);


        }

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        cancelAdapter =  new CancelAdapter(getActivity(),cancelModelList);
        recyclerView.setAdapter(cancelAdapter);
        cancelAdapter.setOnItemClickListener(this::onItemClick);

        return  root;

    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(getActivity(), CancelDetails.class);
        startActivity(intent);

    }
}