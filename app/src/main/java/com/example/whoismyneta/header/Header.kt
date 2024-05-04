package com.example.whoismyneta.header

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.whoismyneta.ui.theme.WhoIsMyNetaTheme

@Composable
fun Header(

) {
    Column {
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