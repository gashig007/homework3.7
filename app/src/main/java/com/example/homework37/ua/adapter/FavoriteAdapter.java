package com.example.homework37.ua.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homework37.databinding.ItemFavoriteBinding;
import com.example.homework37.databinding.ItemHomeBinding;
import com.example.homework37.ua.Favorite;
import com.example.homework37.ua.Model;

import java.util.ArrayList;

public class FavoriteAdapter extends RecyclerView.Adapter<FavoriteAdapter.FavoriteViewHolder> {

    private ArrayList<Favorite> data;

    public FavoriteAdapter(ArrayList<Favorite> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public FavoriteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FavoriteAdapter.FavoriteViewHolder(ItemFavoriteBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull FavoriteViewHolder holder, int position) {
holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    class FavoriteViewHolder extends RecyclerView.ViewHolder {
        private ItemFavoriteBinding binding;

        public FavoriteViewHolder(@NonNull ItemFavoriteBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void bind(Favorite model) {
            binding.imageFavorite.setImageResource(model.getOval());
            binding.text.setText(model.getText());
            binding.photo.setImageResource(model.getPhoto());
        }
    }
}
