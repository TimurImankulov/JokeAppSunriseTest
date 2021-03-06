package com.example.jokeapp.data.interactors

import com.example.jokeapp.data.model.JokeModel
import com.example.jokeapp.data.remote.JokeService
import retrofit2.Response

interface JokeInteractor {
    suspend fun loadData(): Response<List<JokeModel>>
}

class JokeInteractorImpl(private val service: JokeService) : JokeInteractor {
    override suspend fun loadData(): Response<List<JokeModel>> {
        return service.loadData()
    }
}