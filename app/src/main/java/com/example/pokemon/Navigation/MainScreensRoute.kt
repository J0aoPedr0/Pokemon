package com.example.pokemon.Navigation

import kotlinx.serialization.Serializable

@Serializable
object HomeTagScreen

@Serializable
data class DetailsTagScreen(
    val name:String
)