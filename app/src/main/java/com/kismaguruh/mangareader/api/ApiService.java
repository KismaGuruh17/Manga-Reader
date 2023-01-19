package com.kismaguruh.mangareader.api;

import com.kismaguruh.mangareader.response.ResponseItem;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

interface ApiService {
    @GET("MANGA")
    Call<ResponseItem> getManga(@Query("query") String mangaName);

    @GET("manga/now_playing")
    Call<ResponseItem> getNowPlaying();



}
