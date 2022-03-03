package com.example.homework37.ua;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.homework37.R;
import com.example.homework37.databinding.FragmentFavoriteBinding;
import com.example.homework37.databinding.FragmentMainBinding;
import com.example.homework37.databinding.ItemFavoriteBinding;
import com.example.homework37.ua.adapter.FavoriteAdapter;
import com.example.homework37.ua.adapter.HomeAdapter;

import java.util.ArrayList;

public class FavoriteFragment extends Fragment {

    private FragmentFavoriteBinding binding;
    private ArrayList<Favorite> data;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFavoriteBinding.inflate(LayoutInflater.from(requireContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        FavoriteAdapter adapter = new FavoriteAdapter(data);
        binding.recyclerFavorite.setAdapter(adapter);
    }

    private void loadData() {
        data = new ArrayList<>();
        data.add(new Favorite(R.drawable.ic_oval1, "karennne liked your photo 1h", R.drawable.ic_rectangle9));
        data.add(new Favorite(R.drawable.ic_oval1, "karennne liked your photo 1h", R.drawable.ic_rectangle9));
        data.add(new Favorite(R.drawable.ic_oval1, "karennne liked your photo 1h", R.drawable.ic_rectangle9));
        data.add(new Favorite(R.drawable.ic_oval1, "karennne liked your photo 1h", R.drawable.ic_rectangle9));
        data.add(new Favorite(R.drawable.ic_oval1, "karennne liked your photo 1h", R.drawable.ic_rectangle9));




    }
}