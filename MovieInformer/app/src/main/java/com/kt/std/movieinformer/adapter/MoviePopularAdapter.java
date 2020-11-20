package com.kt.std.movieinformer.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.kt.std.movieinformer.R;
import com.kt.std.movieinformer.model.MoviePopularResult;

import java.util.ArrayList;

public class MoviePopularAdapter extends RecyclerView.Adapter<MoviePopularAdapter.MoviePopularViewHolder> {
    private Context context;
    private ArrayList<MoviePopularResult> results;

    public MoviePopularAdapter(Context context, ArrayList<MoviePopularResult> results) {
        this.context = context;
        this.results = results;
    }

    @NonNull
    @Override
    public MoviePopularViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.popular_rv_item, parent,false);
        return new MoviePopularViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MoviePopularViewHolder holder, int position) {

        holder.titleTextView.setText(results.get(position).getTitle());
        holder.popularityTextView.setText(Double.toString(results.get(position).getPopularity()));
        String imagePath = "https://image.tmdb.org/t/p/w500/" + results.get(position).getPosterPath();
        Glide.with(context).load(imagePath).placeholder(R.drawable.placeholder).into(holder.popularityImageView);

    }

    @Override
    public int getItemCount() {
        return results.size();
    }

    public class MoviePopularViewHolder extends RecyclerView.ViewHolder {
        TextView titleTextView;
        TextView popularityTextView;
        ImageView popularityImageView;

        public MoviePopularViewHolder(@NonNull View itemView) {
            super(itemView);

            titleTextView = itemView.findViewById(R.id.tvPopularTitle);
            popularityTextView = itemView.findViewById(R.id.tvPopularPopularity);
            popularityImageView = itemView.findViewById(R.id.ivPopular);
        }
    }
}
