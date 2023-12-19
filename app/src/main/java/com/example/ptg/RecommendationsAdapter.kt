package com.example.ptg

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ptg.model.Recommendation

class RecommendationsAdapter(private val recommendations: List<Recommendation>) : RecyclerView.Adapter<RecommendationsAdapter.RecommendationViewHolder>() {

    inner class RecommendationViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // Inisialisasi elemen-elemen tampilan seperti gambar, nama, dan rating di sini
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecommendationViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recommendation, parent, false)
        return RecommendationViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecommendationViewHolder, position: Int) {
        val recommendation = recommendations[position]
        // Setel data ke dalam elemen-elemen tampilan di sini
    }

    override fun getItemCount(): Int {
        return recommendations.size
    }
}

