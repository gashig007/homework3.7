package com.example.homework37.ua.adapter.model;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class Tabs {
    private Fragment fragment;
    private Integer icon;

    public Tabs(Fragment fragment, Integer icon) {
        this.fragment = fragment;
        this.icon = icon;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }

    public Integer getIcon() {
        return icon;
    }

    public void setIcon(Integer icon) {
        this.icon = icon;
    }
}
