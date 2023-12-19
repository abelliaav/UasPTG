package com.example.ptg

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ptg.model.Recommendation

class HomeFragment : Fragment() {
    private lateinit var recommendationsRecyclerView: RecyclerView
    private lateinit var recommendationsAdapter: RecommendationsAdapter
    private var fragmentView: View? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentView = fragmentView ?: inflater.inflate(R.layout.fragment_home, container, false)

        fragmentView?.apply {
            initializeRecommendationsRecyclerView(this)
        }

        return fragmentView
    }

    private fun initializeRecommendationsRecyclerView(view: View) {
        recommendationsRecyclerView = view.findViewById(R.id.recyclerViewRecommendations)
        val recommendations = createRecommendationList()
        recommendationsAdapter = RecommendationsAdapter(recommendations)
        recommendationsRecyclerView.adapter = recommendationsAdapter
        recommendationsRecyclerView.layoutManager = LinearLayoutManager(requireContext())
    }

    private fun createRecommendationList(): List<Recommendation> {
        val recommendations = mutableListOf<Recommendation>()
        recommendations.add(Recommendation(1, "Restoran 1", R.drawable.caffe_foreground, 4.5f))
        recommendations.add(Recommendation(2, "Restoran 2", R.drawable.caffe_foreground, 3.8f))
        recommendations.add(Recommendation(3, "Restoran 3", R.drawable.caffe_foreground, 4.2f))
        // Tambahkan data rekomendasi lainnya jika diperlukan
        return recommendations
    }
}






