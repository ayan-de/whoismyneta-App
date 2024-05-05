package com.example.whoismyneta

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.add
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.systemBars
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
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
