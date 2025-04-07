package com.bmw.captainbmw.navigation.routes

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bmw.captainbmw.ui.theme.screens.homepage.Home
import com.bmw.captainbmw.ui.theme.screens.loginpage.Login_Screen
import com.bmw.captainbmw.ui.theme.screens.register.Register_Screen
import com.bmw.captainbmw.ui.theme.screens.splash.Splash_page

@Composable
fun AppNavHost(modifier: Modifier = Modifier,navController: NavHostController= rememberNavController(),
               startDestination: String = ROUTE_SPLASH) {
    NavHost(navController=navController,
        startDestination = startDestination){

        composable(ROUTE_HOME){
            Home(navController)
        }
        composable(ROUTE_LOGIN){
            Login_Screen(navController)
        }
        composable(ROUTE_REGISTER){
            Register_Screen(navController)
        }
        composable(ROUTE_SPLASH){
            Splash_page(navController)
        }
    }

}