package com.example.ptg

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ptg.model.Category

class CategoryFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var categoryAdapter: CategoryAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_category, container, false)

        recyclerView = view.findViewById(R.id.recyclerViewCategories)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val categories = createCategoryList()
        val filteredCategories = filterDesiredCategories(categories)

        categoryAdapter = CategoryAdapter(filteredCategories) { category ->
            navigateToPlacesFragment(category.name)
        }
        recyclerView.adapter = categoryAdapter

        return view
    }

    private fun navigateToPlacesFragment(categoryName: String) {
        val fragment = PlacesFragment.newInstance(categoryName)
        parentFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()
    }

    private fun createCategoryList(): List<Category> {
        // Buat daftar kategori
        val categoryList: MutableList<Category> = mutableListOf()
        categoryList.add(Category(1, "Warteg", R.drawable.caffe_foreground))
        categoryList.add(Category(2, "Bar", R.drawable.caffe_foreground))
        categoryList.add(Category(3, "Caffe", R.drawable.caffe_foreground))
        categoryList.add(Category(4, "Outbound", R.drawable.caffe_foreground))
        // ... tambahkan kategori lain jika diperlukan
        return categoryList
    }

    private fun filterDesiredCategories(categories: List<Category>): List<Category> {
        // Filter kategori yang ingin ditampilkan (warteg, bar, caffe, outbound)
        return categories.filter { it.name in listOf("Warteg", "Bar", "Caffe", "Outbound") }
    }
}
