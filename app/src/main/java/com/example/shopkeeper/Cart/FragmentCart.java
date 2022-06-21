package com.example.shopkeeper.Cart;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.shopkeeper.R;

import java.util.ArrayList;
import java.util.List;


public class FragmentCart extends Fragment {
    TextView see_later;
    Button change;
    List<CartModel> cartModelList;
    CartAdapter cart_adapter;
    RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_cart, container, false);
        see_later = root.findViewById(R.id.see_later);
        change = root.findViewById(R.id.change_btn);

        recyclerView = root.findViewById(R.id.cart_recycle);



        see_later.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_activity_home, new SeeLaterFragment()).commit();
            }
        });

        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_activity_home, new ChangeAddressFragment()).commit();
            }
        });



        cartModelList = new ArrayList<>();

        for(int i=0;i<2;i++){
            CartModel cart_model = new CartModel();
            cart_model.setP_name("Women's Ruby Cotton Printed");
            cart_model.setB_name("Brand : Vaamsi");
            cart_model.setImg("1");
            cart_model.setRating("4.3");
            cart_model.setPrice("Rs.450");
            cart_model.setOffer("(45% off)");
            cart_model.setDeleivery("Delivery in 2 Days,Fri");
            cart_model.setShipping("|FREE Shipping");

            cartModelList.add(cart_model);


        }

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity()) {
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        };
        cart_adapter =  new CartAdapter(getActivity(),cartModelList);
        recyclerView.setAdapter(cart_adapter);
        recyclerView.setLayoutManager(linearLayoutManager);




        return  root;
    }
}