package com.kt.std.movieinformer.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

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
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MoviePopularViewHolder holder, int position) {

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
