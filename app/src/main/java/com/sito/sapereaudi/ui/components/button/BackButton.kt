package com.sito.sapereaudi.ui.components.button

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.sito.sapereaudi.R

@Composable
fun BackButton(whereTo: String = "", navController: NavController) {
    IconButton(
        onClick = { navController.navigate(whereTo) }
    ) {
        Icon(
            imageVector = Icons.Filled.ArrowBack, contentDescription = stringResource(
                id = R.string.goBack
            ),
            tint = Color.White
        )
    }
}