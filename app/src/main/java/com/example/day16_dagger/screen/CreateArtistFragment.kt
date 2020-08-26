package com.example.day16_dagger.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.day16_dagger.AppContainer
import com.example.day16_dagger.MyApplication
import com.example.day16_dagger.R
import com.example.day16_dagger.artist.Artist
import com.example.day16_dagger.artist.ArtistViewModel
import kotlinx.android.synthetic.main.fragment_create_artist.*
import javax.inject.Inject


class CreateArtistFragment : Fragment(), View.OnClickListener {

    @Inject
    lateinit var artistViewModel: ArtistViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (activity?.applicationContext as MyApplication).applicationComponent.inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_create_artist, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        submitArtistButton.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v) {
            submitArtistButton -> {
                val artist = Artist(
                    id_buku = idBukuInputText.text.toString(),
                    judul_buku = judulBukuInputText.text.toString(),
                    id_kategori = idKategoriInputText.text.toString(),
                    id_pengarang = idPengarangInputText.text.toString(),
                    id_penerbit = idPenerbitInputText.text.toString()
                )
                artistViewModel.saveArtist(artist)
            }
        }
    }
}

