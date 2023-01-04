package com.kismaguruh.mangareader.api;

import com.kismaguruh.mangareader.response.ResponseItem;

import retrofit2.Call;
import retrofit2.http.GET;

interface ApiService {
    @GET("comic/popular/page/1")
    Call<ResponseItem> getManga();

}
