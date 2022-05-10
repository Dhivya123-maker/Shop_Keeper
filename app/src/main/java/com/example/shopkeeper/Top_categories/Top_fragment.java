package com.example.shopkeeper.Top_categories;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shopkeeper.FragmentHome;
import com.example.shopkeeper.HomeMainCategory.MainBannerAdapter;
import com.example.shopkeeper.HomeMainCategory.MainBannerModel;
import com.example.shopkeeper.HomeMainCategory.MainCategoryAdapter;
import com.example.shopkeeper.HomeMainCategory.MainCategoryModel;
import com.example.shopkeeper.LinePagerIndicatorDecoration;
import com.example.shopkeeper.R;
import com.example.shopkeeper.SimpleViewAdapter;

import java.util.ArrayList;
import java.util.List;


public class Top_fragment extends Fragment {
    RecyclerView recyclerView,main_category_recycle,trending,sec_ban,brand,offer,rating,top_rating;


    List<Top_Model> top_modelList;
    Top_Fragment_Adapter top_fragment_adapter;

    List<Trending_model> trendingModelList;
    Trending_Adapter trending_adapter;

    List<Ban_sec_Model> banSecModelList;
    Banner_second_Adapter banner_second_adapter;

    List<Brand_model> brandModelList;
    Brand_Adapter brand_adapter;

    List<Offer_model> offerModelList;
    Offer_Adapter offer_adapter;

    List<Rating_model> ratingModelList;
    Rating_Adapter rating_adapter;

    List<Top_rating_model> top_rating_modelList;
    Top_rating_Adapter top_rating_adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment_top_fragment, container, false);

        recyclerView = root.findViewById(R.id.banner);
        main_category_recycle = root.findViewById(R.id.categories);
        trending = root.findViewById(R.id.Trending);
        sec_ban = root.findViewById(R.id.sec_ban_recycle);
        brand = root.findViewById(R.id.brand);
        offer = root.findViewById(R.id.offer_recycle);
        rating = root.findViewById(R.id.rating_recycle);
        top_rating = root.findViewById(R.id.top_rate_recycle);



        recyclerView.getLayoutParams().height = ViewGroup.LayoutParams.WRAP_CONTENT;

        SimpleViewAdapter adapter = new SimpleViewAdapter(5, R.layout.home_main_banner);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));


        PagerSnapHelper snapHelper = new PagerSnapHelper();
        snapHelper.attachToRecyclerView(recyclerView);

        recyclerView.addItemDecoration(new LinePagerIndicatorDecoration());

        top_modelList = new ArrayList<>();

        for(int i=0;i<=10;i++){


        Top_Model model = new Top_Model();
        model.setTxt("Sarees");


        top_modelList.add(model);
        }
        top_fragment_adapter = new Top_Fragment_Adapter(getActivity(),top_modelList);
        main_category_recycle.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        main_category_recycle.setAdapter(top_fragment_adapter);



        trendingModelList = new ArrayList<>();

        for(int i=0;i<=10;i++){


            Trending_model model = new Trending_model();
            model.setTxt("Kurtas");


            trendingModelList.add(model);
        }
        trending_adapter = new Trending_Adapter(getActivity(),trendingModelList);
        trending.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        trending.setAdapter(trending_adapter);



        banSecModelList = new ArrayList<>();

        for(int i=0;i<=10;i++){


            Ban_sec_Model model = new Ban_sec_Model();
            model.setImage("1");


            banSecModelList.add(model);
        }
        banner_second_adapter = new Banner_second_Adapter(getActivity(),banSecModelList);
        sec_ban.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        sec_ban.setAdapter(banner_second_adapter);



        brandModelList = new ArrayList<>();

        for(int i=0;i<=10;i++){


           Brand_model model = new Brand_model();
            model.setImg("1");
            model.setBrand_logo("2");
            model.setTxt("Scotch Premium");



            brandModelList.add(model);
        }
        brand_adapter = new Brand_Adapter(getActivity(),brandModelList);
        brand.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        brand.setAdapter(brand_adapter);



        brandModelList = new ArrayList<>();

        for(int i=0;i<=10;i++){


            Brand_model model = new Brand_model();
            model.setImg("1");
            model.setBrand_logo("2");
            model.setTxt("Scotch Premium");



            brandModelList.add(model);
        }
        brand_adapter = new Brand_Adapter(getActivity(),brandModelList);
        brand.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        brand.setAdapter(brand_adapter);


        offerModelList = new ArrayList<>();

        for(int i=0;i<=10;i++){


            Offer_model model = new Offer_model();
           model.setTxt("50% OFF");

            offerModelList.add(model);
        }
        offer_adapter = new Offer_Adapter(getActivity(),offerModelList);
        offer.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        offer.setAdapter(offer_adapter);




        ratingModelList = new ArrayList<>();

        for(int i=0;i<=10;i++){


            Rating_model model = new Rating_model();
            model.setTxt("Women Kurti");
            model.setImg("1");

            ratingModelList.add(model);
        }
        rating_adapter = new Rating_Adapter(getActivity(),ratingModelList);
        rating.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        rating.setAdapter(rating_adapter);



        top_rating_modelList = new ArrayList<>();

        for(int i=0;i<=10;i++){


            Top_rating_model model = new Top_rating_model();
            model.setProduct_name("Party Wear");
            model.setOffer_txt("Min 50% off");
            model.setImg("1");

            top_rating_modelList.add(model);
        }
        top_rating_adapter = new Top_rating_Adapter(getActivity(),top_rating_modelList);
        top_rating.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        top_rating.setAdapter(top_rating_adapter);



        return  root;

    }
}