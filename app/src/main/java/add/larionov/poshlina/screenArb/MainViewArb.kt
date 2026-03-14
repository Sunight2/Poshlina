package add.larionov.poshlina.screenArb

import add.larionov.poshlina.screens.DataScreen1


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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun MainViewArb(namePoshlina: NamePoshlina, navController: NavController) {
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
            }
            Box(
                Modifier
                    .verticalScroll(scrollState)
            ) {
                Column {
                    DataScreen1(
                        onClick = { navController.navigate(Screen1) },
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText1
                    )
                }
            }
        }
    }
}