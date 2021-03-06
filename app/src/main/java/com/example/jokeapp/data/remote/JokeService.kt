package com.example.jokeapp.data.remote

import com.example.jokeapp.data.model.JokeModel
import retrofit2.Response
import retrofit2.http.GET

interface JokeService {

    @GET("random_ten")
    suspend fun loadData(
    ): Response<List<JokeModel>>
}


