package com.example.cinegul

object MovieDetailData {
    private val detailsMap = mapOf(
        1 to MovieDetail(
            genres = listOf("Action", "Sci-Fi", "Thriller"),
            homepage = "https://www.warnerbros.com/movies/inception",
            imdbId = "tt1375666"
        ),
        2 to MovieDetail(
            genres = listOf("Action", "Crime", "Drama"),
            homepage = "https://www.warnerbros.com/movies/dark-knight",
            imdbId = "tt0468569"
        ),
        3 to MovieDetail(
            genres = listOf("Adventure", "Drama", "Sci-Fi"),
            homepage = "https://www.warnerbros.com/movies/interstellar",
            imdbId = "tt0816692"
        ),
        4 to MovieDetail(
            genres = listOf("Action", "Sci-Fi"),
            homepage = "https://www.warnerbros.com/movies/matrix",
            imdbId = "tt0133093"
        ),
        5 to MovieDetail(
            genres = listOf("Comedy", "Drama", "Thriller"),
            homepage = "https://www.neonrated.com/films/parasite",
            imdbId = "tt6751668"
        )
    )

    fun getDetailsForMovie(movieId: Int): MovieDetail? = detailsMap[movieId]
}