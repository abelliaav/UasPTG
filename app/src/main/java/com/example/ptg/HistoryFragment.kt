package com.example.ptg

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.widget.TextView

class HistoryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_history, container, false)


        val placeName = view.findViewById<TextView>(R.id.place_name)
        val placeDesc = view.findViewById<TextView>(R.id.place_desc)
        val placeReview = view.findViewById<TextView>(R.id.place_review)


        placeName.text = "Nama Tempat"
        placeDesc.text = "Deskripsi Tempat"
        placeReview.text = "Ulasan Tempat"

        return view
    }
}

