package add.larionov.poshlina.screens2

import add.larionov.poshlina.NamePoshlina
import add.larionov.poshlina.screens.DataScreen2
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
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun MainView2 (
    namePoshlina: NamePoshlina, navController: NavController
) {
    //верхня и нижняя панель в цвет темы
    val statusBarValues = WindowInsets.safeDrawing.asPaddingValues()
    val navigationBarsPadding = WindowInsets.safeDrawing.asPaddingValues()

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
                    text = "Выбрано:",
                    Modifier.padding(start = 2.dp, top = 10.dp)
                )
                Button(onClick = {  }) {
                    Text(text = "Инфо")
                }
            }
            Box {
                Column {
                    DataScreen2(
                        onClick = {  },
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText1_1
                    )
                    DataScreen2(
                        onClick = {  },
                        modifier = Modifier,
                        title = namePoshlina.poshlinaText1_2
                    )
                }
            }
        }
    }
}