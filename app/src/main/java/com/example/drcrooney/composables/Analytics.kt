package com.example.drcrooney.composables


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.drcrooney.models.Datanalytics

@Composable
fun Analytics() {
    Row(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

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

        }
    }
}

@Composable
fun CardElement(dataAlytics: Datanalytics) {
    androidx.compose.material3.Card(shape = RoundedCornerShape(8.dp)) {
        Column(modifier = Modifier.padding(8.dp)) {
            Text(
                text = dataAlytics.title,
                style = MaterialTheme.typography.bodySmall
            )
            Row {
                Text(text = dataAlytics.value)
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
