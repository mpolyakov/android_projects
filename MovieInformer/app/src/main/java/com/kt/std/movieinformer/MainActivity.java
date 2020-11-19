package com.kt.std.movieinformer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.kt.std.movieinformer.model.MoviePopularResponse;
import com.kt.std.movieinformer.model.MoviePopularResult;
import com.kt.std.movieinformer.service.MovieApiService;
import com.kt.std.movieinformer.service.RetrofitInstance;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private ArrayList<MoviePopularResult> results;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getPopularMovies();
    }

    public void getPopularMovies() {
        MovieApiService movieApiService = RetrofitInstance.getService();

        Call<MoviePopularResponse> call = movieApiService.getPopularMovies(getString(R.string.api_key), getString(R.string.language));

        call.enqueue(new Callback<MoviePopularResponse>() {
            @Override
            public void onResponse(Call<MoviePopularResponse> call, Response<MoviePopularResponse> response) {
                MoviePopularResponse moviePopularResponse = response.body();

                if (moviePopularResponse != null && moviePopularResponse.getResults() != null) {
                    results = (ArrayList<MoviePopularResult>) moviePopularResponse.getResults();

                    fillPopularRecyclerView();
                }
            }

            @Override
            public void onFailure(Call<MoviePopularResponse> call, Throwable t) {

            }
        });
    }

    private void fillPopularRecyclerView() {
        recyclerView = findViewById(R.id.rvPopular);


    }
}