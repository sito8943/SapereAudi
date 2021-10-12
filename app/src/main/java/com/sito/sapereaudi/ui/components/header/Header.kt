package com.sito.sapereaudi.ui.components.header

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun Header(text: String = "") {
    Text(
        text = text,
        color = Color.White,
        fontSize = 50.sp
    )
}