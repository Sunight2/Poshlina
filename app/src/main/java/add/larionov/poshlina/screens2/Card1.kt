package add.larionov.poshlina.screens2

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Card1 () {
    val poshlinaText1 = listOf("Имущественного характера, не подлежащего оценке, " +
            "а также неимущественного характера",
        "Имущественного характера, подлежащего оценке")

    val (selectedOption, onOptionSelected) = remember { mutableStateOf(poshlinaText1[0]) }
    //скролл пошлин текст
    val scrollState = rememberScrollState()

    Column(
        Modifier
            .selectableGroup()
            .verticalScroll(scrollState)
    ) {
        poshlinaText1.forEach { text ->
            Card(
                Modifier
                    .fillMaxWidth()
                    .padding(bottom = 6.dp)
                    .selectable(
                        selected = (text == selectedOption),
                        onClick = { onOptionSelected(text) })
            ) {
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(vertical = 2.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    RadioButton(
                        selected = (text == selectedOption),
                        onClick = {
                            onOptionSelected(text)
                            //???
                        }
                    )
                    Text(
                        text = text,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(2.dp)
                    )
                }
            }
        }
    }
}