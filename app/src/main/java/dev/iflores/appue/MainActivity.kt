package dev.iflores.appue

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import dev.iflores.appue.presentation.navigation.AppNavGraph
import dev.iflores.appue.ui.theme.AppUETheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppUETheme {
                AppNavGraph()
            }
        }
    }
}