package com.techyourchance.dagger2course.screens.common.imageloader

import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class ImageLoader @Inject constructor(private val activity: AppCompatActivity) {

    private val requestOption = RequestOptions().centerCrop()

    fun loadImage(imageUrl: String, target: ImageView){
        Glide.with(activity)
            .load(imageUrl)
            .apply(requestOption)
            .into(target)
    }

}