package com.example.day16_dagger

import com.example.day16_dagger.activity.MainActivity
import com.example.day16_dagger.screen.ArtistFragment
import com.example.day16_dagger.screen.CreateArtistFragment
import dagger.Component

@Component
interface ApplicationComponent {
    fun inject(mainActivity: MainActivity)
    fun inject(artistFragment: ArtistFragment)
    fun inject(createArtistFragment: CreateArtistFragment)
}