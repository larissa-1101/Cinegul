package com.example.cinegul

data class Movie(
    val id: Int,
    val title: String,
    val posterRes: Int, // for image resource (or use String URL)
    val year: String
)

object MovieData {
    val movies = listOf(
        Movie(1, "Inception", android.R.drawable.ic_menu_camera, "2010"),
        Movie(2, "The Dark Knight", android.R.drawable.ic_menu_gallery, "2008"),
        Movie(3, "Interstellar", android.R.drawable.ic_menu_slideshow, "2014"),
        Movie(4, "The Matrix", android.R.drawable.ic_menu_manage, "1999"),
        Movie(5, "Parasite", android.R.drawable.ic_menu_help, "2019")
    )
}