package com.example.shopkeeper.OrderStatus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.shopkeeper.OrderStatus.Cancelled.CancelFragment;
import com.example.shopkeeper.OrderStatus.Delivered.DeliveryFragment;
import com.example.shopkeeper.OrderStatus.Orders.FragmentOrder;
import com.example.shopkeeper.OrderStatus.Returned.ReturnedFragment;
import com.example.shopkeeper.R;
import com.google.android.material.tabs.TabLayout;

public class Order extends AppCompatActivity {

    OrderViewPagerAdapter viewPagerAdapter;
    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        viewPager = findViewById(R.id.viewpager_home);



        viewPagerAdapter = new OrderViewPagerAdapter(getSupportFragmentManager());


        viewPagerAdapter.add(new FragmentOrder(), "Orders");
        viewPagerAdapter.add(new DeliveryFragment(), "Delivered");
        viewPagerAdapter.add(new CancelFragment(), "Cancelled");
        viewPagerAdapter.add(new ReturnedFragment(), "Returned");

        viewPager.setAdapter(viewPagerAdapter);


        tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);




//        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//
//
//                if (tab.getPosition() == 0) {
//
//                } else if (tab.getPosition() == 1) {
//
//
//
//                } else if (tab.getPosition() == 2) {
//
//
//                } else if (tab.getPosition() == 3) {
//
//
//
//                }
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//
//            }
//        });
//


    }
}