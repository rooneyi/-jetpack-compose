package com.example.drcrooney.data

import com.example.drcrooney.R
import com.example.drcrooney.models.Content
import com.example.drcrooney.models.DataAnalytics
import com.example.drcrooney.models.Datarevenue


object Data {
    val analyticsData = listOf(
        DataAnalytics("Vues", "76,89 k"),
        DataAnalytics("Revenues", "68,879 \$US")
    )
    val revenueData = listOf(
        Datarevenue("Janvier(En cours)", 310f),
        Datarevenue("Decembre", 210f),
        Datarevenue("Novembre", 370f)
    )
    val lastContent = listOf(
        Content(
            "Apprendre le dev Android",
            "Il y'a 1 heure",
            R.drawable.ic_launcher_foreground,
            236,
            100,
            106
        ),
        Content(
            "Apprendre Angular",
            "Il y'a 15 heure",
            R.drawable.ic_launcher_background,
            736,
            400,
            206
        ),
        Content(
            "Apprendre Django",
            "Il y'a 1 jour",
            R.drawable.ic_launcher_background,
            136,
            70,
            166
        )
    )

}