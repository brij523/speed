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
import com.myapplication.adapter.AdapterMenuIcon;
import com.myapplication.databinding.FragmentHomeBinding;
import com.myapplication.helper.Helper;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {
    FragmentHomeBinding binding;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_home, container, false);
        binding = DataBindingUtil.bind(view);
        init();
        return binding.getRoot();
    }

    private void init(){
        binding.recycleMenu.setItemAnimator(new DefaultItemAnimator());
        binding.recycleMenu.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        binding.recycleMenu.setAdapter(new AdapterMenuIcon());
        binding.cardEvents.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.cardEvents:
                Helper.addFrag(getFragmentManager(),new EventsFragment(),R.id.mainframe1);

                break;
        }

    }
}
