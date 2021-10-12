package com.sito.sapereaudi.ui.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sito.sapereaudi.R
import com.sito.sapereaudi.ui.theme.Salmon

@Composable
fun NaturaView() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Salmon),
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 25.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = stringResource(id = R.string.naturaTitle),
                color = Color.White,
                fontSize = 50.sp
            )
        }
    }
}