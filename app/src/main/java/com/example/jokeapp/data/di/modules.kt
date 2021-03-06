package com.example.jokeapp.data.di

import com.example.jokeapp.data.interactors.JokeInteractor
import com.example.jokeapp.data.interactors.JokeInteractorImpl
import com.example.jokeapp.data.remote.JokeService
import com.example.jokeapp.data.remote.RetrofitBuilder
import com.example.jokeapp.data.repository.JokeRepository
import com.example.jokeapp.data.repository.JokeRepositoryImpl
import com.example.jokeapp.ui.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val viewModelModule: Module = module {
    viewModel { MainViewModel(get()) }
}

val repositoryModule: Module = module {
    single<JokeRepository> { JokeRepositoryImpl(get()) }
}

val apiModule: Module = module {
    single<JokeService> { RetrofitBuilder.buildRetrofit() }
    single<JokeInteractor> { JokeInteractorImpl(get()) }
}

val appModules =
    listOf(viewModelModule, apiModule, repositoryModule)