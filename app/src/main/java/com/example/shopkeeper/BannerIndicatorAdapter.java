package com.example.shopkeeper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

public class BannerIndicatorAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

  private final int itemCount;
  private final int layout;

  public BannerIndicatorAdapter(int itemCount, int layout) {
    this.itemCount = itemCount;
    this.layout = layout;
  }

  @Override
  public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    final Context context = parent.getContext();
    final View view = LayoutInflater.from(context).inflate(layout, parent, false);
    return new RecyclerView.ViewHolder(view) {
    };
  }

  @Override
  public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

  }

  @Override
  public int getItemCount() {
    return itemCount;
  }
}
