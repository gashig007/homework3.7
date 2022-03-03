package com.example.homework37.ua.adapter;


import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homework37.databinding.ItemFirstBinding;

import java.util.ArrayList;

public class FirstAdapter extends RecyclerView.Adapter <FirstAdapter.FirstViewHolder>{
    private ArrayList<Integer> images;

    public FirstAdapter(ArrayList<Integer> images) {
        this.images = images;
    }

    @NonNull
    @Override
    public FirstViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FirstViewHolder(ItemFirstBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull FirstViewHolder holder, int position) {
holder.bind(images.get(position));
    }

    @Override
    public int getItemCount() {
        return images.size();
    }

    class FirstViewHolder extends RecyclerView.ViewHolder {
        private ItemFirstBinding binding;

        public FirstViewHolder(@NonNull ItemFirstBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void bind(Integer image) {
            binding.photosFirst.setImageResource(image);
        }
    }
}
