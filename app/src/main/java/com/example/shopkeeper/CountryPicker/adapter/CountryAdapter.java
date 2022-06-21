package com.example.shopkeeper.CountryPicker.adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import com.example.shopkeeper.R;
import com.example.shopkeeper.CountryPicker.bean.CountryData;
import com.example.shopkeeper.CountryPicker.listener.CountrySelectListener;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.CountryViewHolder> {
    private ArrayList<CountryData> countryDataList;
    private CountrySelectListener countrySelectListener;
    private CountryData selectedCountry;

    public CountryAdapter(ArrayList<CountryData> countryDataList) {
        this.countryDataList = countryDataList;
    }

    public void setCountryDataList(ArrayList<CountryData> countryDataList) {
        this.countryDataList = countryDataList;
        notifyDataSetChanged();
    }

    public void setSelectedCountry(CountryData selectedCountry) {
        this.selectedCountry = selectedCountry;
        notifyDataSetChanged();
    }

    public void setCountrySelectListener(CountrySelectListener countrySelectListener) {
        this.countrySelectListener = countrySelectListener;
    }

    public CountryData getSelectedCountry() {
        return selectedCountry;
    }

    static class CountryViewHolder extends RecyclerView.ViewHolder {
        TextView textViewCountryName, textViewCountryISD;
        ImageView imageViewFlag;

        CountryViewHolder(View v) {
            super(v);

            textViewCountryISD = v.findViewById(R.id.textViewISDCode);

        }
    }

    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_country, parent, false);
        return new CountryViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final CountryViewHolder holder, int position) {

        holder.textViewCountryISD.setText(countryDataList.get(position).getCountryISD());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countrySelectListener.onCountrySelect(countryDataList.get(holder.getAdapterPosition()));
            }
        });
        if (selectedCountry != null) {
            if (countryDataList.get(position).equals(selectedCountry))
                holder.itemView.setBackgroundColor(ContextCompat.getColor(holder.itemView.getContext(), R.color.colorSelected));
            else
                holder.itemView.setBackgroundColor(ContextCompat.getColor(holder.itemView.getContext(), R.color.colorUnSelected));
        } else
            holder.itemView.setBackgroundColor(ContextCompat.getColor(holder.itemView.getContext(), R.color.colorUnSelected));

    }

    @Override
    public int getItemCount() {
        return countryDataList.size();
    }
}