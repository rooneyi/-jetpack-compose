package com.example.drcrooney.composables

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.drcrooney.R


@Composable
fun screen(){
    Scaffold(
        topBar = {
            MyTopAppBar()
        },
        bottomBar = {
            MyBottomAppBar()
        }
    ) {
        Column(modifier = Modifier.padding(it)){
            ImageProfile()
        }
    }

        }

@Preview(showSystemUi = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun scrennPreview(){
        screen()

}