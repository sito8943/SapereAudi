package com.sito.sapereaudi.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sito.sapereaudi.R

@Composable
fun ButtonText(content: @Composable (() -> Unit)?=null, text: String = "") {
    Text(
        modifier = Modifier.padding(5.dp),
        text = stringResource(id = R.string.historyButton),
        color = Color.White,
        fontSize = 14.sp
    )
}