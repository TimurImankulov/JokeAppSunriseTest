package com.example.jokeapp.utils.diffUtils

import androidx.recyclerview.widget.DiffUtil
import com.example.jokeapp.data.model.JokeModel

object DiffUtilsItems {

    val diffUtilItems = object : DiffUtil.ItemCallback<JokeModel>() {
        override fun areItemsTheSame(oldItem: JokeModel, newItem: JokeModel): Boolean {
            return oldItem.id == newItem.id
                    && oldItem.punchline == newItem.punchline
                    && oldItem.setup == newItem.setup
                    && oldItem.type == newItem.type
        }

        override fun areContentsTheSame(oldItem: JokeModel, newItem: JokeModel): Boolean {
            return oldItem == newItem
        }
    }
}
