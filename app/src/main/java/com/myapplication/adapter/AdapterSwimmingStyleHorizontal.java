package com.myapplication.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.myapplication.R;
import com.myapplication.databinding.AdapterSwimmingStyleBinding;
import com.myapplication.databinding.AdapterSwimmingStyleHorizontalBinding;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterSwimmingStyleHorizontal extends RecyclerView.Adapter<AdapterSwimmingStyleHorizontal.ViewHolder> {

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        AdapterSwimmingStyleHorizontalBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.adapter_swimming_style_horizontal,parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        AdapterSwimmingStyleHorizontalBinding binding;

        public ViewHolder(@NonNull AdapterSwimmingStyleHorizontalBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }
    }
}
