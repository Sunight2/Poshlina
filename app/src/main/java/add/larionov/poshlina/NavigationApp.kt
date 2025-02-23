package add.larionov.poshlina

import add.larionov.poshlina.screens.MainView
import add.larionov.poshlina.screens2.MainView2
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavigationApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = HomeScreen) {
        composable<HomeScreen> { MainView(namePoshlina = NamePoshlina(), navController) }
        composable<Screen1> { MainView2(namePoshlina = NamePoshlina(), navController) }
        composable<Screen2> {  }
        composable<Screen2> {  }
        composable<Screen2> {  }
        composable<Screen2> {  }
        composable<Screen2> {  }
        composable<Screen2> {  }
    }
}
