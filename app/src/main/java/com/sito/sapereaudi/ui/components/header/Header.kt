package com.sito.sapereaudi.ui.components.header

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Header(text: String = "") {
    Text(
        modifier = Modifier.padding(horizontal = 10.dp, vertical = 15.dp),
        text = text,
        color = Color.White,
        fontSize = 30.sp
    )
}