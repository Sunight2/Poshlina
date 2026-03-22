package add.larionov.poshlina

import add.larionov.poshlina.raschetcalc.CalculatorThemeA
import add.larionov.poshlina.raschetcalc.CalculatorThemeAList
import add.larionov.poshlina.raschetcalc.CalculatorThemeASPrikaz
import add.larionov.poshlina.screenArb.MainViewArb
import add.larionov.poshlina.screenArb.aScreens.AScreen3
import add.larionov.poshlina.screenArb.aScreens.AScreen4
import add.larionov.poshlina.screenArb.aScreens.AScreen5
import add.larionov.poshlina.screenArb.aScreens.AScreen8
import add.larionov.poshlina.screenArb.aScreens.AScreen9
import add.larionov.poshlina.screenArb.aScreens.AScreen10
import add.larionov.poshlina.screenArb.aScreens.AScreen11
import add.larionov.poshlina.screenArb.aScreens.AScreen12
import add.larionov.poshlina.screenArb.aScreens.AScreen13
import add.larionov.poshlina.screenArb.aScreens.AScreen14
import add.larionov.poshlina.screenArb.aScreens.AScreen15
import add.larionov.poshlina.screenArb.aScreens.AScreen16
import add.larionov.poshlina.screenArb.aScreens.AScreen17
import add.larionov.poshlina.screenArb.aScreens.AScreen18
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavigationAppArb() {
    val navController2 = rememberNavController()

    NavHost(navController = navController2, startDestination = HomeScreenArb) {

        composable<HomeScreenArb> { MainViewArb(namePoshlina = NamePoshlina(), navController2) }
        composable<AScreen3> { AScreen3(namePoshlina = NamePoshlina(), navController2) }
        composable<AScreen4> { AScreen4(namePoshlina = NamePoshlina(), navController2) }
        composable<AScreen5> { AScreen5(namePoshlina = NamePoshlina(), navController2) }
        composable<AScreen8> { AScreen8(namePoshlina = NamePoshlina(), navController2) }
        composable<AScreen9> { AScreen9(namePoshlina = NamePoshlina(), navController2) }
        composable<AScreen10> { AScreen10(namePoshlina = NamePoshlina(), navController2) }
        composable<AScreen11> { AScreen11(namePoshlina = NamePoshlina(), navController2) }
        composable<AScreen12> { AScreen12(namePoshlina = NamePoshlina(), navController2) }
        composable<AScreen13> { AScreen13(namePoshlina = NamePoshlina(), navController2) }
        composable<AScreen14> { AScreen14(namePoshlina = NamePoshlina(), navController2) }
        composable<AScreen15> { AScreen15(namePoshlina = NamePoshlina(), navController2) }
        composable<AScreen16> { AScreen16(namePoshlina = NamePoshlina(), navController2) }
        composable<AScreen17> { AScreen17(namePoshlina = NamePoshlina(), navController2) }
        composable<AScreen18> { AScreen18(namePoshlina = NamePoshlina(), navController2) }

        composable<CalculatorA> { CalculatorThemeA(navController2) }
        composable<CalculatorASPrikaz> { CalculatorThemeASPrikaz(navController2) }
        composable<CalculatorAList> { CalculatorThemeAList(navController2) }
    }
}