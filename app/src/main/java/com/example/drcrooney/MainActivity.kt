package com.example.drcrooney

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.drcrooney.composables.Screen
import com.example.drcrooney.ui.theme.DrcRooneyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DrcRooneyTheme {
                // A surface container using the 'background' color from the theme
                Screen()
                }
            }
        }
    }


@Preview(
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Composable
fun GreetingPreview() {
    DrcRooneyTheme {
        Screen()
    }
}