package com.sito.sapereaudi.ui.components.button

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MenuButton(content: @Composable (() -> Unit)?=null, function: (Int) -> Unit?) {
    Button(
        modifier = Modifier
            .padding(5.dp)
            .background(color = Color.Blue)
            .size(width = 250.dp, height = 70.dp),
        onClick = { function }
    ) {
        if (content != null) {
            content()
        }
    }
}