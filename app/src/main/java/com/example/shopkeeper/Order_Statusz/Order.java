package com.example.shopkeeper.Order_Statusz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.shopkeeper.Cart.FragmentCart;
import com.example.shopkeeper.Categories.FragmentCategory;
import com.example.shopkeeper.R;
import com.example.shopkeeper.ViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class Order extends AppCompatActivity {

    ViewPagerAdapter viewPagerAdapter;
    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        viewPager = findViewById(R.id.viewpager_home);



        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());



        viewPagerAdapter.add(new FragmentCart(), "Orders");
        viewPagerAdapter.add(new FragmentCart(), "Delivered");
        viewPagerAdapter.add(new FragmentCategory(), "Cancelled");
        viewPagerAdapter.add(new FragmentCategory(), "Returned");

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