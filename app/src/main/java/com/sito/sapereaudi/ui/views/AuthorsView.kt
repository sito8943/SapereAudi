package com.sito.sapereaudi.ui.views

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.sito.sapereaudi.R
import com.sito.sapereaudi.ui.components.header.Header
import com.sito.sapereaudi.ui.components.header.HeaderRow
import com.sito.sapereaudi.ui.components.layout.MenuColumn

@Composable
fun AuthorsView() {
    MenuColumn {
        HeaderRow {
            Header(
                text = stringResource(id = R.string.authorsTitle),
            )
        }
    }
}