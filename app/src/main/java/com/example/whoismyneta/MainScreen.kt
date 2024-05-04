package com.example.whoismyneta

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.whoismyneta.header.Header
import com.example.whoismyneta.ui.theme.WhoIsMyNetaTheme

@Composable
fun MainScreen(){
    Header()
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview(){
    WhoIsMyNetaTheme {
        MainScreen()
    }
}
