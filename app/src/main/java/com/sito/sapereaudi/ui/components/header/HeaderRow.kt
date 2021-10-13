package com.sito.sapereaudi.ui.components.header

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sito.sapereaudi.ui.components.button.BackButton
import com.sito.sapereaudi.ui.theme.ButtonSalmon

@Preview
@Composable
fun HeaderRow(text: String = "") {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 20.dp)
            .background(ButtonSalmon),
        horizontalArrangement = Arrangement.Start
    ) {
        BackButton()
        Header(
            text = text,
        )
    }
}