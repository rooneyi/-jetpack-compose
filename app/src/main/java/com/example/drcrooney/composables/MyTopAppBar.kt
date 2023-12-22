package com.example.drcrooney.composables

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun MyTopAppBar(){
    BottomAppBar {
        Box(modifier = Modifier.fillMaxSize()) {
            Text(text = "Drc Mind",
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(8.dp))
            Icon(imageVector = Icons.Default.Info,
                contentDescription ="Info",
                modifier = Modifier
                    .align(Alignment.CenterEnd))
        }
    }
}