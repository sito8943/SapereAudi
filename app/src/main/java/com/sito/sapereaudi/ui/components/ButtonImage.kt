package com.sito.sapereaudi.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sito.sapereaudi.R

@Composable
fun ButtonImage(content: @Composable (() -> Unit)?=null, painter: Painter, contentDescription: String = "") {
    Image(
        modifier = Modifier
            .padding(5.dp)
            .size(width = 50.dp, height = 50.dp),
        painter = painter,
        contentDescription = contentDescription
    )
}