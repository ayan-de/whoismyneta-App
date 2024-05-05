package com.example.whoismyneta

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.add
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.whoismyneta.header.Header
import com.example.whoismyneta.ui.theme.WhoIsMyNetaTheme

@Composable
fun MainScreen(){
    WhoIsMyNetaTheme {
        Surface {
            val contentPadding = WindowInsets
                .systemBars
                .add(WindowInsets(left = 16.dp, top = 16.dp, right = 16.dp, bottom = 16.dp))
                .asPaddingValues()
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize(),
                contentPadding = contentPadding,
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                item {
                    Header()
                }
            }
        }
    }
}

@Preview(showBackground = true,)
@Composable
fun MainScreenPreview(){
    WhoIsMyNetaTheme {
        MainScreen()
    }
}
