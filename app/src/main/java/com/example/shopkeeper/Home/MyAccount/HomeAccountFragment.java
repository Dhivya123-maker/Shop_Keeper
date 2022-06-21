package com.example.shopkeeper.Home.MyAccount;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.shopkeeper.Home.MyReview.MyReviewClass;
import com.example.shopkeeper.Home.Wishlist.Wishlist;
import com.example.shopkeeper.OrderStatus.Order;
import com.example.shopkeeper.Profile.HomeProfileFragment;
import com.example.shopkeeper.R;

import java.util.ArrayList;
import java.util.List;


public class HomeAccountFragment extends Fragment {

    List<MyAccountModel> myAccountModelList;
    MyAccountAdapter myAccountAdapter;
    RecyclerView recyclerView;
    LinearLayout my_profile,my_wish,my_order,my_review;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment_home_account, container, false);

        recyclerView = root.findViewById(R.id.see_all);
        my_profile = root.findViewById(R.id.profile_lnr);
        my_wish = root.findViewById(R.id.wishlist_lnr);
        my_order = root.findViewById(R.id.my_order);
        my_review = root.findViewById(R.id.my_review);

        my_review.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MyReviewClass.class);
                startActivity(intent);
            }
        });


        my_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Order.class);
                startActivity(intent);
            }
        });


        my_wish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), Wishlist.class);
                startActivity(intent);
            }
        });

        my_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_activity_home, new HomeProfileFragment()).commit();

            }
        });


        myAccountModelList = new ArrayList<>();

        for(int i=0;i<=5;i++){
            MyAccountModel myAccountModel = new MyAccountModel();
            myAccountModel.setImg("1");
            myAccountModel.setB_name("Brand : Vaamsi");
            myAccountModel.setPrice("Rs.450");
            myAccountModel.setOffer("(45% off)");


            myAccountModelList.add(myAccountModel);
        }


        myAccountAdapter = new MyAccountAdapter(getActivity(),myAccountModelList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(myAccountAdapter);
        return  root;
    }
}