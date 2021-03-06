package com.example.jokeapp.ui.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.jokeapp.R
import com.example.jokeapp.data.model.JokeModel
import com.example.jokeapp.utils.diffUtils.DiffUtilsItems
import kotlinx.android.synthetic.main.rv_item.view.*

class JokeAdapter() : ListAdapter<JokeModel, JokeViewHolder>(DiffUtilsItems.diffUtilItems) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JokeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.rv_item, parent, false)
        return JokeViewHolder(view)
    }

    override fun onBindViewHolder(holder: JokeViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

class JokeViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    fun bind(item: JokeModel) {
        itemView.tvSetup.text = item.setup
        itemView.tvPunchline.text = item.punchline
    }
}