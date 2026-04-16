package com.example.cinegul

import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun ThirdScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding(),   // <-- Add this line
        contentAlignment = Alignment.Center
    ) {
        Button(
            onClick = {
                navController.navigate("movie_list") {
                    popUpTo("movie_list") { inclusive = true }
                }
            }
        ) {
            Text("Go to Movie List")
        }
    }
}