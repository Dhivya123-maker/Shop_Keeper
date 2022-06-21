package com.example.shopkeeper.CountryPicker.listener;

import  com.example.shopkeeper.CountryPicker.bean.CountryData;

@FunctionalInterface
public interface CountrySelectListener {
    void onCountrySelect(CountryData countryData);
}
