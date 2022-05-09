package com.example.shopkeeper.Categories;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import com.example.shopkeeper.R;
import com.example.shopkeeper.trending.Trending_Adapter;
import com.example.shopkeeper.trending.Trending_model;


import java.util.ArrayList;
import java.util.List;


public class FragmentCategory extends Fragment {
    List<Fragment_model> fragmentModelList;
    category_Adapter category_adapter;
    RecyclerView recyclerView,filter;

    List<Filter_model> filterModelList;
    Filter_adapter filter_adapter;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_category, container, false);

        getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_NOTHING);

        recyclerView = root.findViewById(R.id.cat_recycle);
        filter = root.findViewById(R.id.filter_recycle);


        fragmentModelList = new ArrayList<>();

        for(int i=0;i<10;i++){
        Fragment_model fragment_model = new Fragment_model();
        fragment_model.setName("Kurtis");

        fragmentModelList.add(fragment_model);
        }

        GridLayoutManager layoutManager=new GridLayoutManager(getActivity(),2){
            @Override
            public boolean canScrollVertically() {
                return true;
            }
        };

        recyclerView.setLayoutManager(layoutManager);
        category_adapter =  new category_Adapter(getActivity(),fragmentModelList);
        recyclerView.setAdapter(category_adapter);
//        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));



        filterModelList = new ArrayList<>();

        for(int i=0;i<15;i++){
            Filter_model filter_model = new Filter_model();
            filter_model.setName("Fashion");

            filterModelList.add(filter_model);
        }




        filter_adapter =  new Filter_adapter(getActivity(),filterModelList);
        filter.setAdapter(filter_adapter);
        filter.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));


        return  root;
    }
}