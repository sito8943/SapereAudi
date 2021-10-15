package com.sito.sapereaudi.ui.views

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.sito.sapereaudi.R
import com.sito.sapereaudi.ui.components.header.HeaderRow
import com.sito.sapereaudi.ui.components.layout.MenuColumn

@Composable
fun NaturaView(navController: NavController) {
    MenuColumn {
        HeaderRow (backOn = "main_screen", navController = navController, text = stringResource(id = R.string.naturaTitle))
    }
}