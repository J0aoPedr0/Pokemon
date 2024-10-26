package com.example.pokemon.DetailsScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun DetailsScreen(
    name:String
){
    Column {
        Text(text = name
        )
    }
}