package com.example.androidarchitecture01.services;

import com.example.androidarchitecture01.models.DogRandomResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DogService {
    @GET("breeds/image/random")
    Call<DogRandomResponse> fetchRandomDog();
}
