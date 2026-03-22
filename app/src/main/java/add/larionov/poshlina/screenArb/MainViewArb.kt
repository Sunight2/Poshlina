package add.larionov.poshlina.screenArb

import add.larionov.poshlina.AScreen10
import add.larionov.poshlina.AScreen11
import add.larionov.poshlina.AScreen12
import add.larionov.poshlina.AScreen13
import add.larionov.poshlina.AScreen14
import add.larionov.poshlina.AScreen15
import add.larionov.poshlina.AScreen16
import add.larionov.poshlina.AScreen17
import add.larionov.poshlina.AScreen18
import add.larionov.poshlina.AScreen3
import add.larionov.poshlina.AScreen4
import add.larionov.poshlina.AScreen5
import add.larionov.poshlina.AScreen8
import add.larionov.poshlina.AScreen9
import add.larionov.poshlina.CalculatorA
import add.larionov.poshlina.CalculatorAList
import add.larionov.poshlina.CalculatorASPrikaz
import add.larionov.poshlina.NamePoshlina
import add.larionov.poshlina.screens.DataScreen1
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun MainViewArb(namePoshlina: NamePoshlina, navController2: NavController) {
    //верхня и нижняя панель в цвет темы
//    val statusBarValues = WindowInsets.safeDrawing.asPaddingValues()
    val navigationBarsPadding = WindowInsets.safeDrawing.asPaddingValues()
    //прокрутка
    val scrollState = rememberScrollState()

    Box(
        Modifier
            .fillMaxSize()
//            .padding(top = statusBarValues.calculateTopPadding())
            .padding(bottom = navigationBarsPadding.calculateBottomPadding())
            .padding(horizontal = 1.dp, vertical = 1.dp)
    ) {
        Column {
            Row(
                Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Выберите пошлину:",
                    Modifier.padding(start = 2.dp, top = 10.dp)
                )
//                Button(onClick = { navController.navigate(Screen2) }) {
//                    Text(text = "Инфо")
//                }
            }
            Box(
                Modifier
                    .verticalScroll(scrollState)
            ) {
                Column {
                    DataScreen1(
                        onClick = { navController2.navigate(CalculatorA) },
                        modifier = Modifier,
                        title = namePoshlina.aPoshlinaText1
                    )
                    DataScreen1(
                        onClick = { navController2.navigate(CalculatorASPrikaz) },
                        modifier = Modifier,
                        title = namePoshlina.aPoshlinaText2
                    )
                    DataScreen1(
                        onClick = { navController2.navigate(AScreen3) },
                        modifier = Modifier,
                        title = namePoshlina.aPoshlinaText3
                    )
                    DataScreen1(
                        onClick = { navController2.navigate(AScreen4) },
                        modifier = Modifier,
                        title = namePoshlina.aPoshlinaText4
                    )
                    DataScreen1(
                        onClick = { navController2.navigate(AScreen5) },
                        modifier = Modifier,
                        title = namePoshlina.aPoshlinaText5
                    )
                    DataScreen1(
                        onClick = { navController2.navigate(CalculatorAList) },
                        modifier = Modifier,
                        title = namePoshlina.aPoshlinaText6
                    )
                    DataScreen1(
                        onClick = { navController2.navigate(CalculatorA) },
                        modifier = Modifier,
                        title = namePoshlina.aPoshlinaText7
                    )
                    DataScreen1(
                        onClick = { navController2.navigate(AScreen8) },
                        modifier = Modifier,
                        title = namePoshlina.aPoshlinaText8
                    )
                    DataScreen1(
                        onClick = { navController2.navigate(AScreen9) },
                        modifier = Modifier,
                        title = namePoshlina.aPoshlinaText9
                    )
                    DataScreen1(
                        onClick = { navController2.navigate(AScreen10) },
                        modifier = Modifier,
                        title = namePoshlina.aPoshlinaText10
                    )
                    DataScreen1(
                        onClick = { navController2.navigate(AScreen11) },
                        modifier = Modifier,
                        title = namePoshlina.aPoshlinaText11
                    )
                    DataScreen1(
                        onClick = { navController2.navigate(AScreen12) },
                        modifier = Modifier,
                        title = namePoshlina.aPoshlinaText12
                    )
                    DataScreen1(
                        onClick = { navController2.navigate(AScreen13) },
                        modifier = Modifier,
                        title = namePoshlina.aPoshlinaText13
                    )
                    DataScreen1(
                        onClick = { navController2.navigate(AScreen14) },
                        modifier = Modifier,
                        title = namePoshlina.aPoshlinaText14
                    )
                    DataScreen1(
                        onClick = { navController2.navigate(AScreen15) },
                        modifier = Modifier,
                        title = namePoshlina.aPoshlinaText15
                    )
                    DataScreen1(
                        onClick = { navController2.navigate(AScreen16) },
                        modifier = Modifier,
                        title = namePoshlina.aPoshlinaText16
                    )
                    DataScreen1(
                        onClick = { navController2.navigate(AScreen17) },
                        modifier = Modifier,
                        title = namePoshlina.aPoshlinaText17
                    )
                    DataScreen1(
                        onClick = { navController2.navigate(AScreen18) },
                        modifier = Modifier,
                        title = namePoshlina.aPoshlinaText18
                    )
                }
            }
        }
    }
}