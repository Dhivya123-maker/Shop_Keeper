package com.example.shopkeeper;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shopkeeper.HomeMainCategory.MainBannerAdapter;
import com.example.shopkeeper.HomeMainCategory.MainBannerModel;
import com.example.shopkeeper.HomeMainCategory.MainCategoryAdapter;
import com.example.shopkeeper.HomeMainCategory.MainCategoryModel;

import java.util.ArrayList;
import java.util.List;

public class FragmentHome extends Fragment implements MainCategoryAdapter.OnItemClickListener,MainBannerAdapter.OnItemClickListener2{


    List<MainCategoryModel> main_category_modelList;
    MainCategoryAdapter main_category_adapter;

    List<MainBannerModel> mainBannerModelList;
    MainBannerAdapter mainBannerAdapter;

    RecyclerView main_category_recycle;
    RecyclerView recycle_two;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        main_category_recycle = view.findViewById(R.id.main_category_recycle);
        recycle_two = view.findViewById(R.id.recycle_two);



        data();


        return view;
    }

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

        mainBannerAdapter = new MainBannerAdapter(getActivity(),mainBannerModelList);
        recycle_two.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        recycle_two.setAdapter(mainBannerAdapter);
        mainBannerAdapter.setOnItemClickListener2(FragmentHome.this);


    }

    @Override
    public void onItemClick(int position) {

    }

    @Override
    public void onItemClick2(int position) {

    }
}







