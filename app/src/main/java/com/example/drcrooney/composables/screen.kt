package com.example.drcrooney.composables


import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview



@Composable
fun screen(){
    Scaffold(
        topBar = {
            MyTopAppBar()
        },
        bottomBar = {
            MyBottomAppBar()
        },

        ) {
        Column(modifier = Modifier.padding(it)) {
            ImageProfile()
            Analytics()
            Card()
            Message()
            Contenue()
        }
    }

        }

@Preview(
    showSystemUi = true, uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Composable
fun scrennPreview() {
    MaterialTheme {
        screen()
    }


}