package com.example.homework37.ua;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.homework37.R;
import com.example.homework37.databinding.FragmentMainBinding;
import com.example.homework37.ua.adapter.HomeAdapter;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    private FragmentMainBinding binding;
    private ArrayList<Model> data;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMainBinding.inflate(LayoutInflater.from(requireContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        HomeAdapter adapter = new HomeAdapter(data);
        binding.recyclerHome.setAdapter(adapter);
    }

    private void loadData() {
        data = new ArrayList<>();
        data.add(new Model(R.drawable.ic_rectangle, "joshua_l The game in Japan was amazing and I want to share some photos"));
        data.add(new Model(R.drawable.ic_rectangle, "joshua_l The game in Japan was amazing and I want to share some photos"));
        data.add(new Model(R.drawable.ic_rectangle, "joshua_l The game in Japan was amazing and I want to share some photos"));
        data.add(new Model(R.drawable.ic_rectangle, "joshua_l The game in Japan was amazing and I want to share some photos"));
        data.add(new Model(R.drawable.ic_rectangle, "joshua_l The game in Japan was amazing and I want to share some photos"));
        data.add(new Model(R.drawable.ic_rectangle, "joshua_l The game in Japan was amazing and I want to share some photos"));
        data.add(new Model(R.drawable.ic_rectangle, "joshua_l The game in Japan was amazing and I want to share some photos"));


    }
}