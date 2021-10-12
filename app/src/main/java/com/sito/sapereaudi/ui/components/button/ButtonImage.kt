package com.sito.sapereaudi.ui.components.button

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp

@Composable
fun ButtonImage(painter: Painter, contentDescription: String = "") {
    Image(
        modifier = Modifier
            .padding(5.dp)
            .size(width = 50.dp, height = 50.dp),
        painter = painter,
        contentDescription = contentDescription
    )
}