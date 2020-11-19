package com.kt.std.movieinformer.service;

import com.kt.std.movieinformer.model.MoviePopularResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieApiService {

    @GET("movie/popular")
    Call<MoviePopularResponse> getPopularMovies(@Query("api_key") String apiKey, @Query("language") String language);
}
