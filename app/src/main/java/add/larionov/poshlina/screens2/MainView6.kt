package add.larionov.poshlina.screens2

import add.larionov.poshlina.HomeScreen
import add.larionov.poshlina.NamePoshlina
import add.larionov.poshlina.screens.DataScreen2
import add.larionov.poshlina.screens.TextTotalPoshlina
import add.larionov.poshlina.screens.TopBarUser
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun MainView6(
    namePoshlina: NamePoshlina, navController: NavController
) {
    //верхня и нижняя панель в цвет темы
    val statusBarValues = WindowInsets.safeDrawing.asPaddingValues()
    val navigationBarsPadding = WindowInsets.safeDrawing.asPaddingValues()
    //видимость доп строк
    val poshlinaVisible1 = remember { mutableStateOf(true) }
    val poshlinaVisible2 = remember { mutableStateOf(false) }
    val poshlinaVisible3 = remember { mutableStateOf(false) }

    Box(
        Modifier
            .fillMaxSize()
            .padding(top = statusBarValues.calculateTopPadding())
            .padding(bottom = navigationBarsPadding.calculateBottomPadding())
            .padding(horizontal = 1.dp, vertical = 1.dp)
    ) {
        Column {
            TopBarUser(
                onClick1 = {
                    navController.popBackStack(route = HomeScreen, inclusive = false)
                },
                onClick2 = {
                    poshlinaVisible1.value = true
                    poshlinaVisible2.value = false
                    poshlinaVisible3.value = false
                }
            )
            Spacer(Modifier.padding(4.dp))
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = namePoshlina.poshlinaText6,
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
            )
            Spacer(Modifier.padding(4.dp))
            Box {
                Column {
                    if (poshlinaVisible1.value) {
                        //выбрана 1
                        DataScreen2(
                            onClick = {
                                poshlinaVisible1.value = false
                                poshlinaVisible2.value = true
                                poshlinaVisible3.value = false
                            },
                            modifier = Modifier.padding(start = 8.dp),
                            title = namePoshlina.poshlinaTextFiz
                        )
                        DataScreen2(
                            onClick = {
                                poshlinaVisible1.value = false
                                poshlinaVisible2.value = false
                                poshlinaVisible3.value = true
                            },
                            modifier = Modifier.padding(start = 8.dp),
                            title = namePoshlina.poshlinaTextUr
                        )
                    }
                    if (poshlinaVisible2.value) {
                        //выбрана 2
                        DataScreen2(
                            onClick = {},
                            modifier = Modifier.padding(start = 8.dp),
                            title = namePoshlina.poshlinaTextFiz
                        )
                        TextTotalPoshlina(title = "3000 рублей")
                    }
                    if (poshlinaVisible3.value) {
                        DataScreen2(
                            onClick = {},
                            modifier = Modifier.padding(start = 8.dp),
                            title = namePoshlina.poshlinaTextUr
                        )
                        TextTotalPoshlina(title = "20 000 рублей")
                    }
                }
            }
        }
    }
}