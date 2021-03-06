package com.example.jokeapp.utils.ext

import android.content.Context
import android.util.TypedValue
import android.view.View
import com.google.android.material.imageview.ShapeableImageView
import com.google.android.material.shape.CornerFamily

fun Context.dpToPx(dimens: Float?): Int {
    val metrics = applicationContext.resources.displayMetrics
    return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dimens ?: 0f, metrics)
        .toInt()
}
