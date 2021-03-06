package com.example.jokeapp.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.jokeapp.R
import com.example.jokeapp.utils.decorators.ItemOffsetDecoration
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val vm by viewModel<MainViewModel>()
    private val jokeAdapter by lazy { JokeAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupRecyclerView()
        setupViewModel()
        setupListeners()

        vm.loadData()
    }

    private fun setupListeners() {
        btnUpdate.setOnClickListener {
            vm.loadData()
        }
    }

    private fun setupViewModel() {
        vm.data.observe(this, Observer {
            jokeAdapter.submitList(it)
        })
    }

    private fun setupRecyclerView() {
        recyclerView.adapter = jokeAdapter

        recyclerView.addItemDecoration(
            ItemOffsetDecoration(
                itemBottomMargin = 20f
            )
        )
    }
}