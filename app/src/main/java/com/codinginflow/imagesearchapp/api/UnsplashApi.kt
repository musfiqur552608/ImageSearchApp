package com.codinginflow.imagesearchapp.api

import com.codinginflow.imagesearchapp.BuildConfig
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface UnsplashApi {
    companion object{
        const val BASE_URL = "https://api.unsplash.com/"
        const val CLINT_ID = BuildConfig.UNSPLASH_ACCESS_KEY
    }

    @Headers("Accept-Version: v1", "Authorization: Clint-ID $CLINT_ID")
    @GET("search/photos")
    suspend fun searchPhotos(
        @Query("query") query: String,
        @Query("page") page: Int,
        @Query("per_page") perPage:Int
    ): UnsplashResponse
}