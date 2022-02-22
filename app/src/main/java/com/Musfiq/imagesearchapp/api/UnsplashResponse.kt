package com.Musfiq.imagesearchapp.api

import com.Musfiq.imagesearchapp.data.UnsplashPhoto

data class UnsplashResponse (
    val results: List<UnsplashPhoto>
)