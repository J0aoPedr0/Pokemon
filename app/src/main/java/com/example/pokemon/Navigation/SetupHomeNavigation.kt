package com.example.pokemon.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import com.example.pokemon.DetailsScreen.DetailsScreen
import com.example.pokemon.Home.HomeScreen

@Composable
fun SetupHomeNavigation(
    navHostController: NavHostController
){
    NavHost(
        navController = navHostController,
        startDestination = HomeTagScreen
    ) {
        composable<HomeTagScreen>{
            HomeScreen(navController = navHostController)
        }

        composable<DetailsTagScreen>{
            val args = it.toRoute<DetailsTagScreen>()
            DetailsScreen(name = args.name)
        }
    }
}