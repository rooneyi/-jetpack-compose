package com.example.drcrooney.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.drcrooney.data.Data
import com.example.drcrooney.models.Datarevenue


@Composable
fun Revenue(listDatarevenue: List<Datarevenue> = Data.revenueData) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)
    ) {
        Text(
            text = "Vos revenues",
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Estimation 3 derniers Mois",
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight.Bold
        )
        Card(
            modifier = Modifier.padding(4.dp),
            shape = RoundedCornerShape(8.dp),
            elevation = CardDefaults.cardElevation(2.dp)
        ) {
            Column(modifier = Modifier.padding(10.dp)) {
                val maxvalue = listDatarevenue.maxBy {
                    it.amount
                }
                listDatarevenue.forEach {
                    RevenueByMonth(
                        revenueDatarevenue = it,
                        ratio = it.amount / maxvalue.amount
                    )
                }
            }
        }

    }
}


@Composable
fun RevenueByMonth(revenueDatarevenue: Datarevenue, ratio: Float) {
    Row(
        modifier = Modifier.padding(4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = revenueDatarevenue.month,
            overflow = TextOverflow.Ellipsis,
            softWrap = false,
            modifier = Modifier.weight(1f)
        )
        Row(
            modifier = Modifier
                .weight(2f)
                .fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .height(10.dp)
                    .fillMaxWidth(ratio)
                    .clip(RoundedCornerShape(50))
                    .background(MaterialTheme.colorScheme.secondary)
            ) {

            }

        }
        Text(
            text = "${revenueDatarevenue.amount} \$US",
            modifier = Modifier.weight(1f)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewRevenue() {
    Revenue()
}