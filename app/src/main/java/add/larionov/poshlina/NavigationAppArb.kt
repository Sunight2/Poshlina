package add.larionov.poshlina

import add.larionov.poshlina.screenArb.MainViewArb
import add.larionov.poshlina.screens.MainView
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavigationAppArb() {
    val navController2 = rememberNavController()

    NavHost(navController = navController2, startDestination = HomeScreenArb) {
        composable<HomeScreenArb> { MainViewArb(namePoshlina = NamePoshlina(), navController2) }
    }}