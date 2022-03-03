package com.example.homework37.ua;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.homework37.R;
import com.example.homework37.databinding.FragmentSecondBinding;
import com.example.homework37.ua.adapter.FirstAdapter;
import com.example.homework37.ua.adapter.SecondAdapter;

import java.util.ArrayList;

public class SecondFragment extends Fragment {
private FragmentSecondBinding binding;
    private ArrayList <Integer> images;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(LayoutInflater.from(requireContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        SecondAdapter adapter = new SecondAdapter(images);
        binding.recycler2.setAdapter(adapter);
    }

    private void loadData() {
        images = new ArrayList<>();
        images.add(R.drawable.ic_rectangle1);
        images.add(R.drawable.ic_rectangle2);
        images.add(R.drawable.ic_rectangle3);
        images.add(R.drawable.ic_rectangle4);
        images.add(R.drawable.ic_rectangle5);
        images.add(R.drawable.ic_rectangle6);
        images.add(R.drawable.ic_rectangle7);
        images.add(R.drawable.ic_rectangle8);
        images.add(R.drawable.ic_rectangle9);

    }
}