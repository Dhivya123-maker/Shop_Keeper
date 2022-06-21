package com.example.shopkeeper.CategoryControlclass.ProductCategories;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shopkeeper.BannerIndicatorClass;
import com.example.shopkeeper.R;
import com.example.shopkeeper.BannerIndicatorAdapter;

import java.util.ArrayList;
import java.util.List;


public class ProductCategoryFragment extends Fragment {
    RecyclerView recyclerView,main_category_recycle,trending,sec_ban,brand,offer,rating,top_rating;


    List<MaterialModel> top_modelList;
    MaterialAdapter top_fragment_adapter;

    List<TrendingModel> trendingModelList;
    TrendingAdapter trending_adapter;

    List<BannerSecondModel> banSecModelList;
    BannerSecondAdapter banner_second_adapter;

    List<BrandModel> brandModelList;
    BrandAdapter brand_adapter;

    List<OfferModel> offerModelList;
    OfferAdapter offer_adapter;

    List<RatingModel> ratingModelList;
    RatingAdapter rating_adapter;

    List<TopRatingModel> top_rating_modelList;
    TopRatingAdapter top_rating_adapter;


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

        BannerIndicatorAdapter adapter = new BannerIndicatorAdapter(5, R.layout.home_main_banner);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));


        PagerSnapHelper snapHelper = new PagerSnapHelper();
        snapHelper.attachToRecyclerView(recyclerView);

        recyclerView.addItemDecoration(new BannerIndicatorClass());

        top_modelList = new ArrayList<>();

        for(int i=0;i<=10;i++){


        MaterialModel model = new MaterialModel();
        model.setTxt("Sarees");


        top_modelList.add(model);
        }
        top_fragment_adapter = new MaterialAdapter(getActivity(),top_modelList);
        main_category_recycle.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        main_category_recycle.setAdapter(top_fragment_adapter);



        trendingModelList = new ArrayList<>();

        for(int i=0;i<=10;i++){


            TrendingModel model = new TrendingModel();
            model.setTxt("Kurtas");


            trendingModelList.add(model);
        }
        trending_adapter = new TrendingAdapter(getActivity(),trendingModelList);
        trending.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        trending.setAdapter(trending_adapter);



        banSecModelList = new ArrayList<>();

        for(int i=0;i<=10;i++){


            BannerSecondModel model = new BannerSecondModel();
            model.setImage("1");


            banSecModelList.add(model);
        }
        banner_second_adapter = new BannerSecondAdapter(getActivity(),banSecModelList);
        sec_ban.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        sec_ban.setAdapter(banner_second_adapter);



        brandModelList = new ArrayList<>();

        for(int i=0;i<=10;i++){


           BrandModel model = new BrandModel();
            model.setImg("1");
            model.setBrand_logo("2");
            model.setTxt("Scotch Premium");



            brandModelList.add(model);
        }
        brand_adapter = new BrandAdapter(getActivity(),brandModelList);
        brand.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        brand.setAdapter(brand_adapter);



        brandModelList = new ArrayList<>();

        for(int i=0;i<=10;i++){


            BrandModel model = new BrandModel();
            model.setImg("1");
            model.setBrand_logo("2");
            model.setTxt("Scotch Premium");



            brandModelList.add(model);
        }
        brand_adapter = new BrandAdapter(getActivity(),brandModelList);
        brand.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        brand.setAdapter(brand_adapter);


        offerModelList = new ArrayList<>();

        for(int i=0;i<=10;i++){


            OfferModel model = new OfferModel();
           model.setTxt("50% OFF");

            offerModelList.add(model);
        }
        offer_adapter = new OfferAdapter(getActivity(),offerModelList);
        offer.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        offer.setAdapter(offer_adapter);




        ratingModelList = new ArrayList<>();

        for(int i=0;i<=10;i++){


            RatingModel model = new RatingModel();
            model.setTxt("Women Kurti");
            model.setImg("1");

            ratingModelList.add(model);
        }
        rating_adapter = new RatingAdapter(getActivity(),ratingModelList);
        rating.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        rating.setAdapter(rating_adapter);



        top_rating_modelList = new ArrayList<>();

        for(int i=0;i<=10;i++){


            TopRatingModel model = new TopRatingModel();
            model.setProduct_name("Party Wear");
            model.setOffer_txt("Min 50% off");
            model.setImg("1");

            top_rating_modelList.add(model);
        }
        top_rating_adapter = new TopRatingAdapter(getActivity(),top_rating_modelList);
        top_rating.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        top_rating.setAdapter(top_rating_adapter);



        return  root;

    }


}