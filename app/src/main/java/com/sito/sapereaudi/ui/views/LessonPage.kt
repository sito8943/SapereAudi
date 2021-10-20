package com.sito.sapereaudi.ui.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.sito.sapereaudi.R
import com.sito.sapereaudi.ui.components.header.HeaderRow
import com.sito.sapereaudi.ui.components.layout.MenuColumn

@Composable
fun LessonPage(navController: NavController, lesson: Int = 1) {
    MenuColumn {
        HeaderRow(
            backOn = "main_screen",
            navController = navController,
            text = stringResource(id = R.string.lessonsTitle)
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceAround
        ) {
            createLesson(35, navController)
        }
    }
}