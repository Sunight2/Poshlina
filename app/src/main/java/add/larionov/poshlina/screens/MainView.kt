package add.larionov.poshlina.screens

import add.larionov.poshlina.NamePoshlina
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

@Composable
fun MainView(namePoshlina: NamePoshlina) {
    //верхня и нижняя панель в цвет темы
    val statusBarValues = WindowInsets.safeDrawing.asPaddingValues()
    val navigationBarsPadding = WindowInsets.safeDrawing.asPaddingValues()

    Box(
        Modifier
            .fillMaxSize()
            .padding(top = statusBarValues.calculateTopPadding())
            .padding(bottom = navigationBarsPadding.calculateBottomPadding())
            .padding(horizontal = 1.dp, vertical = 4.dp)
    ){
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
                Button(onClick = {}) {
                    Text(text = "Инфо")
                }
            }
            CardFirst1(
                namePoshlina = NamePoshlina(),
                modifier = Modifier,
                names = namePoshlina.poshlinaText
            )
        }
    }
}