package com.example.shopkeeper.Home;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shopkeeper.CategoryControlclass.CategoryClass;
import com.example.shopkeeper.Home.Banner.MainBannerAdapter;
import com.example.shopkeeper.Home.Banner.MainBannerModel;
import com.example.shopkeeper.Home.Deal.DealAdapter;
import com.example.shopkeeper.Home.Deal.DealModel;
import com.example.shopkeeper.Home.HomeMainCategory.MainCategoryAdapter;
import com.example.shopkeeper.Home.HomeMainCategory.MainCategoryModel;
import com.example.shopkeeper.BannerIndicatorClass;
import com.example.shopkeeper.R;
import com.example.shopkeeper.BannerIndicatorAdapter;
import com.example.shopkeeper.Home.TopSell.TopSellAdapter;
import com.example.shopkeeper.Home.TopSell.TopSellModel;
import com.example.shopkeeper.Home.TopSell.TopSellOneAdapter;
import com.example.shopkeeper.Home.TopSell.TopSellOneModel;
import com.example.shopkeeper.Home.Trending.TrendingAdapter;
import com.example.shopkeeper.Home.Trending.TrendingModel;

import java.util.ArrayList;
import java.util.List;


public class FragmentHome extends Fragment {


    List<MainCategoryModel> main_category_modelList;
    MainCategoryAdapter main_category_adapter;

    List<MainBannerModel> mainBannerModelList;
    MainBannerAdapter mainBannerAdapter;

    List<DealModel> deal_modelList;
     DealAdapter deal_adapter;

    List<TopSellModel> top_sell_modelList;
    TopSellAdapter top_sell_adapter;

    List<TopSellOneModel> top_sell_one_modelList;
    TopSellOneAdapter top_sell_one_adapter;

    List<TrendingModel> trendingModelList;
    TrendingAdapter trending_adapter;

    RecyclerView main_category_recycle;
    RecyclerView recycle_two;
    RecyclerView deal,top_sell_one,top_sell_two,trending;

    String cat;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_NOTHING);

        main_category_recycle = view.findViewById(R.id.main_category_recycle);
        recycle_two = view.findViewById(R.id.recycle_two);
        deal = view.findViewById(R.id.deal_of_the_day_recycle);
        top_sell_one = view.findViewById(R.id.top_selling_products_recycle_one);
        top_sell_two = view.findViewById(R.id.top_selling_products_recycle_two);
        trending = view.findViewById(R.id.trending_offers_recycle);




        main_cat();
        banner();
        deal();
        top_sell_one();
        top_sell_two();
        trending();


        return view;
    }



    @SuppressLint("ResourceAsColor")
    private void main_cat() {
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





    }

    public  void banner(){
        recycle_two.getLayoutParams().height = ViewGroup.LayoutParams.WRAP_CONTENT;

        BannerIndicatorAdapter adapter = new BannerIndicatorAdapter(5, R.layout.home_main_banner);

        recycle_two.setAdapter(adapter);
        recycle_two.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));

        // add pager behavior
        PagerSnapHelper snapHelper = new PagerSnapHelper();
        snapHelper.attachToRecyclerView(recycle_two);

        // pager indicator
        recycle_two.addItemDecoration(new BannerIndicatorClass());


    }

    public  void deal(){

        deal_modelList = new ArrayList<>();
        DealModel deal_model = new DealModel();
        deal_model.setName("Scotch Premium");
        deal_model.setPrice("Rs.399/-");
        deal_model.setOffer("(75% off)");



        deal_modelList.add(deal_model);

        deal_adapter = new DealAdapter(getActivity(),deal_modelList);
        deal.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        deal.setAdapter(deal_adapter);

    }

    public  void top_sell_one(){

        top_sell_modelList = new ArrayList<>();
        TopSellModel top_sell_model = new TopSellModel();
        top_sell_model.setProduct_name("Women dress");


        top_sell_modelList.add(top_sell_model);

        top_sell_adapter = new TopSellAdapter(getActivity(),top_sell_modelList);
        top_sell_one.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        top_sell_one.setAdapter(top_sell_adapter);


    }


    public  void top_sell_two(){
        top_sell_one_modelList = new ArrayList<>();
        TopSellOneModel top_sell_one_model = new TopSellOneModel();
        top_sell_one_model.setProduct_name("Style for women");
        top_sell_one_model.setOffer("60% off");


        top_sell_one_modelList.add(top_sell_one_model);

        top_sell_one_adapter = new TopSellOneAdapter(getActivity(),top_sell_one_modelList);
        top_sell_two.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        top_sell_two.setAdapter(top_sell_one_adapter);

    }

    public  void trending(){

        trendingModelList = new ArrayList<>();
        TrendingModel trending_model = new TrendingModel();
        trending_model.setP_name("Men Shirt's");
        trending_model.setOffer("Min 20% off");


        trendingModelList.add(trending_model);

        trending_adapter = new TrendingAdapter(getActivity(),trendingModelList);
        trending.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        trending.setAdapter(trending_adapter);

    }





}







