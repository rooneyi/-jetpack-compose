package com.example.drcrooney.composables


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.drcrooney.data.Data
import com.example.drcrooney.models.DataAnalytics


@Composable
fun Analytics(listDataAnalytics: List<DataAnalytics> = Data.analyticsData) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
    ) {

        Row {
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
                text = "23 dec 2023",
                style = MaterialTheme.typography.bodyMedium,
                overflow = TextOverflow.Ellipsis,
                softWrap = false,
                modifier = Modifier
                    .weight(1f),
                textAlign = TextAlign.End
            )
        }
        Row {
            Card {
                Column(modifier = Modifier.padding(12.dp)) {

                }
            }
        }
    }
}


@Composable
fun CardElement() {
    Card(
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier.padding(29.dp),

        ) {
        Column(modifier = Modifier.padding(19.dp)) {

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
