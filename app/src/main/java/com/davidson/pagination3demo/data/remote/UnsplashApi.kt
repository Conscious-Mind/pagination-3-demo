package com.davidson.pagination3demo.data.remote

import com.davidson.pagination3demo.model.UnsplashImage
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface UnsplashApi {

    @Headers("Authorization: Client-ID ")
    @GET("/photos")
    suspend fun getAllImages(
        @Query("page")
        page: Int,
        @Query("per_page")
        perPage: Int
    ) : List<UnsplashImage>
}