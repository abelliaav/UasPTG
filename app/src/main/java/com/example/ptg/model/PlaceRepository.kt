package com.example.ptg.model

object PlaceRepository {
    private val places = mutableListOf<Place>()

    fun addPlace(place: Place) {
        places.add(place)
    }

    fun getPlacesByCategory(categoryName: String): List<Place> {
        return places.filter { it.category == categoryName }
    }

    init {
        // Menambahkan tempat untuk kategori "Warteg"
        places.add(Place(1, "Dinaraos", "Warteg", "url_gambar_dinaraos", 4.3f))
        places.add(Place(2, "Bahari", "Warteg", "url_gambar_bahari", 4.0f))
        places.add(Place(3, "Barokah", "Warteg", "url_gambar_barokah", 4.5f))

        // Menambahkan tempat untuk kategori "Bar"
        places.add(Place(4, "80PROOF", "Bar", "https://th.bing.com/th/id/OIP.vgdmATqPBNZPX5ZY12UwAgHaE8?w=239&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7", 4.8f))
        places.add(Place(5, "Hellen", "Bar", "url_gambar_hellen", 4.2f))

        // Menambahkan tempat untuk kategori "Caffe"
        places.add(Place(6, "Starbuct", "Caffe", "url_gambar_starbuct", 4.6f))
        places.add(Place(7, "Fore", "Caffe", "url_gambar_fore", 4.1f))
        places.add(Place(8, "Desember", "Caffe", "url_gambar_desember", 4.4f))
        places.add(Place(9, "Tommoro", "Caffe", "url_gambar_tommoro", 4.7f))
        places.add(Place(10, "Point", "Caffe", "url_gambar_point", 4.9f))

        // Menambahkan tempat untuk kategori "Outbound"
        places.add(Place(11, "BSD Adventure", "Outbound", "url_gambar_bsd_adventure", 4.2f))
        // ...
    }


    fun getTopRatedPlaces(): List<Place> {
        // Urutkan tempat berdasarkan rating tertinggi
        val sortedPlaces = places.sortedByDescending { it.rating }

        // Ambil tempat dengan rating tertinggi dari masing-masing kategori
        val topRatedPlaces = sortedPlaces.groupBy { it.category }
            .map { it.value.first() } // Ambil tempat pertama dari setiap kategori

        return topRatedPlaces
    }
}
