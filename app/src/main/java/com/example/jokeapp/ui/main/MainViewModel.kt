package com.example.jokeapp.ui.main

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jokeapp.data.model.JokeModel
import com.example.jokeapp.data.repository.JokeRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(private val repository: JokeRepository) : ViewModel() {

    val data = MutableLiveData<List<JokeModel>>()

    fun loadData() {
        viewModelScope.launch(Dispatchers.IO) {
            runCatching {
                val result = repository.loadData()
                data.postValue(result.body())
            }.onFailure {
                Log.d("Error", it.localizedMessage)
            }
        }
    }
}