package com.example.drcrooney.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.drcrooney.button.RaisedButton


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

        }
    }

        }

@Preview(showSystemUi = true)
@Composable
fun scrennPreview(){
    screen()
    
}