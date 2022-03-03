package com.example.homework37.ua.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.homework37.ua.adapter.model.Tabs;

import java.util.ArrayList;

public class ViewPagerAdapter1 extends FragmentStateAdapter {


    public ViewPagerAdapter1(@NonNull Fragment fragment) {
        super(fragment);
    }
    private ArrayList<Tabs> fragments;

    public void setFragments(ArrayList<Tabs> fragments){
        this.fragments = new ArrayList<>();
        this.fragments.addAll(fragments);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return fragments.get(position).getFragment();
    }

    @Override
    public int getItemCount() {
        return fragments.size();
    }
}
