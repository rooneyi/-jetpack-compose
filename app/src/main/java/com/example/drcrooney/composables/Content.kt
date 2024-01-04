package com.example.drcrooney.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.drcrooney.data.Data
import com.example.drcrooney.models.Content


@Composable
fun Lastcontent(listDataContent: List<Content> = Data.lastContent) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(8.dp)
    ) {
        Text(
            text = "Derniers Contenues Publiés",
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.Bold,
        )
        Spacer(modifier = Modifier.height(8.dp))
        listDataContent.forEach {
            ContentItem(it)
        }

    }
}

@Composable
fun ContentItem(content: Content) {
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp)
        ) {
            Image(
                painter = painterResource(id = content.thumbnail),
                contentDescription = null
            )
            Spacer(modifier = Modifier.width(10.dp))
            Column(verticalArrangement = Arrangement.Center) {
                Text(
                    text = content.title,
                    style = MaterialTheme.typography.bodyMedium,
                    overflow = TextOverflow.Ellipsis
                )
                Text(text = content.duration)
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Divider()
        Row(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row {
                Icon(
                    Icons.Default.Star,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.primary
                )
                Text(text = "${content.stars}")
            }
            Row {
                Icon(
                    Icons.Default.ThumbUp,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.primary
                )
                Text(text = "${content.likes}")
            }
            Row {
                Icon(
                    Icons.Default.Favorite,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.primary
                )
                Text(text = "${content.favorites}")
            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun PreviewContent() {
    Lastcontent()
}