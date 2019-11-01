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
import com.myapplication.adapter.AdapterEvents;
import com.myapplication.databinding.FragmentEventsBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventsFragment extends Fragment {
    private FragmentEventsBinding binding;


    public EventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_events, container, false);
        binding = DataBindingUtil.bind(view);
        init();
        return binding.getRoot();

    }

    private void init(){
        binding.eventsRecycle.setItemAnimator(new DefaultItemAnimator());
        binding.eventsRecycle.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.eventsRecycle.setAdapter(new AdapterEvents());
    }

}
