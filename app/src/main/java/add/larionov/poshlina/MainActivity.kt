package add.larionov.poshlina

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import add.larionov.poshlina.ui.theme.PoshlinaTheme
import android.annotation.SuppressLint

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PoshlinaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    NavigationApp()
                }
            }
        }
    }
}
