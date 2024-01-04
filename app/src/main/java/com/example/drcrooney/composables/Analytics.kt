package com.example.drcrooney.composables


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.drcrooney.data.Data
import com.example.drcrooney.models.DataAnalytics


@Composable
fun Analytics(listDataAnalytics: List<DataAnalytics> = Data.analyticsData) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)

    ) {

        Row(verticalAlignment = Alignment.CenterVertically) {
            // Creation d'un texte  avec possibilité d'ellipse
            Text(
                text = "Analytics des Contenues Revenues ",
                style = MaterialTheme.typography.bodyLarge,
                overflow = TextOverflow.Ellipsis,
                softWrap = false,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.weight(2f)
            )
            Text(
                text = "06 janvier 2024",
                style = MaterialTheme.typography.bodyMedium,
                overflow = TextOverflow.Ellipsis,
                softWrap = false,
                modifier = Modifier
                    .weight(1f),
                textAlign = TextAlign.End
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row {
            listDataAnalytics.forEach {
                CardElement(dataAnalytics = it, modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth())
            }
        }
    }
}
@Composable
fun CardElement(dataAnalytics: DataAnalytics, modifier: Modifier = Modifier) {

    Card(
        shape = RoundedCornerShape(8.dp),
        elevation = CardDefaults.cardElevation(10.dp), modifier = modifier
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = dataAnalytics.title,
                style = MaterialTheme.typography.bodySmall
            )
            Row {
                Text(
                    text = dataAnalytics.value,
                    style = MaterialTheme.typography.bodyLarge
                )
                Icon(
                    Icons.Default.KeyboardArrowUp,
                    contentDescription = null,
                    tint = Color.Blue
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ContenuePreview() {
    MaterialTheme {
        Analytics()


    }
}
