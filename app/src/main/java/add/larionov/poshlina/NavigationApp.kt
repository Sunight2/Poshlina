package add.larionov.poshlina

import add.larionov.poshlina.raschetcalc.CalculatorTheme
import add.larionov.poshlina.raschetcalc.CalculatorTheme2
import add.larionov.poshlina.screens.MainView
import add.larionov.poshlina.screens2.MainView1
import add.larionov.poshlina.screens2.MainView10
import add.larionov.poshlina.screens2.MainView12
import add.larionov.poshlina.screens2.MainView13
import add.larionov.poshlina.screens2.MainView14
import add.larionov.poshlina.screens2.MainView15
import add.larionov.poshlina.screens2.MainView16
import add.larionov.poshlina.screens2.MainView19
import add.larionov.poshlina.screens2.MainView2
import add.larionov.poshlina.screens2.MainView20
import add.larionov.poshlina.screens2.MainView21
import add.larionov.poshlina.screens2.MainView22
import add.larionov.poshlina.screens2.MainView23
import add.larionov.poshlina.screens2.MainView24
import add.larionov.poshlina.screens2.MainView25
import add.larionov.poshlina.screens2.MainView26
import add.larionov.poshlina.screens2.MainView27
import add.larionov.poshlina.screens2.MainView28
import add.larionov.poshlina.screens2.MainView29
import add.larionov.poshlina.screens2.MainView3
import add.larionov.poshlina.screens2.MainView30
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
        composable<Screen12> { MainView12(namePoshlina = NamePoshlina(), navController) }
        composable<Screen13> { MainView13(namePoshlina = NamePoshlina(), navController) }
        composable<Screen14> { MainView14(namePoshlina = NamePoshlina(), navController) }
        composable<Screen15> { MainView15(namePoshlina = NamePoshlina(), navController) }
        composable<Screen16> { MainView16(namePoshlina = NamePoshlina(), navController) }
        composable<Screen19> { MainView19(namePoshlina = NamePoshlina(), navController) }
        composable<Screen20> { MainView20(namePoshlina = NamePoshlina(), navController) }
        composable<Screen21> { MainView21(namePoshlina = NamePoshlina(), navController) }
        composable<Screen22> { MainView22(namePoshlina = NamePoshlina(), navController) }
        composable<Screen23> { MainView23(namePoshlina = NamePoshlina(), navController) }
        composable<Screen24> { MainView24(namePoshlina = NamePoshlina(), navController) }
        composable<Screen25> { MainView25(namePoshlina = NamePoshlina(), navController) }
        composable<Screen26> { MainView26(namePoshlina = NamePoshlina(), navController) }
        composable<Screen27> { MainView27(namePoshlina = NamePoshlina(), navController) }
        composable<Screen28> { MainView28(namePoshlina = NamePoshlina(), navController) }
        composable<Screen29> { MainView29(namePoshlina = NamePoshlina(), navController) }
        composable<Screen30> { MainView30(namePoshlina = NamePoshlina(), navController) }
        composable<Calculator> { CalculatorTheme() }
        composable<Calculator2> { CalculatorTheme2() }
    }
}
