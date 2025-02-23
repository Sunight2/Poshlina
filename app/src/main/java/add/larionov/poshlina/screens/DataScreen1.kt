package add.larionov.poshlina.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DataScreen1(
    onClick: () -> Unit,
    modifier: Modifier,
    title: String,
) {
    Column {
        Card(
            modifier
                .fillMaxWidth()
                .padding(horizontal = 2.dp, vertical = 4.dp)
                .clickable {onClick()}
        ) {
            Text(
                text = title,
                fontSize = 20.sp,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 6.dp)
            )
        }
    }
}
