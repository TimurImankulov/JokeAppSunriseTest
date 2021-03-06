package com.example.jokeapp

import android.app.Application
import com.example.jokeapp.data.di.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class JokeApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@JokeApp)
            modules(appModules)
        }
    }
}