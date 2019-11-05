package com.myapplication.fragment;


import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.myapplication.R;
import com.myapplication.adapter.AdapterSwimmingStyle;
import com.myapplication.databinding.FragmentMyCoachBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyCoachFragment extends Fragment {
    FragmentMyCoachBinding binding;


    public MyCoachFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_coach, container, false);
        binding = DataBindingUtil.bind(view);
        init();
        return binding.getRoot();
    }

    private void init(){
        binding.recycleSwimmingStyle.setItemAnimator(new DefaultItemAnimator());
        binding.recycleSwimmingStyle.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.recycleSwimmingStyle.setAdapter(new AdapterSwimmingStyle(getContext()));

    }

}
