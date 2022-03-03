package com.example.homework37.ua.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homework37.databinding.ItemSecondBinding;

import java.util.ArrayList;

public class SecondAdapter extends RecyclerView.Adapter <SecondAdapter.SecondViewHolder>{
    private ArrayList<Integer> images;

    public SecondAdapter(ArrayList<Integer> images) {
        this.images = images;
    }

    @NonNull
    @Override
    public SecondAdapter.SecondViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SecondAdapter.SecondViewHolder(ItemSecondBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull SecondAdapter.SecondViewHolder holder, int position) {
        holder.bind(images.get(position));
    }

    @Override
    public int getItemCount() {
        return images.size();
    }

    class SecondViewHolder extends RecyclerView.ViewHolder {
        private ItemSecondBinding binding;

        public SecondViewHolder(@NonNull ItemSecondBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void bind(Integer image) {
            binding.photosFirst.setImageResource(image);
        }
    }
}
