package add.larionov.poshlina.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TopBarUser (
    onClick1: () -> Unit,
    onClick2: () -> Unit,
) {
    Box (
        modifier = Modifier.fillMaxWidth()
    ){
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
        ){
            IconButton(
                onClick1
            ) {
                Icon(
                    Icons.Filled.Home,
                    contentDescription = "Main Screen"
                )
            }
                Text(
                    modifier = Modifier.padding(top = 8.dp),
                    text = "Госпошлина",
                    fontSize = 26.sp,
                )
            Button(
                onClick2
            ) {
                Text(text = "Сбросить")
            }
        }
    }
}