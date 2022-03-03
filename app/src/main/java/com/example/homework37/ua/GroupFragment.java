package com.example.homework37.ua;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;

import com.example.homework37.R;
import com.example.homework37.databinding.FragmentGroupBinding;
import com.example.homework37.ua.adapter.ViewPagerAdapter1;
import com.example.homework37.ua.adapter.model.Tabs;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class GroupFragment extends Fragment {
    private FragmentGroupBinding binding;
    private ViewPagerAdapter1 adapter1;
    private ArrayList<Tabs> fragments;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentGroupBinding.inflate(LayoutInflater.from(requireContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        fragments = new ArrayList<>();
        fragments.add(new Tabs(new FirstFragment(), R.drawable.ic_grid));
        fragments.add(new Tabs(new SecondFragment(), R.drawable.ic_tags));
        adapter1 = new ViewPagerAdapter1(this);
        adapter1.setFragments(fragments);
        binding.viewPager.setAdapter(adapter1);
        new TabLayoutMediator(binding.tabLayout, binding.viewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
tab.setIcon(fragments.get(position).getIcon());

            }
        }).attach();
    }
}