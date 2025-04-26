package add.larionov.poshlina.screens

import add.larionov.poshlina.Calculator
import add.larionov.poshlina.Calculator2
import add.larionov.poshlina.NamePoshlina
import add.larionov.poshlina.Screen1
import add.larionov.poshlina.Screen10
import add.larionov.poshlina.Screen12
import add.larionov.poshlina.Screen13
import add.larionov.poshlina.Screen14
import add.larionov.poshlina.Screen15
import add.larionov.poshlina.Screen16
import add.larionov.poshlina.Screen19
import add.larionov.poshlina.Screen2
import add.larionov.poshlina.Screen20
import add.larionov.poshlina.Screen21
import add.larionov.poshlina.Screen22
import add.larionov.poshlina.Screen23
import add.larionov.poshlina.Screen24
import add.larionov.poshlina.Screen25
import add.larionov.poshlina.Screen26
import add.larionov.poshlina.Screen27
import add.larionov.poshlina.Screen28
import add.larionov.poshlina.Screen29
import add.larionov.poshlina.Screen3
import add.larionov.poshlina.Screen30
import add.larionov.poshlina.Screen4
import add.larionov.poshlina.Screen5
import add.larionov.poshlina.Screen6
import add.larionov.poshlina.Screen7
import add.larionov.poshlina.Screen8
import add.larionov.poshlina.Screen9
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
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun MainView(namePoshlina: NamePoshlina, navController: NavController) {
    //верхня и нижняя панель в цвет темы
    val statusBarValues = WindowInsets.safeDrawing.asPaddingValues()
    val navigationBarsPadding = WindowInsets.safeDrawing.asPaddingValues()
    //прокрутка
    val scrollState = rememberScrollState()

    Box(
        Modifier
            .fillMaxSize()
            .padding(top = statusBarValues.calculateTopPadding())
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
                Button(onClick = {navController.navigate(Screen2)}) {
                    Text(text = "Инфо")
                }
            }
            Box(
                Modifier
                    .verticalScroll(scrollState)
            ) {
                Column {
                    DataScreen1(
                        onClick = {navController.navigate(Screen1)},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText1
                    )
                    DataScreen1(
                        onClick = {navController.navigate(Screen2)},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText2
                    )
                    DataScreen1(
                        onClick = {navController.navigate(Screen3)},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText3
                    )
                    DataScreen1(
                        onClick = {navController.navigate(Screen4)},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText4
                    )
                    DataScreen1(
                        onClick = {navController.navigate(Screen5)},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText5
                    )
                    DataScreen1(
                        onClick = {navController.navigate(Screen6)},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText6
                    )
                    DataScreen1(
                        onClick = {navController.navigate(Screen7)},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText7
                    )
                    DataScreen1(
                        onClick = {navController.navigate(Screen8)},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText8
                    )
                    DataScreen1(
                        onClick = {navController.navigate(Screen9)},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText9
                    )
                    DataScreen1(
                        onClick = {navController.navigate(Screen10)},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText10
                    )
                    DataScreen1(
                        onClick = {navController.navigate(Calculator)},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText11
                    )
                    DataScreen1(
                        onClick = {navController.navigate(Screen12)},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText12
                    )
                    DataScreen1(
                        onClick = {navController.navigate(Screen13)},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText13
                    )
                    DataScreen1(
                        onClick = {navController.navigate(Screen14)},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText14
                    )
                    DataScreen1(
                        onClick = {navController.navigate(Screen15)},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText15
                    )
                    DataScreen1(
                        onClick = {navController.navigate(Screen16)},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText16
                    )
                    DataScreen1(
                        onClick = {navController.navigate(Calculator2)},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText17
                    )
                    DataScreen1(
                        onClick = {navController.navigate(Calculator)},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText18
                    )
                    DataScreen1(
                        onClick = {navController.navigate(Screen19)},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText19
                    )
                    DataScreen1(
                        onClick = {navController.navigate(Screen20)},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText20
                    )
                    DataScreen1(
                        onClick = {navController.navigate(Screen21)},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText21
                    )
                    DataScreen1(
                        onClick = {navController.navigate(Screen22)},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText22
                    )
                    DataScreen1(
                        onClick = {navController.navigate(Screen23)},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText23
                    )
                    DataScreen1(
                        onClick = {navController.navigate(Screen24)},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText24
                    )
                    DataScreen1(
                        onClick = {navController.navigate(Screen25)},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText25
                    )
                    DataScreen1(
                        onClick = {navController.navigate(Screen26)},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText26
                    )
                    DataScreen1(
                        onClick = {navController.navigate(Screen27)},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText27
                    )
                    DataScreen1(
                        onClick = {navController.navigate(Screen28)},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText28
                    )
                    DataScreen1(
                        onClick = {navController.navigate(Screen29)},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText29
                    )
                    DataScreen1(
                        onClick = {navController.navigate(Screen30)},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText30
                    )
                }
            }
        }
    }
}