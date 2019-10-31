package com.myapplication.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.myapplication.R;
import com.myapplication.databinding.AdapterEventsBinding;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterEvents extends RecyclerView.Adapter<AdapterEvents.ClassViewHolder> {

    @NonNull
    @Override
    public ClassViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        AdapterEventsBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.adapter_events,parent,false);
        return new ClassViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ClassViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    class ClassViewHolder extends RecyclerView.ViewHolder{

        public ClassViewHolder(@NonNull AdapterEventsBinding itemView) {
            super(itemView.getRoot());
        }
    }
}
