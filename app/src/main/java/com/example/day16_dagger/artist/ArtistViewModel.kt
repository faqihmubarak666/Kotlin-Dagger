package com.example.day16_dagger.artist

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class ArtistViewModel @Inject constructor(
    var artistRepository: ArtistRepository
)  {


    val artist: LiveData<Artist>? = artistRepository?.artist

    fun getArtist(id: String) {
        artistRepository?.getArtist(id)
    }

    fun saveArtist(artist: Artist) {
        artistRepository?.saveArtist(artist)
    }
}