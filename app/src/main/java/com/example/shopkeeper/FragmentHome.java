package com.example.shopkeeper;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.media.audiofx.DynamicsProcessing;
import android.os.Build;
import android.os.Bundle;


import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.text.Html;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.shopkeeper.Cart.see_Later_Fragment;
import com.example.shopkeeper.Deal.Deal_Adapter;
import com.example.shopkeeper.Deal.Deal_Model;
import com.example.shopkeeper.HomeMainCategory.MainBannerAdapter;
import com.example.shopkeeper.HomeMainCategory.MainBannerModel;
import com.example.shopkeeper.HomeMainCategory.MainCategoryAdapter;
import com.example.shopkeeper.HomeMainCategory.MainCategoryModel;
import com.example.shopkeeper.Top_categories.Top_fragment;
import com.example.shopkeeper.Top_sell.Top_sell_Adapter;
import com.example.shopkeeper.Top_sell.Top_sell_Model;
import com.example.shopkeeper.Top_sell.Top_sell_one_Adapter;
import com.example.shopkeeper.Top_sell.Top_sell_one_Model;
import com.example.shopkeeper.trending.Trending_Adapter;
import com.example.shopkeeper.trending.Trending_model;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;



public class FragmentHome extends Fragment implements MainCategoryAdapter.OnItemClickListener {


    List<MainCategoryModel> main_category_modelList;
    MainCategoryAdapter main_category_adapter;

    List<MainBannerModel> mainBannerModelList;
    MainBannerAdapter mainBannerAdapter;

    List<Deal_Model> deal_modelList;
     Deal_Adapter deal_adapter;

    List<Top_sell_Model> top_sell_modelList;
    Top_sell_Adapter top_sell_adapter;

    List<Top_sell_one_Model> top_sell_one_modelList;
    Top_sell_one_Adapter top_sell_one_adapter;

    List<Trending_model> trendingModelList;
    Trending_Adapter trending_adapter;

    RecyclerView main_category_recycle;
    RecyclerView recycle_two;
    RecyclerView deal,top_sell_one,top_sell_two,trending;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);


        main_category_recycle = view.findViewById(R.id.main_category_recycle);
        recycle_two = view.findViewById(R.id.recycle_two);
        deal = view.findViewById(R.id.deal_of_the_day_recycle);
        top_sell_one = view.findViewById(R.id.top_selling_products_recycle_one);
        top_sell_two = view.findViewById(R.id.top_selling_products_recycle_two);
        trending = view.findViewById(R.id.trending_offers_recycle);

        data();



        return view;
    }

    @SuppressLint("ResourceAsColor")
    private void data() {
        main_category_modelList = new ArrayList<>();
        MainCategoryModel model = new MainCategoryModel();
        model.setId(1);





        MainCategoryModel model2 = new MainCategoryModel();
        model2.setId(2);



        MainCategoryModel model3 = new MainCategoryModel();
        model3.setId(3);



        MainCategoryModel model4 = new MainCategoryModel();
        model4.setId(4);


        MainCategoryModel model5 = new MainCategoryModel();
        model5.setId(5);



        MainCategoryModel model6 = new MainCategoryModel();
        model6.setId(6);




        MainCategoryModel model7 = new MainCategoryModel();
        model7.setId(7);





        main_category_modelList.add(model);
        main_category_modelList.add(model2);
        main_category_modelList.add(model3);
        main_category_modelList.add(model4);
        main_category_modelList.add(model5);
        main_category_modelList.add(model6);
        main_category_modelList.add(model7);




        main_category_adapter = new MainCategoryAdapter(getActivity(),main_category_modelList);
        main_category_recycle.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        main_category_recycle.setAdapter(main_category_adapter);
        main_category_adapter.setOnItemClickListener(FragmentHome.this);


        mainBannerModelList = new ArrayList<>();

        MainBannerModel model8 = new MainBannerModel();
        model.setId(1);



        MainBannerModel model9 = new MainBannerModel();
        model2.setId(2);



        MainBannerModel model10 = new MainBannerModel();
        model3.setId(3);



        mainBannerModelList.add(model8);
        mainBannerModelList.add(model9);
        mainBannerModelList.add(model10);





//        mainBannerAdapter = new MainBannerAdapter(getActivity(),mainBannerModelList);
//        recycle_two.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
//        recycle_two.setAdapter(mainBannerAdapter);
//        mainBannerAdapter.setOnItemClickListener2(FragmentHome.this);

        recycle_two.getLayoutParams().height = ViewGroup.LayoutParams.WRAP_CONTENT;

        SimpleViewAdapter adapter = new SimpleViewAdapter(5, R.layout.home_main_banner);

        recycle_two.setAdapter(adapter);
        recycle_two.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));

        // add pager behavior
        PagerSnapHelper snapHelper = new PagerSnapHelper();
        snapHelper.attachToRecyclerView(recycle_two);

        // pager indicator
        recycle_two.addItemDecoration(new LinePagerIndicatorDecoration());


        deal_modelList = new ArrayList<>();
        Deal_Model deal_model = new Deal_Model();
        deal_model.setName("Scotch Premium");
        deal_model.setPrice("Rs.399/-");
        deal_model.setOffer("(75% off)");

        deal_modelList.add(deal_model);

        deal_adapter = new Deal_Adapter(getActivity(),deal_modelList);
        deal.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        deal.setAdapter(deal_adapter);


        top_sell_modelList = new ArrayList<>();
        Top_sell_Model top_sell_model = new Top_sell_Model();
        top_sell_model.setProduct_name("Women dress");


        top_sell_modelList.add(top_sell_model);

        top_sell_adapter = new Top_sell_Adapter(getActivity(),top_sell_modelList);
        top_sell_one.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        top_sell_one.setAdapter(top_sell_adapter);


        top_sell_one_modelList = new ArrayList<>();
        Top_sell_one_Model top_sell_one_model = new Top_sell_one_Model();
        top_sell_one_model.setProduct_name("Style for women");
        top_sell_one_model.setOffer("60% off");


        top_sell_one_modelList.add(top_sell_one_model);

        top_sell_one_adapter = new Top_sell_one_Adapter(getActivity(),top_sell_one_modelList);
        top_sell_two.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        top_sell_two.setAdapter(top_sell_one_adapter);


        trendingModelList = new ArrayList<>();
        Trending_model trending_model = new Trending_model();
        trending_model.setP_name("Men Shirt's");
        trending_model.setOffer("Min 20% off");


        trendingModelList.add(trending_model);

        trending_adapter = new Trending_Adapter(getActivity(),trendingModelList);
        trending.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        trending.setAdapter(trending_adapter);




    }

    @Override
    public void onItemClick(int position) {
//        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_activity_home, new Top_fragment()).commit();

        Intent intent = new Intent(getActivity(),Category_Control.class);
        startActivity(intent);


    }



}







