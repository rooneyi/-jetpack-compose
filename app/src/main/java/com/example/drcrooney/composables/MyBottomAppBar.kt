package com.example.drcrooney.composables


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun MyBottomAppBar(){
    BottomAppBar {
    Row (horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier.fillMaxSize()){
        bottomBarItem(icon = Icons.Default.Home,
            titre ="Home" )
        bottomBarItem(icon = Icons.Default.List,
            titre ="Liste" )
        bottomBarItem(icon = Icons.Default.CheckCircle,
            titre ="Check" )
        bottomBarItem(icon = Icons.Default.Email, titre ="Email")}

        }
}



@Composable
fun bottomBarItem(icon :ImageVector,titre : String ){
            Row() {
                Column(modifier = Modifier.width(60.dp)) {
                    Icon(imageVector = icon,
                        contentDescription =null,
                        modifier = Modifier
                            .padding(4.dp)
                            .align(Alignment.CenterHorizontally))
                    Text(text = titre, modifier = Modifier
                        .padding(4.dp)
                        .align(Alignment.CenterHorizontally),
                        overflow = TextOverflow.Ellipsis

                    
                    )
                }
            }
        }





@Preview(showSystemUi = true)
@Composable
fun MyBottomAppBarPreview(){
    MaterialTheme {
        MyBottomAppBar()
    }
}