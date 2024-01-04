package com.example.drcrooney.composables


import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun Screen() {
    Scaffold(
        topBar = {
            MyTopAppBar()
        },
        bottomBar = {
            MyBottomAppBar()
        },

        ) {
        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxSize()
                .verticalScroll(rememberScrollState()),
        ) {
            ImageProfile()
            Analytics()
            Revenue()
            Lastcontent()


        }
    }

        }

@Preview(
    showSystemUi = true, uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Composable
fun ScrennPreview() {
    MaterialTheme {
        Screen()
    }


}