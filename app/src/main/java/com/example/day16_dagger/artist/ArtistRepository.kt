package com.example.day16_dagger.artist

import androidx.lifecycle.MutableLiveData
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Response
import retrofit2.Callback
import javax.inject.Inject

class ArtistRepository @Inject constructor() {

    var artist: MutableLiveData<Artist> = MutableLiveData<Artist>()

    fun getArtist(id: String) {
//        artistAPI.getArtistById(id).enqueue(object : Callback<WrapperResponse> {
//            override fun onFailure(call: Call<WrapperResponse>, t: Throwable) {
//                println("Failed Because ${t.printStackTrace()}")
//                println("Failed Because ${t.localizedMessage}")
//            }
//
//            override fun onResponse(call: Call<WrapperResponse>, response: Response<WrapperResponse>) {
//                if(response.code() == 200){
//                    val response = response.body()
//                    val gson = Gson()
//                    val result = gson.toJson(response?.result)
//                    val artistObject = gson.fromJson<Artist>(result, Artist::class.java)
//                    artist.value = artistObject
//                }
//            }
//        })
    }

    fun saveArtist(artist: Artist) {
//        artistAPI.createArtist(artist).enqueue(object : Callback<Artist> {
//            override fun onFailure(call: Call<Artist>, t: Throwable) {
//               t.printStackTrace()
//                println("Failed File Created  ${t.localizedMessage}")
//            }
//
//            override fun onResponse(call: Call<Artist>, response: Response<Artist>) {
////                if (response.code() == 200){
//                    println("SUCCESS")
////                }
//            }
//        })
    }
}