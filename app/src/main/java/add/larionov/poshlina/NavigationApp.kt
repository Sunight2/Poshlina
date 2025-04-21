package add.larionov.poshlina

import add.larionov.poshlina.raschetcalc.CalculatorTheme
import add.larionov.poshlina.screens.MainView
import add.larionov.poshlina.screens2.MainView1
import add.larionov.poshlina.screens2.MainView10
import add.larionov.poshlina.screens2.MainView2
import add.larionov.poshlina.screens2.MainView3
import add.larionov.poshlina.screens2.MainView4
import add.larionov.poshlina.screens2.MainView5
import add.larionov.poshlina.screens2.MainView6
import add.larionov.poshlina.screens2.MainView7
import add.larionov.poshlina.screens2.MainView8
import add.larionov.poshlina.screens2.MainView9
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavigationApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = HomeScreen) {
        composable<HomeScreen> { MainView(namePoshlina = NamePoshlina(), navController) }
        composable<Screen1> { MainView1(namePoshlina = NamePoshlina(), navController) }
        composable<Screen2> { MainView2(namePoshlina = NamePoshlina(), navController) }
        composable<Screen3> { MainView3(namePoshlina = NamePoshlina(), navController) }
        composable<Screen4> { MainView4(namePoshlina = NamePoshlina(), navController) }
        composable<Screen5> { MainView5(namePoshlina = NamePoshlina(), navController) }
        composable<Screen6> { MainView6(namePoshlina = NamePoshlina(), navController) }
        composable<Screen7> { MainView7(namePoshlina = NamePoshlina(), navController) }
        composable<Screen8> { MainView8(namePoshlina = NamePoshlina(), navController) }
        composable<Screen9> { MainView9(namePoshlina = NamePoshlina(), navController) }
        composable<Screen10> { MainView10(namePoshlina = NamePoshlina(), navController) }
        composable<Calculator> { CalculatorTheme() }
    }
}
