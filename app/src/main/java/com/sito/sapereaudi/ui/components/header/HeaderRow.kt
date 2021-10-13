package com.sito.sapereaudi.ui.components.header

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sito.sapereaudi.R
import com.sito.sapereaudi.ui.theme.ButtonSalmon

@Composable
fun HeaderRow(text: String = "") {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .padding(bottom = 20.dp)
            .background(ButtonSalmon),
        horizontalArrangement = Arrangement.Start
    ) {
        Header(
            text = text,
        )
    }
}

@Preview
@Composable
fun ShowHeaderRow() {
    HeaderRow("Hola")
}