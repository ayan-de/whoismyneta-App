package com.example.whoismyneta.header

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.whoismyneta.ui.theme.WhoIsMyNetaTheme

@Composable
fun Header(

) {
    Column {
        Text(text = "Who is My Neta")
        Text(text = "Explore self-reported details and parliamentary activity of MPs in the 17th Lok Sabha")
    }
}

@Preview(showBackground = true)
@Composable
fun HeaderPreview(){
    WhoIsMyNetaTheme {
        Header()
    }
}