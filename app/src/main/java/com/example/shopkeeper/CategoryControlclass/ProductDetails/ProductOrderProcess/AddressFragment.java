package com.example.shopkeeper.CategoryControlclass.ProductDetails.ProductOrderProcess;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shopkeeper.AllCategories.FragmentAllCategory;
import com.example.shopkeeper.CategoryControlclass.ProductCatalog.ProductCatalogClass;
import com.example.shopkeeper.CategoryControlclass.ProductCatalog.ProductOfferAdapter;
import com.example.shopkeeper.CategoryControlclass.ProductCatalog.ProductOfferModel;
import com.example.shopkeeper.CategoryControlclass.ProductDetails.ProductDetailsClass;
import com.example.shopkeeper.R;

import java.util.ArrayList;
import java.util.List;


public class AddressFragment extends Fragment {
    List<DeliveryEstimatesModel> deliveryEstimatesModelList;
    DeliveryEstimatesAdapter deliveryEstimatesAdapter;
    RecyclerView recyclerView;
    Button continue_btn;
    RelativeLayout relativeLayout;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_address, container, false);

        recyclerView = root.findViewById(R.id.address_recycle);
        continue_btn = root.findViewById(R.id.continue_btn);
        relativeLayout = root.findViewById(R.id.relative_layout);

        continue_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_activity, new OrderFragment()).commit();
            }
        });

        deliveryEstimatesModelList = new ArrayList<>();

        for(int i=0;i<8;i++){
            DeliveryEstimatesModel deliveryEstimatesModel = new DeliveryEstimatesModel();
            deliveryEstimatesModel.setImg("1");
            deliveryEstimatesModel.setBrand("Brand : Vaamsi");
            deliveryEstimatesModel.setDesc("Women's Ruby Cotton Printed Straight Kurta");
            deliveryEstimatesModel.setPrice("Rs.450");
            deliveryEstimatesModel.setOffer("(45% off)");

            deliveryEstimatesModelList.add(deliveryEstimatesModel);
        }

        LinearLayoutManager layoutManager=new LinearLayoutManager(getActivity()){
            @Override
            public boolean canScrollVertically() {

                return false;
            }
        };

        deliveryEstimatesAdapter =  new DeliveryEstimatesAdapter(getActivity(),deliveryEstimatesModelList);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(deliveryEstimatesAdapter);


        return  root;
    }
}