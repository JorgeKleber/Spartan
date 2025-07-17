package com.example.presentation.navigate


import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.presentation.view.ListaDeTreinosScreen
import com.example.presentation.view.MainScreen

@Composable
fun SpartanNavHost(){

    val navController = rememberNavController()
    NavHost(navController, startDestination = "Home") {
        composable("Home") {
            MainScreen(
                onNavigateTo = { navController.navigate("ListaDeTreinos") }
            )
        }
        composable("ListaDeTreinos"){
            ListaDeTreinosScreen()
        }
    }
}