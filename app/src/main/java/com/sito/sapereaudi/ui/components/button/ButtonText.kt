package com.sito.sapereaudi.ui.components.button

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ButtonText(text: String = "") {
    Text(
        modifier = Modifier.padding(5.dp),
        text = text,
        color = Color.White,
        fontSize = 14.sp
    )
}