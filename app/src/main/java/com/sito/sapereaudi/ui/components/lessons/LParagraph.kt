package com.sito.sapereaudi.ui.components.lessons

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LParagraph(text: String = "") {
    SelectionContainer() {
        Text(
            modifier = Modifier.padding(horizontal = 10.dp, vertical = 15.dp),
            text = text,
            color = Color.White,
            fontSize = 15.sp
        )
    }
}