package com.esuraksha.luffyflix.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.esuraksha.luffyflix.R;

public class TrendingAdapter extends RecyclerView.Adapter<TrendingAdapter.MyViewHolder> {
    Context context;

    public TrendingAdapter(Context context) {
        this.context = context;
    }

    @Override
    public TrendingAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_trending, parent, false);
        return new TrendingAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(TrendingAdapter.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 9;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        public MyViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
        }
    }
}
