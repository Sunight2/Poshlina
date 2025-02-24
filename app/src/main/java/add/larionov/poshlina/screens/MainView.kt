package add.larionov.poshlina.screens

import add.larionov.poshlina.NamePoshlina
import add.larionov.poshlina.Screen1
import add.larionov.poshlina.Screen2
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
                        onClick = {},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText3
                    )
                    DataScreen1(
                        onClick = {},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText4
                    )
                    DataScreen1(
                        onClick = {},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText5
                    )
                    DataScreen1(
                        onClick = {},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText6
                    )
                    DataScreen1(
                        onClick = {},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText7
                    )
                    DataScreen1(
                        onClick = {},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText7
                    )
                    DataScreen1(
                        onClick = {},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText8
                    )
                    DataScreen1(
                        onClick = {},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText9
                    )
                    DataScreen1(
                        onClick = {},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText10
                    )
                    DataScreen1(
                        onClick = {},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText11
                    )
                    DataScreen1(
                        onClick = {},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText12
                    )
                    DataScreen1(
                        onClick = {},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText13
                    )
                    DataScreen1(
                        onClick = {},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText14
                    )
                    DataScreen1(
                        onClick = {},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText15
                    )
                    DataScreen1(
                        onClick = {},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText16
                    )
                    DataScreen1(
                        onClick = {},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText17
                    )
                    DataScreen1(
                        onClick = {},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText18
                    )
                    DataScreen1(
                        onClick = {},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText19
                    )
                    DataScreen1(
                        onClick = {},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText20
                    )
                    DataScreen1(
                        onClick = {},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText21
                    )
                    DataScreen1(
                        onClick = {},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText22
                    )
                    DataScreen1(
                        onClick = {},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText23
                    )
                    DataScreen1(
                        onClick = {},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText24
                    )
                    DataScreen1(
                        onClick = {},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText25
                    )
                    DataScreen1(
                        onClick = {},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText26
                    )
                    DataScreen1(
                        onClick = {},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText27
                    )
                    DataScreen1(
                        onClick = {},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText28
                    )
                    DataScreen1(
                        onClick = {},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText29
                    )
                    DataScreen1(
                        onClick = {},
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText30
                    )
                }
            }
        }
    }
}