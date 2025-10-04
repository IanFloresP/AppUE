package dev.iflores.appue.presentation.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.iflores.appue.presentation.auth.LoginScreen
import dev.iflores.appue.presentation.auth.RegisterScreen
import dev.iflores.appue.presentation.home.HomeScreen
import dev.iflores.appue.presentation.permissions.GalleryPremissionScreen


@Composable
fun AppNavGraph(){

    val navController = rememberNavController()

    NavHost(navController = navController,
        startDestination = "login"){

        composable("register") { RegisterScreen(navController) }
        composable ("login") { LoginScreen(navController) }
        composable ("home") {
            DrawerScaffold(navController){
                HomeScreen()
            }//cierra drawer
        }//cierra composable home

        composable("permissions") {
            DrawerScaffold(navController) {
                GalleryPremissionScreen()
            }//cierra drawer
        }//cierra composable permissions

        composable("favorites") {
            DrawerScaffold(navController) {
                Text("WIP - Favoritos")
            } //cierra drawer
        }//cierra composable favorites
    }
}