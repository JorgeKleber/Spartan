package com.example.spartan.ui.view


import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.spartan.viewmodel.ListaDeTreinosViewModel
import com.example.spartan.viewmodel.MainViewModel

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