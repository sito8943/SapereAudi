package com.sito.sapereaudi.ui.components.button

import androidx.compose.foundation.background
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.sito.sapereaudi.R
import com.sito.sapereaudi.ui.theme.Salmon

@Preview
@Composable
fun BackButton(whereTo: String = "") {
    IconButton(modifier = Modifier
        .background(color = Salmon),
        onClick = {  }
    ) {
        Icon(
            imageVector = Icons.Filled.ArrowBack, contentDescription = stringResource(
                id = R.string.goBack
            )
        )
    }
}