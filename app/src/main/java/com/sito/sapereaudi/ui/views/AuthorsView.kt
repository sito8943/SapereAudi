package com.sito.sapereaudi.ui.views

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.sito.sapereaudi.R
import com.sito.sapereaudi.ui.components.header.Header
import com.sito.sapereaudi.ui.components.header.HeaderRow
import com.sito.sapereaudi.ui.components.layout.MenuColumn

@Preview
@Composable
fun AuthorsView() {
    MenuColumn {
        HeaderRow(text = stringResource(id = R.string.authorsTitle))
    }
}