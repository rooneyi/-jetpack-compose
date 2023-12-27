package com.example.drcrooney.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.drcrooney.R

@Composable
fun ImageProfile(){
    Row(modifier = Modifier.fillMaxWidth()) {
        Column {
            Surface(
                modifier = Modifier
                    .padding(8.dp)
                    .clip(shape = CircleShape)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = "photo de profile"
                )
            }
        }
        Spacer(modifier = Modifier.width(10.dp))
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(8.dp)
        ) {
            Text(
                text = "Rooney Kalumba",
                modifier = Modifier,
                style = MaterialTheme.typography.bodyLarge
            )
            Text(
                text = "57",
                modifier = Modifier
                    .align(Alignment.Start),
                style = MaterialTheme.typography.headlineMedium
            )
            Text(
                text = "venu",
                modifier = Modifier
                    .align(Alignment.Start),
                style = MaterialTheme.typography.headlineSmall
            )
        }
        Row {

        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileComposble() {
    ImageProfile()
}