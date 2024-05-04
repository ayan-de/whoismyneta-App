package com.example.whoismyneta.header

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.whoismyneta.ui.theme.WhoIsMyNetaTheme

@Composable
fun Header(

) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(18.dp)
    ) {
        Text(
            text = "Who is My Neta",
            style = MaterialTheme.typography.displayLarge
        )
        Text(
            text = "Explore self-reported details and parliamentary activity of MPs in the 17th Lok Sabha",
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

@Preview(showBackground = true)
@Composable
fun HeaderPreview() {
    WhoIsMyNetaTheme {
        Header()
    }
}