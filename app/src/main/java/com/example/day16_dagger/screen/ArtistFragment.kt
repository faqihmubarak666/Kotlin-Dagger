package com.example.day16_dagger.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.example.day16_dagger.AppContainer
import com.example.day16_dagger.MyApplication
import com.example.day16_dagger.R
import com.example.day16_dagger.artist.ArtistViewModel
import kotlinx.android.synthetic.main.fragment_artist.*
import javax.inject.Inject

class ArtistFragment : Fragment(), View.OnClickListener {

    @Inject lateinit var artistViewModel: ArtistViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (activity?.applicationContext as MyApplication).applicationComponent.inject(this)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_artist, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        artistViewModel.artist?.observe(viewLifecycleOwner, Observer {
            artistNameText.text = it.judul_buku
            println("Hasilnya = ${it.judul_buku}")
        })
        fetchButton.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v) {
            fetchButton -> getArtistByID()
        }
    }

    private fun getArtistByID() {
        artistViewModel.getArtist(artistIdInputText.text.toString())
    }
}
