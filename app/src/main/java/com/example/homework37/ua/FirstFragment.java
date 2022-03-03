package com.example.homework37.ua;

import android.media.Image;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.homework37.R;
import com.example.homework37.databinding.FragmentFirstBinding;
import com.example.homework37.ua.adapter.FirstAdapter;

import java.util.ArrayList;

public class FirstFragment extends Fragment {
private FragmentFirstBinding binding;
private ArrayList <Integer> images;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(LayoutInflater.from(requireContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        FirstAdapter adapter = new FirstAdapter(images);
binding.recycler1.setAdapter(adapter);
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