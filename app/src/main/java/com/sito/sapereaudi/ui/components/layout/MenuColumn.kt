package com.sito.sapereaudi.ui.components.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sito.sapereaudi.ui.theme.Salmon

@Composable
fun MenuColumn(content: @Composable (() -> Unit)?=null) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Salmon),
        verticalArrangement = Arrangement.SpaceAround
    ) {
        content
    }
}