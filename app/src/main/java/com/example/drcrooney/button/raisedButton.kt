package com.example.drcrooney.button

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun RaisedButton(){
    Button(onClick = { /*TODO*/ },
        modifier = Modifier.padding(16.dp)) {
        Text(text = "Raised button")

    }
}
@Preview(showSystemUi = true)
@Composable
fun RaisedButtonPreview(){
    RaisedButton()
}