package ca.tetervak.mapdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import ca.tetervak.mapdemo.ui.AppScreen
import ca.tetervak.mapdemo.ui.theme.MapDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MapDemoTheme {
                AppScreen()
            }
        }
    }
}