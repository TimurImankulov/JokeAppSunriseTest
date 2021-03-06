package com.example.jokeapp.data.repository

import com.example.jokeapp.data.interactors.JokeInteractor
import com.example.jokeapp.data.model.JokeModel
import retrofit2.Response

interface JokeRepository {
    suspend fun loadData(): Response<List<JokeModel>>
}

class JokeRepositoryImpl(private val network: JokeInteractor) : JokeRepository {

    override suspend fun loadData(): Response<List<JokeModel>> {
        return network.loadData()
    }
}