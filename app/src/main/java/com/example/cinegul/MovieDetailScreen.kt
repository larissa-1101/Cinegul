package com.example.cinegul

import androidx.compose.foundation.layout.statusBarsPadding
import android.content.Intent
import androidx.core.net.toUri
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun MovieDetailScreen(movieId: Int, navController: NavController) {
    val context = LocalContext.current
    val movie = MovieData.movies.find { it.id == movieId }
    val details = MovieDetailData.getDetailsForMovie(movieId)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .padding(16.dp)
    ) {
        // Movie title
        Text(
            text = movie?.title ?: "Movie not found",
            style = MaterialTheme.typography.headlineMedium
        )
        Spacer(modifier = Modifier.height(8.dp))

        // Year
        Text(text = "Year: ${movie?.year ?: "N/A"}")
        Spacer(modifier = Modifier.height(16.dp))

        // Genres (if details exist)
        if (details != null) {
            Text(
                text = "Genres: ${details.genres.joinToString(", ")}",
                style = MaterialTheme.typography.bodyLarge
            )
            Spacer(modifier = Modifier.height(16.dp))

            // Homepage button
            Button(
                onClick = {
                    val intent = Intent(Intent.ACTION_VIEW, details.homepage.toUri())
                    context.startActivity(intent)
                }
            ) {
                Text("Visit Homepage")
            }

// IMDB button
            Button(
                onClick = {
                    val imdbUrl = "https://www.imdb.com/title/${details.imdbId}/"
                    val intent = Intent(Intent.ACTION_VIEW, imdbUrl.toUri())
                    context.startActivity(intent)
                }
            ) {
                Text("View on IMDB")
            }
            Spacer(modifier = Modifier.height(16.dp))
        }

        // Button to go to third screen (kept from your original)
        Button(
            onClick = { navController.navigate("third_screen") }
        ) {
            Text("Go to Third Screen (Empty)")
        }
    }
}