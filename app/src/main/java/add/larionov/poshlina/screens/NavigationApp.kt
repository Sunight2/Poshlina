package add.larionov.poshlina.screens

import add.larionov.poshlina.HomeScreen
import add.larionov.poshlina.NamePoshlina
import add.larionov.poshlina.Screen1
import add.larionov.poshlina.Screen2
import add.larionov.poshlina.screens2.Card1
import add.larionov.poshlina.screens2.Card2
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavigationApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = HomeScreen) {
        composable<HomeScreen> { MainView(namePoshlina = NamePoshlina(), navController) }
        composable<Screen1> { Card1() }
        composable<Screen2> { Card2() }
    }
}
