package com.example.shopkeeper.CategoryControlclass.ProductDetails.ProductOrderProcess;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.shopkeeper.AllCategories.FragmentAllCategory;
import com.example.shopkeeper.OrderStatus.Cancelled.CancelFragment;
import com.example.shopkeeper.OrderStatus.Delivered.DeliveryFragment;
import com.example.shopkeeper.OrderStatus.OrderViewPagerAdapter;
import com.example.shopkeeper.R;
import com.google.android.material.tabs.TabLayout;

public class ProductOrderProcessClass extends AppCompatActivity {

    OrderViewPagerAdapter viewPagerAdapter;
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_order_process);


        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_activity, new AddressFragment()).commit();




    }
}