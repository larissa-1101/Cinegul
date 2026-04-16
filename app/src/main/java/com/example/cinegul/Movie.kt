package com.example.cinegul

data class Movie(
    val id: Int,
    val title: String,
    val posterRes: Int, // for image resource (or use String URL)
    val year: String
)

object MovieData {
    val movies = listOf(
        Movie(1, "Inception", R.drawable.inception, "2010"),
        Movie(2, "The Dark Knight", R.drawable.dark_knight, "2008"),
        Movie(3, "Interstellar", R.drawable.interstellar, "2014"),
        Movie(4, "The Matrix", R.drawable.matrix, "1999"),
        Movie(5, "Parasite", R.drawable.parasite, "2019")
    )
}