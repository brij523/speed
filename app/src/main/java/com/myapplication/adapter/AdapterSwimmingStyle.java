package com.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.myapplication.R;
import com.myapplication.databinding.AdapterSwimmingStyleBinding;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterSwimmingStyle extends RecyclerView.Adapter<AdapterSwimmingStyle.ViewHolder> {

    private Context context;
    public AdapterSwimmingStyle(Context context){
        this.context = context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        AdapterSwimmingStyleBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.adapter_swimming_style,parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.binding.swimmingStyleHorizontal.setItemAnimator(new DefaultItemAnimator());
        holder.binding.swimmingStyleHorizontal.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.binding.swimmingStyleHorizontal.setAdapter(new AdapterSwimmingStyleHorizontal());

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        AdapterSwimmingStyleBinding binding;

        public ViewHolder(@NonNull AdapterSwimmingStyleBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;

        }
    }
}
