package add.larionov.poshlina

import add.larionov.poshlina.screens.MainView
import add.larionov.poshlina.screens2.Card1
import add.larionov.poshlina.screens2.Card2
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import add.larionov.poshlina.ui.theme.PoshlinaTheme
import android.annotation.SuppressLint
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PoshlinaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    val navController = rememberNavController()

                    NavHost(navController, startDestination = HomeScreen){
                        composable<HomeScreen> {
                            MainView(namePoshlina = NamePoshlina(), navController)
                        }
                        composable<Home1> {
                            Card1 ()
                        }
                        composable<Home1> {
                            Card2 ()
                        }
                    }
                }
            }
        }
    }
}