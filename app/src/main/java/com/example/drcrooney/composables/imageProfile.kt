package com.example.drcrooney.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.drcrooney.R

@Composable
fun ImageProfile(){
    Row {
        Column {
            Surface(modifier = Modifier
                .padding(8.dp)
                .clip(shape = CircleShape)
            )    {
                Image(painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription ="photo de profile" )
            }
        }
        Column {
            Text(text = "Rooney Kalumba")
        }
    }
}