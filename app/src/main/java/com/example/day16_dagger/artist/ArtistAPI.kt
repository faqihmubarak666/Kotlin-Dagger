package com.example.day16_dagger.artist

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ArtistAPI {

    @GET("book/{id}")
//    fun getArtistById(@Path("id") id: String): Call<Artist>
    fun getArtistById(@Path("id") id: String): Call<WrapperResponse>

    @POST("book")
    fun createArtist(@Body artist: Artist): Call<Artist>
}