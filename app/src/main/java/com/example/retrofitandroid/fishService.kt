package com.example.retrofitandroid
import retrofit2.Call
import retrofit2.http.GET

interface FishService {
    @GET("species")
    fun getData(): Call<List<Model?>>
}