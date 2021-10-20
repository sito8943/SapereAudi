package com.sito.sapereaudi.ui.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.sito.sapereaudi.R
import com.sito.sapereaudi.ui.components.header.HeaderRow
import com.sito.sapereaudi.ui.components.layout.MenuColumn

@Composable
fun LessonPage(navController: NavController, lesson: String = "1") {
    MenuColumn {
        HeaderRow(
            backOn = "lesson_screen",
            navController = navController,
            text = stringResource(id = R.string.lessonsTitle)
        )
        Text(text = lesson)
    }
}