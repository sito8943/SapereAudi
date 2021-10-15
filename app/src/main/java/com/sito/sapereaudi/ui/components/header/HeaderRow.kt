package com.sito.sapereaudi.ui.components.header

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.sito.sapereaudi.ui.components.button.BackButton
import com.sito.sapereaudi.ui.theme.ButtonSalmon

@Composable
fun HeaderRow(backOn: String = "",text: String = "", navController: NavController) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 20.dp)
            .background(ButtonSalmon),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (!backOn.isEmpty()) {
            BackButton(navController = navController, whereTo = backOn)
        }
        Header(
            text = text,
        )
    }
}